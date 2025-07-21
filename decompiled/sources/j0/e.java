package j0;

import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public int[] f16107a;

    /* renamed from: b, reason: collision with root package name */
    public int f16108b;

    /* renamed from: c, reason: collision with root package name */
    public int f16109c;

    /* renamed from: d, reason: collision with root package name */
    public int f16110d;

    public e() {
        this(0, 1, null);
    }

    public final void a(int i6) {
        int[] iArr = this.f16107a;
        int i7 = this.f16109c;
        iArr[i7] = i6;
        int i8 = this.f16110d & (i7 + 1);
        this.f16109c = i8;
        if (i8 == this.f16108b) {
            c();
        }
    }

    public final void b() {
        this.f16109c = this.f16108b;
    }

    public final void c() {
        int[] iArr = this.f16107a;
        int length = iArr.length;
        int i6 = this.f16108b;
        int i7 = length - i6;
        int i8 = length << 1;
        if (i8 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        int[] iArr2 = new int[i8];
        ArraysKt.copyInto(iArr, iArr2, 0, i6, length);
        ArraysKt.copyInto(this.f16107a, iArr2, i7, 0, this.f16108b);
        this.f16107a = iArr2;
        this.f16108b = 0;
        this.f16109c = length;
        this.f16110d = i8 - 1;
    }

    public final boolean d() {
        return this.f16108b == this.f16109c;
    }

    public final int e() {
        int i6 = this.f16108b;
        if (i6 == this.f16109c) {
            f fVar = f.f16111a;
            throw new ArrayIndexOutOfBoundsException();
        }
        int i7 = this.f16107a[i6];
        this.f16108b = (i6 + 1) & this.f16110d;
        return i7;
    }

    public e(int i6) {
        if (i6 < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        }
        if (i6 <= 1073741824) {
            i6 = Integer.bitCount(i6) != 1 ? Integer.highestOneBit(i6 - 1) << 1 : i6;
            this.f16110d = i6 - 1;
            this.f16107a = new int[i6];
            return;
        }
        throw new IllegalArgumentException("capacity must be <= 2^30");
    }

    public /* synthetic */ e(int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 8 : i6);
    }
}
