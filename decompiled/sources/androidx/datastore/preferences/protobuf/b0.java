package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class b0 extends AbstractC1026c implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public static final b0 f8710d;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f8711b;

    /* renamed from: c, reason: collision with root package name */
    public int f8712c;

    static {
        b0 b0Var = new b0(new Object[0], 0);
        f8710d = b0Var;
        b0Var.d();
    }

    public b0(Object[] objArr, int i6) {
        this.f8711b = objArr;
        this.f8712c = i6;
    }

    public static Object[] b(int i6) {
        return new Object[i6];
    }

    public static b0 c() {
        return f8710d;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1026c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        a();
        int i6 = this.f8712c;
        Object[] objArr = this.f8711b;
        if (i6 == objArr.length) {
            this.f8711b = Arrays.copyOf(objArr, ((i6 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f8711b;
        int i7 = this.f8712c;
        this.f8712c = i7 + 1;
        objArr2[i7] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i6) {
        h(i6);
        return this.f8711b[i6];
    }

    public final void h(int i6) {
        if (i6 < 0 || i6 >= this.f8712c) {
            throw new IndexOutOfBoundsException(i(i6));
        }
    }

    public final String i(int i6) {
        return "Index:" + i6 + ", Size:" + this.f8712c;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1047y.b
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public b0 e(int i6) {
        if (i6 >= this.f8712c) {
            return new b0(Arrays.copyOf(this.f8711b, i6), this.f8712c);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1026c, java.util.AbstractList, java.util.List
    public Object remove(int i6) {
        a();
        h(i6);
        Object[] objArr = this.f8711b;
        Object obj = objArr[i6];
        if (i6 < this.f8712c - 1) {
            System.arraycopy(objArr, i6 + 1, objArr, i6, (r2 - i6) - 1);
        }
        this.f8712c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i6, Object obj) {
        a();
        h(i6);
        Object[] objArr = this.f8711b;
        Object obj2 = objArr[i6];
        objArr[i6] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f8712c;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i6, Object obj) {
        int i7;
        a();
        if (i6 >= 0 && i6 <= (i7 = this.f8712c)) {
            Object[] objArr = this.f8711b;
            if (i7 < objArr.length) {
                System.arraycopy(objArr, i6, objArr, i6 + 1, i7 - i6);
            } else {
                Object[] b6 = b(((i7 * 3) / 2) + 1);
                System.arraycopy(this.f8711b, 0, b6, 0, i6);
                System.arraycopy(this.f8711b, i6, b6, i6 + 1, this.f8712c - i6);
                this.f8711b = b6;
            }
            this.f8711b[i6] = obj;
            this.f8712c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(i(i6));
    }
}
