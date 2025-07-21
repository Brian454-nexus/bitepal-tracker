package q;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import i.AbstractC1476i;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: q.q, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C1993q {

    /* renamed from: k, reason: collision with root package name */
    public static final RectF f18575k = new RectF();

    /* renamed from: l, reason: collision with root package name */
    public static ConcurrentHashMap f18576l = new ConcurrentHashMap();

    /* renamed from: m, reason: collision with root package name */
    public static ConcurrentHashMap f18577m = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public int f18578a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f18579b = false;

    /* renamed from: c, reason: collision with root package name */
    public float f18580c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f18581d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f18582e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    public int[] f18583f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public boolean f18584g = false;

    /* renamed from: h, reason: collision with root package name */
    public TextPaint f18585h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f18586i;

    /* renamed from: j, reason: collision with root package name */
    public final Context f18587j;

    public C1993q(TextView textView) {
        this.f18586i = textView;
        this.f18587j = textView.getContext();
    }

    public static Method l(String str) {
        try {
            Method method = (Method) f18576l.get(str);
            if (method != null || (method = TextView.class.getDeclaredMethod(str, new Class[0])) == null) {
                return method;
            }
            method.setAccessible(true);
            f18576l.put(str, method);
            return method;
        } catch (Exception e6) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e6);
            return null;
        }
    }

    public static Object n(Object obj, String str, Object obj2) {
        try {
            return l(str).invoke(obj, new Object[0]);
        } catch (Exception e6) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e6);
            return obj2;
        }
    }

    public final void A(float f6, float f7, float f8) {
        if (f6 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f6 + "px) is less or equal to (0px)");
        }
        if (f7 <= f6) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f7 + "px) is less or equal to minimum auto-size text size (" + f6 + "px)");
        }
        if (f8 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f8 + "px) is less or equal to (0px)");
        }
        this.f18578a = 1;
        this.f18581d = f6;
        this.f18582e = f7;
        this.f18580c = f8;
        this.f18584g = false;
    }

    public void a() {
        if (o()) {
            if (this.f18579b) {
                if (this.f18586i.getMeasuredHeight() <= 0 || this.f18586i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = Build.VERSION.SDK_INT >= 29 ? this.f18586i.isHorizontallyScrollable() : ((Boolean) n(this.f18586i, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue() ? 1048576 : (this.f18586i.getMeasuredWidth() - this.f18586i.getTotalPaddingLeft()) - this.f18586i.getTotalPaddingRight();
                int height = (this.f18586i.getHeight() - this.f18586i.getCompoundPaddingBottom()) - this.f18586i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f18575k;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float f6 = f(rectF);
                        if (f6 != this.f18586i.getTextSize()) {
                            u(0, f6);
                        }
                    } finally {
                    }
                }
            }
            this.f18579b = true;
        }
    }

    public final int[] b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i6 : iArr) {
                if (i6 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i6)) < 0) {
                    arrayList.add(Integer.valueOf(i6));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i7 = 0; i7 < size; i7++) {
                    iArr2[i7] = ((Integer) arrayList.get(i7)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public final void c() {
        this.f18578a = 0;
        this.f18581d = -1.0f;
        this.f18582e = -1.0f;
        this.f18580c = -1.0f;
        this.f18583f = new int[0];
        this.f18579b = false;
    }

    public StaticLayout d(CharSequence charSequence, Layout.Alignment alignment, int i6, int i7) {
        return e(charSequence, alignment, i6, i7);
    }

    public final StaticLayout e(CharSequence charSequence, Layout.Alignment alignment, int i6, int i7) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f18585h, i6);
        StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(this.f18586i.getLineSpacingExtra(), this.f18586i.getLineSpacingMultiplier()).setIncludePad(this.f18586i.getIncludeFontPadding()).setBreakStrategy(this.f18586i.getBreakStrategy()).setHyphenationFrequency(this.f18586i.getHyphenationFrequency());
        if (i7 == -1) {
            i7 = IntCompanionObject.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i7);
        try {
            obtain.setTextDirection(Build.VERSION.SDK_INT >= 29 ? this.f18586i.getTextDirectionHeuristic() : (TextDirectionHeuristic) n(this.f18586i, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        } catch (ClassCastException unused) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return obtain.build();
    }

    public final int f(RectF rectF) {
        int length = this.f18583f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i6 = 1;
        int i7 = length - 1;
        int i8 = 0;
        while (i6 <= i7) {
            int i9 = (i6 + i7) / 2;
            if (y(this.f18583f[i9], rectF)) {
                int i10 = i9 + 1;
                i8 = i6;
                i6 = i10;
            } else {
                i8 = i9 - 1;
                i7 = i8;
            }
        }
        return this.f18583f[i8];
    }

    public int g() {
        return Math.round(this.f18582e);
    }

    public int h() {
        return Math.round(this.f18581d);
    }

    public int i() {
        return Math.round(this.f18580c);
    }

    public int[] j() {
        return this.f18583f;
    }

    public int k() {
        return this.f18578a;
    }

    public void m(int i6) {
        TextPaint textPaint = this.f18585h;
        if (textPaint == null) {
            this.f18585h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f18585h.set(this.f18586i.getPaint());
        this.f18585h.setTextSize(i6);
    }

    public boolean o() {
        return z() && this.f18578a != 0;
    }

    public void p(AttributeSet attributeSet, int i6) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.f18587j.obtainStyledAttributes(attributeSet, AbstractC1476i.f15537U, i6, 0);
        int i7 = AbstractC1476i.f15557Z;
        if (obtainStyledAttributes.hasValue(i7)) {
            this.f18578a = obtainStyledAttributes.getInt(i7, 0);
        }
        int i8 = AbstractC1476i.f15553Y;
        float dimension = obtainStyledAttributes.hasValue(i8) ? obtainStyledAttributes.getDimension(i8, -1.0f) : -1.0f;
        int i9 = AbstractC1476i.f15545W;
        float dimension2 = obtainStyledAttributes.hasValue(i9) ? obtainStyledAttributes.getDimension(i9, -1.0f) : -1.0f;
        int i10 = AbstractC1476i.f15541V;
        float dimension3 = obtainStyledAttributes.hasValue(i10) ? obtainStyledAttributes.getDimension(i10, -1.0f) : -1.0f;
        int i11 = AbstractC1476i.f15549X;
        if (obtainStyledAttributes.hasValue(i11) && (resourceId = obtainStyledAttributes.getResourceId(i11, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            w(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!z()) {
            this.f18578a = 0;
            return;
        }
        if (this.f18578a == 1) {
            if (!this.f18584g) {
                DisplayMetrics displayMetrics = this.f18587j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                A(dimension2, dimension3, dimension);
            }
            v();
        }
    }

    public void q(int i6, int i7, int i8, int i9) {
        if (z()) {
            DisplayMetrics displayMetrics = this.f18587j.getResources().getDisplayMetrics();
            A(TypedValue.applyDimension(i9, i6, displayMetrics), TypedValue.applyDimension(i9, i7, displayMetrics), TypedValue.applyDimension(i9, i8, displayMetrics));
            if (v()) {
                a();
            }
        }
    }

    public void r(int[] iArr, int i6) {
        if (z()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i6 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f18587j.getResources().getDisplayMetrics();
                    for (int i7 = 0; i7 < length; i7++) {
                        iArr2[i7] = Math.round(TypedValue.applyDimension(i6, iArr[i7], displayMetrics));
                    }
                }
                this.f18583f = b(iArr2);
                if (!x()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f18584g = false;
            }
            if (v()) {
                a();
            }
        }
    }

    public void s(int i6) {
        if (z()) {
            if (i6 == 0) {
                c();
                return;
            }
            if (i6 != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i6);
            }
            DisplayMetrics displayMetrics = this.f18587j.getResources().getDisplayMetrics();
            A(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (v()) {
                a();
            }
        }
    }

    public final void t(float f6) {
        if (f6 != this.f18586i.getPaint().getTextSize()) {
            this.f18586i.getPaint().setTextSize(f6);
            boolean isInLayout = this.f18586i.isInLayout();
            if (this.f18586i.getLayout() != null) {
                this.f18579b = false;
                try {
                    Method l6 = l("nullLayouts");
                    if (l6 != null) {
                        l6.invoke(this.f18586i, new Object[0]);
                    }
                } catch (Exception e6) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e6);
                }
                if (isInLayout) {
                    this.f18586i.forceLayout();
                } else {
                    this.f18586i.requestLayout();
                }
                this.f18586i.invalidate();
            }
        }
    }

    public void u(int i6, float f6) {
        Context context = this.f18587j;
        t(TypedValue.applyDimension(i6, f6, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    public final boolean v() {
        if (z() && this.f18578a == 1) {
            if (!this.f18584g || this.f18583f.length == 0) {
                int floor = ((int) Math.floor((this.f18582e - this.f18581d) / this.f18580c)) + 1;
                int[] iArr = new int[floor];
                for (int i6 = 0; i6 < floor; i6++) {
                    iArr[i6] = Math.round(this.f18581d + (i6 * this.f18580c));
                }
                this.f18583f = b(iArr);
            }
            this.f18579b = true;
        } else {
            this.f18579b = false;
        }
        return this.f18579b;
    }

    public final void w(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i6 = 0; i6 < length; i6++) {
                iArr[i6] = typedArray.getDimensionPixelSize(i6, -1);
            }
            this.f18583f = b(iArr);
            x();
        }
    }

    public final boolean x() {
        boolean z6 = this.f18583f.length > 0;
        this.f18584g = z6;
        if (z6) {
            this.f18578a = 1;
            this.f18581d = r0[0];
            this.f18582e = r0[r1 - 1];
            this.f18580c = -1.0f;
        }
        return z6;
    }

    public final boolean y(int i6, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f18586i.getText();
        TransformationMethod transformationMethod = this.f18586i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f18586i)) != null) {
            text = transformation;
        }
        int maxLines = this.f18586i.getMaxLines();
        m(i6);
        StaticLayout d6 = d(text, (Layout.Alignment) n(this.f18586i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (d6.getLineCount() <= maxLines && d6.getLineEnd(d6.getLineCount() - 1) == text.length())) && ((float) d6.getHeight()) <= rectF.bottom;
    }

    public final boolean z() {
        return true;
    }
}
