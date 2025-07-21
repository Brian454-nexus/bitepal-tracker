package m3;

import B3.d;
import B9.a;
import G9.j;
import L.g;
import Q4.e;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.appsflyer.AdRevenueScheme;
import com.appsflyer.AppsFlyerProperties;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import o3.C1839a;
import p3.C1911a;
import p3.C1912b;
import x3.i;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 82\u00020\u00012\u00020\u00022\u00020\u0003:\u0001+B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\u0005J\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u0005J\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u001f\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010%\u001a\u00020$2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020'2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b(\u0010)R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001e\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u000103028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u00104R\"\u0010<\u001a\u0002068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0016\u0010?\u001a\u00020=8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010>¨\u0006@"}, d2 = {"Lm3/b;", "LB9/a;", "LG9/j$c;", "LC9/a;", "<init>", "()V", "LC9/c;", "binding", "", "onAttachedToActivity", "(LC9/c;)V", "onDetachedFromActivityForConfigChanges", "onReattachedToActivityForConfigChanges", "onDetachedFromActivity", "LB9/a$b;", "onAttachedToEngine", "(LB9/a$b;)V", "onDetachedFromEngine", "LG9/i;", "call", "LG9/j$d;", "result", "onMethodCall", "(LG9/i;LG9/j$d;)V", "", "appLifecycles", "deepLinks", "i", "(ZZ)V", "Lo3/c;", "d", "(LG9/i;)Lo3/c;", "", "", "", "map", "Lo3/g;", "b", "(Ljava/util/Map;)Lo3/g;", "LC3/a;", "f", "(LG9/i;)LC3/a;", "Lo3/a;", "a", "Lo3/a;", "c", "()Lo3/a;", g.f3025c, "(Lo3/a;)V", "amplitude", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "Ljava/lang/ref/WeakReference;", "activity", "Landroid/content/Context;", "Landroid/content/Context;", e.f4542u, "()Landroid/content/Context;", "h", "(Landroid/content/Context;)V", "ctxt", "LG9/j;", "LG9/j;", AppsFlyerProperties.CHANNEL, "amplitude_flutter_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAmplitudeFlutterPlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AmplitudeFlutterPlugin.kt\ncom/amplitude/amplitude_flutter/AmplitudeFlutterPlugin\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,323:1\n1#2:324\n*E\n"})
/* renamed from: m3.b, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1802b implements B9.a, j.c, C9.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public C1839a amplitude;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public WeakReference activity = new WeakReference(null);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public Context ctxt;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public j channel;

    public static final Unit j(C1802b this$0, boolean z6, boolean z7, Throwable th) {
        Activity activity;
        PackageInfo packageInfo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (th != null) {
            System.out.println((Object) ("isBuilt computation failed with exception: " + th));
        } else {
            i iVar = new i(this$0.c());
            if (z6) {
                try {
                    packageInfo = this$0.e().getPackageManager().getPackageInfo(this$0.e().getPackageName(), 0);
                } catch (PackageManager.NameNotFoundException e6) {
                    System.out.println((Object) ("Error occurred in getting package info. " + e6.getMessage()));
                    packageInfo = null;
                }
                if (packageInfo != null) {
                    iVar.j(packageInfo);
                }
            }
            if (z7 && (activity = (Activity) this$0.activity.get()) != null) {
                iVar.k(activity);
            }
        }
        return Unit.INSTANCE;
    }

    public final o3.g b(Map map) {
        o3.g gVar = new o3.g();
        Object obj = map.get("ipAddress");
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        if (bool != null && !bool.booleanValue()) {
            gVar.m();
        }
        Object obj2 = map.get("language");
        Boolean bool2 = obj2 instanceof Boolean ? (Boolean) obj2 : null;
        if (bool2 != null && !bool2.booleanValue()) {
            gVar.n();
        }
        Object obj3 = map.get("platform");
        Boolean bool3 = obj3 instanceof Boolean ? (Boolean) obj3 : null;
        if (bool3 != null && !bool3.booleanValue()) {
            gVar.r();
        }
        Object obj4 = map.get("region");
        Boolean bool4 = obj4 instanceof Boolean ? (Boolean) obj4 : null;
        if (bool4 != null && !bool4.booleanValue()) {
            gVar.s();
        }
        Object obj5 = map.get("dma");
        Boolean bool5 = obj5 instanceof Boolean ? (Boolean) obj5 : null;
        if (bool5 != null && !bool5.booleanValue()) {
            gVar.l();
        }
        Object obj6 = map.get(AdRevenueScheme.COUNTRY);
        Boolean bool6 = obj6 instanceof Boolean ? (Boolean) obj6 : null;
        if (bool6 != null && !bool6.booleanValue()) {
            gVar.h();
        }
        Object obj7 = map.get("city");
        Boolean bool7 = obj7 instanceof Boolean ? (Boolean) obj7 : null;
        if (bool7 != null && !bool7.booleanValue()) {
            gVar.g();
        }
        Object obj8 = map.get("carrier");
        Boolean bool8 = obj8 instanceof Boolean ? (Boolean) obj8 : null;
        if (bool8 != null && !bool8.booleanValue()) {
            gVar.f();
        }
        Object obj9 = map.get("deviceModel");
        Boolean bool9 = obj9 instanceof Boolean ? (Boolean) obj9 : null;
        if (bool9 != null && !bool9.booleanValue()) {
            gVar.k();
        }
        Object obj10 = map.get("deviceManufacturer");
        Boolean bool10 = obj10 instanceof Boolean ? (Boolean) obj10 : null;
        if (bool10 != null && !bool10.booleanValue()) {
            gVar.j();
        }
        Object obj11 = map.get("osVersion");
        Boolean bool11 = obj11 instanceof Boolean ? (Boolean) obj11 : null;
        if (bool11 != null && !bool11.booleanValue()) {
            gVar.q();
        }
        Object obj12 = map.get("osName");
        Boolean bool12 = obj12 instanceof Boolean ? (Boolean) obj12 : null;
        if (bool12 != null && !bool12.booleanValue()) {
            gVar.p();
        }
        Object obj13 = map.get("versionName");
        Boolean bool13 = obj13 instanceof Boolean ? (Boolean) obj13 : null;
        if (bool13 != null && !bool13.booleanValue()) {
            gVar.u();
        }
        Object obj14 = map.get("adid");
        Boolean bool14 = obj14 instanceof Boolean ? (Boolean) obj14 : null;
        if (bool14 != null && !bool14.booleanValue()) {
            gVar.c();
        }
        Object obj15 = map.get("appSetId");
        Boolean bool15 = obj15 instanceof Boolean ? (Boolean) obj15 : null;
        if (bool15 != null && !bool15.booleanValue()) {
            gVar.e();
        }
        Object obj16 = map.get("deviceBrand");
        Boolean bool16 = obj16 instanceof Boolean ? (Boolean) obj16 : null;
        if (bool16 != null && !bool16.booleanValue()) {
            gVar.i();
        }
        Object obj17 = map.get("latLng");
        Boolean bool17 = obj17 instanceof Boolean ? (Boolean) obj17 : null;
        if (bool17 != null && !bool17.booleanValue()) {
            gVar.o();
        }
        Object obj18 = map.get("apiLevel");
        Boolean bool18 = obj18 instanceof Boolean ? (Boolean) obj18 : null;
        if (bool18 != null && !bool18.booleanValue()) {
            gVar.d();
        }
        return gVar;
    }

    public final C1839a c() {
        C1839a c1839a = this.amplitude;
        if (c1839a != null) {
            return c1839a;
        }
        Intrinsics.throwUninitializedPropertyAccessException("amplitude");
        return null;
    }

    public final o3.c d(G9.i call) {
        Object a6 = call.a("apiKey");
        Intrinsics.checkNotNull(a6);
        o3.c cVar = new o3.c((String) a6, e(), 0, 0, null, false, null, null, null, null, null, 0, false, null, null, null, null, false, false, false, null, false, false, false, 0L, null, 0L, null, null, false, null, null, null, null, -4, 3, null);
        Integer num = (Integer) call.a("flushQueueSize");
        if (num != null) {
            cVar.U(num.intValue());
        }
        Integer num2 = (Integer) call.a("flushIntervalMillis");
        if (num2 != null) {
            cVar.S(num2.intValue());
        }
        String str = (String) call.a("instanceName");
        if (str != null) {
            cVar.W(str);
        }
        Boolean bool = (Boolean) call.a("optOut");
        if (bool != null) {
            cVar.b0(bool.booleanValue());
        }
        Integer num3 = (Integer) call.a("minIdLength");
        if (num3 != null) {
            cVar.Z(Integer.valueOf(num3.intValue()));
        }
        String str2 = (String) call.a("partnerId");
        if (str2 != null) {
            cVar.c0(str2);
        }
        Integer num4 = (Integer) call.a("flushMaxRetries");
        if (num4 != null) {
            cVar.T(num4.intValue());
        }
        Boolean bool2 = (Boolean) call.a("useBatch");
        if (bool2 != null) {
            cVar.i0(bool2.booleanValue());
        }
        String str3 = (String) call.a("serverZone");
        if (str3 != null) {
            String upperCase = str3.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            cVar.e0(d.valueOf(upperCase));
        }
        String str4 = (String) call.a("serverUrl");
        if (str4 != null) {
            cVar.d0(str4);
        }
        if (((Integer) call.a("minTimeBetweenSessionsMillis")) != null) {
            cVar.a0(r2.intValue());
        }
        Map map = (Map) call.a("defaultTracking");
        if (map != null) {
            Object obj = map.get("sessions");
            Boolean bool3 = obj instanceof Boolean ? (Boolean) obj : null;
            boolean booleanValue = bool3 != null ? bool3.booleanValue() : true;
            Object obj2 = map.get("appLifecycles");
            Boolean bool4 = obj2 instanceof Boolean ? (Boolean) obj2 : null;
            boolean booleanValue2 = bool4 != null ? bool4.booleanValue() : false;
            Object obj3 = map.get("deepLinks");
            Boolean bool5 = obj3 instanceof Boolean ? (Boolean) obj3 : null;
            cVar.P(new o3.d(booleanValue, booleanValue2, bool5 != null ? bool5.booleanValue() : false, false));
        }
        Map map2 = (Map) call.a("trackingOptions");
        if (map2 != null) {
            cVar.f0(b(map2));
        }
        Boolean bool6 = (Boolean) call.a("enableCoppaControl");
        if (bool6 != null) {
            cVar.Q(bool6.booleanValue());
        }
        Boolean bool7 = (Boolean) call.a("flushEventsOnClose");
        if (bool7 != null) {
            cVar.R(bool7.booleanValue());
        }
        if (((Integer) call.a("identifyBatchIntervalMillis")) != null) {
            cVar.V(r2.intValue());
        }
        Boolean bool8 = (Boolean) call.a("migrateLegacyData");
        if (bool8 != null) {
            cVar.Y(bool8.booleanValue());
        }
        Boolean bool9 = (Boolean) call.a("locationListening");
        if (bool9 != null) {
            cVar.X(bool9.booleanValue());
        }
        Boolean bool10 = (Boolean) call.a("useAdvertisingIdForDeviceId");
        if (bool10 != null) {
            cVar.g0(bool10.booleanValue());
        }
        Boolean bool11 = (Boolean) call.a("useAppSetIdForDeviceId");
        if (bool11 != null) {
            cVar.h0(bool11.booleanValue());
        }
        return cVar;
    }

    public final Context e() {
        Context context = this.ctxt;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("ctxt");
        return null;
    }

    public final C3.a f(G9.i call) {
        C3.a aVar = new C3.a();
        Object a6 = call.a("event_type");
        Intrinsics.checkNotNull(a6);
        aVar.M0((String) a6);
        Map map = (Map) call.a("event_properties");
        if (map != null) {
            aVar.L0(MapsKt.toMutableMap(map));
        }
        Map map2 = (Map) call.a("user_properties");
        if (map2 != null) {
            aVar.P0(MapsKt.toMutableMap(map2));
        }
        Map map3 = (Map) call.a("groups");
        if (map3 != null) {
            aVar.O0(MapsKt.toMutableMap(map3));
        }
        Map map4 = (Map) call.a("group_properties");
        if (map4 != null) {
            aVar.N0(MapsKt.toMutableMap(map4));
        }
        String str = (String) call.a("user_id");
        if (str != null) {
            aVar.C0(str);
        }
        String str2 = (String) call.a("device_id");
        if (str2 != null) {
            aVar.a0(str2);
        }
        if (((Integer) call.a("timestamp")) != null) {
            aVar.B0(Long.valueOf(r1.intValue()));
        }
        if (((Integer) call.a("event_id")) != null) {
            aVar.e0(Long.valueOf(r1.intValue()));
        }
        if (((Integer) call.a("session_id")) != null) {
            aVar.A0(Long.valueOf(r1.intValue()));
        }
        String str3 = (String) call.a("insert_id");
        if (str3 != null) {
            aVar.j0(str3);
        }
        Double d6 = (Double) call.a("location_lat");
        if (d6 != null) {
            aVar.n0(Double.valueOf(d6.doubleValue()));
        }
        Double d7 = (Double) call.a("location_lng");
        if (d7 != null) {
            aVar.o0(Double.valueOf(d7.doubleValue()));
        }
        String str4 = (String) call.a("app_version");
        if (str4 != null) {
            aVar.S(str4);
        }
        String str5 = (String) call.a("version_name");
        if (str5 != null) {
            aVar.D0(str5);
        }
        String str6 = (String) call.a("platform");
        if (str6 != null) {
            aVar.t0(str6);
        }
        String str7 = (String) call.a("os_name");
        if (str7 != null) {
            aVar.p0(str7);
        }
        String str8 = (String) call.a("os_version");
        if (str8 != null) {
            aVar.q0(str8);
        }
        String str9 = (String) call.a("device_brand");
        if (str9 != null) {
            aVar.Z(str9);
        }
        String str10 = (String) call.a("device_manufacturer");
        if (str10 != null) {
            aVar.b0(str10);
        }
        String str11 = (String) call.a("device_model");
        if (str11 != null) {
            aVar.c0(str11);
        }
        String str12 = (String) call.a("carrier");
        if (str12 != null) {
            aVar.V(str12);
        }
        String str13 = (String) call.a(AdRevenueScheme.COUNTRY);
        if (str13 != null) {
            aVar.X(str13);
        }
        String str14 = (String) call.a("region");
        if (str14 != null) {
            aVar.x0(str14);
        }
        String str15 = (String) call.a("city");
        if (str15 != null) {
            aVar.W(str15);
        }
        String str16 = (String) call.a("dma");
        if (str16 != null) {
            aVar.d0(str16);
        }
        String str17 = (String) call.a("idfa");
        if (str17 != null) {
            aVar.g0(str17);
        }
        String str18 = (String) call.a("idfv");
        if (str18 != null) {
            aVar.h0(str18);
        }
        String str19 = (String) call.a("adid");
        if (str19 != null) {
            aVar.P(str19);
        }
        String str20 = (String) call.a("app_set_id");
        if (str20 != null) {
            aVar.R(str20);
        }
        String str21 = (String) call.a("android_id");
        if (str21 != null) {
            aVar.Q(str21);
        }
        String str22 = (String) call.a("language");
        if (str22 != null) {
            aVar.l0(str22);
        }
        String str23 = (String) call.a("library");
        if (str23 != null) {
            aVar.m0(str23);
        }
        String str24 = (String) call.a("ip");
        if (str24 != null) {
            aVar.k0(str24);
        }
        Map map5 = (Map) call.a("plan");
        if (map5 != null) {
            Object obj = map5.get("branch");
            String str25 = obj instanceof String ? (String) obj : null;
            Object obj2 = map5.get("source");
            String str26 = obj2 instanceof String ? (String) obj2 : null;
            Object obj3 = map5.get("version");
            String str27 = obj3 instanceof String ? (String) obj3 : null;
            Object obj4 = map5.get("versionId");
            aVar.s0(new C1912b(str25, str26, str27, obj4 instanceof String ? (String) obj4 : null));
        }
        Map map6 = (Map) call.a("ingestion_metadata");
        if (map6 != null) {
            Object obj5 = map6.get("sourceName");
            String str28 = obj5 instanceof String ? (String) obj5 : null;
            Object obj6 = map6.get("sourceVersion");
            aVar.i0(new C1911a(str28, obj6 instanceof String ? (String) obj6 : null));
        }
        Double d8 = (Double) call.a("revenue");
        if (d8 != null) {
            aVar.y0(Double.valueOf(d8.doubleValue()));
        }
        Double d9 = (Double) call.a(com.amazon.a.a.o.b.f11220x);
        if (d9 != null) {
            aVar.u0(Double.valueOf(d9.doubleValue()));
        }
        Integer num = (Integer) call.a("quantity");
        if (num != null) {
            aVar.w0(Integer.valueOf(num.intValue()));
        }
        String str29 = (String) call.a("product_id");
        if (str29 != null) {
            aVar.v0(str29);
        }
        String str30 = (String) call.a("revenue_type");
        if (str30 != null) {
            aVar.z0(str30);
        }
        Map map7 = (Map) call.a("extra");
        if (map7 != null) {
            aVar.f0(map7);
        }
        String str31 = (String) call.a("partner_id");
        if (str31 != null) {
            aVar.r0(str31);
        }
        return aVar;
    }

    public final void g(C1839a c1839a) {
        Intrinsics.checkNotNullParameter(c1839a, "<set-?>");
        this.amplitude = c1839a;
    }

    public final void h(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.ctxt = context;
    }

    public final void i(final boolean appLifecycles, final boolean deepLinks) {
        c().z().invokeOnCompletion(new Function1() { // from class: m3.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit j6;
                j6 = C1802b.j(C1802b.this, appLifecycles, deepLinks, (Throwable) obj);
                return j6;
            }
        });
    }

    public void onAttachedToActivity(C9.c binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.activity = new WeakReference(binding.f());
    }

    public void onAttachedToEngine(a.b binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        h(binding.a());
        j jVar = new j(binding.b(), "amplitude_flutter");
        this.channel = jVar;
        jVar.e(this);
    }

    public void onDetachedFromActivity() {
        this.activity = new WeakReference(null);
    }

    public void onDetachedFromActivityForConfigChanges() {
        this.activity = new WeakReference(null);
    }

    public void onDetachedFromEngine(a.b binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        j jVar = this.channel;
        if (jVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException(AppsFlyerProperties.CHANNEL);
            jVar = null;
        }
        jVar.e((j.c) null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        if (r0.equals("setGroup") == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r0.equals("revenue") == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a8, code lost:
    
        if (r0.equals("track") == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0172, code lost:
    
        if (r0.equals("identify") == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (r0.equals("groupIdentify") == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0176, code lost:
    
        B3.a.G(c(), f(r8), null, null, 6, null);
        c().s().b("Track " + r8.a + " event: " + r8.b);
        r0 = new java.lang.StringBuilder();
        r0.append(r8.a);
        r0.append(" called..");
        r9.a(r0.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x01c3, code lost:
    
        return;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0012. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMethodCall(G9.i r8, G9.j.d r9) {
        /*
            Method dump skipped, instructions count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.C1802b.onMethodCall(G9.i, G9.j$d):void");
    }

    public void onReattachedToActivityForConfigChanges(C9.c binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.activity = new WeakReference(binding.f());
    }
}
