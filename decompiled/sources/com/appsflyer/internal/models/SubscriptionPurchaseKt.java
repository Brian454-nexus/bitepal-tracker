package com.appsflyer.internal.models;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t\u001a1\u0010\f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0002¢\u0006\u0004\b\f\u0010\r"}, d2 = {"T", "Lorg/json/JSONObject;", "", "p0", "getNullable", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Object;", "Lorg/json/JSONArray;", "", "toList", "(Lorg/json/JSONArray;)Ljava/util/List;", "Lcom/appsflyer/internal/models/Deserialize;", "p1", "toObject", "(Lorg/json/JSONObject;Ljava/lang/String;Lcom/appsflyer/internal/models/Deserialize;)Ljava/lang/Object;"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSubscriptionPurchase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubscriptionPurchase.kt\ncom/appsflyer/internal/models/SubscriptionPurchaseKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,381:1\n1#2:382\n*E\n"})
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class SubscriptionPurchaseKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T getNullable(JSONObject jSONObject, String str) {
        if (jSONObject.has(str)) {
            return (T) jSONObject.get(str);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> List<T> toList(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i6 = 0; i6 < length; i6++) {
            arrayList.add(jSONArray.get(i6));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T toObject(JSONObject jSONObject, String str, Deserialize<T> deserialize) {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject != null) {
            return deserialize.fromJson(optJSONObject);
        }
        return null;
    }
}
