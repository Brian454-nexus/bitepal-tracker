package T4;

import T4.f;
import X4.n;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class w implements f, d.a {

    /* renamed from: a, reason: collision with root package name */
    public final f.a f5118a;

    /* renamed from: b, reason: collision with root package name */
    public final g f5119b;

    /* renamed from: c, reason: collision with root package name */
    public int f5120c;

    /* renamed from: d, reason: collision with root package name */
    public int f5121d = -1;

    /* renamed from: e, reason: collision with root package name */
    public R4.f f5122e;

    /* renamed from: f, reason: collision with root package name */
    public List f5123f;

    /* renamed from: g, reason: collision with root package name */
    public int f5124g;

    /* renamed from: h, reason: collision with root package name */
    public volatile n.a f5125h;

    /* renamed from: i, reason: collision with root package name */
    public File f5126i;

    /* renamed from: j, reason: collision with root package name */
    public x f5127j;

    public w(g gVar, f.a aVar) {
        this.f5119b = gVar;
        this.f5118a = aVar;
    }

    private boolean a() {
        return this.f5124g < this.f5123f.size();
    }

    @Override // T4.f
    public boolean b() {
        o5.b.a("ResourceCacheGenerator.startNext");
        try {
            List c6 = this.f5119b.c();
            boolean z6 = false;
            if (c6.isEmpty()) {
                o5.b.e();
                return false;
            }
            List m6 = this.f5119b.m();
            if (m6.isEmpty()) {
                if (File.class.equals(this.f5119b.r())) {
                    o5.b.e();
                    return false;
                }
                throw new IllegalStateException("Failed to find any load path from " + this.f5119b.i() + " to " + this.f5119b.r());
            }
            while (true) {
                if (this.f5123f != null && a()) {
                    this.f5125h = null;
                    while (!z6 && a()) {
                        List list = this.f5123f;
                        int i6 = this.f5124g;
                        this.f5124g = i6 + 1;
                        this.f5125h = ((X4.n) list.get(i6)).a(this.f5126i, this.f5119b.t(), this.f5119b.f(), this.f5119b.k());
                        if (this.f5125h != null && this.f5119b.u(this.f5125h.f6278c.a())) {
                            this.f5125h.f6278c.e(this.f5119b.l(), this);
                            z6 = true;
                        }
                    }
                    o5.b.e();
                    return z6;
                }
                int i7 = this.f5121d + 1;
                this.f5121d = i7;
                if (i7 >= m6.size()) {
                    int i8 = this.f5120c + 1;
                    this.f5120c = i8;
                    if (i8 >= c6.size()) {
                        o5.b.e();
                        return false;
                    }
                    this.f5121d = 0;
                }
                R4.f fVar = (R4.f) c6.get(this.f5120c);
                Class cls = (Class) m6.get(this.f5121d);
                this.f5127j = new x(this.f5119b.b(), fVar, this.f5119b.p(), this.f5119b.t(), this.f5119b.f(), this.f5119b.s(cls), cls, this.f5119b.k());
                File a6 = this.f5119b.d().a(this.f5127j);
                this.f5126i = a6;
                if (a6 != null) {
                    this.f5122e = fVar;
                    this.f5123f = this.f5119b.j(a6);
                    this.f5124g = 0;
                }
            }
        } catch (Throwable th) {
            o5.b.e();
            throw th;
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void c(Exception exc) {
        this.f5118a.a(this.f5127j, exc, this.f5125h.f6278c, R4.a.RESOURCE_DISK_CACHE);
    }

    @Override // T4.f
    public void cancel() {
        n.a aVar = this.f5125h;
        if (aVar != null) {
            aVar.f6278c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void f(Object obj) {
        this.f5118a.c(this.f5122e, obj, this.f5125h.f6278c, R4.a.RESOURCE_DISK_CACHE, this.f5127j);
    }
}
