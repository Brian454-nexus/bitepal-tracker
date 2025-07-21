package I;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class P0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f2332a = new ArrayList();

    public static void b(List list, int i6, int[] iArr, int i7) {
        if (i7 >= iArr.length) {
            list.add((int[]) iArr.clone());
            return;
        }
        for (int i8 = 0; i8 < i6; i8++) {
            int i9 = 0;
            while (true) {
                if (i9 >= i7) {
                    iArr[i7] = i8;
                    b(list, i6, iArr, i7 + 1);
                    break;
                } else if (i8 == iArr[i9]) {
                    break;
                } else {
                    i9++;
                }
            }
        }
    }

    public boolean a(Q0 q02) {
        return this.f2332a.add(q02);
    }

    public final List c(int i6) {
        ArrayList arrayList = new ArrayList();
        b(arrayList, i6, new int[i6], 0);
        return arrayList;
    }

    public List d(List list) {
        int i6;
        if (list.isEmpty()) {
            return new ArrayList();
        }
        if (list.size() != this.f2332a.size()) {
            return null;
        }
        List c6 = c(this.f2332a.size());
        Q0[] q0Arr = new Q0[list.size()];
        Iterator it = c6.iterator();
        while (true) {
            i6 = 0;
            if (!it.hasNext()) {
                break;
            }
            int[] iArr = (int[]) it.next();
            boolean z6 = true;
            while (i6 < this.f2332a.size()) {
                if (iArr[i6] < list.size()) {
                    z6 &= ((Q0) this.f2332a.get(i6)).g((Q0) list.get(iArr[i6]));
                    if (!z6) {
                        break;
                    }
                    q0Arr[iArr[i6]] = (Q0) this.f2332a.get(i6);
                }
                i6++;
            }
            if (z6) {
                i6 = 1;
                break;
            }
        }
        if (i6 != 0) {
            return Arrays.asList(q0Arr);
        }
        return null;
    }
}
