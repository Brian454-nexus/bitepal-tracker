package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class o0 extends AbstractList implements D, RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final D f8810a;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements ListIterator {

        /* renamed from: a, reason: collision with root package name */
        public ListIterator f8811a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f8812b;

        public a(int i6) {
            this.f8812b = i6;
            this.f8811a = o0.this.f8810a.listIterator(i6);
        }

        @Override // java.util.ListIterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f8811a.next();
        }

        @Override // java.util.ListIterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return (String) this.f8811a.previous();
        }

        @Override // java.util.ListIterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f8811a.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f8811a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f8811a.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f8811a.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class b implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        public Iterator f8814a;

        public b() {
            this.f8814a = o0.this.f8810a.iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f8814a.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f8814a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public o0(D d6) {
        this.f8810a = d6;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get(int i6) {
        return (String) this.f8810a.get(i6);
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public Object f(int i6) {
        return this.f8810a.f(i6);
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public List getUnderlyingElements() {
        return this.f8810a.getUnderlyingElements();
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public D getUnmodifiableView() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new b();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i6) {
        return new a(i6);
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public void q(AbstractC1030g abstractC1030g) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f8810a.size();
    }
}
