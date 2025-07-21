package S;

import S.c;
import java.util.ArrayDeque;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final int f4628a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f4629b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4630c;

    /* renamed from: d, reason: collision with root package name */
    public final c.a f4631d;

    public a(int i6) {
        this(i6, null);
    }

    @Override // S.c
    public Object a() {
        Object removeLast;
        synchronized (this.f4630c) {
            removeLast = this.f4629b.removeLast();
        }
        return removeLast;
    }

    @Override // S.c
    public void b(Object obj) {
        Object a6;
        synchronized (this.f4630c) {
            try {
                a6 = this.f4629b.size() >= this.f4628a ? a() : null;
                this.f4629b.addFirst(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        c.a aVar = this.f4631d;
        if (aVar == null || a6 == null) {
            return;
        }
        aVar.a(a6);
    }

    @Override // S.c
    public boolean isEmpty() {
        boolean isEmpty;
        synchronized (this.f4630c) {
            isEmpty = this.f4629b.isEmpty();
        }
        return isEmpty;
    }

    public a(int i6, c.a aVar) {
        this.f4630c = new Object();
        this.f4628a = i6;
        this.f4629b = new ArrayDeque(i6);
        this.f4631d = aVar;
    }
}
