package com.amazon.a.a.h.a;

import com.amazon.a.a.h.b;
import com.amazon.a.a.o.c;
import com.amazon.d.a.h;
import com.amazon.d.a.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class a extends com.amazon.a.a.n.a.a {

    /* renamed from: b, reason: collision with root package name */
    private static final c f10910b = new c("SubmitMetricsTask");

    /* renamed from: c, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.h.c f10911c;

    /* renamed from: d, reason: collision with root package name */
    private b f10912d;

    @Override // com.amazon.a.a.n.a.a
    public void a(h hVar) {
    }

    @Override // com.amazon.a.a.n.a.a
    public String a_() {
        return "submit_metrics";
    }

    @Override // com.amazon.a.a.n.a.a
    public Map<String, Object> b() {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList(this.f10912d.c());
        Iterator<com.amazon.a.a.h.a> it = this.f10912d.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a());
        }
        hashMap.put("metrics", arrayList);
        return hashMap;
    }

    @Override // com.amazon.a.a.n.a.a
    public String c() {
        return "1.0";
    }

    @Override // com.amazon.a.a.n.a.a
    public boolean d() {
        return !this.f10912d.a();
    }

    @Override // com.amazon.a.a.n.a.a
    public void e() {
        this.f10912d = this.f10911c.a();
        if (c.f11253a) {
            c cVar = f10910b;
            cVar.a("--------------- SUBMIT METRICS -------------------");
            cVar.a("Size: " + this.f10912d.c());
            cVar.a("--------------------------------------------------");
        }
    }

    @Override // com.amazon.a.a.n.a.a
    public void a(j jVar) {
    }
}
