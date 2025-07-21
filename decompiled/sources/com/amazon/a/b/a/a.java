package com.amazon.a.b.a;

import com.amazon.a.a.d.b;
import com.amazon.a.a.o.b.f;
import com.amazon.a.a.o.d.c;
import java.util.Iterator;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class a extends b {

    /* renamed from: a, reason: collision with root package name */
    private static final long f11299a = 1;

    /* renamed from: b, reason: collision with root package name */
    private final c f11300b;

    public a(c cVar) {
        super("LICENSE_VERIFICATION_FAILURE", "VERIFICATION_ERRORS", a(cVar));
        com.amazon.a.a.o.a.a.a(cVar.a(), "Created a verification exception with a Verifier that has no errors");
        this.f11300b = cVar;
    }

    private static String a(c cVar) {
        StringBuilder sb = new StringBuilder();
        Iterator<com.amazon.a.a.o.d.a> it = cVar.iterator();
        while (it.hasNext()) {
            com.amazon.a.a.o.d.a next = it.next();
            if (sb.length() != 0) {
                sb.append(f.f11248a);
            }
            sb.append(next.a().a());
        }
        return sb.toString();
    }

    public c d() {
        return this.f11300b;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return this.f11300b.toString();
    }
}
