package t3;

import com.amplitude.android.internal.locators.ComposeViewTargetLocator;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import x3.h;
import y3.InterfaceC2355a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f19073a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static final Lazy f19074b = LazyKt.lazy(a.f19075a);

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a extends Lambda implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f19075a = new a();

        /* renamed from: t3.c$a$a, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class C0249a extends Lambda implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final C0249a f19076a = new C0249a();

            public C0249a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke(InterfaceC2355a logger) {
                Intrinsics.checkNotNullParameter(logger, "logger");
                ArrayList arrayList = new ArrayList();
                if (h.b(h.f20542a, null, 1, null)) {
                    arrayList.add(new ComposeViewTargetLocator(logger));
                }
                arrayList.add(new C2078a());
                return arrayList;
            }
        }

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Function1 invoke() {
            return C0249a.f19076a;
        }
    }

    public final Function1 a() {
        return (Function1) f19074b.getValue();
    }
}
