package com.appsflyer.internal.connector.purcahse;

import L3.InterfaceC0544s;
import android.graphics.ImageFormat;
import android.os.Process;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.d;
import com.android.billingclient.api.f;
import com.appsflyer.AFLogger;
import com.appsflyer.api.InAppPurchaseEvent;
import com.appsflyer.api.Store;
import com.appsflyer.api.SubscriptionPurchaseEvent;
import com.appsflyer.api.models.OneTimePurchaseOfferDetails;
import com.appsflyer.api.models.PricingPhases;
import com.appsflyer.api.models.SubscriptionOfferDetails;
import com.appsflyer.exceptions.WrongProductTypeException;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1r;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\b\u0002\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\u000f*\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J5\u0010\u0012\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\u000f0\u000f2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J5\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00062\u001e\u0010\u0003\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\u000f0\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J5\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00160\u00062\u001e\u0010\u0003\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\u000f0\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0015J%\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00172\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001cR\u001e\u0010\u001f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0012\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010 R\u0018\u0010$\u001a\u00020\"*\u00020!8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010#R\u0018\u0010\u0010\u001a\u00020&*\u00020%8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010'R\u0018\u0010+\u001a\u00020)*\u00020(8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010*"}, d2 = {"Lcom/appsflyer/internal/connector/purcahse/AFPurchaseConnectorA1n;", "LL3/s;", "", "p0", "Lcom/appsflyer/internal/connector/purcahse/AFPurchaseConnectorA1r$AFPurchaseConnectorA1x;", "p1", "", "Lcom/android/billingclient/api/Purchase;", "p2", "", "p3", "<init>", "(Ljava/lang/String;Lcom/appsflyer/internal/connector/purcahse/AFPurchaseConnectorA1r$AFPurchaseConnectorA1x;Ljava/util/List;Z)V", "", "Lcom/android/billingclient/api/f;", "", "InAppPurchaseEvent", "(Ljava/util/List;)Ljava/util/Map;", "getOneTimePurchaseOfferDetails", "Lcom/appsflyer/api/SubscriptionPurchaseEvent;", "toJsonMap", "(Ljava/util/Map;)Ljava/util/List;", "Lcom/appsflyer/api/InAppPurchaseEvent;", "Lcom/android/billingclient/api/d;", "", "onProductDetailsResponse", "(Lcom/android/billingclient/api/d;Ljava/util/List;)V", "Ljava/lang/String;", "Lcom/appsflyer/internal/connector/purcahse/AFPurchaseConnectorA1r$AFPurchaseConnectorA1x;", "getQuantity", "Ljava/util/List;", "getPackageName", "Z", "Lcom/android/billingclient/api/f$e;", "Lcom/appsflyer/api/models/SubscriptionOfferDetails;", "(Lcom/android/billingclient/api/f$e;)Lcom/appsflyer/api/models/SubscriptionOfferDetails;", "hashCode", "Lcom/android/billingclient/api/f$b;", "Lcom/appsflyer/api/models/OneTimePurchaseOfferDetails;", "(Lcom/android/billingclient/api/f$b;)Lcom/appsflyer/api/models/OneTimePurchaseOfferDetails;", "Lcom/android/billingclient/api/f$c;", "Lcom/appsflyer/api/models/PricingPhases;", "(Lcom/android/billingclient/api/f$c;)Lcom/appsflyer/api/models/PricingPhases;", "startObservingTransactions"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBillingLibraryAsyncListenersImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BillingLibraryAsyncListenersImpl.kt\ncom/appsflyer/internal/connectors/callbacks/BillingLibraryAsyncListenersImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,163:1\n1855#2,2:164\n1855#2:166\n1855#2,2:167\n1856#2:169\n1179#2,2:173\n1253#2,2:175\n1549#2:177\n1620#2,3:178\n1256#2:181\n1179#2,2:186\n1253#2,4:188\n1549#2:193\n1620#2,3:194\n125#3:170\n152#3,2:171\n154#3:182\n125#3:183\n152#3,2:184\n154#3:192\n*S KotlinDebug\n*F\n+ 1 BillingLibraryAsyncListenersImpl.kt\ncom/appsflyer/internal/connectors/callbacks/BillingLibraryAsyncListenersImpl\n*L\n65#1:164,2\n88#1:166\n89#1:167,2\n88#1:169\n111#1:173,2\n111#1:175,2\n112#1:177\n112#1:178,3\n111#1:181\n130#1:186,2\n130#1:188,4\n146#1:193\n146#1:194,3\n109#1:170\n109#1:171,2\n109#1:182\n127#1:183\n127#1:184,2\n127#1:192\n*E\n"})
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFPurchaseConnectorA1n implements InterfaceC0544s {

    /* renamed from: InAppPurchaseEvent, reason: from kotlin metadata */
    @NotNull
    private final AFPurchaseConnectorA1r.AFPurchaseConnectorA1x getQuantity;
    private final boolean getOneTimePurchaseOfferDetails;

    /* renamed from: getQuantity, reason: from kotlin metadata */
    @Nullable
    private final List<Purchase> getPackageName;

    @NotNull
    private final String toJsonMap;

    /* JADX WARN: Multi-variable type inference failed */
    public AFPurchaseConnectorA1n(@NotNull String str, @NotNull AFPurchaseConnectorA1r.AFPurchaseConnectorA1x aFPurchaseConnectorA1x, @Nullable List<? extends Purchase> list, boolean z6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(aFPurchaseConnectorA1x, "");
        this.toJsonMap = str;
        this.getQuantity = aFPurchaseConnectorA1x;
        this.getPackageName = list;
        this.getOneTimePurchaseOfferDetails = z6;
    }

    private final Map<String, f> InAppPurchaseEvent(List<f> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (f fVar : list) {
            if (Intrinsics.areEqual(fVar.e(), this.toJsonMap)) {
                String d6 = fVar.d();
                Intrinsics.checkNotNullExpressionValue(d6, "");
                linkedHashMap.put(d6, fVar);
            } else {
                String str = "[PurchaseConnector]: expected Product type of " + this.toJsonMap + ", but received " + fVar.e();
                AFLogger.afErrorLog(str, new WrongProductTypeException(str));
            }
        }
        return linkedHashMap;
    }

    private final Map<Purchase, Map<String, f>> getOneTimePurchaseOfferDetails(List<f> p02) {
        List<String> g6;
        Map<String, f> InAppPurchaseEvent = InAppPurchaseEvent(p02);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<Purchase> list = this.getPackageName;
        if (list != null) {
            for (Purchase purchase : list) {
                if (purchase != null && (g6 = purchase.g()) != null) {
                    Intrinsics.checkNotNullExpressionValue(g6, "");
                    for (String str : g6) {
                        if (InAppPurchaseEvent.containsKey(str)) {
                            if (linkedHashMap.containsKey(purchase)) {
                                Object obj = linkedHashMap.get(purchase);
                                Intrinsics.checkNotNull(obj);
                                Intrinsics.checkNotNullExpressionValue(str, "");
                                f fVar = InAppPurchaseEvent.get(str);
                                Intrinsics.checkNotNull(fVar);
                                ((Map) obj).put(str, fVar);
                            } else {
                                f fVar2 = InAppPurchaseEvent.get(str);
                                Intrinsics.checkNotNull(fVar2);
                                linkedHashMap.put(purchase, MapsKt.mutableMapOf(new Pair[]{TuplesKt.to(str, fVar2)}));
                            }
                        }
                    }
                }
            }
        }
        return linkedHashMap;
    }

    @JvmName(name = "getPackageName")
    private final SubscriptionOfferDetails getPackageName(f.e eVar) {
        String a6 = eVar.a();
        Intrinsics.checkNotNullExpressionValue(a6, "");
        String c6 = eVar.c();
        List d6 = eVar.d();
        Intrinsics.checkNotNullExpressionValue(d6, "");
        String e6 = eVar.e();
        Intrinsics.checkNotNullExpressionValue(e6, "");
        List a7 = eVar.f().a();
        Intrinsics.checkNotNullExpressionValue(a7, "");
        List<f.c> list = a7;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (f.c cVar : list) {
            Intrinsics.checkNotNullExpressionValue(cVar, "");
            arrayList.add(toJsonMap(cVar));
        }
        return new SubscriptionOfferDetails(a6, c6, d6, e6, arrayList);
    }

    @JvmName(name = "toJsonMap")
    private final OneTimePurchaseOfferDetails toJsonMap(f.b bVar) {
        String a6 = bVar.a();
        Intrinsics.checkNotNullExpressionValue(a6, "");
        long b6 = bVar.b();
        String c6 = bVar.c();
        Intrinsics.checkNotNullExpressionValue(c6, "");
        return new OneTimePurchaseOfferDetails(a6, b6, c6);
    }

    @Override // L3.InterfaceC0544s
    public final void onProductDetailsResponse(@NotNull d p02, @NotNull List<f> p12) {
        Intrinsics.checkNotNullParameter(p02, "");
        Intrinsics.checkNotNullParameter(p12, "");
        try {
            if (p02.b() == 0 && !p12.isEmpty()) {
                AFLogger.afDebugLog("[PurchaseConnector]: Received the following Product details:\n\ttype: " + this.toJsonMap + "\n\tProduct Ids: " + CollectionsKt.joinToString$default(p12, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1<f, CharSequence>() { // from class: com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1n.2
                    @Override // kotlin.jvm.functions.Function1
                    @NotNull
                    /* renamed from: InAppPurchaseEvent, reason: merged with bridge method [inline-methods] */
                    public final CharSequence invoke(@NotNull f fVar) {
                        Intrinsics.checkNotNullParameter(fVar, "");
                        String d6 = fVar.d();
                        Intrinsics.checkNotNullExpressionValue(d6, "");
                        return d6;
                    }
                }, 30, (Object) null));
                Map<Purchase, Map<String, f>> oneTimePurchaseOfferDetails = getOneTimePurchaseOfferDetails(p12);
                if (oneTimePurchaseOfferDetails.isEmpty()) {
                    return;
                }
                if (!Intrinsics.areEqual("subs", this.toJsonMap)) {
                    this.getQuantity.toJsonMap(InAppPurchaseEvent(oneTimePurchaseOfferDetails));
                    return;
                }
                List<SubscriptionPurchaseEvent> jsonMap = toJsonMap(oneTimePurchaseOfferDetails);
                if (this.getOneTimePurchaseOfferDetails) {
                    this.getQuantity.getOneTimePurchaseOfferDetails(jsonMap);
                } else {
                    this.getQuantity.getQuantity(jsonMap);
                }
            }
        } catch (Throwable th) {
            try {
                Object[] objArr = {th};
                Map map = AFPurchaseConnectorA1w.PurchaseClientCompanion;
                Object obj = map.get(-1174844903);
                if (obj == null) {
                    obj = ((Class) AFPurchaseConnectorA1w.getQuantity(70 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (Process.myPid() >> 22) + 70, (char) (ImageFormat.getBitsPerPixel(0) + 1))).getMethod("getQuantity", Throwable.class);
                    map.put(-1174844903, obj);
                }
                ((Method) obj).invoke(null, objArr);
                Object[] objArr2 = {th};
                Object obj2 = map.get(595644357);
                if (obj2 == null) {
                    obj2 = ((Class) AFPurchaseConnectorA1w.getQuantity((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 69, 69 - MotionEvent.axisFromString(""), (char) ((Process.getThreadPriority(0) + 20) >> 6))).getMethod("getPackageName", Throwable.class);
                    map.put(595644357, obj2);
                }
                ((Method) obj2).invoke(null, objArr2);
                AFLogger.afErrorLog("[PurchaseConnector]: Failed to log new purchase", th, true);
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
    }

    public /* synthetic */ AFPurchaseConnectorA1n(String str, AFPurchaseConnectorA1r.AFPurchaseConnectorA1x aFPurchaseConnectorA1x, List list, boolean z6, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, aFPurchaseConnectorA1x, (i6 & 4) != 0 ? null : list, (i6 & 8) != 0 ? false : z6);
    }

    @JvmName(name = "toJsonMap")
    private final PricingPhases toJsonMap(f.c cVar) {
        int a6 = cVar.a();
        String b6 = cVar.b();
        Intrinsics.checkNotNullExpressionValue(b6, "");
        String c6 = cVar.c();
        Intrinsics.checkNotNullExpressionValue(c6, "");
        long d6 = cVar.d();
        String e6 = cVar.e();
        Intrinsics.checkNotNullExpressionValue(e6, "");
        return new PricingPhases(a6, b6, c6, d6, e6, cVar.f());
    }

    private final List<InAppPurchaseEvent> InAppPurchaseEvent(Map<Purchase, ? extends Map<String, f>> p02) {
        OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails;
        ArrayList arrayList = new ArrayList(p02.size());
        for (Map.Entry<Purchase, ? extends Map<String, f>> entry : p02.entrySet()) {
            Purchase key = entry.getKey();
            key.i();
            Set<Map.Entry<String, f>> entrySet = entry.getValue().entrySet();
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(entrySet, 10)), 16));
            Iterator<T> it = entrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it.next();
                Object key2 = entry2.getKey();
                f.b c6 = ((f) entry2.getValue()).c();
                if (c6 != null) {
                    Intrinsics.checkNotNullExpressionValue(c6, "");
                    oneTimePurchaseOfferDetails = toJsonMap(c6);
                } else {
                    oneTimePurchaseOfferDetails = null;
                }
                Pair pair = TuplesKt.to(key2, oneTimePurchaseOfferDetails);
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
            List g6 = key.g();
            Intrinsics.checkNotNullExpressionValue(g6, "");
            String j6 = key.j();
            Intrinsics.checkNotNullExpressionValue(j6, "");
            Store store = Store.GOOGLE;
            long i6 = key.i();
            String e6 = key.e();
            Intrinsics.checkNotNullExpressionValue(e6, "");
            arrayList.add(new InAppPurchaseEvent(g6, j6, store, i6, e6, key.k(), linkedHashMap));
        }
        return arrayList;
    }

    private final List<SubscriptionPurchaseEvent> toJsonMap(Map<Purchase, ? extends Map<String, f>> p02) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList(p02.size());
        for (Map.Entry<Purchase, ? extends Map<String, f>> entry : p02.entrySet()) {
            Purchase key = entry.getKey();
            Set<Map.Entry<String, f>> entrySet = entry.getValue().entrySet();
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(entrySet, 10)), 16));
            Iterator<T> it = entrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it.next();
                Object key2 = entry2.getKey();
                List f6 = ((f) entry2.getValue()).f();
                if (f6 != null) {
                    Intrinsics.checkNotNullExpressionValue(f6, "");
                    List<f.e> list = f6;
                    arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    for (f.e eVar : list) {
                        Intrinsics.checkNotNullExpressionValue(eVar, "");
                        arrayList.add(getPackageName(eVar));
                    }
                } else {
                    arrayList = null;
                }
                Pair pair = TuplesKt.to(key2, arrayList);
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
            List g6 = key.g();
            Intrinsics.checkNotNullExpressionValue(g6, "");
            String j6 = key.j();
            Intrinsics.checkNotNullExpressionValue(j6, "");
            arrayList2.add(new SubscriptionPurchaseEvent(g6, j6, Store.GOOGLE, key.i(), linkedHashMap));
        }
        return arrayList2;
    }
}
