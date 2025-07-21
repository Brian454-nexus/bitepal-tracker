package a5;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class x implements T4.v, T4.r {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f7802a;

    /* renamed from: b, reason: collision with root package name */
    public final T4.v f7803b;

    public x(Resources resources, T4.v vVar) {
        this.f7802a = (Resources) n5.k.d(resources);
        this.f7803b = (T4.v) n5.k.d(vVar);
    }

    public static T4.v e(Resources resources, T4.v vVar) {
        if (vVar == null) {
            return null;
        }
        return new x(resources, vVar);
    }

    @Override // T4.v
    public void a() {
        this.f7803b.a();
    }

    @Override // T4.v
    public Class b() {
        return BitmapDrawable.class;
    }

    @Override // T4.r
    public void c() {
        T4.v vVar = this.f7803b;
        if (vVar instanceof T4.r) {
            ((T4.r) vVar).c();
        }
    }

    @Override // T4.v
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f7802a, (Bitmap) this.f7803b.get());
    }

    @Override // T4.v
    public int f() {
        return this.f7803b.f();
    }
}
