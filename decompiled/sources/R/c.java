package R;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4564a;

    public c() {
        this.f4564a = Q.b.a(Q.f.class) != null;
    }

    public int a(byte[] bArr) {
        byte b6;
        if (!this.f4564a) {
            return bArr.length;
        }
        int i6 = 2;
        while (i6 + 4 <= bArr.length && (b6 = bArr[i6]) == -1) {
            int i7 = i6 + 2;
            int i8 = ((bArr[i7] & 255) << 8) | (bArr[i6 + 3] & 255);
            if (b6 == -1 && bArr[i6 + 1] == -38) {
                while (true) {
                    int i9 = i7 + 2;
                    if (i9 > bArr.length) {
                        return bArr.length;
                    }
                    if (bArr[i7] == -1 && bArr[i7 + 1] == -39) {
                        return i9;
                    }
                    i7++;
                }
            } else {
                i6 += i8 + 2;
            }
        }
        return bArr.length;
    }
}
