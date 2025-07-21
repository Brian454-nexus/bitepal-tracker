package com.amazon.device.iap.internal.a.c;

import com.amazon.a.a.o.f;
import com.amazon.d.a.j;
import com.amazon.device.iap.internal.model.UserDataBuilder;
import com.amazon.device.iap.internal.model.UserDataResponseBuilder;
import com.amazon.device.iap.model.UserData;
import com.amazon.device.iap.model.UserDataRequest;
import com.amazon.device.iap.model.UserDataResponse;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class d extends b {

    /* renamed from: d, reason: collision with root package name */
    private static final String f11562d = "d";

    public d(com.amazon.device.iap.internal.a.c cVar, UserDataRequest userDataRequest) {
        super(cVar, com.amazon.a.a.o.b.ah);
        if (userDataRequest != null) {
            a("UserDataRequest.fetchLWAConsentStatus", Boolean.valueOf(userDataRequest.getFetchLWAConsentStatus()));
        }
    }

    @Override // com.amazon.a.a.n.a.h
    public boolean b(j jVar) {
        String str = f11562d;
        com.amazon.device.iap.internal.util.b.a(str, "onResult: result = " + jVar);
        Map b6 = jVar.b();
        com.amazon.device.iap.internal.util.b.a(str, "data: " + b6);
        String str2 = (String) b6.get("userId");
        String str3 = (String) b6.get(com.amazon.a.a.o.b.f11209m);
        String str4 = (String) b6.get("UserDataResponse.LWAConsentStatus");
        com.amazon.device.iap.internal.a.c cVar = (com.amazon.device.iap.internal.a.c) j();
        if (f.a(str2) || f.a(str3)) {
            cVar.a().a(new UserDataResponseBuilder().setRequestId(cVar.d()).setRequestStatus(UserDataResponse.RequestStatus.FAILED).build());
            return false;
        }
        UserData build = new UserDataBuilder().setUserId(str2).setMarketplace(str3).setLWAConsentStatus(str4).build();
        UserDataResponse build2 = new UserDataResponseBuilder().setRequestId(cVar.d()).setRequestStatus(UserDataResponse.RequestStatus.SUCCESSFUL).setUserData(build).build();
        cVar.a().a("userId", build.getUserId());
        cVar.a().a(build2);
        return true;
    }
}
