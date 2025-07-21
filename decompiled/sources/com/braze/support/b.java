package com.braze.support;

import com.braze.support.BrazeLogger;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract /* synthetic */ class b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f12987a;

    static {
        int[] iArr = new int[BrazeLogger.Priority.values().length];
        try {
            iArr[BrazeLogger.Priority.f12980D.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BrazeLogger.Priority.f12982I.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BrazeLogger.Priority.f12981E.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[BrazeLogger.Priority.f12984W.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[BrazeLogger.Priority.f12983V.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f12987a = iArr;
    }
}
