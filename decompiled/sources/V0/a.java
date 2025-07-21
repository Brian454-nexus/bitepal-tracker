package V0;

import android.os.Bundle;
import androidx.lifecycle.InterfaceC1061m;
import androidx.lifecycle.Q;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class a {

    /* renamed from: V0.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface InterfaceC0090a {
        W0.b a(int i6, Bundle bundle);

        void b(W0.b bVar, Object obj);

        void c(W0.b bVar);
    }

    public static a b(InterfaceC1061m interfaceC1061m) {
        return new b(interfaceC1061m, ((Q) interfaceC1061m).getViewModelStore());
    }

    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract W0.b c(int i6, Bundle bundle, InterfaceC0090a interfaceC0090a);

    public abstract void d();
}
