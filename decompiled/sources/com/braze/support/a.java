package com.braze.support;

import android.graphics.Bitmap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f12985a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f12986b;

    public a() {
        this.f12985a = null;
        this.f12986b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f12985a, aVar.f12985a) && Intrinsics.areEqual(this.f12986b, aVar.f12986b);
    }

    public final int hashCode() {
        Bitmap bitmap = this.f12985a;
        int hashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
        Map map = this.f12986b;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "BitmapAndHeaders(bitmap=" + this.f12985a + ", headers=" + this.f12986b + ')';
    }

    public a(Bitmap bitmap, Map map) {
        this.f12985a = bitmap;
        this.f12986b = map;
    }
}
