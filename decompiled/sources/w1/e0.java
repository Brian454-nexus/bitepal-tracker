package w1;

import Z0.G;
import Z0.u;
import android.net.Uri;
import c1.AbstractC1119a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class e0 extends Z0.G {

    /* renamed from: r, reason: collision with root package name */
    public static final Object f19975r = new Object();

    /* renamed from: s, reason: collision with root package name */
    public static final Z0.u f19976s = new u.c().c("SinglePeriodTimeline").g(Uri.EMPTY).a();

    /* renamed from: e, reason: collision with root package name */
    public final long f19977e;

    /* renamed from: f, reason: collision with root package name */
    public final long f19978f;

    /* renamed from: g, reason: collision with root package name */
    public final long f19979g;

    /* renamed from: h, reason: collision with root package name */
    public final long f19980h;

    /* renamed from: i, reason: collision with root package name */
    public final long f19981i;

    /* renamed from: j, reason: collision with root package name */
    public final long f19982j;

    /* renamed from: k, reason: collision with root package name */
    public final long f19983k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f19984l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f19985m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f19986n;

    /* renamed from: o, reason: collision with root package name */
    public final Object f19987o;

    /* renamed from: p, reason: collision with root package name */
    public final Z0.u f19988p;

    /* renamed from: q, reason: collision with root package name */
    public final u.g f19989q;

    public e0(long j6, boolean z6, boolean z7, boolean z8, Object obj, Z0.u uVar) {
        this(j6, j6, 0L, 0L, z6, z7, z8, obj, uVar);
    }

    @Override // Z0.G
    public int b(Object obj) {
        return f19975r.equals(obj) ? 0 : -1;
    }

    @Override // Z0.G
    public G.b g(int i6, G.b bVar, boolean z6) {
        AbstractC1119a.c(i6, 0, 1);
        return bVar.s(null, z6 ? f19975r : null, 0, this.f19980h, -this.f19982j);
    }

    @Override // Z0.G
    public int i() {
        return 1;
    }

    @Override // Z0.G
    public Object m(int i6) {
        AbstractC1119a.c(i6, 0, 1);
        return f19975r;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r1 > r3) goto L10;
     */
    @Override // Z0.G
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Z0.G.c o(int r25, Z0.G.c r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 0
            r2 = 1
            r3 = r25
            c1.AbstractC1119a.c(r3, r1, r2)
            long r1 = r0.f19983k
            boolean r14 = r0.f19985m
            if (r14 == 0) goto L2e
            boolean r3 = r0.f19986n
            if (r3 != 0) goto L2e
            r3 = 0
            int r3 = (r27 > r3 ? 1 : (r27 == r3 ? 0 : -1))
            if (r3 == 0) goto L2e
            long r3 = r0.f19981i
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L27
        L24:
            r16 = r5
            goto L30
        L27:
            long r1 = r1 + r27
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L2e
            goto L24
        L2e:
            r16 = r1
        L30:
            java.lang.Object r4 = Z0.G.c.f6674q
            Z0.u r5 = r0.f19988p
            java.lang.Object r6 = r0.f19987o
            long r7 = r0.f19977e
            long r9 = r0.f19978f
            long r11 = r0.f19979g
            boolean r13 = r0.f19984l
            Z0.u$g r15 = r0.f19989q
            long r1 = r0.f19981i
            r21 = 0
            r18 = r1
            long r1 = r0.f19982j
            r20 = 0
            r3 = r26
            r22 = r1
            Z0.G$c r1 = r3.g(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.e0.o(int, Z0.G$c, long):Z0.G$c");
    }

    @Override // Z0.G
    public int p() {
        return 1;
    }

    public e0(long j6, long j7, long j8, long j9, boolean z6, boolean z7, boolean z8, Object obj, Z0.u uVar) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j6, j7, j8, j9, z6, z7, false, obj, uVar, z8 ? uVar.f7066d : null);
    }

    public e0(long j6, long j7, long j8, long j9, long j10, long j11, long j12, boolean z6, boolean z7, boolean z8, Object obj, Z0.u uVar, u.g gVar) {
        this.f19977e = j6;
        this.f19978f = j7;
        this.f19979g = j8;
        this.f19980h = j9;
        this.f19981i = j10;
        this.f19982j = j11;
        this.f19983k = j12;
        this.f19984l = z6;
        this.f19985m = z7;
        this.f19986n = z8;
        this.f19987o = obj;
        this.f19988p = (Z0.u) AbstractC1119a.e(uVar);
        this.f19989q = gVar;
    }
}
