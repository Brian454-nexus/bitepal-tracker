package V4;

import V4.a;
import java.io.File;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class d implements a.InterfaceC0093a {

    /* renamed from: a, reason: collision with root package name */
    public final long f5312a;

    /* renamed from: b, reason: collision with root package name */
    public final a f5313b;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface a {
        File a();
    }

    public d(a aVar, long j6) {
        this.f5312a = j6;
        this.f5313b = aVar;
    }

    @Override // V4.a.InterfaceC0093a
    public V4.a build() {
        File a6 = this.f5313b.a();
        if (a6 == null) {
            return null;
        }
        if (a6.isDirectory() || a6.mkdirs()) {
            return e.c(a6, this.f5312a);
        }
        return null;
    }
}
