package j5;

import a5.m;
import a5.o;
import a5.r;
import a5.t;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import e5.C1273c;
import e5.C1276f;
import java.util.Map;
import kotlin.io.ConstantsKt;
import n5.l;

/* renamed from: j5.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC1652a implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public int f16204a;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f16208e;

    /* renamed from: f, reason: collision with root package name */
    public int f16209f;

    /* renamed from: g, reason: collision with root package name */
    public Drawable f16210g;

    /* renamed from: h, reason: collision with root package name */
    public int f16211h;

    /* renamed from: m, reason: collision with root package name */
    public boolean f16216m;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f16218o;

    /* renamed from: p, reason: collision with root package name */
    public int f16219p;

    /* renamed from: t, reason: collision with root package name */
    public boolean f16223t;

    /* renamed from: u, reason: collision with root package name */
    public Resources.Theme f16224u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f16225v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f16226w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f16227x;

    /* renamed from: z, reason: collision with root package name */
    public boolean f16229z;

    /* renamed from: b, reason: collision with root package name */
    public float f16205b = 1.0f;

    /* renamed from: c, reason: collision with root package name */
    public T4.j f16206c = T4.j.f5022e;

    /* renamed from: d, reason: collision with root package name */
    public com.bumptech.glide.g f16207d = com.bumptech.glide.g.NORMAL;

    /* renamed from: i, reason: collision with root package name */
    public boolean f16212i = true;

    /* renamed from: j, reason: collision with root package name */
    public int f16213j = -1;

    /* renamed from: k, reason: collision with root package name */
    public int f16214k = -1;

    /* renamed from: l, reason: collision with root package name */
    public R4.f f16215l = m5.a.c();

    /* renamed from: n, reason: collision with root package name */
    public boolean f16217n = true;

    /* renamed from: q, reason: collision with root package name */
    public R4.h f16220q = new R4.h();

    /* renamed from: r, reason: collision with root package name */
    public Map f16221r = new n5.b();

    /* renamed from: s, reason: collision with root package name */
    public Class f16222s = Object.class;

    /* renamed from: y, reason: collision with root package name */
    public boolean f16228y = true;

    public static boolean G(int i6, int i7) {
        return (i6 & i7) != 0;
    }

    public final boolean A() {
        return this.f16225v;
    }

    public final boolean B(AbstractC1652a abstractC1652a) {
        return Float.compare(abstractC1652a.f16205b, this.f16205b) == 0 && this.f16209f == abstractC1652a.f16209f && l.e(this.f16208e, abstractC1652a.f16208e) && this.f16211h == abstractC1652a.f16211h && l.e(this.f16210g, abstractC1652a.f16210g) && this.f16219p == abstractC1652a.f16219p && l.e(this.f16218o, abstractC1652a.f16218o) && this.f16212i == abstractC1652a.f16212i && this.f16213j == abstractC1652a.f16213j && this.f16214k == abstractC1652a.f16214k && this.f16216m == abstractC1652a.f16216m && this.f16217n == abstractC1652a.f16217n && this.f16226w == abstractC1652a.f16226w && this.f16227x == abstractC1652a.f16227x && this.f16206c.equals(abstractC1652a.f16206c) && this.f16207d == abstractC1652a.f16207d && this.f16220q.equals(abstractC1652a.f16220q) && this.f16221r.equals(abstractC1652a.f16221r) && this.f16222s.equals(abstractC1652a.f16222s) && l.e(this.f16215l, abstractC1652a.f16215l) && l.e(this.f16224u, abstractC1652a.f16224u);
    }

    public final boolean C() {
        return this.f16212i;
    }

    public final boolean D() {
        return F(8);
    }

    public boolean E() {
        return this.f16228y;
    }

    public final boolean F(int i6) {
        return G(this.f16204a, i6);
    }

    public final boolean H() {
        return this.f16217n;
    }

    public final boolean I() {
        return this.f16216m;
    }

    public final boolean J() {
        return F(2048);
    }

    public final boolean K() {
        return l.u(this.f16214k, this.f16213j);
    }

    public AbstractC1652a L() {
        this.f16223t = true;
        return V();
    }

    public AbstractC1652a M(boolean z6) {
        if (this.f16225v) {
            return clone().M(z6);
        }
        this.f16227x = z6;
        this.f16204a |= 524288;
        return W();
    }

    public AbstractC1652a N() {
        return R(o.f7758e, new a5.l());
    }

    public AbstractC1652a O() {
        return Q(o.f7757d, new m());
    }

    public AbstractC1652a P() {
        return Q(o.f7756c, new t());
    }

    public final AbstractC1652a Q(o oVar, R4.l lVar) {
        return U(oVar, lVar, false);
    }

    public final AbstractC1652a R(o oVar, R4.l lVar) {
        if (this.f16225v) {
            return clone().R(oVar, lVar);
        }
        g(oVar);
        return c0(lVar, false);
    }

    public AbstractC1652a S(int i6, int i7) {
        if (this.f16225v) {
            return clone().S(i6, i7);
        }
        this.f16214k = i6;
        this.f16213j = i7;
        this.f16204a |= ConstantsKt.MINIMUM_BLOCK_SIZE;
        return W();
    }

    public AbstractC1652a T(com.bumptech.glide.g gVar) {
        if (this.f16225v) {
            return clone().T(gVar);
        }
        this.f16207d = (com.bumptech.glide.g) n5.k.d(gVar);
        this.f16204a |= 8;
        return W();
    }

    public final AbstractC1652a U(o oVar, R4.l lVar, boolean z6) {
        AbstractC1652a d02 = z6 ? d0(oVar, lVar) : R(oVar, lVar);
        d02.f16228y = true;
        return d02;
    }

    public final AbstractC1652a V() {
        return this;
    }

    public final AbstractC1652a W() {
        if (this.f16223t) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        return V();
    }

    public AbstractC1652a X(R4.g gVar, Object obj) {
        if (this.f16225v) {
            return clone().X(gVar, obj);
        }
        n5.k.d(gVar);
        n5.k.d(obj);
        this.f16220q.e(gVar, obj);
        return W();
    }

    public AbstractC1652a Y(R4.f fVar) {
        if (this.f16225v) {
            return clone().Y(fVar);
        }
        this.f16215l = (R4.f) n5.k.d(fVar);
        this.f16204a |= 1024;
        return W();
    }

    public AbstractC1652a Z(float f6) {
        if (this.f16225v) {
            return clone().Z(f6);
        }
        if (f6 < 0.0f || f6 > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f16205b = f6;
        this.f16204a |= 2;
        return W();
    }

    public AbstractC1652a a(AbstractC1652a abstractC1652a) {
        if (this.f16225v) {
            return clone().a(abstractC1652a);
        }
        if (G(abstractC1652a.f16204a, 2)) {
            this.f16205b = abstractC1652a.f16205b;
        }
        if (G(abstractC1652a.f16204a, 262144)) {
            this.f16226w = abstractC1652a.f16226w;
        }
        if (G(abstractC1652a.f16204a, 1048576)) {
            this.f16229z = abstractC1652a.f16229z;
        }
        if (G(abstractC1652a.f16204a, 4)) {
            this.f16206c = abstractC1652a.f16206c;
        }
        if (G(abstractC1652a.f16204a, 8)) {
            this.f16207d = abstractC1652a.f16207d;
        }
        if (G(abstractC1652a.f16204a, 16)) {
            this.f16208e = abstractC1652a.f16208e;
            this.f16209f = 0;
            this.f16204a &= -33;
        }
        if (G(abstractC1652a.f16204a, 32)) {
            this.f16209f = abstractC1652a.f16209f;
            this.f16208e = null;
            this.f16204a &= -17;
        }
        if (G(abstractC1652a.f16204a, 64)) {
            this.f16210g = abstractC1652a.f16210g;
            this.f16211h = 0;
            this.f16204a &= -129;
        }
        if (G(abstractC1652a.f16204a, 128)) {
            this.f16211h = abstractC1652a.f16211h;
            this.f16210g = null;
            this.f16204a &= -65;
        }
        if (G(abstractC1652a.f16204a, 256)) {
            this.f16212i = abstractC1652a.f16212i;
        }
        if (G(abstractC1652a.f16204a, ConstantsKt.MINIMUM_BLOCK_SIZE)) {
            this.f16214k = abstractC1652a.f16214k;
            this.f16213j = abstractC1652a.f16213j;
        }
        if (G(abstractC1652a.f16204a, 1024)) {
            this.f16215l = abstractC1652a.f16215l;
        }
        if (G(abstractC1652a.f16204a, ConstantsKt.DEFAULT_BLOCK_SIZE)) {
            this.f16222s = abstractC1652a.f16222s;
        }
        if (G(abstractC1652a.f16204a, ConstantsKt.DEFAULT_BUFFER_SIZE)) {
            this.f16218o = abstractC1652a.f16218o;
            this.f16219p = 0;
            this.f16204a &= -16385;
        }
        if (G(abstractC1652a.f16204a, 16384)) {
            this.f16219p = abstractC1652a.f16219p;
            this.f16218o = null;
            this.f16204a &= -8193;
        }
        if (G(abstractC1652a.f16204a, 32768)) {
            this.f16224u = abstractC1652a.f16224u;
        }
        if (G(abstractC1652a.f16204a, 65536)) {
            this.f16217n = abstractC1652a.f16217n;
        }
        if (G(abstractC1652a.f16204a, 131072)) {
            this.f16216m = abstractC1652a.f16216m;
        }
        if (G(abstractC1652a.f16204a, 2048)) {
            this.f16221r.putAll(abstractC1652a.f16221r);
            this.f16228y = abstractC1652a.f16228y;
        }
        if (G(abstractC1652a.f16204a, 524288)) {
            this.f16227x = abstractC1652a.f16227x;
        }
        if (!this.f16217n) {
            this.f16221r.clear();
            int i6 = this.f16204a;
            this.f16216m = false;
            this.f16204a = i6 & (-133121);
            this.f16228y = true;
        }
        this.f16204a |= abstractC1652a.f16204a;
        this.f16220q.d(abstractC1652a.f16220q);
        return W();
    }

    public AbstractC1652a a0(boolean z6) {
        if (this.f16225v) {
            return clone().a0(true);
        }
        this.f16212i = !z6;
        this.f16204a |= 256;
        return W();
    }

    public AbstractC1652a b() {
        if (this.f16223t && !this.f16225v) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.f16225v = true;
        return L();
    }

    public AbstractC1652a b0(R4.l lVar) {
        return c0(lVar, true);
    }

    public AbstractC1652a c0(R4.l lVar, boolean z6) {
        if (this.f16225v) {
            return clone().c0(lVar, z6);
        }
        r rVar = new r(lVar, z6);
        e0(Bitmap.class, lVar, z6);
        e0(Drawable.class, rVar, z6);
        e0(BitmapDrawable.class, rVar.c(), z6);
        e0(C1273c.class, new C1276f(lVar), z6);
        return W();
    }

    @Override // 
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public AbstractC1652a clone() {
        try {
            AbstractC1652a abstractC1652a = (AbstractC1652a) super.clone();
            R4.h hVar = new R4.h();
            abstractC1652a.f16220q = hVar;
            hVar.d(this.f16220q);
            n5.b bVar = new n5.b();
            abstractC1652a.f16221r = bVar;
            bVar.putAll(this.f16221r);
            abstractC1652a.f16223t = false;
            abstractC1652a.f16225v = false;
            return abstractC1652a;
        } catch (CloneNotSupportedException e6) {
            throw new RuntimeException(e6);
        }
    }

    public final AbstractC1652a d0(o oVar, R4.l lVar) {
        if (this.f16225v) {
            return clone().d0(oVar, lVar);
        }
        g(oVar);
        return b0(lVar);
    }

    public AbstractC1652a e(Class cls) {
        if (this.f16225v) {
            return clone().e(cls);
        }
        this.f16222s = (Class) n5.k.d(cls);
        this.f16204a |= ConstantsKt.DEFAULT_BLOCK_SIZE;
        return W();
    }

    public AbstractC1652a e0(Class cls, R4.l lVar, boolean z6) {
        if (this.f16225v) {
            return clone().e0(cls, lVar, z6);
        }
        n5.k.d(cls);
        n5.k.d(lVar);
        this.f16221r.put(cls, lVar);
        int i6 = this.f16204a;
        this.f16217n = true;
        this.f16204a = 67584 | i6;
        this.f16228y = false;
        if (z6) {
            this.f16204a = i6 | 198656;
            this.f16216m = true;
        }
        return W();
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC1652a) {
            return B((AbstractC1652a) obj);
        }
        return false;
    }

    public AbstractC1652a f(T4.j jVar) {
        if (this.f16225v) {
            return clone().f(jVar);
        }
        this.f16206c = (T4.j) n5.k.d(jVar);
        this.f16204a |= 4;
        return W();
    }

    public AbstractC1652a f0(boolean z6) {
        if (this.f16225v) {
            return clone().f0(z6);
        }
        this.f16229z = z6;
        this.f16204a |= 1048576;
        return W();
    }

    public AbstractC1652a g(o oVar) {
        return X(o.f7761h, n5.k.d(oVar));
    }

    public final T4.j h() {
        return this.f16206c;
    }

    public int hashCode() {
        return l.p(this.f16224u, l.p(this.f16215l, l.p(this.f16222s, l.p(this.f16221r, l.p(this.f16220q, l.p(this.f16207d, l.p(this.f16206c, l.q(this.f16227x, l.q(this.f16226w, l.q(this.f16217n, l.q(this.f16216m, l.o(this.f16214k, l.o(this.f16213j, l.q(this.f16212i, l.p(this.f16218o, l.o(this.f16219p, l.p(this.f16210g, l.o(this.f16211h, l.p(this.f16208e, l.o(this.f16209f, l.m(this.f16205b)))))))))))))))))))));
    }

    public final int i() {
        return this.f16209f;
    }

    public final Drawable j() {
        return this.f16208e;
    }

    public final Drawable k() {
        return this.f16218o;
    }

    public final int l() {
        return this.f16219p;
    }

    public final boolean m() {
        return this.f16227x;
    }

    public final R4.h n() {
        return this.f16220q;
    }

    public final int o() {
        return this.f16213j;
    }

    public final int p() {
        return this.f16214k;
    }

    public final Drawable q() {
        return this.f16210g;
    }

    public final int r() {
        return this.f16211h;
    }

    public final com.bumptech.glide.g s() {
        return this.f16207d;
    }

    public final Class t() {
        return this.f16222s;
    }

    public final R4.f u() {
        return this.f16215l;
    }

    public final float v() {
        return this.f16205b;
    }

    public final Resources.Theme w() {
        return this.f16224u;
    }

    public final Map x() {
        return this.f16221r;
    }

    public final boolean y() {
        return this.f16229z;
    }

    public final boolean z() {
        return this.f16226w;
    }
}
