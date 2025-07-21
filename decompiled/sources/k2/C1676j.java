package k2;

import Z0.q;
import android.util.SparseArray;
import c1.AbstractC1122d;
import c1.C1144z;
import java.util.ArrayList;
import java.util.List;
import k2.K;

/* renamed from: k2.j, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1676j implements K.c {

    /* renamed from: a, reason: collision with root package name */
    public final int f16571a;

    /* renamed from: b, reason: collision with root package name */
    public final List f16572b;

    public C1676j(int i6) {
        this(i6, z6.w.w());
    }

    @Override // k2.K.c
    public SparseArray a() {
        return new SparseArray();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x002e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x0031. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0057  */
    @Override // k2.K.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k2.K b(int r5, k2.K.b r6) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.C1676j.b(int, k2.K$b):k2.K");
    }

    public final F c(K.b bVar) {
        return new F(e(bVar));
    }

    public final M d(K.b bVar) {
        return new M(e(bVar));
    }

    public final List e(K.b bVar) {
        String str;
        int i6;
        if (f(32)) {
            return this.f16572b;
        }
        C1144z c1144z = new C1144z(bVar.f16492e);
        List list = this.f16572b;
        while (c1144z.a() > 0) {
            int G6 = c1144z.G();
            int f6 = c1144z.f() + c1144z.G();
            if (G6 == 134) {
                list = new ArrayList();
                int G7 = c1144z.G() & 31;
                for (int i7 = 0; i7 < G7; i7++) {
                    String D6 = c1144z.D(3);
                    int G8 = c1144z.G();
                    boolean z6 = (G8 & 128) != 0;
                    if (z6) {
                        i6 = G8 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i6 = 1;
                    }
                    byte G9 = (byte) c1144z.G();
                    c1144z.U(1);
                    list.add(new q.b().o0(str).e0(D6).L(i6).b0(z6 ? AbstractC1122d.b((G9 & 64) != 0) : null).K());
                }
            }
            c1144z.T(f6);
        }
        return list;
    }

    public final boolean f(int i6) {
        return (i6 & this.f16571a) != 0;
    }

    public C1676j(int i6, List list) {
        this.f16571a = i6;
        this.f16572b = list;
    }
}
