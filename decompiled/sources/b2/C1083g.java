package b2;

import c1.AbstractC1117K;
import c1.AbstractC1119a;
import z6.Q;

/* renamed from: b2.g, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1083g implements k {

    /* renamed from: c, reason: collision with root package name */
    public static final Q f10468c = Q.d().f(new y6.g() { // from class: b2.f
        public final Object apply(Object obj) {
            Comparable valueOf;
            valueOf = Long.valueOf(C1083g.g(((C1081e) obj).f10465b));
            return valueOf;
        }
    });

    /* renamed from: a, reason: collision with root package name */
    public final z6.w f10469a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f10470b;

    /* JADX WARN: Removed duplicated region for block: B:24:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1083g(java.util.List r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = 2
            r2 = 0
            r0.<init>()
            int r3 = r18.size()
            r4 = 1
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 != r4) goto L4c
            java.lang.Object r3 = z6.D.g(r18)
            b2.e r3 = (b2.C1081e) r3
            long r7 = r3.f10465b
            long r7 = g(r7)
            long r9 = r3.f10466c
            int r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r5 != 0) goto L34
            z6.w r1 = r3.f10464a
            z6.w r1 = z6.w.y(r1)
            r0.f10469a = r1
            long[] r1 = new long[r4]
            r1[r2] = r7
            r0.f10470b = r1
            return
        L34:
            z6.w r5 = r3.f10464a
            z6.w r6 = z6.w.w()
            z6.w r5 = z6.w.z(r5, r6)
            r0.f10469a = r5
            long r5 = r3.f10466c
            long r5 = r5 + r7
            long[] r1 = new long[r1]
            r1[r2] = r7
            r1[r4] = r5
            r0.f10470b = r1
            return
        L4c:
            int r3 = r18.size()
            int r3 = r3 * r1
            long[] r1 = new long[r3]
            r0.f10470b = r1
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.util.Arrays.fill(r1, r7)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            z6.Q r3 = b2.C1083g.f10468c
            r7 = r18
            z6.w r3 = z6.w.F(r3, r7)
            r7 = r2
        L6b:
            int r8 = r3.size()
            if (r2 >= r8) goto Ld6
            java.lang.Object r8 = r3.get(r2)
            b2.e r8 = (b2.C1081e) r8
            long r9 = r8.f10465b
            long r9 = g(r9)
            long r11 = r8.f10466c
            long r11 = r11 + r9
            if (r7 == 0) goto Lb4
            long[] r13 = r0.f10470b
            int r14 = r7 + (-1)
            r15 = r13[r14]
            int r13 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r13 >= 0) goto L8d
            goto Lb4
        L8d:
            int r13 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r13 != 0) goto La3
            java.lang.Object r13 = r1.get(r14)
            z6.w r13 = (z6.w) r13
            boolean r13 = r13.isEmpty()
            if (r13 == 0) goto La3
            z6.w r9 = r8.f10464a
            r1.set(r14, r9)
            goto Lc0
        La3:
            java.lang.String r13 = "CuesWithTimingSubtitle"
            java.lang.String r15 = "Truncating unsupported overlapping cues."
            c1.AbstractC1133o.h(r13, r15)
            long[] r13 = r0.f10470b
            r13[r14] = r9
            z6.w r9 = r8.f10464a
            r1.set(r14, r9)
            goto Lc0
        Lb4:
            long[] r13 = r0.f10470b
            int r14 = r7 + 1
            r13[r7] = r9
            z6.w r7 = r8.f10464a
            r1.add(r7)
            r7 = r14
        Lc0:
            long r8 = r8.f10466c
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 == 0) goto Ld4
            long[] r8 = r0.f10470b
            int r9 = r7 + 1
            r8[r7] = r11
            z6.w r7 = z6.w.w()
            r1.add(r7)
            r7 = r9
        Ld4:
            int r2 = r2 + r4
            goto L6b
        Ld6:
            z6.w r1 = z6.w.s(r1)
            r0.f10469a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.C1083g.<init>(java.util.List):void");
    }

    public static long g(long j6) {
        if (j6 == -9223372036854775807L) {
            return 0L;
        }
        return j6;
    }

    @Override // b2.k
    public int a(long j6) {
        int d6 = AbstractC1117K.d(this.f10470b, j6, false, false);
        if (d6 < this.f10469a.size()) {
            return d6;
        }
        return -1;
    }

    @Override // b2.k
    public long b(int i6) {
        AbstractC1119a.a(i6 < this.f10469a.size());
        return this.f10470b[i6];
    }

    @Override // b2.k
    public int d() {
        return this.f10469a.size();
    }

    @Override // b2.k
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public z6.w c(long j6) {
        int h6 = AbstractC1117K.h(this.f10470b, j6, true, false);
        return h6 == -1 ? z6.w.w() : (z6.w) this.f10469a.get(h6);
    }
}
