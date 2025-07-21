package q;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import i.AbstractC1476i;

/* renamed from: q.j, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C1986j extends PopupWindow {

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f18548b = false;

    /* renamed from: a, reason: collision with root package name */
    public boolean f18549a;

    public C1986j(Context context, AttributeSet attributeSet, int i6, int i7) {
        super(context, attributeSet, i6, i7);
        a(context, attributeSet, i6, i7);
    }

    public final void a(Context context, AttributeSet attributeSet, int i6, int i7) {
        S r6 = S.r(context, attributeSet, AbstractC1476i.f15657v1, i6, i7);
        int i8 = AbstractC1476i.f15665x1;
        if (r6.o(i8)) {
            b(r6.a(i8, false));
        }
        setBackgroundDrawable(r6.f(AbstractC1476i.f15661w1));
        r6.s();
    }

    public final void b(boolean z6) {
        if (f18548b) {
            this.f18549a = z6;
        } else {
            C0.g.a(this, z6);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i6, int i7) {
        if (f18548b && this.f18549a) {
            i7 -= view.getHeight();
        }
        super.showAsDropDown(view, i6, i7);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i6, int i7, int i8, int i9) {
        if (f18548b && this.f18549a) {
            i7 -= view.getHeight();
        }
        super.update(view, i6, i7, i8, i9);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i6, int i7, int i8) {
        if (f18548b && this.f18549a) {
            i7 -= view.getHeight();
        }
        super.showAsDropDown(view, i6, i7, i8);
    }
}
