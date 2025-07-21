package com.amazon.device.iap.internal.util;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public enum d {
    LEGACY(0),
    V1(1),
    V2(2),
    V3(3);


    /* renamed from: e, reason: collision with root package name */
    private int f11696e;

    d(int i6) {
        this.f11696e = i6;
    }

    public int a() {
        return this.f11696e;
    }

    public boolean a(d dVar) {
        return dVar != null && this.f11696e < dVar.f11696e;
    }
}
