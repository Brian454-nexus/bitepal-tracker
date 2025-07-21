package com.appsflyer;

import Q4.e;
import com.appsflyer.internal.AFh1uSDK;
import com.appsflyer.internal.AFh1vSDK;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001;B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0007\u0010\u000bJ7\u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0012\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u0012\u0010\u0015J+\u0010\u0012\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0012\u0010\u0016J3\u0010\u0012\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0012\u0010\u0017J#\u0010\u0018\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u0018\u0010\u0015J+\u0010\u0018\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0019\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0018\u0010\u0016J\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001b\u0010\bJ\u001f\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u001b\u0010\u000bJ\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001c\u0010\bJ\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001e\u0010\bJ\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001f\u0010\bJ\u0017\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0004H\u0007¢\u0006\u0004\b!\u0010\bJ\u001f\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b!\u0010\u000bJ'\u0010%\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b%\u0010&JG\u0010)\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\r2\u0006\u0010(\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b)\u0010*J\u001f\u0010+\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0004H\u0016¢\u0006\u0004\b+\u0010,J'\u0010-\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b-\u0010&J!\u00100\u001a\u00020\u00062\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010.\"\u00020\u0001¢\u0006\u0004\b0\u00101J!\u00102\u001a\u00020\u00062\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010.\"\u00020\u0001¢\u0006\u0004\b2\u00101J'\u00103\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b3\u0010&J'\u00104\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b4\u0010&R\u0019\u00108\u001a\u0006*\u000205058BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b6\u00107R\u001b\u00106\u001a\b\u0012\u0004\u0012\u00020\u0001098BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b:\u00107"}, d2 = {"Lcom/appsflyer/AFLogger;", "Lcom/appsflyer/internal/AFh1uSDK;", "<init>", "()V", "", "debugLogMessage", "", "afDebugLog", "(Ljava/lang/String;)V", "", "shouldRemoteDebug", "(Ljava/lang/String;Z)V", "message", "", "ex", "printMessage", "printThrowable", "shouldReportToExManager", "afErrorLog", "(Ljava/lang/String;Ljava/lang/Throwable;ZZZ)V", "errorLogMessage", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "(Ljava/lang/String;Ljava/lang/Throwable;Z)V", "(Ljava/lang/String;Ljava/lang/Throwable;ZZ)V", "afErrorLogForExcManagerOnly", "disableReporting", "logMessage", "afInfoLog", "afLogForce", "rdLogMessage", "afRDLog", "afVerboseLog", "warningLogMessage", "afWarnLog", "Lcom/appsflyer/internal/AFh1vSDK;", "tag", "msg", "d", "(Lcom/appsflyer/internal/AFh1vSDK;Ljava/lang/String;Z)V", "throwable", "printMsg", e.f4542u, "(Lcom/appsflyer/internal/AFh1vSDK;Ljava/lang/String;Ljava/lang/Throwable;ZZZZ)V", "force", "(Lcom/appsflyer/internal/AFh1vSDK;Ljava/lang/String;)V", "i", "", "client", "registerClient", "([Lcom/appsflyer/internal/AFh1uSDK;)V", "unregisterClient", "v", "w", "Ljava/util/concurrent/ExecutorService;", "getCurrencyIso4217Code", "Lkotlin/Lazy;", "AFAdRevenueData", "", "getRevenue", "LogLevel"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAFLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AFLogger.kt\ncom/appsflyer/AFLogger\n+ 2 StringExtensions.kt\ncom/appsflyer/StringExtensionsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,283:1\n36#2:284\n36#2:285\n36#2:286\n36#2:287\n36#2:288\n1855#3,2:289\n*S KotlinDebug\n*F\n+ 1 AFLogger.kt\ncom/appsflyer/AFLogger\n*L\n182#1:284\n194#1:285\n213#1:286\n229#1:287\n248#1:288\n39#1:289,2\n*E\n"})
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFLogger extends AFh1uSDK {

    @NotNull
    public static final AFLogger INSTANCE = new AFLogger();

    /* renamed from: getRevenue, reason: from kotlin metadata */
    @NotNull
    private static final Lazy getCurrencyIso4217Code = LazyKt.lazy(AnonymousClass7.getMonetizationNetwork);

    /* renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
    @NotNull
    private static final Lazy AFAdRevenueData = LazyKt.lazy(AnonymousClass2.getRevenue);

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/appsflyer/internal/AFh1uSDK;", "p0", "", "getMediationNetwork", "(Lcom/appsflyer/internal/AFh1uSDK;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.AFLogger$1 */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<AFh1uSDK, Unit> {
        private /* synthetic */ String $getRevenue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str) {
            super(1);
            r2 = str;
        }

        public final void getMediationNetwork(@NotNull AFh1uSDK aFh1uSDK) {
            Intrinsics.checkNotNullParameter(aFh1uSDK, "");
            aFh1uSDK.force(AFh1vSDK.this, r2);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(AFh1uSDK aFh1uSDK) {
            getMediationNetwork(aFh1uSDK);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0006*\u00020\u00000\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/util/concurrent/ExecutorService;", "getMediationNetwork", "()Ljava/util/concurrent/ExecutorService;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.AFLogger$2 */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class AnonymousClass2 extends Lambda implements Function0<ExecutorService> {
        public static final AnonymousClass2 getRevenue = ;

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getMediationNetwork */
        public final ExecutorService invoke() {
            return Executors.newSingleThreadExecutor();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/appsflyer/internal/AFh1uSDK;", "p0", "", "AFAdRevenueData", "(Lcom/appsflyer/internal/AFh1uSDK;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.AFLogger$3 */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class AnonymousClass3 extends Lambda implements Function1<AFh1uSDK, Unit> {
        private /* synthetic */ boolean $AFAdRevenueData;
        private /* synthetic */ boolean $component3;
        private /* synthetic */ boolean $component4;
        private /* synthetic */ Throwable $getCurrencyIso4217Code;
        private /* synthetic */ boolean $getMonetizationNetwork;
        private /* synthetic */ String $getRevenue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str, Throwable th, boolean z6, boolean z7, boolean z8, boolean z9) {
            super(1);
            r2 = str;
            r3 = th;
            r4 = z6;
            r5 = z7;
            r6 = z8;
            r7 = z9;
        }

        public final void AFAdRevenueData(@NotNull AFh1uSDK aFh1uSDK) {
            Intrinsics.checkNotNullParameter(aFh1uSDK, "");
            aFh1uSDK.e(AFh1vSDK.this, r2, r3, r4, r5, r6, r7);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(AFh1uSDK aFh1uSDK) {
            AFAdRevenueData(aFh1uSDK);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/appsflyer/internal/AFh1uSDK;", "p0", "", "getCurrencyIso4217Code", "(Lcom/appsflyer/internal/AFh1uSDK;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.AFLogger$4 */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class AnonymousClass4 extends Lambda implements Function1<AFh1uSDK, Unit> {
        private /* synthetic */ boolean $AFAdRevenueData;
        private /* synthetic */ String $getMonetizationNetwork;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(String str, boolean z6) {
            super(1);
            r2 = str;
            r3 = z6;
        }

        public final void getCurrencyIso4217Code(@NotNull AFh1uSDK aFh1uSDK) {
            Intrinsics.checkNotNullParameter(aFh1uSDK, "");
            aFh1uSDK.i(AFh1vSDK.this, r2, r3);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(AFh1uSDK aFh1uSDK) {
            getCurrencyIso4217Code(aFh1uSDK);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/appsflyer/internal/AFh1uSDK;", "p0", "", "getMonetizationNetwork", "(Lcom/appsflyer/internal/AFh1uSDK;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.AFLogger$5 */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class AnonymousClass5 extends Lambda implements Function1<AFh1uSDK, Unit> {
        private /* synthetic */ String $AFAdRevenueData;
        private /* synthetic */ boolean $getMediationNetwork;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(String str, boolean z6) {
            super(1);
            r2 = str;
            r3 = z6;
        }

        public final void getMonetizationNetwork(@NotNull AFh1uSDK aFh1uSDK) {
            Intrinsics.checkNotNullParameter(aFh1uSDK, "");
            aFh1uSDK.d(AFh1vSDK.this, r2, r3);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(AFh1uSDK aFh1uSDK) {
            getMonetizationNetwork(aFh1uSDK);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/appsflyer/internal/AFh1uSDK;", "p0", "", "getRevenue", "(Lcom/appsflyer/internal/AFh1uSDK;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.AFLogger$6 */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class AnonymousClass6 extends Lambda implements Function1<AFh1uSDK, Unit> {
        private /* synthetic */ boolean $AFAdRevenueData;
        private /* synthetic */ String $getMediationNetwork;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(String str, boolean z6) {
            super(1);
            r2 = str;
            r3 = z6;
        }

        public final void getRevenue(@NotNull AFh1uSDK aFh1uSDK) {
            Intrinsics.checkNotNullParameter(aFh1uSDK, "");
            aFh1uSDK.v(AFh1vSDK.this, r2, r3);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(AFh1uSDK aFh1uSDK) {
            getRevenue(aFh1uSDK);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0002\u0010\u0003\u001a\u001a\u0012\b\u0012\u0006*\u00020\u00010\u0001*\f\u0012\b\u0012\u0006*\u00020\u00010\u00010\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Lcom/appsflyer/internal/AFh1uSDK;", "", "getCurrencyIso4217Code", "()Ljava/util/Set;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.AFLogger$7 */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class AnonymousClass7 extends Lambda implements Function0<Set<AFh1uSDK>> {
        public static final AnonymousClass7 getMonetizationNetwork = ;

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getCurrencyIso4217Code */
        public final Set<AFh1uSDK> invoke() {
            return Collections.synchronizedSet(new LinkedHashSet());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/appsflyer/internal/AFh1uSDK;", "p0", "", "getCurrencyIso4217Code", "(Lcom/appsflyer/internal/AFh1uSDK;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.AFLogger$9 */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class AnonymousClass9 extends Lambda implements Function1<AFh1uSDK, Unit> {
        private /* synthetic */ boolean $AFAdRevenueData;
        private /* synthetic */ String $getCurrencyIso4217Code;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(String str, boolean z6) {
            super(1);
            r2 = str;
            r3 = z6;
        }

        public final void getCurrencyIso4217Code(@NotNull AFh1uSDK aFh1uSDK) {
            Intrinsics.checkNotNullParameter(aFh1uSDK, "");
            aFh1uSDK.w(AFh1vSDK.this, r2, r3);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(AFh1uSDK aFh1uSDK) {
            getCurrencyIso4217Code(aFh1uSDK);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/appsflyer/AFLogger$LogLevel;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", "level", "I", "getLevel", "()I", "NONE", "ERROR", "WARNING", "INFO", "DEBUG", "VERBOSE"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public enum LogLevel {
        NONE(0),
        ERROR(1),
        WARNING(2),
        INFO(3),
        DEBUG(4),
        VERBOSE(5);

        private final int level;

        LogLevel(int i6) {
            this.level = i6;
        }

        @JvmName(name = "getLevel")
        public final int getLevel() {
            return this.level;
        }
    }

    private AFLogger() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.d()", imports = {}))
    @JvmStatic
    public static final void afDebugLog(@NotNull String debugLogMessage, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(debugLogMessage, "");
        INSTANCE.d(AFh1vSDK.OTHER, debugLogMessage, shouldRemoteDebug);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.e()", imports = {}))
    @JvmStatic
    public static final void afErrorLog(@NotNull String message, @NotNull Throwable ex, boolean printMessage, boolean printThrowable, boolean shouldReportToExManager) {
        Intrinsics.checkNotNullParameter(message, "");
        Intrinsics.checkNotNullParameter(ex, "");
        AFh1uSDK.e$default(INSTANCE, AFh1vSDK.OTHER, message, ex, printMessage, printThrowable, shouldReportToExManager, false, 64, null);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.e()", imports = {}))
    @JvmStatic
    public static final void afErrorLogForExcManagerOnly(@Nullable String errorLogMessage, @Nullable Throwable ex) {
        AFLogger aFLogger = INSTANCE;
        AFh1vSDK aFh1vSDK = AFh1vSDK.OTHER;
        if (errorLogMessage == null || StringsKt.isBlank(errorLogMessage)) {
            errorLogMessage = "null";
        }
        String str = errorLogMessage;
        if (ex == null) {
            ex = new NullPointerException("Invoked with null Throwable");
        }
        AFh1uSDK.e$default(aFLogger, aFh1vSDK, str, ex, false, false, true, false, 64, null);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.i()", imports = {}))
    @JvmStatic
    public static final void afInfoLog(@NotNull String logMessage, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(logMessage, "");
        INSTANCE.i(AFh1vSDK.OTHER, logMessage, shouldRemoteDebug);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.force()", imports = {}))
    @JvmStatic
    public static final void afLogForce(@NotNull String logMessage) {
        Intrinsics.checkNotNullParameter(logMessage, "");
        INSTANCE.force(AFh1vSDK.OTHER, logMessage);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.v()", imports = {}))
    @JvmStatic
    public static final void afRDLog(@NotNull String rdLogMessage) {
        Intrinsics.checkNotNullParameter(rdLogMessage, "");
        INSTANCE.v(AFh1vSDK.OTHER, rdLogMessage, true);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.v()", imports = {}))
    @JvmStatic
    public static final void afVerboseLog(@NotNull String rdLogMessage) {
        Intrinsics.checkNotNullParameter(rdLogMessage, "");
        INSTANCE.v(AFh1vSDK.OTHER, rdLogMessage, false);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.w()", imports = {}))
    @JvmStatic
    public static final void afWarnLog(@NotNull String warningLogMessage, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(warningLogMessage, "");
        INSTANCE.w(AFh1vSDK.OTHER, warningLogMessage, shouldRemoteDebug);
    }

    public static final void getCurrencyIso4217Code(AFh1uSDK[] aFh1uSDKArr) {
        Intrinsics.checkNotNullParameter(aFh1uSDKArr, "");
        Lazy lazy = getCurrencyIso4217Code;
        Object value = lazy.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        synchronized (((Set) value)) {
            Object value2 = lazy.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "");
            ((Set) value2).removeAll(ArraysKt.toSet(aFh1uSDKArr));
            Unit unit = Unit.INSTANCE;
        }
    }

    public static final void getMonetizationNetwork(AFh1uSDK[] aFh1uSDKArr) {
        Intrinsics.checkNotNullParameter(aFh1uSDKArr, "");
        Lazy lazy = getCurrencyIso4217Code;
        Object value = lazy.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        synchronized (((Set) value)) {
            Object value2 = lazy.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "");
            CollectionsKt.addAll((Set) value2, aFh1uSDKArr);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.appsflyer.internal.AFh1uSDK
    public final void d(@NotNull AFh1vSDK tag, @NotNull String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
        ((ExecutorService) AFAdRevenueData.getValue()).execute(new a(new Function1<AFh1uSDK, Unit>() { // from class: com.appsflyer.AFLogger.5
            private /* synthetic */ String $AFAdRevenueData;
            private /* synthetic */ boolean $getMediationNetwork;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass5(String msg2, boolean shouldRemoteDebug2) {
                super(1);
                r2 = msg2;
                r3 = shouldRemoteDebug2;
            }

            public final void getMonetizationNetwork(@NotNull AFh1uSDK aFh1uSDK) {
                Intrinsics.checkNotNullParameter(aFh1uSDK, "");
                aFh1uSDK.d(AFh1vSDK.this, r2, r3);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(AFh1uSDK aFh1uSDK) {
                getMonetizationNetwork(aFh1uSDK);
                return Unit.INSTANCE;
            }
        }));
    }

    @Override // com.appsflyer.internal.AFh1uSDK
    public final void e(@NotNull AFh1vSDK aFh1vSDK, @NotNull String str, @NotNull Throwable th, boolean z6, boolean z7, boolean z8, boolean z9) {
        Intrinsics.checkNotNullParameter(aFh1vSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        ((ExecutorService) AFAdRevenueData.getValue()).execute(new a(new Function1<AFh1uSDK, Unit>() { // from class: com.appsflyer.AFLogger.3
            private /* synthetic */ boolean $AFAdRevenueData;
            private /* synthetic */ boolean $component3;
            private /* synthetic */ boolean $component4;
            private /* synthetic */ Throwable $getCurrencyIso4217Code;
            private /* synthetic */ boolean $getMonetizationNetwork;
            private /* synthetic */ String $getRevenue;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(String str2, Throwable th2, boolean z62, boolean z72, boolean z82, boolean z92) {
                super(1);
                r2 = str2;
                r3 = th2;
                r4 = z62;
                r5 = z72;
                r6 = z82;
                r7 = z92;
            }

            public final void AFAdRevenueData(@NotNull AFh1uSDK aFh1uSDK) {
                Intrinsics.checkNotNullParameter(aFh1uSDK, "");
                aFh1uSDK.e(AFh1vSDK.this, r2, r3, r4, r5, r6, r7);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(AFh1uSDK aFh1uSDK) {
                AFAdRevenueData(aFh1uSDK);
                return Unit.INSTANCE;
            }
        }));
    }

    @Override // com.appsflyer.internal.AFh1uSDK
    public final void force(@NotNull AFh1vSDK tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
        ((ExecutorService) AFAdRevenueData.getValue()).execute(new a(new Function1<AFh1uSDK, Unit>() { // from class: com.appsflyer.AFLogger.1
            private /* synthetic */ String $getRevenue;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(String msg2) {
                super(1);
                r2 = msg2;
            }

            public final void getMediationNetwork(@NotNull AFh1uSDK aFh1uSDK) {
                Intrinsics.checkNotNullParameter(aFh1uSDK, "");
                aFh1uSDK.force(AFh1vSDK.this, r2);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(AFh1uSDK aFh1uSDK) {
                getMediationNetwork(aFh1uSDK);
                return Unit.INSTANCE;
            }
        }));
    }

    @Override // com.appsflyer.internal.AFh1uSDK
    public final void i(@NotNull AFh1vSDK tag, @NotNull String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
        ((ExecutorService) AFAdRevenueData.getValue()).execute(new a(new Function1<AFh1uSDK, Unit>() { // from class: com.appsflyer.AFLogger.4
            private /* synthetic */ boolean $AFAdRevenueData;
            private /* synthetic */ String $getMonetizationNetwork;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(String msg2, boolean shouldRemoteDebug2) {
                super(1);
                r2 = msg2;
                r3 = shouldRemoteDebug2;
            }

            public final void getCurrencyIso4217Code(@NotNull AFh1uSDK aFh1uSDK) {
                Intrinsics.checkNotNullParameter(aFh1uSDK, "");
                aFh1uSDK.i(AFh1vSDK.this, r2, r3);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(AFh1uSDK aFh1uSDK) {
                getCurrencyIso4217Code(aFh1uSDK);
                return Unit.INSTANCE;
            }
        }));
    }

    public final void registerClient(@NotNull final AFh1uSDK... client) {
        Intrinsics.checkNotNullParameter(client, "");
        ((ExecutorService) AFAdRevenueData.getValue()).execute(new Runnable() { // from class: com.appsflyer.c
            @Override // java.lang.Runnable
            public final void run() {
                AFLogger.getMonetizationNetwork(client);
            }
        });
    }

    public final void unregisterClient(@NotNull final AFh1uSDK... client) {
        Intrinsics.checkNotNullParameter(client, "");
        ((ExecutorService) AFAdRevenueData.getValue()).execute(new Runnable() { // from class: com.appsflyer.b
            @Override // java.lang.Runnable
            public final void run() {
                AFLogger.getCurrencyIso4217Code(client);
            }
        });
    }

    @Override // com.appsflyer.internal.AFh1uSDK
    public final void v(@NotNull AFh1vSDK tag, @NotNull String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
        ((ExecutorService) AFAdRevenueData.getValue()).execute(new a(new Function1<AFh1uSDK, Unit>() { // from class: com.appsflyer.AFLogger.6
            private /* synthetic */ boolean $AFAdRevenueData;
            private /* synthetic */ String $getMediationNetwork;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass6(String msg2, boolean shouldRemoteDebug2) {
                super(1);
                r2 = msg2;
                r3 = shouldRemoteDebug2;
            }

            public final void getRevenue(@NotNull AFh1uSDK aFh1uSDK) {
                Intrinsics.checkNotNullParameter(aFh1uSDK, "");
                aFh1uSDK.v(AFh1vSDK.this, r2, r3);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(AFh1uSDK aFh1uSDK) {
                getRevenue(aFh1uSDK);
                return Unit.INSTANCE;
            }
        }));
    }

    @Override // com.appsflyer.internal.AFh1uSDK
    public final void w(@NotNull AFh1vSDK tag, @NotNull String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
        ((ExecutorService) AFAdRevenueData.getValue()).execute(new a(new Function1<AFh1uSDK, Unit>() { // from class: com.appsflyer.AFLogger.9
            private /* synthetic */ boolean $AFAdRevenueData;
            private /* synthetic */ String $getCurrencyIso4217Code;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass9(String msg2, boolean shouldRemoteDebug2) {
                super(1);
                r2 = msg2;
                r3 = shouldRemoteDebug2;
            }

            public final void getCurrencyIso4217Code(@NotNull AFh1uSDK aFh1uSDK) {
                Intrinsics.checkNotNullParameter(aFh1uSDK, "");
                aFh1uSDK.w(AFh1vSDK.this, r2, r3);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(AFh1uSDK aFh1uSDK) {
                getCurrencyIso4217Code(aFh1uSDK);
                return Unit.INSTANCE;
            }
        }));
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.d()", imports = {}))
    @JvmStatic
    public static final void afDebugLog(@NotNull String debugLogMessage) {
        Intrinsics.checkNotNullParameter(debugLogMessage, "");
        INSTANCE.d(AFh1vSDK.OTHER, debugLogMessage, true);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.i()", imports = {}))
    @JvmStatic
    public static final void afInfoLog(@NotNull String logMessage) {
        Intrinsics.checkNotNullParameter(logMessage, "");
        INSTANCE.i(AFh1vSDK.OTHER, logMessage, true);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.w()", imports = {}))
    @JvmStatic
    public static final void afWarnLog(@NotNull String warningLogMessage) {
        Intrinsics.checkNotNullParameter(warningLogMessage, "");
        AFh1uSDK.w$default(INSTANCE, AFh1vSDK.OTHER, warningLogMessage, false, 4, null);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.e()", imports = {}))
    @JvmStatic
    public static final void afErrorLog(@Nullable String errorLogMessage, @Nullable Throwable ex) {
        AFLogger aFLogger = INSTANCE;
        AFh1vSDK aFh1vSDK = AFh1vSDK.OTHER;
        if (errorLogMessage == null || StringsKt.isBlank(errorLogMessage)) {
            errorLogMessage = "null";
        }
        String str = errorLogMessage;
        if (ex == null) {
            ex = new NullPointerException("Invoked with null Throwable");
        }
        AFh1uSDK.e$default(aFLogger, aFh1vSDK, str, ex, false, false, false, false, 120, null);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.e()", imports = {}))
    @JvmStatic
    public static final void afErrorLogForExcManagerOnly(@Nullable String errorLogMessage, @Nullable Throwable ex, boolean disableReporting) {
        AFLogger aFLogger = INSTANCE;
        AFh1vSDK aFh1vSDK = AFh1vSDK.OTHER;
        if (errorLogMessage == null || StringsKt.isBlank(errorLogMessage)) {
            errorLogMessage = "null";
        }
        String str = errorLogMessage;
        if (ex == null) {
            ex = new NullPointerException("Invoked with null Throwable");
        }
        AFh1uSDK.e$default(aFLogger, aFh1vSDK, str, ex, false, false, !disableReporting, false, 64, null);
    }

    public static final void getMonetizationNetwork(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        Lazy lazy = getCurrencyIso4217Code;
        Object value = lazy.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        synchronized (((Set) value)) {
            try {
                Object value2 = lazy.getValue();
                Intrinsics.checkNotNullExpressionValue(value2, "");
                Iterator it = ((Set) value2).iterator();
                while (it.hasNext()) {
                    function1.invoke((AFh1uSDK) it.next());
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.e()", imports = {}))
    @JvmStatic
    public static final void afErrorLog(@Nullable String errorLogMessage, @Nullable Throwable ex, boolean printThrowable) {
        AFLogger aFLogger = INSTANCE;
        AFh1vSDK aFh1vSDK = AFh1vSDK.OTHER;
        if (errorLogMessage == null || StringsKt.isBlank(errorLogMessage)) {
            errorLogMessage = "null";
        }
        String str = errorLogMessage;
        if (ex == null) {
            ex = new NullPointerException("Invoked with null Throwable");
        }
        AFh1uSDK.e$default(aFLogger, aFh1vSDK, str, ex, false, printThrowable, false, false, 104, null);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.e()", imports = {}))
    @JvmStatic
    public static final void afErrorLog(@Nullable String errorLogMessage, @Nullable Throwable ex, boolean printThrowable, boolean shouldReportToExManager) {
        AFLogger aFLogger = INSTANCE;
        AFh1vSDK aFh1vSDK = AFh1vSDK.OTHER;
        if (errorLogMessage == null || StringsKt.isBlank(errorLogMessage)) {
            errorLogMessage = "null";
        }
        String str = errorLogMessage;
        if (ex == null) {
            ex = new NullPointerException("Invoked with null Throwable");
        }
        AFh1uSDK.e$default(aFLogger, aFh1vSDK, str, ex, false, printThrowable, shouldReportToExManager, false, 72, null);
    }
}
