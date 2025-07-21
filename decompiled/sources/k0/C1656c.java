package k0;

import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: k0.c, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1656c {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f16305a;

    public C1656c(int i6, float f6) {
        this.f16305a = new LinkedHashMap(i6, f6, true);
    }

    public final Object a(Object key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f16305a.get(key);
    }

    public final Set b() {
        Set entrySet = this.f16305a.entrySet();
        Intrinsics.checkNotNullExpressionValue(entrySet, "map.entries");
        return entrySet;
    }

    public final boolean c() {
        return this.f16305a.isEmpty();
    }

    public final Object d(Object key, Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return this.f16305a.put(key, value);
    }

    public final Object e(Object key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f16305a.remove(key);
    }
}
