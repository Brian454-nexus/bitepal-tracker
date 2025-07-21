package M;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class i implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public final Executor f3350b;

    /* renamed from: a, reason: collision with root package name */
    public final Deque f3349a = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public final b f3351c = new b();

    /* renamed from: d, reason: collision with root package name */
    public c f3352d = c.IDLE;

    /* renamed from: e, reason: collision with root package name */
    public long f3353e = 0;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f3354a;

        public a(Runnable runnable) {
            this.f3354a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3354a.run();
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class b implements Runnable {
        public b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0044, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
        
            r3.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
        
            r2 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
        
            F.AbstractC0335i0.d("SequentialExecutor", "Exception while executing runnable " + r3, r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x003b, code lost:
        
            if (r1 == false) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a() {
            /*
                r9 = this;
                r0 = 0
                r1 = r0
            L2:
                M.i r2 = M.i.this     // Catch: java.lang.Throwable -> L49
                java.util.Deque r2 = r2.f3349a     // Catch: java.lang.Throwable -> L49
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L49
                if (r0 != 0) goto L28
                M.i r0 = M.i.this     // Catch: java.lang.Throwable -> L1c
                M.i$c r3 = r0.f3352d     // Catch: java.lang.Throwable -> L1c
                M.i$c r4 = M.i.c.RUNNING     // Catch: java.lang.Throwable -> L1c
                if (r3 != r4) goto L1e
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                if (r1 == 0) goto L3e
            L14:
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
                goto L3e
            L1c:
                r0 = move-exception
                goto L63
            L1e:
                long r5 = r0.f3353e     // Catch: java.lang.Throwable -> L1c
                r7 = 1
                long r5 = r5 + r7
                r0.f3353e = r5     // Catch: java.lang.Throwable -> L1c
                r0.f3352d = r4     // Catch: java.lang.Throwable -> L1c
                r0 = 1
            L28:
                M.i r3 = M.i.this     // Catch: java.lang.Throwable -> L1c
                java.util.Deque r3 = r3.f3349a     // Catch: java.lang.Throwable -> L1c
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L1c
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L1c
                if (r3 != 0) goto L3f
                M.i r0 = M.i.this     // Catch: java.lang.Throwable -> L1c
                M.i$c r3 = M.i.c.IDLE     // Catch: java.lang.Throwable -> L1c
                r0.f3352d = r3     // Catch: java.lang.Throwable -> L1c
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                if (r1 == 0) goto L3e
                goto L14
            L3e:
                return
            L3f:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L49
                r1 = r1 | r2
                r3.run()     // Catch: java.lang.Throwable -> L49 java.lang.RuntimeException -> L4b
                goto L2
            L49:
                r0 = move-exception
                goto L65
            L4b:
                r2 = move-exception
                java.lang.String r4 = "SequentialExecutor"
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
                r5.<init>()     // Catch: java.lang.Throwable -> L49
                java.lang.String r6 = "Exception while executing runnable "
                r5.append(r6)     // Catch: java.lang.Throwable -> L49
                r5.append(r3)     // Catch: java.lang.Throwable -> L49
                java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L49
                F.AbstractC0335i0.d(r4, r3, r2)     // Catch: java.lang.Throwable -> L49
                goto L2
            L63:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                throw r0     // Catch: java.lang.Throwable -> L49
            L65:
                if (r1 == 0) goto L6e
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L6e:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: M.i.b.a():void");
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a();
            } catch (Error e6) {
                synchronized (i.this.f3349a) {
                    i.this.f3352d = c.IDLE;
                    throw e6;
                }
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public enum c {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    public i(Executor executor) {
        this.f3350b = (Executor) y0.g.f(executor);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0066 A[ADDED_TO_REGION] */
    @Override // java.util.concurrent.Executor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void execute(java.lang.Runnable r8) {
        /*
            r7 = this;
            y0.g.f(r8)
            java.util.Deque r0 = r7.f3349a
            monitor-enter(r0)
            M.i$c r1 = r7.f3352d     // Catch: java.lang.Throwable -> L6d
            M.i$c r2 = M.i.c.RUNNING     // Catch: java.lang.Throwable -> L6d
            if (r1 == r2) goto L6f
            M.i$c r2 = M.i.c.QUEUED     // Catch: java.lang.Throwable -> L6d
            if (r1 != r2) goto L11
            goto L6f
        L11:
            long r3 = r7.f3353e     // Catch: java.lang.Throwable -> L6d
            M.i$a r1 = new M.i$a     // Catch: java.lang.Throwable -> L6d
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L6d
            java.util.Deque r8 = r7.f3349a     // Catch: java.lang.Throwable -> L6d
            r8.add(r1)     // Catch: java.lang.Throwable -> L6d
            M.i$c r8 = M.i.c.QUEUING     // Catch: java.lang.Throwable -> L6d
            r7.f3352d = r8     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            java.util.concurrent.Executor r0 = r7.f3350b     // Catch: java.lang.Error -> L44 java.lang.RuntimeException -> L46
            M.i$b r5 = r7.f3351c     // Catch: java.lang.Error -> L44 java.lang.RuntimeException -> L46
            r0.execute(r5)     // Catch: java.lang.Error -> L44 java.lang.RuntimeException -> L46
            M.i$c r0 = r7.f3352d
            if (r0 == r8) goto L2e
            return
        L2e:
            java.util.Deque r0 = r7.f3349a
            monitor-enter(r0)
            long r5 = r7.f3353e     // Catch: java.lang.Throwable -> L3e
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L40
            M.i$c r1 = r7.f3352d     // Catch: java.lang.Throwable -> L3e
            if (r1 != r8) goto L40
            r7.f3352d = r2     // Catch: java.lang.Throwable -> L3e
            goto L40
        L3e:
            r8 = move-exception
            goto L42
        L40:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            return
        L42:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            throw r8
        L44:
            r8 = move-exception
            goto L47
        L46:
            r8 = move-exception
        L47:
            java.util.Deque r2 = r7.f3349a
            monitor-enter(r2)
            M.i$c r0 = r7.f3352d     // Catch: java.lang.Throwable -> L55
            M.i$c r3 = M.i.c.IDLE     // Catch: java.lang.Throwable -> L55
            if (r0 == r3) goto L57
            M.i$c r3 = M.i.c.QUEUING     // Catch: java.lang.Throwable -> L55
            if (r0 != r3) goto L61
            goto L57
        L55:
            r8 = move-exception
            goto L6b
        L57:
            java.util.Deque r0 = r7.f3349a     // Catch: java.lang.Throwable -> L55
            boolean r0 = r0.removeLastOccurrence(r1)     // Catch: java.lang.Throwable -> L55
            if (r0 == 0) goto L61
            r0 = 1
            goto L62
        L61:
            r0 = 0
        L62:
            boolean r1 = r8 instanceof java.util.concurrent.RejectedExecutionException     // Catch: java.lang.Throwable -> L55
            if (r1 == 0) goto L6a
            if (r0 != 0) goto L6a
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L55
            return
        L6a:
            throw r8     // Catch: java.lang.Throwable -> L55
        L6b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L55
            throw r8
        L6d:
            r8 = move-exception
            goto L76
        L6f:
            java.util.Deque r1 = r7.f3349a     // Catch: java.lang.Throwable -> L6d
            r1.add(r8)     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            return
        L76:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: M.i.execute(java.lang.Runnable):void");
    }
}
