package com.braze.ui.widget;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.braze.models.cards.TextAnnouncementCard;
import com.braze.support.BrazeLogger;
import com.braze.ui.R$drawable;
import com.braze.ui.R$id;
import com.braze.ui.R$layout;
import com.braze.ui.actions.IAction;
import com.braze.ui.feed.view.BaseFeedCardView;
import com.braze.ui.widget.TextAnnouncementCardView;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class TextAnnouncementCardView extends BaseFeedCardView<TextAnnouncementCard> {
    private static final String TAG = BrazeLogger.getBrazeLogTag((Class<?>) TextAnnouncementCardView.class);
    private IAction mCardAction;
    private final TextView mDescription;
    private final TextView mDomain;
    private final TextView mTitle;

    public TextAnnouncementCardView(Context context) {
        this(context, null);
    }

    @Override // com.braze.ui.feed.view.BaseFeedCardView
    public int getLayoutResource() {
        return R$layout.com_braze_text_announcement_card;
    }

    public TextAnnouncementCardView(Context context, TextAnnouncementCard textAnnouncementCard) {
        super(context);
        this.mTitle = (TextView) findViewById(R$id.com_braze_text_announcement_card_title);
        this.mDescription = (TextView) findViewById(R$id.com_braze_text_announcement_card_description);
        this.mDomain = (TextView) findViewById(R$id.com_braze_text_announcement_card_domain);
        if (textAnnouncementCard != null) {
            setCard(textAnnouncementCard);
        }
        setBackground(getResources().getDrawable(R$drawable.com_braze_card_background, null));
    }

    @Override // com.braze.ui.feed.view.BaseFeedCardView
    public void onSetCard(final TextAnnouncementCard textAnnouncementCard) {
        this.mTitle.setText(textAnnouncementCard.getTitle());
        this.mDescription.setText(textAnnouncementCard.getDescription());
        setOptionalTextView(this.mDomain, textAnnouncementCard.getDomain());
        this.mCardAction = BaseCardView.getUriActionForCard(textAnnouncementCard);
        setOnClickListener(new View.OnClickListener() { // from class: O4.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r0.handleCardClick(r0.applicationContext, textAnnouncementCard, TextAnnouncementCardView.this.mCardAction);
            }
        });
    }
}
