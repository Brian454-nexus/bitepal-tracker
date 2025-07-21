package C;

import B.AbstractC0287d;
import I.G0;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f400a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f401b = false;

    public n(G0 g02) {
        this.f400a = g02.b(AbstractC0287d.class) != null;
    }

    public void a() {
        this.f401b = false;
    }

    public void b() {
        this.f401b = true;
    }

    public boolean c(int i6) {
        return this.f401b && i6 == 0 && this.f400a;
    }
}
