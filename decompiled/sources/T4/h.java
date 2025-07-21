package T4;

import T4.f;
import T4.i;
import android.util.Log;
import com.bumptech.glide.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import o5.a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class h implements f.a, Runnable, Comparable, a.f {

    /* renamed from: A, reason: collision with root package name */
    public R4.a f4959A;

    /* renamed from: B, reason: collision with root package name */
    public com.bumptech.glide.load.data.d f4960B;

    /* renamed from: C, reason: collision with root package name */
    public volatile T4.f f4961C;

    /* renamed from: D, reason: collision with root package name */
    public volatile boolean f4962D;

    /* renamed from: E, reason: collision with root package name */
    public volatile boolean f4963E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f4964F;

    /* renamed from: d, reason: collision with root package name */
    public final e f4968d;

    /* renamed from: e, reason: collision with root package name */
    public final y0.d f4969e;

    /* renamed from: h, reason: collision with root package name */
    public com.bumptech.glide.d f4972h;

    /* renamed from: i, reason: collision with root package name */
    public R4.f f4973i;

    /* renamed from: j, reason: collision with root package name */
    public com.bumptech.glide.g f4974j;

    /* renamed from: k, reason: collision with root package name */
    public n f4975k;

    /* renamed from: l, reason: collision with root package name */
    public int f4976l;

    /* renamed from: m, reason: collision with root package name */
    public int f4977m;

    /* renamed from: n, reason: collision with root package name */
    public j f4978n;

    /* renamed from: o, reason: collision with root package name */
    public R4.h f4979o;

    /* renamed from: p, reason: collision with root package name */
    public b f4980p;

    /* renamed from: q, reason: collision with root package name */
    public int f4981q;

    /* renamed from: r, reason: collision with root package name */
    public EnumC0086h f4982r;

    /* renamed from: s, reason: collision with root package name */
    public g f4983s;

    /* renamed from: t, reason: collision with root package name */
    public long f4984t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f4985u;

    /* renamed from: v, reason: collision with root package name */
    public Object f4986v;

    /* renamed from: w, reason: collision with root package name */
    public Thread f4987w;

    /* renamed from: x, reason: collision with root package name */
    public R4.f f4988x;

    /* renamed from: y, reason: collision with root package name */
    public R4.f f4989y;

    /* renamed from: z, reason: collision with root package name */
    public Object f4990z;

    /* renamed from: a, reason: collision with root package name */
    public final T4.g f4965a = new T4.g();

    /* renamed from: b, reason: collision with root package name */
    public final List f4966b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final o5.c f4967c = o5.c.a();

    /* renamed from: f, reason: collision with root package name */
    public final d f4970f = new d();

    /* renamed from: g, reason: collision with root package name */
    public final f f4971g = new f();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4991a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f4992b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f4993c;

        static {
            int[] iArr = new int[R4.c.values().length];
            f4993c = iArr;
            try {
                iArr[R4.c.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4993c[R4.c.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC0086h.values().length];
            f4992b = iArr2;
            try {
                iArr2[EnumC0086h.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4992b[EnumC0086h.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4992b[EnumC0086h.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4992b[EnumC0086h.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4992b[EnumC0086h.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[g.values().length];
            f4991a = iArr3;
            try {
                iArr3[g.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4991a[g.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f4991a[g.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface b {
        void b(v vVar, R4.a aVar, boolean z6);

        void d(q qVar);

        void e(h hVar);
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class c implements i.a {

        /* renamed from: a, reason: collision with root package name */
        public final R4.a f4994a;

        public c(R4.a aVar) {
            this.f4994a = aVar;
        }

        @Override // T4.i.a
        public v a(v vVar) {
            return h.this.v(this.f4994a, vVar);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public R4.f f4996a;

        /* renamed from: b, reason: collision with root package name */
        public R4.k f4997b;

        /* renamed from: c, reason: collision with root package name */
        public u f4998c;

        public void a() {
            this.f4996a = null;
            this.f4997b = null;
            this.f4998c = null;
        }

        public void b(e eVar, R4.h hVar) {
            o5.b.a("DecodeJob.encode");
            try {
                eVar.a().b(this.f4996a, new T4.e(this.f4997b, this.f4998c, hVar));
            } finally {
                this.f4998c.h();
                o5.b.e();
            }
        }

        public boolean c() {
            return this.f4998c != null;
        }

        public void d(R4.f fVar, R4.k kVar, u uVar) {
            this.f4996a = fVar;
            this.f4997b = kVar;
            this.f4998c = uVar;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface e {
        V4.a a();
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public boolean f4999a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f5000b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f5001c;

        public final boolean a(boolean z6) {
            return (this.f5001c || z6 || this.f5000b) && this.f4999a;
        }

        public synchronized boolean b() {
            this.f5000b = true;
            return a(false);
        }

        public synchronized boolean c() {
            this.f5001c = true;
            return a(false);
        }

        public synchronized boolean d(boolean z6) {
            this.f4999a = true;
            return a(z6);
        }

        public synchronized void e() {
            this.f5000b = false;
            this.f4999a = false;
            this.f5001c = false;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public enum g {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* renamed from: T4.h$h, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public enum EnumC0086h {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    public h(e eVar, y0.d dVar) {
        this.f4968d = eVar;
        this.f4969e = dVar;
    }

    public final v A(Object obj, R4.a aVar, t tVar) {
        R4.h l6 = l(aVar);
        com.bumptech.glide.load.data.e l7 = this.f4972h.i().l(obj);
        try {
            return tVar.a(l7, l6, this.f4976l, this.f4977m, new c(aVar));
        } finally {
            l7.b();
        }
    }

    public final void B() {
        int i6 = a.f4991a[this.f4983s.ordinal()];
        if (i6 == 1) {
            this.f4982r = k(EnumC0086h.INITIALIZE);
            this.f4961C = j();
            z();
        } else if (i6 == 2) {
            z();
        } else {
            if (i6 == 3) {
                i();
                return;
            }
            throw new IllegalStateException("Unrecognized run reason: " + this.f4983s);
        }
    }

    public final void C() {
        Throwable th;
        this.f4967c.c();
        if (!this.f4962D) {
            this.f4962D = true;
            return;
        }
        if (this.f4966b.isEmpty()) {
            th = null;
        } else {
            List list = this.f4966b;
            th = (Throwable) list.get(list.size() - 1);
        }
        throw new IllegalStateException("Already notified", th);
    }

    public boolean D() {
        EnumC0086h k6 = k(EnumC0086h.INITIALIZE);
        return k6 == EnumC0086h.RESOURCE_CACHE || k6 == EnumC0086h.DATA_CACHE;
    }

    @Override // T4.f.a
    public void a(R4.f fVar, Exception exc, com.bumptech.glide.load.data.d dVar, R4.a aVar) {
        dVar.b();
        q qVar = new q("Fetching data failed", exc);
        qVar.j(fVar, aVar, dVar.a());
        this.f4966b.add(qVar);
        if (Thread.currentThread() != this.f4987w) {
            y(g.SWITCH_TO_SOURCE_SERVICE);
        } else {
            z();
        }
    }

    public void b() {
        this.f4963E = true;
        T4.f fVar = this.f4961C;
        if (fVar != null) {
            fVar.cancel();
        }
    }

    @Override // T4.f.a
    public void c(R4.f fVar, Object obj, com.bumptech.glide.load.data.d dVar, R4.a aVar, R4.f fVar2) {
        this.f4988x = fVar;
        this.f4990z = obj;
        this.f4960B = dVar;
        this.f4959A = aVar;
        this.f4989y = fVar2;
        this.f4964F = fVar != this.f4965a.c().get(0);
        if (Thread.currentThread() != this.f4987w) {
            y(g.DECODE_DATA);
            return;
        }
        o5.b.a("DecodeJob.decodeFromRetrievedData");
        try {
            i();
        } finally {
            o5.b.e();
        }
    }

    @Override // T4.f.a
    public void d() {
        y(g.SWITCH_TO_SOURCE_SERVICE);
    }

    @Override // java.lang.Comparable
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compareTo(h hVar) {
        int m6 = m() - hVar.m();
        return m6 == 0 ? this.f4981q - hVar.f4981q : m6;
    }

    public final v f(com.bumptech.glide.load.data.d dVar, Object obj, R4.a aVar) {
        if (obj == null) {
            dVar.b();
            return null;
        }
        try {
            long b6 = n5.g.b();
            v h6 = h(obj, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                o("Decoded result " + h6, b6);
            }
            return h6;
        } finally {
            dVar.b();
        }
    }

    @Override // o5.a.f
    public o5.c g() {
        return this.f4967c;
    }

    public final v h(Object obj, R4.a aVar) {
        return A(obj, aVar, this.f4965a.h(obj.getClass()));
    }

    public final void i() {
        v vVar;
        if (Log.isLoggable("DecodeJob", 2)) {
            p("Retrieved data", this.f4984t, "data: " + this.f4990z + ", cache key: " + this.f4988x + ", fetcher: " + this.f4960B);
        }
        try {
            vVar = f(this.f4960B, this.f4990z, this.f4959A);
        } catch (q e6) {
            e6.i(this.f4989y, this.f4959A);
            this.f4966b.add(e6);
            vVar = null;
        }
        if (vVar != null) {
            r(vVar, this.f4959A, this.f4964F);
        } else {
            z();
        }
    }

    public final T4.f j() {
        int i6 = a.f4992b[this.f4982r.ordinal()];
        if (i6 == 1) {
            return new w(this.f4965a, this);
        }
        if (i6 == 2) {
            return new T4.c(this.f4965a, this);
        }
        if (i6 == 3) {
            return new z(this.f4965a, this);
        }
        if (i6 == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.f4982r);
    }

    public final EnumC0086h k(EnumC0086h enumC0086h) {
        int i6 = a.f4992b[enumC0086h.ordinal()];
        if (i6 == 1) {
            return this.f4978n.a() ? EnumC0086h.DATA_CACHE : k(EnumC0086h.DATA_CACHE);
        }
        if (i6 == 2) {
            return this.f4985u ? EnumC0086h.FINISHED : EnumC0086h.SOURCE;
        }
        if (i6 == 3 || i6 == 4) {
            return EnumC0086h.FINISHED;
        }
        if (i6 == 5) {
            return this.f4978n.b() ? EnumC0086h.RESOURCE_CACHE : k(EnumC0086h.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException("Unrecognized stage: " + enumC0086h);
    }

    public final R4.h l(R4.a aVar) {
        R4.h hVar = this.f4979o;
        boolean z6 = aVar == R4.a.RESOURCE_DISK_CACHE || this.f4965a.x();
        R4.g gVar = a5.p.f7770j;
        Boolean bool = (Boolean) hVar.c(gVar);
        if (bool != null && (!bool.booleanValue() || z6)) {
            return hVar;
        }
        R4.h hVar2 = new R4.h();
        hVar2.d(this.f4979o);
        hVar2.e(gVar, Boolean.valueOf(z6));
        return hVar2;
    }

    public final int m() {
        return this.f4974j.ordinal();
    }

    public h n(com.bumptech.glide.d dVar, Object obj, n nVar, R4.f fVar, int i6, int i7, Class cls, Class cls2, com.bumptech.glide.g gVar, j jVar, Map map, boolean z6, boolean z7, boolean z8, R4.h hVar, b bVar, int i8) {
        this.f4965a.v(dVar, obj, fVar, i6, i7, jVar, cls, cls2, gVar, hVar, map, z6, z7, this.f4968d);
        this.f4972h = dVar;
        this.f4973i = fVar;
        this.f4974j = gVar;
        this.f4975k = nVar;
        this.f4976l = i6;
        this.f4977m = i7;
        this.f4978n = jVar;
        this.f4985u = z8;
        this.f4979o = hVar;
        this.f4980p = bVar;
        this.f4981q = i8;
        this.f4983s = g.INITIALIZE;
        this.f4986v = obj;
        return this;
    }

    public final void o(String str, long j6) {
        p(str, j6, null);
    }

    public final void p(String str, long j6, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(n5.g.a(j6));
        sb.append(", load key: ");
        sb.append(this.f4975k);
        if (str2 != null) {
            str3 = ", " + str2;
        } else {
            str3 = "";
        }
        sb.append(str3);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sb.toString());
    }

    public final void q(v vVar, R4.a aVar, boolean z6) {
        C();
        this.f4980p.b(vVar, aVar, z6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r(v vVar, R4.a aVar, boolean z6) {
        u uVar;
        o5.b.a("DecodeJob.notifyEncodeAndRelease");
        try {
            if (vVar instanceof r) {
                ((r) vVar).c();
            }
            if (this.f4970f.c()) {
                vVar = u.d(vVar);
                uVar = vVar;
            } else {
                uVar = 0;
            }
            q(vVar, aVar, z6);
            this.f4982r = EnumC0086h.ENCODE;
            try {
                if (this.f4970f.c()) {
                    this.f4970f.b(this.f4968d, this.f4979o);
                }
                t();
                o5.b.e();
            } finally {
                if (uVar != 0) {
                    uVar.h();
                }
            }
        } catch (Throwable th) {
            o5.b.e();
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        o5.b.c("DecodeJob#run(reason=%s, model=%s)", this.f4983s, this.f4986v);
        com.bumptech.glide.load.data.d dVar = this.f4960B;
        try {
            try {
                try {
                    if (this.f4963E) {
                        s();
                        if (dVar != null) {
                            dVar.b();
                        }
                        o5.b.e();
                        return;
                    }
                    B();
                    if (dVar != null) {
                        dVar.b();
                    }
                    o5.b.e();
                } catch (T4.b e6) {
                    throw e6;
                }
            } catch (Throwable th) {
                if (Log.isLoggable("DecodeJob", 3)) {
                    Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.f4963E + ", stage: " + this.f4982r, th);
                }
                if (this.f4982r != EnumC0086h.ENCODE) {
                    this.f4966b.add(th);
                    s();
                }
                if (!this.f4963E) {
                    throw th;
                }
                throw th;
            }
        } catch (Throwable th2) {
            if (dVar != null) {
                dVar.b();
            }
            o5.b.e();
            throw th2;
        }
    }

    public final void s() {
        C();
        this.f4980p.d(new q("Failed to load resource", new ArrayList(this.f4966b)));
        u();
    }

    public final void t() {
        if (this.f4971g.b()) {
            x();
        }
    }

    public final void u() {
        if (this.f4971g.c()) {
            x();
        }
    }

    public v v(R4.a aVar, v vVar) {
        v vVar2;
        R4.l lVar;
        R4.c cVar;
        R4.f dVar;
        Class<?> cls = vVar.get().getClass();
        R4.k kVar = null;
        if (aVar != R4.a.RESOURCE_DISK_CACHE) {
            R4.l s6 = this.f4965a.s(cls);
            lVar = s6;
            vVar2 = s6.b(this.f4972h, vVar, this.f4976l, this.f4977m);
        } else {
            vVar2 = vVar;
            lVar = null;
        }
        if (!vVar.equals(vVar2)) {
            vVar.a();
        }
        if (this.f4965a.w(vVar2)) {
            kVar = this.f4965a.n(vVar2);
            cVar = kVar.a(this.f4979o);
        } else {
            cVar = R4.c.NONE;
        }
        R4.k kVar2 = kVar;
        if (!this.f4978n.d(!this.f4965a.y(this.f4988x), aVar, cVar)) {
            return vVar2;
        }
        if (kVar2 == null) {
            throw new i.d(vVar2.get().getClass());
        }
        int i6 = a.f4993c[cVar.ordinal()];
        if (i6 == 1) {
            dVar = new T4.d(this.f4988x, this.f4973i);
        } else {
            if (i6 != 2) {
                throw new IllegalArgumentException("Unknown strategy: " + cVar);
            }
            dVar = new x(this.f4965a.b(), this.f4988x, this.f4973i, this.f4976l, this.f4977m, lVar, cls, this.f4979o);
        }
        u d6 = u.d(vVar2);
        this.f4970f.d(dVar, kVar2, d6);
        return d6;
    }

    public void w(boolean z6) {
        if (this.f4971g.d(z6)) {
            x();
        }
    }

    public final void x() {
        this.f4971g.e();
        this.f4970f.a();
        this.f4965a.a();
        this.f4962D = false;
        this.f4972h = null;
        this.f4973i = null;
        this.f4979o = null;
        this.f4974j = null;
        this.f4975k = null;
        this.f4980p = null;
        this.f4982r = null;
        this.f4961C = null;
        this.f4987w = null;
        this.f4988x = null;
        this.f4990z = null;
        this.f4959A = null;
        this.f4960B = null;
        this.f4984t = 0L;
        this.f4963E = false;
        this.f4986v = null;
        this.f4966b.clear();
        this.f4969e.a(this);
    }

    public final void y(g gVar) {
        this.f4983s = gVar;
        this.f4980p.e(this);
    }

    public final void z() {
        this.f4987w = Thread.currentThread();
        this.f4984t = n5.g.b();
        boolean z6 = false;
        while (!this.f4963E && this.f4961C != null && !(z6 = this.f4961C.b())) {
            this.f4982r = k(this.f4982r);
            this.f4961C = j();
            if (this.f4982r == EnumC0086h.SOURCE) {
                y(g.SWITCH_TO_SOURCE_SERVICE);
                return;
            }
        }
        if ((this.f4982r == EnumC0086h.FINISHED || this.f4963E) && !z6) {
            s();
        }
    }
}
