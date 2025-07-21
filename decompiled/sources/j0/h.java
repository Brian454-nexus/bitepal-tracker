package j0;

import java.util.Arrays;
import k0.AbstractC1654a;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class h implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f16115a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ long[] f16116b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f16117c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f16118d;

    public h() {
        this(0, 1, null);
    }

    public void a() {
        int i6 = this.f16118d;
        Object[] objArr = this.f16117c;
        for (int i7 = 0; i7 < i6; i7++) {
            objArr[i7] = null;
        }
        this.f16118d = 0;
        this.f16115a = false;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public h clone() {
        Object clone = super.clone();
        Intrinsics.checkNotNull(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        h hVar = (h) clone;
        hVar.f16116b = (long[]) this.f16116b.clone();
        hVar.f16117c = (Object[]) this.f16117c.clone();
        return hVar;
    }

    public void d(long j6) {
        Object obj;
        Object obj2;
        int b6 = AbstractC1654a.b(this.f16116b, this.f16118d, j6);
        if (b6 >= 0) {
            Object obj3 = this.f16117c[b6];
            obj = i.f16119a;
            if (obj3 != obj) {
                Object[] objArr = this.f16117c;
                obj2 = i.f16119a;
                objArr[b6] = obj2;
                this.f16115a = true;
            }
        }
    }

    public Object e(long j6) {
        Object obj;
        int b6 = AbstractC1654a.b(this.f16116b, this.f16118d, j6);
        if (b6 < 0) {
            return null;
        }
        Object obj2 = this.f16117c[b6];
        obj = i.f16119a;
        if (obj2 == obj) {
            return null;
        }
        return this.f16117c[b6];
    }

    public int f(long j6) {
        Object obj;
        if (this.f16115a) {
            int i6 = this.f16118d;
            long[] jArr = this.f16116b;
            Object[] objArr = this.f16117c;
            int i7 = 0;
            for (int i8 = 0; i8 < i6; i8++) {
                Object obj2 = objArr[i8];
                obj = i.f16119a;
                if (obj2 != obj) {
                    if (i8 != i7) {
                        jArr[i7] = jArr[i8];
                        objArr[i7] = obj2;
                        objArr[i8] = null;
                    }
                    i7++;
                }
            }
            this.f16115a = false;
            this.f16118d = i7;
        }
        return AbstractC1654a.b(this.f16116b, this.f16118d, j6);
    }

    public long g(int i6) {
        int i7;
        Object obj;
        if (i6 < 0 || i6 >= (i7 = this.f16118d)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i6).toString());
        }
        if (this.f16115a) {
            long[] jArr = this.f16116b;
            Object[] objArr = this.f16117c;
            int i8 = 0;
            for (int i9 = 0; i9 < i7; i9++) {
                Object obj2 = objArr[i9];
                obj = i.f16119a;
                if (obj2 != obj) {
                    if (i9 != i8) {
                        jArr[i8] = jArr[i9];
                        objArr[i8] = obj2;
                        objArr[i9] = null;
                    }
                    i8++;
                }
            }
            this.f16115a = false;
            this.f16118d = i8;
        }
        return this.f16116b[i6];
    }

    public void h(long j6, Object obj) {
        Object obj2;
        Object obj3;
        int b6 = AbstractC1654a.b(this.f16116b, this.f16118d, j6);
        if (b6 >= 0) {
            this.f16117c[b6] = obj;
            return;
        }
        int i6 = ~b6;
        if (i6 < this.f16118d) {
            Object obj4 = this.f16117c[i6];
            obj3 = i.f16119a;
            if (obj4 == obj3) {
                this.f16116b[i6] = j6;
                this.f16117c[i6] = obj;
                return;
            }
        }
        if (this.f16115a) {
            int i7 = this.f16118d;
            long[] jArr = this.f16116b;
            if (i7 >= jArr.length) {
                Object[] objArr = this.f16117c;
                int i8 = 0;
                for (int i9 = 0; i9 < i7; i9++) {
                    Object obj5 = objArr[i9];
                    obj2 = i.f16119a;
                    if (obj5 != obj2) {
                        if (i9 != i8) {
                            jArr[i8] = jArr[i9];
                            objArr[i8] = obj5;
                            objArr[i9] = null;
                        }
                        i8++;
                    }
                }
                this.f16115a = false;
                this.f16118d = i8;
                i6 = ~AbstractC1654a.b(this.f16116b, i8, j6);
            }
        }
        int i10 = this.f16118d;
        if (i10 >= this.f16116b.length) {
            int f6 = AbstractC1654a.f(i10 + 1);
            long[] copyOf = Arrays.copyOf(this.f16116b, f6);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f16116b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f16117c, f6);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.f16117c = copyOf2;
        }
        int i11 = this.f16118d;
        if (i11 - i6 != 0) {
            long[] jArr2 = this.f16116b;
            int i12 = i6 + 1;
            ArraysKt.copyInto(jArr2, jArr2, i12, i6, i11);
            Object[] objArr2 = this.f16117c;
            ArraysKt.copyInto(objArr2, objArr2, i12, i6, this.f16118d);
        }
        this.f16116b[i6] = j6;
        this.f16117c[i6] = obj;
        this.f16118d++;
    }

    public void i(int i6) {
        Object obj;
        Object obj2;
        Object obj3 = this.f16117c[i6];
        obj = i.f16119a;
        if (obj3 != obj) {
            Object[] objArr = this.f16117c;
            obj2 = i.f16119a;
            objArr[i6] = obj2;
            this.f16115a = true;
        }
    }

    public int j() {
        Object obj;
        if (this.f16115a) {
            int i6 = this.f16118d;
            long[] jArr = this.f16116b;
            Object[] objArr = this.f16117c;
            int i7 = 0;
            for (int i8 = 0; i8 < i6; i8++) {
                Object obj2 = objArr[i8];
                obj = i.f16119a;
                if (obj2 != obj) {
                    if (i8 != i7) {
                        jArr[i7] = jArr[i8];
                        objArr[i7] = obj2;
                        objArr[i8] = null;
                    }
                    i7++;
                }
            }
            this.f16115a = false;
            this.f16118d = i7;
        }
        return this.f16118d;
    }

    public Object k(int i6) {
        int i7;
        Object obj;
        if (i6 < 0 || i6 >= (i7 = this.f16118d)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i6).toString());
        }
        if (this.f16115a) {
            long[] jArr = this.f16116b;
            Object[] objArr = this.f16117c;
            int i8 = 0;
            for (int i9 = 0; i9 < i7; i9++) {
                Object obj2 = objArr[i9];
                obj = i.f16119a;
                if (obj2 != obj) {
                    if (i9 != i8) {
                        jArr[i8] = jArr[i9];
                        objArr[i8] = obj2;
                        objArr[i9] = null;
                    }
                    i8++;
                }
            }
            this.f16115a = false;
            this.f16118d = i8;
        }
        return this.f16117c[i6];
    }

    public String toString() {
        if (j() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f16118d * 28);
        sb.append('{');
        int i6 = this.f16118d;
        for (int i7 = 0; i7 < i6; i7++) {
            if (i7 > 0) {
                sb.append(", ");
            }
            sb.append(g(i7));
            sb.append('=');
            Object k6 = k(i7);
            if (k6 != sb) {
                sb.append(k6);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public h(int i6) {
        if (i6 == 0) {
            this.f16116b = AbstractC1654a.f16303b;
            this.f16117c = AbstractC1654a.f16304c;
        } else {
            int f6 = AbstractC1654a.f(i6);
            this.f16116b = new long[f6];
            this.f16117c = new Object[f6];
        }
    }

    public /* synthetic */ h(int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 10 : i6);
    }
}
