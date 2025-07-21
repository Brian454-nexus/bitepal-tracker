package H2;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class y implements z {

    /* renamed from: a, reason: collision with root package name */
    public final ViewOverlay f2196a;

    public y(View view) {
        this.f2196a = view.getOverlay();
    }

    @Override // H2.z
    public void a(Drawable drawable) {
        this.f2196a.add(drawable);
    }

    @Override // H2.z
    public void b(Drawable drawable) {
        this.f2196a.remove(drawable);
    }
}
