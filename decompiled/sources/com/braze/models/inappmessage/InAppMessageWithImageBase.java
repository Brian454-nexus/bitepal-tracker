package com.braze.models.inappmessage;

import android.graphics.Bitmap;
import com.braze.managers.c0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0014\b'\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0001.B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\f2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR(\u0010\u001c\u001a\u00020\u001b8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\"\u0010#\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010$\u001a\u0004\u0018\u00010\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010*\u001a\u0004\u0018\u00010\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b*\u0010%\u001a\u0004\b+\u0010'\"\u0004\b,\u0010)¨\u0006/"}, d2 = {"Lcom/braze/models/inappmessage/InAppMessageWithImageBase;", "Lcom/braze/models/inappmessage/InAppMessageBase;", "Lcom/braze/models/inappmessage/IInAppMessageWithImage;", "Lorg/json/JSONObject;", "jsonObject", "Lcom/braze/managers/c0;", "brazeManager", "<init>", "(Lorg/json/JSONObject;Lcom/braze/managers/c0;)V", "", "", "remotePathToLocalAssetMap", "", "setLocalPrefetchedAssetPaths", "(Ljava/util/Map;)V", "", "getRemoteAssetPathsForPrefetch", "()Ljava/util/List;", "forJsonPut", "()Lorg/json/JSONObject;", "Landroid/graphics/Bitmap;", "bitmap", "Landroid/graphics/Bitmap;", "getBitmap", "()Landroid/graphics/Bitmap;", "setBitmap", "(Landroid/graphics/Bitmap;)V", "", "imageDownloadSuccessful", "Z", "getImageDownloadSuccessful", "()Z", "setImageDownloadSuccessful", "(Z)V", "getImageDownloadSuccessful$annotations", "()V", "localImageUrl", "Ljava/lang/String;", "getLocalImageUrl", "()Ljava/lang/String;", "setLocalImageUrl", "(Ljava/lang/String;)V", "remoteImageUrl", "getRemoteImageUrl", "setRemoteImageUrl", "Companion", "com/braze/models/inappmessage/i", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class InAppMessageWithImageBase extends InAppMessageBase implements IInAppMessageWithImage {
    public static final i Companion = new i();
    private Bitmap bitmap;
    private boolean imageDownloadSuccessful;
    private String localImageUrl;
    private String remoteImageUrl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessageWithImageBase(JSONObject jsonObject, c0 brazeManager) {
        super(jsonObject, brazeManager, false, false, 12, null);
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        setRemoteImageUrl(jsonObject.optString("image_url"));
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public JSONObject getPropertiesJSONObject() {
        JSONObject jsonObject = getJsonObject();
        if (jsonObject != null) {
            return jsonObject;
        }
        JSONObject propertiesJSONObject = super.getPropertiesJSONObject();
        try {
            propertiesJSONObject.putOpt("image_url", getRemoteImageUrl());
        } catch (JSONException unused) {
        }
        return propertiesJSONObject;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageWithImage
    public Bitmap getBitmap() {
        return this.bitmap;
    }

    public boolean getImageDownloadSuccessful() {
        return this.imageDownloadSuccessful;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageWithImage
    public String getLocalImageUrl() {
        return this.localImageUrl;
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.inappmessage.IInAppMessage
    public List<String> getRemoteAssetPathsForPrefetch() {
        ArrayList arrayList = new ArrayList();
        String remoteImageUrl = getRemoteImageUrl();
        if (remoteImageUrl != null && !StringsKt.isBlank(remoteImageUrl)) {
            arrayList.add(remoteImageUrl);
        }
        return arrayList;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageWithImage
    public String getRemoteImageUrl() {
        return this.remoteImageUrl;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageWithImage
    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageWithImage
    public void setImageDownloadSuccessful(boolean z6) {
        this.imageDownloadSuccessful = z6;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageWithImage
    public void setLocalImageUrl(String str) {
        this.localImageUrl = str;
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.inappmessage.IInAppMessage
    public void setLocalPrefetchedAssetPaths(Map<String, String> remotePathToLocalAssetMap) {
        Intrinsics.checkNotNullParameter(remotePathToLocalAssetMap, "remotePathToLocalAssetMap");
        if (remotePathToLocalAssetMap.isEmpty()) {
            return;
        }
        setLocalImageUrl(((String[]) remotePathToLocalAssetMap.values().toArray(new String[0]))[0]);
    }

    public void setRemoteImageUrl(String str) {
        this.remoteImageUrl = str;
    }
}
