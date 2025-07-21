package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import g5.o;
import h5.AbstractC1464a;
import h5.C1467d;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class b implements ComponentCallbacks2 {

    /* renamed from: k, reason: collision with root package name */
    public static volatile b f13140k;

    /* renamed from: l, reason: collision with root package name */
    public static volatile boolean f13141l;

    /* renamed from: a, reason: collision with root package name */
    public final T4.k f13142a;

    /* renamed from: b, reason: collision with root package name */
    public final U4.d f13143b;

    /* renamed from: c, reason: collision with root package name */
    public final V4.h f13144c;

    /* renamed from: d, reason: collision with root package name */
    public final d f13145d;

    /* renamed from: e, reason: collision with root package name */
    public final U4.b f13146e;

    /* renamed from: f, reason: collision with root package name */
    public final o f13147f;

    /* renamed from: g, reason: collision with root package name */
    public final g5.c f13148g;

    /* renamed from: i, reason: collision with root package name */
    public final a f13150i;

    /* renamed from: h, reason: collision with root package name */
    public final List f13149h = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public f f13151j = f.NORMAL;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface a {
        j5.h build();
    }

    public b(Context context, T4.k kVar, V4.h hVar, U4.d dVar, U4.b bVar, o oVar, g5.c cVar, int i6, a aVar, Map map, List list, List list2, AbstractC1464a abstractC1464a, e eVar) {
        this.f13142a = kVar;
        this.f13143b = dVar;
        this.f13146e = bVar;
        this.f13144c = hVar;
        this.f13147f = oVar;
        this.f13148g = cVar;
        this.f13150i = aVar;
        this.f13145d = new d(context, bVar, j.d(this, list2, abstractC1464a), new k5.f(), aVar, map, list, kVar, eVar, i6);
    }

    public static void a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (f13141l) {
            throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
        }
        f13141l = true;
        try {
            m(context, generatedAppGlideModule);
        } finally {
            f13141l = false;
        }
    }

    public static b c(Context context) {
        if (f13140k == null) {
            GeneratedAppGlideModule d6 = d(context.getApplicationContext());
            synchronized (b.class) {
                try {
                    if (f13140k == null) {
                        a(context, d6);
                    }
                } finally {
                }
            }
        }
        return f13140k;
    }

    public static GeneratedAppGlideModule d(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            if (!Log.isLoggable("Glide", 5)) {
                return null;
            }
            Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            return null;
        } catch (IllegalAccessException e6) {
            q(e6);
            return null;
        } catch (InstantiationException e7) {
            q(e7);
            return null;
        } catch (NoSuchMethodException e8) {
            q(e8);
            return null;
        } catch (InvocationTargetException e9) {
            q(e9);
            return null;
        }
    }

    public static o l(Context context) {
        n5.k.e(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return c(context).k();
    }

    public static void m(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        n(context, new c(), generatedAppGlideModule);
    }

    public static void n(Context context, c cVar, GeneratedAppGlideModule generatedAppGlideModule) {
        Context applicationContext = context.getApplicationContext();
        List list = Collections.EMPTY_LIST;
        if (generatedAppGlideModule == null || generatedAppGlideModule.c()) {
            list = new C1467d(applicationContext).b();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.d().isEmpty()) {
            generatedAppGlideModule.d();
            Iterator it = list.iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                throw null;
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it2 = list.iterator();
            if (it2.hasNext()) {
                android.support.v4.media.session.b.a(it2.next());
                new StringBuilder().append("Discovered GlideModule from manifest: ");
                throw null;
            }
        }
        cVar.b(generatedAppGlideModule != null ? generatedAppGlideModule.e() : null);
        Iterator it3 = list.iterator();
        if (it3.hasNext()) {
            android.support.v4.media.session.b.a(it3.next());
            throw null;
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.b(applicationContext, cVar);
        }
        b a6 = cVar.a(applicationContext, list, generatedAppGlideModule);
        applicationContext.registerComponentCallbacks(a6);
        f13140k = a6;
    }

    public static void q(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    public static l t(Context context) {
        return l(context).e(context);
    }

    public void b() {
        n5.l.b();
        this.f13144c.b();
        this.f13143b.b();
        this.f13146e.b();
    }

    public U4.b e() {
        return this.f13146e;
    }

    public U4.d f() {
        return this.f13143b;
    }

    public g5.c g() {
        return this.f13148g;
    }

    public Context h() {
        return this.f13145d.getBaseContext();
    }

    public d i() {
        return this.f13145d;
    }

    public i j() {
        return this.f13145d.i();
    }

    public o k() {
        return this.f13147f;
    }

    public void o(l lVar) {
        synchronized (this.f13149h) {
            try {
                if (this.f13149h.contains(lVar)) {
                    throw new IllegalStateException("Cannot register already registered manager");
                }
                this.f13149h.add(lVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        b();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i6) {
        r(i6);
    }

    public boolean p(k5.h hVar) {
        synchronized (this.f13149h) {
            try {
                Iterator it = this.f13149h.iterator();
                while (it.hasNext()) {
                    if (((l) it.next()).A(hVar)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void r(int i6) {
        n5.l.b();
        synchronized (this.f13149h) {
            try {
                Iterator it = this.f13149h.iterator();
                while (it.hasNext()) {
                    ((l) it.next()).onTrimMemory(i6);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f13144c.a(i6);
        this.f13143b.a(i6);
        this.f13146e.a(i6);
    }

    public void s(l lVar) {
        synchronized (this.f13149h) {
            try {
                if (!this.f13149h.contains(lVar)) {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
                this.f13149h.remove(lVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
