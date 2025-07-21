package com.amazon.a.a.o.b;

import android.app.Application;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class d implements b {

    /* renamed from: a, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f11239a = new com.amazon.a.a.o.c("DataAuthenticationKeyLoaderV3");

    /* renamed from: b, reason: collision with root package name */
    private static final String f11240b = "AppstoreAuthenticationKey.pem";

    /* renamed from: c, reason: collision with root package name */
    private static final String f11241c = "-----BEGIN PUBLIC KEY-----";

    /* renamed from: d, reason: collision with root package name */
    private static final String f11242d = "-----END PUBLIC KEY-----";

    /* renamed from: e, reason: collision with root package name */
    private static final String f11243e = "RSA";

    /* renamed from: f, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private Application f11244f;

    /* renamed from: g, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.m.c f11245g;

    private PublicKey b() {
        if (com.amazon.a.a.o.c.f11253a) {
            f11239a.a("Checking KiwiDataStore for key...");
        }
        PublicKey publicKey = (PublicKey) this.f11245g.a(com.amazon.a.a.m.c.f11024a);
        if (com.amazon.a.a.o.c.f11253a) {
            com.amazon.a.a.o.c cVar = f11239a;
            StringBuilder sb = new StringBuilder();
            sb.append("Key was cached: ");
            sb.append(publicKey != null);
            cVar.a(sb.toString());
        }
        return publicKey;
    }

    private PublicKey c() {
        if (com.amazon.a.a.o.c.f11253a) {
            f11239a.a("Loading authentication key from apk...");
        }
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(this.f11244f.getAssets().open(f11240b)));
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine != null) {
                            sb.append(readLine);
                        } else {
                            try {
                                break;
                            } catch (IOException e6) {
                                if (com.amazon.a.a.o.c.f11253a) {
                                    f11239a.b("Failed to close stream", e6);
                                }
                            }
                        }
                    } catch (Exception e7) {
                        e = e7;
                        f11239a.b("Unable to load authentication Key", e);
                        throw com.amazon.a.a.o.b.a.a.d();
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e8) {
                                if (com.amazon.a.a.o.c.f11253a) {
                                    f11239a.b("Failed to close stream", e8);
                                }
                            }
                        }
                        throw th;
                    }
                }
                bufferedReader2.close();
                return a(sb.toString());
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e9) {
            e = e9;
        }
    }

    @Override // com.amazon.a.a.o.b.b
    public PublicKey a() {
        if (com.amazon.a.a.o.c.f11253a) {
            f11239a.a("Loading data authentication key...");
        }
        PublicKey b6 = b();
        if (b6 != null) {
            return b6;
        }
        PublicKey c6 = c();
        a(c6);
        return c6;
    }

    private void a(PublicKey publicKey) {
        if (com.amazon.a.a.o.c.f11253a) {
            f11239a.a("Placing auth key into storage");
        }
        this.f11245g.a(com.amazon.a.a.m.c.f11024a, (String) publicKey);
    }

    public PublicKey a(String str) {
        try {
            return KeyFactory.getInstance(f11243e).generatePublic(new X509EncodedKeySpec(com.amazon.c.a.a.c.a(str.replace(f11241c, "").replace(f11242d, ""))));
        } catch (Exception e6) {
            throw com.amazon.a.a.o.b.a.a.a((Throwable) e6);
        }
    }
}
