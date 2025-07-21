package com.amazon.device.iap.model;

import com.amazon.a.a.o.b;
import com.amazon.a.a.o.f;
import com.amazon.device.iap.internal.model.PurchaseUpdatesResponseBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class PurchaseUpdatesResponse {
    private static final String HAS_MORE = "HAS_MORE";
    private static final String RECEIPTS = "RECEIPTS";
    private static final String REQUEST_ID = "REQUEST_ID";
    private static final String REQUEST_STATUS = "REQUEST_STATUS";
    private static final String TO_STRING_FORMAT = "(%s, requestId: \"%s\", requestStatus: \"%s\", userData: \"%s\", receipts: %s, hasMore: \"%b\")";
    private static final String USER_DATA = "USER_DATA";
    private final boolean hasMore;
    private final List<Receipt> receipts;
    private final RequestId requestId;
    private final RequestStatus requestStatus;
    private final UserData userData;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public enum RequestStatus {
        SUCCESSFUL,
        FAILED,
        NOT_SUPPORTED
    }

    public PurchaseUpdatesResponse(PurchaseUpdatesResponseBuilder purchaseUpdatesResponseBuilder) {
        f.a(purchaseUpdatesResponseBuilder.getRequestId(), b.f11172B);
        f.a(purchaseUpdatesResponseBuilder.getRequestStatus(), b.f11173C);
        if (RequestStatus.SUCCESSFUL == purchaseUpdatesResponseBuilder.getRequestStatus()) {
            f.a(purchaseUpdatesResponseBuilder.getUserData(), "userData");
            f.a((Object) purchaseUpdatesResponseBuilder.getReceipts(), b.f11177G);
        }
        this.requestId = purchaseUpdatesResponseBuilder.getRequestId();
        this.requestStatus = purchaseUpdatesResponseBuilder.getRequestStatus();
        this.userData = purchaseUpdatesResponseBuilder.getUserData();
        this.receipts = purchaseUpdatesResponseBuilder.getReceipts() == null ? new ArrayList<>() : purchaseUpdatesResponseBuilder.getReceipts();
        this.hasMore = purchaseUpdatesResponseBuilder.hasMore();
    }

    public List<Receipt> getReceipts() {
        return this.receipts;
    }

    public RequestId getRequestId() {
        return this.requestId;
    }

    public RequestStatus getRequestStatus() {
        return this.requestStatus;
    }

    public UserData getUserData() {
        return this.userData;
    }

    public boolean hasMore() {
        return this.hasMore;
    }

    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(REQUEST_ID, this.requestId);
        jSONObject.put(REQUEST_STATUS, this.requestStatus);
        UserData userData = this.userData;
        jSONObject.put(USER_DATA, userData != null ? userData.toJSON() : "");
        JSONArray jSONArray = new JSONArray();
        List<Receipt> list = this.receipts;
        if (list != null) {
            Iterator<Receipt> it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().toJSON());
            }
        }
        jSONObject.put(RECEIPTS, jSONArray);
        jSONObject.put(HAS_MORE, this.hasMore);
        return jSONObject;
    }

    public String toString() {
        String obj = super.toString();
        RequestId requestId = this.requestId;
        RequestStatus requestStatus = this.requestStatus;
        UserData userData = this.userData;
        List<Receipt> list = this.receipts;
        return String.format(TO_STRING_FORMAT, obj, requestId, requestStatus, userData, list != null ? Arrays.toString(list.toArray()) : "null", Boolean.valueOf(this.hasMore));
    }
}
