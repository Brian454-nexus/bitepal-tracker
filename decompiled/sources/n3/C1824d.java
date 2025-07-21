package n3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function1;

/* renamed from: n3.d, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1824d implements InterfaceC1823c {

    /* renamed from: b, reason: collision with root package name */
    public Function1 f17748b;

    /* renamed from: a, reason: collision with root package name */
    public final Object f17747a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayBlockingQueue f17749c = new ArrayBlockingQueue(ConstantsKt.MINIMUM_BLOCK_SIZE);

    @Override // n3.InterfaceC1823c
    public void a(Function1 function1) {
        ArrayList arrayList;
        synchronized (this.f17747a) {
            this.f17748b = function1;
            arrayList = new ArrayList();
            this.f17749c.drainTo(arrayList);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            if (function1 != null) {
                function1.invoke(null);
            }
        }
    }
}
