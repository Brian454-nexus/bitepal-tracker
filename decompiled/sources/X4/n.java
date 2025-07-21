package X4;

import java.util.Collections;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface n {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final R4.f f6276a;

        /* renamed from: b, reason: collision with root package name */
        public final List f6277b;

        /* renamed from: c, reason: collision with root package name */
        public final com.bumptech.glide.load.data.d f6278c;

        public a(R4.f fVar, com.bumptech.glide.load.data.d dVar) {
            this(fVar, Collections.EMPTY_LIST, dVar);
        }

        public a(R4.f fVar, List list, com.bumptech.glide.load.data.d dVar) {
            this.f6276a = (R4.f) n5.k.d(fVar);
            this.f6277b = (List) n5.k.d(list);
            this.f6278c = (com.bumptech.glide.load.data.d) n5.k.d(dVar);
        }
    }

    a a(Object obj, int i6, int i7, R4.h hVar);

    boolean b(Object obj);
}
