package com.amazon.device.drm.a.b;

import android.content.Context;
import android.content.Intent;
import com.amazon.device.drm.model.RequestId;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class c implements com.amazon.device.drm.a.c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f11511a = "c";

    @Override // com.amazon.device.drm.a.c
    public void a(Context context, Intent intent) {
    }

    @Override // com.amazon.device.drm.a.c
    public void a(RequestId requestId) {
        com.amazon.device.drm.a.e.b.a(f11511a, "sendGetLicense");
        new com.amazon.device.drm.a.a.b(requestId).e();
    }
}
