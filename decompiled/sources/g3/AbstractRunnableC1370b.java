package g3;

import W2.n;
import X2.E;
import androidx.work.impl.WorkDatabase;
import f3.InterfaceC1292b;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.UUID;

/* renamed from: g3.b, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractRunnableC1370b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final X2.o f14866a = new X2.o();

    /* renamed from: g3.b$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a extends AbstractRunnableC1370b {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ E f14867b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ UUID f14868c;

        public a(E e6, UUID uuid) {
            this.f14867b = e6;
            this.f14868c = uuid;
        }

        @Override // g3.AbstractRunnableC1370b
        public void g() {
            WorkDatabase r6 = this.f14867b.r();
            r6.e();
            try {
                a(this.f14867b, this.f14868c.toString());
                r6.B();
                r6.i();
                f(this.f14867b);
            } catch (Throwable th) {
                r6.i();
                throw th;
            }
        }
    }

    /* renamed from: g3.b$b, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class C0199b extends AbstractRunnableC1370b {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ E f14869b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f14870c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f14871d;

        public C0199b(E e6, String str, boolean z6) {
            this.f14869b = e6;
            this.f14870c = str;
            this.f14871d = z6;
        }

        @Override // g3.AbstractRunnableC1370b
        public void g() {
            WorkDatabase r6 = this.f14869b.r();
            r6.e();
            try {
                Iterator it = r6.J().k(this.f14870c).iterator();
                while (it.hasNext()) {
                    a(this.f14869b, (String) it.next());
                }
                r6.B();
                r6.i();
                if (this.f14871d) {
                    f(this.f14869b);
                }
            } catch (Throwable th) {
                r6.i();
                throw th;
            }
        }
    }

    public static AbstractRunnableC1370b b(UUID uuid, E e6) {
        return new a(e6, uuid);
    }

    public static AbstractRunnableC1370b c(String str, E e6, boolean z6) {
        return new C0199b(e6, str, z6);
    }

    public void a(E e6, String str) {
        e(e6.r(), str);
        e6.o().p(str);
        Iterator it = e6.p().iterator();
        while (it.hasNext()) {
            ((X2.t) it.next()).e(str);
        }
    }

    public W2.n d() {
        return this.f14866a;
    }

    public final void e(WorkDatabase workDatabase, String str) {
        f3.v J6 = workDatabase.J();
        InterfaceC1292b E6 = workDatabase.E();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            W2.u m6 = J6.m(str2);
            if (m6 != W2.u.SUCCEEDED && m6 != W2.u.FAILED) {
                J6.p(W2.u.CANCELLED, str2);
            }
            linkedList.addAll(E6.b(str2));
        }
    }

    public void f(E e6) {
        X2.u.b(e6.k(), e6.r(), e6.p());
    }

    public abstract void g();

    @Override // java.lang.Runnable
    public void run() {
        try {
            g();
            this.f14866a.a(W2.n.f5585a);
        } catch (Throwable th) {
            this.f14866a.a(new n.b.a(th));
        }
    }
}
