package y2;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1057i;
import androidx.lifecycle.InterfaceC1059k;
import androidx.lifecycle.InterfaceC1061m;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import s.C2039b;
import y2.C2354b;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class d {

    /* renamed from: g, reason: collision with root package name */
    public static final b f21211g = new b(null);

    /* renamed from: b, reason: collision with root package name */
    public boolean f21213b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f21214c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f21215d;

    /* renamed from: e, reason: collision with root package name */
    public C2354b.C0275b f21216e;

    /* renamed from: a, reason: collision with root package name */
    public final C2039b f21212a = new C2039b();

    /* renamed from: f, reason: collision with root package name */
    public boolean f21217f = true;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface a {
        void a(f fVar);
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface c {
        Bundle a();
    }

    public static final void d(d this$0, InterfaceC1061m interfaceC1061m, AbstractC1057i.a event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(interfaceC1061m, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == AbstractC1057i.a.ON_START) {
            this$0.f21217f = true;
        } else if (event == AbstractC1057i.a.ON_STOP) {
            this$0.f21217f = false;
        }
    }

    public final Bundle b(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (!this.f21215d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f21214c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle != null ? bundle.getBundle(key) : null;
        Bundle bundle3 = this.f21214c;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.f21214c;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.f21214c = null;
        return bundle2;
    }

    public final c c(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Iterator it = this.f21212a.iterator();
        while (it.hasNext()) {
            Map.Entry components = (Map.Entry) it.next();
            Intrinsics.checkNotNullExpressionValue(components, "components");
            String str = (String) components.getKey();
            c cVar = (c) components.getValue();
            if (Intrinsics.areEqual(str, key)) {
                return cVar;
            }
        }
        return null;
    }

    public final void e(AbstractC1057i lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        if (this.f21213b) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        lifecycle.a(new InterfaceC1059k() { // from class: y2.c
            @Override // androidx.lifecycle.InterfaceC1059k
            public final void c(InterfaceC1061m interfaceC1061m, AbstractC1057i.a aVar) {
                d.d(d.this, interfaceC1061m, aVar);
            }
        });
        this.f21213b = true;
    }

    public final void f(Bundle bundle) {
        if (!this.f21213b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (this.f21215d) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        this.f21214c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        this.f21215d = true;
    }

    public final void g(Bundle outBundle) {
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f21214c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        C2039b.d c6 = this.f21212a.c();
        Intrinsics.checkNotNullExpressionValue(c6, "this.components.iteratorWithAdditions()");
        while (c6.hasNext()) {
            Map.Entry entry = (Map.Entry) c6.next();
            bundle.putBundle((String) entry.getKey(), ((c) entry.getValue()).a());
        }
        if (bundle.isEmpty()) {
            return;
        }
        outBundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
    }

    public final void h(String key, c provider) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(provider, "provider");
        if (((c) this.f21212a.k(key, provider)) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public final void i(Class clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        if (!this.f21217f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        C2354b.C0275b c0275b = this.f21216e;
        if (c0275b == null) {
            c0275b = new C2354b.C0275b(this);
        }
        this.f21216e = c0275b;
        try {
            clazz.getDeclaredConstructor(new Class[0]);
            C2354b.C0275b c0275b2 = this.f21216e;
            if (c0275b2 != null) {
                String name = clazz.getName();
                Intrinsics.checkNotNullExpressionValue(name, "clazz.name");
                c0275b2.b(name);
            }
        } catch (NoSuchMethodException e6) {
            throw new IllegalArgumentException("Class " + clazz.getSimpleName() + " must have default constructor in order to be automatically recreated", e6);
        }
    }
}
