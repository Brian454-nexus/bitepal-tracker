package q;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import q0.AbstractC1998a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class N {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f18487a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f18488b = {-16842910};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f18489c = {R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f18490d = {R.attr.state_activated};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f18491e = {R.attr.state_pressed};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f18492f = {R.attr.state_checked};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f18493g = {R.attr.state_selected};

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f18494h = {-16842919, -16842908};

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f18495i = new int[0];

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f18496j = new int[1];

    public static int a(Context context, int i6) {
        ColorStateList d6 = d(context, i6);
        if (d6 != null && d6.isStateful()) {
            return d6.getColorForState(f18488b, d6.getDefaultColor());
        }
        TypedValue e6 = e();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, e6, true);
        return c(context, i6, e6.getFloat());
    }

    public static int b(Context context, int i6) {
        int[] iArr = f18496j;
        iArr[0] = i6;
        S q6 = S.q(context, null, iArr);
        try {
            return q6.b(0, 0);
        } finally {
            q6.s();
        }
    }

    public static int c(Context context, int i6, float f6) {
        return AbstractC1998a.f(b(context, i6), Math.round(Color.alpha(r0) * f6));
    }

    public static ColorStateList d(Context context, int i6) {
        int[] iArr = f18496j;
        iArr[0] = i6;
        S q6 = S.q(context, null, iArr);
        try {
            return q6.c(0);
        } finally {
            q6.s();
        }
    }

    public static TypedValue e() {
        ThreadLocal threadLocal = f18487a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}
