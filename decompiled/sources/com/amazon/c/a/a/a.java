package com.amazon.c.a.a;

import java.io.File;
import java.io.InputStream;
import java.security.CodeSigner;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Enumeration;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import kotlin.io.ConstantsKt;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f11371a = "com.amazon.content.id.";

    public static String a(JarFile jarFile) {
        String a6;
        if (jarFile != null) {
            Enumeration<JarEntry> entries = jarFile.entries();
            while (entries.hasMoreElements()) {
                JarEntry nextElement = entries.nextElement();
                if (!nextElement.isDirectory() && (a6 = a(nextElement.getName())) != null && a6.length() != 0) {
                    return a6;
                }
            }
            return null;
        }
        throw new IllegalArgumentException("apkSrc must not be null!");
    }

    public static boolean b(JarFile jarFile) {
        if (jarFile != null) {
            try {
                e(jarFile);
                return d(jarFile) != null;
            } catch (SecurityException unused) {
                return true;
            }
        }
        throw new IllegalArgumentException("apkSrc must not be null!");
    }

    private static Certificate c(JarFile jarFile) {
        CodeSigner[] d6 = d(jarFile);
        if (d6 == null || d6.length <= 0) {
            return null;
        }
        List<? extends Certificate> certificates = d6[0].getSignerCertPath().getCertificates();
        if (certificates.isEmpty()) {
            return null;
        }
        return certificates.get(0);
    }

    private static CodeSigner[] d(JarFile jarFile) {
        Enumeration<JarEntry> entries = jarFile.entries();
        CodeSigner[] codeSignerArr = null;
        while (entries.hasMoreElements() && (codeSignerArr = entries.nextElement().getCodeSigners()) == null) {
        }
        return codeSignerArr;
    }

    private static void e(JarFile jarFile) {
        Enumeration<JarEntry> entries = jarFile.entries();
        byte[] bArr = new byte[ConstantsKt.DEFAULT_BUFFER_SIZE];
        while (entries.hasMoreElements()) {
            InputStream inputStream = null;
            try {
                try {
                    inputStream = jarFile.getInputStream(entries.nextElement());
                    do {
                    } while (inputStream.read(bArr, 0, ConstantsKt.DEFAULT_BUFFER_SIZE) != -1);
                    inputStream.close();
                } catch (Exception e6) {
                    throw new b(e6);
                }
            } catch (Throwable th) {
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        }
    }

    public static byte[] b(String str) {
        if (str != null && str.length() != 0) {
            JarFile jarFile = new JarFile(str);
            try {
                e(jarFile);
                Certificate c6 = c(jarFile);
                if (c6 != null && (c6 instanceof X509Certificate)) {
                    return ((X509Certificate) c6).getSignature();
                }
                return null;
            } catch (SecurityException unused) {
                return null;
            }
        }
        throw new IllegalArgumentException("apkFileName cannot be null or empty!");
    }

    public static String a(String str) {
        if (str != null && str.length() != 0) {
            int indexOf = str.indexOf(f11371a);
            if (indexOf >= 0 && str.length() > 22) {
                return str.substring(indexOf + 22);
            }
            return null;
        }
        throw new IllegalArgumentException("name cannot be null or empty!");
    }

    public static boolean a(File file) {
        JarFile jarFile;
        JarFile jarFile2 = null;
        try {
            jarFile = new JarFile(file);
        } catch (Throwable th) {
            th = th;
        }
        try {
            boolean b6 = b(jarFile);
            jarFile.close();
            return b6;
        } catch (Throwable th2) {
            th = th2;
            jarFile2 = jarFile;
            jarFile2.close();
            throw th;
        }
    }
}
