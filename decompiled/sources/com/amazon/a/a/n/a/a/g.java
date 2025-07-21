package com.amazon.a.a.n.a.a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class g extends com.amazon.a.a.d.b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f11050a = "EMPTY";

    /* renamed from: b, reason: collision with root package name */
    public static final String f11051b = "MISSING_FIELD";

    /* renamed from: c, reason: collision with root package name */
    private static final long f11052c = 1;

    private g(String str, String str2) {
        super("MALFORMED_RESPONSE", str, str2);
    }

    public static final g a(String str) {
        return new g(f11051b, str);
    }

    public static final g d() {
        return new g(f11050a, null);
    }
}
