package androidx.lifecycle;

import androidx.lifecycle.AbstractC1057i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import r.C2016c;
import s.C2038a;
import s.C2039b;

/* renamed from: androidx.lifecycle.n, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C1062n extends AbstractC1057i {

    /* renamed from: k, reason: collision with root package name */
    public static final a f9052k = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9053b;

    /* renamed from: c, reason: collision with root package name */
    public C2038a f9054c;

    /* renamed from: d, reason: collision with root package name */
    public AbstractC1057i.b f9055d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f9056e;

    /* renamed from: f, reason: collision with root package name */
    public int f9057f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9058g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9059h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f9060i;

    /* renamed from: j, reason: collision with root package name */
    public final ja.u f9061j;

    /* renamed from: androidx.lifecycle.n$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AbstractC1057i.b a(AbstractC1057i.b state1, AbstractC1057i.b bVar) {
            Intrinsics.checkNotNullParameter(state1, "state1");
            return (bVar == null || bVar.compareTo(state1) >= 0) ? state1 : bVar;
        }

        public a() {
        }
    }

    /* renamed from: androidx.lifecycle.n$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public AbstractC1057i.b f9062a;

        /* renamed from: b, reason: collision with root package name */
        public InterfaceC1059k f9063b;

        public b(InterfaceC1060l interfaceC1060l, AbstractC1057i.b initialState) {
            Intrinsics.checkNotNullParameter(initialState, "initialState");
            Intrinsics.checkNotNull(interfaceC1060l);
            this.f9063b = C1064p.f(interfaceC1060l);
            this.f9062a = initialState;
        }

        public final void a(InterfaceC1061m interfaceC1061m, AbstractC1057i.a event) {
            Intrinsics.checkNotNullParameter(event, "event");
            AbstractC1057i.b b6 = event.b();
            this.f9062a = C1062n.f9052k.a(this.f9062a, b6);
            InterfaceC1059k interfaceC1059k = this.f9063b;
            Intrinsics.checkNotNull(interfaceC1061m);
            interfaceC1059k.c(interfaceC1061m, event);
            this.f9062a = b6;
        }

        public final AbstractC1057i.b b() {
            return this.f9062a;
        }
    }

    public C1062n(InterfaceC1061m interfaceC1061m, boolean z6) {
        this.f9053b = z6;
        this.f9054c = new C2038a();
        AbstractC1057i.b bVar = AbstractC1057i.b.INITIALIZED;
        this.f9055d = bVar;
        this.f9060i = new ArrayList();
        this.f9056e = new WeakReference(interfaceC1061m);
        this.f9061j = ja.K.a(bVar);
    }

    @Override // androidx.lifecycle.AbstractC1057i
    public void a(InterfaceC1060l observer) {
        InterfaceC1061m interfaceC1061m;
        Intrinsics.checkNotNullParameter(observer, "observer");
        f("addObserver");
        AbstractC1057i.b bVar = this.f9055d;
        AbstractC1057i.b bVar2 = AbstractC1057i.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = AbstractC1057i.b.INITIALIZED;
        }
        b bVar3 = new b(observer, bVar2);
        if (((b) this.f9054c.k(observer, bVar3)) == null && (interfaceC1061m = (InterfaceC1061m) this.f9056e.get()) != null) {
            boolean z6 = this.f9057f != 0 || this.f9058g;
            AbstractC1057i.b e6 = e(observer);
            this.f9057f++;
            while (bVar3.b().compareTo(e6) < 0 && this.f9054c.contains(observer)) {
                l(bVar3.b());
                AbstractC1057i.a b6 = AbstractC1057i.a.Companion.b(bVar3.b());
                if (b6 == null) {
                    throw new IllegalStateException("no event up from " + bVar3.b());
                }
                bVar3.a(interfaceC1061m, b6);
                k();
                e6 = e(observer);
            }
            if (!z6) {
                n();
            }
            this.f9057f--;
        }
    }

    @Override // androidx.lifecycle.AbstractC1057i
    public AbstractC1057i.b b() {
        return this.f9055d;
    }

    @Override // androidx.lifecycle.AbstractC1057i
    public void c(InterfaceC1060l observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        f("removeObserver");
        this.f9054c.l(observer);
    }

    public final void d(InterfaceC1061m interfaceC1061m) {
        Iterator descendingIterator = this.f9054c.descendingIterator();
        Intrinsics.checkNotNullExpressionValue(descendingIterator, "observerMap.descendingIterator()");
        while (descendingIterator.hasNext() && !this.f9059h) {
            Map.Entry entry = (Map.Entry) descendingIterator.next();
            Intrinsics.checkNotNullExpressionValue(entry, "next()");
            InterfaceC1060l interfaceC1060l = (InterfaceC1060l) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.b().compareTo(this.f9055d) > 0 && !this.f9059h && this.f9054c.contains(interfaceC1060l)) {
                AbstractC1057i.a a6 = AbstractC1057i.a.Companion.a(bVar.b());
                if (a6 == null) {
                    throw new IllegalStateException("no event down from " + bVar.b());
                }
                l(a6.b());
                bVar.a(interfaceC1061m, a6);
                k();
            }
        }
    }

    public final AbstractC1057i.b e(InterfaceC1060l interfaceC1060l) {
        b bVar;
        Map.Entry m6 = this.f9054c.m(interfaceC1060l);
        AbstractC1057i.b bVar2 = null;
        AbstractC1057i.b b6 = (m6 == null || (bVar = (b) m6.getValue()) == null) ? null : bVar.b();
        if (!this.f9060i.isEmpty()) {
            bVar2 = (AbstractC1057i.b) this.f9060i.get(r0.size() - 1);
        }
        a aVar = f9052k;
        return aVar.a(aVar.a(this.f9055d, b6), bVar2);
    }

    public final void f(String str) {
        if (!this.f9053b || C2016c.g().b()) {
            return;
        }
        throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
    }

    public final void g(InterfaceC1061m interfaceC1061m) {
        C2039b.d c6 = this.f9054c.c();
        Intrinsics.checkNotNullExpressionValue(c6, "observerMap.iteratorWithAdditions()");
        while (c6.hasNext() && !this.f9059h) {
            Map.Entry entry = (Map.Entry) c6.next();
            InterfaceC1060l interfaceC1060l = (InterfaceC1060l) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.b().compareTo(this.f9055d) < 0 && !this.f9059h && this.f9054c.contains(interfaceC1060l)) {
                l(bVar.b());
                AbstractC1057i.a b6 = AbstractC1057i.a.Companion.b(bVar.b());
                if (b6 == null) {
                    throw new IllegalStateException("no event up from " + bVar.b());
                }
                bVar.a(interfaceC1061m, b6);
                k();
            }
        }
    }

    public void h(AbstractC1057i.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        f("handleLifecycleEvent");
        j(event.b());
    }

    public final boolean i() {
        if (this.f9054c.size() == 0) {
            return true;
        }
        Map.Entry a6 = this.f9054c.a();
        Intrinsics.checkNotNull(a6);
        AbstractC1057i.b b6 = ((b) a6.getValue()).b();
        Map.Entry h6 = this.f9054c.h();
        Intrinsics.checkNotNull(h6);
        AbstractC1057i.b b7 = ((b) h6.getValue()).b();
        return b6 == b7 && this.f9055d == b7;
    }

    public final void j(AbstractC1057i.b bVar) {
        AbstractC1057i.b bVar2 = this.f9055d;
        if (bVar2 == bVar) {
            return;
        }
        if (bVar2 == AbstractC1057i.b.INITIALIZED && bVar == AbstractC1057i.b.DESTROYED) {
            throw new IllegalStateException(("no event down from " + this.f9055d + " in component " + this.f9056e.get()).toString());
        }
        this.f9055d = bVar;
        if (this.f9058g || this.f9057f != 0) {
            this.f9059h = true;
            return;
        }
        this.f9058g = true;
        n();
        this.f9058g = false;
        if (this.f9055d == AbstractC1057i.b.DESTROYED) {
            this.f9054c = new C2038a();
        }
    }

    public final void k() {
        this.f9060i.remove(r0.size() - 1);
    }

    public final void l(AbstractC1057i.b bVar) {
        this.f9060i.add(bVar);
    }

    public void m(AbstractC1057i.b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        f("setCurrentState");
        j(state);
    }

    public final void n() {
        InterfaceC1061m interfaceC1061m = (InterfaceC1061m) this.f9056e.get();
        if (interfaceC1061m == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (!i()) {
            this.f9059h = false;
            AbstractC1057i.b bVar = this.f9055d;
            Map.Entry a6 = this.f9054c.a();
            Intrinsics.checkNotNull(a6);
            if (bVar.compareTo(((b) a6.getValue()).b()) < 0) {
                d(interfaceC1061m);
            }
            Map.Entry h6 = this.f9054c.h();
            if (!this.f9059h && h6 != null && this.f9055d.compareTo(((b) h6.getValue()).b()) > 0) {
                g(interfaceC1061m);
            }
        }
        this.f9059h = false;
        this.f9061j.setValue(b());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1062n(InterfaceC1061m provider) {
        this(provider, true);
        Intrinsics.checkNotNullParameter(provider, "provider");
    }
}
