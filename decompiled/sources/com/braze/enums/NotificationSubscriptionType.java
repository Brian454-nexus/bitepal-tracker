package com.braze.enums;

import com.braze.models.IPutIntoJson;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0010\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0003:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/braze/enums/NotificationSubscriptionType;", "Lcom/braze/models/IPutIntoJson;", "", "", "key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "forJsonPut", "()Ljava/lang/String;", "Ljava/lang/String;", "getKey", "Companion", "OPTED_IN", "SUBSCRIBED", "UNSUBSCRIBED", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class NotificationSubscriptionType implements IPutIntoJson<String> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ NotificationSubscriptionType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final NotificationSubscriptionType OPTED_IN = new NotificationSubscriptionType("OPTED_IN", 0, "opted_in");
    public static final NotificationSubscriptionType SUBSCRIBED = new NotificationSubscriptionType("SUBSCRIBED", 1, "subscribed");
    public static final NotificationSubscriptionType UNSUBSCRIBED = new NotificationSubscriptionType("UNSUBSCRIBED", 2, "unsubscribed");
    private static final Map<String, NotificationSubscriptionType> map;
    private final String key;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0007R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/braze/enums/NotificationSubscriptionType$Companion;", "", "<init>", "()V", "map", "", "", "Lcom/braze/enums/NotificationSubscriptionType;", "fromValue", com.amazon.a.a.o.b.f11195Y, "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final NotificationSubscriptionType fromValue(String value) {
            String str;
            Map map = NotificationSubscriptionType.map;
            if (value != null) {
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                str = value.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            Object obj = map.get(str);
            return (NotificationSubscriptionType) (obj != null ? obj : null);
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ NotificationSubscriptionType[] $values() {
        return new NotificationSubscriptionType[]{OPTED_IN, SUBSCRIBED, UNSUBSCRIBED};
    }

    static {
        NotificationSubscriptionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
        NotificationSubscriptionType[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(values.length), 16));
        for (NotificationSubscriptionType notificationSubscriptionType : values) {
            linkedHashMap.put(notificationSubscriptionType.key, notificationSubscriptionType);
        }
        map = linkedHashMap;
    }

    private NotificationSubscriptionType(String str, int i6, String str2) {
        this.key = str2;
    }

    public static NotificationSubscriptionType valueOf(String str) {
        return (NotificationSubscriptionType) Enum.valueOf(NotificationSubscriptionType.class, str);
    }

    public static NotificationSubscriptionType[] values() {
        return (NotificationSubscriptionType[]) $VALUES.clone();
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut, reason: avoid collision after fix types in other method and from getter */
    public String getKey() {
        return this.key;
    }
}
