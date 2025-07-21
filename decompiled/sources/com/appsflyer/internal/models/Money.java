package com.appsflyer.internal.models;

import android.os.Process;
import android.view.ViewConfiguration;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1g;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÇ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0016\u0010\nR\u001a\u0010\u0017\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u001a\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u001d\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\f"}, d2 = {"Lcom/appsflyer/internal/models/Money;", "", "", "p0", "", "p1", "p2", "<init>", "(Ljava/lang/String;JJ)V", "component1", "()Ljava/lang/String;", "component2", "()J", "component3", "copy", "(Ljava/lang/String;JJ)Lcom/appsflyer/internal/models/Money;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", AppsFlyerProperties.CURRENCY_CODE, "Ljava/lang/String;", "getCurrencyCode", "nanos", "J", "getNanos", "units", "getUnits", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final /* data */ class Money {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String currencyCode;
    private final long nanos;
    private final long units;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/appsflyer/internal/models/Money$Companion;", "Lcom/appsflyer/internal/models/Deserialize;", "Lcom/appsflyer/internal/models/Money;", "<init>", "()V", "Lorg/json/JSONObject;", "p0", "fromJson", "(Lorg/json/JSONObject;)Lcom/appsflyer/internal/models/Money;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class Companion implements Deserialize<Money> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int InAppPurchaseEvent = 1;
        private static int getPackageName = 0;
        private static long toJsonMap = 3402519045217790112L;

        private Companion() {
        }

        private static void a(String str, int i6, Object[] objArr) {
            int i7 = $11 + 47;
            $10 = i7 % 128;
            char[] cArr = str;
            if (i7 % 2 != 0) {
                throw null;
            }
            if (str != null) {
                cArr = str.toCharArray();
            }
            char[] cArr2 = cArr;
            AFPurchaseConnectorA1g aFPurchaseConnectorA1g = new AFPurchaseConnectorA1g();
            aFPurchaseConnectorA1g.getPackageName = i6;
            int length = cArr2.length;
            long[] jArr = new long[length];
            aFPurchaseConnectorA1g.InAppPurchaseEvent = 0;
            while (true) {
                int i8 = aFPurchaseConnectorA1g.InAppPurchaseEvent;
                if (i8 >= cArr2.length) {
                    break;
                }
                int i9 = $10 + 77;
                $11 = i9 % 128;
                if (i9 % 2 == 0) {
                    jArr[i8] = cArr2[i8] * (i8 + aFPurchaseConnectorA1g.getPackageName) * toJsonMap * 5319290379872349608L;
                } else {
                    jArr[i8] = (toJsonMap ^ 5319290379872349608L) ^ (cArr2[i8] ^ (i8 * aFPurchaseConnectorA1g.getPackageName));
                    i8++;
                }
                aFPurchaseConnectorA1g.InAppPurchaseEvent = i8;
            }
            char[] cArr3 = new char[length];
            aFPurchaseConnectorA1g.InAppPurchaseEvent = 0;
            while (true) {
                int i10 = aFPurchaseConnectorA1g.InAppPurchaseEvent;
                if (i10 >= cArr2.length) {
                    objArr[0] = new String(cArr3);
                    return;
                } else {
                    cArr3[i10] = (char) jArr[i10];
                    aFPurchaseConnectorA1g.InAppPurchaseEvent = i10 + 1;
                }
            }
        }

        @Override // com.appsflyer.internal.models.Deserialize
        public final /* bridge */ /* synthetic */ Money fromJson(JSONObject jSONObject) {
            int i6 = InAppPurchaseEvent + 103;
            getPackageName = i6 % 128;
            if (i6 % 2 == 0) {
                return fromJson(jSONObject);
            }
            fromJson(jSONObject);
            throw null;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        @NotNull
        public final Money fromJson(@NotNull JSONObject p02) {
            Intrinsics.checkNotNullParameter(p02, "");
            Object[] objArr = new Object[1];
            a("蕫銜ꪸ싙\udae9\uf203ਭ≖㩃厎殦菆", 6113 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr);
            String optString = p02.optString(((String) objArr[0]).intern());
            Intrinsics.checkNotNullExpressionValue(optString, "");
            Object[] objArr2 = new Object[1];
            a("蕦屲㝐ึ\ue117", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 55579, objArr2);
            long j6 = p02.getLong(((String) objArr2[0]).intern());
            Object[] objArr3 = new Object[1];
            a("蕽ᕫꕻ㕛앏", ((Process.getThreadPriority(0) + 20) >> 6) + 36877, objArr3);
            Money money = new Money(optString, j6, p02.getLong(((String) objArr3[0]).intern()));
            int i6 = InAppPurchaseEvent + 33;
            getPackageName = i6 % 128;
            if (i6 % 2 == 0) {
                return money;
            }
            throw null;
        }
    }

    public Money(@NotNull String str, long j6, long j7) {
        Intrinsics.checkNotNullParameter(str, "");
        this.currencyCode = str;
        this.nanos = j6;
        this.units = j7;
    }

    public static /* synthetic */ Money copy$default(Money money, String str, long j6, long j7, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = money.currencyCode;
        }
        if ((i6 & 2) != 0) {
            j6 = money.nanos;
        }
        if ((i6 & 4) != 0) {
            j7 = money.units;
        }
        return money.copy(str, j6, j7);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    /* renamed from: component2, reason: from getter */
    public final long getNanos() {
        return this.nanos;
    }

    /* renamed from: component3, reason: from getter */
    public final long getUnits() {
        return this.units;
    }

    @NotNull
    public final Money copy(@NotNull String p02, long p12, long p22) {
        Intrinsics.checkNotNullParameter(p02, "");
        return new Money(p02, p12, p22);
    }

    public final boolean equals(@Nullable Object p02) {
        if (this == p02) {
            return true;
        }
        if (!(p02 instanceof Money)) {
            return false;
        }
        Money money = (Money) p02;
        return Intrinsics.areEqual(this.currencyCode, money.currencyCode) && this.nanos == money.nanos && this.units == money.units;
    }

    @JvmName(name = "getCurrencyCode")
    @NotNull
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    @JvmName(name = "getNanos")
    public final long getNanos() {
        return this.nanos;
    }

    @JvmName(name = "getUnits")
    public final long getUnits() {
        return this.units;
    }

    public final int hashCode() {
        return (((this.currencyCode.hashCode() * 31) + Long.hashCode(this.nanos)) * 31) + Long.hashCode(this.units);
    }

    @NotNull
    public final String toString() {
        return "Money(currencyCode=" + this.currencyCode + ", nanos=" + this.nanos + ", units=" + this.units + ")";
    }
}
