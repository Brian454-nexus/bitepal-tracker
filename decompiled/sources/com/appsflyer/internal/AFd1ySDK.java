package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\f¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/appsflyer/internal/AFd1ySDK;", "Ljava/util/concurrent/ThreadPoolExecutor;", "", "p0", "p1", "", "p2", "Ljava/util/concurrent/TimeUnit;", "p3", "Ljava/util/concurrent/BlockingQueue;", "Ljava/lang/Runnable;", "p4", "Ljava/util/Queue;", "p5", "<init>", "(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/Queue;)V", "", "", "afterExecute", "(Ljava/lang/Runnable;Ljava/lang/Throwable;)V", "getCurrencyIso4217Code", "Ljava/util/Queue;", "getMonetizationNetwork"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFd1ySDK extends ThreadPoolExecutor {

    /* renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
    @NotNull
    private final Queue<Runnable> getMonetizationNetwork;

    public /* synthetic */ AFd1ySDK(int i6, int i7, long j6, TimeUnit timeUnit, BlockingQueue blockingQueue, Queue queue, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(i6, i7, j6, timeUnit, blockingQueue, (i8 & 32) != 0 ? new LinkedList() : queue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFAdRevenueData(Queue queue, Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        Intrinsics.checkNotNullParameter(queue, "");
        Intrinsics.checkNotNullParameter(runnable, "");
        Intrinsics.checkNotNullParameter(threadPoolExecutor, "");
        queue.add(runnable);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void afterExecute(@NotNull Runnable p02, @Nullable Throwable p12) {
        Intrinsics.checkNotNullParameter(p02, "");
        super.afterExecute(p02, p12);
        Intrinsics.checkNotNullParameter(p02, "");
        if (p12 != null) {
            AFh1uSDK.e$default(AFLogger.INSTANCE, AFh1vSDK.AF_EXECUTOR, "Error while executing task: " + p02, p12, true, true, true, false, 64, null);
            return;
        }
        synchronized (this) {
            try {
                int size = this.getMonetizationNetwork.size();
                for (int i6 = 0; i6 < size; i6++) {
                    Runnable poll = this.getMonetizationNetwork.poll();
                    if (poll != null) {
                        execute(poll);
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private AFd1ySDK(int i6, int i7, long j6, @NotNull TimeUnit timeUnit, @NotNull BlockingQueue<Runnable> blockingQueue, @NotNull final Queue<Runnable> queue) {
        super(i6, i7, j6, timeUnit, blockingQueue, new RejectedExecutionHandler() { // from class: com.appsflyer.internal.r
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                AFd1ySDK.AFAdRevenueData(queue, runnable, threadPoolExecutor);
            }
        });
        Intrinsics.checkNotNullParameter(timeUnit, "");
        Intrinsics.checkNotNullParameter(blockingQueue, "");
        Intrinsics.checkNotNullParameter(queue, "");
        this.getMonetizationNetwork = queue;
    }
}
