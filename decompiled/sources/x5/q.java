package x5;

import java.util.Set;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class q implements u5.j {

    /* renamed from: a, reason: collision with root package name */
    public final Set f20644a;

    /* renamed from: b, reason: collision with root package name */
    public final p f20645b;

    /* renamed from: c, reason: collision with root package name */
    public final t f20646c;

    public q(Set set, p pVar, t tVar) {
        this.f20644a = set;
        this.f20645b = pVar;
        this.f20646c = tVar;
    }

    @Override // u5.j
    public u5.i a(String str, Class cls, u5.c cVar, u5.h hVar) {
        if (this.f20644a.contains(cVar)) {
            return new s(this.f20645b, str, cVar, hVar, this.f20646c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, this.f20644a));
    }
}
