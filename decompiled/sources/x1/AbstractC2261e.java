package x1;

import A1.l;
import Z0.q;
import android.net.Uri;
import c1.AbstractC1119a;
import e1.C1252j;
import e1.C1265w;
import e1.InterfaceC1248f;
import java.util.Map;
import w1.C2239y;

/* renamed from: x1.e, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC2261e implements l.e {

    /* renamed from: a, reason: collision with root package name */
    public final long f20430a = C2239y.a();

    /* renamed from: b, reason: collision with root package name */
    public final C1252j f20431b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20432c;

    /* renamed from: d, reason: collision with root package name */
    public final q f20433d;

    /* renamed from: e, reason: collision with root package name */
    public final int f20434e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f20435f;

    /* renamed from: g, reason: collision with root package name */
    public final long f20436g;

    /* renamed from: h, reason: collision with root package name */
    public final long f20437h;

    /* renamed from: i, reason: collision with root package name */
    public final C1265w f20438i;

    public AbstractC2261e(InterfaceC1248f interfaceC1248f, C1252j c1252j, int i6, q qVar, int i7, Object obj, long j6, long j7) {
        this.f20438i = new C1265w(interfaceC1248f);
        this.f20431b = (C1252j) AbstractC1119a.e(c1252j);
        this.f20432c = i6;
        this.f20433d = qVar;
        this.f20434e = i7;
        this.f20435f = obj;
        this.f20436g = j6;
        this.f20437h = j7;
    }

    public final long b() {
        return this.f20438i.f();
    }

    public final long d() {
        return this.f20437h - this.f20436g;
    }

    public final Map e() {
        return this.f20438i.u();
    }

    public final Uri f() {
        return this.f20438i.t();
    }
}
