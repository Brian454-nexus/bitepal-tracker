package N2;

import android.app.Activity;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KClasses;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ClassLoader f3582a;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        public final KClass f3583a;

        /* renamed from: b, reason: collision with root package name */
        public final Function1 f3584b;

        public a(KClass clazz, Function1 consumer) {
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            Intrinsics.checkNotNullParameter(consumer, "consumer");
            this.f3583a = clazz;
            this.f3584b = consumer;
        }

        public final void a(Object parameter) {
            Intrinsics.checkNotNullParameter(parameter, "parameter");
            this.f3584b.invoke(parameter);
        }

        public final boolean b(Method method, Object[] objArr) {
            return Intrinsics.areEqual(method.getName(), "accept") && objArr != null && objArr.length == 1;
        }

        public final boolean c(Method method, Object[] objArr) {
            return Intrinsics.areEqual(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1;
        }

        public final boolean d(Method method, Object[] objArr) {
            return Intrinsics.areEqual(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null;
        }

        public final boolean e(Method method, Object[] objArr) {
            return Intrinsics.areEqual(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            Intrinsics.checkNotNullParameter(obj, "obj");
            Intrinsics.checkNotNullParameter(method, "method");
            if (b(method, objArr)) {
                a(KClasses.cast(this.f3583a, objArr != null ? objArr[0] : null));
                return Unit.INSTANCE;
            }
            if (c(method, objArr)) {
                return Boolean.valueOf(obj == (objArr != null ? objArr[0] : null));
            }
            if (d(method, objArr)) {
                return Integer.valueOf(this.f3584b.hashCode());
            }
            if (e(method, objArr)) {
                return this.f3584b.toString();
            }
            throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface b {
        void dispose();
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Method f3585a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f3586b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f3587c;

        public c(Method method, Object obj, Object obj2) {
            this.f3585a = method;
            this.f3586b = obj;
            this.f3587c = obj2;
        }

        @Override // N2.d.b
        public void dispose() {
            this.f3585a.invoke(this.f3586b, this.f3587c);
        }
    }

    public d(ClassLoader loader) {
        Intrinsics.checkNotNullParameter(loader, "loader");
        this.f3582a = loader;
    }

    public final Object a(KClass kClass, Function1 function1) {
        Object newProxyInstance = Proxy.newProxyInstance(this.f3582a, new Class[]{d()}, new a(kClass, function1));
        Intrinsics.checkNotNullExpressionValue(newProxyInstance, "newProxyInstance(loader,…onsumerClass()), handler)");
        return newProxyInstance;
    }

    public final Class b() {
        try {
            return d();
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public final b c(Object obj, KClass clazz, String addMethodName, String removeMethodName, Activity activity, Function1 consumer) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(addMethodName, "addMethodName");
        Intrinsics.checkNotNullParameter(removeMethodName, "removeMethodName");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Object a6 = a(clazz, consumer);
        obj.getClass().getMethod(addMethodName, Activity.class, d()).invoke(obj, activity, a6);
        return new c(obj.getClass().getMethod(removeMethodName, d()), obj, a6);
    }

    public final Class d() {
        Class<?> loadClass = this.f3582a.loadClass("java.util.function.Consumer");
        Intrinsics.checkNotNullExpressionValue(loadClass, "loader.loadClass(\"java.util.function.Consumer\")");
        return loadClass;
    }
}
