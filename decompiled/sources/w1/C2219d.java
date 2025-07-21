package w1;

import E1.InterfaceC0314p;
import E1.InterfaceC0315q;
import c1.AbstractC1119a;

/* renamed from: w1.d, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2219d implements P {

    /* renamed from: a, reason: collision with root package name */
    public final E1.u f19959a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0314p f19960b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC0315q f19961c;

    public C2219d(E1.u uVar) {
        this.f19959a = uVar;
    }

    @Override // w1.P
    public void a(long j6, long j7) {
        ((InterfaceC0314p) AbstractC1119a.e(this.f19960b)).a(j6, j7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004e, code lost:
    
        if (r1.getPosition() != r11) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0051, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0079, code lost:
    
        if (r1.getPosition() != r11) goto L23;
     */
    @Override // w1.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(Z0.InterfaceC0837i r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, E1.r r15) {
        /*
            r7 = this;
            E1.i r1 = new E1.i
            r2 = r8
            r3 = r11
            r5 = r13
            r1.<init>(r2, r3, r5)
            r7.f19961c = r1
            E1.p r8 = r7.f19960b
            if (r8 == 0) goto Lf
            return
        Lf:
            E1.u r8 = r7.f19959a
            E1.p[] r8 = r8.e(r9, r10)
            int r10 = r8.length
            z6.w$a r10 = z6.w.p(r10)
            int r11 = r8.length
            r12 = 0
            r13 = 1
            if (r11 != r13) goto L25
            r8 = r8[r12]
            r7.f19960b = r8
            goto L83
        L25:
            int r11 = r8.length
            r14 = r12
        L27:
            if (r14 >= r11) goto L7f
            r0 = r8[r14]
            boolean r2 = r0.i(r1)     // Catch: java.lang.Throwable -> L3a java.io.EOFException -> L6f
            if (r2 == 0) goto L3d
            r7.f19960b = r0     // Catch: java.lang.Throwable -> L3a java.io.EOFException -> L6f
            c1.AbstractC1119a.g(r13)
            r1.o()
            goto L7f
        L3a:
            r0 = move-exception
            r8 = r0
            goto L5b
        L3d:
            java.util.List r0 = r0.h()     // Catch: java.lang.Throwable -> L3a java.io.EOFException -> L6f
            r10.j(r0)     // Catch: java.lang.Throwable -> L3a java.io.EOFException -> L6f
            E1.p r0 = r7.f19960b
            if (r0 != 0) goto L53
            long r5 = r1.getPosition()
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L51
            goto L53
        L51:
            r0 = r12
            goto L54
        L53:
            r0 = r13
        L54:
            c1.AbstractC1119a.g(r0)
            r1.o()
            goto L7c
        L5b:
            E1.p r9 = r7.f19960b
            if (r9 != 0) goto L67
            long r9 = r1.getPosition()
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 != 0) goto L68
        L67:
            r12 = r13
        L68:
            c1.AbstractC1119a.g(r12)
            r1.o()
            throw r8
        L6f:
            E1.p r0 = r7.f19960b
            if (r0 != 0) goto L53
            long r5 = r1.getPosition()
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L51
            goto L53
        L7c:
            int r14 = r14 + 1
            goto L27
        L7f:
            E1.p r11 = r7.f19960b
            if (r11 == 0) goto L89
        L83:
            E1.p r8 = r7.f19960b
            r8.c(r15)
            return
        L89:
            w1.m0 r11 = new w1.m0
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "None of the available extractors ("
            r12.append(r13)
            java.lang.String r13 = ", "
            y6.h r13 = y6.h.g(r13)
            z6.w r8 = z6.w.t(r8)
            w1.c r14 = new w1.c
            r14.<init>()
            java.util.List r8 = z6.G.k(r8, r14)
            java.lang.String r8 = r13.d(r8)
            r12.append(r8)
            java.lang.String r8 = ") could read the stream."
            r12.append(r8)
            java.lang.String r8 = r12.toString()
            java.lang.Object r9 = c1.AbstractC1119a.e(r9)
            android.net.Uri r9 = (android.net.Uri) r9
            z6.w r10 = r10.k()
            r11.<init>(r8, r9, r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.C2219d.b(Z0.i, android.net.Uri, java.util.Map, long, long, E1.r):void");
    }

    @Override // w1.P
    public long c() {
        InterfaceC0315q interfaceC0315q = this.f19961c;
        if (interfaceC0315q != null) {
            return interfaceC0315q.getPosition();
        }
        return -1L;
    }

    @Override // w1.P
    public void d() {
        InterfaceC0314p interfaceC0314p = this.f19960b;
        if (interfaceC0314p == null) {
            return;
        }
        InterfaceC0314p d6 = interfaceC0314p.d();
        if (d6 instanceof X1.f) {
            ((X1.f) d6).l();
        }
    }

    @Override // w1.P
    public int e(E1.I i6) {
        return ((InterfaceC0314p) AbstractC1119a.e(this.f19960b)).g((InterfaceC0315q) AbstractC1119a.e(this.f19961c), i6);
    }

    @Override // w1.P
    public void release() {
        InterfaceC0314p interfaceC0314p = this.f19960b;
        if (interfaceC0314p != null) {
            interfaceC0314p.release();
            this.f19960b = null;
        }
        this.f19961c = null;
    }
}
