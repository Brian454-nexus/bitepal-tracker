package androidx.recyclerview.widget;

import androidx.recyclerview.widget.a;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final a f10092a;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface a {
        void a(a.b bVar);

        a.b b(int i6, int i7, int i8, Object obj);
    }

    public j(a aVar) {
        this.f10092a = aVar;
    }

    public final int a(List list) {
        boolean z6 = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (((a.b) list.get(size)).f9891a != 8) {
                z6 = true;
            } else if (z6) {
                return size;
            }
        }
        return -1;
    }

    public void b(List list) {
        while (true) {
            int a6 = a(list);
            if (a6 == -1) {
                return;
            } else {
                d(list, a6, a6 + 1);
            }
        }
    }

    public final void c(List list, int i6, a.b bVar, int i7, a.b bVar2) {
        int i8 = bVar.f9894d;
        int i9 = bVar2.f9892b;
        int i10 = i8 < i9 ? -1 : 0;
        int i11 = bVar.f9892b;
        if (i11 < i9) {
            i10++;
        }
        if (i9 <= i11) {
            bVar.f9892b = i11 + bVar2.f9894d;
        }
        int i12 = bVar2.f9892b;
        if (i12 <= i8) {
            bVar.f9894d = i8 + bVar2.f9894d;
        }
        bVar2.f9892b = i12 + i10;
        list.set(i6, bVar2);
        list.set(i7, bVar);
    }

    public final void d(List list, int i6, int i7) {
        a.b bVar = (a.b) list.get(i6);
        a.b bVar2 = (a.b) list.get(i7);
        int i8 = bVar2.f9891a;
        if (i8 == 1) {
            c(list, i6, bVar, i7, bVar2);
        } else if (i8 == 2) {
            e(list, i6, bVar, i7, bVar2);
        } else {
            if (i8 != 4) {
                return;
            }
            f(list, i6, bVar, i7, bVar2);
        }
    }

    public void e(List list, int i6, a.b bVar, int i7, a.b bVar2) {
        boolean z6;
        int i8 = bVar.f9892b;
        int i9 = bVar.f9894d;
        boolean z7 = false;
        if (i8 < i9) {
            if (bVar2.f9892b == i8 && bVar2.f9894d == i9 - i8) {
                z6 = false;
                z7 = true;
            } else {
                z6 = false;
            }
        } else if (bVar2.f9892b == i9 + 1 && bVar2.f9894d == i8 - i9) {
            z6 = true;
            z7 = true;
        } else {
            z6 = true;
        }
        int i10 = bVar2.f9892b;
        if (i9 < i10) {
            bVar2.f9892b = i10 - 1;
        } else {
            int i11 = bVar2.f9894d;
            if (i9 < i10 + i11) {
                bVar2.f9894d = i11 - 1;
                bVar.f9891a = 2;
                bVar.f9894d = 1;
                if (bVar2.f9894d == 0) {
                    list.remove(i7);
                    this.f10092a.a(bVar2);
                    return;
                }
                return;
            }
        }
        int i12 = bVar.f9892b;
        int i13 = bVar2.f9892b;
        a.b bVar3 = null;
        if (i12 <= i13) {
            bVar2.f9892b = i13 + 1;
        } else {
            int i14 = bVar2.f9894d;
            if (i12 < i13 + i14) {
                bVar3 = this.f10092a.b(2, i12 + 1, (i13 + i14) - i12, null);
                bVar2.f9894d = bVar.f9892b - bVar2.f9892b;
            }
        }
        if (z7) {
            list.set(i6, bVar2);
            list.remove(i7);
            this.f10092a.a(bVar);
            return;
        }
        if (z6) {
            if (bVar3 != null) {
                int i15 = bVar.f9892b;
                if (i15 > bVar3.f9892b) {
                    bVar.f9892b = i15 - bVar3.f9894d;
                }
                int i16 = bVar.f9894d;
                if (i16 > bVar3.f9892b) {
                    bVar.f9894d = i16 - bVar3.f9894d;
                }
            }
            int i17 = bVar.f9892b;
            if (i17 > bVar2.f9892b) {
                bVar.f9892b = i17 - bVar2.f9894d;
            }
            int i18 = bVar.f9894d;
            if (i18 > bVar2.f9892b) {
                bVar.f9894d = i18 - bVar2.f9894d;
            }
        } else {
            if (bVar3 != null) {
                int i19 = bVar.f9892b;
                if (i19 >= bVar3.f9892b) {
                    bVar.f9892b = i19 - bVar3.f9894d;
                }
                int i20 = bVar.f9894d;
                if (i20 >= bVar3.f9892b) {
                    bVar.f9894d = i20 - bVar3.f9894d;
                }
            }
            int i21 = bVar.f9892b;
            if (i21 >= bVar2.f9892b) {
                bVar.f9892b = i21 - bVar2.f9894d;
            }
            int i22 = bVar.f9894d;
            if (i22 >= bVar2.f9892b) {
                bVar.f9894d = i22 - bVar2.f9894d;
            }
        }
        list.set(i6, bVar2);
        if (bVar.f9892b != bVar.f9894d) {
            list.set(i7, bVar);
        } else {
            list.remove(i7);
        }
        if (bVar3 != null) {
            list.add(i6, bVar3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(java.util.List r9, int r10, androidx.recyclerview.widget.a.b r11, int r12, androidx.recyclerview.widget.a.b r13) {
        /*
            r8 = this;
            int r0 = r11.f9894d
            int r1 = r13.f9892b
            r2 = 4
            r3 = 1
            r4 = 0
            if (r0 >= r1) goto Ld
            int r1 = r1 - r3
            r13.f9892b = r1
            goto L20
        Ld:
            int r5 = r13.f9894d
            int r1 = r1 + r5
            if (r0 >= r1) goto L20
            int r5 = r5 - r3
            r13.f9894d = r5
            androidx.recyclerview.widget.j$a r0 = r8.f10092a
            int r1 = r11.f9892b
            java.lang.Object r5 = r13.f9893c
            androidx.recyclerview.widget.a$b r0 = r0.b(r2, r1, r3, r5)
            goto L21
        L20:
            r0 = r4
        L21:
            int r1 = r11.f9892b
            int r5 = r13.f9892b
            if (r1 > r5) goto L2b
            int r5 = r5 + r3
            r13.f9892b = r5
            goto L41
        L2b:
            int r6 = r13.f9894d
            int r7 = r5 + r6
            if (r1 >= r7) goto L41
            int r5 = r5 + r6
            int r5 = r5 - r1
            androidx.recyclerview.widget.j$a r4 = r8.f10092a
            int r1 = r1 + r3
            java.lang.Object r3 = r13.f9893c
            androidx.recyclerview.widget.a$b r4 = r4.b(r2, r1, r5, r3)
            int r1 = r13.f9894d
            int r1 = r1 - r5
            r13.f9894d = r1
        L41:
            r9.set(r12, r11)
            int r11 = r13.f9894d
            if (r11 <= 0) goto L4c
            r9.set(r10, r13)
            goto L54
        L4c:
            r9.remove(r10)
            androidx.recyclerview.widget.j$a r11 = r8.f10092a
            r11.a(r13)
        L54:
            if (r0 == 0) goto L59
            r9.add(r10, r0)
        L59:
            if (r4 == 0) goto L5e
            r9.add(r10, r4)
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.j.f(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }
}
