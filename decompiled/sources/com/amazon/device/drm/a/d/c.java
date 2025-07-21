package com.amazon.device.drm.a.d;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.amazon.a.a.o.f;
import com.amazon.device.drm.LicensingListener;
import com.amazon.device.drm.LicensingService;
import com.amazon.device.drm.a.d;
import com.amazon.device.drm.model.LicenseResponse;
import com.amazon.device.drm.model.RequestId;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class c implements com.amazon.device.drm.a.c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f11528a = "c";

    /* renamed from: b, reason: collision with root package name */
    private static final String f11529b = "com.amazon.sdktestclient";

    /* renamed from: c, reason: collision with root package name */
    private static final String f11530c = "com.amazon.sdktestclient.command.CommandBroker";

    @Override // com.amazon.device.drm.a.c
    public void a(RequestId requestId) {
        com.amazon.device.drm.a.e.b.a(f11528a, "sendGetLicenseRequest");
        try {
            Context c6 = d.d().c();
            Bundle bundle = new Bundle();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.amazon.a.a.o.b.f11172B, requestId);
            jSONObject.put("packageName", c6.getPackageName());
            jSONObject.put(com.amazon.a.a.o.b.f11179I, LicensingService.SDK_VERSION);
            bundle.putString("getLicenseInput", jSONObject.toString());
            Intent a6 = a("com.amazon.testclient.drm.getLicense");
            a6.addFlags(268435456);
            a6.putExtras(bundle);
            c6.startService(a6);
        } catch (JSONException unused) {
            com.amazon.device.drm.a.e.b.b(f11528a, "Error in sendGetUserDataRequest.");
        }
    }

    private Intent a(String str) {
        Intent intent = new Intent(str);
        intent.setComponent(new ComponentName(f11529b, f11530c));
        return intent;
    }

    @Override // com.amazon.device.drm.a.c
    public void a(Context context, Intent intent) {
        com.amazon.device.drm.a.e.b.a(f11528a, "handleResponse");
        intent.setComponent(new ComponentName(f11529b, f11530c));
        try {
            if (intent.getExtras().getString("responseType").equalsIgnoreCase("com.amazon.testclient.drm.getLicense")) {
                a(a(intent));
            }
        } catch (Exception e6) {
            Log.e(f11528a, "Error handling response.", e6);
        }
    }

    private LicenseResponse a(Intent intent) {
        RequestId requestId;
        LicenseResponse.RequestStatus requestStatus = LicenseResponse.RequestStatus.UNKNOWN_ERROR;
        try {
            JSONObject jSONObject = new JSONObject(intent.getStringExtra("getLicenseOutput"));
            requestStatus = LicenseResponse.RequestStatus.valueOf(jSONObject.optString("status"));
            requestId = RequestId.fromString(jSONObject.optString(com.amazon.a.a.o.b.f11172B));
        } catch (Exception e6) {
            Log.e(f11528a, "Error parsing getLicense response", e6);
            requestId = null;
        }
        return new com.amazon.device.drm.a.c.a().a(requestId).a(requestStatus).a();
    }

    public void a(final Object obj) {
        f.a(obj, "response");
        Context c6 = d.d().c();
        final LicensingListener b6 = d.d().b();
        if (c6 != null && b6 != null) {
            new Handler(c6.getMainLooper()).post(new Runnable() { // from class: com.amazon.device.drm.a.d.c.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Object obj2 = obj;
                        if (obj2 instanceof LicenseResponse) {
                            b6.onLicenseCommandResponse((LicenseResponse) obj2);
                            return;
                        }
                        com.amazon.device.drm.a.e.b.b(c.f11528a, "Unknown response type:" + obj.getClass().getName());
                    } catch (Exception e6) {
                        com.amazon.device.drm.a.e.b.b(c.f11528a, "Error in sendResponse: " + e6);
                    }
                }
            });
            return;
        }
        com.amazon.device.drm.a.e.b.a(f11528a, "LicensingListener is not set. Dropping response: " + obj);
    }
}
