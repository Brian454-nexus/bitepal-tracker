package com.braze.ui;

import P0.AbstractActivityC0712u;
import P0.W;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.braze.Braze;
import com.braze.enums.CardCategory;
import com.braze.events.FeedUpdatedEvent;
import com.braze.events.IEventSubscriber;
import com.braze.models.cards.Card;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.ui.BrazeFeedFragment;
import com.braze.ui.adapters.BrazeListAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class BrazeFeedFragment extends W implements SwipeRefreshLayout.j {
    private static final String TAG = BrazeLogger.getBrazeLogTag((Class<?>) BrazeFeedFragment.class);
    private BrazeListAdapter mAdapter;
    private EnumSet<CardCategory> mCategories;
    private LinearLayout mEmptyFeedLayout;
    private RelativeLayout mFeedRootLayout;
    private SwipeRefreshLayout mFeedSwipeLayout;
    private IEventSubscriber<FeedUpdatedEvent> mFeedUpdatedSubscriber;
    private GestureDetector mGestureDetector;
    private ProgressBar mLoadingSpinner;
    private LinearLayout mNetworkErrorLayout;
    private View mTransparentFullBoundsContainerView;
    private final Handler mMainThreadLooper = new Handler(Looper.getMainLooper());
    private final Runnable mShowNetworkError = new Runnable() { // from class: com.braze.ui.BrazeFeedFragment.1
        @Override // java.lang.Runnable
        public void run() {
            if (BrazeFeedFragment.this.mLoadingSpinner != null) {
                BrazeFeedFragment.this.mLoadingSpinner.setVisibility(8);
            }
            if (BrazeFeedFragment.this.mNetworkErrorLayout != null) {
                BrazeFeedFragment.this.mNetworkErrorLayout.setVisibility(0);
            }
        }
    };
    private boolean mSortEnabled = false;
    boolean mSkipCardImpressionsReset = false;
    int mPreviousVisibleHeadCardIndex = 0;
    int mCurrentCardIndexAtBottomOfScreen = 0;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class FeedGestureListener extends GestureDetector.SimpleOnGestureListener {
        public FeedGestureListener() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f6, float f7) {
            long eventTime = motionEvent2.getEventTime() - motionEvent.getEventTime();
            BrazeFeedFragment.this.getListView().smoothScrollBy(-((int) ((f7 * ((float) (2 * eventTime))) / 1000.0f)), (int) (eventTime * 4));
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f6, float f7) {
            BrazeFeedFragment.this.getListView().smoothScrollBy((int) f7, 0);
            return true;
        }
    }

    public static /* synthetic */ void m(final BrazeFeedFragment brazeFeedFragment, final ListView listView, final FeedUpdatedEvent feedUpdatedEvent) {
        AbstractActivityC0712u activity = brazeFeedFragment.getActivity();
        if (activity == null) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: v4.g
            @Override // java.lang.Runnable
            public final void run() {
                BrazeFeedFragment.n(BrazeFeedFragment.this, feedUpdatedEvent, listView);
            }
        });
    }

    public static /* synthetic */ void n(BrazeFeedFragment brazeFeedFragment, FeedUpdatedEvent feedUpdatedEvent, ListView listView) {
        brazeFeedFragment.getClass();
        String str = TAG;
        BrazeLogger.v(str, "Updating feed views in response to FeedUpdatedEvent: " + feedUpdatedEvent);
        brazeFeedFragment.mMainThreadLooper.removeCallbacks(brazeFeedFragment.mShowNetworkError);
        brazeFeedFragment.mNetworkErrorLayout.setVisibility(8);
        if (feedUpdatedEvent.getCardCount(brazeFeedFragment.mCategories) == 0) {
            listView.setVisibility(8);
            brazeFeedFragment.mAdapter.clear();
        } else {
            brazeFeedFragment.mEmptyFeedLayout.setVisibility(8);
            brazeFeedFragment.mLoadingSpinner.setVisibility(8);
            brazeFeedFragment.mTransparentFullBoundsContainerView.setVisibility(8);
        }
        if (feedUpdatedEvent.isFromOfflineStorage() && (feedUpdatedEvent.lastUpdatedInSecondsFromEpoch() + 60) * 1000 < DateTimeUtils.nowInMilliseconds()) {
            BrazeLogger.i(str, "Feed received was older than the max time to live of 60 seconds, displaying it for now, but requesting an updated view from the server.");
            Braze.getInstance(brazeFeedFragment.getContext()).requestFeedRefresh();
            if (feedUpdatedEvent.getCardCount(brazeFeedFragment.mCategories) == 0) {
                BrazeLogger.d(str, "Old feed was empty, putting up a network spinner and registering the network error message with a delay of 5000ms.");
                brazeFeedFragment.mEmptyFeedLayout.setVisibility(8);
                brazeFeedFragment.mLoadingSpinner.setVisibility(0);
                brazeFeedFragment.mTransparentFullBoundsContainerView.setVisibility(0);
                brazeFeedFragment.mMainThreadLooper.postDelayed(brazeFeedFragment.mShowNetworkError, 5000L);
                return;
            }
        }
        if (feedUpdatedEvent.getCardCount(brazeFeedFragment.mCategories) == 0) {
            brazeFeedFragment.mLoadingSpinner.setVisibility(8);
            brazeFeedFragment.mEmptyFeedLayout.setVisibility(0);
            brazeFeedFragment.mTransparentFullBoundsContainerView.setVisibility(0);
        } else {
            if (!brazeFeedFragment.mSortEnabled || feedUpdatedEvent.getCardCount(brazeFeedFragment.mCategories) == feedUpdatedEvent.getUnreadCardCount(brazeFeedFragment.mCategories)) {
                brazeFeedFragment.mAdapter.replaceFeed(feedUpdatedEvent.getFeedCards(brazeFeedFragment.mCategories));
            } else {
                brazeFeedFragment.mAdapter.replaceFeed(brazeFeedFragment.sortFeedCards(feedUpdatedEvent.getFeedCards(brazeFeedFragment.mCategories)));
            }
            listView.setVisibility(0);
        }
        brazeFeedFragment.mFeedSwipeLayout.setRefreshing(false);
    }

    public static /* synthetic */ int o(Card card, Card card2) {
        if (card.getIsIndicatorHighlightedInternal() == card2.getIsIndicatorHighlightedInternal()) {
            return 0;
        }
        return card.getIsIndicatorHighlightedInternal() ? 1 : -1;
    }

    public static /* synthetic */ boolean p(View view, MotionEvent motionEvent) {
        return view.getVisibility() == 0;
    }

    private void setOnScreenCardsToRead() {
        this.mAdapter.batchSetCardsToRead(this.mPreviousVisibleHeadCardIndex, this.mCurrentCardIndexAtBottomOfScreen);
    }

    public void loadFragmentStateFromSavedInstanceState(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (this.mCategories == null) {
            this.mCategories = CardCategory.getAllCategories();
        }
        this.mPreviousVisibleHeadCardIndex = bundle.getInt("PREVIOUS_VISIBLE_HEAD_CARD_INDEX", 0);
        this.mCurrentCardIndexAtBottomOfScreen = bundle.getInt("CURRENT_CARD_INDEX_AT_BOTTOM_OF_SCREEN", 0);
        this.mSkipCardImpressionsReset = bundle.getBoolean("SKIP_CARD_IMPRESSIONS_RESET", false);
        ArrayList<String> stringArrayList = bundle.getStringArrayList("CARD_CATEGORY");
        if (stringArrayList != null) {
            this.mCategories.clear();
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                this.mCategories.add(CardCategory.valueOf(it.next()));
            }
        }
    }

    @Override // P0.AbstractComponentCallbacksC0708p
    public void onAttach(Context context) {
        super.onAttach(context);
        if (this.mAdapter == null) {
            this.mAdapter = new BrazeListAdapter(context, R$id.tag, new ArrayList());
            this.mCategories = CardCategory.getAllCategories();
        }
        this.mGestureDetector = new GestureDetector(context, new FeedGestureListener());
    }

    @Override // P0.W, P0.AbstractComponentCallbacksC0708p
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R$layout.com_braze_feed, viewGroup, false);
        this.mNetworkErrorLayout = (LinearLayout) inflate.findViewById(R$id.com_braze_feed_network_error);
        this.mLoadingSpinner = (ProgressBar) inflate.findViewById(R$id.com_braze_feed_loading_spinner);
        this.mEmptyFeedLayout = (LinearLayout) inflate.findViewById(R$id.com_braze_feed_empty_feed);
        this.mFeedRootLayout = (RelativeLayout) inflate.findViewById(R$id.com_braze_feed_root);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(R$id.braze_feed_swipe_container);
        this.mFeedSwipeLayout = swipeRefreshLayout;
        swipeRefreshLayout.setOnRefreshListener(this);
        this.mFeedSwipeLayout.setEnabled(false);
        this.mFeedSwipeLayout.setColorSchemeResources(R$color.com_braze_newsfeed_swipe_refresh_color_1, R$color.com_braze_newsfeed_swipe_refresh_color_2, R$color.com_braze_newsfeed_swipe_refresh_color_3, R$color.com_braze_newsfeed_swipe_refresh_color_4);
        this.mTransparentFullBoundsContainerView = inflate.findViewById(R$id.com_braze_feed_transparent_full_bounds_container_view);
        return inflate;
    }

    @Override // P0.W, P0.AbstractComponentCallbacksC0708p
    public void onDestroyView() {
        super.onDestroyView();
        Braze.getInstance(getContext()).removeSingleSubscription(this.mFeedUpdatedSubscriber, FeedUpdatedEvent.class);
        setOnScreenCardsToRead();
    }

    @Override // P0.AbstractComponentCallbacksC0708p
    public void onDetach() {
        super.onDetach();
        setListAdapter(null);
    }

    @Override // P0.AbstractComponentCallbacksC0708p
    public void onPause() {
        super.onPause();
        setOnScreenCardsToRead();
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
    public void onRefresh() {
        Braze.getInstance(getContext()).requestFeedRefresh();
        this.mMainThreadLooper.postDelayed(new Runnable() { // from class: v4.f
            @Override // java.lang.Runnable
            public final void run() {
                BrazeFeedFragment.this.mFeedSwipeLayout.setRefreshing(false);
            }
        }, 2500L);
    }

    @Override // P0.AbstractComponentCallbacksC0708p
    public void onResume() {
        super.onResume();
        Braze.getInstance(getContext()).logFeedDisplayed();
    }

    @Override // P0.AbstractComponentCallbacksC0708p
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("PREVIOUS_VISIBLE_HEAD_CARD_INDEX", this.mPreviousVisibleHeadCardIndex);
        bundle.putInt("CURRENT_CARD_INDEX_AT_BOTTOM_OF_SCREEN", this.mCurrentCardIndexAtBottomOfScreen);
        bundle.putBoolean("SKIP_CARD_IMPRESSIONS_RESET", this.mSkipCardImpressionsReset);
        if (this.mCategories == null) {
            this.mCategories = CardCategory.getAllCategories();
        }
        ArrayList<String> arrayList = new ArrayList<>(this.mCategories.size());
        Iterator<E> it = this.mCategories.iterator();
        while (it.hasNext()) {
            arrayList.add(((CardCategory) it.next()).name());
        }
        bundle.putStringArrayList("CARD_CATEGORY", arrayList);
        super.onSaveInstanceState(bundle);
        if (isVisible()) {
            this.mSkipCardImpressionsReset = true;
        }
    }

    @Override // P0.W, P0.AbstractComponentCallbacksC0708p
    @SuppressLint({"InflateParams"})
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        loadFragmentStateFromSavedInstanceState(bundle);
        if (this.mSkipCardImpressionsReset) {
            this.mSkipCardImpressionsReset = false;
        } else {
            this.mAdapter.resetCardImpressionTracker();
            BrazeLogger.d(TAG, "Resetting card impressions.");
        }
        LayoutInflater from = LayoutInflater.from(getActivity());
        final ListView listView = getListView();
        listView.addHeaderView(from.inflate(R$layout.com_braze_feed_header, (ViewGroup) null));
        listView.addFooterView(from.inflate(R$layout.com_braze_feed_footer, (ViewGroup) null));
        this.mFeedRootLayout.setOnTouchListener(new View.OnTouchListener() { // from class: v4.c
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                boolean onTouchEvent;
                onTouchEvent = BrazeFeedFragment.this.mGestureDetector.onTouchEvent(motionEvent);
                return onTouchEvent;
            }
        });
        listView.setOnScrollListener(new AbsListView.OnScrollListener() { // from class: com.braze.ui.BrazeFeedFragment.2
            @Override // android.widget.AbsListView.OnScrollListener
            public void onScroll(AbsListView absListView, int i6, int i7, int i8) {
                BrazeFeedFragment.this.mFeedSwipeLayout.setEnabled(i6 == 0);
                if (i7 == 0) {
                    return;
                }
                int i9 = i6 - 1;
                BrazeFeedFragment brazeFeedFragment = BrazeFeedFragment.this;
                if (i9 > brazeFeedFragment.mPreviousVisibleHeadCardIndex) {
                    brazeFeedFragment.mAdapter.batchSetCardsToRead(BrazeFeedFragment.this.mPreviousVisibleHeadCardIndex, i9);
                }
                BrazeFeedFragment brazeFeedFragment2 = BrazeFeedFragment.this;
                brazeFeedFragment2.mPreviousVisibleHeadCardIndex = i9;
                brazeFeedFragment2.mCurrentCardIndexAtBottomOfScreen = i6 + i7;
            }

            @Override // android.widget.AbsListView.OnScrollListener
            public void onScrollStateChanged(AbsListView absListView, int i6) {
            }
        });
        this.mTransparentFullBoundsContainerView.setOnTouchListener(new View.OnTouchListener() { // from class: v4.d
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return BrazeFeedFragment.p(view2, motionEvent);
            }
        });
        Braze.getInstance(getContext()).removeSingleSubscription(this.mFeedUpdatedSubscriber, FeedUpdatedEvent.class);
        this.mFeedUpdatedSubscriber = new IEventSubscriber() { // from class: v4.e
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                BrazeFeedFragment.m(BrazeFeedFragment.this, listView, (FeedUpdatedEvent) obj);
            }
        };
        Braze.getInstance(getContext()).subscribeToFeedUpdates(this.mFeedUpdatedSubscriber);
        listView.setAdapter((ListAdapter) this.mAdapter);
        Braze.getInstance(getContext()).requestFeedRefreshFromCache();
    }

    public List<Card> sortFeedCards(List<Card> list) {
        Collections.sort(list, new Comparator() { // from class: v4.h
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return BrazeFeedFragment.o((Card) obj, (Card) obj2);
            }
        });
        return list;
    }
}
