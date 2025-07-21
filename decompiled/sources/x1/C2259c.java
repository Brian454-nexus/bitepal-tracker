package x1;

import E1.C0311m;
import E1.O;
import c1.AbstractC1133o;
import w1.a0;
import x1.InterfaceC2262f;

/* renamed from: x1.c, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2259c implements InterfaceC2262f.b {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f20408a;

    /* renamed from: b, reason: collision with root package name */
    public final a0[] f20409b;

    public C2259c(int[] iArr, a0[] a0VarArr) {
        this.f20408a = iArr;
        this.f20409b = a0VarArr;
    }

    @Override // x1.InterfaceC2262f.b
    public O a(int i6, int i7) {
        int i8 = 0;
        while (true) {
            int[] iArr = this.f20408a;
            if (i8 >= iArr.length) {
                AbstractC1133o.c("BaseMediaChunkOutput", "Unmatched track of type: " + i7);
                return new C0311m();
            }
            if (i7 == iArr[i8]) {
                return this.f20409b[i8];
            }
            i8++;
        }
    }

    public int[] b() {
        int[] iArr = new int[this.f20409b.length];
        int i6 = 0;
        while (true) {
            a0[] a0VarArr = this.f20409b;
            if (i6 >= a0VarArr.length) {
                return iArr;
            }
            iArr[i6] = a0VarArr[i6].H();
            i6++;
        }
    }

    public void c(long j6) {
        for (a0 a0Var : this.f20409b) {
            a0Var.a0(j6);
        }
    }
}
