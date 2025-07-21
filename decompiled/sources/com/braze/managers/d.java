package com.braze.managers;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f12403a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f12404b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f12405c;

    public d(String placementId, WeakReference view, boolean z6) {
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(view, "view");
        this.f12403a = placementId;
        this.f12404b = view;
        this.f12405c = z6;
    }
}
