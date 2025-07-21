package q;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class U extends Resources {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f18509b = false;

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f18510a;

    public U(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f18510a = new WeakReference(context);
    }

    public static boolean a() {
        return f18509b;
    }

    public static boolean b() {
        a();
        return false;
    }

    public final Drawable c(int i6) {
        return super.getDrawable(i6);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i6) {
        Context context = (Context) this.f18510a.get();
        return context != null ? C1975I.g().r(context, this, i6) : super.getDrawable(i6);
    }
}
