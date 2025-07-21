package x3;

import B3.f;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.view.Window;
import ga.J;
import ga.L;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o3.C1839a;
import r3.C2025b;
import s3.C2064b;
import s3.WindowCallbackC2065c;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public static final a f20543c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final C1839a f20544a;

    /* renamed from: b, reason: collision with root package name */
    public final Lazy f20545b;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(Activity activity) {
            CharSequence loadLabel;
            String obj;
            Intrinsics.checkNotNullParameter(activity, "<this>");
            PackageManager packageManager = activity.getPackageManager();
            ActivityInfo activityInfo = packageManager != null ? packageManager.getActivityInfo(activity.getComponentName(), 128) : null;
            if (activityInfo != null && (loadLabel = activityInfo.loadLabel(packageManager)) != null && (obj = loadLabel.toString()) != null) {
                return obj;
            }
            if (activityInfo != null) {
                return activityInfo.name;
            }
            return null;
        }

        public a() {
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends Lambda implements Function0 {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(l.f20552a.a("androidx.fragment.app.FragmentActivity", i.this.f20544a.s()));
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public /* synthetic */ class c extends AdaptedFunctionReference implements Function2 {
        public c(Object obj) {
            super(2, obj, C1839a.class, "track", "track(Ljava/lang/String;Ljava/util/Map;Lcom/amplitude/core/events/EventOptions;)Lcom/amplitude/core/Amplitude;", 8);
        }

        public final void a(String p02, Map map) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            B3.a.H((C1839a) this.receiver, p02, map, null, 4, null);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((String) obj, (Map) obj2);
            return Unit.INSTANCE;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public /* synthetic */ class d extends AdaptedFunctionReference implements Function2 {
        public d(Object obj) {
            super(2, obj, C1839a.class, "track", "track(Ljava/lang/String;Ljava/util/Map;Lcom/amplitude/core/events/EventOptions;)Lcom/amplitude/core/Amplitude;", 8);
        }

        public final void a(String p02, Map map) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            B3.a.H((C1839a) this.receiver, p02, map, null, 4, null);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((String) obj, (Map) obj2);
            return Unit.INSTANCE;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class e extends SuspendLambda implements Function2 {

        /* renamed from: j, reason: collision with root package name */
        public int f20547j;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ B3.f f20549l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f20550m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f20551n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(B3.f fVar, String str, String str2, Continuation continuation) {
            super(2, continuation);
            this.f20549l = fVar;
            this.f20550m = str;
            this.f20551n = str2;
        }

        public final Continuation create(Object obj, Continuation continuation) {
            return new e(this.f20549l, this.f20550m, this.f20551n, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(J j6, Continuation continuation) {
            return create(j6, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0056, code lost:
        
            if (r6.j(r1, r3, r5) == r0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0058, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
        
            if (r6.j(r1, r4, r5) == r0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0038, code lost:
        
            if (r6.await(r5) == r0) goto L20;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.f20547j
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L25
                if (r1 == r4) goto L21
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                kotlin.ResultKt.throwOnFailure(r6)
                goto L59
            L15:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1d:
                kotlin.ResultKt.throwOnFailure(r6)
                goto L4a
            L21:
                kotlin.ResultKt.throwOnFailure(r6)
                goto L3b
            L25:
                kotlin.ResultKt.throwOnFailure(r6)
                x3.i r6 = x3.i.this
                o3.a r6 = x3.i.a(r6)
                ga.Q r6 = r6.z()
                r5.f20547j = r4
                java.lang.Object r6 = r6.await(r5)
                if (r6 != r0) goto L3b
                goto L58
            L3b:
                B3.f r6 = r5.f20549l
                B3.f$a r1 = B3.f.a.f377g
                java.lang.String r4 = r5.f20550m
                r5.f20547j = r3
                java.lang.Object r6 = r6.j(r1, r4, r5)
                if (r6 != r0) goto L4a
                goto L58
            L4a:
                B3.f r6 = r5.f20549l
                B3.f$a r1 = B3.f.a.f378h
                java.lang.String r3 = r5.f20551n
                r5.f20547j = r2
                java.lang.Object r6 = r6.j(r1, r3, r5)
                if (r6 != r0) goto L59
            L58:
                return r0
            L59:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: x3.i.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public i(C1839a amplitude) {
        Intrinsics.checkNotNullParameter(amplitude, "amplitude");
        this.f20544a = amplitude;
        this.f20545b = LazyKt.lazy(new b());
    }

    public final Uri b(Activity activity) {
        return activity.getReferrer();
    }

    public final boolean c() {
        return ((Boolean) this.f20545b.getValue()).booleanValue();
    }

    public final void d(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (c()) {
            C2025b.f18702a.a(activity, new c(this.f20544a), this.f20544a.s());
        }
    }

    public final void e(Activity activity) {
        Unit unit;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Window window = activity.getWindow();
        if (window != null) {
            Window.Callback callback = window.getCallback();
            if (callback == null) {
                callback = new WindowCallbackC2065c();
            } else {
                Intrinsics.checkNotNull(callback);
            }
            window.setCallback(new C2064b(callback, activity, new d(this.f20544a), (List) t3.c.f19073a.a().invoke(this.f20544a.s()), this.f20544a.s(), null, null, null, 224, null));
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.f20544a.s().a("Failed to track user interaction event: Activity window is null");
        }
    }

    public final void f(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (c()) {
            C2025b.f18702a.b(activity, this.f20544a.s());
        }
    }

    public final void g(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Window window = activity.getWindow();
        if (window == null) {
            this.f20544a.s().a("Failed to stop user interaction event tracking: Activity window is null");
            return;
        }
        Window.Callback callback = window.getCallback();
        C2064b c2064b = callback instanceof C2064b ? (C2064b) callback : null;
        if (c2064b != null) {
            Window.Callback a6 = c2064b.a();
            window.setCallback(a6 instanceof WindowCallbackC2065c ? null : a6);
        }
    }

    public final void h() {
        B3.a.H(this.f20544a, "[Amplitude] Application Backgrounded", null, null, 6, null);
    }

    public final void i(PackageInfo packageInfo, boolean z6) {
        Number b6;
        Intrinsics.checkNotNullParameter(packageInfo, "packageInfo");
        String str = packageInfo.versionName;
        b6 = k.b(packageInfo);
        B3.a.H(this.f20544a, "[Amplitude] Application Opened", MapsKt.mapOf(new Pair[]{TuplesKt.to("[Amplitude] From Background", Boolean.valueOf(z6)), TuplesKt.to("[Amplitude] Version", str), TuplesKt.to("[Amplitude] Build", b6.toString())}), null, 4, null);
    }

    public final void j(PackageInfo packageInfo) {
        Number b6;
        Intrinsics.checkNotNullParameter(packageInfo, "packageInfo");
        String str = packageInfo.versionName;
        if (str == null) {
            str = "Unknown";
        }
        String str2 = str;
        b6 = k.b(packageInfo);
        String obj = b6.toString();
        B3.f u6 = this.f20544a.u();
        String f6 = u6.f(f.a.f377g);
        String f7 = u6.f(f.a.f378h);
        if (f7 == null) {
            B3.a.H(this.f20544a, "[Amplitude] Application Installed", MapsKt.mapOf(new Pair[]{TuplesKt.to("[Amplitude] Version", str2), TuplesKt.to("[Amplitude] Build", obj)}), null, 4, null);
        } else if (!Intrinsics.areEqual(obj, f7)) {
            B3.a.H(this.f20544a, "[Amplitude] Application Updated", MapsKt.mapOf(new Pair[]{TuplesKt.to("[Amplitude] Previous Version", f6), TuplesKt.to("[Amplitude] Previous Build", f7), TuplesKt.to("[Amplitude] Version", str2), TuplesKt.to("[Amplitude] Build", obj)}), null, 4, null);
        }
        ga.i.d(this.f20544a.l(), this.f20544a.v(), (L) null, new e(u6, str2, obj, null), 2, (Object) null);
    }

    public final void k(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intent intent = activity.getIntent();
        if (intent != null) {
            Uri b6 = b(activity);
            String uri = b6 != null ? b6.toString() : null;
            Uri data = intent.getData();
            if (data != null) {
                String uri2 = data.toString();
                Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
                B3.a.H(this.f20544a, "[Amplitude] Deep Link Opened", MapsKt.mapOf(new Pair[]{TuplesKt.to("[Amplitude] Link URL", uri2), TuplesKt.to("[Amplitude] Link Referrer", uri)}), null, 4, null);
            }
        }
    }

    public final void l(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        try {
            B3.a.H(this.f20544a, "[Amplitude] Screen Viewed", MapsKt.mapOf(TuplesKt.to("[Amplitude] Screen Name", f20543c.a(activity))), null, 4, null);
        } catch (PackageManager.NameNotFoundException e6) {
            this.f20544a.s().a("Failed to get activity info: " + e6);
        } catch (Exception e7) {
            this.f20544a.s().a("Failed to track screen viewed event: " + e7);
        }
    }
}
