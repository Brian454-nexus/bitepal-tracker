package T;

import F.AbstractC0335i0;
import android.graphics.Bitmap;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class y {

    /* renamed from: n, reason: collision with root package name */
    public static final String f4869n;

    /* renamed from: o, reason: collision with root package name */
    public static final String f4870o;

    /* renamed from: p, reason: collision with root package name */
    public static final String f4871p;

    /* renamed from: q, reason: collision with root package name */
    public static final String f4872q;

    /* renamed from: r, reason: collision with root package name */
    public static final float[] f4873r;

    /* renamed from: s, reason: collision with root package name */
    public static final FloatBuffer f4874s;

    /* renamed from: t, reason: collision with root package name */
    public static final float[] f4875t;

    /* renamed from: u, reason: collision with root package name */
    public static final FloatBuffer f4876u;

    /* renamed from: v, reason: collision with root package name */
    public static final a f4877v;

    /* renamed from: c, reason: collision with root package name */
    public Thread f4880c;

    /* renamed from: f, reason: collision with root package name */
    public EGLConfig f4883f;

    /* renamed from: h, reason: collision with root package name */
    public Surface f4885h;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f4878a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final Map f4879b = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public EGLDisplay f4881d = EGL14.EGL_NO_DISPLAY;

    /* renamed from: e, reason: collision with root package name */
    public EGLContext f4882e = EGL14.EGL_NO_CONTEXT;

    /* renamed from: g, reason: collision with root package name */
    public EGLSurface f4884g = EGL14.EGL_NO_SURFACE;

    /* renamed from: i, reason: collision with root package name */
    public int f4886i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f4887j = -1;

    /* renamed from: k, reason: collision with root package name */
    public int f4888k = -1;

    /* renamed from: l, reason: collision with root package name */
    public int f4889l = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f4890m = -1;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class a {
        public static a d(EGLSurface eGLSurface, int i6, int i7) {
            return new C0747b(eGLSurface, i6, i7);
        }

        public abstract EGLSurface a();

        public abstract int b();

        public abstract int c();
    }

    static {
        Locale locale = Locale.US;
        f4869n = String.format(locale, "uniform mat4 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 %s;\nvoid main() {\n    gl_Position = aPosition;\n    %s = (uTexMatrix * aTextureCoord).xy;\n}\n", "vTextureCoord", "vTextureCoord");
        f4870o = String.format(locale, "#version 300 es\nin vec4 aPosition;\nin vec4 aTextureCoord;\nuniform mat4 uTexMatrix;\nout vec2 %s;\nvoid main() {\n  gl_Position = aPosition;\n  %s = (uTexMatrix * aTextureCoord).xy;\n}\n", "vTextureCoord", "vTextureCoord");
        f4871p = String.format(locale, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 %s;\nuniform samplerExternalOES %s;\nvoid main() {\n    gl_FragColor = texture2D(%s, %s);\n}\n", "vTextureCoord", "sTexture", "sTexture", "vTextureCoord");
        f4872q = String.format(locale, "#version 300 es\n#extension GL_OES_EGL_image_external : require\n#extension GL_EXT_YUV_target : require\nprecision mediump float;\nuniform __samplerExternal2DY2YEXT %s;\nin vec2 %s;\nout vec4 outColor;\n\nvec3 yuvToRgb(vec3 yuv) {\n  const vec3 yuvOffset = vec3(0.0625, 0.5, 0.5);\n  const mat3 yuvToRgbColorTransform = mat3(\n    1.1689f, 1.1689f, 1.1689f,\n    0.0000f, -0.1881f, 2.1502f,\n    1.6853f, -0.6530f, 0.0000f\n  );\n  return clamp(yuvToRgbColorTransform * (yuv - yuvOffset), 0.0, 1.0);\n}\n\nvoid main() {\n  vec3 srcYuv = texture(%s, %s).xyz;\n  outColor = vec4(yuvToRgb(srcYuv), 1.0);\n}", "sTexture", "vTextureCoord", "sTexture", "vTextureCoord");
        float[] fArr = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        f4873r = fArr;
        f4874s = h(fArr);
        float[] fArr2 = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        f4875t = fArr2;
        f4876u = h(fArr2);
        f4877v = a.d(EGL14.EGL_NO_SURFACE, 0, 0);
    }

    public static int B(EGLDisplay eGLDisplay, EGLSurface eGLSurface, int i6) {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(eGLDisplay, eGLSurface, i6, iArr, 0);
        return iArr[0];
    }

    public static void a(String str) {
        try {
            b(str);
        } catch (IllegalStateException e6) {
            AbstractC0335i0.d("OpenGlRenderer", e6.toString(), e6);
        }
    }

    public static void b(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError == 12288) {
            return;
        }
        throw new IllegalStateException(str + ": EGL error: 0x" + Integer.toHexString(eglGetError));
    }

    public static void c(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        throw new IllegalStateException(str + ": GL error 0x" + Integer.toHexString(glGetError));
    }

    public static void f(int i6, String str) {
        if (i6 >= 0) {
            return;
        }
        throw new IllegalStateException("Unable to locate '" + str + "' in program");
    }

    public static FloatBuffer h(float[] fArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        return asFloatBuffer;
    }

    public static EGLSurface j(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i6, int i7) {
        EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, i6, 12374, i7, 12344}, 0);
        b("eglCreatePbufferSurface");
        if (eglCreatePbufferSurface != null) {
            return eglCreatePbufferSurface;
        }
        throw new IllegalStateException("surface was null");
    }

    public static EGLSurface n(EGLDisplay eGLDisplay, EGLConfig eGLConfig, Surface surface) {
        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, new int[]{12344}, 0);
        b("eglCreateWindowSurface");
        if (eglCreateWindowSurface != null) {
            return eglCreateWindowSurface;
        }
        throw new IllegalStateException("surface was null");
    }

    public static void o(int i6) {
        GLES20.glDeleteFramebuffers(1, new int[]{i6}, 0);
        c("glDeleteFramebuffers");
    }

    public static void p(int i6) {
        GLES20.glDeleteTextures(1, new int[]{i6}, 0);
        c("glDeleteTextures");
    }

    public static int q() {
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        c("glGenFramebuffers");
        return iArr[0];
    }

    public static int r() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        c("glGenTextures");
        return iArr[0];
    }

    public static int z(int i6, String str) {
        int glCreateShader = GLES20.glCreateShader(i6);
        c("glCreateShader type=" + i6);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        AbstractC0335i0.l("OpenGlRenderer", "Could not compile shader: " + str);
        GLES20.glDeleteShader(glCreateShader);
        throw new IllegalStateException("Could not compile shader type " + i6 + ":" + GLES20.glGetShaderInfoLog(glCreateShader));
    }

    public final void A(EGLSurface eGLSurface) {
        y0.g.f(this.f4881d);
        y0.g.f(this.f4882e);
        if (!EGL14.eglMakeCurrent(this.f4881d, eGLSurface, eGLSurface, this.f4882e)) {
            throw new IllegalStateException("eglMakeCurrent failed");
        }
    }

    public void C(Surface surface) {
        e(true);
        d();
        if (this.f4879b.containsKey(surface)) {
            return;
        }
        this.f4879b.put(surface, f4877v);
    }

    public void D() {
        if (this.f4878a.getAndSet(false)) {
            d();
            E();
        }
    }

    public final void E() {
        int i6 = this.f4887j;
        if (i6 != -1) {
            GLES20.glDeleteProgram(i6);
            this.f4887j = -1;
        }
        if (!Objects.equals(this.f4881d, EGL14.EGL_NO_DISPLAY)) {
            EGLDisplay eGLDisplay = this.f4881d;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            for (a aVar : this.f4879b.values()) {
                if (!Objects.equals(aVar.a(), EGL14.EGL_NO_SURFACE) && !EGL14.eglDestroySurface(this.f4881d, aVar.a())) {
                    a("eglDestroySurface");
                }
            }
            this.f4879b.clear();
            if (!Objects.equals(this.f4884g, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f4881d, this.f4884g);
                this.f4884g = EGL14.EGL_NO_SURFACE;
            }
            if (!Objects.equals(this.f4882e, EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext(this.f4881d, this.f4882e);
                this.f4882e = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f4881d);
            this.f4881d = EGL14.EGL_NO_DISPLAY;
        }
        this.f4883f = null;
        this.f4887j = -1;
        this.f4888k = -1;
        this.f4889l = -1;
        this.f4890m = -1;
        this.f4886i = -1;
        this.f4885h = null;
        this.f4880c = null;
    }

    public final void F(Surface surface, boolean z6) {
        if (this.f4885h == surface) {
            this.f4885h = null;
            A(this.f4884g);
        }
        a aVar = z6 ? (a) this.f4879b.remove(surface) : (a) this.f4879b.put(surface, f4877v);
        if (aVar == null || aVar == f4877v) {
            return;
        }
        try {
            EGL14.eglDestroySurface(this.f4881d, aVar.a());
        } catch (RuntimeException e6) {
            AbstractC0335i0.m("OpenGlRenderer", "Failed to destroy EGL surface: " + e6.getMessage(), e6);
        }
    }

    public void G(long j6, float[] fArr, Surface surface) {
        e(true);
        d();
        a t6 = t(surface);
        if (t6 == f4877v) {
            t6 = i(surface);
            if (t6 == null) {
                return;
            } else {
                this.f4879b.put(surface, t6);
            }
        }
        if (surface != this.f4885h) {
            A(t6.a());
            this.f4885h = surface;
            GLES20.glViewport(0, 0, t6.c(), t6.b());
            GLES20.glScissor(0, 0, t6.c(), t6.b());
        }
        GLES20.glUniformMatrix4fv(this.f4888k, 1, false, fArr, 0);
        c("glUniformMatrix4fv");
        GLES20.glDrawArrays(5, 0, 4);
        c("glDrawArrays");
        EGLExt.eglPresentationTimeANDROID(this.f4881d, t6.a(), j6);
        if (EGL14.eglSwapBuffers(this.f4881d, t6.a())) {
            return;
        }
        AbstractC0335i0.l("OpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
        F(surface, false);
    }

    public Bitmap H(Size size, float[] fArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(size.getWidth() * size.getHeight() * 4);
        I(allocateDirect, size, fArr);
        Bitmap createBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), Bitmap.Config.ARGB_8888);
        allocateDirect.rewind();
        ImageProcessingUtil.i(createBitmap, allocateDirect, size.getWidth() * 4);
        return createBitmap;
    }

    public final void I(ByteBuffer byteBuffer, Size size, float[] fArr) {
        y0.g.b(byteBuffer.capacity() == (size.getWidth() * size.getHeight()) * 4, "ByteBuffer capacity is not equal to width * height * 4.");
        y0.g.b(byteBuffer.isDirect(), "ByteBuffer is not direct.");
        int r6 = r();
        GLES20.glActiveTexture(33985);
        c("glActiveTexture");
        GLES20.glBindTexture(3553, r6);
        c("glBindTexture");
        GLES20.glTexImage2D(3553, 0, 6407, size.getWidth(), size.getHeight(), 0, 6407, 5121, null);
        c("glTexImage2D");
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        int q6 = q();
        GLES20.glBindFramebuffer(36160, q6);
        c("glBindFramebuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, r6, 0);
        c("glFramebufferTexture2D");
        GLES20.glActiveTexture(33984);
        c("glActiveTexture");
        GLES20.glBindTexture(36197, this.f4886i);
        c("glBindTexture");
        this.f4885h = null;
        GLES20.glViewport(0, 0, size.getWidth(), size.getHeight());
        GLES20.glScissor(0, 0, size.getWidth(), size.getHeight());
        GLES20.glUniformMatrix4fv(this.f4888k, 1, false, fArr, 0);
        c("glUniformMatrix4fv");
        GLES20.glDrawArrays(5, 0, 4);
        c("glDrawArrays");
        GLES20.glReadPixels(0, 0, size.getWidth(), size.getHeight(), 6408, 5121, byteBuffer);
        c("glReadPixels");
        GLES20.glBindFramebuffer(36160, 0);
        p(r6);
        o(q6);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.f4886i);
    }

    public void J(Surface surface) {
        e(true);
        d();
        F(surface, true);
    }

    public final void K() {
        GLES20.glUseProgram(this.f4887j);
        c("glUseProgram");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.f4886i);
        GLES20.glEnableVertexAttribArray(this.f4889l);
        c("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.f4889l, 2, 5126, false, 0, (Buffer) f4874s);
        c("glVertexAttribPointer");
        GLES20.glEnableVertexAttribArray(this.f4890m);
        c("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.f4890m, 2, 5126, false, 0, (Buffer) f4876u);
        c("glVertexAttribPointer");
    }

    public final void d() {
        y0.g.i(this.f4880c == Thread.currentThread(), "Method call must be called on the GL thread.");
    }

    public final void e(boolean z6) {
        y0.g.i(z6 == this.f4878a.get(), z6 ? "OpenGlRenderer is not initialized" : "OpenGlRenderer is already initialized");
    }

    public final void g(F.C c6) {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f4881d = eglGetDisplay;
        if (Objects.equals(eglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            throw new IllegalStateException("Unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(this.f4881d, iArr, 0, iArr, 1)) {
            this.f4881d = EGL14.EGL_NO_DISPLAY;
            throw new IllegalStateException("Unable to initialize EGL14");
        }
        int i6 = c6.d() ? 10 : 8;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig(this.f4881d, new int[]{12324, i6, 12323, i6, 12322, i6, 12321, c6.d() ? 2 : 8, 12325, 0, 12326, 0, 12352, c6.d() ? 64 : 4, 12610, !c6.d() ? 1 : 0, 12339, 5, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            throw new IllegalStateException("Unable to find a suitable EGLConfig");
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eglCreateContext = EGL14.eglCreateContext(this.f4881d, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, c6.d() ? 3 : 2, 12344}, 0);
        b("eglCreateContext");
        this.f4883f = eGLConfig;
        this.f4882e = eglCreateContext;
        int[] iArr2 = new int[1];
        EGL14.eglQueryContext(this.f4881d, eglCreateContext, 12440, iArr2, 0);
        Log.d("OpenGlRenderer", "EGLContext created, client version " + iArr2[0]);
    }

    public final a i(Surface surface) {
        try {
            EGLDisplay eGLDisplay = this.f4881d;
            EGLConfig eGLConfig = this.f4883f;
            Objects.requireNonNull(eGLConfig);
            EGLSurface n6 = n(eGLDisplay, eGLConfig, surface);
            Size u6 = u(n6);
            return a.d(n6, u6.getWidth(), u6.getHeight());
        } catch (IllegalArgumentException | IllegalStateException e6) {
            AbstractC0335i0.m("OpenGlRenderer", "Failed to create EGL surface: " + e6.getMessage(), e6);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(F.C r8, T.B r9) {
        /*
            r7 = this;
            java.lang.String r0 = "glAttachShader"
            r1 = -1
            boolean r2 = r8.d()     // Catch: java.lang.IllegalArgumentException -> Lc java.lang.IllegalStateException -> L12
            if (r2 == 0) goto L14
            java.lang.String r2 = T.y.f4870o     // Catch: java.lang.IllegalArgumentException -> Lc java.lang.IllegalStateException -> L12
            goto L16
        Lc:
            r8 = move-exception
        Ld:
            r9 = r1
            r0 = r9
            r2 = r0
            goto L7b
        L12:
            r8 = move-exception
            goto Ld
        L14:
            java.lang.String r2 = T.y.f4869n     // Catch: java.lang.IllegalArgumentException -> Lc java.lang.IllegalStateException -> L12
        L16:
            r3 = 35633(0x8b31, float:4.9932E-41)
            int r2 = z(r3, r2)     // Catch: java.lang.IllegalArgumentException -> Lc java.lang.IllegalStateException -> L12
            int r8 = r7.x(r8, r9)     // Catch: java.lang.IllegalArgumentException -> L75 java.lang.IllegalStateException -> L79
            int r9 = android.opengl.GLES20.glCreateProgram()     // Catch: java.lang.IllegalArgumentException -> L6d java.lang.IllegalStateException -> L73
            java.lang.String r3 = "glCreateProgram"
            c(r3)     // Catch: java.lang.IllegalArgumentException -> L4a java.lang.IllegalStateException -> L50
            android.opengl.GLES20.glAttachShader(r9, r2)     // Catch: java.lang.IllegalArgumentException -> L4a java.lang.IllegalStateException -> L50
            c(r0)     // Catch: java.lang.IllegalArgumentException -> L4a java.lang.IllegalStateException -> L50
            android.opengl.GLES20.glAttachShader(r9, r8)     // Catch: java.lang.IllegalArgumentException -> L4a java.lang.IllegalStateException -> L50
            c(r0)     // Catch: java.lang.IllegalArgumentException -> L4a java.lang.IllegalStateException -> L50
            android.opengl.GLES20.glLinkProgram(r9)     // Catch: java.lang.IllegalArgumentException -> L4a java.lang.IllegalStateException -> L50
            r0 = 1
            int[] r3 = new int[r0]     // Catch: java.lang.IllegalArgumentException -> L4a java.lang.IllegalStateException -> L50
            r4 = 35714(0x8b82, float:5.0046E-41)
            r5 = 0
            android.opengl.GLES20.glGetProgramiv(r9, r4, r3, r5)     // Catch: java.lang.IllegalArgumentException -> L4a java.lang.IllegalStateException -> L50
            r3 = r3[r5]     // Catch: java.lang.IllegalArgumentException -> L4a java.lang.IllegalStateException -> L50
            if (r3 != r0) goto L52
            r7.f4887j = r9     // Catch: java.lang.IllegalArgumentException -> L4a java.lang.IllegalStateException -> L50
            return
        L4a:
            r0 = move-exception
        L4b:
            r6 = r9
            r9 = r8
            r8 = r0
            r0 = r6
            goto L7b
        L50:
            r0 = move-exception
            goto L4b
        L52:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.IllegalArgumentException -> L4a java.lang.IllegalStateException -> L50
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L4a java.lang.IllegalStateException -> L50
            r3.<init>()     // Catch: java.lang.IllegalArgumentException -> L4a java.lang.IllegalStateException -> L50
            java.lang.String r4 = "Could not link program: "
            r3.append(r4)     // Catch: java.lang.IllegalArgumentException -> L4a java.lang.IllegalStateException -> L50
            java.lang.String r4 = android.opengl.GLES20.glGetProgramInfoLog(r9)     // Catch: java.lang.IllegalArgumentException -> L4a java.lang.IllegalStateException -> L50
            r3.append(r4)     // Catch: java.lang.IllegalArgumentException -> L4a java.lang.IllegalStateException -> L50
            java.lang.String r3 = r3.toString()     // Catch: java.lang.IllegalArgumentException -> L4a java.lang.IllegalStateException -> L50
            r0.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> L4a java.lang.IllegalStateException -> L50
            throw r0     // Catch: java.lang.IllegalArgumentException -> L4a java.lang.IllegalStateException -> L50
        L6d:
            r9 = move-exception
        L6e:
            r0 = r9
            r9 = r8
            r8 = r0
            r0 = r1
            goto L7b
        L73:
            r9 = move-exception
            goto L6e
        L75:
            r8 = move-exception
        L76:
            r9 = r1
            r0 = r9
            goto L7b
        L79:
            r8 = move-exception
            goto L76
        L7b:
            if (r2 == r1) goto L80
            android.opengl.GLES20.glDeleteShader(r2)
        L80:
            if (r9 == r1) goto L85
            android.opengl.GLES20.glDeleteShader(r9)
        L85:
            if (r0 == r1) goto L8a
            android.opengl.GLES20.glDeleteProgram(r0)
        L8a:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: T.y.k(F.C, T.B):void");
    }

    public final void l() {
        EGLDisplay eGLDisplay = this.f4881d;
        EGLConfig eGLConfig = this.f4883f;
        Objects.requireNonNull(eGLConfig);
        this.f4884g = j(eGLDisplay, eGLConfig, 1, 1);
    }

    public final void m() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        c("glGenTextures");
        int i6 = iArr[0];
        GLES20.glBindTexture(36197, i6);
        c("glBindTexture " + i6);
        GLES20.glTexParameterf(36197, 10241, 9728.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        c("glTexParameter");
        this.f4886i = i6;
    }

    public final String s(F.C c6) {
        e(false);
        try {
            g(c6);
            l();
            A(this.f4884g);
            String glGetString = GLES20.glGetString(7939);
            return glGetString != null ? glGetString : "";
        } catch (IllegalStateException e6) {
            AbstractC0335i0.m("OpenGlRenderer", "Failed to get GL extensions: " + e6.getMessage(), e6);
            return "";
        } finally {
            E();
        }
    }

    public final a t(Surface surface) {
        y0.g.i(this.f4879b.containsKey(surface), "The surface is not registered.");
        a aVar = (a) this.f4879b.get(surface);
        Objects.requireNonNull(aVar);
        return aVar;
    }

    public final Size u(EGLSurface eGLSurface) {
        return new Size(B(this.f4881d, eGLSurface, 12375), B(this.f4881d, eGLSurface, 12374));
    }

    public int v() {
        e(true);
        d();
        return this.f4886i;
    }

    public void w(F.C c6, B b6) {
        e(false);
        try {
            if (c6.d() && !s(c6).contains("GL_EXT_YUV_target")) {
                Log.w("OpenGlRenderer", "Device does not support GL_EXT_YUV_target. Fallback to SDR.");
                c6 = F.C.f1236d;
            }
            g(c6);
            l();
            A(this.f4884g);
            k(c6, b6);
            y();
            m();
            K();
            this.f4880c = Thread.currentThread();
            this.f4878a.set(true);
        } catch (IllegalArgumentException e6) {
            e = e6;
            E();
            throw e;
        } catch (IllegalStateException e7) {
            e = e7;
            E();
            throw e;
        }
    }

    public final int x(F.C c6, B b6) {
        if (b6 == B.f4734a) {
            return z(35632, c6.d() ? f4872q : f4871p);
        }
        try {
            String a6 = b6.a("sTexture", "vTextureCoord");
            if (a6 != null && a6.contains("vTextureCoord") && a6.contains("sTexture")) {
                return z(35632, a6);
            }
            throw new IllegalArgumentException("Invalid fragment shader");
        } catch (Throwable th) {
            if (th instanceof IllegalArgumentException) {
                throw th;
            }
            throw new IllegalArgumentException("Unable to compile fragment shader", th);
        }
    }

    public final void y() {
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.f4887j, "aPosition");
        this.f4889l = glGetAttribLocation;
        f(glGetAttribLocation, "aPosition");
        int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.f4887j, "aTextureCoord");
        this.f4890m = glGetAttribLocation2;
        f(glGetAttribLocation2, "aTextureCoord");
        int glGetUniformLocation = GLES20.glGetUniformLocation(this.f4887j, "uTexMatrix");
        this.f4888k = glGetUniformLocation;
        f(glGetUniformLocation, "uTexMatrix");
    }
}
