package z3;

import X5.g;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.Build;
import android.os.LocaleList;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: z3.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2458a {

    /* renamed from: f, reason: collision with root package name */
    public static final b f21698f = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final Context f21699a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f21700b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f21701c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f21702d;

    /* renamed from: e, reason: collision with root package name */
    public final Lazy f21703e;

    /* renamed from: z3.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class C0283a {

        /* renamed from: a, reason: collision with root package name */
        public final String f21704a;

        /* renamed from: b, reason: collision with root package name */
        public final String f21705b;

        /* renamed from: c, reason: collision with root package name */
        public final String f21706c;

        /* renamed from: e, reason: collision with root package name */
        public final String f21708e;

        /* renamed from: f, reason: collision with root package name */
        public final String f21709f;

        /* renamed from: g, reason: collision with root package name */
        public final String f21710g;

        /* renamed from: h, reason: collision with root package name */
        public final String f21711h;

        /* renamed from: i, reason: collision with root package name */
        public final String f21712i;

        /* renamed from: j, reason: collision with root package name */
        public final String f21713j;

        /* renamed from: l, reason: collision with root package name */
        public final boolean f21715l;

        /* renamed from: m, reason: collision with root package name */
        public final String f21716m;

        /* renamed from: k, reason: collision with root package name */
        public boolean f21714k = true;

        /* renamed from: d, reason: collision with root package name */
        public final String f21707d = "android";

        public C0283a() {
            String RELEASE = Build.VERSION.RELEASE;
            Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
            this.f21708e = RELEASE;
            String BRAND = Build.BRAND;
            Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
            this.f21709f = BRAND;
            String MANUFACTURER = Build.MANUFACTURER;
            Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
            this.f21710g = MANUFACTURER;
            String MODEL = Build.MODEL;
            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
            this.f21711h = MODEL;
            String language = s().getLanguage();
            Intrinsics.checkNotNullExpressionValue(language, "getLanguage(...)");
            this.f21713j = language;
            this.f21704a = C2458a.this.f21701c ? b() : null;
            this.f21706c = h();
            this.f21712i = f();
            this.f21705b = g();
            this.f21715l = a();
            this.f21716m = C2458a.this.f21702d ? e() : null;
        }

        public final boolean a() {
            try {
                int i6 = g.f;
                Object invoke = g.class.getMethod("isGooglePlayServicesAvailable", Context.class).invoke(null, C2458a.this.f21699a);
                Integer num = invoke instanceof Integer ? (Integer) invoke : null;
                if (num != null) {
                    if (num.intValue() == 0) {
                        return true;
                    }
                }
                return false;
            } catch (ClassNotFoundException unused) {
                C2459b.f21719c.a().e("Google Play Services Util not found!");
                return false;
            } catch (IllegalAccessException unused2) {
                C2459b.f21719c.a().e("Google Play Services not available");
                return false;
            } catch (Exception e6) {
                C2459b.f21719c.a().e("Error when checking for Google Play Services: " + e6);
                return false;
            } catch (NoClassDefFoundError unused3) {
                C2459b.f21719c.a().e("Google Play Services Util not found!");
                return false;
            } catch (NoSuchMethodException unused4) {
                C2459b.f21719c.a().e("Google Play Services not available");
                return false;
            } catch (InvocationTargetException unused5) {
                C2459b.f21719c.a().e("Google Play Services not available");
                return false;
            }
        }

        public final String b() {
            return Intrinsics.areEqual("Amazon", this.f21710g) ? c() : d();
        }

        public final String c() {
            ContentResolver contentResolver = C2458a.this.f21699a.getContentResolver();
            this.f21714k = Settings.Secure.getInt(contentResolver, "limit_ad_tracking", 0) == 1;
            return Settings.Secure.getString(contentResolver, "advertising_id");
        }

        public final String d() {
            try {
                Object invoke = K5.a.class.getMethod("getAdvertisingIdInfo", Context.class).invoke(null, C2458a.this.f21699a);
                Object invoke2 = invoke.getClass().getMethod("isLimitAdTrackingEnabled", new Class[0]).invoke(invoke, new Object[0]);
                Boolean bool = invoke2 instanceof Boolean ? (Boolean) invoke2 : null;
                this.f21714k = bool != null && bool.booleanValue();
                Object invoke3 = invoke.getClass().getMethod("getId", new Class[0]).invoke(invoke, new Object[0]);
                Intrinsics.checkNotNull(invoke3, "null cannot be cast to non-null type kotlin.String");
                return (String) invoke3;
            } catch (ClassNotFoundException unused) {
                C2459b.f21719c.a().e("Google Play Services SDK not found for advertising id!");
                return null;
            } catch (InvocationTargetException unused2) {
                C2459b.f21719c.a().e("Google Play Services not available for advertising id");
                return null;
            } catch (Exception unused3) {
                C2459b.f21719c.a().a("Encountered an error connecting to Google Play Services for advertising id");
                return null;
            }
        }

        public final String e() {
            try {
                Object invoke = AppSet.class.getMethod("getClient", Context.class).invoke(null, C2458a.this.f21699a);
                Object invoke2 = Tasks.class.getMethod("await", Task.class).invoke(null, invoke.getClass().getMethod("getAppSetIdInfo", new Class[0]).invoke(invoke, new Object[0]));
                Object invoke3 = invoke2.getClass().getMethod("getId", new Class[0]).invoke(invoke2, new Object[0]);
                Intrinsics.checkNotNull(invoke3, "null cannot be cast to non-null type kotlin.String");
                return (String) invoke3;
            } catch (ClassNotFoundException unused) {
                C2459b.f21719c.a().e("Google Play Services SDK not found for app set id!");
                return null;
            } catch (InvocationTargetException unused2) {
                C2459b.f21719c.a().e("Google Play Services not available for app set id");
                return null;
            } catch (Exception unused3) {
                C2459b.f21719c.a().a("Encountered an error connecting to Google Play Services for app set id");
                return null;
            }
        }

        public final String f() {
            try {
                Object systemService = C2458a.this.f21699a.getSystemService("phone");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                return ((TelephonyManager) systemService).getNetworkOperatorName();
            } catch (Exception unused) {
                return null;
            }
        }

        public final String g() {
            String o6 = o();
            if (o6 != null && o6.length() != 0) {
                return o6;
            }
            String p6 = p();
            return (p6 == null || p6.length() == 0) ? n() : p6;
        }

        public final String h() {
            try {
                PackageInfo packageInfo = C2458a.this.f21699a.getPackageManager().getPackageInfo(C2458a.this.f21699a.getPackageName(), 0);
                Intrinsics.checkNotNullExpressionValue(packageInfo, "getPackageInfo(...)");
                return packageInfo.versionName;
            } catch (PackageManager.NameNotFoundException | Exception unused) {
                return null;
            }
        }

        public final String i() {
            return this.f21704a;
        }

        public final String j() {
            return this.f21716m;
        }

        public final String k() {
            return this.f21709f;
        }

        public final String l() {
            return this.f21712i;
        }

        public final String m() {
            return this.f21705b;
        }

        public final String n() {
            String country = s().getCountry();
            Intrinsics.checkNotNullExpressionValue(country, "getCountry(...)");
            return country;
        }

        public final String o() {
            Location p6;
            List<Address> fromLocation;
            if (C2458a.this.f21700b && (p6 = C2458a.this.p()) != null) {
                try {
                    if (Geocoder.isPresent() && (fromLocation = C2458a.this.l().getFromLocation(p6.getLatitude(), p6.getLongitude(), 1)) != null) {
                        for (Address address : fromLocation) {
                            if (address != null) {
                                return address.getCountryCode();
                            }
                        }
                    }
                } catch (IOException | IllegalArgumentException | IllegalStateException | NoSuchMethodError | NullPointerException | SecurityException unused) {
                }
            }
            return null;
        }

        public final String p() {
            String networkCountryIso;
            try {
                Object systemService = C2458a.this.f21699a.getSystemService("phone");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                TelephonyManager telephonyManager = (TelephonyManager) systemService;
                if (telephonyManager.getPhoneType() == 2 || (networkCountryIso = telephonyManager.getNetworkCountryIso()) == null) {
                    return null;
                }
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String upperCase = networkCountryIso.toUpperCase(US);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                return upperCase;
            } catch (Exception unused) {
                return null;
            }
        }

        public final String q() {
            return this.f21713j;
        }

        public final boolean r() {
            return this.f21714k;
        }

        public final Locale s() {
            LocaleList locales = Resources.getSystem().getConfiguration().getLocales();
            Intrinsics.checkNotNullExpressionValue(locales, "getLocales(...)");
            Locale locale = locales.isEmpty() ? Locale.getDefault() : locales.get(0);
            Intrinsics.checkNotNull(locale);
            return locale;
        }

        public final String t() {
            return this.f21710g;
        }

        public final String u() {
            return this.f21711h;
        }

        public final String v() {
            return this.f21707d;
        }

        public final String w() {
            return this.f21708e;
        }

        public final String x() {
            return this.f21706c;
        }
    }

    /* renamed from: z3.a$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    /* renamed from: z3.a$c */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c extends Lambda implements Function0 {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0283a invoke() {
            return new C0283a();
        }
    }

    public C2458a(Context context, boolean z6, boolean z7, boolean z8) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f21699a = context;
        this.f21700b = z6;
        this.f21701c = z7;
        this.f21702d = z8;
        this.f21703e = LazyKt.lazy(new c());
    }

    public final String f() {
        return i().i();
    }

    public final String g() {
        return i().j();
    }

    public final String h() {
        return i().k();
    }

    public final C0283a i() {
        return (C0283a) this.f21703e.getValue();
    }

    public final String j() {
        return i().l();
    }

    public final String k() {
        return i().m();
    }

    public final Geocoder l() {
        return new Geocoder(this.f21699a, Locale.ENGLISH);
    }

    public final String m() {
        return i().q();
    }

    public final String n() {
        return i().t();
    }

    public final String o() {
        return i().u();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0043 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.location.Location p() {
        /*
            r7 = this;
            java.lang.String r0 = "Failed to get most recent location"
            boolean r1 = r7.f21700b
            r2 = 0
            if (r1 != 0) goto L8
            return r2
        L8:
            android.content.Context r1 = r7.f21699a
            java.lang.String r3 = "android.permission.ACCESS_COARSE_LOCATION"
            int r1 = n0.AbstractC1809a.checkSelfPermission(r1, r3)
            if (r1 == 0) goto L1d
            android.content.Context r1 = r7.f21699a
            java.lang.String r3 = "android.permission.ACCESS_FINE_LOCATION"
            int r1 = n0.AbstractC1809a.checkSelfPermission(r1, r3)
            if (r1 == 0) goto L1d
            return r2
        L1d:
            android.content.Context r1 = r7.f21699a
            java.lang.String r3 = "location"
            java.lang.Object r1 = r1.getSystemService(r3)
            boolean r3 = r1 instanceof android.location.LocationManager
            if (r3 == 0) goto L2c
            android.location.LocationManager r1 = (android.location.LocationManager) r1
            goto L2d
        L2c:
            r1 = r2
        L2d:
            if (r1 != 0) goto L30
            return r2
        L30:
            r3 = 1
            java.util.List r3 = r1.getProviders(r3)     // Catch: java.lang.Throwable -> L36
            goto L37
        L36:
            r3 = r2
        L37:
            if (r3 != 0) goto L3a
            return r2
        L3a:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L43:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L71
            java.lang.Object r5 = r3.next()
            java.lang.String r5 = (java.lang.String) r5
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)     // Catch: java.lang.Exception -> L57 java.lang.SecurityException -> L61
            android.location.Location r5 = r1.getLastKnownLocation(r5)     // Catch: java.lang.Exception -> L57 java.lang.SecurityException -> L61
            goto L6b
        L57:
            z3.b$a r5 = z3.C2459b.f21719c
            z3.b r5 = r5.a()
            r5.e(r0)
            goto L6a
        L61:
            z3.b$a r5 = z3.C2459b.f21719c
            z3.b r5 = r5.a()
            r5.e(r0)
        L6a:
            r5 = r2
        L6b:
            if (r5 == 0) goto L43
            r4.add(r5)
            goto L43
        L71:
            java.util.Iterator r0 = r4.iterator()
            r3 = -1
        L77:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L91
            java.lang.Object r1 = r0.next()
            android.location.Location r1 = (android.location.Location) r1
            long r5 = r1.getTime()
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 <= 0) goto L77
            long r3 = r1.getTime()
            r2 = r1
            goto L77
        L91:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.C2458a.p():android.location.Location");
    }

    public final String q() {
        return i().v();
    }

    public final String r() {
        return i().w();
    }

    public final String s() {
        return i().x();
    }

    public final boolean t() {
        return i().r();
    }
}
