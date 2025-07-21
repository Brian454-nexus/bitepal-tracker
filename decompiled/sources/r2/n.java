package r2;

import android.adservices.measurement.DeletionRequest;
import android.adservices.measurement.MeasurementManager;
import android.adservices.measurement.WebSourceRegistrationRequest;
import android.adservices.measurement.WebTriggerRegistrationRequest;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.InputEvent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o2.C1838a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final b f18698a = new b(null);

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final n a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            StringBuilder sb = new StringBuilder();
            sb.append("AdServicesInfo.version=");
            C1838a c1838a = C1838a.f17876a;
            sb.append(c1838a.a());
            Log.d("MeasurementManager", sb.toString());
            if (c1838a.a() >= 5) {
                return new a(context);
            }
            return null;
        }

        public b() {
        }
    }

    public abstract Object a(AbstractC2023a abstractC2023a, Continuation continuation);

    public abstract Object b(Continuation continuation);

    public abstract Object c(Uri uri, InputEvent inputEvent, Continuation continuation);

    public abstract Object d(Uri uri, Continuation continuation);

    public abstract Object e(o oVar, Continuation continuation);

    public abstract Object f(p pVar, Continuation continuation);

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a extends n {

        /* renamed from: b, reason: collision with root package name */
        public final MeasurementManager f18699b;

        public a(MeasurementManager mMeasurementManager) {
            Intrinsics.checkNotNullParameter(mMeasurementManager, "mMeasurementManager");
            this.f18699b = mMeasurementManager;
        }

        @Override // r2.n
        @Nullable
        public Object a(@NotNull AbstractC2023a abstractC2023a, @NotNull Continuation<? super Unit> continuation) {
            ga.o oVar = new ga.o(IntrinsicsKt.intercepted(continuation), 1);
            oVar.D();
            this.f18699b.deleteRegistrations(k(abstractC2023a), new m(), v0.o.a(oVar));
            Object x6 = oVar.x();
            if (x6 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return x6 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? x6 : Unit.INSTANCE;
        }

        @Override // r2.n
        @Nullable
        public Object b(@NotNull Continuation<? super Integer> continuation) {
            ga.o oVar = new ga.o(IntrinsicsKt.intercepted(continuation), 1);
            oVar.D();
            this.f18699b.getMeasurementApiStatus(new m(), v0.o.a(oVar));
            Object x6 = oVar.x();
            if (x6 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return x6;
        }

        @Override // r2.n
        @Nullable
        public Object c(@NotNull Uri uri, @Nullable InputEvent inputEvent, @NotNull Continuation<? super Unit> continuation) {
            ga.o oVar = new ga.o(IntrinsicsKt.intercepted(continuation), 1);
            oVar.D();
            this.f18699b.registerSource(uri, inputEvent, new m(), v0.o.a(oVar));
            Object x6 = oVar.x();
            if (x6 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return x6 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? x6 : Unit.INSTANCE;
        }

        @Override // r2.n
        @Nullable
        public Object d(@NotNull Uri uri, @NotNull Continuation<? super Unit> continuation) {
            ga.o oVar = new ga.o(IntrinsicsKt.intercepted(continuation), 1);
            oVar.D();
            this.f18699b.registerTrigger(uri, new m(), v0.o.a(oVar));
            Object x6 = oVar.x();
            if (x6 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return x6 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? x6 : Unit.INSTANCE;
        }

        @Override // r2.n
        @Nullable
        public Object e(@NotNull o oVar, @NotNull Continuation<? super Unit> continuation) {
            ga.o oVar2 = new ga.o(IntrinsicsKt.intercepted(continuation), 1);
            oVar2.D();
            this.f18699b.registerWebSource(l(oVar), new m(), v0.o.a(oVar2));
            Object x6 = oVar2.x();
            if (x6 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return x6 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? x6 : Unit.INSTANCE;
        }

        @Override // r2.n
        @Nullable
        public Object f(@NotNull p pVar, @NotNull Continuation<? super Unit> continuation) {
            ga.o oVar = new ga.o(IntrinsicsKt.intercepted(continuation), 1);
            oVar.D();
            this.f18699b.registerWebTrigger(m(pVar), new m(), v0.o.a(oVar));
            Object x6 = oVar.x();
            if (x6 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return x6 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? x6 : Unit.INSTANCE;
        }

        public final DeletionRequest k(AbstractC2023a abstractC2023a) {
            k.a();
            throw null;
        }

        public final WebSourceRegistrationRequest l(o oVar) {
            l.a();
            throw null;
        }

        public final WebTriggerRegistrationRequest m(p pVar) {
            c.a();
            throw null;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a(android.content.Context r2) {
            /*
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.Class r0 = r2.f.a()
                java.lang.Object r2 = r2.getSystemService(r0)
                java.lang.String r0 = "context.getSystemService…:class.java\n            )"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
                android.adservices.measurement.MeasurementManager r2 = r2.g.a(r2)
                r1.<init>(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: r2.n.a.<init>(android.content.Context):void");
        }
    }
}
