package s3;

import android.app.Activity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.Window;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import y3.InterfaceC2355a;

/* renamed from: s3.b, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2064b extends AbstractWindowCallbackC2066d {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2355a f18916b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0247b f18917c;

    /* renamed from: d, reason: collision with root package name */
    public final GestureDetectorOnGestureListenerC2063a f18918d;

    /* renamed from: e, reason: collision with root package name */
    public final GestureDetector f18919e;

    /* renamed from: s3.b$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a implements InterfaceC0247b {
    }

    /* renamed from: s3.b$b, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface InterfaceC0247b {
        default MotionEvent a(MotionEvent origin) {
            Intrinsics.checkNotNullParameter(origin, "origin");
            MotionEvent obtain = MotionEvent.obtain(origin);
            Intrinsics.checkNotNullExpressionValue(obtain, "obtain(...)");
            return obtain;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C2064b(android.view.Window.Callback r10, android.app.Activity r11, kotlin.jvm.functions.Function2 r12, java.util.List r13, y3.InterfaceC2355a r14, s3.C2064b.InterfaceC0247b r15, s3.GestureDetectorOnGestureListenerC2063a r16, android.view.GestureDetector r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r9 = this;
            r0 = r18
            r1 = r0 & 32
            if (r1 == 0) goto Lb
            s3.b$a r15 = new s3.b$a
            r15.<init>()
        Lb:
            r6 = r15
            r15 = r0 & 64
            if (r15 == 0) goto L17
            s3.a r15 = new s3.a
            r15.<init>(r11, r12, r14, r13)
            r7 = r15
            goto L19
        L17:
            r7 = r16
        L19:
            r15 = r0 & 128(0x80, float:1.794E-43)
            if (r15 == 0) goto L2a
            android.view.GestureDetector r15 = new android.view.GestureDetector
            r15.<init>(r11, r7)
            r8 = r15
        L23:
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            goto L2d
        L2a:
            r8 = r17
            goto L23
        L2d:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.C2064b.<init>(android.view.Window$Callback, android.app.Activity, kotlin.jvm.functions.Function2, java.util.List, y3.a, s3.b$b, s3.a, android.view.GestureDetector, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @Override // s3.AbstractWindowCallbackC2066d, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            MotionEvent a6 = this.f18917c.a(motionEvent);
            try {
                try {
                    this.f18919e.onTouchEvent(a6);
                } catch (Exception e6) {
                    this.f18916b.a("Error handling touch event: " + e6);
                    Unit unit = Unit.INSTANCE;
                }
            } finally {
                a6.recycle();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2064b(Window.Callback delegate, Activity activity, Function2 track, List viewTargetLocators, InterfaceC2355a logger, InterfaceC0247b motionEventObtainer, GestureDetectorOnGestureListenerC2063a gestureListener, GestureDetector gestureDetector) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(track, "track");
        Intrinsics.checkNotNullParameter(viewTargetLocators, "viewTargetLocators");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(motionEventObtainer, "motionEventObtainer");
        Intrinsics.checkNotNullParameter(gestureListener, "gestureListener");
        Intrinsics.checkNotNullParameter(gestureDetector, "gestureDetector");
        this.f18916b = logger;
        this.f18917c = motionEventObtainer;
        this.f18918d = gestureListener;
        this.f18919e = gestureDetector;
    }
}
