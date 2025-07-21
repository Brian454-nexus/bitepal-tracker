package com.braze.models.inappmessage;

import com.braze.managers.c0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\r\b'\u0018\u0000 \u00152\u00020\u00012\u00020\u0002:\u0001\u0016B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eR$\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/braze/models/inappmessage/InAppMessageZippedAssetHtmlBase;", "Lcom/braze/models/inappmessage/InAppMessageHtmlBase;", "Lcom/braze/models/inappmessage/IInAppMessageZippedAssetHtml;", "Lorg/json/JSONObject;", "jsonObject", "Lcom/braze/managers/c0;", "brazeManager", "<init>", "(Lorg/json/JSONObject;Lcom/braze/managers/c0;)V", "", "", "getRemoteAssetPathsForPrefetch", "()Ljava/util/List;", "forJsonPut", "()Lorg/json/JSONObject;", "assetsZipRemoteUrl", "Ljava/lang/String;", "getAssetsZipRemoteUrl", "()Ljava/lang/String;", "setAssetsZipRemoteUrl", "(Ljava/lang/String;)V", "Companion", "com/braze/models/inappmessage/j", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class InAppMessageZippedAssetHtmlBase extends InAppMessageHtmlBase implements IInAppMessageZippedAssetHtml {
    public static final j Companion = new j();
    private String assetsZipRemoteUrl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessageZippedAssetHtmlBase(JSONObject jsonObject, c0 brazeManager) {
        super(jsonObject, brazeManager);
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        String optString = jsonObject.optString("zipped_assets_url");
        Intrinsics.checkNotNull(optString);
        if (StringsKt.isBlank(optString)) {
            return;
        }
        setAssetsZipRemoteUrl(optString);
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public JSONObject getJsonObject() {
        JSONObject jsonObject = getJsonObject();
        if (jsonObject != null) {
            return jsonObject;
        }
        JSONObject jsonObject2 = super.getJsonObject();
        try {
            jsonObject2.putOpt("zipped_assets_url", getAssetsZipRemoteUrl());
        } catch (JSONException unused) {
        }
        return jsonObject2;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageZippedAssetHtml
    public String getAssetsZipRemoteUrl() {
        return this.assetsZipRemoteUrl;
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.inappmessage.IInAppMessage
    public List<String> getRemoteAssetPathsForPrefetch() {
        ArrayList arrayList = new ArrayList();
        String assetsZipRemoteUrl = getAssetsZipRemoteUrl();
        if (assetsZipRemoteUrl != null && !StringsKt.isBlank(assetsZipRemoteUrl)) {
            arrayList.add(assetsZipRemoteUrl);
        }
        return arrayList;
    }

    public void setAssetsZipRemoteUrl(String str) {
        this.assetsZipRemoteUrl = str;
    }
}
