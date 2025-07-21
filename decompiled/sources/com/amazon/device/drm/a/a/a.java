package com.amazon.device.drm.a.a;

import android.app.Application;
import com.amazon.a.a.h.c;
import com.amazon.a.a.n.a.a.f;
import com.amazon.a.a.n.a.a.i;
import com.amazon.a.a.n.a.g;
import com.amazon.a.a.n.a.h;
import com.amazon.d.a.j;
import com.amazon.device.drm.LicensingService;
import com.amazon.device.drm.model.LicenseResponse;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class a extends h {

    /* renamed from: c, reason: collision with root package name */
    private static final String f11497c = "a";

    /* renamed from: d, reason: collision with root package name */
    private static final String f11498d = "get_license";

    /* renamed from: e, reason: collision with root package name */
    private static final String f11499e = "1.0";

    /* renamed from: b, reason: collision with root package name */
    @com.amazon.a.a.k.a
    c f11500b;

    /* renamed from: f, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private Application f11501f;

    /* renamed from: g, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.o.b.b f11502g;

    /* renamed from: com.amazon.device.drm.a.a.a$1, reason: invalid class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f11503a;

        static {
            int[] iArr = new int[g.values().length];
            f11503a = iArr;
            try {
                iArr[g.CLA_LICENSE_EXPIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11503a[g.SLA_NO_LICENSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11503a[g.CLA_NOT_ENTITLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11503a[g.CLA_NOT_LOGGED_IN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11503a[g.SLA_NO_CUSTOMER_ID.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11503a[g.CLA_LICENSE_INVALID.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11503a[g.CLA_NO_VALID_LICENSE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f11503a[g.VLA_NOT_LOGGED_IN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f11503a[g.VLIA_NOT_LOGGED_IN.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f11503a[g.CLA_NO_DEVICE_ID.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f11503a[g.SLA_NO_DEVICE_ID.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f11503a[g.CLA_NO_CONTENT_ID.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f11503a[g.CSA_INVALID_CHECKSUM.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f11503a[g.CSA_INVALID_SIGNATURE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f11503a[g.CSA_NO_CONTENT_METADATA.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f11503a[g.CSA_CONTENT_MD_PKG_NAME_MISMATCH.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f11503a[g.CLA_NULL_LOCKER_RESPONSE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public a(com.amazon.device.drm.a.b.b bVar) {
        super(bVar, f11498d, "1.0", bVar.d().toString(), LicensingService.SDK_VERSION);
        b(false);
    }

    private void a(LicenseResponse.RequestStatus requestStatus) {
        com.amazon.device.drm.a.b.b bVar = (com.amazon.device.drm.a.b.b) j();
        bVar.a().a(new com.amazon.device.drm.a.c.a().a(bVar.d()).a(requestStatus).a());
    }

    @Override // com.amazon.a.a.n.a.h
    public boolean b(j jVar) {
        String str = f11497c;
        com.amazon.device.drm.a.e.b.a(str, "onResult: result = " + jVar);
        try {
            com.amazon.a.b.g gVar = new com.amazon.a.b.g(jVar.b());
            if (!a(gVar, a(gVar))) {
                return false;
            }
            com.amazon.device.drm.a.e.b.a(str, "License Verification was successful");
            this.f11500b.a(new com.amazon.a.b.b.a());
            a(LicenseResponse.RequestStatus.LICENSED);
            return true;
        } catch (Exception unused) {
            com.amazon.device.drm.a.e.b.a(f11497c, "License not returned by Appstore");
            a(LicenseResponse.RequestStatus.NOT_LICENSED);
            return false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0014. Please report as an issue. */
    @Override // com.amazon.a.a.n.a.h
    public void c(com.amazon.a.a.d.b bVar) {
        String str;
        String a6 = bVar.a();
        if (!f.f11048a.equals(a6)) {
            if (com.amazon.a.a.n.a.a.a.f11041a.equals(a6)) {
                com.amazon.device.drm.a.e.b.a(f11497c, "AuthToken verification failed");
                a(LicenseResponse.RequestStatus.ERROR_VERIFICATION);
                return;
            } else {
                if (com.amazon.a.a.o.b.a.a.f11230a.equals(a6)) {
                    com.amazon.device.drm.a.e.b.a(f11497c, "Unable to load the public key from the apk");
                    a(LicenseResponse.RequestStatus.ERROR_INVALID_LICENSING_KEYS);
                    return;
                }
                return;
            }
        }
        String b6 = bVar.b();
        switch (b6.hashCode()) {
            case -1023164887:
                if (b6.equals("INVALID_CONTENT_ID")) {
                    com.amazon.device.drm.a.e.b.a(f11497c, "Unable to verify Application metadata");
                    a(LicenseResponse.RequestStatus.ERROR_VERIFICATION);
                    return;
                }
                com.amazon.device.drm.a.e.b.a(f11497c, "No valid failure reason found. Defaulting to UNKNOWN_ERROR");
                a(LicenseResponse.RequestStatus.UNKNOWN_ERROR);
                return;
            case 375605247:
                str = "NO_INTERNET";
                b6.equals(str);
                com.amazon.device.drm.a.e.b.a(f11497c, "No valid failure reason found. Defaulting to UNKNOWN_ERROR");
                a(LicenseResponse.RequestStatus.UNKNOWN_ERROR);
                return;
            case 433141802:
                str = "UNKNOWN";
                b6.equals(str);
                com.amazon.device.drm.a.e.b.a(f11497c, "No valid failure reason found. Defaulting to UNKNOWN_ERROR");
                a(LicenseResponse.RequestStatus.UNKNOWN_ERROR);
                return;
            case 2056521148:
                str = "INTERNAL_SERVICE_ERROR";
                b6.equals(str);
                com.amazon.device.drm.a.e.b.a(f11497c, "No valid failure reason found. Defaulting to UNKNOWN_ERROR");
                a(LicenseResponse.RequestStatus.UNKNOWN_ERROR);
                return;
            default:
                com.amazon.device.drm.a.e.b.a(f11497c, "No valid failure reason found. Defaulting to UNKNOWN_ERROR");
                a(LicenseResponse.RequestStatus.UNKNOWN_ERROR);
                return;
        }
    }

    @Override // com.amazon.a.a.n.a.a
    public boolean f() {
        return false;
    }

    private boolean a(com.amazon.a.b.g gVar, com.amazon.a.b.b bVar) {
        if (bVar == null) {
            return false;
        }
        try {
            com.amazon.device.drm.a.e.a.a(gVar, bVar, this.f11501f);
            return true;
        } catch (com.amazon.a.b.a.a e6) {
            if (e6.d().a(com.amazon.a.b.h.EXPIRATION)) {
                com.amazon.device.drm.a.e.b.a(f11497c, "License has expired");
                this.f11500b.a(a((com.amazon.a.a.d.b) e6));
                a(LicenseResponse.RequestStatus.EXPIRED);
            } else {
                com.amazon.device.drm.a.e.b.a(f11497c, "License Verification failed" + e6.d());
                this.f11500b.a(a((com.amazon.a.a.d.b) e6));
                a(LicenseResponse.RequestStatus.ERROR_VERIFICATION);
            }
            return false;
        }
    }

    @Override // com.amazon.a.a.n.a.h
    public void b(com.amazon.d.a.h hVar) {
        String str;
        try {
            str = hVar.g();
            try {
                g valueOf = g.valueOf(str);
                switch (AnonymousClass1.f11503a[valueOf.ordinal()]) {
                    case 1:
                        com.amazon.device.drm.a.e.b.a(f11497c, String.format("License has expired: %s", valueOf.name()));
                        a(LicenseResponse.RequestStatus.EXPIRED);
                        return;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        com.amazon.device.drm.a.e.b.a(f11497c, String.format("Customer is not licensed to use the Application: %s", valueOf.name()));
                        a(LicenseResponse.RequestStatus.NOT_LICENSED);
                        return;
                    case 10:
                    case 11:
                        com.amazon.device.drm.a.e.b.a(f11497c, String.format("Unable to verify Device info: %s", valueOf.name()));
                        a(LicenseResponse.RequestStatus.ERROR_VERIFICATION);
                        return;
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                        com.amazon.device.drm.a.e.b.a(f11497c, String.format("Unable to verify Application metadata: %s", valueOf.name()));
                        a(LicenseResponse.RequestStatus.ERROR_VERIFICATION);
                        return;
                    default:
                        com.amazon.device.drm.a.e.b.a(f11497c, "No valid failure reason found. Defaulting to UNKNOWN_ERROR");
                        a(LicenseResponse.RequestStatus.UNKNOWN_ERROR);
                        return;
                }
            } catch (Exception unused) {
                com.amazon.device.drm.a.e.b.a(f11497c, "Unknown Reason of failure" + str);
                this.f11500b.a(a((com.amazon.a.a.d.b) new i(f11498d)));
            }
        } catch (Exception unused2) {
            str = "Unknown";
        }
    }

    private com.amazon.a.b.b a(com.amazon.a.b.g gVar) {
        try {
            return com.amazon.device.drm.a.e.a.a(gVar, this.f11502g.a());
        } catch (com.amazon.a.a.o.b.a.a e6) {
            com.amazon.device.drm.a.e.b.a(f11497c, "Unable to load the public key from the apk");
            a(LicenseResponse.RequestStatus.ERROR_INVALID_LICENSING_KEYS);
            this.f11500b.a(a((com.amazon.a.a.d.b) e6));
            return null;
        } catch (com.amazon.a.a.o.b.a.b e7) {
            com.amazon.device.drm.a.e.b.a(f11497c, "Unable to parse the license returned by Appstore Client");
            a(LicenseResponse.RequestStatus.ERROR_VERIFICATION);
            this.f11500b.a(a((com.amazon.a.a.d.b) e7));
            return null;
        } catch (com.amazon.a.a.o.b.a.c e8) {
            com.amazon.device.drm.a.e.b.a(f11497c, "Unable to decode the license with the public key provided by the developer");
            a(LicenseResponse.RequestStatus.ERROR_INVALID_LICENSING_KEYS);
            this.f11500b.a(a((com.amazon.a.a.d.b) e8));
            return null;
        } catch (Exception unused) {
            com.amazon.device.drm.a.e.b.a(f11497c, "Content License returned from Appstore is not in proper format");
            a(LicenseResponse.RequestStatus.ERROR_VERIFICATION);
            return null;
        }
    }
}
