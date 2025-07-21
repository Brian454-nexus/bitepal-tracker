package com.braze.ui.feed.listeners;

import android.content.Context;
import com.braze.models.cards.Card;
import com.braze.ui.actions.IAction;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface IFeedClickActionListener {
    boolean onFeedCardClicked(Context context, Card card, IAction iAction);
}
