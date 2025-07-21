package C;

import I.Q0;
import android.util.Size;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public final B.o f395a;

    public k() {
        this((B.o) B.l.a(B.o.class));
    }

    public Size a(Size size) {
        Size d6;
        B.o oVar = this.f395a;
        return (oVar == null || (d6 = oVar.d(Q0.b.PRIV)) == null || d6.getWidth() * d6.getHeight() <= size.getWidth() * size.getHeight()) ? size : d6;
    }

    public k(B.o oVar) {
        this.f395a = oVar;
    }
}
