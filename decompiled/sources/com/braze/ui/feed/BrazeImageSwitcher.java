package com.braze.ui.feed;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageSwitcher;
import com.amazon.a.a.o.b;
import com.braze.support.BrazeLogger;
import com.braze.ui.R$styleable;
import com.braze.ui.feed.BrazeImageSwitcher;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R(\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t@GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR(\u0010\u000f\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t@GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/braze/ui/feed/BrazeImageSwitcher;", "Landroid/widget/ImageSwitcher;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", b.f11195Y, "Landroid/graphics/drawable/Drawable;", "readIcon", "getReadIcon", "()Landroid/graphics/drawable/Drawable;", "setReadIcon", "(Landroid/graphics/drawable/Drawable;)V", "unReadIcon", "getUnReadIcon", "setUnReadIcon", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class BrazeImageSwitcher extends ImageSwitcher {

    @Nullable
    private Drawable readIcon;

    @Nullable
    private Drawable unReadIcon;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrazeImageSwitcher(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Drawable drawable;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.com_braze_ui_feed_BrazeImageSwitcher);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = obtainStyledAttributes.getIndex(i6);
                if (index == R$styleable.com_braze_ui_feed_BrazeImageSwitcher_brazeFeedCustomReadIcon) {
                    Drawable drawable2 = obtainStyledAttributes.getDrawable(index);
                    if (drawable2 != null) {
                        this.readIcon = drawable2;
                    }
                } else if (obtainStyledAttributes.getIndex(i6) == R$styleable.com_braze_ui_feed_BrazeImageSwitcher_brazeFeedCustomUnReadIcon && (drawable = obtainStyledAttributes.getDrawable(index)) != null) {
                    this.unReadIcon = drawable;
                }
            }
            obtainStyledAttributes.recycle();
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) e6, false, new Function0() { // from class: G4.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String _init_$lambda$0;
                    _init_$lambda$0 = BrazeImageSwitcher._init_$lambda$0();
                    return _init_$lambda$0;
                }
            }, 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$0() {
        return "Error while checking for custom drawable.";
    }

    @Nullable
    public final Drawable getReadIcon() {
        return this.readIcon;
    }

    @Nullable
    public final Drawable getUnReadIcon() {
        return this.unReadIcon;
    }

    public final void setReadIcon(@Nullable Drawable drawable) {
        this.readIcon = drawable;
    }

    public final void setUnReadIcon(@Nullable Drawable drawable) {
        this.unReadIcon = drawable;
    }
}
