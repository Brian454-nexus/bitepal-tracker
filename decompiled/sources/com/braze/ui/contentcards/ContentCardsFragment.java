package com.braze.ui.contentcards;

import P0.AbstractComponentCallbacksC0708p;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import androidx.recyclerview.widget.n;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.amazon.a.a.o.b;
import com.braze.Braze;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.events.ContentCardsUpdatedEvent;
import com.braze.events.IEventSubscriber;
import com.braze.events.SdkDataWipeEvent;
import com.braze.support.BrazeLogger;
import com.braze.ui.R$color;
import com.braze.ui.R$id;
import com.braze.ui.R$layout;
import com.braze.ui.R$string;
import com.braze.ui.contentcards.ContentCardsFragment;
import com.braze.ui.contentcards.adapters.ContentCardAdapter;
import com.braze.ui.contentcards.adapters.EmptyContentCardsAdapter;
import com.braze.ui.contentcards.handlers.DefaultContentCardsUpdateHandler;
import com.braze.ui.contentcards.handlers.DefaultContentCardsViewBindingHandler;
import com.braze.ui.contentcards.handlers.IContentCardsUpdateHandler;
import com.braze.ui.contentcards.handlers.IContentCardsViewBindingHandler;
import com.braze.ui.contentcards.recycler.ContentCardsDividerItemDecoration;
import com.braze.ui.contentcards.recycler.SimpleItemTouchHelperCallback;
import ga.L;
import ga.Y;
import ga.i;
import ga.u0;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0016\u0018\u0000 h2\u00020\u00012\u00020\u0002:\u0001hB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u0004J\u000f\u0010\u001b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001b\u0010\u0004J\u000f\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001c\u0010\u0004J\u0017\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010 \u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b \u0010\u001fJ\u000f\u0010!\u001a\u00020\tH\u0004¢\u0006\u0004\b!\u0010\u0004J\u000f\u0010\"\u001a\u00020\tH\u0004¢\u0006\u0004\b\"\u0010\u0004J\u0017\u0010%\u001a\u00020\t2\u0006\u0010$\u001a\u00020#H\u0004¢\u0006\u0004\b%\u0010&J\u0018\u0010'\u001a\u00020\t2\u0006\u0010$\u001a\u00020#H\u0084@¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\tH\u0084@¢\u0006\u0004\b)\u0010*J\u001b\u0010-\u001a\u00020\t2\n\u0010,\u001a\u0006\u0012\u0002\b\u00030+H\u0004¢\u0006\u0004\b-\u0010.R$\u00100\u001a\u0004\u0018\u00010/8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R.\u00107\u001a\u0004\u0018\u0001062\b\u0010\b\u001a\u0004\u0018\u0001068\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0018\u0010>\u001a\u0004\u0018\u00010=8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\"\u0010A\u001a\u00020@8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR$\u0010H\u001a\u0004\u0018\u00010G8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR*\u0010O\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010N8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR*\u0010V\u001a\n\u0012\u0004\u0012\u00020U\u0018\u00010N8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bV\u0010P\u001a\u0004\bW\u0010R\"\u0004\bX\u0010TR\u001a\u0010Y\u001a\u00020\u00058\u0004X\u0084\u0004¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\u0007R$\u0010\\\u001a\u0004\u0018\u00010\u00058\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\\\u0010Z\u001a\u0004\b]\u0010\u0007\"\u0004\b^\u0010\u000bR\u001a\u0010_\u001a\u00020\f8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010\u000eR$\u0010b\u001a\u0004\u0018\u00010\f8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bb\u0010`\u001a\u0004\bc\u0010\u000e\"\u0004\bd\u0010\u0010R\u0018\u0010g\u001a\u0006\u0012\u0002\b\u00030+8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\be\u0010f¨\u0006i"}, d2 = {"Lcom/braze/ui/contentcards/ContentCardsFragment;", "LP0/p;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$j;", "<init>", "()V", "Lcom/braze/ui/contentcards/handlers/IContentCardsUpdateHandler;", "getContentCardUpdateHandler", "()Lcom/braze/ui/contentcards/handlers/IContentCardsUpdateHandler;", b.f11195Y, "", "setContentCardUpdateHandler", "(Lcom/braze/ui/contentcards/handlers/IContentCardsUpdateHandler;)V", "Lcom/braze/ui/contentcards/handlers/IContentCardsViewBindingHandler;", "getContentCardsViewBindingHandler", "()Lcom/braze/ui/contentcards/handlers/IContentCardsViewBindingHandler;", "setContentCardsViewBindingHandler", "(Lcom/braze/ui/contentcards/handlers/IContentCardsViewBindingHandler;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onRefresh", "onResume", "onPause", "outState", "onSaveInstanceState", "(Landroid/os/Bundle;)V", "onViewStateRestored", "initializeRecyclerView", "attachSwipeHelperCallback", "Lcom/braze/events/ContentCardsUpdatedEvent;", "event", "handleContentCardsUpdatedEvent", "(Lcom/braze/events/ContentCardsUpdatedEvent;)V", "contentCardsUpdate", "(Lcom/braze/events/ContentCardsUpdatedEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "networkUnavailable", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/recyclerview/widget/RecyclerView$h;", "newAdapter", "swapRecyclerViewAdapter", "(Landroidx/recyclerview/widget/RecyclerView$h;)V", "Lga/u0;", "networkUnavailableJob", "Lga/u0;", "getNetworkUnavailableJob", "()Lga/u0;", "setNetworkUnavailableJob", "(Lga/u0;)V", "Landroidx/recyclerview/widget/RecyclerView;", "contentCardsRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getContentCardsRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setContentCardsRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Lcom/braze/ui/contentcards/adapters/ContentCardAdapter;", "cardAdapter", "Lcom/braze/ui/contentcards/adapters/ContentCardAdapter;", "Lcom/braze/ui/contentcards/adapters/EmptyContentCardsAdapter;", "defaultEmptyContentCardsAdapter", "Lcom/braze/ui/contentcards/adapters/EmptyContentCardsAdapter;", "getDefaultEmptyContentCardsAdapter", "()Lcom/braze/ui/contentcards/adapters/EmptyContentCardsAdapter;", "setDefaultEmptyContentCardsAdapter", "(Lcom/braze/ui/contentcards/adapters/EmptyContentCardsAdapter;)V", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "contentCardsSwipeLayout", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "getContentCardsSwipeLayout", "()Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "setContentCardsSwipeLayout", "(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V", "Lcom/braze/events/IEventSubscriber;", "contentCardsUpdatedSubscriber", "Lcom/braze/events/IEventSubscriber;", "getContentCardsUpdatedSubscriber", "()Lcom/braze/events/IEventSubscriber;", "setContentCardsUpdatedSubscriber", "(Lcom/braze/events/IEventSubscriber;)V", "Lcom/braze/events/SdkDataWipeEvent;", "sdkDataWipeEventSubscriber", "getSdkDataWipeEventSubscriber", "setSdkDataWipeEventSubscriber", "defaultContentCardUpdateHandler", "Lcom/braze/ui/contentcards/handlers/IContentCardsUpdateHandler;", "getDefaultContentCardUpdateHandler", "customContentCardUpdateHandler", "getCustomContentCardUpdateHandler", "setCustomContentCardUpdateHandler", "defaultContentCardsViewBindingHandler", "Lcom/braze/ui/contentcards/handlers/IContentCardsViewBindingHandler;", "getDefaultContentCardsViewBindingHandler", "customContentCardsViewBindingHandler", "getCustomContentCardsViewBindingHandler", "setCustomContentCardsViewBindingHandler", "getEmptyCardsAdapter", "()Landroidx/recyclerview/widget/RecyclerView$h;", "emptyCardsAdapter", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nContentCardsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentCardsFragment.kt\ncom/braze/ui/contentcards/ContentCardsFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,378:1\n1755#2,3:379\n1863#2,2:382\n*S KotlinDebug\n*F\n+ 1 ContentCardsFragment.kt\ncom/braze/ui/contentcards/ContentCardsFragment\n*L\n321#1:379,3\n330#1:382,2\n*E\n"})
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class ContentCardsFragment extends AbstractComponentCallbacksC0708p implements SwipeRefreshLayout.j {

    @JvmField
    @Nullable
    public ContentCardAdapter cardAdapter;

    @Nullable
    private RecyclerView contentCardsRecyclerView;

    @Nullable
    private SwipeRefreshLayout contentCardsSwipeLayout;

    @Nullable
    private IEventSubscriber<ContentCardsUpdatedEvent> contentCardsUpdatedSubscriber;

    @Nullable
    private IContentCardsUpdateHandler customContentCardUpdateHandler;

    @Nullable
    private IContentCardsViewBindingHandler customContentCardsViewBindingHandler;

    @Nullable
    private u0 networkUnavailableJob;

    @Nullable
    private IEventSubscriber<SdkDataWipeEvent> sdkDataWipeEventSubscriber;

    @NotNull
    private EmptyContentCardsAdapter defaultEmptyContentCardsAdapter = new EmptyContentCardsAdapter();

    @NotNull
    private final IContentCardsUpdateHandler defaultContentCardUpdateHandler = new DefaultContentCardsUpdateHandler();

    @NotNull
    private final IContentCardsViewBindingHandler defaultContentCardsViewBindingHandler = new DefaultContentCardsViewBindingHandler();

    /* JADX INFO: Access modifiers changed from: private */
    public static final String contentCardsUpdate$lambda$10(ContentCardsUpdatedEvent contentCardsUpdatedEvent) {
        return "Updating Content Cards views in response to ContentCardsUpdatedEvent: " + contentCardsUpdatedEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String contentCardsUpdate$lambda$11() {
        return "ContentCards received was older than the max time to live of 60 seconds, displaying it for now, but requesting an updated view from the server.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String contentCardsUpdate$lambda$12() {
        return "Old Content Cards was empty, putting up a network spinner and registering the network error message on a delay of 5000 ms.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String networkUnavailable$lambda$16() {
        return "Displaying network unavailable toast.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onPause$lambda$4() {
        return "Invoked com.braze.ui.contentcards.ContentCardsFragment.onPause()";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResume$lambda$0(ContentCardsFragment contentCardsFragment, ContentCardsUpdatedEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        contentCardsFragment.handleContentCardsUpdatedEvent(event);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResume$lambda$2(ContentCardsFragment contentCardsFragment, SdkDataWipeEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        contentCardsFragment.handleContentCardsUpdatedEvent(ContentCardsUpdatedEvent.INSTANCE.getEmptyUpdate());
    }

    public final void attachSwipeHelperCallback() {
        ContentCardAdapter contentCardAdapter = this.cardAdapter;
        if (contentCardAdapter != null) {
            new h(new SimpleItemTouchHelperCallback(contentCardAdapter)).g(this.contentCardsRecyclerView);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00e1  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object contentCardsUpdate(@org.jetbrains.annotations.NotNull final com.braze.events.ContentCardsUpdatedEvent r11, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r12) {
        /*
            r10 = this;
            com.braze.support.BrazeLogger r0 = com.braze.support.BrazeLogger.INSTANCE
            com.braze.support.BrazeLogger$Priority r2 = com.braze.support.BrazeLogger.Priority.f12983V
            C4.g r5 = new C4.g
            r5.<init>()
            r6 = 6
            r7 = 0
            r3 = 0
            r4 = 0
            r1 = r10
            com.braze.support.BrazeLogger.brazelog$default(r0, r1, r2, r3, r4, r5, r6, r7)
            com.braze.ui.contentcards.handlers.IContentCardsUpdateHandler r12 = r10.getContentCardUpdateHandler()
            java.util.List r12 = r12.handleCardUpdate(r11)
            com.braze.ui.contentcards.adapters.ContentCardAdapter r2 = r1.cardAdapter
            if (r2 == 0) goto L20
            r2.replaceCards(r12)
        L20:
            ga.u0 r2 = r1.networkUnavailableJob
            r8 = 1
            r9 = 0
            if (r2 == 0) goto L29
            ga.u0.a.b(r2, r9, r8, r9)
        L29:
            r1.networkUnavailableJob = r9
            boolean r2 = r11.getIsFromOfflineStorage()
            if (r2 == 0) goto L94
            r2 = 60
            boolean r11 = r11.isTimestampOlderThan(r2)
            if (r11 == 0) goto L94
            com.braze.support.BrazeLogger$Priority r2 = com.braze.support.BrazeLogger.Priority.f12982I
            C4.h r5 = new C4.h
            r5.<init>()
            r6 = 6
            r7 = 0
            r3 = 0
            r4 = 0
            com.braze.support.BrazeLogger.brazelog$default(r0, r1, r2, r3, r4, r5, r6, r7)
            com.braze.Braze$Companion r11 = com.braze.Braze.INSTANCE
            android.content.Context r2 = r10.requireContext()
            java.lang.String r3 = "requireContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            com.braze.Braze r11 = r11.getInstance(r2)
            r11.requestContentCardsRefresh()
            boolean r11 = r12.isEmpty()
            if (r11 == 0) goto L94
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r11 = r1.contentCardsSwipeLayout
            if (r11 == 0) goto L66
            r11.setRefreshing(r8)
        L66:
            C4.i r5 = new C4.i
            r5.<init>()
            r6 = 7
            r7 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            com.braze.support.BrazeLogger.brazelog$default(r0, r1, r2, r3, r4, r5, r6, r7)
            ga.u0 r11 = r1.networkUnavailableJob
            if (r11 == 0) goto L7a
            ga.u0.a.b(r11, r9, r8, r9)
        L7a:
            com.braze.coroutine.BrazeCoroutineScope r11 = com.braze.coroutine.BrazeCoroutineScope.INSTANCE
            r2 = 5000(0x1388, double:2.4703E-320)
            java.lang.Long r12 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r2)
            ga.G0 r0 = ga.Y.c()
            com.braze.ui.contentcards.ContentCardsFragment$contentCardsUpdate$5 r2 = new com.braze.ui.contentcards.ContentCardsFragment$contentCardsUpdate$5
            r2.<init>(r10, r9)
            ga.u0 r11 = r11.launchDelayed(r12, r0, r2)
            r1.networkUnavailableJob = r11
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        L94:
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            boolean r11 = r12 instanceof java.util.Collection
            if (r11 == 0) goto La4
            r11 = r12
            java.util.Collection r11 = (java.util.Collection) r11
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto La4
            goto Lc2
        La4:
            java.util.Iterator r11 = r12.iterator()
        La8:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto Lc2
            java.lang.Object r0 = r11.next()
            com.braze.models.cards.Card r0 = (com.braze.models.cards.Card) r0
            boolean r0 = r0.isControl()
            if (r0 != 0) goto La8
            com.braze.ui.contentcards.adapters.ContentCardAdapter r11 = r1.cardAdapter
            if (r11 == 0) goto Ldd
            r10.swapRecyclerViewAdapter(r11)
            goto Ldd
        Lc2:
            java.util.Iterator r11 = r12.iterator()
        Lc6:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto Ld6
            java.lang.Object r12 = r11.next()
            com.braze.models.cards.Card r12 = (com.braze.models.cards.Card) r12
            r12.logImpression()
            goto Lc6
        Ld6:
            androidx.recyclerview.widget.RecyclerView$h r11 = r10.getEmptyCardsAdapter()
            r10.swapRecyclerViewAdapter(r11)
        Ldd:
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r11 = r1.contentCardsSwipeLayout
            if (r11 == 0) goto Le5
            r12 = 0
            r11.setRefreshing(r12)
        Le5:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.ui.contentcards.ContentCardsFragment.contentCardsUpdate(com.braze.events.ContentCardsUpdatedEvent, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @NotNull
    public final IContentCardsUpdateHandler getContentCardUpdateHandler() {
        IContentCardsUpdateHandler iContentCardsUpdateHandler = this.customContentCardUpdateHandler;
        return iContentCardsUpdateHandler == null ? this.defaultContentCardUpdateHandler : iContentCardsUpdateHandler;
    }

    @Nullable
    public final RecyclerView getContentCardsRecyclerView() {
        return this.contentCardsRecyclerView;
    }

    @Nullable
    public final SwipeRefreshLayout getContentCardsSwipeLayout() {
        return this.contentCardsSwipeLayout;
    }

    @NotNull
    public final IContentCardsViewBindingHandler getContentCardsViewBindingHandler() {
        IContentCardsViewBindingHandler iContentCardsViewBindingHandler = this.customContentCardsViewBindingHandler;
        return iContentCardsViewBindingHandler == null ? this.defaultContentCardsViewBindingHandler : iContentCardsViewBindingHandler;
    }

    @NotNull
    public final RecyclerView.h getEmptyCardsAdapter() {
        return this.defaultEmptyContentCardsAdapter;
    }

    public final void handleContentCardsUpdatedEvent(@NotNull ContentCardsUpdatedEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        i.d(BrazeCoroutineScope.INSTANCE, Y.c(), (L) null, new ContentCardsFragment$handleContentCardsUpdatedEvent$1(this, event, null), 2, (Object) null);
    }

    public final void initializeRecyclerView() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ContentCardAdapter contentCardAdapter = new ContentCardAdapter(requireContext, linearLayoutManager, new ArrayList(), getContentCardsViewBindingHandler());
        this.cardAdapter = contentCardAdapter;
        RecyclerView recyclerView = this.contentCardsRecyclerView;
        if (recyclerView != null) {
            recyclerView.setAdapter(contentCardAdapter);
        }
        RecyclerView recyclerView2 = this.contentCardsRecyclerView;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(linearLayoutManager);
        }
        attachSwipeHelperCallback();
        RecyclerView recyclerView3 = this.contentCardsRecyclerView;
        RecyclerView.m itemAnimator = recyclerView3 != null ? recyclerView3.getItemAnimator() : null;
        if (itemAnimator instanceof n) {
            ((n) itemAnimator).R(false);
        }
        RecyclerView recyclerView4 = this.contentCardsRecyclerView;
        if (recyclerView4 != null) {
            Context requireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
            recyclerView4.g(new ContentCardsDividerItemDecoration(requireContext2));
        }
    }

    @Nullable
    public final Object networkUnavailable(@NotNull Continuation<? super Unit> continuation) {
        Context applicationContext;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: C4.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String networkUnavailable$lambda$16;
                networkUnavailable$lambda$16 = ContentCardsFragment.networkUnavailable$lambda$16();
                return networkUnavailable$lambda$16;
            }
        }, 6, (Object) null);
        Context context = getContext();
        if (context != null && (applicationContext = context.getApplicationContext()) != null) {
            Toast.makeText(applicationContext, applicationContext.getString(R$string.com_braze_feed_connection_error_title), 1).show();
        }
        swapRecyclerViewAdapter(getEmptyCardsAdapter());
        SwipeRefreshLayout swipeRefreshLayout = this.contentCardsSwipeLayout;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(false);
        }
        return Unit.INSTANCE;
    }

    @Override // P0.AbstractComponentCallbacksC0708p
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = inflater.inflate(R$layout.com_braze_content_cards, container, false);
        this.contentCardsRecyclerView = (RecyclerView) inflate.findViewById(R$id.com_braze_content_cards_recycler);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(R$id.braze_content_cards_swipe_container);
        this.contentCardsSwipeLayout = swipeRefreshLayout;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setOnRefreshListener(this);
        }
        SwipeRefreshLayout swipeRefreshLayout2 = this.contentCardsSwipeLayout;
        if (swipeRefreshLayout2 != null) {
            swipeRefreshLayout2.setColorSchemeResources(R$color.com_braze_content_cards_swipe_refresh_color_1, R$color.com_braze_content_cards_swipe_refresh_color_2, R$color.com_braze_content_cards_swipe_refresh_color_3, R$color.com_braze_content_cards_swipe_refresh_color_4);
        }
        return inflate;
    }

    @Override // P0.AbstractComponentCallbacksC0708p
    public void onPause() {
        super.onPause();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: C4.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String onPause$lambda$4;
                onPause$lambda$4 = ContentCardsFragment.onPause$lambda$4();
                return onPause$lambda$4;
            }
        }, 6, (Object) null);
        Braze.Companion companion = Braze.INSTANCE;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        companion.getInstance(requireContext).removeSingleSubscription(this.contentCardsUpdatedSubscriber, ContentCardsUpdatedEvent.class);
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        companion.getInstance(requireContext2).removeSingleSubscription(this.sdkDataWipeEventSubscriber, SdkDataWipeEvent.class);
        u0 u0Var = this.networkUnavailableJob;
        if (u0Var != null) {
            u0.a.b(u0Var, (CancellationException) null, 1, (Object) null);
        }
        this.networkUnavailableJob = null;
        ContentCardAdapter contentCardAdapter = this.cardAdapter;
        if (contentCardAdapter != null) {
            contentCardAdapter.markOnScreenCardsAsRead();
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
    public void onRefresh() {
        Braze.Companion companion = Braze.INSTANCE;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        companion.getInstance(requireContext).requestContentCardsRefresh();
        BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, 2500L, null, new ContentCardsFragment$onRefresh$1(this, null), 2, null);
    }

    @Override // P0.AbstractComponentCallbacksC0708p
    public void onResume() {
        super.onResume();
        Braze.Companion companion = Braze.INSTANCE;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        companion.getInstance(requireContext).removeSingleSubscription(this.contentCardsUpdatedSubscriber, ContentCardsUpdatedEvent.class);
        if (this.contentCardsUpdatedSubscriber == null) {
            this.contentCardsUpdatedSubscriber = new IEventSubscriber() { // from class: C4.d
                @Override // com.braze.events.IEventSubscriber
                public final void trigger(Object obj) {
                    ContentCardsFragment.onResume$lambda$0(ContentCardsFragment.this, (ContentCardsUpdatedEvent) obj);
                }
            };
        }
        IEventSubscriber<ContentCardsUpdatedEvent> iEventSubscriber = this.contentCardsUpdatedSubscriber;
        if (iEventSubscriber != null) {
            Context requireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
            companion.getInstance(requireContext2).subscribeToContentCardsUpdates(iEventSubscriber);
        }
        Context requireContext3 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
        companion.getInstance(requireContext3).requestContentCardsRefreshFromCache();
        Context requireContext4 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext4, "requireContext(...)");
        companion.getInstance(requireContext4).removeSingleSubscription(this.sdkDataWipeEventSubscriber, SdkDataWipeEvent.class);
        if (this.sdkDataWipeEventSubscriber == null) {
            this.sdkDataWipeEventSubscriber = new IEventSubscriber() { // from class: C4.e
                @Override // com.braze.events.IEventSubscriber
                public final void trigger(Object obj) {
                    ContentCardsFragment.onResume$lambda$2(ContentCardsFragment.this, (SdkDataWipeEvent) obj);
                }
            };
        }
        IEventSubscriber<SdkDataWipeEvent> iEventSubscriber2 = this.sdkDataWipeEventSubscriber;
        if (iEventSubscriber2 != null) {
            Context requireContext5 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext5, "requireContext(...)");
            companion.getInstance(requireContext5).addSingleSynchronousSubscription(iEventSubscriber2, SdkDataWipeEvent.class);
        }
    }

    @Override // P0.AbstractComponentCallbacksC0708p
    public void onSaveInstanceState(@NotNull Bundle outState) {
        RecyclerView.p layoutManager;
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        RecyclerView recyclerView = this.contentCardsRecyclerView;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
            outState.putParcelable("LAYOUT_MANAGER_SAVED_INSTANCE_STATE_KEY", layoutManager.c1());
        }
        ContentCardAdapter contentCardAdapter = this.cardAdapter;
        if (contentCardAdapter != null) {
            outState.putStringArrayList("KNOWN_CARD_IMPRESSIONS_SAVED_INSTANCE_STATE_KEY", new ArrayList<>(contentCardAdapter.getImpressedCardIds()));
        }
        IContentCardsViewBindingHandler iContentCardsViewBindingHandler = this.customContentCardsViewBindingHandler;
        if (iContentCardsViewBindingHandler != null) {
            outState.putParcelable("VIEW_BINDING_HANDLER_SAVED_INSTANCE_STATE_KEY", iContentCardsViewBindingHandler);
        }
        IContentCardsUpdateHandler iContentCardsUpdateHandler = this.customContentCardUpdateHandler;
        if (iContentCardsUpdateHandler != null) {
            outState.putParcelable("UPDATE_HANDLER_SAVED_INSTANCE_STATE_KEY", iContentCardsUpdateHandler);
        }
    }

    @Override // P0.AbstractComponentCallbacksC0708p
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        IContentCardsUpdateHandler iContentCardsUpdateHandler;
        IContentCardsViewBindingHandler iContentCardsViewBindingHandler;
        Object parcelable;
        Object parcelable2;
        super.onViewStateRestored(savedInstanceState);
        if (savedInstanceState != null) {
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 33) {
                parcelable2 = savedInstanceState.getParcelable("UPDATE_HANDLER_SAVED_INSTANCE_STATE_KEY", IContentCardsUpdateHandler.class);
                iContentCardsUpdateHandler = (IContentCardsUpdateHandler) parcelable2;
            } else {
                iContentCardsUpdateHandler = (IContentCardsUpdateHandler) savedInstanceState.getParcelable("UPDATE_HANDLER_SAVED_INSTANCE_STATE_KEY");
            }
            if (iContentCardsUpdateHandler != null) {
                setContentCardUpdateHandler(iContentCardsUpdateHandler);
            }
            if (i6 >= 33) {
                parcelable = savedInstanceState.getParcelable("VIEW_BINDING_HANDLER_SAVED_INSTANCE_STATE_KEY", IContentCardsViewBindingHandler.class);
                iContentCardsViewBindingHandler = (IContentCardsViewBindingHandler) parcelable;
            } else {
                iContentCardsViewBindingHandler = (IContentCardsViewBindingHandler) savedInstanceState.getParcelable("VIEW_BINDING_HANDLER_SAVED_INSTANCE_STATE_KEY");
            }
            if (iContentCardsViewBindingHandler != null) {
                setContentCardsViewBindingHandler(iContentCardsViewBindingHandler);
            }
            i.d(BrazeCoroutineScope.INSTANCE, Y.c(), (L) null, new ContentCardsFragment$onViewStateRestored$1(savedInstanceState, this, null), 2, (Object) null);
        }
        initializeRecyclerView();
    }

    public final void setContentCardUpdateHandler(@Nullable IContentCardsUpdateHandler value) {
        this.customContentCardUpdateHandler = value;
    }

    public final void setContentCardsViewBindingHandler(@Nullable IContentCardsViewBindingHandler value) {
        this.customContentCardsViewBindingHandler = value;
    }

    public final void swapRecyclerViewAdapter(@NotNull RecyclerView.h newAdapter) {
        Intrinsics.checkNotNullParameter(newAdapter, "newAdapter");
        RecyclerView recyclerView = this.contentCardsRecyclerView;
        if (recyclerView == null || recyclerView.getAdapter() == newAdapter) {
            return;
        }
        recyclerView.setAdapter(newAdapter);
    }
}
