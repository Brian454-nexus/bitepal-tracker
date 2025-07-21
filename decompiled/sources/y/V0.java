package y;

import I.Q0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class V0 {
    public static List a(int i6, boolean z6, boolean z7) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(f());
        if (i6 == 0 || i6 == 1 || i6 == 3) {
            arrayList.addAll(h());
        }
        if (i6 == 1 || i6 == 3) {
            arrayList.addAll(e());
        }
        if (z6) {
            arrayList.addAll(i());
        }
        if (z7 && i6 == 0) {
            arrayList.addAll(c());
        }
        if (i6 == 3) {
            arrayList.addAll(g());
        }
        return arrayList;
    }

    public static List b() {
        ArrayList arrayList = new ArrayList();
        I.P0 p02 = new I.P0();
        Q0.b bVar = Q0.b.PRIV;
        Q0.a aVar = Q0.a.MAXIMUM;
        p02.a(I.Q0.a(bVar, aVar));
        arrayList.add(p02);
        I.P0 p03 = new I.P0();
        Q0.b bVar2 = Q0.b.YUV;
        p03.a(I.Q0.a(bVar2, aVar));
        arrayList.add(p03);
        I.P0 p04 = new I.P0();
        Q0.a aVar2 = Q0.a.PREVIEW;
        p04.a(I.Q0.a(bVar, aVar2));
        Q0.b bVar3 = Q0.b.JPEG;
        p04.a(I.Q0.a(bVar3, aVar));
        arrayList.add(p04);
        I.P0 p05 = new I.P0();
        p05.a(I.Q0.a(bVar, aVar2));
        p05.a(I.Q0.a(bVar2, aVar));
        arrayList.add(p05);
        I.P0 p06 = new I.P0();
        p06.a(I.Q0.a(bVar2, aVar2));
        p06.a(I.Q0.a(bVar2, aVar));
        arrayList.add(p06);
        I.P0 p07 = new I.P0();
        p07.a(I.Q0.a(bVar, aVar2));
        Q0.a aVar3 = Q0.a.RECORD;
        p07.a(I.Q0.a(bVar, aVar3));
        arrayList.add(p07);
        I.P0 p08 = new I.P0();
        p08.a(I.Q0.a(bVar, aVar2));
        p08.a(I.Q0.a(bVar, aVar3));
        p08.a(I.Q0.a(bVar2, aVar3));
        arrayList.add(p08);
        I.P0 p09 = new I.P0();
        p09.a(I.Q0.a(bVar, aVar2));
        p09.a(I.Q0.a(bVar, aVar3));
        p09.a(I.Q0.a(bVar3, aVar3));
        arrayList.add(p09);
        return arrayList;
    }

    public static List c() {
        ArrayList arrayList = new ArrayList();
        I.P0 p02 = new I.P0();
        Q0.b bVar = Q0.b.PRIV;
        Q0.a aVar = Q0.a.PREVIEW;
        p02.a(I.Q0.a(bVar, aVar));
        Q0.a aVar2 = Q0.a.MAXIMUM;
        p02.a(I.Q0.a(bVar, aVar2));
        arrayList.add(p02);
        I.P0 p03 = new I.P0();
        p03.a(I.Q0.a(bVar, aVar));
        Q0.b bVar2 = Q0.b.YUV;
        p03.a(I.Q0.a(bVar2, aVar2));
        arrayList.add(p03);
        I.P0 p04 = new I.P0();
        p04.a(I.Q0.a(bVar2, aVar));
        p04.a(I.Q0.a(bVar2, aVar2));
        arrayList.add(p04);
        return arrayList;
    }

    public static List d() {
        ArrayList arrayList = new ArrayList();
        I.P0 p02 = new I.P0();
        Q0.b bVar = Q0.b.YUV;
        Q0.a aVar = Q0.a.s1440p;
        p02.a(I.Q0.a(bVar, aVar));
        arrayList.add(p02);
        I.P0 p03 = new I.P0();
        Q0.b bVar2 = Q0.b.PRIV;
        p03.a(I.Q0.a(bVar2, aVar));
        arrayList.add(p03);
        I.P0 p04 = new I.P0();
        Q0.b bVar3 = Q0.b.JPEG;
        p04.a(I.Q0.a(bVar3, aVar));
        arrayList.add(p04);
        I.P0 p05 = new I.P0();
        Q0.a aVar2 = Q0.a.s720p;
        p05.a(I.Q0.a(bVar, aVar2));
        p05.a(I.Q0.a(bVar3, aVar));
        arrayList.add(p05);
        I.P0 p06 = new I.P0();
        p06.a(I.Q0.a(bVar2, aVar2));
        p06.a(I.Q0.a(bVar3, aVar));
        arrayList.add(p06);
        I.P0 p07 = new I.P0();
        p07.a(I.Q0.a(bVar, aVar2));
        p07.a(I.Q0.a(bVar, aVar));
        arrayList.add(p07);
        I.P0 p08 = new I.P0();
        p08.a(I.Q0.a(bVar, aVar2));
        p08.a(I.Q0.a(bVar2, aVar));
        arrayList.add(p08);
        I.P0 p09 = new I.P0();
        p09.a(I.Q0.a(bVar2, aVar2));
        p09.a(I.Q0.a(bVar, aVar));
        arrayList.add(p09);
        I.P0 p010 = new I.P0();
        p010.a(I.Q0.a(bVar2, aVar2));
        p010.a(I.Q0.a(bVar2, aVar));
        arrayList.add(p010);
        return arrayList;
    }

    public static List e() {
        ArrayList arrayList = new ArrayList();
        I.P0 p02 = new I.P0();
        Q0.b bVar = Q0.b.PRIV;
        Q0.a aVar = Q0.a.PREVIEW;
        p02.a(I.Q0.a(bVar, aVar));
        Q0.a aVar2 = Q0.a.MAXIMUM;
        p02.a(I.Q0.a(bVar, aVar2));
        arrayList.add(p02);
        I.P0 p03 = new I.P0();
        p03.a(I.Q0.a(bVar, aVar));
        Q0.b bVar2 = Q0.b.YUV;
        p03.a(I.Q0.a(bVar2, aVar2));
        arrayList.add(p03);
        I.P0 p04 = new I.P0();
        p04.a(I.Q0.a(bVar2, aVar));
        p04.a(I.Q0.a(bVar2, aVar2));
        arrayList.add(p04);
        I.P0 p05 = new I.P0();
        p05.a(I.Q0.a(bVar, aVar));
        p05.a(I.Q0.a(bVar, aVar));
        p05.a(I.Q0.a(Q0.b.JPEG, aVar2));
        arrayList.add(p05);
        I.P0 p06 = new I.P0();
        Q0.a aVar3 = Q0.a.VGA;
        p06.a(I.Q0.a(bVar2, aVar3));
        p06.a(I.Q0.a(bVar, aVar));
        p06.a(I.Q0.a(bVar2, aVar2));
        arrayList.add(p06);
        I.P0 p07 = new I.P0();
        p07.a(I.Q0.a(bVar2, aVar3));
        p07.a(I.Q0.a(bVar2, aVar));
        p07.a(I.Q0.a(bVar2, aVar2));
        arrayList.add(p07);
        return arrayList;
    }

    public static List f() {
        ArrayList arrayList = new ArrayList();
        I.P0 p02 = new I.P0();
        Q0.b bVar = Q0.b.PRIV;
        Q0.a aVar = Q0.a.MAXIMUM;
        p02.a(I.Q0.a(bVar, aVar));
        arrayList.add(p02);
        I.P0 p03 = new I.P0();
        Q0.b bVar2 = Q0.b.JPEG;
        p03.a(I.Q0.a(bVar2, aVar));
        arrayList.add(p03);
        I.P0 p04 = new I.P0();
        Q0.b bVar3 = Q0.b.YUV;
        p04.a(I.Q0.a(bVar3, aVar));
        arrayList.add(p04);
        I.P0 p05 = new I.P0();
        Q0.a aVar2 = Q0.a.PREVIEW;
        p05.a(I.Q0.a(bVar, aVar2));
        p05.a(I.Q0.a(bVar2, aVar));
        arrayList.add(p05);
        I.P0 p06 = new I.P0();
        p06.a(I.Q0.a(bVar3, aVar2));
        p06.a(I.Q0.a(bVar2, aVar));
        arrayList.add(p06);
        I.P0 p07 = new I.P0();
        p07.a(I.Q0.a(bVar, aVar2));
        p07.a(I.Q0.a(bVar, aVar2));
        arrayList.add(p07);
        I.P0 p08 = new I.P0();
        p08.a(I.Q0.a(bVar, aVar2));
        p08.a(I.Q0.a(bVar3, aVar2));
        arrayList.add(p08);
        I.P0 p09 = new I.P0();
        p09.a(I.Q0.a(bVar, aVar2));
        p09.a(I.Q0.a(bVar3, aVar2));
        p09.a(I.Q0.a(bVar2, aVar));
        arrayList.add(p09);
        return arrayList;
    }

    public static List g() {
        ArrayList arrayList = new ArrayList();
        I.P0 p02 = new I.P0();
        Q0.b bVar = Q0.b.PRIV;
        Q0.a aVar = Q0.a.PREVIEW;
        p02.a(I.Q0.a(bVar, aVar));
        Q0.a aVar2 = Q0.a.VGA;
        p02.a(I.Q0.a(bVar, aVar2));
        Q0.b bVar2 = Q0.b.YUV;
        Q0.a aVar3 = Q0.a.MAXIMUM;
        p02.a(I.Q0.a(bVar2, aVar3));
        Q0.b bVar3 = Q0.b.RAW;
        p02.a(I.Q0.a(bVar3, aVar3));
        arrayList.add(p02);
        I.P0 p03 = new I.P0();
        p03.a(I.Q0.a(bVar, aVar));
        p03.a(I.Q0.a(bVar, aVar2));
        p03.a(I.Q0.a(Q0.b.JPEG, aVar3));
        p03.a(I.Q0.a(bVar3, aVar3));
        arrayList.add(p03);
        return arrayList;
    }

    public static List h() {
        ArrayList arrayList = new ArrayList();
        I.P0 p02 = new I.P0();
        Q0.b bVar = Q0.b.PRIV;
        Q0.a aVar = Q0.a.PREVIEW;
        p02.a(I.Q0.a(bVar, aVar));
        Q0.a aVar2 = Q0.a.RECORD;
        p02.a(I.Q0.a(bVar, aVar2));
        arrayList.add(p02);
        I.P0 p03 = new I.P0();
        p03.a(I.Q0.a(bVar, aVar));
        Q0.b bVar2 = Q0.b.YUV;
        p03.a(I.Q0.a(bVar2, aVar2));
        arrayList.add(p03);
        I.P0 p04 = new I.P0();
        p04.a(I.Q0.a(bVar2, aVar));
        p04.a(I.Q0.a(bVar2, aVar2));
        arrayList.add(p04);
        I.P0 p05 = new I.P0();
        p05.a(I.Q0.a(bVar, aVar));
        p05.a(I.Q0.a(bVar, aVar2));
        Q0.b bVar3 = Q0.b.JPEG;
        p05.a(I.Q0.a(bVar3, aVar2));
        arrayList.add(p05);
        I.P0 p06 = new I.P0();
        p06.a(I.Q0.a(bVar, aVar));
        p06.a(I.Q0.a(bVar2, aVar2));
        p06.a(I.Q0.a(bVar3, aVar2));
        arrayList.add(p06);
        I.P0 p07 = new I.P0();
        p07.a(I.Q0.a(bVar2, aVar));
        p07.a(I.Q0.a(bVar2, aVar));
        p07.a(I.Q0.a(bVar3, Q0.a.MAXIMUM));
        arrayList.add(p07);
        return arrayList;
    }

    public static List i() {
        ArrayList arrayList = new ArrayList();
        I.P0 p02 = new I.P0();
        Q0.b bVar = Q0.b.RAW;
        Q0.a aVar = Q0.a.MAXIMUM;
        p02.a(I.Q0.a(bVar, aVar));
        arrayList.add(p02);
        I.P0 p03 = new I.P0();
        Q0.b bVar2 = Q0.b.PRIV;
        Q0.a aVar2 = Q0.a.PREVIEW;
        p03.a(I.Q0.a(bVar2, aVar2));
        p03.a(I.Q0.a(bVar, aVar));
        arrayList.add(p03);
        I.P0 p04 = new I.P0();
        Q0.b bVar3 = Q0.b.YUV;
        p04.a(I.Q0.a(bVar3, aVar2));
        p04.a(I.Q0.a(bVar, aVar));
        arrayList.add(p04);
        I.P0 p05 = new I.P0();
        p05.a(I.Q0.a(bVar2, aVar2));
        p05.a(I.Q0.a(bVar2, aVar2));
        p05.a(I.Q0.a(bVar, aVar));
        arrayList.add(p05);
        I.P0 p06 = new I.P0();
        p06.a(I.Q0.a(bVar2, aVar2));
        p06.a(I.Q0.a(bVar3, aVar2));
        p06.a(I.Q0.a(bVar, aVar));
        arrayList.add(p06);
        I.P0 p07 = new I.P0();
        p07.a(I.Q0.a(bVar3, aVar2));
        p07.a(I.Q0.a(bVar3, aVar2));
        p07.a(I.Q0.a(bVar, aVar));
        arrayList.add(p07);
        I.P0 p08 = new I.P0();
        p08.a(I.Q0.a(bVar2, aVar2));
        Q0.b bVar4 = Q0.b.JPEG;
        p08.a(I.Q0.a(bVar4, aVar));
        p08.a(I.Q0.a(bVar, aVar));
        arrayList.add(p08);
        I.P0 p09 = new I.P0();
        p09.a(I.Q0.a(bVar3, aVar2));
        p09.a(I.Q0.a(bVar4, aVar));
        p09.a(I.Q0.a(bVar, aVar));
        arrayList.add(p09);
        return arrayList;
    }

    public static List j() {
        ArrayList arrayList = new ArrayList();
        I.P0 p02 = new I.P0();
        Q0.b bVar = Q0.b.PRIV;
        Q0.a aVar = Q0.a.s1440p;
        p02.a(I.Q0.b(bVar, aVar, 4L));
        arrayList.add(p02);
        I.P0 p03 = new I.P0();
        Q0.b bVar2 = Q0.b.YUV;
        p03.a(I.Q0.b(bVar2, aVar, 4L));
        arrayList.add(p03);
        I.P0 p04 = new I.P0();
        Q0.a aVar2 = Q0.a.RECORD;
        p04.a(I.Q0.b(bVar, aVar2, 3L));
        arrayList.add(p04);
        I.P0 p05 = new I.P0();
        p05.a(I.Q0.b(bVar2, aVar2, 3L));
        arrayList.add(p05);
        I.P0 p06 = new I.P0();
        Q0.b bVar3 = Q0.b.JPEG;
        Q0.a aVar3 = Q0.a.MAXIMUM;
        p06.a(I.Q0.b(bVar3, aVar3, 2L));
        arrayList.add(p06);
        I.P0 p07 = new I.P0();
        p07.a(I.Q0.b(bVar2, aVar3, 2L));
        arrayList.add(p07);
        I.P0 p08 = new I.P0();
        Q0.a aVar4 = Q0.a.PREVIEW;
        p08.a(I.Q0.b(bVar, aVar4, 1L));
        p08.a(I.Q0.b(bVar3, aVar3, 2L));
        arrayList.add(p08);
        I.P0 p09 = new I.P0();
        p09.a(I.Q0.b(bVar, aVar4, 1L));
        p09.a(I.Q0.b(bVar2, aVar3, 2L));
        arrayList.add(p09);
        I.P0 p010 = new I.P0();
        p010.a(I.Q0.b(bVar, aVar4, 1L));
        p010.a(I.Q0.b(bVar, aVar2, 3L));
        arrayList.add(p010);
        I.P0 p011 = new I.P0();
        p011.a(I.Q0.b(bVar, aVar4, 1L));
        p011.a(I.Q0.b(bVar2, aVar2, 3L));
        arrayList.add(p011);
        I.P0 p012 = new I.P0();
        p012.a(I.Q0.b(bVar, aVar4, 1L));
        p012.a(I.Q0.b(bVar2, aVar4, 1L));
        arrayList.add(p012);
        I.P0 p013 = new I.P0();
        p013.a(I.Q0.b(bVar, aVar4, 1L));
        p013.a(I.Q0.b(bVar, aVar2, 3L));
        p013.a(I.Q0.b(bVar3, aVar2, 2L));
        arrayList.add(p013);
        I.P0 p014 = new I.P0();
        p014.a(I.Q0.b(bVar, aVar4, 1L));
        p014.a(I.Q0.b(bVar2, aVar2, 3L));
        p014.a(I.Q0.b(bVar3, aVar2, 2L));
        arrayList.add(p014);
        I.P0 p015 = new I.P0();
        p015.a(I.Q0.b(bVar, aVar4, 1L));
        p015.a(I.Q0.b(bVar2, aVar4, 1L));
        p015.a(I.Q0.b(bVar3, aVar3, 2L));
        arrayList.add(p015);
        return arrayList;
    }

    public static List k() {
        ArrayList arrayList = new ArrayList();
        I.P0 p02 = new I.P0();
        Q0.b bVar = Q0.b.YUV;
        Q0.a aVar = Q0.a.ULTRA_MAXIMUM;
        p02.a(I.Q0.a(bVar, aVar));
        Q0.b bVar2 = Q0.b.PRIV;
        Q0.a aVar2 = Q0.a.PREVIEW;
        p02.a(I.Q0.a(bVar2, aVar2));
        Q0.a aVar3 = Q0.a.RECORD;
        p02.a(I.Q0.a(bVar2, aVar3));
        arrayList.add(p02);
        I.P0 p03 = new I.P0();
        Q0.b bVar3 = Q0.b.JPEG;
        p03.a(I.Q0.a(bVar3, aVar));
        p03.a(I.Q0.a(bVar2, aVar2));
        p03.a(I.Q0.a(bVar2, aVar3));
        arrayList.add(p03);
        I.P0 p04 = new I.P0();
        Q0.b bVar4 = Q0.b.RAW;
        p04.a(I.Q0.a(bVar4, aVar));
        p04.a(I.Q0.a(bVar2, aVar2));
        p04.a(I.Q0.a(bVar2, aVar3));
        arrayList.add(p04);
        I.P0 p05 = new I.P0();
        p05.a(I.Q0.a(bVar, aVar));
        p05.a(I.Q0.a(bVar2, aVar2));
        Q0.a aVar4 = Q0.a.MAXIMUM;
        p05.a(I.Q0.a(bVar3, aVar4));
        arrayList.add(p05);
        I.P0 p06 = new I.P0();
        p06.a(I.Q0.a(bVar3, aVar));
        p06.a(I.Q0.a(bVar2, aVar2));
        p06.a(I.Q0.a(bVar3, aVar4));
        arrayList.add(p06);
        I.P0 p07 = new I.P0();
        p07.a(I.Q0.a(bVar4, aVar));
        p07.a(I.Q0.a(bVar2, aVar2));
        p07.a(I.Q0.a(bVar3, aVar4));
        arrayList.add(p07);
        I.P0 p08 = new I.P0();
        p08.a(I.Q0.a(bVar, aVar));
        p08.a(I.Q0.a(bVar2, aVar2));
        p08.a(I.Q0.a(bVar, aVar4));
        arrayList.add(p08);
        I.P0 p09 = new I.P0();
        p09.a(I.Q0.a(bVar3, aVar));
        p09.a(I.Q0.a(bVar2, aVar2));
        p09.a(I.Q0.a(bVar, aVar4));
        arrayList.add(p09);
        I.P0 p010 = new I.P0();
        p010.a(I.Q0.a(bVar4, aVar));
        p010.a(I.Q0.a(bVar2, aVar2));
        p010.a(I.Q0.a(bVar, aVar4));
        arrayList.add(p010);
        I.P0 p011 = new I.P0();
        p011.a(I.Q0.a(bVar, aVar));
        p011.a(I.Q0.a(bVar2, aVar2));
        p011.a(I.Q0.a(bVar4, aVar4));
        arrayList.add(p011);
        I.P0 p012 = new I.P0();
        p012.a(I.Q0.a(bVar3, aVar));
        p012.a(I.Q0.a(bVar2, aVar2));
        p012.a(I.Q0.a(bVar4, aVar4));
        arrayList.add(p012);
        I.P0 p013 = new I.P0();
        p013.a(I.Q0.a(bVar4, aVar));
        p013.a(I.Q0.a(bVar2, aVar2));
        p013.a(I.Q0.a(bVar4, aVar4));
        arrayList.add(p013);
        return arrayList;
    }
}
