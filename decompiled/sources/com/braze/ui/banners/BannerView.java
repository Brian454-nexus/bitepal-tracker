package com.braze.ui.banners;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Base64;
import android.webkit.WebView;
import com.amazon.a.a.o.b;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.managers.IBannerView;
import com.braze.models.Banner;
import com.braze.ui.R$styleable;
import com.braze.ui.banners.BannerView;
import com.braze.ui.banners.jsinterface.BannerJavascriptInterface;
import com.braze.ui.banners.listeners.DefaultBannerWebViewClientListener;
import com.braze.ui.banners.utils.BannerWebViewClient;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\f\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0011R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R0\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001dR(\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010#\u001a\u0004\u0018\u00010\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\u0011¨\u0006'"}, d2 = {"Lcom/braze/ui/banners/BannerView;", "Landroid/webkit/WebView;", "Lcom/braze/managers/IBannerView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "", "init", "(Landroid/util/AttributeSet;I)V", "", "placementId", "configureWebView", "(Ljava/lang/String;)V", "loadHtmlData", "setWebviewToEmpty", "()V", "initBanner", "_placementId", "Ljava/lang/String;", "loadedHtml", "currentUserId", "Lkotlin/Function1;", "", "heightCallback", "Lkotlin/jvm/functions/Function1;", "getHeightCallback", "()Lkotlin/jvm/functions/Function1;", "setHeightCallback", "(Lkotlin/jvm/functions/Function1;)V", "internalHeightCallback", b.f11195Y, "getPlacementId", "()Ljava/lang/String;", "setPlacementId", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBannerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BannerView.kt\ncom/braze/ui/banners/BannerView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,164:1\n1#2:165\n*E\n"})
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class BannerView extends WebView implements IBannerView {

    @Nullable
    private String _placementId;

    @Nullable
    private String currentUserId;

    @Nullable
    private Function1<? super Double, Unit> heightCallback;

    @NotNull
    private final Function1<Double, Unit> internalHeightCallback;

    @Nullable
    private String loadedHtml;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.internalHeightCallback = new Function1() { // from class: z4.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit internalHeightCallback$lambda$0;
                internalHeightCallback$lambda$0 = BannerView.internalHeightCallback$lambda$0(BannerView.this, ((Double) obj).doubleValue());
                return internalHeightCallback$lambda$0;
            }
        };
        init(null, 0);
    }

    private final void configureWebView(String placementId) {
        getSettings().setJavaScriptEnabled(true);
        getSettings().setUseWideViewPort(true);
        getSettings().setLoadWithOverviewMode(true);
        getSettings().setDisplayZoomControls(false);
        getSettings().setDomStorageEnabled(true);
        getSettings().setAllowFileAccess(false);
        setLayerType(2, null);
        setBackgroundColor(0);
        DefaultBannerWebViewClientListener defaultBannerWebViewClientListener = new DefaultBannerWebViewClientListener();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setWebViewClient(new BannerWebViewClient(context, defaultBannerWebViewClientListener));
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        addJavascriptInterface(new BannerJavascriptInterface(context2, placementId, this.internalHeightCallback), "brazeInternalBridge");
    }

    private final void init(AttributeSet attrs, int defStyle) {
        setBackgroundColor(0);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, R$styleable.BannerView, defStyle, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        int i6 = R$styleable.BannerView_placementId;
        if (obtainStyledAttributes.hasValue(i6)) {
            this._placementId = obtainStyledAttributes.getString(i6);
        }
        obtainStyledAttributes.recycle();
        initBanner(get_placementId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit internalHeightCallback$lambda$0(BannerView bannerView, double d6) {
        Function1<? super Double, Unit> function1 = bannerView.heightCallback;
        if (function1 != null) {
            function1.invoke(Double.valueOf(d6));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadHtmlData(String placementId) {
        configureWebView(placementId);
        String str = this.loadedHtml;
        if (str != null) {
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            String encodeToString = Base64.encodeToString(bytes, 1);
            if (encodeToString == null) {
                encodeToString = "";
            }
            loadData(encodeToString, "text/html", "base64");
            invalidate();
        }
    }

    private final void setWebviewToEmpty() {
        this.loadedHtml = null;
        if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: z4.c
                @Override // java.lang.Runnable
                public final void run() {
                    BannerView.setWebviewToEmpty$lambda$4(BannerView.this);
                }
            });
            return;
        }
        loadData("", "text/html", "base64");
        invalidate();
        this.internalHeightCallback.invoke(Double.valueOf(0.0d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setWebviewToEmpty$lambda$4(BannerView bannerView) {
        bannerView.loadData("", "text/html", "base64");
        bannerView.invalidate();
        bannerView.internalHeightCallback.invoke(Double.valueOf(0.0d));
    }

    @Nullable
    public final Function1<Double, Unit> getHeightCallback() {
        return this.heightCallback;
    }

    @Nullable
    /* renamed from: getPlacementId, reason: from getter */
    public final String get_placementId() {
        return this._placementId;
    }

    @Override // com.braze.managers.IBannerView
    public void initBanner(@Nullable final String placementId) {
        Banner banner;
        if (placementId != null) {
            Braze.Companion companion = Braze.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            banner = companion.getInstance(context).getBanner(placementId);
        } else {
            banner = null;
        }
        if (banner == null) {
            this.currentUserId = null;
            setWebviewToEmpty();
            if (placementId != null) {
                BrazeInternal.INSTANCE.addBannerViewMonitor(placementId, this, true);
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(banner.getHtml(), this.loadedHtml) && Intrinsics.areEqual(banner.getUserId(), this.currentUserId)) {
            return;
        }
        this.loadedHtml = banner.getHtml();
        this.currentUserId = banner.getUserId();
        if (banner.getIsControl()) {
            setWebviewToEmpty();
        } else if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            loadHtmlData(placementId);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: z4.b
                @Override // java.lang.Runnable
                public final void run() {
                    BannerView.this.loadHtmlData(placementId);
                }
            });
        }
        BrazeInternal.INSTANCE.addBannerViewMonitor(banner.getPlacementId(), this, false);
    }

    public final void setHeightCallback(@Nullable Function1<? super Double, Unit> function1) {
        this.heightCallback = function1;
    }

    public final void setPlacementId(@Nullable String str) {
        this._placementId = str;
        initBanner(str);
    }
}
