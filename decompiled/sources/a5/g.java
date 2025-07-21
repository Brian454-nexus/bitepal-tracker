package a5;

import android.graphics.Bitmap;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class g implements T4.v, T4.r {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f7743a;

    /* renamed from: b, reason: collision with root package name */
    public final U4.d f7744b;

    public g(Bitmap bitmap, U4.d dVar) {
        this.f7743a = (Bitmap) n5.k.e(bitmap, "Bitmap must not be null");
        this.f7744b = (U4.d) n5.k.e(dVar, "BitmapPool must not be null");
    }

    public static g e(Bitmap bitmap, U4.d dVar) {
        if (bitmap == null) {
            return null;
        }
        return new g(bitmap, dVar);
    }

    @Override // T4.v
    public void a() {
        this.f7744b.c(this.f7743a);
    }

    @Override // T4.v
    public Class b() {
        return Bitmap.class;
    }

    @Override // T4.r
    public void c() {
        this.f7743a.prepareToDraw();
    }

    @Override // T4.v
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Bitmap get() {
        return this.f7743a;
    }

    @Override // T4.v
    public int f() {
        return n5.l.i(this.f7743a);
    }
}
