package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.d;
import q.S;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class ExpandedMenuView extends ListView implements d.b, h, AdapterView.OnItemClickListener {

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f7878c = {R.attr.background, R.attr.divider};

    /* renamed from: a, reason: collision with root package name */
    public d f7879a;

    /* renamed from: b, reason: collision with root package name */
    public int f7880b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    @Override // androidx.appcompat.view.menu.d.b
    public boolean a(e eVar) {
        return this.f7879a.H(eVar, 0);
    }

    public int getWindowAnimations() {
        return this.f7880b;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i6, long j6) {
        a((e) getAdapter().getItem(i6));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        S r6 = S.r(context, attributeSet, f7878c, i6, 0);
        if (r6.o(0)) {
            setBackgroundDrawable(r6.f(0));
        }
        if (r6.o(1)) {
            setDivider(r6.f(1));
        }
        r6.s();
    }
}
