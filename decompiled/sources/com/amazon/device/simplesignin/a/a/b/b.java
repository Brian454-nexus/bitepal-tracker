package com.amazon.device.simplesignin.a.a.b;

import android.app.Activity;
import android.content.Intent;
import com.amazon.a.a.n.b.d;
import com.amazon.d.a.j;
import com.amazon.device.simplesignin.model.request.LinkUserAccountRequest;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class b extends c {

    /* renamed from: d, reason: collision with root package name */
    private static final String f11744d = "SSI_LinkUserAccount";

    /* renamed from: e, reason: collision with root package name */
    private static final String f11745e = "1.0";

    /* renamed from: f, reason: collision with root package name */
    private static final String f11746f = "b";

    /* renamed from: b, reason: collision with root package name */
    @com.amazon.a.a.k.a
    protected com.amazon.a.a.n.b f11747b;

    /* renamed from: c, reason: collision with root package name */
    @com.amazon.a.a.k.a
    protected com.amazon.a.a.a.a f11748c;

    public b(a aVar, LinkUserAccountRequest linkUserAccountRequest) {
        super(aVar, f11744d, "1.0");
        super.a(com.amazon.device.simplesignin.a.a.a.f11715d, linkUserAccountRequest.getPartnerUserId());
        super.a(com.amazon.device.simplesignin.a.a.a.f11712a, linkUserAccountRequest.getIdentityProviderName());
        super.a(com.amazon.device.simplesignin.a.a.a.f11716e, linkUserAccountRequest.getUserLoginName());
        super.a(com.amazon.device.simplesignin.a.a.a.f11719h, com.amazon.device.simplesignin.a.a.a.f11720i);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("token", linkUserAccountRequest.getLinkToken().getToken());
            jSONObject.put(com.amazon.device.simplesignin.a.a.a.f11704E, linkUserAccountRequest.getLinkToken().getSchema());
            super.a(com.amazon.device.simplesignin.a.a.a.f11718g, jSONObject.toString());
            super.a(com.amazon.device.simplesignin.a.a.a.f11717f, linkUserAccountRequest.getLinkSigningKey());
        } catch (JSONException e6) {
            com.amazon.device.simplesignin.a.d.a.b(f11746f, "Unable to create linkToken json");
            throw new IllegalStateException("Unable to create linkToken json", e6);
        }
    }

    private void a(final Intent intent) {
        this.f11747b.b(d.FOREGROUND, new com.amazon.a.a.n.a() { // from class: com.amazon.device.simplesignin.a.a.b.b.1
            @Override // com.amazon.a.a.n.a
            public void a() {
                try {
                    Activity b6 = b.this.f11748c.b();
                    if (b6 == null) {
                        b6 = b.this.f11748c.a();
                    }
                    com.amazon.device.simplesignin.a.d.a.a(b.f11746f, "Consent activity is about to start: " + b6);
                    b6.startActivity(intent);
                } catch (Exception e6) {
                    com.amazon.device.simplesignin.a.d.a.a(b.f11746f, "Exception when starting consent activity: " + e6);
                }
            }
        });
    }

    @Override // com.amazon.a.a.n.a.h
    public boolean b(j jVar) {
        Map b6 = jVar.b();
        if (!b6.containsKey(com.amazon.device.simplesignin.a.a.a.f11721j) || b6.get(com.amazon.device.simplesignin.a.a.a.f11721j) == null) {
            return super.a(b6);
        }
        a((Intent) b6.get(com.amazon.device.simplesignin.a.a.a.f11721j));
        return true;
    }
}
