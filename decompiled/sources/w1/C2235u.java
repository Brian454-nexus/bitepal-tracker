package w1;

import Z0.q;
import android.net.Uri;
import g1.C1337i0;
import g1.C1343l0;
import g1.N0;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import w1.InterfaceC2211C;
import w1.InterfaceC2234t;

/* renamed from: w1.u, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2235u implements InterfaceC2211C {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f20107a;

    /* renamed from: b, reason: collision with root package name */
    public final l0 f20108b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f20109c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f20110d = new AtomicBoolean();

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference f20111e = new AtomicReference();

    /* renamed from: f, reason: collision with root package name */
    public D6.g f20112f;

    /* renamed from: w1.u$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class a implements b0 {

        /* renamed from: a, reason: collision with root package name */
        public int f20113a = 0;

        public a() {
        }

        @Override // w1.b0
        public void a() {
            Throwable th = (Throwable) C2235u.this.f20111e.get();
            if (th != null) {
                throw new IOException(th);
            }
        }

        @Override // w1.b0
        public boolean c() {
            return C2235u.this.f20110d.get();
        }

        @Override // w1.b0
        public int k(C1337i0 c1337i0, f1.f fVar, int i6) {
            int i7 = this.f20113a;
            if (i7 == 2) {
                fVar.e(4);
                return -4;
            }
            if ((i6 & 2) != 0 || i7 == 0) {
                c1337i0.f14685b = C2235u.this.f20108b.b(0).a(0);
                this.f20113a = 1;
                return -5;
            }
            if (!C2235u.this.f20110d.get()) {
                return -3;
            }
            int length = C2235u.this.f20109c.length;
            fVar.e(1);
            fVar.f14007f = 0L;
            if ((i6 & 4) == 0) {
                fVar.o(length);
                fVar.f14005d.put(C2235u.this.f20109c, 0, length);
            }
            if ((i6 & 1) == 0) {
                this.f20113a = 2;
            }
            return -4;
        }

        @Override // w1.b0
        public int n(long j6) {
            return 0;
        }
    }

    public C2235u(Uri uri, String str, InterfaceC2234t interfaceC2234t) {
        this.f20107a = uri;
        this.f20108b = new l0(new Z0.H(new q.b().o0(str).K()));
        this.f20109c = uri.toString().getBytes(y6.e.c);
    }

    @Override // w1.InterfaceC2211C, w1.c0
    public boolean b(C1343l0 c1343l0) {
        return !this.f20110d.get();
    }

    @Override // w1.InterfaceC2211C, w1.c0
    public long d() {
        return this.f20110d.get() ? Long.MIN_VALUE : 0L;
    }

    @Override // w1.InterfaceC2211C, w1.c0
    public boolean e() {
        return !this.f20110d.get();
    }

    @Override // w1.InterfaceC2211C, w1.c0
    public long f() {
        return this.f20110d.get() ? Long.MIN_VALUE : 0L;
    }

    @Override // w1.InterfaceC2211C
    public long g(long j6, N0 n02) {
        return j6;
    }

    @Override // w1.InterfaceC2211C, w1.c0
    public void h(long j6) {
    }

    public void k() {
        D6.g gVar = this.f20112f;
        if (gVar != null) {
            gVar.cancel(false);
        }
    }

    @Override // w1.InterfaceC2211C
    public void l() {
    }

    @Override // w1.InterfaceC2211C
    public long m(long j6) {
        return j6;
    }

    @Override // w1.InterfaceC2211C
    public long o(z1.x[] xVarArr, boolean[] zArr, b0[] b0VarArr, boolean[] zArr2, long j6) {
        for (int i6 = 0; i6 < xVarArr.length; i6++) {
            if (b0VarArr[i6] != null && (xVarArr[i6] == null || !zArr[i6])) {
                b0VarArr[i6] = null;
            }
            if (b0VarArr[i6] == null && xVarArr[i6] != null) {
                b0VarArr[i6] = new a();
                zArr2[i6] = true;
            }
        }
        return j6;
    }

    @Override // w1.InterfaceC2211C
    public long p() {
        return -9223372036854775807L;
    }

    @Override // w1.InterfaceC2211C
    public l0 r() {
        return this.f20108b;
    }

    @Override // w1.InterfaceC2211C
    public void s(InterfaceC2211C.a aVar, long j6) {
        aVar.i(this);
        new InterfaceC2234t.a(this.f20107a);
        throw null;
    }

    @Override // w1.InterfaceC2211C
    public void t(long j6, boolean z6) {
    }
}
