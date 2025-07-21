package com.amazon.device.drm.model;

import com.amazon.a.a.o.b;
import com.amazon.a.a.o.f;
import com.amazon.device.drm.a.c.a;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class LicenseResponse {
    private static final String REQUEST_ID = "REQUEST_ID";
    private static final String REQUEST_STATUS = "REQUEST_STATUS";
    private static final String TO_STRING_FORMAT = "LicenseResponse: {requestId: \"%s\", requestStatus: \"%s\"}";
    private final RequestId requestId;
    private final RequestStatus requestStatus;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public enum RequestStatus {
        LICENSED,
        NOT_LICENSED,
        ERROR_VERIFICATION,
        ERROR_INVALID_LICENSING_KEYS,
        EXPIRED,
        UNKNOWN_ERROR
    }

    public LicenseResponse(a aVar) {
        f.a(aVar.b(), b.f11172B);
        f.a(aVar.c(), b.f11173C);
        this.requestId = aVar.b();
        this.requestStatus = aVar.c();
    }

    public RequestId getRequestId() {
        return this.requestId;
    }

    public RequestStatus getRequestStatus() {
        return this.requestStatus;
    }

    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(REQUEST_STATUS, this.requestStatus);
        jSONObject.put(REQUEST_ID, this.requestId);
        return jSONObject;
    }

    public String toString() {
        RequestId requestId = this.requestId;
        RequestStatus requestStatus = this.requestStatus;
        return String.format(TO_STRING_FORMAT, requestId, requestStatus != null ? requestStatus.toString() : "null");
    }
}
