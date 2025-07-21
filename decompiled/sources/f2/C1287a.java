package f2;

import android.text.TextUtils;
import c1.AbstractC1119a;
import com.amazon.a.a.o.b.f;

/* renamed from: f2.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1287a {

    /* renamed from: a, reason: collision with root package name */
    public final int f14031a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14032b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14033c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14034d;

    /* renamed from: e, reason: collision with root package name */
    public final int f14035e;

    public C1287a(int i6, int i7, int i8, int i9, int i10) {
        this.f14031a = i6;
        this.f14032b = i7;
        this.f14033c = i8;
        this.f14034d = i9;
        this.f14035e = i10;
    }

    public static C1287a a(String str) {
        char c6;
        AbstractC1119a.a(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), f.f11248a);
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        int i9 = -1;
        for (int i10 = 0; i10 < split.length; i10++) {
            String e6 = y6.c.e(split[i10].trim());
            e6.getClass();
            switch (e6.hashCode()) {
                case 100571:
                    if (e6.equals("end")) {
                        c6 = 0;
                        break;
                    }
                    break;
                case 3556653:
                    if (e6.equals("text")) {
                        c6 = 1;
                        break;
                    }
                    break;
                case 109757538:
                    if (e6.equals("start")) {
                        c6 = 2;
                        break;
                    }
                    break;
                case 109780401:
                    if (e6.equals("style")) {
                        c6 = 3;
                        break;
                    }
                    break;
            }
            c6 = 65535;
            switch (c6) {
                case 0:
                    i7 = i10;
                    break;
                case 1:
                    i9 = i10;
                    break;
                case 2:
                    i6 = i10;
                    break;
                case 3:
                    i8 = i10;
                    break;
            }
        }
        if (i6 == -1 || i7 == -1 || i9 == -1) {
            return null;
        }
        return new C1287a(i6, i7, i8, i9, split.length);
    }
}
