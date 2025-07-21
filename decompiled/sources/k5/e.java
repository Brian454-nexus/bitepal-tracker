package k5;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import l5.b;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class e extends i implements b.a {

    /* renamed from: h, reason: collision with root package name */
    public Animatable f16846h;

    public e(ImageView imageView) {
        super(imageView);
    }

    @Override // g5.l
    public void a() {
        Animatable animatable = this.f16846h;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // k5.h
    public void d(Object obj, l5.b bVar) {
        if (bVar == null || !bVar.a(obj, this)) {
            s(obj);
        } else {
            p(obj);
        }
    }

    @Override // k5.a, k5.h
    public void h(Drawable drawable) {
        super.h(drawable);
        s(null);
        q(drawable);
    }

    @Override // g5.l
    public void j() {
        Animatable animatable = this.f16846h;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // k5.i, k5.a, k5.h
    public void k(Drawable drawable) {
        super.k(drawable);
        s(null);
        q(drawable);
    }

    @Override // k5.i, k5.a, k5.h
    public void m(Drawable drawable) {
        super.m(drawable);
        Animatable animatable = this.f16846h;
        if (animatable != null) {
            animatable.stop();
        }
        s(null);
        q(drawable);
    }

    public final void p(Object obj) {
        if (!(obj instanceof Animatable)) {
            this.f16846h = null;
            return;
        }
        Animatable animatable = (Animatable) obj;
        this.f16846h = animatable;
        animatable.start();
    }

    public void q(Drawable drawable) {
        ((ImageView) this.f16849a).setImageDrawable(drawable);
    }

    public abstract void r(Object obj);

    public final void s(Object obj) {
        r(obj);
        p(obj);
    }
}
