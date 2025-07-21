package com.braze.requests.util;

import android.net.Uri;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f12872a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f12873b;

    /* renamed from: c, reason: collision with root package name */
    public final URL f12874c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f12875d;

    public c(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.f12873b = uri;
        String uri2 = uri.toString();
        this.f12872a = uri2;
        this.f12874c = new URL(uri2);
        this.f12875d = false;
    }

    public final String toString() {
        return this.f12872a;
    }

    public c(String urlString, boolean z6) {
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        this.f12873b = Uri.parse(urlString);
        this.f12872a = urlString;
        this.f12874c = new URL(urlString);
        this.f12875d = z6;
    }
}
