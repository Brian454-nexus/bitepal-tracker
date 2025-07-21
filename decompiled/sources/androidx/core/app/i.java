package androidx.core.app;

import android.content.res.Configuration;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8423a;

    /* renamed from: b, reason: collision with root package name */
    public Configuration f8424b;

    public i(boolean z6) {
        this.f8423a = z6;
    }

    public final boolean a() {
        return this.f8423a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(boolean z6, Configuration newConfig) {
        this(z6);
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        this.f8424b = newConfig;
    }
}
