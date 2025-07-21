package C;

import B.D;
import android.util.Size;
import java.util.ArrayList;
import java.util.Comparator;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class r {

    /* renamed from: b, reason: collision with root package name */
    public static final Size f405b = new Size(320, 240);

    /* renamed from: c, reason: collision with root package name */
    public static final Comparator f406c = new L.e();

    /* renamed from: a, reason: collision with root package name */
    public final D f407a = (D) B.l.a(D.class);

    public Size[] a(Size[] sizeArr) {
        if (this.f407a == null || !D.d()) {
            return sizeArr;
        }
        ArrayList arrayList = new ArrayList();
        for (Size size : sizeArr) {
            if (f406c.compare(size, f405b) >= 0) {
                arrayList.add(size);
            }
        }
        return (Size[]) arrayList.toArray(new Size[0]);
    }
}
