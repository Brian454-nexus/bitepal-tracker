package z0;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: z0.e, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C2419e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f21437a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2420f f21438b;

    /* renamed from: c, reason: collision with root package name */
    public final b f21439c;

    /* renamed from: d, reason: collision with root package name */
    public final a f21440d;

    /* renamed from: e, reason: collision with root package name */
    public VelocityTracker f21441e;

    /* renamed from: f, reason: collision with root package name */
    public float f21442f;

    /* renamed from: g, reason: collision with root package name */
    public int f21443g;

    /* renamed from: h, reason: collision with root package name */
    public int f21444h;

    /* renamed from: i, reason: collision with root package name */
    public int f21445i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f21446j;

    /* renamed from: z0.e$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface a {
        float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i6);
    }

    /* renamed from: z0.e$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface b {
        void a(Context context, int[] iArr, MotionEvent motionEvent, int i6);
    }

    public C2419e(Context context, InterfaceC2420f interfaceC2420f) {
        this(context, interfaceC2420f, new b() { // from class: z0.c
            @Override // z0.C2419e.b
            public final void a(Context context2, int[] iArr, MotionEvent motionEvent, int i6) {
                C2419e.c(context2, iArr, motionEvent, i6);
            }
        }, new a() { // from class: z0.d
            @Override // z0.C2419e.a
            public final float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i6) {
                float f6;
                f6 = C2419e.f(velocityTracker, motionEvent, i6);
                return f6;
            }
        });
    }

    public static void c(Context context, int[] iArr, MotionEvent motionEvent, int i6) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        iArr[0] = AbstractC2396G.g(context, viewConfiguration, motionEvent.getDeviceId(), i6, motionEvent.getSource());
        iArr[1] = AbstractC2396G.f(context, viewConfiguration, motionEvent.getDeviceId(), i6, motionEvent.getSource());
    }

    public static float f(VelocityTracker velocityTracker, MotionEvent motionEvent, int i6) {
        AbstractC2390A.a(velocityTracker, motionEvent);
        AbstractC2390A.b(velocityTracker, 1000);
        return AbstractC2390A.d(velocityTracker, i6);
    }

    public final boolean d(MotionEvent motionEvent, int i6) {
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        if (this.f21444h == source && this.f21445i == deviceId && this.f21443g == i6) {
            return false;
        }
        this.f21439c.a(this.f21437a, this.f21446j, motionEvent, i6);
        this.f21444h = source;
        this.f21445i = deviceId;
        this.f21443g = i6;
        return true;
    }

    public final float e(MotionEvent motionEvent, int i6) {
        if (this.f21441e == null) {
            this.f21441e = VelocityTracker.obtain();
        }
        return this.f21440d.a(this.f21441e, motionEvent, i6);
    }

    public void g(MotionEvent motionEvent, int i6) {
        boolean d6 = d(motionEvent, i6);
        if (this.f21446j[0] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.f21441e;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f21441e = null;
                return;
            }
            return;
        }
        float e6 = e(motionEvent, i6) * this.f21438b.b();
        float signum = Math.signum(e6);
        if (d6 || (signum != Math.signum(this.f21442f) && signum != 0.0f)) {
            this.f21438b.c();
        }
        float abs = Math.abs(e6);
        int[] iArr = this.f21446j;
        if (abs < iArr[0]) {
            return;
        }
        float max = Math.max(-r6, Math.min(e6, iArr[1]));
        this.f21442f = this.f21438b.a(max) ? max : 0.0f;
    }

    public C2419e(Context context, InterfaceC2420f interfaceC2420f, b bVar, a aVar) {
        this.f21443g = -1;
        this.f21444h = -1;
        this.f21445i = -1;
        this.f21446j = new int[]{IntCompanionObject.MAX_VALUE, 0};
        this.f21437a = context;
        this.f21438b = interfaceC2420f;
        this.f21439c = bVar;
        this.f21440d = aVar;
    }
}
