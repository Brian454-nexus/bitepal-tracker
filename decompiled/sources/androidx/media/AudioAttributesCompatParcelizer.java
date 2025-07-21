package androidx.media;

import J2.a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(a aVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f9111a = (AudioAttributesImpl) aVar.v(audioAttributesCompat.f9111a, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, a aVar) {
        aVar.x(false, false);
        aVar.M(audioAttributesCompat.f9111a, 1);
    }
}
