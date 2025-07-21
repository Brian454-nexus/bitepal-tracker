package com.amazon.device.simplesignin.a.a;

import android.content.Context;
import android.content.Intent;
import com.amazon.device.simplesignin.model.RequestId;
import com.amazon.device.simplesignin.model.request.LinkUserAccountRequest;
import com.amazon.device.simplesignin.model.request.SSIEventRequest;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class b implements com.amazon.device.simplesignin.a.b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f11741a = "b";

    @Override // com.amazon.device.simplesignin.a.b
    public void a(RequestId requestId, String str) {
        new com.amazon.device.simplesignin.a.a.a.a(requestId, str).d();
    }

    @Override // com.amazon.device.simplesignin.a.b
    public void a(RequestId requestId, LinkUserAccountRequest linkUserAccountRequest) {
        new com.amazon.device.simplesignin.a.a.b.a(requestId, linkUserAccountRequest).d();
    }

    @Override // com.amazon.device.simplesignin.a.b
    public void a(RequestId requestId, Map<String, String> map) {
        new com.amazon.device.simplesignin.a.a.d.a(requestId, map).d();
    }

    @Override // com.amazon.device.simplesignin.a.b
    public void a(RequestId requestId, SSIEventRequest sSIEventRequest) {
        new com.amazon.device.simplesignin.a.a.c.a(requestId, sSIEventRequest).d();
    }

    @Override // com.amazon.device.simplesignin.a.b
    public void a(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra(a.f11725n);
        if (stringExtra == null) {
            com.amazon.device.simplesignin.a.d.a.b(f11741a, "Invalid response type: null");
            return;
        }
        com.amazon.device.simplesignin.a.d.a.a(f11741a, "Found response type: " + stringExtra);
        if (a.f11734w.equals(stringExtra)) {
            new com.amazon.device.simplesignin.a.a.b.a.b(new RequestId(intent.getStringExtra(com.amazon.a.a.o.b.f11172B))).d();
        }
        if (a.f11735x.equals(stringExtra)) {
            new com.amazon.device.simplesignin.a.a.d.a.a(new RequestId(intent.getStringExtra(com.amazon.a.a.o.b.f11172B))).d();
        }
    }
}
