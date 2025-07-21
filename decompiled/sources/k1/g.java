package k1;

import java.util.Collections;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f16351a;

    /* renamed from: b, reason: collision with root package name */
    public final long f16352b;

    /* renamed from: c, reason: collision with root package name */
    public final List f16353c;

    /* renamed from: d, reason: collision with root package name */
    public final List f16354d;

    /* renamed from: e, reason: collision with root package name */
    public final C1661e f16355e;

    public g(String str, long j6, List list, List list2) {
        this(str, j6, list, list2, null);
    }

    public int a(int i6) {
        int size = this.f16353c.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (((C1657a) this.f16353c.get(i7)).f16307b == i6) {
                return i7;
            }
        }
        return -1;
    }

    public g(String str, long j6, List list, List list2, C1661e c1661e) {
        this.f16351a = str;
        this.f16352b = j6;
        this.f16353c = Collections.unmodifiableList(list);
        this.f16354d = Collections.unmodifiableList(list2);
        this.f16355e = c1661e;
    }
}
