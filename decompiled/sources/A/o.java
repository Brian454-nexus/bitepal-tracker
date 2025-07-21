package A;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final c f15a;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public final List f18a;

        /* renamed from: b, reason: collision with root package name */
        public final CameraCaptureSession.StateCallback f19b;

        /* renamed from: c, reason: collision with root package name */
        public final Executor f20c;

        /* renamed from: d, reason: collision with root package name */
        public final int f21d;

        /* renamed from: e, reason: collision with root package name */
        public h f22e = null;

        /* renamed from: f, reason: collision with root package name */
        public CaptureRequest f23f = null;

        public b(int i6, List list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this.f21d = i6;
            this.f18a = Collections.unmodifiableList(new ArrayList(list));
            this.f19b = stateCallback;
            this.f20c = executor;
        }

        @Override // A.o.c
        public h a() {
            return this.f22e;
        }

        @Override // A.o.c
        public Executor b() {
            return this.f20c;
        }

        @Override // A.o.c
        public CameraCaptureSession.StateCallback c() {
            return this.f19b;
        }

        @Override // A.o.c
        public Object d() {
            return null;
        }

        @Override // A.o.c
        public int e() {
            return this.f21d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (Objects.equals(this.f22e, bVar.f22e) && this.f21d == bVar.f21d && this.f18a.size() == bVar.f18a.size()) {
                    for (int i6 = 0; i6 < this.f18a.size(); i6++) {
                        if (!((i) this.f18a.get(i6)).equals(bVar.f18a.get(i6))) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        @Override // A.o.c
        public List f() {
            return this.f18a;
        }

        @Override // A.o.c
        public void g(h hVar) {
            if (this.f21d == 1) {
                throw new UnsupportedOperationException("Method not supported for high speed session types");
            }
            this.f22e = hVar;
        }

        @Override // A.o.c
        public void h(CaptureRequest captureRequest) {
            this.f23f = captureRequest;
        }

        public int hashCode() {
            int hashCode = this.f18a.hashCode() ^ 31;
            int i6 = (hashCode << 5) - hashCode;
            h hVar = this.f22e;
            int hashCode2 = (hVar == null ? 0 : hVar.hashCode()) ^ i6;
            return this.f21d ^ ((hashCode2 << 5) - hashCode2);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface c {
        h a();

        Executor b();

        CameraCaptureSession.StateCallback c();

        Object d();

        int e();

        List f();

        void g(h hVar);

        void h(CaptureRequest captureRequest);
    }

    public o(int i6, List list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
        if (Build.VERSION.SDK_INT < 28) {
            this.f15a = new b(i6, list, executor, stateCallback);
        } else {
            this.f15a = new a(i6, list, executor, stateCallback);
        }
    }

    public static List h(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((OutputConfiguration) ((i) it.next()).h());
        }
        return arrayList;
    }

    public static List i(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(i.i((OutputConfiguration) it.next()));
        }
        return arrayList;
    }

    public Executor a() {
        return this.f15a.b();
    }

    public h b() {
        return this.f15a.a();
    }

    public List c() {
        return this.f15a.f();
    }

    public int d() {
        return this.f15a.e();
    }

    public CameraCaptureSession.StateCallback e() {
        return this.f15a.c();
    }

    public boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f15a.equals(((o) obj).f15a);
        }
        return false;
    }

    public void f(h hVar) {
        this.f15a.g(hVar);
    }

    public void g(CaptureRequest captureRequest) {
        this.f15a.h(captureRequest);
    }

    public int hashCode() {
        return this.f15a.hashCode();
    }

    public Object j() {
        return this.f15a.d();
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        public final SessionConfiguration f16a;

        /* renamed from: b, reason: collision with root package name */
        public final List f17b;

        public a(Object obj) {
            SessionConfiguration sessionConfiguration = (SessionConfiguration) obj;
            this.f16a = sessionConfiguration;
            this.f17b = Collections.unmodifiableList(o.i(sessionConfiguration.getOutputConfigurations()));
        }

        @Override // A.o.c
        public h a() {
            return h.b(this.f16a.getInputConfiguration());
        }

        @Override // A.o.c
        public Executor b() {
            return this.f16a.getExecutor();
        }

        @Override // A.o.c
        public CameraCaptureSession.StateCallback c() {
            return this.f16a.getStateCallback();
        }

        @Override // A.o.c
        public Object d() {
            return this.f16a;
        }

        @Override // A.o.c
        public int e() {
            return this.f16a.getSessionType();
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return Objects.equals(this.f16a, ((a) obj).f16a);
            }
            return false;
        }

        @Override // A.o.c
        public List f() {
            return this.f17b;
        }

        @Override // A.o.c
        public void g(h hVar) {
            this.f16a.setInputConfiguration((InputConfiguration) hVar.a());
        }

        @Override // A.o.c
        public void h(CaptureRequest captureRequest) {
            this.f16a.setSessionParameters(captureRequest);
        }

        public int hashCode() {
            return this.f16a.hashCode();
        }

        public a(int i6, List list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this(new SessionConfiguration(i6, o.h(list), executor, stateCallback));
        }
    }
}
