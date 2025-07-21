package com.braze.support;

import com.appsflyer.AppsFlyerProperties;
import com.braze.storage.e0;
import com.braze.support.BrazeLogger;
import com.braze.support.ValidationUtils;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\n\u0010\bJ\u0019\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\f\u0010\rJ=\u0010\u0016\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0019\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001d\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\"\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001fH\u0007¢\u0006\u0004\b\"\u0010#J\u0019\u0010%\u001a\u00020\u00062\b\u0010$\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b%\u0010\bJ\u0019\u0010(\u001a\u00020\u00062\b\u0010&\u001a\u0004\u0018\u00010\u0004H\u0001¢\u0006\u0004\b'\u0010\bR\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00040)8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00100R\u0014\u00102\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00100¨\u00063"}, d2 = {"Lcom/braze/support/ValidationUtils;", "", "<init>", "()V", "", "emailAddress", "", "isValidEmailAddress", "(Ljava/lang/String;)Z", "phoneNumber", "isValidPhoneNumber", "field", "ensureBrazeFieldLength", "(Ljava/lang/String;)Ljava/lang/String;", "productId", AppsFlyerProperties.CURRENCY_CODE, "Ljava/math/BigDecimal;", com.amazon.a.a.o.b.f11220x, "", "quantity", "Lcom/braze/storage/e0;", "serverConfigStorageProvider", "isValidLogPurchaseInput", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;ILcom/braze/storage/e0;)Z", "eventName", "isValidLogCustomEventInput", "(Ljava/lang/String;Lcom/braze/storage/e0;)Z", "campaignId", "pageId", "isValidPushStoryClickInput", "(Ljava/lang/String;Ljava/lang/String;)Z", "", "latitude", "longitude", "isValidLocation", "(DD)Z", "lineId", "isValidLineId", "customEndpoint", "isInvalidCustomEndpoint$android_sdk_base_release", "isInvalidCustomEndpoint", "", "VALID_CURRENCY_CODES", "Ljava/util/Set;", "getVALID_CURRENCY_CODES", "()Ljava/util/Set;", "Lkotlin/text/Regex;", "EMAIL_ADDRESS_REGEX", "Lkotlin/text/Regex;", "PHONE_NUMBER_REGEX", "ENDPOINT_REGEX", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class ValidationUtils {
    public static final ValidationUtils INSTANCE = new ValidationUtils();
    private static final Set<String> VALID_CURRENCY_CODES = SetsKt.setOf(new String[]{"AED", "AFN", "ALL", "AMD", "ANG", "AOA", "ARS", "AUD", "AWG", "AZN", "BAM", "BBD", "BDT", "BGN", "BHD", "BIF", "BMD", "BND", "BOB", "BRL", "BSD", "BTC", "BTN", "BWP", "BYR", "BZD", "CAD", "CDF", "CHF", "CLF", "CLP", "CNY", "COP", "CRC", "CUC", "CUP", "CVE", "CZK", "DJF", "DKK", "DOP", "DZD", "EEK", "EGP", "ERN", "ETB", "EUR", "FJD", "FKP", "GBP", "GEL", "GGP", "GHS", "GIP", "GMD", "GNF", "GTQ", "GYD", "HKD", "HNL", "HRK", "HTG", "HUF", "IDR", "ILS", "IMP", "INR", "IQD", "IRR", "ISK", "JEP", "JMD", "JOD", "JPY", "KES", "KGS", "KHR", "KMF", "KPW", "KRW", "KWD", "KYD", "KZT", "LAK", "LBP", "LKR", "LRD", "LSL", "LTL", "LVL", "LYD", "MAD", "MDL", "MGA", "MKD", "MMK", "MNT", "MOP", "MRO", "MTL", "MUR", "MVR", "MWK", "MXN", "MYR", "MZN", "NAD", "NGN", "NIO", "NOK", "NPR", "NZD", "OMR", "PAB", "PEN", "PGK", "PHP", "PKR", "PLN", "PYG", "QAR", "RON", "RSD", "RUB", "RWF", "SAR", "SBD", "SCR", "SDG", "SEK", "SGD", "SHP", "SLL", "SOS", "SRD", "STD", "SVC", "SYP", "SZL", "THB", "TJS", "TMT", "TND", "TOP", "TRY", "TTD", "TWD", "TZS", "UAH", "UGX", "USD", "UYU", "UZS", "VEF", "VND", "VUV", "WST", "XAF", "XAG", "XAU", "XCD", "XDR", "XOF", "XPD", "XPF", "XPT", "YER", "ZAR", "ZMK", "ZMW", "ZWL"});
    private static final Regex EMAIL_ADDRESS_REGEX = new Regex(".+@.+\\..+");
    private static final Regex PHONE_NUMBER_REGEX = new Regex("^[0-9 .\\(\\)\\+\\-]+$");
    private static final Regex ENDPOINT_REGEX = new Regex("rest\\.[a-z]+-[0-9]+\\.braze\\.");

    private ValidationUtils() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10, types: [T, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v4, types: [T, java.lang.String] */
    @JvmStatic
    public static final String ensureBrazeFieldLength(String field) {
        if (field == null || StringsKt.isBlank(field)) {
            return "";
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? obj = StringsKt.trim(field).toString();
        objectRef.element = obj;
        if (obj.length() > 255) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: p4.I0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String ensureBrazeFieldLength$lambda$0;
                    ensureBrazeFieldLength$lambda$0 = ValidationUtils.ensureBrazeFieldLength$lambda$0(Ref.ObjectRef.this);
                    return ensureBrazeFieldLength$lambda$0;
                }
            }, 6, (Object) null);
            ?? substring = ((String) objectRef.element).substring(0, 255);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            objectRef.element = substring;
        }
        return (String) objectRef.element;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final String ensureBrazeFieldLength$lambda$0(Ref.ObjectRef objectRef) {
        return "Provided string field is too long [" + ((String) objectRef.element).length() + "]. The max length is 255, truncating provided field.";
    }

    @JvmStatic
    public static final boolean isInvalidCustomEndpoint$android_sdk_base_release(String customEndpoint) {
        if (customEndpoint != null) {
            return ENDPOINT_REGEX.containsMatchIn(customEndpoint);
        }
        return false;
    }

    @JvmStatic
    public static final boolean isValidEmailAddress(String emailAddress) {
        if (emailAddress == null || emailAddress.length() == 0 || emailAddress.length() > 255) {
            return false;
        }
        return EMAIL_ADDRESS_REGEX.matches(emailAddress);
    }

    @JvmStatic
    public static final boolean isValidLineId(String lineId) {
        return lineId != null && lineId.length() <= 33;
    }

    @JvmStatic
    public static final boolean isValidLocation(double latitude, double longitude) {
        return latitude < 90.0d && latitude > -90.0d && longitude < 180.0d && longitude > -180.0d;
    }

    @JvmStatic
    public static final boolean isValidLogCustomEventInput(final String eventName, e0 serverConfigStorageProvider) {
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        if (eventName == null || StringsKt.isBlank(eventName)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: p4.K0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String isValidLogCustomEventInput$lambda$8;
                    isValidLogCustomEventInput$lambda$8 = ValidationUtils.isValidLogCustomEventInput$lambda$8();
                    return isValidLogCustomEventInput$lambda$8;
                }
            }, 6, (Object) null);
            return false;
        }
        if (!serverConfigStorageProvider.f().contains(eventName)) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: p4.J0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String isValidLogCustomEventInput$lambda$9;
                isValidLogCustomEventInput$lambda$9 = ValidationUtils.isValidLogCustomEventInput$lambda$9(eventName);
                return isValidLogCustomEventInput$lambda$9;
            }
        }, 6, (Object) null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isValidLogCustomEventInput$lambda$8() {
        return "The custom event name cannot be null or contain only whitespaces. Invalid custom event.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isValidLogCustomEventInput$lambda$9(String str) {
        return com.braze.a.a("The custom event is a blocklisted custom event: ", str, ". Invalid custom event.");
    }

    @JvmStatic
    public static final boolean isValidLogPurchaseInput(final String productId, final String currencyCode, BigDecimal price, final int quantity, e0 serverConfigStorageProvider) {
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        if (productId == null || StringsKt.isBlank(productId)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: p4.H0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String isValidLogPurchaseInput$lambda$1;
                    isValidLogPurchaseInput$lambda$1 = ValidationUtils.isValidLogPurchaseInput$lambda$1();
                    return isValidLogPurchaseInput$lambda$1;
                }
            }, 6, (Object) null);
            return false;
        }
        if (serverConfigStorageProvider.g().contains(productId)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: p4.z0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String isValidLogPurchaseInput$lambda$2;
                    isValidLogPurchaseInput$lambda$2 = ValidationUtils.isValidLogPurchaseInput$lambda$2(productId);
                    return isValidLogPurchaseInput$lambda$2;
                }
            }, 6, (Object) null);
            return false;
        }
        if (currencyCode == null || StringsKt.isBlank(currencyCode)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: p4.G0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String isValidLogPurchaseInput$lambda$3;
                    isValidLogPurchaseInput$lambda$3 = ValidationUtils.isValidLogPurchaseInput$lambda$3();
                    return isValidLogPurchaseInput$lambda$3;
                }
            }, 6, (Object) null);
            return false;
        }
        Set<String> set = VALID_CURRENCY_CODES;
        String obj = StringsKt.trim(currencyCode).toString();
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String upperCase = obj.toUpperCase(US);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        if (!set.contains(upperCase)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: p4.C0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String isValidLogPurchaseInput$lambda$4;
                    isValidLogPurchaseInput$lambda$4 = ValidationUtils.isValidLogPurchaseInput$lambda$4(currencyCode);
                    return isValidLogPurchaseInput$lambda$4;
                }
            }, 6, (Object) null);
            return false;
        }
        if (price == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: p4.D0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String isValidLogPurchaseInput$lambda$5;
                    isValidLogPurchaseInput$lambda$5 = ValidationUtils.isValidLogPurchaseInput$lambda$5();
                    return isValidLogPurchaseInput$lambda$5;
                }
            }, 6, (Object) null);
            return false;
        }
        if (quantity <= 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: p4.E0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String isValidLogPurchaseInput$lambda$6;
                    isValidLogPurchaseInput$lambda$6 = ValidationUtils.isValidLogPurchaseInput$lambda$6(quantity);
                    return isValidLogPurchaseInput$lambda$6;
                }
            }, 6, (Object) null);
            return false;
        }
        if (quantity <= 100) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: p4.F0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String isValidLogPurchaseInput$lambda$7;
                isValidLogPurchaseInput$lambda$7 = ValidationUtils.isValidLogPurchaseInput$lambda$7(quantity);
                return isValidLogPurchaseInput$lambda$7;
            }
        }, 6, (Object) null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isValidLogPurchaseInput$lambda$1() {
        return "The productId is empty, not logging in-app purchase to Braze.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isValidLogPurchaseInput$lambda$2(String str) {
        return com.braze.j.a("The productId is a blocklisted productId: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isValidLogPurchaseInput$lambda$3() {
        return "The currencyCode is empty. Expected one of " + VALID_CURRENCY_CODES;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isValidLogPurchaseInput$lambda$4(String str) {
        return "The currencyCode " + str + " is invalid. Expected one of " + VALID_CURRENCY_CODES;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isValidLogPurchaseInput$lambda$5() {
        return "The price is null.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isValidLogPurchaseInput$lambda$6(int i6) {
        return "The requested purchase quantity of " + i6 + " is less than one. Invalid purchase";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isValidLogPurchaseInput$lambda$7(int i6) {
        return "The requested purchase quantity of " + i6 + " is greater than the maximum of 100";
    }

    @JvmStatic
    public static final boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber != null && PHONE_NUMBER_REGEX.matches(phoneNumber);
    }

    @JvmStatic
    public static final boolean isValidPushStoryClickInput(String campaignId, String pageId) {
        if (campaignId == null || StringsKt.isBlank(campaignId)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: p4.B0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String isValidPushStoryClickInput$lambda$10;
                    isValidPushStoryClickInput$lambda$10 = ValidationUtils.isValidPushStoryClickInput$lambda$10();
                    return isValidPushStoryClickInput$lambda$10;
                }
            }, 6, (Object) null);
            return false;
        }
        if (pageId != null && !StringsKt.isBlank(pageId)) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: p4.A0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String isValidPushStoryClickInput$lambda$11;
                isValidPushStoryClickInput$lambda$11 = ValidationUtils.isValidPushStoryClickInput$lambda$11();
                return isValidPushStoryClickInput$lambda$11;
            }
        }, 6, (Object) null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isValidPushStoryClickInput$lambda$10() {
        return "Campaign ID cannot be null or blank";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isValidPushStoryClickInput$lambda$11() {
        return "Push story page ID cannot be null or blank";
    }
}
