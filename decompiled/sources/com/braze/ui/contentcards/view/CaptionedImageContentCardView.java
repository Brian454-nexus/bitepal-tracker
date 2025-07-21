package com.braze.ui.contentcards.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.amazon.a.a.o.b;
import com.braze.models.cards.CaptionedImageCard;
import com.braze.models.cards.Card;
import com.braze.ui.R$id;
import com.braze.ui.R$layout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¨\u0006\u0011"}, d2 = {"Lcom/braze/ui/contentcards/view/CaptionedImageContentCardView;", "Lcom/braze/ui/contentcards/view/BaseContentCardView;", "Lcom/braze/models/cards/CaptionedImageCard;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "createViewHolder", "Lcom/braze/ui/contentcards/view/ContentCardViewHolder;", "viewGroup", "Landroid/view/ViewGroup;", "bindViewHolder", "", "viewHolder", "card", "Lcom/braze/models/cards/Card;", "ViewHolder", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCaptionedImageContentCardView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CaptionedImageContentCardView.kt\ncom/braze/ui/contentcards/view/CaptionedImageContentCardView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,51:1\n1#2:52\n*E\n"})
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class CaptionedImageContentCardView extends BaseContentCardView<CaptionedImageCard> {

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/braze/ui/contentcards/view/CaptionedImageContentCardView$ViewHolder;", "Lcom/braze/ui/contentcards/view/ContentCardViewHolder;", "view", "Landroid/view/View;", "<init>", "(Lcom/braze/ui/contentcards/view/CaptionedImageContentCardView;Landroid/view/View;)V", b.f11189S, "Landroid/widget/TextView;", "getTitle", "()Landroid/widget/TextView;", b.f11199c, "getDescription", "imageView", "Landroid/widget/ImageView;", "getImageView", "()Landroid/widget/ImageView;", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class ViewHolder extends ContentCardViewHolder {

        @Nullable
        private final TextView description;

        @Nullable
        private final ImageView imageView;
        final /* synthetic */ CaptionedImageContentCardView this$0;

        @Nullable
        private final TextView title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull CaptionedImageContentCardView captionedImageContentCardView, View view) {
            super(view, captionedImageContentCardView.getIsUnreadCardVisualIndicatorEnabled());
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = captionedImageContentCardView;
            this.title = (TextView) view.findViewById(R$id.com_braze_content_cards_captioned_image_title);
            this.description = (TextView) view.findViewById(R$id.com_braze_content_cards_captioned_image_description);
            this.imageView = (ImageView) view.findViewById(R$id.com_braze_content_cards_captioned_image_card_image);
        }

        @Nullable
        public final TextView getDescription() {
            return this.description;
        }

        @Nullable
        public final ImageView getImageView() {
            return this.imageView;
        }

        @Nullable
        public final TextView getTitle() {
            return this.title;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptionedImageContentCardView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.braze.ui.contentcards.view.BaseContentCardView
    public void bindViewHolder(@NotNull ContentCardViewHolder viewHolder, @NotNull Card card) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(card, "card");
        if (card instanceof CaptionedImageCard) {
            super.bindViewHolder(viewHolder, card);
            ViewHolder viewHolder2 = (ViewHolder) viewHolder;
            TextView title = viewHolder2.getTitle();
            if (title != null) {
                setOptionalTextView(title, ((CaptionedImageCard) card).getTitle());
            }
            TextView description = viewHolder2.getDescription();
            if (description != null) {
                setOptionalTextView(description, ((CaptionedImageCard) card).getDescription());
            }
            CaptionedImageCard captionedImageCard = (CaptionedImageCard) card;
            String domain = captionedImageCard.getDomain();
            String url = (domain == null || StringsKt.isBlank(domain)) ? captionedImageCard.getUrl() : captionedImageCard.getDomain();
            if (url != null) {
                viewHolder2.setActionHintText(url);
            }
            setOptionalCardImage(viewHolder2.getImageView(), captionedImageCard.getAspectRatio(), captionedImageCard.getImageUrl(), card);
            viewHolder.itemView.setContentDescription(captionedImageCard.getTitle() + " .  " + captionedImageCard.getDescription());
        }
    }

    @Override // com.braze.ui.contentcards.view.BaseContentCardView
    @NotNull
    public ContentCardViewHolder createViewHolder(@NotNull ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.com_braze_captioned_image_content_card, viewGroup, false);
        Intrinsics.checkNotNull(inflate);
        setViewBackground(inflate);
        return new ViewHolder(this, inflate);
    }
}
