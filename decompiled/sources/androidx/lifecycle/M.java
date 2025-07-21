package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class M {

    /* renamed from: a, reason: collision with root package name */
    public final Map f9009a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Set f9010b = new LinkedHashSet();

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f9011c = false;

    public static void b(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e6) {
                throw new RuntimeException(e6);
            }
        }
    }

    public final void a() {
        this.f9011c = true;
        Map map = this.f9009a;
        if (map != null) {
            synchronized (map) {
                try {
                    Iterator it = this.f9009a.values().iterator();
                    while (it.hasNext()) {
                        b(it.next());
                    }
                } finally {
                }
            }
        }
        Set set = this.f9010b;
        if (set != null) {
            synchronized (set) {
                try {
                    Iterator it2 = this.f9010b.iterator();
                    while (it2.hasNext()) {
                        b((Closeable) it2.next());
                    }
                } finally {
                }
            }
            this.f9010b.clear();
        }
        d();
    }

    public Object c(String str) {
        Object obj;
        Map map = this.f9009a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            obj = this.f9009a.get(str);
        }
        return obj;
    }

    public void d() {
    }

    public Object e(String str, Object obj) {
        Object obj2;
        synchronized (this.f9009a) {
            try {
                obj2 = this.f9009a.get(str);
                if (obj2 == null) {
                    this.f9009a.put(str, obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj2 != null) {
            obj = obj2;
        }
        if (this.f9011c) {
            b(obj);
        }
        return obj;
    }
}
