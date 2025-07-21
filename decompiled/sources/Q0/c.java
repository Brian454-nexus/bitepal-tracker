package Q0;

import P0.AbstractComponentCallbacksC0708p;
import P0.I;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f4417a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static C0071c f4418b = C0071c.f4430d;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public enum a {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_WRONG_NESTED_HIERARCHY,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface b {
    }

    /* renamed from: Q0.c$c, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0071c {

        /* renamed from: c, reason: collision with root package name */
        public static final a f4429c = new a(null);

        /* renamed from: d, reason: collision with root package name */
        public static final C0071c f4430d = new C0071c(SetsKt.emptySet(), null, MapsKt.emptyMap());

        /* renamed from: a, reason: collision with root package name */
        public final Set f4431a;

        /* renamed from: b, reason: collision with root package name */
        public final Map f4432b;

        /* renamed from: Q0.c$c$a */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public a() {
            }
        }

        public C0071c(Set flags, b bVar, Map allowedViolations) {
            Intrinsics.checkNotNullParameter(flags, "flags");
            Intrinsics.checkNotNullParameter(allowedViolations, "allowedViolations");
            this.f4431a = flags;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : allowedViolations.entrySet()) {
                linkedHashMap.put((String) entry.getKey(), (Set) entry.getValue());
            }
            this.f4432b = linkedHashMap;
        }

        public final Set a() {
            return this.f4431a;
        }

        public final b b() {
            return null;
        }

        public final Map c() {
            return this.f4432b;
        }
    }

    public static final void d(String str, g violation) {
        Intrinsics.checkNotNullParameter(violation, "$violation");
        Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + str, violation);
        throw violation;
    }

    public static final void f(AbstractComponentCallbacksC0708p fragment, String previousFragmentId) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(previousFragmentId, "previousFragmentId");
        Q0.a aVar = new Q0.a(fragment, previousFragmentId);
        c cVar = f4417a;
        cVar.e(aVar);
        C0071c b6 = cVar.b(fragment);
        if (b6.a().contains(a.DETECT_FRAGMENT_REUSE) && cVar.l(b6, fragment.getClass(), aVar.getClass())) {
            cVar.c(b6, aVar);
        }
    }

    public static final void g(AbstractComponentCallbacksC0708p fragment, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        d dVar = new d(fragment, viewGroup);
        c cVar = f4417a;
        cVar.e(dVar);
        C0071c b6 = cVar.b(fragment);
        if (b6.a().contains(a.DETECT_FRAGMENT_TAG_USAGE) && cVar.l(b6, fragment.getClass(), dVar.getClass())) {
            cVar.c(b6, dVar);
        }
    }

    public static final void h(AbstractComponentCallbacksC0708p fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        e eVar = new e(fragment);
        c cVar = f4417a;
        cVar.e(eVar);
        C0071c b6 = cVar.b(fragment);
        if (b6.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && cVar.l(b6, fragment.getClass(), eVar.getClass())) {
            cVar.c(b6, eVar);
        }
    }

    public static final void i(AbstractComponentCallbacksC0708p fragment, ViewGroup container) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(container, "container");
        h hVar = new h(fragment, container);
        c cVar = f4417a;
        cVar.e(hVar);
        C0071c b6 = cVar.b(fragment);
        if (b6.a().contains(a.DETECT_WRONG_FRAGMENT_CONTAINER) && cVar.l(b6, fragment.getClass(), hVar.getClass())) {
            cVar.c(b6, hVar);
        }
    }

    public static final void j(AbstractComponentCallbacksC0708p fragment, AbstractComponentCallbacksC0708p expectedParentFragment, int i6) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(expectedParentFragment, "expectedParentFragment");
        i iVar = new i(fragment, expectedParentFragment, i6);
        c cVar = f4417a;
        cVar.e(iVar);
        C0071c b6 = cVar.b(fragment);
        if (b6.a().contains(a.DETECT_WRONG_NESTED_HIERARCHY) && cVar.l(b6, fragment.getClass(), iVar.getClass())) {
            cVar.c(b6, iVar);
        }
    }

    public final C0071c b(AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p) {
        while (abstractComponentCallbacksC0708p != null) {
            if (abstractComponentCallbacksC0708p.isAdded()) {
                I parentFragmentManager = abstractComponentCallbacksC0708p.getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "declaringFragment.parentFragmentManager");
                if (parentFragmentManager.B0() != null) {
                    C0071c B02 = parentFragmentManager.B0();
                    Intrinsics.checkNotNull(B02);
                    return B02;
                }
            }
            abstractComponentCallbacksC0708p = abstractComponentCallbacksC0708p.getParentFragment();
        }
        return f4418b;
    }

    public final void c(C0071c c0071c, final g gVar) {
        AbstractComponentCallbacksC0708p a6 = gVar.a();
        final String name = a6.getClass().getName();
        if (c0071c.a().contains(a.PENALTY_LOG)) {
            Log.d("FragmentStrictMode", "Policy violation in " + name, gVar);
        }
        c0071c.b();
        if (c0071c.a().contains(a.PENALTY_DEATH)) {
            k(a6, new Runnable() { // from class: Q0.b
                @Override // java.lang.Runnable
                public final void run() {
                    c.d(name, gVar);
                }
            });
        }
    }

    public final void e(g gVar) {
        if (I.I0(3)) {
            Log.d("FragmentManager", "StrictMode violation in " + gVar.a().getClass().getName(), gVar);
        }
    }

    public final void k(AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p, Runnable runnable) {
        if (!abstractComponentCallbacksC0708p.isAdded()) {
            runnable.run();
            return;
        }
        Handler h6 = abstractComponentCallbacksC0708p.getParentFragmentManager().v0().h();
        if (Intrinsics.areEqual(h6.getLooper(), Looper.myLooper())) {
            runnable.run();
        } else {
            h6.post(runnable);
        }
    }

    public final boolean l(C0071c c0071c, Class cls, Class cls2) {
        Set set = (Set) c0071c.c().get(cls.getName());
        if (set == null) {
            return true;
        }
        if (Intrinsics.areEqual(cls2.getSuperclass(), g.class) || !CollectionsKt.contains(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
