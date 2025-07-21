package com.braze.ui.inappmessage;

import androidx.annotation.Keep;
import com.amazon.a.a.o.b;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/braze/ui/inappmessage/InAppMessageOperation;", "", "<init>", "(Ljava/lang/String;I)V", "DISPLAY_NOW", "DISPLAY_LATER", "DISCARD", "REENQUEUE", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class InAppMessageOperation {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ InAppMessageOperation[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final InAppMessageOperation DISPLAY_NOW = new InAppMessageOperation("DISPLAY_NOW", 0);
    public static final InAppMessageOperation DISPLAY_LATER = new InAppMessageOperation("DISPLAY_LATER", 1);
    public static final InAppMessageOperation DISCARD = new InAppMessageOperation("DISCARD", 2);
    public static final InAppMessageOperation REENQUEUE = new InAppMessageOperation("REENQUEUE", 3);

    @Keep
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/braze/ui/inappmessage/InAppMessageOperation$Companion;", "", "<init>", "()V", "fromValue", "Lcom/braze/ui/inappmessage/InAppMessageOperation;", b.f11195Y, "", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nInAppMessageOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InAppMessageOperation.kt\ncom/braze/ui/inappmessage/InAppMessageOperation$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,16:1\n1310#2,2:17\n*S KotlinDebug\n*F\n+ 1 InAppMessageOperation.kt\ncom/braze/ui/inappmessage/InAppMessageOperation$Companion\n*L\n13#1:17,2\n*E\n"})
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        public final InAppMessageOperation fromValue(@Nullable String value) {
            InAppMessageOperation[] values = InAppMessageOperation.values();
            int length = values.length;
            int i6 = 0;
            while (true) {
                String str = null;
                if (i6 >= length) {
                    return null;
                }
                InAppMessageOperation inAppMessageOperation = values[i6];
                String name = inAppMessageOperation.name();
                if (value != null) {
                    Locale US = Locale.US;
                    Intrinsics.checkNotNullExpressionValue(US, "US");
                    str = value.toUpperCase(US);
                    Intrinsics.checkNotNullExpressionValue(str, "toUpperCase(...)");
                }
                if (Intrinsics.areEqual(name, str)) {
                    return inAppMessageOperation;
                }
                i6++;
            }
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ InAppMessageOperation[] $values() {
        return new InAppMessageOperation[]{DISPLAY_NOW, DISPLAY_LATER, DISCARD, REENQUEUE};
    }

    static {
        InAppMessageOperation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private InAppMessageOperation(String str, int i6) {
    }

    public static InAppMessageOperation valueOf(String str) {
        return (InAppMessageOperation) Enum.valueOf(InAppMessageOperation.class, str);
    }

    public static InAppMessageOperation[] values() {
        return (InAppMessageOperation[]) $VALUES.clone();
    }
}
