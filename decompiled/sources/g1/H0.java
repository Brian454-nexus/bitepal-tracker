package g1;

import android.os.Looper;
import c1.AbstractC1119a;
import c1.InterfaceC1121c;
import java.util.concurrent.TimeoutException;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class H0 {

    /* renamed from: a, reason: collision with root package name */
    public final b f14350a;

    /* renamed from: b, reason: collision with root package name */
    public final a f14351b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1121c f14352c;

    /* renamed from: d, reason: collision with root package name */
    public final Z0.G f14353d;

    /* renamed from: e, reason: collision with root package name */
    public int f14354e;

    /* renamed from: f, reason: collision with root package name */
    public Object f14355f;

    /* renamed from: g, reason: collision with root package name */
    public Looper f14356g;

    /* renamed from: h, reason: collision with root package name */
    public int f14357h;

    /* renamed from: i, reason: collision with root package name */
    public long f14358i = -9223372036854775807L;

    /* renamed from: j, reason: collision with root package name */
    public boolean f14359j = true;

    /* renamed from: k, reason: collision with root package name */
    public boolean f14360k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f14361l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f14362m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f14363n;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface a {
        void e(H0 h02);
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface b {
        void H(int i6, Object obj);
    }

    public H0(a aVar, b bVar, Z0.G g6, int i6, InterfaceC1121c interfaceC1121c, Looper looper) {
        this.f14351b = aVar;
        this.f14350a = bVar;
        this.f14353d = g6;
        this.f14356g = looper;
        this.f14352c = interfaceC1121c;
        this.f14357h = i6;
    }

    public synchronized boolean a(long j6) {
        boolean z6;
        try {
            AbstractC1119a.g(this.f14360k);
            AbstractC1119a.g(this.f14356g.getThread() != Thread.currentThread());
            long b6 = this.f14352c.b() + j6;
            while (true) {
                z6 = this.f14362m;
                if (z6 || j6 <= 0) {
                    break;
                }
                this.f14352c.f();
                wait(j6);
                j6 = b6 - this.f14352c.b();
            }
            if (!z6) {
                throw new TimeoutException("Message delivery timed out.");
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f14361l;
    }

    public boolean b() {
        return this.f14359j;
    }

    public Looper c() {
        return this.f14356g;
    }

    public int d() {
        return this.f14357h;
    }

    public Object e() {
        return this.f14355f;
    }

    public long f() {
        return this.f14358i;
    }

    public b g() {
        return this.f14350a;
    }

    public Z0.G h() {
        return this.f14353d;
    }

    public int i() {
        return this.f14354e;
    }

    public synchronized boolean j() {
        return this.f14363n;
    }

    public synchronized void k(boolean z6) {
        this.f14361l = z6 | this.f14361l;
        this.f14362m = true;
        notifyAll();
    }

    public H0 l() {
        AbstractC1119a.g(!this.f14360k);
        if (this.f14358i == -9223372036854775807L) {
            AbstractC1119a.a(this.f14359j);
        }
        this.f14360k = true;
        this.f14351b.e(this);
        return this;
    }

    public H0 m(Object obj) {
        AbstractC1119a.g(!this.f14360k);
        this.f14355f = obj;
        return this;
    }

    public H0 n(int i6) {
        AbstractC1119a.g(!this.f14360k);
        this.f14354e = i6;
        return this;
    }
}
