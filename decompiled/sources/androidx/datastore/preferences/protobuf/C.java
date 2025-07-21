package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C extends AbstractC1026c implements D, RandomAccess {

    /* renamed from: c, reason: collision with root package name */
    public static final C f8657c;

    /* renamed from: d, reason: collision with root package name */
    public static final D f8658d;

    /* renamed from: b, reason: collision with root package name */
    public final List f8659b;

    static {
        C c6 = new C();
        f8657c = c6;
        c6.d();
        f8658d = c6;
    }

    public C() {
        this(10);
    }

    public static String c(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof AbstractC1030g ? ((AbstractC1030g) obj).z() : AbstractC1047y.i((byte[]) obj);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1026c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void add(int i6, String str) {
        a();
        this.f8659b.add(i6, str);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1026c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        a();
        this.f8659b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1026c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public Object f(int i6) {
        return this.f8659b.get(i6);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1026c, androidx.datastore.preferences.protobuf.AbstractC1047y.b
    public /* bridge */ /* synthetic */ boolean g() {
        return super.g();
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public List getUnderlyingElements() {
        return Collections.unmodifiableList(this.f8659b);
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public D getUnmodifiableView() {
        return g() ? new o0(this) : this;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public String get(int i6) {
        Object obj = this.f8659b.get(i6);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC1030g) {
            AbstractC1030g abstractC1030g = (AbstractC1030g) obj;
            String z6 = abstractC1030g.z();
            if (abstractC1030g.o()) {
                this.f8659b.set(i6, z6);
            }
            return z6;
        }
        byte[] bArr = (byte[]) obj;
        String i7 = AbstractC1047y.i(bArr);
        if (AbstractC1047y.g(bArr)) {
            this.f8659b.set(i6, i7);
        }
        return i7;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1026c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1047y.b
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public C e(int i6) {
        if (i6 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i6);
        arrayList.addAll(this.f8659b);
        return new C(arrayList);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1026c, java.util.AbstractList, java.util.List
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public String remove(int i6) {
        a();
        Object remove = this.f8659b.remove(i6);
        ((AbstractList) this).modCount++;
        return c(remove);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public String set(int i6, String str) {
        a();
        return c(this.f8659b.set(i6, str));
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public void q(AbstractC1030g abstractC1030g) {
        a();
        this.f8659b.add(abstractC1030g);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1026c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1026c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f8659b.size();
    }

    public C(int i6) {
        this(new ArrayList(i6));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1026c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1026c, java.util.AbstractList, java.util.List
    public boolean addAll(int i6, Collection collection) {
        a();
        if (collection instanceof D) {
            collection = ((D) collection).getUnderlyingElements();
        }
        boolean addAll = this.f8659b.addAll(i6, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1026c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public C(ArrayList arrayList) {
        this.f8659b = arrayList;
    }
}
