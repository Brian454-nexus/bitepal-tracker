package K0;

import Ea.r;
import I0.n;
import I0.w;
import I0.x;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class d implements w {

    /* renamed from: f, reason: collision with root package name */
    public static final b f2924f = new b(null);

    /* renamed from: g, reason: collision with root package name */
    public static final Set f2925g = new LinkedHashSet();

    /* renamed from: h, reason: collision with root package name */
    public static final h f2926h = new h();

    /* renamed from: a, reason: collision with root package name */
    public final Ea.h f2927a;

    /* renamed from: b, reason: collision with root package name */
    public final K0.c f2928b;

    /* renamed from: c, reason: collision with root package name */
    public final Function2 f2929c;

    /* renamed from: d, reason: collision with root package name */
    public final Function0 f2930d;

    /* renamed from: e, reason: collision with root package name */
    public final Lazy f2931e;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a extends Lambda implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f2932a = new a();

        public a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n invoke(r path, Ea.h hVar) {
            Intrinsics.checkNotNullParameter(path, "path");
            Intrinsics.checkNotNullParameter(hVar, "<anonymous parameter 1>");
            return f.a(path);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Set a() {
            return d.f2925g;
        }

        public final h b() {
            return d.f2926h;
        }

        public b() {
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c extends Lambda implements Function0 {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final r invoke() {
            r rVar = (r) d.this.f2930d.invoke();
            boolean e6 = rVar.e();
            d dVar = d.this;
            if (e6) {
                return rVar.h();
            }
            throw new IllegalStateException(("OkioStorage requires absolute paths, but did not get an absolute path from producePath = " + dVar.f2930d + ", instead got " + rVar).toString());
        }
    }

    /* renamed from: K0.d$d, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0053d extends Lambda implements Function0 {
        public C0053d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m0invoke();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m0invoke() {
            b bVar = d.f2924f;
            h b6 = bVar.b();
            d dVar = d.this;
            synchronized (b6) {
                bVar.a().remove(dVar.f().toString());
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public d(Ea.h fileSystem, K0.c serializer, Function2 coordinatorProducer, Function0 producePath) {
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(coordinatorProducer, "coordinatorProducer");
        Intrinsics.checkNotNullParameter(producePath, "producePath");
        this.f2927a = fileSystem;
        this.f2928b = serializer;
        this.f2929c = coordinatorProducer;
        this.f2930d = producePath;
        this.f2931e = LazyKt.lazy(new c());
    }

    @Override // I0.w
    public x a() {
        String rVar = f().toString();
        synchronized (f2926h) {
            Set set = f2925g;
            if (set.contains(rVar)) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + rVar + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            set.add(rVar);
        }
        return new e(this.f2927a, f(), this.f2928b, (n) this.f2929c.invoke(f(), this.f2927a), new C0053d());
    }

    public final r f() {
        return (r) this.f2931e.getValue();
    }

    public /* synthetic */ d(Ea.h hVar, K0.c cVar, Function2 function2, Function0 function0, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(hVar, cVar, (i6 & 4) != 0 ? a.f2932a : function2, function0);
    }
}
