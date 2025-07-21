package I0;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class A implements CoroutineContext.Element {

    /* renamed from: c, reason: collision with root package name */
    public static final a f2576c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final String f2577d = "Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.";

    /* renamed from: a, reason: collision with root package name */
    public final A f2578a;

    /* renamed from: b, reason: collision with root package name */
    public final j f2579b;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: I0.A$a$a, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class C0041a implements CoroutineContext.Key {

            /* renamed from: a, reason: collision with root package name */
            public static final C0041a f2580a = new C0041a();
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public A(A a6, j instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        this.f2578a = a6;
        this.f2579b = instance;
    }

    public final void a(h candidate) {
        Intrinsics.checkNotNullParameter(candidate, "candidate");
        if (this.f2579b == candidate) {
            throw new IllegalStateException(f2577d.toString());
        }
        A a6 = this.f2578a;
        if (a6 != null) {
            a6.a(candidate);
        }
    }

    public Object fold(Object obj, Function2 function2) {
        return CoroutineContext.Element.DefaultImpls.fold(this, obj, function2);
    }

    public CoroutineContext.Element get(CoroutineContext.Key key) {
        return CoroutineContext.Element.DefaultImpls.get(this, key);
    }

    public CoroutineContext.Key getKey() {
        return a.C0041a.f2580a;
    }

    public CoroutineContext minusKey(CoroutineContext.Key key) {
        return CoroutineContext.Element.DefaultImpls.minusKey(this, key);
    }

    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.Element.DefaultImpls.plus(this, coroutineContext);
    }
}
