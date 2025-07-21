package H2;

import H2.AbstractC0411l;
import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: H2.p, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C0415p extends AbstractC0411l {

    /* renamed from: K, reason: collision with root package name */
    public int f2178K;

    /* renamed from: I, reason: collision with root package name */
    public ArrayList f2176I = new ArrayList();

    /* renamed from: J, reason: collision with root package name */
    public boolean f2177J = true;

    /* renamed from: L, reason: collision with root package name */
    public boolean f2179L = false;

    /* renamed from: M, reason: collision with root package name */
    public int f2180M = 0;

    /* renamed from: H2.p$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a extends AbstractC0412m {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AbstractC0411l f2181a;

        public a(AbstractC0411l abstractC0411l) {
            this.f2181a = abstractC0411l;
        }

        @Override // H2.AbstractC0411l.f
        public void b(AbstractC0411l abstractC0411l) {
            this.f2181a.U();
            abstractC0411l.Q(this);
        }
    }

    /* renamed from: H2.p$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b extends AbstractC0412m {

        /* renamed from: a, reason: collision with root package name */
        public C0415p f2183a;

        public b(C0415p c0415p) {
            this.f2183a = c0415p;
        }

        @Override // H2.AbstractC0411l.f
        public void b(AbstractC0411l abstractC0411l) {
            C0415p c0415p = this.f2183a;
            int i6 = c0415p.f2178K - 1;
            c0415p.f2178K = i6;
            if (i6 == 0) {
                c0415p.f2179L = false;
                c0415p.q();
            }
            abstractC0411l.Q(this);
        }

        @Override // H2.AbstractC0412m, H2.AbstractC0411l.f
        public void d(AbstractC0411l abstractC0411l) {
            C0415p c0415p = this.f2183a;
            if (c0415p.f2179L) {
                return;
            }
            c0415p.b0();
            this.f2183a.f2179L = true;
        }
    }

    @Override // H2.AbstractC0411l
    public void O(View view) {
        super.O(view);
        int size = this.f2176I.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((AbstractC0411l) this.f2176I.get(i6)).O(view);
        }
    }

    @Override // H2.AbstractC0411l
    public void S(View view) {
        super.S(view);
        int size = this.f2176I.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((AbstractC0411l) this.f2176I.get(i6)).S(view);
        }
    }

    @Override // H2.AbstractC0411l
    public void U() {
        if (this.f2176I.isEmpty()) {
            b0();
            q();
            return;
        }
        p0();
        if (this.f2177J) {
            Iterator it = this.f2176I.iterator();
            while (it.hasNext()) {
                ((AbstractC0411l) it.next()).U();
            }
            return;
        }
        for (int i6 = 1; i6 < this.f2176I.size(); i6++) {
            ((AbstractC0411l) this.f2176I.get(i6 - 1)).a(new a((AbstractC0411l) this.f2176I.get(i6)));
        }
        AbstractC0411l abstractC0411l = (AbstractC0411l) this.f2176I.get(0);
        if (abstractC0411l != null) {
            abstractC0411l.U();
        }
    }

    @Override // H2.AbstractC0411l
    public void W(AbstractC0411l.e eVar) {
        super.W(eVar);
        this.f2180M |= 8;
        int size = this.f2176I.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((AbstractC0411l) this.f2176I.get(i6)).W(eVar);
        }
    }

    @Override // H2.AbstractC0411l
    public void Y(AbstractC0406g abstractC0406g) {
        super.Y(abstractC0406g);
        this.f2180M |= 4;
        if (this.f2176I != null) {
            for (int i6 = 0; i6 < this.f2176I.size(); i6++) {
                ((AbstractC0411l) this.f2176I.get(i6)).Y(abstractC0406g);
            }
        }
    }

    @Override // H2.AbstractC0411l
    public void Z(AbstractC0414o abstractC0414o) {
        super.Z(abstractC0414o);
        this.f2180M |= 2;
        int size = this.f2176I.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((AbstractC0411l) this.f2176I.get(i6)).Z(abstractC0414o);
        }
    }

    @Override // H2.AbstractC0411l
    public String c0(String str) {
        String c02 = super.c0(str);
        for (int i6 = 0; i6 < this.f2176I.size(); i6++) {
            StringBuilder sb = new StringBuilder();
            sb.append(c02);
            sb.append("\n");
            sb.append(((AbstractC0411l) this.f2176I.get(i6)).c0(str + "  "));
            c02 = sb.toString();
        }
        return c02;
    }

    @Override // H2.AbstractC0411l
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public C0415p a(AbstractC0411l.f fVar) {
        return (C0415p) super.a(fVar);
    }

    @Override // H2.AbstractC0411l
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public C0415p b(View view) {
        for (int i6 = 0; i6 < this.f2176I.size(); i6++) {
            ((AbstractC0411l) this.f2176I.get(i6)).b(view);
        }
        return (C0415p) super.b(view);
    }

    public C0415p f0(AbstractC0411l abstractC0411l) {
        g0(abstractC0411l);
        long j6 = this.f2137c;
        if (j6 >= 0) {
            abstractC0411l.V(j6);
        }
        if ((this.f2180M & 1) != 0) {
            abstractC0411l.X(t());
        }
        if ((this.f2180M & 2) != 0) {
            x();
            abstractC0411l.Z(null);
        }
        if ((this.f2180M & 4) != 0) {
            abstractC0411l.Y(w());
        }
        if ((this.f2180M & 8) != 0) {
            abstractC0411l.W(s());
        }
        return this;
    }

    @Override // H2.AbstractC0411l
    public void g() {
        super.g();
        int size = this.f2176I.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((AbstractC0411l) this.f2176I.get(i6)).g();
        }
    }

    public final void g0(AbstractC0411l abstractC0411l) {
        this.f2176I.add(abstractC0411l);
        abstractC0411l.f2152r = this;
    }

    @Override // H2.AbstractC0411l
    public void h(s sVar) {
        if (H(sVar.f2188b)) {
            Iterator it = this.f2176I.iterator();
            while (it.hasNext()) {
                AbstractC0411l abstractC0411l = (AbstractC0411l) it.next();
                if (abstractC0411l.H(sVar.f2188b)) {
                    abstractC0411l.h(sVar);
                    sVar.f2189c.add(abstractC0411l);
                }
            }
        }
    }

    public AbstractC0411l h0(int i6) {
        if (i6 < 0 || i6 >= this.f2176I.size()) {
            return null;
        }
        return (AbstractC0411l) this.f2176I.get(i6);
    }

    public int i0() {
        return this.f2176I.size();
    }

    @Override // H2.AbstractC0411l
    public void j(s sVar) {
        super.j(sVar);
        int size = this.f2176I.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((AbstractC0411l) this.f2176I.get(i6)).j(sVar);
        }
    }

    @Override // H2.AbstractC0411l
    /* renamed from: j0, reason: merged with bridge method [inline-methods] */
    public C0415p Q(AbstractC0411l.f fVar) {
        return (C0415p) super.Q(fVar);
    }

    @Override // H2.AbstractC0411l
    public void k(s sVar) {
        if (H(sVar.f2188b)) {
            Iterator it = this.f2176I.iterator();
            while (it.hasNext()) {
                AbstractC0411l abstractC0411l = (AbstractC0411l) it.next();
                if (abstractC0411l.H(sVar.f2188b)) {
                    abstractC0411l.k(sVar);
                    sVar.f2189c.add(abstractC0411l);
                }
            }
        }
    }

    @Override // H2.AbstractC0411l
    /* renamed from: k0, reason: merged with bridge method [inline-methods] */
    public C0415p R(View view) {
        for (int i6 = 0; i6 < this.f2176I.size(); i6++) {
            ((AbstractC0411l) this.f2176I.get(i6)).R(view);
        }
        return (C0415p) super.R(view);
    }

    @Override // H2.AbstractC0411l
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public C0415p V(long j6) {
        ArrayList arrayList;
        super.V(j6);
        if (this.f2137c >= 0 && (arrayList = this.f2176I) != null) {
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                ((AbstractC0411l) this.f2176I.get(i6)).V(j6);
            }
        }
        return this;
    }

    @Override // H2.AbstractC0411l
    /* renamed from: m0, reason: merged with bridge method [inline-methods] */
    public C0415p X(TimeInterpolator timeInterpolator) {
        this.f2180M |= 1;
        ArrayList arrayList = this.f2176I;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                ((AbstractC0411l) this.f2176I.get(i6)).X(timeInterpolator);
            }
        }
        return (C0415p) super.X(timeInterpolator);
    }

    @Override // H2.AbstractC0411l
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public AbstractC0411l clone() {
        C0415p c0415p = (C0415p) super.clone();
        c0415p.f2176I = new ArrayList();
        int size = this.f2176I.size();
        for (int i6 = 0; i6 < size; i6++) {
            c0415p.g0(((AbstractC0411l) this.f2176I.get(i6)).clone());
        }
        return c0415p;
    }

    public C0415p n0(int i6) {
        if (i6 == 0) {
            this.f2177J = true;
            return this;
        }
        if (i6 == 1) {
            this.f2177J = false;
            return this;
        }
        throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i6);
    }

    @Override // H2.AbstractC0411l
    /* renamed from: o0, reason: merged with bridge method [inline-methods] */
    public C0415p a0(long j6) {
        return (C0415p) super.a0(j6);
    }

    @Override // H2.AbstractC0411l
    public void p(ViewGroup viewGroup, t tVar, t tVar2, ArrayList arrayList, ArrayList arrayList2) {
        long z6 = z();
        int size = this.f2176I.size();
        for (int i6 = 0; i6 < size; i6++) {
            AbstractC0411l abstractC0411l = (AbstractC0411l) this.f2176I.get(i6);
            if (z6 > 0 && (this.f2177J || i6 == 0)) {
                long z7 = abstractC0411l.z();
                if (z7 > 0) {
                    abstractC0411l.a0(z7 + z6);
                } else {
                    abstractC0411l.a0(z6);
                }
            }
            abstractC0411l.p(viewGroup, tVar, tVar2, arrayList, arrayList2);
        }
    }

    public final void p0() {
        b bVar = new b(this);
        Iterator it = this.f2176I.iterator();
        while (it.hasNext()) {
            ((AbstractC0411l) it.next()).a(bVar);
        }
        this.f2178K = this.f2176I.size();
    }
}
