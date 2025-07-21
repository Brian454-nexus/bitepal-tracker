package androidx.media;

import android.media.AudioAttributes;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a, reason: collision with root package name */
    public AudioAttributes f9112a;

    /* renamed from: b, reason: collision with root package name */
    public int f9113b = -1;

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f9112a.equals(((AudioAttributesImplApi21) obj).f9112a);
        }
        return false;
    }

    public int hashCode() {
        return this.f9112a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f9112a;
    }
}
