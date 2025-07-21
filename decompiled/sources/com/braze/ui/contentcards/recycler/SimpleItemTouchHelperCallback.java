package com.braze.ui.contentcards.recycler;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/braze/ui/contentcards/recycler/SimpleItemTouchHelperCallback;", "Landroidx/recyclerview/widget/h$e;", "Lcom/braze/ui/contentcards/recycler/ItemTouchHelperAdapter;", "adapter", "<init>", "(Lcom/braze/ui/contentcards/recycler/ItemTouchHelperAdapter;)V", "", "isLongPressDragEnabled", "()Z", "isItemViewSwipeEnabled", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView$D;", "viewHolder", "", "getMovementFlags", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$D;)I", "target", "onMove", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$D;Landroidx/recyclerview/widget/RecyclerView$D;)Z", "direction", "", "onSwiped", "(Landroidx/recyclerview/widget/RecyclerView$D;I)V", "Lcom/braze/ui/contentcards/recycler/ItemTouchHelperAdapter;", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class SimpleItemTouchHelperCallback extends h.e {

    @NotNull
    private final ItemTouchHelperAdapter adapter;

    public SimpleItemTouchHelperCallback(@NotNull ItemTouchHelperAdapter adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.adapter = adapter;
    }

    @Override // androidx.recyclerview.widget.h.e
    public int getMovementFlags(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.D viewHolder) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        return h.e.makeMovementFlags(0, this.adapter.isItemDismissable(viewHolder.getBindingAdapterPosition()) ? 16 : 0);
    }

    @Override // androidx.recyclerview.widget.h.e
    public boolean isItemViewSwipeEnabled() {
        return true;
    }

    @Override // androidx.recyclerview.widget.h.e
    public boolean isLongPressDragEnabled() {
        return false;
    }

    @Override // androidx.recyclerview.widget.h.e
    public boolean onMove(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.D viewHolder, @NotNull RecyclerView.D target) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(target, "target");
        return false;
    }

    @Override // androidx.recyclerview.widget.h.e
    public void onSwiped(@NotNull RecyclerView.D viewHolder, int direction) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        this.adapter.onItemDismiss(viewHolder.getBindingAdapterPosition());
    }
}
