package com.braze.enums;

import com.braze.models.IPutIntoJson;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0010\n\u0002\b\u000f\b\u0087\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0003:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/braze/enums/Gender;", "Lcom/braze/models/IPutIntoJson;", "", "", com.amazon.a.a.o.b.f11195Y, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "forJsonPut", "()Ljava/lang/String;", "Ljava/lang/String;", "getValue", "Companion", "MALE", "FEMALE", "OTHER", "UNKNOWN", "NOT_APPLICABLE", "PREFER_NOT_TO_SAY", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class Gender implements IPutIntoJson<String> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Gender[] $VALUES;
    private final String value;
    public static final Gender MALE = new Gender("MALE", 0, "m");
    public static final Gender FEMALE = new Gender("FEMALE", 1, "f");
    public static final Gender OTHER = new Gender("OTHER", 2, "o");
    public static final Gender UNKNOWN = new Gender("UNKNOWN", 3, "u");
    public static final Gender NOT_APPLICABLE = new Gender("NOT_APPLICABLE", 4, "n");
    public static final Gender PREFER_NOT_TO_SAY = new Gender("PREFER_NOT_TO_SAY", 5, "p");

    private static final /* synthetic */ Gender[] $values() {
        return new Gender[]{MALE, FEMALE, OTHER, UNKNOWN, NOT_APPLICABLE, PREFER_NOT_TO_SAY};
    }

    static {
        Gender[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private Gender(String str, int i6, String str2) {
        this.value = str2;
    }

    public static Gender valueOf(String str) {
        return (Gender) Enum.valueOf(Gender.class, str);
    }

    public static Gender[] values() {
        return (Gender[]) $VALUES.clone();
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut, reason: avoid collision after fix types in other method and from getter */
    public String getValue() {
        return this.value;
    }
}
