package e5;

import R4.l;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import e5.C1277g;
import java.nio.ByteBuffer;
import java.util.List;
import n5.k;

/* renamed from: e5.c, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C1273c extends Drawable implements C1277g.b, Animatable {

    /* renamed from: a, reason: collision with root package name */
    public final a f13942a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f13943b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f13944c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13945d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f13946e;

    /* renamed from: f, reason: collision with root package name */
    public int f13947f;

    /* renamed from: g, reason: collision with root package name */
    public int f13948g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f13949h;

    /* renamed from: i, reason: collision with root package name */
    public Paint f13950i;

    /* renamed from: j, reason: collision with root package name */
    public Rect f13951j;

    /* renamed from: k, reason: collision with root package name */
    public List f13952k;

    /* renamed from: e5.c$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public final C1277g f13953a;

        public a(C1277g c1277g) {
            this.f13953a = c1277g;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C1273c(this);
        }
    }

    public C1273c(Context context, Q4.a aVar, l lVar, int i6, int i7, Bitmap bitmap) {
        this(new a(new C1277g(com.bumptech.glide.b.c(context), aVar, i6, i7, lVar, bitmap)));
    }

    @Override // e5.C1277g.b
    public void a() {
        if (b() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (g() == f() - 1) {
            this.f13947f++;
        }
        int i6 = this.f13948g;
        if (i6 == -1 || this.f13947f < i6) {
            return;
        }
        j();
        stop();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Drawable.Callback b() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    public ByteBuffer c() {
        return this.f13942a.f13953a.b();
    }

    public final Rect d() {
        if (this.f13951j == null) {
            this.f13951j = new Rect();
        }
        return this.f13951j;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f13945d) {
            return;
        }
        if (this.f13949h) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), d());
            this.f13949h = false;
        }
        canvas.drawBitmap(this.f13942a.f13953a.c(), (Rect) null, d(), h());
    }

    public Bitmap e() {
        return this.f13942a.f13953a.e();
    }

    public int f() {
        return this.f13942a.f13953a.f();
    }

    public int g() {
        return this.f13942a.f13953a.d();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f13942a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f13942a.f13953a.h();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f13942a.f13953a.k();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    public final Paint h() {
        if (this.f13950i == null) {
            this.f13950i = new Paint(2);
        }
        return this.f13950i;
    }

    public int i() {
        return this.f13942a.f13953a.j();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f13943b;
    }

    public final void j() {
        List list = this.f13952k;
        if (list == null || list.size() <= 0) {
            return;
        }
        android.support.v4.media.session.b.a(this.f13952k.get(0));
        throw null;
    }

    public void k() {
        this.f13945d = true;
        this.f13942a.f13953a.a();
    }

    public final void l() {
        this.f13947f = 0;
    }

    public void m(l lVar, Bitmap bitmap) {
        this.f13942a.f13953a.o(lVar, bitmap);
    }

    public final void n() {
        k.a(!this.f13945d, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f13942a.f13953a.f() == 1) {
            invalidateSelf();
        } else {
            if (this.f13943b) {
                return;
            }
            this.f13943b = true;
            this.f13942a.f13953a.r(this);
            invalidateSelf();
        }
    }

    public final void o() {
        this.f13943b = false;
        this.f13942a.f13953a.s(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f13949h = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i6) {
        h().setAlpha(i6);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        h().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z6, boolean z7) {
        k.a(!this.f13945d, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f13946e = z6;
        if (!z6) {
            o();
        } else if (this.f13944c) {
            n();
        }
        return super.setVisible(z6, z7);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f13944c = true;
        l();
        if (this.f13946e) {
            n();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f13944c = false;
        o();
    }

    public C1273c(a aVar) {
        this.f13946e = true;
        this.f13948g = -1;
        this.f13942a = (a) k.d(aVar);
    }
}
