package com.braze.brazeplugin;

import G9.o;
import android.app.Activity;
import android.content.Context;
import io.flutter.plugin.platform.k;
import io.flutter.plugin.platform.l;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/braze/brazeplugin/BrazeBannerViewFactory;", "Lio/flutter/plugin/platform/l;", "La;", "uiHandler", "Landroid/app/Activity;", "activity", "<init>", "(La;Landroid/app/Activity;)V", "Landroid/content/Context;", "context", "", "id", "", "args", "Lio/flutter/plugin/platform/k;", "create", "(Landroid/content/Context;ILjava/lang/Object;)Lio/flutter/plugin/platform/k;", "La;", "getUiHandler", "()La;", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "braze_plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class BrazeBannerViewFactory extends l {

    @NotNull
    private final Activity activity;

    @NotNull
    private final defpackage.a uiHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrazeBannerViewFactory(@NotNull defpackage.a uiHandler, @NotNull Activity activity) {
        super(o.a);
        Intrinsics.checkNotNullParameter(uiHandler, "uiHandler");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.uiHandler = uiHandler;
        this.activity = activity;
    }

    @NotNull
    public k create(@NotNull Context context, int id, @Nullable Object args) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new BrazeBannerView(context, args instanceof Map ? (Map) args : null, this.uiHandler, this.activity);
    }
}
