package c5;

import T4.r;
import T4.v;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import e5.C1273c;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class j implements v, r {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f10764a;

    public j(Drawable drawable) {
        this.f10764a = (Drawable) n5.k.d(drawable);
    }

    @Override // T4.r
    public void c() {
        Drawable drawable = this.f10764a;
        if (drawable instanceof BitmapDrawable) {
            ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
        } else if (drawable instanceof C1273c) {
            ((C1273c) drawable).e().prepareToDraw();
        }
    }

    @Override // T4.v
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Drawable get() {
        Drawable.ConstantState constantState = this.f10764a.getConstantState();
        return constantState == null ? this.f10764a : constantState.newDrawable();
    }
}
