package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public TypedValue f8120a;

    /* renamed from: b, reason: collision with root package name */
    public TypedValue f8121b;

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f8122c;

    /* renamed from: d, reason: collision with root package name */
    public TypedValue f8123d;

    /* renamed from: e, reason: collision with root package name */
    public TypedValue f8124e;

    /* renamed from: f, reason: collision with root package name */
    public TypedValue f8125f;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f8126g;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface a {
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void a(Rect rect) {
        fitSystemWindows(rect);
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f8124e == null) {
            this.f8124e = new TypedValue();
        }
        return this.f8124e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f8125f == null) {
            this.f8125f = new TypedValue();
        }
        return this.f8125f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f8122c == null) {
            this.f8122c = new TypedValue();
        }
        return this.f8122c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f8123d == null) {
            this.f8123d = new TypedValue();
        }
        return this.f8123d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f8120a == null) {
            this.f8120a = new TypedValue();
        }
        return this.f8120a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f8121b == null) {
            this.f8121b = new TypedValue();
        }
        return this.f8121b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ae  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(a aVar) {
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        this.f8126g = new Rect();
    }
}
