package X;

import android.util.Size;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final c0 f5855a = new a();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements c0 {
        @Override // X.c0
        public List d(F.C c6) {
            return new ArrayList();
        }
    }

    default Z.g a(Size size, F.C c6) {
        return null;
    }

    default AbstractC0811u b(Size size, F.C c6) {
        return AbstractC0811u.f5980g;
    }

    default Z.g c(AbstractC0811u abstractC0811u, F.C c6) {
        return null;
    }

    List d(F.C c6);
}
