package U4;

import android.graphics.Bitmap;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class e implements d {
    @Override // U4.d
    public void a(int i6) {
    }

    @Override // U4.d
    public void b() {
    }

    @Override // U4.d
    public void c(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // U4.d
    public Bitmap d(int i6, int i7, Bitmap.Config config) {
        return Bitmap.createBitmap(i6, i7, config);
    }

    @Override // U4.d
    public Bitmap e(int i6, int i7, Bitmap.Config config) {
        return d(i6, i7, config);
    }
}
