package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import y5.d;
import y5.h;
import y5.m;

@Keep
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class CctBackendFactory implements d {
    @Override // y5.d
    public m create(h hVar) {
        return new v5.d(hVar.b(), hVar.e(), hVar.d());
    }
}
