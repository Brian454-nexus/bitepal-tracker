package g1;

import Z0.C0829a;
import Z0.G;
import c1.AbstractC1117K;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import w1.AbstractC2237w;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class I0 extends AbstractC1320a {

    /* renamed from: h, reason: collision with root package name */
    public final int f14365h;

    /* renamed from: i, reason: collision with root package name */
    public final int f14366i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f14367j;

    /* renamed from: k, reason: collision with root package name */
    public final int[] f14368k;

    /* renamed from: l, reason: collision with root package name */
    public final Z0.G[] f14369l;

    /* renamed from: m, reason: collision with root package name */
    public final Object[] f14370m;

    /* renamed from: n, reason: collision with root package name */
    public final HashMap f14371n;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a extends AbstractC2237w {

        /* renamed from: f, reason: collision with root package name */
        public final G.c f14372f;

        public a(Z0.G g6) {
            super(g6);
            this.f14372f = new G.c();
        }

        @Override // w1.AbstractC2237w, Z0.G
        public G.b g(int i6, G.b bVar, boolean z6) {
            G.b g6 = super.g(i6, bVar, z6);
            if (super.n(g6.f6663c, this.f14372f).f()) {
                g6.t(bVar.f6661a, bVar.f6662b, bVar.f6663c, bVar.f6664d, bVar.f6665e, C0829a.f6828g, true);
                return g6;
            }
            g6.f6666f = true;
            return g6;
        }
    }

    public I0(Collection collection, w1.d0 d0Var) {
        this(G(collection), H(collection), d0Var);
    }

    public static Z0.G[] G(Collection collection) {
        Z0.G[] gArr = new Z0.G[collection.size()];
        Iterator it = collection.iterator();
        int i6 = 0;
        while (it.hasNext()) {
            gArr[i6] = ((InterfaceC1354r0) it.next()).b();
            i6++;
        }
        return gArr;
    }

    public static Object[] H(Collection collection) {
        Object[] objArr = new Object[collection.size()];
        Iterator it = collection.iterator();
        int i6 = 0;
        while (it.hasNext()) {
            objArr[i6] = ((InterfaceC1354r0) it.next()).a();
            i6++;
        }
        return objArr;
    }

    @Override // g1.AbstractC1320a
    public int A(int i6) {
        return this.f14368k[i6];
    }

    @Override // g1.AbstractC1320a
    public Z0.G D(int i6) {
        return this.f14369l[i6];
    }

    public I0 E(w1.d0 d0Var) {
        Z0.G[] gArr = new Z0.G[this.f14369l.length];
        int i6 = 0;
        while (true) {
            Z0.G[] gArr2 = this.f14369l;
            if (i6 >= gArr2.length) {
                return new I0(gArr, this.f14370m, d0Var);
            }
            gArr[i6] = new a(gArr2[i6]);
            i6++;
        }
    }

    public List F() {
        return Arrays.asList(this.f14369l);
    }

    @Override // Z0.G
    public int i() {
        return this.f14366i;
    }

    @Override // Z0.G
    public int p() {
        return this.f14365h;
    }

    @Override // g1.AbstractC1320a
    public int s(Object obj) {
        Integer num = (Integer) this.f14371n.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // g1.AbstractC1320a
    public int t(int i6) {
        return AbstractC1117K.g(this.f14367j, i6 + 1, false, false);
    }

    @Override // g1.AbstractC1320a
    public int u(int i6) {
        return AbstractC1117K.g(this.f14368k, i6 + 1, false, false);
    }

    @Override // g1.AbstractC1320a
    public Object x(int i6) {
        return this.f14370m[i6];
    }

    @Override // g1.AbstractC1320a
    public int z(int i6) {
        return this.f14367j[i6];
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I0(Z0.G[] gArr, Object[] objArr, w1.d0 d0Var) {
        super(false, d0Var);
        int i6 = 0;
        int length = gArr.length;
        this.f14369l = gArr;
        this.f14367j = new int[length];
        this.f14368k = new int[length];
        this.f14370m = objArr;
        this.f14371n = new HashMap();
        int length2 = gArr.length;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i6 < length2) {
            Z0.G g6 = gArr[i6];
            this.f14369l[i9] = g6;
            this.f14368k[i9] = i7;
            this.f14367j[i9] = i8;
            i7 += g6.p();
            i8 += this.f14369l[i9].i();
            this.f14371n.put(objArr[i9], Integer.valueOf(i9));
            i6++;
            i9++;
        }
        this.f14365h = i7;
        this.f14366i = i8;
    }
}
