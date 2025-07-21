package I3;

import java.util.concurrent.ArrayBlockingQueue;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final a f2797d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final f f2798a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2799b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayBlockingQueue f2800c;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public c(f channel) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        this.f2798a = channel;
        this.f2799b = new Object();
        this.f2800c = new ArrayBlockingQueue(ConstantsKt.MINIMUM_BLOCK_SIZE);
    }

    public final void a(I3.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        synchronized (this.f2799b) {
            this.f2800c.offer(event);
        }
    }
}
