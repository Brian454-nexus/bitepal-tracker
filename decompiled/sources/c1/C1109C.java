package c1;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import c1.InterfaceC1129k;
import java.util.ArrayList;
import java.util.List;

/* renamed from: c1.C, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1109C implements InterfaceC1129k {

    /* renamed from: b, reason: collision with root package name */
    public static final List f10547b = new ArrayList(50);

    /* renamed from: a, reason: collision with root package name */
    public final Handler f10548a;

    /* renamed from: c1.C$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b implements InterfaceC1129k.a {

        /* renamed from: a, reason: collision with root package name */
        public Message f10549a;

        /* renamed from: b, reason: collision with root package name */
        public C1109C f10550b;

        public b() {
        }

        @Override // c1.InterfaceC1129k.a
        public void a() {
            ((Message) AbstractC1119a.e(this.f10549a)).sendToTarget();
            b();
        }

        public final void b() {
            this.f10549a = null;
            this.f10550b = null;
            C1109C.n(this);
        }

        public boolean c(Handler handler) {
            boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) AbstractC1119a.e(this.f10549a));
            b();
            return sendMessageAtFrontOfQueue;
        }

        public b d(Message message, C1109C c1109c) {
            this.f10549a = message;
            this.f10550b = c1109c;
            return this;
        }
    }

    public C1109C(Handler handler) {
        this.f10548a = handler;
    }

    public static b m() {
        b bVar;
        List list = f10547b;
        synchronized (list) {
            try {
                bVar = list.isEmpty() ? new b() : (b) list.remove(list.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    public static void n(b bVar) {
        List list = f10547b;
        synchronized (list) {
            try {
                if (list.size() < 50) {
                    list.add(bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // c1.InterfaceC1129k
    public InterfaceC1129k.a a(int i6, int i7, int i8) {
        return m().d(this.f10548a.obtainMessage(i6, i7, i8), this);
    }

    @Override // c1.InterfaceC1129k
    public boolean b(InterfaceC1129k.a aVar) {
        return ((b) aVar).c(this.f10548a);
    }

    @Override // c1.InterfaceC1129k
    public boolean c(Runnable runnable) {
        return this.f10548a.post(runnable);
    }

    @Override // c1.InterfaceC1129k
    public InterfaceC1129k.a d(int i6) {
        return m().d(this.f10548a.obtainMessage(i6), this);
    }

    @Override // c1.InterfaceC1129k
    public boolean e(int i6) {
        AbstractC1119a.a(i6 != 0);
        return this.f10548a.hasMessages(i6);
    }

    @Override // c1.InterfaceC1129k
    public boolean f(int i6) {
        return this.f10548a.sendEmptyMessage(i6);
    }

    @Override // c1.InterfaceC1129k
    public boolean g(int i6, long j6) {
        return this.f10548a.sendEmptyMessageAtTime(i6, j6);
    }

    @Override // c1.InterfaceC1129k
    public void h(int i6) {
        AbstractC1119a.a(i6 != 0);
        this.f10548a.removeMessages(i6);
    }

    @Override // c1.InterfaceC1129k
    public InterfaceC1129k.a i(int i6, Object obj) {
        return m().d(this.f10548a.obtainMessage(i6, obj), this);
    }

    @Override // c1.InterfaceC1129k
    public void j(Object obj) {
        this.f10548a.removeCallbacksAndMessages(obj);
    }

    @Override // c1.InterfaceC1129k
    public Looper k() {
        return this.f10548a.getLooper();
    }
}
