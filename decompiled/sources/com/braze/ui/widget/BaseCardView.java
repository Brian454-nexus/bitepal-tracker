package com.braze.ui.widget;

import android.R;
import android.content.Context;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.BrazeViewBounds;
import com.braze.images.IBrazeImageLoader;
import com.braze.models.cards.Card;
import com.braze.support.BrazeLogger;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.R$drawable;
import com.braze.ui.R$string;
import com.braze.ui.actions.IAction;
import com.braze.ui.actions.UriAction;
import com.braze.ui.contentcards.BrazeContentCardUtils;
import com.braze.ui.feed.BrazeImageSwitcher;
import com.braze.ui.widget.BaseCardView;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 '*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0001'B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\nJ&\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020!2\u0006\u0010\r\u001a\u00020\u0002J\u0018\u0010\"\u001a\u00020\u00182\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\r\u001a\u00020\u0002J\"\u0010#\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010%H\u0004J\"\u0010&\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010%H$R\u0010\u0010\b\u001a\u00020\u00058\u0004X\u0085\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u0004\u0018\u00018\u00008\u0004@\u0004X\u0085\u000e¢\u0006\u0004\n\u0002\u0010\u000eR\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u00020\u00128\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0015\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006("}, d2 = {"Lcom/braze/ui/widget/BaseCardView;", "T", "Lcom/braze/models/cards/Card;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "applicationContext", "classLogTag", "", "getClassLogTag", "()Ljava/lang/String;", "card", "Lcom/braze/models/cards/Card;", "imageSwitcher", "Lcom/braze/ui/feed/BrazeImageSwitcher;", "configurationProvider", "Lcom/braze/configuration/BrazeConfigurationProvider;", "isUnreadCardVisualIndicatorEnabled", "", "isUnreadIndicatorEnabled", "()Z", "setOptionalTextView", "", "view", "Landroid/widget/TextView;", "text", "setImageViewToUrl", "imageView", "Landroid/widget/ImageView;", "imageUrl", "placeholderAspectRatio", "", "setCardViewedIndicator", "handleCardClick", "cardAction", "Lcom/braze/ui/actions/IAction;", "isClickHandled", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class BaseCardView<T extends Card> extends RelativeLayout {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    protected final Context applicationContext;

    @JvmField
    @Nullable
    protected T card;

    @NotNull
    private final String classLogTag;

    @JvmField
    @NotNull
    protected BrazeConfigurationProvider configurationProvider;

    @JvmField
    @Nullable
    public BrazeImageSwitcher imageSwitcher;
    private final boolean isUnreadCardVisualIndicatorEnabled;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/braze/ui/widget/BaseCardView$Companion;", "", "<init>", "()V", "ICON_READ_TAG", "", "ICON_UNREAD_TAG", "getUriActionForCard", "Lcom/braze/ui/actions/UriAction;", "card", "Lcom/braze/models/cards/Card;", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        public final UriAction getUriActionForCard(@NotNull Card card) {
            Intrinsics.checkNotNullParameter(card, "card");
            return BrazeContentCardUtils.INSTANCE.getUriActionForCard(card);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseCardView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.applicationContext = applicationContext;
        this.classLogTag = BrazeLogger.getBrazeLogTag(getClass());
        BrazeConfigurationProvider configurationProvider = BrazeInternal.INSTANCE.getConfigurationProvider(context);
        this.configurationProvider = configurationProvider;
        this.isUnreadCardVisualIndicatorEnabled = configurationProvider.isNewsfeedVisualIndicatorOn();
    }

    @JvmStatic
    @Nullable
    public static final UriAction getUriActionForCard(@NotNull Card card) {
        return INSTANCE.getUriActionForCard(card);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleCardClick$lambda$1(Card card) {
        return "Handling card click for card: " + card;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleCardClick$lambda$2(Card card) {
        return "Card action is non-null. Attempting to perform action on card: " + card.getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleCardClick$lambda$3(Card card) {
        return "Executing non uri action for click on card: " + card.getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleCardClick$lambda$4(Card card) {
        return "Card action is null. Not performing any click action on card: " + card.getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleCardClick$lambda$5(Card card) {
        return "Card click was handled by custom listener on card: " + card.getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCardViewedIndicator$lambda$0() {
        return "imageSwitcher is null. Can't set card viewed indicator.";
    }

    @NotNull
    public final String getClassLogTag() {
        return this.classLogTag;
    }

    public final void handleCardClick(@NotNull Context context, @NotNull final Card card, @Nullable IAction cardAction) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(card, "card");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.f12983V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: O4.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String handleCardClick$lambda$1;
                handleCardClick$lambda$1 = BaseCardView.handleCardClick$lambda$1(Card.this);
                return handleCardClick$lambda$1;
            }
        }, 6, (Object) null);
        card.setIndicatorHighlighted(true);
        if (isClickHandled(context, card, cardAction)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: O4.f
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String handleCardClick$lambda$5;
                    handleCardClick$lambda$5 = BaseCardView.handleCardClick$lambda$5(Card.this);
                    return handleCardClick$lambda$5;
                }
            }, 7, (Object) null);
            card.logClick();
        } else {
            if (cardAction == null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: O4.e
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String handleCardClick$lambda$4;
                        handleCardClick$lambda$4 = BaseCardView.handleCardClick$lambda$4(Card.this);
                        return handleCardClick$lambda$4;
                    }
                }, 6, (Object) null);
                return;
            }
            card.logClick();
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: O4.c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String handleCardClick$lambda$2;
                    handleCardClick$lambda$2 = BaseCardView.handleCardClick$lambda$2(Card.this);
                    return handleCardClick$lambda$2;
                }
            }, 6, (Object) null);
            if (cardAction instanceof UriAction) {
                BrazeDeeplinkHandler.INSTANCE.getInstance().gotoUri(context, (UriAction) cardAction);
            } else {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: O4.d
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String handleCardClick$lambda$3;
                        handleCardClick$lambda$3 = BaseCardView.handleCardClick$lambda$3(Card.this);
                        return handleCardClick$lambda$3;
                    }
                }, 7, (Object) null);
                cardAction.execute(context);
            }
        }
    }

    public abstract boolean isClickHandled(@NotNull Context context, @NotNull Card card, @Nullable IAction cardAction);

    /* renamed from: isUnreadIndicatorEnabled, reason: from getter */
    public final boolean getIsUnreadCardVisualIndicatorEnabled() {
        return this.isUnreadCardVisualIndicatorEnabled;
    }

    public final void setCardViewedIndicator(@Nullable BrazeImageSwitcher imageSwitcher, @NotNull Card card) {
        Intrinsics.checkNotNullParameter(card, "card");
        if (imageSwitcher == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: O4.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String cardViewedIndicator$lambda$0;
                    cardViewedIndicator$lambda$0 = BaseCardView.setCardViewedIndicator$lambda$0();
                    return cardViewedIndicator$lambda$0;
                }
            }, 6, (Object) null);
            return;
        }
        int i6 = R$string.com_braze_image_is_read_tag_key;
        Object tag = imageSwitcher.getTag(i6);
        if (tag == null) {
            tag = "";
        }
        if (card.getIsIndicatorHighlightedInternal()) {
            if (Intrinsics.areEqual(tag, "icon_read")) {
                return;
            }
            if (imageSwitcher.getReadIcon() != null) {
                imageSwitcher.setImageDrawable(imageSwitcher.getReadIcon());
            } else {
                imageSwitcher.setImageResource(R$drawable.com_braze_content_card_icon_read);
            }
            imageSwitcher.setTag(i6, "icon_read");
            return;
        }
        if (Intrinsics.areEqual(tag, "icon_unread")) {
            return;
        }
        if (imageSwitcher.getUnReadIcon() != null) {
            imageSwitcher.setImageDrawable(imageSwitcher.getUnReadIcon());
        } else {
            imageSwitcher.setImageResource(R$drawable.com_braze_content_card_icon_unread);
        }
        imageSwitcher.setTag(i6, "icon_unread");
    }

    public final void setImageViewToUrl(@NotNull final ImageView imageView, @NotNull String imageUrl, final float placeholderAspectRatio, @NotNull Card card) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(card, "card");
        int i6 = R$string.com_braze_image_resize_tag_key;
        if (Intrinsics.areEqual(imageUrl, imageView.getTag(i6))) {
            return;
        }
        if (placeholderAspectRatio != 0.0f) {
            ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.braze.ui.widget.BaseCardView$setImageViewToUrl$1
                    @Override // android.view.ViewTreeObserver.OnPreDrawListener
                    public boolean onPreDraw() {
                        imageView.getViewTreeObserver().removeOnPreDrawListener(this);
                        int width = imageView.getWidth();
                        imageView.setLayoutParams(new RelativeLayout.LayoutParams(width, (int) (width / placeholderAspectRatio)));
                        return true;
                    }
                });
            }
        }
        imageView.setImageResource(R.color.transparent);
        Braze.Companion companion = Braze.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        IBrazeImageLoader imageLoader = companion.getInstance(context).getImageLoader();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        imageLoader.renderUrlIntoCardView(context2, card, imageUrl, imageView, BrazeViewBounds.BASE_CARD_VIEW);
        imageView.setTag(i6, imageUrl);
    }

    public final void setOptionalTextView(@NotNull TextView view, @Nullable String text) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (text == null || StringsKt.isBlank(text)) {
            view.setText("");
            view.setVisibility(8);
        } else {
            view.setText(text);
            view.setVisibility(0);
        }
    }
}
