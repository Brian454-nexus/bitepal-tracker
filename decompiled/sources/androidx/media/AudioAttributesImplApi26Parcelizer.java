package androidx.media;

import J2.a;
import android.media.AudioAttributes;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(a aVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f9112a = (AudioAttributes) aVar.r(audioAttributesImplApi26.f9112a, 1);
        audioAttributesImplApi26.f9113b = aVar.p(audioAttributesImplApi26.f9113b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, a aVar) {
        aVar.x(false, false);
        aVar.H(audioAttributesImplApi26.f9112a, 1);
        aVar.F(audioAttributesImplApi26.f9113b, 2);
    }
}
