package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import q.S;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class ActivityChooserView$InnerLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f8116a = {R.attr.background};

    public ActivityChooserView$InnerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        S q6 = S.q(context, attributeSet, f8116a);
        setBackgroundDrawable(q6.f(0));
        q6.s();
    }
}
