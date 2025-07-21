package e;

import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC1057i;
import androidx.lifecycle.InterfaceC1059k;
import androidx.lifecycle.InterfaceC1061m;
import e.w;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import y0.InterfaceC2343a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f13563a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2343a f13564b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f13565c;

    /* renamed from: d, reason: collision with root package name */
    public v f13566d;

    /* renamed from: e, reason: collision with root package name */
    public OnBackInvokedCallback f13567e;

    /* renamed from: f, reason: collision with root package name */
    public OnBackInvokedDispatcher f13568f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f13569g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f13570h;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(C1208b backEvent) {
            Intrinsics.checkNotNullParameter(backEvent, "backEvent");
            w.this.m(backEvent);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C1208b) obj);
            return Unit.INSTANCE;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        public final void a(C1208b backEvent) {
            Intrinsics.checkNotNullParameter(backEvent, "backEvent");
            w.this.l(backEvent);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C1208b) obj);
            return Unit.INSTANCE;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c extends Lambda implements Function0 {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m7invoke();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m7invoke() {
            w.this.k();
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class d extends Lambda implements Function0 {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m8invoke();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m8invoke() {
            w.this.j();
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class e extends Lambda implements Function0 {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m9invoke();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m9invoke() {
            w.this.k();
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public static final f f13576a = new f();

        public static final void c(Function0 onBackInvoked) {
            Intrinsics.checkNotNullParameter(onBackInvoked, "$onBackInvoked");
            onBackInvoked.invoke();
        }

        @NotNull
        public final OnBackInvokedCallback b(@NotNull final Function0<Unit> onBackInvoked) {
            Intrinsics.checkNotNullParameter(onBackInvoked, "onBackInvoked");
            return new OnBackInvokedCallback() { // from class: e.x
                public final void onBackInvoked() {
                    w.f.c(Function0.this);
                }
            };
        }

        public final void d(@NotNull Object dispatcher, int i6, @NotNull Object callback) {
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            Intrinsics.checkNotNullParameter(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(i6, (OnBackInvokedCallback) callback);
        }

        public final void e(@NotNull Object dispatcher, @NotNull Object callback) {
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            Intrinsics.checkNotNullParameter(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public static final g f13577a = new g();

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class a implements OnBackAnimationCallback {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Function1 f13578a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Function1 f13579b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Function0 f13580c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Function0 f13581d;

            public a(Function1 function1, Function1 function12, Function0 function0, Function0 function02) {
                this.f13578a = function1;
                this.f13579b = function12;
                this.f13580c = function0;
                this.f13581d = function02;
            }

            public void onBackCancelled() {
                this.f13581d.invoke();
            }

            public void onBackInvoked() {
                this.f13580c.invoke();
            }

            public void onBackProgressed(BackEvent backEvent) {
                Intrinsics.checkNotNullParameter(backEvent, "backEvent");
                this.f13579b.invoke(new C1208b(backEvent));
            }

            public void onBackStarted(BackEvent backEvent) {
                Intrinsics.checkNotNullParameter(backEvent, "backEvent");
                this.f13578a.invoke(new C1208b(backEvent));
            }
        }

        @NotNull
        public final OnBackInvokedCallback a(@NotNull Function1<? super C1208b, Unit> onBackStarted, @NotNull Function1<? super C1208b, Unit> onBackProgressed, @NotNull Function0<Unit> onBackInvoked, @NotNull Function0<Unit> onBackCancelled) {
            Intrinsics.checkNotNullParameter(onBackStarted, "onBackStarted");
            Intrinsics.checkNotNullParameter(onBackProgressed, "onBackProgressed");
            Intrinsics.checkNotNullParameter(onBackInvoked, "onBackInvoked");
            Intrinsics.checkNotNullParameter(onBackCancelled, "onBackCancelled");
            return new a(onBackStarted, onBackProgressed, onBackInvoked, onBackCancelled);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class h implements InterfaceC1059k, InterfaceC1209c {

        /* renamed from: a, reason: collision with root package name */
        public final AbstractC1057i f13582a;

        /* renamed from: b, reason: collision with root package name */
        public final v f13583b;

        /* renamed from: c, reason: collision with root package name */
        public InterfaceC1209c f13584c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ w f13585d;

        public h(w wVar, AbstractC1057i lifecycle, v onBackPressedCallback) {
            Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
            Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
            this.f13585d = wVar;
            this.f13582a = lifecycle;
            this.f13583b = onBackPressedCallback;
            lifecycle.a(this);
        }

        @Override // androidx.lifecycle.InterfaceC1059k
        public void c(InterfaceC1061m source, AbstractC1057i.a event) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(event, "event");
            if (event == AbstractC1057i.a.ON_START) {
                this.f13584c = this.f13585d.i(this.f13583b);
                return;
            }
            if (event != AbstractC1057i.a.ON_STOP) {
                if (event == AbstractC1057i.a.ON_DESTROY) {
                    cancel();
                }
            } else {
                InterfaceC1209c interfaceC1209c = this.f13584c;
                if (interfaceC1209c != null) {
                    interfaceC1209c.cancel();
                }
            }
        }

        @Override // e.InterfaceC1209c
        public void cancel() {
            this.f13582a.c(this);
            this.f13583b.i(this);
            InterfaceC1209c interfaceC1209c = this.f13584c;
            if (interfaceC1209c != null) {
                interfaceC1209c.cancel();
            }
            this.f13584c = null;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class i implements InterfaceC1209c {

        /* renamed from: a, reason: collision with root package name */
        public final v f13586a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ w f13587b;

        public i(w wVar, v onBackPressedCallback) {
            Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
            this.f13587b = wVar;
            this.f13586a = onBackPressedCallback;
        }

        @Override // e.InterfaceC1209c
        public void cancel() {
            this.f13587b.f13565c.remove(this.f13586a);
            if (Intrinsics.areEqual(this.f13587b.f13566d, this.f13586a)) {
                this.f13586a.c();
                this.f13587b.f13566d = null;
            }
            this.f13586a.i(this);
            Function0 b6 = this.f13586a.b();
            if (b6 != null) {
                b6.invoke();
            }
            this.f13586a.k(null);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public /* synthetic */ class j extends FunctionReferenceImpl implements Function0 {
        public j(Object obj) {
            super(0, obj, w.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        public final void a() {
            ((w) this.receiver).p();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public /* synthetic */ class k extends FunctionReferenceImpl implements Function0 {
        public k(Object obj) {
            super(0, obj, w.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        public final void a() {
            ((w) this.receiver).p();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public w(Runnable runnable, InterfaceC2343a interfaceC2343a) {
        OnBackInvokedCallback b6;
        this.f13563a = runnable;
        this.f13564b = interfaceC2343a;
        this.f13565c = new ArrayDeque();
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 33) {
            if (i6 >= 34) {
                b6 = g.f13577a.a(new a(), new b(), new c(), new d());
            } else {
                b6 = f.f13576a.b(new e());
            }
            this.f13567e = b6;
        }
    }

    public final void h(InterfaceC1061m owner, v onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        AbstractC1057i lifecycle = owner.getLifecycle();
        if (lifecycle.b() == AbstractC1057i.b.DESTROYED) {
            return;
        }
        onBackPressedCallback.a(new h(this, lifecycle, onBackPressedCallback));
        p();
        onBackPressedCallback.k(new j(this));
    }

    public final InterfaceC1209c i(v onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        this.f13565c.add(onBackPressedCallback);
        i iVar = new i(this, onBackPressedCallback);
        onBackPressedCallback.a(iVar);
        p();
        onBackPressedCallback.k(new k(this));
        return iVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void j() {
        v vVar;
        v vVar2 = this.f13566d;
        if (vVar2 == null) {
            ArrayDeque arrayDeque = this.f13565c;
            ListIterator listIterator = arrayDeque.listIterator(arrayDeque.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    vVar = 0;
                    break;
                } else {
                    vVar = listIterator.previous();
                    if (((v) vVar).g()) {
                        break;
                    }
                }
            }
            vVar2 = vVar;
        }
        this.f13566d = null;
        if (vVar2 != null) {
            vVar2.c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void k() {
        v vVar;
        v vVar2 = this.f13566d;
        if (vVar2 == null) {
            ArrayDeque arrayDeque = this.f13565c;
            ListIterator listIterator = arrayDeque.listIterator(arrayDeque.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    vVar = 0;
                    break;
                } else {
                    vVar = listIterator.previous();
                    if (((v) vVar).g()) {
                        break;
                    }
                }
            }
            vVar2 = vVar;
        }
        this.f13566d = null;
        if (vVar2 != null) {
            vVar2.d();
            return;
        }
        Runnable runnable = this.f13563a;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    public final void l(C1208b c1208b) {
        v vVar;
        v vVar2 = this.f13566d;
        if (vVar2 == null) {
            ArrayDeque arrayDeque = this.f13565c;
            ListIterator listIterator = arrayDeque.listIterator(arrayDeque.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    vVar = 0;
                    break;
                } else {
                    vVar = listIterator.previous();
                    if (((v) vVar).g()) {
                        break;
                    }
                }
            }
            vVar2 = vVar;
        }
        if (vVar2 != null) {
            vVar2.e(c1208b);
        }
    }

    public final void m(C1208b c1208b) {
        Object obj;
        ArrayDeque arrayDeque = this.f13565c;
        ListIterator listIterator = arrayDeque.listIterator(arrayDeque.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            } else {
                obj = listIterator.previous();
                if (((v) obj).g()) {
                    break;
                }
            }
        }
        v vVar = (v) obj;
        if (this.f13566d != null) {
            j();
        }
        this.f13566d = vVar;
        if (vVar != null) {
            vVar.f(c1208b);
        }
    }

    public final void n(OnBackInvokedDispatcher invoker) {
        Intrinsics.checkNotNullParameter(invoker, "invoker");
        this.f13568f = invoker;
        o(this.f13570h);
    }

    public final void o(boolean z6) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f13568f;
        OnBackInvokedCallback onBackInvokedCallback = this.f13567e;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (z6 && !this.f13569g) {
            f.f13576a.d(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f13569g = true;
        } else {
            if (z6 || !this.f13569g) {
                return;
            }
            f.f13576a.e(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f13569g = false;
        }
    }

    public final void p() {
        boolean z6 = this.f13570h;
        ArrayDeque arrayDeque = this.f13565c;
        boolean z7 = false;
        if (arrayDeque == null || !arrayDeque.isEmpty()) {
            Iterator it = arrayDeque.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((v) it.next()).g()) {
                    z7 = true;
                    break;
                }
            }
        }
        this.f13570h = z7;
        if (z7 != z6) {
            InterfaceC2343a interfaceC2343a = this.f13564b;
            if (interfaceC2343a != null) {
                interfaceC2343a.accept(Boolean.valueOf(z7));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                o(z7);
            }
        }
    }

    public w(Runnable runnable) {
        this(runnable, null);
    }
}
