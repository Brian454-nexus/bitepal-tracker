package g3;

import X2.E;
import androidx.work.WorkerParameters;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class t implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public E f14889a;

    /* renamed from: b, reason: collision with root package name */
    public X2.v f14890b;

    /* renamed from: c, reason: collision with root package name */
    public WorkerParameters.a f14891c;

    public t(E e6, X2.v vVar, WorkerParameters.a aVar) {
        this.f14889a = e6;
        this.f14890b = vVar;
        this.f14891c = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f14889a.o().o(this.f14890b, this.f14891c);
    }
}
