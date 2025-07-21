package e5;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.k;
import com.bumptech.glide.l;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: e5.g, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C1277g {

    /* renamed from: a, reason: collision with root package name */
    public final Q4.a f13955a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f13956b;

    /* renamed from: c, reason: collision with root package name */
    public final List f13957c;

    /* renamed from: d, reason: collision with root package name */
    public final l f13958d;

    /* renamed from: e, reason: collision with root package name */
    public final U4.d f13959e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13960f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f13961g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f13962h;

    /* renamed from: i, reason: collision with root package name */
    public k f13963i;

    /* renamed from: j, reason: collision with root package name */
    public a f13964j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f13965k;

    /* renamed from: l, reason: collision with root package name */
    public a f13966l;

    /* renamed from: m, reason: collision with root package name */
    public Bitmap f13967m;

    /* renamed from: n, reason: collision with root package name */
    public R4.l f13968n;

    /* renamed from: o, reason: collision with root package name */
    public a f13969o;

    /* renamed from: p, reason: collision with root package name */
    public int f13970p;

    /* renamed from: q, reason: collision with root package name */
    public int f13971q;

    /* renamed from: r, reason: collision with root package name */
    public int f13972r;

    /* renamed from: e5.g$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a extends k5.c {

        /* renamed from: d, reason: collision with root package name */
        public final Handler f13973d;

        /* renamed from: e, reason: collision with root package name */
        public final int f13974e;

        /* renamed from: f, reason: collision with root package name */
        public final long f13975f;

        /* renamed from: g, reason: collision with root package name */
        public Bitmap f13976g;

        public a(Handler handler, int i6, long j6) {
            this.f13973d = handler;
            this.f13974e = i6;
            this.f13975f = j6;
        }

        public Bitmap b() {
            return this.f13976g;
        }

        @Override // k5.h
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void d(Bitmap bitmap, l5.b bVar) {
            this.f13976g = bitmap;
            this.f13973d.sendMessageAtTime(this.f13973d.obtainMessage(1, this), this.f13975f);
        }

        @Override // k5.h
        public void m(Drawable drawable) {
            this.f13976g = null;
        }
    }

    /* renamed from: e5.g$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface b {
        void a();
    }

    /* renamed from: e5.g$c */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class c implements Handler.Callback {
        public c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i6 = message.what;
            if (i6 == 1) {
                C1277g.this.m((a) message.obj);
                return true;
            }
            if (i6 != 2) {
                return false;
            }
            C1277g.this.f13958d.o((a) message.obj);
            return false;
        }
    }

    public C1277g(com.bumptech.glide.b bVar, Q4.a aVar, int i6, int i7, R4.l lVar, Bitmap bitmap) {
        this(bVar.f(), com.bumptech.glide.b.t(bVar.h()), aVar, null, i(com.bumptech.glide.b.t(bVar.h()), i6, i7), lVar, bitmap);
    }

    public static R4.f g() {
        return new m5.b(Double.valueOf(Math.random()));
    }

    public static k i(l lVar, int i6, int i7) {
        return lVar.c().a(((j5.h) ((j5.h) j5.h.h0(T4.j.f5019b).f0(true)).a0(true)).S(i6, i7));
    }

    public void a() {
        this.f13957c.clear();
        n();
        q();
        a aVar = this.f13964j;
        if (aVar != null) {
            this.f13958d.o(aVar);
            this.f13964j = null;
        }
        a aVar2 = this.f13966l;
        if (aVar2 != null) {
            this.f13958d.o(aVar2);
            this.f13966l = null;
        }
        a aVar3 = this.f13969o;
        if (aVar3 != null) {
            this.f13958d.o(aVar3);
            this.f13969o = null;
        }
        this.f13955a.clear();
        this.f13965k = true;
    }

    public ByteBuffer b() {
        return this.f13955a.getData().asReadOnlyBuffer();
    }

    public Bitmap c() {
        a aVar = this.f13964j;
        return aVar != null ? aVar.b() : this.f13967m;
    }

    public int d() {
        a aVar = this.f13964j;
        if (aVar != null) {
            return aVar.f13974e;
        }
        return -1;
    }

    public Bitmap e() {
        return this.f13967m;
    }

    public int f() {
        return this.f13955a.c();
    }

    public int h() {
        return this.f13972r;
    }

    public int j() {
        return this.f13955a.h() + this.f13970p;
    }

    public int k() {
        return this.f13971q;
    }

    public final void l() {
        if (!this.f13960f || this.f13961g) {
            return;
        }
        if (this.f13962h) {
            n5.k.a(this.f13969o == null, "Pending target must be null when starting from the first frame");
            this.f13955a.f();
            this.f13962h = false;
        }
        a aVar = this.f13969o;
        if (aVar != null) {
            this.f13969o = null;
            m(aVar);
            return;
        }
        this.f13961g = true;
        long uptimeMillis = SystemClock.uptimeMillis() + this.f13955a.d();
        this.f13955a.b();
        this.f13966l = new a(this.f13956b, this.f13955a.g(), uptimeMillis);
        this.f13963i.a(j5.h.i0(g())).t0(this.f13955a).o0(this.f13966l);
    }

    public void m(a aVar) {
        this.f13961g = false;
        if (this.f13965k) {
            this.f13956b.obtainMessage(2, aVar).sendToTarget();
            return;
        }
        if (!this.f13960f) {
            if (this.f13962h) {
                this.f13956b.obtainMessage(2, aVar).sendToTarget();
                return;
            } else {
                this.f13969o = aVar;
                return;
            }
        }
        if (aVar.b() != null) {
            n();
            a aVar2 = this.f13964j;
            this.f13964j = aVar;
            for (int size = this.f13957c.size() - 1; size >= 0; size--) {
                ((b) this.f13957c.get(size)).a();
            }
            if (aVar2 != null) {
                this.f13956b.obtainMessage(2, aVar2).sendToTarget();
            }
        }
        l();
    }

    public final void n() {
        Bitmap bitmap = this.f13967m;
        if (bitmap != null) {
            this.f13959e.c(bitmap);
            this.f13967m = null;
        }
    }

    public void o(R4.l lVar, Bitmap bitmap) {
        this.f13968n = (R4.l) n5.k.d(lVar);
        this.f13967m = (Bitmap) n5.k.d(bitmap);
        this.f13963i = this.f13963i.a(new j5.h().b0(lVar));
        this.f13970p = n5.l.i(bitmap);
        this.f13971q = bitmap.getWidth();
        this.f13972r = bitmap.getHeight();
    }

    public final void p() {
        if (this.f13960f) {
            return;
        }
        this.f13960f = true;
        this.f13965k = false;
        l();
    }

    public final void q() {
        this.f13960f = false;
    }

    public void r(b bVar) {
        if (this.f13965k) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        if (this.f13957c.contains(bVar)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean isEmpty = this.f13957c.isEmpty();
        this.f13957c.add(bVar);
        if (isEmpty) {
            p();
        }
    }

    public void s(b bVar) {
        this.f13957c.remove(bVar);
        if (this.f13957c.isEmpty()) {
            q();
        }
    }

    public C1277g(U4.d dVar, l lVar, Q4.a aVar, Handler handler, k kVar, R4.l lVar2, Bitmap bitmap) {
        this.f13957c = new ArrayList();
        this.f13958d = lVar;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new c()) : handler;
        this.f13959e = dVar;
        this.f13956b = handler;
        this.f13963i = kVar;
        this.f13955a = aVar;
        o(lVar2, bitmap);
    }
}
