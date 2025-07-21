package D;

import E.h;
import F.AbstractC0335i0;
import F.r;
import G.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import z.C2375g;
import z.N;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class a implements G.a {

    /* renamed from: a, reason: collision with root package name */
    public final N f733a;

    /* renamed from: f, reason: collision with root package name */
    public int f738f = 0;

    /* renamed from: c, reason: collision with root package name */
    public final Map f735c = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public Set f737e = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final List f734b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public List f736d = new ArrayList();

    public a(N n6) {
        this.f733a = n6;
        e();
    }

    @Override // G.a
    public int a() {
        return this.f738f;
    }

    @Override // G.a
    public void b(a.InterfaceC0033a interfaceC0033a) {
        this.f734b.add(interfaceC0033a);
    }

    @Override // G.a
    public String c(String str) {
        if (!this.f735c.containsKey(str)) {
            return null;
        }
        for (String str2 : (List) this.f735c.get(str)) {
            Iterator it = this.f736d.iterator();
            while (it.hasNext()) {
                if (str2.equals(h.a((r) it.next()).c())) {
                    return str2;
                }
            }
        }
        return null;
    }

    @Override // G.a
    public void d(int i6) {
        if (i6 != this.f738f) {
            Iterator it = this.f734b.iterator();
            while (it.hasNext()) {
                ((a.InterfaceC0033a) it.next()).a(this.f738f, i6);
            }
        }
        if (this.f738f == 2 && i6 != 2) {
            this.f736d.clear();
        }
        this.f738f = i6;
    }

    public final void e() {
        try {
            this.f737e = this.f733a.e();
        } catch (C2375g unused) {
            AbstractC0335i0.c("Camera2CameraCoordinator", "Failed to get concurrent camera ids");
        }
        Iterator it = this.f737e.iterator();
        while (it.hasNext()) {
            ArrayList arrayList = new ArrayList((Set) it.next());
            if (arrayList.size() >= 2) {
                String str = (String) arrayList.get(0);
                String str2 = (String) arrayList.get(1);
                if (!this.f735c.containsKey(str)) {
                    this.f735c.put(str, new ArrayList());
                }
                if (!this.f735c.containsKey(str2)) {
                    this.f735c.put(str2, new ArrayList());
                }
                ((List) this.f735c.get(str)).add((String) arrayList.get(1));
                ((List) this.f735c.get(str2)).add((String) arrayList.get(0));
            }
        }
    }
}
