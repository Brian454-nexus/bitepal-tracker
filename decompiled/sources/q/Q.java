package q;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class Q extends AbstractC1976J {

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f18505b;

    public Q(Context context, Resources resources) {
        super(resources);
        this.f18505b = new WeakReference(context);
    }

    @Override // q.AbstractC1976J, android.content.res.Resources
    public Drawable getDrawable(int i6) {
        Drawable drawable = super.getDrawable(i6);
        Context context = (Context) this.f18505b.get();
        if (drawable != null && context != null) {
            C1975I.g().v(context, i6, drawable);
        }
        return drawable;
    }
}
