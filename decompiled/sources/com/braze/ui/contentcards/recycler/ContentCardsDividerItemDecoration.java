package com.braze.ui.contentcards.recycler;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.braze.ui.R$dimen;
import com.braze.ui.contentcards.adapters.ContentCardAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ/\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/braze/ui/contentcards/recycler/ContentCardsDividerItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$o;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "parentWidth", "getSidePaddingValue", "(I)I", "Landroid/graphics/Rect;", "itemViewOutputRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "appContext", "Landroid/content/Context;", "itemDividerHeight", "I", "contentCardsItemMaxWidth", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class ContentCardsDividerItemDecoration extends RecyclerView.o {

    @NotNull
    private final Context appContext;
    private final int contentCardsItemMaxWidth;
    private final int itemDividerHeight;

    public ContentCardsDividerItemDecoration(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.appContext = applicationContext;
        this.itemDividerHeight = applicationContext.getResources().getDimensionPixelSize(R$dimen.com_braze_content_cards_divider_height);
        this.contentCardsItemMaxWidth = applicationContext.getResources().getDimensionPixelSize(R$dimen.com_braze_content_cards_max_width);
    }

    private final int getSidePaddingValue(int parentWidth) {
        return RangesKt.coerceAtLeast((parentWidth - this.contentCardsItemMaxWidth) / 2, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void getItemOffsets(@NotNull Rect itemViewOutputRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        boolean z6;
        Intrinsics.checkNotNullParameter(itemViewOutputRect, "itemViewOutputRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.getItemOffsets(itemViewOutputRect, view, parent, state);
        int e02 = parent.e0(view);
        if (parent.getAdapter() instanceof ContentCardAdapter) {
            RecyclerView.h adapter = parent.getAdapter();
            Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.braze.ui.contentcards.adapters.ContentCardAdapter");
            z6 = ((ContentCardAdapter) adapter).isControlCardAtPosition(e02);
        } else {
            z6 = false;
        }
        itemViewOutputRect.top = e02 == 0 ? this.itemDividerHeight : 0;
        itemViewOutputRect.bottom = z6 ? 0 : this.itemDividerHeight;
        int sidePaddingValue = getSidePaddingValue(parent.getWidth());
        itemViewOutputRect.left = sidePaddingValue;
        itemViewOutputRect.right = sidePaddingValue;
    }
}
