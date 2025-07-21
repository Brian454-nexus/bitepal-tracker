package com.braze.ui.contentcards.adapters;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.e;
import com.braze.models.cards.Card;
import com.braze.support.BrazeLogger;
import com.braze.ui.contentcards.adapters.ContentCardAdapter;
import com.braze.ui.contentcards.handlers.IContentCardsViewBindingHandler;
import com.braze.ui.contentcards.listeners.IContentCardsActionListener;
import com.braze.ui.contentcards.managers.BrazeContentCardsManager;
import com.braze.ui.contentcards.recycler.ItemTouchHelperAdapter;
import com.braze.ui.contentcards.view.ContentCardViewHolder;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\b\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001IB-\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000fH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u000fH\u0016¢\u0006\u0004\b$\u0010\u0013J\u0017\u0010&\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\u0002H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\u0002H\u0016¢\u0006\u0004\b(\u0010'J\u0017\u0010*\u001a\u00020)2\u0006\u0010\u001a\u001a\u00020\u000fH\u0016¢\u0006\u0004\b*\u0010+J\u001b\u0010.\u001a\u00020\u001b2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\t0,¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\u001b¢\u0006\u0004\b0\u00101J\u0015\u00103\u001a\u00020\u00112\u0006\u00102\u001a\u00020\u000f¢\u0006\u0004\b3\u0010\u0013J\u0019\u00104\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\u00112\u0006\u00102\u001a\u00020\u000fH\u0007¢\u0006\u0004\b6\u0010\u0013J\u0019\u00108\u001a\u00020\u001b2\b\u00107\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b8\u00109R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010:R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010;R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010<R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001c\u0010C\u001a\b\u0012\u0004\u0012\u00020B0A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR0\u0010E\u001a\b\u0012\u0004\u0012\u00020B0,2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020B0,8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bF\u0010G\"\u0004\bH\u0010/¨\u0006J"}, d2 = {"Lcom/braze/ui/contentcards/adapters/ContentCardAdapter;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/braze/ui/contentcards/view/ContentCardViewHolder;", "Lcom/braze/ui/contentcards/recycler/ItemTouchHelperAdapter;", "Landroid/content/Context;", "context", "Landroidx/recyclerview/widget/LinearLayoutManager;", "layoutManager", "", "Lcom/braze/models/cards/Card;", "cardData", "Lcom/braze/ui/contentcards/handlers/IContentCardsViewBindingHandler;", "contentCardsViewBindingHandler", "<init>", "(Landroid/content/Context;Landroidx/recyclerview/widget/LinearLayoutManager;Ljava/util/List;Lcom/braze/ui/contentcards/handlers/IContentCardsViewBindingHandler;)V", "", "index", "", "isInvalidIndex", "(I)Z", "Landroid/view/ViewGroup;", "viewGroup", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/braze/ui/contentcards/view/ContentCardViewHolder;", "viewHolder", "position", "", "onBindViewHolder", "(Lcom/braze/ui/contentcards/view/ContentCardViewHolder;I)V", "getItemViewType", "(I)I", "getItemCount", "()I", "onItemDismiss", "(I)V", "isItemDismissable", "holder", "onViewAttachedToWindow", "(Lcom/braze/ui/contentcards/view/ContentCardViewHolder;)V", "onViewDetachedFromWindow", "", "getItemId", "(I)J", "", "newCardData", "replaceCards", "(Ljava/util/List;)V", "markOnScreenCardsAsRead", "()V", "adapterPosition", "isControlCardAtPosition", "getCardAtIndex", "(I)Lcom/braze/models/cards/Card;", "isAdapterPositionOnScreen", "card", "logImpression", "(Lcom/braze/models/cards/Card;)V", "Landroid/content/Context;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Ljava/util/List;", "Lcom/braze/ui/contentcards/handlers/IContentCardsViewBindingHandler;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "", "", "impressedCardIdsInternal", "Ljava/util/Set;", "impressedCardIds", "getImpressedCardIds", "()Ljava/util/List;", "setImpressedCardIds", "CardListDiffCallback", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class ContentCardAdapter extends RecyclerView.h implements ItemTouchHelperAdapter {

    @NotNull
    private final List<Card> cardData;

    @NotNull
    private final IContentCardsViewBindingHandler contentCardsViewBindingHandler;

    @NotNull
    private final Context context;

    @NotNull
    private final Handler handler;

    @NotNull
    private Set<String> impressedCardIdsInternal;

    @NotNull
    private final LinearLayoutManager layoutManager;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/braze/ui/contentcards/adapters/ContentCardAdapter$CardListDiffCallback;", "Landroidx/recyclerview/widget/e$b;", "", "Lcom/braze/models/cards/Card;", "oldCards", "newCards", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "oldItemPosition", "newItemPosition", "", "doItemsShareIds", "(II)Z", "getOldListSize", "()I", "getNewListSize", "areItemsTheSame", "areContentsTheSame", "Ljava/util/List;", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class CardListDiffCallback extends e.b {

        @NotNull
        private final List<Card> newCards;

        @NotNull
        private final List<Card> oldCards;

        /* JADX WARN: Multi-variable type inference failed */
        public CardListDiffCallback(@NotNull List<? extends Card> oldCards, @NotNull List<? extends Card> newCards) {
            Intrinsics.checkNotNullParameter(oldCards, "oldCards");
            Intrinsics.checkNotNullParameter(newCards, "newCards");
            this.oldCards = oldCards;
            this.newCards = newCards;
        }

        private final boolean doItemsShareIds(int oldItemPosition, int newItemPosition) {
            return Intrinsics.areEqual(this.oldCards.get(oldItemPosition).getId(), this.newCards.get(newItemPosition).getId());
        }

        @Override // androidx.recyclerview.widget.e.b
        public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
            return doItemsShareIds(oldItemPosition, newItemPosition);
        }

        @Override // androidx.recyclerview.widget.e.b
        public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
            return doItemsShareIds(oldItemPosition, newItemPosition);
        }

        @Override // androidx.recyclerview.widget.e.b
        public int getNewListSize() {
            return this.newCards.size();
        }

        @Override // androidx.recyclerview.widget.e.b
        public int getOldListSize() {
            return this.oldCards.size();
        }
    }

    public ContentCardAdapter(@NotNull Context context, @NotNull LinearLayoutManager layoutManager, @NotNull List<Card> cardData, @NotNull IContentCardsViewBindingHandler contentCardsViewBindingHandler) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(layoutManager, "layoutManager");
        Intrinsics.checkNotNullParameter(cardData, "cardData");
        Intrinsics.checkNotNullParameter(contentCardsViewBindingHandler, "contentCardsViewBindingHandler");
        this.context = context;
        this.layoutManager = layoutManager;
        this.cardData = cardData;
        this.contentCardsViewBindingHandler = contentCardsViewBindingHandler;
        this.handler = new Handler(Looper.getMainLooper());
        this.impressedCardIdsInternal = new LinkedHashSet();
        setHasStableIds(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getCardAtIndex$lambda$7(int i6, ContentCardAdapter contentCardAdapter) {
        return "Cannot return card at index: " + i6 + " in cards list of size: " + contentCardAdapter.cardData.size();
    }

    private final boolean isInvalidIndex(int index) {
        return index < 0 || index >= this.cardData.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logImpression$lambda$8(Card card) {
        return "Logged impression for card " + card.getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logImpression$lambda$9(Card card) {
        return "Already counted impression for card " + card.getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String markOnScreenCardsAsRead$lambda$4() {
        return "Card list is empty. Not marking on-screen cards as read.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String markOnScreenCardsAsRead$lambda$5(int i6, int i7) {
        return "Not marking all on-screen cards as read. Either the first or last index is negative. First visible: " + i6 + " . Last visible: " + i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void markOnScreenCardsAsRead$lambda$6(int i6, int i7, ContentCardAdapter contentCardAdapter) {
        contentCardAdapter.notifyItemRangeChanged(i7, (i6 - i7) + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onItemDismiss$lambda$0(int i6, ContentCardAdapter contentCardAdapter) {
        return "Cannot dismiss card at index: " + i6 + " in cards list of size: " + contentCardAdapter.cardData.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onViewAttachedToWindow$lambda$1(int i6) {
        return "The card at position " + i6 + " isn't on screen or does not have a valid adapter position. Not logging impression.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onViewDetachedFromWindow$lambda$2(int i6) {
        return "The card at position " + i6 + " isn't on screen or does not have a valid adapter position. Not marking as read.";
    }

    @Nullable
    public final Card getCardAtIndex(final int index) {
        if (!isInvalidIndex(index)) {
            return this.cardData.get(index);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: D4.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String cardAtIndex$lambda$7;
                cardAtIndex$lambda$7 = ContentCardAdapter.getCardAtIndex$lambda$7(index, this);
                return cardAtIndex$lambda$7;
            }
        }, 7, (Object) null);
        return null;
    }

    @NotNull
    public final List<String> getImpressedCardIds() {
        return CollectionsKt.toList(this.impressedCardIdsInternal);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.cardData.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long getItemId(int position) {
        String id;
        Card cardAtIndex = getCardAtIndex(position);
        if (cardAtIndex == null || (id = cardAtIndex.getId()) == null) {
            return 0L;
        }
        return id.hashCode();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int position) {
        return this.contentCardsViewBindingHandler.getItemViewType(this.context, this.cardData, position);
    }

    public final boolean isAdapterPositionOnScreen(int adapterPosition) {
        return Math.min(this.layoutManager.V1(), this.layoutManager.R1()) <= adapterPosition && adapterPosition <= Math.max(this.layoutManager.Y1(), this.layoutManager.W1());
    }

    public final boolean isControlCardAtPosition(int adapterPosition) {
        Card cardAtIndex = getCardAtIndex(adapterPosition);
        return cardAtIndex != null && cardAtIndex.isControl();
    }

    @Override // com.braze.ui.contentcards.recycler.ItemTouchHelperAdapter
    public boolean isItemDismissable(int position) {
        if (this.cardData.isEmpty() || isInvalidIndex(position)) {
            return false;
        }
        return this.cardData.get(position).getIsDismissibleByUser();
    }

    public final void logImpression(@Nullable final Card card) {
        if (card == null) {
            return;
        }
        if (this.impressedCardIdsInternal.contains(card.getId())) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: D4.j
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String logImpression$lambda$9;
                    logImpression$lambda$9 = ContentCardAdapter.logImpression$lambda$9(Card.this);
                    return logImpression$lambda$9;
                }
            }, 6, (Object) null);
        } else {
            card.logImpression();
            this.impressedCardIdsInternal.add(card.getId());
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: D4.i
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String logImpression$lambda$8;
                    logImpression$lambda$8 = ContentCardAdapter.logImpression$lambda$8(Card.this);
                    return logImpression$lambda$8;
                }
            }, 6, (Object) null);
        }
        if (card.getWasViewedInternal()) {
            return;
        }
        card.setViewed(true);
    }

    public final void markOnScreenCardsAsRead() {
        if (this.cardData.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: D4.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String markOnScreenCardsAsRead$lambda$4;
                    markOnScreenCardsAsRead$lambda$4 = ContentCardAdapter.markOnScreenCardsAsRead$lambda$4();
                    return markOnScreenCardsAsRead$lambda$4;
                }
            }, 7, (Object) null);
            return;
        }
        final int V12 = this.layoutManager.V1();
        final int Y12 = this.layoutManager.Y1();
        if (V12 < 0 || Y12 < 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: D4.c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String markOnScreenCardsAsRead$lambda$5;
                    markOnScreenCardsAsRead$lambda$5 = ContentCardAdapter.markOnScreenCardsAsRead$lambda$5(V12, Y12);
                    return markOnScreenCardsAsRead$lambda$5;
                }
            }, 7, (Object) null);
            return;
        }
        if (V12 <= Y12) {
            int i6 = V12;
            while (true) {
                Card cardAtIndex = getCardAtIndex(i6);
                if (cardAtIndex != null) {
                    cardAtIndex.setIndicatorHighlighted(true);
                }
                if (i6 == Y12) {
                    break;
                } else {
                    i6++;
                }
            }
        }
        this.handler.post(new Runnable() { // from class: D4.d
            @Override // java.lang.Runnable
            public final void run() {
                ContentCardAdapter.markOnScreenCardsAsRead$lambda$6(Y12, V12, this);
            }
        });
    }

    @Override // com.braze.ui.contentcards.recycler.ItemTouchHelperAdapter
    public void onItemDismiss(final int position) {
        if (isInvalidIndex(position)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: D4.e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String onItemDismiss$lambda$0;
                    onItemDismiss$lambda$0 = ContentCardAdapter.onItemDismiss$lambda$0(position, this);
                    return onItemDismiss$lambda$0;
                }
            }, 7, (Object) null);
            return;
        }
        Card remove = this.cardData.remove(position);
        remove.setDismissed(true);
        notifyItemRemoved(position);
        IContentCardsActionListener contentCardsActionListener = BrazeContentCardsManager.INSTANCE.getInstance().getContentCardsActionListener();
        if (contentCardsActionListener != null) {
            contentCardsActionListener.onContentCardDismissed(this.context, remove);
        }
    }

    public final synchronized void replaceCards(@NotNull List<? extends Card> newCardData) {
        Intrinsics.checkNotNullParameter(newCardData, "newCardData");
        e.C0148e b6 = e.b(new CardListDiffCallback(this.cardData, newCardData));
        Intrinsics.checkNotNullExpressionValue(b6, "calculateDiff(...)");
        this.cardData.clear();
        this.cardData.addAll(newCardData);
        b6.b(this);
    }

    public final void setImpressedCardIds(@NotNull List<String> impressedCardIds) {
        Intrinsics.checkNotNullParameter(impressedCardIds, "impressedCardIds");
        this.impressedCardIdsInternal = CollectionsKt.toMutableSet(impressedCardIds);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(@NotNull ContentCardViewHolder viewHolder, int position) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        this.contentCardsViewBindingHandler.onBindViewHolder(this.context, this.cardData, viewHolder, position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    public ContentCardViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int viewType) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        return this.contentCardsViewBindingHandler.onCreateViewHolder(this.context, this.cardData, viewGroup, viewType);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewAttachedToWindow(@NotNull ContentCardViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewAttachedToWindow((RecyclerView.D) holder);
        if (this.cardData.isEmpty()) {
            return;
        }
        final int bindingAdapterPosition = holder.getBindingAdapterPosition();
        if (bindingAdapterPosition != -1 && isAdapterPositionOnScreen(bindingAdapterPosition)) {
            logImpression(getCardAtIndex(bindingAdapterPosition));
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: D4.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String onViewAttachedToWindow$lambda$1;
                    onViewAttachedToWindow$lambda$1 = ContentCardAdapter.onViewAttachedToWindow$lambda$1(bindingAdapterPosition);
                    return onViewAttachedToWindow$lambda$1;
                }
            }, 6, (Object) null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewDetachedFromWindow(@NotNull ContentCardViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewDetachedFromWindow((RecyclerView.D) holder);
        if (this.cardData.isEmpty()) {
            return;
        }
        final int bindingAdapterPosition = holder.getBindingAdapterPosition();
        if (bindingAdapterPosition != -1 && isAdapterPositionOnScreen(bindingAdapterPosition)) {
            Card cardAtIndex = getCardAtIndex(bindingAdapterPosition);
            if (cardAtIndex == null || cardAtIndex.getIsIndicatorHighlightedInternal()) {
                return;
            }
            cardAtIndex.setIndicatorHighlighted(true);
            this.handler.post(new Runnable() { // from class: D4.h
                @Override // java.lang.Runnable
                public final void run() {
                    ContentCardAdapter.this.notifyItemChanged(bindingAdapterPosition);
                }
            });
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: D4.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String onViewDetachedFromWindow$lambda$2;
                onViewDetachedFromWindow$lambda$2 = ContentCardAdapter.onViewDetachedFromWindow$lambda$2(bindingAdapterPosition);
                return onViewDetachedFromWindow$lambda$2;
            }
        }, 6, (Object) null);
    }
}
