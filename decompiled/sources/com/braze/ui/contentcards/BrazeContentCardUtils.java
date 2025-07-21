package com.braze.ui.contentcards;

import android.os.Bundle;
import com.braze.models.cards.Card;
import com.braze.support.BrazeLogger;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.actions.UriAction;
import com.braze.ui.actions.brazeactions.BrazeActionUtils;
import com.braze.ui.contentcards.BrazeContentCardUtils;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/braze/ui/contentcards/BrazeContentCardUtils;", "", "<init>", "()V", "", "Lcom/braze/models/cards/Card;", "cards", "defaultCardHandling", "(Ljava/util/List;)Ljava/util/List;", "card", "Lcom/braze/ui/actions/UriAction;", "getUriActionForCard", "(Lcom/braze/models/cards/Card;)Lcom/braze/ui/actions/UriAction;", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBrazeContentCardUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BrazeContentCardUtils.kt\ncom/braze/ui/contentcards/BrazeContentCardUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,91:1\n774#2:92\n865#2,2:93\n*S KotlinDebug\n*F\n+ 1 BrazeContentCardUtils.kt\ncom/braze/ui/contentcards/BrazeContentCardUtils\n*L\n41#1:92\n41#1:93,2\n*E\n"})
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class BrazeContentCardUtils {

    @NotNull
    public static final BrazeContentCardUtils INSTANCE = new BrazeContentCardUtils();

    private BrazeContentCardUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int defaultCardHandling$lambda$0(Card cardA, Card cardB) {
        Intrinsics.checkNotNullParameter(cardA, "cardA");
        Intrinsics.checkNotNullParameter(cardB, "cardB");
        if (cardA.getIsPinned() && !cardB.getIsPinned()) {
            return -1;
        }
        if (!cardA.getIsPinned() && cardB.getIsPinned()) {
            return 1;
        }
        if (cardA.getCreated() > cardB.getCreated()) {
            return -1;
        }
        if (cardA.getCreated() < cardB.getCreated()) {
            return 1;
        }
        if (cardA.getId().compareTo(cardB.getId()) > 0) {
            return -1;
        }
        return cardA.getId().compareTo(cardB.getId()) < 0 ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getUriActionForCard$lambda$2() {
        return "Card URL is null, returning null for getUriActionForCard";
    }

    @NotNull
    public final List<Card> defaultCardHandling(@NotNull List<? extends Card> cards) {
        Intrinsics.checkNotNullParameter(cards, "cards");
        Comparator comparator = new Comparator() { // from class: C4.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int defaultCardHandling$lambda$0;
                defaultCardHandling$lambda$0 = BrazeContentCardUtils.defaultCardHandling$lambda$0((Card) obj, (Card) obj2);
                return defaultCardHandling$lambda$0;
            }
        };
        ArrayList arrayList = new ArrayList();
        for (Object obj : cards) {
            if (!BrazeActionUtils.containsInvalidBrazeAction((Card) obj)) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt.sortedWith(arrayList, comparator);
    }

    @Nullable
    public final UriAction getUriActionForCard(@NotNull Card card) {
        Intrinsics.checkNotNullParameter(card, "card");
        String url = card.getUrl();
        if (url == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: C4.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String uriActionForCard$lambda$2;
                    uriActionForCard$lambda$2 = BrazeContentCardUtils.getUriActionForCard$lambda$2();
                    return uriActionForCard$lambda$2;
                }
            }, 6, (Object) null);
            return null;
        }
        Bundle bundle = new Bundle();
        for (String str : card.getExtras().keySet()) {
            bundle.putString(str, card.getExtras().get(str));
        }
        return BrazeDeeplinkHandler.INSTANCE.getInstance().createUriActionFromUrlString(url, bundle, card.getOpenUriInWebView(), card.getChannel());
    }
}
