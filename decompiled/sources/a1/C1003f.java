package a1;

import a1.InterfaceC0999b;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* renamed from: a1.f, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C1003f implements InterfaceC0999b {

    /* renamed from: b, reason: collision with root package name */
    public int f7678b;

    /* renamed from: c, reason: collision with root package name */
    public float f7679c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f7680d = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0999b.a f7681e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC0999b.a f7682f;

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC0999b.a f7683g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC0999b.a f7684h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f7685i;

    /* renamed from: j, reason: collision with root package name */
    public C1002e f7686j;

    /* renamed from: k, reason: collision with root package name */
    public ByteBuffer f7687k;

    /* renamed from: l, reason: collision with root package name */
    public ShortBuffer f7688l;

    /* renamed from: m, reason: collision with root package name */
    public ByteBuffer f7689m;

    /* renamed from: n, reason: collision with root package name */
    public long f7690n;

    /* renamed from: o, reason: collision with root package name */
    public long f7691o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f7692p;

    public C1003f() {
        InterfaceC0999b.a aVar = InterfaceC0999b.a.f7643e;
        this.f7681e = aVar;
        this.f7682f = aVar;
        this.f7683g = aVar;
        this.f7684h = aVar;
        ByteBuffer byteBuffer = InterfaceC0999b.f7642a;
        this.f7687k = byteBuffer;
        this.f7688l = byteBuffer.asShortBuffer();
        this.f7689m = byteBuffer;
        this.f7678b = -1;
    }

    @Override // a1.InterfaceC0999b
    public final void a() {
        this.f7679c = 1.0f;
        this.f7680d = 1.0f;
        InterfaceC0999b.a aVar = InterfaceC0999b.a.f7643e;
        this.f7681e = aVar;
        this.f7682f = aVar;
        this.f7683g = aVar;
        this.f7684h = aVar;
        ByteBuffer byteBuffer = InterfaceC0999b.f7642a;
        this.f7687k = byteBuffer;
        this.f7688l = byteBuffer.asShortBuffer();
        this.f7689m = byteBuffer;
        this.f7678b = -1;
        this.f7685i = false;
        this.f7686j = null;
        this.f7690n = 0L;
        this.f7691o = 0L;
        this.f7692p = false;
    }

    @Override // a1.InterfaceC0999b
    public final ByteBuffer b() {
        int k6;
        C1002e c1002e = this.f7686j;
        if (c1002e != null && (k6 = c1002e.k()) > 0) {
            if (this.f7687k.capacity() < k6) {
                ByteBuffer order = ByteBuffer.allocateDirect(k6).order(ByteOrder.nativeOrder());
                this.f7687k = order;
                this.f7688l = order.asShortBuffer();
            } else {
                this.f7687k.clear();
                this.f7688l.clear();
            }
            c1002e.j(this.f7688l);
            this.f7691o += k6;
            this.f7687k.limit(k6);
            this.f7689m = this.f7687k;
        }
        ByteBuffer byteBuffer = this.f7689m;
        this.f7689m = InterfaceC0999b.f7642a;
        return byteBuffer;
    }

    @Override // a1.InterfaceC0999b
    public final void c(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            C1002e c1002e = (C1002e) AbstractC1119a.e(this.f7686j);
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f7690n += remaining;
            c1002e.t(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    @Override // a1.InterfaceC0999b
    public final boolean d() {
        if (!this.f7692p) {
            return false;
        }
        C1002e c1002e = this.f7686j;
        return c1002e == null || c1002e.k() == 0;
    }

    @Override // a1.InterfaceC0999b
    public final InterfaceC0999b.a e(InterfaceC0999b.a aVar) {
        if (aVar.f7646c != 2) {
            throw new InterfaceC0999b.C0119b(aVar);
        }
        int i6 = this.f7678b;
        if (i6 == -1) {
            i6 = aVar.f7644a;
        }
        this.f7681e = aVar;
        InterfaceC0999b.a aVar2 = new InterfaceC0999b.a(i6, aVar.f7645b, 2);
        this.f7682f = aVar2;
        this.f7685i = true;
        return aVar2;
    }

    @Override // a1.InterfaceC0999b
    public final void f() {
        C1002e c1002e = this.f7686j;
        if (c1002e != null) {
            c1002e.s();
        }
        this.f7692p = true;
    }

    @Override // a1.InterfaceC0999b
    public final void flush() {
        if (isActive()) {
            InterfaceC0999b.a aVar = this.f7681e;
            this.f7683g = aVar;
            InterfaceC0999b.a aVar2 = this.f7682f;
            this.f7684h = aVar2;
            if (this.f7685i) {
                this.f7686j = new C1002e(aVar.f7644a, aVar.f7645b, this.f7679c, this.f7680d, aVar2.f7644a);
            } else {
                C1002e c1002e = this.f7686j;
                if (c1002e != null) {
                    c1002e.i();
                }
            }
        }
        this.f7689m = InterfaceC0999b.f7642a;
        this.f7690n = 0L;
        this.f7691o = 0L;
        this.f7692p = false;
    }

    public final long g(long j6) {
        if (this.f7691o < 1024) {
            return (long) (this.f7679c * j6);
        }
        long l6 = this.f7690n - ((C1002e) AbstractC1119a.e(this.f7686j)).l();
        int i6 = this.f7684h.f7644a;
        int i7 = this.f7683g.f7644a;
        return i6 == i7 ? AbstractC1117K.W0(j6, l6, this.f7691o) : AbstractC1117K.W0(j6, l6 * i6, this.f7691o * i7);
    }

    public final void h(float f6) {
        if (this.f7680d != f6) {
            this.f7680d = f6;
            this.f7685i = true;
        }
    }

    public final void i(float f6) {
        if (this.f7679c != f6) {
            this.f7679c = f6;
            this.f7685i = true;
        }
    }

    @Override // a1.InterfaceC0999b
    public final boolean isActive() {
        if (this.f7682f.f7644a != -1) {
            return Math.abs(this.f7679c - 1.0f) >= 1.0E-4f || Math.abs(this.f7680d - 1.0f) >= 1.0E-4f || this.f7682f.f7644a != this.f7681e.f7644a;
        }
        return false;
    }
}
