package F3;

import D3.f;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    public final f.a f1628a = f.a.f797a;

    /* renamed from: b, reason: collision with root package name */
    public B3.a f1629b;

    /* renamed from: c, reason: collision with root package name */
    public I3.b f1630c;

    @Override // D3.f
    public void a(B3.a amplitude) {
        Intrinsics.checkNotNullParameter(amplitude, "amplitude");
        super.a(amplitude);
        this.f1630c = I3.d.f2801b.a(amplitude.m().l()).c();
    }

    @Override // D3.f
    public C3.a c(C3.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.I0() != null) {
            I3.b bVar = this.f1630c;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("eventBridge");
                bVar = null;
            }
            bVar.a(I3.f.f2808b, d.a(event));
        }
        return event;
    }

    @Override // D3.f
    public void d(B3.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f1629b = aVar;
    }

    @Override // D3.f
    public f.a getType() {
        return this.f1628a;
    }
}
