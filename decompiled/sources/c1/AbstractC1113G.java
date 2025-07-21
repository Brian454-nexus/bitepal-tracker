package c1;

import android.net.Uri;
import android.text.TextUtils;
import java.util.List;

/* renamed from: c1.G, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC1113G {
    public static String a(Uri uri, Uri uri2) {
        if (uri.isOpaque() || uri2.isOpaque()) {
            return uri2.toString();
        }
        String scheme = uri.getScheme();
        String scheme2 = uri2.getScheme();
        if (scheme != null ? !(scheme2 == null || !y6.c.a(scheme, scheme2)) : scheme2 == null) {
            if (AbstractC1117K.c(uri.getAuthority(), uri2.getAuthority())) {
                List<String> pathSegments = uri.getPathSegments();
                List<String> pathSegments2 = uri2.getPathSegments();
                int min = Math.min(pathSegments.size(), pathSegments2.size());
                int i6 = 0;
                for (int i7 = 0; i7 < min && pathSegments.get(i7).equals(pathSegments2.get(i7)); i7++) {
                    i6++;
                }
                StringBuilder sb = new StringBuilder();
                for (int i8 = i6; i8 < pathSegments.size(); i8++) {
                    sb.append("../");
                }
                while (i6 < pathSegments2.size()) {
                    sb.append(pathSegments2.get(i6));
                    if (i6 < pathSegments2.size() - 1) {
                        sb.append("/");
                    }
                    i6++;
                }
                return sb.toString();
            }
        }
        return uri2.toString();
    }

    public static int[] b(String str) {
        int i6;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            length = indexOf;
        }
        int indexOf2 = str.indexOf(63);
        if (indexOf2 == -1 || indexOf2 > length) {
            indexOf2 = length;
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 == -1 || indexOf3 > indexOf2) {
            indexOf3 = indexOf2;
        }
        int indexOf4 = str.indexOf(58);
        if (indexOf4 > indexOf3) {
            indexOf4 = -1;
        }
        int i7 = indexOf4 + 2;
        if (i7 < indexOf2 && str.charAt(indexOf4 + 1) == '/' && str.charAt(i7) == '/') {
            i6 = str.indexOf(47, indexOf4 + 3);
            if (i6 == -1 || i6 > indexOf2) {
                i6 = indexOf2;
            }
        } else {
            i6 = indexOf4 + 1;
        }
        iArr[0] = indexOf4;
        iArr[1] = i6;
        iArr[2] = indexOf2;
        iArr[3] = length;
        return iArr;
    }

    public static boolean c(String str) {
        return (str == null || b(str)[0] == -1) ? false : true;
    }

    public static String d(StringBuilder sb, int i6, int i7) {
        int i8;
        int i9;
        if (i6 >= i7) {
            return sb.toString();
        }
        if (sb.charAt(i6) == '/') {
            i6++;
        }
        int i10 = i6;
        int i11 = i10;
        while (i10 <= i7) {
            if (i10 == i7) {
                i8 = i10;
            } else if (sb.charAt(i10) == '/') {
                i8 = i10 + 1;
            } else {
                i10++;
            }
            int i12 = i11 + 1;
            if (i10 == i12 && sb.charAt(i11) == '.') {
                sb.delete(i11, i8);
                i7 -= i8 - i11;
            } else {
                if (i10 == i11 + 2 && sb.charAt(i11) == '.' && sb.charAt(i12) == '.') {
                    i9 = sb.lastIndexOf("/", i11 - 2) + 1;
                    int i13 = i9 > i6 ? i9 : i6;
                    sb.delete(i13, i8);
                    i7 -= i8 - i13;
                } else {
                    i9 = i10 + 1;
                }
                i11 = i9;
            }
            i10 = i11;
        }
        return sb.toString();
    }

    public static String e(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] b6 = b(str2);
        if (b6[0] != -1) {
            sb.append(str2);
            d(sb, b6[1], b6[2]);
            return sb.toString();
        }
        int[] b7 = b(str);
        if (b6[3] == 0) {
            sb.append((CharSequence) str, 0, b7[3]);
            sb.append(str2);
            return sb.toString();
        }
        if (b6[2] == 0) {
            sb.append((CharSequence) str, 0, b7[2]);
            sb.append(str2);
            return sb.toString();
        }
        int i6 = b6[1];
        if (i6 != 0) {
            int i7 = b7[0] + 1;
            sb.append((CharSequence) str, 0, i7);
            sb.append(str2);
            return d(sb, b6[1] + i7, i7 + b6[2]);
        }
        if (str2.charAt(i6) == '/') {
            sb.append((CharSequence) str, 0, b7[1]);
            sb.append(str2);
            int i8 = b7[1];
            return d(sb, i8, b6[2] + i8);
        }
        int i9 = b7[0] + 2;
        int i10 = b7[1];
        if (i9 >= i10 || i10 != b7[2]) {
            int lastIndexOf = str.lastIndexOf(47, b7[2] - 1);
            int i11 = lastIndexOf == -1 ? b7[1] : lastIndexOf + 1;
            sb.append((CharSequence) str, 0, i11);
            sb.append(str2);
            return d(sb, b7[1], i11 + b6[2]);
        }
        sb.append((CharSequence) str, 0, i10);
        sb.append('/');
        sb.append(str2);
        int i12 = b7[1];
        return d(sb, i12, b6[2] + i12 + 1);
    }

    public static Uri f(String str, String str2) {
        return Uri.parse(e(str, str2));
    }
}
