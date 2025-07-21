package com.amazon.device.simplesignin.a.a.b;

import com.amazon.device.simplesignin.a.a.d;
import com.amazon.device.simplesignin.model.RequestStatus;
import com.amazon.device.simplesignin.model.response.LinkUserAccountResponse;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class c extends com.amazon.device.simplesignin.a.a.c {
    public c(d dVar, String str, String str2) {
        super(dVar, str, str2);
    }

    @Override // com.amazon.device.simplesignin.a.a.c
    public void a(RequestStatus requestStatus) {
        a(requestStatus, null, null);
    }

    public void a(RequestStatus requestStatus, String str, LinkUserAccountResponse.SuccessCode successCode) {
        d dVar = (d) j();
        LinkUserAccountResponse linkUserAccountResponse = new LinkUserAccountResponse();
        linkUserAccountResponse.setRequestId(dVar.e());
        linkUserAccountResponse.setRequestStatus(requestStatus);
        linkUserAccountResponse.setLinkId(str);
        linkUserAccountResponse.setSuccessCode(successCode);
        super.a(linkUserAccountResponse);
    }

    public boolean a(Map map) {
        if (!map.containsKey(com.amazon.device.simplesignin.a.a.a.f11724m)) {
            a(RequestStatus.FAILURE);
            return false;
        }
        String str = (String) map.get(com.amazon.device.simplesignin.a.a.a.f11724m);
        if (str == null) {
            a(RequestStatus.FAILURE);
            return false;
        }
        String str2 = (!map.containsKey(com.amazon.device.simplesignin.a.a.a.f11722k) || map.get(com.amazon.device.simplesignin.a.a.a.f11722k) == null) ? null : (String) map.get(com.amazon.device.simplesignin.a.a.a.f11722k);
        if (map.containsKey(com.amazon.device.simplesignin.a.a.a.f11723l) && map.get(com.amazon.device.simplesignin.a.a.a.f11723l) != null) {
            str2 = com.amazon.device.simplesignin.a.d.b.a((String) map.get(com.amazon.device.simplesignin.a.a.a.f11723l));
        }
        a(RequestStatus.SUCCESSFUL, str2, LinkUserAccountResponse.SuccessCode.valueOf(str));
        return true;
    }
}
