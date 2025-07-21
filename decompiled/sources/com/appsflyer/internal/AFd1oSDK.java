package com.appsflyer.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Process;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import java.lang.reflect.Constructor;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFd1oSDK implements AFd1kSDK {
    private static final int getMonetizationNetwork = (int) TimeUnit.SECONDS.toMillis(30);
    private ExecutorService AFAdRevenueData;
    private AFb1uSDK AFInAppEventParameterName;
    private AFd1iSDK AFInAppEventType;
    private AFe1iSDK AFKeystoreWrapper;
    private AFc1kSDK AFLogger;
    private AFg1tSDK afDebugLog;
    private AFg1gSDK afErrorLog;
    private AFc1fSDK afInfoLog;
    private AFi1jSDK afVerboseLog;
    private AFg1rSDK afWarnLog;
    private AFd1qSDK areAllFieldsValid;
    private AFf1aSDK component1;
    private AFd1sSDK component2;
    private PurchaseHandler component3;
    private AFe1wSDK component4;
    private AFj1oSDK copy;
    private AFg1kSDK copydefault;

    /* renamed from: d, reason: collision with root package name */
    private AFd1vSDK f11999d;

    /* renamed from: e, reason: collision with root package name */
    private AFd1wSDK f12000e;
    private AFe1aSDK equals;
    private AFc1hSDK force;
    private AFd1tSDK getLevel;
    private ExecutorService getMediationNetwork;
    private ScheduledExecutorService getRevenue;
    private AFb1cSDK hashCode;

    /* renamed from: i, reason: collision with root package name */
    private AFi1mSDK f12001i;
    private AFi1qSDK registerClient;
    private AFh1oSDK toString;
    private AFi1oSDK unregisterClient;

    /* renamed from: v, reason: collision with root package name */
    private AFa1aSDK f12002v;
    private AFj1uSDK valueOf;
    private AFg1wSDK values;

    /* renamed from: w, reason: collision with root package name */
    private AFh1xSDK f12003w;
    private String afRDLog = null;
    public final AFd1nSDK getCurrencyIso4217Code = new AFd1nSDK();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class AFa1tSDK implements ThreadFactory {
        private static final AtomicInteger getCurrencyIso4217Code = new AtomicInteger();
        private final AtomicInteger getMediationNetwork = new AtomicInteger();

        public AFa1tSDK() {
            getCurrencyIso4217Code.incrementAndGet();
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            int i6 = getCurrencyIso4217Code.get();
            int incrementAndGet = this.getMediationNetwork.incrementAndGet();
            StringBuilder sb = new StringBuilder("queue-");
            sb.append(i6);
            sb.append("-");
            sb.append(incrementAndGet);
            return new Thread(runnable, sb.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.appsflyer.internal.AFd1kSDK
    @NonNull
    /* renamed from: afErrorLogForExcManagerOnly, reason: merged with bridge method [inline-methods] */
    public synchronized AFd1iSDK afErrorLog() {
        try {
            if (this.AFInAppEventType == null) {
                this.AFInAppEventType = new AFd1iSDK(this);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.AFInAppEventType;
    }

    @NonNull
    private String afRDLog() {
        if (this.afRDLog == null) {
            this.afRDLog = new AFb1aSDK().getMediationNetwork();
        }
        return this.afRDLog;
    }

    @NonNull
    private synchronized AFe1wSDK afVerboseLog() {
        try {
            if (this.component4 == null) {
                this.component4 = new AFe1wSDK(new AFe1lSDK(getMonetizationNetwork), getMonetizationNetwork());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.component4;
    }

    @NonNull
    private synchronized ExecutorService afWarnLog() {
        try {
            if (this.getMediationNetwork == null) {
                ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
                Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "");
                this.getMediationNetwork = newSingleThreadExecutor;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.getMediationNetwork;
    }

    @NonNull
    private synchronized AFg1rSDK getLevel() {
        try {
            if (this.afWarnLog == null) {
                this.afWarnLog = new AFg1rSDK(values(), getMediationNetwork());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.afWarnLog;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ SharedPreferences u_() {
        Context context = this.getCurrencyIso4217Code.AFAdRevenueData;
        if (context != null) {
            return AFb1rSDK.h_(context);
        }
        throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    @NonNull
    public final synchronized ScheduledExecutorService AFAdRevenueData() {
        try {
            if (this.getRevenue == null) {
                ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(2);
                Intrinsics.checkNotNullExpressionValue(newScheduledThreadPool, "");
                this.getRevenue = newScheduledThreadPool;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.getRevenue;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    @NonNull
    public final AFi1oSDK AFInAppEventParameterName() {
        if (this.unregisterClient == null) {
            this.unregisterClient = new AFi1fSDK();
        }
        return this.unregisterClient;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    @NonNull
    public final synchronized AFe1iSDK AFInAppEventType() {
        try {
            if (this.AFKeystoreWrapper == null) {
                this.AFKeystoreWrapper = new AFe1iSDK(getMediationNetwork(), getRevenue());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.AFKeystoreWrapper;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    @NonNull
    public final synchronized AFg1wSDK AFKeystoreWrapper() {
        try {
            if (this.values == null) {
                this.values = new AFg1wSDK(values(), new AFg1uSDK());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.values;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    @NonNull
    public final AFi1mSDK AFLogger() {
        if (this.f12001i == null) {
            this.f12001i = new AFi1kSDK();
        }
        return this.f12001i;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    @NonNull
    public final AFg1gSDK afDebugLog() {
        if (this.afErrorLog == null) {
            this.afErrorLog = new AFg1fSDK(new AFg1eSDK(getRevenue()));
        }
        return this.afErrorLog;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    @NonNull
    public final AFc1hSDK afInfoLog() {
        if (this.force == null) {
            this.force = new AFc1iSDK(getRevenue());
        }
        return this.force;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    @NonNull
    public final synchronized PurchaseHandler areAllFieldsValid() {
        try {
            if (this.component3 == null) {
                this.component3 = new PurchaseHandler(this);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.component3;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    @NonNull
    public final AFg1kSDK component1() {
        if (this.copydefault == null) {
            String afRDLog = afRDLog();
            Context context = this.getCurrencyIso4217Code.AFAdRevenueData;
            if (context == null) {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
            if (this.unregisterClient == null) {
                this.unregisterClient = new AFi1fSDK();
            }
            AFi1oSDK aFi1oSDK = this.unregisterClient;
            if (this.f11999d == null) {
                this.f11999d = new com.appsflyer.internal.AFa1tSDK();
            }
            AFd1vSDK aFd1vSDK = this.f11999d;
            if (this.copy == null) {
                Context context2 = this.getCurrencyIso4217Code.AFAdRevenueData;
                if (context2 == null) {
                    throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
                }
                this.copy = new AFj1mSDK(context2, afWarnLog());
            }
            AFj1oSDK aFj1oSDK = this.copy;
            if (this.f12002v == null) {
                this.f12002v = new AFb1ySDK();
            }
            AFa1aSDK aFa1aSDK = this.f12002v;
            AFh1oSDK component3 = component3();
            AFd1rSDK revenue = getRevenue();
            AFd1qSDK mediationNetwork = getMediationNetwork();
            if (this.registerClient == null) {
                Context context3 = this.getCurrencyIso4217Code.AFAdRevenueData;
                if (context3 == null) {
                    throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
                }
                this.registerClient = new AFi1qSDK(context3);
            }
            AFi1qSDK aFi1qSDK = this.registerClient;
            AFg1wSDK AFKeystoreWrapper = AFKeystoreWrapper();
            AFd1nSDK values = values();
            AFg1rSDK level = getLevel();
            if (this.getLevel == null) {
                this.getLevel = new AFd1tSDK();
            }
            this.copydefault = new AFg1iSDK(afRDLog, context, aFi1oSDK, aFd1vSDK, aFj1oSDK, aFa1aSDK, component3, revenue, mediationNetwork, aFi1qSDK, AFKeystoreWrapper, values, level, this.getLevel);
        }
        return this.copydefault;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    @NonNull
    public final synchronized AFf1aSDK component2() {
        try {
            if (this.component1 == null) {
                AFg1vSDK aFg1vSDK = new AFg1vSDK(getRevenue());
                this.component1 = new AFf1aSDK(new AFg1ySDK(), getMediationNetwork(), AFKeystoreWrapper(), aFg1vSDK, new AFe1qSDK(afVerboseLog(), getMediationNetwork(), AppsFlyerProperties.getInstance(), AFInAppEventType()), new AFg1sSDK(getMediationNetwork(), aFg1vSDK), copy());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.component1;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    @NonNull
    public final synchronized AFh1oSDK component3() {
        try {
            if (this.toString == null) {
                this.toString = new AFh1oSDK(getRevenue());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.toString;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    @NonNull
    public final AFj1oSDK component4() {
        if (this.copy == null) {
            Context context = this.getCurrencyIso4217Code.AFAdRevenueData;
            if (context == null) {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
            this.copy = new AFj1mSDK(context, afWarnLog());
        }
        return this.copy;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    @NonNull
    public final synchronized AFe1aSDK copy() {
        try {
            if (this.equals == null) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 6, 300L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>() { // from class: com.appsflyer.internal.AFd1oSDK.5
                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // java.util.concurrent.LinkedBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
                    /* renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
                    public boolean offer(Runnable runnable) {
                        if (isEmpty()) {
                            return super.offer(runnable);
                        }
                        return false;
                    }
                }, new AFa1tSDK());
                threadPoolExecutor.setRejectedExecutionHandler(new RejectedExecutionHandler() { // from class: com.appsflyer.internal.m
                    @Override // java.util.concurrent.RejectedExecutionHandler
                    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor2) {
                        AFd1oSDK.getRevenue(runnable, threadPoolExecutor2);
                    }
                });
                this.equals = new AFe1aSDK(threadPoolExecutor);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.equals;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    @NonNull
    public final synchronized AFb1cSDK copydefault() {
        try {
            if (this.hashCode == null) {
                this.hashCode = new AFb1gSDK(this);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.hashCode;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    @NonNull
    public final synchronized AFc1kSDK d() {
        try {
            if (this.AFLogger == null) {
                this.AFLogger = new AFc1kSDK(this);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.AFLogger;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    @NonNull
    public final AFd1tSDK e() {
        if (this.getLevel == null) {
            this.getLevel = new AFd1tSDK();
        }
        return this.getLevel;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    @NonNull
    public final synchronized AFj1uSDK equals() {
        try {
            if (this.valueOf == null) {
                this.valueOf = new AFj1uSDK(this);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.valueOf;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    public final AFi1jSDK force() {
        try {
            if (this.afVerboseLog == null) {
                try {
                    Object[] objArr = {getMediationNetwork(), values(), AFKeystoreWrapper()};
                    Map map = AFi1hSDK.registerClient;
                    Object obj = map.get(-1187076423);
                    if (obj == null) {
                        obj = ((Class) AFi1hSDK.getMonetizationNetwork(View.combineMeasuredStates(0, 0) + 37, ViewConfiguration.getDoubleTapTimeout() >> 16, (char) (((Process.getThreadPriority(0) + 20) >> 6) + 64180))).getDeclaredConstructor(AFd1qSDK.class, AFd1nSDK.class, AFg1wSDK.class);
                        map.put(-1187076423, obj);
                    }
                    this.afVerboseLog = (AFi1jSDK) ((Constructor) obj).newInstance(objArr);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(AFh1vSDK.PLAY_INTEGRITY_API, th2.getMessage() != null ? th2.getMessage() : "", th2, false, false);
        }
        return this.afVerboseLog;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    @NonNull
    public final AFe1qSDK getCurrencyIso4217Code() {
        return new AFe1qSDK(afVerboseLog(), getMediationNetwork(), AppsFlyerProperties.getInstance(), AFInAppEventType());
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    @NonNull
    public final synchronized AFd1qSDK getMediationNetwork() {
        try {
            if (this.areAllFieldsValid == null) {
                AFd1nSDK values = values();
                AFd1rSDK revenue = getRevenue();
                if (this.getLevel == null) {
                    this.getLevel = new AFd1tSDK();
                }
                this.areAllFieldsValid = new AFd1qSDK(values, revenue, this.getLevel, getMonetizationNetwork());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.areAllFieldsValid;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    @NonNull
    public final synchronized ExecutorService getMonetizationNetwork() {
        try {
            if (this.AFAdRevenueData == null) {
                this.AFAdRevenueData = new AFd1ySDK(0, 5, 60L, TimeUnit.SECONDS, new SynchronousQueue(), null, 32, null);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.AFAdRevenueData;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    @NonNull
    public final AFd1rSDK getRevenue() {
        if (this.component2 == null) {
            this.component2 = new AFd1sSDK(new AFd1mSDK(new Function0() { // from class: com.appsflyer.internal.n
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    SharedPreferences u_;
                    u_ = AFd1oSDK.this.u_();
                    return u_;
                }
            }));
        }
        return this.component2;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    @NonNull
    public final AFh1xSDK i() {
        if (this.f12003w == null) {
            this.f12003w = new AFh1wSDK(this);
        }
        return this.f12003w;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    @NonNull
    public final AFi1qSDK registerClient() {
        if (this.registerClient == null) {
            Context context = this.getCurrencyIso4217Code.AFAdRevenueData;
            if (context == null) {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
            this.registerClient = new AFi1qSDK(context);
        }
        return this.registerClient;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    @NonNull
    public final synchronized AFc1fSDK unregisterClient() {
        try {
            if (this.afInfoLog == null) {
                this.afInfoLog = new AFc1eSDK(values());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.afInfoLog;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    @NonNull
    public final AFg1tSDK v() {
        if (this.afDebugLog == null) {
            Context context = this.getCurrencyIso4217Code.AFAdRevenueData;
            if (context == null) {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
            AFg1nSDK aFg1nSDK = new AFg1nSDK(context, AppsFlyerProperties.getInstance());
            if (this.getLevel == null) {
                this.getLevel = new AFd1tSDK();
            }
            this.afDebugLog = new AFg1pSDK(aFg1nSDK, this.getLevel, AppsFlyerProperties.getInstance());
        }
        return this.afDebugLog;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    @NonNull
    public final synchronized AFb1uSDK valueOf() {
        try {
            if (this.AFInAppEventParameterName == null) {
                this.AFInAppEventParameterName = new AFb1lSDK(values());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.AFInAppEventParameterName;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    @NonNull
    public final synchronized AFd1nSDK values() {
        return this.getCurrencyIso4217Code;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    @NonNull
    public final AFd1wSDK w() {
        if (this.f12000e == null) {
            ExecutorService afWarnLog = afWarnLog();
            ScheduledExecutorService AFAdRevenueData = AFAdRevenueData();
            AFc1kSDK d6 = d();
            if (this.f12001i == null) {
                this.f12001i = new AFi1kSDK();
            }
            this.f12000e = new AFd1xSDK(afWarnLog, AFAdRevenueData, d6, this.f12001i);
        }
        return this.f12000e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void getRevenue(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        try {
            threadPoolExecutor.getQueue().put(runnable);
        } catch (InterruptedException e6) {
            AFLogger.afErrorLogForExcManagerOnly("could not create executor for queue", e6);
            Thread.currentThread().interrupt();
        }
    }
}
