package e5;

import R4.k;
import T4.v;
import android.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: e5.d, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C1274d implements k {
    @Override // R4.k
    public R4.c a(R4.h hVar) {
        return R4.c.SOURCE;
    }

    @Override // R4.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean b(v vVar, File file, R4.h hVar) {
        try {
            n5.a.f(((C1273c) vVar.get()).c(), file);
            return true;
        } catch (IOException e6) {
            if (!Log.isLoggable("GifEncoder", 5)) {
                return false;
            }
            Log.w("GifEncoder", "Failed to encode GIF drawable data", e6);
            return false;
        }
    }
}
