package com.appsflyer.internal.models;

import android.view.View;
import android.view.ViewConfiguration;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1c;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1e;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u0000 $2\u00020\u0001:\u0001$B1\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJB\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0018\u0010\u000bR\u001a\u0010\u0019\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u001c\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u001e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u000bR\u001a\u0010 \u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u000bR\u001a\u0010\"\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010\u000b"}, d2 = {"Lcom/appsflyer/internal/models/SubscribeWithGoogleInfo;", "", "", "p0", "p1", "p2", "p3", "p4", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/appsflyer/internal/models/SubscribeWithGoogleInfo;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "emailAddress", "Ljava/lang/String;", "getEmailAddress", "familyName", "getFamilyName", "givenName", "getGivenName", "profileId", "getProfileId", "profileName", "getProfileName", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final /* data */ class SubscribeWithGoogleInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String emailAddress;

    @NotNull
    private final String familyName;

    @NotNull
    private final String givenName;

    @NotNull
    private final String profileId;

    @NotNull
    private final String profileName;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/appsflyer/internal/models/SubscribeWithGoogleInfo$Companion;", "Lcom/appsflyer/internal/models/Deserialize;", "Lcom/appsflyer/internal/models/SubscribeWithGoogleInfo;", "<init>", "()V", "Lorg/json/JSONObject;", "p0", "fromJson", "(Lorg/json/JSONObject;)Lcom/appsflyer/internal/models/SubscribeWithGoogleInfo;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class Companion implements Deserialize<SubscribeWithGoogleInfo> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int getPackageName = 0;
        private static int toJsonMap = 1;
        private static char[] getOneTimePurchaseOfferDetails = {61850, 61904, 61903, 61896, 61896, 61895, 61937, 61941, 61897, 61894, 61892, 61898, 61840, 61892, 61897, 61899, 61940, 61941, 61897, 61906, 61907};
        private static int[] getQuantity = {418796712, 1948537304, -1650439581, 1033086924, 1645603133, 2007808860, 1857338365, 1823483694, 1952796418, 1977383259, -878785260, -804681131, 1207939658, -1435865874, -736037599, 1663337011, 155467428, 1644775619};

        private Companion() {
        }

        private static void a(boolean z6, String str, int[] iArr, Object[] objArr) {
            char[] cArr;
            char c6;
            String str2 = str;
            byte[] bArr = str2;
            if (str2 != null) {
                int i6 = $11 + 35;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 33 / 0;
                    bArr = str2.getBytes("ISO-8859-1");
                } else {
                    bArr = str2.getBytes("ISO-8859-1");
                }
            }
            byte[] bArr2 = bArr;
            AFPurchaseConnectorA1e aFPurchaseConnectorA1e = new AFPurchaseConnectorA1e();
            int i8 = iArr[0];
            int i9 = iArr[1];
            int i10 = iArr[2];
            int i11 = iArr[3];
            char[] cArr2 = getOneTimePurchaseOfferDetails;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                $11 = ($10 + 59) % 128;
                for (int i12 = 0; i12 < length; i12++) {
                    $10 = ($11 + 67) % 128;
                    cArr3[i12] = (char) (cArr2[i12] ^ (-6597605525082934877L));
                }
                cArr2 = cArr3;
            }
            char[] cArr4 = new char[i9];
            System.arraycopy(cArr2, i8, cArr4, 0, i9);
            if (bArr2 != null) {
                int i13 = $11 + 63;
                $10 = i13 % 128;
                if (i13 % 2 != 0) {
                    cArr = new char[i9];
                    aFPurchaseConnectorA1e.getOneTimePurchaseOfferDetails = 1;
                    c6 = 1;
                } else {
                    cArr = new char[i9];
                    aFPurchaseConnectorA1e.getOneTimePurchaseOfferDetails = 0;
                    c6 = 0;
                }
                while (true) {
                    int i14 = aFPurchaseConnectorA1e.getOneTimePurchaseOfferDetails;
                    if (i14 >= i9) {
                        break;
                    }
                    int i15 = ($10 + 1) % 128;
                    $11 = i15;
                    if (bArr2[i14] == 1) {
                        int i16 = i15 + 31;
                        $10 = i16 % 128;
                        if (i16 % 2 != 0) {
                            cArr[i14] = (char) ((cArr4[i14] >>> 5) >>> c6);
                        } else {
                            cArr[i14] = (char) (((cArr4[i14] * 2) + 1) - c6);
                        }
                    } else {
                        cArr[i14] = (char) ((cArr4[i14] * 2) - c6);
                    }
                    c6 = cArr[i14];
                    aFPurchaseConnectorA1e.getOneTimePurchaseOfferDetails = i14 + 1;
                }
                cArr4 = cArr;
            }
            if (i11 > 0) {
                char[] cArr5 = new char[i9];
                System.arraycopy(cArr4, 0, cArr5, 0, i9);
                int i17 = i9 - i11;
                System.arraycopy(cArr5, 0, cArr4, i17, i11);
                System.arraycopy(cArr5, i11, cArr4, 0, i17);
            }
            if (z6) {
                $11 = ($10 + 109) % 128;
                char[] cArr6 = new char[i9];
                aFPurchaseConnectorA1e.getOneTimePurchaseOfferDetails = 0;
                while (true) {
                    int i18 = aFPurchaseConnectorA1e.getOneTimePurchaseOfferDetails;
                    if (i18 >= i9) {
                        break;
                    }
                    cArr6[i18] = cArr4[(i9 - i18) - 1];
                    aFPurchaseConnectorA1e.getOneTimePurchaseOfferDetails = i18 + 1;
                }
                cArr4 = cArr6;
            }
            if (i10 > 0) {
                int i19 = $10 + 49;
                $11 = i19 % 128;
                if (i19 % 2 == 0) {
                    aFPurchaseConnectorA1e.getOneTimePurchaseOfferDetails = 1;
                } else {
                    aFPurchaseConnectorA1e.getOneTimePurchaseOfferDetails = 0;
                }
                while (true) {
                    int i20 = aFPurchaseConnectorA1e.getOneTimePurchaseOfferDetails;
                    if (i20 >= i9) {
                        break;
                    }
                    cArr4[i20] = (char) (cArr4[i20] - iArr[2]);
                    aFPurchaseConnectorA1e.getOneTimePurchaseOfferDetails = i20 + 1;
                }
            }
            objArr[0] = new String(cArr4);
        }

        private static void b(int[] iArr, int i6, Object[] objArr) {
            int length;
            int[] iArr2;
            int i7;
            AFPurchaseConnectorA1c aFPurchaseConnectorA1c = new AFPurchaseConnectorA1c();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr3 = getQuantity;
            long j6 = -6033101233399176549L;
            if (iArr3 != null) {
                int i8 = ($11 + 107) % 128;
                $10 = i8;
                int length2 = iArr3.length;
                int[] iArr4 = new int[length2];
                $11 = (i8 + 121) % 128;
                for (int i9 = 0; i9 < length2; i9++) {
                    iArr4[i9] = (int) (iArr3[i9] ^ (-6033101233399176549L));
                }
                iArr3 = iArr4;
            }
            int length3 = iArr3.length;
            int[] iArr5 = new int[length3];
            int[] iArr6 = getQuantity;
            if (iArr6 != null) {
                int i10 = $11 + 87;
                $10 = i10 % 128;
                if (i10 % 2 != 0) {
                    length = iArr6.length;
                    iArr2 = new int[length];
                    i7 = 1;
                } else {
                    length = iArr6.length;
                    iArr2 = new int[length];
                    i7 = 0;
                }
                while (i7 < length) {
                    $11 = ($10 + 97) % 128;
                    long j7 = j6;
                    iArr2[i7] = (int) (iArr6[i7] ^ j7);
                    i7++;
                    j6 = j7;
                }
                iArr6 = iArr2;
            }
            System.arraycopy(iArr6, 0, iArr5, 0, length3);
            aFPurchaseConnectorA1c.InAppPurchaseEvent = 0;
            while (true) {
                int i11 = aFPurchaseConnectorA1c.InAppPurchaseEvent;
                if (i11 >= iArr.length) {
                    objArr[0] = new String(cArr2, 0, i6);
                    return;
                }
                int i12 = iArr[i11];
                char c6 = (char) (i12 >> 16);
                cArr[0] = c6;
                char c7 = (char) i12;
                cArr[1] = c7;
                char c8 = (char) (iArr[i11 + 1] >> 16);
                cArr[2] = c8;
                char c9 = (char) iArr[i11 + 1];
                cArr[3] = c9;
                aFPurchaseConnectorA1c.getQuantity = (c6 << 16) + c7;
                aFPurchaseConnectorA1c.toJsonMap = (c8 << 16) + c9;
                AFPurchaseConnectorA1c.InAppPurchaseEvent(iArr5);
                $10 = ($11 + 1) % 128;
                for (int i13 = 0; i13 < 16; i13++) {
                    $11 = ($10 + 1) % 128;
                    int i14 = aFPurchaseConnectorA1c.getQuantity ^ iArr5[i13];
                    aFPurchaseConnectorA1c.getQuantity = i14;
                    int quantity = AFPurchaseConnectorA1c.getQuantity(i14) ^ aFPurchaseConnectorA1c.toJsonMap;
                    int i15 = aFPurchaseConnectorA1c.getQuantity;
                    aFPurchaseConnectorA1c.getQuantity = quantity;
                    aFPurchaseConnectorA1c.toJsonMap = i15;
                }
                int i16 = aFPurchaseConnectorA1c.getQuantity;
                int i17 = aFPurchaseConnectorA1c.toJsonMap;
                aFPurchaseConnectorA1c.getQuantity = i17;
                aFPurchaseConnectorA1c.toJsonMap = i16;
                int i18 = i16 ^ iArr5[16];
                aFPurchaseConnectorA1c.toJsonMap = i18;
                int i19 = i17 ^ iArr5[17];
                aFPurchaseConnectorA1c.getQuantity = i19;
                cArr[0] = (char) (i19 >>> 16);
                cArr[1] = (char) i19;
                cArr[2] = (char) (i18 >>> 16);
                cArr[3] = (char) i18;
                AFPurchaseConnectorA1c.InAppPurchaseEvent(iArr5);
                int i20 = aFPurchaseConnectorA1c.InAppPurchaseEvent;
                cArr2[i20 * 2] = cArr[0];
                cArr2[(i20 * 2) + 1] = cArr[1];
                cArr2[(i20 * 2) + 2] = cArr[2];
                cArr2[(i20 * 2) + 3] = cArr[3];
                aFPurchaseConnectorA1c.InAppPurchaseEvent = i20 + 2;
                $10 = ($11 + 117) % 128;
            }
        }

        @Override // com.appsflyer.internal.models.Deserialize
        public final /* bridge */ /* synthetic */ SubscribeWithGoogleInfo fromJson(JSONObject jSONObject) {
            getPackageName = (toJsonMap + 23) % 128;
            SubscribeWithGoogleInfo fromJson = fromJson(jSONObject);
            int i6 = toJsonMap + 31;
            getPackageName = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 75 / 0;
            }
            return fromJson;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        @NotNull
        public final SubscribeWithGoogleInfo fromJson(@NotNull JSONObject p02) {
            Intrinsics.checkNotNullParameter(p02, "");
            Object[] objArr = new Object[1];
            a(true, "\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000", new int[]{0, 12, 0, 0}, objArr);
            String optString = p02.optString(((String) objArr[0]).intern());
            Intrinsics.checkNotNullExpressionValue(optString, "");
            Object[] objArr2 = new Object[1];
            b(new int[]{1362738978, 1051242831, -1218499737, 1371039766, 758915324, 155961919}, 11 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr2);
            String optString2 = p02.optString(((String) objArr2[0]).intern());
            Intrinsics.checkNotNullExpressionValue(optString2, "");
            Object[] objArr3 = new Object[1];
            b(new int[]{-4608109, 1363044340, -149718670, 2092778429, 2119728533, -1200540607}, View.MeasureSpec.getSize(0) + 9, objArr3);
            String optString3 = p02.optString(((String) objArr3[0]).intern());
            Intrinsics.checkNotNullExpressionValue(optString3, "");
            Object[] objArr4 = new Object[1];
            a(false, "\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001", new int[]{12, 9, 0, 6}, objArr4);
            String optString4 = p02.optString(((String) objArr4[0]).intern());
            Intrinsics.checkNotNullExpressionValue(optString4, "");
            Object[] objArr5 = new Object[1];
            b(new int[]{2057795536, 2114002524, -557252362, -1811934362, 1380551411, -389149381}, View.MeasureSpec.makeMeasureSpec(0, 0) + 11, objArr5);
            String optString5 = p02.optString(((String) objArr5[0]).intern());
            Intrinsics.checkNotNullExpressionValue(optString5, "");
            SubscribeWithGoogleInfo subscribeWithGoogleInfo = new SubscribeWithGoogleInfo(optString, optString2, optString3, optString4, optString5);
            toJsonMap = (getPackageName + 57) % 128;
            return subscribeWithGoogleInfo;
        }
    }

    public SubscribeWithGoogleInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.emailAddress = str;
        this.familyName = str2;
        this.givenName = str3;
        this.profileId = str4;
        this.profileName = str5;
    }

    public static /* synthetic */ SubscribeWithGoogleInfo copy$default(SubscribeWithGoogleInfo subscribeWithGoogleInfo, String str, String str2, String str3, String str4, String str5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = subscribeWithGoogleInfo.emailAddress;
        }
        if ((i6 & 2) != 0) {
            str2 = subscribeWithGoogleInfo.familyName;
        }
        if ((i6 & 4) != 0) {
            str3 = subscribeWithGoogleInfo.givenName;
        }
        if ((i6 & 8) != 0) {
            str4 = subscribeWithGoogleInfo.profileId;
        }
        if ((i6 & 16) != 0) {
            str5 = subscribeWithGoogleInfo.profileName;
        }
        String str6 = str5;
        String str7 = str3;
        return subscribeWithGoogleInfo.copy(str, str2, str7, str4, str6);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getEmailAddress() {
        return this.emailAddress;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getFamilyName() {
        return this.familyName;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getGivenName() {
        return this.givenName;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getProfileId() {
        return this.profileId;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getProfileName() {
        return this.profileName;
    }

    @NotNull
    public final SubscribeWithGoogleInfo copy(@NotNull String p02, @NotNull String p12, @NotNull String p22, @NotNull String p32, @NotNull String p42) {
        Intrinsics.checkNotNullParameter(p02, "");
        Intrinsics.checkNotNullParameter(p12, "");
        Intrinsics.checkNotNullParameter(p22, "");
        Intrinsics.checkNotNullParameter(p32, "");
        Intrinsics.checkNotNullParameter(p42, "");
        return new SubscribeWithGoogleInfo(p02, p12, p22, p32, p42);
    }

    public final boolean equals(@Nullable Object p02) {
        if (this == p02) {
            return true;
        }
        if (!(p02 instanceof SubscribeWithGoogleInfo)) {
            return false;
        }
        SubscribeWithGoogleInfo subscribeWithGoogleInfo = (SubscribeWithGoogleInfo) p02;
        return Intrinsics.areEqual(this.emailAddress, subscribeWithGoogleInfo.emailAddress) && Intrinsics.areEqual(this.familyName, subscribeWithGoogleInfo.familyName) && Intrinsics.areEqual(this.givenName, subscribeWithGoogleInfo.givenName) && Intrinsics.areEqual(this.profileId, subscribeWithGoogleInfo.profileId) && Intrinsics.areEqual(this.profileName, subscribeWithGoogleInfo.profileName);
    }

    @JvmName(name = "getEmailAddress")
    @NotNull
    public final String getEmailAddress() {
        return this.emailAddress;
    }

    @JvmName(name = "getFamilyName")
    @NotNull
    public final String getFamilyName() {
        return this.familyName;
    }

    @JvmName(name = "getGivenName")
    @NotNull
    public final String getGivenName() {
        return this.givenName;
    }

    @JvmName(name = "getProfileId")
    @NotNull
    public final String getProfileId() {
        return this.profileId;
    }

    @JvmName(name = "getProfileName")
    @NotNull
    public final String getProfileName() {
        return this.profileName;
    }

    public final int hashCode() {
        return (((((((this.emailAddress.hashCode() * 31) + this.familyName.hashCode()) * 31) + this.givenName.hashCode()) * 31) + this.profileId.hashCode()) * 31) + this.profileName.hashCode();
    }

    @NotNull
    public final String toString() {
        return "SubscribeWithGoogleInfo(emailAddress=" + this.emailAddress + ", familyName=" + this.familyName + ", givenName=" + this.givenName + ", profileId=" + this.profileId + ", profileName=" + this.profileName + ")";
    }
}
