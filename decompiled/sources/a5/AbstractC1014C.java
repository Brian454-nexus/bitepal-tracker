package a5;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: a5.C, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC1014C {

    /* renamed from: a, reason: collision with root package name */
    public static final Paint f7718a = new Paint(6);

    /* renamed from: b, reason: collision with root package name */
    public static final Paint f7719b = new Paint(7);

    /* renamed from: c, reason: collision with root package name */
    public static final Paint f7720c;

    /* renamed from: d, reason: collision with root package name */
    public static final Set f7721d;

    /* renamed from: e, reason: collision with root package name */
    public static final Lock f7722e;

    /* renamed from: a5.C$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a implements Lock {
        @Override // java.util.concurrent.locks.Lock
        public void lock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public void lockInterruptibly() {
        }

        @Override // java.util.concurrent.locks.Lock
        public Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock() {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public void unlock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock(long j6, TimeUnit timeUnit) {
            return true;
        }
    }

    static {
        HashSet hashSet = new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"));
        f7721d = hashSet;
        f7722e = hashSet.contains(Build.MODEL) ? new ReentrantLock() : new a();
        Paint paint = new Paint(7);
        f7720c = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    public static void a(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        Lock lock = f7722e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f7718a);
            d(canvas);
            lock.unlock();
        } catch (Throwable th) {
            f7722e.unlock();
            throw th;
        }
    }

    public static Bitmap b(U4.d dVar, Bitmap bitmap, int i6, int i7) {
        float width;
        float height;
        if (bitmap.getWidth() == i6 && bitmap.getHeight() == i7) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f6 = 0.0f;
        if (bitmap.getWidth() * i7 > bitmap.getHeight() * i6) {
            width = i7 / bitmap.getHeight();
            f6 = (i6 - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i6 / bitmap.getWidth();
            height = (i7 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (f6 + 0.5f), (int) (height + 0.5f));
        Bitmap d6 = dVar.d(i6, i7, h(bitmap));
        l(bitmap, d6);
        a(bitmap, d6, matrix);
        return d6;
    }

    public static Bitmap c(U4.d dVar, Bitmap bitmap, int i6, int i7) {
        if (bitmap.getWidth() > i6 || bitmap.getHeight() > i7) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return e(dVar, bitmap, i6, i7);
        }
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
        }
        return bitmap;
    }

    public static void d(Canvas canvas) {
        canvas.setBitmap(null);
    }

    public static Bitmap e(U4.d dVar, Bitmap bitmap, int i6, int i7) {
        if (bitmap.getWidth() != i6 || bitmap.getHeight() != i7) {
            float min = Math.min(i6 / bitmap.getWidth(), i7 / bitmap.getHeight());
            int round = Math.round(bitmap.getWidth() * min);
            int round2 = Math.round(bitmap.getHeight() * min);
            if (bitmap.getWidth() != round || bitmap.getHeight() != round2) {
                Bitmap d6 = dVar.d((int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), h(bitmap));
                l(bitmap, d6);
                if (Log.isLoggable("TransformationUtils", 2)) {
                    Log.v("TransformationUtils", "request: " + i6 + "x" + i7);
                    Log.v("TransformationUtils", "toFit:   " + bitmap.getWidth() + "x" + bitmap.getHeight());
                    Log.v("TransformationUtils", "toReuse: " + d6.getWidth() + "x" + d6.getHeight());
                    StringBuilder sb = new StringBuilder();
                    sb.append("minPct:   ");
                    sb.append(min);
                    Log.v("TransformationUtils", sb.toString());
                }
                Matrix matrix = new Matrix();
                matrix.setScale(min, min);
                a(bitmap, d6, matrix);
                return d6;
            }
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "adjusted target size matches input, returning input");
            }
        } else if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size matches input, returning input");
            return bitmap;
        }
        return bitmap;
    }

    public static Lock f() {
        return f7722e;
    }

    public static int g(int i6) {
        switch (i6) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    public static Bitmap.Config h(Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
    }

    public static void i(int i6, Matrix matrix) {
        switch (i6) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                return;
            case 3:
                matrix.setRotate(180.0f);
                return;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 6:
                matrix.setRotate(90.0f);
                return;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 8:
                matrix.setRotate(-90.0f);
                return;
            default:
                return;
        }
    }

    public static boolean j(int i6) {
        switch (i6) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public static Bitmap k(U4.d dVar, Bitmap bitmap, int i6) {
        if (!j(i6)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        i(i6, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap d6 = dVar.d(Math.round(rectF.width()), Math.round(rectF.height()), h(bitmap));
        matrix.postTranslate(-rectF.left, -rectF.top);
        d6.setHasAlpha(bitmap.hasAlpha());
        a(bitmap, d6, matrix);
        return d6;
    }

    public static void l(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }
}
