package z1;

import Z0.H;
import android.os.SystemClock;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: z1.c, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC2447c implements x {

    /* renamed from: a, reason: collision with root package name */
    public final H f21510a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21511b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f21512c;

    /* renamed from: d, reason: collision with root package name */
    public final int f21513d;

    /* renamed from: e, reason: collision with root package name */
    public final Z0.q[] f21514e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f21515f;

    /* renamed from: g, reason: collision with root package name */
    public int f21516g;

    public AbstractC2447c(H h6, int... iArr) {
        this(h6, iArr, 0);
    }

    public static /* synthetic */ int v(Z0.q qVar, Z0.q qVar2) {
        return qVar2.f6985i - qVar.f6985i;
    }

    @Override // z1.x
    public boolean b(int i6, long j6) {
        return this.f21515f[i6] > j6;
    }

    @Override // z1.InterfaceC2441A
    public final int c(Z0.q qVar) {
        for (int i6 = 0; i6 < this.f21511b; i6++) {
            if (this.f21514e[i6] == qVar) {
                return i6;
            }
        }
        return -1;
    }

    @Override // z1.InterfaceC2441A
    public final H e() {
        return this.f21510a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AbstractC2447c abstractC2447c = (AbstractC2447c) obj;
            if (this.f21510a.equals(abstractC2447c.f21510a) && Arrays.equals(this.f21512c, abstractC2447c.f21512c)) {
                return true;
            }
        }
        return false;
    }

    @Override // z1.InterfaceC2441A
    public final Z0.q h(int i6) {
        return this.f21514e[i6];
    }

    public int hashCode() {
        if (this.f21516g == 0) {
            this.f21516g = (System.identityHashCode(this.f21510a) * 31) + Arrays.hashCode(this.f21512c);
        }
        return this.f21516g;
    }

    @Override // z1.x
    public void i() {
    }

    @Override // z1.x
    public void j() {
    }

    @Override // z1.InterfaceC2441A
    public final int k(int i6) {
        return this.f21512c[i6];
    }

    @Override // z1.x
    public int l(long j6, List list) {
        return list.size();
    }

    @Override // z1.InterfaceC2441A
    public final int length() {
        return this.f21512c.length;
    }

    @Override // z1.x
    public final int m() {
        return this.f21512c[f()];
    }

    @Override // z1.x
    public final Z0.q n() {
        return this.f21514e[f()];
    }

    @Override // z1.x
    public boolean p(int i6, long j6) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean b6 = b(i6, elapsedRealtime);
        int i7 = 0;
        while (i7 < this.f21511b && !b6) {
            b6 = (i7 == i6 || b(i7, elapsedRealtime)) ? false : true;
            i7++;
        }
        if (!b6) {
            return false;
        }
        long[] jArr = this.f21515f;
        jArr[i6] = Math.max(jArr[i6], AbstractC1117K.b(elapsedRealtime, j6, LongCompanionObject.MAX_VALUE));
        return true;
    }

    @Override // z1.x
    public void q(float f6) {
    }

    @Override // z1.InterfaceC2441A
    public final int u(int i6) {
        for (int i7 = 0; i7 < this.f21511b; i7++) {
            if (this.f21512c[i7] == i6) {
                return i7;
            }
        }
        return -1;
    }

    public AbstractC2447c(H h6, int[] iArr, int i6) {
        int i7 = 0;
        AbstractC1119a.g(iArr.length > 0);
        this.f21513d = i6;
        this.f21510a = (H) AbstractC1119a.e(h6);
        int length = iArr.length;
        this.f21511b = length;
        this.f21514e = new Z0.q[length];
        for (int i8 = 0; i8 < iArr.length; i8++) {
            this.f21514e[i8] = h6.a(iArr[i8]);
        }
        Arrays.sort(this.f21514e, new Comparator() { // from class: z1.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AbstractC2447c.v((Z0.q) obj, (Z0.q) obj2);
            }
        });
        this.f21512c = new int[this.f21511b];
        while (true) {
            int i9 = this.f21511b;
            if (i7 < i9) {
                this.f21512c[i7] = h6.b(this.f21514e[i7]);
                i7++;
            } else {
                this.f21515f = new long[i9];
                return;
            }
        }
    }
}
