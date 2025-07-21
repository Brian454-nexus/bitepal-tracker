package com.braze.models.inappmessage;

import com.braze.enums.inappmessage.CropType;
import com.braze.enums.inappmessage.ImageStyle;
import com.braze.enums.inappmessage.MessageType;
import com.braze.managers.c0;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/braze/models/inappmessage/InAppMessageModal;", "Lcom/braze/models/inappmessage/InAppMessageImmersiveBase;", "Lorg/json/JSONObject;", "jsonObject", "Lcom/braze/managers/c0;", "brazeManager", "<init>", "(Lorg/json/JSONObject;Lcom/braze/managers/c0;)V", "forJsonPut", "()Lorg/json/JSONObject;", "Lcom/braze/enums/inappmessage/MessageType;", "getMessageType", "()Lcom/braze/enums/inappmessage/MessageType;", "messageType", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class InAppMessageModal extends InAppMessageImmersiveBase {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessageModal(JSONObject jsonObject, c0 brazeManager) {
        super(jsonObject, brazeManager);
        String upperCase;
        int i6;
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        CropType cropType = getImageStyle() == ImageStyle.GRAPHIC ? CropType.CENTER_CROP : CropType.FIT_CENTER;
        try {
            String string = jsonObject.getString("crop_type");
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            upperCase = string.toUpperCase(US);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        } catch (Exception unused) {
        }
        for (CropType cropType2 : CropType.values()) {
            if (Intrinsics.areEqual(cropType2.name(), upperCase)) {
                cropType = cropType2;
                setCropType(cropType);
                return;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public MessageType getMessageType() {
        return MessageType.MODAL;
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut, reason: avoid collision after fix types in other method */
    public JSONObject getKey() {
        JSONObject jsonObject = getJsonObject();
        if (jsonObject != null) {
            return jsonObject;
        }
        JSONObject key = super.getKey();
        try {
            key.put("type", getMessageType().name());
        } catch (JSONException unused) {
        }
        return key;
    }
}
