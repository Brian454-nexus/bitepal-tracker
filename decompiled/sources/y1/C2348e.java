package y1;

import b2.C1081e;
import c1.AbstractC1119a;
import java.util.ArrayList;
import java.util.List;
import z6.Q;
import z6.w;

/* renamed from: y1.e, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2348e implements InterfaceC2344a {

    /* renamed from: b, reason: collision with root package name */
    public static final Q f21180b = Q.d().f(new y6.g() { // from class: y1.c
        public final Object apply(Object obj) {
            Long valueOf;
            valueOf = Long.valueOf(((C1081e) obj).f10465b);
            return valueOf;
        }
    }).a(Q.d().g().f(new y6.g() { // from class: y1.d
        public final Object apply(Object obj) {
            Long valueOf;
            valueOf = Long.valueOf(((C1081e) obj).f10466c);
            return valueOf;
        }
    }));

    /* renamed from: a, reason: collision with root package name */
    public final List f21181a = new ArrayList();

    @Override // y1.InterfaceC2344a
    public boolean a(C1081e c1081e, long j6) {
        AbstractC1119a.a(c1081e.f10465b != -9223372036854775807L);
        AbstractC1119a.a(c1081e.f10466c != -9223372036854775807L);
        boolean z6 = c1081e.f10465b <= j6 && j6 < c1081e.f10467d;
        for (int size = this.f21181a.size() - 1; size >= 0; size--) {
            if (c1081e.f10465b >= ((C1081e) this.f21181a.get(size)).f10465b) {
                this.f21181a.add(size + 1, c1081e);
                return z6;
            }
        }
        this.f21181a.add(0, c1081e);
        return z6;
    }

    @Override // y1.InterfaceC2344a
    public long b(long j6) {
        int i6 = 0;
        long j7 = -9223372036854775807L;
        while (true) {
            if (i6 >= this.f21181a.size()) {
                break;
            }
            long j8 = ((C1081e) this.f21181a.get(i6)).f10465b;
            long j9 = ((C1081e) this.f21181a.get(i6)).f10467d;
            if (j6 < j8) {
                j7 = j7 == -9223372036854775807L ? j8 : Math.min(j7, j8);
            } else {
                if (j6 < j9) {
                    j7 = j7 == -9223372036854775807L ? j9 : Math.min(j7, j9);
                }
                i6++;
            }
        }
        if (j7 != -9223372036854775807L) {
            return j7;
        }
        return Long.MIN_VALUE;
    }

    @Override // y1.InterfaceC2344a
    public w c(long j6) {
        if (!this.f21181a.isEmpty()) {
            if (j6 >= ((C1081e) this.f21181a.get(0)).f10465b) {
                ArrayList arrayList = new ArrayList();
                for (int i6 = 0; i6 < this.f21181a.size(); i6++) {
                    C1081e c1081e = (C1081e) this.f21181a.get(i6);
                    if (j6 >= c1081e.f10465b && j6 < c1081e.f10467d) {
                        arrayList.add(c1081e);
                    }
                    if (j6 < c1081e.f10465b) {
                        break;
                    }
                }
                w F6 = w.F(f21180b, arrayList);
                w.a o6 = w.o();
                for (int i7 = 0; i7 < F6.size(); i7++) {
                    o6.j(((C1081e) F6.get(i7)).f10464a);
                }
                return o6.k();
            }
        }
        return w.w();
    }

    @Override // y1.InterfaceC2344a
    public void clear() {
        this.f21181a.clear();
    }

    @Override // y1.InterfaceC2344a
    public long d(long j6) {
        if (this.f21181a.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j6 < ((C1081e) this.f21181a.get(0)).f10465b) {
            return -9223372036854775807L;
        }
        long j7 = ((C1081e) this.f21181a.get(0)).f10465b;
        for (int i6 = 0; i6 < this.f21181a.size(); i6++) {
            long j8 = ((C1081e) this.f21181a.get(i6)).f10465b;
            long j9 = ((C1081e) this.f21181a.get(i6)).f10467d;
            if (j9 > j6) {
                if (j8 > j6) {
                    break;
                }
                j7 = Math.max(j7, j8);
            } else {
                j7 = Math.max(j7, j9);
            }
        }
        return j7;
    }

    @Override // y1.InterfaceC2344a
    public void e(long j6) {
        int i6 = 0;
        while (i6 < this.f21181a.size()) {
            long j7 = ((C1081e) this.f21181a.get(i6)).f10465b;
            if (j6 > j7 && j6 > ((C1081e) this.f21181a.get(i6)).f10467d) {
                this.f21181a.remove(i6);
                i6--;
            } else if (j6 < j7) {
                return;
            }
            i6++;
        }
    }
}
