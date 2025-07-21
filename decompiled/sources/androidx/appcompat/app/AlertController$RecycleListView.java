package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import i.AbstractC1476i;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* renamed from: a, reason: collision with root package name */
    public final int f7864a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7865b;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1476i.f15673z1);
        this.f7865b = obtainStyledAttributes.getDimensionPixelOffset(AbstractC1476i.f15459A1, -1);
        this.f7864a = obtainStyledAttributes.getDimensionPixelOffset(AbstractC1476i.f15463B1, -1);
    }
}
