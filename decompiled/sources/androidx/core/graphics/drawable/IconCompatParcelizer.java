package androidx.core.graphics.drawable;

import J2.a;
import android.content.res.ColorStateList;
import android.os.Parcelable;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f8586a = aVar.p(iconCompat.f8586a, 1);
        iconCompat.f8588c = aVar.j(iconCompat.f8588c, 2);
        iconCompat.f8589d = aVar.r(iconCompat.f8589d, 3);
        iconCompat.f8590e = aVar.p(iconCompat.f8590e, 4);
        iconCompat.f8591f = aVar.p(iconCompat.f8591f, 5);
        iconCompat.f8592g = (ColorStateList) aVar.r(iconCompat.f8592g, 6);
        iconCompat.f8594i = aVar.t(iconCompat.f8594i, 7);
        iconCompat.f8595j = aVar.t(iconCompat.f8595j, 8);
        iconCompat.r();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.x(true, true);
        iconCompat.s(aVar.f());
        int i6 = iconCompat.f8586a;
        if (-1 != i6) {
            aVar.F(i6, 1);
        }
        byte[] bArr = iconCompat.f8588c;
        if (bArr != null) {
            aVar.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f8589d;
        if (parcelable != null) {
            aVar.H(parcelable, 3);
        }
        int i7 = iconCompat.f8590e;
        if (i7 != 0) {
            aVar.F(i7, 4);
        }
        int i8 = iconCompat.f8591f;
        if (i8 != 0) {
            aVar.F(i8, 5);
        }
        ColorStateList colorStateList = iconCompat.f8592g;
        if (colorStateList != null) {
            aVar.H(colorStateList, 6);
        }
        String str = iconCompat.f8594i;
        if (str != null) {
            aVar.J(str, 7);
        }
        String str2 = iconCompat.f8595j;
        if (str2 != null) {
            aVar.J(str2, 8);
        }
    }
}
