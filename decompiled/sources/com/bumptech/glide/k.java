package com.bumptech.glide;

import android.content.Context;
import android.widget.ImageView;
import j5.AbstractC1652a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class k extends AbstractC1652a implements Cloneable {

    /* renamed from: W, reason: collision with root package name */
    public static final j5.h f13208W = (j5.h) ((j5.h) ((j5.h) new j5.h().f(T4.j.f5020c)).T(g.LOW)).a0(true);

    /* renamed from: A, reason: collision with root package name */
    public final Context f13209A;

    /* renamed from: B, reason: collision with root package name */
    public final l f13210B;

    /* renamed from: C, reason: collision with root package name */
    public final Class f13211C;

    /* renamed from: D, reason: collision with root package name */
    public final b f13212D;

    /* renamed from: E, reason: collision with root package name */
    public final d f13213E;

    /* renamed from: F, reason: collision with root package name */
    public m f13214F;

    /* renamed from: G, reason: collision with root package name */
    public Object f13215G;

    /* renamed from: H, reason: collision with root package name */
    public List f13216H;

    /* renamed from: I, reason: collision with root package name */
    public k f13217I;

    /* renamed from: J, reason: collision with root package name */
    public k f13218J;

    /* renamed from: K, reason: collision with root package name */
    public Float f13219K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f13220L = true;

    /* renamed from: M, reason: collision with root package name */
    public boolean f13221M;

    /* renamed from: V, reason: collision with root package name */
    public boolean f13222V;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13223a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f13224b;

        static {
            int[] iArr = new int[g.values().length];
            f13224b = iArr;
            try {
                iArr[g.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13224b[g.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13224b[g.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13224b[g.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f13223a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13223a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13223a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f13223a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f13223a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f13223a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f13223a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f13223a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public k(b bVar, l lVar, Class cls, Context context) {
        this.f13212D = bVar;
        this.f13210B = lVar;
        this.f13211C = cls;
        this.f13209A = context;
        this.f13214F = lVar.s(cls);
        this.f13213E = bVar.i();
        n0(lVar.q());
        a(lVar.r());
    }

    @Override // j5.AbstractC1652a
    public boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (super.equals(kVar) && Objects.equals(this.f13211C, kVar.f13211C) && this.f13214F.equals(kVar.f13214F) && Objects.equals(this.f13215G, kVar.f13215G) && Objects.equals(this.f13216H, kVar.f13216H) && Objects.equals(this.f13217I, kVar.f13217I) && Objects.equals(this.f13218J, kVar.f13218J) && Objects.equals(this.f13219K, kVar.f13219K) && this.f13220L == kVar.f13220L && this.f13221M == kVar.f13221M) {
                return true;
            }
        }
        return false;
    }

    public k g0(j5.g gVar) {
        if (A()) {
            return clone().g0(gVar);
        }
        if (gVar != null) {
            if (this.f13216H == null) {
                this.f13216H = new ArrayList();
            }
            this.f13216H.add(gVar);
        }
        return (k) W();
    }

    @Override // j5.AbstractC1652a
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    public k a(AbstractC1652a abstractC1652a) {
        n5.k.d(abstractC1652a);
        return (k) super.a(abstractC1652a);
    }

    @Override // j5.AbstractC1652a
    public int hashCode() {
        return n5.l.q(this.f13221M, n5.l.q(this.f13220L, n5.l.p(this.f13219K, n5.l.p(this.f13218J, n5.l.p(this.f13217I, n5.l.p(this.f13216H, n5.l.p(this.f13215G, n5.l.p(this.f13214F, n5.l.p(this.f13211C, super.hashCode())))))))));
    }

    public final j5.d i0(k5.h hVar, j5.g gVar, AbstractC1652a abstractC1652a, Executor executor) {
        return j0(new Object(), hVar, gVar, null, this.f13214F, abstractC1652a.s(), abstractC1652a.p(), abstractC1652a.o(), abstractC1652a, executor);
    }

    public final j5.d j0(Object obj, k5.h hVar, j5.g gVar, j5.e eVar, m mVar, g gVar2, int i6, int i7, AbstractC1652a abstractC1652a, Executor executor) {
        j5.b bVar;
        j5.e eVar2;
        Object obj2;
        k5.h hVar2;
        j5.g gVar3;
        m mVar2;
        g gVar4;
        int i8;
        int i9;
        AbstractC1652a abstractC1652a2;
        Executor executor2;
        k kVar;
        if (this.f13218J != null) {
            bVar = new j5.b(obj, eVar);
            eVar2 = bVar;
            kVar = this;
            obj2 = obj;
            hVar2 = hVar;
            gVar3 = gVar;
            mVar2 = mVar;
            gVar4 = gVar2;
            i8 = i6;
            i9 = i7;
            abstractC1652a2 = abstractC1652a;
            executor2 = executor;
        } else {
            bVar = null;
            eVar2 = eVar;
            obj2 = obj;
            hVar2 = hVar;
            gVar3 = gVar;
            mVar2 = mVar;
            gVar4 = gVar2;
            i8 = i6;
            i9 = i7;
            abstractC1652a2 = abstractC1652a;
            executor2 = executor;
            kVar = this;
        }
        j5.d k02 = kVar.k0(obj2, hVar2, gVar3, eVar2, mVar2, gVar4, i8, i9, abstractC1652a2, executor2);
        if (bVar == null) {
            return k02;
        }
        int p6 = this.f13218J.p();
        int o6 = this.f13218J.o();
        if (n5.l.u(i6, i7) && !this.f13218J.K()) {
            p6 = abstractC1652a.p();
            o6 = abstractC1652a.o();
        }
        k kVar2 = this.f13218J;
        j5.b bVar2 = bVar;
        bVar2.q(k02, kVar2.j0(obj, hVar, gVar, bVar2, kVar2.f13214F, kVar2.s(), p6, o6, this.f13218J, executor));
        return bVar2;
    }

    public final j5.d k0(Object obj, k5.h hVar, j5.g gVar, j5.e eVar, m mVar, g gVar2, int i6, int i7, AbstractC1652a abstractC1652a, Executor executor) {
        k kVar = this.f13217I;
        if (kVar == null) {
            if (this.f13219K == null) {
                return w0(obj, hVar, gVar, abstractC1652a, eVar, mVar, gVar2, i6, i7, executor);
            }
            j5.k kVar2 = new j5.k(obj, eVar);
            kVar2.p(w0(obj, hVar, gVar, abstractC1652a, kVar2, mVar, gVar2, i6, i7, executor), w0(obj, hVar, gVar, abstractC1652a.clone().Z(this.f13219K.floatValue()), kVar2, mVar, m0(gVar2), i6, i7, executor));
            return kVar2;
        }
        if (this.f13222V) {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        m mVar2 = kVar.f13220L ? mVar : kVar.f13214F;
        g s6 = kVar.D() ? this.f13217I.s() : m0(gVar2);
        int p6 = this.f13217I.p();
        int o6 = this.f13217I.o();
        if (n5.l.u(i6, i7) && !this.f13217I.K()) {
            p6 = abstractC1652a.p();
            o6 = abstractC1652a.o();
        }
        j5.k kVar3 = new j5.k(obj, eVar);
        j5.d w02 = w0(obj, hVar, gVar, abstractC1652a, kVar3, mVar, gVar2, i6, i7, executor);
        this.f13222V = true;
        k kVar4 = this.f13217I;
        j5.d j02 = kVar4.j0(obj, hVar, gVar, kVar3, mVar2, s6, p6, o6, kVar4, executor);
        this.f13222V = false;
        kVar3.p(w02, j02);
        return kVar3;
    }

    @Override // j5.AbstractC1652a
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public k clone() {
        k kVar = (k) super.clone();
        kVar.f13214F = kVar.f13214F.clone();
        if (kVar.f13216H != null) {
            kVar.f13216H = new ArrayList(kVar.f13216H);
        }
        k kVar2 = kVar.f13217I;
        if (kVar2 != null) {
            kVar.f13217I = kVar2.clone();
        }
        k kVar3 = kVar.f13218J;
        if (kVar3 != null) {
            kVar.f13218J = kVar3.clone();
        }
        return kVar;
    }

    public final g m0(g gVar) {
        int i6 = a.f13224b[gVar.ordinal()];
        if (i6 == 1) {
            return g.NORMAL;
        }
        if (i6 == 2) {
            return g.HIGH;
        }
        if (i6 == 3 || i6 == 4) {
            return g.IMMEDIATE;
        }
        throw new IllegalArgumentException("unknown priority: " + s());
    }

    public final void n0(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g0((j5.g) it.next());
        }
    }

    public k5.h o0(k5.h hVar) {
        return q0(hVar, null, n5.e.b());
    }

    public final k5.h p0(k5.h hVar, j5.g gVar, AbstractC1652a abstractC1652a, Executor executor) {
        n5.k.d(hVar);
        if (!this.f13221M) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        j5.d i02 = i0(hVar, gVar, abstractC1652a, executor);
        j5.d l6 = hVar.l();
        if (i02.e(l6) && !s0(abstractC1652a, l6)) {
            if (!((j5.d) n5.k.d(l6)).isRunning()) {
                l6.j();
            }
            return hVar;
        }
        this.f13210B.o(hVar);
        hVar.i(i02);
        this.f13210B.z(hVar, i02);
        return hVar;
    }

    public k5.h q0(k5.h hVar, j5.g gVar, Executor executor) {
        return p0(hVar, gVar, this, executor);
    }

    public k5.i r0(ImageView imageView) {
        AbstractC1652a abstractC1652a;
        n5.l.b();
        n5.k.d(imageView);
        if (!J() && H() && imageView.getScaleType() != null) {
            switch (a.f13223a[imageView.getScaleType().ordinal()]) {
                case 1:
                    abstractC1652a = clone().N();
                    break;
                case 2:
                    abstractC1652a = clone().O();
                    break;
                case 3:
                case 4:
                case 5:
                    abstractC1652a = clone().P();
                    break;
                case 6:
                    abstractC1652a = clone().O();
                    break;
            }
            return (k5.i) p0(this.f13213E.a(imageView, this.f13211C), null, abstractC1652a, n5.e.b());
        }
        abstractC1652a = this;
        return (k5.i) p0(this.f13213E.a(imageView, this.f13211C), null, abstractC1652a, n5.e.b());
    }

    public final boolean s0(AbstractC1652a abstractC1652a, j5.d dVar) {
        return !abstractC1652a.C() && dVar.l();
    }

    public k t0(Object obj) {
        return v0(obj);
    }

    public k u0(String str) {
        return v0(str);
    }

    public final k v0(Object obj) {
        if (A()) {
            return clone().v0(obj);
        }
        this.f13215G = obj;
        this.f13221M = true;
        return (k) W();
    }

    public final j5.d w0(Object obj, k5.h hVar, j5.g gVar, AbstractC1652a abstractC1652a, j5.e eVar, m mVar, g gVar2, int i6, int i7, Executor executor) {
        Context context = this.f13209A;
        d dVar = this.f13213E;
        return j5.j.z(context, dVar, obj, this.f13215G, this.f13211C, abstractC1652a, i6, i7, gVar2, hVar, gVar, this.f13216H, eVar, dVar.f(), mVar.b(), executor);
    }

    public j5.c x0() {
        return y0(IntCompanionObject.MIN_VALUE, IntCompanionObject.MIN_VALUE);
    }

    public j5.c y0(int i6, int i7) {
        j5.f fVar = new j5.f(i6, i7);
        return (j5.c) q0(fVar, fVar, n5.e.a());
    }
}
