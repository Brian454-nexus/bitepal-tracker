package com.amazon.a.a.o;

import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class g<T> implements Iterable<T> {

    /* renamed from: a, reason: collision with root package name */
    private WeakHashMap<T, Object> f11283a = new WeakHashMap<>();

    public void a(T t6) {
        this.f11283a.put(t6, null);
    }

    public void b(T t6) {
        this.f11283a.remove(t6);
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return this.f11283a.keySet().iterator();
    }

    public String toString() {
        return this.f11283a.keySet().toString();
    }

    public boolean a() {
        return this.f11283a.isEmpty();
    }

    public int b() {
        return this.f11283a.size();
    }
}
