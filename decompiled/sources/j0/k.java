package j0;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import k0.AbstractC1654a;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public int[] f16120a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f16121b;

    /* renamed from: c, reason: collision with root package name */
    public int f16122c;

    public k() {
        this(0, 1, null);
    }

    public final int a(Object obj) {
        int i6 = this.f16122c * 2;
        Object[] objArr = this.f16121b;
        if (obj == null) {
            for (int i7 = 1; i7 < i6; i7 += 2) {
                if (objArr[i7] == null) {
                    return i7 >> 1;
                }
            }
            return -1;
        }
        for (int i8 = 1; i8 < i6; i8 += 2) {
            if (Intrinsics.areEqual(obj, objArr[i8])) {
                return i8 >> 1;
            }
        }
        return -1;
    }

    public void b(int i6) {
        int i7 = this.f16122c;
        int[] iArr = this.f16120a;
        if (iArr.length < i6) {
            int[] copyOf = Arrays.copyOf(iArr, i6);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f16120a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f16121b, i6 * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.f16121b = copyOf2;
        }
        if (this.f16122c != i7) {
            throw new ConcurrentModificationException();
        }
    }

    public final int c(Object obj, int i6) {
        int i7 = this.f16122c;
        if (i7 == 0) {
            return -1;
        }
        int a6 = AbstractC1654a.a(this.f16120a, i7, i6);
        if (a6 < 0 || Intrinsics.areEqual(obj, this.f16121b[a6 << 1])) {
            return a6;
        }
        int i8 = a6 + 1;
        while (i8 < i7 && this.f16120a[i8] == i6) {
            if (Intrinsics.areEqual(obj, this.f16121b[i8 << 1])) {
                return i8;
            }
            i8++;
        }
        for (int i9 = a6 - 1; i9 >= 0 && this.f16120a[i9] == i6; i9--) {
            if (Intrinsics.areEqual(obj, this.f16121b[i9 << 1])) {
                return i9;
            }
        }
        return ~i8;
    }

    public void clear() {
        if (this.f16122c > 0) {
            this.f16120a = AbstractC1654a.f16302a;
            this.f16121b = AbstractC1654a.f16304c;
            this.f16122c = 0;
        }
        if (this.f16122c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return d(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public int d(Object obj) {
        return obj == null ? e() : c(obj, obj.hashCode());
    }

    public final int e() {
        int i6 = this.f16122c;
        if (i6 == 0) {
            return -1;
        }
        int a6 = AbstractC1654a.a(this.f16120a, i6, 0);
        if (a6 < 0 || this.f16121b[a6 << 1] == null) {
            return a6;
        }
        int i7 = a6 + 1;
        while (i7 < i6 && this.f16120a[i7] == 0) {
            if (this.f16121b[i7 << 1] == null) {
                return i7;
            }
            i7++;
        }
        for (int i8 = a6 - 1; i8 >= 0 && this.f16120a[i8] == 0; i8--) {
            if (this.f16121b[i8 << 1] == null) {
                return i8;
            }
        }
        return ~i7;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof k) {
                if (size() != ((k) obj).size()) {
                    return false;
                }
                k kVar = (k) obj;
                int i6 = this.f16122c;
                for (int i7 = 0; i7 < i6; i7++) {
                    Object f6 = f(i7);
                    Object j6 = j(i7);
                    Object obj2 = kVar.get(f6);
                    if (j6 == null) {
                        if (obj2 != null || !kVar.containsKey(f6)) {
                            return false;
                        }
                    } else if (!Intrinsics.areEqual(j6, obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || size() != ((Map) obj).size()) {
                return false;
            }
            int i8 = this.f16122c;
            for (int i9 = 0; i9 < i8; i9++) {
                Object f7 = f(i9);
                Object j7 = j(i9);
                Object obj3 = ((Map) obj).get(f7);
                if (j7 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(f7)) {
                        return false;
                    }
                } else if (!Intrinsics.areEqual(j7, obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public Object f(int i6) {
        if (i6 >= 0 && i6 < this.f16122c) {
            return this.f16121b[i6 << 1];
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i6).toString());
    }

    public void g(k map) {
        Intrinsics.checkNotNullParameter(map, "map");
        int i6 = map.f16122c;
        b(this.f16122c + i6);
        if (this.f16122c != 0) {
            for (int i7 = 0; i7 < i6; i7++) {
                put(map.f(i7), map.j(i7));
            }
        } else if (i6 > 0) {
            ArraysKt.copyInto(map.f16120a, this.f16120a, 0, 0, i6);
            ArraysKt.copyInto(map.f16121b, this.f16121b, 0, 0, i6 << 1);
            this.f16122c = i6;
        }
    }

    public Object get(Object obj) {
        int d6 = d(obj);
        if (d6 >= 0) {
            return this.f16121b[(d6 << 1) + 1];
        }
        return null;
    }

    public Object getOrDefault(Object obj, Object obj2) {
        int d6 = d(obj);
        return d6 >= 0 ? this.f16121b[(d6 << 1) + 1] : obj2;
    }

    public Object h(int i6) {
        int i7;
        if (i6 < 0 || i6 >= (i7 = this.f16122c)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i6).toString());
        }
        Object[] objArr = this.f16121b;
        int i8 = i6 << 1;
        Object obj = objArr[i8 + 1];
        if (i7 <= 1) {
            clear();
            return obj;
        }
        int i9 = i7 - 1;
        int[] iArr = this.f16120a;
        if (iArr.length <= 8 || i7 >= iArr.length / 3) {
            if (i6 < i9) {
                int i10 = i6 + 1;
                ArraysKt.copyInto(iArr, iArr, i6, i10, i7);
                Object[] objArr2 = this.f16121b;
                ArraysKt.copyInto(objArr2, objArr2, i8, i10 << 1, i7 << 1);
            }
            Object[] objArr3 = this.f16121b;
            int i11 = i9 << 1;
            objArr3[i11] = null;
            objArr3[i11 + 1] = null;
        } else {
            int i12 = i7 > 8 ? i7 + (i7 >> 1) : 8;
            int[] copyOf = Arrays.copyOf(iArr, i12);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f16120a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f16121b, i12 << 1);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.f16121b = copyOf2;
            if (i7 != this.f16122c) {
                throw new ConcurrentModificationException();
            }
            if (i6 > 0) {
                ArraysKt.copyInto(iArr, this.f16120a, 0, 0, i6);
                ArraysKt.copyInto(objArr, this.f16121b, 0, 0, i8);
            }
            if (i6 < i9) {
                int i13 = i6 + 1;
                ArraysKt.copyInto(iArr, this.f16120a, i6, i13, i7);
                ArraysKt.copyInto(objArr, this.f16121b, i8, i13 << 1, i7 << 1);
            }
        }
        if (i7 != this.f16122c) {
            throw new ConcurrentModificationException();
        }
        this.f16122c = i9;
        return obj;
    }

    public int hashCode() {
        int[] iArr = this.f16120a;
        Object[] objArr = this.f16121b;
        int i6 = this.f16122c;
        int i7 = 1;
        int i8 = 0;
        int i9 = 0;
        while (i8 < i6) {
            Object obj = objArr[i7];
            i9 += (obj != null ? obj.hashCode() : 0) ^ iArr[i8];
            i8++;
            i7 += 2;
        }
        return i9;
    }

    public Object i(int i6, Object obj) {
        if (i6 < 0 || i6 >= this.f16122c) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i6).toString());
        }
        int i7 = (i6 << 1) + 1;
        Object[] objArr = this.f16121b;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
        return obj2;
    }

    public boolean isEmpty() {
        return this.f16122c <= 0;
    }

    public Object j(int i6) {
        if (i6 >= 0 && i6 < this.f16122c) {
            return this.f16121b[(i6 << 1) + 1];
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i6).toString());
    }

    public Object put(Object obj, Object obj2) {
        int i6 = this.f16122c;
        int hashCode = obj != null ? obj.hashCode() : 0;
        int c6 = obj != null ? c(obj, hashCode) : e();
        if (c6 >= 0) {
            int i7 = (c6 << 1) + 1;
            Object[] objArr = this.f16121b;
            Object obj3 = objArr[i7];
            objArr[i7] = obj2;
            return obj3;
        }
        int i8 = ~c6;
        int[] iArr = this.f16120a;
        if (i6 >= iArr.length) {
            int i9 = 8;
            if (i6 >= 8) {
                i9 = (i6 >> 1) + i6;
            } else if (i6 < 4) {
                i9 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i9);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f16120a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f16121b, i9 << 1);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.f16121b = copyOf2;
            if (i6 != this.f16122c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i8 < i6) {
            int[] iArr2 = this.f16120a;
            int i10 = i8 + 1;
            ArraysKt.copyInto(iArr2, iArr2, i10, i8, i6);
            Object[] objArr2 = this.f16121b;
            ArraysKt.copyInto(objArr2, objArr2, i10 << 1, i8 << 1, this.f16122c << 1);
        }
        int i11 = this.f16122c;
        if (i6 == i11) {
            int[] iArr3 = this.f16120a;
            if (i8 < iArr3.length) {
                iArr3[i8] = hashCode;
                Object[] objArr3 = this.f16121b;
                int i12 = i8 << 1;
                objArr3[i12] = obj;
                objArr3[i12 + 1] = obj2;
                this.f16122c = i11 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int d6 = d(obj);
        if (d6 >= 0) {
            return h(d6);
        }
        return null;
    }

    public Object replace(Object obj, Object obj2) {
        int d6 = d(obj);
        if (d6 >= 0) {
            return i(d6, obj2);
        }
        return null;
    }

    public int size() {
        return this.f16122c;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f16122c * 28);
        sb.append('{');
        int i6 = this.f16122c;
        for (int i7 = 0; i7 < i6; i7++) {
            if (i7 > 0) {
                sb.append(", ");
            }
            Object f6 = f(i7);
            if (f6 != sb) {
                sb.append(f6);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object j6 = j(i7);
            if (j6 != sb) {
                sb.append(j6);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public k(int i6) {
        int[] iArr;
        Object[] objArr;
        if (i6 == 0) {
            iArr = AbstractC1654a.f16302a;
        } else {
            iArr = new int[i6];
        }
        this.f16120a = iArr;
        if (i6 == 0) {
            objArr = AbstractC1654a.f16304c;
        } else {
            objArr = new Object[i6 << 1];
        }
        this.f16121b = objArr;
    }

    public boolean remove(Object obj, Object obj2) {
        int d6 = d(obj);
        if (d6 < 0 || !Intrinsics.areEqual(obj2, j(d6))) {
            return false;
        }
        h(d6);
        return true;
    }

    public boolean replace(Object obj, Object obj2, Object obj3) {
        int d6 = d(obj);
        if (d6 < 0 || !Intrinsics.areEqual(obj2, j(d6))) {
            return false;
        }
        i(d6, obj3);
        return true;
    }

    public /* synthetic */ k(int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0 : i6);
    }

    public k(k kVar) {
        this(0, 1, null);
        if (kVar != null) {
            g(kVar);
        }
    }
}
