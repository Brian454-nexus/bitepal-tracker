package e0;

import I.T0;
import android.media.MediaFormat;
import e0.C1220c;
import java.util.Objects;

/* renamed from: e0.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC1218a implements InterfaceC1231n {

    /* renamed from: e0.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class AbstractC0192a {
        public abstract AbstractC1218a a();

        public AbstractC1218a b() {
            AbstractC1218a a6 = a();
            if (Objects.equals(a6.c(), "audio/mp4a-latm") && a6.g() == -1) {
                throw new IllegalArgumentException("Encoder mime set to AAC, but no AAC profile was provided.");
            }
            return a6;
        }

        public abstract AbstractC0192a c(int i6);

        public abstract AbstractC0192a d(int i6);

        public abstract AbstractC0192a e(T0 t02);

        public abstract AbstractC0192a f(String str);

        public abstract AbstractC0192a g(int i6);

        public abstract AbstractC0192a h(int i6);
    }

    public static AbstractC0192a d() {
        return new C1220c.b().g(-1);
    }

    @Override // e0.InterfaceC1231n
    public MediaFormat a() {
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat(c(), h(), f());
        createAudioFormat.setInteger("bitrate", e());
        if (g() != -1) {
            if (c().equals("audio/mp4a-latm")) {
                createAudioFormat.setInteger("aac-profile", g());
                return createAudioFormat;
            }
            createAudioFormat.setInteger("profile", g());
        }
        return createAudioFormat;
    }

    @Override // e0.InterfaceC1231n
    public abstract T0 b();

    @Override // e0.InterfaceC1231n
    public abstract String c();

    public abstract int e();

    public abstract int f();

    public abstract int g();

    public abstract int h();
}
