package K1;

import E1.O;
import Z0.z;
import c1.C1144z;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public final O f2985a;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a extends z {
        public a(String str) {
            super(str, null, false, 1);
        }
    }

    public e(O o6) {
        this.f2985a = o6;
    }

    public final boolean a(C1144z c1144z, long j6) {
        return b(c1144z) && c(c1144z, j6);
    }

    public abstract boolean b(C1144z c1144z);

    public abstract boolean c(C1144z c1144z, long j6);
}
