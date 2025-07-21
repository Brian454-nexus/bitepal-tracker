package com.amazon.a.b;

import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private static final String f11327a = "license";

    /* renamed from: b, reason: collision with root package name */
    private static final String f11328b = "customerId";

    /* renamed from: c, reason: collision with root package name */
    private static final String f11329c = "deviceId";

    /* renamed from: d, reason: collision with root package name */
    private final String f11330d;

    /* renamed from: e, reason: collision with root package name */
    private final String f11331e;

    /* renamed from: f, reason: collision with root package name */
    private final String f11332f;

    public g(Map<String, String> map) {
        if (map == null) {
            throw com.amazon.a.a.n.a.a.g.d();
        }
        this.f11330d = a(f11327a, map);
        this.f11331e = a(f11328b, map);
        this.f11332f = a(f11329c, map);
    }

    private String a(String str, Map<String, String> map) {
        String str2 = map.get(str);
        if (a(str2)) {
            throw com.amazon.a.a.n.a.a.g.a(str);
        }
        return str2;
    }

    public String b() {
        return this.f11332f;
    }

    public String c() {
        return this.f11330d;
    }

    private boolean a(String str) {
        return str == null || str.length() == 0;
    }

    public String a() {
        return this.f11331e;
    }
}
