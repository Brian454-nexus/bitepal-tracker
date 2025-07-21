package com.amazon.a.a.o.c.a;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class b {

    /* renamed from: c, reason: collision with root package name */
    private static final int f11262c = -1;

    /* renamed from: d, reason: collision with root package name */
    private static final char f11263d = '/';

    /* renamed from: e, reason: collision with root package name */
    private static final char f11264e = '\\';

    /* renamed from: g, reason: collision with root package name */
    private static final char f11266g;

    /* renamed from: a, reason: collision with root package name */
    public static final char f11260a = '.';

    /* renamed from: b, reason: collision with root package name */
    public static final String f11261b = Character.toString(f11260a);

    /* renamed from: f, reason: collision with root package name */
    private static final char f11265f = File.separatorChar;

    static {
        if (a()) {
            f11266g = f11263d;
        } else {
            f11266g = f11264e;
        }
    }

    private static boolean a(char c6) {
        return c6 == '/' || c6 == '\\';
    }

    public static String b(String str) {
        return a(str, f11265f, false);
    }

    public static String c(String str) {
        return (str == null || str.indexOf(92) == -1) ? str : str.replace(f11264e, f11263d);
    }

    public static String d(String str) {
        return (str == null || str.indexOf(47) == -1) ? str : str.replace(f11263d, f11264e);
    }

    public static String e(String str) {
        if (str == null) {
            return null;
        }
        if (a()) {
            return d(str);
        }
        return c(str);
    }

    public static int f(String str) {
        int min;
        if (str == null) {
            return -1;
        }
        int length = str.length();
        if (length == 0) {
            return 0;
        }
        char charAt = str.charAt(0);
        if (charAt == ':') {
            return -1;
        }
        if (length == 1) {
            if (charAt == '~') {
                return 2;
            }
            return a(charAt) ? 1 : 0;
        }
        if (charAt == '~') {
            int indexOf = str.indexOf(47, 1);
            int indexOf2 = str.indexOf(92, 1);
            if (indexOf == -1 && indexOf2 == -1) {
                return length + 1;
            }
            if (indexOf == -1) {
                indexOf = indexOf2;
            }
            if (indexOf2 == -1) {
                indexOf2 = indexOf;
            }
            min = Math.min(indexOf, indexOf2);
        } else {
            char charAt2 = str.charAt(1);
            if (charAt2 == ':') {
                char upperCase = Character.toUpperCase(charAt);
                if (upperCase < 'A' || upperCase > 'Z') {
                    return -1;
                }
                return (length == 2 || !a(str.charAt(2))) ? 2 : 3;
            }
            if (!a(charAt) || !a(charAt2)) {
                return a(charAt) ? 1 : 0;
            }
            int indexOf3 = str.indexOf(47, 2);
            int indexOf4 = str.indexOf(92, 2);
            if ((indexOf3 == -1 && indexOf4 == -1) || indexOf3 == 2 || indexOf4 == 2) {
                return -1;
            }
            if (indexOf3 == -1) {
                indexOf3 = indexOf4;
            }
            if (indexOf4 == -1) {
                indexOf4 = indexOf3;
            }
            min = Math.min(indexOf3, indexOf4);
        }
        return min + 1;
    }

    public static int g(String str) {
        if (str == null) {
            return -1;
        }
        return Math.max(str.lastIndexOf(47), str.lastIndexOf(92));
    }

    public static int h(String str) {
        int lastIndexOf;
        if (str != null && g(str) <= (lastIndexOf = str.lastIndexOf(46))) {
            return lastIndexOf;
        }
        return -1;
    }

    public static String i(String str) {
        int f6;
        if (str == null || (f6 = f(str)) < 0) {
            return null;
        }
        if (f6 > str.length()) {
            s(str + f11263d);
            return str + f11263d;
        }
        String substring = str.substring(0, f6);
        s(substring);
        return substring;
    }

    public static String j(String str) {
        return a(str, 1);
    }

    public static String k(String str) {
        return a(str, 0);
    }

    public static String l(String str) {
        return c(str, true);
    }

    public static String m(String str) {
        return c(str, false);
    }

    public static String n(String str) {
        if (str == null) {
            return null;
        }
        s(str);
        return str.substring(g(str) + 1);
    }

    public static String o(String str) {
        return q(n(str));
    }

    public static String p(String str) {
        if (str == null) {
            return null;
        }
        int h6 = h(str);
        return h6 == -1 ? "" : str.substring(h6 + 1);
    }

    public static String q(String str) {
        if (str == null) {
            return null;
        }
        s(str);
        int h6 = h(str);
        return h6 == -1 ? str : str.substring(0, h6);
    }

    public static String[] r(String str) {
        if (str.indexOf(63) == -1 && str.indexOf(42) == -1) {
            return new String[]{str};
        }
        char[] charArray = str.toCharArray();
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int length = charArray.length;
        int i6 = 0;
        char c6 = 0;
        while (i6 < length) {
            char c7 = charArray[i6];
            if (c7 == '?' || c7 == '*') {
                if (sb.length() != 0) {
                    arrayList.add(sb.toString());
                    sb.setLength(0);
                }
                if (c7 == '?') {
                    arrayList.add("?");
                } else if (c6 != '*') {
                    arrayList.add("*");
                }
            } else {
                sb.append(c7);
            }
            i6++;
            c6 = c7;
        }
        if (sb.length() != 0) {
            arrayList.add(sb.toString());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    private static void s(String str) {
        int length = str.length();
        for (int i6 = 0; i6 < length; i6++) {
            if (str.charAt(i6) == 0) {
                throw new IllegalArgumentException("Null byte present in file/path name. There are no known legitimate use cases for such data, but several injection attacks may use it");
            }
        }
    }

    public static boolean a() {
        return f11265f == '\\';
    }

    public static String b(String str, boolean z6) {
        return a(str, z6 ? f11263d : f11264e, false);
    }

    public static String a(String str) {
        return a(str, f11265f, true);
    }

    public static boolean b(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Directory must not be null");
        }
        if (str2 == null) {
            return false;
        }
        d dVar = d.SYSTEM;
        if (dVar.b(str, str2)) {
            return false;
        }
        return dVar.c(str2, str);
    }

    private static String c(String str, boolean z6) {
        int f6;
        if (str == null || (f6 = f(str)) < 0) {
            return null;
        }
        if (f6 >= str.length()) {
            return z6 ? i(str) : str;
        }
        int g6 = g(str);
        if (g6 < 0) {
            return str.substring(0, f6);
        }
        int i6 = g6 + (z6 ? 1 : 0);
        if (i6 == 0) {
            i6++;
        }
        return str.substring(0, i6);
    }

    public static boolean d(String str, String str2) {
        return a(str, str2, false, d.SYSTEM);
    }

    public static boolean h(String str, String str2) {
        return a(str, str2, d.SENSITIVE);
    }

    public static String a(String str, boolean z6) {
        return a(str, z6 ? f11263d : f11264e, true);
    }

    public static boolean e(String str, String str2) {
        return a(str, str2, true, d.SENSITIVE);
    }

    public static boolean g(String str, String str2) {
        if (str == null) {
            return false;
        }
        s(str);
        if (str2 == null || str2.isEmpty()) {
            return h(str) == -1;
        }
        return p(str).equals(str2);
    }

    private static String a(String str, char c6, boolean z6) {
        boolean z7;
        if (str == null) {
            return null;
        }
        s(str);
        int length = str.length();
        if (length == 0) {
            return str;
        }
        int f6 = f(str);
        if (f6 < 0) {
            return null;
        }
        int i6 = length + 2;
        char[] cArr = new char[i6];
        str.getChars(0, str.length(), cArr, 0);
        char c7 = f11265f;
        if (c6 == c7) {
            c7 = f11266g;
        }
        for (int i7 = 0; i7 < i6; i7++) {
            if (cArr[i7] == c7) {
                cArr[i7] = c6;
            }
        }
        if (cArr[length - 1] != c6) {
            cArr[length] = c6;
            length++;
            z7 = false;
        } else {
            z7 = true;
        }
        int i8 = f6 + 1;
        int i9 = i8;
        while (i9 < length) {
            if (cArr[i9] == c6) {
                int i10 = i9 - 1;
                if (cArr[i10] == c6) {
                    System.arraycopy(cArr, i9, cArr, i10, length - i9);
                    length--;
                    i9--;
                }
            }
            i9++;
        }
        int i11 = i8;
        while (i11 < length) {
            if (cArr[i11] == c6) {
                int i12 = i11 - 1;
                if (cArr[i12] == '.' && (i11 == i8 || cArr[i11 - 2] == c6)) {
                    if (i11 == length - 1) {
                        z7 = true;
                    }
                    System.arraycopy(cArr, i11 + 1, cArr, i12, length - i11);
                    length -= 2;
                    i11--;
                }
            }
            i11++;
        }
        int i13 = f6 + 2;
        int i14 = i13;
        while (i14 < length) {
            if (cArr[i14] == c6 && cArr[i14 - 1] == '.' && cArr[i14 - 2] == '.' && (i14 == i13 || cArr[i14 - 3] == c6)) {
                if (i14 == i13) {
                    return null;
                }
                if (i14 == length - 1) {
                    z7 = true;
                }
                int i15 = i14 - 4;
                while (true) {
                    if (i15 >= f6) {
                        if (cArr[i15] == c6) {
                            int i16 = i15 + 1;
                            System.arraycopy(cArr, i14 + 1, cArr, i16, length - i14);
                            length -= i14 - i15;
                            i14 = i16;
                            break;
                        }
                        i15--;
                    } else {
                        int i17 = i14 + 1;
                        System.arraycopy(cArr, i17, cArr, f6, length - i14);
                        length -= i17 - f6;
                        i14 = i8;
                        break;
                    }
                }
            }
            i14++;
        }
        if (length <= 0) {
            return "";
        }
        if (length <= f6) {
            return new String(cArr, 0, length);
        }
        if (z7 && z6) {
            return new String(cArr, 0, length);
        }
        return new String(cArr, 0, length - 1);
    }

    public static boolean i(String str, String str2) {
        return a(str, str2, d.SYSTEM);
    }

    public static boolean c(String str, String str2) {
        return a(str, str2, false, d.SENSITIVE);
    }

    public static boolean f(String str, String str2) {
        return a(str, str2, true, d.SYSTEM);
    }

    public static String a(String str, String str2) {
        int f6 = f(str2);
        if (f6 < 0) {
            return null;
        }
        if (f6 > 0) {
            return a(str2);
        }
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return a(str2);
        }
        if (a(str.charAt(length - 1))) {
            return a(str + str2);
        }
        return a(str + f11263d + str2);
    }

    private static String a(String str, int i6) {
        int f6;
        if (str == null || (f6 = f(str)) < 0) {
            return null;
        }
        int g6 = g(str);
        int i7 = i6 + g6;
        if (f6 < str.length() && g6 >= 0 && f6 < i7) {
            String substring = str.substring(f6, i7);
            s(substring);
            return substring;
        }
        return "";
    }

    public static boolean a(String str, String str2, boolean z6, d dVar) {
        if (str == null || str2 == null) {
            return str == null && str2 == null;
        }
        if (z6) {
            str = a(str);
            str2 = a(str2);
            if (str == null || str2 == null) {
                throw new NullPointerException("Error normalizing one or both of the file names");
            }
        }
        if (dVar == null) {
            dVar = d.SENSITIVE;
        }
        return dVar.b(str, str2);
    }

    public static boolean a(String str, String[] strArr) {
        if (str == null) {
            return false;
        }
        s(str);
        if (strArr == null || strArr.length == 0) {
            return h(str) == -1;
        }
        String p6 = p(str);
        for (String str2 : strArr) {
            if (p6.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(String str, Collection<String> collection) {
        if (str == null) {
            return false;
        }
        s(str);
        if (collection == null || collection.isEmpty()) {
            return h(str) == -1;
        }
        String p6 = p(str);
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            if (p6.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(String str, String str2, d dVar) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str != null && str2 != null) {
            if (dVar == null) {
                dVar = d.SENSITIVE;
            }
            String[] r6 = r(str2);
            Stack stack = new Stack();
            boolean z6 = false;
            int i6 = 0;
            int i7 = 0;
            do {
                if (stack.size() > 0) {
                    int[] iArr = (int[]) stack.pop();
                    i7 = iArr[0];
                    i6 = iArr[1];
                    z6 = true;
                }
                while (i7 < r6.length) {
                    if (r6[i7].equals("?")) {
                        i6++;
                        if (i6 > str.length()) {
                            break;
                        }
                        z6 = false;
                        i7++;
                    } else if (r6[i7].equals("*")) {
                        if (i7 == r6.length - 1) {
                            i6 = str.length();
                        }
                        z6 = true;
                        i7++;
                    } else {
                        if (z6) {
                            i6 = dVar.a(str, i6, r6[i7]);
                            if (i6 == -1) {
                                break;
                            }
                            int a6 = dVar.a(str, i6 + 1, r6[i7]);
                            if (a6 >= 0) {
                                stack.push(new int[]{i7, a6});
                            }
                            i6 += r6[i7].length();
                            z6 = false;
                        } else {
                            if (!dVar.b(str, i6, r6[i7])) {
                                break;
                            }
                            i6 += r6[i7].length();
                            z6 = false;
                        }
                        i7++;
                    }
                }
                if (i7 == r6.length && i6 == str.length()) {
                    return true;
                }
            } while (stack.size() > 0);
        }
        return false;
    }
}
