package com.amazon.device.drm.a.a;

import com.amazon.a.a.n.a.h;
import com.amazon.device.drm.model.LicenseResponse;
import com.amazon.device.drm.model.RequestId;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class b extends com.amazon.device.drm.a.b.b {

    /* renamed from: c, reason: collision with root package name */
    private static final String f11504c = "b";

    public b(RequestId requestId) {
        super(requestId);
        a((h) new a(this));
    }

    @Override // com.amazon.device.drm.a.b.b, com.amazon.a.a.j.a
    public void b() {
        a((LicenseResponse) a().b());
    }

    @Override // com.amazon.device.drm.a.b.b, com.amazon.a.a.j.a
    public void c() {
        LicenseResponse licenseResponse = (LicenseResponse) a().b();
        if (licenseResponse == null) {
            licenseResponse = new com.amazon.device.drm.a.c.a().a(d()).a(LicenseResponse.RequestStatus.UNKNOWN_ERROR).a();
        }
        com.amazon.device.drm.a.e.b.b(f11504c, "LicenseRequest failed with error: " + licenseResponse.getRequestStatus());
        a(licenseResponse);
    }
}
