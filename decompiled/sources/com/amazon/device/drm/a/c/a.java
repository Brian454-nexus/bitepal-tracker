package com.amazon.device.drm.a.c;

import com.amazon.device.drm.model.LicenseResponse;
import com.amazon.device.drm.model.RequestId;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private RequestId f11512a;

    /* renamed from: b, reason: collision with root package name */
    private LicenseResponse.RequestStatus f11513b;

    public LicenseResponse a() {
        return new LicenseResponse(this);
    }

    public RequestId b() {
        return this.f11512a;
    }

    public LicenseResponse.RequestStatus c() {
        return this.f11513b;
    }

    public a a(RequestId requestId) {
        this.f11512a = requestId;
        return this;
    }

    public a a(LicenseResponse.RequestStatus requestStatus) {
        this.f11513b = requestStatus;
        return this;
    }
}
