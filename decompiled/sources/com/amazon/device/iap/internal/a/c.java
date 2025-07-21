package com.amazon.device.iap.internal.a;

import android.content.Context;
import android.os.Handler;
import com.amazon.a.a.n.a.h;
import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.RequestId;
import com.amazon.device.iap.model.UserDataResponse;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class c extends com.amazon.a.a.j.a {

    /* renamed from: c, reason: collision with root package name */
    private static final String f11553c = "c";

    /* renamed from: d, reason: collision with root package name */
    private RequestId f11554d;

    public c(RequestId requestId) {
        this.f11554d = requestId;
    }

    @Override // com.amazon.a.a.j.a
    public void a(h hVar) {
        this.f10987b = hVar;
    }

    @Override // com.amazon.a.a.j.a
    public void b() {
    }

    @Override // com.amazon.a.a.j.a
    public void c() {
    }

    public RequestId d() {
        return this.f11554d;
    }

    public void e() {
        h hVar = this.f10987b;
        if (hVar != null) {
            hVar.l();
        } else {
            b();
        }
    }

    public void a(Object obj) {
        a(obj, null);
    }

    public void a(final Object obj, final h hVar) {
        com.amazon.a.a.o.f.a(obj, "response");
        Context b6 = com.amazon.device.iap.internal.d.f().b();
        final PurchasingListener a6 = com.amazon.device.iap.internal.d.f().a();
        if (b6 != null && a6 != null) {
            new Handler(b6.getMainLooper()).post(new Runnable() { // from class: com.amazon.device.iap.internal.a.c.1
                @Override // java.lang.Runnable
                public void run() {
                    c.this.a().a(com.amazon.a.a.o.b.ao, Boolean.FALSE);
                    try {
                        Object obj2 = obj;
                        if (obj2 instanceof ProductDataResponse) {
                            a6.onProductDataResponse((ProductDataResponse) obj2);
                        } else if (obj2 instanceof UserDataResponse) {
                            a6.onUserDataResponse((UserDataResponse) obj2);
                        } else if (obj2 instanceof PurchaseUpdatesResponse) {
                            PurchaseUpdatesResponse purchaseUpdatesResponse = (PurchaseUpdatesResponse) obj2;
                            a6.onPurchaseUpdatesResponse(purchaseUpdatesResponse);
                            Object a7 = c.this.a().a(com.amazon.a.a.o.b.ap);
                            if (a7 != null && (a7 instanceof String)) {
                                com.amazon.device.iap.internal.util.a.a(purchaseUpdatesResponse.getUserData().getUserId(), a7.toString());
                            }
                        } else if (obj2 instanceof PurchaseResponse) {
                            a6.onPurchaseResponse((PurchaseResponse) obj2);
                        } else {
                            com.amazon.device.iap.internal.util.b.b(c.f11553c, "Unknown response type:" + obj.getClass().getName());
                        }
                        c.this.a().a(com.amazon.a.a.o.b.ao, Boolean.TRUE);
                    } catch (Throwable th) {
                        com.amazon.device.iap.internal.util.b.b(c.f11553c, "Error in sendResponse: " + th);
                    }
                    h hVar2 = hVar;
                    if (hVar2 != null) {
                        hVar2.a(true);
                        hVar.l();
                    }
                }
            });
            return;
        }
        com.amazon.device.iap.internal.util.b.a(f11553c, "PurchasingListener is not set. Dropping response: " + obj);
    }

    @Override // com.amazon.a.a.j.a
    public com.amazon.a.a.j.b a() {
        return this.f10986a;
    }
}
