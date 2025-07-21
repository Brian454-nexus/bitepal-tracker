package I;

import I.W;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import l0.AbstractC1728c;

/* renamed from: I.b0, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC0419b0 {

    /* renamed from: I.b0$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements N.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f2420a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AbstractC1728c.a f2421b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ScheduledFuture f2422c;

        public a(boolean z6, AbstractC1728c.a aVar, ScheduledFuture scheduledFuture) {
            this.f2420a = z6;
            this.f2421b = aVar;
            this.f2422c = scheduledFuture;
        }

        @Override // N.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(List list) {
            ArrayList arrayList = new ArrayList(list);
            if (this.f2420a) {
                arrayList.removeAll(Collections.singleton(null));
            }
            this.f2421b.c(arrayList);
            this.f2422c.cancel(true);
        }

        @Override // N.c
        public void onFailure(Throwable th) {
            this.f2421b.c(Collections.unmodifiableList(Collections.EMPTY_LIST));
            this.f2422c.cancel(true);
        }
    }

    public static /* synthetic */ Object a(List list, ScheduledExecutorService scheduledExecutorService, final Executor executor, final long j6, boolean z6, final AbstractC1728c.a aVar) {
        final D6.g m6 = N.f.m(list);
        ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new Runnable() { // from class: I.Y
            @Override // java.lang.Runnable
            public final void run() {
                executor.execute(new Runnable() { // from class: I.a0
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC0419b0.c(r1, r2, r3);
                    }
                });
            }
        }, j6, TimeUnit.MILLISECONDS);
        aVar.a(new Runnable() { // from class: I.Z
            @Override // java.lang.Runnable
            public final void run() {
                m6.cancel(true);
            }
        }, executor);
        N.f.b(m6, new a(z6, aVar, schedule), executor);
        return "surfaceList";
    }

    public static /* synthetic */ void c(D6.g gVar, AbstractC1728c.a aVar, long j6) {
        if (gVar.isDone()) {
            return;
        }
        aVar.f(new TimeoutException("Cannot complete surfaceList within " + j6));
        gVar.cancel(true);
    }

    public static void e(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((W) it.next()).e();
        }
    }

    public static void f(List list) {
        if (list.isEmpty()) {
            return;
        }
        int i6 = 0;
        do {
            try {
                ((W) list.get(i6)).l();
                i6++;
            } catch (W.a e6) {
                for (int i7 = i6 - 1; i7 >= 0; i7--) {
                    ((W) list.get(i7)).e();
                }
                throw e6;
            }
        } while (i6 < list.size());
    }

    public static D6.g g(Collection collection, final boolean z6, final long j6, final Executor executor, final ScheduledExecutorService scheduledExecutorService) {
        final ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(N.f.i(((W) it.next()).j()));
        }
        return AbstractC1728c.a(new AbstractC1728c.InterfaceC0214c() { // from class: I.X
            @Override // l0.AbstractC1728c.InterfaceC0214c
            public final Object a(AbstractC1728c.a aVar) {
                return AbstractC0419b0.a(arrayList, scheduledExecutorService, executor, j6, z6, aVar);
            }
        });
    }
}
