package com.braze.brazeplugin;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.braze.brazeplugin.BrazeBannerView;
import com.braze.support.BrazeLogger;
import com.braze.ui.banners.BannerView;
import io.flutter.plugin.platform.k;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/braze/brazeplugin/BrazeBannerView;", "Lio/flutter/plugin/platform/k;", "Landroid/content/Context;", "context", "", "", "", "creationParams", "La;", "uiHandler", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/content/Context;Ljava/util/Map;La;Landroid/app/Activity;)V", "Landroid/view/View;", "getView", "()Landroid/view/View;", "", "dispose", "()V", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "bannerUIHandler", "La;", "Lcom/braze/ui/banners/BannerView;", "bannerView", "Lcom/braze/ui/banners/BannerView;", "containerId", "Ljava/lang/String;", "braze_plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class BrazeBannerView implements k {

    @NotNull
    private final Activity activity;

    @NotNull
    private final defpackage.a bannerUIHandler;

    @NotNull
    private final BannerView bannerView;

    @NotNull
    private final String containerId;

    public BrazeBannerView(@NotNull Context context, @Nullable Map<String, ? extends Object> map, @NotNull defpackage.a uiHandler, @NotNull Activity activity) {
        BrazeBannerView brazeBannerView;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uiHandler, "uiHandler");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.activity = activity;
        this.bannerUIHandler = uiHandler;
        BannerView bannerView = new BannerView(context);
        this.bannerView = bannerView;
        bannerView.setBackgroundColor(0);
        Object obj = map != null ? map.get("placementId") : null;
        final String str = obj instanceof String ? (String) obj : null;
        Object obj2 = map != null ? map.get("containerId") : null;
        final String str2 = obj2 instanceof String ? (String) obj2 : null;
        if (str == null || str2 == null) {
            brazeBannerView = this;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeBannerView, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: P3.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String _init_$lambda$0;
                    _init_$lambda$0 = BrazeBannerView._init_$lambda$0(str, str2);
                    return _init_$lambda$0;
                }
            }, 6, (Object) null);
        } else {
            brazeBannerView = this;
        }
        bannerView.setPlacementId(str);
        brazeBannerView.containerId = str2 == null ? "" : str2;
        bannerView.setHeightCallback(new Function1() { // from class: P3.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                Unit _init_$lambda$2;
                _init_$lambda$2 = BrazeBannerView._init_$lambda$2(BrazeBannerView.this, ((Double) obj3).doubleValue());
                return _init_$lambda$2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$0(String str, String str2) {
        return "\n                Invalid empty parameter. Banner will not render properly:\n                - Placement id: " + str + "\n                - Banner container id: " + str2 + "\n                ";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$2(final BrazeBannerView this$0, final double d6) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.activity.runOnUiThread(new Runnable() { // from class: P3.d
            @Override // java.lang.Runnable
            public final void run() {
                BrazeBannerView.h(BrazeBannerView.this, d6);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dispose$lambda$3(BrazeBannerView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.bannerUIHandler.c(0.0d, this$0.containerId);
        this$0.bannerView.destroy();
    }

    public static void h(BrazeBannerView this$0, double d6) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.bannerUIHandler.c(d6, this$0.containerId);
    }

    public void dispose() {
        this.activity.runOnUiThread(new Runnable() { // from class: P3.a
            @Override // java.lang.Runnable
            public final void run() {
                BrazeBannerView.dispose$lambda$3(BrazeBannerView.this);
            }
        });
    }

    @NotNull
    public View getView() {
        return this.bannerView;
    }
}
