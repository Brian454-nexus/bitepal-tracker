package A0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f24a;

    /* renamed from: b, reason: collision with root package name */
    public final s f25b;

    /* renamed from: c, reason: collision with root package name */
    public final int f26c;

    public a(int i6, s sVar, int i7) {
        this.f24a = i6;
        this.f25b = sVar;
        this.f26c = i7;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f24a);
        this.f25b.O(this.f26c, bundle);
    }
}
