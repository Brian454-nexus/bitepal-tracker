package com.braze.models.inappmessage;

import android.graphics.Color;
import com.braze.enums.inappmessage.ImageStyle;
import com.braze.enums.inappmessage.TextAlign;
import com.braze.events.internal.f0;
import com.braze.managers.c0;
import com.braze.managers.m;
import com.braze.models.inappmessage.InAppMessageImmersiveBase;
import com.braze.support.BrazeLogger;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\b\u001c\b'\u0018\u0000 E2\u00020\u00012\u00020\u0002:\u0001FB\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bBI\b\u0012\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0007\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\f\u001a\u00020\u000b8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010\r\u001a\u00020\u000b8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u001f\u001a\u0004\b$\u0010!\"\u0004\b%\u0010#R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R(\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00140+8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010\u000f\u001a\u00020\u000e8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000f\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u00107\u001a\u0004\u0018\u00010\u000b8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010\u0011\u001a\u00020\u00108\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0016\u0010B\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010D\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010&¨\u0006G"}, d2 = {"Lcom/braze/models/inappmessage/InAppMessageImmersiveBase;", "Lcom/braze/models/inappmessage/InAppMessageWithImageBase;", "Lcom/braze/models/inappmessage/IInAppMessageImmersive;", "Lorg/json/JSONObject;", "jsonObject", "Lcom/braze/managers/c0;", "brazeManager", "<init>", "(Lorg/json/JSONObject;Lcom/braze/managers/c0;)V", "", "header", "", "headerTextColor", "closeButtonColor", "Lcom/braze/enums/inappmessage/ImageStyle;", "imageStyle", "Lcom/braze/enums/inappmessage/TextAlign;", "headerTextAlign", "messageTextAlign", "(Lorg/json/JSONObject;Lcom/braze/managers/c0;Ljava/lang/String;IILcom/braze/enums/inappmessage/ImageStyle;Lcom/braze/enums/inappmessage/TextAlign;Lcom/braze/enums/inappmessage/TextAlign;)V", "Lcom/braze/models/inappmessage/MessageButton;", "messageButton", "", "logButtonClick", "(Lcom/braze/models/inappmessage/MessageButton;)Z", "", "onAfterClosed", "()V", "enableDarkTheme", "forJsonPut", "()Lorg/json/JSONObject;", "I", "getHeaderTextColor", "()I", "setHeaderTextColor", "(I)V", "getCloseButtonColor", "setCloseButtonColor", "Ljava/lang/String;", "getHeader", "()Ljava/lang/String;", "setHeader", "(Ljava/lang/String;)V", "", "messageButtons", "Ljava/util/List;", "getMessageButtons", "()Ljava/util/List;", "setMessageButtons", "(Ljava/util/List;)V", "Lcom/braze/enums/inappmessage/ImageStyle;", "getImageStyle", "()Lcom/braze/enums/inappmessage/ImageStyle;", "setImageStyle", "(Lcom/braze/enums/inappmessage/ImageStyle;)V", "frameColor", "Ljava/lang/Integer;", "getFrameColor", "()Ljava/lang/Integer;", "setFrameColor", "(Ljava/lang/Integer;)V", "Lcom/braze/enums/inappmessage/TextAlign;", "getHeaderTextAlign", "()Lcom/braze/enums/inappmessage/TextAlign;", "setHeaderTextAlign", "(Lcom/braze/enums/inappmessage/TextAlign;)V", "wasButtonClickLogged", "Z", "buttonIdClicked", "Companion", "com/braze/models/inappmessage/f", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class InAppMessageImmersiveBase extends InAppMessageWithImageBase implements IInAppMessageImmersive {
    public static final f Companion = new f();
    private String buttonIdClicked;
    private int closeButtonColor;
    private Integer frameColor;
    private String header;
    private TextAlign headerTextAlign;
    private int headerTextColor;
    private ImageStyle imageStyle;
    private List<? extends MessageButton> messageButtons;
    private boolean wasButtonClickLogged;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public InAppMessageImmersiveBase(org.json.JSONObject r18, com.braze.managers.c0 r19) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.models.inappmessage.InAppMessageImmersiveBase.<init>(org.json.JSONObject, com.braze.managers.c0):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String enableDarkTheme$lambda$5() {
        return "Cannot apply dark theme with a null themes wrapper";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logButtonClick$lambda$1() {
        return "Trigger id not found (this is expected for test sends). Not logging button click.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logButtonClick$lambda$2() {
        return "Button click already logged for this message. Ignoring.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logButtonClick$lambda$3() {
        return "Cannot log a button click because the BrazeManager is null.";
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.inappmessage.IInAppMessageThemeable
    public void enableDarkTheme() {
        super.enableDarkTheme();
        com.braze.models.theme.a inAppMessageDarkThemeWrapper = getInAppMessageDarkThemeWrapper();
        if (inAppMessageDarkThemeWrapper == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: d4.t
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String enableDarkTheme$lambda$5;
                    enableDarkTheme$lambda$5 = InAppMessageImmersiveBase.enableDarkTheme$lambda$5();
                    return enableDarkTheme$lambda$5;
                }
            }, 7, (Object) null);
            return;
        }
        Integer num = inAppMessageDarkThemeWrapper.f12719g;
        if (num != null) {
            setFrameColor(num);
        }
        Integer num2 = inAppMessageDarkThemeWrapper.f12715c;
        if (num2 != null) {
            setCloseButtonColor(num2.intValue());
        }
        Integer num3 = inAppMessageDarkThemeWrapper.f12718f;
        if (num3 != null) {
            setHeaderTextColor(num3.intValue());
        }
        Iterator<MessageButton> it = getMessageButtons().iterator();
        while (it.hasNext()) {
            it.next().enableDarkTheme();
        }
    }

    @Override // com.braze.models.inappmessage.InAppMessageWithImageBase, com.braze.models.inappmessage.InAppMessageBase, com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public JSONObject getKey() {
        JSONObject jsonObject = getJsonObject();
        if (jsonObject != null) {
            return jsonObject;
        }
        JSONObject key = super.getKey();
        try {
            key.putOpt("header", getHeader());
            key.put("header_text_color", getHeaderTextColor());
            key.put("close_btn_color", getCloseButtonColor());
            key.putOpt("image_style", getImageStyle().toString());
            key.putOpt("text_align_header", getHeaderTextAlign().toString());
            Integer frameColor = getFrameColor();
            if (frameColor != null) {
                key.put("frame_color", frameColor.intValue());
            }
            JSONArray jSONArray = new JSONArray();
            Iterator<MessageButton> it = getMessageButtons().iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().getKey());
            }
            key.put("btns", jSONArray);
        } catch (JSONException unused) {
        }
        return key;
    }

    public int getCloseButtonColor() {
        return this.closeButtonColor;
    }

    public Integer getFrameColor() {
        return this.frameColor;
    }

    public String getHeader() {
        return this.header;
    }

    public TextAlign getHeaderTextAlign() {
        return this.headerTextAlign;
    }

    public int getHeaderTextColor() {
        return this.headerTextColor;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public ImageStyle getImageStyle() {
        return this.imageStyle;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public List<MessageButton> getMessageButtons() {
        return this.messageButtons;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public boolean logButtonClick(MessageButton messageButton) {
        Intrinsics.checkNotNullParameter(messageButton, "messageButton");
        c0 brazeManager = getBrazeManager();
        String triggerId = getTriggerId();
        if (triggerId == null || StringsKt.isBlank(triggerId)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: d4.w
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String logButtonClick$lambda$1;
                    logButtonClick$lambda$1 = InAppMessageImmersiveBase.logButtonClick$lambda$1();
                    return logButtonClick$lambda$1;
                }
            }, 7, (Object) null);
            return false;
        }
        if (this.wasButtonClickLogged) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: d4.u
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String logButtonClick$lambda$2;
                    logButtonClick$lambda$2 = InAppMessageImmersiveBase.logButtonClick$lambda$2();
                    return logButtonClick$lambda$2;
                }
            }, 6, (Object) null);
            return false;
        }
        if (brazeManager == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: d4.v
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String logButtonClick$lambda$3;
                    logButtonClick$lambda$3 = InAppMessageImmersiveBase.logButtonClick$lambda$3();
                    return logButtonClick$lambda$3;
                }
            }, 6, (Object) null);
            return false;
        }
        this.buttonIdClicked = messageButton.getStringId();
        com.braze.models.outgoing.event.a aVar = com.braze.models.outgoing.event.b.f12605g;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(triggerId, "triggerId");
        Intrinsics.checkNotNullParameter(messageButton, "messageButton");
        com.braze.models.i i6 = aVar.i(triggerId, messageButton.getStringId());
        if (i6 != null) {
            ((m) brazeManager).a(i6);
        }
        this.wasButtonClickLogged = true;
        return true;
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.inappmessage.IInAppMessage
    public void onAfterClosed() {
        String triggerId;
        String str;
        super.onAfterClosed();
        c0 brazeManager = getBrazeManager();
        if (!this.wasButtonClickLogged || (triggerId = getTriggerId()) == null || StringsKt.isBlank(triggerId) || (str = this.buttonIdClicked) == null || StringsKt.isBlank(str) || brazeManager == null) {
            return;
        }
        com.braze.triggers.events.d triggerEvent = new com.braze.triggers.events.d(getTriggerId(), this.buttonIdClicked);
        Intrinsics.checkNotNullParameter(triggerEvent, "triggerEvent");
        ((m) brazeManager).f12454d.b(new f0(triggerEvent), f0.class);
    }

    public void setCloseButtonColor(int i6) {
        this.closeButtonColor = i6;
    }

    public void setFrameColor(Integer num) {
        this.frameColor = num;
    }

    public void setHeader(String str) {
        this.header = str;
    }

    public void setHeaderTextAlign(TextAlign textAlign) {
        Intrinsics.checkNotNullParameter(textAlign, "<set-?>");
        this.headerTextAlign = textAlign;
    }

    public void setHeaderTextColor(int i6) {
        this.headerTextColor = i6;
    }

    public void setImageStyle(ImageStyle imageStyle) {
        Intrinsics.checkNotNullParameter(imageStyle, "<set-?>");
        this.imageStyle = imageStyle;
    }

    public void setMessageButtons(List<? extends MessageButton> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.messageButtons = list;
    }

    private InAppMessageImmersiveBase(JSONObject jSONObject, c0 c0Var, String str, int i6, int i7, ImageStyle imageStyle, TextAlign textAlign, TextAlign textAlign2) {
        super(jSONObject, c0Var);
        this.headerTextColor = Color.parseColor("#333333");
        this.closeButtonColor = Color.parseColor("#9B9B9B");
        this.messageButtons = CollectionsKt.emptyList();
        this.imageStyle = ImageStyle.TOP;
        this.headerTextAlign = TextAlign.CENTER;
        setHeader(str);
        setHeaderTextColor(i6);
        setCloseButtonColor(i7);
        if (jSONObject.has("frame_color")) {
            setFrameColor(Integer.valueOf(jSONObject.optInt("frame_color")));
        }
        setImageStyle(imageStyle);
        setHeaderTextAlign(textAlign);
        setMessageTextAlign(textAlign2);
    }
}
