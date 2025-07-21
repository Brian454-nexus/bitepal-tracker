package com.braze.enums.inappmessage;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/braze/enums/inappmessage/CropType;", "", "<init>", "(Ljava/lang/String;I)V", "FIT_CENTER", "CENTER_CROP", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class CropType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CropType[] $VALUES;
    public static final CropType FIT_CENTER = new CropType("FIT_CENTER", 0);
    public static final CropType CENTER_CROP = new CropType("CENTER_CROP", 1);

    private static final /* synthetic */ CropType[] $values() {
        return new CropType[]{FIT_CENTER, CENTER_CROP};
    }

    static {
        CropType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private CropType(String str, int i6) {
    }

    public static CropType valueOf(String str) {
        return (CropType) Enum.valueOf(CropType.class, str);
    }

    public static CropType[] values() {
        return (CropType[]) $VALUES.clone();
    }
}
