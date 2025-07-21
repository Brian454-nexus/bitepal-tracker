package y1;

import b2.C1081e;
import java.util.ArrayList;
import z6.D;
import z6.w;

/* renamed from: y1.f, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2349f implements InterfaceC2344a {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f21182a = new ArrayList();

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    @Override // y1.InterfaceC2344a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(b2.C1081e r10, long r11) {
        /*
            r9 = this;
            long r0 = r10.f10465b
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r4 = 1
            if (r0 == 0) goto Lf
            r0 = r4
            goto L10
        Lf:
            r0 = r1
        L10:
            c1.AbstractC1119a.a(r0)
            long r5 = r10.f10465b
            int r0 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r0 > 0) goto L25
            long r5 = r10.f10467d
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 == 0) goto L23
            int r0 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r0 >= 0) goto L25
        L23:
            r0 = r4
            goto L26
        L25:
            r0 = r1
        L26:
            java.util.ArrayList r2 = r9.f21182a
            int r2 = r2.size()
            int r2 = r2 - r4
        L2d:
            if (r2 < 0) goto L58
            long r5 = r10.f10465b
            java.util.ArrayList r3 = r9.f21182a
            java.lang.Object r3 = r3.get(r2)
            b2.e r3 = (b2.C1081e) r3
            long r7 = r3.f10465b
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 < 0) goto L46
            java.util.ArrayList r11 = r9.f21182a
            int r2 = r2 + r4
            r11.add(r2, r10)
            return r0
        L46:
            java.util.ArrayList r3 = r9.f21182a
            java.lang.Object r3 = r3.get(r2)
            b2.e r3 = (b2.C1081e) r3
            long r5 = r3.f10465b
            int r3 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r3 > 0) goto L55
            r0 = r1
        L55:
            int r2 = r2 + (-1)
            goto L2d
        L58:
            java.util.ArrayList r11 = r9.f21182a
            r11.add(r1, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.C2349f.a(b2.e, long):boolean");
    }

    @Override // y1.InterfaceC2344a
    public long b(long j6) {
        if (this.f21182a.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j6 < ((C1081e) this.f21182a.get(0)).f10465b) {
            return ((C1081e) this.f21182a.get(0)).f10465b;
        }
        for (int i6 = 1; i6 < this.f21182a.size(); i6++) {
            C1081e c1081e = (C1081e) this.f21182a.get(i6);
            if (j6 < c1081e.f10465b) {
                long j7 = ((C1081e) this.f21182a.get(i6 - 1)).f10467d;
                return (j7 == -9223372036854775807L || j7 <= j6 || j7 >= c1081e.f10465b) ? c1081e.f10465b : j7;
            }
        }
        long j8 = ((C1081e) D.d(this.f21182a)).f10467d;
        if (j8 == -9223372036854775807L || j6 >= j8) {
            return Long.MIN_VALUE;
        }
        return j8;
    }

    @Override // y1.InterfaceC2344a
    public w c(long j6) {
        int f6 = f(j6);
        if (f6 == 0) {
            return w.w();
        }
        C1081e c1081e = (C1081e) this.f21182a.get(f6 - 1);
        long j7 = c1081e.f10467d;
        return (j7 == -9223372036854775807L || j6 < j7) ? c1081e.f10464a : w.w();
    }

    @Override // y1.InterfaceC2344a
    public void clear() {
        this.f21182a.clear();
    }

    @Override // y1.InterfaceC2344a
    public long d(long j6) {
        if (this.f21182a.isEmpty() || j6 < ((C1081e) this.f21182a.get(0)).f10465b) {
            return -9223372036854775807L;
        }
        for (int i6 = 1; i6 < this.f21182a.size(); i6++) {
            long j7 = ((C1081e) this.f21182a.get(i6)).f10465b;
            if (j6 == j7) {
                return j7;
            }
            if (j6 < j7) {
                C1081e c1081e = (C1081e) this.f21182a.get(i6 - 1);
                long j8 = c1081e.f10467d;
                return (j8 == -9223372036854775807L || j8 > j6) ? c1081e.f10465b : j8;
            }
        }
        C1081e c1081e2 = (C1081e) D.d(this.f21182a);
        long j9 = c1081e2.f10467d;
        return (j9 == -9223372036854775807L || j6 < j9) ? c1081e2.f10465b : j9;
    }

    @Override // y1.InterfaceC2344a
    public void e(long j6) {
        int f6 = f(j6);
        if (f6 > 0) {
            this.f21182a.subList(0, f6).clear();
        }
    }

    public final int f(long j6) {
        for (int i6 = 0; i6 < this.f21182a.size(); i6++) {
            if (j6 < ((C1081e) this.f21182a.get(i6)).f10465b) {
                return i6;
            }
        }
        return this.f21182a.size();
    }
}
