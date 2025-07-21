package androidx.work.impl;

import A2.h;
import B2.f;
import X2.C0819c;
import X2.C0822f;
import X2.C0823g;
import X2.C0824h;
import X2.C0825i;
import X2.C0826j;
import X2.C0827k;
import X2.F;
import X2.l;
import X2.m;
import X2.n;
import X2.s;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import f3.InterfaceC1292b;
import f3.e;
import f3.j;
import f3.o;
import f3.r;
import f3.v;
import f3.z;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import v2.t;
import v2.u;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Landroidx/work/impl/WorkDatabase;", "Lv2/u;", "<init>", "()V", "Lf3/v;", "J", "()Lf3/v;", "Lf3/b;", "E", "()Lf3/b;", "Lf3/z;", "K", "()Lf3/z;", "Lf3/j;", "G", "()Lf3/j;", "Lf3/o;", "H", "()Lf3/o;", "Lf3/r;", "I", "()Lf3/r;", "Lf3/e;", "F", "()Lf3/e;", "p", "a", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class WorkDatabase extends u {

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: androidx.work.impl.WorkDatabase$a, reason: from kotlin metadata */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final h c(Context context, h.b configuration) {
            Intrinsics.checkNotNullParameter(context, "$context");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            h.b.a a6 = h.b.f185f.a(context);
            a6.d(configuration.f187b).c(configuration.f188c).e(true).a(true);
            return new f().a(a6.b());
        }

        public final WorkDatabase b(final Context context, Executor queryExecutor, boolean z6) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
            return (WorkDatabase) (z6 ? t.c(context, WorkDatabase.class).c() : t.a(context, WorkDatabase.class, "androidx.work.workdb").f(new h.c() { // from class: X2.y
                @Override // A2.h.c
                public final A2.h a(h.b bVar) {
                    A2.h c6;
                    c6 = WorkDatabase.Companion.c(context, bVar);
                    return c6;
                }
            })).g(queryExecutor).a(C0819c.f6164a).b(C0825i.f6169c).b(new s(context, 2, 3)).b(C0826j.f6170c).b(C0827k.f6171c).b(new s(context, 5, 6)).b(l.f6172c).b(m.f6173c).b(n.f6174c).b(new F(context)).b(new s(context, 10, 11)).b(C0822f.f6166c).b(C0823g.f6167c).b(C0824h.f6168c).e().d();
        }

        public Companion() {
        }
    }

    public static final WorkDatabase D(Context context, Executor executor, boolean z6) {
        return INSTANCE.b(context, executor, z6);
    }

    public abstract InterfaceC1292b E();

    public abstract e F();

    public abstract j G();

    public abstract o H();

    public abstract r I();

    public abstract v J();

    public abstract z K();
}
