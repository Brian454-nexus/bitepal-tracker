package w1;

import android.net.Uri;
import e1.C1252j;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: w1.y, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2239y {

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicLong f20124h = new AtomicLong();

    /* renamed from: a, reason: collision with root package name */
    public final long f20125a;

    /* renamed from: b, reason: collision with root package name */
    public final C1252j f20126b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f20127c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f20128d;

    /* renamed from: e, reason: collision with root package name */
    public final long f20129e;

    /* renamed from: f, reason: collision with root package name */
    public final long f20130f;

    /* renamed from: g, reason: collision with root package name */
    public final long f20131g;

    public C2239y(long j6, C1252j c1252j, long j7) {
        this(j6, c1252j, c1252j.f13820a, Collections.EMPTY_MAP, j7, 0L, 0L);
    }

    public static long a() {
        return f20124h.getAndIncrement();
    }

    public C2239y(long j6, C1252j c1252j, Uri uri, Map map, long j7, long j8, long j9) {
        this.f20125a = j6;
        this.f20126b = c1252j;
        this.f20127c = uri;
        this.f20128d = map;
        this.f20129e = j7;
        this.f20130f = j8;
        this.f20131g = j9;
    }
}
