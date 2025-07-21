package com.amazon.device.simplesignin.a.a;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import com.amazon.a.a.n.a.h;
import com.amazon.device.simplesignin.ISimpleSignInResponseHandler;
import com.amazon.device.simplesignin.SimpleSignInService;
import com.amazon.device.simplesignin.model.RequestStatus;
import com.amazon.device.simplesignin.model.response.GetUserAndLinksResponse;
import com.amazon.device.simplesignin.model.response.LinkUserAccountResponse;
import com.amazon.device.simplesignin.model.response.RecordMetricsEventResponse;
import com.amazon.device.simplesignin.model.response.ShowLoginSelectionResponse;
import lombok.NonNull;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class c extends h {

    /* renamed from: b, reason: collision with root package name */
    private static final String f11751b = "c";

    public c(d dVar, String str, String str2) {
        super(dVar, str, str2, dVar.e().toString(), SimpleSignInService.SDK_VERSION);
        super.b(false);
    }

    public abstract void a(RequestStatus requestStatus);

    public void a(@NonNull final Object obj) {
        if (obj != null) {
            String str = f11751b;
            com.amazon.device.simplesignin.a.d.a.a(str, "Response type received: " + obj.getClass().getSimpleName());
            Context c6 = com.amazon.device.simplesignin.a.c.a().c();
            final ISimpleSignInResponseHandler d6 = com.amazon.device.simplesignin.a.c.a().d();
            if (c6 != null && d6 != null) {
                new Handler(c6.getMainLooper()).post(new Runnable() { // from class: com.amazon.device.simplesignin.a.a.c.1
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
                            com.amazon.device.simplesignin.a.d.a.b(c.f11751b, "Unknown response type:" + obj.getClass().getName());
                        } catch (Exception e6) {
                            com.amazon.device.simplesignin.a.d.a.b(c.f11751b, "Error in sending response to callback: " + e6);
                        }
                    }
                });
                return;
            } else {
                com.amazon.device.simplesignin.a.d.a.a(str, "Dropping the response as context of response handler is null.");
                return;
            }
        }
        throw new NullPointerException("response is marked non-null but is null");
    }

    @Override // com.amazon.a.a.n.a.h
    public void b(com.amazon.d.a.h hVar) {
        String g6;
        try {
            g6 = hVar.g();
        } catch (RemoteException unused) {
            com.amazon.device.simplesignin.a.d.a.b(f11751b, "Exception while fetching reason for failure");
        }
        if (a.f11705F.equals(g6)) {
            a(RequestStatus.NOT_SUPPORTED);
            return;
        }
        if (a.f11708I.equals(g6)) {
            a(RequestStatus.NOT_AVAILABLE);
            return;
        }
        if (a.f11706G.equals(g6)) {
            a(RequestStatus.DUPLICATE_REQUEST);
            return;
        }
        if (a.f11707H.equals(g6)) {
            a(RequestStatus.FEATURE_TURNED_OFF);
            return;
        }
        if (a.f11709J.equals(g6)) {
            a(RequestStatus.RETRYABLE_FAILURE);
            return;
        }
        if (a.f11710K.equals(g6)) {
            a(RequestStatus.INVALID_LINK_SIGNING_KEY_ENCRYPTION);
            return;
        }
        if (a.f11711L.equals(g6)) {
            a(RequestStatus.INVALID_LINK_SIGNING_KEY);
            return;
        }
        a(RequestStatus.FAILURE);
    }
}
