package com.braze.exceptions;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
