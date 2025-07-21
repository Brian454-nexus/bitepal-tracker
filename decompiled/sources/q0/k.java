package q0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.IntCompanionObject;
import p0.AbstractC1890d;
import w0.j;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public ConcurrentHashMap f18628a = new ConcurrentHashMap();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements b {
        public a() {
        }

        @Override // q0.k.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int a(j.b bVar) {
            return bVar.e();
        }

        @Override // q0.k.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(j.b bVar) {
            return bVar.f();
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface b {
        int a(Object obj);

        boolean b(Object obj);
    }

    public static Object e(Object[] objArr, int i6, b bVar) {
        return f(objArr, (i6 & 1) == 0 ? 400 : 700, (i6 & 2) != 0, bVar);
    }

    public static Object f(Object[] objArr, int i6, boolean z6, b bVar) {
        Object obj = null;
        int i7 = IntCompanionObject.MAX_VALUE;
        for (Object obj2 : objArr) {
            int abs = (Math.abs(bVar.a(obj2) - i6) * 2) + (bVar.b(obj2) == z6 ? 0 : 1);
            if (obj == null || i7 > abs) {
                obj = obj2;
                i7 = abs;
            }
        }
        return obj;
    }

    public abstract Typeface a(Context context, AbstractC1890d.c cVar, Resources resources, int i6);

    public abstract Typeface b(Context context, CancellationSignal cancellationSignal, j.b[] bVarArr, int i6);

    public Typeface c(Context context, CancellationSignal cancellationSignal, List list, int i6) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface d(Context context, Resources resources, int i6, String str, int i7) {
        File d6 = l.d(context);
        if (d6 == null) {
            return null;
        }
        try {
            if (l.b(d6, resources, i6)) {
                return Typeface.createFromFile(d6.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            d6.delete();
        }
    }

    public j.b g(j.b[] bVarArr, int i6) {
        return (j.b) e(bVarArr, i6, new a());
    }
}
