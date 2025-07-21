package D2;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.startup.InitializationProvider;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile a f752d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f753e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f756c;

    /* renamed from: b, reason: collision with root package name */
    public final Set f755b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final Map f754a = new HashMap();

    public a(Context context) {
        this.f756c = context.getApplicationContext();
    }

    public static a d(Context context) {
        if (f752d == null) {
            synchronized (f753e) {
                try {
                    if (f752d == null) {
                        f752d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f752d;
    }

    public void a() {
        try {
            try {
                G2.a.c("Startup");
                b(this.f756c.getPackageManager().getProviderInfo(new ComponentName(this.f756c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            } catch (PackageManager.NameNotFoundException e6) {
                throw new d(e6);
            }
        } finally {
            G2.a.f();
        }
    }

    public void b(Bundle bundle) {
        String string = this.f756c.getString(c.f757a);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (b.class.isAssignableFrom(cls)) {
                            this.f755b.add(cls);
                        }
                    }
                }
                Iterator it = this.f755b.iterator();
                while (it.hasNext()) {
                    c((Class) it.next(), hashSet);
                }
            } catch (ClassNotFoundException e6) {
                throw new d(e6);
            }
        }
    }

    public final Object c(Class cls, Set set) {
        Object obj;
        if (G2.a.h()) {
            try {
                G2.a.c(cls.getSimpleName());
            } catch (Throwable th) {
                G2.a.f();
                throw th;
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.f754a.containsKey(cls)) {
            obj = this.f754a.get(cls);
        } else {
            set.add(cls);
            try {
                b bVar = (b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class> a6 = bVar.a();
                if (!a6.isEmpty()) {
                    for (Class cls2 : a6) {
                        if (!this.f754a.containsKey(cls2)) {
                            c(cls2, set);
                        }
                    }
                }
                obj = bVar.b(this.f756c);
                set.remove(cls);
                this.f754a.put(cls, obj);
            } catch (Throwable th2) {
                throw new d(th2);
            }
        }
        G2.a.f();
        return obj;
    }

    public boolean e(Class cls) {
        return this.f755b.contains(cls);
    }
}
