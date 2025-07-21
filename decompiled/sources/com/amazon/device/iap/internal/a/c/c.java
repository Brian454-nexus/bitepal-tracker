package com.amazon.device.iap.internal.a.c;

import com.amazon.a.a.o.f;
import com.amazon.d.a.j;
import com.amazon.device.iap.internal.model.UserDataBuilder;
import com.amazon.device.iap.internal.model.UserDataResponseBuilder;
import com.amazon.device.iap.model.UserData;
import com.amazon.device.iap.model.UserDataResponse;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class c extends b {

    /* renamed from: d, reason: collision with root package name */
    private static final String f11561d = "c";

    public c(com.amazon.device.iap.internal.a.c cVar) {
        super(cVar, "1.0");
    }

    @Override // com.amazon.a.a.n.a.h
    public boolean b(j jVar) {
        String str = f11561d;
        com.amazon.device.iap.internal.util.b.a(str, "onSuccessInternal: result = " + jVar);
        Map b6 = jVar.b();
        com.amazon.device.iap.internal.util.b.a(str, "data: " + b6);
        String str2 = (String) b6.get("userId");
        com.amazon.device.iap.internal.a.c cVar = (com.amazon.device.iap.internal.a.c) j();
        if (f.a(str2)) {
            cVar.a().a(new UserDataResponseBuilder().setRequestId(cVar.d()).setRequestStatus(UserDataResponse.RequestStatus.FAILED).build());
            return false;
        }
        UserData build = new UserDataBuilder().setUserId(str2).setMarketplace(b.f11560c).build();
        UserDataResponse build2 = new UserDataResponseBuilder().setRequestId(cVar.d()).setRequestStatus(UserDataResponse.RequestStatus.SUCCESSFUL).setUserData(build).build();
        cVar.a().a("userId", build.getUserId());
        cVar.a().a(build2);
        return true;
    }
}
