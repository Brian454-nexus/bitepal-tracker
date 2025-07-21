package androidx.media;

import java.util.Arrays;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a, reason: collision with root package name */
    public int f9114a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f9115b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f9116c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f9117d = -1;

    public int a() {
        return this.f9115b;
    }

    public int b() {
        int i6 = this.f9116c;
        int c6 = c();
        if (c6 == 6) {
            i6 |= 4;
        } else if (c6 == 7) {
            i6 |= 1;
        }
        return i6 & 273;
    }

    public int c() {
        int i6 = this.f9117d;
        return i6 != -1 ? i6 : AudioAttributesCompat.a(false, this.f9116c, this.f9114a);
    }

    public int d() {
        return this.f9114a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        return this.f9115b == audioAttributesImplBase.a() && this.f9116c == audioAttributesImplBase.b() && this.f9114a == audioAttributesImplBase.d() && this.f9117d == audioAttributesImplBase.f9117d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f9115b), Integer.valueOf(this.f9116c), Integer.valueOf(this.f9114a), Integer.valueOf(this.f9117d)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f9117d != -1) {
            sb.append(" stream=");
            sb.append(this.f9117d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.b(this.f9114a));
        sb.append(" content=");
        sb.append(this.f9115b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f9116c).toUpperCase());
        return sb.toString();
    }
}
