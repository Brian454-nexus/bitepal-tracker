package Q2;

import android.app.Activity;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface l {

    /* renamed from: a, reason: collision with root package name */
    public static final a f4491a = a.f4492a;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f4492a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static Function1 f4493b = C0076a.f4494a;

        /* renamed from: Q2.l$a$a, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class C0076a extends Lambda implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final C0076a f4494a = new C0076a();

            public C0076a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final l invoke(l it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it;
            }
        }

        public final l a() {
            return (l) f4493b.invoke(o.f4495b);
        }
    }

    static l b() {
        return f4491a.a();
    }

    k a(Activity activity);
}
