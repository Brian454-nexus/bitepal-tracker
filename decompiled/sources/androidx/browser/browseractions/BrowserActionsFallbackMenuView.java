package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import u.AbstractC2131a;

@Deprecated
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final int f8358a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8359b;

    public BrowserActionsFallbackMenuView(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8358a = getResources().getDimensionPixelOffset(AbstractC2131a.f19149b);
        this.f8359b = getResources().getDimensionPixelOffset(AbstractC2131a.f19148a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i6, int i7) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f8358a * 2), this.f8359b), 1073741824), i7);
    }
}
