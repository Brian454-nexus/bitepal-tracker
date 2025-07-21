package g;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.AbstractC1057i;
import androidx.lifecycle.InterfaceC1059k;
import androidx.lifecycle.InterfaceC1061m;
import h.AbstractC1389a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.random.Random;
import kotlin.sequences.SequencesKt;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class e {

    /* renamed from: h, reason: collision with root package name */
    public static final b f14238h = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final Map f14239a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Map f14240b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final Map f14241c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final List f14242d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final transient Map f14243e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final Map f14244f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f14245g = new Bundle();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final g.b f14246a;

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC1389a f14247b;

        public a(g.b callback, AbstractC1389a contract) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            Intrinsics.checkNotNullParameter(contract, "contract");
            this.f14246a = callback;
            this.f14247b = contract;
        }

        public final g.b a() {
            return this.f14246a;
        }

        public final AbstractC1389a b() {
            return this.f14247b;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final AbstractC1057i f14248a;

        /* renamed from: b, reason: collision with root package name */
        public final List f14249b;

        public c(AbstractC1057i lifecycle) {
            Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
            this.f14248a = lifecycle;
            this.f14249b = new ArrayList();
        }

        public final void a(InterfaceC1059k observer) {
            Intrinsics.checkNotNullParameter(observer, "observer");
            this.f14248a.a(observer);
            this.f14249b.add(observer);
        }

        public final void b() {
            Iterator it = this.f14249b.iterator();
            while (it.hasNext()) {
                this.f14248a.c((InterfaceC1059k) it.next());
            }
            this.f14249b.clear();
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class d extends Lambda implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f14250a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf(Random.INSTANCE.nextInt(2147418112) + 65536);
        }
    }

    /* renamed from: g.e$e, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0197e extends g.c {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f14252b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AbstractC1389a f14253c;

        public C0197e(String str, AbstractC1389a abstractC1389a) {
            this.f14252b = str;
            this.f14253c = abstractC1389a;
        }

        @Override // g.c
        public void b(Object obj, androidx.core.app.b bVar) {
            Object obj2 = e.this.f14240b.get(this.f14252b);
            AbstractC1389a abstractC1389a = this.f14253c;
            if (obj2 != null) {
                int intValue = ((Number) obj2).intValue();
                e.this.f14242d.add(this.f14252b);
                try {
                    e.this.i(intValue, this.f14253c, obj, bVar);
                    return;
                } catch (Exception e6) {
                    e.this.f14242d.remove(this.f14252b);
                    throw e6;
                }
            }
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC1389a + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }

        @Override // g.c
        public void c() {
            e.this.p(this.f14252b);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class f extends g.c {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f14255b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AbstractC1389a f14256c;

        public f(String str, AbstractC1389a abstractC1389a) {
            this.f14255b = str;
            this.f14256c = abstractC1389a;
        }

        @Override // g.c
        public void b(Object obj, androidx.core.app.b bVar) {
            Object obj2 = e.this.f14240b.get(this.f14255b);
            AbstractC1389a abstractC1389a = this.f14256c;
            if (obj2 != null) {
                int intValue = ((Number) obj2).intValue();
                e.this.f14242d.add(this.f14255b);
                try {
                    e.this.i(intValue, this.f14256c, obj, bVar);
                    return;
                } catch (Exception e6) {
                    e.this.f14242d.remove(this.f14255b);
                    throw e6;
                }
            }
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC1389a + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }

        @Override // g.c
        public void c() {
            e.this.p(this.f14255b);
        }
    }

    public static final void n(e this$0, String key, g.b callback, AbstractC1389a contract, InterfaceC1061m interfaceC1061m, AbstractC1057i.a event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(key, "$key");
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(contract, "$contract");
        Intrinsics.checkNotNullParameter(interfaceC1061m, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (AbstractC1057i.a.ON_START != event) {
            if (AbstractC1057i.a.ON_STOP == event) {
                this$0.f14243e.remove(key);
                return;
            } else {
                if (AbstractC1057i.a.ON_DESTROY == event) {
                    this$0.p(key);
                    return;
                }
                return;
            }
        }
        this$0.f14243e.put(key, new a(callback, contract));
        if (this$0.f14244f.containsKey(key)) {
            Object obj = this$0.f14244f.get(key);
            this$0.f14244f.remove(key);
            callback.a(obj);
        }
        C1310a c1310a = (C1310a) v0.c.a(this$0.f14245g, key, C1310a.class);
        if (c1310a != null) {
            this$0.f14245g.remove(key);
            callback.a(contract.c(c1310a.c(), c1310a.a()));
        }
    }

    public final void d(int i6, String str) {
        this.f14239a.put(Integer.valueOf(i6), str);
        this.f14240b.put(str, Integer.valueOf(i6));
    }

    public final boolean e(int i6, int i7, Intent intent) {
        String str = (String) this.f14239a.get(Integer.valueOf(i6));
        if (str == null) {
            return false;
        }
        g(str, i7, intent, (a) this.f14243e.get(str));
        return true;
    }

    public final boolean f(int i6, Object obj) {
        String str = (String) this.f14239a.get(Integer.valueOf(i6));
        if (str == null) {
            return false;
        }
        a aVar = (a) this.f14243e.get(str);
        if ((aVar != null ? aVar.a() : null) == null) {
            this.f14245g.remove(str);
            this.f14244f.put(str, obj);
            return true;
        }
        g.b a6 = aVar.a();
        Intrinsics.checkNotNull(a6, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
        if (!this.f14242d.remove(str)) {
            return true;
        }
        a6.a(obj);
        return true;
    }

    public final void g(String str, int i6, Intent intent, a aVar) {
        if ((aVar != null ? aVar.a() : null) == null || !this.f14242d.contains(str)) {
            this.f14244f.remove(str);
            this.f14245g.putParcelable(str, new C1310a(i6, intent));
        } else {
            aVar.a().a(aVar.b().c(i6, intent));
            this.f14242d.remove(str);
        }
    }

    public final int h() {
        for (Number number : SequencesKt.generateSequence(d.f14250a)) {
            if (!this.f14239a.containsKey(Integer.valueOf(number.intValue()))) {
                return number.intValue();
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public abstract void i(int i6, AbstractC1389a abstractC1389a, Object obj, androidx.core.app.b bVar);

    public final void j(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        if (stringArrayList2 != null) {
            this.f14242d.addAll(stringArrayList2);
        }
        Bundle bundle2 = bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
        if (bundle2 != null) {
            this.f14245g.putAll(bundle2);
        }
        int size = stringArrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            String str = stringArrayList.get(i6);
            if (this.f14240b.containsKey(str)) {
                Integer num = (Integer) this.f14240b.remove(str);
                if (!this.f14245g.containsKey(str)) {
                    TypeIntrinsics.asMutableMap(this.f14239a).remove(num);
                }
            }
            Integer num2 = integerArrayList.get(i6);
            Intrinsics.checkNotNullExpressionValue(num2, "rcs[i]");
            int intValue = num2.intValue();
            String str2 = stringArrayList.get(i6);
            Intrinsics.checkNotNullExpressionValue(str2, "keys[i]");
            d(intValue, str2);
        }
    }

    public final void k(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        outState.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.f14240b.values()));
        outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.f14240b.keySet()));
        outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f14242d));
        outState.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(this.f14245g));
    }

    public final g.c l(final String key, InterfaceC1061m lifecycleOwner, final AbstractC1389a contract, final g.b callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(callback, "callback");
        AbstractC1057i lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.b().b(AbstractC1057i.b.STARTED)) {
            throw new IllegalStateException(("LifecycleOwner " + lifecycleOwner + " is attempting to register while current state is " + lifecycle.b() + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        o(key);
        c cVar = (c) this.f14241c.get(key);
        if (cVar == null) {
            cVar = new c(lifecycle);
        }
        cVar.a(new InterfaceC1059k() { // from class: g.d
            @Override // androidx.lifecycle.InterfaceC1059k
            public final void c(InterfaceC1061m interfaceC1061m, AbstractC1057i.a aVar) {
                e.n(e.this, key, callback, contract, interfaceC1061m, aVar);
            }
        });
        this.f14241c.put(key, cVar);
        return new C0197e(key, contract);
    }

    public final g.c m(String key, AbstractC1389a contract, g.b callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(callback, "callback");
        o(key);
        this.f14243e.put(key, new a(callback, contract));
        if (this.f14244f.containsKey(key)) {
            Object obj = this.f14244f.get(key);
            this.f14244f.remove(key);
            callback.a(obj);
        }
        C1310a c1310a = (C1310a) v0.c.a(this.f14245g, key, C1310a.class);
        if (c1310a != null) {
            this.f14245g.remove(key);
            callback.a(contract.c(c1310a.c(), c1310a.a()));
        }
        return new f(key, contract);
    }

    public final void o(String str) {
        if (((Integer) this.f14240b.get(str)) != null) {
            return;
        }
        d(h(), str);
    }

    public final void p(String key) {
        Integer num;
        Intrinsics.checkNotNullParameter(key, "key");
        if (!this.f14242d.contains(key) && (num = (Integer) this.f14240b.remove(key)) != null) {
            this.f14239a.remove(num);
        }
        this.f14243e.remove(key);
        if (this.f14244f.containsKey(key)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + this.f14244f.get(key));
            this.f14244f.remove(key);
        }
        if (this.f14245g.containsKey(key)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + ((C1310a) v0.c.a(this.f14245g, key, C1310a.class)));
            this.f14245g.remove(key);
        }
        c cVar = (c) this.f14241c.get(key);
        if (cVar != null) {
            cVar.b();
            this.f14241c.remove(key);
        }
    }
}
