package y2;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1057i;
import androidx.lifecycle.InterfaceC1059k;
import androidx.lifecycle.InterfaceC1061m;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import y2.d;

/* renamed from: y2.b, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2354b implements InterfaceC1059k {

    /* renamed from: b, reason: collision with root package name */
    public static final a f21207b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final f f21208a;

    /* renamed from: y2.b$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: y2.b$b, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0275b implements d.c {

        /* renamed from: a, reason: collision with root package name */
        public final Set f21209a;

        public C0275b(d registry) {
            Intrinsics.checkNotNullParameter(registry, "registry");
            this.f21209a = new LinkedHashSet();
            registry.h("androidx.savedstate.Restarter", this);
        }

        @Override // y2.d.c
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f21209a));
            return bundle;
        }

        public final void b(String className) {
            Intrinsics.checkNotNullParameter(className, "className");
            this.f21209a.add(className);
        }
    }

    public C2354b(f owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f21208a = owner;
    }

    public final void a(String str) {
        try {
            Class<? extends U> asSubclass = Class.forName(str, false, C2354b.class.getClassLoader()).asSubclass(d.a.class);
            Intrinsics.checkNotNullExpressionValue(asSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    Object newInstance = declaredConstructor.newInstance(new Object[0]);
                    Intrinsics.checkNotNullExpressionValue(newInstance, "{\n                constr…wInstance()\n            }");
                    ((d.a) newInstance).a(this.f21208a);
                } catch (Exception e6) {
                    throw new RuntimeException("Failed to instantiate " + str, e6);
                }
            } catch (NoSuchMethodException e7) {
                throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e7);
            }
        } catch (ClassNotFoundException e8) {
            throw new RuntimeException("Class " + str + " wasn't found", e8);
        }
    }

    @Override // androidx.lifecycle.InterfaceC1059k
    public void c(InterfaceC1061m source, AbstractC1057i.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event != AbstractC1057i.a.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        source.getLifecycle().c(this);
        Bundle b6 = this.f21208a.getSavedStateRegistry().b("androidx.savedstate.Restarter");
        if (b6 == null) {
            return;
        }
        ArrayList<String> stringArrayList = b6.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        Iterator<String> it = stringArrayList.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }
}
