package com.amazon.a.a.o.b;

import java.io.IOException;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public static final String f11248a = ",";

    /* renamed from: b, reason: collision with root package name */
    public static final String f11249b = "=";

    /* renamed from: c, reason: collision with root package name */
    public static final String f11250c = "|";

    /* renamed from: d, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f11251d = new com.amazon.a.a.o.c("SignedToken");

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, String> f11252e = new HashMap();

    public f(String str, PublicKey publicKey) {
        String b6 = b(str);
        int lastIndexOf = b6.lastIndexOf(f11250c);
        if (lastIndexOf == -1) {
            throw com.amazon.a.a.o.b.a.b.d();
        }
        String substring = b6.substring(0, lastIndexOf);
        String substring2 = b6.substring(lastIndexOf + 1);
        if (com.amazon.a.a.o.c.f11253a) {
            com.amazon.a.a.o.c cVar = f11251d;
            cVar.a("Token data: " + substring);
            cVar.a("Signature: " + substring2);
        }
        a(substring, substring2, publicKey);
        c(substring);
    }

    private void a(String str, String str2, PublicKey publicKey) {
        if (!e.a(str, str2, publicKey)) {
            throw new com.amazon.a.a.o.b.a.c();
        }
    }

    private String b(String str) {
        try {
            return new String(com.amazon.c.a.a.c.c(str.getBytes()));
        } catch (IOException e6) {
            throw com.amazon.a.a.o.b.a.b.a((Throwable) e6);
        }
    }

    private void c(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, f11248a);
        while (stringTokenizer.hasMoreElements()) {
            String nextToken = stringTokenizer.nextToken();
            com.amazon.a.a.o.c cVar = f11251d;
            cVar.a("Field: " + nextToken);
            int indexOf = nextToken.indexOf(f11249b);
            if (indexOf == -1) {
                throw com.amazon.a.a.o.b.a.b.d();
            }
            String substring = nextToken.substring(0, indexOf);
            String substring2 = nextToken.substring(indexOf + 1);
            cVar.a("FieldName: " + substring);
            cVar.a("FieldValue: " + substring2);
            this.f11252e.put(substring, substring2);
        }
    }

    public String toString() {
        return "Signed Token: " + this.f11252e;
    }

    public String a(String str) {
        com.amazon.a.a.o.a.a.a((Object) str, "key");
        return this.f11252e.get(str);
    }
}
