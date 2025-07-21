package C;

import F.AbstractC0335i0;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f397a;

    /* renamed from: b, reason: collision with root package name */
    public final B.p f398b = (B.p) B.l.a(B.p.class);

    /* renamed from: c, reason: collision with root package name */
    public final e f399c;

    public m(String str) {
        this.f397a = str;
        this.f399c = new e(str);
    }

    public final void a(List list, int i6) {
        B.p pVar = this.f398b;
        if (pVar == null) {
            return;
        }
        Size[] d6 = pVar.d(i6);
        if (d6.length > 0) {
            list.addAll(Arrays.asList(d6));
        }
    }

    public Size[] b(Size[] sizeArr, int i6) {
        ArrayList arrayList = new ArrayList(Arrays.asList(sizeArr));
        a(arrayList, i6);
        c(arrayList, i6);
        if (arrayList.isEmpty()) {
            AbstractC0335i0.l("OutputSizesCorrector", "Sizes array becomes empty after excluding problematic output sizes.");
        }
        return (Size[]) arrayList.toArray(new Size[0]);
    }

    public final void c(List list, int i6) {
        List a6 = this.f399c.a(i6);
        if (a6.isEmpty()) {
            return;
        }
        list.removeAll(a6);
    }
}
