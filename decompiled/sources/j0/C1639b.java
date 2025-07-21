package j0;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import k0.AbstractC1654a;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableCollection;
import kotlin.jvm.internal.markers.KMutableSet;

/* renamed from: j0.b, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1639b implements Collection, Set, KMutableCollection, KMutableSet {

    /* renamed from: a, reason: collision with root package name */
    public int[] f16103a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f16104b;

    /* renamed from: c, reason: collision with root package name */
    public int f16105c;

    /* renamed from: j0.b$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class a extends g {
        public a() {
            super(C1639b.this.i());
        }

        @Override // j0.g
        public Object a(int i6) {
            return C1639b.this.o(i6);
        }

        @Override // j0.g
        public void b(int i6) {
            C1639b.this.k(i6);
        }
    }

    public C1639b() {
        this(0, 1, null);
    }

    public final void a(int i6) {
        int i7 = i();
        if (c().length < i6) {
            int[] c6 = c();
            Object[] b6 = b();
            d.a(this, i6);
            if (i() > 0) {
                ArraysKt.copyInto$default(c6, c(), 0, 0, i(), 6, (Object) null);
                ArraysKt.copyInto$default(b6, b(), 0, 0, i(), 6, (Object) null);
            }
        }
        if (i() != i7) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        int i6;
        int c6;
        int i7 = i();
        if (obj == null) {
            c6 = d.d(this);
            i6 = 0;
        } else {
            int hashCode = obj.hashCode();
            i6 = hashCode;
            c6 = d.c(this, obj, hashCode);
        }
        if (c6 >= 0) {
            return false;
        }
        int i8 = ~c6;
        if (i7 >= c().length) {
            int i9 = 8;
            if (i7 >= 8) {
                i9 = (i7 >> 1) + i7;
            } else if (i7 < 4) {
                i9 = 4;
            }
            int[] c7 = c();
            Object[] b6 = b();
            d.a(this, i9);
            if (i7 != i()) {
                throw new ConcurrentModificationException();
            }
            if (!(c().length == 0)) {
                ArraysKt.copyInto$default(c7, c(), 0, 0, c7.length, 6, (Object) null);
                ArraysKt.copyInto$default(b6, b(), 0, 0, b6.length, 6, (Object) null);
            }
        }
        if (i8 < i7) {
            int i10 = i8 + 1;
            ArraysKt.copyInto(c(), c(), i10, i8, i7);
            ArraysKt.copyInto(b(), b(), i10, i8, i7);
        }
        if (i7 != i() || i8 >= c().length) {
            throw new ConcurrentModificationException();
        }
        c()[i8] = i6;
        b()[i8] = obj;
        n(i() + 1);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        a(i() + elements.size());
        Iterator it = elements.iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            z6 |= add(it.next());
        }
        return z6;
    }

    public final Object[] b() {
        return this.f16104b;
    }

    public final int[] c() {
        return this.f16103a;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        if (i() != 0) {
            m(AbstractC1654a.f16302a);
            l(AbstractC1654a.f16304c);
            n(0);
        }
        if (i() != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || size() != ((Set) obj).size()) {
            return false;
        }
        try {
            int i6 = i();
            for (int i7 = 0; i7 < i6; i7++) {
                if (!((Set) obj).contains(o(i7))) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public int h() {
        return this.f16105c;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] c6 = c();
        int i6 = i();
        int i7 = 0;
        for (int i8 = 0; i8 < i6; i8++) {
            i7 += c6[i8];
        }
        return i7;
    }

    public final int i() {
        return this.f16105c;
    }

    public final int indexOf(Object obj) {
        return obj == null ? d.d(this) : d.c(this, obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return i() <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new a();
    }

    public final Object k(int i6) {
        int i7;
        Object[] objArr;
        int i8 = i();
        Object obj = b()[i6];
        if (i8 <= 1) {
            clear();
            return obj;
        }
        int i9 = i8 - 1;
        if (c().length <= 8 || i() >= c().length / 3) {
            if (i6 < i9) {
                int i10 = i6 + 1;
                ArraysKt.copyInto(c(), c(), i6, i10, i8);
                ArraysKt.copyInto(b(), b(), i6, i10, i8);
            }
            b()[i9] = null;
        } else {
            int i11 = i() > 8 ? i() + (i() >> 1) : 8;
            int[] c6 = c();
            Object[] b6 = b();
            d.a(this, i11);
            if (i6 > 0) {
                ArraysKt.copyInto$default(c6, c(), 0, 0, i6, 6, (Object) null);
                objArr = b6;
                ArraysKt.copyInto$default(objArr, b(), 0, 0, i6, 6, (Object) null);
                i7 = i6;
            } else {
                i7 = i6;
                objArr = b6;
            }
            if (i7 < i9) {
                int i12 = i7 + 1;
                ArraysKt.copyInto(c6, c(), i7, i12, i8);
                ArraysKt.copyInto(objArr, b(), i7, i12, i8);
            }
        }
        if (i8 != i()) {
            throw new ConcurrentModificationException();
        }
        n(i9);
        return obj;
    }

    public final void l(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<set-?>");
        this.f16104b = objArr;
    }

    public final void m(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<set-?>");
        this.f16103a = iArr;
    }

    public final void n(int i6) {
        this.f16105c = i6;
    }

    public final Object o(int i6) {
        return b()[i6];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        k(indexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator it = elements.iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            z6 |= remove(it.next());
        }
        return z6;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z6 = false;
        for (int i6 = i() - 1; -1 < i6; i6--) {
            if (!CollectionsKt.contains(elements, b()[i6])) {
                k(i6);
                z6 = true;
            }
        }
        return z6;
    }

    @Override // java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return h();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return ArraysKt.copyOfRange(this.f16104b, 0, this.f16105c);
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i() * 14);
        sb.append('{');
        int i6 = i();
        for (int i7 = 0; i7 < i6; i7++) {
            if (i7 > 0) {
                sb.append(", ");
            }
            Object o6 = o(i7);
            if (o6 != this) {
                sb.append(o6);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public C1639b(int i6) {
        this.f16103a = AbstractC1654a.f16302a;
        this.f16104b = AbstractC1654a.f16304c;
        if (i6 > 0) {
            d.a(this, i6);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        Object[] result = c.a(array, this.f16105c);
        ArraysKt.copyInto(this.f16104b, result, 0, 0, this.f16105c);
        Intrinsics.checkNotNullExpressionValue(result, "result");
        return result;
    }

    public /* synthetic */ C1639b(int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0 : i6);
    }
}
