package y;

import F.AbstractC0335i0;
import F.C0333h0;
import F.C0346s;
import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import z.C2375g;

/* renamed from: y.w, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2335w implements I.C {

    /* renamed from: a, reason: collision with root package name */
    public final G.a f21110a;

    /* renamed from: b, reason: collision with root package name */
    public final I.K f21111b;

    /* renamed from: c, reason: collision with root package name */
    public final I.J f21112c;

    /* renamed from: d, reason: collision with root package name */
    public final z.N f21113d;

    /* renamed from: e, reason: collision with root package name */
    public final List f21114e;

    /* renamed from: f, reason: collision with root package name */
    public final D0 f21115f;

    /* renamed from: g, reason: collision with root package name */
    public final Map f21116g = new HashMap();

    public C2335w(Context context, I.K k6, C0346s c0346s) {
        this.f21111b = k6;
        z.N b6 = z.N.b(context, k6.c());
        this.f21113d = b6;
        this.f21115f = D0.c(context);
        this.f21114e = e(AbstractC2323p0.b(this, c0346s));
        D.a aVar = new D.a(b6);
        this.f21110a = aVar;
        I.J j6 = new I.J(aVar, 1);
        this.f21112c = j6;
        aVar.b(j6);
    }

    @Override // I.C
    public Set a() {
        return new LinkedHashSet(this.f21114e);
    }

    @Override // I.C
    public I.E b(String str) {
        if (this.f21114e.contains(str)) {
            return new K(this.f21113d, str, f(str), this.f21110a, this.f21112c, this.f21111b.b(), this.f21111b.c(), this.f21115f);
        }
        throw new IllegalArgumentException("The given camera id is not on the available camera id list.");
    }

    @Override // I.C
    public G.a d() {
        return this.f21110a;
    }

    public final List e(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.equals("0") || str.equals("1")) {
                arrayList.add(str);
            } else if (h(str)) {
                arrayList.add(str);
            } else {
                AbstractC0335i0.a("Camera2CameraFactory", "Camera " + str + " is filtered out because its capabilities do not contain REQUEST_AVAILABLE_CAPABILITIES_BACKWARD_COMPATIBLE.");
            }
        }
        return arrayList;
    }

    public N f(String str) {
        try {
            N n6 = (N) this.f21116g.get(str);
            if (n6 != null) {
                return n6;
            }
            N n7 = new N(str, this.f21113d);
            this.f21116g.put(str, n7);
            return n7;
        } catch (C2375g e6) {
            throw AbstractC2326r0.a(e6);
        }
    }

    @Override // I.C
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public z.N c() {
        return this.f21113d;
    }

    public final boolean h(String str) {
        if ("robolectric".equals(Build.FINGERPRINT)) {
            return true;
        }
        try {
            int[] iArr = (int[]) this.f21113d.c(str).a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i6 : iArr) {
                    if (i6 == 0) {
                        return true;
                    }
                }
            }
            return false;
        } catch (C2375g e6) {
            throw new C0333h0(AbstractC2326r0.a(e6));
        }
    }
}
