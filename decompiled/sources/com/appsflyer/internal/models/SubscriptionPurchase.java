package com.appsflyer.internal.models;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.io.ConstantsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b%\b\u0086\b\u0018\u0000 W2\u00020\u0001:\u0001WB\u0083\u0001\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0012HÇ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0015HÇ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÇ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0006HÇ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b%\u0010\u001aJ\u0010\u0010&\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b&\u0010\u001aJ\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÇ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÇ\u0003¢\u0006\u0004\b)\u0010\u001aJ\u0012\u0010*\u001a\u0004\u0018\u00010\u000eHÇ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b,\u0010\u001aJ¤\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÇ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00100\u001a\u00020/2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00103\u001a\u000202HÖ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b5\u0010\u001aR\u001a\u00106\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u0010\u001aR\u001c\u00109\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010\"R\u001c\u0010<\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010$R\u001a\u0010?\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b?\u00107\u001a\u0004\b@\u0010\u001aR\u001a\u0010A\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bA\u00107\u001a\u0004\bB\u0010\u001aR \u0010C\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010(R\u001c\u0010F\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bF\u00107\u001a\u0004\bG\u0010\u001aR\u001c\u0010H\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010+R\u001a\u0010K\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bK\u00107\u001a\u0004\bL\u0010\u001aR\u001a\u0010M\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bM\u00107\u001a\u0004\bN\u0010\u001aR\u001c\u0010O\u001a\u0004\u0018\u00010\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010\u001dR\u001a\u0010R\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bR\u00107\u001a\u0004\bS\u0010\u001aR\u001c\u0010T\u001a\u0004\u0018\u00010\u00158\u0007X\u0087\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010 "}, d2 = {"Lcom/appsflyer/internal/models/SubscriptionPurchase;", "", "", "p0", "Lcom/appsflyer/internal/models/CanceledStateContext;", "p1", "Lcom/appsflyer/internal/models/ExternalAccountIdentifiers;", "p2", "p3", "p4", "", "Lcom/appsflyer/internal/models/SubscriptionPurchaseLineItem;", "p5", "p6", "Lcom/appsflyer/internal/models/PausedStateContext;", "p7", "p8", "p9", "Lcom/appsflyer/internal/models/SubscribeWithGoogleInfo;", "p10", "p11", "Lcom/appsflyer/internal/models/TestPurchase;", "p12", "<init>", "(Ljava/lang/String;Lcom/appsflyer/internal/models/CanceledStateContext;Lcom/appsflyer/internal/models/ExternalAccountIdentifiers;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/appsflyer/internal/models/PausedStateContext;Ljava/lang/String;Ljava/lang/String;Lcom/appsflyer/internal/models/SubscribeWithGoogleInfo;Ljava/lang/String;Lcom/appsflyer/internal/models/TestPurchase;)V", "component1", "()Ljava/lang/String;", "component10", "component11", "()Lcom/appsflyer/internal/models/SubscribeWithGoogleInfo;", "component12", "component13", "()Lcom/appsflyer/internal/models/TestPurchase;", "component2", "()Lcom/appsflyer/internal/models/CanceledStateContext;", "component3", "()Lcom/appsflyer/internal/models/ExternalAccountIdentifiers;", "component4", "component5", "component6", "()Ljava/util/List;", "component7", "component8", "()Lcom/appsflyer/internal/models/PausedStateContext;", "component9", "copy", "(Ljava/lang/String;Lcom/appsflyer/internal/models/CanceledStateContext;Lcom/appsflyer/internal/models/ExternalAccountIdentifiers;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/appsflyer/internal/models/PausedStateContext;Ljava/lang/String;Ljava/lang/String;Lcom/appsflyer/internal/models/SubscribeWithGoogleInfo;Ljava/lang/String;Lcom/appsflyer/internal/models/TestPurchase;)Lcom/appsflyer/internal/models/SubscriptionPurchase;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "acknowledgementState", "Ljava/lang/String;", "getAcknowledgementState", "canceledStateContext", "Lcom/appsflyer/internal/models/CanceledStateContext;", "getCanceledStateContext", "externalAccountIdentifiers", "Lcom/appsflyer/internal/models/ExternalAccountIdentifiers;", "getExternalAccountIdentifiers", "kind", "getKind", "latestOrderId", "getLatestOrderId", "lineItems", "Ljava/util/List;", "getLineItems", "linkedPurchaseToken", "getLinkedPurchaseToken", "pausedStateContext", "Lcom/appsflyer/internal/models/PausedStateContext;", "getPausedStateContext", "regionCode", "getRegionCode", "startTime", "getStartTime", "subscribeWithGoogleInfo", "Lcom/appsflyer/internal/models/SubscribeWithGoogleInfo;", "getSubscribeWithGoogleInfo", "subscriptionState", "getSubscriptionState", "testPurchase", "Lcom/appsflyer/internal/models/TestPurchase;", "getTestPurchase", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final /* data */ class SubscriptionPurchase {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String acknowledgementState;

    @Nullable
    private final CanceledStateContext canceledStateContext;

    @Nullable
    private final ExternalAccountIdentifiers externalAccountIdentifiers;

    @NotNull
    private final String kind;

    @NotNull
    private final String latestOrderId;

    @NotNull
    private final List<SubscriptionPurchaseLineItem> lineItems;

    @Nullable
    private final String linkedPurchaseToken;

    @Nullable
    private final PausedStateContext pausedStateContext;

    @NotNull
    private final String regionCode;

    @NotNull
    private final String startTime;

    @Nullable
    private final SubscribeWithGoogleInfo subscribeWithGoogleInfo;

    @NotNull
    private final String subscriptionState;

    @Nullable
    private final TestPurchase testPurchase;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/appsflyer/internal/models/SubscriptionPurchase$Companion;", "Lcom/appsflyer/internal/models/Deserialize;", "Lcom/appsflyer/internal/models/SubscriptionPurchase;", "<init>", "()V", "Lorg/json/JSONObject;", "p0", "fromJson", "(Lorg/json/JSONObject;)Lcom/appsflyer/internal/models/SubscriptionPurchase;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSubscriptionPurchase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubscriptionPurchase.kt\ncom/appsflyer/internal/models/SubscriptionPurchase$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,381:1\n1549#2:382\n1620#2,3:383\n*S KotlinDebug\n*F\n+ 1 SubscriptionPurchase.kt\ncom/appsflyer/internal/models/SubscriptionPurchase$Companion\n*L\n28#1:382\n28#1:383,3\n*E\n"})
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class Companion implements Deserialize<SubscriptionPurchase> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char InAppPurchaseEvent = 46273;
        private static int PurchaseClient = 1;
        private static long getOneTimePurchaseOfferDetails = 566631410124197933L;
        private static char getPackageName = 6970;
        private static char getQuantity = 34449;
        private static int hashCode = 0;
        private static char toJsonMap = 22370;

        private Companion() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        
            r10 = r10;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(java.lang.String r10, int r11, java.lang.Object[] r12) {
            /*
                if (r10 == 0) goto Le
                char[] r10 = r10.toCharArray()
                int r0 = com.appsflyer.internal.models.SubscriptionPurchase.Companion.$10
                int r0 = r0 + 105
                int r0 = r0 % 128
                com.appsflyer.internal.models.SubscriptionPurchase.Companion.$11 = r0
            Le:
                char[] r10 = (char[]) r10
                com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1g r0 = new com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1g
                r0.<init>()
                r0.getPackageName = r11
                int r11 = r10.length
                long[] r1 = new long[r11]
                r2 = 0
                r0.InAppPurchaseEvent = r2
            L1d:
                int r3 = r0.InAppPurchaseEvent
                int r4 = r10.length
                if (r3 >= r4) goto L43
                int r4 = com.appsflyer.internal.models.SubscriptionPurchase.Companion.$10
                int r4 = r4 + 1
                int r4 = r4 % 128
                com.appsflyer.internal.models.SubscriptionPurchase.Companion.$11 = r4
                char r4 = r10[r3]
                long r4 = (long) r4
                long r6 = (long) r3
                int r8 = r0.getPackageName
                long r8 = (long) r8
                long r6 = r6 * r8
                long r4 = r4 ^ r6
                long r6 = com.appsflyer.internal.models.SubscriptionPurchase.Companion.getOneTimePurchaseOfferDetails
                r8 = 5319290379872349608(0x49d1ea6aed71ada8, double:4.091221287231824E47)
                long r6 = r6 ^ r8
                long r4 = r4 ^ r6
                r1[r3] = r4
                int r3 = r3 + 1
                r0.InAppPurchaseEvent = r3
                goto L1d
            L43:
                char[] r11 = new char[r11]
                r0.InAppPurchaseEvent = r2
            L47:
                int r3 = r0.InAppPurchaseEvent
                int r4 = r10.length
                if (r3 >= r4) goto L57
                r4 = r1[r3]
                int r4 = (int) r4
                char r4 = (char) r4
                r11[r3] = r4
                int r3 = r3 + 1
                r0.InAppPurchaseEvent = r3
                goto L47
            L57:
                java.lang.String r10 = new java.lang.String
                r10.<init>(r11)
                r12[r2] = r10
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.models.SubscriptionPurchase.Companion.a(java.lang.String, int, java.lang.Object[]):void");
        }

        private static void b(String str, int i6, Object[] objArr) {
            int i7 = $10 + 21;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                throw null;
            }
            char[] charArray = str != null ? str.toCharArray() : str;
            AFPurchaseConnectorA1f aFPurchaseConnectorA1f = new AFPurchaseConnectorA1f();
            char[] cArr = new char[charArray.length];
            aFPurchaseConnectorA1f.getQuantity = 0;
            char[] cArr2 = new char[2];
            while (true) {
                int i8 = aFPurchaseConnectorA1f.getQuantity;
                if (i8 >= charArray.length) {
                    objArr[0] = new String(cArr, 0, i6);
                    return;
                }
                cArr2[0] = charArray[i8];
                cArr2[1] = charArray[i8 + 1];
                int i9 = 58224;
                for (int i10 = 0; i10 < 16; i10++) {
                    $10 = ($11 + 87) % 128;
                    char c6 = cArr2[1];
                    char c7 = cArr2[0];
                    char c8 = (char) (c6 - (((c7 + i9) ^ ((c7 << 4) + ((char) (toJsonMap ^ (-177179452616573881L))))) ^ ((c7 >>> 5) + ((char) (getPackageName ^ (-177179452616573881L))))));
                    cArr2[1] = c8;
                    cArr2[0] = (char) (c7 - (((c8 >>> 5) + ((char) (InAppPurchaseEvent ^ (-177179452616573881L)))) ^ ((c8 + i9) ^ ((c8 << 4) + ((char) (getQuantity ^ (-177179452616573881L)))))));
                    i9 -= 40503;
                }
                int i11 = aFPurchaseConnectorA1f.getQuantity;
                cArr[i11] = cArr2[0];
                cArr[i11 + 1] = cArr2[1];
                aFPurchaseConnectorA1f.getQuantity = i11 + 2;
            }
        }

        @Override // com.appsflyer.internal.models.Deserialize
        public final /* bridge */ /* synthetic */ SubscriptionPurchase fromJson(JSONObject jSONObject) {
            hashCode = (PurchaseClient + 101) % 128;
            SubscriptionPurchase fromJson = fromJson(jSONObject);
            hashCode = (PurchaseClient + 85) % 128;
            return fromJson;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        @NotNull
        public final SubscriptionPurchase fromJson(@NotNull JSONObject p02) {
            List list;
            Object object;
            Object object2;
            Object nullable;
            Object object3;
            Object object4;
            Object object5;
            Intrinsics.checkNotNullParameter(p02, "");
            Object[] objArr = new Object[1];
            a("뷩\ude9d笉鞳〈䳄\ue946\u05ff꙾", View.getDefaultSize(0, 0) + 25457, objArr);
            JSONArray jSONArray = p02.getJSONArray(((String) objArr[0]).intern());
            Intrinsics.checkNotNullExpressionValue(jSONArray, "");
            list = SubscriptionPurchaseKt.toList(jSONArray);
            List list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                PurchaseClient = (hashCode + 85) % 128;
                arrayList.add(SubscriptionPurchaseLineItem.INSTANCE.fromJson((JSONObject) it.next()));
            }
            Object[] objArr2 = new Object[1];
            b("㩃ऋ틌ﷶꓦ\uf49b蛖ᚍಧᆧ১䚠㰟壀斑哱唩詎\ued0e\uf5d6", 20 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr2);
            String optString = p02.optString(((String) objArr2[0]).intern());
            Intrinsics.checkNotNullExpressionValue(optString, "");
            Object[] objArr3 = new Object[1];
            a("뷦恿\u06dd┷쮌\ue9ee豂닜儎瞂ᗪ㡘\udea4ﴙꎐ䇾摁ફ⤛콰", Color.blue(0) + 56731, objArr3);
            object = SubscriptionPurchaseKt.toObject(p02, ((String) objArr3[0]).intern(), CanceledStateContext.INSTANCE);
            CanceledStateContext canceledStateContext = (CanceledStateContext) object;
            Object[] objArr4 = new Object[1];
            a("뷠\uf7fe⧷揩闻쿤Ƕ민\ueddc⟽姸鏋엔翌뇛\uebe1᷑埓觝쏈痐꿜\ue1aeᮥ\u4dbf螽", 18947 - KeyEvent.getDeadChar(0, 0), objArr4);
            object2 = SubscriptionPurchaseKt.toObject(p02, ((String) objArr4[0]).intern(), ExternalAccountIdentifiers.INSTANCE);
            ExternalAccountIdentifiers externalAccountIdentifiers = (ExternalAccountIdentifiers) object2;
            Object[] objArr5 = new Object[1];
            b("㽐﨑翌\uf0d8", (ViewConfiguration.getWindowTouchSlop() >> 8) + 4, objArr5);
            String optString2 = p02.optString(((String) objArr5[0]).intern());
            Intrinsics.checkNotNullExpressionValue(optString2, "");
            Object[] objArr6 = new Object[1];
            b("癌\ue851\ued0e\uf5d6沙箧憅ᆯ备\ue05dڕ㧾猽杆", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 13, objArr6);
            String optString3 = p02.optString(((String) objArr6[0]).intern());
            Intrinsics.checkNotNullExpressionValue(optString3, "");
            Object[] objArr7 = new Object[1];
            b("ⶎ緟큄䷡춵蔐Û目ʯ\ufc7a3䋟矑䈥蚗柭뎊\uf029䰸剁", (ViewConfiguration.getScrollBarSize() >> 8) + 19, objArr7);
            nullable = SubscriptionPurchaseKt.getNullable(p02, ((String) objArr7[0]).intern());
            String str = (String) nullable;
            Object[] objArr8 = new Object[1];
            b("\uf41f鈶\uaa38텋춵蔐\u208f梠閮\ud8de攇狼ݑ謢\ued0e\uf5d6ဿ睥", View.resolveSizeAndState(0, 0, 0) + 18, objArr8);
            object3 = SubscriptionPurchaseKt.toObject(p02, ((String) objArr8[0]).intern(), PausedStateContext.INSTANCE);
            PausedStateContext pausedStateContext = (PausedStateContext) object3;
            Object[] objArr9 = new Object[1];
            a("뷷睛⢔\udddd霆䡌綤㛷\ue839鵳", 51898 - TextUtils.lastIndexOf("", '0', 0, 0), objArr9);
            String optString4 = p02.optString(((String) objArr9[0]).intern());
            Intrinsics.checkNotNullExpressionValue(optString4, "");
            Object[] objArr10 = new Object[1];
            a("뷶⡜难糰\ueb45冰㿢꩓ႈ", 38316 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr10);
            String optString5 = p02.optString(((String) objArr10[0]).intern());
            Intrinsics.checkNotNullExpressionValue(optString5, "");
            Object[] objArr11 = new Object[1];
            a("뷶僷柩竣৺᳔㏆웖험\ue8edﾪ銼ꆹ뒙䮈広涒\u009eឞ⩉㥧챰\ue370", 60679 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr11);
            object4 = SubscriptionPurchaseKt.toObject(p02, ((String) objArr11[0]).intern(), SubscribeWithGoogleInfo.INSTANCE);
            SubscribeWithGoogleInfo subscribeWithGoogleInfo = (SubscribeWithGoogleInfo) object4;
            Object[] objArr12 = new Object[1];
            b("\uebc9ｭ茇⿕雿⚫뷪昏\uddb4뗰ݑ謢\u208f梠閮\ud8de쮦\udcce", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 16, objArr12);
            String optString6 = p02.optString(((String) objArr12[0]).intern());
            Intrinsics.checkNotNullExpressionValue(optString6, "");
            Object[] objArr13 = new Object[1];
            a("뷱圅格絞ᙁ⮉㲩톥\ueac5￩鄄\uaa37", ExpandableListView.getPackedPositionChild(0L) + 60134, objArr13);
            object5 = SubscriptionPurchaseKt.toObject(p02, ((String) objArr13[0]).intern(), TestPurchase.INSTANCE);
            SubscriptionPurchase subscriptionPurchase = new SubscriptionPurchase(optString, canceledStateContext, externalAccountIdentifiers, optString2, optString3, arrayList, str, pausedStateContext, optString4, optString5, subscribeWithGoogleInfo, optString6, (TestPurchase) object5);
            int i6 = PurchaseClient + 61;
            hashCode = i6 % 128;
            if (i6 % 2 == 0) {
                return subscriptionPurchase;
            }
            throw null;
        }
    }

    public SubscriptionPurchase(@NotNull String str, @Nullable CanceledStateContext canceledStateContext, @Nullable ExternalAccountIdentifiers externalAccountIdentifiers, @NotNull String str2, @NotNull String str3, @NotNull List<SubscriptionPurchaseLineItem> list, @Nullable String str4, @Nullable PausedStateContext pausedStateContext, @NotNull String str5, @NotNull String str6, @Nullable SubscribeWithGoogleInfo subscribeWithGoogleInfo, @NotNull String str7, @Nullable TestPurchase testPurchase) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.acknowledgementState = str;
        this.canceledStateContext = canceledStateContext;
        this.externalAccountIdentifiers = externalAccountIdentifiers;
        this.kind = str2;
        this.latestOrderId = str3;
        this.lineItems = list;
        this.linkedPurchaseToken = str4;
        this.pausedStateContext = pausedStateContext;
        this.regionCode = str5;
        this.startTime = str6;
        this.subscribeWithGoogleInfo = subscribeWithGoogleInfo;
        this.subscriptionState = str7;
        this.testPurchase = testPurchase;
    }

    public static /* synthetic */ SubscriptionPurchase copy$default(SubscriptionPurchase subscriptionPurchase, String str, CanceledStateContext canceledStateContext, ExternalAccountIdentifiers externalAccountIdentifiers, String str2, String str3, List list, String str4, PausedStateContext pausedStateContext, String str5, String str6, SubscribeWithGoogleInfo subscribeWithGoogleInfo, String str7, TestPurchase testPurchase, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = subscriptionPurchase.acknowledgementState;
        }
        return subscriptionPurchase.copy(str, (i6 & 2) != 0 ? subscriptionPurchase.canceledStateContext : canceledStateContext, (i6 & 4) != 0 ? subscriptionPurchase.externalAccountIdentifiers : externalAccountIdentifiers, (i6 & 8) != 0 ? subscriptionPurchase.kind : str2, (i6 & 16) != 0 ? subscriptionPurchase.latestOrderId : str3, (i6 & 32) != 0 ? subscriptionPurchase.lineItems : list, (i6 & 64) != 0 ? subscriptionPurchase.linkedPurchaseToken : str4, (i6 & 128) != 0 ? subscriptionPurchase.pausedStateContext : pausedStateContext, (i6 & 256) != 0 ? subscriptionPurchase.regionCode : str5, (i6 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? subscriptionPurchase.startTime : str6, (i6 & 1024) != 0 ? subscriptionPurchase.subscribeWithGoogleInfo : subscribeWithGoogleInfo, (i6 & 2048) != 0 ? subscriptionPurchase.subscriptionState : str7, (i6 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? subscriptionPurchase.testPurchase : testPurchase);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getAcknowledgementState() {
        return this.acknowledgementState;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final String getStartTime() {
        return this.startTime;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final SubscribeWithGoogleInfo getSubscribeWithGoogleInfo() {
        return this.subscribeWithGoogleInfo;
    }

    @NotNull
    /* renamed from: component12, reason: from getter */
    public final String getSubscriptionState() {
        return this.subscriptionState;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final TestPurchase getTestPurchase() {
        return this.testPurchase;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final CanceledStateContext getCanceledStateContext() {
        return this.canceledStateContext;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final ExternalAccountIdentifiers getExternalAccountIdentifiers() {
        return this.externalAccountIdentifiers;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getKind() {
        return this.kind;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getLatestOrderId() {
        return this.latestOrderId;
    }

    @NotNull
    public final List<SubscriptionPurchaseLineItem> component6() {
        return this.lineItems;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getLinkedPurchaseToken() {
        return this.linkedPurchaseToken;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final PausedStateContext getPausedStateContext() {
        return this.pausedStateContext;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final String getRegionCode() {
        return this.regionCode;
    }

    @NotNull
    public final SubscriptionPurchase copy(@NotNull String p02, @Nullable CanceledStateContext p12, @Nullable ExternalAccountIdentifiers p22, @NotNull String p32, @NotNull String p42, @NotNull List<SubscriptionPurchaseLineItem> p52, @Nullable String p6, @Nullable PausedStateContext p7, @NotNull String p8, @NotNull String p9, @Nullable SubscribeWithGoogleInfo p10, @NotNull String p11, @Nullable TestPurchase p122) {
        Intrinsics.checkNotNullParameter(p02, "");
        Intrinsics.checkNotNullParameter(p32, "");
        Intrinsics.checkNotNullParameter(p42, "");
        Intrinsics.checkNotNullParameter(p52, "");
        Intrinsics.checkNotNullParameter(p8, "");
        Intrinsics.checkNotNullParameter(p9, "");
        Intrinsics.checkNotNullParameter(p11, "");
        return new SubscriptionPurchase(p02, p12, p22, p32, p42, p52, p6, p7, p8, p9, p10, p11, p122);
    }

    public final boolean equals(@Nullable Object p02) {
        if (this == p02) {
            return true;
        }
        if (!(p02 instanceof SubscriptionPurchase)) {
            return false;
        }
        SubscriptionPurchase subscriptionPurchase = (SubscriptionPurchase) p02;
        return Intrinsics.areEqual(this.acknowledgementState, subscriptionPurchase.acknowledgementState) && Intrinsics.areEqual(this.canceledStateContext, subscriptionPurchase.canceledStateContext) && Intrinsics.areEqual(this.externalAccountIdentifiers, subscriptionPurchase.externalAccountIdentifiers) && Intrinsics.areEqual(this.kind, subscriptionPurchase.kind) && Intrinsics.areEqual(this.latestOrderId, subscriptionPurchase.latestOrderId) && Intrinsics.areEqual(this.lineItems, subscriptionPurchase.lineItems) && Intrinsics.areEqual(this.linkedPurchaseToken, subscriptionPurchase.linkedPurchaseToken) && Intrinsics.areEqual(this.pausedStateContext, subscriptionPurchase.pausedStateContext) && Intrinsics.areEqual(this.regionCode, subscriptionPurchase.regionCode) && Intrinsics.areEqual(this.startTime, subscriptionPurchase.startTime) && Intrinsics.areEqual(this.subscribeWithGoogleInfo, subscriptionPurchase.subscribeWithGoogleInfo) && Intrinsics.areEqual(this.subscriptionState, subscriptionPurchase.subscriptionState) && Intrinsics.areEqual(this.testPurchase, subscriptionPurchase.testPurchase);
    }

    @JvmName(name = "getAcknowledgementState")
    @NotNull
    public final String getAcknowledgementState() {
        return this.acknowledgementState;
    }

    @JvmName(name = "getCanceledStateContext")
    @Nullable
    public final CanceledStateContext getCanceledStateContext() {
        return this.canceledStateContext;
    }

    @JvmName(name = "getExternalAccountIdentifiers")
    @Nullable
    public final ExternalAccountIdentifiers getExternalAccountIdentifiers() {
        return this.externalAccountIdentifiers;
    }

    @JvmName(name = "getKind")
    @NotNull
    public final String getKind() {
        return this.kind;
    }

    @JvmName(name = "getLatestOrderId")
    @NotNull
    public final String getLatestOrderId() {
        return this.latestOrderId;
    }

    @JvmName(name = "getLineItems")
    @NotNull
    public final List<SubscriptionPurchaseLineItem> getLineItems() {
        return this.lineItems;
    }

    @JvmName(name = "getLinkedPurchaseToken")
    @Nullable
    public final String getLinkedPurchaseToken() {
        return this.linkedPurchaseToken;
    }

    @JvmName(name = "getPausedStateContext")
    @Nullable
    public final PausedStateContext getPausedStateContext() {
        return this.pausedStateContext;
    }

    @JvmName(name = "getRegionCode")
    @NotNull
    public final String getRegionCode() {
        return this.regionCode;
    }

    @JvmName(name = "getStartTime")
    @NotNull
    public final String getStartTime() {
        return this.startTime;
    }

    @JvmName(name = "getSubscribeWithGoogleInfo")
    @Nullable
    public final SubscribeWithGoogleInfo getSubscribeWithGoogleInfo() {
        return this.subscribeWithGoogleInfo;
    }

    @JvmName(name = "getSubscriptionState")
    @NotNull
    public final String getSubscriptionState() {
        return this.subscriptionState;
    }

    @JvmName(name = "getTestPurchase")
    @Nullable
    public final TestPurchase getTestPurchase() {
        return this.testPurchase;
    }

    public final int hashCode() {
        int hashCode = this.acknowledgementState.hashCode() * 31;
        CanceledStateContext canceledStateContext = this.canceledStateContext;
        int hashCode2 = (hashCode + (canceledStateContext == null ? 0 : canceledStateContext.hashCode())) * 31;
        ExternalAccountIdentifiers externalAccountIdentifiers = this.externalAccountIdentifiers;
        int hashCode3 = (((((((hashCode2 + (externalAccountIdentifiers == null ? 0 : externalAccountIdentifiers.hashCode())) * 31) + this.kind.hashCode()) * 31) + this.latestOrderId.hashCode()) * 31) + this.lineItems.hashCode()) * 31;
        String str = this.linkedPurchaseToken;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        PausedStateContext pausedStateContext = this.pausedStateContext;
        int hashCode5 = (((((hashCode4 + (pausedStateContext == null ? 0 : pausedStateContext.hashCode())) * 31) + this.regionCode.hashCode()) * 31) + this.startTime.hashCode()) * 31;
        SubscribeWithGoogleInfo subscribeWithGoogleInfo = this.subscribeWithGoogleInfo;
        int hashCode6 = (((hashCode5 + (subscribeWithGoogleInfo == null ? 0 : subscribeWithGoogleInfo.hashCode())) * 31) + this.subscriptionState.hashCode()) * 31;
        TestPurchase testPurchase = this.testPurchase;
        return hashCode6 + (testPurchase != null ? testPurchase.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "SubscriptionPurchase(acknowledgementState=" + this.acknowledgementState + ", canceledStateContext=" + this.canceledStateContext + ", externalAccountIdentifiers=" + this.externalAccountIdentifiers + ", kind=" + this.kind + ", latestOrderId=" + this.latestOrderId + ", lineItems=" + this.lineItems + ", linkedPurchaseToken=" + this.linkedPurchaseToken + ", pausedStateContext=" + this.pausedStateContext + ", regionCode=" + this.regionCode + ", startTime=" + this.startTime + ", subscribeWithGoogleInfo=" + this.subscribeWithGoogleInfo + ", subscriptionState=" + this.subscriptionState + ", testPurchase=" + this.testPurchase + ")";
    }
}
