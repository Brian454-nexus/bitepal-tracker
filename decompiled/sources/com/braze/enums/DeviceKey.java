package com.braze.enums;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/braze/enums/DeviceKey;", "", "key", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "ANDROID_VERSION", "CARRIER", "BRAND", "MODEL", "RESOLUTION", "LOCALE", "TIMEZONE", "NOTIFICATIONS_ENABLED", "IS_BACKGROUND_RESTRICTED", "GOOGLE_ADVERTISING_ID", "AD_TRACKING_ENABLED", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class DeviceKey {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DeviceKey[] $VALUES;
    private final String key;
    public static final DeviceKey ANDROID_VERSION = new DeviceKey("ANDROID_VERSION", 0, "os_version");
    public static final DeviceKey CARRIER = new DeviceKey("CARRIER", 1, "carrier");
    public static final DeviceKey BRAND = new DeviceKey("BRAND", 2, "brand");
    public static final DeviceKey MODEL = new DeviceKey("MODEL", 3, "model");
    public static final DeviceKey RESOLUTION = new DeviceKey("RESOLUTION", 4, "resolution");
    public static final DeviceKey LOCALE = new DeviceKey("LOCALE", 5, "locale");
    public static final DeviceKey TIMEZONE = new DeviceKey("TIMEZONE", 6, "time_zone");
    public static final DeviceKey NOTIFICATIONS_ENABLED = new DeviceKey("NOTIFICATIONS_ENABLED", 7, "remote_notification_enabled");
    public static final DeviceKey IS_BACKGROUND_RESTRICTED = new DeviceKey("IS_BACKGROUND_RESTRICTED", 8, "android_is_background_restricted");
    public static final DeviceKey GOOGLE_ADVERTISING_ID = new DeviceKey("GOOGLE_ADVERTISING_ID", 9, "google_ad_id");
    public static final DeviceKey AD_TRACKING_ENABLED = new DeviceKey("AD_TRACKING_ENABLED", 10, "ad_tracking_enabled");

    private static final /* synthetic */ DeviceKey[] $values() {
        return new DeviceKey[]{ANDROID_VERSION, CARRIER, BRAND, MODEL, RESOLUTION, LOCALE, TIMEZONE, NOTIFICATIONS_ENABLED, IS_BACKGROUND_RESTRICTED, GOOGLE_ADVERTISING_ID, AD_TRACKING_ENABLED};
    }

    static {
        DeviceKey[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private DeviceKey(String str, int i6, String str2) {
        this.key = str2;
    }

    public static DeviceKey valueOf(String str) {
        return (DeviceKey) Enum.valueOf(DeviceKey.class, str);
    }

    public static DeviceKey[] values() {
        return (DeviceKey[]) $VALUES.clone();
    }

    public final String getKey() {
        return this.key;
    }
}
