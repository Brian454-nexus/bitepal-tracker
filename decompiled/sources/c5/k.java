package c5;

import T4.v;
import android.graphics.drawable.Drawable;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class k extends j {
    public k(Drawable drawable) {
        super(drawable);
    }

    public static v e(Drawable drawable) {
        if (drawable != null) {
            return new k(drawable);
        }
        return null;
    }

    @Override // T4.v
    public void a() {
    }

    @Override // T4.v
    public Class b() {
        return this.f10764a.getClass();
    }

    @Override // T4.v
    public int f() {
        return Math.max(1, this.f10764a.getIntrinsicWidth() * this.f10764a.getIntrinsicHeight() * 4);
    }
}
