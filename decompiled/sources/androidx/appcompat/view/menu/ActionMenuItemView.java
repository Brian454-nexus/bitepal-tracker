package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.widget.ActionMenuView;
import i.AbstractC1476i;
import q.AbstractViewOnTouchListenerC1968B;
import q.C1990n;
import q.T;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class ActionMenuItemView extends C1990n implements h.a, View.OnClickListener, ActionMenuView.a {

    /* renamed from: e, reason: collision with root package name */
    public e f7866e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f7867f;

    /* renamed from: g, reason: collision with root package name */
    public Drawable f7868g;

    /* renamed from: h, reason: collision with root package name */
    public d.b f7869h;

    /* renamed from: i, reason: collision with root package name */
    public AbstractViewOnTouchListenerC1968B f7870i;

    /* renamed from: j, reason: collision with root package name */
    public b f7871j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f7872k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f7873l;

    /* renamed from: m, reason: collision with root package name */
    public int f7874m;

    /* renamed from: n, reason: collision with root package name */
    public int f7875n;

    /* renamed from: o, reason: collision with root package name */
    public int f7876o;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a extends AbstractViewOnTouchListenerC1968B {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // q.AbstractViewOnTouchListenerC1968B
        public p.c b() {
            b bVar = ActionMenuItemView.this.f7871j;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        @Override // q.AbstractViewOnTouchListenerC1968B
        public boolean c() {
            p.c b6;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            d.b bVar = actionMenuItemView.f7869h;
            return bVar != null && bVar.a(actionMenuItemView.f7866e) && (b6 = b()) != null && b6.f();
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class b {
        public abstract p.c a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean a() {
        return f();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean b() {
        return f() && this.f7866e.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.h.a
    public boolean c() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.h.a
    public void d(e eVar, int i6) {
        this.f7866e = eVar;
        setIcon(eVar.getIcon());
        setTitle(eVar.h(this));
        setId(eVar.getItemId());
        setVisibility(eVar.isVisible() ? 0 : 8);
        setEnabled(eVar.isEnabled());
        if (eVar.hasSubMenu() && this.f7870i == null) {
            this.f7870i = new a();
        }
    }

    public boolean f() {
        return !TextUtils.isEmpty(getText());
    }

    public final boolean g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i6 = configuration.screenWidthDp;
        int i7 = configuration.screenHeightDp;
        if (i6 < 480) {
            return (i6 >= 640 && i7 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.h.a
    public e getItemData() {
        return this.f7866e;
    }

    public final void h() {
        boolean z6 = true;
        boolean z7 = !TextUtils.isEmpty(this.f7867f);
        if (this.f7868g != null && (!this.f7866e.A() || (!this.f7872k && !this.f7873l))) {
            z6 = false;
        }
        boolean z8 = z7 & z6;
        setText(z8 ? this.f7867f : null);
        CharSequence contentDescription = this.f7866e.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z8 ? null : this.f7866e.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f7866e.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            T.a(this, z8 ? null : this.f7866e.getTitle());
        } else {
            T.a(this, tooltipText);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        d.b bVar = this.f7869h;
        if (bVar != null) {
            bVar.a(this.f7866e);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f7872k = g();
        h();
    }

    @Override // q.C1990n, android.widget.TextView, android.view.View
    public void onMeasure(int i6, int i7) {
        int i8;
        boolean f6 = f();
        if (f6 && (i8 = this.f7875n) >= 0) {
            super.setPadding(i8, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i6, i7);
        int mode = View.MeasureSpec.getMode(i6);
        int size = View.MeasureSpec.getSize(i6);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f7874m) : this.f7874m;
        if (mode != 1073741824 && this.f7874m > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i7);
        }
        if (f6 || this.f7868g == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f7868g.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractViewOnTouchListenerC1968B abstractViewOnTouchListenerC1968B;
        if (this.f7866e.hasSubMenu() && (abstractViewOnTouchListenerC1968B = this.f7870i) != null && abstractViewOnTouchListenerC1968B.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z6) {
    }

    public void setChecked(boolean z6) {
    }

    public void setExpandedFormat(boolean z6) {
        if (this.f7873l != z6) {
            this.f7873l = z6;
            e eVar = this.f7866e;
            if (eVar != null) {
                eVar.a();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f7868g = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i6 = this.f7876o;
            if (intrinsicWidth > i6) {
                intrinsicHeight = (int) (intrinsicHeight * (i6 / intrinsicWidth));
                intrinsicWidth = i6;
            }
            if (intrinsicHeight > i6) {
                intrinsicWidth = (int) (intrinsicWidth * (i6 / intrinsicHeight));
            } else {
                i6 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i6);
        }
        setCompoundDrawables(drawable, null, null, null);
        h();
    }

    public void setItemInvoker(d.b bVar) {
        this.f7869h = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i6, int i7, int i8, int i9) {
        this.f7875n = i6;
        super.setPadding(i6, i7, i8, i9);
    }

    public void setPopupCallback(b bVar) {
        this.f7871j = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f7867f = charSequence;
        h();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        Resources resources = context.getResources();
        this.f7872k = g();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1476i.f15647t, i6, 0);
        this.f7874m = obtainStyledAttributes.getDimensionPixelSize(AbstractC1476i.f15651u, 0);
        obtainStyledAttributes.recycle();
        this.f7876o = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f7875n = -1;
        setSaveEnabled(false);
    }
}
