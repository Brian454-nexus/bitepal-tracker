package com.braze.models.inappmessage;

import com.braze.enums.inappmessage.MessageType;
import com.braze.events.internal.f0;
import com.braze.managers.c0;
import com.braze.managers.m;
import com.braze.models.inappmessage.InAppMessageHtmlBase;
import com.braze.support.BrazeLogger;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\f2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R$\u0010\u0015\u001a\u0004\u0018\u00010\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0016¨\u0006\u001e"}, d2 = {"Lcom/braze/models/inappmessage/InAppMessageHtmlBase;", "Lcom/braze/models/inappmessage/InAppMessageBase;", "Lcom/braze/models/inappmessage/IInAppMessageHtml;", "Lorg/json/JSONObject;", "jsonObject", "Lcom/braze/managers/c0;", "brazeManager", "<init>", "(Lorg/json/JSONObject;Lcom/braze/managers/c0;)V", "", "", "remotePathToLocalAssetMap", "", "setLocalPrefetchedAssetPaths", "(Ljava/util/Map;)V", "buttonId", "", "logButtonClick", "(Ljava/lang/String;)Z", "onAfterClosed", "()V", "localAssetsDirectoryUrl", "Ljava/lang/String;", "getLocalAssetsDirectoryUrl", "()Ljava/lang/String;", "setLocalAssetsDirectoryUrl", "(Ljava/lang/String;)V", "wasButtonClickLogged", "Z", "buttonIdClicked", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class InAppMessageHtmlBase extends InAppMessageBase implements IInAppMessageHtml {
    private String buttonIdClicked;
    private String localAssetsDirectoryUrl;
    private boolean wasButtonClickLogged;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessageHtmlBase(JSONObject jsonObject, c0 brazeManager) {
        super(jsonObject, brazeManager, false, false, 12, null);
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        setOpenUriInWebView(jsonObject.optBoolean("use_webview", true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logButtonClick$lambda$0(String str) {
        return com.braze.j.a("Trigger id not found (this is expected for test sends). Not logging html in-app message button click for id: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logButtonClick$lambda$1() {
        return "Button Id was null or blank for this html in-app message. Ignoring.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logButtonClick$lambda$2() {
        return "Button click already logged for this html in-app message. Ignoring.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logButtonClick$lambda$3() {
        return "Cannot log an html in-app message button click because the BrazeManager is null.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logButtonClick$lambda$5(String str, String str2) {
        return "Logged button click for button id: " + str + " and trigger id: " + str2;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageHtml
    public String getLocalAssetsDirectoryUrl() {
        return this.localAssetsDirectoryUrl;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageHtml
    public boolean logButtonClick(final String buttonId) {
        Intrinsics.checkNotNullParameter(buttonId, "buttonId");
        final String triggerId = getTriggerId();
        c0 brazeManager = getBrazeManager();
        if (triggerId == null || triggerId.length() == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: d4.s
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String logButtonClick$lambda$0;
                    logButtonClick$lambda$0 = InAppMessageHtmlBase.logButtonClick$lambda$0(buttonId);
                    return logButtonClick$lambda$0;
                }
            }, 7, (Object) null);
            return false;
        }
        if (StringsKt.isBlank(buttonId)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: d4.o
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String logButtonClick$lambda$1;
                    logButtonClick$lambda$1 = InAppMessageHtmlBase.logButtonClick$lambda$1();
                    return logButtonClick$lambda$1;
                }
            }, 6, (Object) null);
            return false;
        }
        if (this.wasButtonClickLogged && getMessageType() != MessageType.HTML) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: d4.p
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String logButtonClick$lambda$2;
                    logButtonClick$lambda$2 = InAppMessageHtmlBase.logButtonClick$lambda$2();
                    return logButtonClick$lambda$2;
                }
            }, 6, (Object) null);
            return false;
        }
        if (brazeManager == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: d4.q
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String logButtonClick$lambda$3;
                    logButtonClick$lambda$3 = InAppMessageHtmlBase.logButtonClick$lambda$3();
                    return logButtonClick$lambda$3;
                }
            }, 6, (Object) null);
            return false;
        }
        com.braze.models.i i6 = com.braze.models.outgoing.event.b.f12605g.i(triggerId, buttonId);
        if (i6 != null) {
            ((m) brazeManager).a(i6);
        }
        this.buttonIdClicked = buttonId;
        this.wasButtonClickLogged = true;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: d4.r
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String logButtonClick$lambda$5;
                logButtonClick$lambda$5 = InAppMessageHtmlBase.logButtonClick$lambda$5(buttonId, triggerId);
                return logButtonClick$lambda$5;
            }
        }, 7, (Object) null);
        return true;
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.inappmessage.IInAppMessage
    public void onAfterClosed() {
        String triggerId;
        String str;
        c0 brazeManager;
        super.onAfterClosed();
        if (!this.wasButtonClickLogged || (triggerId = getTriggerId()) == null || StringsKt.isBlank(triggerId) || (str = this.buttonIdClicked) == null || StringsKt.isBlank(str) || (brazeManager = getBrazeManager()) == null) {
            return;
        }
        com.braze.triggers.events.d triggerEvent = new com.braze.triggers.events.d(getTriggerId(), this.buttonIdClicked);
        Intrinsics.checkNotNullParameter(triggerEvent, "triggerEvent");
        ((m) brazeManager).f12454d.b(new f0(triggerEvent), f0.class);
    }

    @Override // com.braze.models.inappmessage.IInAppMessageHtml
    public void setLocalAssetsDirectoryUrl(String str) {
        this.localAssetsDirectoryUrl = str;
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.inappmessage.IInAppMessage
    public void setLocalPrefetchedAssetPaths(Map<String, String> remotePathToLocalAssetMap) {
        Intrinsics.checkNotNullParameter(remotePathToLocalAssetMap, "remotePathToLocalAssetMap");
        if (remotePathToLocalAssetMap.isEmpty()) {
            return;
        }
        setLocalAssetsDirectoryUrl(((String[]) remotePathToLocalAssetMap.values().toArray(new String[0]))[0]);
    }
}
