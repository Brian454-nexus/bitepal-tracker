package j0;

import java.util.LinkedHashMap;
import java.util.Map;
import k0.C1655b;
import k0.C1656c;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class j {
    private int createCount;
    private int evictionCount;
    private int hitCount;

    @NotNull
    private final C1655b lock;

    @NotNull
    private final C1656c map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public j(int i6) {
        this.maxSize = i6;
        if (i6 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.map = new C1656c(0, 0.75f);
        this.lock = new C1655b();
    }

    public final int a(Object obj, Object obj2) {
        int sizeOf = sizeOf(obj, obj2);
        if (sizeOf >= 0) {
            return sizeOf;
        }
        throw new IllegalStateException(("Negative size: " + obj + '=' + obj2).toString());
    }

    @Nullable
    public Object create(@NotNull Object key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return null;
    }

    public final int createCount() {
        int i6;
        synchronized (this.lock) {
            i6 = this.createCount;
        }
        return i6;
    }

    public void entryRemoved(boolean z6, @NotNull Object key, @NotNull Object oldValue, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final int evictionCount() {
        int i6;
        synchronized (this.lock) {
            i6 = this.evictionCount;
        }
        return i6;
    }

    @Nullable
    public final Object get(@NotNull Object key) {
        Object d6;
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (this.lock) {
            Object a6 = this.map.a(key);
            if (a6 != null) {
                this.hitCount++;
                return a6;
            }
            this.missCount++;
            Object create = create(key);
            if (create == null) {
                return null;
            }
            synchronized (this.lock) {
                try {
                    this.createCount++;
                    d6 = this.map.d(key, create);
                    if (d6 != null) {
                        this.map.d(key, d6);
                    } else {
                        this.size += a(key, create);
                        Unit unit = Unit.INSTANCE;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (d6 != null) {
                entryRemoved(false, key, create, d6);
                return d6;
            }
            trimToSize(this.maxSize);
            return create;
        }
    }

    public final int hitCount() {
        int i6;
        synchronized (this.lock) {
            i6 = this.hitCount;
        }
        return i6;
    }

    public final int maxSize() {
        int i6;
        synchronized (this.lock) {
            i6 = this.maxSize;
        }
        return i6;
    }

    public final int missCount() {
        int i6;
        synchronized (this.lock) {
            i6 = this.missCount;
        }
        return i6;
    }

    @Nullable
    public final Object put(@NotNull Object key, @NotNull Object value) {
        Object d6;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        synchronized (this.lock) {
            try {
                this.putCount++;
                this.size += a(key, value);
                d6 = this.map.d(key, value);
                if (d6 != null) {
                    this.size -= a(key, d6);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (d6 != null) {
            entryRemoved(false, key, d6, value);
        }
        trimToSize(this.maxSize);
        return d6;
    }

    public final int putCount() {
        int i6;
        synchronized (this.lock) {
            i6 = this.putCount;
        }
        return i6;
    }

    @Nullable
    public final Object remove(@NotNull Object key) {
        Object e6;
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (this.lock) {
            try {
                e6 = this.map.e(key);
                if (e6 != null) {
                    this.size -= a(key, e6);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (e6 != null) {
            entryRemoved(false, key, e6, null);
        }
        return e6;
    }

    public void resize(int i6) {
        if (i6 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        synchronized (this.lock) {
            this.maxSize = i6;
            Unit unit = Unit.INSTANCE;
        }
        trimToSize(i6);
    }

    public final int size() {
        int i6;
        synchronized (this.lock) {
            i6 = this.size;
        }
        return i6;
    }

    public int sizeOf(@NotNull Object key, @NotNull Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return 1;
    }

    @NotNull
    public final Map<Object, Object> snapshot() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (this.lock) {
            try {
                for (Map.Entry entry : this.map.b()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        return linkedHashMap;
    }

    @NotNull
    public String toString() {
        String str;
        synchronized (this.lock) {
            try {
                int i6 = this.hitCount;
                int i7 = this.missCount + i6;
                str = "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + (i7 != 0 ? (i6 * 100) / i7 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005e, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void trimToSize(int r6) {
        /*
            r5 = this;
        L0:
            k0.b r0 = r5.lock
            monitor-enter(r0)
            int r1 = r5.size     // Catch: java.lang.Throwable -> L14
            if (r1 < 0) goto L57
            k0.c r1 = r5.map     // Catch: java.lang.Throwable -> L14
            boolean r1 = r1.c()     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L16
            int r1 = r5.size     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L57
            goto L16
        L14:
            r6 = move-exception
            goto L5f
        L16:
            int r1 = r5.size     // Catch: java.lang.Throwable -> L14
            if (r1 <= r6) goto L55
            k0.c r1 = r5.map     // Catch: java.lang.Throwable -> L14
            boolean r1 = r1.c()     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L23
            goto L55
        L23:
            k0.c r1 = r5.map     // Catch: java.lang.Throwable -> L14
            java.util.Set r1 = r1.b()     // Catch: java.lang.Throwable -> L14
            java.lang.Object r1 = kotlin.collections.CollectionsKt.firstOrNull(r1)     // Catch: java.lang.Throwable -> L14
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L33
            monitor-exit(r0)
            return
        L33:
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L14
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L14
            k0.c r3 = r5.map     // Catch: java.lang.Throwable -> L14
            r3.e(r2)     // Catch: java.lang.Throwable -> L14
            int r3 = r5.size     // Catch: java.lang.Throwable -> L14
            int r4 = r5.a(r2, r1)     // Catch: java.lang.Throwable -> L14
            int r3 = r3 - r4
            r5.size = r3     // Catch: java.lang.Throwable -> L14
            int r3 = r5.evictionCount     // Catch: java.lang.Throwable -> L14
            r4 = 1
            int r3 = r3 + r4
            r5.evictionCount = r3     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)
            r0 = 0
            r5.entryRemoved(r4, r2, r1, r0)
            goto L0
        L55:
            monitor-exit(r0)
            return
        L57:
            java.lang.String r6 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L14
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L14
            throw r1     // Catch: java.lang.Throwable -> L14
        L5f:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.j.trimToSize(int):void");
    }
}
