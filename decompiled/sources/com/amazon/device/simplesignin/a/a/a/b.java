package com.amazon.device.simplesignin.a.a.a;

import com.amazon.d.a.j;
import com.amazon.device.simplesignin.a.a.c;
import com.amazon.device.simplesignin.a.a.d;
import com.amazon.device.simplesignin.model.Link;
import com.amazon.device.simplesignin.model.RequestStatus;
import com.amazon.device.simplesignin.model.response.GetUserAndLinksResponse;
import java.util.List;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class b extends c {

    /* renamed from: b, reason: collision with root package name */
    private static final String f11738b = "SSI_GetUserAndLinks";

    /* renamed from: c, reason: collision with root package name */
    private static final String f11739c = "1.0";

    /* renamed from: d, reason: collision with root package name */
    private static final String f11740d = "b";

    public b(a aVar, String str) {
        super(aVar, f11738b, "1.0");
        super.a(com.amazon.device.simplesignin.a.a.a.f11712a, str);
    }

    @Override // com.amazon.device.simplesignin.a.a.c
    public void a(RequestStatus requestStatus) {
        if (!RequestStatus.INVALID_LINK_SIGNING_KEY_ENCRYPTION.equals(requestStatus) && !RequestStatus.INVALID_LINK_SIGNING_KEY.equals(requestStatus)) {
            a(requestStatus, null, null);
        } else {
            a(RequestStatus.FAILURE, null, null);
        }
    }

    @Override // com.amazon.a.a.n.a.h
    public boolean b(j jVar) {
        Map b6 = jVar.b();
        if (!b6.containsKey(com.amazon.device.simplesignin.a.a.a.f11713b) || !b6.containsKey(com.amazon.device.simplesignin.a.a.a.f11714c)) {
            a(RequestStatus.FAILURE);
            return false;
        }
        String str = (String) b6.get(com.amazon.device.simplesignin.a.a.a.f11713b);
        String str2 = (String) b6.get(com.amazon.device.simplesignin.a.a.a.f11714c);
        if (str == null || str2 == null) {
            a(RequestStatus.FAILURE);
            return false;
        }
        List<Link> a6 = com.amazon.device.simplesignin.a.d.b.a(str, str2);
        if (a6 == null) {
            a(RequestStatus.FAILURE);
            return false;
        }
        a(RequestStatus.SUCCESSFUL, str, a6);
        return true;
    }

    private void a(RequestStatus requestStatus, String str, List<Link> list) {
        d dVar = (d) j();
        GetUserAndLinksResponse getUserAndLinksResponse = new GetUserAndLinksResponse();
        getUserAndLinksResponse.setRequestId(dVar.e());
        getUserAndLinksResponse.setRequestStatus(requestStatus);
        getUserAndLinksResponse.setAmazonUserId(str);
        getUserAndLinksResponse.setLinks(list);
        super.a(getUserAndLinksResponse);
    }
}
