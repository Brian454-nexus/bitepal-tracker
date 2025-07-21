package com.amazon.a.a.o.d;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class c implements Iterable<a> {

    /* renamed from: a, reason: collision with root package name */
    private Map<b, a> f11282a = new HashMap();

    public <T> c a(T t6, T t7, b bVar) {
        if (!a(t6, t7)) {
            this.f11282a.put(bVar, new a(bVar, "'" + t6 + "' != '" + t7 + "'"));
        }
        return this;
    }

    @Override // java.lang.Iterable
    public Iterator<a> iterator() {
        return this.f11282a.values().iterator();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Verifier:");
        Iterator<a> it = this.f11282a.values().iterator();
        while (it.hasNext()) {
            sb.append("\n\t" + it.next());
        }
        return sb.toString();
    }

    private boolean a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public <T extends Comparable<T>> c a(T t6, T t7, b bVar) {
        if (t6.compareTo(t7) <= 0) {
            this.f11282a.put(bVar, new a(bVar, "'" + t6 + "' <= '" + t7 + "'"));
        }
        return this;
    }

    public c a(Exception exc, b bVar) {
        this.f11282a.put(bVar, new a(bVar, "Exception: " + exc));
        return this;
    }

    public boolean a() {
        return !this.f11282a.isEmpty();
    }

    public boolean a(b bVar) {
        return this.f11282a.containsKey(bVar);
    }
}
