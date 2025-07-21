package X;

import X.C0805n;
import android.util.Range;
import java.util.Arrays;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class y0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Range f6023a;

    /* renamed from: b, reason: collision with root package name */
    public static final Range f6024b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0814x f6025c;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class a {
        public abstract y0 a();

        public abstract a b(int i6);

        public abstract a c(Range range);

        public abstract a d(Range range);

        public abstract a e(C0814x c0814x);
    }

    static {
        Integer valueOf = Integer.valueOf(IntCompanionObject.MAX_VALUE);
        f6023a = new Range(0, valueOf);
        f6024b = new Range(0, valueOf);
        AbstractC0811u abstractC0811u = AbstractC0811u.f5976c;
        f6025c = C0814x.g(Arrays.asList(abstractC0811u, AbstractC0811u.f5975b, AbstractC0811u.f5974a), AbstractC0806o.a(abstractC0811u));
    }

    public static a a() {
        return new C0805n.b().e(f6025c).d(f6023a).c(f6024b).b(-1);
    }

    public abstract int b();

    public abstract Range c();

    public abstract Range d();

    public abstract C0814x e();

    public abstract a f();
}
