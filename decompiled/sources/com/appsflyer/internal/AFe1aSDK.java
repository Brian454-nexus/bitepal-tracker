package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFe1aSDK {
    public Executor AFAdRevenueData;
    final Set<AFe1eSDK<?>> areAllFieldsValid;
    final Set<AFf1zSDK> component1;
    final List<AFe1eSDK<?>> component2;
    final NavigableSet<AFe1eSDK<?>> component3;
    final NavigableSet<AFe1eSDK<?>> component4;
    final ExecutorService getCurrencyIso4217Code;
    final Timer getMediationNetwork;
    final Set<AFf1zSDK> getMonetizationNetwork;
    public final List<AFe1dSDK> getRevenue;

    /* renamed from: com.appsflyer.internal.AFe1aSDK$2, reason: invalid class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class AnonymousClass2 implements Runnable {
        private /* synthetic */ AFe1eSDK getMediationNetwork;

        public AnonymousClass2(AFe1eSDK aFe1eSDK) {
            this.getMediationNetwork = aFe1eSDK;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean add;
            synchronized (AFe1aSDK.this.component3) {
                try {
                    if (AFe1aSDK.this.areAllFieldsValid.contains(this.getMediationNetwork)) {
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        AFh1vSDK aFh1vSDK = AFh1vSDK.QUEUE;
                        StringBuilder sb = new StringBuilder("tried to add already running task: ");
                        sb.append(this.getMediationNetwork);
                        aFLogger.d(aFh1vSDK, sb.toString());
                        return;
                    }
                    if (!AFe1aSDK.this.component3.contains(this.getMediationNetwork) && !AFe1aSDK.this.component4.contains(this.getMediationNetwork)) {
                        AFe1aSDK aFe1aSDK = AFe1aSDK.this;
                        AFe1eSDK aFe1eSDK = this.getMediationNetwork;
                        for (AFf1zSDK aFf1zSDK : aFe1eSDK.getCurrencyIso4217Code) {
                            if (aFe1aSDK.component1.contains(aFf1zSDK)) {
                                aFe1eSDK.getRevenue.add(aFf1zSDK);
                            }
                        }
                        if (AFe1aSDK.this.getRevenue(this.getMediationNetwork)) {
                            add = AFe1aSDK.this.component3.add(this.getMediationNetwork);
                        } else {
                            add = AFe1aSDK.this.component4.add(this.getMediationNetwork);
                            if (add) {
                                AFLogger aFLogger2 = AFLogger.INSTANCE;
                                AFh1vSDK aFh1vSDK2 = AFh1vSDK.QUEUE;
                                StringBuilder sb2 = new StringBuilder("new task was blocked: ");
                                sb2.append(this.getMediationNetwork);
                                aFLogger2.d(aFh1vSDK2, sb2.toString());
                                this.getMediationNetwork.getCurrencyIso4217Code();
                            }
                        }
                        if (add) {
                            AFe1aSDK aFe1aSDK2 = AFe1aSDK.this;
                            aFe1aSDK2.component3.addAll(aFe1aSDK2.component2);
                            AFe1aSDK.this.component2.clear();
                        } else {
                            AFLogger aFLogger3 = AFLogger.INSTANCE;
                            AFh1vSDK aFh1vSDK3 = AFh1vSDK.QUEUE;
                            StringBuilder sb3 = new StringBuilder("task not added, it's already in the queue: ");
                            sb3.append(this.getMediationNetwork);
                            aFLogger3.d(aFh1vSDK3, sb3.toString());
                        }
                        if (!add) {
                            AFLogger aFLogger4 = AFLogger.INSTANCE;
                            AFh1vSDK aFh1vSDK4 = AFh1vSDK.QUEUE;
                            StringBuilder sb4 = new StringBuilder("QUEUE: tried to add already pending task: ");
                            sb4.append(this.getMediationNetwork);
                            aFLogger4.w(aFh1vSDK4, sb4.toString());
                            return;
                        }
                        AFe1aSDK.this.component1.add(this.getMediationNetwork.getMonetizationNetwork);
                        AFLogger aFLogger5 = AFLogger.INSTANCE;
                        AFh1vSDK aFh1vSDK5 = AFh1vSDK.QUEUE;
                        StringBuilder sb5 = new StringBuilder("new task added: ");
                        sb5.append(this.getMediationNetwork);
                        aFLogger5.d(aFh1vSDK5, sb5.toString());
                        for (AFe1dSDK aFe1dSDK : AFe1aSDK.this.getRevenue) {
                        }
                        AFe1aSDK aFe1aSDK3 = AFe1aSDK.this;
                        aFe1aSDK3.getCurrencyIso4217Code.submit(new AnonymousClass4());
                        AFe1aSDK aFe1aSDK4 = AFe1aSDK.this;
                        synchronized (aFe1aSDK4.component3) {
                            try {
                                for (int size = (aFe1aSDK4.component3.size() + aFe1aSDK4.component4.size()) - 40; size > 0; size--) {
                                    boolean isEmpty = aFe1aSDK4.component4.isEmpty();
                                    boolean isEmpty2 = aFe1aSDK4.component3.isEmpty();
                                    if (isEmpty2 || isEmpty) {
                                        if (!isEmpty2) {
                                            aFe1aSDK4.getMediationNetwork(aFe1aSDK4.component3);
                                        } else if (!isEmpty) {
                                            aFe1aSDK4.getMediationNetwork(aFe1aSDK4.component4);
                                        }
                                    } else if (aFe1aSDK4.component3.first().compareTo(aFe1aSDK4.component4.first()) > 0) {
                                        aFe1aSDK4.getMediationNetwork(aFe1aSDK4.component3);
                                    } else {
                                        aFe1aSDK4.getMediationNetwork(aFe1aSDK4.component4);
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return;
                    }
                    AFLogger aFLogger6 = AFLogger.INSTANCE;
                    AFh1vSDK aFh1vSDK6 = AFh1vSDK.QUEUE;
                    StringBuilder sb6 = new StringBuilder("tried to add already scheduled task: ");
                    sb6.append(this.getMediationNetwork);
                    aFLogger6.d(aFh1vSDK6, sb6.toString());
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: com.appsflyer.internal.AFe1aSDK$4, reason: invalid class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class AnonymousClass4 implements Runnable {
        public AnonymousClass4() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (AFe1aSDK.this.component3) {
                try {
                    final AFe1eSDK<?> pollFirst = AFe1aSDK.this.component3.pollFirst();
                    if (pollFirst == null) {
                        return;
                    }
                    AFe1aSDK.this.areAllFieldsValid.add(pollFirst);
                    long monetizationNetwork = pollFirst.getMonetizationNetwork();
                    AFf1xSDK aFf1xSDK = new AFf1xSDK(Thread.currentThread());
                    if (monetizationNetwork > 0) {
                        AFe1aSDK.this.getMediationNetwork.schedule(aFf1xSDK, monetizationNetwork);
                    }
                    final AFe1aSDK aFe1aSDK = AFe1aSDK.this;
                    aFe1aSDK.AFAdRevenueData.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1aSDK.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            Iterator<AFe1dSDK> it = AFe1aSDK.this.getRevenue.iterator();
                            while (it.hasNext()) {
                                it.next().getCurrencyIso4217Code(pollFirst);
                            }
                        }
                    });
                    if (!AFe1aSDK.this.component3.isEmpty()) {
                        AFe1aSDK aFe1aSDK2 = AFe1aSDK.this;
                        aFe1aSDK2.getCurrencyIso4217Code.submit(new AnonymousClass4());
                    }
                    try {
                        AFLogger.INSTANCE.d(AFh1vSDK.QUEUE, "starting task execution: ".concat(String.valueOf(pollFirst)));
                        final AFe1cSDK call = pollFirst.call();
                        aFf1xSDK.cancel();
                        final AFe1aSDK aFe1aSDK3 = AFe1aSDK.this;
                        aFe1aSDK3.AFAdRevenueData.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1aSDK.5
                            @Override // java.lang.Runnable
                            public final void run() {
                                AFLogger aFLogger = AFLogger.INSTANCE;
                                AFh1vSDK aFh1vSDK = AFh1vSDK.QUEUE;
                                StringBuilder sb = new StringBuilder("execution finished for ");
                                sb.append(pollFirst);
                                sb.append(", result: ");
                                sb.append(call);
                                aFLogger.d(aFh1vSDK, sb.toString());
                                AFe1aSDK.this.areAllFieldsValid.remove(pollFirst);
                                Iterator<AFe1dSDK> it = AFe1aSDK.this.getRevenue.iterator();
                                while (it.hasNext()) {
                                    it.next().getMonetizationNetwork(pollFirst, call);
                                }
                                if (call == AFe1cSDK.SUCCESS) {
                                    AFe1aSDK.this.getMonetizationNetwork.add(pollFirst.getMonetizationNetwork);
                                    AFe1aSDK.this.getMonetizationNetwork();
                                    return;
                                }
                                if (!pollFirst.getMediationNetwork()) {
                                    AFe1aSDK.this.getMonetizationNetwork.add(pollFirst.getMonetizationNetwork);
                                    AFe1aSDK.this.getMonetizationNetwork();
                                } else if (AFe1aSDK.getCurrencyIso4217Code(pollFirst)) {
                                    synchronized (AFe1aSDK.this.component3) {
                                        try {
                                            AFe1aSDK.this.component2.add(pollFirst);
                                            for (AFe1dSDK aFe1dSDK : AFe1aSDK.this.getRevenue) {
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                }
                            }
                        });
                    } catch (InterruptedIOException | InterruptedException unused) {
                        AFLogger.INSTANCE.d(AFh1vSDK.QUEUE, "task was interrupted: ".concat(String.valueOf(pollFirst)));
                        final AFe1cSDK aFe1cSDK = AFe1cSDK.TIMEOUT;
                        pollFirst.getMediationNetwork = aFe1cSDK;
                        final AFe1aSDK aFe1aSDK4 = AFe1aSDK.this;
                        aFe1aSDK4.AFAdRevenueData.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1aSDK.5
                            @Override // java.lang.Runnable
                            public final void run() {
                                AFLogger aFLogger = AFLogger.INSTANCE;
                                AFh1vSDK aFh1vSDK = AFh1vSDK.QUEUE;
                                StringBuilder sb = new StringBuilder("execution finished for ");
                                sb.append(pollFirst);
                                sb.append(", result: ");
                                sb.append(aFe1cSDK);
                                aFLogger.d(aFh1vSDK, sb.toString());
                                AFe1aSDK.this.areAllFieldsValid.remove(pollFirst);
                                Iterator<AFe1dSDK> it = AFe1aSDK.this.getRevenue.iterator();
                                while (it.hasNext()) {
                                    it.next().getMonetizationNetwork(pollFirst, aFe1cSDK);
                                }
                                if (aFe1cSDK == AFe1cSDK.SUCCESS) {
                                    AFe1aSDK.this.getMonetizationNetwork.add(pollFirst.getMonetizationNetwork);
                                    AFe1aSDK.this.getMonetizationNetwork();
                                    return;
                                }
                                if (!pollFirst.getMediationNetwork()) {
                                    AFe1aSDK.this.getMonetizationNetwork.add(pollFirst.getMonetizationNetwork);
                                    AFe1aSDK.this.getMonetizationNetwork();
                                } else if (AFe1aSDK.getCurrencyIso4217Code(pollFirst)) {
                                    synchronized (AFe1aSDK.this.component3) {
                                        try {
                                            AFe1aSDK.this.component2.add(pollFirst);
                                            for (AFe1dSDK aFe1dSDK : AFe1aSDK.this.getRevenue) {
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                }
                            }
                        });
                    } catch (Throwable unused2) {
                        aFf1xSDK.cancel();
                        final AFe1aSDK aFe1aSDK5 = AFe1aSDK.this;
                        final AFe1cSDK aFe1cSDK2 = AFe1cSDK.FAILURE;
                        aFe1aSDK5.AFAdRevenueData.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1aSDK.5
                            @Override // java.lang.Runnable
                            public final void run() {
                                AFLogger aFLogger = AFLogger.INSTANCE;
                                AFh1vSDK aFh1vSDK = AFh1vSDK.QUEUE;
                                StringBuilder sb = new StringBuilder("execution finished for ");
                                sb.append(pollFirst);
                                sb.append(", result: ");
                                sb.append(aFe1cSDK2);
                                aFLogger.d(aFh1vSDK, sb.toString());
                                AFe1aSDK.this.areAllFieldsValid.remove(pollFirst);
                                Iterator<AFe1dSDK> it = AFe1aSDK.this.getRevenue.iterator();
                                while (it.hasNext()) {
                                    it.next().getMonetizationNetwork(pollFirst, aFe1cSDK2);
                                }
                                if (aFe1cSDK2 == AFe1cSDK.SUCCESS) {
                                    AFe1aSDK.this.getMonetizationNetwork.add(pollFirst.getMonetizationNetwork);
                                    AFe1aSDK.this.getMonetizationNetwork();
                                    return;
                                }
                                if (!pollFirst.getMediationNetwork()) {
                                    AFe1aSDK.this.getMonetizationNetwork.add(pollFirst.getMonetizationNetwork);
                                    AFe1aSDK.this.getMonetizationNetwork();
                                } else if (AFe1aSDK.getCurrencyIso4217Code(pollFirst)) {
                                    synchronized (AFe1aSDK.this.component3) {
                                        try {
                                            AFe1aSDK.this.component2.add(pollFirst);
                                            for (AFe1dSDK aFe1dSDK : AFe1aSDK.this.getRevenue) {
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                }
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public AFe1aSDK(ExecutorService executorService) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "");
        this.AFAdRevenueData = newSingleThreadExecutor;
        this.getMediationNetwork = new Timer(true);
        this.getRevenue = new CopyOnWriteArrayList();
        this.getMonetizationNetwork = new CopyOnWriteArraySet();
        this.component1 = Collections.newSetFromMap(new ConcurrentHashMap());
        this.component3 = new ConcurrentSkipListSet();
        this.component4 = new ConcurrentSkipListSet();
        this.component2 = new ArrayList();
        this.areAllFieldsValid = Collections.newSetFromMap(new ConcurrentHashMap());
        this.getCurrencyIso4217Code = executorService;
    }

    public static boolean getCurrencyIso4217Code(AFe1eSDK<?> aFe1eSDK) {
        return ((aFe1eSDK instanceof AFf1dSDK) && aFe1eSDK.getMonetizationNetwork == AFf1zSDK.ARS_VALIDATE) ? false : true;
    }

    public final void getMediationNetwork(NavigableSet<AFe1eSDK<?>> navigableSet) {
        AFe1eSDK<?> pollFirst = navigableSet.pollFirst();
        this.getMonetizationNetwork.add(pollFirst.getMonetizationNetwork);
        Iterator<AFe1dSDK> it = this.getRevenue.iterator();
        while (it.hasNext()) {
            it.next().getMediationNetwork(pollFirst);
        }
    }

    public final void getMonetizationNetwork() {
        synchronized (this.component3) {
            try {
                Iterator<AFe1eSDK<?>> it = this.component4.iterator();
                boolean z6 = false;
                while (it.hasNext()) {
                    AFe1eSDK<?> next = it.next();
                    if (getRevenue(next)) {
                        it.remove();
                        this.component3.add(next);
                        z6 = true;
                    }
                }
                if (z6) {
                    this.getCurrencyIso4217Code.submit(new AnonymousClass4());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean getRevenue(AFe1eSDK<?> aFe1eSDK) {
        return this.getMonetizationNetwork.containsAll(aFe1eSDK.getRevenue);
    }
}
