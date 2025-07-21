package com.braze.lrucache;

import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f12344a;

    public a(f fVar) {
        this.f12344a = fVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        synchronized (this.f12344a) {
            try {
                f fVar = this.f12344a;
                if (fVar.f12362i == null) {
                    return null;
                }
                while (fVar.f12361h > fVar.f12359f) {
                    fVar.d((String) ((Map.Entry) fVar.f12363j.entrySet().iterator().next()).getKey());
                }
                if (this.f12344a.a()) {
                    this.f12344a.d();
                    this.f12344a.f12364k = 0;
                }
                return null;
            } finally {
            }
        }
    }
}
