package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.ExceptionInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nExceptionManageCacheImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExceptionManageCacheImpl.kt\ncom/appsflyer/internal/components/monitorsdk/exmanager/ExceptionManageCacheImpl\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,130:1\n11653#2,9:131\n13579#2:140\n11653#2,9:141\n13579#2:150\n13580#2:152\n11662#2:153\n13580#2:155\n11662#2:156\n4117#2:158\n4217#2,2:159\n4117#2:165\n4217#2,2:166\n1#3:151\n1#3:154\n1#3:157\n1549#4:161\n1620#4,3:162\n1549#4:168\n1620#4,3:169\n*S KotlinDebug\n*F\n+ 1 ExceptionManageCacheImpl.kt\ncom/appsflyer/internal/components/monitorsdk/exmanager/ExceptionManageCacheImpl\n*L\n69#1:131,9\n69#1:140\n71#1:141,9\n71#1:150\n71#1:152\n71#1:153\n69#1:155\n69#1:156\n101#1:158\n101#1:159,2\n119#1:165\n119#1:166,2\n71#1:151\n69#1:154\n101#1:161\n101#1:162,3\n120#1:168\n120#1:169,3\n*E\n"})
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFd1jSDK implements AFd1hSDK {

    @NotNull
    private final AFd1nSDK AFAdRevenueData;

    public AFd1jSDK(@NotNull AFd1nSDK aFd1nSDK) {
        Intrinsics.checkNotNullParameter(aFd1nSDK, "");
        this.AFAdRevenueData = aFd1nSDK;
    }

    private final File getRevenue() {
        Context context = this.AFAdRevenueData.AFAdRevenueData;
        if (context == null) {
            return null;
        }
        File file = new File(context.getFilesDir(), "AFExceptionsCache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    @Override // com.appsflyer.internal.AFd1hSDK
    public final boolean AFAdRevenueData() {
        return getCurrencyIso4217Code(new String[0]);
    }

    @Override // com.appsflyer.internal.AFd1hSDK
    @Nullable
    public final String getCurrencyIso4217Code(@NotNull Throwable th, @NotNull String str) {
        String str2;
        File file;
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(str, "");
        synchronized (this) {
            File revenue = getRevenue();
            str2 = null;
            if (revenue != null) {
                file = new File(revenue, "6.15.2");
                if (!file.exists()) {
                    file.mkdirs();
                }
            } else {
                file = null;
            }
            if (file != null) {
                try {
                    ExceptionInfo monetizationNetwork = AFd1dSDK.getMonetizationNetwork(th, str);
                    String str3 = monetizationNetwork.hashName;
                    File file2 = new File(file, str3);
                    if (file2.exists()) {
                        ExceptionInfo.Companion companion = ExceptionInfo.INSTANCE;
                        ExceptionInfo mediationNetwork = ExceptionInfo.Companion.getMediationNetwork(FilesKt.readText$default(file2, null, 1, null));
                        if (mediationNetwork != null) {
                            mediationNetwork.counter++;
                            monetizationNetwork = mediationNetwork;
                        }
                    }
                    FilesKt.writeText$default(file2, monetizationNetwork.getMonetizationNetwork(), null, 2, null);
                    str2 = str3;
                } catch (Exception e6) {
                    AFh1uSDK.v$default(AFLogger.INSTANCE, AFh1vSDK.EXCEPTION_MANAGER, "Could not cache exception\n " + e6.getMessage(), false, 4, null);
                }
            }
        }
        return str2;
    }

    @Override // com.appsflyer.internal.AFd1hSDK
    public final int getMediationNetwork() {
        Iterator<T> it = getMonetizationNetwork().iterator();
        int i6 = 0;
        while (it.hasNext()) {
            i6 += ((ExceptionInfo) it.next()).counter;
        }
        return i6;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006c A[Catch: all -> 0x0070, TryCatch #0 {all -> 0x0070, blocks: (B:4:0x0002, B:6:0x0009, B:8:0x000f, B:10:0x0019, B:24:0x006c, B:26:0x0072, B:31:0x004a, B:33:0x0074, B:35:0x007a, B:12:0x001b, B:14:0x0021, B:16:0x002f, B:18:0x0042), top: B:3:0x0002, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072 A[SYNTHETIC] */
    @Override // com.appsflyer.internal.AFd1hSDK
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.appsflyer.internal.ExceptionInfo> getMonetizationNetwork() {
        /*
            r14 = this;
            r1 = 1
            monitor-enter(r14)
            java.io.File r0 = r14.getRevenue()     // Catch: java.lang.Throwable -> L70
            r2 = 0
            if (r0 == 0) goto L78
            java.io.File[] r3 = r0.listFiles()     // Catch: java.lang.Throwable -> L70
            if (r3 == 0) goto L78
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L70
            r4.<init>()     // Catch: java.lang.Throwable -> L70
            int r5 = r3.length     // Catch: java.lang.Throwable -> L70
            r6 = 0
            r7 = r6
        L17:
            if (r7 >= r5) goto L74
            r0 = r3[r7]     // Catch: java.lang.Throwable -> L70
            java.io.File[] r0 = r0.listFiles()     // Catch: java.lang.Throwable -> L46
            if (r0 == 0) goto L69
            java.lang.String r8 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r8)     // Catch: java.lang.Throwable -> L46
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L46
            r8.<init>()     // Catch: java.lang.Throwable -> L46
            int r9 = r0.length     // Catch: java.lang.Throwable -> L46
            r10 = r6
        L2d:
            if (r10 >= r9) goto L6a
            r11 = r0[r10]     // Catch: java.lang.Throwable -> L46
            com.appsflyer.internal.AFd1fSDK$AFa1zSDK r12 = com.appsflyer.internal.ExceptionInfo.INSTANCE     // Catch: java.lang.Throwable -> L46
            java.lang.String r12 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r12)     // Catch: java.lang.Throwable -> L46
            java.lang.String r11 = kotlin.io.FilesKt.readText$default(r11, r2, r1, r2)     // Catch: java.lang.Throwable -> L46
            com.appsflyer.internal.AFd1fSDK r11 = com.appsflyer.internal.ExceptionInfo.Companion.getMediationNetwork(r11)     // Catch: java.lang.Throwable -> L46
            if (r11 == 0) goto L48
            r8.add(r11)     // Catch: java.lang.Throwable -> L46
            goto L48
        L46:
            r0 = move-exception
            goto L4a
        L48:
            int r10 = r10 + r1
            goto L2d
        L4a:
            com.appsflyer.AFLogger r8 = com.appsflyer.AFLogger.INSTANCE     // Catch: java.lang.Throwable -> L70
            com.appsflyer.internal.AFh1vSDK r9 = com.appsflyer.internal.AFh1vSDK.EXCEPTION_MANAGER     // Catch: java.lang.Throwable -> L70
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L70
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L70
            r10.<init>()     // Catch: java.lang.Throwable -> L70
            java.lang.String r11 = "Could not get stored exceptions\n "
            r10.append(r11)     // Catch: java.lang.Throwable -> L70
            r10.append(r0)     // Catch: java.lang.Throwable -> L70
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L70
            r12 = 4
            r13 = 0
            r11 = 0
            com.appsflyer.internal.AFh1uSDK.v$default(r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L70
        L69:
            r8 = r2
        L6a:
            if (r8 == 0) goto L72
            r4.add(r8)     // Catch: java.lang.Throwable -> L70
            goto L72
        L70:
            r0 = move-exception
            goto L80
        L72:
            int r7 = r7 + r1
            goto L17
        L74:
            java.util.List r2 = kotlin.collections.CollectionsKt.flatten(r4)     // Catch: java.lang.Throwable -> L70
        L78:
            if (r2 != 0) goto L7e
            java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()     // Catch: java.lang.Throwable -> L70
        L7e:
            monitor-exit(r14)
            return r2
        L80:
            monitor-exit(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1jSDK.getMonetizationNetwork():java.util.List");
    }

    @Override // com.appsflyer.internal.AFd1hSDK
    public final void getMonetizationNetwork(int i6, int i7) {
        File[] listFiles;
        synchronized (this) {
            try {
                File revenue = getRevenue();
                if (revenue != null && (listFiles = revenue.listFiles()) != null) {
                    Intrinsics.checkNotNullExpressionValue(listFiles, "");
                    ArrayList<File> arrayList = new ArrayList();
                    for (File file : listFiles) {
                        String name = file.getName();
                        Intrinsics.checkNotNullExpressionValue(name, "");
                        int monetizationNetwork = AFc1vSDK.getMonetizationNetwork(name);
                        if (i6 > monetizationNetwork || monetizationNetwork > i7) {
                            arrayList.add(file);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                    for (File file2 : arrayList) {
                        Intrinsics.checkNotNullExpressionValue(file2, "");
                        arrayList2.add(Boolean.valueOf(FilesKt.deleteRecursively(file2)));
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.appsflyer.internal.AFd1hSDK
    public final boolean getCurrencyIso4217Code(@NotNull String... strArr) {
        boolean z6;
        Intrinsics.checkNotNullParameter(strArr, "");
        synchronized (this) {
            try {
                File revenue = getRevenue();
                z6 = true;
                if (revenue != null) {
                    if (strArr.length == 0) {
                        AFh1uSDK.v$default(AFLogger.INSTANCE, AFh1vSDK.EXCEPTION_MANAGER, "delete all exceptions", false, 4, null);
                        z6 = FilesKt.deleteRecursively(revenue);
                    } else {
                        AFh1uSDK.v$default(AFLogger.INSTANCE, AFh1vSDK.EXCEPTION_MANAGER, "delete all exceptions except for: " + ArraysKt.joinToString$default(strArr, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null), false, 4, null);
                        File[] listFiles = revenue.listFiles();
                        if (listFiles != null) {
                            Intrinsics.checkNotNullExpressionValue(listFiles, "");
                            ArrayList<File> arrayList = new ArrayList();
                            for (File file : listFiles) {
                                if (!ArraysKt.contains(strArr, file.getName())) {
                                    arrayList.add(file);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                            for (File file2 : arrayList) {
                                Intrinsics.checkNotNullExpressionValue(file2, "");
                                arrayList2.add(Boolean.valueOf(FilesKt.deleteRecursively(file2)));
                            }
                            Set set = CollectionsKt.toSet(arrayList2);
                            if (set.isEmpty()) {
                                set = SetsKt.setOf(Boolean.TRUE);
                            }
                            if (set.size() != 1 || !((Boolean) CollectionsKt.first(set)).booleanValue()) {
                                z6 = false;
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z6;
    }
}
