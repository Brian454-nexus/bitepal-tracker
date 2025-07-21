package T4;

import V4.a;
import java.io.File;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class e implements a.b {

    /* renamed from: a, reason: collision with root package name */
    public final R4.d f4938a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4939b;

    /* renamed from: c, reason: collision with root package name */
    public final R4.h f4940c;

    public e(R4.d dVar, Object obj, R4.h hVar) {
        this.f4938a = dVar;
        this.f4939b = obj;
        this.f4940c = hVar;
    }

    @Override // V4.a.b
    public boolean a(File file) {
        return this.f4938a.b(this.f4939b, file, this.f4940c);
    }
}
