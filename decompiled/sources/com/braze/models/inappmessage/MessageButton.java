package com.braze.models.inappmessage;

import android.graphics.Color;
import android.net.Uri;
import com.braze.enums.inappmessage.ClickAction;
import com.braze.models.IPutIntoJson;
import com.braze.models.inappmessage.MessageButton;
import com.braze.support.BrazeLogger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0017\u0018\u0000 =2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0003:\u0001>B\u001d\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007Bc\b\u0012\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\b\b\u0001\u0010\u0010\u001a\u00020\t\u0012\b\b\u0001\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR$\u0010\n\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"R$\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010%R(\u0010\u000e\u001a\u0004\u0018\u00010&2\b\u0010\u001f\u001a\u0004\u0018\u00010&8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b(\u0010)R$\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010\u0010\u001a\u00020\t8G@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010 \u001a\u0004\b4\u0010\"\"\u0004\b5\u00106R\"\u0010\u0011\u001a\u00020\t8G@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010 \u001a\u0004\b7\u0010\"\"\u0004\b8\u00106R\"\u0010\u0014\u001a\u00020\t8G@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010 \u001a\u0004\b9\u0010\"\"\u0004\b:\u00106R\u0011\u0010<\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b;\u0010,¨\u0006?"}, d2 = {"Lcom/braze/models/inappmessage/MessageButton;", "Lcom/braze/models/IPutIntoJson;", "Lorg/json/JSONObject;", "Lcom/braze/models/inappmessage/IInAppMessageThemeable;", "jsonObject", "darkThemeObject", "<init>", "(Lorg/json/JSONObject;Lorg/json/JSONObject;)V", "darkThemeJsonObject", "", "id", "Lcom/braze/enums/inappmessage/ClickAction;", "clickAction", "", "uri", "text", "backgroundColor", "textColor", "", "openUriInWebview", "borderColor", "(Lorg/json/JSONObject;Lorg/json/JSONObject;ILcom/braze/enums/inappmessage/ClickAction;Ljava/lang/String;Ljava/lang/String;IIZI)V", "", "enableDarkTheme", "()V", "forJsonPut", "()Lorg/json/JSONObject;", "Lorg/json/JSONObject;", "Lcom/braze/models/theme/b;", "darkTheme", "Lcom/braze/models/theme/b;", com.amazon.a.a.o.b.f11195Y, "I", "getId", "()I", "Lcom/braze/enums/inappmessage/ClickAction;", "getClickAction", "()Lcom/braze/enums/inappmessage/ClickAction;", "Landroid/net/Uri;", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "Z", "getOpenUriInWebview", "()Z", "setOpenUriInWebview", "(Z)V", "getBackgroundColor", "setBackgroundColor", "(I)V", "getTextColor", "setTextColor", "getBorderColor", "setBorderColor", "getStringId", "stringId", "Companion", "com/braze/models/inappmessage/k", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class MessageButton implements IPutIntoJson<JSONObject>, IInAppMessageThemeable {
    public static final k Companion = new k();
    private static final String TAG = BrazeLogger.getBrazeLogTag((Class<?>) MessageButton.class);
    private int backgroundColor;
    private int borderColor;
    private ClickAction clickAction;
    private com.braze.models.theme.b darkTheme;
    private int id;
    private JSONObject jsonObject;
    private boolean openUriInWebview;
    private String text;
    private int textColor;
    private Uri uri;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MessageButton(org.json.JSONObject r14, org.json.JSONObject r15) {
        /*
            r13 = this;
            java.lang.String r0 = "jsonObject"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "id"
            r1 = -1
            int r5 = r14.optInt(r0, r1)
            java.lang.String r0 = "click_action"
            com.braze.enums.inappmessage.ClickAction r1 = com.braze.enums.inappmessage.ClickAction.NEWS_FEED
            r2 = 0
            java.lang.String r0 = r14.getString(r0)     // Catch: java.lang.Exception -> L4b
            java.lang.String r3 = "getString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)     // Catch: java.lang.Exception -> L4b
            java.util.Locale r3 = java.util.Locale.US     // Catch: java.lang.Exception -> L4b
            java.lang.String r4 = "US"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)     // Catch: java.lang.Exception -> L4b
            java.lang.String r0 = r0.toUpperCase(r3)     // Catch: java.lang.Exception -> L4b
            java.lang.String r3 = "toUpperCase(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)     // Catch: java.lang.Exception -> L4b
            com.braze.enums.inappmessage.ClickAction[] r3 = com.braze.enums.inappmessage.ClickAction.values()     // Catch: java.lang.Exception -> L4b
            int r4 = r3.length     // Catch: java.lang.Exception -> L4b
            r6 = r2
        L30:
            if (r6 >= r4) goto L43
            r7 = r3[r6]     // Catch: java.lang.Exception -> L4b
            java.lang.String r8 = r7.name()     // Catch: java.lang.Exception -> L4b
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r0)     // Catch: java.lang.Exception -> L4b
            if (r8 == 0) goto L40
            r6 = r7
            goto L4c
        L40:
            int r6 = r6 + 1
            goto L30
        L43:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch: java.lang.Exception -> L4b
            java.lang.String r3 = "Array contains no element matching the predicate."
            r0.<init>(r3)     // Catch: java.lang.Exception -> L4b
            throw r0     // Catch: java.lang.Exception -> L4b
        L4b:
            r6 = r1
        L4c:
            java.lang.String r0 = "uri"
            java.lang.String r7 = r14.optString(r0)
            java.lang.String r0 = "text"
            java.lang.String r8 = r14.optString(r0)
            java.lang.String r0 = "optString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r0)
            java.lang.String r0 = "bg_color"
            int r9 = r14.optInt(r0)
            java.lang.String r0 = "text_color"
            int r10 = r14.optInt(r0)
            java.lang.String r0 = "use_webview"
            boolean r11 = r14.optBoolean(r0, r2)
            java.lang.String r0 = "border_color"
            int r12 = r14.optInt(r0)
            r2 = r13
            r3 = r14
            r4 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.models.inappmessage.MessageButton.<init>(org.json.JSONObject, org.json.JSONObject):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String enableDarkTheme$lambda$2$lambda$1() {
        return "Cannot apply dark theme with a null themes wrapper";
    }

    @Override // com.braze.models.inappmessage.IInAppMessageThemeable
    public void enableDarkTheme() {
        com.braze.models.theme.b bVar = this.darkTheme;
        if (bVar == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: d4.z
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String enableDarkTheme$lambda$2$lambda$1;
                    enableDarkTheme$lambda$2$lambda$1 = MessageButton.enableDarkTheme$lambda$2$lambda$1();
                    return enableDarkTheme$lambda$2$lambda$1;
                }
            }, 14, (Object) null);
            return;
        }
        Integer num = bVar.f12720a;
        if (num != null) {
            this.backgroundColor = num.intValue();
        }
        Integer num2 = bVar.f12721b;
        if (num2 != null) {
            this.textColor = num2.intValue();
        }
        Integer num3 = bVar.f12722c;
        if (num3 != null) {
            this.borderColor = num3.intValue();
        }
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getBorderColor() {
        return this.borderColor;
    }

    public final ClickAction getClickAction() {
        return this.clickAction;
    }

    public final int getId() {
        return this.id;
    }

    public final boolean getOpenUriInWebview() {
        return this.openUriInWebview;
    }

    public final String getStringId() {
        return String.valueOf(this.id);
    }

    public final String getText() {
        return this.text;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public final Uri getUri() {
        return this.uri;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut, reason: avoid collision after fix types in other method */
    public JSONObject getPropertiesJSONObject() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", this.id);
            jSONObject.put("click_action", this.clickAction.toString());
            Uri uri = this.uri;
            if (uri != null) {
                jSONObject.put("uri", String.valueOf(uri));
            }
            jSONObject.putOpt("text", this.text);
            jSONObject.put("bg_color", this.backgroundColor);
            jSONObject.put("text_color", this.textColor);
            jSONObject.put("use_webview", this.openUriInWebview);
            jSONObject.put("border_color", this.borderColor);
            return jSONObject;
        } catch (JSONException unused) {
            return this.jsonObject;
        }
    }

    private MessageButton(JSONObject jSONObject, JSONObject jSONObject2, int i6, ClickAction clickAction, String str, String str2, int i7, int i8, boolean z6, int i9) {
        this.id = -1;
        this.clickAction = ClickAction.NONE;
        int parseColor = Color.parseColor("#1B78CF");
        this.backgroundColor = parseColor;
        this.textColor = -1;
        this.borderColor = parseColor;
        this.jsonObject = jSONObject;
        this.id = i6;
        this.clickAction = clickAction;
        if (clickAction == ClickAction.URI && str != null && !StringsKt.isBlank(str)) {
            this.uri = Uri.parse(str);
        }
        this.text = str2;
        this.backgroundColor = i7;
        this.textColor = i8;
        this.openUriInWebview = z6;
        this.borderColor = i9;
        this.darkTheme = jSONObject2 != null ? new com.braze.models.theme.b(jSONObject2) : null;
    }
}
