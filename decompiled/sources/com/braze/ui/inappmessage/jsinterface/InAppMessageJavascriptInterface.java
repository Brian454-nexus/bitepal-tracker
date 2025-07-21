package com.braze.ui.inappmessage.jsinterface;

import android.content.Context;
import android.webkit.JavascriptInterface;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.models.inappmessage.IInAppMessageHtml;
import com.braze.ui.JavascriptInterfaceBase;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u0017\u0010\u0013\u001a\u00020\u00128G¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u0018\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/braze/ui/inappmessage/jsinterface/InAppMessageJavascriptInterface;", "Lcom/braze/ui/JavascriptInterfaceBase;", "Landroid/content/Context;", "context", "Lcom/braze/models/inappmessage/IInAppMessageHtml;", "inAppMessage", "<init>", "(Landroid/content/Context;Lcom/braze/models/inappmessage/IInAppMessageHtml;)V", "", "buttonId", "", "logButtonClick", "(Ljava/lang/String;)V", "logClick", "()V", "beforeMessageClosed", "requestPushPermission", "Lcom/braze/models/inappmessage/IInAppMessageHtml;", "Lcom/braze/ui/inappmessage/jsinterface/InAppMessageUserJavascriptInterface;", "user", "Lcom/braze/ui/inappmessage/jsinterface/InAppMessageUserJavascriptInterface;", "getUser", "()Lcom/braze/ui/inappmessage/jsinterface/InAppMessageUserJavascriptInterface;", "", "wasCloseMessageCalled", "Z", "getWasCloseMessageCalled", "()Z", "setWasCloseMessageCalled", "(Z)V", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nInAppMessageJavascriptInterface.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InAppMessageJavascriptInterface.kt\ncom/braze/ui/inappmessage/jsinterface/InAppMessageJavascriptInterface\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,71:1\n1#2:72\n*E\n"})
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class InAppMessageJavascriptInterface extends JavascriptInterfaceBase {

    @NotNull
    private final IInAppMessageHtml inAppMessage;

    @NotNull
    private final InAppMessageUserJavascriptInterface user;
    private boolean wasCloseMessageCalled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessageJavascriptInterface(@NotNull Context context, @NotNull IInAppMessageHtml inAppMessage) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        this.inAppMessage = inAppMessage;
        this.user = new InAppMessageUserJavascriptInterface(context);
    }

    @JavascriptInterface
    public final void beforeMessageClosed() {
        this.wasCloseMessageCalled = true;
    }

    @JavascriptInterface
    @NotNull
    public final InAppMessageUserJavascriptInterface getUser() {
        return this.user;
    }

    public final boolean getWasCloseMessageCalled() {
        return this.wasCloseMessageCalled;
    }

    @Override // com.braze.ui.JavascriptInterfaceBase
    @JavascriptInterface
    public void logButtonClick(@Nullable String buttonId) {
        if (buttonId != null) {
            this.inAppMessage.logButtonClick(buttonId);
        }
    }

    @Override // com.braze.ui.JavascriptInterfaceBase
    @JavascriptInterface
    public void logClick() {
        this.inAppMessage.logClick();
    }

    @JavascriptInterface
    public final void requestPushPermission() {
        BrazeInAppMessageManager.INSTANCE.getInstance().setShouldNextUnregisterBeSkipped(true);
        BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, 75L, null, new InAppMessageJavascriptInterface$requestPushPermission$1(this, null), 2, null);
    }
}
