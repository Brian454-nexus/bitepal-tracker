package P0;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class W extends AbstractComponentCallbacksC0708p {
    ListAdapter mAdapter;
    CharSequence mEmptyText;
    View mEmptyView;
    ListView mList;
    View mListContainer;
    boolean mListShown;
    View mProgressContainer;
    TextView mStandardEmptyView;
    private final Handler mHandler = new Handler();
    private final Runnable mRequestFocus = new a();
    private final AdapterView.OnItemClickListener mOnClickListener = new b();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ListView listView = W.this.mList;
            listView.focusableViewAvailable(listView);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class b implements AdapterView.OnItemClickListener {
        public b() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i6, long j6) {
            W.this.onListItemClick((ListView) adapterView, view, i6, j6);
        }
    }

    @NonNull
    public ListView getListView() {
        k();
        return this.mList;
    }

    public final void k() {
        if (this.mList != null) {
            return;
        }
        View view = getView();
        if (view == null) {
            throw new IllegalStateException("Content view not yet created");
        }
        if (view instanceof ListView) {
            this.mList = (ListView) view;
        } else {
            TextView textView = (TextView) view.findViewById(16711681);
            this.mStandardEmptyView = textView;
            if (textView == null) {
                this.mEmptyView = view.findViewById(R.id.empty);
            } else {
                textView.setVisibility(8);
            }
            this.mProgressContainer = view.findViewById(16711682);
            this.mListContainer = view.findViewById(16711683);
            View findViewById = view.findViewById(R.id.list);
            if (!(findViewById instanceof ListView)) {
                if (findViewById != null) {
                    throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                }
                throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
            }
            ListView listView = (ListView) findViewById;
            this.mList = listView;
            View view2 = this.mEmptyView;
            if (view2 != null) {
                listView.setEmptyView(view2);
            } else {
                CharSequence charSequence = this.mEmptyText;
                if (charSequence != null) {
                    this.mStandardEmptyView.setText(charSequence);
                    this.mList.setEmptyView(this.mStandardEmptyView);
                }
            }
        }
        this.mListShown = true;
        this.mList.setOnItemClickListener(this.mOnClickListener);
        ListAdapter listAdapter = this.mAdapter;
        if (listAdapter != null) {
            this.mAdapter = null;
            setListAdapter(listAdapter);
        } else if (this.mProgressContainer != null) {
            l(false, false);
        }
        this.mHandler.post(this.mRequestFocus);
    }

    public final void l(boolean z6, boolean z7) {
        k();
        View view = this.mProgressContainer;
        if (view == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        }
        if (this.mListShown == z6) {
            return;
        }
        this.mListShown = z6;
        if (z6) {
            if (z7) {
                view.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_out));
                this.mListContainer.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_in));
            } else {
                view.clearAnimation();
                this.mListContainer.clearAnimation();
            }
            this.mProgressContainer.setVisibility(8);
            this.mListContainer.setVisibility(0);
            return;
        }
        if (z7) {
            view.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_in));
            this.mListContainer.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_out));
        } else {
            view.clearAnimation();
            this.mListContainer.clearAnimation();
        }
        this.mProgressContainer.setVisibility(0);
        this.mListContainer.setVisibility(8);
    }

    @Override // P0.AbstractComponentCallbacksC0708p
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context requireContext = requireContext();
        FrameLayout frameLayout = new FrameLayout(requireContext);
        LinearLayout linearLayout = new LinearLayout(requireContext);
        linearLayout.setId(16711682);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(requireContext, null, R.attr.progressBarStyleLarge), new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(requireContext);
        frameLayout2.setId(16711683);
        TextView textView = new TextView(requireContext);
        textView.setId(16711681);
        textView.setGravity(17);
        frameLayout2.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        ListView listView = new ListView(requireContext);
        listView.setId(R.id.list);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // P0.AbstractComponentCallbacksC0708p
    public void onDestroyView() {
        this.mHandler.removeCallbacks(this.mRequestFocus);
        this.mList = null;
        this.mListShown = false;
        this.mListContainer = null;
        this.mProgressContainer = null;
        this.mEmptyView = null;
        this.mStandardEmptyView = null;
        super.onDestroyView();
    }

    public void onListItemClick(@NonNull ListView listView, @NonNull View view, int i6, long j6) {
    }

    @Override // P0.AbstractComponentCallbacksC0708p
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        k();
    }

    public void setListAdapter(ListAdapter listAdapter) {
        boolean z6 = this.mAdapter != null;
        this.mAdapter = listAdapter;
        ListView listView = this.mList;
        if (listView != null) {
            listView.setAdapter(listAdapter);
            if (this.mListShown || z6) {
                return;
            }
            l(true, requireView().getWindowToken() != null);
        }
    }
}
