package T4;

import T4.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    public final Class f5109a;

    /* renamed from: b, reason: collision with root package name */
    public final y0.d f5110b;

    /* renamed from: c, reason: collision with root package name */
    public final List f5111c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5112d;

    public t(Class cls, Class cls2, Class cls3, List list, y0.d dVar) {
        this.f5109a = cls;
        this.f5110b = dVar;
        this.f5111c = (List) n5.k.c(list);
        this.f5112d = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public v a(com.bumptech.glide.load.data.e eVar, R4.h hVar, int i6, int i7, i.a aVar) {
        List list = (List) n5.k.d(this.f5110b.b());
        try {
            return b(eVar, hVar, i6, i7, aVar, list);
        } finally {
            this.f5110b.a(list);
        }
    }

    public final v b(com.bumptech.glide.load.data.e eVar, R4.h hVar, int i6, int i7, i.a aVar, List list) {
        int size = this.f5111c.size();
        v vVar = null;
        for (int i8 = 0; i8 < size; i8++) {
            try {
                vVar = ((i) this.f5111c.get(i8)).a(eVar, i6, i7, hVar, aVar);
            } catch (q e6) {
                list.add(e6);
            }
            if (vVar != null) {
                break;
            }
        }
        if (vVar != null) {
            return vVar;
        }
        throw new q(this.f5112d, new ArrayList(list));
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f5111c.toArray()) + '}';
    }
}
