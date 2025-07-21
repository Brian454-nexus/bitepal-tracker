package androidx.preference.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import kotlin.jvm.internal.IntCompanionObject;
import n2.AbstractC1820g;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class PreferenceImageView extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    public int f9573a;

    /* renamed from: b, reason: collision with root package name */
    public int f9574b;

    public PreferenceImageView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.ImageView
    public int getMaxHeight() {
        return this.f9574b;
    }

    @Override // android.widget.ImageView
    public int getMaxWidth() {
        return this.f9573a;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i6, int i7) {
        int mode = View.MeasureSpec.getMode(i6);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int size = View.MeasureSpec.getSize(i6);
            int maxWidth = getMaxWidth();
            if (maxWidth != Integer.MAX_VALUE && (maxWidth < size || mode == 0)) {
                i6 = View.MeasureSpec.makeMeasureSpec(maxWidth, IntCompanionObject.MIN_VALUE);
            }
        }
        int mode2 = View.MeasureSpec.getMode(i7);
        if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
            int size2 = View.MeasureSpec.getSize(i7);
            int maxHeight = getMaxHeight();
            if (maxHeight != Integer.MAX_VALUE && (maxHeight < size2 || mode2 == 0)) {
                i7 = View.MeasureSpec.makeMeasureSpec(maxHeight, IntCompanionObject.MIN_VALUE);
            }
        }
        super.onMeasure(i6, i7);
    }

    @Override // android.widget.ImageView
    public void setMaxHeight(int i6) {
        this.f9574b = i6;
        super.setMaxHeight(i6);
    }

    @Override // android.widget.ImageView
    public void setMaxWidth(int i6) {
        this.f9573a = i6;
        super.setMaxWidth(i6);
    }

    public PreferenceImageView(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        this.f9573a = IntCompanionObject.MAX_VALUE;
        this.f9574b = IntCompanionObject.MAX_VALUE;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1820g.f17739y0, i6, 0);
        setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(AbstractC1820g.f17634A0, IntCompanionObject.MAX_VALUE));
        setMaxHeight(obtainStyledAttributes.getDimensionPixelSize(AbstractC1820g.f17741z0, IntCompanionObject.MAX_VALUE));
        obtainStyledAttributes.recycle();
    }
}
