package y;

import F.AbstractC0335i0;
import I.C0445o0;
import I.C0464y0;
import I.L0;
import I.Z0;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import z.C2362A;

/* renamed from: y.a1, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C2286a1 {

    /* renamed from: a, reason: collision with root package name */
    public I.W f20938a;

    /* renamed from: b, reason: collision with root package name */
    public I.L0 f20939b;

    /* renamed from: d, reason: collision with root package name */
    public final Size f20941d;

    /* renamed from: f, reason: collision with root package name */
    public final c f20943f;

    /* renamed from: e, reason: collision with root package name */
    public final C.r f20942e = new C.r();

    /* renamed from: c, reason: collision with root package name */
    public final b f20940c = new b();

    /* renamed from: y.a1$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements N.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Surface f20944a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SurfaceTexture f20945b;

        public a(Surface surface, SurfaceTexture surfaceTexture) {
            this.f20944a = surface;
            this.f20945b = surfaceTexture;
        }

        @Override // N.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
            this.f20944a.release();
            this.f20945b.release();
        }

        @Override // N.c
        public void onFailure(Throwable th) {
            throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th);
        }
    }

    /* renamed from: y.a1$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b implements I.Y0 {

        /* renamed from: G, reason: collision with root package name */
        public final I.P f20947G;

        public b() {
            C0464y0 a02 = C0464y0.a0();
            a02.H(I.Y0.f2394t, new C2313k0());
            this.f20947G = a02;
        }

        @Override // I.Y0
        public Z0.b G() {
            return Z0.b.METERING_REPEATING;
        }

        @Override // I.H0
        public I.P o() {
            return this.f20947G;
        }
    }

    /* renamed from: y.a1$c */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface c {
        void a();
    }

    public C2286a1(C2362A c2362a, D0 d02, c cVar) {
        this.f20943f = cVar;
        Size f6 = f(c2362a, d02);
        this.f20941d = f6;
        AbstractC0335i0.a("MeteringRepeating", "MeteringSession SurfaceTexture size: " + f6);
        this.f20939b = d();
    }

    public static /* synthetic */ void a(C2286a1 c2286a1, I.L0 l02, L0.f fVar) {
        c2286a1.f20939b = c2286a1.d();
        c cVar = c2286a1.f20943f;
        if (cVar != null) {
            cVar.a();
        }
    }

    public void c() {
        AbstractC0335i0.a("MeteringRepeating", "MeteringRepeating clear!");
        I.W w6 = this.f20938a;
        if (w6 != null) {
            w6.d();
        }
        this.f20938a = null;
    }

    public I.L0 d() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(this.f20941d.getWidth(), this.f20941d.getHeight());
        Surface surface = new Surface(surfaceTexture);
        L0.b q6 = L0.b.q(this.f20940c, this.f20941d);
        q6.w(1);
        C0445o0 c0445o0 = new C0445o0(surface);
        this.f20938a = c0445o0;
        N.f.b(c0445o0.k(), new a(surface, surfaceTexture), M.c.b());
        q6.l(this.f20938a);
        q6.f(new L0.c() { // from class: y.Y0
            @Override // I.L0.c
            public final void a(I.L0 l02, L0.f fVar) {
                C2286a1.a(C2286a1.this, l02, fVar);
            }
        });
        return q6.o();
    }

    public String e() {
        return "MeteringRepeating";
    }

    public final Size f(C2362A c2362a, D0 d02) {
        Size[] b6 = c2362a.b().b(34);
        if (b6 == null) {
            AbstractC0335i0.c("MeteringRepeating", "Can not get output size list.");
            return new Size(0, 0);
        }
        Size[] a6 = this.f20942e.a(b6);
        List asList = Arrays.asList(a6);
        Collections.sort(asList, new Comparator() { // from class: y.Z0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int signum;
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                signum = Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
                return signum;
            }
        });
        Size f6 = d02.f();
        long min = Math.min(f6.getWidth() * f6.getHeight(), 307200L);
        int length = a6.length;
        Size size = null;
        int i6 = 0;
        while (true) {
            if (i6 >= length) {
                break;
            }
            Size size2 = a6[i6];
            long width = size2.getWidth() * size2.getHeight();
            if (width == min) {
                return size2;
            }
            if (width <= min) {
                i6++;
                size = size2;
            } else if (size != null) {
                return size;
            }
        }
        return (Size) asList.get(0);
    }

    public I.L0 g() {
        return this.f20939b;
    }

    public I.Y0 h() {
        return this.f20940c;
    }
}
