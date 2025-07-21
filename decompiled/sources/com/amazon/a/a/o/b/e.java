package com.amazon.a.a.o.b;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.Signature;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static final String f11246a = "SHA384withRSA";

    /* renamed from: b, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f11247b = new com.amazon.a.a.o.c("SignatureVerifier");

    public static boolean a(String str, String str2, PublicKey publicKey) {
        if (com.amazon.a.a.o.c.f11253a) {
            f11247b.a("Verifying signature of data: '" + str + "', signature: '" + str2 + "', with key: '" + publicKey.toString());
        }
        try {
            byte[] c6 = com.amazon.c.a.a.c.c(str2.getBytes());
            Signature signature = Signature.getInstance(f11246a);
            signature.initVerify(publicKey);
            signature.update(str.getBytes());
            return signature.verify(c6);
        } catch (IOException | GeneralSecurityException unused) {
            return false;
        }
    }
}
