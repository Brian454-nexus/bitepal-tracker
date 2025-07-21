package E1;

import android.net.Uri;
import b2.s;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface u {

    /* renamed from: a, reason: collision with root package name */
    public static final u f1080a = new u() { // from class: E1.t
        @Override // E1.u
        public final InterfaceC0314p[] c() {
            return u.b();
        }
    };

    static /* synthetic */ InterfaceC0314p[] b() {
        return new InterfaceC0314p[0];
    }

    default u a(s.a aVar) {
        return this;
    }

    InterfaceC0314p[] c();

    default u d(boolean z6) {
        return this;
    }

    default InterfaceC0314p[] e(Uri uri, Map map) {
        return c();
    }
}
