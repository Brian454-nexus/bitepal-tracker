package g;

import h.C1394f;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public C1394f.e f14266a = C1394f.b.f14971a;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public C1394f.e f14267a = C1394f.b.f14971a;

        public final h a() {
            h hVar = new h();
            hVar.b(this.f14267a);
            return hVar;
        }

        public final a b(C1394f.e mediaType) {
            Intrinsics.checkNotNullParameter(mediaType, "mediaType");
            this.f14267a = mediaType;
            return this;
        }
    }

    public final C1394f.e a() {
        return this.f14266a;
    }

    public final void b(C1394f.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        this.f14266a = eVar;
    }
}
