package X;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.b, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC0793b {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f5838a = Collections.unmodifiableSet(new HashSet(Arrays.asList(2, 3, 4)));

    public static AbstractC0793b d(int i6, Throwable th, double d6) {
        return new C0795d(i6, d6, th);
    }

    public abstract double a();

    public abstract int b();

    public abstract Throwable c();
}
