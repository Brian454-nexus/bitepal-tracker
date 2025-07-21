package androidx.lifecycle;

import androidx.lifecycle.AbstractC1057i;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.lifecycle.d, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1052d implements InterfaceC1059k {

    /* renamed from: a, reason: collision with root package name */
    public final DefaultLifecycleObserver f9035a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1059k f9036b;

    /* renamed from: androidx.lifecycle.d$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9037a;

        static {
            int[] iArr = new int[AbstractC1057i.a.values().length];
            try {
                iArr[AbstractC1057i.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC1057i.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC1057i.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AbstractC1057i.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AbstractC1057i.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AbstractC1057i.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AbstractC1057i.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f9037a = iArr;
        }
    }

    public C1052d(DefaultLifecycleObserver defaultLifecycleObserver, InterfaceC1059k interfaceC1059k) {
        Intrinsics.checkNotNullParameter(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f9035a = defaultLifecycleObserver;
        this.f9036b = interfaceC1059k;
    }

    @Override // androidx.lifecycle.InterfaceC1059k
    public void c(InterfaceC1061m source, AbstractC1057i.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        switch (a.f9037a[event.ordinal()]) {
            case 1:
                this.f9035a.onCreate(source);
                break;
            case 2:
                this.f9035a.onStart(source);
                break;
            case 3:
                this.f9035a.onResume(source);
                break;
            case 4:
                this.f9035a.onPause(source);
                break;
            case 5:
                this.f9035a.onStop(source);
                break;
            case 6:
                this.f9035a.onDestroy(source);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        InterfaceC1059k interfaceC1059k = this.f9036b;
        if (interfaceC1059k != null) {
            interfaceC1059k.c(source, event);
        }
    }
}
