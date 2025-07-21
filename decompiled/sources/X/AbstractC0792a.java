package X;

import X.C0794c;
import android.util.Range;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: X.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC0792a {

    /* renamed from: a, reason: collision with root package name */
    public static final Range f5835a;

    /* renamed from: b, reason: collision with root package name */
    public static final Range f5836b;

    /* renamed from: c, reason: collision with root package name */
    public static final AbstractC0792a f5837c;

    /* renamed from: X.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class AbstractC0103a {
        public abstract AbstractC0792a a();

        public abstract AbstractC0103a b(Range range);

        public abstract AbstractC0103a c(int i6);

        public abstract AbstractC0103a d(Range range);

        public abstract AbstractC0103a e(int i6);
    }

    static {
        Integer valueOf = Integer.valueOf(IntCompanionObject.MAX_VALUE);
        f5835a = new Range(0, valueOf);
        f5836b = new Range(0, valueOf);
        f5837c = a().c(0).a();
    }

    public static AbstractC0103a a() {
        return new C0794c.b().f(-1).e(-1).c(-1).b(f5835a).d(f5836b);
    }

    public abstract Range b();

    public abstract int c();

    public abstract Range d();

    public abstract int e();

    public abstract int f();
}
