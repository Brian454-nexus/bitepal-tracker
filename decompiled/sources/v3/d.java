package v3;

import D3.f;
import D3.g;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import ga.J;
import ga.L;
import ga.Y;
import ga.u0;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o3.C1839a;
import o3.EnumC1840b;
import x3.i;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class d implements Application.ActivityLifecycleCallbacks, f {

    /* renamed from: a, reason: collision with root package name */
    public final x3.c f19571a;

    /* renamed from: b, reason: collision with root package name */
    public final f.a f19572b;

    /* renamed from: c, reason: collision with root package name */
    public B3.a f19573c;

    /* renamed from: d, reason: collision with root package name */
    public PackageInfo f19574d;

    /* renamed from: e, reason: collision with root package name */
    public C1839a f19575e;

    /* renamed from: f, reason: collision with root package name */
    public Set f19576f;

    /* renamed from: g, reason: collision with root package name */
    public final Set f19577g;

    /* renamed from: h, reason: collision with root package name */
    public final Set f19578h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f19579i;

    /* renamed from: j, reason: collision with root package name */
    public u0 f19580j;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a extends SuspendLambda implements Function2 {

        /* renamed from: j, reason: collision with root package name */
        public Object f19581j;

        /* renamed from: k, reason: collision with root package name */
        public int f19582k;

        /* renamed from: v3.d$a$a, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public /* synthetic */ class C0263a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f19584a;

            static {
                int[] iArr = new int[x3.b.values().length];
                try {
                    iArr[x3.b.f20516a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[x3.b.f20517b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[x3.b.f20518c.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[x3.b.f20519d.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[x3.b.f20520e.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[x3.b.f20521f.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                f19584a = iArr;
            }
        }

        public a(Continuation continuation) {
            super(2, continuation);
        }

        public final Continuation create(Object obj, Continuation continuation) {
            return new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(J j6, Continuation continuation) {
            return create(j6, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0037 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0040  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0035 -> B:5:0x0038). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.f19582k
                r2 = 1
                if (r1 == 0) goto L1b
                if (r1 != r2) goto L13
                java.lang.Object r1 = r6.f19581j
                ia.f r1 = (ia.f) r1
                kotlin.ResultKt.throwOnFailure(r7)
                goto L38
            L13:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1b:
                kotlin.ResultKt.throwOnFailure(r7)
                v3.d r7 = v3.d.this
                x3.c r7 = v3.d.e(r7)
                ia.d r7 = r7.a()
                ia.f r7 = r7.iterator()
                r1 = r7
            L2d:
                r6.f19581j = r1
                r6.f19582k = r2
                java.lang.Object r7 = r1.a(r6)
                if (r7 != r0) goto L38
                return r0
            L38:
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                if (r7 == 0) goto L88
                java.lang.Object r7 = r1.next()
                x3.a r7 = (x3.C2272a) r7
                java.lang.ref.WeakReference r3 = r7.a()
                java.lang.Object r3 = r3.get()
                android.app.Activity r3 = (android.app.Activity) r3
                if (r3 == 0) goto L2d
                v3.d r4 = v3.d.this
                x3.b r7 = r7.b()
                int[] r5 = v3.d.a.C0263a.f19584a
                int r7 = r7.ordinal()
                r7 = r5[r7]
                switch(r7) {
                    case 1: goto L78;
                    case 2: goto L74;
                    case 3: goto L70;
                    case 4: goto L6c;
                    case 5: goto L68;
                    case 6: goto L64;
                    default: goto L63;
                }
            L63:
                goto L2d
            L64:
                r4.onActivityDestroyed(r3)
                goto L2d
            L68:
                r4.onActivityStopped(r3)
                goto L2d
            L6c:
                r4.onActivityPaused(r3)
                goto L2d
            L70:
                r4.onActivityResumed(r3)
                goto L2d
            L74:
                r4.onActivityStarted(r3)
                goto L2d
            L78:
                android.content.Intent r7 = r3.getIntent()
                if (r7 == 0) goto L83
                android.os.Bundle r7 = r7.getExtras()
                goto L84
            L83:
                r7 = 0
            L84:
                r4.onActivityCreated(r3, r7)
                goto L2d
            L88:
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: v3.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public d(x3.c activityLifecycleObserver) {
        Intrinsics.checkNotNullParameter(activityLifecycleObserver, "activityLifecycleObserver");
        this.f19571a = activityLifecycleObserver;
        this.f19572b = f.a.f800d;
        this.f19577g = new LinkedHashSet();
        this.f19578h = new LinkedHashSet();
    }

    @Override // D3.f
    public void a(B3.a amplitude) {
        PackageInfo packageInfo;
        Intrinsics.checkNotNullParameter(amplitude, "amplitude");
        super.a(amplitude);
        this.f19575e = (C1839a) amplitude;
        B3.b m6 = amplitude.m();
        Intrinsics.checkNotNull(m6, "null cannot be cast to non-null type com.amplitude.android.Configuration");
        o3.c cVar = (o3.c) m6;
        this.f19576f = cVar.B();
        Context C6 = cVar.C();
        Intrinsics.checkNotNull(C6, "null cannot be cast to non-null type android.app.Application");
        Application application = (Application) C6;
        Set set = this.f19576f;
        if (set == null) {
            Intrinsics.throwUninitializedPropertyAccessException("autocapture");
            set = null;
        }
        if (set.contains(EnumC1840b.f17891b)) {
            try {
                packageInfo = application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
                Intrinsics.checkNotNull(packageInfo);
            } catch (PackageManager.NameNotFoundException unused) {
                amplitude.s().a("Cannot find package with application.packageName: " + application.getPackageName());
                packageInfo = new PackageInfo();
            }
            this.f19574d = packageInfo;
            C1839a c1839a = this.f19575e;
            if (c1839a == null) {
                Intrinsics.throwUninitializedPropertyAccessException("androidAmplitude");
                c1839a = null;
            }
            i iVar = new i(c1839a);
            PackageInfo packageInfo2 = this.f19574d;
            if (packageInfo2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("packageInfo");
                packageInfo2 = null;
            }
            iVar.j(packageInfo2);
        }
        this.f19580j = ga.i.d(amplitude.l(), Y.c(), (L) null, new a(null), 2, (Object) null);
    }

    @Override // D3.f
    public void d(B3.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f19573c = aVar;
    }

    @Override // D3.f
    public f.a getType() {
        return this.f19572b;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f19577g.add(Integer.valueOf(activity.hashCode()));
        Set set = this.f19576f;
        C1839a c1839a = null;
        if (set == null) {
            Intrinsics.throwUninitializedPropertyAccessException("autocapture");
            set = null;
        }
        if (set.contains(EnumC1840b.f17893d)) {
            C1839a c1839a2 = this.f19575e;
            if (c1839a2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("androidAmplitude");
            } else {
                c1839a = c1839a2;
            }
            new i(c1839a).d(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f19577g.remove(Integer.valueOf(activity.hashCode()));
        Set set = this.f19576f;
        C1839a c1839a = null;
        if (set == null) {
            Intrinsics.throwUninitializedPropertyAccessException("autocapture");
            set = null;
        }
        if (set.contains(EnumC1840b.f17893d)) {
            C1839a c1839a2 = this.f19575e;
            if (c1839a2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("androidAmplitude");
            } else {
                c1839a = c1839a2;
            }
            new i(c1839a).f(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        C1839a c1839a = this.f19575e;
        C1839a c1839a2 = null;
        if (c1839a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("androidAmplitude");
            c1839a = null;
        }
        g x6 = c1839a.x();
        Intrinsics.checkNotNull(x6, "null cannot be cast to non-null type com.amplitude.android.Timeline");
        ((o3.f) x6).x(System.currentTimeMillis());
        B3.b m6 = c1839a.m();
        Intrinsics.checkNotNull(m6, "null cannot be cast to non-null type com.amplitude.android.Configuration");
        if (((o3.c) m6).G()) {
            c1839a.j();
        }
        Set set = this.f19576f;
        if (set == null) {
            Intrinsics.throwUninitializedPropertyAccessException("autocapture");
            set = null;
        }
        if (set.contains(EnumC1840b.f17894e)) {
            C1839a c1839a3 = this.f19575e;
            if (c1839a3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("androidAmplitude");
            } else {
                c1839a2 = c1839a3;
            }
            new i(c1839a2).g(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        C1839a c1839a = this.f19575e;
        C1839a c1839a2 = null;
        if (c1839a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("androidAmplitude");
            c1839a = null;
        }
        g x6 = c1839a.x();
        Intrinsics.checkNotNull(x6, "null cannot be cast to non-null type com.amplitude.android.Timeline");
        ((o3.f) x6).w(System.currentTimeMillis());
        Set set = this.f19576f;
        if (set == null) {
            Intrinsics.throwUninitializedPropertyAccessException("autocapture");
            set = null;
        }
        if (set.contains(EnumC1840b.f17894e)) {
            C1839a c1839a3 = this.f19575e;
            if (c1839a3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("androidAmplitude");
            } else {
                c1839a2 = c1839a3;
            }
            new i(c1839a2).e(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (!this.f19577g.contains(Integer.valueOf(activity.hashCode()))) {
            onActivityCreated(activity, activity.getIntent().getExtras());
        }
        this.f19578h.add(Integer.valueOf(activity.hashCode()));
        Set set = this.f19576f;
        C1839a c1839a = null;
        if (set == null) {
            Intrinsics.throwUninitializedPropertyAccessException("autocapture");
            set = null;
        }
        if (set.contains(EnumC1840b.f17891b) && this.f19578h.size() == 1) {
            C1839a c1839a2 = this.f19575e;
            if (c1839a2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("androidAmplitude");
                c1839a2 = null;
            }
            i iVar = new i(c1839a2);
            PackageInfo packageInfo = this.f19574d;
            if (packageInfo == null) {
                Intrinsics.throwUninitializedPropertyAccessException("packageInfo");
                packageInfo = null;
            }
            iVar.i(packageInfo, this.f19579i);
            this.f19579i = false;
        }
        Set set2 = this.f19576f;
        if (set2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("autocapture");
            set2 = null;
        }
        if (set2.contains(EnumC1840b.f17892c)) {
            C1839a c1839a3 = this.f19575e;
            if (c1839a3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("androidAmplitude");
                c1839a3 = null;
            }
            new i(c1839a3).k(activity);
        }
        Set set3 = this.f19576f;
        if (set3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("autocapture");
            set3 = null;
        }
        if (set3.contains(EnumC1840b.f17893d)) {
            C1839a c1839a4 = this.f19575e;
            if (c1839a4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("androidAmplitude");
            } else {
                c1839a = c1839a4;
            }
            new i(c1839a).l(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f19578h.remove(Integer.valueOf(activity.hashCode()));
        Set set = this.f19576f;
        C1839a c1839a = null;
        if (set == null) {
            Intrinsics.throwUninitializedPropertyAccessException("autocapture");
            set = null;
        }
        if (set.contains(EnumC1840b.f17891b) && this.f19578h.isEmpty()) {
            C1839a c1839a2 = this.f19575e;
            if (c1839a2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("androidAmplitude");
            } else {
                c1839a = c1839a2;
            }
            new i(c1839a).h();
            this.f19579i = true;
        }
    }
}
