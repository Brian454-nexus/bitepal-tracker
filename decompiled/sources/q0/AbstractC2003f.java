package q0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import java.util.List;
import p0.AbstractC1890d;
import p0.AbstractC1892f;
import w0.j;

/* renamed from: q0.f, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC2003f {

    /* renamed from: a, reason: collision with root package name */
    public static final k f18613a;

    /* renamed from: b, reason: collision with root package name */
    public static final j0.j f18614b;

    /* renamed from: q0.f$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a extends j.c {

        /* renamed from: a, reason: collision with root package name */
        public AbstractC1892f.e f18615a;

        public a(AbstractC1892f.e eVar) {
            this.f18615a = eVar;
        }

        @Override // w0.j.c
        public void a(int i6) {
            AbstractC1892f.e eVar = this.f18615a;
            if (eVar != null) {
                eVar.f(i6);
            }
        }

        @Override // w0.j.c
        public void b(Typeface typeface) {
            AbstractC1892f.e eVar = this.f18615a;
            if (eVar != null) {
                eVar.g(typeface);
            }
        }
    }

    static {
        G2.a.c("TypefaceCompat static init");
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 29) {
            f18613a = new j();
        } else if (i6 >= 28) {
            f18613a = new C2006i();
        } else {
            f18613a = new C2005h();
        }
        f18614b = new j0.j(16);
        G2.a.f();
    }

    public static Typeface a(Context context, Typeface typeface, int i6) {
        if (context != null) {
            return Typeface.create(typeface, i6);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, j.b[] bVarArr, int i6) {
        G2.a.c("TypefaceCompat.createFromFontInfo");
        try {
            return f18613a.b(context, cancellationSignal, bVarArr, i6);
        } finally {
            G2.a.f();
        }
    }

    public static Typeface c(Context context, CancellationSignal cancellationSignal, List list, int i6) {
        G2.a.c("TypefaceCompat.createFromFontInfoWithFallback");
        try {
            return f18613a.c(context, cancellationSignal, list, i6);
        } finally {
            G2.a.f();
        }
    }

    public static Typeface d(Context context, AbstractC1890d.b bVar, Resources resources, int i6, String str, int i7, int i8, AbstractC1892f.e eVar, Handler handler, boolean z6) {
        Typeface a6;
        if (bVar instanceof AbstractC1890d.e) {
            AbstractC1890d.e eVar2 = (AbstractC1890d.e) bVar;
            Typeface h6 = h(eVar2.d());
            if (h6 != null) {
                if (eVar != null) {
                    eVar.d(h6, handler);
                }
                return h6;
            }
            a6 = w0.j.a(context, eVar2.a() != null ? AbstractC2002e.a(new Object[]{eVar2.c(), eVar2.a()}) : AbstractC2002e.a(new Object[]{eVar2.c()}), i8, !z6 ? eVar != null : eVar2.b() != 0, z6 ? eVar2.e() : -1, AbstractC1892f.e.e(handler), new a(eVar));
        } else {
            a6 = f18613a.a(context, (AbstractC1890d.c) bVar, resources, i8);
            if (eVar != null) {
                if (a6 != null) {
                    eVar.d(a6, handler);
                } else {
                    eVar.c(-3, handler);
                }
            }
        }
        if (a6 != null) {
            f18614b.put(f(resources, i6, str, i7, i8), a6);
        }
        return a6;
    }

    public static Typeface e(Context context, Resources resources, int i6, String str, int i7, int i8) {
        Typeface d6 = f18613a.d(context, resources, i6, str, i8);
        if (d6 != null) {
            f18614b.put(f(resources, i6, str, i7, i8), d6);
        }
        return d6;
    }

    public static String f(Resources resources, int i6, String str, int i7, int i8) {
        return resources.getResourcePackageName(i6) + '-' + str + '-' + i7 + '-' + i6 + '-' + i8;
    }

    public static Typeface g(Resources resources, int i6, String str, int i7, int i8) {
        return (Typeface) f18614b.get(f(resources, i6, str, i7, i8));
    }

    public static Typeface h(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface create = Typeface.create(str, 0);
            Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
            if (create != null && !create.equals(create2)) {
                return create;
            }
        }
        return null;
    }
}
