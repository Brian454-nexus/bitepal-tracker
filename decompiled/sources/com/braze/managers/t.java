package com.braze.managers;

import android.app.ActivityManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.support.BrazeLogger;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o0.AbstractC1835a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class t implements d0 {

    /* renamed from: f, reason: collision with root package name */
    public static final s f12520f = new s();

    /* renamed from: a, reason: collision with root package name */
    public final Context f12521a;

    /* renamed from: b, reason: collision with root package name */
    public final BrazeConfigurationProvider f12522b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12523c;

    /* renamed from: d, reason: collision with root package name */
    public final SharedPreferences f12524d;

    /* renamed from: e, reason: collision with root package name */
    public PackageInfo f12525e;

    public t(Context context, BrazeConfigurationProvider configurationProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        this.f12521a = context;
        this.f12522b = configurationProvider;
        PackageInfo j6 = j();
        this.f12523c = j6 != null ? j6.versionName : null;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.appboy.managers.device_data_provider", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        this.f12524d = sharedPreferences;
    }

    public static final String a(String str) {
        return com.braze.b.a("Unable to inspect package [", str, ']');
    }

    public static final String g() {
        return "Failed to collect background restriction information from Activity Manager";
    }

    public static final String i() {
        return "Caught exception while reading the phone carrier name.";
    }

    public final com.braze.models.outgoing.h b() {
        BrazeConfigurationProvider configurationProvider = this.f12522b;
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        String valueOf = String.valueOf(Build.VERSION.SDK_INT);
        String h6 = h();
        String str = Build.BRAND;
        if (str == null || StringsKt.isBlank(str)) {
            str = null;
        }
        String str2 = Build.MODEL;
        s sVar = f12520f;
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        Intrinsics.checkNotNullParameter(locale, "locale");
        String locale2 = locale.toString();
        Intrinsics.checkNotNullExpressionValue(locale2, "toString(...)");
        TimeZone timeZone = TimeZone.getDefault();
        Intrinsics.checkNotNullExpressionValue(timeZone, "getDefault(...)");
        String id = timeZone.getID();
        Context context = this.f12521a;
        return new com.braze.models.outgoing.h(configurationProvider, valueOf, h6, str, str2, locale2, id, sVar.a(context, context.getResources().getConfiguration().orientation == 2), Boolean.valueOf(d()), Boolean.valueOf(f()), this.f12524d.getString("google_ad_id", null), this.f12524d.contains("ad_tracking_enabled") ? Boolean.valueOf(this.f12524d.getBoolean("ad_tracking_enabled", true)) : null);
    }

    public final String c() {
        PackageInfo j6 = j();
        if (j6 == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Z3.u3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.managers.t.a();
                }
            }, 7, (Object) null);
            return null;
        }
        return (Build.VERSION.SDK_INT >= 28 ? j6.getLongVersionCode() : AbstractC1835a.a(j6)) + ".0.0.0";
    }

    public final boolean d() {
        Object systemService = this.f12521a.getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        return ((NotificationManager) systemService).areNotificationsEnabled();
    }

    public final boolean f() {
        boolean isBackgroundRestricted;
        if (Build.VERSION.SDK_INT < 28) {
            return false;
        }
        try {
            Object systemService = this.f12521a.getSystemService("activity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            isBackgroundRestricted = ((ActivityManager) systemService).isBackgroundRestricted();
            return isBackgroundRestricted;
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: Z3.s3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.managers.t.g();
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final String h() {
        try {
            Object systemService = this.f12521a.getSystemService("phone");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            String networkOperatorName = ((TelephonyManager) systemService).getNetworkOperatorName();
            if (networkOperatorName != null) {
                return StringsKt.trim(networkOperatorName).toString();
            }
            return null;
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: Z3.t3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.managers.t.i();
                }
            }, 4, (Object) null);
            return null;
        }
    }

    public final PackageInfo j() {
        PackageInfo packageArchiveInfo;
        PackageManager.PackageInfoFlags of;
        PackageInfo packageInfo;
        PackageManager.PackageInfoFlags of2;
        PackageInfo packageInfo2 = this.f12525e;
        if (packageInfo2 != null) {
            return packageInfo2;
        }
        final String packageName = this.f12521a.getPackageName();
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                PackageManager packageManager = this.f12521a.getPackageManager();
                of2 = PackageManager.PackageInfoFlags.of(0L);
                packageInfo = packageManager.getPackageInfo(packageName, of2);
            } else {
                packageInfo = this.f12521a.getPackageManager().getPackageInfo(packageName, 0);
            }
            this.f12525e = packageInfo;
            return packageInfo;
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: Z3.r3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.managers.t.a(packageName);
                }
            }, 4, (Object) null);
            ApplicationInfo applicationInfo = this.f12521a.getApplicationInfo();
            if (Build.VERSION.SDK_INT >= 33) {
                PackageManager packageManager2 = this.f12521a.getPackageManager();
                String str = applicationInfo.sourceDir;
                of = PackageManager.PackageInfoFlags.of(0L);
                packageArchiveInfo = packageManager2.getPackageArchiveInfo(str, of);
            } else {
                packageArchiveInfo = this.f12521a.getPackageManager().getPackageArchiveInfo(applicationInfo.sourceDir, 0);
            }
            this.f12525e = packageArchiveInfo;
            return packageArchiveInfo;
        }
    }

    public static final String a() {
        return "App version code could not be read. Returning null";
    }

    public final void a(boolean z6) {
        this.f12524d.edit().putBoolean("ad_tracking_enabled", !z6).apply();
    }

    public final void b(String googleAdvertisingId) {
        Intrinsics.checkNotNullParameter(googleAdvertisingId, "googleAdvertisingId");
        this.f12524d.edit().putString("google_ad_id", googleAdvertisingId).apply();
    }
}
