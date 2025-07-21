package h5;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: h5.d, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1467d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f15326a;

    public C1467d(Context context) {
        this.f15326a = context;
    }

    public static InterfaceC1465b c(String str) {
        Object obj;
        try {
            Class<?> cls = Class.forName(str);
            try {
                obj = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (IllegalAccessException e6) {
                d(cls, e6);
                obj = null;
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + obj);
            } catch (InstantiationException e7) {
                d(cls, e7);
                obj = null;
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + obj);
            } catch (NoSuchMethodException e8) {
                d(cls, e8);
                obj = null;
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + obj);
            } catch (InvocationTargetException e9) {
                d(cls, e9);
                obj = null;
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + obj);
            }
            throw new RuntimeException("Expected instanceof GlideModule, but found: " + obj);
        } catch (ClassNotFoundException e10) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e10);
        }
    }

    public static void d(Class cls, Exception exc) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, exc);
    }

    public final ApplicationInfo a() {
        return this.f15326a.getPackageManager().getApplicationInfo(this.f15326a.getPackageName(), 128);
    }

    public List b() {
        ApplicationInfo a6;
        if (Log.isLoggable("ManifestParser", 3)) {
            Log.d("ManifestParser", "Loading Glide modules");
        }
        ArrayList arrayList = new ArrayList();
        try {
            a6 = a();
        } catch (PackageManager.NameNotFoundException e6) {
            if (Log.isLoggable("ManifestParser", 6)) {
                Log.e("ManifestParser", "Failed to parse glide modules", e6);
            }
        }
        if (a6 != null && a6.metaData != null) {
            if (Log.isLoggable("ManifestParser", 2)) {
                Log.v("ManifestParser", "Got app info metadata: " + a6.metaData);
            }
            for (String str : a6.metaData.keySet()) {
                if ("GlideModule".equals(a6.metaData.get(str))) {
                    c(str);
                    arrayList.add(null);
                    if (Log.isLoggable("ManifestParser", 3)) {
                        Log.d("ManifestParser", "Loaded Glide module: " + str);
                    }
                }
            }
            if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Finished loading Glide modules");
                return arrayList;
            }
            return arrayList;
        }
        if (Log.isLoggable("ManifestParser", 3)) {
            Log.d("ManifestParser", "Got null app info metadata");
            return arrayList;
        }
        return arrayList;
    }
}
