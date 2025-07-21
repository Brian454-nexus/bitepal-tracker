package com.amazon.a.a.o.b.a;

import com.amazon.a.a.n.a.a.g;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class b extends com.amazon.a.a.d.b {

    /* renamed from: a, reason: collision with root package name */
    private static final long f11232a = 1;

    private b(String str, String str2) {
        super("SIGNED_TOKEN_PARSE_FAILURE", str, str2);
    }

    public static b a(Throwable th) {
        return new b("DECODE", th.getMessage());
    }

    public static b d() {
        return new b("INVALID_FORMAT", null);
    }

    public static b a(String str) {
        return new b(g.f11051b, str);
    }

    public static b a(String str, String str2) {
        return new b("INVALID_FIELD_VALUE", str + ":" + str2);
    }
}
