package com.amazon.device.simplesignin.a.c;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.amazon.device.simplesignin.ISimpleSignInResponseHandler;
import com.amazon.device.simplesignin.SimpleSignInService;
import com.amazon.device.simplesignin.a.c;
import com.amazon.device.simplesignin.model.RequestId;
import com.amazon.device.simplesignin.model.RequestStatus;
import com.amazon.device.simplesignin.model.request.LinkUserAccountRequest;
import com.amazon.device.simplesignin.model.request.SSIEventRequest;
import com.amazon.device.simplesignin.model.response.GetUserAndLinksResponse;
import com.amazon.device.simplesignin.model.response.LinkUserAccountResponse;
import com.amazon.device.simplesignin.model.response.RecordMetricsEventResponse;
import com.amazon.device.simplesignin.model.response.ShowLoginSelectionResponse;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class b implements com.amazon.device.simplesignin.a.b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f11795a = "b";

    /* renamed from: b, reason: collision with root package name */
    private static final String f11796b = "com.amazon.sdktestclient";

    /* renamed from: c, reason: collision with root package name */
    private static final String f11797c = "com.amazon.sdktestclient.command.CommandBroker";

    private RecordMetricsEventResponse b(Intent intent) {
        RecordMetricsEventResponse recordMetricsEventResponse = new RecordMetricsEventResponse();
        try {
            JSONObject jSONObject = new JSONObject(intent.getStringExtra("recordMetricsEventOutput"));
            recordMetricsEventResponse.setRequestId(new RequestId(jSONObject.getString(com.amazon.a.a.o.b.f11172B)));
            RequestStatus valueOf = RequestStatus.valueOf(jSONObject.getString("status"));
            recordMetricsEventResponse.setRequestStatus(valueOf);
            RequestStatus.SUCCESSFUL.equals(valueOf);
            return recordMetricsEventResponse;
        } catch (JSONException e6) {
            Log.e(f11795a, "Exception while parsing RecordMetricsEvent response", e6);
            return recordMetricsEventResponse;
        }
    }

    private LinkUserAccountResponse c(Intent intent) {
        JSONObject jSONObject;
        RequestStatus valueOf;
        LinkUserAccountResponse linkUserAccountResponse = new LinkUserAccountResponse();
        try {
            String stringExtra = intent.getStringExtra("linkUserAccountOutput");
            Log.i(f11795a, "SimpleSignInService : linkUserAccountOutput " + stringExtra);
            jSONObject = new JSONObject(stringExtra);
            linkUserAccountResponse.setRequestId(new RequestId(jSONObject.getString(com.amazon.a.a.o.b.f11172B)));
            valueOf = RequestStatus.valueOf(jSONObject.getString("status"));
            linkUserAccountResponse.setRequestStatus(valueOf);
        } catch (JSONException e6) {
            Log.e(f11795a, "Exception while parsing LinkUserAccount response", e6);
        }
        if (!RequestStatus.SUCCESSFUL.equals(valueOf)) {
            return linkUserAccountResponse;
        }
        String string = jSONObject.getString(com.amazon.device.simplesignin.a.a.a.f11724m);
        if (!LinkUserAccountResponse.SuccessCode.ConsentDenied.equals(LinkUserAccountResponse.SuccessCode.valueOf(string))) {
            linkUserAccountResponse.setLinkId(jSONObject.getString(com.amazon.device.simplesignin.a.a.a.f11722k));
        }
        linkUserAccountResponse.setSuccessCode(LinkUserAccountResponse.SuccessCode.valueOf(string));
        return linkUserAccountResponse;
    }

    private ShowLoginSelectionResponse d(Intent intent) {
        ShowLoginSelectionResponse showLoginSelectionResponse = new ShowLoginSelectionResponse();
        try {
            String stringExtra = intent.getStringExtra("showLoginSelectionOutput");
            Log.i(f11795a, "SimpleSignInService : loginSelectionOutput " + stringExtra);
            JSONObject jSONObject = new JSONObject(stringExtra);
            showLoginSelectionResponse.setRequestId(new RequestId(jSONObject.getString(com.amazon.a.a.o.b.f11172B)));
            RequestStatus valueOf = RequestStatus.valueOf(jSONObject.getString("status"));
            showLoginSelectionResponse.setRequestStatus(valueOf);
            if (RequestStatus.SUCCESSFUL.equals(valueOf)) {
                String string = jSONObject.getString(com.amazon.device.simplesignin.a.a.a.f11728q);
                ShowLoginSelectionResponse.UserSelection userSelection = ShowLoginSelectionResponse.UserSelection.LoginSelected;
                if (!userSelection.name().equals(string)) {
                    showLoginSelectionResponse.setUserSelection(ShowLoginSelectionResponse.UserSelection.ManualSignIn);
                    return showLoginSelectionResponse;
                }
                String string2 = jSONObject.getString(com.amazon.device.simplesignin.a.a.a.f11729r);
                if (string2 != null) {
                    showLoginSelectionResponse.setUserSelection(userSelection);
                    showLoginSelectionResponse.setLinkId(string2);
                    return showLoginSelectionResponse;
                }
            }
        } catch (JSONException e6) {
            Log.e(f11795a, "Exception while parsing LinkUserAccount response", e6);
            showLoginSelectionResponse.setUserSelection(ShowLoginSelectionResponse.UserSelection.ManualSignIn);
        }
        return showLoginSelectionResponse;
    }

    @Override // com.amazon.device.simplesignin.a.b
    public void a(RequestId requestId, String str) {
        Log.i(f11795a, "Handling getUserAndLinks sandbox request.");
        Context c6 = c.a().c();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.amazon.a.a.o.b.f11172B, requestId);
            jSONObject.put("packageName", c6.getPackageName());
            jSONObject.put(com.amazon.a.a.o.b.f11179I, SimpleSignInService.SDK_VERSION);
            jSONObject.put(com.amazon.device.simplesignin.a.a.a.f11712a, str);
            Bundle bundle = new Bundle();
            bundle.putString("getUserAndLinksInput", jSONObject.toString());
            Intent a6 = a("com.amazon.testclient.simplesignin.getUserAndLinks");
            a6.addFlags(268435456);
            a6.putExtras(bundle);
            c6.startService(a6);
        } catch (JSONException unused) {
            Log.e(f11795a, "Error in preparing getUserAndLinksInput.");
        }
    }

    @Override // com.amazon.device.simplesignin.a.b
    public void a(RequestId requestId, LinkUserAccountRequest linkUserAccountRequest) {
        Log.i(f11795a, "Handling linkUserAccount sandbox request.");
        Context c6 = c.a().c();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.amazon.a.a.o.b.f11172B, requestId);
            jSONObject.put("packageName", c6.getPackageName());
            jSONObject.put(com.amazon.a.a.o.b.f11179I, SimpleSignInService.SDK_VERSION);
            jSONObject.put(com.amazon.device.simplesignin.a.a.a.f11715d, linkUserAccountRequest.getPartnerUserId());
            jSONObject.put(com.amazon.device.simplesignin.a.a.a.f11712a, linkUserAccountRequest.getIdentityProviderName());
            jSONObject.put(com.amazon.device.simplesignin.a.a.a.f11716e, linkUserAccountRequest.getUserLoginName());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("token", linkUserAccountRequest.getLinkToken().getToken());
            jSONObject2.put(com.amazon.device.simplesignin.a.a.a.f11704E, linkUserAccountRequest.getLinkToken().getSchema());
            jSONObject.put(com.amazon.device.simplesignin.a.a.a.f11718g, jSONObject2.toString());
            jSONObject.put(com.amazon.device.simplesignin.a.a.a.f11717f, linkUserAccountRequest.getLinkSigningKey());
            Bundle bundle = new Bundle();
            bundle.putString("linkUserAccountInput", jSONObject.toString());
            Intent a6 = a("com.amazon.testclient.simplesignin.linkUserAccount");
            a6.addFlags(268435456);
            a6.putExtras(bundle);
            c6.startService(a6);
        } catch (JSONException e6) {
            Log.e(f11795a, "Unable to create linkToken json");
            throw new IllegalStateException("Unable to create linkToken json", e6);
        }
    }

    @Override // com.amazon.device.simplesignin.a.b
    public void a(RequestId requestId, Map<String, String> map) {
        Log.i(f11795a, "Handling showLoginSelection sandbox request.");
        Context c6 = c.a().c();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.amazon.a.a.o.b.f11172B, requestId);
            jSONObject.put("packageName", c6.getPackageName());
            jSONObject.put(com.amazon.a.a.o.b.f11179I, SimpleSignInService.SDK_VERSION);
            Intent a6 = a("com.amazon.testclient.simplesignin.showLoginSelection");
            a6.putExtra("showLoginSelectionInput", jSONObject.toString());
            a6.putExtra(com.amazon.device.simplesignin.a.a.a.f11726o, new HashMap(map));
            a6.addFlags(268435456);
            c6.startService(a6);
        } catch (JSONException e6) {
            Log.e(f11795a, "Unable to create showLoginSelection Input");
            throw new IllegalStateException("Unable to create showLoginSelection input json", e6);
        }
    }

    @Override // com.amazon.device.simplesignin.a.b
    public void a(RequestId requestId, SSIEventRequest sSIEventRequest) {
        Context c6 = c.a().c();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.amazon.device.simplesignin.a.a.a.f11731t, sSIEventRequest.getEvent().toString());
            jSONObject.put(com.amazon.device.simplesignin.a.a.a.f11732u, sSIEventRequest.getEpochTimestamp());
            if (sSIEventRequest.getFailureReason() != null) {
                jSONObject.put(com.amazon.device.simplesignin.a.a.a.f11733v, sSIEventRequest.getFailureReason().toString());
            }
            Intent a6 = a("com.amazon.testclient.simplesignin.recordmetricsevent");
            a6.addFlags(268435456);
            c6.startService(a6);
        } catch (JSONException e6) {
            Log.e(f11795a, "Error in preparing recordMetricEventInput for requestId: " + requestId, e6);
        }
    }

    @Override // com.amazon.device.simplesignin.a.b
    public void a(Context context, Intent intent) {
        intent.setComponent(new ComponentName(f11796b, f11797c));
        try {
            String string = intent.getExtras().getString("responseType");
            if ("com.amazon.testclient.simplesignin.getUserAndLinks".equals(string)) {
                a(a(intent));
                return;
            }
            if ("com.amazon.testclient.simplesignin.linkUserAccount".equals(string)) {
                a(c(intent));
                return;
            }
            if ("com.amazon.testclient.simplesignin.showLoginSelection".equals(string)) {
                a(d(intent));
            } else if ("com.amazon.testclient.simplesignin.recordmetricsevent".equals(string)) {
                a(b(intent));
            } else {
                Log.d(f11795a, "Unknown response type received.");
            }
        } catch (Exception e6) {
            Log.e(f11795a, "Error handling response.", e6);
        }
    }

    private GetUserAndLinksResponse a(Intent intent) {
        JSONObject jSONObject;
        RequestStatus valueOf;
        GetUserAndLinksResponse getUserAndLinksResponse = new GetUserAndLinksResponse();
        try {
            jSONObject = new JSONObject(intent.getStringExtra("getUserAndLinksOutput"));
            getUserAndLinksResponse.setRequestId(new RequestId(jSONObject.getString(com.amazon.a.a.o.b.f11172B)));
            valueOf = RequestStatus.valueOf(jSONObject.getString("status"));
            getUserAndLinksResponse.setRequestStatus(valueOf);
        } catch (JSONException e6) {
            Log.e(f11795a, "Exception while parsing GetUserAndLinks response", e6);
        }
        if (!RequestStatus.SUCCESSFUL.equals(valueOf)) {
            return getUserAndLinksResponse;
        }
        String string = jSONObject.getString(com.amazon.device.simplesignin.a.a.a.f11713b);
        getUserAndLinksResponse.setAmazonUserId(string);
        getUserAndLinksResponse.setLinks(com.amazon.device.simplesignin.a.d.b.a(string, jSONObject.getString(com.amazon.device.simplesignin.a.a.a.f11714c)));
        return getUserAndLinksResponse;
    }

    private Intent a(String str) {
        Intent intent = new Intent(str);
        intent.setComponent(new ComponentName(f11796b, f11797c));
        return intent;
    }

    private void a(final Object obj) {
        Context c6 = c.a().c();
        final ISimpleSignInResponseHandler d6 = c.a().d();
        if (c6 != null && obj != null) {
            new Handler(c6.getMainLooper()).post(new Runnable() { // from class: com.amazon.device.simplesignin.a.c.b.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Object obj2 = obj;
                        if (obj2 instanceof GetUserAndLinksResponse) {
                            d6.onGetUserAndLinksResponse((GetUserAndLinksResponse) obj2);
                            return;
                        }
                        if (obj2 instanceof LinkUserAccountResponse) {
                            d6.onLinkUserAccountResponse((LinkUserAccountResponse) obj2);
                            return;
                        }
                        if (obj2 instanceof ShowLoginSelectionResponse) {
                            d6.onShowLoginSelectionResponse((ShowLoginSelectionResponse) obj2);
                            return;
                        }
                        if (obj2 instanceof RecordMetricsEventResponse) {
                            d6.onRecordMetricsEventResponse((RecordMetricsEventResponse) obj2);
                            return;
                        }
                        Log.e(b.f11795a, "Unknown response type:" + obj.getClass().getName());
                    } catch (Exception e6) {
                        Log.e(b.f11795a, "Error in sendResponse: " + e6);
                    }
                }
            });
            return;
        }
        Log.i(f11795a, "ISimpleSignInResponseHandler is not set. Dropping response: " + obj);
    }
}
