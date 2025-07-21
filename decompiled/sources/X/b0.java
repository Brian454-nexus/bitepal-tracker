package X;

import F.H0;
import I.B0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final b0 f5839a = d(0, a.INACTIVE);

    /* renamed from: b, reason: collision with root package name */
    public static final Set f5840b = Collections.unmodifiableSet(new HashSet(Arrays.asList(0, -1)));

    /* renamed from: c, reason: collision with root package name */
    public static final B0 f5841c = I.S.f(d(0, a.ACTIVE));

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public enum a {
        ACTIVE,
        INACTIVE
    }

    public static b0 d(int i6, a aVar) {
        return new C0804m(i6, aVar, null);
    }

    public static b0 e(int i6, a aVar, H0.h hVar) {
        return new C0804m(i6, aVar, hVar);
    }

    public abstract int a();

    public abstract H0.h b();

    public abstract a c();
}
