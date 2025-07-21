package k1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final List f16402a;

    /* renamed from: b, reason: collision with root package name */
    public final List f16403b;

    /* renamed from: c, reason: collision with root package name */
    public final List f16404c;

    public n(List list, List list2, List list3) {
        this.f16402a = list;
        this.f16403b = list2;
        this.f16404c = list3;
    }

    public static n b(String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        c(str, arrayList, arrayList2, arrayList3);
        return new n(arrayList, arrayList2, arrayList3);
    }

    public static void c(String str, List list, List list2, List list3) {
        String str2;
        boolean z6;
        list.add("");
        int i6 = 0;
        while (i6 < str.length()) {
            int indexOf = str.indexOf("$", i6);
            if (indexOf == -1) {
                list.set(list2.size(), ((String) list.get(list2.size())) + str.substring(i6));
                i6 = str.length();
            } else if (indexOf != i6) {
                list.set(list2.size(), ((String) list.get(list2.size())) + str.substring(i6, indexOf));
                i6 = indexOf;
            } else if (str.startsWith("$$", i6)) {
                list.set(list2.size(), ((String) list.get(list2.size())) + "$");
                i6 += 2;
            } else {
                list3.add("");
                int i7 = i6 + 1;
                int indexOf2 = str.indexOf("$", i7);
                String substring = str.substring(i7, indexOf2);
                if (substring.equals("RepresentationID")) {
                    list2.add(1);
                } else {
                    int indexOf3 = substring.indexOf("%0");
                    if (indexOf3 != -1) {
                        str2 = substring.substring(indexOf3);
                        if (!str2.endsWith("d") && !str2.endsWith("x") && !str2.endsWith("X")) {
                            str2 = str2 + "d";
                        }
                        substring = substring.substring(0, indexOf3);
                    } else {
                        str2 = "%01d";
                    }
                    substring.getClass();
                    switch (substring.hashCode()) {
                        case -1950496919:
                            if (substring.equals("Number")) {
                                z6 = false;
                                break;
                            }
                            break;
                        case 2606829:
                            if (substring.equals("Time")) {
                                z6 = true;
                                break;
                            }
                            break;
                        case 38199441:
                            if (substring.equals("Bandwidth")) {
                                z6 = 2;
                                break;
                            }
                            break;
                    }
                    z6 = -1;
                    switch (z6) {
                        case false:
                            list2.add(2);
                            break;
                        case true:
                            list2.add(4);
                            break;
                        case true:
                            list2.add(3);
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid template: " + str);
                    }
                    list3.set(list2.size() - 1, str2);
                }
                list.add("");
                i6 = indexOf2 + 1;
            }
        }
    }

    public String a(String str, long j6, int i6, long j7) {
        StringBuilder sb = new StringBuilder();
        for (int i7 = 0; i7 < this.f16403b.size(); i7++) {
            sb.append((String) this.f16402a.get(i7));
            if (((Integer) this.f16403b.get(i7)).intValue() == 1) {
                sb.append(str);
            } else if (((Integer) this.f16403b.get(i7)).intValue() == 2) {
                sb.append(String.format(Locale.US, (String) this.f16404c.get(i7), Long.valueOf(j6)));
            } else if (((Integer) this.f16403b.get(i7)).intValue() == 3) {
                sb.append(String.format(Locale.US, (String) this.f16404c.get(i7), Integer.valueOf(i6)));
            } else if (((Integer) this.f16403b.get(i7)).intValue() == 4) {
                sb.append(String.format(Locale.US, (String) this.f16404c.get(i7), Long.valueOf(j7)));
            }
        }
        sb.append((String) this.f16402a.get(this.f16403b.size()));
        return sb.toString();
    }
}
