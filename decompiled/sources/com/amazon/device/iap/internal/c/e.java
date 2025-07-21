package com.amazon.device.iap.internal.c;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.amazon.a.a.o.f;
import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.PurchasingService;
import com.amazon.device.iap.internal.model.ProductBuilder;
import com.amazon.device.iap.internal.model.ProductDataResponseBuilder;
import com.amazon.device.iap.internal.model.PurchaseResponseBuilder;
import com.amazon.device.iap.internal.model.PurchaseUpdatesResponseBuilder;
import com.amazon.device.iap.internal.model.ReceiptBuilder;
import com.amazon.device.iap.internal.model.UserDataBuilder;
import com.amazon.device.iap.internal.model.UserDataResponseBuilder;
import com.amazon.device.iap.model.FulfillmentResult;
import com.amazon.device.iap.model.Product;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.ProductType;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.Receipt;
import com.amazon.device.iap.model.RequestId;
import com.amazon.device.iap.model.UserData;
import com.amazon.device.iap.model.UserDataRequest;
import com.amazon.device.iap.model.UserDataResponse;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class e implements com.amazon.device.iap.internal.e {

    /* renamed from: a, reason: collision with root package name */
    private static final String f11672a = "e";

    /* renamed from: b, reason: collision with root package name */
    private static final String f11673b = "com.amazon.sdktestclient";

    /* renamed from: c, reason: collision with root package name */
    private static final String f11674c = "com.amazon.sdktestclient.command.CommandBroker";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3 */
    private PurchaseUpdatesResponse b(Intent intent) {
        UserData userData;
        ArrayList arrayList;
        Exception e6;
        RequestId requestId;
        boolean z6;
        boolean z7;
        JSONObject jSONObject;
        PurchaseUpdatesResponse.RequestStatus requestStatus = PurchaseUpdatesResponse.RequestStatus.FAILED;
        ArrayList arrayList2 = null;
        int i6 = 0;
        try {
            jSONObject = new JSONObject(intent.getStringExtra("purchaseUpdatesOutput"));
            requestId = RequestId.fromString(jSONObject.optString(com.amazon.a.a.o.b.f11172B));
            try {
                requestStatus = PurchaseUpdatesResponse.RequestStatus.valueOf(jSONObject.optString("status"));
                z7 = jSONObject.optBoolean("isMore");
                try {
                    userData = new UserDataBuilder().setUserId(jSONObject.optString("userId")).setMarketplace(jSONObject.optString(com.amazon.a.a.o.b.f11209m)).build();
                } catch (Exception e7) {
                    e = e7;
                    userData = null;
                    arrayList = null;
                }
            } catch (Exception e8) {
                userData = null;
                arrayList = null;
                e6 = e8;
            }
            try {
                z6 = z7;
            } catch (Exception e9) {
                e = e9;
                arrayList = null;
                e6 = e;
                i6 = z7 ? 1 : 0;
                Log.e(f11672a, "Error parsing purchase updates output", e6);
                z7 = i6;
                arrayList2 = arrayList;
                z6 = z7;
                return new PurchaseUpdatesResponseBuilder().setRequestId(requestId).setRequestStatus(requestStatus).setUserData(userData).setReceipts(arrayList2).setHasMore(z6).build();
            }
        } catch (Exception e10) {
            userData = null;
            arrayList = null;
            e6 = e10;
            requestId = null;
        }
        if (requestStatus == PurchaseUpdatesResponse.RequestStatus.SUCCESSFUL) {
            arrayList = new ArrayList();
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray(com.amazon.a.a.o.b.f11177G);
                if (optJSONArray != null) {
                    while (i6 < optJSONArray.length()) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i6);
                        try {
                            arrayList.add(a(optJSONObject));
                        } catch (Exception unused) {
                            Log.e(f11672a, "Failed to parse receipt from json:" + optJSONObject);
                        }
                        i6++;
                    }
                }
            } catch (Exception e11) {
                e6 = e11;
                i6 = z7 ? 1 : 0;
                Log.e(f11672a, "Error parsing purchase updates output", e6);
                z7 = i6;
                arrayList2 = arrayList;
                z6 = z7;
                return new PurchaseUpdatesResponseBuilder().setRequestId(requestId).setRequestStatus(requestStatus).setUserData(userData).setReceipts(arrayList2).setHasMore(z6).build();
            }
            arrayList2 = arrayList;
            z6 = z7;
        }
        return new PurchaseUpdatesResponseBuilder().setRequestId(requestId).setRequestStatus(requestStatus).setUserData(userData).setReceipts(arrayList2).setHasMore(z6).build();
    }

    private void c(Intent intent) {
        a(d(intent));
    }

    private ProductDataResponse d(Intent intent) {
        LinkedHashSet linkedHashSet;
        HashMap hashMap;
        Exception e6;
        RequestId requestId;
        ProductDataResponse.RequestStatus requestStatus;
        ProductDataResponse.RequestStatus requestStatus2 = ProductDataResponse.RequestStatus.FAILED;
        LinkedHashSet linkedHashSet2 = null;
        try {
            JSONObject jSONObject = new JSONObject(intent.getStringExtra("itemDataOutput"));
            requestId = RequestId.fromString(jSONObject.optString(com.amazon.a.a.o.b.f11172B));
            try {
                requestStatus = ProductDataResponse.RequestStatus.valueOf(jSONObject.optString("status"));
                if (requestStatus != requestStatus2) {
                    try {
                        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                        try {
                            hashMap = new HashMap();
                            try {
                                JSONArray optJSONArray = jSONObject.optJSONArray("unavailableSkus");
                                if (optJSONArray != null) {
                                    for (int i6 = 0; i6 < optJSONArray.length(); i6++) {
                                        linkedHashSet3.add(optJSONArray.getString(i6));
                                    }
                                }
                                JSONObject optJSONObject = jSONObject.optJSONObject("items");
                                if (optJSONObject != null) {
                                    Iterator<String> keys = optJSONObject.keys();
                                    while (keys.hasNext()) {
                                        String next = keys.next();
                                        hashMap.put(next, a(next, optJSONObject.optJSONObject(next)));
                                    }
                                }
                                linkedHashSet2 = linkedHashSet3;
                            } catch (Exception e7) {
                                e6 = e7;
                                linkedHashSet = linkedHashSet3;
                                requestStatus2 = requestStatus;
                                Log.e(f11672a, "Error parsing item data output", e6);
                                requestStatus = requestStatus2;
                                linkedHashSet2 = linkedHashSet;
                                return new ProductDataResponseBuilder().setRequestId(requestId).setRequestStatus(requestStatus).setProductData(hashMap).setUnavailableSkus(linkedHashSet2).build();
                            }
                        } catch (Exception e8) {
                            hashMap = null;
                            e6 = e8;
                        }
                    } catch (Exception e9) {
                        linkedHashSet = null;
                        hashMap = null;
                        e6 = e9;
                    }
                } else {
                    hashMap = null;
                }
            } catch (Exception e10) {
                hashMap = null;
                e6 = e10;
                linkedHashSet = null;
            }
        } catch (Exception e11) {
            linkedHashSet = null;
            hashMap = null;
            e6 = e11;
            requestId = null;
        }
        return new ProductDataResponseBuilder().setRequestId(requestId).setRequestStatus(requestStatus).setProductData(hashMap).setUnavailableSkus(linkedHashSet2).build();
    }

    private void e(Intent intent) {
        JSONObject jSONObject;
        UserDataResponse f6 = f(intent);
        RequestId requestId = f6.getRequestId();
        String stringExtra = intent.getStringExtra("userInput");
        try {
            jSONObject = new JSONObject(stringExtra);
        } catch (JSONException e6) {
            Log.e(f11672a, "Unable to parse request data: " + stringExtra, e6);
            jSONObject = null;
        }
        if (requestId == null || jSONObject == null) {
            a(f6);
            return;
        }
        if (!jSONObject.optBoolean(b.at, false)) {
            a(f6);
            return;
        }
        if (f6.getUserData() == null || f.a(f6.getUserData().getUserId())) {
            Log.e(f11672a, "No Userid found in userDataResponse" + f6);
            a(new PurchaseUpdatesResponseBuilder().setRequestId(requestId).setRequestStatus(PurchaseUpdatesResponse.RequestStatus.FAILED).setUserData(f6.getUserData()).setReceipts(new ArrayList()).setHasMore(false).build());
            return;
        }
        Log.i(f11672a, "sendGetPurchaseUpdates with user id" + f6.getUserData().getUserId());
        a(requestId.toString(), f6.getUserData().getUserId(), jSONObject.optBoolean(b.au, true));
    }

    private UserDataResponse f(Intent intent) {
        RequestId requestId;
        JSONObject jSONObject;
        UserDataResponse.RequestStatus requestStatus = UserDataResponse.RequestStatus.FAILED;
        UserData userData = null;
        try {
            jSONObject = new JSONObject(intent.getStringExtra("userOutput"));
            requestId = RequestId.fromString(jSONObject.optString(com.amazon.a.a.o.b.f11172B));
        } catch (Exception e6) {
            e = e6;
            requestId = null;
        }
        try {
            requestStatus = UserDataResponse.RequestStatus.valueOf(jSONObject.optString("status"));
            if (requestStatus == UserDataResponse.RequestStatus.SUCCESSFUL) {
                String optString = jSONObject.optString("userId");
                userData = new UserDataBuilder().setUserId(optString).setMarketplace(jSONObject.optString(com.amazon.a.a.o.b.f11209m)).setLWAConsentStatus(jSONObject.optString("UserDataResponse.LWAConsentStatus")).build();
            }
        } catch (Exception e7) {
            e = e7;
            Log.e(f11672a, "Error parsing userid output", e);
            return new UserDataResponseBuilder().setRequestId(requestId).setRequestStatus(requestStatus).setUserData(userData).build();
        }
        return new UserDataResponseBuilder().setRequestId(requestId).setRequestStatus(requestStatus).setUserData(userData).build();
    }

    private void g(Intent intent) {
        a(h(intent));
    }

    private PurchaseResponse h(Intent intent) {
        RequestId requestId;
        UserData userData;
        PurchaseResponse.RequestStatus requestStatus = PurchaseResponse.RequestStatus.FAILED;
        Receipt receipt = null;
        try {
            JSONObject jSONObject = new JSONObject(intent.getStringExtra("purchaseOutput"));
            requestId = RequestId.fromString(jSONObject.optString(com.amazon.a.a.o.b.f11172B));
            try {
                userData = new UserDataBuilder().setUserId(jSONObject.optString("userId")).setMarketplace(jSONObject.optString(com.amazon.a.a.o.b.f11209m)).build();
            } catch (Exception e6) {
                e = e6;
                userData = null;
            }
            try {
                requestStatus = PurchaseResponse.RequestStatus.safeValueOf(jSONObject.optString("purchaseStatus"));
                JSONObject optJSONObject = jSONObject.optJSONObject(com.amazon.a.a.o.b.f11174D);
                if (optJSONObject != null) {
                    receipt = a(optJSONObject);
                }
            } catch (Exception e7) {
                e = e7;
                Log.e(f11672a, "Error parsing purchase output", e);
                return new PurchaseResponseBuilder().setRequestId(requestId).setRequestStatus(requestStatus).setUserData(userData).setReceipt(receipt).build();
            }
        } catch (Exception e8) {
            e = e8;
            requestId = null;
            userData = null;
        }
        return new PurchaseResponseBuilder().setRequestId(requestId).setRequestStatus(requestStatus).setUserData(userData).setReceipt(receipt).build();
    }

    @Override // com.amazon.device.iap.internal.e
    public void a(RequestId requestId, UserDataRequest userDataRequest) {
        com.amazon.device.iap.internal.util.b.a(f11672a, "sendGetUserDataRequest");
        a(requestId.toString(), false, false, userDataRequest);
    }

    private void a(String str, boolean z6, boolean z7, UserDataRequest userDataRequest) {
        try {
            Context b6 = com.amazon.device.iap.internal.d.f().b();
            Bundle bundle = new Bundle();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.amazon.a.a.o.b.f11172B, str);
            jSONObject.put("packageName", b6.getPackageName());
            jSONObject.put(com.amazon.a.a.o.b.f11179I, PurchasingService.SDK_VERSION);
            jSONObject.put(b.at, z6);
            jSONObject.put(b.au, z7);
            if (userDataRequest != null) {
                jSONObject.put("UserDataRequest.fetchLWAConsentStatus", userDataRequest.getFetchLWAConsentStatus());
            }
            bundle.putString("userInput", jSONObject.toString());
            Intent a6 = a("com.amazon.testclient.iap.appUserId");
            a6.addFlags(268435456);
            a6.putExtras(bundle);
            b6.startService(a6);
        } catch (JSONException unused) {
            com.amazon.device.iap.internal.util.b.b(f11672a, "Error in sendGetUserDataRequest.");
        }
    }

    @Override // com.amazon.device.iap.internal.e
    public void a(RequestId requestId, String str) {
        com.amazon.device.iap.internal.util.b.a(f11672a, "sendPurchaseRequest");
        try {
            Context b6 = com.amazon.device.iap.internal.d.f().b();
            boolean d6 = com.amazon.device.iap.internal.d.f().d();
            Bundle bundle = new Bundle();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.amazon.a.a.o.b.f11181K, str);
            jSONObject.put(com.amazon.a.a.o.b.ac, d6);
            jSONObject.put(com.amazon.a.a.o.b.f11172B, requestId.toString());
            jSONObject.put("packageName", b6.getPackageName());
            jSONObject.put(com.amazon.a.a.o.b.f11179I, PurchasingService.SDK_VERSION);
            bundle.putString("purchaseInput", jSONObject.toString());
            Intent a6 = a("com.amazon.testclient.iap.purchase");
            a6.addFlags(268435456);
            a6.putExtras(bundle);
            b6.startService(a6);
        } catch (JSONException unused) {
            com.amazon.device.iap.internal.util.b.b(f11672a, "Error in sendPurchaseRequest.");
        }
    }

    @Override // com.amazon.device.iap.internal.e
    public void a(RequestId requestId, Set<String> set) {
        com.amazon.device.iap.internal.util.b.a(f11672a, "sendItemDataRequest");
        try {
            Context b6 = com.amazon.device.iap.internal.d.f().b();
            Bundle bundle = new Bundle();
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray((Collection) set);
            jSONObject.put(com.amazon.a.a.o.b.f11172B, requestId.toString());
            jSONObject.put("packageName", b6.getPackageName());
            jSONObject.put(com.amazon.a.a.o.b.f11185O, jSONArray);
            jSONObject.put(com.amazon.a.a.o.b.f11179I, PurchasingService.SDK_VERSION);
            bundle.putString("itemDataInput", jSONObject.toString());
            Intent a6 = a("com.amazon.testclient.iap.itemData");
            a6.addFlags(268435456);
            a6.putExtras(bundle);
            b6.startService(a6);
        } catch (JSONException unused) {
            com.amazon.device.iap.internal.util.b.b(f11672a, "Error in sendItemDataRequest.");
        }
    }

    @Override // com.amazon.device.iap.internal.e
    public void a(RequestId requestId, boolean z6) {
        if (requestId == null) {
            requestId = new RequestId();
        }
        com.amazon.device.iap.internal.util.b.a(f11672a, "sendPurchaseUpdatesRequest/sendGetUserData first:" + requestId);
        a(requestId.toString(), true, z6, null);
    }

    @Override // com.amazon.device.iap.internal.e
    public void a(RequestId requestId, String str, FulfillmentResult fulfillmentResult) {
        com.amazon.device.iap.internal.util.b.a(f11672a, "sendNotifyPurchaseFulfilled");
        try {
            Context b6 = com.amazon.device.iap.internal.d.f().b();
            Bundle bundle = new Bundle();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.amazon.a.a.o.b.f11172B, requestId.toString());
            jSONObject.put("packageName", b6.getPackageName());
            jSONObject.put(com.amazon.a.a.o.b.f11175E, str);
            jSONObject.put("fulfillmentResult", fulfillmentResult);
            jSONObject.put(com.amazon.a.a.o.b.f11179I, PurchasingService.SDK_VERSION);
            bundle.putString("purchaseFulfilledInput", jSONObject.toString());
            Intent a6 = a("com.amazon.testclient.iap.purchaseFulfilled");
            a6.addFlags(268435456);
            a6.putExtras(bundle);
            b6.startService(a6);
        } catch (JSONException unused) {
            com.amazon.device.iap.internal.util.b.b(f11672a, "Error in sendNotifyPurchaseFulfilled.");
        }
    }

    @Override // com.amazon.device.iap.internal.e
    public void a(Context context, Intent intent) {
        com.amazon.device.iap.internal.util.b.a(f11672a, "handleResponse");
        intent.setComponent(new ComponentName(f11673b, f11674c));
        try {
            String string = intent.getExtras().getString("responseType");
            if (string.equalsIgnoreCase("com.amazon.testclient.iap.purchase")) {
                g(intent);
                return;
            }
            if (string.equalsIgnoreCase("com.amazon.testclient.iap.appUserId")) {
                e(intent);
            } else if (string.equalsIgnoreCase("com.amazon.testclient.iap.itemData")) {
                c(intent);
            } else if (string.equalsIgnoreCase("com.amazon.testclient.iap.purchaseUpdates")) {
                a(intent);
            }
        } catch (Exception e6) {
            Log.e(f11672a, "Error handling response.", e6);
        }
    }

    private Intent a(String str) {
        Intent intent = new Intent(str);
        intent.setComponent(new ComponentName(f11673b, f11674c));
        return intent;
    }

    public void a(final Object obj) {
        f.a(obj, "response");
        Context b6 = com.amazon.device.iap.internal.d.f().b();
        final PurchasingListener a6 = com.amazon.device.iap.internal.d.f().a();
        if (b6 != null && a6 != null) {
            new Handler(b6.getMainLooper()).post(new Runnable() { // from class: com.amazon.device.iap.internal.c.e.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Object obj2 = obj;
                        if (obj2 instanceof ProductDataResponse) {
                            a6.onProductDataResponse((ProductDataResponse) obj2);
                            return;
                        }
                        if (obj2 instanceof UserDataResponse) {
                            a6.onUserDataResponse((UserDataResponse) obj2);
                            return;
                        }
                        if (obj2 instanceof PurchaseUpdatesResponse) {
                            a6.onPurchaseUpdatesResponse((PurchaseUpdatesResponse) obj2);
                            return;
                        }
                        if (obj2 instanceof PurchaseResponse) {
                            a6.onPurchaseResponse((PurchaseResponse) obj2);
                            return;
                        }
                        com.amazon.device.iap.internal.util.b.b(e.f11672a, "Unknown response type:" + obj.getClass().getName());
                    } catch (Exception e6) {
                        com.amazon.device.iap.internal.util.b.b(e.f11672a, "Error in sendResponse: " + e6);
                    }
                }
            });
            return;
        }
        com.amazon.device.iap.internal.util.b.a(f11672a, "PurchasingListener is not set. Dropping response: " + obj);
    }

    private void a(Intent intent) {
        PurchaseUpdatesResponse b6 = b(intent);
        if (b6.getRequestStatus() == PurchaseUpdatesResponse.RequestStatus.SUCCESSFUL) {
            String optString = new JSONObject(intent.getStringExtra("purchaseUpdatesOutput")).optString(b.as);
            Log.i(f11672a, "Offset for PurchaseUpdatesResponse:" + optString);
            com.amazon.device.iap.internal.util.a.a(b6.getUserData().getUserId(), optString);
        }
        a(b6);
    }

    private Product a(String str, JSONObject jSONObject) {
        String str2;
        ProductType valueOf = ProductType.valueOf(jSONObject.optString(com.amazon.a.a.o.b.f11207k));
        JSONObject optJSONObject = jSONObject.optJSONObject(com.amazon.a.a.o.b.f11221y);
        if (optJSONObject == null || optJSONObject == JSONObject.NULL) {
            str2 = null;
        } else {
            Currency currency = Currency.getInstance(optJSONObject.optString(com.amazon.a.a.o.b.f11197a));
            str2 = currency.getSymbol() + optJSONObject.optString(com.amazon.a.a.o.b.f11195Y);
        }
        String optString = jSONObject.optString(com.amazon.a.a.o.b.f11189S);
        String optString2 = jSONObject.optString(com.amazon.a.a.o.b.f11199c);
        String optString3 = jSONObject.optString("smallIconUrl");
        int optInt = jSONObject.optInt(com.amazon.a.a.o.b.f11190T, 0);
        return new ProductBuilder().setSku(str).setProductType(valueOf).setDescription(optString2).setPrice(str2).setSmallIconUrl(optString3).setTitle(optString).setCoinsRewardAmount(optInt).setSubscriptionPeriod(jSONObject.isNull("term") ? null : jSONObject.getString("term")).setFreeTrialPeriod(jSONObject.isNull(com.amazon.a.a.o.b.f11212p) ? null : jSONObject.getString(com.amazon.a.a.o.b.f11212p)).setPromotions(jSONObject.isNull(com.amazon.a.a.o.b.f11213q) ? null : a.a(jSONObject)).build();
    }

    private void a(String str, String str2, boolean z6) {
        try {
            Context b6 = com.amazon.device.iap.internal.d.f().b();
            String a6 = com.amazon.device.iap.internal.util.a.a(str2);
            Log.i(f11672a, "send PurchaseUpdates with user id:" + str2 + ";reset flag:" + z6 + ", local cursor:" + a6 + ", parsed from old requestId:" + str);
            Bundle bundle = new Bundle();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.amazon.a.a.o.b.f11172B, str.toString());
            if (z6) {
                a6 = null;
            }
            jSONObject.put(b.as, a6);
            jSONObject.put(com.amazon.a.a.o.b.f11179I, PurchasingService.SDK_VERSION);
            jSONObject.put("packageName", b6.getPackageName());
            bundle.putString("purchaseUpdatesInput", jSONObject.toString());
            Intent a7 = a("com.amazon.testclient.iap.purchaseUpdates");
            a7.addFlags(268435456);
            a7.putExtras(bundle);
            b6.startService(a7);
        } catch (JSONException unused) {
            com.amazon.device.iap.internal.util.b.b(f11672a, "Error in sendPurchaseUpdatesRequest.");
        }
    }

    private Receipt a(JSONObject jSONObject) {
        String optString = jSONObject.optString(com.amazon.a.a.o.b.f11175E);
        String optString2 = jSONObject.optString(com.amazon.a.a.o.b.f11181K);
        ProductType valueOf = ProductType.valueOf(jSONObject.optString(com.amazon.a.a.o.b.f11207k));
        String optString3 = jSONObject.optString(com.amazon.a.a.o.b.f11187Q);
        DateFormat dateFormat = b.ar;
        Date parse = dateFormat.parse(optString3);
        String optString4 = jSONObject.optString(com.amazon.a.a.o.b.f11201e);
        Date parse2 = (optString4 == null || optString4.length() == 0) ? null : dateFormat.parse(optString4);
        String optString5 = jSONObject.optString(com.amazon.a.a.o.b.f11188R);
        return new ReceiptBuilder().setReceiptId(optString).setSku(optString2).setProductType(valueOf).setPurchaseDate(parse).setCancelDate(parse2).setDeferredSku(jSONObject.optString(com.amazon.a.a.o.b.f11183M, null)).setDeferredDate((optString5 == null || optString5.length() == 0) ? null : dateFormat.parse(optString5)).setTermSku(jSONObject.optString(com.amazon.a.a.o.b.f11182L, null)).build();
    }
}
