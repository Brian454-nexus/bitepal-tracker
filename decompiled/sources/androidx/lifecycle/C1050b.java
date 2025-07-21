package androidx.lifecycle;

import androidx.lifecycle.AbstractC1057i;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1050b {

    /* renamed from: c, reason: collision with root package name */
    public static C1050b f9027c = new C1050b();

    /* renamed from: a, reason: collision with root package name */
    public final Map f9028a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Map f9029b = new HashMap();

    /* renamed from: androidx.lifecycle.b$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Map f9030a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        public final Map f9031b;

        public a(Map map) {
            this.f9031b = map;
            for (Map.Entry entry : map.entrySet()) {
                AbstractC1057i.a aVar = (AbstractC1057i.a) entry.getValue();
                List list = (List) this.f9030a.get(aVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f9030a.put(aVar, list);
                }
                list.add((C0133b) entry.getKey());
            }
        }

        public static void b(List list, InterfaceC1061m interfaceC1061m, AbstractC1057i.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((C0133b) list.get(size)).a(interfaceC1061m, aVar, obj);
                }
            }
        }

        public void a(InterfaceC1061m interfaceC1061m, AbstractC1057i.a aVar, Object obj) {
            b((List) this.f9030a.get(aVar), interfaceC1061m, aVar, obj);
            b((List) this.f9030a.get(AbstractC1057i.a.ON_ANY), interfaceC1061m, aVar, obj);
        }
    }

    /* renamed from: androidx.lifecycle.b$b, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0133b {

        /* renamed from: a, reason: collision with root package name */
        public final int f9032a;

        /* renamed from: b, reason: collision with root package name */
        public final Method f9033b;

        public C0133b(int i6, Method method) {
            this.f9032a = i6;
            this.f9033b = method;
            method.setAccessible(true);
        }

        public void a(InterfaceC1061m interfaceC1061m, AbstractC1057i.a aVar, Object obj) {
            try {
                int i6 = this.f9032a;
                if (i6 == 0) {
                    this.f9033b.invoke(obj, new Object[0]);
                } else if (i6 == 1) {
                    this.f9033b.invoke(obj, interfaceC1061m);
                } else {
                    if (i6 != 2) {
                        return;
                    }
                    this.f9033b.invoke(obj, interfaceC1061m, aVar);
                }
            } catch (IllegalAccessException e6) {
                throw new RuntimeException(e6);
            } catch (InvocationTargetException e7) {
                throw new RuntimeException("Failed to call observer method", e7.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0133b)) {
                return false;
            }
            C0133b c0133b = (C0133b) obj;
            return this.f9032a == c0133b.f9032a && this.f9033b.getName().equals(c0133b.f9033b.getName());
        }

        public int hashCode() {
            return (this.f9032a * 31) + this.f9033b.getName().hashCode();
        }
    }

    public final a a(Class cls, Method[] methodArr) {
        int i6;
        a c6;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null && (c6 = c(superclass)) != null) {
            hashMap.putAll(c6.f9031b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : c(cls2).f9031b.entrySet()) {
                e(hashMap, (C0133b) entry.getKey(), (AbstractC1057i.a) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z6 = false;
        for (Method method : methodArr) {
            v vVar = (v) method.getAnnotation(v.class);
            if (vVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i6 = 0;
                } else {
                    if (!InterfaceC1061m.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i6 = 1;
                }
                AbstractC1057i.a value = vVar.value();
                if (parameterTypes.length > 1) {
                    if (!AbstractC1057i.a.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != AbstractC1057i.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i6 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                e(hashMap, new C0133b(i6, method), value, cls);
                z6 = true;
            }
        }
        a aVar = new a(hashMap);
        this.f9028a.put(cls, aVar);
        this.f9029b.put(cls, Boolean.valueOf(z6));
        return aVar;
    }

    public final Method[] b(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e6) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e6);
        }
    }

    public a c(Class cls) {
        a aVar = (a) this.f9028a.get(cls);
        return aVar != null ? aVar : a(cls, null);
    }

    public boolean d(Class cls) {
        Boolean bool = (Boolean) this.f9029b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] b6 = b(cls);
        for (Method method : b6) {
            if (((v) method.getAnnotation(v.class)) != null) {
                a(cls, b6);
                return true;
            }
        }
        this.f9029b.put(cls, Boolean.FALSE);
        return false;
    }

    public final void e(Map map, C0133b c0133b, AbstractC1057i.a aVar, Class cls) {
        AbstractC1057i.a aVar2 = (AbstractC1057i.a) map.get(c0133b);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                map.put(c0133b, aVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0133b.f9033b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
    }
}
