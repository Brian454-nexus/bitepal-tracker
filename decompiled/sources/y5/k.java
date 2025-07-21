package y5;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class k implements e {

    /* renamed from: a, reason: collision with root package name */
    public final a f21272a;

    /* renamed from: b, reason: collision with root package name */
    public final i f21273b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f21274c;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Context f21275a;

        /* renamed from: b, reason: collision with root package name */
        public Map f21276b = null;

        public a(Context context) {
            this.f21275a = context;
        }

        public static Bundle d(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
                return null;
            }
        }

        public final Map a(Context context) {
            Bundle d6 = d(context);
            if (d6 == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.EMPTY_MAP;
            }
            HashMap hashMap = new HashMap();
            for (String str : d6.keySet()) {
                Object obj = d6.get(str);
                if ((obj instanceof String) && str.startsWith("backend:")) {
                    for (String str2 : ((String) obj).split(com.amazon.a.a.o.b.f.f11248a, -1)) {
                        String trim = str2.trim();
                        if (!trim.isEmpty()) {
                            hashMap.put(trim, str.substring(8));
                        }
                    }
                }
            }
            return hashMap;
        }

        public d b(String str) {
            String str2 = (String) c().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (d) Class.forName(str2).asSubclass(d.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e6) {
                Log.w("BackendRegistry", String.format("Class %s is not found.", str2), e6);
                return null;
            } catch (IllegalAccessException e7) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e7);
                return null;
            } catch (InstantiationException e8) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e8);
                return null;
            } catch (NoSuchMethodException e9) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e9);
                return null;
            } catch (InvocationTargetException e10) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e10);
                return null;
            }
        }

        public final Map c() {
            if (this.f21276b == null) {
                this.f21276b = a(this.f21275a);
            }
            return this.f21276b;
        }
    }

    public k(Context context, i iVar) {
        this(new a(context), iVar);
    }

    @Override // y5.e
    public synchronized m get(String str) {
        if (this.f21274c.containsKey(str)) {
            return (m) this.f21274c.get(str);
        }
        d b6 = this.f21272a.b(str);
        if (b6 == null) {
            return null;
        }
        m create = b6.create(this.f21273b.a(str));
        this.f21274c.put(str, create);
        return create;
    }

    public k(a aVar, i iVar) {
        this.f21274c = new HashMap();
        this.f21272a = aVar;
        this.f21273b = iVar;
    }
}
