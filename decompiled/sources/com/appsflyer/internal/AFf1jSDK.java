package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0018\u0010\u000fJ\u000f\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u0011\u0010\u001dR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010!"}, d2 = {"Lcom/appsflyer/internal/AFf1jSDK;", "Lcom/appsflyer/internal/AFf1fSDK;", "Lcom/appsflyer/internal/AFi1jSDK;", "p0", "Lcom/appsflyer/internal/AFd1qSDK;", "p1", "Lcom/appsflyer/internal/AFd1kSDK;", "p2", "Lcom/appsflyer/internal/AFh1fSDK;", "p3", "<init>", "(Lcom/appsflyer/internal/AFi1jSDK;Lcom/appsflyer/internal/AFd1qSDK;Lcom/appsflyer/internal/AFd1kSDK;Lcom/appsflyer/internal/AFh1fSDK;)V", "Lcom/appsflyer/internal/AFa1oSDK;", "", "component3", "(Lcom/appsflyer/internal/AFa1oSDK;)V", "", "getMonetizationNetwork", "()J", "", "", "", "equals", "()Ljava/util/Map;", "getCurrencyIso4217Code", "", "getMediationNetwork", "()Z", "", "(I)V", "hashCode", "Lcom/appsflyer/internal/AFd1qSDK;", "copy", "Lcom/appsflyer/internal/AFi1jSDK;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFf1jSDK extends AFf1fSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] AFInAppEventParameterName = {15268, 15348, 15353, 15344, 15350, 15357, 15356, 15351, 15344, 15349, 15351, 15346};
    private static int valueOf = 0;
    private static int values = 1;

    /* renamed from: copy, reason: from kotlin metadata */
    @NotNull
    private final AFi1jSDK getCurrencyIso4217Code;

    /* renamed from: hashCode, reason: from kotlin metadata */
    @NotNull
    private final AFd1qSDK getMonetizationNetwork;

    public /* synthetic */ AFf1jSDK(AFi1jSDK aFi1jSDK, AFd1qSDK aFd1qSDK, AFd1kSDK aFd1kSDK, AFh1fSDK aFh1fSDK, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFi1jSDK, aFd1qSDK, aFd1kSDK, (i6 & 8) != 0 ? new AFh1fSDK() : aFh1fSDK);
    }

    private static void a(String str, boolean z6, int[] iArr, Object[] objArr) {
        char[] cArr;
        char c6;
        String str2 = str;
        int i6 = $11 + 15;
        $10 = i6 % 128;
        byte[] bArr = str2;
        if (i6 % 2 != 0) {
            throw null;
        }
        if (str2 != null) {
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        AFk1oSDK aFk1oSDK = new AFk1oSDK();
        int i7 = iArr[0];
        int i8 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        char[] cArr2 = AFInAppEventParameterName;
        if (cArr2 != null) {
            $10 = ($11 + 117) % 128;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i11 = 0; i11 < length; i11++) {
                $10 = ($11 + 33) % 128;
                cArr3[i11] = (char) (cArr2[i11] ^ 740144413554588574L);
            }
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i8];
        System.arraycopy(cArr2, i7, cArr4, 0, i8);
        if (bArr2 != null) {
            int i12 = $10 + 67;
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                cArr = new char[i8];
                aFk1oSDK.getCurrencyIso4217Code = 1;
                c6 = 1;
            } else {
                cArr = new char[i8];
                aFk1oSDK.getCurrencyIso4217Code = 0;
                c6 = 0;
            }
            while (true) {
                int i13 = aFk1oSDK.getCurrencyIso4217Code;
                if (i13 >= i8) {
                    break;
                }
                if (bArr2[i13] == 1) {
                    cArr[i13] = (char) (((cArr4[i13] * 2) + 1) - c6);
                } else {
                    cArr[i13] = (char) ((cArr4[i13] * 2) - c6);
                }
                c6 = cArr[i13];
                aFk1oSDK.getCurrencyIso4217Code = i13 + 1;
            }
            cArr4 = cArr;
        }
        if (i10 > 0) {
            char[] cArr5 = new char[i8];
            System.arraycopy(cArr4, 0, cArr5, 0, i8);
            int i14 = i8 - i10;
            System.arraycopy(cArr5, 0, cArr4, i14, i10);
            System.arraycopy(cArr5, i10, cArr4, 0, i14);
        }
        if (z6) {
            char[] cArr6 = new char[i8];
            aFk1oSDK.getCurrencyIso4217Code = 0;
            while (true) {
                int i15 = aFk1oSDK.getCurrencyIso4217Code;
                if (i15 >= i8) {
                    break;
                }
                cArr6[i15] = cArr4[(i8 - i15) - 1];
                aFk1oSDK.getCurrencyIso4217Code = i15 + 1;
            }
            cArr4 = cArr6;
        }
        if (i9 > 0) {
            aFk1oSDK.getCurrencyIso4217Code = 0;
            $11 = ($10 + 101) % 128;
            while (true) {
                int i16 = aFk1oSDK.getCurrencyIso4217Code;
                if (i16 >= i8) {
                    break;
                }
                cArr4[i16] = (char) (cArr4[i16] - iArr[2]);
                aFk1oSDK.getCurrencyIso4217Code = i16 + 1;
            }
        }
        objArr[0] = new String(cArr4);
    }

    private final void component3(AFa1oSDK p02) {
        try {
            Map<String, ?> equals = equals();
            if (equals != null) {
                int i6 = values + 39;
                valueOf = i6 % 128;
                if (i6 % 2 != 0) {
                    p02.getRevenue(equals);
                    throw null;
                }
                p02.getRevenue(equals);
            }
            if (!this.getCurrencyIso4217Code.getRevenue()) {
                values = (valueOf + 115) % 128;
                Map<String, Object> component1 = AFf1eSDK.component1(p02);
                Intrinsics.checkNotNullExpressionValue(component1, "");
                component1.put("pia_disabled", Boolean.TRUE);
                valueOf = (values + 33) % 128;
                return;
            }
        } catch (Throwable th) {
            AFh1uSDK.e$default(AFLogger.INSTANCE, AFh1vSDK.PLAY_INTEGRITY_API, "Error while adding PIA data to payload", th, true, false, false, false, 96, null);
        }
        values = (valueOf + 45) % 128;
    }

    private final Map<String, Object> equals() {
        AFi1gSDK mediationNetwork = this.getCurrencyIso4217Code.getMediationNetwork();
        if (mediationNetwork == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("pia_timestamp", Long.valueOf(mediationNetwork.getMonetizationNetwork));
        linkedHashMap2.put("ttr_millis", Long.valueOf(mediationNetwork.getRevenue));
        String str = mediationNetwork.AFAdRevenueData;
        if (str != null) {
            valueOf = (values + 125) % 128;
            linkedHashMap2.put("pia_token", str);
        }
        String str2 = mediationNetwork.getCurrencyIso4217Code;
        if (str2 != null) {
            valueOf = (values + 53) % 128;
            linkedHashMap2.put("error_code", str2);
        }
        linkedHashMap.put("pia", linkedHashMap2);
        valueOf = (values + 35) % 128;
        return linkedHashMap;
    }

    public static /* synthetic */ Object getMediationNetwork(Object[] objArr, int i6, int i7, int i8) {
        ((Number) objArr[1]).intValue();
        valueOf = (values + 47) % 128;
        return null;
    }

    @Override // com.appsflyer.internal.AFf1fSDK, com.appsflyer.internal.AFf1eSDK
    public final void getCurrencyIso4217Code(@NotNull AFa1oSDK p02) {
        Intrinsics.checkNotNullParameter(p02, "");
        Map<String, Object> monetizationNetwork = p02.getMonetizationNetwork();
        Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
        Object[] objArr = new Object[1];
        a("\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000", false, new int[]{0, 12, 0, 4}, objArr);
        monetizationNetwork.put(((String) objArr[0]).intern(), String.valueOf(new Date().getTime()));
        super.getCurrencyIso4217Code(p02);
        component3(p02);
        AFj1jSDK aFj1jSDK = new AFj1jSDK(this.getMonetizationNetwork, null, 2, null);
        p02.getRevenue(aFj1jSDK.getRevenue(AFj1jSDK.getMonetizationNetwork(aFj1jSDK.getMediationNetwork(aFj1jSDK.getMediationNetwork.getMonetizationNetwork("https://%spia.%s/api/v1.0/pia-android-event?app_id=")), false)));
        AFg1kSDK aFg1kSDK = ((AFf1eSDK) this).equals;
        Map<String, Object> monetizationNetwork2 = p02.getMonetizationNetwork();
        Intrinsics.checkNotNullExpressionValue(monetizationNetwork2, "");
        aFg1kSDK.getCurrencyIso4217Code(monetizationNetwork2, this.getMonetizationNetwork.getRevenue.getMediationNetwork("appsFlyerCount", 0), this.getMonetizationNetwork.getRevenue.getMediationNetwork("appsFlyerInAppEventCount", 0));
        values = (valueOf + 47) % 128;
    }

    @Override // com.appsflyer.internal.AFf1oSDK, com.appsflyer.internal.AFe1eSDK
    public final long getMonetizationNetwork() {
        TimeUnit timeUnit;
        long j6;
        int i6 = valueOf + 97;
        values = i6 % 128;
        if (i6 % 2 == 0) {
            timeUnit = TimeUnit.MINUTES;
            j6 = 0;
        } else {
            timeUnit = TimeUnit.MINUTES;
            j6 = 1;
        }
        return timeUnit.toMillis(j6);
    }

    @Override // com.appsflyer.internal.AFf1fSDK
    public final void getMonetizationNetwork(int p02) {
        getMediationNetwork(new Object[]{this, Integer.valueOf(p02)}, 36511501, -36511501, p02);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    private AFf1jSDK(@NotNull AFi1jSDK aFi1jSDK, @NotNull AFd1qSDK aFd1qSDK, @NotNull AFd1kSDK aFd1kSDK, @NotNull AFh1fSDK aFh1fSDK) {
        super(aFh1fSDK, aFd1kSDK);
        Intrinsics.checkNotNullParameter(aFi1jSDK, "");
        Intrinsics.checkNotNullParameter(aFd1qSDK, "");
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
        Intrinsics.checkNotNullParameter(aFh1fSDK, "");
        this.getCurrencyIso4217Code = aFi1jSDK;
        this.getMonetizationNetwork = aFd1qSDK;
        this.getRevenue.add(AFf1zSDK.CONVERSION);
    }

    @Override // com.appsflyer.internal.AFf1oSDK, com.appsflyer.internal.AFe1eSDK
    public final boolean getMediationNetwork() {
        int i6 = values + 117;
        int i7 = i6 % 128;
        valueOf = i7;
        boolean z6 = i6 % 2 != 0;
        int i8 = i7 + 7;
        values = i8 % 128;
        if (i8 % 2 != 0) {
            return z6;
        }
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AFf1jSDK(@NotNull AFi1jSDK aFi1jSDK, @NotNull AFd1qSDK aFd1qSDK, @NotNull AFd1kSDK aFd1kSDK) {
        this(aFi1jSDK, aFd1qSDK, aFd1kSDK, null, 8, null);
        Intrinsics.checkNotNullParameter(aFi1jSDK, "");
        Intrinsics.checkNotNullParameter(aFd1qSDK, "");
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
    }
}
