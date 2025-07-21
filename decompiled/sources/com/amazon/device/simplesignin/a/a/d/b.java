package com.amazon.device.simplesignin.a.a.d;

import android.app.Activity;
import android.content.Intent;
import com.amazon.d.a.j;
import com.amazon.device.simplesignin.a.a.c;
import com.amazon.device.simplesignin.a.a.d;
import com.amazon.device.simplesignin.model.RequestStatus;
import com.amazon.device.simplesignin.model.response.ShowLoginSelectionResponse;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class b extends c {

    /* renamed from: d, reason: collision with root package name */
    private static final String f11761d = a.class.getSimpleName();

    /* renamed from: e, reason: collision with root package name */
    private static final String f11762e = "SSI_ShowLoginSelection";

    /* renamed from: f, reason: collision with root package name */
    private static final String f11763f = "1.0";

    /* renamed from: b, reason: collision with root package name */
    @com.amazon.a.a.k.a
    protected com.amazon.a.a.n.b f11764b;

    /* renamed from: c, reason: collision with root package name */
    @com.amazon.a.a.k.a
    protected com.amazon.a.a.a.a f11765c;

    /* renamed from: g, reason: collision with root package name */
    private final Map<String, String> f11766g;

    public b(a aVar, Map<String, String> map) {
        super(aVar, f11762e, "1.0");
        this.f11766g = map;
    }

    @Override // com.amazon.device.simplesignin.a.a.c
    public void a(RequestStatus requestStatus) {
        d dVar = (d) j();
        ShowLoginSelectionResponse showLoginSelectionResponse = new ShowLoginSelectionResponse();
        showLoginSelectionResponse.setRequestId(dVar.e());
        if (!RequestStatus.INVALID_LINK_SIGNING_KEY_ENCRYPTION.equals(requestStatus) && !RequestStatus.INVALID_LINK_SIGNING_KEY.equals(requestStatus)) {
            showLoginSelectionResponse.setRequestStatus(requestStatus);
            super.a(showLoginSelectionResponse);
        } else {
            showLoginSelectionResponse.setRequestStatus(RequestStatus.FAILURE);
        }
    }

    @Override // com.amazon.a.a.n.a.h
    public boolean b(j jVar) {
        Map b6 = jVar.b();
        if (!b6.containsKey(com.amazon.device.simplesignin.a.a.a.f11727p)) {
            a(RequestStatus.FAILURE);
            return false;
        }
        Intent intent = (Intent) b6.get(com.amazon.device.simplesignin.a.a.a.f11727p);
        if (intent == null) {
            a(RequestStatus.FAILURE);
            return false;
        }
        intent.putExtra(com.amazon.device.simplesignin.a.a.a.f11726o, new HashMap(this.f11766g));
        a(intent);
        return true;
    }

    private void a(final Intent intent) {
        this.f11764b.b(com.amazon.a.a.n.b.d.FOREGROUND, new com.amazon.a.a.n.a() { // from class: com.amazon.device.simplesignin.a.a.d.b.1
            @Override // com.amazon.a.a.n.a
            public void a() {
                try {
                    Activity b6 = b.this.f11765c.b();
                    if (b6 == null) {
                        b6 = b.this.f11765c.a();
                    }
                    com.amazon.device.simplesignin.a.d.a.a(b.f11761d, "ShowLoginSelection activity initiated through startActivity");
                    b6.startActivity(intent);
                } catch (Exception e6) {
                    com.amazon.device.simplesignin.a.d.a.a(b.f11761d, "Exception when starting show login selection activity: " + e6);
                }
            }
        });
    }
}
