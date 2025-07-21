package T4;

import T4.f;
import X4.n;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class z implements f, f.a {

    /* renamed from: a, reason: collision with root package name */
    public final g f5139a;

    /* renamed from: b, reason: collision with root package name */
    public final f.a f5140b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f5141c;

    /* renamed from: d, reason: collision with root package name */
    public volatile c f5142d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f5143e;

    /* renamed from: f, reason: collision with root package name */
    public volatile n.a f5144f;

    /* renamed from: g, reason: collision with root package name */
    public volatile d f5145g;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements d.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n.a f5146a;

        public a(n.a aVar) {
            this.f5146a = aVar;
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void c(Exception exc) {
            if (z.this.g(this.f5146a)) {
                z.this.i(this.f5146a, exc);
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void f(Object obj) {
            if (z.this.g(this.f5146a)) {
                z.this.h(this.f5146a, obj);
            }
        }
    }

    public z(g gVar, f.a aVar) {
        this.f5139a = gVar;
        this.f5140b = aVar;
    }

    @Override // T4.f.a
    public void a(R4.f fVar, Exception exc, com.bumptech.glide.load.data.d dVar, R4.a aVar) {
        this.f5140b.a(fVar, exc, dVar, this.f5144f.f6278c.d());
    }

    @Override // T4.f
    public boolean b() {
        if (this.f5143e != null) {
            Object obj = this.f5143e;
            this.f5143e = null;
            try {
                if (!e(obj)) {
                    return true;
                }
            } catch (IOException e6) {
                if (Log.isLoggable("SourceGenerator", 3)) {
                    Log.d("SourceGenerator", "Failed to properly rewind or write data to cache", e6);
                }
            }
        }
        if (this.f5142d != null && this.f5142d.b()) {
            return true;
        }
        this.f5142d = null;
        this.f5144f = null;
        boolean z6 = false;
        while (!z6 && f()) {
            List g6 = this.f5139a.g();
            int i6 = this.f5141c;
            this.f5141c = i6 + 1;
            this.f5144f = (n.a) g6.get(i6);
            if (this.f5144f != null && (this.f5139a.e().c(this.f5144f.f6278c.d()) || this.f5139a.u(this.f5144f.f6278c.a()))) {
                j(this.f5144f);
                z6 = true;
            }
        }
        return z6;
    }

    @Override // T4.f.a
    public void c(R4.f fVar, Object obj, com.bumptech.glide.load.data.d dVar, R4.a aVar, R4.f fVar2) {
        this.f5140b.c(fVar, obj, dVar, this.f5144f.f6278c.d(), fVar);
    }

    @Override // T4.f
    public void cancel() {
        n.a aVar = this.f5144f;
        if (aVar != null) {
            aVar.f6278c.cancel();
        }
    }

    @Override // T4.f.a
    public void d() {
        throw new UnsupportedOperationException();
    }

    public final boolean e(Object obj) {
        Throwable th;
        long b6 = n5.g.b();
        boolean z6 = false;
        try {
            com.bumptech.glide.load.data.e o6 = this.f5139a.o(obj);
            Object a6 = o6.a();
            R4.d q6 = this.f5139a.q(a6);
            e eVar = new e(q6, a6, this.f5139a.k());
            d dVar = new d(this.f5144f.f6276a, this.f5139a.p());
            V4.a d6 = this.f5139a.d();
            d6.b(dVar, eVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + dVar + ", data: " + obj + ", encoder: " + q6 + ", duration: " + n5.g.a(b6));
            }
            if (d6.a(dVar) != null) {
                this.f5145g = dVar;
                this.f5142d = new c(Collections.singletonList(this.f5144f.f6276a), this.f5139a, this);
                this.f5144f.f6278c.b();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.f5145g + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.f5140b.c(this.f5144f.f6276a, o6.a(), this.f5144f.f6278c, this.f5144f.f6278c.d(), this.f5144f.f6276a);
                return false;
            } catch (Throwable th2) {
                th = th2;
                z6 = true;
                if (z6) {
                    throw th;
                }
                this.f5144f.f6278c.b();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final boolean f() {
        return this.f5141c < this.f5139a.g().size();
    }

    public boolean g(n.a aVar) {
        n.a aVar2 = this.f5144f;
        return aVar2 != null && aVar2 == aVar;
    }

    public void h(n.a aVar, Object obj) {
        j e6 = this.f5139a.e();
        if (obj != null && e6.c(aVar.f6278c.d())) {
            this.f5143e = obj;
            this.f5140b.d();
        } else {
            f.a aVar2 = this.f5140b;
            R4.f fVar = aVar.f6276a;
            com.bumptech.glide.load.data.d dVar = aVar.f6278c;
            aVar2.c(fVar, obj, dVar, dVar.d(), this.f5145g);
        }
    }

    public void i(n.a aVar, Exception exc) {
        f.a aVar2 = this.f5140b;
        d dVar = this.f5145g;
        com.bumptech.glide.load.data.d dVar2 = aVar.f6278c;
        aVar2.a(dVar, exc, dVar2, dVar2.d());
    }

    public final void j(n.a aVar) {
        this.f5144f.f6278c.e(this.f5139a.l(), new a(aVar));
    }
}
