package com.amazon.a.b;

import java.lang.reflect.Method;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class i implements com.amazon.a.a.n.a {

    /* renamed from: a, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f11339a = new com.amazon.a.a.o.c("DRMSuccessTask");

    /* renamed from: b, reason: collision with root package name */
    private static final String f11340b = "com.amazon.drm.AmazonLicenseVerificationCallback";

    /* renamed from: c, reason: collision with root package name */
    private static final String f11341c = "onDRMSuccess";

    @Override // com.amazon.a.a.n.a
    public void a() {
        Method a6;
        Class<?> a7 = com.amazon.a.a.o.d.a(f11340b);
        if (a7 == null || (a6 = a(a7, f11341c)) == null) {
            return;
        }
        if (com.amazon.a.a.o.c.f11253a) {
            f11339a.a("Invoking callback: " + a6.getName());
        }
        try {
            a6.invoke(null, new Object[0]);
            if (com.amazon.a.a.o.c.f11253a) {
                f11339a.a("Callback invoked.");
            }
        } catch (Exception unused) {
        }
    }

    private static Method a(Class<?> cls, String str) {
        com.amazon.a.a.o.a.a.a((Object) cls, "Class<?> target");
        com.amazon.a.a.o.a.a.a((Object) str, "String methodName");
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, new Class[0]);
            if (declaredMethod == null) {
                if (com.amazon.a.a.o.c.f11253a) {
                    f11339a.a("No exception thrown, but method '" + str + "' was not found, this should not happen. ");
                }
                return null;
            }
            declaredMethod.setAccessible(true);
            if (!com.amazon.a.a.o.d.c(declaredMethod)) {
                if (com.amazon.a.a.o.c.f11253a) {
                    f11339a.a("Callback " + str + " isn't static, ignoring...");
                }
                return null;
            }
            if (!com.amazon.a.a.o.d.b(declaredMethod)) {
                if (com.amazon.a.a.o.c.f11253a) {
                    f11339a.a("Callback " + str + " returns a value, ignoring...");
                }
                return null;
            }
            if (!com.amazon.a.a.o.d.a(declaredMethod)) {
                return declaredMethod;
            }
            if (com.amazon.a.a.o.c.f11253a) {
                f11339a.a("Callback " + str + " takes parameters, ignoring...");
            }
            return null;
        } catch (NoSuchMethodException unused) {
            if (com.amazon.a.a.o.c.f11253a) {
                f11339a.a("Did not find method " + str);
            }
            return null;
        }
    }
}
