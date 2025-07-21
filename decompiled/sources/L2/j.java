package L2;

import android.webkit.WebSettings;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final WebkitToCompatConverterBoundaryInterface f3164a;

    public j(WebkitToCompatConverterBoundaryInterface webkitToCompatConverterBoundaryInterface) {
        this.f3164a = webkitToCompatConverterBoundaryInterface;
    }

    public d a(WebSettings webSettings) {
        return new d((WebSettingsBoundaryInterface) Ga.a.a(WebSettingsBoundaryInterface.class, this.f3164a.convertSettings(webSettings)));
    }
}
