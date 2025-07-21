package T4;

import T4.f;
import X4.n;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class c implements f, d.a {

    /* renamed from: a, reason: collision with root package name */
    public final List f4927a;

    /* renamed from: b, reason: collision with root package name */
    public final g f4928b;

    /* renamed from: c, reason: collision with root package name */
    public final f.a f4929c;

    /* renamed from: d, reason: collision with root package name */
    public int f4930d;

    /* renamed from: e, reason: collision with root package name */
    public R4.f f4931e;

    /* renamed from: f, reason: collision with root package name */
    public List f4932f;

    /* renamed from: g, reason: collision with root package name */
    public int f4933g;

    /* renamed from: h, reason: collision with root package name */
    public volatile n.a f4934h;

    /* renamed from: i, reason: collision with root package name */
    public File f4935i;

    public c(g gVar, f.a aVar) {
        this(gVar.c(), gVar, aVar);
    }

    private boolean a() {
        return this.f4933g < this.f4932f.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
    
        if (r2 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001b, code lost:
    
        if (a() == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001d, code lost:
    
        r0 = r7.f4932f;
        r3 = r7.f4933g;
        r7.f4933g = r3 + 1;
        r7.f4934h = ((X4.n) r0.get(r3)).a(r7.f4935i, r7.f4928b.t(), r7.f4928b.f(), r7.f4928b.k());
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        if (r7.f4934h == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        if (r7.f4928b.u(r7.f4934h.f6278c.a()) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        r7.f4934h.f6278c.e(r7.f4928b.l(), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0012, code lost:
    
        r7.f4934h = null;
     */
    @Override // T4.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b() {
        /*
            r7 = this;
            java.lang.String r0 = "DataCacheGenerator.startNext"
            o5.b.a(r0)
        L5:
            java.util.List r0 = r7.f4932f     // Catch: java.lang.Throwable -> L68
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L6e
            boolean r0 = r7.a()     // Catch: java.lang.Throwable -> L68
            if (r0 != 0) goto L12
            goto L6e
        L12:
            r0 = 0
            r7.f4934h = r0     // Catch: java.lang.Throwable -> L68
        L15:
            if (r2 != 0) goto L6a
            boolean r0 = r7.a()     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L6a
            java.util.List r0 = r7.f4932f     // Catch: java.lang.Throwable -> L68
            int r3 = r7.f4933g     // Catch: java.lang.Throwable -> L68
            int r4 = r3 + 1
            r7.f4933g = r4     // Catch: java.lang.Throwable -> L68
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L68
            X4.n r0 = (X4.n) r0     // Catch: java.lang.Throwable -> L68
            java.io.File r3 = r7.f4935i     // Catch: java.lang.Throwable -> L68
            T4.g r4 = r7.f4928b     // Catch: java.lang.Throwable -> L68
            int r4 = r4.t()     // Catch: java.lang.Throwable -> L68
            T4.g r5 = r7.f4928b     // Catch: java.lang.Throwable -> L68
            int r5 = r5.f()     // Catch: java.lang.Throwable -> L68
            T4.g r6 = r7.f4928b     // Catch: java.lang.Throwable -> L68
            R4.h r6 = r6.k()     // Catch: java.lang.Throwable -> L68
            X4.n$a r0 = r0.a(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L68
            r7.f4934h = r0     // Catch: java.lang.Throwable -> L68
            X4.n$a r0 = r7.f4934h     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L15
            T4.g r0 = r7.f4928b     // Catch: java.lang.Throwable -> L68
            X4.n$a r3 = r7.f4934h     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.data.d r3 = r3.f6278c     // Catch: java.lang.Throwable -> L68
            java.lang.Class r3 = r3.a()     // Catch: java.lang.Throwable -> L68
            boolean r0 = r0.u(r3)     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L15
            X4.n$a r0 = r7.f4934h     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.data.d r0 = r0.f6278c     // Catch: java.lang.Throwable -> L68
            T4.g r2 = r7.f4928b     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.g r2 = r2.l()     // Catch: java.lang.Throwable -> L68
            r0.e(r2, r7)     // Catch: java.lang.Throwable -> L68
            r2 = r1
            goto L15
        L68:
            r0 = move-exception
            goto Lb0
        L6a:
            o5.b.e()
            return r2
        L6e:
            int r0 = r7.f4930d     // Catch: java.lang.Throwable -> L68
            int r0 = r0 + r1
            r7.f4930d = r0     // Catch: java.lang.Throwable -> L68
            java.util.List r1 = r7.f4927a     // Catch: java.lang.Throwable -> L68
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L68
            if (r0 < r1) goto L7f
            o5.b.e()
            return r2
        L7f:
            java.util.List r0 = r7.f4927a     // Catch: java.lang.Throwable -> L68
            int r1 = r7.f4930d     // Catch: java.lang.Throwable -> L68
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L68
            R4.f r0 = (R4.f) r0     // Catch: java.lang.Throwable -> L68
            T4.d r1 = new T4.d     // Catch: java.lang.Throwable -> L68
            T4.g r3 = r7.f4928b     // Catch: java.lang.Throwable -> L68
            R4.f r3 = r3.p()     // Catch: java.lang.Throwable -> L68
            r1.<init>(r0, r3)     // Catch: java.lang.Throwable -> L68
            T4.g r3 = r7.f4928b     // Catch: java.lang.Throwable -> L68
            V4.a r3 = r3.d()     // Catch: java.lang.Throwable -> L68
            java.io.File r1 = r3.a(r1)     // Catch: java.lang.Throwable -> L68
            r7.f4935i = r1     // Catch: java.lang.Throwable -> L68
            if (r1 == 0) goto L5
            r7.f4931e = r0     // Catch: java.lang.Throwable -> L68
            T4.g r0 = r7.f4928b     // Catch: java.lang.Throwable -> L68
            java.util.List r0 = r0.j(r1)     // Catch: java.lang.Throwable -> L68
            r7.f4932f = r0     // Catch: java.lang.Throwable -> L68
            r7.f4933g = r2     // Catch: java.lang.Throwable -> L68
            goto L5
        Lb0:
            o5.b.e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: T4.c.b():boolean");
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void c(Exception exc) {
        this.f4929c.a(this.f4931e, exc, this.f4934h.f6278c, R4.a.DATA_DISK_CACHE);
    }

    @Override // T4.f
    public void cancel() {
        n.a aVar = this.f4934h;
        if (aVar != null) {
            aVar.f6278c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void f(Object obj) {
        this.f4929c.c(this.f4931e, obj, this.f4934h.f6278c, R4.a.DATA_DISK_CACHE, this.f4931e);
    }

    public c(List list, g gVar, f.a aVar) {
        this.f4930d = -1;
        this.f4927a = list;
        this.f4928b = gVar;
        this.f4929c = aVar;
    }
}
