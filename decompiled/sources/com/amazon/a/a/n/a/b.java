package com.amazon.a.a.n.a;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f11055a = new com.amazon.a.a.o.c("CommandResultVerifier");

    /* renamed from: b, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private Application f11056b;

    /* renamed from: c, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.o.b.b f11057c;

    private boolean b(String str, Signature signature) {
        boolean z6 = false;
        try {
            z6 = str.equals(a(signature));
            f11055a.a("Signature valid: " + z6);
            return z6;
        } catch (CertificateException unused) {
            f11055a.b("Failed to extract fingerprint from signature");
            return z6;
        }
    }

    public void a(String str, String str2) {
        if (com.amazon.a.a.o.c.f11253a) {
            f11055a.a("Verifying auth token: " + str);
        }
        for (Signature signature : a(str2).signatures) {
            if (a(str, signature)) {
                return;
            }
        }
        throw new com.amazon.a.a.n.a.a.a();
    }

    private X509Certificate b(Signature signature) {
        return (X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(signature.toByteArray()));
    }

    public boolean a(String str, List<String> list) {
        f11055a.a("checkSignatures(" + str + ", " + list);
        try {
            for (Signature signature : a(str).signatures) {
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    if (b(it.next(), signature)) {
                        return true;
                    }
                }
            }
        } catch (com.amazon.a.a.n.a.a.c e6) {
            f11055a.b("isPackageSignatureValid: caught exception while checking", e6);
        }
        return false;
    }

    private boolean a(String str, Signature signature) {
        try {
            return com.amazon.a.a.o.b.e.a(a(signature), str, this.f11057c.a());
        } catch (CertificateException unused) {
            if (!com.amazon.a.a.o.c.f11254b) {
                return false;
            }
            f11055a.b("Failed to extract fingerprint from signature: " + signature);
            return false;
        }
    }

    private PackageInfo a(String str) {
        try {
            return this.f11056b.getPackageManager().getPackageInfo(str, 64);
        } catch (PackageManager.NameNotFoundException e6) {
            f11055a.a("getPackageInfo() caught exception" + e6);
            throw new com.amazon.a.a.n.a.a.c();
        }
    }

    private String a(Signature signature) {
        return com.amazon.c.a.a.c.a(b(signature).getSignature());
    }
}
