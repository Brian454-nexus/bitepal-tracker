package q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* renamed from: q.i, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C1985i extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    public final C1980d f18546a;

    /* renamed from: b, reason: collision with root package name */
    public final C1984h f18547b;

    public C1985i(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1980d c1980d = this.f18546a;
        if (c1980d != null) {
            c1980d.b();
        }
        C1984h c1984h = this.f18547b;
        if (c1984h != null) {
            c1984h.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1980d c1980d = this.f18546a;
        if (c1980d != null) {
            return c1980d.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1980d c1980d = this.f18546a;
        if (c1980d != null) {
            return c1980d.d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C1984h c1984h = this.f18547b;
        if (c1984h != null) {
            return c1984h.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C1984h c1984h = this.f18547b;
        if (c1984h != null) {
            return c1984h.d();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f18547b.e() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1980d c1980d = this.f18546a;
        if (c1980d != null) {
            c1980d.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i6) {
        super.setBackgroundResource(i6);
        C1980d c1980d = this.f18546a;
        if (c1980d != null) {
            c1980d.g(i6);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C1984h c1984h = this.f18547b;
        if (c1984h != null) {
            c1984h.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C1984h c1984h = this.f18547b;
        if (c1984h != null) {
            c1984h.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i6) {
        C1984h c1984h = this.f18547b;
        if (c1984h != null) {
            c1984h.g(i6);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C1984h c1984h = this.f18547b;
        if (c1984h != null) {
            c1984h.b();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1980d c1980d = this.f18546a;
        if (c1980d != null) {
            c1980d.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1980d c1980d = this.f18546a;
        if (c1980d != null) {
            c1980d.j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C1984h c1984h = this.f18547b;
        if (c1984h != null) {
            c1984h.h(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C1984h c1984h = this.f18547b;
        if (c1984h != null) {
            c1984h.i(mode);
        }
    }

    public C1985i(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1985i(Context context, AttributeSet attributeSet, int i6) {
        super(O.b(context), attributeSet, i6);
        C1980d c1980d = new C1980d(this);
        this.f18546a = c1980d;
        c1980d.e(attributeSet, i6);
        C1984h c1984h = new C1984h(this);
        this.f18547b = c1984h;
        c1984h.f(attributeSet, i6);
    }
}
