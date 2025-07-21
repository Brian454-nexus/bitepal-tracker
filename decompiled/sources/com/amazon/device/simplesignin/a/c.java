package com.amazon.device.simplesignin.a;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.amazon.a.a.o.f;
import com.amazon.device.simplesignin.ISimpleSignInResponseHandler;
import com.amazon.device.simplesignin.model.RequestId;
import com.amazon.device.simplesignin.model.SSIEvent;
import com.amazon.device.simplesignin.model.request.LinkUserAccountRequest;
import com.amazon.device.simplesignin.model.request.SSIEventRequest;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static String f11773a = "c";

    /* renamed from: b, reason: collision with root package name */
    private static final c f11774b = new c();

    /* renamed from: c, reason: collision with root package name */
    private static final IllegalStateException f11775c = new IllegalStateException(String.format("%s. %s", "Simple Sign-In SDK not initialized", "To initialize and register responseHandler, call SimpleSignInService.registerResponseHandler()"));

    /* renamed from: d, reason: collision with root package name */
    private Context f11776d;

    /* renamed from: e, reason: collision with root package name */
    private ISimpleSignInResponseHandler f11777e;

    /* renamed from: f, reason: collision with root package name */
    private b f11778f;

    private c() {
    }

    public static c a() {
        return f11774b;
    }

    private boolean f() {
        return this.f11776d != null;
    }

    private void g() {
        if (f()) {
            return;
        }
        com.amazon.device.simplesignin.a.d.a.b(f11773a, "Simple Sign-In SDK not initialized.");
        throw f11775c;
    }

    public String b() {
        if (!f()) {
            com.amazon.device.simplesignin.a.d.a.b(f11773a, "Application context not initialized, SDK mode is unknown.");
            return com.amazon.device.simplesignin.a.b.a.UNKNOWN.name();
        }
        if (a.a().b(this.f11776d)) {
            return com.amazon.device.simplesignin.a.b.a.SANDBOX.name();
        }
        return com.amazon.device.simplesignin.a.b.a.PRODUCTION.name();
    }

    public Context c() {
        return this.f11776d;
    }

    public ISimpleSignInResponseHandler d() {
        return this.f11777e;
    }

    public b e() {
        return this.f11778f;
    }

    public void a(Context context, ISimpleSignInResponseHandler iSimpleSignInResponseHandler) {
        com.amazon.a.a.a(context.getApplicationContext());
        this.f11776d = context;
        this.f11777e = iSimpleSignInResponseHandler;
        this.f11778f = a.a().a(context);
    }

    public RequestId a(String str) {
        g();
        f.a(str, com.amazon.device.simplesignin.a.a.a.f11737z);
        RequestId requestId = new RequestId();
        this.f11778f.a(requestId, str);
        return requestId;
    }

    private void b(LinkUserAccountRequest linkUserAccountRequest) {
        f.a(linkUserAccountRequest.getPartnerUserId(), com.amazon.device.simplesignin.a.a.a.f11700A);
        f.a(linkUserAccountRequest.getIdentityProviderName(), com.amazon.device.simplesignin.a.a.a.f11737z);
        f.a(linkUserAccountRequest.getLinkToken(), "linkToken");
        f.a(linkUserAccountRequest.getLinkToken().getToken(), "linkToken.token");
        f.a(linkUserAccountRequest.getLinkToken().getSchema(), "linkToken.schema");
        f.a(linkUserAccountRequest.getUserLoginName(), "userLoginName");
        f.a(linkUserAccountRequest.getLinkSigningKey(), "linkSigningKey");
    }

    public RequestId a(LinkUserAccountRequest linkUserAccountRequest) {
        g();
        b(linkUserAccountRequest);
        RequestId requestId = new RequestId();
        this.f11778f.a(requestId, linkUserAccountRequest);
        return requestId;
    }

    public RequestId a(Map<String, String> map) {
        g();
        if (!map.isEmpty()) {
            RequestId requestId = new RequestId();
            this.f11778f.a(requestId, map);
            return requestId;
        }
        throw new IllegalArgumentException("loginNames must not be empty");
    }

    public RequestId a(SSIEventRequest sSIEventRequest) {
        g();
        if (sSIEventRequest.getEvent().equals(SSIEvent.LOGIN_FAILURE) && sSIEventRequest.getFailureReason() == null) {
            throw new IllegalArgumentException("failureReason must not be empty for login failure");
        }
        RequestId requestId = new RequestId();
        this.f11778f.a(requestId, sSIEventRequest);
        Log.i(f11773a, "Initiating record event with requestId : " + requestId.toString());
        return requestId;
    }

    public void a(Context context, Intent intent) {
        this.f11778f.a(context, intent);
    }
}
