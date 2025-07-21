package com.amazon.a.a.b.b;

import com.amazon.a.a.o.c;
import com.amazon.d.a.h;
import com.amazon.d.a.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class a extends com.amazon.a.a.n.a.a {

    /* renamed from: b, reason: collision with root package name */
    private static final c f10836b = new c("SubmitCrashReportsTask");

    /* renamed from: c, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.b.a f10837c;

    /* renamed from: d, reason: collision with root package name */
    private List<com.amazon.a.a.b.c> f10838d;

    @Override // com.amazon.a.a.n.a.a
    public void a(h hVar) {
    }

    @Override // com.amazon.a.a.n.a.a
    public String a_() {
        return "submit_crash_reports";
    }

    @Override // com.amazon.a.a.n.a.a
    public Map<String, Object> b() {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        Iterator<com.amazon.a.a.b.c> it = this.f10838d.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a());
        }
        hashMap.put("reports", arrayList);
        return hashMap;
    }

    @Override // com.amazon.a.a.n.a.a
    public String c() {
        return "1.0";
    }

    @Override // com.amazon.a.a.n.a.a
    public boolean d() {
        return !this.f10838d.isEmpty();
    }

    @Override // com.amazon.a.a.n.a.a
    public void e() {
        this.f10838d = this.f10837c.a();
        if (c.f11253a) {
            c cVar = f10836b;
            cVar.a("--------------- Crash Reports -------------------");
            cVar.a("Size: " + this.f10838d.size());
            cVar.a("--------------------------------------------------");
        }
    }

    @Override // com.amazon.a.a.n.a.a
    public void a(j jVar) {
        this.f10837c.a(this.f10838d);
    }
}
