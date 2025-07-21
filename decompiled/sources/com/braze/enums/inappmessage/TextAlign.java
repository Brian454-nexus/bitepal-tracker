package com.braze.enums.inappmessage;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/braze/enums/inappmessage/TextAlign;", "", "<init>", "(Ljava/lang/String;I)V", "START", "CENTER", "END", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class TextAlign {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TextAlign[] $VALUES;
    public static final TextAlign START = new TextAlign("START", 0);
    public static final TextAlign CENTER = new TextAlign("CENTER", 1);
    public static final TextAlign END = new TextAlign("END", 2);

    private static final /* synthetic */ TextAlign[] $values() {
        return new TextAlign[]{START, CENTER, END};
    }

    static {
        TextAlign[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private TextAlign(String str, int i6) {
    }

    public static TextAlign valueOf(String str) {
        return (TextAlign) Enum.valueOf(TextAlign.class, str);
    }

    public static TextAlign[] values() {
        return (TextAlign[]) $VALUES.clone();
    }
}
