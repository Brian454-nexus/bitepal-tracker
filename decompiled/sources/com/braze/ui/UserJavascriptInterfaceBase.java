package com.braze.ui;

import android.content.Context;
import android.webkit.JavascriptInterface;
import com.amazon.a.a.h.a;
import com.amazon.a.a.o.b;
import com.appsflyer.AdRevenueScheme;
import com.braze.Braze;
import com.braze.BrazeUser;
import com.braze.enums.Gender;
import com.braze.enums.Month;
import com.braze.enums.NotificationSubscriptionType;
import com.braze.events.IValueCallback;
import com.braze.support.BrazeLogger;
import com.braze.ui.UserJavascriptInterfaceBase;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 B2\u00020\u0001:\u0001BB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007J\u0012\u0010\n\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0007J\u0012\u0010\f\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0007J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\tH\u0007J \u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0007J\u0012\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\tH\u0007J\u0012\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\tH\u0007J\u0012\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\tH\u0007J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\tH\u0007J\u0010\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\tH\u0007J\u0012\u0010\u001d\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\tH\u0007J\u0012\u0010\u001f\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\tH\u0007J \u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\t2\u0006\u0010$\u001a\u00020%H\u0007J\u001a\u0010&\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\t2\b\u0010'\u001a\u0004\u0018\u00010\tH\u0007J\u0018\u0010(\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\t2\u0006\u0010)\u001a\u00020\tH\u0007J\u0018\u0010*\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\t2\u0006\u0010)\u001a\u00020\tH\u0007J\u0018\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\t2\u0006\u0010)\u001a\u00020\tH\u0007J \u0010-\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\t2\u0006\u0010.\u001a\u00020\t2\u0006\u0010/\u001a\u00020\tH\u0007J\u0018\u00100\u001a\u00020\u00072\u0006\u00101\u001a\u00020\t2\u0006\u00102\u001a\u00020\tH\u0007J\u0010\u00103\u001a\u00020\u00072\u0006\u00104\u001a\u00020\tH\u0007J\u0010\u00105\u001a\u00020\u00072\u0006\u00104\u001a\u00020\tH\u0007J\u0012\u00106\u001a\u0004\u0018\u0001072\u0006\u0010\u0012\u001a\u00020\tH\u0007J\u0014\u00108\u001a\u0004\u0018\u0001092\b\u0010\u001b\u001a\u0004\u0018\u00010\tH\u0007J(\u0010:\u001a\u00020\u00072\u0006\u0010;\u001a\u00020<2\u0006\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\t2\u0006\u0010$\u001a\u00020%H\u0007J!\u0010=\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010>2\b\u0010'\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0002\u0010?J\u0012\u0010@\u001a\u0004\u0018\u00010A2\u0006\u0010\u000f\u001a\u00020\tH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006C"}, d2 = {"Lcom/braze/ui/UserJavascriptInterfaceBase;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "setFirstName", "", "firstName", "", "setLastName", "lastName", "setEmail", "email", "setGender", "genderString", "setDateOfBirth", "year", "month", "day", "setCountry", AdRevenueScheme.COUNTRY, "setLanguage", "language", "setHomeCity", "homeCity", "setEmailNotificationSubscriptionType", "subscriptionType", "setPushNotificationSubscriptionType", "setPhoneNumber", "phoneNumber", "setLineId", "lineId", "setCustomUserAttributeJSON", "key", "jsonStringValue", "merge", "", "setCustomUserAttributeArray", "jsonArrayString", "addToCustomAttributeArray", b.f11195Y, "removeFromCustomAttributeArray", "incrementCustomUserAttribute", "attribute", "setCustomLocationAttribute", "latitude", "longitude", "addAlias", "alias", "label", "addToSubscriptionGroup", "subscriptionGroupId", "removeFromSubscriptionGroup", "monthFromInt", "Lcom/braze/enums/Month;", "subscriptionTypeFromJavascriptString", "Lcom/braze/enums/NotificationSubscriptionType;", "setCustomAttribute", "user", "Lcom/braze/BrazeUser;", "parseStringArrayFromJsonString", "", "(Ljava/lang/String;)[Ljava/lang/String;", "parseGender", "Lcom/braze/enums/Gender;", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUserJavascriptInterfaceBase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserJavascriptInterfaceBase.kt\ncom/braze/ui/UserJavascriptInterfaceBase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,349:1\n1#2:350\n37#3,2:351\n*S KotlinDebug\n*F\n+ 1 UserJavascriptInterfaceBase.kt\ncom/braze/ui/UserJavascriptInterfaceBase\n*L\n300#1:351,2\n*E\n"})
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class UserJavascriptInterfaceBase {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Context context;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u0006\u001a\u00020\u0007*\u00020\b2!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00070\nH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/braze/ui/UserJavascriptInterfaceBase$Companion;", "", "<init>", "()V", "JS_BRIDGE_ATTRIBUTE_VALUE", "", "runOnUser", "", "Lcom/braze/Braze;", "block", "Lkotlin/Function1;", "Lcom/braze/BrazeUser;", "Lkotlin/ParameterName;", a.f10906a, "user", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void runOnUser(Braze braze, final Function1<? super BrazeUser, Unit> function1) {
            braze.getCurrentUser(new IValueCallback() { // from class: v4.f0
                @Override // com.braze.events.IValueCallback
                public final void onSuccess(Object obj) {
                    UserJavascriptInterfaceBase.Companion.runOnUser$lambda$0(Function1.this, (BrazeUser) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void runOnUser$lambda$0(Function1 function1, BrazeUser it) {
            Intrinsics.checkNotNullParameter(it, "it");
            function1.invoke(it);
        }

        private Companion() {
        }
    }

    public UserJavascriptInterfaceBase(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addAlias$lambda$28(String str, String str2, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.addAlias(str, str2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addToCustomAttributeArray$lambda$21(String str, String str2, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.addToCustomAttributeArray(str, str2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addToSubscriptionGroup$lambda$29(String str, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.addToSubscriptionGroup(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String incrementCustomUserAttribute$lambda$23(String str) {
        return "Failed to parse incrementCustomUserAttribute increment value '" + str + '\'';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit incrementCustomUserAttribute$lambda$24(String str, Integer num, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.incrementCustomUserAttribute(str, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String parseStringArrayFromJsonString$lambda$34() {
        return "Failed to parse custom attribute array";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit removeFromCustomAttributeArray$lambda$22(String str, String str2, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.removeFromCustomAttributeArray(str, str2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit removeFromSubscriptionGroup$lambda$30(String str, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.removeFromSubscriptionGroup(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setCountry$lambda$9(String str, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.setCountry(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomAttribute$lambda$31(String str, String str2) {
        return "Failed to parse custom attribute type for key: " + str + " and json string value: " + str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomAttribute$lambda$32(String str, String str2) {
        return "Failed to parse custom attribute type for key: " + str + " and json string value: " + str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomLocationAttribute$lambda$25(String str) {
        return "Failed to parse setCustomLocationAttribute latitude value '" + str + '\'';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomLocationAttribute$lambda$26(String str) {
        return "Failed to parse setCustomLocationAttribute longitude value '" + str + '\'';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setCustomLocationAttribute$lambda$27(String str, Double d6, Double d7, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.setLocationCustomAttribute(str, d6.doubleValue(), d7.doubleValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomUserAttributeArray$lambda$19(String str) {
        return "Failed to set custom attribute array for key " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setCustomUserAttributeArray$lambda$20(String str, String[] strArr, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.setCustomAttributeArray(str, strArr);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setCustomUserAttributeJSON$lambda$18(UserJavascriptInterfaceBase userJavascriptInterfaceBase, String str, String str2, boolean z6, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        userJavascriptInterfaceBase.setCustomAttribute(it, str, str2, z6);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setDateOfBirth$lambda$5(String str) {
        return "Failed to parse setDateOfBirth year value '" + str + '\'';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setDateOfBirth$lambda$6(String str) {
        return "Failed to parse setDateOfBirth month for value " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setDateOfBirth$lambda$7(String str) {
        return "Failed to parse setDateOfBirth day value '" + str + '\'';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setDateOfBirth$lambda$8(Integer num, Month month, Integer num2, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.setDateOfBirth(num.intValue(), month, num2.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setEmail$lambda$2(String str, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.setEmail(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setEmailNotificationSubscriptionType$lambda$12(String str) {
        return "Failed to parse email subscription type in Braze HTML in-app message javascript interface with subscription " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setEmailNotificationSubscriptionType$lambda$13(NotificationSubscriptionType notificationSubscriptionType, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.setEmailNotificationSubscriptionType(notificationSubscriptionType);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setFirstName$lambda$0(String str, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.setFirstName(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setGender$lambda$3(String str) {
        return "Failed to parse gender in Braze HTML in-app message javascript interface with gender: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setGender$lambda$4(Gender gender, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.setGender(gender);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setHomeCity$lambda$11(String str, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.setHomeCity(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setLanguage$lambda$10(String str, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.setLanguage(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setLastName$lambda$1(String str, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.setLastName(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setLineId$lambda$17(String str, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.setLineId(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setPhoneNumber$lambda$16(String str, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.setPhoneNumber(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setPushNotificationSubscriptionType$lambda$14(String str) {
        return "Failed to parse push subscription type in Braze HTML in-app message javascript interface with subscription: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setPushNotificationSubscriptionType$lambda$15(NotificationSubscriptionType notificationSubscriptionType, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.setPushNotificationSubscriptionType(notificationSubscriptionType);
        return Unit.INSTANCE;
    }

    @JavascriptInterface
    public final void addAlias(@NotNull final String alias, @NotNull final String label) {
        Intrinsics.checkNotNullParameter(alias, "alias");
        Intrinsics.checkNotNullParameter(label, "label");
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new Function1() { // from class: v4.a0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit addAlias$lambda$28;
                addAlias$lambda$28 = UserJavascriptInterfaceBase.addAlias$lambda$28(alias, label, (BrazeUser) obj);
                return addAlias$lambda$28;
            }
        });
    }

    @JavascriptInterface
    public final void addToCustomAttributeArray(@NotNull final String key, @NotNull final String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new Function1() { // from class: v4.D
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit addToCustomAttributeArray$lambda$21;
                addToCustomAttributeArray$lambda$21 = UserJavascriptInterfaceBase.addToCustomAttributeArray$lambda$21(key, value, (BrazeUser) obj);
                return addToCustomAttributeArray$lambda$21;
            }
        });
    }

    @JavascriptInterface
    public final void addToSubscriptionGroup(@NotNull final String subscriptionGroupId) {
        Intrinsics.checkNotNullParameter(subscriptionGroupId, "subscriptionGroupId");
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new Function1() { // from class: v4.M
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit addToSubscriptionGroup$lambda$29;
                addToSubscriptionGroup$lambda$29 = UserJavascriptInterfaceBase.addToSubscriptionGroup$lambda$29(subscriptionGroupId, (BrazeUser) obj);
                return addToSubscriptionGroup$lambda$29;
            }
        });
    }

    @JavascriptInterface
    public final void incrementCustomUserAttribute(@NotNull final String attribute, @NotNull final String value) {
        Intrinsics.checkNotNullParameter(attribute, "attribute");
        Intrinsics.checkNotNullParameter(value, "value");
        final Integer intOrNull = StringsKt.toIntOrNull(value);
        if (intOrNull == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: v4.E
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String incrementCustomUserAttribute$lambda$23;
                    incrementCustomUserAttribute$lambda$23 = UserJavascriptInterfaceBase.incrementCustomUserAttribute$lambda$23(value);
                    return incrementCustomUserAttribute$lambda$23;
                }
            }, 6, (Object) null);
        } else {
            INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new Function1() { // from class: v4.F
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit incrementCustomUserAttribute$lambda$24;
                    incrementCustomUserAttribute$lambda$24 = UserJavascriptInterfaceBase.incrementCustomUserAttribute$lambda$24(attribute, intOrNull, (BrazeUser) obj);
                    return incrementCustomUserAttribute$lambda$24;
                }
            });
        }
    }

    @Nullable
    public final Month monthFromInt(@NotNull String month) {
        int intValue;
        Intrinsics.checkNotNullParameter(month, "month");
        Integer intOrNull = StringsKt.toIntOrNull(month);
        if (intOrNull == null || (intValue = intOrNull.intValue()) < 1 || intValue > 12) {
            return null;
        }
        return Month.INSTANCE.getMonth(intValue - 1);
    }

    @Nullable
    public final Gender parseGender(@NotNull String genderString) {
        Intrinsics.checkNotNullParameter(genderString, "genderString");
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = genderString.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        Gender gender = Gender.MALE;
        if (Intrinsics.areEqual(lowerCase, gender.getKey())) {
            return gender;
        }
        Gender gender2 = Gender.FEMALE;
        if (Intrinsics.areEqual(lowerCase, gender2.getKey())) {
            return gender2;
        }
        Gender gender3 = Gender.OTHER;
        if (Intrinsics.areEqual(lowerCase, gender3.getKey())) {
            return gender3;
        }
        Gender gender4 = Gender.UNKNOWN;
        if (Intrinsics.areEqual(lowerCase, gender4.getKey())) {
            return gender4;
        }
        Gender gender5 = Gender.NOT_APPLICABLE;
        if (Intrinsics.areEqual(lowerCase, gender5.getKey())) {
            return gender5;
        }
        Gender gender6 = Gender.PREFER_NOT_TO_SAY;
        if (Intrinsics.areEqual(lowerCase, gender6.getKey())) {
            return gender6;
        }
        return null;
    }

    @Nullable
    public final String[] parseStringArrayFromJsonString(@Nullable String jsonArrayString) {
        try {
            JSONArray jSONArray = new JSONArray(jsonArrayString);
            int length = jSONArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i6 = 0; i6 < length; i6++) {
                arrayList.add(jSONArray.getString(i6));
            }
            return (String[]) arrayList.toArray(new String[0]);
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: v4.V
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String parseStringArrayFromJsonString$lambda$34;
                    parseStringArrayFromJsonString$lambda$34 = UserJavascriptInterfaceBase.parseStringArrayFromJsonString$lambda$34();
                    return parseStringArrayFromJsonString$lambda$34;
                }
            }, 4, (Object) null);
            return null;
        }
    }

    @JavascriptInterface
    public final void removeFromCustomAttributeArray(@NotNull final String key, @NotNull final String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new Function1() { // from class: v4.z
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit removeFromCustomAttributeArray$lambda$22;
                removeFromCustomAttributeArray$lambda$22 = UserJavascriptInterfaceBase.removeFromCustomAttributeArray$lambda$22(key, value, (BrazeUser) obj);
                return removeFromCustomAttributeArray$lambda$22;
            }
        });
    }

    @JavascriptInterface
    public final void removeFromSubscriptionGroup(@NotNull final String subscriptionGroupId) {
        Intrinsics.checkNotNullParameter(subscriptionGroupId, "subscriptionGroupId");
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new Function1() { // from class: v4.O
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit removeFromSubscriptionGroup$lambda$30;
                removeFromSubscriptionGroup$lambda$30 = UserJavascriptInterfaceBase.removeFromSubscriptionGroup$lambda$30(subscriptionGroupId, (BrazeUser) obj);
                return removeFromSubscriptionGroup$lambda$30;
            }
        });
    }

    @JavascriptInterface
    public final void setCountry(@Nullable final String country) {
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new Function1() { // from class: v4.P
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit country$lambda$9;
                country$lambda$9 = UserJavascriptInterfaceBase.setCountry$lambda$9(country, (BrazeUser) obj);
                return country$lambda$9;
            }
        });
    }

    public final void setCustomAttribute(@NotNull BrazeUser user, @NotNull final String key, @NotNull final String jsonStringValue, boolean merge) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(jsonStringValue, "jsonStringValue");
        try {
            Object obj = new JSONObject(jsonStringValue).get(b.f11195Y);
            if (obj instanceof String) {
                user.setCustomUserAttribute(key, (String) obj);
                return;
            }
            if (obj instanceof Boolean) {
                user.setCustomUserAttribute(key, ((Boolean) obj).booleanValue());
                return;
            }
            if (obj instanceof Integer) {
                user.setCustomUserAttribute(key, ((Number) obj).intValue());
                return;
            }
            if (obj instanceof Double) {
                user.setCustomUserAttribute(key, ((Number) obj).doubleValue());
            } else if (obj instanceof JSONObject) {
                user.setCustomUserAttribute(key, (JSONObject) obj, merge);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: v4.W
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String customAttribute$lambda$31;
                        customAttribute$lambda$31 = UserJavascriptInterfaceBase.setCustomAttribute$lambda$31(key, jsonStringValue);
                        return customAttribute$lambda$31;
                    }
                }, 6, (Object) null);
            }
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: v4.X
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String customAttribute$lambda$32;
                    customAttribute$lambda$32 = UserJavascriptInterfaceBase.setCustomAttribute$lambda$32(key, jsonStringValue);
                    return customAttribute$lambda$32;
                }
            }, 4, (Object) null);
        }
    }

    @JavascriptInterface
    public final void setCustomLocationAttribute(@NotNull final String attribute, @NotNull final String latitude, @NotNull final String longitude) {
        Intrinsics.checkNotNullParameter(attribute, "attribute");
        Intrinsics.checkNotNullParameter(latitude, "latitude");
        Intrinsics.checkNotNullParameter(longitude, "longitude");
        final Double doubleOrNull = StringsKt.toDoubleOrNull(latitude);
        if (doubleOrNull == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: v4.A
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String customLocationAttribute$lambda$25;
                    customLocationAttribute$lambda$25 = UserJavascriptInterfaceBase.setCustomLocationAttribute$lambda$25(latitude);
                    return customLocationAttribute$lambda$25;
                }
            }, 6, (Object) null);
            return;
        }
        final Double doubleOrNull2 = StringsKt.toDoubleOrNull(longitude);
        if (doubleOrNull2 == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: v4.B
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String customLocationAttribute$lambda$26;
                    customLocationAttribute$lambda$26 = UserJavascriptInterfaceBase.setCustomLocationAttribute$lambda$26(longitude);
                    return customLocationAttribute$lambda$26;
                }
            }, 6, (Object) null);
        } else {
            INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new Function1() { // from class: v4.C
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit customLocationAttribute$lambda$27;
                    customLocationAttribute$lambda$27 = UserJavascriptInterfaceBase.setCustomLocationAttribute$lambda$27(attribute, doubleOrNull, doubleOrNull2, (BrazeUser) obj);
                    return customLocationAttribute$lambda$27;
                }
            });
        }
    }

    @JavascriptInterface
    public final void setCustomUserAttributeArray(@NotNull final String key, @Nullable String jsonArrayString) {
        Intrinsics.checkNotNullParameter(key, "key");
        final String[] parseStringArrayFromJsonString = parseStringArrayFromJsonString(jsonArrayString);
        if (parseStringArrayFromJsonString == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: v4.K
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String customUserAttributeArray$lambda$19;
                    customUserAttributeArray$lambda$19 = UserJavascriptInterfaceBase.setCustomUserAttributeArray$lambda$19(key);
                    return customUserAttributeArray$lambda$19;
                }
            }, 6, (Object) null);
        } else {
            INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new Function1() { // from class: v4.L
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit customUserAttributeArray$lambda$20;
                    customUserAttributeArray$lambda$20 = UserJavascriptInterfaceBase.setCustomUserAttributeArray$lambda$20(key, parseStringArrayFromJsonString, (BrazeUser) obj);
                    return customUserAttributeArray$lambda$20;
                }
            });
        }
    }

    @JavascriptInterface
    public final void setCustomUserAttributeJSON(@NotNull final String key, @NotNull final String jsonStringValue, final boolean merge) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(jsonStringValue, "jsonStringValue");
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new Function1() { // from class: v4.N
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit customUserAttributeJSON$lambda$18;
                customUserAttributeJSON$lambda$18 = UserJavascriptInterfaceBase.setCustomUserAttributeJSON$lambda$18(UserJavascriptInterfaceBase.this, key, jsonStringValue, merge, (BrazeUser) obj);
                return customUserAttributeJSON$lambda$18;
            }
        });
    }

    @JavascriptInterface
    public final void setDateOfBirth(@NotNull final String year, @NotNull final String month, @NotNull final String day) {
        Intrinsics.checkNotNullParameter(year, "year");
        Intrinsics.checkNotNullParameter(month, "month");
        Intrinsics.checkNotNullParameter(day, "day");
        final Integer intOrNull = StringsKt.toIntOrNull(year);
        if (intOrNull == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: v4.d0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String dateOfBirth$lambda$5;
                    dateOfBirth$lambda$5 = UserJavascriptInterfaceBase.setDateOfBirth$lambda$5(year);
                    return dateOfBirth$lambda$5;
                }
            }, 6, (Object) null);
            return;
        }
        final Month monthFromInt = monthFromInt(month);
        if (monthFromInt == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: v4.e0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String dateOfBirth$lambda$6;
                    dateOfBirth$lambda$6 = UserJavascriptInterfaceBase.setDateOfBirth$lambda$6(month);
                    return dateOfBirth$lambda$6;
                }
            }, 6, (Object) null);
            return;
        }
        final Integer intOrNull2 = StringsKt.toIntOrNull(day);
        if (intOrNull2 == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: v4.x
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String dateOfBirth$lambda$7;
                    dateOfBirth$lambda$7 = UserJavascriptInterfaceBase.setDateOfBirth$lambda$7(day);
                    return dateOfBirth$lambda$7;
                }
            }, 6, (Object) null);
        } else {
            INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new Function1() { // from class: v4.y
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit dateOfBirth$lambda$8;
                    dateOfBirth$lambda$8 = UserJavascriptInterfaceBase.setDateOfBirth$lambda$8(intOrNull, monthFromInt, intOrNull2, (BrazeUser) obj);
                    return dateOfBirth$lambda$8;
                }
            });
        }
    }

    @JavascriptInterface
    public final void setEmail(@Nullable final String email) {
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new Function1() { // from class: v4.Z
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit email$lambda$2;
                email$lambda$2 = UserJavascriptInterfaceBase.setEmail$lambda$2(email, (BrazeUser) obj);
                return email$lambda$2;
            }
        });
    }

    @JavascriptInterface
    public final void setEmailNotificationSubscriptionType(@NotNull final String subscriptionType) {
        Intrinsics.checkNotNullParameter(subscriptionType, "subscriptionType");
        final NotificationSubscriptionType subscriptionTypeFromJavascriptString = subscriptionTypeFromJavascriptString(subscriptionType);
        if (subscriptionTypeFromJavascriptString == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: v4.w
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String emailNotificationSubscriptionType$lambda$12;
                    emailNotificationSubscriptionType$lambda$12 = UserJavascriptInterfaceBase.setEmailNotificationSubscriptionType$lambda$12(subscriptionType);
                    return emailNotificationSubscriptionType$lambda$12;
                }
            }, 6, (Object) null);
        } else {
            INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new Function1() { // from class: v4.H
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit emailNotificationSubscriptionType$lambda$13;
                    emailNotificationSubscriptionType$lambda$13 = UserJavascriptInterfaceBase.setEmailNotificationSubscriptionType$lambda$13(NotificationSubscriptionType.this, (BrazeUser) obj);
                    return emailNotificationSubscriptionType$lambda$13;
                }
            });
        }
    }

    @JavascriptInterface
    public final void setFirstName(@Nullable final String firstName) {
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new Function1() { // from class: v4.Q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit firstName$lambda$0;
                firstName$lambda$0 = UserJavascriptInterfaceBase.setFirstName$lambda$0(firstName, (BrazeUser) obj);
                return firstName$lambda$0;
            }
        });
    }

    @JavascriptInterface
    public final void setGender(@NotNull final String genderString) {
        Intrinsics.checkNotNullParameter(genderString, "genderString");
        final Gender parseGender = parseGender(genderString);
        if (parseGender == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: v4.G
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String gender$lambda$3;
                    gender$lambda$3 = UserJavascriptInterfaceBase.setGender$lambda$3(genderString);
                    return gender$lambda$3;
                }
            }, 6, (Object) null);
        } else {
            INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new Function1() { // from class: v4.I
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit gender$lambda$4;
                    gender$lambda$4 = UserJavascriptInterfaceBase.setGender$lambda$4(Gender.this, (BrazeUser) obj);
                    return gender$lambda$4;
                }
            });
        }
    }

    @JavascriptInterface
    public final void setHomeCity(@Nullable final String homeCity) {
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new Function1() { // from class: v4.S
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit homeCity$lambda$11;
                homeCity$lambda$11 = UserJavascriptInterfaceBase.setHomeCity$lambda$11(homeCity, (BrazeUser) obj);
                return homeCity$lambda$11;
            }
        });
    }

    @JavascriptInterface
    public final void setLanguage(@Nullable final String language) {
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new Function1() { // from class: v4.J
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit language$lambda$10;
                language$lambda$10 = UserJavascriptInterfaceBase.setLanguage$lambda$10(language, (BrazeUser) obj);
                return language$lambda$10;
            }
        });
    }

    @JavascriptInterface
    public final void setLastName(@Nullable final String lastName) {
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new Function1() { // from class: v4.c0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit lastName$lambda$1;
                lastName$lambda$1 = UserJavascriptInterfaceBase.setLastName$lambda$1(lastName, (BrazeUser) obj);
                return lastName$lambda$1;
            }
        });
    }

    @JavascriptInterface
    public final void setLineId(@Nullable final String lineId) {
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new Function1() { // from class: v4.b0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit lineId$lambda$17;
                lineId$lambda$17 = UserJavascriptInterfaceBase.setLineId$lambda$17(lineId, (BrazeUser) obj);
                return lineId$lambda$17;
            }
        });
    }

    @JavascriptInterface
    public final void setPhoneNumber(@Nullable final String phoneNumber) {
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new Function1() { // from class: v4.U
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit phoneNumber$lambda$16;
                phoneNumber$lambda$16 = UserJavascriptInterfaceBase.setPhoneNumber$lambda$16(phoneNumber, (BrazeUser) obj);
                return phoneNumber$lambda$16;
            }
        });
    }

    @JavascriptInterface
    public final void setPushNotificationSubscriptionType(@NotNull final String subscriptionType) {
        Intrinsics.checkNotNullParameter(subscriptionType, "subscriptionType");
        final NotificationSubscriptionType subscriptionTypeFromJavascriptString = subscriptionTypeFromJavascriptString(subscriptionType);
        if (subscriptionTypeFromJavascriptString == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: v4.T
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String pushNotificationSubscriptionType$lambda$14;
                    pushNotificationSubscriptionType$lambda$14 = UserJavascriptInterfaceBase.setPushNotificationSubscriptionType$lambda$14(subscriptionType);
                    return pushNotificationSubscriptionType$lambda$14;
                }
            }, 6, (Object) null);
        } else {
            INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new Function1() { // from class: v4.Y
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit pushNotificationSubscriptionType$lambda$15;
                    pushNotificationSubscriptionType$lambda$15 = UserJavascriptInterfaceBase.setPushNotificationSubscriptionType$lambda$15(NotificationSubscriptionType.this, (BrazeUser) obj);
                    return pushNotificationSubscriptionType$lambda$15;
                }
            });
        }
    }

    @Nullable
    public final NotificationSubscriptionType subscriptionTypeFromJavascriptString(@Nullable String subscriptionType) {
        return NotificationSubscriptionType.INSTANCE.fromValue(subscriptionType);
    }
}
