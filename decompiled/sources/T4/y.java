package T4;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    public boolean f5137a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f5138b = new Handler(Looper.getMainLooper(), new a());

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((v) message.obj).a();
            return true;
        }
    }

    public synchronized void a(v vVar, boolean z6) {
        try {
            if (!this.f5137a && !z6) {
                this.f5137a = true;
                vVar.a();
                this.f5137a = false;
            }
            this.f5138b.obtainMessage(1, vVar).sendToTarget();
        } catch (Throwable th) {
            throw th;
        }
    }
}
