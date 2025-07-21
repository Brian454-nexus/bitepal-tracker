package p;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;

/* renamed from: p.b, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC1886b implements c, g, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public Rect f18070a;

    public static int o(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i6) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i7 = 0;
        int i8 = 0;
        View view = null;
        for (int i9 = 0; i9 < count; i9++) {
            int itemViewType = listAdapter.getItemViewType(i9);
            if (itemViewType != i8) {
                view = null;
                i8 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i9, view, viewGroup);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i6) {
                return i6;
            }
            if (measuredWidth > i7) {
                i7 = measuredWidth;
            }
        }
        return i7;
    }

    public static boolean x(d dVar) {
        int size = dVar.size();
        for (int i6 = 0; i6 < size; i6++) {
            MenuItem item = dVar.getItem(i6);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    public static androidx.appcompat.view.menu.c y(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (androidx.appcompat.view.menu.c) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (androidx.appcompat.view.menu.c) listAdapter;
    }

    @Override // androidx.appcompat.view.menu.g
    public boolean e(d dVar, e eVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.g
    public boolean g(d dVar, e eVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.g
    public void i(Context context, d dVar) {
    }

    public abstract void l(d dVar);

    public boolean m() {
        return true;
    }

    public Rect n() {
        return this.f18070a;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i6, long j6) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        y(listAdapter).f7945a.I((MenuItem) listAdapter.getItem(i6), this, m() ? 0 : 4);
    }

    public abstract void p(View view);

    public void q(Rect rect) {
        this.f18070a = rect;
    }

    public abstract void r(boolean z6);

    public abstract void s(int i6);

    public abstract void t(int i6);

    public abstract void u(PopupWindow.OnDismissListener onDismissListener);

    public abstract void v(boolean z6);

    public abstract void w(int i6);
}
