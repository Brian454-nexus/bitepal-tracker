package com.braze;

import com.appsflyer.AdRevenueScheme;
import com.braze.BrazeUser;
import com.braze.enums.BrazeDateFormat;
import com.braze.enums.Gender;
import com.braze.enums.Month;
import com.braze.enums.NotificationSubscriptionType;
import com.braze.models.outgoing.AttributionData;
import com.braze.models.outgoing.BrazeLocation;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.JsonUtils;
import com.braze.support.ValidationUtils;
import ga.L;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B1\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0019\u0010\u0015J\u0015\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010#\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001e¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00102\b\u0010%\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b&\u0010\u0015J\u0017\u0010(\u001a\u00020\u00102\b\u0010'\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b(\u0010\u0015J\u0017\u0010*\u001a\u00020\u00102\b\u0010)\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b*\u0010\u0015J\u0015\u0010-\u001a\u00020\u00102\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\u0015\u00100\u001a\u00020\u00102\u0006\u0010/\u001a\u00020+¢\u0006\u0004\b0\u0010.J\u0015\u00102\u001a\u00020\u00102\u0006\u00101\u001a\u00020\u0006¢\u0006\u0004\b2\u0010\u0015J\u0015\u00103\u001a\u00020\u00102\u0006\u00101\u001a\u00020\u0006¢\u0006\u0004\b3\u0010\u0015J\u0017\u00105\u001a\u00020\u00102\b\u00104\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b5\u0010\u0015J\u0017\u00107\u001a\u00020\u00102\b\u00106\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b7\u0010\u0015J\u001d\u0010:\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u0010¢\u0006\u0004\b:\u0010;J\u001d\u0010:\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u001e¢\u0006\u0004\b:\u0010<J\u001d\u0010:\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u0006¢\u0006\u0004\b:\u0010\u0012J\u001d\u0010:\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020=¢\u0006\u0004\b:\u0010>J)\u0010:\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020?2\b\b\u0002\u0010@\u001a\u00020\u0010H\u0007¢\u0006\u0004\b:\u0010AJ\u001d\u0010B\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u0006¢\u0006\u0004\bB\u0010\u0012J\u001d\u0010C\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u0006¢\u0006\u0004\bC\u0010\u0012J%\u0010F\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00062\u000e\u0010E\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060D¢\u0006\u0004\bF\u0010GJ\u001d\u0010J\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00062\u0006\u0010I\u001a\u00020H¢\u0006\u0004\bJ\u0010KJ!\u0010M\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00062\b\b\u0002\u0010L\u001a\u00020\u001eH\u0007¢\u0006\u0004\bM\u0010<J\u0015\u0010N\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u0006¢\u0006\u0004\bN\u0010\u0015J\u0017\u0010Q\u001a\u00020\u00102\b\u0010P\u001a\u0004\u0018\u00010O¢\u0006\u0004\bQ\u0010RJC\u0010Y\u001a\u00020X2\u0006\u0010S\u001a\u00020=2\u0006\u0010T\u001a\u00020=2\n\b\u0002\u0010U\u001a\u0004\u0018\u00010=2\n\b\u0002\u0010V\u001a\u0004\u0018\u00010=2\n\b\u0002\u0010W\u001a\u0004\u0018\u00010=H\u0007¢\u0006\u0004\bY\u0010ZJ%\u0010[\u001a\u00020X2\u0006\u00108\u001a\u00020\u00062\u0006\u0010S\u001a\u00020=2\u0006\u0010T\u001a\u00020=¢\u0006\u0004\b[\u0010\\J)\u0010]\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u00012\b\b\u0002\u0010@\u001a\u00020\u0010H\u0007¢\u0006\u0004\b]\u0010^J\u001d\u0010_\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00062\u0006\u0010I\u001a\u00020H¢\u0006\u0004\b_\u0010KR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010`R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010aR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010cR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010dR\u0014\u0010f\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR$\u0010h\u001a\u00020\u00062\u0006\u0010h\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bi\u0010j\"\u0004\bk\u0010l¨\u0006m"}, d2 = {"Lcom/braze/BrazeUser;", "", "Lcom/braze/storage/h0;", "userCache", "Lcom/braze/managers/c0;", "brazeManager", "", "internalUserId", "Lcom/braze/managers/f0;", "locationManager", "Lcom/braze/storage/e0;", "serverConfigStorageProvider", "<init>", "(Lcom/braze/storage/h0;Lcom/braze/managers/c0;Ljava/lang/String;Lcom/braze/managers/f0;Lcom/braze/storage/e0;)V", "alias", "label", "", "addAlias", "(Ljava/lang/String;Ljava/lang/String;)Z", "firstName", "setFirstName", "(Ljava/lang/String;)Z", "lastName", "setLastName", "email", "setEmail", "Lcom/braze/enums/Gender;", "gender", "setGender", "(Lcom/braze/enums/Gender;)Z", "", "year", "Lcom/braze/enums/Month;", "month", "day", "setDateOfBirth", "(ILcom/braze/enums/Month;I)Z", AdRevenueScheme.COUNTRY, "setCountry", "homeCity", "setHomeCity", "language", "setLanguage", "Lcom/braze/enums/NotificationSubscriptionType;", "emailNotificationSubscriptionType", "setEmailNotificationSubscriptionType", "(Lcom/braze/enums/NotificationSubscriptionType;)Z", "pushNotificationSubscriptionType", "setPushNotificationSubscriptionType", "subscriptionGroupId", "addToSubscriptionGroup", "removeFromSubscriptionGroup", "phoneNumber", "setPhoneNumber", "lineId", "setLineId", "key", com.amazon.a.a.o.b.f11195Y, "setCustomUserAttribute", "(Ljava/lang/String;Z)Z", "(Ljava/lang/String;I)Z", "", "(Ljava/lang/String;D)Z", "Lorg/json/JSONObject;", "merge", "(Ljava/lang/String;Lorg/json/JSONObject;Z)Z", "addToCustomAttributeArray", "removeFromCustomAttributeArray", "", "values", "setCustomAttributeArray", "(Ljava/lang/String;[Ljava/lang/String;)Z", "", "secondsFromEpoch", "setCustomUserAttributeToSecondsFromEpoch", "(Ljava/lang/String;J)Z", "incrementValue", "incrementCustomUserAttribute", "unsetCustomUserAttribute", "Lcom/braze/models/outgoing/AttributionData;", "attributionData", "setAttributionData", "(Lcom/braze/models/outgoing/AttributionData;)Z", "latitude", "longitude", "altitude", "accuracy", "verticalAccuracy", "", "setLastKnownLocation", "(DDLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "setLocationCustomAttribute", "(Ljava/lang/String;DD)V", "setCustomAttribute", "(Ljava/lang/String;Ljava/lang/Object;Z)Z", "setCustomAttributeToSecondsFromEpoch", "Lcom/braze/storage/h0;", "Lcom/braze/managers/c0;", "Ljava/lang/String;", "Lcom/braze/managers/f0;", "Lcom/braze/storage/e0;", "Ljava/util/concurrent/locks/ReentrantLock;", "userIdLock", "Ljava/util/concurrent/locks/ReentrantLock;", "userId", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class BrazeUser {
    private final com.braze.managers.c0 brazeManager;
    private volatile String internalUserId;
    private final com.braze.managers.f0 locationManager;
    private final com.braze.storage.e0 serverConfigStorageProvider;
    private final com.braze.storage.h0 userCache;
    private final ReentrantLock userIdLock;

    public BrazeUser(com.braze.storage.h0 userCache, com.braze.managers.c0 brazeManager, String internalUserId, com.braze.managers.f0 locationManager, com.braze.storage.e0 serverConfigStorageProvider) {
        Intrinsics.checkNotNullParameter(userCache, "userCache");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        Intrinsics.checkNotNullParameter(internalUserId, "internalUserId");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        this.userCache = userCache;
        this.brazeManager = brazeManager;
        this.internalUserId = internalUserId;
        this.locationManager = locationManager;
        this.serverConfigStorageProvider = serverConfigStorageProvider;
        this.userIdLock = new ReentrantLock();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_userId_$lambda$1(String str) {
        return j.a("User object user id set to: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addAlias$lambda$4() {
        return "Invalid alias parameter: alias is required to be non-null and non-empty. Not adding alias.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addAlias$lambda$5() {
        return "Invalid label parameter: label is required to be non-null and non-empty. Not adding alias.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addAlias$lambda$7(String str) {
        return j.a("Failed to set alias: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addToCustomAttributeArray$lambda$51() {
        return "Custom attribute key was invalid. Not adding to attribute array.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addToCustomAttributeArray$lambda$52(String str) {
        return a.a("Failed to add custom attribute with key '", str, "'.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addToSubscriptionGroup$lambda$27() {
        return "Invalid subscription group ID: subscription group ID is required to be non-null and non-empty. Not adding user to subscription group.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addToSubscriptionGroup$lambda$29(String str) {
        return j.a("Failed to add user to subscription group ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String incrementCustomUserAttribute$lambda$58(String str, int i6) {
        return "Failed to increment custom attribute " + str + " by " + i6 + com.amazon.a.a.o.c.a.b.f11260a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeFromCustomAttributeArray$lambda$53() {
        return "Custom attribute key was invalid. Not removing from attribute array.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeFromCustomAttributeArray$lambda$54(String str) {
        return a.a("Failed to remove custom attribute with key '", str, "'.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeFromSubscriptionGroup$lambda$30() {
        return "Invalid subscription group ID: subscription group ID is required to be non-null and non-empty. Not removing user from subscription group.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeFromSubscriptionGroup$lambda$32(String str) {
        return j.a("Failed to remove user from subscription group ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setAttributionData$lambda$61() {
        return "Failed to set attribution data.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCountry$lambda$19() {
        return "Invalid country parameter: country is required to be non-blank. Not setting country.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCountry$lambda$20(String str) {
        return j.a("Failed to set country to: ", str);
    }

    public static /* synthetic */ boolean setCustomAttribute$default(BrazeUser brazeUser, String str, Object obj, boolean z6, int i6, Object obj2) {
        if ((i6 & 4) != 0) {
            z6 = false;
        }
        return brazeUser.setCustomAttribute(str, obj, z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomAttribute$lambda$70() {
        return "Custom attribute key cannot be null.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomAttribute$lambda$73$lambda$71(String str, Object obj) {
        return "Could not add unsupported custom attribute value with key: " + str + " and value: " + obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomAttribute$lambda$73$lambda$72(String str, Object obj) {
        return "Could not build NestedCustomAttributeEvent for key " + str + " and " + obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomAttributeArray$lambda$55(String str) {
        return a.a("Failed to set custom attribute array with key: '", str, "'.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomUserAttribute$lambda$43(String str) {
        return b.a("Failed to set custom boolean attribute ", str, com.amazon.a.a.o.c.a.b.f11260a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomUserAttribute$lambda$44(String str) {
        return b.a("Failed to set custom integer attribute ", str, com.amazon.a.a.o.c.a.b.f11260a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomUserAttribute$lambda$47(String str) {
        return b.a("Failed to set custom string attribute ", str, com.amazon.a.a.o.c.a.b.f11260a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomUserAttribute$lambda$48(String str) {
        return b.a("Failed to set custom double attribute ", str, com.amazon.a.a.o.c.a.b.f11260a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomUserAttribute$lambda$49(String str, JSONObject jSONObject) {
        return "Failed to set custom json attribute " + str + " with value \n" + JsonUtils.getPrettyPrintedString(jSONObject) + com.amazon.a.a.o.c.a.b.f11260a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomUserAttributeToSecondsFromEpoch$lambda$57(String str, long j6) {
        return "Failed to set custom attribute " + str + " to " + j6 + " seconds from epoch.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setDateOfBirth$lambda$18(int i6, Month month, int i7) {
        return "Failed to set date of birth to: " + i6 + '-' + month.getValue() + '-' + i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setEmail$lambda$12() {
        return "Invalid email parameter: email is required to be non-empty. Not setting email.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setEmail$lambda$15$lambda$14(String str) {
        return j.a("Email address is not valid: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setEmail$lambda$16(String str) {
        return j.a("Failed to set email to: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setEmailNotificationSubscriptionType$lambda$25(NotificationSubscriptionType notificationSubscriptionType) {
        return "Failed to set email notification subscription to: " + notificationSubscriptionType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setFirstName$lambda$8() {
        return "Invalid first name parameter: first name is required to be non-empty. Not setting first name.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setFirstName$lambda$9(String str) {
        return j.a("Failed to set first name to: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setGender$lambda$17(Gender gender) {
        return "Failed to set gender to: " + gender;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setHomeCity$lambda$21() {
        return "Invalid home city parameter: home city is required to be non-blank. Not setting home city.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setHomeCity$lambda$22(String str) {
        return j.a("Failed to set home city to: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLanguage$lambda$23() {
        return "Invalid language parameter: language is required to be non-empty. Not setting language.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLanguage$lambda$24(String str) {
        return j.a("Failed to set language to: ", str);
    }

    public static /* synthetic */ void setLastKnownLocation$default(BrazeUser brazeUser, double d6, double d7, Double d8, Double d9, Double d10, int i6, Object obj) {
        if ((i6 & 4) != 0) {
            d8 = null;
        }
        if ((i6 & 8) != 0) {
            d9 = null;
        }
        if ((i6 & 16) != 0) {
            d10 = null;
        }
        brazeUser.setLastKnownLocation(d6, d7, d8, d9, d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLastKnownLocation$lambda$62() {
        return "Failed to manually set location.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLastName$lambda$10() {
        return "Invalid last name parameter: last name is required to be non-empty. Not setting last name.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLastName$lambda$11(String str) {
        return j.a("Failed to set last name to: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLineId$lambda$38() {
        return "Invalid LINE ID parameter: LINE ID is required to be non-empty or null. Not setting LINE ID.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLineId$lambda$41$lambda$40(String str) {
        return j.a("LINE ID is longer than 33 characters: Failed to set LINE ID: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLineId$lambda$42(String str) {
        return j.a("Failed to set LINE ID to: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLocationCustomAttribute$lambda$63() {
        return "Custom location attribute key was invalid. Not setting attribute.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLocationCustomAttribute$lambda$64(double d6, double d7) {
        return "Cannot set custom location attribute due with invalid latitude '" + d6 + " and longitude '" + d7 + '\'';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLocationCustomAttribute$lambda$66(String str, double d6, double d7) {
        return "Failed to set custom location attribute with key '" + str + "' and latitude '" + d6 + "' and longitude '" + d7 + '\'';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setPhoneNumber$lambda$33() {
        return "Invalid phone number parameter: phone number is required to be non-empty. Not setting phone number.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setPhoneNumber$lambda$36$lambda$35(String str) {
        return j.a("Phone number contains invalid characters (allowed are digits, spaces, or any of the following +.-()): ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setPhoneNumber$lambda$37(String str) {
        return j.a("Failed to set phone number to: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setPushNotificationSubscriptionType$lambda$26(NotificationSubscriptionType notificationSubscriptionType) {
        return "Failed to set push notification subscription to: " + notificationSubscriptionType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unsetCustomUserAttribute$lambda$59() {
        return "Custom attribute key cannot be null.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unsetCustomUserAttribute$lambda$60(String str) {
        return b.a("Failed to unset custom attribute ", str, com.amazon.a.a.o.c.a.b.f11260a);
    }

    public final boolean addAlias(final String alias, String label) {
        BrazeUser brazeUser;
        Intrinsics.checkNotNullParameter(alias, "alias");
        Intrinsics.checkNotNullParameter(label, "label");
        if (StringsKt.isBlank(alias)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: N3.V3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String addAlias$lambda$4;
                    addAlias$lambda$4 = BrazeUser.addAlias$lambda$4();
                    return addAlias$lambda$4;
                }
            }, 6, (Object) null);
            return false;
        }
        if (StringsKt.isBlank(label)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: N3.W3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String addAlias$lambda$5;
                    addAlias$lambda$5 = BrazeUser.addAlias$lambda$5();
                    return addAlias$lambda$5;
                }
            }, 6, (Object) null);
            return false;
        }
        try {
            com.braze.models.i s6 = com.braze.models.outgoing.event.b.f12605g.s(alias, label);
            if (s6 == null) {
                return false;
            }
            brazeUser = this;
            try {
                return ((com.braze.managers.m) brazeUser.brazeManager).a(s6);
            } catch (Exception e6) {
                e = e6;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.f12981E, (Throwable) e, false, new Function0() { // from class: N3.X3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String addAlias$lambda$7;
                        addAlias$lambda$7 = BrazeUser.addAlias$lambda$7(alias);
                        return addAlias$lambda$7;
                    }
                }, 4, (Object) null);
                return false;
            }
        } catch (Exception e7) {
            e = e7;
            brazeUser = this;
        }
    }

    public final boolean addToCustomAttributeArray(final String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            if (!com.braze.support.d.a(key, this.serverConfigStorageProvider.e())) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: N3.J3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String addToCustomAttributeArray$lambda$51;
                        addToCustomAttributeArray$lambda$51 = BrazeUser.addToCustomAttributeArray$lambda$51();
                        return addToCustomAttributeArray$lambda$51;
                    }
                }, 6, (Object) null);
                return false;
            }
            if (!com.braze.support.d.c(value)) {
                return false;
            }
            com.braze.models.i a6 = com.braze.models.outgoing.event.b.f12605g.a(ValidationUtils.ensureBrazeFieldLength(key), ValidationUtils.ensureBrazeFieldLength(value));
            if (a6 == null) {
                return false;
            }
            return ((com.braze.managers.m) this.brazeManager).a(a6);
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) e6, false, new Function0() { // from class: N3.K3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String addToCustomAttributeArray$lambda$52;
                    addToCustomAttributeArray$lambda$52 = BrazeUser.addToCustomAttributeArray$lambda$52(key);
                    return addToCustomAttributeArray$lambda$52;
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final boolean addToSubscriptionGroup(final String subscriptionGroupId) {
        BrazeUser brazeUser;
        Intrinsics.checkNotNullParameter(subscriptionGroupId, "subscriptionGroupId");
        try {
            if (StringsKt.isBlank(subscriptionGroupId)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: N3.q3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String addToSubscriptionGroup$lambda$27;
                        addToSubscriptionGroup$lambda$27 = BrazeUser.addToSubscriptionGroup$lambda$27();
                        return addToSubscriptionGroup$lambda$27;
                    }
                }, 6, (Object) null);
                return false;
            }
            com.braze.models.i a6 = com.braze.models.outgoing.event.b.f12605g.a(subscriptionGroupId, com.braze.enums.h.f12215a);
            if (a6 == null) {
                return true;
            }
            brazeUser = this;
            try {
                ((com.braze.managers.m) brazeUser.brazeManager).a(a6);
                return true;
            } catch (Exception e6) {
                e = e6;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.f12984W, (Throwable) e, false, new Function0() { // from class: N3.r3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String addToSubscriptionGroup$lambda$29;
                        addToSubscriptionGroup$lambda$29 = BrazeUser.addToSubscriptionGroup$lambda$29(subscriptionGroupId);
                        return addToSubscriptionGroup$lambda$29;
                    }
                }, 4, (Object) null);
                return false;
            }
        } catch (Exception e7) {
            e = e7;
            brazeUser = this;
        }
    }

    public final String getUserId() {
        ReentrantLock reentrantLock = this.userIdLock;
        reentrantLock.lock();
        try {
            return this.internalUserId;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean incrementCustomUserAttribute(final String key, final int incrementValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            if (!com.braze.support.d.a(key, this.serverConfigStorageProvider.e())) {
                return false;
            }
            com.braze.models.i a6 = com.braze.models.outgoing.event.b.f12605g.a(ValidationUtils.ensureBrazeFieldLength(key), incrementValue);
            if (a6 == null) {
                return false;
            }
            return ((com.braze.managers.m) this.brazeManager).a(a6);
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) e6, false, new Function0() { // from class: N3.m3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String incrementCustomUserAttribute$lambda$58;
                    incrementCustomUserAttribute$lambda$58 = BrazeUser.incrementCustomUserAttribute$lambda$58(key, incrementValue);
                    return incrementCustomUserAttribute$lambda$58;
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final boolean removeFromCustomAttributeArray(final String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            if (!com.braze.support.d.a(key, this.serverConfigStorageProvider.e())) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: N3.h4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String removeFromCustomAttributeArray$lambda$53;
                        removeFromCustomAttributeArray$lambda$53 = BrazeUser.removeFromCustomAttributeArray$lambda$53();
                        return removeFromCustomAttributeArray$lambda$53;
                    }
                }, 6, (Object) null);
                return false;
            }
            if (!com.braze.support.d.c(value)) {
                return false;
            }
            com.braze.models.i q6 = com.braze.models.outgoing.event.b.f12605g.q(ValidationUtils.ensureBrazeFieldLength(key), ValidationUtils.ensureBrazeFieldLength(value));
            if (q6 == null) {
                return false;
            }
            return ((com.braze.managers.m) this.brazeManager).a(q6);
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) e6, false, new Function0() { // from class: N3.i3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String removeFromCustomAttributeArray$lambda$54;
                    removeFromCustomAttributeArray$lambda$54 = BrazeUser.removeFromCustomAttributeArray$lambda$54(key);
                    return removeFromCustomAttributeArray$lambda$54;
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final boolean removeFromSubscriptionGroup(final String subscriptionGroupId) {
        BrazeUser brazeUser;
        Intrinsics.checkNotNullParameter(subscriptionGroupId, "subscriptionGroupId");
        try {
            if (StringsKt.isBlank(subscriptionGroupId)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: N3.O3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String removeFromSubscriptionGroup$lambda$30;
                        removeFromSubscriptionGroup$lambda$30 = BrazeUser.removeFromSubscriptionGroup$lambda$30();
                        return removeFromSubscriptionGroup$lambda$30;
                    }
                }, 6, (Object) null);
                return false;
            }
            com.braze.models.i a6 = com.braze.models.outgoing.event.b.f12605g.a(subscriptionGroupId, com.braze.enums.h.f12216b);
            if (a6 == null) {
                return true;
            }
            brazeUser = this;
            try {
                ((com.braze.managers.m) brazeUser.brazeManager).a(a6);
                return true;
            } catch (Exception e6) {
                e = e6;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.f12984W, (Throwable) e, false, new Function0() { // from class: N3.Z3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String removeFromSubscriptionGroup$lambda$32;
                        removeFromSubscriptionGroup$lambda$32 = BrazeUser.removeFromSubscriptionGroup$lambda$32(subscriptionGroupId);
                        return removeFromSubscriptionGroup$lambda$32;
                    }
                }, 4, (Object) null);
                return false;
            }
        } catch (Exception e7) {
            e = e7;
            brazeUser = this;
        }
    }

    public final boolean setAttributionData(AttributionData attributionData) {
        try {
            ga.i.d(com.braze.coroutine.f.f12131a, (CoroutineContext) null, (L) null, new c0(this, attributionData, null), 3, (Object) null);
            return true;
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) e6, false, new Function0() { // from class: N3.R3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String attributionData$lambda$61;
                    attributionData$lambda$61 = BrazeUser.setAttributionData$lambda$61();
                    return attributionData$lambda$61;
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final boolean setCountry(final String country) {
        BrazeUser brazeUser;
        if (country != null) {
            try {
                if (StringsKt.isBlank(country)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: N3.t3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String country$lambda$19;
                            country$lambda$19 = BrazeUser.setCountry$lambda$19();
                            return country$lambda$19;
                        }
                    }, 6, (Object) null);
                    return false;
                }
            } catch (Exception e6) {
                e = e6;
                brazeUser = this;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.f12984W, (Throwable) e, false, new Function0() { // from class: N3.u3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String country$lambda$20;
                        country$lambda$20 = BrazeUser.setCountry$lambda$20(country);
                        return country$lambda$20;
                    }
                }, 4, (Object) null);
                return false;
            }
        }
        brazeUser = this;
        try {
            ga.i.d(com.braze.coroutine.f.f12131a, (CoroutineContext) null, (L) null, new d0(brazeUser, country, null), 3, (Object) null);
            return true;
        } catch (Exception e7) {
            e = e7;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.f12984W, (Throwable) e, false, new Function0() { // from class: N3.u3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String country$lambda$20;
                    country$lambda$20 = BrazeUser.setCountry$lambda$20(country);
                    return country$lambda$20;
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final boolean setCustomAttribute(final String key, final Object value, boolean merge) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!com.braze.support.d.a(key, this.serverConfigStorageProvider.e())) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: N3.j3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String customAttribute$lambda$70;
                    customAttribute$lambda$70 = BrazeUser.setCustomAttribute$lambda$70();
                    return customAttribute$lambda$70;
                }
            }, 6, (Object) null);
            return false;
        }
        final String ensureBrazeFieldLength = ValidationUtils.ensureBrazeFieldLength(key);
        final Object a6 = com.braze.support.d.f12989a.a(value, 0);
        if (a6 == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: N3.k3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String customAttribute$lambda$73$lambda$71;
                    customAttribute$lambda$73$lambda$71 = BrazeUser.setCustomAttribute$lambda$73$lambda$71(key, value);
                    return customAttribute$lambda$73$lambda$71;
                }
            }, 6, (Object) null);
            return false;
        }
        if (!(a6 instanceof JSONObject) || !merge) {
            ga.i.d(com.braze.coroutine.f.f12131a, (CoroutineContext) null, (L) null, new e0(this, ensureBrazeFieldLength, a6, null), 3, (Object) null);
            return true;
        }
        com.braze.models.i a7 = com.braze.models.outgoing.event.b.f12605g.a(ensureBrazeFieldLength, (JSONObject) a6);
        if (a7 != null) {
            return ((com.braze.managers.m) this.brazeManager).a(a7);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: N3.l3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String customAttribute$lambda$73$lambda$72;
                customAttribute$lambda$73$lambda$72 = BrazeUser.setCustomAttribute$lambda$73$lambda$72(ensureBrazeFieldLength, a6);
                return customAttribute$lambda$73$lambda$72;
            }
        }, 6, (Object) null);
        return false;
    }

    public final boolean setCustomAttributeArray(final String key, String[] values) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(values, "values");
        try {
            if (!com.braze.support.d.a(key, this.serverConfigStorageProvider.e())) {
                return false;
            }
            String ensureBrazeFieldLength = ValidationUtils.ensureBrazeFieldLength(key);
            Intrinsics.checkNotNullParameter(values, "values");
            ArrayList arrayList = new ArrayList(values.length);
            for (String str : values) {
                arrayList.add(ValidationUtils.ensureBrazeFieldLength(str));
            }
            com.braze.models.i a6 = com.braze.models.outgoing.event.b.f12605g.a(ensureBrazeFieldLength, (String[]) arrayList.toArray(new String[0]));
            if (a6 == null) {
                return false;
            }
            return ((com.braze.managers.m) this.brazeManager).a(a6);
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) e6, false, new Function0() { // from class: N3.d4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String customAttributeArray$lambda$55;
                    customAttributeArray$lambda$55 = BrazeUser.setCustomAttributeArray$lambda$55(key);
                    return customAttributeArray$lambda$55;
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final boolean setCustomAttributeToSecondsFromEpoch(String key, long secondsFromEpoch) {
        Intrinsics.checkNotNullParameter(key, "key");
        return setCustomAttribute$default(this, key, DateTimeUtils.createDate(secondsFromEpoch), false, 4, null);
    }

    public final boolean setCustomUserAttribute(String key, boolean value) {
        String str;
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            str = key;
        } catch (Exception e6) {
            e = e6;
            str = key;
        }
        try {
            return setCustomAttribute$default(this, str, Boolean.valueOf(value), false, 4, null);
        } catch (Exception e7) {
            e = e7;
            final String str2 = str;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) e, false, new Function0() { // from class: N3.S3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String customUserAttribute$lambda$43;
                    customUserAttribute$lambda$43 = BrazeUser.setCustomUserAttribute$lambda$43(str2);
                    return customUserAttribute$lambda$43;
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final boolean setCustomUserAttributeToSecondsFromEpoch(final String key, final long secondsFromEpoch) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            return setCustomAttributeToSecondsFromEpoch(key, secondsFromEpoch);
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) e6, false, new Function0() { // from class: N3.I3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String customUserAttributeToSecondsFromEpoch$lambda$57;
                    customUserAttributeToSecondsFromEpoch$lambda$57 = BrazeUser.setCustomUserAttributeToSecondsFromEpoch$lambda$57(key, secondsFromEpoch);
                    return customUserAttributeToSecondsFromEpoch$lambda$57;
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final boolean setDateOfBirth(int year, final Month month, int day) {
        final int i6;
        final int i7;
        Intrinsics.checkNotNullParameter(month, "month");
        try {
            i6 = year;
            i7 = day;
        } catch (Exception e6) {
            e = e6;
            i6 = year;
            i7 = day;
        }
        try {
            ga.i.d(com.braze.coroutine.f.f12131a, (CoroutineContext) null, (L) null, new f0(this, DateTimeUtils.formatDate$default(DateTimeUtils.createDate$default(i6, month.getValue(), i7, 0, 0, 0, 56, null), BrazeDateFormat.SHORT, null, 2, null), null), 3, (Object) null);
            return true;
        } catch (Exception e7) {
            e = e7;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) e, false, new Function0() { // from class: N3.Q3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String dateOfBirth$lambda$18;
                    dateOfBirth$lambda$18 = BrazeUser.setDateOfBirth$lambda$18(i6, month, i7);
                    return dateOfBirth$lambda$18;
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final boolean setEmail(final String email) {
        BrazeUser brazeUser;
        String str;
        if (email != null) {
            try {
                if (StringsKt.isBlank(email)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: N3.e4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String email$lambda$12;
                            email$lambda$12 = BrazeUser.setEmail$lambda$12();
                            return email$lambda$12;
                        }
                    }, 6, (Object) null);
                    return false;
                }
            } catch (Exception e6) {
                e = e6;
                brazeUser = this;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.f12984W, (Throwable) e, false, new Function0() { // from class: N3.g4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String email$lambda$16;
                        email$lambda$16 = BrazeUser.setEmail$lambda$16(email);
                        return email$lambda$16;
                    }
                }, 4, (Object) null);
                return false;
            }
        }
        if (email != null) {
            int length = email.length() - 1;
            int i6 = 0;
            boolean z6 = false;
            while (i6 <= length) {
                boolean z7 = Intrinsics.compare((int) email.charAt(!z6 ? i6 : length), 32) <= 0;
                if (z6) {
                    if (!z7) {
                        break;
                    }
                    length--;
                } else if (z7) {
                    i6++;
                } else {
                    z6 = true;
                }
            }
            str = email.subSequence(i6, length + 1).toString();
        } else {
            str = null;
        }
        if (str != null && !ValidationUtils.isValidEmailAddress(str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: N3.f4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String email$lambda$15$lambda$14;
                    email$lambda$15$lambda$14 = BrazeUser.setEmail$lambda$15$lambda$14(email);
                    return email$lambda$15$lambda$14;
                }
            }, 7, (Object) null);
            return false;
        }
        brazeUser = this;
        try {
            ga.i.d(com.braze.coroutine.f.f12131a, (CoroutineContext) null, (L) null, new g0(brazeUser, str, null), 3, (Object) null);
            return true;
        } catch (Exception e7) {
            e = e7;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.f12984W, (Throwable) e, false, new Function0() { // from class: N3.g4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String email$lambda$16;
                    email$lambda$16 = BrazeUser.setEmail$lambda$16(email);
                    return email$lambda$16;
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final boolean setEmailNotificationSubscriptionType(final NotificationSubscriptionType emailNotificationSubscriptionType) {
        Intrinsics.checkNotNullParameter(emailNotificationSubscriptionType, "emailNotificationSubscriptionType");
        try {
            ga.i.d(com.braze.coroutine.f.f12131a, (CoroutineContext) null, (L) null, new h0(this, emailNotificationSubscriptionType, null), 3, (Object) null);
            return true;
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) e6, false, new Function0() { // from class: N3.A3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String emailNotificationSubscriptionType$lambda$25;
                    emailNotificationSubscriptionType$lambda$25 = BrazeUser.setEmailNotificationSubscriptionType$lambda$25(NotificationSubscriptionType.this);
                    return emailNotificationSubscriptionType$lambda$25;
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final boolean setFirstName(final String firstName) {
        BrazeUser brazeUser;
        if (firstName != null) {
            try {
                if (StringsKt.isBlank(firstName)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: N3.G3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String firstName$lambda$8;
                            firstName$lambda$8 = BrazeUser.setFirstName$lambda$8();
                            return firstName$lambda$8;
                        }
                    }, 6, (Object) null);
                    return false;
                }
            } catch (Exception e6) {
                e = e6;
                brazeUser = this;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.f12984W, (Throwable) e, false, new Function0() { // from class: N3.H3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String firstName$lambda$9;
                        firstName$lambda$9 = BrazeUser.setFirstName$lambda$9(firstName);
                        return firstName$lambda$9;
                    }
                }, 4, (Object) null);
                return false;
            }
        }
        brazeUser = this;
        try {
            ga.i.d(com.braze.coroutine.f.f12131a, (CoroutineContext) null, (L) null, new i0(brazeUser, firstName, null), 3, (Object) null);
            return true;
        } catch (Exception e7) {
            e = e7;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.f12984W, (Throwable) e, false, new Function0() { // from class: N3.H3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String firstName$lambda$9;
                    firstName$lambda$9 = BrazeUser.setFirstName$lambda$9(firstName);
                    return firstName$lambda$9;
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final boolean setGender(final Gender gender) {
        Intrinsics.checkNotNullParameter(gender, "gender");
        try {
            ga.i.d(com.braze.coroutine.f.f12131a, (CoroutineContext) null, (L) null, new j0(this, gender, null), 3, (Object) null);
            return true;
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) e6, false, new Function0() { // from class: N3.B3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String gender$lambda$17;
                    gender$lambda$17 = BrazeUser.setGender$lambda$17(Gender.this);
                    return gender$lambda$17;
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final boolean setHomeCity(final String homeCity) {
        BrazeUser brazeUser;
        if (homeCity != null) {
            try {
                if (StringsKt.isBlank(homeCity)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: N3.N3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String homeCity$lambda$21;
                            homeCity$lambda$21 = BrazeUser.setHomeCity$lambda$21();
                            return homeCity$lambda$21;
                        }
                    }, 6, (Object) null);
                    return false;
                }
            } catch (Exception e6) {
                e = e6;
                brazeUser = this;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.f12984W, (Throwable) e, false, new Function0() { // from class: N3.P3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String homeCity$lambda$22;
                        homeCity$lambda$22 = BrazeUser.setHomeCity$lambda$22(homeCity);
                        return homeCity$lambda$22;
                    }
                }, 4, (Object) null);
                return false;
            }
        }
        brazeUser = this;
        try {
            ga.i.d(com.braze.coroutine.f.f12131a, (CoroutineContext) null, (L) null, new k0(brazeUser, homeCity, null), 3, (Object) null);
            return true;
        } catch (Exception e7) {
            e = e7;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.f12984W, (Throwable) e, false, new Function0() { // from class: N3.P3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String homeCity$lambda$22;
                    homeCity$lambda$22 = BrazeUser.setHomeCity$lambda$22(homeCity);
                    return homeCity$lambda$22;
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final boolean setLanguage(final String language) {
        BrazeUser brazeUser;
        if (language != null) {
            try {
                if (StringsKt.isBlank(language)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: N3.E3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String language$lambda$23;
                            language$lambda$23 = BrazeUser.setLanguage$lambda$23();
                            return language$lambda$23;
                        }
                    }, 6, (Object) null);
                    return false;
                }
            } catch (Exception e6) {
                e = e6;
                brazeUser = this;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.f12984W, (Throwable) e, false, new Function0() { // from class: N3.F3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String language$lambda$24;
                        language$lambda$24 = BrazeUser.setLanguage$lambda$24(language);
                        return language$lambda$24;
                    }
                }, 4, (Object) null);
                return false;
            }
        }
        brazeUser = this;
        try {
            ga.i.d(com.braze.coroutine.f.f12131a, (CoroutineContext) null, (L) null, new l0(brazeUser, language, null), 3, (Object) null);
            return true;
        } catch (Exception e7) {
            e = e7;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.f12984W, (Throwable) e, false, new Function0() { // from class: N3.F3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String language$lambda$24;
                    language$lambda$24 = BrazeUser.setLanguage$lambda$24(language);
                    return language$lambda$24;
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final void setLastKnownLocation(double latitude, double longitude, Double altitude, Double accuracy, Double verticalAccuracy) {
        try {
            ((com.braze.managers.k) this.locationManager).a(new BrazeLocation(latitude, longitude, altitude, accuracy, verticalAccuracy));
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) e6, false, new Function0() { // from class: N3.T3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String lastKnownLocation$lambda$62;
                    lastKnownLocation$lambda$62 = BrazeUser.setLastKnownLocation$lambda$62();
                    return lastKnownLocation$lambda$62;
                }
            }, 4, (Object) null);
        }
    }

    public final boolean setLastName(final String lastName) {
        BrazeUser brazeUser;
        if (lastName != null) {
            try {
                if (StringsKt.isBlank(lastName)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: N3.L3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String lastName$lambda$10;
                            lastName$lambda$10 = BrazeUser.setLastName$lambda$10();
                            return lastName$lambda$10;
                        }
                    }, 6, (Object) null);
                    return false;
                }
            } catch (Exception e6) {
                e = e6;
                brazeUser = this;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.f12984W, (Throwable) e, false, new Function0() { // from class: N3.M3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String lastName$lambda$11;
                        lastName$lambda$11 = BrazeUser.setLastName$lambda$11(lastName);
                        return lastName$lambda$11;
                    }
                }, 4, (Object) null);
                return false;
            }
        }
        brazeUser = this;
        try {
            ga.i.d(com.braze.coroutine.f.f12131a, (CoroutineContext) null, (L) null, new m0(brazeUser, lastName, null), 3, (Object) null);
            return true;
        } catch (Exception e7) {
            e = e7;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.f12984W, (Throwable) e, false, new Function0() { // from class: N3.M3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String lastName$lambda$11;
                    lastName$lambda$11 = BrazeUser.setLastName$lambda$11(lastName);
                    return lastName$lambda$11;
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final boolean setLineId(final String lineId) {
        BrazeUser brazeUser;
        final String str;
        if (lineId != null) {
            try {
                if (StringsKt.isBlank(lineId)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: N3.a4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String lineId$lambda$38;
                            lineId$lambda$38 = BrazeUser.setLineId$lambda$38();
                            return lineId$lambda$38;
                        }
                    }, 6, (Object) null);
                    return false;
                }
            } catch (Exception e6) {
                e = e6;
                brazeUser = this;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.f12984W, (Throwable) e, false, new Function0() { // from class: N3.c4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String lineId$lambda$42;
                        lineId$lambda$42 = BrazeUser.setLineId$lambda$42(lineId);
                        return lineId$lambda$42;
                    }
                }, 4, (Object) null);
                return false;
            }
        }
        if (lineId != null) {
            int length = lineId.length() - 1;
            int i6 = 0;
            boolean z6 = false;
            while (i6 <= length) {
                boolean z7 = Intrinsics.compare((int) lineId.charAt(!z6 ? i6 : length), 32) <= 0;
                if (z6) {
                    if (!z7) {
                        break;
                    }
                    length--;
                } else if (z7) {
                    i6++;
                } else {
                    z6 = true;
                }
            }
            str = lineId.subSequence(i6, length + 1).toString();
        } else {
            str = null;
        }
        if (str != null && !ValidationUtils.isValidLineId(str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: N3.b4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String lineId$lambda$41$lambda$40;
                    lineId$lambda$41$lambda$40 = BrazeUser.setLineId$lambda$41$lambda$40(str);
                    return lineId$lambda$41$lambda$40;
                }
            }, 6, (Object) null);
            return false;
        }
        brazeUser = this;
        try {
            ga.i.d(com.braze.coroutine.f.f12131a, (CoroutineContext) null, (L) null, new n0(brazeUser, str, null), 3, (Object) null);
            return true;
        } catch (Exception e7) {
            e = e7;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.f12984W, (Throwable) e, false, new Function0() { // from class: N3.c4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String lineId$lambda$42;
                    lineId$lambda$42 = BrazeUser.setLineId$lambda$42(lineId);
                    return lineId$lambda$42;
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final void setLocationCustomAttribute(final String key, final double latitude, final double longitude) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            if (!com.braze.support.d.a(key, this.serverConfigStorageProvider.e())) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: N3.w3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String locationCustomAttribute$lambda$63;
                        locationCustomAttribute$lambda$63 = BrazeUser.setLocationCustomAttribute$lambda$63();
                        return locationCustomAttribute$lambda$63;
                    }
                }, 6, (Object) null);
                return;
            }
            if (ValidationUtils.isValidLocation(latitude, longitude)) {
                com.braze.models.i a6 = com.braze.models.outgoing.event.b.f12605g.a(ValidationUtils.ensureBrazeFieldLength(key), latitude, longitude);
                if (a6 != null) {
                    ((com.braze.managers.m) this.brazeManager).a(a6);
                    return;
                }
                return;
            }
            try {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: N3.x3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String locationCustomAttribute$lambda$64;
                        locationCustomAttribute$lambda$64 = BrazeUser.setLocationCustomAttribute$lambda$64(latitude, longitude);
                        return locationCustomAttribute$lambda$64;
                    }
                }, 6, (Object) null);
            } catch (Exception e6) {
                e = e6;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) e, false, new Function0() { // from class: N3.y3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String locationCustomAttribute$lambda$66;
                        locationCustomAttribute$lambda$66 = BrazeUser.setLocationCustomAttribute$lambda$66(key, latitude, longitude);
                        return locationCustomAttribute$lambda$66;
                    }
                }, 4, (Object) null);
            }
        } catch (Exception e7) {
            e = e7;
        }
    }

    public final boolean setPhoneNumber(final String phoneNumber) {
        BrazeUser brazeUser;
        final String str;
        if (phoneNumber != null) {
            try {
                if (StringsKt.isBlank(phoneNumber)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: N3.h3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String phoneNumber$lambda$33;
                            phoneNumber$lambda$33 = BrazeUser.setPhoneNumber$lambda$33();
                            return phoneNumber$lambda$33;
                        }
                    }, 6, (Object) null);
                    return false;
                }
            } catch (Exception e6) {
                e = e6;
                brazeUser = this;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.f12984W, (Throwable) e, false, new Function0() { // from class: N3.D3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String phoneNumber$lambda$37;
                        phoneNumber$lambda$37 = BrazeUser.setPhoneNumber$lambda$37(phoneNumber);
                        return phoneNumber$lambda$37;
                    }
                }, 4, (Object) null);
                return false;
            }
        }
        if (phoneNumber != null) {
            int length = phoneNumber.length() - 1;
            int i6 = 0;
            boolean z6 = false;
            while (i6 <= length) {
                boolean z7 = Intrinsics.compare((int) phoneNumber.charAt(!z6 ? i6 : length), 32) <= 0;
                if (z6) {
                    if (!z7) {
                        break;
                    }
                    length--;
                } else if (z7) {
                    i6++;
                } else {
                    z6 = true;
                }
            }
            str = phoneNumber.subSequence(i6, length + 1).toString();
        } else {
            str = null;
        }
        if (str != null && !ValidationUtils.isValidPhoneNumber(str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: N3.s3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String phoneNumber$lambda$36$lambda$35;
                    phoneNumber$lambda$36$lambda$35 = BrazeUser.setPhoneNumber$lambda$36$lambda$35(str);
                    return phoneNumber$lambda$36$lambda$35;
                }
            }, 6, (Object) null);
            return false;
        }
        brazeUser = this;
        try {
            ga.i.d(com.braze.coroutine.f.f12131a, (CoroutineContext) null, (L) null, new o0(brazeUser, str, null), 3, (Object) null);
            return true;
        } catch (Exception e7) {
            e = e7;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.f12984W, (Throwable) e, false, new Function0() { // from class: N3.D3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String phoneNumber$lambda$37;
                    phoneNumber$lambda$37 = BrazeUser.setPhoneNumber$lambda$37(phoneNumber);
                    return phoneNumber$lambda$37;
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final boolean setPushNotificationSubscriptionType(final NotificationSubscriptionType pushNotificationSubscriptionType) {
        Intrinsics.checkNotNullParameter(pushNotificationSubscriptionType, "pushNotificationSubscriptionType");
        try {
            ga.i.d(com.braze.coroutine.f.f12131a, (CoroutineContext) null, (L) null, new p0(this, pushNotificationSubscriptionType, null), 3, (Object) null);
            return true;
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) e6, false, new Function0() { // from class: N3.U3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String pushNotificationSubscriptionType$lambda$26;
                    pushNotificationSubscriptionType$lambda$26 = BrazeUser.setPushNotificationSubscriptionType$lambda$26(NotificationSubscriptionType.this);
                    return pushNotificationSubscriptionType$lambda$26;
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final void setUserId(final String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: N3.Y3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String _set_userId_$lambda$1;
                _set_userId_$lambda$1 = BrazeUser._set_userId_$lambda$1(userId);
                return _set_userId_$lambda$1;
            }
        }, 6, (Object) null);
        ReentrantLock reentrantLock = this.userIdLock;
        reentrantLock.lock();
        try {
            if (!Intrinsics.areEqual(this.internalUserId, "") && !Intrinsics.areEqual(this.internalUserId, userId)) {
                throw new IllegalArgumentException(("setExternalId can not be used to change the external ID of a UserCache from a non-empty value to a new value. Was: [" + this.internalUserId + "], tried to change to: [" + userId + ']').toString());
            }
            this.internalUserId = userId;
            ga.i.d(com.braze.coroutine.f.f12131a, (CoroutineContext) null, (L) null, new r0(this, userId, null), 3, (Object) null);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean unsetCustomUserAttribute(final String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            if (com.braze.support.d.a(key, this.serverConfigStorageProvider.e())) {
                ga.i.d(com.braze.coroutine.f.f12131a, (CoroutineContext) null, (L) null, new q0(this, key, null), 3, (Object) null);
                return true;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: N3.n3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String unsetCustomUserAttribute$lambda$59;
                    unsetCustomUserAttribute$lambda$59 = BrazeUser.unsetCustomUserAttribute$lambda$59();
                    return unsetCustomUserAttribute$lambda$59;
                }
            }, 6, (Object) null);
            return false;
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) e6, false, new Function0() { // from class: N3.o3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String unsetCustomUserAttribute$lambda$60;
                    unsetCustomUserAttribute$lambda$60 = BrazeUser.unsetCustomUserAttribute$lambda$60(key);
                    return unsetCustomUserAttribute$lambda$60;
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final boolean setCustomUserAttribute(String key, int value) {
        String str;
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            str = key;
        } catch (Exception e6) {
            e = e6;
            str = key;
        }
        try {
            return setCustomAttribute$default(this, str, Integer.valueOf(value), false, 4, null);
        } catch (Exception e7) {
            e = e7;
            final String str2 = str;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) e, false, new Function0() { // from class: N3.C3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String customUserAttribute$lambda$44;
                    customUserAttribute$lambda$44 = BrazeUser.setCustomUserAttribute$lambda$44(str2);
                    return customUserAttribute$lambda$44;
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final boolean setCustomUserAttribute(final String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            return setCustomAttribute$default(this, key, value, false, 4, null);
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) e6, false, new Function0() { // from class: N3.v3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String customUserAttribute$lambda$47;
                    customUserAttribute$lambda$47 = BrazeUser.setCustomUserAttribute$lambda$47(key);
                    return customUserAttribute$lambda$47;
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final boolean setCustomUserAttribute(String key, double value) {
        String str;
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            str = key;
        } catch (Exception e6) {
            e = e6;
            str = key;
        }
        try {
            return setCustomAttribute$default(this, str, Double.valueOf(value), false, 4, null);
        } catch (Exception e7) {
            e = e7;
            final String str2 = str;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) e, false, new Function0() { // from class: N3.z3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String customUserAttribute$lambda$48;
                    customUserAttribute$lambda$48 = BrazeUser.setCustomUserAttribute$lambda$48(str2);
                    return customUserAttribute$lambda$48;
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final boolean setCustomUserAttribute(final String key, final JSONObject value, boolean merge) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            return setCustomAttribute(key, value, merge);
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) e6, false, new Function0() { // from class: N3.p3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String customUserAttribute$lambda$49;
                    customUserAttribute$lambda$49 = BrazeUser.setCustomUserAttribute$lambda$49(key, value);
                    return customUserAttribute$lambda$49;
                }
            }, 4, (Object) null);
            return false;
        }
    }
}
