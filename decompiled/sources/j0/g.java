package j0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.markers.KMutableIterator;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class g implements Iterator, KMutableIterator {

    /* renamed from: a, reason: collision with root package name */
    public int f16112a;

    /* renamed from: b, reason: collision with root package name */
    public int f16113b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f16114c;

    public g(int i6) {
        this.f16112a = i6;
    }

    public abstract Object a(int i6);

    public abstract void b(int i6);

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f16113b < this.f16112a;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object a6 = a(this.f16113b);
        this.f16113b++;
        this.f16114c = true;
        return a6;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.f16114c) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i6 = this.f16113b - 1;
        this.f16113b = i6;
        b(i6);
        this.f16112a--;
        this.f16114c = false;
    }
}
