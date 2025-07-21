package K2;

import L2.e;
import L2.g;
import android.webkit.WebSettings;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class b {
    public static L2.d a(WebSettings webSettings) {
        return g.c().a(webSettings);
    }

    public static void b(WebSettings webSettings, int i6) {
        e eVar = e.FORCE_DARK;
        if (eVar.f()) {
            webSettings.setForceDark(i6);
        } else {
            if (!eVar.g()) {
                throw e.c();
            }
            a(webSettings).a(i6);
        }
    }

    public static void c(WebSettings webSettings, int i6) {
        if (!e.FORCE_DARK_STRATEGY.g()) {
            throw e.c();
        }
        a(webSettings).b(i6);
    }
}
