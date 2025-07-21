package U4;

import java.util.Queue;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final Queue f5223a = n5.l.g(20);

    public abstract l a();

    public l b() {
        l lVar = (l) this.f5223a.poll();
        return lVar == null ? a() : lVar;
    }

    public void c(l lVar) {
        if (this.f5223a.size() < 20) {
            this.f5223a.offer(lVar);
        }
    }
}
