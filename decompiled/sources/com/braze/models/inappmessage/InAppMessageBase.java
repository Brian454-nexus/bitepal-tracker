package com.braze.models.inappmessage;

import android.graphics.Color;
import android.net.Uri;
import com.braze.enums.inappmessage.ClickAction;
import com.braze.enums.inappmessage.CropType;
import com.braze.enums.inappmessage.DismissType;
import com.braze.enums.inappmessage.MessageType;
import com.braze.enums.inappmessage.Orientation;
import com.braze.enums.inappmessage.TextAlign;
import com.braze.managers.c0;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.braze.support.n;
import ga.L;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0015\b'\u0018\u0000 \u009a\u00012\u00020\u00012\u00020\u0002:\u0002\u009b\u0001B-\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001c\u001a\u00020\u00132\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R$\u0010&\u001a\u0004\u0018\u00010\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u0010,\u001a\u0004\u0018\u00010\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b,\u0010'\u001a\u0004\b-\u0010)\"\u0004\b.\u0010+R(\u0010/\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b/\u00100\u0012\u0004\b4\u0010\u0015\u001a\u0004\b1\u0010\u0011\"\u0004\b2\u00103R.\u00105\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u001a8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010\u001dR(\u0010:\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b:\u00100\u0012\u0004\b=\u0010\u0015\u001a\u0004\b;\u0010\u0011\"\u0004\b<\u00103R(\u0010>\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b>\u00100\u0012\u0004\bA\u0010\u0015\u001a\u0004\b?\u0010\u0011\"\u0004\b@\u00103R\"\u0010C\u001a\u00020B8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR*\u0010K\u001a\u00020I2\u0006\u0010J\u001a\u00020I8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010R\u001a\u00020Q8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010Y\u001a\u00020X8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010`\u001a\u00020_8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\"\u0010g\u001a\u00020f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\"\u0010m\u001a\u00020I8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\bm\u0010L\u001a\u0004\bn\u0010N\"\u0004\bo\u0010PR\"\u0010p\u001a\u00020I8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\bp\u0010L\u001a\u0004\bq\u0010N\"\u0004\br\u0010PR\"\u0010s\u001a\u00020I8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\bs\u0010L\u001a\u0004\bt\u0010N\"\u0004\bu\u0010PR\"\u0010v\u001a\u00020I8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\bv\u0010L\u001a\u0004\bw\u0010N\"\u0004\bx\u0010PR\"\u0010y\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\by\u00100\u001a\u0004\by\u0010\u0011\"\u0004\bz\u00103R\u0014\u0010\b\u001a\u00020{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010|R\u0014\u0010\t\u001a\u00020{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010|R&\u0010}\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b}\u0010~\u001a\u0004\b\u007f\u0010\u001f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R)\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u0006\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R,\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0087\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R(\u0010\u008e\u0001\u001a\u0004\u0018\u00010\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0015\n\u0005\b\u008e\u0001\u0010'\u001a\u0005\b\u008f\u0001\u0010)\"\u0005\b\u0090\u0001\u0010+R\u0017\u0010\u0093\u0001\u001a\u00020 8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0019\u0010\u0096\u0001\u001a\u0004\u0018\u00010#8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0016\u0010\u0097\u0001\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0097\u0001\u0010\u0011R\u0015\u0010\u0099\u0001\u001a\u0004\u0018\u00010\f8F¢\u0006\u0007\u001a\u0005\b\u0098\u0001\u0010)¨\u0006\u009c\u0001"}, d2 = {"Lcom/braze/models/inappmessage/InAppMessageBase;", "Lcom/braze/models/inappmessage/IInAppMessage;", "Lcom/braze/models/inappmessage/IInAppMessageThemeable;", "Lorg/json/JSONObject;", "json", "Lcom/braze/managers/c0;", "brazeManager", "", "impressionLogged", "clickLogged", "<init>", "(Lorg/json/JSONObject;Lcom/braze/managers/c0;ZZ)V", "", "buttonId", "handleLogClick", "(Ljava/lang/String;)Z", "logImpression", "()Z", "logClick", "", "onAfterClosed", "()V", "enableDarkTheme", "", "getRemoteAssetPathsForPrefetch", "()Ljava/util/List;", "", "remotePathToLocalAssetMap", "setLocalPrefetchedAssetPaths", "(Ljava/util/Map;)V", "forJsonPut", "()Lorg/json/JSONObject;", "Lcom/braze/enums/inappmessage/ClickAction;", "internalClickAction", "Lcom/braze/enums/inappmessage/ClickAction;", "Landroid/net/Uri;", "internalUri", "Landroid/net/Uri;", "message", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "icon", "getIcon", "setIcon", "openUriInWebView", "Z", "getOpenUriInWebView", "setOpenUriInWebView", "(Z)V", "getOpenUriInWebView$annotations", "extras", "Ljava/util/Map;", "getExtras", "()Ljava/util/Map;", "setExtras", "animateIn", "getAnimateIn", "setAnimateIn", "getAnimateIn$annotations", "animateOut", "getAnimateOut", "setAnimateOut", "getAnimateOut$annotations", "Lcom/braze/enums/inappmessage/DismissType;", "dismissType", "Lcom/braze/enums/inappmessage/DismissType;", "getDismissType", "()Lcom/braze/enums/inappmessage/DismissType;", "setDismissType", "(Lcom/braze/enums/inappmessage/DismissType;)V", "", com.amazon.a.a.o.b.f11195Y, "durationInMilliseconds", "I", "getDurationInMilliseconds", "()I", "setDurationInMilliseconds", "(I)V", "Lcom/braze/enums/inappmessage/Orientation;", "orientation", "Lcom/braze/enums/inappmessage/Orientation;", "getOrientation", "()Lcom/braze/enums/inappmessage/Orientation;", "setOrientation", "(Lcom/braze/enums/inappmessage/Orientation;)V", "Lcom/braze/enums/inappmessage/CropType;", "cropType", "Lcom/braze/enums/inappmessage/CropType;", "getCropType", "()Lcom/braze/enums/inappmessage/CropType;", "setCropType", "(Lcom/braze/enums/inappmessage/CropType;)V", "Lcom/braze/enums/inappmessage/TextAlign;", "messageTextAlign", "Lcom/braze/enums/inappmessage/TextAlign;", "getMessageTextAlign", "()Lcom/braze/enums/inappmessage/TextAlign;", "setMessageTextAlign", "(Lcom/braze/enums/inappmessage/TextAlign;)V", "", "expirationTimestamp", "J", "getExpirationTimestamp", "()J", "setExpirationTimestamp", "(J)V", "iconBackgroundColor", "getIconBackgroundColor", "setIconBackgroundColor", "messageTextColor", "getMessageTextColor", "setMessageTextColor", "backgroundColor", "getBackgroundColor", "setBackgroundColor", "iconColor", "getIconColor", "setIconColor", "isTestSend", "setTestSend", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "jsonObject", "Lorg/json/JSONObject;", "getJsonObject", "setJsonObject", "(Lorg/json/JSONObject;)V", "Lcom/braze/managers/c0;", "getBrazeManager", "()Lcom/braze/managers/c0;", "setBrazeManager", "(Lcom/braze/managers/c0;)V", "Lcom/braze/models/theme/a;", "inAppMessageDarkThemeWrapper", "Lcom/braze/models/theme/a;", "getInAppMessageDarkThemeWrapper", "()Lcom/braze/models/theme/a;", "setInAppMessageDarkThemeWrapper", "(Lcom/braze/models/theme/a;)V", "messageExtras", "getMessageExtras", "setMessageExtras", "getClickAction", "()Lcom/braze/enums/inappmessage/ClickAction;", "clickAction", "getUri", "()Landroid/net/Uri;", "uri", "isControl", "getTriggerId", "triggerId", "Companion", "com/braze/models/inappmessage/a", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class InAppMessageBase implements IInAppMessage, IInAppMessageThemeable {
    public static final a Companion = new a();
    private boolean animateIn;
    private boolean animateOut;
    private int backgroundColor;
    private c0 brazeManager;
    private final AtomicBoolean clickLogged;
    private CropType cropType;
    private DismissType dismissType;
    private int durationInMilliseconds;
    private long expirationTimestamp;
    private Map<String, String> extras;
    private String icon;
    private int iconBackgroundColor;
    private int iconColor;
    private final AtomicBoolean impressionLogged;
    private com.braze.models.theme.a inAppMessageDarkThemeWrapper;
    private ClickAction internalClickAction;
    private Uri internalUri;
    private boolean isTestSend;
    private JSONObject jsonObject;
    private String message;
    private String messageExtras;
    private TextAlign messageTextAlign;
    private int messageTextColor;
    private boolean openUriInWebView;
    private Orientation orientation;

    public /* synthetic */ InAppMessageBase(JSONObject jSONObject, c0 c0Var, boolean z6, boolean z7, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(jSONObject, c0Var, (i6 & 4) != 0 ? false : z6, (i6 & 8) != 0 ? false : z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_durationInMilliseconds_$lambda$0(int i6) {
        return "Requested in-app message duration " + i6 + " is lower than the minimum of 999. Defaulting to 5000 milliseconds.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_durationInMilliseconds_$lambda$1(int i6) {
        return "Set in-app message duration to " + i6 + " milliseconds.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String enableDarkTheme$lambda$6() {
        return "Cannot apply dark theme with a null themes wrapper";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String forJsonPut$lambda$9() {
        return "Failed to construct json for in-app message";
    }

    private final boolean handleLogClick(String buttonId) {
        String triggerId = getTriggerId();
        if (triggerId == null || StringsKt.isBlank(triggerId)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: d4.j
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String handleLogClick$lambda$10;
                    handleLogClick$lambda$10 = InAppMessageBase.handleLogClick$lambda$10();
                    return handleLogClick$lambda$10;
                }
            }, 7, (Object) null);
            return false;
        }
        c0 c0Var = this.brazeManager;
        if (c0Var == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: d4.h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String handleLogClick$lambda$11;
                    handleLogClick$lambda$11 = InAppMessageBase.handleLogClick$lambda$11();
                    return handleLogClick$lambda$11;
                }
            }, 6, (Object) null);
            return false;
        }
        if (getMessageType() != MessageType.HTML && this.clickLogged.get()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: d4.i
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String handleLogClick$lambda$12;
                    handleLogClick$lambda$12 = InAppMessageBase.handleLogClick$lambda$12();
                    return handleLogClick$lambda$12;
                }
            }, 6, (Object) null);
            return false;
        }
        this.clickLogged.set(true);
        ga.i.d(com.braze.coroutine.f.f12131a, (CoroutineContext) null, (L) null, new b(buttonId, triggerId, c0Var, null), 3, (Object) null);
        return true;
    }

    public static /* synthetic */ boolean handleLogClick$default(InAppMessageBase inAppMessageBase, String str, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleLogClick");
        }
        if ((i6 & 1) != 0) {
            str = null;
        }
        return inAppMessageBase.handleLogClick(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleLogClick$lambda$10() {
        return "Trigger id not found (this is expected for test sends). Not logging in-app message click.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleLogClick$lambda$11() {
        return "Cannot log an in-app message click because the BrazeManager is null.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleLogClick$lambda$12() {
        return "Click already logged for this in-app message. Ignoring.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logImpression$lambda$3() {
        return "Trigger id not found (this is expected for test sends). Not logging in-app message impression.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logImpression$lambda$4() {
        return "Cannot log an in-app message impression because the BrazeManager is null.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logImpression$lambda$5() {
        return "Impression already logged for this in-app message. Ignoring.";
    }

    @Override // com.braze.models.inappmessage.IInAppMessageThemeable
    public void enableDarkTheme() {
        com.braze.models.theme.a aVar = this.inAppMessageDarkThemeWrapper;
        if (aVar == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: d4.g
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String enableDarkTheme$lambda$6;
                    enableDarkTheme$lambda$6 = InAppMessageBase.enableDarkTheme$lambda$6();
                    return enableDarkTheme$lambda$6;
                }
            }, 7, (Object) null);
            return;
        }
        Integer num = aVar.f12713a;
        if (num != null) {
            setBackgroundColor(num.intValue());
        }
        Integer num2 = aVar.f12716d;
        if (num2 != null) {
            setIconColor(num2.intValue());
        }
        Integer num3 = aVar.f12717e;
        if (num3 != null) {
            setIconBackgroundColor(num3.intValue());
        }
        Integer num4 = aVar.f12714b;
        if (num4 != null) {
            setMessageTextColor(num4.intValue());
        }
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public boolean getAnimateIn() {
        return this.animateIn;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public boolean getAnimateOut() {
        return this.animateOut;
    }

    public int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final c0 getBrazeManager() {
        return this.brazeManager;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    /* renamed from: getClickAction, reason: from getter */
    public ClickAction getInternalClickAction() {
        return this.internalClickAction;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public CropType getCropType() {
        return this.cropType;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public DismissType getDismissType() {
        return this.dismissType;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public int getDurationInMilliseconds() {
        return this.durationInMilliseconds;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public long getExpirationTimestamp() {
        return this.expirationTimestamp;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public Map<String, String> getExtras() {
        return this.extras;
    }

    public String getIcon() {
        return this.icon;
    }

    public int getIconBackgroundColor() {
        return this.iconBackgroundColor;
    }

    public int getIconColor() {
        return this.iconColor;
    }

    public final com.braze.models.theme.a getInAppMessageDarkThemeWrapper() {
        return this.inAppMessageDarkThemeWrapper;
    }

    public final JSONObject getJsonObject() {
        return this.jsonObject;
    }

    public String getMessage() {
        return this.message;
    }

    public String getMessageExtras() {
        return this.messageExtras;
    }

    public TextAlign getMessageTextAlign() {
        return this.messageTextAlign;
    }

    public int getMessageTextColor() {
        return this.messageTextColor;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public boolean getOpenUriInWebView() {
        return this.openUriInWebView;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public Orientation getOrientation() {
        return this.orientation;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public List<String> getRemoteAssetPathsForPrefetch() {
        return CollectionsKt.emptyList();
    }

    public final String getTriggerId() {
        JSONObject jSONObject = this.jsonObject;
        if (jSONObject != null) {
            return jSONObject.optString("trigger_id");
        }
        return null;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    /* renamed from: getUri, reason: from getter */
    public Uri getInternalUri() {
        return this.internalUri;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public boolean isControl() {
        JSONObject jSONObject = this.jsonObject;
        return jSONObject != null && jSONObject.optBoolean("is_control");
    }

    /* renamed from: isTestSend, reason: from getter */
    public boolean getIsTestSend() {
        return this.isTestSend;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public boolean logClick() {
        return handleLogClick$default(this, null, 1, null);
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public boolean logImpression() {
        String triggerId = getTriggerId();
        if (triggerId == null || StringsKt.isBlank(triggerId)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12980D, (Throwable) null, false, new Function0() { // from class: d4.f
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String logImpression$lambda$3;
                    logImpression$lambda$3 = InAppMessageBase.logImpression$lambda$3();
                    return logImpression$lambda$3;
                }
            }, 6, (Object) null);
            return false;
        }
        c0 c0Var = this.brazeManager;
        if (c0Var == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: d4.d
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String logImpression$lambda$4;
                    logImpression$lambda$4 = InAppMessageBase.logImpression$lambda$4();
                    return logImpression$lambda$4;
                }
            }, 6, (Object) null);
            return false;
        }
        if (this.impressionLogged.get()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: d4.e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String logImpression$lambda$5;
                    logImpression$lambda$5 = InAppMessageBase.logImpression$lambda$5();
                    return logImpression$lambda$5;
                }
            }, 6, (Object) null);
            return false;
        }
        this.impressionLogged.set(true);
        ga.i.d(com.braze.coroutine.f.f12131a, (CoroutineContext) null, (L) null, new c(triggerId, this, c0Var, null), 3, (Object) null);
        return true;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void onAfterClosed() {
        String triggerId = getTriggerId();
        if (triggerId == null || triggerId.length() == 0) {
            return;
        }
        ga.i.d(com.braze.coroutine.f.f12131a, (CoroutineContext) null, (L) null, new d(this, null), 3, (Object) null);
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setAnimateIn(boolean z6) {
        this.animateIn = z6;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setAnimateOut(boolean z6) {
        this.animateOut = z6;
    }

    public void setBackgroundColor(int i6) {
        this.backgroundColor = i6;
    }

    public void setCropType(CropType cropType) {
        Intrinsics.checkNotNullParameter(cropType, "<set-?>");
        this.cropType = cropType;
    }

    public void setDismissType(DismissType dismissType) {
        Intrinsics.checkNotNullParameter(dismissType, "<set-?>");
        this.dismissType = dismissType;
    }

    public void setDurationInMilliseconds(final int i6) {
        if (i6 < 999) {
            this.durationInMilliseconds = 5000;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: d4.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String _set_durationInMilliseconds_$lambda$0;
                    _set_durationInMilliseconds_$lambda$0 = InAppMessageBase._set_durationInMilliseconds_$lambda$0(i6);
                    return _set_durationInMilliseconds_$lambda$0;
                }
            }, 7, (Object) null);
        } else {
            this.durationInMilliseconds = i6;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: d4.c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String _set_durationInMilliseconds_$lambda$1;
                    _set_durationInMilliseconds_$lambda$1 = InAppMessageBase._set_durationInMilliseconds_$lambda$1(i6);
                    return _set_durationInMilliseconds_$lambda$1;
                }
            }, 7, (Object) null);
        }
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setExpirationTimestamp(long j6) {
        this.expirationTimestamp = j6;
    }

    public void setExtras(Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.extras = map;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public void setIconBackgroundColor(int i6) {
        this.iconBackgroundColor = i6;
    }

    public void setIconColor(int i6) {
        this.iconColor = i6;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setLocalPrefetchedAssetPaths(Map<String, String> remotePathToLocalAssetMap) {
        Intrinsics.checkNotNullParameter(remotePathToLocalAssetMap, "remotePathToLocalAssetMap");
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setMessageExtras(String str) {
        this.messageExtras = str;
    }

    public void setMessageTextAlign(TextAlign textAlign) {
        Intrinsics.checkNotNullParameter(textAlign, "<set-?>");
        this.messageTextAlign = textAlign;
    }

    public void setMessageTextColor(int i6) {
        this.messageTextColor = i6;
    }

    public void setOpenUriInWebView(boolean z6) {
        this.openUriInWebView = z6;
    }

    public void setOrientation(Orientation orientation) {
        Intrinsics.checkNotNullParameter(orientation, "<set-?>");
        this.orientation = orientation;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setTestSend(boolean z6) {
        this.isTestSend = z6;
    }

    public InAppMessageBase(JSONObject inAppMessageJson, c0 brazeManager, boolean z6, boolean z7) {
        String upperCase;
        String upperCase2;
        int i6;
        String upperCase3;
        int i7;
        Intrinsics.checkNotNullParameter(inAppMessageJson, "json");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        this.internalClickAction = ClickAction.NONE;
        this.extras = MapsKt.emptyMap();
        this.animateIn = true;
        this.animateOut = true;
        this.dismissType = DismissType.AUTO_DISMISS;
        this.durationInMilliseconds = 5000;
        Orientation orientation = Orientation.ANY;
        this.orientation = orientation;
        this.cropType = CropType.FIT_CENTER;
        this.messageTextAlign = TextAlign.CENTER;
        this.expirationTimestamp = -1L;
        this.iconBackgroundColor = Color.parseColor("#ff0073d5");
        this.messageTextColor = Color.parseColor("#555555");
        this.backgroundColor = -1;
        this.iconColor = -1;
        this.impressionLogged = new AtomicBoolean(false);
        this.clickLogged = new AtomicBoolean(false);
        this.jsonObject = inAppMessageJson;
        this.brazeManager = brazeManager;
        setMessage(inAppMessageJson.optString("message"));
        setAnimateIn(inAppMessageJson.optBoolean("animate_in", true));
        setAnimateOut(inAppMessageJson.optBoolean("animate_out", true));
        setDurationInMilliseconds(inAppMessageJson.optInt("duration"));
        setIcon(inAppMessageJson.optString("icon"));
        try {
            String string = inAppMessageJson.getString("orientation");
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            upperCase3 = string.toUpperCase(US);
            Intrinsics.checkNotNullExpressionValue(upperCase3, "toUpperCase(...)");
        } catch (Exception unused) {
        }
        for (Orientation orientation2 : Orientation.values()) {
            if (Intrinsics.areEqual(orientation2.name(), upperCase3)) {
                orientation = orientation2;
                setOrientation(orientation);
                setOpenUriInWebView(inAppMessageJson.optBoolean("use_webview", false));
                setIconBackgroundColor(inAppMessageJson.optInt("icon_bg_color"));
                setMessageTextColor(inAppMessageJson.optInt("text_color"));
                setBackgroundColor(inAppMessageJson.optInt("bg_color"));
                setIconColor(inAppMessageJson.optInt("icon_color"));
                this.impressionLogged.set(z6);
                this.clickLogged.set(z7);
                setExtras(JsonUtils.convertJSONObjectToMap(inAppMessageJson.optJSONObject("extras")));
                if (inAppMessageJson.has("message_extras")) {
                    setMessageExtras(inAppMessageJson.optString("message_extras"));
                }
                String optString = inAppMessageJson.optString("uri");
                ClickAction clickAction = ClickAction.NONE;
                try {
                    String string2 = inAppMessageJson.getString("click_action");
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    Locale US2 = Locale.US;
                    Intrinsics.checkNotNullExpressionValue(US2, "US");
                    upperCase2 = string2.toUpperCase(US2);
                    Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
                } catch (Exception unused2) {
                }
                for (ClickAction clickAction2 : ClickAction.values()) {
                    if (Intrinsics.areEqual(clickAction2.name(), upperCase2)) {
                        clickAction = clickAction2;
                        if (clickAction == ClickAction.URI && optString != null && !StringsKt.isBlank(optString)) {
                            this.internalUri = Uri.parse(optString);
                        }
                        this.internalClickAction = clickAction;
                        DismissType dismissType = DismissType.AUTO_DISMISS;
                        try {
                            String string3 = inAppMessageJson.getString("message_close");
                            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                            Locale US3 = Locale.US;
                            Intrinsics.checkNotNullExpressionValue(US3, "US");
                            upperCase = string3.toUpperCase(US3);
                            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                        } catch (Exception unused3) {
                        }
                        for (DismissType dismissType2 : DismissType.values()) {
                            if (Intrinsics.areEqual(dismissType2.name(), upperCase)) {
                                dismissType = dismissType2;
                                setDismissType(dismissType == DismissType.SWIPE ? DismissType.MANUAL : dismissType);
                                String str = n.f13002a;
                                Intrinsics.checkNotNullParameter(inAppMessageJson, "inAppMessageJson");
                                JSONObject optJSONObject = inAppMessageJson.optJSONObject("themes");
                                JSONObject optJSONObject2 = optJSONObject != null ? optJSONObject.optJSONObject("dark") : null;
                                this.inAppMessageDarkThemeWrapper = optJSONObject2 != null ? new com.braze.models.theme.a(optJSONObject2) : null;
                                inAppMessageJson.put("is_test_send", getIsTestSend());
                                return;
                            }
                        }
                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut, reason: avoid collision after fix types in other method */
    public JSONObject getPropertiesJSONObject() {
        JSONObject jSONObject = this.jsonObject;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.putOpt("message", getMessage());
            jSONObject2.put("duration", getDurationInMilliseconds());
            jSONObject2.putOpt("trigger_id", getTriggerId());
            jSONObject2.putOpt("click_action", getInternalClickAction().toString());
            jSONObject2.putOpt("message_close", getDismissType().toString());
            if (getInternalUri() != null) {
                jSONObject2.put("uri", String.valueOf(getInternalUri()));
            }
            jSONObject2.put("use_webview", getOpenUriInWebView());
            jSONObject2.put("animate_in", getAnimateIn());
            jSONObject2.put("animate_out", getAnimateOut());
            jSONObject2.put("bg_color", getBackgroundColor());
            jSONObject2.put("text_color", getMessageTextColor());
            jSONObject2.put("icon_color", getIconColor());
            jSONObject2.put("icon_bg_color", getIconBackgroundColor());
            jSONObject2.putOpt("icon", getIcon());
            jSONObject2.putOpt("crop_type", getCropType().toString());
            jSONObject2.putOpt("orientation", getOrientation().toString());
            jSONObject2.putOpt("text_align_message", getMessageTextAlign().toString());
            jSONObject2.putOpt("is_control", Boolean.valueOf(isControl()));
            jSONObject2.put("is_test_send", getIsTestSend());
            if (!getExtras().isEmpty()) {
                jSONObject2.put("extras", getExtras());
                return jSONObject2;
            }
        } catch (JSONException e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: d4.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String forJsonPut$lambda$9;
                    forJsonPut$lambda$9 = InAppMessageBase.forJsonPut$lambda$9();
                    return forJsonPut$lambda$9;
                }
            }, 4, (Object) null);
        }
        return jSONObject2;
    }
}
