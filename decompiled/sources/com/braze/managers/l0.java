package com.braze.managers;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.configuration.BrazeConfigurationProvider;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class l0 implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final BrazeConfigurationProvider f12448a;

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f12449b;

    public l0(Context context, BrazeConfigurationProvider configurationProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        this.f12448a = configurationProvider;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.braze.push_registration", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        this.f12449b = sharedPreferences;
    }

    public static final String a(int i6, int i7) {
        return "Stored push registration ID version code " + i6 + " does not match live version code " + i7 + ". Not returning saved registration ID.";
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0050 A[Catch: all -> 0x0013, TryCatch #0 {all -> 0x0013, blocks: (B:3:0x0001, B:5:0x000a, B:8:0x0046, B:10:0x0050, B:12:0x0067, B:16:0x007a, B:19:0x0015, B:21:0x001f, B:23:0x0031), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.lang.String b() {
        /*
            r9 = this;
            monitor-enter(r9)
            com.braze.configuration.BrazeConfigurationProvider r0 = r9.f12448a     // Catch: java.lang.Throwable -> L13
            boolean r0 = r0.isFirebaseCloudMessagingRegistrationEnabled()     // Catch: java.lang.Throwable -> L13
            r8 = 0
            if (r0 != 0) goto L15
            com.braze.configuration.BrazeConfigurationProvider r0 = r9.f12448a     // Catch: java.lang.Throwable -> L13
            boolean r0 = r0.isAdmMessagingRegistrationEnabled()     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L46
            goto L15
        L13:
            r0 = move-exception
            goto L84
        L15:
            android.content.SharedPreferences r0 = r9.f12449b     // Catch: java.lang.Throwable -> L13
            java.lang.String r2 = "version_code"
            boolean r0 = r0.contains(r2)     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L46
            com.braze.configuration.BrazeConfigurationProvider r0 = r9.f12448a     // Catch: java.lang.Throwable -> L13
            int r0 = r0.getVersionCode()     // Catch: java.lang.Throwable -> L13
            android.content.SharedPreferences r2 = r9.f12449b     // Catch: java.lang.Throwable -> L13
            java.lang.String r3 = "version_code"
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            int r2 = r2.getInt(r3, r4)     // Catch: java.lang.Throwable -> L13
            if (r0 == r2) goto L46
            com.braze.support.BrazeLogger r3 = com.braze.support.BrazeLogger.INSTANCE     // Catch: java.lang.Throwable -> L13
            com.braze.support.BrazeLogger$Priority r4 = com.braze.support.BrazeLogger.Priority.f12983V     // Catch: java.lang.Throwable -> L13
            Z3.Q1 r5 = new Z3.Q1     // Catch: java.lang.Throwable -> L13
            r5.<init>()     // Catch: java.lang.Throwable -> L13
            r6 = 6
            r7 = 0
            r0 = r3
            r3 = 0
            r2 = r4
            r4 = 0
            r1 = r9
            com.braze.support.BrazeLogger.brazelog$default(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r9)
            return r8
        L46:
            android.content.SharedPreferences r0 = r9.f12449b     // Catch: java.lang.Throwable -> L13
            java.lang.String r2 = "device_identifier"
            boolean r0 = r0.contains(r2)     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L7a
            android.content.SharedPreferences r0 = r9.f12449b     // Catch: java.lang.Throwable -> L13
            java.lang.String r2 = "device_identifier"
            java.lang.String r3 = ""
            java.lang.String r0 = r0.getString(r2, r3)     // Catch: java.lang.Throwable -> L13
            r2 = 722989291(0x2b17f0eb, float:5.398032E-13)
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L13
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto L7a
            com.braze.support.BrazeLogger r0 = com.braze.support.BrazeLogger.INSTANCE     // Catch: java.lang.Throwable -> L13
            com.braze.support.BrazeLogger$Priority r2 = com.braze.support.BrazeLogger.Priority.f12982I     // Catch: java.lang.Throwable -> L13
            Z3.R1 r5 = new Z3.R1     // Catch: java.lang.Throwable -> L13
            r5.<init>()     // Catch: java.lang.Throwable -> L13
            r6 = 6
            r7 = 0
            r3 = 0
            r4 = 0
            r1 = r9
            com.braze.support.BrazeLogger.brazelog$default(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r9)
            return r8
        L7a:
            android.content.SharedPreferences r0 = r9.f12449b     // Catch: java.lang.Throwable -> L13
            java.lang.String r2 = "registration_id"
            java.lang.String r0 = r0.getString(r2, r8)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r9)
            return r0
        L84:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L13
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.managers.l0.b():java.lang.String");
    }

    public static final String a() {
        return "Device identifier differs from saved device identifier. Returning null token.";
    }

    public final synchronized void a(String str) {
        if (str != null) {
            this.f12449b.edit().putString("registration_id", str).putInt("version_code", this.f12448a.getVersionCode()).putString("device_identifier", String.valueOf(722989291)).apply();
        } else {
            throw new NullPointerException("Provided push token is null. Cannot set null push token.");
        }
    }
}
