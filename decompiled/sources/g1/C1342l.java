package g1;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import java.io.IOException;
import w1.InterfaceC2212D;

/* renamed from: g1.l, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1342l extends Z0.A {

    /* renamed from: q, reason: collision with root package name */
    public static final String f14709q = AbstractC1117K.x0(1001);

    /* renamed from: r, reason: collision with root package name */
    public static final String f14710r = AbstractC1117K.x0(1002);

    /* renamed from: s, reason: collision with root package name */
    public static final String f14711s = AbstractC1117K.x0(1003);

    /* renamed from: t, reason: collision with root package name */
    public static final String f14712t = AbstractC1117K.x0(1004);

    /* renamed from: u, reason: collision with root package name */
    public static final String f14713u = AbstractC1117K.x0(1005);

    /* renamed from: v, reason: collision with root package name */
    public static final String f14714v = AbstractC1117K.x0(1006);

    /* renamed from: j, reason: collision with root package name */
    public final int f14715j;

    /* renamed from: k, reason: collision with root package name */
    public final String f14716k;

    /* renamed from: l, reason: collision with root package name */
    public final int f14717l;

    /* renamed from: m, reason: collision with root package name */
    public final Z0.q f14718m;

    /* renamed from: n, reason: collision with root package name */
    public final int f14719n;

    /* renamed from: o, reason: collision with root package name */
    public final InterfaceC2212D.b f14720o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f14721p;

    public C1342l(int i6, Throwable th, int i7) {
        this(i6, th, null, i7, null, -1, null, 4, false);
    }

    public static C1342l b(Throwable th, String str, int i6, Z0.q qVar, int i7, boolean z6, int i8) {
        if (qVar == null) {
            i7 = 4;
        }
        return new C1342l(1, th, null, i8, str, i6, qVar, i7, z6);
    }

    public static C1342l c(IOException iOException, int i6) {
        return new C1342l(0, iOException, i6);
    }

    public static C1342l d(RuntimeException runtimeException, int i6) {
        return new C1342l(2, runtimeException, i6);
    }

    public static String e(int i6, String str, String str2, int i7, Z0.q qVar, int i8) {
        String str3;
        if (i6 == 0) {
            str3 = "Source error";
        } else if (i6 != 1) {
            str3 = i6 != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            str3 = str2 + " error, index=" + i7 + ", format=" + qVar + ", format_supported=" + AbstractC1117K.a0(i8);
        }
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        return str3 + ": " + str;
    }

    public C1342l a(InterfaceC2212D.b bVar) {
        return new C1342l((String) AbstractC1117K.i(getMessage()), getCause(), this.f6614a, this.f14715j, this.f14716k, this.f14717l, this.f14718m, this.f14719n, bVar, this.f6615b, this.f14721p);
    }

    public C1342l(int i6, Throwable th, String str, int i7, String str2, int i8, Z0.q qVar, int i9, boolean z6) {
        this(e(i6, str, str2, i8, qVar, i9), th, i7, i6, str2, i8, qVar, i9, null, SystemClock.elapsedRealtime(), z6);
    }

    public C1342l(String str, Throwable th, int i6, int i7, String str2, int i8, Z0.q qVar, int i9, InterfaceC2212D.b bVar, long j6, boolean z6) {
        super(str, th, i6, Bundle.EMPTY, j6);
        AbstractC1119a.a(!z6 || i7 == 1);
        AbstractC1119a.a(th != null || i7 == 3);
        this.f14715j = i7;
        this.f14716k = str2;
        this.f14717l = i8;
        this.f14718m = qVar;
        this.f14719n = i9;
        this.f14720o = bVar;
        this.f14721p = z6;
    }
}
