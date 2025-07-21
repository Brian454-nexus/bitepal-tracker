package com.amazon.device.drm.a.b;

import android.content.Context;
import android.os.Handler;
import com.amazon.a.a.n.a.h;
import com.amazon.a.a.o.f;
import com.amazon.device.drm.LicensingListener;
import com.amazon.device.drm.a.d;
import com.amazon.device.drm.model.LicenseResponse;
import com.amazon.device.drm.model.RequestId;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class b extends com.amazon.a.a.j.a {

    /* renamed from: c, reason: collision with root package name */
    private static final String f11506c = "b";

    /* renamed from: d, reason: collision with root package name */
    private final RequestId f11507d;

    public b(RequestId requestId) {
        this.f11507d = requestId;
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
        return this.f11507d;
    }

    public void e() {
        h hVar = this.f10987b;
        if (hVar != null) {
            hVar.l();
        } else {
            b();
        }
    }

    public void a(final Object obj) {
        f.a(obj, "response");
        Context c6 = d.d().c();
        final LicensingListener b6 = d.d().b();
        if (c6 != null && b6 != null) {
            new Handler(c6.getMainLooper()).post(new Runnable() { // from class: com.amazon.device.drm.a.b.b.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Object obj2 = obj;
                        if (obj2 instanceof LicenseResponse) {
                            b6.onLicenseCommandResponse((LicenseResponse) obj2);
                            return;
                        }
                        com.amazon.device.drm.a.e.b.b(b.f11506c, "Unknown response type:" + obj.getClass().getName());
                    } catch (Throwable th) {
                        com.amazon.device.drm.a.e.b.b(b.f11506c, "Error in sendResponse: " + th);
                    }
                }
            });
            return;
        }
        com.amazon.device.drm.a.e.b.a(f11506c, "LicensingListener is not set. Dropping response: " + obj);
    }

    @Override // com.amazon.a.a.j.a
    public com.amazon.a.a.j.b a() {
        return this.f10986a;
    }
}
