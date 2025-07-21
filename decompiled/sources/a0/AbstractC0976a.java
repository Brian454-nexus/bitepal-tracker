package a0;

import a0.C0996u;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: a0.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC0976a {

    /* renamed from: a, reason: collision with root package name */
    public static final List f7551a = Collections.unmodifiableList(Arrays.asList(48000, 44100, 22050, 11025, 8000, 4800));

    /* renamed from: a0.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class AbstractC0118a {
        public abstract AbstractC0976a a();

        public final AbstractC0976a b() {
            AbstractC0976a a6 = a();
            String str = "";
            if (a6.c() == -1) {
                str = " audioSource";
            }
            if (a6.f() <= 0) {
                str = str + " sampleRate";
            }
            if (a6.e() <= 0) {
                str = str + " channelCount";
            }
            if (a6.b() == -1) {
                str = str + " audioFormat";
            }
            if (str.isEmpty()) {
                return a6;
            }
            throw new IllegalArgumentException("Required settings missing or non-positive:" + str);
        }

        public abstract AbstractC0118a c(int i6);

        public abstract AbstractC0118a d(int i6);

        public abstract AbstractC0118a e(int i6);

        public abstract AbstractC0118a f(int i6);
    }

    public static AbstractC0118a a() {
        return new C0996u.b().d(-1).f(-1).e(-1).c(-1);
    }

    public abstract int b();

    public abstract int c();

    public int d() {
        return AbstractC0995t.e(b(), e());
    }

    public abstract int e();

    public abstract int f();
}
