package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import java.util.WeakHashMap;
import q.C1975I;

/* renamed from: k.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC1653a {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f16299a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f16300b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public static final Object f16301c = new Object();

    public static ColorStateList a(Context context, int i6) {
        return context.getColorStateList(i6);
    }

    public static Drawable b(Context context, int i6) {
        return C1975I.g().i(context, i6);
    }
}
