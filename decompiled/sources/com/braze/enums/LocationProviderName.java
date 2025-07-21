package com.braze.enums;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/braze/enums/LocationProviderName;", "", "<init>", "(Ljava/lang/String;I)V", "GPS", "NETWORK", "PASSIVE", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class LocationProviderName {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LocationProviderName[] $VALUES;
    public static final LocationProviderName GPS = new LocationProviderName("GPS", 0);
    public static final LocationProviderName NETWORK = new LocationProviderName("NETWORK", 1);
    public static final LocationProviderName PASSIVE = new LocationProviderName("PASSIVE", 2);

    private static final /* synthetic */ LocationProviderName[] $values() {
        return new LocationProviderName[]{GPS, NETWORK, PASSIVE};
    }

    static {
        LocationProviderName[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private LocationProviderName(String str, int i6) {
    }

    public static LocationProviderName valueOf(String str) {
        return (LocationProviderName) Enum.valueOf(LocationProviderName.class, str);
    }

    public static LocationProviderName[] values() {
        return (LocationProviderName[]) $VALUES.clone();
    }
}
