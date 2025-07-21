package j0;

import java.util.Arrays;
import k0.AbstractC1654a;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class l implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f16123a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ int[] f16124b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f16125c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f16126d;

    public l() {
        this(0, 1, null);
    }

    public void a(int i6, Object obj) {
        int i7 = this.f16126d;
        if (i7 != 0 && i6 <= this.f16124b[i7 - 1]) {
            g(i6, obj);
            return;
        }
        if (this.f16123a && i7 >= this.f16124b.length) {
            m.d(this);
        }
        int i8 = this.f16126d;
        if (i8 >= this.f16124b.length) {
            int e6 = AbstractC1654a.e(i8 + 1);
            int[] copyOf = Arrays.copyOf(this.f16124b, e6);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f16124b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f16125c, e6);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.f16125c = copyOf2;
        }
        this.f16124b[i8] = i6;
        this.f16125c[i8] = obj;
        this.f16126d = i8 + 1;
    }

    public void b() {
        int i6 = this.f16126d;
        Object[] objArr = this.f16125c;
        for (int i7 = 0; i7 < i6; i7++) {
            objArr[i7] = null;
        }
        this.f16126d = 0;
        this.f16123a = false;
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public l clone() {
        Object clone = super.clone();
        Intrinsics.checkNotNull(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        l lVar = (l) clone;
        lVar.f16124b = (int[]) this.f16124b.clone();
        lVar.f16125c = (Object[]) this.f16125c.clone();
        return lVar;
    }

    public Object e(int i6) {
        return m.c(this, i6);
    }

    public int f(int i6) {
        if (this.f16123a) {
            m.d(this);
        }
        return this.f16124b[i6];
    }

    public void g(int i6, Object obj) {
        Object obj2;
        int a6 = AbstractC1654a.a(this.f16124b, this.f16126d, i6);
        if (a6 >= 0) {
            this.f16125c[a6] = obj;
            return;
        }
        int i7 = ~a6;
        if (i7 < this.f16126d) {
            Object obj3 = this.f16125c[i7];
            obj2 = m.f16127a;
            if (obj3 == obj2) {
                this.f16124b[i7] = i6;
                this.f16125c[i7] = obj;
                return;
            }
        }
        if (this.f16123a && this.f16126d >= this.f16124b.length) {
            m.d(this);
            i7 = ~AbstractC1654a.a(this.f16124b, this.f16126d, i6);
        }
        int i8 = this.f16126d;
        if (i8 >= this.f16124b.length) {
            int e6 = AbstractC1654a.e(i8 + 1);
            int[] copyOf = Arrays.copyOf(this.f16124b, e6);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f16124b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f16125c, e6);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.f16125c = copyOf2;
        }
        int i9 = this.f16126d;
        if (i9 - i7 != 0) {
            int[] iArr = this.f16124b;
            int i10 = i7 + 1;
            ArraysKt.copyInto(iArr, iArr, i10, i7, i9);
            Object[] objArr = this.f16125c;
            ArraysKt.copyInto(objArr, objArr, i10, i7, this.f16126d);
        }
        this.f16124b[i7] = i6;
        this.f16125c[i7] = obj;
        this.f16126d++;
    }

    public int h() {
        if (this.f16123a) {
            m.d(this);
        }
        return this.f16126d;
    }

    public Object i(int i6) {
        if (this.f16123a) {
            m.d(this);
        }
        return this.f16125c[i6];
    }

    public String toString() {
        if (h() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f16126d * 28);
        sb.append('{');
        int i6 = this.f16126d;
        for (int i7 = 0; i7 < i6; i7++) {
            if (i7 > 0) {
                sb.append(", ");
            }
            sb.append(f(i7));
            sb.append('=');
            Object i8 = i(i7);
            if (i8 != this) {
                sb.append(i8);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "buffer.toString()");
        return sb2;
    }

    public l(int i6) {
        if (i6 == 0) {
            this.f16124b = AbstractC1654a.f16302a;
            this.f16125c = AbstractC1654a.f16304c;
        } else {
            int e6 = AbstractC1654a.e(i6);
            this.f16124b = new int[e6];
            this.f16125c = new Object[e6];
        }
    }

    public /* synthetic */ l(int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 10 : i6);
    }
}
