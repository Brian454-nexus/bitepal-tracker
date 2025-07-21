package H2;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f2184a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f2185b;

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f2186c;

    static {
        int i6 = Build.VERSION.SDK_INT;
        f2184a = true;
        f2185b = true;
        f2186c = i6 >= 28;
    }

    public static View a(ViewGroup viewGroup, View view, View view2) {
        Matrix matrix = new Matrix();
        matrix.setTranslate(-view2.getScrollX(), -view2.getScrollY());
        A.i(view, matrix);
        A.j(viewGroup, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
        matrix.mapRect(rectF);
        int round = Math.round(rectF.left);
        int round2 = Math.round(rectF.top);
        int round3 = Math.round(rectF.right);
        int round4 = Math.round(rectF.bottom);
        ImageView imageView = new ImageView(view.getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Bitmap b6 = b(view, matrix, rectF, viewGroup);
        if (b6 != null) {
            imageView.setImageBitmap(b6);
        }
        imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
        imageView.layout(round, round2, round3, round4);
        return imageView;
    }

    public static Bitmap b(View view, Matrix matrix, RectF rectF, ViewGroup viewGroup) {
        boolean z6;
        boolean z7;
        int i6;
        ViewGroup viewGroup2;
        if (f2184a) {
            z6 = !view.isAttachedToWindow();
            z7 = viewGroup == null ? false : viewGroup.isAttachedToWindow();
        } else {
            z6 = false;
            z7 = false;
        }
        boolean z8 = f2185b;
        Bitmap bitmap = null;
        if (!z8 || !z6) {
            i6 = 0;
            viewGroup2 = null;
        } else {
            if (!z7) {
                return null;
            }
            viewGroup2 = (ViewGroup) view.getParent();
            i6 = viewGroup2.indexOfChild(view);
            viewGroup.getOverlay().add(view);
        }
        int round = Math.round(rectF.width());
        int round2 = Math.round(rectF.height());
        if (round > 0 && round2 > 0) {
            float min = Math.min(1.0f, 1048576.0f / (round * round2));
            int round3 = Math.round(round * min);
            int round4 = Math.round(round2 * min);
            matrix.postTranslate(-rectF.left, -rectF.top);
            matrix.postScale(min, min);
            if (f2186c) {
                Picture picture = new Picture();
                Canvas beginRecording = picture.beginRecording(round3, round4);
                beginRecording.concat(matrix);
                view.draw(beginRecording);
                picture.endRecording();
                bitmap = Bitmap.createBitmap(picture);
            } else {
                bitmap = Bitmap.createBitmap(round3, round4, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmap);
                canvas.concat(matrix);
                view.draw(canvas);
            }
        }
        if (z8 && z6) {
            viewGroup.getOverlay().remove(view);
            viewGroup2.addView(view, i6);
        }
        return bitmap;
    }

    public static Animator c(Animator animator, Animator animator2) {
        if (animator == null) {
            return animator2;
        }
        if (animator2 == null) {
            return animator;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animator, animator2);
        return animatorSet;
    }
}
