package androidx.media;

import J2.a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f9114a = aVar.p(audioAttributesImplBase.f9114a, 1);
        audioAttributesImplBase.f9115b = aVar.p(audioAttributesImplBase.f9115b, 2);
        audioAttributesImplBase.f9116c = aVar.p(audioAttributesImplBase.f9116c, 3);
        audioAttributesImplBase.f9117d = aVar.p(audioAttributesImplBase.f9117d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, a aVar) {
        aVar.x(false, false);
        aVar.F(audioAttributesImplBase.f9114a, 1);
        aVar.F(audioAttributesImplBase.f9115b, 2);
        aVar.F(audioAttributesImplBase.f9116c, 3);
        aVar.F(audioAttributesImplBase.f9117d, 4);
    }
}
