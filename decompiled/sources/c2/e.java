package c2;

import b2.k;
import b2.l;
import b2.p;
import b2.q;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c2.e;
import f1.g;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class e implements l {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f10738a = new ArrayDeque();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f10739b;

    /* renamed from: c, reason: collision with root package name */
    public final PriorityQueue f10740c;

    /* renamed from: d, reason: collision with root package name */
    public b f10741d;

    /* renamed from: e, reason: collision with root package name */
    public long f10742e;

    /* renamed from: f, reason: collision with root package name */
    public long f10743f;

    /* renamed from: g, reason: collision with root package name */
    public long f10744g;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends p implements Comparable {

        /* renamed from: k, reason: collision with root package name */
        public long f10745k;

        public b() {
        }

        @Override // java.lang.Comparable
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            if (i() != bVar.i()) {
                return i() ? 1 : -1;
            }
            long j6 = this.f14007f - bVar.f14007f;
            if (j6 == 0) {
                j6 = this.f10745k - bVar.f10745k;
                if (j6 == 0) {
                    return 0;
                }
            }
            return j6 > 0 ? 1 : -1;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c extends q {

        /* renamed from: g, reason: collision with root package name */
        public g.a f10746g;

        public c(g.a aVar) {
            this.f10746g = aVar;
        }

        @Override // f1.g
        public final void n() {
            this.f10746g.a(this);
        }
    }

    public e() {
        for (int i6 = 0; i6 < 10; i6++) {
            this.f10738a.add(new b());
        }
        this.f10739b = new ArrayDeque();
        for (int i7 = 0; i7 < 2; i7++) {
            this.f10739b.add(new c(new g.a() { // from class: c2.d
                @Override // f1.g.a
                public final void a(g gVar) {
                    e.this.p((e.c) gVar);
                }
            }));
        }
        this.f10740c = new PriorityQueue();
        this.f10744g = -9223372036854775807L;
    }

    @Override // f1.d
    public final void b(long j6) {
        this.f10744g = j6;
    }

    @Override // b2.l
    public void c(long j6) {
        this.f10742e = j6;
    }

    @Override // f1.d
    public void flush() {
        this.f10743f = 0L;
        this.f10742e = 0L;
        while (!this.f10740c.isEmpty()) {
            o((b) AbstractC1117K.i((b) this.f10740c.poll()));
        }
        b bVar = this.f10741d;
        if (bVar != null) {
            o(bVar);
            this.f10741d = null;
        }
    }

    public abstract k g();

    public abstract void h(p pVar);

    @Override // f1.d
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public p d() {
        AbstractC1119a.g(this.f10741d == null);
        if (this.f10738a.isEmpty()) {
            return null;
        }
        b bVar = (b) this.f10738a.pollFirst();
        this.f10741d = bVar;
        return bVar;
    }

    @Override // f1.d
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public q a() {
        if (this.f10739b.isEmpty()) {
            return null;
        }
        while (!this.f10740c.isEmpty() && ((b) AbstractC1117K.i((b) this.f10740c.peek())).f14007f <= this.f10742e) {
            b bVar = (b) AbstractC1117K.i((b) this.f10740c.poll());
            if (bVar.i()) {
                q qVar = (q) AbstractC1117K.i((q) this.f10739b.pollFirst());
                qVar.e(4);
                o(bVar);
                return qVar;
            }
            h(bVar);
            if (m()) {
                k g6 = g();
                q qVar2 = (q) AbstractC1117K.i((q) this.f10739b.pollFirst());
                qVar2.o(bVar.f14007f, g6, LongCompanionObject.MAX_VALUE);
                o(bVar);
                return qVar2;
            }
            o(bVar);
        }
        return null;
    }

    public final q k() {
        return (q) this.f10739b.pollFirst();
    }

    public final long l() {
        return this.f10742e;
    }

    public abstract boolean m();

    @Override // f1.d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void f(p pVar) {
        AbstractC1119a.a(pVar == this.f10741d);
        b bVar = (b) pVar;
        long j6 = this.f10744g;
        if (j6 == -9223372036854775807L || bVar.f14007f >= j6) {
            long j7 = this.f10743f;
            this.f10743f = 1 + j7;
            bVar.f10745k = j7;
            this.f10740c.add(bVar);
        } else {
            o(bVar);
        }
        this.f10741d = null;
    }

    public final void o(b bVar) {
        bVar.f();
        this.f10738a.add(bVar);
    }

    public void p(q qVar) {
        qVar.f();
        this.f10739b.add(qVar);
    }

    @Override // f1.d
    public void release() {
    }
}
