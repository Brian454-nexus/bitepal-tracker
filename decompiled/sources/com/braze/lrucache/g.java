package com.braze.lrucache;

import java.io.File;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f12368a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f12369b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f12370c;

    /* renamed from: d, reason: collision with root package name */
    public d f12371d;

    /* renamed from: e, reason: collision with root package name */
    public final int f12372e;

    /* renamed from: f, reason: collision with root package name */
    public final File f12373f;

    public g(String str, int i6, File file) {
        this.f12368a = str;
        this.f12372e = i6;
        this.f12373f = file;
        this.f12369b = new long[i6];
    }

    public final File a(int i6) {
        return new File(this.f12373f, this.f12368a + "." + i6 + ".tmp");
    }
}
