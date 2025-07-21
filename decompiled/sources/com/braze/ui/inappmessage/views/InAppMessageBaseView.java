package com.braze.ui.inappmessage.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.braze.enums.inappmessage.TextAlign;
import com.braze.models.inappmessage.IInAppMessageWithImage;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.utils.InAppMessageViewUtils;
import com.braze.ui.inappmessage.views.InAppMessageBaseView;
import com.braze.ui.support.ViewUtils;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z0.C2400K;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0005\b&\u0018\u0000 ?2\u00020\u00012\u00020\u0002:\u0001?B\u001b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'R\"\u0010(\u001a\u00020 8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010#R\u0016\u00100\u001a\u0004\u0018\u00010-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0016\u00104\u001a\u0004\u0018\u0001018&X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0016\u00108\u001a\u0004\u0018\u0001058&X¦\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0016\u0010:\u001a\u0004\u0018\u0001018&X¦\u0004¢\u0006\u0006\u001a\u0004\b9\u00103R\u0016\u0010>\u001a\u0004\u0018\u00010;8&X¦\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=¨\u0006@"}, d2 = {"Lcom/braze/ui/inappmessage/views/InAppMessageBaseView;", "Landroid/widget/RelativeLayout;", "Lcom/braze/ui/inappmessage/views/IInAppMessageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "color", "", "setMessageBackgroundColor", "(I)V", "setMessageTextColor", "Lcom/braze/enums/inappmessage/TextAlign;", "textAlign", "setMessageTextAlign", "(Lcom/braze/enums/inappmessage/TextAlign;)V", "", "text", "setMessage", "(Ljava/lang/String;)V", "Landroid/graphics/Bitmap;", "bitmap", "setMessageImageView", "(Landroid/graphics/Bitmap;)V", "icon", "iconColor", "iconBackgroundColor", "setMessageIcon", "(Ljava/lang/String;II)V", "", "imageRetrievalSuccessful", "resetMessageMargins", "(Z)V", "Lz0/K;", "insets", "applyWindowInsets", "(Lz0/K;)V", "hasAppliedWindowInsets", "Z", "getHasAppliedWindowInsets", "()Z", "setHasAppliedWindowInsets", "Landroid/view/View;", "getMessageClickableView", "()Landroid/view/View;", "messageClickableView", "Landroid/widget/TextView;", "getMessageTextView", "()Landroid/widget/TextView;", "messageTextView", "Landroid/widget/ImageView;", "getMessageImageView", "()Landroid/widget/ImageView;", "messageImageView", "getMessageIconView", "messageIconView", "", "getMessageBackgroundObject", "()Ljava/lang/Object;", "messageBackgroundObject", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nInAppMessageBaseView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InAppMessageBaseView.kt\ncom/braze/ui/inappmessage/views/InAppMessageBaseView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,98:1\n1#2:99\n*E\n"})
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class InAppMessageBaseView extends RelativeLayout implements IInAppMessageView {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private boolean hasAppliedWindowInsets;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/braze/ui/inappmessage/views/InAppMessageBaseView$Companion;", "", "<init>", "()V", "getAppropriateImageUrl", "", "inAppMessage", "Lcom/braze/models/inappmessage/IInAppMessageWithImage;", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getAppropriateImageUrl$lambda$0(String str) {
            return "Local bitmap file does not exist. Using remote url instead. Local path: " + str;
        }

        @JvmStatic
        @Nullable
        public final String getAppropriateImageUrl(@NotNull IInAppMessageWithImage inAppMessage) {
            Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
            final String localImageUrl = inAppMessage.getLocalImageUrl();
            if (localImageUrl != null && !StringsKt.isBlank(localImageUrl)) {
                if (new File(localImageUrl).exists()) {
                    return localImageUrl;
                }
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12980D, (Throwable) null, false, new Function0() { // from class: M4.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String appropriateImageUrl$lambda$0;
                        appropriateImageUrl$lambda$0 = InAppMessageBaseView.Companion.getAppropriateImageUrl$lambda$0(localImageUrl);
                        return appropriateImageUrl$lambda$0;
                    }
                }, 6, (Object) null);
            }
            return inAppMessage.getRemoteImageUrl();
        }

        private Companion() {
        }
    }

    public InAppMessageBaseView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageView
    public void applyWindowInsets(@NotNull C2400K insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        setHasAppliedWindowInsets(true);
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageView
    public boolean getHasAppliedWindowInsets() {
        return this.hasAppliedWindowInsets;
    }

    @Nullable
    public abstract Object getMessageBackgroundObject();

    @Override // com.braze.ui.inappmessage.views.IInAppMessageView
    @Nullable
    public View getMessageClickableView() {
        return this;
    }

    @Nullable
    public abstract TextView getMessageIconView();

    @Nullable
    public abstract ImageView getMessageImageView();

    @Nullable
    public abstract TextView getMessageTextView();

    public void resetMessageMargins(boolean imageRetrievalSuccessful) {
        CharSequence text;
        String obj;
        ImageView messageImageView = getMessageImageView();
        if (messageImageView != null) {
            if (imageRetrievalSuccessful) {
                ViewUtils.removeViewFromParent(getMessageIconView());
            } else {
                ViewUtils.removeViewFromParent(messageImageView);
            }
        }
        TextView messageIconView = getMessageIconView();
        if (messageIconView == null || (text = messageIconView.getText()) == null || (obj = text.toString()) == null || !StringsKt.isBlank(obj)) {
            return;
        }
        ViewUtils.removeViewFromParent(getMessageIconView());
    }

    public void setHasAppliedWindowInsets(boolean z6) {
        this.hasAppliedWindowInsets = z6;
    }

    public void setMessage(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        TextView messageTextView = getMessageTextView();
        if (messageTextView != null) {
            messageTextView.setText(text);
        }
    }

    public void setMessageBackgroundColor(int color) {
        Object messageBackgroundObject = getMessageBackgroundObject();
        Intrinsics.checkNotNull(messageBackgroundObject, "null cannot be cast to non-null type android.view.View");
        InAppMessageViewUtils.setViewBackgroundColor((View) messageBackgroundObject, color);
    }

    public void setMessageIcon(@NotNull String icon, int iconColor, int iconBackgroundColor) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        TextView messageIconView = getMessageIconView();
        if (messageIconView != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            InAppMessageViewUtils.setIcon(context, icon, iconColor, iconBackgroundColor, messageIconView);
        }
    }

    public void setMessageImageView(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        ImageView messageImageView = getMessageImageView();
        if (messageImageView != null) {
            InAppMessageViewUtils.setImage(bitmap, messageImageView);
        }
    }

    public void setMessageTextAlign(@NotNull TextAlign textAlign) {
        Intrinsics.checkNotNullParameter(textAlign, "textAlign");
        TextView messageTextView = getMessageTextView();
        if (messageTextView != null) {
            InAppMessageViewUtils.setTextAlignment(messageTextView, textAlign);
        }
    }

    public void setMessageTextColor(int color) {
        TextView messageTextView = getMessageTextView();
        if (messageTextView != null) {
            InAppMessageViewUtils.setTextViewColor(messageTextView, color);
        }
    }
}
