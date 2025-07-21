package G3;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import y3.InterfaceC2355a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class b implements B3.c {

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f1769a = LazyKt.lazy(a.f1770a);

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a extends Lambda implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f1770a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final A3.a invoke() {
            return new A3.a();
        }
    }

    private final InterfaceC2355a b() {
        return (InterfaceC2355a) this.f1769a.getValue();
    }

    @Override // B3.c
    public InterfaceC2355a a(B3.a amplitude) {
        Intrinsics.checkNotNullParameter(amplitude, "amplitude");
        return b();
    }
}
