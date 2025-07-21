package com.braze.ui.feed.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.ViewSwitcher;
import com.braze.models.cards.Card;
import com.braze.models.cards.ICardListener;
import com.braze.support.BrazeLogger;
import com.braze.ui.R$id;
import com.braze.ui.actions.IAction;
import com.braze.ui.feed.BrazeFeedManager;
import com.braze.ui.feed.BrazeImageSwitcher;
import com.braze.ui.feed.view.BaseFeedCardView;
import com.braze.ui.widget.BaseCardView;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class BaseFeedCardView<T extends Card> extends BaseCardView<T> {
    private static final String TAG = BrazeLogger.getBrazeLogTag((Class<?>) BaseCardView.class);

    public BaseFeedCardView(Context context) {
        super(context);
        BrazeImageSwitcher brazeImageSwitcher;
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(getLayoutResource(), this);
        BrazeImageSwitcher brazeImageSwitcher2 = (BrazeImageSwitcher) findViewById(R$id.com_braze_newsfeed_item_read_indicator_image_switcher);
        this.imageSwitcher = brazeImageSwitcher2;
        if (brazeImageSwitcher2 != null) {
            brazeImageSwitcher2.setFactory(new ViewSwitcher.ViewFactory() { // from class: H4.a
                @Override // android.widget.ViewSwitcher.ViewFactory
                public final View makeView() {
                    return BaseFeedCardView.g(BaseFeedCardView.this);
                }
            });
        }
        if (getIsUnreadCardVisualIndicatorEnabled() || (brazeImageSwitcher = this.imageSwitcher) == null) {
            return;
        }
        brazeImageSwitcher.setVisibility(8);
    }

    public static /* synthetic */ View g(BaseFeedCardView baseFeedCardView) {
        baseFeedCardView.getClass();
        return new ImageView(baseFeedCardView.applicationContext);
    }

    public Card getCard() {
        return this.card;
    }

    public abstract int getLayoutResource();

    public View getProperViewFromInflatedStub(int i6) {
        ((ViewStub) findViewById(i6)).inflate();
        return findViewById(R$id.com_braze_stubbed_feed_image_view);
    }

    @Override // com.braze.ui.widget.BaseCardView
    public boolean isClickHandled(Context context, Card card, IAction iAction) {
        return BrazeFeedManager.getInstance().getFeedCardClickActionListener().onFeedCardClicked(context, card, iAction);
    }

    public abstract void onSetCard(T t6);

    public void setCard(T t6) {
        this.card = t6;
        onSetCard(t6);
        this.card.setListener(new ICardListener() { // from class: H4.b
            @Override // com.braze.models.cards.ICardListener
            public final void onCardUpdate() {
                r0.setCardViewedIndicator(r0.imageSwitcher, BaseFeedCardView.this.getCard());
            }
        });
        setCardViewedIndicator(this.imageSwitcher, getCard());
    }
}
