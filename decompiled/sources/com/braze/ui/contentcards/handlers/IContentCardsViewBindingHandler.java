package com.braze.ui.contentcards.handlers;

import android.content.Context;
import android.os.Parcelable;
import android.view.ViewGroup;
import com.braze.models.cards.Card;
import com.braze.ui.contentcards.view.ContentCardViewHolder;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J.\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\fH&J&\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0010\u001a\u00020\fH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Lcom/braze/ui/contentcards/handlers/IContentCardsViewBindingHandler;", "Landroid/os/Parcelable;", "onCreateViewHolder", "Lcom/braze/ui/contentcards/view/ContentCardViewHolder;", "context", "Landroid/content/Context;", "cards", "", "Lcom/braze/models/cards/Card;", "viewGroup", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "", "viewHolder", "adapterPosition", "getItemViewType", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface IContentCardsViewBindingHandler extends Parcelable {
    int getItemViewType(@NotNull Context context, @NotNull List<? extends Card> cards, int adapterPosition);

    void onBindViewHolder(@NotNull Context context, @NotNull List<? extends Card> cards, @NotNull ContentCardViewHolder viewHolder, int adapterPosition);

    @NotNull
    ContentCardViewHolder onCreateViewHolder(@NotNull Context context, @NotNull List<? extends Card> cards, @NotNull ViewGroup viewGroup, int viewType);
}
