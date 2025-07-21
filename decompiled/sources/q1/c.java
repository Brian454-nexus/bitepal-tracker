package q1;

import Z0.q;
import Z0.x;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import g1.AbstractC1328e;
import g1.C1337i0;
import g1.K0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import w1.InterfaceC2212D;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class c extends AbstractC1328e implements Handler.Callback {

    /* renamed from: A, reason: collision with root package name */
    public x f18631A;

    /* renamed from: B, reason: collision with root package name */
    public long f18632B;

    /* renamed from: r, reason: collision with root package name */
    public final InterfaceC2007a f18633r;

    /* renamed from: s, reason: collision with root package name */
    public final InterfaceC2008b f18634s;

    /* renamed from: t, reason: collision with root package name */
    public final Handler f18635t;

    /* renamed from: u, reason: collision with root package name */
    public final N1.b f18636u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f18637v;

    /* renamed from: w, reason: collision with root package name */
    public N1.a f18638w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f18639x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f18640y;

    /* renamed from: z, reason: collision with root package name */
    public long f18641z;

    public c(InterfaceC2008b interfaceC2008b, Looper looper) {
        this(interfaceC2008b, looper, InterfaceC2007a.f18630a);
    }

    @Override // g1.K0
    public int b(q qVar) {
        if (this.f18633r.b(qVar)) {
            return K0.E(qVar.f6975K == 0 ? 4 : 2);
        }
        return K0.E(0);
    }

    @Override // g1.J0
    public boolean c() {
        return true;
    }

    @Override // g1.J0
    public boolean d() {
        return this.f18640y;
    }

    @Override // g1.AbstractC1328e
    public void e0() {
        this.f18631A = null;
        this.f18638w = null;
        this.f18632B = -9223372036854775807L;
    }

    @Override // g1.J0, g1.K0
    public String getName() {
        return "MetadataRenderer";
    }

    @Override // g1.AbstractC1328e
    public void h0(long j6, boolean z6) {
        this.f18631A = null;
        this.f18639x = false;
        this.f18640y = false;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        v0((x) message.obj);
        return true;
    }

    @Override // g1.J0
    public void i(long j6, long j7) {
        boolean z6 = true;
        while (z6) {
            x0();
            z6 = w0(j6);
        }
    }

    @Override // g1.AbstractC1328e
    public void n0(q[] qVarArr, long j6, long j7, InterfaceC2212D.b bVar) {
        this.f18638w = this.f18633r.a(qVarArr[0]);
        x xVar = this.f18631A;
        if (xVar != null) {
            this.f18631A = xVar.d((xVar.f7285b + this.f18632B) - j7);
        }
        this.f18632B = j7;
    }

    public final void s0(x xVar, List list) {
        for (int i6 = 0; i6 < xVar.f(); i6++) {
            q n6 = xVar.e(i6).n();
            if (n6 == null || !this.f18633r.b(n6)) {
                list.add(xVar.e(i6));
            } else {
                N1.a a6 = this.f18633r.a(n6);
                byte[] bArr = (byte[]) AbstractC1119a.e(xVar.e(i6).B());
                this.f18636u.f();
                this.f18636u.o(bArr.length);
                ((ByteBuffer) AbstractC1117K.i(this.f18636u.f14005d)).put(bArr);
                this.f18636u.p();
                x a7 = a6.a(this.f18636u);
                if (a7 != null) {
                    s0(a7, list);
                }
            }
        }
    }

    public final long t0(long j6) {
        AbstractC1119a.g(j6 != -9223372036854775807L);
        AbstractC1119a.g(this.f18632B != -9223372036854775807L);
        return j6 - this.f18632B;
    }

    public final void u0(x xVar) {
        Handler handler = this.f18635t;
        if (handler != null) {
            handler.obtainMessage(1, xVar).sendToTarget();
        } else {
            v0(xVar);
        }
    }

    public final void v0(x xVar) {
        this.f18634s.x(xVar);
    }

    public final boolean w0(long j6) {
        boolean z6;
        x xVar = this.f18631A;
        if (xVar == null || (!this.f18637v && xVar.f7285b > t0(j6))) {
            z6 = false;
        } else {
            u0(this.f18631A);
            this.f18631A = null;
            z6 = true;
        }
        if (this.f18639x && this.f18631A == null) {
            this.f18640y = true;
        }
        return z6;
    }

    public final void x0() {
        if (this.f18639x || this.f18631A != null) {
            return;
        }
        this.f18636u.f();
        C1337i0 Y5 = Y();
        int p02 = p0(Y5, this.f18636u, 0);
        if (p02 != -4) {
            if (p02 == -5) {
                this.f18641z = ((q) AbstractC1119a.e(Y5.f14685b)).f6995s;
                return;
            }
            return;
        }
        if (this.f18636u.i()) {
            this.f18639x = true;
            return;
        }
        if (this.f18636u.f14007f >= a0()) {
            N1.b bVar = this.f18636u;
            bVar.f3574j = this.f18641z;
            bVar.p();
            x a6 = ((N1.a) AbstractC1117K.i(this.f18638w)).a(this.f18636u);
            if (a6 != null) {
                ArrayList arrayList = new ArrayList(a6.f());
                s0(a6, arrayList);
                if (arrayList.isEmpty()) {
                    return;
                }
                this.f18631A = new x(t0(this.f18636u.f14007f), arrayList);
            }
        }
    }

    public c(InterfaceC2008b interfaceC2008b, Looper looper, InterfaceC2007a interfaceC2007a) {
        this(interfaceC2008b, looper, interfaceC2007a, false);
    }

    public c(InterfaceC2008b interfaceC2008b, Looper looper, InterfaceC2007a interfaceC2007a, boolean z6) {
        super(5);
        this.f18634s = (InterfaceC2008b) AbstractC1119a.e(interfaceC2008b);
        this.f18635t = looper == null ? null : AbstractC1117K.z(looper, this);
        this.f18633r = (InterfaceC2007a) AbstractC1119a.e(interfaceC2007a);
        this.f18637v = z6;
        this.f18636u = new N1.b();
        this.f18632B = -9223372036854775807L;
    }
}
