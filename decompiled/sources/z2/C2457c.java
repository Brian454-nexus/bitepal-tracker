package z2;

import android.content.Context;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

/* renamed from: z2.c, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2457c {

    /* renamed from: a, reason: collision with root package name */
    public final String f21685a;

    /* renamed from: b, reason: collision with root package name */
    public final KeyGenParameterSpec f21686b;

    /* renamed from: z2.c$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f21687a;

        /* renamed from: b, reason: collision with root package name */
        public KeyGenParameterSpec f21688b;

        /* renamed from: c, reason: collision with root package name */
        public b f21689c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f21690d;

        /* renamed from: e, reason: collision with root package name */
        public int f21691e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f21692f;

        /* renamed from: g, reason: collision with root package name */
        public final Context f21693g;

        /* renamed from: z2.c$a$a, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static class C0281a {

            /* renamed from: z2.c$a$a$a, reason: collision with other inner class name */
            /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
            public static class C0282a {
                public static void a(KeyGenParameterSpec.Builder builder) {
                    builder.setIsStrongBoxBacked(true);
                }
            }

            /* renamed from: z2.c$a$a$b */
            /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
            public static class b {
                public static void a(KeyGenParameterSpec.Builder builder, int i6, int i7) {
                    builder.setUserAuthenticationParameters(i6, i7);
                }
            }

            public static C2457c a(a aVar) {
                b bVar = aVar.f21689c;
                if (bVar == null && aVar.f21688b == null) {
                    throw new IllegalArgumentException("build() called before setKeyGenParameterSpec or setKeyScheme.");
                }
                if (bVar == b.AES256_GCM) {
                    KeyGenParameterSpec.Builder keySize = new KeyGenParameterSpec.Builder(aVar.f21687a, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256);
                    if (aVar.f21690d) {
                        keySize.setUserAuthenticationRequired(true);
                        if (Build.VERSION.SDK_INT >= 30) {
                            b.a(keySize, aVar.f21691e, 3);
                        } else {
                            keySize.setUserAuthenticationValidityDurationSeconds(aVar.f21691e);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 28 && aVar.f21692f && aVar.f21693g.getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore")) {
                        C0282a.a(keySize);
                    }
                    aVar.f21688b = keySize.build();
                }
                KeyGenParameterSpec keyGenParameterSpec = aVar.f21688b;
                if (keyGenParameterSpec != null) {
                    return new C2457c(e.c(keyGenParameterSpec), aVar.f21688b);
                }
                throw new NullPointerException("KeyGenParameterSpec was null after build() check");
            }

            public static String b(KeyGenParameterSpec keyGenParameterSpec) {
                return keyGenParameterSpec.getKeystoreAlias();
            }
        }

        public a(Context context) {
            this(context, "_androidx_security_master_key_");
        }

        public C2457c a() {
            return C0281a.a(this);
        }

        public a b(KeyGenParameterSpec keyGenParameterSpec) {
            if (this.f21689c != null) {
                throw new IllegalArgumentException("KeyGenParamSpec set after setting a KeyScheme");
            }
            if (this.f21687a.equals(C0281a.b(keyGenParameterSpec))) {
                this.f21688b = keyGenParameterSpec;
                return this;
            }
            throw new IllegalArgumentException("KeyGenParamSpec's key alias does not match provided alias (" + this.f21687a + " vs " + C0281a.b(keyGenParameterSpec));
        }

        public a(Context context, String str) {
            this.f21693g = context.getApplicationContext();
            this.f21687a = str;
        }
    }

    /* renamed from: z2.c$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public enum b {
        AES256_GCM
    }

    public C2457c(String str, Object obj) {
        this.f21685a = str;
        this.f21686b = (KeyGenParameterSpec) obj;
    }

    public String a() {
        return this.f21685a;
    }

    public boolean b() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return keyStore.containsAlias(this.f21685a);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
            return false;
        }
    }

    public String toString() {
        return "MasterKey{keyAlias=" + this.f21685a + ", isKeyStoreBacked=" + b() + "}";
    }
}
