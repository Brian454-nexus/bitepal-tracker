package y;

import B.AbstractC0290g;
import F.AbstractC0335i0;
import F.AbstractC0347t;
import I.AbstractC0442n;
import I.InterfaceC0421c0;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Pair;
import android.util.Size;
import androidx.lifecycle.AbstractC1065q;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import y.N;
import z.C2362A;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class N implements I.D {

    /* renamed from: a, reason: collision with root package name */
    public final String f20825a;

    /* renamed from: b, reason: collision with root package name */
    public final C2362A f20826b;

    /* renamed from: c, reason: collision with root package name */
    public final E.h f20827c;

    /* renamed from: e, reason: collision with root package name */
    public C2331u f20829e;

    /* renamed from: h, reason: collision with root package name */
    public final a f20832h;

    /* renamed from: j, reason: collision with root package name */
    public final I.G0 f20834j;

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC0421c0 f20835k;

    /* renamed from: l, reason: collision with root package name */
    public final z.N f20836l;

    /* renamed from: d, reason: collision with root package name */
    public final Object f20828d = new Object();

    /* renamed from: f, reason: collision with root package name */
    public a f20830f = null;

    /* renamed from: g, reason: collision with root package name */
    public a f20831g = null;

    /* renamed from: i, reason: collision with root package name */
    public List f20833i = null;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a extends androidx.lifecycle.r {

        /* renamed from: m, reason: collision with root package name */
        public AbstractC1065q f20837m;

        /* renamed from: n, reason: collision with root package name */
        public final Object f20838n;

        public a(Object obj) {
            this.f20838n = obj;
        }

        @Override // androidx.lifecycle.AbstractC1065q
        public Object f() {
            AbstractC1065q abstractC1065q = this.f20837m;
            return abstractC1065q == null ? this.f20838n : abstractC1065q.f();
        }

        public void s(AbstractC1065q abstractC1065q) {
            AbstractC1065q abstractC1065q2 = this.f20837m;
            if (abstractC1065q2 != null) {
                super.r(abstractC1065q2);
            }
            this.f20837m = abstractC1065q;
            super.q(abstractC1065q, new androidx.lifecycle.u() { // from class: y.M
                @Override // androidx.lifecycle.u
                public final void a(Object obj) {
                    N.a.this.p(obj);
                }
            });
        }
    }

    public N(String str, z.N n6) {
        String str2 = (String) y0.g.f(str);
        this.f20825a = str2;
        this.f20836l = n6;
        C2362A c6 = n6.c(str2);
        this.f20826b = c6;
        this.f20827c = new E.h(this);
        this.f20834j = AbstractC0290g.a(str, c6);
        this.f20835k = new C2311j0(str);
        this.f20832h = new a(AbstractC0347t.a(AbstractC0347t.b.CLOSED));
    }

    @Override // F.r
    public int a() {
        return j(0);
    }

    @Override // I.D
    public Set c() {
        return A.e.a(this.f20826b).c();
    }

    @Override // I.D
    public String d() {
        return this.f20825a;
    }

    @Override // F.r
    public F.D e() {
        synchronized (this.f20828d) {
            try {
                C2331u c2331u = this.f20829e;
                if (c2331u == null) {
                    return I0.e(this.f20826b);
                }
                return c2331u.C().f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F.r
    public AbstractC1065q f() {
        return this.f20832h;
    }

    @Override // F.r
    public int g() {
        Integer num = (Integer) this.f20826b.a(CameraCharacteristics.LENS_FACING);
        y0.g.b(num != null, "Unable to get the lens facing of the camera.");
        return X0.a(num.intValue());
    }

    @Override // I.D
    public I.T0 h() {
        Integer num = (Integer) this.f20826b.a(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE);
        y0.g.f(num);
        return num.intValue() != 1 ? I.T0.UPTIME : I.T0.REALTIME;
    }

    @Override // I.D
    public List i(int i6) {
        Size[] a6 = this.f20826b.b().a(i6);
        return a6 != null ? Arrays.asList(a6) : Collections.EMPTY_LIST;
    }

    @Override // F.r
    public int j(int i6) {
        return L.c.a(L.c.b(i6), q(), 1 == g());
    }

    @Override // I.D
    public InterfaceC0421c0 k() {
        return this.f20835k;
    }

    @Override // I.D
    public I.G0 l() {
        return this.f20834j;
    }

    @Override // I.D
    public List m(int i6) {
        Size[] b6 = this.f20826b.b().b(i6);
        return b6 != null ? Arrays.asList(b6) : Collections.EMPTY_LIST;
    }

    @Override // F.r
    public AbstractC1065q n() {
        synchronized (this.f20828d) {
            try {
                C2331u c2331u = this.f20829e;
                if (c2331u == null) {
                    if (this.f20831g == null) {
                        this.f20831g = new a(A1.f(this.f20826b));
                    }
                    return this.f20831g;
                }
                a aVar = this.f20831g;
                if (aVar != null) {
                    return aVar;
                }
                return c2331u.P().h();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public E.h o() {
        return this.f20827c;
    }

    public C2362A p() {
        return this.f20826b;
    }

    public int q() {
        Integer num = (Integer) this.f20826b.a(CameraCharacteristics.SENSOR_ORIENTATION);
        y0.g.f(num);
        return num.intValue();
    }

    public int r() {
        Integer num = (Integer) this.f20826b.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        y0.g.f(num);
        return num.intValue();
    }

    public void s(C2331u c2331u) {
        synchronized (this.f20828d) {
            try {
                this.f20829e = c2331u;
                a aVar = this.f20831g;
                if (aVar != null) {
                    aVar.s(c2331u.P().h());
                }
                a aVar2 = this.f20830f;
                if (aVar2 != null) {
                    aVar2.s(this.f20829e.N().f());
                }
                List<Pair> list = this.f20833i;
                if (list != null) {
                    for (Pair pair : list) {
                        this.f20829e.x((Executor) pair.second, (AbstractC0442n) pair.first);
                    }
                    this.f20833i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        t();
    }

    public final void t() {
        u();
    }

    public final void u() {
        String str;
        int r6 = r();
        if (r6 == 0) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED";
        } else if (r6 == 1) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_FULL";
        } else if (r6 == 2) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY";
        } else if (r6 == 3) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_3";
        } else if (r6 != 4) {
            str = "Unknown value: " + r6;
        } else {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL";
        }
        AbstractC0335i0.e("Camera2CameraInfo", "Device Level: " + str);
    }

    public void v(AbstractC1065q abstractC1065q) {
        this.f20832h.s(abstractC1065q);
    }
}
