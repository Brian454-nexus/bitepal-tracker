package e1;

import Z0.InterfaceC0837i;
import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* renamed from: e1.f, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface InterfaceC1248f extends InterfaceC0837i {

    /* renamed from: e1.f$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface a {
        InterfaceC1248f a();
    }

    void close();

    Uri getUri();

    void l(InterfaceC1266x interfaceC1266x);

    default Map n() {
        return Collections.EMPTY_MAP;
    }

    long r(C1252j c1252j);
}
