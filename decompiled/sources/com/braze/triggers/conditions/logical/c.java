package com.braze.triggers.conditions.logical;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class c extends b {
    public c(ArrayList arrayList) {
        super(arrayList);
    }

    @Override // com.braze.triggers.conditions.c
    public final boolean a(com.braze.triggers.events.b bVar) {
        Iterator it = this.f13043a.iterator();
        while (it.hasNext()) {
            if (((com.braze.triggers.conditions.c) it.next()).a(bVar)) {
                return true;
            }
        }
        return false;
    }
}
