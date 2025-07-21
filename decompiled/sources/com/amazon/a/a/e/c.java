package com.amazon.a.a.e;

import com.amazon.a.a.e.a;
import java.util.Date;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class c<T extends a<T>> extends a<T> {

    /* renamed from: b, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f10892b = new com.amazon.a.a.o.c("RelativeExpirable");

    /* renamed from: c, reason: collision with root package name */
    private static final long f10893c = 1000;

    /* renamed from: d, reason: collision with root package name */
    private final Date f10894d = new Date();

    @Override // com.amazon.a.a.e.a
    public final Date a() {
        com.amazon.a.a.o.c cVar = f10892b;
        cVar.a("RelativeExpiration duration: " + h() + ", expirable: " + this);
        Date date = new Date(this.f10894d.getTime() + (h() * f10893c));
        StringBuilder sb = new StringBuilder();
        sb.append("Expiration should occur at time: ");
        sb.append(date);
        cVar.a(sb.toString());
        return date;
    }

    public abstract long h();
}
