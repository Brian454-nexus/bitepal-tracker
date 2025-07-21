package c1;

import Z0.p;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: c1.n, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1132n {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1121c f10606a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1129k f10607b;

    /* renamed from: c, reason: collision with root package name */
    public final b f10608c;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArraySet f10609d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayDeque f10610e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f10611f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f10612g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f10613h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f10614i;

    /* renamed from: c1.n$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface a {
        void invoke(Object obj);
    }

    /* renamed from: c1.n$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface b {
        void a(Object obj, Z0.p pVar);
    }

    /* renamed from: c1.n$c */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final Object f10615a;

        /* renamed from: b, reason: collision with root package name */
        public p.b f10616b = new p.b();

        /* renamed from: c, reason: collision with root package name */
        public boolean f10617c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f10618d;

        public c(Object obj) {
            this.f10615a = obj;
        }

        public void a(int i6, a aVar) {
            if (this.f10618d) {
                return;
            }
            if (i6 != -1) {
                this.f10616b.a(i6);
            }
            this.f10617c = true;
            aVar.invoke(this.f10615a);
        }

        public void b(b bVar) {
            if (this.f10618d || !this.f10617c) {
                return;
            }
            Z0.p e6 = this.f10616b.e();
            this.f10616b = new p.b();
            this.f10617c = false;
            bVar.a(this.f10615a, e6);
        }

        public void c(b bVar) {
            this.f10618d = true;
            if (this.f10617c) {
                this.f10617c = false;
                bVar.a(this.f10615a, this.f10616b.e());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.f10615a.equals(((c) obj).f10615a);
        }

        public int hashCode() {
            return this.f10615a.hashCode();
        }
    }

    public C1132n(Looper looper, InterfaceC1121c interfaceC1121c, b bVar) {
        this(new CopyOnWriteArraySet(), looper, interfaceC1121c, bVar, true);
    }

    public static /* synthetic */ void a(CopyOnWriteArraySet copyOnWriteArraySet, int i6, a aVar) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(i6, aVar);
        }
    }

    public void c(Object obj) {
        AbstractC1119a.e(obj);
        synchronized (this.f10612g) {
            try {
                if (this.f10613h) {
                    return;
                }
                this.f10609d.add(new c(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C1132n d(Looper looper, InterfaceC1121c interfaceC1121c, b bVar) {
        return new C1132n(this.f10609d, looper, interfaceC1121c, bVar, this.f10614i);
    }

    public C1132n e(Looper looper, b bVar) {
        return d(looper, this.f10606a, bVar);
    }

    public void f() {
        k();
        if (this.f10611f.isEmpty()) {
            return;
        }
        if (!this.f10607b.e(1)) {
            InterfaceC1129k interfaceC1129k = this.f10607b;
            interfaceC1129k.b(interfaceC1129k.d(1));
        }
        boolean isEmpty = this.f10610e.isEmpty();
        this.f10610e.addAll(this.f10611f);
        this.f10611f.clear();
        if (isEmpty) {
            while (!this.f10610e.isEmpty()) {
                ((Runnable) this.f10610e.peekFirst()).run();
                this.f10610e.removeFirst();
            }
        }
    }

    public final boolean g(Message message) {
        Iterator it = this.f10609d.iterator();
        while (it.hasNext()) {
            ((c) it.next()).b(this.f10608c);
            if (this.f10607b.e(1)) {
                break;
            }
        }
        return true;
    }

    public void h(final int i6, final a aVar) {
        k();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f10609d);
        this.f10611f.add(new Runnable() { // from class: c1.m
            @Override // java.lang.Runnable
            public final void run() {
                C1132n.a(copyOnWriteArraySet, i6, aVar);
            }
        });
    }

    public void i() {
        k();
        synchronized (this.f10612g) {
            this.f10613h = true;
        }
        Iterator it = this.f10609d.iterator();
        while (it.hasNext()) {
            ((c) it.next()).c(this.f10608c);
        }
        this.f10609d.clear();
    }

    public void j(int i6, a aVar) {
        h(i6, aVar);
        f();
    }

    public final void k() {
        if (this.f10614i) {
            AbstractC1119a.g(Thread.currentThread() == this.f10607b.k().getThread());
        }
    }

    public C1132n(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, InterfaceC1121c interfaceC1121c, b bVar, boolean z6) {
        this.f10606a = interfaceC1121c;
        this.f10609d = copyOnWriteArraySet;
        this.f10608c = bVar;
        this.f10612g = new Object();
        this.f10610e = new ArrayDeque();
        this.f10611f = new ArrayDeque();
        this.f10607b = interfaceC1121c.e(looper, new Handler.Callback() { // from class: c1.l
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean g6;
                g6 = C1132n.this.g(message);
                return g6;
            }
        });
        this.f10614i = z6;
    }
}
