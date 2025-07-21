package V4;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import n5.k;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Map f5307a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final b f5308b = new b();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Lock f5309a = new ReentrantLock();

        /* renamed from: b, reason: collision with root package name */
        public int f5310b;
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final Queue f5311a = new ArrayDeque();

        public a a() {
            a aVar;
            synchronized (this.f5311a) {
                aVar = (a) this.f5311a.poll();
            }
            return aVar == null ? new a() : aVar;
        }

        public void b(a aVar) {
            synchronized (this.f5311a) {
                try {
                    if (this.f5311a.size() < 10) {
                        this.f5311a.offer(aVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void a(String str) {
        a aVar;
        synchronized (this) {
            try {
                aVar = (a) this.f5307a.get(str);
                if (aVar == null) {
                    aVar = this.f5308b.a();
                    this.f5307a.put(str, aVar);
                }
                aVar.f5310b++;
            } catch (Throwable th) {
                throw th;
            }
        }
        aVar.f5309a.lock();
    }

    public void b(String str) {
        a aVar;
        synchronized (this) {
            try {
                aVar = (a) k.d(this.f5307a.get(str));
                int i6 = aVar.f5310b;
                if (i6 < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f5310b);
                }
                int i7 = i6 - 1;
                aVar.f5310b = i7;
                if (i7 == 0) {
                    a aVar2 = (a) this.f5307a.remove(str);
                    if (!aVar2.equals(aVar)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + aVar2 + ", safeKey: " + str);
                    }
                    this.f5308b.b(aVar2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        aVar.f5309a.unlock();
    }
}
