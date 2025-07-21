package com.braze.ui.banners.jsinterface;

import android.content.Context;
import android.webkit.JavascriptInterface;
import com.braze.Braze;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.support.BrazeLogger;
import com.braze.ui.JavascriptInterfaceBase;
import com.braze.ui.banners.jsinterface.BannerJavascriptInterface;
import ga.L;
import ga.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0014\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001c\u001a\u00020\u001b8G¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/braze/ui/banners/jsinterface/BannerJavascriptInterface;", "Lcom/braze/ui/JavascriptInterfaceBase;", "Landroid/content/Context;", "context", "", "placementId", "Lkotlin/Function1;", "", "", "setHeightCallback", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "buttonId", "logButtonClick", "(Ljava/lang/String;)V", "logClick", "()V", "height", "setBannerHeight", "(D)V", "requestPushPermission", "Ljava/lang/String;", "getPlacementId", "()Ljava/lang/String;", "Lkotlin/jvm/functions/Function1;", "getSetHeightCallback", "()Lkotlin/jvm/functions/Function1;", "Lcom/braze/ui/banners/jsinterface/BannerUserJavascriptInterface;", "user", "Lcom/braze/ui/banners/jsinterface/BannerUserJavascriptInterface;", "getUser", "()Lcom/braze/ui/banners/jsinterface/BannerUserJavascriptInterface;", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class BannerJavascriptInterface extends JavascriptInterfaceBase {

    @NotNull
    private final String placementId;

    @NotNull
    private final Function1<Double, Unit> setHeightCallback;

    @NotNull
    private final BannerUserJavascriptInterface user;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BannerJavascriptInterface(@NotNull Context context, @NotNull String placementId, @NotNull Function1<? super Double, Unit> setHeightCallback) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(setHeightCallback, "setHeightCallback");
        this.placementId = placementId;
        this.setHeightCallback = setHeightCallback;
        this.user = new BannerUserJavascriptInterface(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logButtonClick$lambda$1() {
        return "Banner logButtonClick() called. Logging banner click with button ID.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logClick$lambda$2() {
        return "Banner logClick() called. Logging banner click without button ID.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestPushPermission$lambda$5() {
        return "Banner requestPushPermission() called. Requesting push permission now.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setBannerHeight$lambda$3(double d6) {
        return "Banner setBannerHeight(" + d6 + ") called with invalid height. Height must be a finite number, not NaN, and greater or equal to 0.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setBannerHeight$lambda$4(double d6) {
        return "Banner setBannerHeight(" + d6 + ") called.";
    }

    @JavascriptInterface
    @NotNull
    public final BannerUserJavascriptInterface getUser() {
        return this.user;
    }

    @Override // com.braze.ui.JavascriptInterfaceBase
    @JavascriptInterface
    public void logButtonClick(@Nullable String buttonId) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: A4.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String logButtonClick$lambda$1;
                logButtonClick$lambda$1 = BannerJavascriptInterface.logButtonClick$lambda$1();
                return logButtonClick$lambda$1;
            }
        }, 6, (Object) null);
        Braze.INSTANCE.getInstance(getContext()).logBannerClick(this.placementId, buttonId);
    }

    @Override // com.braze.ui.JavascriptInterfaceBase
    @JavascriptInterface
    public void logClick() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: A4.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String logClick$lambda$2;
                logClick$lambda$2 = BannerJavascriptInterface.logClick$lambda$2();
                return logClick$lambda$2;
            }
        }, 6, (Object) null);
        Braze.INSTANCE.getInstance(getContext()).logBannerClick(this.placementId, null);
    }

    @JavascriptInterface
    public final void requestPushPermission() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: A4.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String requestPushPermission$lambda$5;
                requestPushPermission$lambda$5 = BannerJavascriptInterface.requestPushPermission$lambda$5();
                return requestPushPermission$lambda$5;
            }
        }, 6, (Object) null);
        i.d(BrazeCoroutineScope.INSTANCE, (CoroutineContext) null, (L) null, new BannerJavascriptInterface$requestPushPermission$2(null), 3, (Object) null);
    }

    @JavascriptInterface
    public final void setBannerHeight(final double height) {
        if (Double.isInfinite(height) || Double.isNaN(height) || height < 0.0d) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: A4.d
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String bannerHeight$lambda$3;
                    bannerHeight$lambda$3 = BannerJavascriptInterface.setBannerHeight$lambda$3(height);
                    return bannerHeight$lambda$3;
                }
            }, 7, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: A4.e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String bannerHeight$lambda$4;
                    bannerHeight$lambda$4 = BannerJavascriptInterface.setBannerHeight$lambda$4(height);
                    return bannerHeight$lambda$4;
                }
            }, 6, (Object) null);
            this.setHeightCallback.invoke(Double.valueOf(height));
        }
    }
}
