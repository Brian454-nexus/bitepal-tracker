package y;

import F.AbstractC0335i0;
import I.AbstractC0442n;
import I.C0464y0;
import I.L0;
import I.N;
import I.P;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.os.Build;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import l0.AbstractC1728c;
import x.C2253a;
import x.C2255c;
import y.C2317m0;
import y.InterfaceC2301f1;
import y.s1;

/* renamed from: y.y0, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2340y0 implements InterfaceC2342z0 {

    /* renamed from: e, reason: collision with root package name */
    public r1 f21138e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC2301f1 f21139f;

    /* renamed from: g, reason: collision with root package name */
    public I.L0 f21140g;

    /* renamed from: l, reason: collision with root package name */
    public e f21145l;

    /* renamed from: m, reason: collision with root package name */
    public D6.g f21146m;

    /* renamed from: n, reason: collision with root package name */
    public AbstractC1728c.a f21147n;

    /* renamed from: r, reason: collision with root package name */
    public final A.e f21151r;

    /* renamed from: a, reason: collision with root package name */
    public final Object f21134a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final List f21135b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final CameraCaptureSession.CaptureCallback f21136c = new a();

    /* renamed from: h, reason: collision with root package name */
    public I.P f21141h = I.D0.Y();

    /* renamed from: i, reason: collision with root package name */
    public C2255c f21142i = C2255c.e();

    /* renamed from: j, reason: collision with root package name */
    public final Map f21143j = new HashMap();

    /* renamed from: k, reason: collision with root package name */
    public List f21144k = Collections.EMPTY_LIST;

    /* renamed from: o, reason: collision with root package name */
    public Map f21148o = new HashMap();

    /* renamed from: p, reason: collision with root package name */
    public final C.q f21149p = new C.q();

    /* renamed from: q, reason: collision with root package name */
    public final C.t f21150q = new C.t();

    /* renamed from: d, reason: collision with root package name */
    public final f f21137d = new f();

    /* renamed from: y.y0$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a extends CameraCaptureSession.CaptureCallback {
        public a() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        }
    }

    /* renamed from: y.y0$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class b implements N.c {
        public b() {
        }

        @Override // N.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
        }

        @Override // N.c
        public void onFailure(Throwable th) {
            synchronized (C2340y0.this.f21134a) {
                try {
                    C2340y0.this.f21138e.e();
                    int i6 = d.f21155a[C2340y0.this.f21145l.ordinal()];
                    if ((i6 == 4 || i6 == 6 || i6 == 7) && !(th instanceof CancellationException)) {
                        AbstractC0335i0.m("CaptureSession", "Opening session with fail " + C2340y0.this.f21145l, th);
                        C2340y0.this.m();
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: y.y0$c */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class c extends CameraCaptureSession.CaptureCallback {
        public c() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            synchronized (C2340y0.this.f21134a) {
                try {
                    I.L0 l02 = C2340y0.this.f21140g;
                    if (l02 == null) {
                        return;
                    }
                    I.N h6 = l02.h();
                    AbstractC0335i0.a("CaptureSession", "Submit FLASH_MODE_OFF request");
                    C2340y0 c2340y0 = C2340y0.this;
                    c2340y0.f(Collections.singletonList(c2340y0.f21150q.a(h6)));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: y.y0$d */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21155a;

        static {
            int[] iArr = new int[e.values().length];
            f21155a = iArr;
            try {
                iArr[e.UNINITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21155a[e.INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21155a[e.GET_SURFACE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21155a[e.OPENING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21155a[e.OPENED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21155a[e.CLOSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21155a[e.RELEASING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21155a[e.RELEASED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* renamed from: y.y0$e */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public enum e {
        UNINITIALIZED,
        INITIALIZED,
        GET_SURFACE,
        OPENING,
        OPENED,
        CLOSED,
        RELEASING,
        RELEASED
    }

    /* renamed from: y.y0$f */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class f extends InterfaceC2301f1.a {
        public f() {
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0011. Please report as an issue. */
        @Override // y.InterfaceC2301f1.a
        public void q(InterfaceC2301f1 interfaceC2301f1) {
            synchronized (C2340y0.this.f21134a) {
                try {
                    switch (d.f21155a[C2340y0.this.f21145l.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 5:
                            throw new IllegalStateException("onConfigureFailed() should not be possible in state: " + C2340y0.this.f21145l);
                        case 4:
                        case 6:
                        case 7:
                            C2340y0.this.m();
                            AbstractC0335i0.c("CaptureSession", "CameraCaptureSession.onConfigureFailed() " + C2340y0.this.f21145l);
                            break;
                        case 8:
                            AbstractC0335i0.a("CaptureSession", "ConfigureFailed callback after change to RELEASED state");
                            AbstractC0335i0.c("CaptureSession", "CameraCaptureSession.onConfigureFailed() " + C2340y0.this.f21145l);
                            break;
                        default:
                            AbstractC0335i0.c("CaptureSession", "CameraCaptureSession.onConfigureFailed() " + C2340y0.this.f21145l);
                            break;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0011. Please report as an issue. */
        @Override // y.InterfaceC2301f1.a
        public void r(InterfaceC2301f1 interfaceC2301f1) {
            synchronized (C2340y0.this.f21134a) {
                try {
                    switch (d.f21155a[C2340y0.this.f21145l.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 5:
                        case 8:
                            throw new IllegalStateException("onConfigured() should not be possible in state: " + C2340y0.this.f21145l);
                        case 4:
                            C2340y0 c2340y0 = C2340y0.this;
                            c2340y0.f21145l = e.OPENED;
                            c2340y0.f21139f = interfaceC2301f1;
                            if (c2340y0.f21140g != null) {
                                List c6 = c2340y0.f21142i.d().c();
                                if (!c6.isEmpty()) {
                                    C2340y0 c2340y02 = C2340y0.this;
                                    c2340y02.p(c2340y02.u(c6));
                                }
                            }
                            AbstractC0335i0.a("CaptureSession", "Attempting to send capture request onConfigured");
                            C2340y0 c2340y03 = C2340y0.this;
                            c2340y03.r(c2340y03.f21140g);
                            C2340y0.this.q();
                            AbstractC0335i0.a("CaptureSession", "CameraCaptureSession.onConfigured() mState=" + C2340y0.this.f21145l);
                            break;
                        case 6:
                            C2340y0.this.f21139f = interfaceC2301f1;
                            AbstractC0335i0.a("CaptureSession", "CameraCaptureSession.onConfigured() mState=" + C2340y0.this.f21145l);
                            break;
                        case 7:
                            interfaceC2301f1.close();
                            AbstractC0335i0.a("CaptureSession", "CameraCaptureSession.onConfigured() mState=" + C2340y0.this.f21145l);
                            break;
                        default:
                            AbstractC0335i0.a("CaptureSession", "CameraCaptureSession.onConfigured() mState=" + C2340y0.this.f21145l);
                            break;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // y.InterfaceC2301f1.a
        public void s(InterfaceC2301f1 interfaceC2301f1) {
            synchronized (C2340y0.this.f21134a) {
                try {
                    if (d.f21155a[C2340y0.this.f21145l.ordinal()] == 1) {
                        throw new IllegalStateException("onReady() should not be possible in state: " + C2340y0.this.f21145l);
                    }
                    AbstractC0335i0.a("CaptureSession", "CameraCaptureSession.onReady() " + C2340y0.this.f21145l);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // y.InterfaceC2301f1.a
        /* renamed from: t */
        public void z(InterfaceC2301f1 interfaceC2301f1) {
            synchronized (C2340y0.this.f21134a) {
                try {
                    if (C2340y0.this.f21145l == e.UNINITIALIZED) {
                        throw new IllegalStateException("onSessionFinished() should not be possible in state: " + C2340y0.this.f21145l);
                    }
                    AbstractC0335i0.a("CaptureSession", "onSessionFinished()");
                    C2340y0.this.m();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public C2340y0(A.e eVar) {
        this.f21145l = e.UNINITIALIZED;
        this.f21145l = e.INITIALIZED;
        this.f21151r = eVar;
    }

    public static /* synthetic */ Object i(C2340y0 c2340y0, AbstractC1728c.a aVar) {
        String str;
        synchronized (c2340y0.f21134a) {
            y0.g.i(c2340y0.f21147n == null, "Release completer expected to be null");
            c2340y0.f21147n = aVar;
            str = "Release[session=" + c2340y0 + "]";
        }
        return str;
    }

    public static /* synthetic */ void j(C2340y0 c2340y0, CameraCaptureSession cameraCaptureSession, int i6, boolean z6) {
        synchronized (c2340y0.f21134a) {
            try {
                if (c2340y0.f21145l == e.OPENED) {
                    c2340y0.r(c2340y0.f21140g);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static I.P s(List list) {
        C0464y0 a02 = C0464y0.a0();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            I.P f6 = ((I.N) it.next()).f();
            for (P.a aVar : f6.c()) {
                Object e6 = f6.e(aVar, null);
                if (a02.h(aVar)) {
                    Object e7 = a02.e(aVar, null);
                    if (!Objects.equals(e7, e6)) {
                        AbstractC0335i0.a("CaptureSession", "Detect conflicting option " + aVar.c() + " : " + e6 + " != " + e7);
                    }
                } else {
                    a02.H(aVar, e6);
                }
            }
        }
        return a02;
    }

    @Override // y.InterfaceC2342z0
    public D6.g a(final I.L0 l02, final CameraDevice cameraDevice, r1 r1Var) {
        synchronized (this.f21134a) {
            try {
                if (d.f21155a[this.f21145l.ordinal()] == 2) {
                    this.f21145l = e.GET_SURFACE;
                    ArrayList arrayList = new ArrayList(l02.k());
                    this.f21144k = arrayList;
                    this.f21138e = r1Var;
                    N.d f6 = N.d.a(r1Var.d(arrayList, 5000L)).f(new N.a() { // from class: y.x0
                        @Override // N.a
                        public final D6.g apply(Object obj) {
                            D6.g t6;
                            t6 = C2340y0.this.t((List) obj, l02, cameraDevice);
                            return t6;
                        }
                    }, this.f21138e.b());
                    N.f.b(f6, new b(), this.f21138e.b());
                    return N.f.i(f6);
                }
                AbstractC0335i0.c("CaptureSession", "Open not allowed in state: " + this.f21145l);
                return N.f.f(new IllegalStateException("open() should not allow the state: " + this.f21145l));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // y.InterfaceC2342z0
    public void b() {
        ArrayList arrayList;
        synchronized (this.f21134a) {
            try {
                if (this.f21135b.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(this.f21135b);
                    this.f21135b.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Iterator it2 = ((I.N) it.next()).c().iterator();
                while (it2.hasNext()) {
                    ((AbstractC0442n) it2.next()).a();
                }
            }
        }
    }

    @Override // y.InterfaceC2342z0
    public void c(I.L0 l02) {
        synchronized (this.f21134a) {
            try {
                switch (d.f21155a[this.f21145l.ordinal()]) {
                    case 1:
                        throw new IllegalStateException("setSessionConfig() should not be possible in state: " + this.f21145l);
                    case 2:
                    case 3:
                    case 4:
                        this.f21140g = l02;
                        break;
                    case 5:
                        this.f21140g = l02;
                        if (l02 != null) {
                            if (!this.f21143j.keySet().containsAll(l02.k())) {
                                AbstractC0335i0.c("CaptureSession", "Does not have the proper configured lists");
                                return;
                            } else {
                                AbstractC0335i0.a("CaptureSession", "Attempting to submit CaptureRequest after setting");
                                r(this.f21140g);
                                break;
                            }
                        } else {
                            return;
                        }
                    case 6:
                    case 7:
                    case 8:
                        throw new IllegalStateException("Session configuration cannot be set on a closed/released session.");
                }
            } finally {
            }
        }
    }

    @Override // y.InterfaceC2342z0
    public void close() {
        synchronized (this.f21134a) {
            int i6 = d.f21155a[this.f21145l.ordinal()];
            if (i6 == 1) {
                throw new IllegalStateException("close() should not be possible in state: " + this.f21145l);
            }
            if (i6 != 2) {
                if (i6 != 3) {
                    if (i6 != 4) {
                        if (i6 == 5) {
                            if (this.f21140g != null) {
                                List b6 = this.f21142i.d().b();
                                if (!b6.isEmpty()) {
                                    try {
                                        f(u(b6));
                                    } catch (IllegalStateException e6) {
                                        AbstractC0335i0.d("CaptureSession", "Unable to issue the request before close the capture session", e6);
                                    }
                                }
                            }
                        }
                    }
                    y0.g.g(this.f21138e, "The Opener shouldn't null in state:" + this.f21145l);
                    this.f21138e.e();
                    this.f21145l = e.CLOSED;
                    this.f21140g = null;
                } else {
                    y0.g.g(this.f21138e, "The Opener shouldn't null in state:" + this.f21145l);
                    this.f21138e.e();
                }
            }
            this.f21145l = e.RELEASED;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x000d. Please report as an issue. */
    @Override // y.InterfaceC2342z0
    public D6.g d(boolean z6) {
        synchronized (this.f21134a) {
            switch (d.f21155a[this.f21145l.ordinal()]) {
                case 1:
                    throw new IllegalStateException("release() should not be possible in state: " + this.f21145l);
                case 3:
                    y0.g.g(this.f21138e, "The Opener shouldn't null in state:" + this.f21145l);
                    this.f21138e.e();
                case 2:
                    this.f21145l = e.RELEASED;
                    return N.f.h(null);
                case 5:
                case 6:
                    InterfaceC2301f1 interfaceC2301f1 = this.f21139f;
                    if (interfaceC2301f1 != null) {
                        if (z6) {
                            try {
                                interfaceC2301f1.g();
                            } catch (CameraAccessException e6) {
                                AbstractC0335i0.d("CaptureSession", "Unable to abort captures.", e6);
                            }
                        }
                        this.f21139f.close();
                    }
                case 4:
                    this.f21142i.d().a();
                    this.f21145l = e.RELEASING;
                    y0.g.g(this.f21138e, "The Opener shouldn't null in state:" + this.f21145l);
                    if (this.f21138e.e()) {
                        m();
                        return N.f.h(null);
                    }
                case 7:
                    if (this.f21146m == null) {
                        this.f21146m = AbstractC1728c.a(new AbstractC1728c.InterfaceC0214c() { // from class: y.w0
                            @Override // l0.AbstractC1728c.InterfaceC0214c
                            public final Object a(AbstractC1728c.a aVar) {
                                return C2340y0.i(C2340y0.this, aVar);
                            }
                        });
                    }
                    return this.f21146m;
                default:
                    return N.f.h(null);
            }
        }
    }

    @Override // y.InterfaceC2342z0
    public List e() {
        List unmodifiableList;
        synchronized (this.f21134a) {
            unmodifiableList = Collections.unmodifiableList(this.f21135b);
        }
        return unmodifiableList;
    }

    @Override // y.InterfaceC2342z0
    public void f(List list) {
        synchronized (this.f21134a) {
            try {
                switch (d.f21155a[this.f21145l.ordinal()]) {
                    case 1:
                        throw new IllegalStateException("issueCaptureRequests() should not be possible in state: " + this.f21145l);
                    case 2:
                    case 3:
                    case 4:
                        this.f21135b.addAll(list);
                        break;
                    case 5:
                        this.f21135b.addAll(list);
                        q();
                        break;
                    case 6:
                    case 7:
                    case 8:
                        throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
                }
            } finally {
            }
        }
    }

    @Override // y.InterfaceC2342z0
    public I.L0 g() {
        I.L0 l02;
        synchronized (this.f21134a) {
            l02 = this.f21140g;
        }
        return l02;
    }

    @Override // y.InterfaceC2342z0
    public void h(Map map) {
        synchronized (this.f21134a) {
            this.f21148o = map;
        }
    }

    public final CameraCaptureSession.CaptureCallback l(List list, CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        ArrayList arrayList = new ArrayList(list.size() + captureCallbackArr.length);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC2332u0.a((AbstractC0442n) it.next()));
        }
        Collections.addAll(arrayList, captureCallbackArr);
        return O.a(arrayList);
    }

    public void m() {
        e eVar = this.f21145l;
        e eVar2 = e.RELEASED;
        if (eVar == eVar2) {
            AbstractC0335i0.a("CaptureSession", "Skipping finishClose due to being state RELEASED.");
            return;
        }
        this.f21145l = eVar2;
        this.f21139f = null;
        AbstractC1728c.a aVar = this.f21147n;
        if (aVar != null) {
            aVar.c(null);
            this.f21147n = null;
        }
    }

    public final A.i n(L0.e eVar, Map map, String str) {
        long j6;
        DynamicRangeProfiles d6;
        Surface surface = (Surface) map.get(eVar.e());
        y0.g.g(surface, "Surface in OutputConfig not found in configuredSurfaceMap.");
        A.i iVar = new A.i(eVar.f(), surface);
        if (str != null) {
            iVar.f(str);
        } else {
            iVar.f(eVar.c());
        }
        if (!eVar.d().isEmpty()) {
            iVar.b();
            Iterator it = eVar.d().iterator();
            while (it.hasNext()) {
                Surface surface2 = (Surface) map.get((I.W) it.next());
                y0.g.g(surface2, "Surface in OutputConfig not found in configuredSurfaceMap.");
                iVar.a(surface2);
            }
        }
        if (Build.VERSION.SDK_INT >= 33 && (d6 = this.f21151r.d()) != null) {
            F.C b6 = eVar.b();
            Long a6 = A.b.a(b6, d6);
            if (a6 != null) {
                j6 = a6.longValue();
                iVar.e(j6);
                return iVar;
            }
            AbstractC0335i0.c("CaptureSession", "Requested dynamic range is not supported. Defaulting to STANDARD dynamic range profile.\nRequested dynamic range:\n  " + b6);
        }
        j6 = 1;
        iVar.e(j6);
        return iVar;
    }

    public final List o(List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A.i iVar = (A.i) it.next();
            if (!arrayList.contains(iVar.d())) {
                arrayList.add(iVar.d());
                arrayList2.add(iVar);
            }
        }
        return arrayList2;
    }

    public int p(List list) {
        C2317m0 c2317m0;
        ArrayList arrayList;
        boolean z6;
        synchronized (this.f21134a) {
            try {
                if (this.f21145l != e.OPENED) {
                    AbstractC0335i0.a("CaptureSession", "Skipping issueBurstCaptureRequest due to session closed");
                    return -1;
                }
                if (list.isEmpty()) {
                    return -1;
                }
                try {
                    c2317m0 = new C2317m0();
                    arrayList = new ArrayList();
                    AbstractC0335i0.a("CaptureSession", "Issuing capture request.");
                    Iterator it = list.iterator();
                    z6 = false;
                    while (it.hasNext()) {
                        I.N n6 = (I.N) it.next();
                        if (n6.g().isEmpty()) {
                            AbstractC0335i0.a("CaptureSession", "Skipping issuing empty capture request.");
                        } else {
                            Iterator it2 = n6.g().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    I.W w6 = (I.W) it2.next();
                                    if (!this.f21143j.containsKey(w6)) {
                                        AbstractC0335i0.a("CaptureSession", "Skipping capture request with invalid surface: " + w6);
                                        break;
                                    }
                                } else {
                                    if (n6.i() == 2) {
                                        z6 = true;
                                    }
                                    N.a k6 = N.a.k(n6);
                                    if (n6.i() == 5 && n6.d() != null) {
                                        k6.p(n6.d());
                                    }
                                    I.L0 l02 = this.f21140g;
                                    if (l02 != null) {
                                        k6.e(l02.h().f());
                                    }
                                    k6.e(this.f21141h);
                                    k6.e(n6.f());
                                    CaptureRequest c6 = AbstractC2306h0.c(k6.h(), this.f21139f.h(), this.f21143j);
                                    if (c6 == null) {
                                        AbstractC0335i0.a("CaptureSession", "Skipping issuing request without surface.");
                                        return -1;
                                    }
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator it3 = n6.c().iterator();
                                    while (it3.hasNext()) {
                                        AbstractC2332u0.b((AbstractC0442n) it3.next(), arrayList2);
                                    }
                                    c2317m0.a(c6, arrayList2);
                                    arrayList.add(c6);
                                }
                            }
                        }
                    }
                } catch (CameraAccessException e6) {
                    AbstractC0335i0.c("CaptureSession", "Unable to access camera: " + e6.getMessage());
                    Thread.dumpStack();
                }
                if (arrayList.isEmpty()) {
                    AbstractC0335i0.a("CaptureSession", "Skipping issuing burst request due to no valid request elements");
                    return -1;
                }
                if (this.f21149p.a(arrayList, z6)) {
                    this.f21139f.k();
                    c2317m0.c(new C2317m0.a() { // from class: y.v0
                        @Override // y.C2317m0.a
                        public final void a(CameraCaptureSession cameraCaptureSession, int i6, boolean z7) {
                            C2340y0.j(C2340y0.this, cameraCaptureSession, i6, z7);
                        }
                    });
                }
                if (this.f21150q.b(arrayList, z6)) {
                    c2317m0.a((CaptureRequest) arrayList.get(arrayList.size() - 1), Collections.singletonList(new c()));
                }
                return this.f21139f.e(arrayList, c2317m0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void q() {
        if (this.f21135b.isEmpty()) {
            return;
        }
        try {
            p(this.f21135b);
        } finally {
            this.f21135b.clear();
        }
    }

    public int r(I.L0 l02) {
        synchronized (this.f21134a) {
            try {
            } catch (Throwable th) {
                throw th;
            }
            if (l02 == null) {
                AbstractC0335i0.a("CaptureSession", "Skipping issueRepeatingCaptureRequests for no configuration case.");
                return -1;
            }
            if (this.f21145l != e.OPENED) {
                AbstractC0335i0.a("CaptureSession", "Skipping issueRepeatingCaptureRequests due to session closed");
                return -1;
            }
            I.N h6 = l02.h();
            if (h6.g().isEmpty()) {
                AbstractC0335i0.a("CaptureSession", "Skipping issueRepeatingCaptureRequests for no surface.");
                try {
                    this.f21139f.k();
                } catch (CameraAccessException e6) {
                    AbstractC0335i0.c("CaptureSession", "Unable to access camera: " + e6.getMessage());
                    Thread.dumpStack();
                }
                return -1;
            }
            try {
                AbstractC0335i0.a("CaptureSession", "Issuing request for session.");
                N.a k6 = N.a.k(h6);
                I.P s6 = s(this.f21142i.d().e());
                this.f21141h = s6;
                k6.e(s6);
                CaptureRequest c6 = AbstractC2306h0.c(k6.h(), this.f21139f.h(), this.f21143j);
                if (c6 == null) {
                    AbstractC0335i0.a("CaptureSession", "Skipping issuing empty request for session.");
                    return -1;
                }
                return this.f21139f.i(c6, l(h6.c(), this.f21136c));
            } catch (CameraAccessException e7) {
                AbstractC0335i0.c("CaptureSession", "Unable to access camera: " + e7.getMessage());
                Thread.dumpStack();
                return -1;
            }
            throw th;
        }
    }

    public final D6.g t(List list, I.L0 l02, CameraDevice cameraDevice) {
        synchronized (this.f21134a) {
            try {
                int i6 = d.f21155a[this.f21145l.ordinal()];
                if (i6 != 1 && i6 != 2) {
                    if (i6 == 3) {
                        this.f21143j.clear();
                        for (int i7 = 0; i7 < list.size(); i7++) {
                            this.f21143j.put((I.W) this.f21144k.get(i7), (Surface) list.get(i7));
                        }
                        this.f21145l = e.OPENING;
                        AbstractC0335i0.a("CaptureSession", "Opening capture session.");
                        InterfaceC2301f1.a v6 = s1.v(this.f21137d, new s1.a(l02.i()));
                        C2253a c2253a = new C2253a(l02.d());
                        C2255c Y5 = c2253a.Y(C2255c.e());
                        this.f21142i = Y5;
                        List d6 = Y5.d().d();
                        N.a k6 = N.a.k(l02.h());
                        Iterator it = d6.iterator();
                        while (it.hasNext()) {
                            k6.e(((I.N) it.next()).f());
                        }
                        ArrayList arrayList = new ArrayList();
                        String d02 = c2253a.d0(null);
                        for (L0.e eVar : l02.f()) {
                            A.i n6 = n(eVar, this.f21143j, d02);
                            if (this.f21148o.containsKey(eVar.e())) {
                                n6.g(((Long) this.f21148o.get(eVar.e())).longValue());
                            }
                            arrayList.add(n6);
                        }
                        A.o a6 = this.f21138e.a(0, o(arrayList), v6);
                        if (l02.l() == 5 && l02.e() != null) {
                            a6.f(A.h.b(l02.e()));
                        }
                        try {
                            CaptureRequest d7 = AbstractC2306h0.d(k6.h(), cameraDevice);
                            if (d7 != null) {
                                a6.g(d7);
                            }
                            return this.f21138e.c(cameraDevice, a6, this.f21144k);
                        } catch (CameraAccessException e6) {
                            return N.f.f(e6);
                        }
                    }
                    if (i6 != 5) {
                        return N.f.f(new CancellationException("openCaptureSession() not execute in state: " + this.f21145l));
                    }
                }
                return N.f.f(new IllegalStateException("openCaptureSession() should not be possible in state: " + this.f21145l));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public List u(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            N.a k6 = N.a.k((I.N) it.next());
            k6.s(1);
            Iterator it2 = this.f21140g.h().g().iterator();
            while (it2.hasNext()) {
                k6.f((I.W) it2.next());
            }
            arrayList.add(k6.h());
        }
        return arrayList;
    }
}
