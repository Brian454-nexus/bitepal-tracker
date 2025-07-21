package q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import j0.C1638a;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import m.AbstractC1786a;
import n0.AbstractC1809a;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import r0.AbstractC2019a;

/* renamed from: q.I, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1975I {

    /* renamed from: i, reason: collision with root package name */
    public static C1975I f18449i;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f18451a;

    /* renamed from: b, reason: collision with root package name */
    public C1638a f18452b;

    /* renamed from: c, reason: collision with root package name */
    public j0.l f18453c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakHashMap f18454d = new WeakHashMap(0);

    /* renamed from: e, reason: collision with root package name */
    public TypedValue f18455e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f18456f;

    /* renamed from: g, reason: collision with root package name */
    public c f18457g;

    /* renamed from: h, reason: collision with root package name */
    public static final PorterDuff.Mode f18448h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j, reason: collision with root package name */
    public static final a f18450j = new a(6);

    /* renamed from: q.I$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a extends j0.j {
        public a(int i6) {
            super(i6);
        }

        public static int b(int i6, PorterDuff.Mode mode) {
            return ((i6 + 31) * 31) + mode.hashCode();
        }

        public PorterDuffColorFilter c(int i6, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) get(Integer.valueOf(b(i6, mode)));
        }

        public PorterDuffColorFilter d(int i6, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) put(Integer.valueOf(b(i6, mode)), porterDuffColorFilter);
        }
    }

    /* renamed from: q.I$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface b {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* renamed from: q.I$c */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface c {
        Drawable a(C1975I c1975i, Context context, int i6);

        boolean b(Context context, int i6, Drawable drawable);

        PorterDuff.Mode c(int i6);

        ColorStateList d(Context context, int i6);

        boolean e(Context context, int i6, Drawable drawable);
    }

    public static long d(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    public static PorterDuffColorFilter f(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return k(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized C1975I g() {
        C1975I c1975i;
        synchronized (C1975I.class) {
            try {
                if (f18449i == null) {
                    C1975I c1975i2 = new C1975I();
                    f18449i = c1975i2;
                    o(c1975i2);
                }
                c1975i = f18449i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1975i;
    }

    public static synchronized PorterDuffColorFilter k(int i6, PorterDuff.Mode mode) {
        PorterDuffColorFilter c6;
        synchronized (C1975I.class) {
            a aVar = f18450j;
            c6 = aVar.c(i6, mode);
            if (c6 == null) {
                c6 = new PorterDuffColorFilter(i6, mode);
                aVar.d(i6, mode, c6);
            }
        }
        return c6;
    }

    public static void o(C1975I c1975i) {
    }

    public static boolean p(Drawable drawable) {
        return (drawable instanceof I2.b) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    public static void u(Drawable drawable, P p6, int[] iArr) {
        if (y.a(drawable) && drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        boolean z6 = p6.f18504d;
        if (z6 || p6.f18503c) {
            drawable.setColorFilter(f(z6 ? p6.f18501a : null, p6.f18503c ? p6.f18502b : f18448h, iArr));
        } else {
            drawable.clearColorFilter();
        }
    }

    public final synchronized boolean a(Context context, long j6, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState == null) {
                return false;
            }
            j0.h hVar = (j0.h) this.f18454d.get(context);
            if (hVar == null) {
                hVar = new j0.h();
                this.f18454d.put(context, hVar);
            }
            hVar.h(j6, new WeakReference(constantState));
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b(Context context, int i6, ColorStateList colorStateList) {
        if (this.f18451a == null) {
            this.f18451a = new WeakHashMap();
        }
        j0.l lVar = (j0.l) this.f18451a.get(context);
        if (lVar == null) {
            lVar = new j0.l();
            this.f18451a.put(context, lVar);
        }
        lVar.a(i6, colorStateList);
    }

    public final void c(Context context) {
        if (this.f18456f) {
            return;
        }
        this.f18456f = true;
        Drawable i6 = i(context, AbstractC1786a.f17138a);
        if (i6 == null || !p(i6)) {
            this.f18456f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    public final Drawable e(Context context, int i6) {
        if (this.f18455e == null) {
            this.f18455e = new TypedValue();
        }
        TypedValue typedValue = this.f18455e;
        context.getResources().getValue(i6, typedValue, true);
        long d6 = d(typedValue);
        Drawable h6 = h(context, d6);
        if (h6 != null) {
            return h6;
        }
        c cVar = this.f18457g;
        Drawable a6 = cVar == null ? null : cVar.a(this, context, i6);
        if (a6 != null) {
            a6.setChangingConfigurations(typedValue.changingConfigurations);
            a(context, d6, a6);
        }
        return a6;
    }

    public final synchronized Drawable h(Context context, long j6) {
        j0.h hVar = (j0.h) this.f18454d.get(context);
        if (hVar == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) hVar.e(j6);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            hVar.d(j6);
        }
        return null;
    }

    public synchronized Drawable i(Context context, int i6) {
        return j(context, i6, false);
    }

    public synchronized Drawable j(Context context, int i6, boolean z6) {
        Drawable q6;
        try {
            c(context);
            q6 = q(context, i6);
            if (q6 == null) {
                q6 = e(context, i6);
            }
            if (q6 == null) {
                q6 = AbstractC1809a.getDrawable(context, i6);
            }
            if (q6 != null) {
                q6 = t(context, i6, z6, q6);
            }
            if (q6 != null) {
                y.b(q6);
            }
        } catch (Throwable th) {
            throw th;
        }
        return q6;
    }

    public synchronized ColorStateList l(Context context, int i6) {
        ColorStateList m6;
        m6 = m(context, i6);
        if (m6 == null) {
            c cVar = this.f18457g;
            m6 = cVar == null ? null : cVar.d(context, i6);
            if (m6 != null) {
                b(context, i6, m6);
            }
        }
        return m6;
    }

    public final ColorStateList m(Context context, int i6) {
        j0.l lVar;
        WeakHashMap weakHashMap = this.f18451a;
        if (weakHashMap == null || (lVar = (j0.l) weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) lVar.e(i6);
    }

    public PorterDuff.Mode n(int i6) {
        c cVar = this.f18457g;
        if (cVar == null) {
            return null;
        }
        return cVar.c(i6);
    }

    public final Drawable q(Context context, int i6) {
        int next;
        C1638a c1638a = this.f18452b;
        if (c1638a == null || c1638a.isEmpty()) {
            return null;
        }
        j0.l lVar = this.f18453c;
        if (lVar != null) {
            String str = (String) lVar.e(i6);
            if ("appcompat_skip_skip".equals(str) || (str != null && this.f18452b.get(str) == null)) {
                return null;
            }
        } else {
            this.f18453c = new j0.l();
        }
        if (this.f18455e == null) {
            this.f18455e = new TypedValue();
        }
        TypedValue typedValue = this.f18455e;
        Resources resources = context.getResources();
        resources.getValue(i6, typedValue, true);
        long d6 = d(typedValue);
        Drawable h6 = h(context, d6);
        if (h6 != null) {
            return h6;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i6);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f18453c.a(i6, name);
                b bVar = (b) this.f18452b.get(name);
                if (bVar != null) {
                    h6 = bVar.a(context, xml, asAttributeSet, context.getTheme());
                }
                if (h6 != null) {
                    h6.setChangingConfigurations(typedValue.changingConfigurations);
                    a(context, d6, h6);
                }
            } catch (Exception e6) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e6);
            }
        }
        if (h6 == null) {
            this.f18453c.a(i6, "appcompat_skip_skip");
        }
        return h6;
    }

    public synchronized Drawable r(Context context, U u6, int i6) {
        try {
            Drawable q6 = q(context, i6);
            if (q6 == null) {
                q6 = u6.c(i6);
            }
            if (q6 == null) {
                return null;
            }
            return t(context, i6, false, q6);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void s(c cVar) {
        this.f18457g = cVar;
    }

    public final Drawable t(Context context, int i6, boolean z6, Drawable drawable) {
        ColorStateList l6 = l(context, i6);
        if (l6 == null) {
            c cVar = this.f18457g;
            if ((cVar == null || !cVar.e(context, i6, drawable)) && !v(context, i6, drawable) && z6) {
                return null;
            }
            return drawable;
        }
        if (y.a(drawable)) {
            drawable = drawable.mutate();
        }
        Drawable j6 = AbstractC2019a.j(drawable);
        AbstractC2019a.g(j6, l6);
        PorterDuff.Mode n6 = n(i6);
        if (n6 != null) {
            AbstractC2019a.h(j6, n6);
        }
        return j6;
    }

    public boolean v(Context context, int i6, Drawable drawable) {
        c cVar = this.f18457g;
        return cVar != null && cVar.b(context, i6, drawable);
    }
}
