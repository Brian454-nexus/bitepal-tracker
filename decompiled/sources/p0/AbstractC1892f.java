package p0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;
import p0.AbstractC1892f;

/* renamed from: p0.f, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC1892f {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f18097a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f18098b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public static final Object f18099c = new Object();

    /* renamed from: p0.f$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {
        public static Drawable a(Resources resources, int i6, Resources.Theme theme) {
            return resources.getDrawable(i6, theme);
        }
    }

    /* renamed from: p0.f$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b {
        public static ColorStateList a(Resources resources, int i6, Resources.Theme theme) {
            return resources.getColorStateList(i6, theme);
        }
    }

    /* renamed from: p0.f$c */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final ColorStateList f18100a;

        /* renamed from: b, reason: collision with root package name */
        public final Configuration f18101b;

        /* renamed from: c, reason: collision with root package name */
        public final int f18102c;

        public c(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.f18100a = colorStateList;
            this.f18101b = configuration;
            this.f18102c = theme == null ? 0 : theme.hashCode();
        }
    }

    /* renamed from: p0.f$d */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final Resources f18103a;

        /* renamed from: b, reason: collision with root package name */
        public final Resources.Theme f18104b;

        public d(Resources resources, Resources.Theme theme) {
            this.f18103a = resources;
            this.f18104b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class == obj.getClass()) {
                d dVar = (d) obj;
                if (this.f18103a.equals(dVar.f18103a) && y0.b.a(this.f18104b, dVar.f18104b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return y0.b.b(this.f18103a, this.f18104b);
        }
    }

    /* renamed from: p0.f$e */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class e {
        public static Handler e(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        public final void c(final int i6, Handler handler) {
            e(handler).post(new Runnable() { // from class: p0.h
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC1892f.e.this.f(i6);
                }
            });
        }

        public final void d(final Typeface typeface, Handler handler) {
            e(handler).post(new Runnable() { // from class: p0.g
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC1892f.e.this.g(typeface);
                }
            });
        }

        public abstract void f(int i6);

        public abstract void g(Typeface typeface);
    }

    public static void a(d dVar, int i6, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f18099c) {
            try {
                WeakHashMap weakHashMap = f18098b;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(dVar);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(dVar, sparseArray);
                }
                sparseArray.append(i6, new c(colorStateList, dVar.f18103a.getConfiguration(), theme));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003c, code lost:
    
        if (r2.f18102c == r5.hashCode()) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.res.ColorStateList b(p0.AbstractC1892f.d r5, int r6) {
        /*
            java.lang.Object r0 = p0.AbstractC1892f.f18099c
            monitor-enter(r0)
            java.util.WeakHashMap r1 = p0.AbstractC1892f.f18098b     // Catch: java.lang.Throwable -> L32
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L32
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L45
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L32
            if (r2 <= 0) goto L45
            java.lang.Object r2 = r1.get(r6)     // Catch: java.lang.Throwable -> L32
            p0.f$c r2 = (p0.AbstractC1892f.c) r2     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L45
            android.content.res.Configuration r3 = r2.f18101b     // Catch: java.lang.Throwable -> L32
            android.content.res.Resources r4 = r5.f18103a     // Catch: java.lang.Throwable -> L32
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch: java.lang.Throwable -> L32
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L42
            android.content.res.Resources$Theme r5 = r5.f18104b     // Catch: java.lang.Throwable -> L32
            if (r5 != 0) goto L34
            int r3 = r2.f18102c     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L3e
            goto L34
        L32:
            r5 = move-exception
            goto L48
        L34:
            if (r5 == 0) goto L42
            int r3 = r2.f18102c     // Catch: java.lang.Throwable -> L32
            int r5 = r5.hashCode()     // Catch: java.lang.Throwable -> L32
            if (r3 != r5) goto L42
        L3e:
            android.content.res.ColorStateList r5 = r2.f18100a     // Catch: java.lang.Throwable -> L32
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return r5
        L42:
            r1.remove(r6)     // Catch: java.lang.Throwable -> L32
        L45:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            r5 = 0
            return r5
        L48:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.AbstractC1892f.b(p0.f$d, int):android.content.res.ColorStateList");
    }

    public static ColorStateList c(Resources resources, int i6, Resources.Theme theme) {
        d dVar = new d(resources, theme);
        ColorStateList b6 = b(dVar, i6);
        if (b6 != null) {
            return b6;
        }
        ColorStateList g6 = g(resources, i6, theme);
        if (g6 == null) {
            return b.a(resources, i6, theme);
        }
        a(dVar, i6, g6, theme);
        return g6;
    }

    public static Drawable d(Resources resources, int i6, Resources.Theme theme) {
        return a.a(resources, i6, theme);
    }

    public static Typeface e(Context context, int i6, TypedValue typedValue, int i7, e eVar) {
        if (context.isRestricted()) {
            return null;
        }
        return i(context, i6, typedValue, i7, eVar, null, true, false);
    }

    public static TypedValue f() {
        ThreadLocal threadLocal = f18097a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    public static ColorStateList g(Resources resources, int i6, Resources.Theme theme) {
        if (h(resources, i6)) {
            return null;
        }
        try {
            return AbstractC1889c.a(resources, resources.getXml(i6), theme);
        } catch (Exception e6) {
            Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e6);
            return null;
        }
    }

    public static boolean h(Resources resources, int i6) {
        TypedValue f6 = f();
        resources.getValue(i6, f6, true);
        int i7 = f6.type;
        return i7 >= 28 && i7 <= 31;
    }

    public static Typeface i(Context context, int i6, TypedValue typedValue, int i7, e eVar, Handler handler, boolean z6, boolean z7) {
        Resources resources = context.getResources();
        resources.getValue(i6, typedValue, true);
        Typeface j6 = j(context, resources, typedValue, i6, i7, eVar, handler, z6, z7);
        if (j6 != null || eVar != null || z7) {
            return j6;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i6) + " could not be retrieved.");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface j(android.content.Context r13, android.content.res.Resources r14, android.util.TypedValue r15, int r16, int r17, p0.AbstractC1892f.e r18, android.os.Handler r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.AbstractC1892f.j(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, p0.f$e, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}
