package x;

import E.j;
import F.E;
import I.C0464y0;
import I.D0;
import I.InterfaceC0462x0;
import I.P;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;

/* renamed from: x.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2253a extends j {

    /* renamed from: H, reason: collision with root package name */
    public static final P.a f20382H = P.a.a("camera2.captureRequest.templateType", Integer.TYPE);

    /* renamed from: I, reason: collision with root package name */
    public static final P.a f20383I = P.a.a("camera2.cameraCaptureSession.streamUseCase", Long.TYPE);

    /* renamed from: J, reason: collision with root package name */
    public static final P.a f20384J = P.a.a("camera2.cameraDevice.stateCallback", CameraDevice.StateCallback.class);

    /* renamed from: K, reason: collision with root package name */
    public static final P.a f20385K = P.a.a("camera2.cameraCaptureSession.stateCallback", CameraCaptureSession.StateCallback.class);

    /* renamed from: L, reason: collision with root package name */
    public static final P.a f20386L = P.a.a("camera2.cameraCaptureSession.captureCallback", CameraCaptureSession.CaptureCallback.class);

    /* renamed from: M, reason: collision with root package name */
    public static final P.a f20387M = P.a.a("camera2.cameraEvent.callback", C2255c.class);

    /* renamed from: N, reason: collision with root package name */
    public static final P.a f20388N = P.a.a("camera2.captureRequest.tag", Object.class);

    /* renamed from: O, reason: collision with root package name */
    public static final P.a f20389O = P.a.a("camera2.cameraCaptureSession.physicalCameraId", String.class);

    /* renamed from: x.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0269a implements E {

        /* renamed from: a, reason: collision with root package name */
        public final C0464y0 f20390a = C0464y0.a0();

        public C2253a a() {
            return new C2253a(D0.Z(this.f20390a));
        }

        @Override // F.E
        public InterfaceC0462x0 b() {
            return this.f20390a;
        }

        public C0269a d(CaptureRequest.Key key, Object obj) {
            this.f20390a.H(C2253a.X(key), obj);
            return this;
        }
    }

    public C2253a(P p6) {
        super(p6);
    }

    public static P.a X(CaptureRequest.Key key) {
        return P.a.b("camera2.captureRequest.option." + key.getName(), Object.class, key);
    }

    public C2255c Y(C2255c c2255c) {
        return (C2255c) o().e(f20387M, c2255c);
    }

    public j Z() {
        return j.a.f(o()).d();
    }

    public Object a0(Object obj) {
        return o().e(f20388N, obj);
    }

    public int b0(int i6) {
        return ((Integer) o().e(f20382H, Integer.valueOf(i6))).intValue();
    }

    public CameraDevice.StateCallback c0(CameraDevice.StateCallback stateCallback) {
        return (CameraDevice.StateCallback) o().e(f20384J, stateCallback);
    }

    public String d0(String str) {
        return (String) o().e(f20389O, str);
    }

    public CameraCaptureSession.CaptureCallback e0(CameraCaptureSession.CaptureCallback captureCallback) {
        return (CameraCaptureSession.CaptureCallback) o().e(f20386L, captureCallback);
    }

    public CameraCaptureSession.StateCallback f0(CameraCaptureSession.StateCallback stateCallback) {
        return (CameraCaptureSession.StateCallback) o().e(f20385K, stateCallback);
    }

    public long g0(long j6) {
        return ((Long) o().e(f20383I, Long.valueOf(j6))).longValue();
    }
}
