package com.braze.ui.inappmessage.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.amazon.a.a.o.b;
import com.braze.enums.inappmessage.CropType;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.views.InAppMessageImageView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ(\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\u001bH\u0016J\u0010\u0010&\u001a\u00020!2\u0006\u0010'\u001a\u00020\u001bH\u0016J\u0012\u0010(\u001a\u00020!2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0010\u0010+\u001a\u00020!2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020!2\u0006\u0010,\u001a\u00020\u001dH\u0016J\u0010\u0010-\u001a\u00020!2\u0006\u0010.\u001a\u00020/H\u0014J\u0018\u00100\u001a\u00020!2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u000202H\u0014J\u001e\u00104\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020/2\u0006\u00105\u001a\u0002022\u0006\u00106\u001a\u000202R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0016@BX\u0086.¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u001e\u0010\u001f¨\u00067"}, d2 = {"Lcom/braze/ui/inappmessage/views/InAppMessageImageView;", "Landroid/widget/ImageView;", "Lcom/braze/ui/inappmessage/views/IInAppMessageImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "clipPath", "Landroid/graphics/Path;", "getClipPath", "()Landroid/graphics/Path;", "setClipPath", "(Landroid/graphics/Path;)V", "rectf", "Landroid/graphics/RectF;", "getRectf", "()Landroid/graphics/RectF;", "setRectf", "(Landroid/graphics/RectF;)V", b.f11195Y, "", "inAppRadii", "getInAppRadii", "()[F", "aspectRatio", "", "setToHalfParentHeight", "", "getSetToHalfParentHeight$annotations", "()V", "setCornersRadiiPx", "", "topLeft", "topRight", "bottomLeft", "bottomRight", "setCornersRadiusPx", "cornersRadius", "setInAppMessageImageCropType", "cropType", "Lcom/braze/enums/inappmessage/CropType;", "setAspectRatio", "setToHalfHeight", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onMeasure", "widthMeasureSpec", "", "heightMeasureSpec", "clipCanvasToPath", "widthPx", "heightPx", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"AppCompatCustomView"})
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class InAppMessageImageView extends ImageView implements IInAppMessageImageView {
    private float aspectRatio;

    @NotNull
    private Path clipPath;
    private float[] inAppRadii;

    @NotNull
    private RectF rectf;
    private boolean setToHalfParentHeight;

    public InAppMessageImageView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.clipPath = new Path();
        this.rectf = new RectF();
        this.aspectRatio = -1.0f;
        setAdjustViewBounds(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String clipCanvasToPath$lambda$0() {
        return "In-app message radii is uninitialized, not clipping path.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String clipCanvasToPath$lambda$1() {
        return "Encountered exception while trying to clip in-app message image";
    }

    private static /* synthetic */ void getSetToHalfParentHeight$annotations() {
    }

    public final boolean clipCanvasToPath(@NotNull Canvas canvas, int widthPx, int heightPx) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.inAppRadii == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: M4.u
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String clipCanvasToPath$lambda$0;
                    clipCanvasToPath$lambda$0 = InAppMessageImageView.clipCanvasToPath$lambda$0();
                    return clipCanvasToPath$lambda$0;
                }
            }, 7, (Object) null);
            return false;
        }
        try {
            this.clipPath.reset();
            this.rectf.set(0.0f, 0.0f, widthPx, heightPx);
            this.clipPath.addRoundRect(this.rectf, getInAppRadii(), Path.Direction.CW);
            canvas.clipPath(this.clipPath);
            return true;
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: M4.v
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String clipCanvasToPath$lambda$1;
                    clipCanvasToPath$lambda$1 = InAppMessageImageView.clipCanvasToPath$lambda$1();
                    return clipCanvasToPath$lambda$1;
                }
            }, 4, (Object) null);
            return false;
        }
    }

    @NotNull
    public final Path getClipPath() {
        return this.clipPath;
    }

    @NotNull
    public final float[] getInAppRadii() {
        float[] fArr = this.inAppRadii;
        if (fArr != null) {
            return fArr;
        }
        Intrinsics.throwUninitializedPropertyAccessException("inAppRadii");
        return null;
    }

    @NotNull
    public final RectF getRectf() {
        return this.rectf;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        clipCanvasToPath(canvas, getWidth(), getHeight());
        super.onDraw(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (this.aspectRatio != -1.0f && getMeasuredHeight() > 0 && getMeasuredWidth() > 0) {
            int measuredWidth = getMeasuredWidth();
            setMeasuredDimension(measuredWidth, Math.min(getMeasuredHeight(), (int) (measuredWidth / this.aspectRatio)) + 1);
        } else {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
        }
        if (this.setToHalfParentHeight) {
            Intrinsics.checkNotNull(getParent(), "null cannot be cast to non-null type android.view.View");
            setMeasuredDimension(getMeasuredWidth(), (int) (((View) r5).getHeight() * 0.5d));
        }
    }

    public void setAspectRatio(float aspectRatio) {
        this.aspectRatio = aspectRatio;
        requestLayout();
    }

    public final void setClipPath(@NotNull Path path) {
        Intrinsics.checkNotNullParameter(path, "<set-?>");
        this.clipPath = path;
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageImageView
    public void setCornersRadiiPx(float topLeft, float topRight, float bottomLeft, float bottomRight) {
        this.inAppRadii = new float[]{topLeft, topLeft, topRight, topRight, bottomLeft, bottomLeft, bottomRight, bottomRight};
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageImageView
    public void setCornersRadiusPx(float cornersRadius) {
        setCornersRadiiPx(cornersRadius, cornersRadius, cornersRadius, cornersRadius);
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageImageView
    public void setInAppMessageImageCropType(@Nullable CropType cropType) {
        if (cropType == CropType.FIT_CENTER) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else if (cropType == CropType.CENTER_CROP) {
            setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
    }

    public final void setRectf(@NotNull RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "<set-?>");
        this.rectf = rectF;
    }

    public void setToHalfParentHeight(boolean setToHalfHeight) {
        this.setToHalfParentHeight = setToHalfHeight;
        requestLayout();
    }
}
