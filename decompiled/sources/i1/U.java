package i1;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final /* synthetic */ class U implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Handler f15857a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f15857a.post(runnable);
    }
}
