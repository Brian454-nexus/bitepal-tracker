package g1;

import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.AbstractC1133o;
import com.android.installreferrer.api.InstallReferrerClient;
import g1.InterfaceC1341k0;
import h1.v1;
import java.util.HashMap;
import java.util.Iterator;
import w1.InterfaceC2212D;

/* renamed from: g1.i, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C1336i implements InterfaceC1341k0 {

    /* renamed from: a, reason: collision with root package name */
    public final A1.g f14671a;

    /* renamed from: b, reason: collision with root package name */
    public final long f14672b;

    /* renamed from: c, reason: collision with root package name */
    public final long f14673c;

    /* renamed from: d, reason: collision with root package name */
    public final long f14674d;

    /* renamed from: e, reason: collision with root package name */
    public final long f14675e;

    /* renamed from: f, reason: collision with root package name */
    public final int f14676f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f14677g;

    /* renamed from: h, reason: collision with root package name */
    public final long f14678h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f14679i;

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f14680j;

    /* renamed from: k, reason: collision with root package name */
    public long f14681k;

    /* renamed from: g1.i$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public boolean f14682a;

        /* renamed from: b, reason: collision with root package name */
        public int f14683b;

        public b() {
        }
    }

    public C1336i() {
        this(new A1.g(true, 65536), 50000, 50000, 2500, 5000, -1, false, 0, false);
    }

    public static void j(int i6, int i7, String str, String str2) {
        AbstractC1119a.b(i6 >= i7, str + " cannot be less than " + str2);
    }

    public static int m(int i6) {
        switch (i6) {
            case -2:
                return 0;
            case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
            default:
                throw new IllegalArgumentException();
            case 0:
                return 144310272;
            case 1:
                return 13107200;
            case 2:
                return 131072000;
            case 3:
            case 4:
            case 5:
            case 6:
                return 131072;
        }
    }

    @Override // g1.InterfaceC1341k0
    public boolean a(InterfaceC1341k0.a aVar) {
        b bVar = (b) AbstractC1119a.e((b) this.f14680j.get(aVar.f14700a));
        boolean z6 = true;
        boolean z7 = this.f14671a.f() >= l();
        long j6 = this.f14672b;
        float f6 = aVar.f14705f;
        if (f6 > 1.0f) {
            j6 = Math.min(AbstractC1117K.e0(j6, f6), this.f14673c);
        }
        long max = Math.max(j6, 500000L);
        long j7 = aVar.f14704e;
        if (j7 < max) {
            if (!this.f14677g && z7) {
                z6 = false;
            }
            bVar.f14682a = z6;
            if (!z6 && j7 < 500000) {
                AbstractC1133o.h("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j7 >= this.f14673c || z7) {
            bVar.f14682a = false;
        }
        return bVar.f14682a;
    }

    @Override // g1.InterfaceC1341k0
    public void b(v1 v1Var, Z0.G g6, InterfaceC2212D.b bVar, J0[] j0Arr, w1.l0 l0Var, z1.x[] xVarArr) {
        b bVar2 = (b) AbstractC1119a.e((b) this.f14680j.get(v1Var));
        int i6 = this.f14676f;
        if (i6 == -1) {
            i6 = k(j0Arr, xVarArr);
        }
        bVar2.f14683b = i6;
        p();
    }

    @Override // g1.InterfaceC1341k0
    public long c(v1 v1Var) {
        return this.f14678h;
    }

    @Override // g1.InterfaceC1341k0
    public boolean d(v1 v1Var) {
        return this.f14679i;
    }

    @Override // g1.InterfaceC1341k0
    public void e(v1 v1Var) {
        long id = Thread.currentThread().getId();
        long j6 = this.f14681k;
        AbstractC1119a.h(j6 == -1 || j6 == id, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.f14681k = id;
        if (!this.f14680j.containsKey(v1Var)) {
            this.f14680j.put(v1Var, new b());
        }
        o(v1Var);
    }

    @Override // g1.InterfaceC1341k0
    public void f(v1 v1Var) {
        n(v1Var);
        if (this.f14680j.isEmpty()) {
            this.f14681k = -1L;
        }
    }

    @Override // g1.InterfaceC1341k0
    public boolean g(InterfaceC1341k0.a aVar) {
        long j02 = AbstractC1117K.j0(aVar.f14704e, aVar.f14705f);
        long j6 = aVar.f14707h ? this.f14675e : this.f14674d;
        long j7 = aVar.f14708i;
        if (j7 != -9223372036854775807L) {
            j6 = Math.min(j7 / 2, j6);
        }
        if (j6 <= 0 || j02 >= j6) {
            return true;
        }
        return !this.f14677g && this.f14671a.f() >= l();
    }

    @Override // g1.InterfaceC1341k0
    public A1.b h() {
        return this.f14671a;
    }

    @Override // g1.InterfaceC1341k0
    public void i(v1 v1Var) {
        n(v1Var);
    }

    public int k(J0[] j0Arr, z1.x[] xVarArr) {
        int i6 = 0;
        for (int i7 = 0; i7 < j0Arr.length; i7++) {
            if (xVarArr[i7] != null) {
                i6 += m(j0Arr[i7].l());
            }
        }
        return Math.max(13107200, i6);
    }

    public int l() {
        Iterator it = this.f14680j.values().iterator();
        int i6 = 0;
        while (it.hasNext()) {
            i6 += ((b) it.next()).f14683b;
        }
        return i6;
    }

    public final void n(v1 v1Var) {
        if (this.f14680j.remove(v1Var) != null) {
            p();
        }
    }

    public final void o(v1 v1Var) {
        b bVar = (b) AbstractC1119a.e((b) this.f14680j.get(v1Var));
        int i6 = this.f14676f;
        if (i6 == -1) {
            i6 = 13107200;
        }
        bVar.f14683b = i6;
        bVar.f14682a = false;
    }

    public final void p() {
        if (this.f14680j.isEmpty()) {
            this.f14671a.g();
        } else {
            this.f14671a.h(l());
        }
    }

    public C1336i(A1.g gVar, int i6, int i7, int i8, int i9, int i10, boolean z6, int i11, boolean z7) {
        j(i8, 0, "bufferForPlaybackMs", "0");
        j(i9, 0, "bufferForPlaybackAfterRebufferMs", "0");
        j(i6, i8, "minBufferMs", "bufferForPlaybackMs");
        j(i6, i9, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        j(i7, i6, "maxBufferMs", "minBufferMs");
        j(i11, 0, "backBufferDurationMs", "0");
        this.f14671a = gVar;
        this.f14672b = AbstractC1117K.J0(i6);
        this.f14673c = AbstractC1117K.J0(i7);
        this.f14674d = AbstractC1117K.J0(i8);
        this.f14675e = AbstractC1117K.J0(i9);
        this.f14676f = i10;
        this.f14677g = z6;
        this.f14678h = AbstractC1117K.J0(i11);
        this.f14679i = z7;
        this.f14680j = new HashMap();
        this.f14681k = -1L;
    }
}
