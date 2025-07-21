package i3;

import android.os.Handler;
import android.os.Looper;
import g3.s;
import java.util.concurrent.Executor;

/* renamed from: i3.c, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C1512c implements InterfaceC1511b {

    /* renamed from: a, reason: collision with root package name */
    public final s f16013a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f16014b = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    public final Executor f16015c = new a();

    /* renamed from: i3.c$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements Executor {
        public a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            C1512c.this.f16014b.post(runnable);
        }
    }

    public C1512c(Executor executor) {
        this.f16013a = new s(executor);
    }

    @Override // i3.InterfaceC1511b
    public Executor a() {
        return this.f16015c;
    }

    @Override // i3.InterfaceC1511b
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public s b() {
        return this.f16013a;
    }
}
