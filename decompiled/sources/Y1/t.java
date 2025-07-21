package Y1;

import E1.O;
import c1.AbstractC1119a;
import c1.AbstractC1133o;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f6490a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6491b;

    /* renamed from: c, reason: collision with root package name */
    public final O.a f6492c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6493d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f6494e;

    public t(boolean z6, String str, int i6, byte[] bArr, int i7, int i8, byte[] bArr2) {
        AbstractC1119a.a((bArr2 == null) ^ (i6 == 0));
        this.f6490a = z6;
        this.f6491b = str;
        this.f6493d = i6;
        this.f6494e = bArr2;
        this.f6492c = new O.a(a(str), bArr, i7, i8);
    }

    public static int a(String str) {
        if (str == null) {
            return 1;
        }
        char c6 = 65535;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals("cbc1")) {
                    c6 = 0;
                    break;
                }
                break;
            case 3046671:
                if (str.equals("cbcs")) {
                    c6 = 1;
                    break;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    c6 = 2;
                    break;
                }
                break;
            case 3049895:
                if (str.equals("cens")) {
                    c6 = 3;
                    break;
                }
                break;
        }
        switch (c6) {
            case 0:
            case 1:
                return 2;
            default:
                AbstractC1133o.h("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
            case 2:
            case 3:
                return 1;
        }
    }
}
