package W0;

import android.content.Context;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public int f5379a;

    /* renamed from: b, reason: collision with root package name */
    public a f5380b;

    /* renamed from: c, reason: collision with root package name */
    public Context f5381c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5382d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5383e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5384f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5385g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5386h = false;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface a {
        void a(b bVar, Object obj);
    }

    public b(Context context) {
        this.f5381c = context.getApplicationContext();
    }

    public void a() {
        this.f5383e = true;
        k();
    }

    public boolean b() {
        return l();
    }

    public void c() {
        this.f5386h = false;
    }

    public String d(Object obj) {
        StringBuilder sb = new StringBuilder(64);
        if (obj == null) {
            sb.append("null");
        } else {
            Class<?> cls = obj.getClass();
            sb.append(cls.getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(cls)));
            sb.append("}");
        }
        return sb.toString();
    }

    public void e() {
    }

    public void f(Object obj) {
        a aVar = this.f5380b;
        if (aVar != null) {
            aVar.a(this, obj);
        }
    }

    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f5379a);
        printWriter.print(" mListener=");
        printWriter.println(this.f5380b);
        if (this.f5382d || this.f5385g || this.f5386h) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f5382d);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f5385g);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f5386h);
        }
        if (this.f5383e || this.f5384f) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f5383e);
            printWriter.print(" mReset=");
            printWriter.println(this.f5384f);
        }
    }

    public void h() {
        n();
    }

    public boolean i() {
        return this.f5383e;
    }

    public boolean j() {
        return this.f5382d;
    }

    public void k() {
    }

    public abstract boolean l();

    public void m() {
        if (this.f5382d) {
            h();
        } else {
            this.f5385g = true;
        }
    }

    public void n() {
    }

    public void o() {
    }

    public abstract void p();

    public void q() {
    }

    public void r(int i6, a aVar) {
        if (this.f5380b != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.f5380b = aVar;
        this.f5379a = i6;
    }

    public void s() {
        o();
        this.f5384f = true;
        this.f5382d = false;
        this.f5383e = false;
        this.f5385g = false;
        this.f5386h = false;
    }

    public void t() {
        if (this.f5386h) {
            m();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        Class<?> cls = getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append(" id=");
        sb.append(this.f5379a);
        sb.append("}");
        return sb.toString();
    }

    public final void u() {
        this.f5382d = true;
        this.f5384f = false;
        this.f5383e = false;
        p();
    }

    public void v() {
        this.f5382d = false;
        q();
    }

    public void w(a aVar) {
        a aVar2 = this.f5380b;
        if (aVar2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (aVar2 != aVar) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.f5380b = null;
    }
}
