package com.braze.triggers.conditions.logical;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a extends b {
    public a(ArrayList arrayList) {
        super(arrayList);
    }

    @Override // com.braze.triggers.conditions.c
    public final boolean a(com.braze.triggers.events.b bVar) {
        Iterator it = this.f13043a.iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            if (!((com.braze.triggers.conditions.c) it.next()).a(bVar)) {
                return false;
            }
            z6 = true;
        }
        return z6;
    }
}
