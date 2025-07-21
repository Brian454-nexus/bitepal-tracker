package com.braze.enums.inappmessage;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/braze/enums/inappmessage/MessageType;", "", "<init>", "(Ljava/lang/String;I)V", "SLIDEUP", "MODAL", "FULL", "HTML_FULL", "HTML", "CONTROL", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class MessageType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MessageType[] $VALUES;
    public static final MessageType SLIDEUP = new MessageType("SLIDEUP", 0);
    public static final MessageType MODAL = new MessageType("MODAL", 1);
    public static final MessageType FULL = new MessageType("FULL", 2);
    public static final MessageType HTML_FULL = new MessageType("HTML_FULL", 3);
    public static final MessageType HTML = new MessageType("HTML", 4);
    public static final MessageType CONTROL = new MessageType("CONTROL", 5);

    private static final /* synthetic */ MessageType[] $values() {
        return new MessageType[]{SLIDEUP, MODAL, FULL, HTML_FULL, HTML, CONTROL};
    }

    static {
        MessageType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private MessageType(String str, int i6) {
    }

    public static MessageType valueOf(String str) {
        return (MessageType) Enum.valueOf(MessageType.class, str);
    }

    public static MessageType[] values() {
        return (MessageType[]) $VALUES.clone();
    }
}
