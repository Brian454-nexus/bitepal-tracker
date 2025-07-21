package c1;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;

/* renamed from: c1.i, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class RunnableC1127i implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f10590g = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: a, reason: collision with root package name */
    public final Handler f10591a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f10592b;

    /* renamed from: c, reason: collision with root package name */
    public EGLDisplay f10593c;

    /* renamed from: d, reason: collision with root package name */
    public EGLContext f10594d;

    /* renamed from: e, reason: collision with root package name */
    public EGLSurface f10595e;

    /* renamed from: f, reason: collision with root package name */
    public SurfaceTexture f10596f;

    /* renamed from: c1.i$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface a {
    }

    public RunnableC1127i(Handler handler) {
        this(handler, null);
    }

    public static EGLConfig a(EGLDisplay eGLDisplay) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, f10590g, 0, eGLConfigArr, 0, 1, iArr, 0);
        AbstractC1128j.b(eglChooseConfig && iArr[0] > 0 && eGLConfigArr[0] != null, AbstractC1117K.H("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
        return eGLConfigArr[0];
    }

    public static EGLContext b(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i6) {
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, i6 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        AbstractC1128j.b(eglCreateContext != null, "eglCreateContext failed");
        return eglCreateContext;
    }

    public static EGLSurface c(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i6) {
        EGLSurface eglCreatePbufferSurface;
        if (i6 == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i6 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            AbstractC1128j.b(eglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
        }
        AbstractC1128j.b(EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eGLContext), "eglMakeCurrent failed");
        return eglCreatePbufferSurface;
    }

    public static void e(int[] iArr) {
        GLES20.glGenTextures(1, iArr, 0);
        AbstractC1128j.a();
    }

    public static EGLDisplay f() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        AbstractC1128j.b(eglGetDisplay != null, "eglGetDisplay failed");
        int[] iArr = new int[2];
        AbstractC1128j.b(EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
        return eglGetDisplay;
    }

    public final void d() {
    }

    public SurfaceTexture g() {
        return (SurfaceTexture) AbstractC1119a.e(this.f10596f);
    }

    public void h(int i6) {
        EGLDisplay f6 = f();
        this.f10593c = f6;
        EGLConfig a6 = a(f6);
        EGLContext b6 = b(this.f10593c, a6, i6);
        this.f10594d = b6;
        this.f10595e = c(this.f10593c, a6, b6, i6);
        e(this.f10592b);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f10592b[0]);
        this.f10596f = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void i() {
        this.f10591a.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f10596f;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f10592b, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f10593c;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f10593c;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f10595e;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f10593c, this.f10595e);
            }
            EGLContext eGLContext = this.f10594d;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f10593c, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = this.f10593c;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f10593c);
            }
            this.f10593c = null;
            this.f10594d = null;
            this.f10595e = null;
            this.f10596f = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f10591a.post(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        d();
        SurfaceTexture surfaceTexture = this.f10596f;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    public RunnableC1127i(Handler handler, a aVar) {
        this.f10591a = handler;
        this.f10592b = new int[1];
    }
}
