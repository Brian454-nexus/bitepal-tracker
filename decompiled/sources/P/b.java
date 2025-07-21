package P;

import android.media.Image;
import android.media.ImageWriter;
import android.view.Surface;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class b {
    public static void a(ImageWriter imageWriter) {
        imageWriter.close();
    }

    public static Image b(ImageWriter imageWriter) {
        return imageWriter.dequeueInputImage();
    }

    public static ImageWriter c(Surface surface, int i6) {
        return ImageWriter.newInstance(surface, i6);
    }

    public static void d(ImageWriter imageWriter, Image image) {
        imageWriter.queueInputImage(image);
    }
}
