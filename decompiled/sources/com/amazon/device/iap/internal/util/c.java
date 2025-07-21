package com.amazon.device.iap.internal.util;

import com.amazon.a.a.o.f;
import com.amazon.device.iap.PurchasingService;
import com.amazon.device.iap.internal.a.e;
import com.amazon.device.iap.internal.model.ReceiptBuilder;
import com.amazon.device.iap.model.ProductType;
import com.amazon.device.iap.model.Receipt;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f11689a = "c";

    /* renamed from: com.amazon.device.iap.internal.util.c$1, reason: invalid class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f11690a;

        static {
            int[] iArr = new int[d.values().length];
            f11690a = iArr;
            try {
                iArr[d.V1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11690a[d.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11690a[d.V2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11690a[d.V3.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static Receipt a(JSONObject jSONObject, String str, String str2) {
        int i6 = AnonymousClass1.f11690a[b(jSONObject).ordinal()];
        if (i6 == 1) {
            return c(jSONObject, str, str2);
        }
        if (i6 == 2) {
            return b(jSONObject, str, str2);
        }
        if (i6 != 3) {
            return e(jSONObject, str, str2);
        }
        return d(jSONObject, str, str2);
    }

    private static Receipt b(JSONObject jSONObject, String str, String str2) {
        String optString = jSONObject.optString("signature");
        if (!f.a(optString)) {
            try {
                Receipt a6 = a(jSONObject);
                String str3 = str + "-" + a6.getReceiptId();
                boolean a7 = com.amazon.a.a.a(str3, optString);
                b.a(f11689a, "stringToVerify/legacy:\n" + str3 + "\nsignature:\n" + optString);
                if (a7) {
                    return a6;
                }
                MetricsHelper.submitReceiptVerificationFailureMetrics(str2, str3, optString);
                throw new com.amazon.device.iap.internal.a.f(str2, str3, optString);
            } catch (JSONException e6) {
                throw new e(str2, jSONObject.toString(), e6);
            }
        }
        b.b(f11689a, "a signature was not found in the receipt for request ID " + str2);
        MetricsHelper.submitReceiptVerificationFailureMetrics(str2, "NO Signature found", optString);
        throw new com.amazon.device.iap.internal.a.f(str2, null, optString);
    }

    private static Receipt c(JSONObject jSONObject, String str, String str2) {
        String optString = jSONObject.optString(com.amazon.a.a.o.b.f11196Z);
        String optString2 = jSONObject.optString("signature");
        if (f.a(optString2)) {
            b.b(f11689a, "a signature was not found in the receipt for request ID " + str2);
            MetricsHelper.submitReceiptVerificationFailureMetrics(str2, "NO Signature found", optString2);
            throw new com.amazon.device.iap.internal.a.f(str2, null, optString2);
        }
        try {
            Receipt a6 = a(jSONObject);
            ProductType productType = a6.getProductType();
            String sku = a6.getSku();
            String receiptId = a6.getReceiptId();
            ProductType productType2 = ProductType.SUBSCRIPTION;
            String format = String.format("%s|%s|%s|%s|%s|%s|%s|%tQ|%tQ", PurchasingService.SDK_VERSION, str, optString, productType, sku, receiptId, str2, productType2 == a6.getProductType() ? a6.getPurchaseDate() : null, productType2 == a6.getProductType() ? a6.getCancelDate() : null);
            b.a(f11689a, "stringToVerify/v1:\n" + format + "\nsignature:\n" + optString2);
            if (com.amazon.a.a.a(format, optString2)) {
                return a6;
            }
            MetricsHelper.submitReceiptVerificationFailureMetrics(str2, format, optString2);
            throw new com.amazon.device.iap.internal.a.f(str2, format, optString2);
        } catch (JSONException e6) {
            throw new e(str2, jSONObject.toString(), e6);
        }
    }

    private static Receipt d(JSONObject jSONObject, String str, String str2) {
        String optString = jSONObject.optString(com.amazon.a.a.o.b.f11196Z);
        String optString2 = jSONObject.optString("signature");
        Date date = null;
        if (f.a(optString2)) {
            b.b(f11689a, "a signature was not found in the receipt for request ID " + str2);
            MetricsHelper.submitReceiptVerificationFailureMetrics(str2, "NO Signature found", optString2);
            throw new com.amazon.device.iap.internal.a.f(str2, null, optString2);
        }
        try {
            String string = jSONObject.getString(com.amazon.a.a.o.b.f11175E);
            String string2 = jSONObject.getString(com.amazon.a.a.o.b.f11181K);
            ProductType valueOf = ProductType.valueOf(jSONObject.getString(com.amazon.a.a.o.b.f11207k).toUpperCase());
            String optString3 = jSONObject.optString(com.amazon.a.a.o.b.f11187Q);
            Date b6 = a(optString3) ? null : b(optString3);
            String optString4 = jSONObject.optString(com.amazon.a.a.o.b.f11201e);
            if (!a(optString4)) {
                date = b(optString4);
            }
            Receipt build = new ReceiptBuilder().setReceiptId(string).setSku(string2).setProductType(valueOf).setPurchaseDate(b6).setCancelDate(date).build();
            String format = String.format("%s|%s|%s|%s|%s|%tQ|%tQ", str, optString, build.getProductType(), build.getSku(), build.getReceiptId(), build.getPurchaseDate(), build.getCancelDate());
            b.a(f11689a, "stringToVerify/v2:\n" + format + "\nsignature:\n" + optString2);
            if (com.amazon.a.a.a(format, optString2)) {
                return build;
            }
            MetricsHelper.submitReceiptVerificationFailureMetrics(str2, format, optString2);
            throw new com.amazon.device.iap.internal.a.f(str2, format, optString2);
        } catch (JSONException e6) {
            throw new e(str2, jSONObject.toString(), e6);
        }
    }

    private static Receipt e(JSONObject jSONObject, String str, String str2) {
        String optString = jSONObject.optString(com.amazon.a.a.o.b.f11196Z);
        String optString2 = jSONObject.optString("signature");
        Date date = null;
        if (f.a(optString2)) {
            b.b(f11689a, "a signature was not found in the receipt for request ID " + str2);
            MetricsHelper.submitReceiptVerificationFailureMetrics(str2, "NO Signature found", optString2);
            throw new com.amazon.device.iap.internal.a.f(str2, null, optString2);
        }
        try {
            String string = jSONObject.getString(com.amazon.a.a.o.b.f11175E);
            String string2 = jSONObject.getString(com.amazon.a.a.o.b.f11181K);
            String optString3 = jSONObject.optString(com.amazon.a.a.o.b.f11182L, null);
            String optString4 = jSONObject.optString(com.amazon.a.a.o.b.f11183M, null);
            ProductType valueOf = ProductType.valueOf(jSONObject.getString(com.amazon.a.a.o.b.f11207k).toUpperCase());
            String optString5 = jSONObject.optString(com.amazon.a.a.o.b.f11187Q);
            Date b6 = a(optString5) ? null : b(optString5);
            String optString6 = jSONObject.optString(com.amazon.a.a.o.b.f11201e);
            Date b7 = a(optString6) ? null : b(optString6);
            String optString7 = jSONObject.optString(com.amazon.a.a.o.b.f11188R);
            if (!a(optString7)) {
                date = b(optString7);
            }
            Receipt build = new ReceiptBuilder().setReceiptId(string).setSku(string2).setProductType(valueOf).setPurchaseDate(b6).setCancelDate(b7).setDeferredDate(date).setDeferredSku(optString4).setTermSku(optString3).build();
            String format = String.format("%s|%s|%s|%s|%s|%s|%s|%tQ|%tQ|%tQ", str, optString, build.getProductType(), build.getSku(), build.getReceiptId(), build.getDeferredSku(), build.getTermSku(), build.getPurchaseDate(), build.getCancelDate(), build.getDeferredDate());
            b.a(f11689a, "stringToVerify/v3:\n" + format + "\nsignature:\n" + optString2);
            if (com.amazon.a.a.a(format, optString2)) {
                return build;
            }
            MetricsHelper.submitReceiptVerificationFailureMetrics(str2, format, optString2);
            throw new com.amazon.device.iap.internal.a.f(str2, format, optString2);
        } catch (JSONException e6) {
            throw new e(str2, jSONObject.toString(), e6);
        }
    }

    private static Receipt a(JSONObject jSONObject) {
        String optString = jSONObject.optString("token");
        String string = jSONObject.getString(com.amazon.a.a.o.b.f11181K);
        ProductType valueOf = ProductType.valueOf(jSONObject.getString(com.amazon.a.a.o.b.f11207k).toUpperCase());
        String optString2 = jSONObject.optString(com.amazon.a.a.o.b.f11186P);
        Date b6 = a(optString2) ? null : b(optString2);
        String optString3 = jSONObject.optString(com.amazon.a.a.o.b.f11200d);
        return new ReceiptBuilder().setReceiptId(optString).setSku(string).setProductType(valueOf).setPurchaseDate(b6).setCancelDate(a(optString3) ? null : b(optString3)).build();
    }

    public static Date b(String str) {
        try {
            Date parse = new SimpleDateFormat(com.amazon.a.a.o.b.aj).parse(str);
            if (0 == parse.getTime()) {
                return null;
            }
            return parse;
        } catch (ParseException e6) {
            throw new JSONException(e6.getMessage());
        }
    }

    private static d b(JSONObject jSONObject) {
        String optString = jSONObject.optString(com.amazon.a.a.o.b.f11196Z);
        String optString2 = jSONObject.optString(com.amazon.a.a.o.b.f11175E);
        String optString3 = jSONObject.optString(com.amazon.a.a.o.b.f11184N);
        if (!f.a(optString3)) {
            d dVar = d.V3;
            if (optString3.equals(dVar.name())) {
                return dVar;
            }
        }
        if (!f.a(optString2)) {
            return d.V2;
        }
        if (f.a(optString)) {
            return d.LEGACY;
        }
        return d.V1;
    }

    public static boolean a(String str) {
        return str == null || str.trim().length() == 0;
    }

    public static JSONObject a(Receipt receipt, String str) {
        JSONObject jSONObject = new JSONObject();
        if (receipt != null && !f.a(str)) {
            try {
                jSONObject.put(com.amazon.a.a.o.b.f11175E, receipt.getReceiptId());
                jSONObject.put(com.amazon.a.a.o.b.f11181K, receipt.getSku());
                jSONObject.put(com.amazon.a.a.o.b.f11207k, receipt.getProductType());
                jSONObject.put(com.amazon.a.a.o.b.f11187Q, receipt.getPurchaseDate());
                jSONObject.put(com.amazon.a.a.o.b.f11200d, receipt.getCancelDate());
                jSONObject.put("signature", str);
                return jSONObject;
            } catch (JSONException unused) {
                b.b(f11689a, "Failure during toJsonInternal: " + receipt + ", signature:" + str);
            }
        }
        return jSONObject;
    }

    public static String b(Receipt receipt, String str) {
        try {
            return a(receipt, str).toString(4);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static List<Receipt> a(String str, String str2, String str3) {
        if (str2 == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = new JSONArray(str2);
        for (int i6 = 0; i6 < jSONArray.length(); i6++) {
            try {
                arrayList.add(a(jSONArray.getJSONObject(i6), str, str3));
            } catch (e e6) {
                b.b(f11689a, "fail to parse receipt, requestId:" + e6.a());
                throw e6;
            } catch (com.amazon.device.iap.internal.a.f e7) {
                b.b(f11689a, "fail to verify receipt, requestId:" + e7.a());
                throw e7;
            } catch (Throwable th) {
                b.b(f11689a, "fail to verify receipt, requestId:" + th.getMessage());
                throw th;
            }
        }
        return arrayList;
    }
}
