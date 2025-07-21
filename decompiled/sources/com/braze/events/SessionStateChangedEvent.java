package com.braze.events;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/braze/events/SessionStateChangedEvent;", "", "", "sessionId", "Lcom/braze/events/SessionStateChangedEvent$ChangeType;", "eventType", "<init>", "(Ljava/lang/String;Lcom/braze/events/SessionStateChangedEvent$ChangeType;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSessionId", "Lcom/braze/events/SessionStateChangedEvent$ChangeType;", "getEventType", "()Lcom/braze/events/SessionStateChangedEvent$ChangeType;", "ChangeType", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final /* data */ class SessionStateChangedEvent {
    private final ChangeType eventType;
    private final String sessionId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/braze/events/SessionStateChangedEvent$ChangeType;", "", "<init>", "(Ljava/lang/String;I)V", "SESSION_STARTED", "SESSION_ENDED", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class ChangeType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ChangeType[] $VALUES;
        public static final ChangeType SESSION_STARTED = new ChangeType("SESSION_STARTED", 0);
        public static final ChangeType SESSION_ENDED = new ChangeType("SESSION_ENDED", 1);

        private static final /* synthetic */ ChangeType[] $values() {
            return new ChangeType[]{SESSION_STARTED, SESSION_ENDED};
        }

        static {
            ChangeType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private ChangeType(String str, int i6) {
        }

        public static ChangeType valueOf(String str) {
            return (ChangeType) Enum.valueOf(ChangeType.class, str);
        }

        public static ChangeType[] values() {
            return (ChangeType[]) $VALUES.clone();
        }
    }

    public SessionStateChangedEvent(String sessionId, ChangeType eventType) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        this.sessionId = sessionId;
        this.eventType = eventType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionStateChangedEvent)) {
            return false;
        }
        SessionStateChangedEvent sessionStateChangedEvent = (SessionStateChangedEvent) other;
        return Intrinsics.areEqual(this.sessionId, sessionStateChangedEvent.sessionId) && this.eventType == sessionStateChangedEvent.eventType;
    }

    public int hashCode() {
        return this.eventType.hashCode() + (this.sessionId.hashCode() * 31);
    }

    public String toString() {
        return "SessionStateChangedEvent{sessionId='" + this.sessionId + "', eventType='" + this.eventType + "'}'";
    }
}
