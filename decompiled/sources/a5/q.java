package a5;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final U4.d f7780a = new a();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a extends U4.e {
        @Override // U4.e, U4.d
        public void c(Bitmap bitmap) {
        }
    }

    public static T4.v a(U4.d dVar, Drawable drawable, int i6, int i7) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z6 = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmap = null;
        } else {
            bitmap = b(dVar, current, i6, i7);
            z6 = true;
        }
        if (!z6) {
            dVar = f7780a;
        }
        return g.e(bitmap, dVar);
    }

    public static Bitmap b(U4.d dVar, Drawable drawable, int i6, int i7) {
        if (i6 == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            return null;
        }
        if (i7 == Integer.MIN_VALUE && drawable.getIntrinsicHeight() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
            }
            return null;
        }
        if (drawable.getIntrinsicWidth() > 0) {
            i6 = drawable.getIntrinsicWidth();
        }
        if (drawable.getIntrinsicHeight() > 0) {
            i7 = drawable.getIntrinsicHeight();
        }
        Lock f6 = AbstractC1014C.f();
        f6.lock();
        Bitmap d6 = dVar.d(i6, i7, Bitmap.Config.ARGB_8888);
        try {
            Canvas canvas = new Canvas(d6);
            drawable.setBounds(0, 0, i6, i7);
            drawable.draw(canvas);
            canvas.setBitmap(null);
            return d6;
        } finally {
            f6.unlock();
        }
    }
}
