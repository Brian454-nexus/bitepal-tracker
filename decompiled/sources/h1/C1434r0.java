package h1;

import Z0.G;
import android.util.Base64;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import h1.InterfaceC1402b;
import h1.u1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import kotlin.jvm.internal.LongCompanionObject;
import w1.InterfaceC2212D;

/* renamed from: h1.r0, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1434r0 implements u1 {

    /* renamed from: i, reason: collision with root package name */
    public static final y6.u f15150i = new y6.u() { // from class: h1.q0
        public final Object get() {
            String m6;
            m6 = C1434r0.m();
            return m6;
        }
    };

    /* renamed from: j, reason: collision with root package name */
    public static final Random f15151j = new Random();

    /* renamed from: a, reason: collision with root package name */
    public final G.c f15152a;

    /* renamed from: b, reason: collision with root package name */
    public final G.b f15153b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f15154c;

    /* renamed from: d, reason: collision with root package name */
    public final y6.u f15155d;

    /* renamed from: e, reason: collision with root package name */
    public u1.a f15156e;

    /* renamed from: f, reason: collision with root package name */
    public Z0.G f15157f;

    /* renamed from: g, reason: collision with root package name */
    public String f15158g;

    /* renamed from: h, reason: collision with root package name */
    public long f15159h;

    /* renamed from: h1.r0$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f15160a;

        /* renamed from: b, reason: collision with root package name */
        public int f15161b;

        /* renamed from: c, reason: collision with root package name */
        public long f15162c;

        /* renamed from: d, reason: collision with root package name */
        public InterfaceC2212D.b f15163d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f15164e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f15165f;

        public a(String str, int i6, InterfaceC2212D.b bVar) {
            this.f15160a = str;
            this.f15161b = i6;
            this.f15162c = bVar == null ? -1L : bVar.f19756d;
            if (bVar == null || !bVar.b()) {
                return;
            }
            this.f15163d = bVar;
        }

        public boolean i(int i6, InterfaceC2212D.b bVar) {
            if (bVar == null) {
                return i6 == this.f15161b;
            }
            InterfaceC2212D.b bVar2 = this.f15163d;
            return bVar2 == null ? !bVar.b() && bVar.f19756d == this.f15162c : bVar.f19756d == bVar2.f19756d && bVar.f19754b == bVar2.f19754b && bVar.f19755c == bVar2.f19755c;
        }

        public boolean j(InterfaceC1402b.a aVar) {
            InterfaceC2212D.b bVar = aVar.f15062d;
            if (bVar == null) {
                return this.f15161b != aVar.f15061c;
            }
            long j6 = this.f15162c;
            if (j6 == -1) {
                return false;
            }
            if (bVar.f19756d > j6) {
                return true;
            }
            if (this.f15163d == null) {
                return false;
            }
            int b6 = aVar.f15060b.b(bVar.f19753a);
            int b7 = aVar.f15060b.b(this.f15163d.f19753a);
            InterfaceC2212D.b bVar2 = aVar.f15062d;
            if (bVar2.f19756d < this.f15163d.f19756d || b6 < b7) {
                return false;
            }
            if (b6 > b7) {
                return true;
            }
            if (!bVar2.b()) {
                int i6 = aVar.f15062d.f19757e;
                return i6 == -1 || i6 > this.f15163d.f19754b;
            }
            InterfaceC2212D.b bVar3 = aVar.f15062d;
            int i7 = bVar3.f19754b;
            int i8 = bVar3.f19755c;
            InterfaceC2212D.b bVar4 = this.f15163d;
            int i9 = bVar4.f19754b;
            return i7 > i9 || (i7 == i9 && i8 > bVar4.f19755c);
        }

        public void k(int i6, InterfaceC2212D.b bVar) {
            if (this.f15162c != -1 || i6 != this.f15161b || bVar == null || bVar.f19756d < C1434r0.this.n()) {
                return;
            }
            this.f15162c = bVar.f19756d;
        }

        public final int l(Z0.G g6, Z0.G g7, int i6) {
            if (i6 >= g6.p()) {
                if (i6 < g7.p()) {
                    return i6;
                }
                return -1;
            }
            g6.n(i6, C1434r0.this.f15152a);
            for (int i7 = C1434r0.this.f15152a.f6697n; i7 <= C1434r0.this.f15152a.f6698o; i7++) {
                int b6 = g7.b(g6.m(i7));
                if (b6 != -1) {
                    return g7.f(b6, C1434r0.this.f15153b).f6663c;
                }
            }
            return -1;
        }

        public boolean m(Z0.G g6, Z0.G g7) {
            int l6 = l(g6, g7, this.f15161b);
            this.f15161b = l6;
            if (l6 == -1) {
                return false;
            }
            InterfaceC2212D.b bVar = this.f15163d;
            return bVar == null || g7.b(bVar.f19753a) != -1;
        }
    }

    public C1434r0() {
        this(f15150i);
    }

    public static String m() {
        byte[] bArr = new byte[12];
        f15151j.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    @Override // h1.u1
    public synchronized String a() {
        return this.f15158g;
    }

    @Override // h1.u1
    public synchronized void b(InterfaceC1402b.a aVar, int i6) {
        try {
            AbstractC1119a.e(this.f15156e);
            boolean z6 = i6 == 0;
            Iterator it = this.f15154c.values().iterator();
            while (it.hasNext()) {
                a aVar2 = (a) it.next();
                if (aVar2.j(aVar)) {
                    it.remove();
                    if (aVar2.f15164e) {
                        boolean equals = aVar2.f15160a.equals(this.f15158g);
                        boolean z7 = z6 && equals && aVar2.f15165f;
                        if (equals) {
                            l(aVar2);
                        }
                        this.f15156e.l(aVar, aVar2.f15160a, z7);
                    }
                }
            }
            p(aVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // h1.u1
    public synchronized void c(InterfaceC1402b.a aVar) {
        AbstractC1119a.e(this.f15156e);
        if (aVar.f15060b.q()) {
            return;
        }
        InterfaceC2212D.b bVar = aVar.f15062d;
        if (bVar != null) {
            if (bVar.f19756d < n()) {
                return;
            }
            a aVar2 = (a) this.f15154c.get(this.f15158g);
            if (aVar2 != null && aVar2.f15162c == -1 && aVar2.f15161b != aVar.f15061c) {
                return;
            }
        }
        a o6 = o(aVar.f15061c, aVar.f15062d);
        if (this.f15158g == null) {
            this.f15158g = o6.f15160a;
        }
        InterfaceC2212D.b bVar2 = aVar.f15062d;
        if (bVar2 != null && bVar2.b()) {
            InterfaceC2212D.b bVar3 = aVar.f15062d;
            InterfaceC2212D.b bVar4 = new InterfaceC2212D.b(bVar3.f19753a, bVar3.f19756d, bVar3.f19754b);
            a o7 = o(aVar.f15061c, bVar4);
            if (!o7.f15164e) {
                o7.f15164e = true;
                aVar.f15060b.h(aVar.f15062d.f19753a, this.f15153b);
                this.f15156e.L(new InterfaceC1402b.a(aVar.f15059a, aVar.f15060b, aVar.f15061c, bVar4, Math.max(0L, AbstractC1117K.k1(this.f15153b.f(aVar.f15062d.f19754b)) + this.f15153b.m()), aVar.f15064f, aVar.f15065g, aVar.f15066h, aVar.f15067i, aVar.f15068j), o7.f15160a);
            }
        }
        if (!o6.f15164e) {
            o6.f15164e = true;
            this.f15156e.L(aVar, o6.f15160a);
        }
        if (o6.f15160a.equals(this.f15158g) && !o6.f15165f) {
            o6.f15165f = true;
            this.f15156e.I(aVar, o6.f15160a);
        }
    }

    @Override // h1.u1
    public synchronized String d(Z0.G g6, InterfaceC2212D.b bVar) {
        return o(g6.h(bVar.f19753a, this.f15153b).f6663c, bVar).f15160a;
    }

    @Override // h1.u1
    public void e(u1.a aVar) {
        this.f15156e = aVar;
    }

    @Override // h1.u1
    public synchronized void f(InterfaceC1402b.a aVar) {
        u1.a aVar2;
        try {
            String str = this.f15158g;
            if (str != null) {
                l((a) AbstractC1119a.e((a) this.f15154c.get(str)));
            }
            Iterator it = this.f15154c.values().iterator();
            while (it.hasNext()) {
                a aVar3 = (a) it.next();
                it.remove();
                if (aVar3.f15164e && (aVar2 = this.f15156e) != null) {
                    aVar2.l(aVar, aVar3.f15160a, false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // h1.u1
    public synchronized void g(InterfaceC1402b.a aVar) {
        try {
            AbstractC1119a.e(this.f15156e);
            Z0.G g6 = this.f15157f;
            this.f15157f = aVar.f15060b;
            Iterator it = this.f15154c.values().iterator();
            while (it.hasNext()) {
                a aVar2 = (a) it.next();
                if (aVar2.m(g6, this.f15157f) && !aVar2.j(aVar)) {
                }
                it.remove();
                if (aVar2.f15164e) {
                    if (aVar2.f15160a.equals(this.f15158g)) {
                        l(aVar2);
                    }
                    this.f15156e.l(aVar, aVar2.f15160a, false);
                }
            }
            p(aVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void l(a aVar) {
        if (aVar.f15162c != -1) {
            this.f15159h = aVar.f15162c;
        }
        this.f15158g = null;
    }

    public final long n() {
        a aVar = (a) this.f15154c.get(this.f15158g);
        return (aVar == null || aVar.f15162c == -1) ? this.f15159h + 1 : aVar.f15162c;
    }

    public final a o(int i6, InterfaceC2212D.b bVar) {
        a aVar = null;
        long j6 = LongCompanionObject.MAX_VALUE;
        for (a aVar2 : this.f15154c.values()) {
            aVar2.k(i6, bVar);
            if (aVar2.i(i6, bVar)) {
                long j7 = aVar2.f15162c;
                if (j7 == -1 || j7 < j6) {
                    aVar = aVar2;
                    j6 = j7;
                } else if (j7 == j6 && ((a) AbstractC1117K.i(aVar)).f15163d != null && aVar2.f15163d != null) {
                    aVar = aVar2;
                }
            }
        }
        if (aVar != null) {
            return aVar;
        }
        String str = (String) this.f15155d.get();
        a aVar3 = new a(str, i6, bVar);
        this.f15154c.put(str, aVar3);
        return aVar3;
    }

    public final void p(InterfaceC1402b.a aVar) {
        if (aVar.f15060b.q()) {
            String str = this.f15158g;
            if (str != null) {
                l((a) AbstractC1119a.e((a) this.f15154c.get(str)));
                return;
            }
            return;
        }
        a aVar2 = (a) this.f15154c.get(this.f15158g);
        a o6 = o(aVar.f15061c, aVar.f15062d);
        this.f15158g = o6.f15160a;
        c(aVar);
        InterfaceC2212D.b bVar = aVar.f15062d;
        if (bVar == null || !bVar.b()) {
            return;
        }
        if (aVar2 != null && aVar2.f15162c == aVar.f15062d.f19756d && aVar2.f15163d != null && aVar2.f15163d.f19754b == aVar.f15062d.f19754b && aVar2.f15163d.f19755c == aVar.f15062d.f19755c) {
            return;
        }
        InterfaceC2212D.b bVar2 = aVar.f15062d;
        this.f15156e.o(aVar, o(aVar.f15061c, new InterfaceC2212D.b(bVar2.f19753a, bVar2.f19756d)).f15160a, o6.f15160a);
    }

    public C1434r0(y6.u uVar) {
        this.f15155d = uVar;
        this.f15152a = new G.c();
        this.f15153b = new G.b();
        this.f15154c = new HashMap();
        this.f15157f = Z0.G.f6652a;
        this.f15159h = -1L;
    }
}
