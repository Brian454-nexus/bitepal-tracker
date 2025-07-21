package androidx.lifecycle;

import U0.a;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1057i;
import androidx.lifecycle.N;
import kotlin.jvm.internal.Intrinsics;
import y2.d;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class F {

    /* renamed from: a, reason: collision with root package name */
    public static final a.b f8987a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final a.b f8988b = new c();

    /* renamed from: c, reason: collision with root package name */
    public static final a.b f8989c = new a();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a implements a.b {
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b implements a.b {
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c implements a.b {
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class d implements N.b {
        @Override // androidx.lifecycle.N.b
        public M b(Class modelClass, U0.a extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return new H();
        }
    }

    public static final C a(U0.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        y2.f fVar = (y2.f) aVar.a(f8987a);
        if (fVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        Q q6 = (Q) aVar.a(f8988b);
        if (q6 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) aVar.a(f8989c);
        String str = (String) aVar.a(N.c.f9024d);
        if (str != null) {
            return b(fVar, q6, str, bundle);
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
    }

    public static final C b(y2.f fVar, Q q6, String str, Bundle bundle) {
        G d6 = d(fVar);
        H e6 = e(q6);
        C c6 = (C) e6.f().get(str);
        if (c6 != null) {
            return c6;
        }
        C a6 = C.f8976f.a(d6.b(str), bundle);
        e6.f().put(str, a6);
        return a6;
    }

    public static final void c(y2.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        AbstractC1057i.b b6 = fVar.getLifecycle().b();
        if (b6 != AbstractC1057i.b.INITIALIZED && b6 != AbstractC1057i.b.CREATED) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (fVar.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            G g6 = new G(fVar.getSavedStateRegistry(), (Q) fVar);
            fVar.getSavedStateRegistry().h("androidx.lifecycle.internal.SavedStateHandlesProvider", g6);
            fVar.getLifecycle().a(new D(g6));
        }
    }

    public static final G d(y2.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        d.c c6 = fVar.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        G g6 = c6 instanceof G ? (G) c6 : null;
        if (g6 != null) {
            return g6;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    public static final H e(Q q6) {
        Intrinsics.checkNotNullParameter(q6, "<this>");
        return (H) new N(q6, new d()).b("androidx.lifecycle.internal.SavedStateHandlesVM", H.class);
    }
}
