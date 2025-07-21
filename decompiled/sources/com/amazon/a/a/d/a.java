package com.amazon.a.a.d;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class a extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private static final long f10882a = 1;

    public a(String str) {
        super(str);
    }

    public a(String str, Throwable th) {
        super("Failed to authenticate data: " + str, th);
    }
}
