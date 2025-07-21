package com.braze.ui.widget;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.braze.models.cards.ImageOnlyCard;
import com.braze.support.BrazeLogger;
import com.braze.ui.R$drawable;
import com.braze.ui.R$id;
import com.braze.ui.R$layout;
import com.braze.ui.actions.IAction;
import com.braze.ui.feed.view.BaseFeedCardView;
import com.braze.ui.widget.ImageOnlyCardView;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class ImageOnlyCardView extends BaseFeedCardView<ImageOnlyCard> {
    private static final String TAG = BrazeLogger.getBrazeLogTag((Class<?>) ImageOnlyCardView.class);
    private float mAspectRatio;
    private IAction mCardAction;
    private final ImageView mImage;

    public ImageOnlyCardView(Context context) {
        this(context, null);
    }

    @Override // com.braze.ui.feed.view.BaseFeedCardView
    public int getLayoutResource() {
        return R$layout.com_braze_image_only_card;
    }

    public ImageOnlyCardView(Context context, ImageOnlyCard imageOnlyCard) {
        super(context);
        this.mAspectRatio = 6.0f;
        ImageView imageView = (ImageView) getProperViewFromInflatedStub(R$id.com_braze_image_only_card_imageview_stub);
        this.mImage = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setAdjustViewBounds(true);
        if (imageOnlyCard != null) {
            setCard(imageOnlyCard);
        }
        setBackground(getResources().getDrawable(R$drawable.com_braze_card_background, null));
    }

    @Override // com.braze.ui.feed.view.BaseFeedCardView
    public void onSetCard(final ImageOnlyCard imageOnlyCard) {
        if (imageOnlyCard.getAspectRatio() != 0.0f) {
            this.mAspectRatio = imageOnlyCard.getAspectRatio();
        }
        setImageViewToUrl(this.mImage, imageOnlyCard.getImageUrl(), this.mAspectRatio, imageOnlyCard);
        this.mCardAction = BaseCardView.getUriActionForCard(imageOnlyCard);
        setOnClickListener(new View.OnClickListener() { // from class: O4.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r0.handleCardClick(r0.applicationContext, imageOnlyCard, ImageOnlyCardView.this.mCardAction);
            }
        });
    }
}
