package j;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import i.AbstractC1476i;

/* renamed from: j.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC1637a extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public int f16090a;

    public AbstractC1637a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16090a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1476i.f15639r);
        this.f16090a = obtainStyledAttributes.getInt(AbstractC1476i.f15643s, 0);
        obtainStyledAttributes.recycle();
    }

    public AbstractC1637a(int i6, int i7) {
        super(i6, i7);
        this.f16090a = 8388627;
    }

    public AbstractC1637a(AbstractC1637a abstractC1637a) {
        super((ViewGroup.MarginLayoutParams) abstractC1637a);
        this.f16090a = 0;
        this.f16090a = abstractC1637a.f16090a;
    }

    public AbstractC1637a(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f16090a = 0;
    }
}
