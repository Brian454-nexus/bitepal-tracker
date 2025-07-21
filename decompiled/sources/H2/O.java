package H2;

import android.view.View;
import android.view.WindowId;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class O implements P {

    /* renamed from: a, reason: collision with root package name */
    public final WindowId f2064a;

    public O(View view) {
        this.f2064a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof O) && ((O) obj).f2064a.equals(this.f2064a);
    }

    public int hashCode() {
        return this.f2064a.hashCode();
    }
}
