package com.amazon.device.drm.a.b;

import java.util.HashMap;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a implements com.amazon.device.drm.a.b {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<Class, Class> f11505a;

    static {
        HashMap hashMap = new HashMap();
        f11505a = hashMap;
        hashMap.put(com.amazon.device.drm.a.c.class, c.class);
    }

    @Override // com.amazon.device.drm.a.b
    public <T> Class<T> a(Class<T> cls) {
        return f11505a.get(cls);
    }
}
