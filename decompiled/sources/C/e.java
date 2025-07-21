package C;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f389a;

    public e(String str) {
        this.f389a = str;
    }

    public List a(int i6) {
        B.n nVar = (B.n) B.l.a(B.n.class);
        return nVar == null ? new ArrayList() : nVar.d(this.f389a, i6);
    }
}
