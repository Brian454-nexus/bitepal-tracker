package androidx.lifecycle;

import U0.a;
import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class N {

    /* renamed from: a, reason: collision with root package name */
    public final P f9012a;

    /* renamed from: b, reason: collision with root package name */
    public final b f9013b;

    /* renamed from: c, reason: collision with root package name */
    public final U0.a f9014c;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f9020a = a.f9021a;

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ a f9021a = new a();
        }

        default M a(Class modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
        }

        default M b(Class modelClass, U0.a extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return a(modelClass);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class c implements b {

        /* renamed from: c, reason: collision with root package name */
        public static c f9023c;

        /* renamed from: b, reason: collision with root package name */
        public static final a f9022b = new a(null);

        /* renamed from: d, reason: collision with root package name */
        public static final a.b f9024d = a.C0132a.f9025a;

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class a {

            /* renamed from: androidx.lifecycle.N$c$a$a, reason: collision with other inner class name */
            /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
            public static final class C0132a implements a.b {

                /* renamed from: a, reason: collision with root package name */
                public static final C0132a f9025a = new C0132a();
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a() {
                if (c.f9023c == null) {
                    c.f9023c = new c();
                }
                c cVar = c.f9023c;
                Intrinsics.checkNotNull(cVar);
                return cVar;
            }

            public a() {
            }
        }

        @Override // androidx.lifecycle.N.b
        public M a(Class modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            try {
                Object newInstance = modelClass.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                Intrinsics.checkNotNullExpressionValue(newInstance, "{\n                modelC…wInstance()\n            }");
                return (M) newInstance;
            } catch (IllegalAccessException e6) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e6);
            } catch (InstantiationException e7) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e7);
            } catch (NoSuchMethodException e8) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e8);
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class d {
        public abstract void c(M m6);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public N(P store, b factory) {
        this(store, factory, null, 4, null);
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
    }

    public M a(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, modelClass);
    }

    public M b(String key, Class modelClass) {
        M a6;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        M b6 = this.f9012a.b(key);
        if (!modelClass.isInstance(b6)) {
            U0.b bVar = new U0.b(this.f9014c);
            bVar.c(c.f9024d, key);
            try {
                a6 = this.f9013b.b(modelClass, bVar);
            } catch (AbstractMethodError unused) {
                a6 = this.f9013b.a(modelClass);
            }
            this.f9012a.d(key, a6);
            return a6;
        }
        Object obj = this.f9013b;
        d dVar = obj instanceof d ? (d) obj : null;
        if (dVar != null) {
            Intrinsics.checkNotNull(b6);
            dVar.c(b6);
        }
        Intrinsics.checkNotNull(b6, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        return b6;
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a extends c {

        /* renamed from: g, reason: collision with root package name */
        public static a f9016g;

        /* renamed from: e, reason: collision with root package name */
        public final Application f9018e;

        /* renamed from: f, reason: collision with root package name */
        public static final C0130a f9015f = new C0130a(null);

        /* renamed from: h, reason: collision with root package name */
        public static final a.b f9017h = C0130a.C0131a.f9019a;

        /* renamed from: androidx.lifecycle.N$a$a, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class C0130a {

            /* renamed from: androidx.lifecycle.N$a$a$a, reason: collision with other inner class name */
            /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
            public static final class C0131a implements a.b {

                /* renamed from: a, reason: collision with root package name */
                public static final C0131a f9019a = new C0131a();
            }

            public /* synthetic */ C0130a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(Application application) {
                Intrinsics.checkNotNullParameter(application, "application");
                if (a.f9016g == null) {
                    a.f9016g = new a(application);
                }
                a aVar = a.f9016g;
                Intrinsics.checkNotNull(aVar);
                return aVar;
            }

            public C0130a() {
            }
        }

        public a(Application application, int i6) {
            this.f9018e = application;
        }

        @Override // androidx.lifecycle.N.c, androidx.lifecycle.N.b
        public M a(Class modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Application application = this.f9018e;
            if (application != null) {
                return g(modelClass, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        @Override // androidx.lifecycle.N.b
        public M b(Class modelClass, U0.a extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            if (this.f9018e != null) {
                return a(modelClass);
            }
            Application application = (Application) extras.a(f9017h);
            if (application != null) {
                return g(modelClass, application);
            }
            if (AbstractC1049a.class.isAssignableFrom(modelClass)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return super.a(modelClass);
        }

        public final M g(Class cls, Application application) {
            if (!AbstractC1049a.class.isAssignableFrom(cls)) {
                return super.a(cls);
            }
            try {
                M m6 = (M) cls.getConstructor(Application.class).newInstance(application);
                Intrinsics.checkNotNullExpressionValue(m6, "{\n                try {\n…          }\n            }");
                return m6;
            } catch (IllegalAccessException e6) {
                throw new RuntimeException("Cannot create an instance of " + cls, e6);
            } catch (InstantiationException e7) {
                throw new RuntimeException("Cannot create an instance of " + cls, e7);
            } catch (NoSuchMethodException e8) {
                throw new RuntimeException("Cannot create an instance of " + cls, e8);
            } catch (InvocationTargetException e9) {
                throw new RuntimeException("Cannot create an instance of " + cls, e9);
            }
        }

        public a() {
            this(null, 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(Application application) {
            this(application, 0);
            Intrinsics.checkNotNullParameter(application, "application");
        }
    }

    public N(P store, b factory, U0.a defaultCreationExtras) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        this.f9012a = store;
        this.f9013b = factory;
        this.f9014c = defaultCreationExtras;
    }

    public /* synthetic */ N(P p6, b bVar, U0.a aVar, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(p6, bVar, (i6 & 4) != 0 ? a.C0088a.f5164b : aVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public N(Q owner, b factory) {
        this(owner.getViewModelStore(), factory, O.a(owner));
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(factory, "factory");
    }
}
