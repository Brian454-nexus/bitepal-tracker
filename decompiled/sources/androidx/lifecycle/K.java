package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.AbstractC1057i;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class K {

    /* renamed from: a, reason: collision with root package name */
    public final C1062n f9003a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f9004b;

    /* renamed from: c, reason: collision with root package name */
    public a f9005c;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final C1062n f9006a;

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC1057i.a f9007b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f9008c;

        public a(C1062n registry, AbstractC1057i.a event) {
            Intrinsics.checkNotNullParameter(registry, "registry");
            Intrinsics.checkNotNullParameter(event, "event");
            this.f9006a = registry;
            this.f9007b = event;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f9008c) {
                return;
            }
            this.f9006a.h(this.f9007b);
            this.f9008c = true;
        }
    }

    public K(InterfaceC1061m provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f9003a = new C1062n(provider);
        this.f9004b = new Handler();
    }

    public AbstractC1057i a() {
        return this.f9003a;
    }

    public void b() {
        f(AbstractC1057i.a.ON_START);
    }

    public void c() {
        f(AbstractC1057i.a.ON_CREATE);
    }

    public void d() {
        f(AbstractC1057i.a.ON_STOP);
        f(AbstractC1057i.a.ON_DESTROY);
    }

    public void e() {
        f(AbstractC1057i.a.ON_START);
    }

    public final void f(AbstractC1057i.a aVar) {
        a aVar2 = this.f9005c;
        if (aVar2 != null) {
            aVar2.run();
        }
        a aVar3 = new a(this.f9003a, aVar);
        this.f9005c = aVar3;
        Handler handler = this.f9004b;
        Intrinsics.checkNotNull(aVar3);
        handler.postAtFrontOfQueue(aVar3);
    }
}
