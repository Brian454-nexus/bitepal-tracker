package a5;

import android.content.Context;
import android.graphics.Bitmap;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class h implements R4.l {
    @Override // R4.l
    public final T4.v b(Context context, T4.v vVar, int i6, int i7) {
        if (!n5.l.u(i6, i7)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i6 + " or height: " + i7 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        U4.d f6 = com.bumptech.glide.b.c(context).f();
        Bitmap bitmap = (Bitmap) vVar.get();
        if (i6 == Integer.MIN_VALUE) {
            i6 = bitmap.getWidth();
        }
        if (i7 == Integer.MIN_VALUE) {
            i7 = bitmap.getHeight();
        }
        Bitmap c6 = c(f6, bitmap, i6, i7);
        return bitmap.equals(c6) ? vVar : g.e(c6, f6);
    }

    public abstract Bitmap c(U4.d dVar, Bitmap bitmap, int i6, int i7);
}
