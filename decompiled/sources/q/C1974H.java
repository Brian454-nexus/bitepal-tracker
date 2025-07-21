package q;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* renamed from: q.H, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C1974H extends AbstractC1971E implements InterfaceC1972F {

    /* renamed from: K, reason: collision with root package name */
    public static Method f18442K;

    /* renamed from: J, reason: collision with root package name */
    public InterfaceC1972F f18443J;

    /* renamed from: q.H$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a extends z {

        /* renamed from: n, reason: collision with root package name */
        public final int f18444n;

        /* renamed from: o, reason: collision with root package name */
        public final int f18445o;

        /* renamed from: p, reason: collision with root package name */
        public InterfaceC1972F f18446p;

        /* renamed from: q, reason: collision with root package name */
        public MenuItem f18447q;

        public a(Context context, boolean z6) {
            super(context, z6);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.f18444n = 21;
                this.f18445o = 22;
            } else {
                this.f18444n = 22;
                this.f18445o = 21;
            }
        }

        @Override // q.z
        public /* bridge */ /* synthetic */ int d(int i6, int i7, int i8, int i9, int i10) {
            return super.d(i6, i7, i8, i9, i10);
        }

        @Override // q.z
        public /* bridge */ /* synthetic */ boolean e(MotionEvent motionEvent, int i6) {
            return super.e(motionEvent, i6);
        }

        @Override // q.z, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // q.z, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // q.z, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // q.z, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // q.z, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            androidx.appcompat.view.menu.c cVar;
            int i6;
            int pointToPosition;
            int i7;
            if (this.f18446p != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i6 = headerViewListAdapter.getHeadersCount();
                    cVar = (androidx.appcompat.view.menu.c) headerViewListAdapter.getWrappedAdapter();
                } else {
                    cVar = (androidx.appcompat.view.menu.c) adapter;
                    i6 = 0;
                }
                androidx.appcompat.view.menu.e item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i7 = pointToPosition - i6) < 0 || i7 >= cVar.getCount()) ? null : cVar.getItem(i7);
                MenuItem menuItem = this.f18447q;
                if (menuItem != item) {
                    androidx.appcompat.view.menu.d b6 = cVar.b();
                    if (menuItem != null) {
                        this.f18446p.c(b6, menuItem);
                    }
                    this.f18447q = item;
                    if (item != null) {
                        this.f18446p.b(b6, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i6, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i6 == this.f18444n) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i6 != this.f18445o) {
                return super.onKeyDown(i6, keyEvent);
            }
            setSelection(-1);
            ((androidx.appcompat.view.menu.c) getAdapter()).b().d(false);
            return true;
        }

        @Override // q.z, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(InterfaceC1972F interfaceC1972F) {
            this.f18446p = interfaceC1972F;
        }

        @Override // q.z, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f18442K = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public C1974H(Context context, AttributeSet attributeSet, int i6, int i7) {
        super(context, attributeSet, i6, i7);
    }

    public void E(Object obj) {
        this.f18408G.setEnterTransition((Transition) obj);
    }

    public void F(Object obj) {
        this.f18408G.setExitTransition((Transition) obj);
    }

    public void G(InterfaceC1972F interfaceC1972F) {
        this.f18443J = interfaceC1972F;
    }

    public void H(boolean z6) {
        if (Build.VERSION.SDK_INT > 28) {
            this.f18408G.setTouchModal(z6);
            return;
        }
        Method method = f18442K;
        if (method != null) {
            try {
                method.invoke(this.f18408G, Boolean.valueOf(z6));
            } catch (Exception unused) {
                Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }

    @Override // q.InterfaceC1972F
    public void b(androidx.appcompat.view.menu.d dVar, MenuItem menuItem) {
        InterfaceC1972F interfaceC1972F = this.f18443J;
        if (interfaceC1972F != null) {
            interfaceC1972F.b(dVar, menuItem);
        }
    }

    @Override // q.InterfaceC1972F
    public void c(androidx.appcompat.view.menu.d dVar, MenuItem menuItem) {
        InterfaceC1972F interfaceC1972F = this.f18443J;
        if (interfaceC1972F != null) {
            interfaceC1972F.c(dVar, menuItem);
        }
    }

    @Override // q.AbstractC1971E
    public z g(Context context, boolean z6) {
        a aVar = new a(context, z6);
        aVar.setHoverListener(this);
        return aVar;
    }
}
