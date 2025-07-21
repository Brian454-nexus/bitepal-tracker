package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.h;
import i.AbstractC1468a;
import i.AbstractC1472e;
import i.AbstractC1473f;
import i.AbstractC1476i;
import q.S;
import z0.AbstractC2393D;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class ListMenuItemView extends LinearLayout implements h.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a, reason: collision with root package name */
    public e f7881a;

    /* renamed from: b, reason: collision with root package name */
    public ImageView f7882b;

    /* renamed from: c, reason: collision with root package name */
    public RadioButton f7883c;

    /* renamed from: d, reason: collision with root package name */
    public TextView f7884d;

    /* renamed from: e, reason: collision with root package name */
    public CheckBox f7885e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f7886f;

    /* renamed from: g, reason: collision with root package name */
    public ImageView f7887g;

    /* renamed from: h, reason: collision with root package name */
    public ImageView f7888h;

    /* renamed from: i, reason: collision with root package name */
    public LinearLayout f7889i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f7890j;

    /* renamed from: k, reason: collision with root package name */
    public int f7891k;

    /* renamed from: l, reason: collision with root package name */
    public Context f7892l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7893m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f7894n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f7895o;

    /* renamed from: p, reason: collision with root package name */
    public int f7896p;

    /* renamed from: q, reason: collision with root package name */
    public LayoutInflater f7897q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f7898r;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1468a.f15341o);
    }

    private LayoutInflater getInflater() {
        if (this.f7897q == null) {
            this.f7897q = LayoutInflater.from(getContext());
        }
        return this.f7897q;
    }

    private void setSubMenuArrowVisible(boolean z6) {
        ImageView imageView = this.f7887g;
        if (imageView != null) {
            imageView.setVisibility(z6 ? 0 : 8);
        }
    }

    public final void a(View view) {
        b(view, -1);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f7888h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f7888h.getLayoutParams();
        rect.top += this.f7888h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public final void b(View view, int i6) {
        LinearLayout linearLayout = this.f7889i;
        if (linearLayout != null) {
            linearLayout.addView(view, i6);
        } else {
            addView(view, i6);
        }
    }

    @Override // androidx.appcompat.view.menu.h.a
    public boolean c() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.h.a
    public void d(e eVar, int i6) {
        this.f7881a = eVar;
        this.f7896p = i6;
        setVisibility(eVar.isVisible() ? 0 : 8);
        setTitle(eVar.h(this));
        setCheckable(eVar.isCheckable());
        h(eVar.z(), eVar.e());
        setIcon(eVar.getIcon());
        setEnabled(eVar.isEnabled());
        setSubMenuArrowVisible(eVar.hasSubMenu());
        setContentDescription(eVar.getContentDescription());
    }

    public final void e() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(AbstractC1473f.f15437f, (ViewGroup) this, false);
        this.f7885e = checkBox;
        a(checkBox);
    }

    public final void f() {
        ImageView imageView = (ImageView) getInflater().inflate(AbstractC1473f.f15438g, (ViewGroup) this, false);
        this.f7882b = imageView;
        b(imageView, 0);
    }

    public final void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(AbstractC1473f.f15439h, (ViewGroup) this, false);
        this.f7883c = radioButton;
        a(radioButton);
    }

    @Override // androidx.appcompat.view.menu.h.a
    public e getItemData() {
        return this.f7881a;
    }

    public void h(boolean z6, char c6) {
        int i6 = (z6 && this.f7881a.z()) ? 0 : 8;
        if (i6 == 0) {
            this.f7886f.setText(this.f7881a.f());
        }
        if (this.f7886f.getVisibility() != i6) {
            this.f7886f.setVisibility(i6);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        AbstractC2393D.O(this, this.f7890j);
        TextView textView = (TextView) findViewById(AbstractC1472e.f15431z);
        this.f7884d = textView;
        int i6 = this.f7891k;
        if (i6 != -1) {
            textView.setTextAppearance(this.f7892l, i6);
        }
        this.f7886f = (TextView) findViewById(AbstractC1472e.f15426u);
        ImageView imageView = (ImageView) findViewById(AbstractC1472e.f15429x);
        this.f7887g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f7894n);
        }
        this.f7888h = (ImageView) findViewById(AbstractC1472e.f15417l);
        this.f7889i = (LinearLayout) findViewById(AbstractC1472e.f15413h);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i6, int i7) {
        if (this.f7882b != null && this.f7893m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f7882b.getLayoutParams();
            int i8 = layoutParams.height;
            if (i8 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i8;
            }
        }
        super.onMeasure(i6, i7);
    }

    public void setCheckable(boolean z6) {
        CompoundButton compoundButton;
        View view;
        if (!z6 && this.f7883c == null && this.f7885e == null) {
            return;
        }
        if (this.f7881a.l()) {
            if (this.f7883c == null) {
                g();
            }
            compoundButton = this.f7883c;
            view = this.f7885e;
        } else {
            if (this.f7885e == null) {
                e();
            }
            compoundButton = this.f7885e;
            view = this.f7883c;
        }
        if (z6) {
            compoundButton.setChecked(this.f7881a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f7885e;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f7883c;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z6) {
        CompoundButton compoundButton;
        if (this.f7881a.l()) {
            if (this.f7883c == null) {
                g();
            }
            compoundButton = this.f7883c;
        } else {
            if (this.f7885e == null) {
                e();
            }
            compoundButton = this.f7885e;
        }
        compoundButton.setChecked(z6);
    }

    public void setForceShowIcon(boolean z6) {
        this.f7898r = z6;
        this.f7893m = z6;
    }

    public void setGroupDividerEnabled(boolean z6) {
        ImageView imageView = this.f7888h;
        if (imageView != null) {
            imageView.setVisibility((this.f7895o || !z6) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z6 = this.f7881a.y() || this.f7898r;
        if (z6 || this.f7893m) {
            ImageView imageView = this.f7882b;
            if (imageView == null && drawable == null && !this.f7893m) {
                return;
            }
            if (imageView == null) {
                f();
            }
            if (drawable == null && !this.f7893m) {
                this.f7882b.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f7882b;
            if (!z6) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f7882b.getVisibility() != 0) {
                this.f7882b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f7884d.getVisibility() != 8) {
                this.f7884d.setVisibility(8);
            }
        } else {
            this.f7884d.setText(charSequence);
            if (this.f7884d.getVisibility() != 0) {
                this.f7884d.setVisibility(0);
            }
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet);
        S r6 = S.r(getContext(), attributeSet, AbstractC1476i.f15637q1, i6, 0);
        this.f7890j = r6.f(AbstractC1476i.f15645s1);
        this.f7891k = r6.l(AbstractC1476i.f15641r1, -1);
        this.f7893m = r6.a(AbstractC1476i.f15649t1, false);
        this.f7892l = context;
        this.f7894n = r6.f(AbstractC1476i.f15653u1);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, AbstractC1468a.f15340n, 0);
        this.f7895o = obtainStyledAttributes.hasValue(0);
        r6.s();
        obtainStyledAttributes.recycle();
    }
}
