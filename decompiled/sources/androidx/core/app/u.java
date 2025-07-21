package androidx.core.app;

import android.content.res.Configuration;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8569a;

    /* renamed from: b, reason: collision with root package name */
    public Configuration f8570b;

    public u(boolean z6) {
        this.f8569a = z6;
    }

    public final boolean a() {
        return this.f8569a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u(boolean z6, Configuration newConfig) {
        this(z6);
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        this.f8570b = newConfig;
    }
}
