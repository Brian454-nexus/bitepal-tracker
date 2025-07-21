package T4;

import android.util.Log;
import f5.InterfaceC1307e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final Class f5013a;

    /* renamed from: b, reason: collision with root package name */
    public final List f5014b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1307e f5015c;

    /* renamed from: d, reason: collision with root package name */
    public final y0.d f5016d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5017e;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface a {
        v a(v vVar);
    }

    public i(Class cls, Class cls2, Class cls3, List list, InterfaceC1307e interfaceC1307e, y0.d dVar) {
        this.f5013a = cls;
        this.f5014b = list;
        this.f5015c = interfaceC1307e;
        this.f5016d = dVar;
        this.f5017e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public v a(com.bumptech.glide.load.data.e eVar, int i6, int i7, R4.h hVar, a aVar) {
        return this.f5015c.a(aVar.a(b(eVar, i6, i7, hVar)), hVar);
    }

    public final v b(com.bumptech.glide.load.data.e eVar, int i6, int i7, R4.h hVar) {
        List list = (List) n5.k.d(this.f5016d.b());
        try {
            return c(eVar, i6, i7, hVar, list);
        } finally {
            this.f5016d.a(list);
        }
    }

    public final v c(com.bumptech.glide.load.data.e eVar, int i6, int i7, R4.h hVar, List list) {
        int size = this.f5014b.size();
        v vVar = null;
        for (int i8 = 0; i8 < size; i8++) {
            R4.j jVar = (R4.j) this.f5014b.get(i8);
            try {
                if (jVar.b(eVar.a(), hVar)) {
                    vVar = jVar.a(eVar.a(), i6, i7, hVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e6) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + jVar, e6);
                }
                list.add(e6);
            }
            if (vVar != null) {
                break;
            }
        }
        if (vVar != null) {
            return vVar;
        }
        throw new q(this.f5017e, new ArrayList(list));
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f5013a + ", decoders=" + this.f5014b + ", transcoder=" + this.f5015c + '}';
    }
}
