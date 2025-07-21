package I;

import I.C0436k;
import android.util.Range;
import android.util.Size;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class O0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Range f2327a = new Range(0, 0);

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class a {
        public abstract O0 a();

        public abstract a b(F.C c6);

        public abstract a c(Range range);

        public abstract a d(P p6);

        public abstract a e(Size size);
    }

    public static a a(Size size) {
        return new C0436k.b().e(size).c(f2327a).b(F.C.f1236d);
    }

    public abstract F.C b();

    public abstract Range c();

    public abstract P d();

    public abstract Size e();

    public abstract a f();
}
