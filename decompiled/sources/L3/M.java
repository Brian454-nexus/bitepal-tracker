package L3;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class M implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final ThreadFactory f3202a = Executors.defaultThreadFactory();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f3203b = new AtomicInteger(1);

    public M(com.android.billingclient.api.b bVar) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        AtomicInteger atomicInteger = this.f3203b;
        Thread newThread = this.f3202a.newThread(runnable);
        newThread.setName("PlayBillingLibrary-" + atomicInteger.getAndIncrement());
        return newThread;
    }
}
