package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1057i;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import y2.d;

/* renamed from: androidx.lifecycle.h, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1056h {

    /* renamed from: a, reason: collision with root package name */
    public static final C1056h f9038a = new C1056h();

    /* renamed from: androidx.lifecycle.h$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a implements d.a {
        @Override // y2.d.a
        public void a(y2.f owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            if (!(owner instanceof Q)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
            }
            P viewModelStore = ((Q) owner).getViewModelStore();
            y2.d savedStateRegistry = owner.getSavedStateRegistry();
            Iterator it = viewModelStore.c().iterator();
            while (it.hasNext()) {
                M b6 = viewModelStore.b((String) it.next());
                Intrinsics.checkNotNull(b6);
                C1056h.a(b6, savedStateRegistry, owner.getLifecycle());
            }
            if (viewModelStore.c().isEmpty()) {
                return;
            }
            savedStateRegistry.i(a.class);
        }
    }

    /* renamed from: androidx.lifecycle.h$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b implements InterfaceC1059k {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AbstractC1057i f9039a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ y2.d f9040b;

        public b(AbstractC1057i abstractC1057i, y2.d dVar) {
            this.f9039a = abstractC1057i;
            this.f9040b = dVar;
        }

        @Override // androidx.lifecycle.InterfaceC1059k
        public void c(InterfaceC1061m source, AbstractC1057i.a event) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(event, "event");
            if (event == AbstractC1057i.a.ON_START) {
                this.f9039a.c(this);
                this.f9040b.i(a.class);
            }
        }
    }

    public static final void a(M viewModel, y2.d registry, AbstractC1057i lifecycle) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        E e6 = (E) viewModel.c("androidx.lifecycle.savedstate.vm.tag");
        if (e6 == null || e6.d()) {
            return;
        }
        e6.a(registry, lifecycle);
        f9038a.c(registry, lifecycle);
    }

    public static final E b(y2.d registry, AbstractC1057i lifecycle, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNull(str);
        E e6 = new E(str, C.f8976f.a(registry.b(str), bundle));
        e6.a(registry, lifecycle);
        f9038a.c(registry, lifecycle);
        return e6;
    }

    public final void c(y2.d dVar, AbstractC1057i abstractC1057i) {
        AbstractC1057i.b b6 = abstractC1057i.b();
        if (b6 == AbstractC1057i.b.INITIALIZED || b6.b(AbstractC1057i.b.STARTED)) {
            dVar.i(a.class);
        } else {
            abstractC1057i.a(new b(abstractC1057i, dVar));
        }
    }
}
