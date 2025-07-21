package com.amazon.a.a.o.b;

import android.app.Application;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class c implements b {

    /* renamed from: a, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f11234a = new com.amazon.a.a.o.c("DataAuthenticationKeyLoaderV2");

    /* renamed from: b, reason: collision with root package name */
    private static final String f11235b = "kiwi";

    /* renamed from: c, reason: collision with root package name */
    private static final int f11236c = 0;

    /* renamed from: d, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private Application f11237d;

    /* renamed from: e, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.m.c f11238e;

    private PublicKey b() {
        if (com.amazon.a.a.o.c.f11253a) {
            f11234a.a("Checking KiwiDataStore for key...");
        }
        PublicKey publicKey = (PublicKey) this.f11238e.a(com.amazon.a.a.m.c.f11024a);
        if (com.amazon.a.a.o.c.f11253a) {
            com.amazon.a.a.o.c cVar = f11234a;
            StringBuilder sb = new StringBuilder();
            sb.append("Key was cached: ");
            sb.append(publicKey != null);
            cVar.a(sb.toString());
        }
        return publicKey;
    }

    private PublicKey c() {
        if (com.amazon.a.a.o.c.f11253a) {
            f11234a.a("Loading authentication key from apk...");
        }
        CertPath d6 = d();
        if (a(d6)) {
            d(d6);
            return b(d6);
        }
        throw com.amazon.a.a.o.b.a.a.e();
    }

    private CertPath d() {
        JarFile e6 = e();
        return a(e6, a(e6));
    }

    private JarFile e() {
        String packageCodePath = this.f11237d.getPackageCodePath();
        if (com.amazon.a.a.o.c.f11253a) {
            f11234a.a("Opening apk: " + packageCodePath);
        }
        try {
            return new JarFile(packageCodePath, false);
        } catch (IOException e6) {
            throw com.amazon.a.a.o.b.a.a.a((Throwable) e6);
        }
    }

    private a f() {
        try {
            return new a();
        } catch (GeneralSecurityException e6) {
            throw com.amazon.a.a.o.b.a.a.b((Throwable) e6);
        }
    }

    @Override // com.amazon.a.a.o.b.b
    public PublicKey a() {
        if (com.amazon.a.a.o.c.f11253a) {
            f11234a.a("Loading data authentication key...");
        }
        PublicKey b6 = b();
        if (b6 != null) {
            return b6;
        }
        PublicKey c6 = c();
        a(c6);
        return c6;
    }

    private void d(CertPath certPath) {
        if (!f().a(certPath)) {
            throw com.amazon.a.a.o.b.a.a.f();
        }
    }

    private JarEntry a(JarFile jarFile) {
        if (com.amazon.a.a.o.c.f11253a) {
            f11234a.a("Searching for cert in apk");
        }
        Enumeration<JarEntry> entries = jarFile.entries();
        while (entries.hasMoreElements()) {
            JarEntry nextElement = entries.nextElement();
            if (!nextElement.isDirectory() && nextElement.getName().equals(f11235b)) {
                return nextElement;
            }
        }
        throw com.amazon.a.a.o.b.a.a.d();
    }

    private PublicKey b(CertPath certPath) {
        return c(certPath).getPublicKey();
    }

    private X509Certificate c(CertPath certPath) {
        return (X509Certificate) certPath.getCertificates().get(0);
    }

    private CertPath a(JarFile jarFile, JarEntry jarEntry) {
        try {
            if (com.amazon.a.a.o.c.f11253a) {
                f11234a.a("Extracting cert from entry: " + jarEntry.getName());
            }
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            if (com.amazon.a.a.o.c.f11253a) {
                f11234a.a("Generating certificates from entry input stream");
            }
            return certificateFactory.generateCertPath(a(certificateFactory.generateCertificates(jarFile.getInputStream(jarEntry))));
        } catch (Exception e6) {
            throw com.amazon.a.a.o.b.a.a.a((Throwable) e6);
        }
    }

    public List<? extends Certificate> a(Collection<? extends Certificate> collection) {
        return new ArrayList(collection);
    }

    private boolean a(CertPath certPath) {
        if (certPath == null || certPath.getCertificates().size() <= 0) {
            return false;
        }
        Certificate certificate = certPath.getCertificates().get(0);
        if (certificate instanceof X509Certificate) {
            String name = ((X509Certificate) certificate).getSubjectX500Principal().getName();
            if (com.amazon.a.a.o.c.f11253a) {
                f11234a.a("Kiwi Cert Details: " + name);
            }
            if (name.contains("O=Amazon.com\\, Inc.") && name.contains("C=US") && name.contains("ST=Washington") && name.contains("L=Seattle")) {
                return true;
            }
        }
        return false;
    }

    private void a(PublicKey publicKey) {
        if (com.amazon.a.a.o.c.f11253a) {
            f11234a.a("Placing auth key into storage");
        }
        this.f11238e.a(com.amazon.a.a.m.c.f11024a, (String) publicKey);
    }
}
