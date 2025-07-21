package com.amazon.a.a.h;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class a implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final String f10906a = "name";

    /* renamed from: b, reason: collision with root package name */
    public static final String f10907b = "time";

    /* renamed from: c, reason: collision with root package name */
    private static final long f10908c = 1;

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, String> f10909d;

    public a(String str) {
        HashMap hashMap = new HashMap();
        this.f10909d = hashMap;
        hashMap.put(f10906a, str);
        hashMap.put(f10907b, String.valueOf(System.currentTimeMillis()));
    }

    public a a(String str, String str2) {
        this.f10909d.put(str, str2);
        return this;
    }

    public String toString() {
        return "Metric: [" + this.f10909d.toString() + "]";
    }

    public Map<String, String> a() {
        return this.f10909d;
    }
}
