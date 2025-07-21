package C;

import B.C0294k;
import I.G0;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f386a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f387b;

    public b(G0 g02) {
        this.f386a = g02.a(B.t.class);
        this.f387b = B.l.a(C0294k.class) != null;
    }

    public int a(int i6) {
        if ((this.f386a || this.f387b) && i6 == 2) {
            return 1;
        }
        return i6;
    }
}
