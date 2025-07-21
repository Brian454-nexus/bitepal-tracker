package b1;

import android.text.Spannable;
import android.text.style.RelativeSizeSpan;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class f {
    public static void a(Spannable spannable, float f6, int i6, int i7, int i8) {
        for (RelativeSizeSpan relativeSizeSpan : (RelativeSizeSpan[]) spannable.getSpans(i6, i7, RelativeSizeSpan.class)) {
            if (spannable.getSpanStart(relativeSizeSpan) <= i6 && spannable.getSpanEnd(relativeSizeSpan) >= i7) {
                f6 *= relativeSizeSpan.getSizeChange();
            }
            c(spannable, relativeSizeSpan, i6, i7, i8);
        }
        spannable.setSpan(new RelativeSizeSpan(f6), i6, i7, i8);
    }

    public static void b(Spannable spannable, Object obj, int i6, int i7, int i8) {
        for (Object obj2 : spannable.getSpans(i6, i7, obj.getClass())) {
            c(spannable, obj2, i6, i7, i8);
        }
        spannable.setSpan(obj, i6, i7, i8);
    }

    public static void c(Spannable spannable, Object obj, int i6, int i7, int i8) {
        if (spannable.getSpanStart(obj) == i6 && spannable.getSpanEnd(obj) == i7 && spannable.getSpanFlags(obj) == i8) {
            spannable.removeSpan(obj);
        }
    }
}
