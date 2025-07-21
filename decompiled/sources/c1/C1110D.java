package c1;

import java.util.Arrays;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: c1.D, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1110D {

    /* renamed from: a, reason: collision with root package name */
    public long[] f10551a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f10552b;

    /* renamed from: c, reason: collision with root package name */
    public int f10553c;

    /* renamed from: d, reason: collision with root package name */
    public int f10554d;

    public C1110D() {
        this(10);
    }

    public static Object[] f(int i6) {
        return new Object[i6];
    }

    public synchronized void a(long j6, Object obj) {
        d(j6);
        e();
        b(j6, obj);
    }

    public final void b(long j6, Object obj) {
        int i6 = this.f10553c;
        int i7 = this.f10554d;
        Object[] objArr = this.f10552b;
        int length = (i6 + i7) % objArr.length;
        this.f10551a[length] = j6;
        objArr[length] = obj;
        this.f10554d = i7 + 1;
    }

    public synchronized void c() {
        this.f10553c = 0;
        this.f10554d = 0;
        Arrays.fill(this.f10552b, (Object) null);
    }

    public final void d(long j6) {
        if (this.f10554d > 0) {
            if (j6 <= this.f10551a[((this.f10553c + r0) - 1) % this.f10552b.length]) {
                c();
            }
        }
    }

    public final void e() {
        int length = this.f10552b.length;
        if (this.f10554d < length) {
            return;
        }
        int i6 = length * 2;
        long[] jArr = new long[i6];
        Object[] f6 = f(i6);
        int i7 = this.f10553c;
        int i8 = length - i7;
        System.arraycopy(this.f10551a, i7, jArr, 0, i8);
        System.arraycopy(this.f10552b, this.f10553c, f6, 0, i8);
        int i9 = this.f10553c;
        if (i9 > 0) {
            System.arraycopy(this.f10551a, 0, jArr, i8, i9);
            System.arraycopy(this.f10552b, 0, f6, i8, this.f10553c);
        }
        this.f10551a = jArr;
        this.f10552b = f6;
        this.f10553c = 0;
    }

    public final Object g(long j6, boolean z6) {
        Object obj = null;
        long j7 = LongCompanionObject.MAX_VALUE;
        while (this.f10554d > 0) {
            long j8 = j6 - this.f10551a[this.f10553c];
            if (j8 < 0 && (z6 || (-j8) >= j7)) {
                break;
            }
            obj = j();
            j7 = j8;
        }
        return obj;
    }

    public synchronized Object h() {
        return this.f10554d == 0 ? null : j();
    }

    public synchronized Object i(long j6) {
        return g(j6, true);
    }

    public final Object j() {
        AbstractC1119a.g(this.f10554d > 0);
        Object[] objArr = this.f10552b;
        int i6 = this.f10553c;
        Object obj = objArr[i6];
        objArr[i6] = null;
        this.f10553c = (i6 + 1) % objArr.length;
        this.f10554d--;
        return obj;
    }

    public synchronized int k() {
        return this.f10554d;
    }

    public C1110D(int i6) {
        this.f10551a = new long[i6];
        this.f10552b = f(i6);
    }
}
