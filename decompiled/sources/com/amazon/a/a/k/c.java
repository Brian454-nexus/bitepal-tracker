package com.amazon.a.a.k;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public static final com.amazon.a.a.o.c f10997a = new com.amazon.a.a.o.c("ResourceManagerImpl");

    /* renamed from: b, reason: collision with root package name */
    private List<Object> f10998b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private boolean f10999c = false;

    public c() {
        a(this);
    }

    private boolean c(Object obj) {
        com.amazon.a.a.o.a.a.a(obj, "resource");
        return a(obj.getClass()) != null;
    }

    private boolean d(Object obj) {
        return obj.getClass().getName().startsWith("com.amazon.");
    }

    @Override // com.amazon.a.a.k.b
    public void a(Object obj) {
        if (com.amazon.a.a.o.c.f11253a) {
            f10997a.a("Registering resource: " + obj);
        }
        com.amazon.a.a.o.a.a.a();
        if (!this.f10999c) {
            com.amazon.a.a.o.a.a.b(c(obj), "Resource already registered: " + obj);
            this.f10998b.add(obj);
            return;
        }
        throw new IllegalStateException("Attempt made to register resource after population has begun!");
    }

    @Override // com.amazon.a.a.k.b
    public void b(Object obj) {
        com.amazon.a.a.o.a.a.a(obj, "target");
        if (com.amazon.a.a.o.c.f11253a) {
            f10997a.a("Populating: " + obj);
        }
        if (!d(obj)) {
            f10997a.a("Ignoring: " + obj + ", not a kiwi class");
            return;
        }
        for (Class<?> cls = obj.getClass(); cls != Object.class; cls = cls.getSuperclass()) {
            for (Field field : cls.getDeclaredFields()) {
                if (a(field)) {
                    a(obj, field);
                }
            }
        }
        if (obj instanceof d) {
            ((d) obj).e();
        }
    }

    private Object a(Class<?> cls) {
        for (Object obj : this.f10998b) {
            if (cls.isAssignableFrom(obj.getClass())) {
                return obj;
            }
        }
        return null;
    }

    private boolean a(Field field) {
        return field.getAnnotation(a.class) != null;
    }

    private void a(Object obj, Field field) {
        Class<?> type = field.getType();
        Object a6 = a(type);
        com.amazon.a.a.o.a.a.b(a6, "no resource found for type: " + type);
        field.setAccessible(true);
        try {
            field.set(obj, a6);
        } catch (Exception e6) {
            com.amazon.a.a.o.a.a.a("Failed to populate field: " + field, (Throwable) e6);
        }
    }

    @Override // com.amazon.a.a.k.b
    public void a() {
        Iterator<Object> it = this.f10998b.iterator();
        while (it.hasNext()) {
            b(it.next());
        }
    }
}
