package androidx.camera.camera2;

import F.C0333h0;
import F.C0346s;
import F.C0348u;
import F.C0353z;
import I.B;
import I.C;
import I.K;
import I.Z0;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.camera.camera2.Camera2Config;
import java.util.Set;
import y.C2309i0;
import y.C2315l0;
import y.C2335w;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class Camera2Config {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class DefaultProvider implements C0353z.b {
        @Override // F.C0353z.b
        @NonNull
        public C0353z getCameraXConfig() {
            return Camera2Config.c();
        }
    }

    public static /* synthetic */ Z0 a(Context context) {
        return new C2315l0(context);
    }

    public static /* synthetic */ B b(Context context, Object obj, Set set) {
        try {
            return new C2309i0(context, obj, set);
        } catch (C0348u e6) {
            throw new C0333h0(e6);
        }
    }

    public static C0353z c() {
        C.a aVar = new C.a() { // from class: w.a
            @Override // I.C.a
            public final C a(Context context, K k6, C0346s c0346s) {
                return new C2335w(context, k6, c0346s);
            }
        };
        B.a aVar2 = new B.a() { // from class: w.b
            @Override // I.B.a
            public final B a(Context context, Object obj, Set set) {
                return Camera2Config.b(context, obj, set);
            }
        };
        return new C0353z.a().c(aVar).d(aVar2).g(new Z0.c() { // from class: w.c
            @Override // I.Z0.c
            public final Z0 a(Context context) {
                return Camera2Config.a(context);
            }
        }).a();
    }
}
