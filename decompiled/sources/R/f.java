package R;

import F.q0;
import I.L0;
import I.W;
import Q.j;
import android.media.MediaCodec;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4567a;

    public f() {
        this.f4567a = Q.b.a(j.class) != null;
    }

    public static /* synthetic */ int a(f fVar, L0.e eVar, L0.e eVar2) {
        fVar.getClass();
        return fVar.b(eVar.e()) - fVar.b(eVar2.e());
    }

    public final int b(W w6) {
        if (w6.g() == MediaCodec.class) {
            return 2;
        }
        return w6.g() == q0.class ? 0 : 1;
    }

    public void c(List list) {
        if (this.f4567a) {
            Collections.sort(list, new Comparator() { // from class: R.e
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return f.a(f.this, (L0.e) obj, (L0.e) obj2);
                }
            });
        }
    }
}
