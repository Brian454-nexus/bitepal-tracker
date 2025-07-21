package com.appsflyer.internal.models;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1c;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA2x;
import kotlin.Metadata;
import kotlin.io.encoding.Base64;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b#\b\u0086\b\u0018\u0000 I2\u00020\u0001:\u0001IBy\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001a\u0010\u0015J\u0010\u0010\u001b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001b\u0010\u0015J\u0010\u0010\u001c\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001c\u0010\u0015J\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001f\u0010\u0015J\u0010\u0010 \u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b \u0010\u0015J\u0010\u0010!\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\u0018J\u0010\u0010\"\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010\u0018J\u0010\u0010#\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b#\u0010\u0015J\u009c\u0001\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020&2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b)\u0010\u0018J\u0010\u0010*\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b*\u0010\u0015R\u0017\u0010+\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u0018R\u001a\u0010.\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010,\u001a\u0004\b/\u0010\u0018R\u001a\u00100\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u0010\u0015R\u001a\u00103\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u00101\u001a\u0004\b4\u0010\u0015R\u001a\u00105\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u00101\u001a\u0004\b6\u0010\u0015R\u001a\u00107\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u00101\u001a\u0004\b8\u0010\u0015R\u001a\u00109\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u00101\u001a\u0004\b:\u0010\u0015R\u001a\u0010;\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u00101\u001a\u0004\b<\u0010\u0015R\u001a\u0010=\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010,\u001a\u0004\b>\u0010\u0018R\u001a\u0010?\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b?\u00101\u001a\u0004\b@\u0010\u0015R\u001a\u0010A\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bA\u00101\u001a\u0004\bB\u0010\u0015R\u001a\u0010C\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\bC\u0010,\u001a\u0004\bD\u0010\u0018R\u001a\u0010E\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010,\u001a\u0004\bF\u0010\u0018R\u001a\u0010G\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bG\u00101\u001a\u0004\bH\u0010\u0015"}, d2 = {"Lcom/appsflyer/internal/models/ProductPurchase;", "", "", "p0", "p1", "", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "<init>", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component10", "component11", "()I", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/appsflyer/internal/models/ProductPurchase;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "acknowledgementState", "I", "getAcknowledgementState", "consumptionState", "getConsumptionState", "developerPayload", "Ljava/lang/String;", "getDeveloperPayload", "kind", "getKind", "obfuscatedExternalAccountId", "getObfuscatedExternalAccountId", "obfuscatedExternalProfileId", "getObfuscatedExternalProfileId", "orderId", "getOrderId", "productId", "getProductId", "purchaseState", "getPurchaseState", "purchaseTimeMillis", "getPurchaseTimeMillis", "purchaseToken", "getPurchaseToken", "purchaseType", "getPurchaseType", "quantity", "getQuantity", "regionCode", "getRegionCode", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final /* data */ class ProductPurchase {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int acknowledgementState;
    private final int consumptionState;

    @NotNull
    private final String developerPayload;

    @NotNull
    private final String kind;

    @NotNull
    private final String obfuscatedExternalAccountId;

    @NotNull
    private final String obfuscatedExternalProfileId;

    @NotNull
    private final String orderId;

    @NotNull
    private final String productId;
    private final int purchaseState;

    @NotNull
    private final String purchaseTimeMillis;

    @NotNull
    private final String purchaseToken;
    private final int purchaseType;
    private final int quantity;

    @NotNull
    private final String regionCode;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/appsflyer/internal/models/ProductPurchase$Companion;", "Lcom/appsflyer/internal/models/Deserialize;", "Lcom/appsflyer/internal/models/ProductPurchase;", "<init>", "()V", "Lorg/json/JSONObject;", "p0", "fromJson", "(Lorg/json/JSONObject;)Lcom/appsflyer/internal/models/ProductPurchase;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class Companion implements Deserialize<ProductPurchase> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int PurchaseClient = 0;
        private static int equals = 1;
        private static int getOneTimePurchaseOfferDetails = 1688888230;
        private static int getPackageName = 1175623904;
        private static int getQuantity = -2078375;
        private static short[] toJsonMap;
        private static byte[] InAppPurchaseEvent = {64, 87, 72, -42, -16, -54, -122, -53, -41, -9, -34, -30, -42, -38, -30, 57, -37, Base64.padSymbol, -23, 53, -49, -42, -59, -44, -53, -64, -54, -43, -49, -36, -21, 47, -27, -47, -62, -45, -59, -57, -11, 63, 58, -38, -63, -43, 57, -51, -43, 125, 31, 113, 45, 99, 10, 21, 4, 20, 2, 15, 3, 5, 121, 20, 13, 15, 20, 14, -90, -40, -100, -15, -100, -8, ByteCompanionObject.MIN_VALUE, -115, -60, -60, -60, -60, -60, -60, -60};
        private static int[] stopObservingTransactions = {-989833201, 1143223520, -1012064137, -1343262758, 1670981312, -859429332, 1785487465, -2009815516, -771224981, 1290596811, 552937098, -65778887, 1218886644, 1666756460, -1614711560, -1162689365, -1805054757, 1026752911};

        private Companion() {
        }

        private static void a(int i6, int i7, byte b6, short s6, int i8, Object[] objArr) {
            int i9;
            char c6;
            int length;
            byte[] bArr;
            AFPurchaseConnectorA2x aFPurchaseConnectorA2x = new AFPurchaseConnectorA2x();
            StringBuilder sb = new StringBuilder();
            int i10 = i7 + ((int) (getPackageName ^ (-4208132002516133692L)));
            if (i10 == -1) {
                i9 = 1;
            } else {
                $11 = ($10 + 7) % 128;
                i9 = 0;
            }
            if ((i9 ^ 1) != 1) {
                byte[] bArr2 = InAppPurchaseEvent;
                if (bArr2 != null) {
                    int length2 = bArr2.length;
                    byte[] bArr3 = new byte[length2];
                    int i11 = 0;
                    while (i11 < length2) {
                        int i12 = $10 + 67;
                        $11 = i12 % 128;
                        if (i12 % 2 == 0) {
                            bArr3[i11] = (byte) (bArr2[i11] | (-4208132002516133692L));
                        } else {
                            bArr3[i11] = (byte) (bArr2[i11] ^ (-4208132002516133692L));
                            i11++;
                        }
                    }
                    bArr2 = bArr3;
                }
                i10 = bArr2 != null ? (byte) (((byte) (InAppPurchaseEvent[i8 + ((int) (getQuantity ^ (-4208132002516133692L)))] ^ (-4208132002516133692L))) + ((int) (getPackageName ^ (-4208132002516133692L)))) : (short) (((short) (toJsonMap[i8 + ((int) (getQuantity ^ (-4208132002516133692L)))] ^ (-4208132002516133692L))) + ((int) (getPackageName ^ (-4208132002516133692L))));
            }
            if (i10 > 0) {
                aFPurchaseConnectorA2x.getPackageName = ((i8 + i10) - 2) + ((int) (getQuantity ^ (-4208132002516133692L))) + i9;
                char c7 = (char) (i6 + ((int) (getOneTimePurchaseOfferDetails ^ (-4208132002516133692L))));
                aFPurchaseConnectorA2x.InAppPurchaseEvent = c7;
                sb.append(c7);
                aFPurchaseConnectorA2x.getQuantity = aFPurchaseConnectorA2x.InAppPurchaseEvent;
                byte[] bArr4 = InAppPurchaseEvent;
                if (bArr4 != null) {
                    int i13 = $11 + 67;
                    $10 = i13 % 128;
                    if (i13 % 2 != 0) {
                        length = bArr4.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr4.length;
                        bArr = new byte[length];
                    }
                    for (int i14 = 0; i14 < length; i14++) {
                        $11 = ($10 + 53) % 128;
                        bArr[i14] = (byte) (bArr4[i14] ^ (-4208132002516133692L));
                    }
                    bArr4 = bArr;
                }
                boolean z6 = bArr4 != null;
                aFPurchaseConnectorA2x.getOneTimePurchaseOfferDetails = 1;
                while (aFPurchaseConnectorA2x.getOneTimePurchaseOfferDetails < i10) {
                    if (z6) {
                        int i15 = $10 + 13;
                        $11 = i15 % 128;
                        if (i15 % 2 == 0) {
                            byte[] bArr5 = InAppPurchaseEvent;
                            aFPurchaseConnectorA2x.getPackageName = aFPurchaseConnectorA2x.getPackageName << 1;
                            c6 = (char) (aFPurchaseConnectorA2x.getQuantity >> (((byte) (((byte) (bArr5[r7] % (-4208132002516133692L))) >>> s6)) ^ b6));
                        } else {
                            byte[] bArr6 = InAppPurchaseEvent;
                            aFPurchaseConnectorA2x.getPackageName = aFPurchaseConnectorA2x.getPackageName - 1;
                            c6 = (char) (aFPurchaseConnectorA2x.getQuantity + (((byte) (((byte) (bArr6[r7] ^ (-4208132002516133692L))) + s6)) ^ b6));
                        }
                        aFPurchaseConnectorA2x.InAppPurchaseEvent = c6;
                    } else {
                        short[] sArr = toJsonMap;
                        aFPurchaseConnectorA2x.getPackageName = aFPurchaseConnectorA2x.getPackageName - 1;
                        aFPurchaseConnectorA2x.InAppPurchaseEvent = (char) (aFPurchaseConnectorA2x.getQuantity + (((short) (((short) (sArr[r7] ^ (-4208132002516133692L))) + s6)) ^ b6));
                    }
                    sb.append(aFPurchaseConnectorA2x.InAppPurchaseEvent);
                    aFPurchaseConnectorA2x.getQuantity = aFPurchaseConnectorA2x.InAppPurchaseEvent;
                    aFPurchaseConnectorA2x.getOneTimePurchaseOfferDetails++;
                }
            }
            objArr[0] = sb.toString();
        }

        private static void b(int[] iArr, int i6, Object[] objArr) {
            int length;
            int[] iArr2;
            AFPurchaseConnectorA1c aFPurchaseConnectorA1c = new AFPurchaseConnectorA1c();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr3 = stopObservingTransactions;
            if (iArr3 != null) {
                int i7 = $10 + 43;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    length = iArr3.length;
                    iArr2 = new int[length];
                } else {
                    length = iArr3.length;
                    iArr2 = new int[length];
                }
                for (int i8 = 0; i8 < length; i8++) {
                    $11 = ($10 + 125) % 128;
                    iArr2[i8] = (int) (iArr3[i8] ^ (-6033101233399176549L));
                }
                iArr3 = iArr2;
            }
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = stopObservingTransactions;
            if (iArr5 != null) {
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                for (int i9 = 0; i9 < length3; i9++) {
                    $10 = ($11 + 119) % 128;
                    iArr6[i9] = (int) (iArr5[i9] ^ (-6033101233399176549L));
                }
                iArr5 = iArr6;
            }
            System.arraycopy(iArr5, 0, iArr4, 0, length2);
            aFPurchaseConnectorA1c.InAppPurchaseEvent = 0;
            while (true) {
                int i10 = aFPurchaseConnectorA1c.InAppPurchaseEvent;
                if (i10 >= iArr.length) {
                    objArr[0] = new String(cArr2, 0, i6);
                    return;
                }
                $10 = ($11 + 67) % 128;
                int i11 = iArr[i10];
                char c6 = (char) (i11 >> 16);
                cArr[0] = c6;
                char c7 = (char) i11;
                cArr[1] = c7;
                char c8 = (char) (iArr[i10 + 1] >> 16);
                cArr[2] = c8;
                char c9 = (char) iArr[i10 + 1];
                cArr[3] = c9;
                aFPurchaseConnectorA1c.getQuantity = (c6 << 16) + c7;
                aFPurchaseConnectorA1c.toJsonMap = (c8 << 16) + c9;
                AFPurchaseConnectorA1c.InAppPurchaseEvent(iArr4);
                for (int i12 = 0; i12 < 16; i12++) {
                    $10 = ($11 + 57) % 128;
                    int i13 = aFPurchaseConnectorA1c.getQuantity ^ iArr4[i12];
                    aFPurchaseConnectorA1c.getQuantity = i13;
                    int quantity = AFPurchaseConnectorA1c.getQuantity(i13) ^ aFPurchaseConnectorA1c.toJsonMap;
                    int i14 = aFPurchaseConnectorA1c.getQuantity;
                    aFPurchaseConnectorA1c.getQuantity = quantity;
                    aFPurchaseConnectorA1c.toJsonMap = i14;
                }
                int i15 = aFPurchaseConnectorA1c.getQuantity;
                int i16 = aFPurchaseConnectorA1c.toJsonMap;
                aFPurchaseConnectorA1c.getQuantity = i16;
                aFPurchaseConnectorA1c.toJsonMap = i15;
                int i17 = i15 ^ iArr4[16];
                aFPurchaseConnectorA1c.toJsonMap = i17;
                int i18 = i16 ^ iArr4[17];
                aFPurchaseConnectorA1c.getQuantity = i18;
                cArr[0] = (char) (i18 >>> 16);
                cArr[1] = (char) i18;
                cArr[2] = (char) (i17 >>> 16);
                cArr[3] = (char) i17;
                AFPurchaseConnectorA1c.InAppPurchaseEvent(iArr4);
                int i19 = aFPurchaseConnectorA1c.InAppPurchaseEvent;
                cArr2[i19 * 2] = cArr[0];
                cArr2[(i19 * 2) + 1] = cArr[1];
                cArr2[(i19 * 2) + 2] = cArr[2];
                cArr2[(i19 * 2) + 3] = cArr[3];
                aFPurchaseConnectorA1c.InAppPurchaseEvent = i19 + 2;
            }
        }

        @Override // com.appsflyer.internal.models.Deserialize
        public final /* synthetic */ ProductPurchase fromJson(JSONObject jSONObject) {
            int i6 = equals + 59;
            PurchaseClient = i6 % 128;
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
        @JvmStatic
        @NotNull
        public final ProductPurchase fromJson(@NotNull JSONObject p02) {
            Intrinsics.checkNotNullParameter(p02, "");
            Object[] objArr = new Object[1];
            a((-582548215) - TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) - 32, (byte) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (short) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 114), 1175268964 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr);
            String optString = p02.optString(((String) objArr[0]).intern());
            Object[] objArr2 = new Object[1];
            b(new int[]{2005301407, -60183927, -1207719689, 400653573, 1362738546, 420062478, 1113928308, 728412629, 380141090, 726507346}, View.resolveSizeAndState(0, 0, 0) + 18, objArr2);
            String optString2 = p02.optString(((String) objArr2[0]).intern());
            Object[] objArr3 = new Object[1];
            a((-582548210) - View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) - 23, (byte) TextUtils.indexOf("", ""), (short) ((-34) - ExpandableListView.getPackedPositionChild(0L)), 1175268967 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr3);
            int optInt = p02.optInt(((String) objArr3[0]).intern(), -1);
            Object[] objArr4 = new Object[1];
            a((-582548223) - View.combineMeasuredStates(0, 0), (-20) - (ViewConfiguration.getKeyRepeatDelay() >> 16), (byte) View.combineMeasuredStates(0, 0), (short) ((-12) - View.resolveSize(0, 0)), 1175268978 - Color.red(0), objArr4);
            int optInt2 = p02.optInt(((String) objArr4[0]).intern(), -1);
            Object[] objArr5 = new Object[1];
            b(new int[]{-1326057577, 791766696, -1433654798, -1635830386, 2135481497, -322530907, 1308775003, -422984170}, Gravity.getAbsoluteGravity(0, 0) + 16, objArr5);
            String optString3 = p02.optString(((String) objArr5[0]).intern());
            Object[] objArr6 = new Object[1];
            a((-582548211) - Gravity.getAbsoluteGravity(0, 0), (-30) - ImageFormat.getBitsPerPixel(0), (byte) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), (short) ((ViewConfiguration.getWindowTouchSlop() >> 8) - 20), 1175268992 - TextUtils.lastIndexOf("", '0', 0, 0), objArr6);
            String optString4 = p02.optString(((String) objArr6[0]).intern());
            Object[] objArr7 = new Object[1];
            a((KeyEvent.getMaxKeyCode() >> 16) - 582548210, TextUtils.indexOf("", "", 0) - 24, (byte) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (short) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 12), 1175268999 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr7);
            int optInt3 = p02.optInt(((String) objArr7[0]).intern(), -1);
            Object[] objArr8 = new Object[1];
            a((-582548224) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (-15) - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (byte) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), (short) (TextUtils.lastIndexOf("", '0', 0, 0) + 57), 1175269011 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr8);
            int optInt4 = p02.optInt(((String) objArr8[0]).intern(), -1);
            Object[] objArr9 = new Object[1];
            b(new int[]{2005301407, -60183927, -1207719689, 400653573, -1054609149, 632850071, -2107846801, -699867247}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 13, objArr9);
            String optString5 = p02.optString(((String) objArr9[0]).intern());
            Object[] objArr10 = new Object[1];
            a((-582548210) - (ViewConfiguration.getPressedStateDuration() >> 16), (-27) - (ViewConfiguration.getJumpTapTimeout() >> 16), (byte) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (short) (View.combineMeasuredStates(0, 0) - 71), 1175269029 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr10);
            String optString6 = p02.optString(((String) objArr10[0]).intern());
            Object[] objArr11 = new Object[1];
            b(new int[]{-545346571, -391332314, 443699041, -746527974}, 8 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr11);
            int optInt5 = p02.optInt(((String) objArr11[0]).intern(), -1);
            Object[] objArr12 = new Object[1];
            b(new int[]{-1626725951, 1230683472, 1378003559, -1364087339, 1691992993, 1113039018, 222303335, 2009666220, -608474663, -2045665009, -666539501, 1939553639, 315608314, -2019676651}, ExpandableListView.getPackedPositionChild(0L) + 28, objArr12);
            String optString7 = p02.optString(((String) objArr12[0]).intern());
            Object[] objArr13 = new Object[1];
            b(new int[]{-1626725951, 1230683472, 1378003559, -1364087339, 1691992993, 1113039018, 222303335, 2009666220, 585103710, 1153811338, -732915703, 2036937792, 1227427407, 1561955090}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 26, objArr13);
            String optString8 = p02.optString(((String) objArr13[0]).intern());
            Object[] objArr14 = new Object[1];
            b(new int[]{-74593020, -1978383024, -1878750948, -1905049167, 1905259955, 1187120085}, 10 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr14);
            String optString9 = p02.optString(((String) objArr14[0]).intern());
            Intrinsics.checkNotNullExpressionValue(optString, "");
            Intrinsics.checkNotNullExpressionValue(optString2, "");
            Intrinsics.checkNotNullExpressionValue(optString3, "");
            Intrinsics.checkNotNullExpressionValue(optString4, "");
            Intrinsics.checkNotNullExpressionValue(optString5, "");
            Intrinsics.checkNotNullExpressionValue(optString6, "");
            Intrinsics.checkNotNullExpressionValue(optString7, "");
            Intrinsics.checkNotNullExpressionValue(optString8, "");
            Intrinsics.checkNotNullExpressionValue(optString9, "");
            ProductPurchase productPurchase = new ProductPurchase(optString, optString2, optInt, optInt2, optString3, optString4, optInt3, optInt4, optString5, optString6, optInt5, optString7, optString8, optString9);
            PurchaseClient = (equals + 89) % 128;
            return productPurchase;
        }
    }

    public ProductPurchase(@NotNull String str, @NotNull String str2, int i6, int i7, @NotNull String str3, @NotNull String str4, int i8, int i9, @NotNull String str5, @NotNull String str6, int i10, @NotNull String str7, @NotNull String str8, @NotNull String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.kind = str;
        this.purchaseTimeMillis = str2;
        this.purchaseState = i6;
        this.consumptionState = i7;
        this.developerPayload = str3;
        this.orderId = str4;
        this.purchaseType = i8;
        this.acknowledgementState = i9;
        this.purchaseToken = str5;
        this.productId = str6;
        this.quantity = i10;
        this.obfuscatedExternalAccountId = str7;
        this.obfuscatedExternalProfileId = str8;
        this.regionCode = str9;
    }

    @JvmStatic
    @NotNull
    public static ProductPurchase fromJson(@NotNull JSONObject jSONObject) {
        return INSTANCE.fromJson(jSONObject);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getKind() {
        return this.kind;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    /* renamed from: component11, reason: from getter */
    public final int getQuantity() {
        return this.quantity;
    }

    @NotNull
    /* renamed from: component12, reason: from getter */
    public final String getObfuscatedExternalAccountId() {
        return this.obfuscatedExternalAccountId;
    }

    @NotNull
    /* renamed from: component13, reason: from getter */
    public final String getObfuscatedExternalProfileId() {
        return this.obfuscatedExternalProfileId;
    }

    @NotNull
    /* renamed from: component14, reason: from getter */
    public final String getRegionCode() {
        return this.regionCode;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getPurchaseTimeMillis() {
        return this.purchaseTimeMillis;
    }

    /* renamed from: component3, reason: from getter */
    public final int getPurchaseState() {
        return this.purchaseState;
    }

    /* renamed from: component4, reason: from getter */
    public final int getConsumptionState() {
        return this.consumptionState;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getDeveloperPayload() {
        return this.developerPayload;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* renamed from: component7, reason: from getter */
    public final int getPurchaseType() {
        return this.purchaseType;
    }

    /* renamed from: component8, reason: from getter */
    public final int getAcknowledgementState() {
        return this.acknowledgementState;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    @NotNull
    public final ProductPurchase copy(@NotNull String p02, @NotNull String p12, int p22, int p32, @NotNull String p42, @NotNull String p52, int p6, int p7, @NotNull String p8, @NotNull String p9, int p10, @NotNull String p11, @NotNull String p122, @NotNull String p13) {
        Intrinsics.checkNotNullParameter(p02, "");
        Intrinsics.checkNotNullParameter(p12, "");
        Intrinsics.checkNotNullParameter(p42, "");
        Intrinsics.checkNotNullParameter(p52, "");
        Intrinsics.checkNotNullParameter(p8, "");
        Intrinsics.checkNotNullParameter(p9, "");
        Intrinsics.checkNotNullParameter(p11, "");
        Intrinsics.checkNotNullParameter(p122, "");
        Intrinsics.checkNotNullParameter(p13, "");
        return new ProductPurchase(p02, p12, p22, p32, p42, p52, p6, p7, p8, p9, p10, p11, p122, p13);
    }

    public final boolean equals(@Nullable Object p02) {
        if (this == p02) {
            return true;
        }
        if (!(p02 instanceof ProductPurchase)) {
            return false;
        }
        ProductPurchase productPurchase = (ProductPurchase) p02;
        return Intrinsics.areEqual(this.kind, productPurchase.kind) && Intrinsics.areEqual(this.purchaseTimeMillis, productPurchase.purchaseTimeMillis) && this.purchaseState == productPurchase.purchaseState && this.consumptionState == productPurchase.consumptionState && Intrinsics.areEqual(this.developerPayload, productPurchase.developerPayload) && Intrinsics.areEqual(this.orderId, productPurchase.orderId) && this.purchaseType == productPurchase.purchaseType && this.acknowledgementState == productPurchase.acknowledgementState && Intrinsics.areEqual(this.purchaseToken, productPurchase.purchaseToken) && Intrinsics.areEqual(this.productId, productPurchase.productId) && this.quantity == productPurchase.quantity && Intrinsics.areEqual(this.obfuscatedExternalAccountId, productPurchase.obfuscatedExternalAccountId) && Intrinsics.areEqual(this.obfuscatedExternalProfileId, productPurchase.obfuscatedExternalProfileId) && Intrinsics.areEqual(this.regionCode, productPurchase.regionCode);
    }

    @JvmName(name = "getAcknowledgementState")
    public final int getAcknowledgementState() {
        return this.acknowledgementState;
    }

    @JvmName(name = "getConsumptionState")
    public final int getConsumptionState() {
        return this.consumptionState;
    }

    @JvmName(name = "getDeveloperPayload")
    @NotNull
    public final String getDeveloperPayload() {
        return this.developerPayload;
    }

    @JvmName(name = "getKind")
    @NotNull
    public final String getKind() {
        return this.kind;
    }

    @JvmName(name = "getObfuscatedExternalAccountId")
    @NotNull
    public final String getObfuscatedExternalAccountId() {
        return this.obfuscatedExternalAccountId;
    }

    @JvmName(name = "getObfuscatedExternalProfileId")
    @NotNull
    public final String getObfuscatedExternalProfileId() {
        return this.obfuscatedExternalProfileId;
    }

    @JvmName(name = "getOrderId")
    @NotNull
    public final String getOrderId() {
        return this.orderId;
    }

    @JvmName(name = "getProductId")
    @NotNull
    public final String getProductId() {
        return this.productId;
    }

    @JvmName(name = "getPurchaseState")
    public final int getPurchaseState() {
        return this.purchaseState;
    }

    @JvmName(name = "getPurchaseTimeMillis")
    @NotNull
    public final String getPurchaseTimeMillis() {
        return this.purchaseTimeMillis;
    }

    @JvmName(name = "getPurchaseToken")
    @NotNull
    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    @JvmName(name = "getPurchaseType")
    public final int getPurchaseType() {
        return this.purchaseType;
    }

    @JvmName(name = "getQuantity")
    public final int getQuantity() {
        return this.quantity;
    }

    @JvmName(name = "getRegionCode")
    @NotNull
    public final String getRegionCode() {
        return this.regionCode;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((this.kind.hashCode() * 31) + this.purchaseTimeMillis.hashCode()) * 31) + Integer.hashCode(this.purchaseState)) * 31) + Integer.hashCode(this.consumptionState)) * 31) + this.developerPayload.hashCode()) * 31) + this.orderId.hashCode()) * 31) + Integer.hashCode(this.purchaseType)) * 31) + Integer.hashCode(this.acknowledgementState)) * 31) + this.purchaseToken.hashCode()) * 31) + this.productId.hashCode()) * 31) + Integer.hashCode(this.quantity)) * 31) + this.obfuscatedExternalAccountId.hashCode()) * 31) + this.obfuscatedExternalProfileId.hashCode()) * 31) + this.regionCode.hashCode();
    }

    @NotNull
    public final String toString() {
        return "ProductPurchase(kind=" + this.kind + ", purchaseTimeMillis=" + this.purchaseTimeMillis + ", purchaseState=" + this.purchaseState + ", consumptionState=" + this.consumptionState + ", developerPayload=" + this.developerPayload + ", orderId=" + this.orderId + ", purchaseType=" + this.purchaseType + ", acknowledgementState=" + this.acknowledgementState + ", purchaseToken=" + this.purchaseToken + ", productId=" + this.productId + ", quantity=" + this.quantity + ", obfuscatedExternalAccountId=" + this.obfuscatedExternalAccountId + ", obfuscatedExternalProfileId=" + this.obfuscatedExternalProfileId + ", regionCode=" + this.regionCode + ")";
    }
}
