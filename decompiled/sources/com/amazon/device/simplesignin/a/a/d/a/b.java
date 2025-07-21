package com.amazon.device.simplesignin.a.a.d.a;

import com.amazon.d.a.j;
import com.amazon.device.simplesignin.a.a.c;
import com.amazon.device.simplesignin.a.a.d;
import com.amazon.device.simplesignin.model.RequestStatus;
import com.amazon.device.simplesignin.model.response.ShowLoginSelectionResponse;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class b extends c {

    /* renamed from: b, reason: collision with root package name */
    private static final String f11759b = "SSI_LoginSelectionResponse";

    /* renamed from: c, reason: collision with root package name */
    private static final String f11760c = "1.0";

    public b(a aVar) {
        super(aVar, f11759b, "1.0");
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
        if (!b6.containsKey(com.amazon.device.simplesignin.a.a.a.f11728q)) {
            a(RequestStatus.FAILURE);
            return false;
        }
        String str = (String) b6.get(com.amazon.device.simplesignin.a.a.a.f11728q);
        if (str == null) {
            a(RequestStatus.FAILURE);
            return false;
        }
        String str2 = (String) b6.get(com.amazon.device.simplesignin.a.a.a.f11729r);
        ShowLoginSelectionResponse.UserSelection userSelection = ShowLoginSelectionResponse.UserSelection.LoginSelected;
        if (!userSelection.name().equals(str) || str2 == null) {
            a(RequestStatus.SUCCESSFUL, null, ShowLoginSelectionResponse.UserSelection.ManualSignIn);
            return true;
        }
        a(RequestStatus.SUCCESSFUL, str2, userSelection);
        return true;
    }

    private void a(RequestStatus requestStatus, String str, ShowLoginSelectionResponse.UserSelection userSelection) {
        d dVar = (d) j();
        ShowLoginSelectionResponse showLoginSelectionResponse = new ShowLoginSelectionResponse();
        showLoginSelectionResponse.setRequestId(dVar.e());
        showLoginSelectionResponse.setRequestStatus(requestStatus);
        showLoginSelectionResponse.setUserSelection(userSelection);
        showLoginSelectionResponse.setLinkId(str);
        super.a(showLoginSelectionResponse);
    }
}
