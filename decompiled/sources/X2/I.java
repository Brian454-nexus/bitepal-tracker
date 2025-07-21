package X2;

import W2.n;
import W2.v;
import androidx.work.impl.WorkDatabase;
import f3.u;
import g3.AbstractC1372d;
import g3.RunnableC1371c;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class I {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a extends Lambda implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ W2.w f6123a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ E f6124b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f6125c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ o f6126d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(W2.w wVar, E e6, String str, o oVar) {
            super(0);
            this.f6123a = wVar;
            this.f6124b = e6;
            this.f6125c = str;
            this.f6126d = oVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5invoke();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5invoke() {
            new RunnableC1371c(new x(this.f6124b, this.f6125c, W2.e.KEEP, CollectionsKt.listOf(this.f6123a)), this.f6126d).run();
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends Lambda implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f6127a = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(f3.u spec) {
            Intrinsics.checkNotNullParameter(spec, "spec");
            return spec.j() ? "Periodic" : "OneTime";
        }
    }

    public static final W2.n c(final E e6, final String name, final W2.w workRequest) {
        Intrinsics.checkNotNullParameter(e6, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(workRequest, "workRequest");
        final o oVar = new o();
        final a aVar = new a(workRequest, e6, name, oVar);
        e6.s().b().execute(new Runnable() { // from class: X2.G
            @Override // java.lang.Runnable
            public final void run() {
                I.d(E.this, name, oVar, aVar, workRequest);
            }
        });
        return oVar;
    }

    public static final void d(E this_enqueueUniquelyNamedPeriodic, String name, o operation, Function0 enqueueNew, W2.w workRequest) {
        Intrinsics.checkNotNullParameter(this_enqueueUniquelyNamedPeriodic, "$this_enqueueUniquelyNamedPeriodic");
        Intrinsics.checkNotNullParameter(name, "$name");
        Intrinsics.checkNotNullParameter(operation, "$operation");
        Intrinsics.checkNotNullParameter(enqueueNew, "$enqueueNew");
        Intrinsics.checkNotNullParameter(workRequest, "$workRequest");
        f3.v J6 = this_enqueueUniquelyNamedPeriodic.r().J();
        List d6 = J6.d(name);
        if (d6.size() > 1) {
            e(operation, "Can't apply UPDATE policy to the chains of work.");
            return;
        }
        u.b bVar = (u.b) CollectionsKt.firstOrNull(d6);
        if (bVar == null) {
            enqueueNew.invoke();
            return;
        }
        f3.u n6 = J6.n(bVar.f14137a);
        if (n6 == null) {
            operation.a(new n.b.a(new IllegalStateException("WorkSpec with " + bVar.f14137a + ", that matches a name \"" + name + "\", wasn't found")));
            return;
        }
        if (!n6.j()) {
            e(operation, "Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.");
            return;
        }
        if (bVar.f14138b == W2.u.CANCELLED) {
            J6.a(bVar.f14137a);
            enqueueNew.invoke();
            return;
        }
        f3.u e6 = f3.u.e(workRequest.d(), bVar.f14137a, null, null, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 1048574, null);
        try {
            r processor = this_enqueueUniquelyNamedPeriodic.o();
            Intrinsics.checkNotNullExpressionValue(processor, "processor");
            WorkDatabase workDatabase = this_enqueueUniquelyNamedPeriodic.r();
            Intrinsics.checkNotNullExpressionValue(workDatabase, "workDatabase");
            androidx.work.a configuration = this_enqueueUniquelyNamedPeriodic.k();
            Intrinsics.checkNotNullExpressionValue(configuration, "configuration");
            List schedulers = this_enqueueUniquelyNamedPeriodic.p();
            Intrinsics.checkNotNullExpressionValue(schedulers, "schedulers");
            f(processor, workDatabase, configuration, schedulers, e6, workRequest.c());
            operation.a(W2.n.f5585a);
        } catch (Throwable th) {
            operation.a(new n.b.a(th));
        }
    }

    public static final void e(o oVar, String str) {
        oVar.a(new n.b.a(new UnsupportedOperationException(str)));
    }

    public static final v.a f(r rVar, final WorkDatabase workDatabase, androidx.work.a aVar, final List list, final f3.u uVar, final Set set) {
        final String str = uVar.f14117a;
        final f3.u n6 = workDatabase.J().n(str);
        if (n6 == null) {
            throw new IllegalArgumentException("Worker with " + str + " doesn't exist");
        }
        if (n6.f14118b.b()) {
            return v.a.NOT_APPLIED;
        }
        if (n6.j() ^ uVar.j()) {
            b bVar = b.f6127a;
            throw new UnsupportedOperationException("Can't update " + ((String) bVar.invoke(n6)) + " Worker to " + ((String) bVar.invoke(uVar)) + " Worker. Update operation must preserve worker's type.");
        }
        final boolean k6 = rVar.k(str);
        if (!k6) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((t) it.next()).e(str);
            }
        }
        workDatabase.A(new Runnable() { // from class: X2.H
            @Override // java.lang.Runnable
            public final void run() {
                I.g(WorkDatabase.this, uVar, n6, list, str, set, k6);
            }
        });
        if (!k6) {
            u.b(aVar, workDatabase, list);
        }
        return k6 ? v.a.APPLIED_FOR_NEXT_RUN : v.a.APPLIED_IMMEDIATELY;
    }

    public static final void g(WorkDatabase workDatabase, f3.u newWorkSpec, f3.u oldWorkSpec, List schedulers, String workSpecId, Set tags, boolean z6) {
        Intrinsics.checkNotNullParameter(workDatabase, "$workDatabase");
        Intrinsics.checkNotNullParameter(newWorkSpec, "$newWorkSpec");
        Intrinsics.checkNotNullParameter(oldWorkSpec, "$oldWorkSpec");
        Intrinsics.checkNotNullParameter(schedulers, "$schedulers");
        Intrinsics.checkNotNullParameter(workSpecId, "$workSpecId");
        Intrinsics.checkNotNullParameter(tags, "$tags");
        f3.v J6 = workDatabase.J();
        f3.z K5 = workDatabase.K();
        J6.l(AbstractC1372d.a(schedulers, f3.u.e(newWorkSpec, null, oldWorkSpec.f14118b, null, null, null, null, 0L, 0L, 0L, null, oldWorkSpec.f14127k, null, 0L, oldWorkSpec.f14130n, 0L, 0L, false, null, 0, oldWorkSpec.f() + 1, 515069, null)));
        K5.d(workSpecId);
        K5.c(workSpecId, tags);
        if (z6) {
            return;
        }
        J6.c(workSpecId, -1L);
        workDatabase.I().a(workSpecId);
    }
}
