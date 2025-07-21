package com.braze.ui.inappmessage.utils;

import android.content.Context;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.ui.BrazeWebViewClient;
import com.braze.ui.inappmessage.listeners.IInAppMessageWebViewClientListener;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/braze/ui/inappmessage/utils/InAppMessageWebViewClient;", "Lcom/braze/ui/BrazeWebViewClient;", "context", "Landroid/content/Context;", "inAppMessage", "Lcom/braze/models/inappmessage/IInAppMessage;", "inAppMessageWebViewClientListener", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageWebViewClientListener;", "assetDirectoryUrl", "", "<init>", "(Landroid/content/Context;Lcom/braze/models/inappmessage/IInAppMessage;Lcom/braze/ui/inappmessage/listeners/IInAppMessageWebViewClientListener;Ljava/lang/String;)V", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class InAppMessageWebViewClient extends BrazeWebViewClient {

    @NotNull
    private final IInAppMessage inAppMessage;

    @Nullable
    private final IInAppMessageWebViewClientListener inAppMessageWebViewClientListener;

    public /* synthetic */ InAppMessageWebViewClient(Context context, IInAppMessage iInAppMessage, IInAppMessageWebViewClientListener iInAppMessageWebViewClientListener, String str, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, iInAppMessage, iInAppMessageWebViewClientListener, (i6 & 8) != 0 ? null : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessageWebViewClient(@NotNull Context context, @NotNull IInAppMessage inAppMessage, @Nullable IInAppMessageWebViewClientListener iInAppMessageWebViewClientListener, @Nullable String str) {
        super(context, BrazeWebViewClient.Type.IN_APP_MESSAGE, inAppMessage, iInAppMessageWebViewClientListener, null, str);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        this.inAppMessage = inAppMessage;
        this.inAppMessageWebViewClientListener = iInAppMessageWebViewClientListener;
    }
}
