package p2;

import D6.g;
import ga.Q;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import l0.AbstractC1728c;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class b {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a extends Lambda implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AbstractC1728c.a f18288a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Q f18289b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC1728c.a aVar, Q q6) {
            super(1);
            this.f18288a = aVar;
            this.f18289b = q6;
        }

        public final void a(Throwable th) {
            if (th == null) {
                this.f18288a.c(this.f18289b.getCompleted());
            } else if (th instanceof CancellationException) {
                this.f18288a.d();
            } else {
                this.f18288a.f(th);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return Unit.INSTANCE;
        }
    }

    public static final g b(final Q q6, final Object obj) {
        Intrinsics.checkNotNullParameter(q6, "<this>");
        g a6 = AbstractC1728c.a(new AbstractC1728c.InterfaceC0214c() { // from class: p2.a
            @Override // l0.AbstractC1728c.InterfaceC0214c
            public final Object a(AbstractC1728c.a aVar) {
                Object d6;
                d6 = b.d(q6, obj, aVar);
                return d6;
            }
        });
        Intrinsics.checkNotNullExpressionValue(a6, "getFuture { completer ->…        }\n    }\n    tag\n}");
        return a6;
    }

    public static /* synthetic */ g c(Q q6, Object obj, int i6, Object obj2) {
        if ((i6 & 1) != 0) {
            obj = "Deferred.asListenableFuture";
        }
        return b(q6, obj);
    }

    public static final Object d(Q this_asListenableFuture, Object obj, AbstractC1728c.a completer) {
        Intrinsics.checkNotNullParameter(this_asListenableFuture, "$this_asListenableFuture");
        Intrinsics.checkNotNullParameter(completer, "completer");
        this_asListenableFuture.invokeOnCompletion(new a(completer, this_asListenableFuture));
        return obj;
    }
}
