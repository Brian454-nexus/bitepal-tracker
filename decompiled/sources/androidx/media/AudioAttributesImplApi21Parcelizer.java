package androidx.media;

import J2.a;
import android.media.AudioAttributes;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(a aVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f9112a = (AudioAttributes) aVar.r(audioAttributesImplApi21.f9112a, 1);
        audioAttributesImplApi21.f9113b = aVar.p(audioAttributesImplApi21.f9113b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, a aVar) {
        aVar.x(false, false);
        aVar.H(audioAttributesImplApi21.f9112a, 1);
        aVar.F(audioAttributesImplApi21.f9113b, 2);
    }
}
