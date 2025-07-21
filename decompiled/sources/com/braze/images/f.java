package com.braze.images;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.braze.enums.BrazeViewBounds;
import com.braze.support.BrazeImageUtils;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class f implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BrazeViewBounds f12323a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ImageView f12324b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bitmap f12325c;

    public f(BrazeViewBounds brazeViewBounds, ImageView imageView, Bitmap bitmap) {
        this.f12323a = brazeViewBounds;
        this.f12324b = imageView;
        this.f12325c = bitmap;
    }

    public static final void a(Bitmap bitmap, ImageView imageView) {
        BrazeImageUtils.resizeImageViewToBitmapDimensions(bitmap, imageView);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View v6, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(v6, "v");
        if (this.f12323a == BrazeViewBounds.BASE_CARD_VIEW) {
            final ImageView imageView = this.f12324b;
            final Bitmap bitmap = this.f12325c;
            imageView.post(new Runnable() { // from class: Y3.z
                @Override // java.lang.Runnable
                public final void run() {
                    com.braze.images.f.a(bitmap, imageView);
                }
            });
        }
        v6.removeOnLayoutChangeListener(this);
    }
}
