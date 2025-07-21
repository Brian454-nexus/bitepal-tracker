package com.amazon.device.iap.internal.b;

import com.amazon.a.a.o.f;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class e {

    /* renamed from: b, reason: collision with root package name */
    private static final e f11616b = new e();

    /* renamed from: a, reason: collision with root package name */
    private final Set<String> f11617a = new ConcurrentSkipListSet();

    public boolean a(String str) {
        if (f.a(str)) {
            return false;
        }
        return this.f11617a.remove(str);
    }

    public void b(String str) {
        if (f.a(str)) {
            return;
        }
        this.f11617a.add(str);
    }

    public static e a() {
        return f11616b;
    }
}
