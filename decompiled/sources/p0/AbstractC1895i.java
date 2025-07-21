package p0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;

/* renamed from: p0.i, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC1895i {
    public static int a(Context context, int i6, int i7) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i6, typedValue, true);
        return typedValue.resourceId != 0 ? i6 : i7;
    }

    public static boolean b(TypedArray typedArray, int i6, int i7, boolean z6) {
        return typedArray.getBoolean(i6, typedArray.getBoolean(i7, z6));
    }

    public static Drawable c(TypedArray typedArray, int i6, int i7) {
        Drawable drawable = typedArray.getDrawable(i6);
        return drawable == null ? typedArray.getDrawable(i7) : drawable;
    }

    public static int d(TypedArray typedArray, int i6, int i7, int i8) {
        return typedArray.getInt(i6, typedArray.getInt(i7, i8));
    }

    public static int e(TypedArray typedArray, int i6, int i7, int i8) {
        return typedArray.getResourceId(i6, typedArray.getResourceId(i7, i8));
    }

    public static String f(TypedArray typedArray, int i6, int i7) {
        String string = typedArray.getString(i6);
        return string == null ? typedArray.getString(i7) : string;
    }

    public static CharSequence g(TypedArray typedArray, int i6, int i7) {
        CharSequence text = typedArray.getText(i6);
        return text == null ? typedArray.getText(i7) : text;
    }

    public static CharSequence[] h(TypedArray typedArray, int i6, int i7) {
        CharSequence[] textArray = typedArray.getTextArray(i6);
        return textArray == null ? typedArray.getTextArray(i7) : textArray;
    }
}
