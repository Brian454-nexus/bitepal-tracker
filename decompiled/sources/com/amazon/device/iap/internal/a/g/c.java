package com.amazon.device.iap.internal.a.g;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class c extends a {
    public c(com.amazon.device.iap.internal.a.c cVar, boolean z6) {
        super(cVar, com.amazon.a.a.o.b.ah);
        a(com.amazon.a.a.o.b.aa, Boolean.valueOf(z6));
    }

    @Override // com.amazon.a.a.n.a.h
    public void l() {
        Object a6 = j().a().a(com.amazon.a.a.o.b.ao);
        if (a6 != null) {
            Boolean bool = Boolean.TRUE;
            if (bool.equals(a6)) {
                a(com.amazon.a.a.o.b.ab, bool);
                super.l();
            }
        }
        a(com.amazon.a.a.o.b.ab, Boolean.FALSE);
        super.l();
    }
}
