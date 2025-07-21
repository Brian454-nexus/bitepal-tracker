package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class I extends LinkedHashMap {

    /* renamed from: b, reason: collision with root package name */
    public static final I f8673b;

    /* renamed from: a, reason: collision with root package name */
    public boolean f8674a;

    static {
        I i6 = new I();
        f8673b = i6;
        i6.j();
    }

    public I() {
        this.f8674a = true;
    }

    public static int a(Map map) {
        int i6 = 0;
        for (Map.Entry entry : map.entrySet()) {
            i6 += b(entry.getValue()) ^ b(entry.getKey());
        }
        return i6;
    }

    public static int b(Object obj) {
        return obj instanceof byte[] ? AbstractC1047y.d((byte[]) obj) : obj.hashCode();
    }

    public static void d(Map map) {
        for (Object obj : map.keySet()) {
            AbstractC1047y.a(obj);
            AbstractC1047y.a(map.get(obj));
        }
    }

    public static I e() {
        return f8673b;
    }

    public static boolean g(Object obj, Object obj2) {
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : obj.equals(obj2);
    }

    public static boolean h(Map map, Map map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !g(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        f();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && h(this, (Map) obj);
    }

    public final void f() {
        if (!i()) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return a(this);
    }

    public boolean i() {
        return this.f8674a;
    }

    public void j() {
        this.f8674a = false;
    }

    public void k(I i6) {
        f();
        if (i6.isEmpty()) {
            return;
        }
        putAll(i6);
    }

    public I l() {
        return isEmpty() ? new I() : new I(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        f();
        AbstractC1047y.a(obj);
        AbstractC1047y.a(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map map) {
        f();
        d(map);
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        f();
        return super.remove(obj);
    }

    public I(Map map) {
        super(map);
        this.f8674a = true;
    }
}
