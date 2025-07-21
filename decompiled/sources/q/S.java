package q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import k.AbstractC1653a;
import p0.AbstractC1892f;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class S {

    /* renamed from: a, reason: collision with root package name */
    public final Context f18506a;

    /* renamed from: b, reason: collision with root package name */
    public final TypedArray f18507b;

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f18508c;

    public S(Context context, TypedArray typedArray) {
        this.f18506a = context;
        this.f18507b = typedArray;
    }

    public static S p(Context context, int i6, int[] iArr) {
        return new S(context, context.obtainStyledAttributes(i6, iArr));
    }

    public static S q(Context context, AttributeSet attributeSet, int[] iArr) {
        return new S(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static S r(Context context, AttributeSet attributeSet, int[] iArr, int i6, int i7) {
        return new S(context, context.obtainStyledAttributes(attributeSet, iArr, i6, i7));
    }

    public boolean a(int i6, boolean z6) {
        return this.f18507b.getBoolean(i6, z6);
    }

    public int b(int i6, int i7) {
        return this.f18507b.getColor(i6, i7);
    }

    public ColorStateList c(int i6) {
        int resourceId;
        ColorStateList a6;
        return (!this.f18507b.hasValue(i6) || (resourceId = this.f18507b.getResourceId(i6, 0)) == 0 || (a6 = AbstractC1653a.a(this.f18506a, resourceId)) == null) ? this.f18507b.getColorStateList(i6) : a6;
    }

    public int d(int i6, int i7) {
        return this.f18507b.getDimensionPixelOffset(i6, i7);
    }

    public int e(int i6, int i7) {
        return this.f18507b.getDimensionPixelSize(i6, i7);
    }

    public Drawable f(int i6) {
        int resourceId;
        return (!this.f18507b.hasValue(i6) || (resourceId = this.f18507b.getResourceId(i6, 0)) == 0) ? this.f18507b.getDrawable(i6) : AbstractC1653a.b(this.f18506a, resourceId);
    }

    public float g(int i6, float f6) {
        return this.f18507b.getFloat(i6, f6);
    }

    public Typeface h(int i6, int i7, AbstractC1892f.e eVar) {
        int resourceId = this.f18507b.getResourceId(i6, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f18508c == null) {
            this.f18508c = new TypedValue();
        }
        return AbstractC1892f.e(this.f18506a, resourceId, this.f18508c, i7, eVar);
    }

    public int i(int i6, int i7) {
        return this.f18507b.getInt(i6, i7);
    }

    public int j(int i6, int i7) {
        return this.f18507b.getInteger(i6, i7);
    }

    public int k(int i6, int i7) {
        return this.f18507b.getLayoutDimension(i6, i7);
    }

    public int l(int i6, int i7) {
        return this.f18507b.getResourceId(i6, i7);
    }

    public String m(int i6) {
        return this.f18507b.getString(i6);
    }

    public CharSequence n(int i6) {
        return this.f18507b.getText(i6);
    }

    public boolean o(int i6) {
        return this.f18507b.hasValue(i6);
    }

    public void s() {
        this.f18507b.recycle();
    }
}
