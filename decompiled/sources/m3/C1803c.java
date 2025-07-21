package m3;

import D3.f;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: m3.c, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1803c implements f {

    /* renamed from: a, reason: collision with root package name */
    public final String f17439a;

    /* renamed from: b, reason: collision with root package name */
    public final f.a f17440b;

    /* renamed from: c, reason: collision with root package name */
    public B3.a f17441c;

    public C1803c(String library) {
        Intrinsics.checkNotNullParameter(library, "library");
        this.f17439a = library;
        this.f17440b = f.a.f798b;
    }

    @Override // D3.f
    public C3.a c(C3.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.x() == null) {
            event.m0(this.f17439a);
        } else {
            event.m0(this.f17439a + '_' + event.x());
        }
        return super.c(event);
    }

    @Override // D3.f
    public void d(B3.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f17441c = aVar;
    }

    @Override // D3.f
    public f.a getType() {
        return this.f17440b;
    }
}
