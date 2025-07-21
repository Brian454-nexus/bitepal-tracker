package com.braze.enums;

import com.braze.enums.Month;
import com.braze.support.BrazeLogger;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0014B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0015"}, d2 = {"Lcom/braze/enums/Month;", "", com.amazon.a.a.o.b.f11195Y, "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER", "Companion", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class Month {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Month[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;
    public static final Month JANUARY = new Month("JANUARY", 0, 0);
    public static final Month FEBRUARY = new Month("FEBRUARY", 1, 1);
    public static final Month MARCH = new Month("MARCH", 2, 2);
    public static final Month APRIL = new Month("APRIL", 3, 3);
    public static final Month MAY = new Month("MAY", 4, 4);
    public static final Month JUNE = new Month("JUNE", 5, 5);
    public static final Month JULY = new Month("JULY", 6, 6);
    public static final Month AUGUST = new Month("AUGUST", 7, 7);
    public static final Month SEPTEMBER = new Month("SEPTEMBER", 8, 8);
    public static final Month OCTOBER = new Month("OCTOBER", 9, 9);
    public static final Month NOVEMBER = new Month("NOVEMBER", 10, 10);
    public static final Month DECEMBER = new Month("DECEMBER", 11, 11);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/braze/enums/Month$Companion;", "", "<init>", "()V", "getMonth", "Lcom/braze/enums/Month;", com.amazon.a.a.o.b.f11195Y, "", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getMonth$lambda$2$lambda$1(int i6) {
            return "No month with value " + i6 + ", value must be in (0,11)";
        }

        @JvmStatic
        public final Month getMonth(final int value) {
            Month month;
            Month[] values = Month.values();
            int length = values.length;
            int i6 = 0;
            while (true) {
                if (i6 >= length) {
                    month = null;
                    break;
                }
                month = values[i6];
                if (month.getValue() == value) {
                    break;
                }
                i6++;
            }
            if (month != null) {
                return month;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: V3.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String month$lambda$2$lambda$1;
                    month$lambda$2$lambda$1 = Month.Companion.getMonth$lambda$2$lambda$1(value);
                    return month$lambda$2$lambda$1;
                }
            }, 6, (Object) null);
            return null;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ Month[] $values() {
        return new Month[]{JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER};
    }

    static {
        Month[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private Month(String str, int i6, int i7) {
        this.value = i7;
    }

    public static Month valueOf(String str) {
        return (Month) Enum.valueOf(Month.class, str);
    }

    public static Month[] values() {
        return (Month[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
