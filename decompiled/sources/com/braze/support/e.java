package com.braze.support;

import kotlin.jvm.functions.Function0;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class e implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f12992a;

    public e(String str) {
        this.f12992a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Failed to create valid enum from string: " + this.f12992a;
    }
}
