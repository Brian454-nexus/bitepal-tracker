package com.amazon.device.iap.internal.c;

import java.util.HashMap;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class d implements com.amazon.device.iap.internal.c {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<Class, Class> f11671a;

    static {
        HashMap hashMap = new HashMap();
        f11671a = hashMap;
        hashMap.put(com.amazon.device.iap.internal.e.class, e.class);
    }

    @Override // com.amazon.device.iap.internal.c
    public <T> Class<T> a(Class<T> cls) {
        return f11671a.get(cls);
    }
}
