package P0;

import P0.Q;
import Q0.c;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1057i;
import androidx.lifecycle.InterfaceC1061m;
import e.C1208b;
import g.C1310a;
import g.g;
import h.AbstractC1389a;
import h.C1395g;
import h.C1396h;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import y0.InterfaceC2343a;
import y2.d;
import z0.InterfaceC2428n;
import z0.InterfaceC2431q;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class I {

    /* renamed from: U, reason: collision with root package name */
    public static boolean f3931U = false;

    /* renamed from: V, reason: collision with root package name */
    public static boolean f3932V = true;

    /* renamed from: A, reason: collision with root package name */
    public AbstractComponentCallbacksC0708p f3933A;

    /* renamed from: F, reason: collision with root package name */
    public g.c f3938F;

    /* renamed from: G, reason: collision with root package name */
    public g.c f3939G;

    /* renamed from: H, reason: collision with root package name */
    public g.c f3940H;

    /* renamed from: J, reason: collision with root package name */
    public boolean f3942J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f3943K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f3944L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f3945M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f3946N;

    /* renamed from: O, reason: collision with root package name */
    public ArrayList f3947O;

    /* renamed from: P, reason: collision with root package name */
    public ArrayList f3948P;

    /* renamed from: Q, reason: collision with root package name */
    public ArrayList f3949Q;

    /* renamed from: R, reason: collision with root package name */
    public L f3950R;

    /* renamed from: S, reason: collision with root package name */
    public c.C0071c f3951S;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3954b;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f3957e;

    /* renamed from: g, reason: collision with root package name */
    public e.w f3959g;

    /* renamed from: x, reason: collision with root package name */
    public A f3976x;

    /* renamed from: y, reason: collision with root package name */
    public AbstractC0714w f3977y;

    /* renamed from: z, reason: collision with root package name */
    public AbstractComponentCallbacksC0708p f3978z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3953a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final P f3955c = new P();

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f3956d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final B f3958f = new B(this);

    /* renamed from: h, reason: collision with root package name */
    public C0693a f3960h = null;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3961i = false;

    /* renamed from: j, reason: collision with root package name */
    public final e.v f3962j = new b(false);

    /* renamed from: k, reason: collision with root package name */
    public final AtomicInteger f3963k = new AtomicInteger();

    /* renamed from: l, reason: collision with root package name */
    public final Map f3964l = Collections.synchronizedMap(new HashMap());

    /* renamed from: m, reason: collision with root package name */
    public final Map f3965m = Collections.synchronizedMap(new HashMap());

    /* renamed from: n, reason: collision with root package name */
    public final Map f3966n = Collections.synchronizedMap(new HashMap());

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f3967o = new ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public final C f3968p = new C(this);

    /* renamed from: q, reason: collision with root package name */
    public final CopyOnWriteArrayList f3969q = new CopyOnWriteArrayList();

    /* renamed from: r, reason: collision with root package name */
    public final InterfaceC2343a f3970r = new InterfaceC2343a() { // from class: P0.D
        @Override // y0.InterfaceC2343a
        public final void accept(Object obj) {
            I.e(I.this, (Configuration) obj);
        }
    };

    /* renamed from: s, reason: collision with root package name */
    public final InterfaceC2343a f3971s = new InterfaceC2343a() { // from class: P0.E
        @Override // y0.InterfaceC2343a
        public final void accept(Object obj) {
            I.a(I.this, (Integer) obj);
        }
    };

    /* renamed from: t, reason: collision with root package name */
    public final InterfaceC2343a f3972t = new InterfaceC2343a() { // from class: P0.F
        @Override // y0.InterfaceC2343a
        public final void accept(Object obj) {
            I.d(I.this, (androidx.core.app.i) obj);
        }
    };

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC2343a f3973u = new InterfaceC2343a() { // from class: P0.G
        @Override // y0.InterfaceC2343a
        public final void accept(Object obj) {
            I.c(I.this, (androidx.core.app.u) obj);
        }
    };

    /* renamed from: v, reason: collision with root package name */
    public final InterfaceC2431q f3974v = new c();

    /* renamed from: w, reason: collision with root package name */
    public int f3975w = -1;

    /* renamed from: B, reason: collision with root package name */
    public AbstractC0717z f3934B = null;

    /* renamed from: C, reason: collision with root package name */
    public AbstractC0717z f3935C = new d();

    /* renamed from: D, reason: collision with root package name */
    public b0 f3936D = null;

    /* renamed from: E, reason: collision with root package name */
    public b0 f3937E = new e();

    /* renamed from: I, reason: collision with root package name */
    public ArrayDeque f3941I = new ArrayDeque();

    /* renamed from: T, reason: collision with root package name */
    public Runnable f3952T = new f();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements g.b {
        public a() {
        }

        @Override // g.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Map map) {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                iArr[i6] = ((Boolean) arrayList.get(i6)).booleanValue() ? 0 : -1;
            }
            l lVar = (l) I.this.f3941I.pollFirst();
            if (lVar == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = lVar.f3989a;
            int i7 = lVar.f3990b;
            AbstractComponentCallbacksC0708p i8 = I.this.f3955c.i(str);
            if (i8 != null) {
                i8.onRequestPermissionsResult(i7, strArr, iArr);
                return;
            }
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class b extends e.v {
        public b(boolean z6) {
            super(z6);
        }

        @Override // e.v
        public void c() {
            if (I.I0(3)) {
                Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = " + I.f3932V + " fragment manager " + I.this);
            }
            if (I.f3932V) {
                I.this.o();
                I.this.f3960h = null;
            }
        }

        @Override // e.v
        public void d() {
            if (I.I0(3)) {
                Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = " + I.f3932V + " fragment manager " + I.this);
            }
            I.this.E0();
        }

        @Override // e.v
        public void e(C1208b c1208b) {
            if (I.I0(2)) {
                Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = " + I.f3932V + " fragment manager " + I.this);
            }
            I i6 = I.this;
            if (i6.f3960h != null) {
                Iterator it = i6.u(new ArrayList(Collections.singletonList(I.this.f3960h)), 0, 1).iterator();
                while (it.hasNext()) {
                    ((a0) it.next()).y(c1208b);
                }
                Iterator it2 = I.this.f3967o.iterator();
                if (it2.hasNext()) {
                    android.support.v4.media.session.b.a(it2.next());
                    throw null;
                }
            }
        }

        @Override // e.v
        public void f(C1208b c1208b) {
            if (I.I0(3)) {
                Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = " + I.f3932V + " fragment manager " + I.this);
            }
            if (I.f3932V) {
                I.this.X();
                I.this.b1();
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class c implements InterfaceC2431q {
        public c() {
        }

        @Override // z0.InterfaceC2431q
        public boolean a(MenuItem menuItem) {
            return I.this.J(menuItem);
        }

        @Override // z0.InterfaceC2431q
        public void b(Menu menu) {
            I.this.K(menu);
        }

        @Override // z0.InterfaceC2431q
        public void c(Menu menu, MenuInflater menuInflater) {
            I.this.C(menu, menuInflater);
        }

        @Override // z0.InterfaceC2431q
        public void d(Menu menu) {
            I.this.O(menu);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class d extends AbstractC0717z {
        public d() {
        }

        @Override // P0.AbstractC0717z
        public AbstractComponentCallbacksC0708p a(ClassLoader classLoader, String str) {
            return I.this.v0().b(I.this.v0().f(), str, null);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class e implements b0 {
        public e() {
        }

        @Override // P0.b0
        public a0 a(ViewGroup viewGroup) {
            return new C0698f(viewGroup);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            I.this.a0(true);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class g implements M {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AbstractComponentCallbacksC0708p f3985a;

        public g(AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p) {
            this.f3985a = abstractComponentCallbacksC0708p;
        }

        @Override // P0.M
        public void a(I i6, AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p) {
            this.f3985a.onAttachFragment(abstractComponentCallbacksC0708p);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class h implements g.b {
        public h() {
        }

        @Override // g.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C1310a c1310a) {
            l lVar = (l) I.this.f3941I.pollLast();
            if (lVar == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = lVar.f3989a;
            int i6 = lVar.f3990b;
            AbstractComponentCallbacksC0708p i7 = I.this.f3955c.i(str);
            if (i7 != null) {
                i7.onActivityResult(i6, c1310a.c(), c1310a.a());
                return;
            }
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class i implements g.b {
        public i() {
        }

        @Override // g.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C1310a c1310a) {
            l lVar = (l) I.this.f3941I.pollFirst();
            if (lVar == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = lVar.f3989a;
            int i6 = lVar.f3990b;
            AbstractComponentCallbacksC0708p i7 = I.this.f3955c.i(str);
            if (i7 != null) {
                i7.onActivityResult(i6, c1310a.c(), c1310a.a());
                return;
            }
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class j extends AbstractC1389a {
        @Override // h.AbstractC1389a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(Context context, g.g gVar) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent a6 = gVar.a();
            if (a6 != null && (bundleExtra = a6.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                a6.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (a6.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    gVar = new g.a(gVar.e()).b(null).c(gVar.d(), gVar.c()).a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", gVar);
            if (I.I0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // h.AbstractC1389a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public C1310a c(int i6, Intent intent) {
            return new C1310a(i6, intent);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class k {
        public void a(I i6, AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p, Bundle bundle) {
        }

        public void b(I i6, AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p, Context context) {
        }

        public void c(I i6, AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p, Bundle bundle) {
        }

        public void d(I i6, AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p) {
        }

        public void e(I i6, AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p) {
        }

        public void f(I i6, AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p) {
        }

        public void g(I i6, AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p, Context context) {
        }

        public void h(I i6, AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p, Bundle bundle) {
        }

        public void i(I i6, AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p) {
        }

        public void j(I i6, AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p, Bundle bundle) {
        }

        public void k(I i6, AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p) {
        }

        public void l(I i6, AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p) {
        }

        public void m(I i6, AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p, View view, Bundle bundle) {
        }

        public void n(I i6, AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p) {
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface m {
        boolean a(ArrayList arrayList, ArrayList arrayList2);
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class n implements m {

        /* renamed from: a, reason: collision with root package name */
        public final String f3991a;

        /* renamed from: b, reason: collision with root package name */
        public final int f3992b;

        /* renamed from: c, reason: collision with root package name */
        public final int f3993c;

        public n(String str, int i6, int i7) {
            this.f3991a = str;
            this.f3992b = i6;
            this.f3993c = i7;
        }

        @Override // P0.I.m
        public boolean a(ArrayList arrayList, ArrayList arrayList2) {
            AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p = I.this.f3933A;
            if (abstractComponentCallbacksC0708p == null || this.f3992b >= 0 || this.f3991a != null || !abstractComponentCallbacksC0708p.getChildFragmentManager().W0()) {
                return I.this.Z0(arrayList, arrayList2, this.f3991a, this.f3992b, this.f3993c);
            }
            return false;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class o implements m {
        public o() {
        }

        @Override // P0.I.m
        public boolean a(ArrayList arrayList, ArrayList arrayList2) {
            boolean a12 = I.this.a1(arrayList, arrayList2);
            I i6 = I.this;
            i6.f3961i = true;
            if (!i6.f3967o.isEmpty() && arrayList.size() > 0) {
                ((Boolean) arrayList2.get(arrayList.size() - 1)).booleanValue();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    linkedHashSet.addAll(I.this.n0((C0693a) it.next()));
                }
                Iterator it2 = I.this.f3967o.iterator();
                while (it2.hasNext()) {
                    android.support.v4.media.session.b.a(it2.next());
                    Iterator it3 = linkedHashSet.iterator();
                    if (it3.hasNext()) {
                        throw null;
                    }
                }
            }
            return a12;
        }
    }

    public static AbstractComponentCallbacksC0708p C0(View view) {
        Object tag = view.getTag(O0.b.f3881a);
        if (tag instanceof AbstractComponentCallbacksC0708p) {
            return (AbstractComponentCallbacksC0708p) tag;
        }
        return null;
    }

    public static boolean I0(int i6) {
        return f3931U || Log.isLoggable("FragmentManager", i6);
    }

    public static /* synthetic */ void a(I i6, Integer num) {
        if (i6.K0() && num.intValue() == 80) {
            i6.F(false);
        }
    }

    public static /* synthetic */ void c(I i6, androidx.core.app.u uVar) {
        if (i6.K0()) {
            i6.N(uVar.a(), false);
        }
    }

    public static void c0(ArrayList arrayList, ArrayList arrayList2, int i6, int i7) {
        while (i6 < i7) {
            C0693a c0693a = (C0693a) arrayList.get(i6);
            if (((Boolean) arrayList2.get(i6)).booleanValue()) {
                c0693a.n(-1);
                c0693a.s();
            } else {
                c0693a.n(1);
                c0693a.r();
            }
            i6++;
        }
    }

    public static /* synthetic */ void d(I i6, androidx.core.app.i iVar) {
        if (i6.K0()) {
            i6.G(iVar.a(), false);
        }
    }

    public static /* synthetic */ void e(I i6, Configuration configuration) {
        if (i6.K0()) {
            i6.z(configuration, false);
        }
    }

    public static int h1(int i6) {
        if (i6 == 4097) {
            return 8194;
        }
        if (i6 == 8194) {
            return 4097;
        }
        if (i6 == 8197) {
            return 4100;
        }
        if (i6 != 4099) {
            return i6 != 4100 ? 0 : 8197;
        }
        return 4099;
    }

    public static I k0(View view) {
        AbstractActivityC0712u abstractActivityC0712u;
        AbstractComponentCallbacksC0708p l02 = l0(view);
        if (l02 != null) {
            if (l02.isAdded()) {
                return l02.getChildFragmentManager();
            }
            throw new IllegalStateException("The Fragment " + l02 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        Context context = view.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                abstractActivityC0712u = null;
                break;
            }
            if (context instanceof AbstractActivityC0712u) {
                abstractActivityC0712u = (AbstractActivityC0712u) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (abstractActivityC0712u != null) {
            return abstractActivityC0712u.getSupportFragmentManager();
        }
        throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
    }

    public static AbstractComponentCallbacksC0708p l0(View view) {
        while (view != null) {
            AbstractComponentCallbacksC0708p C02 = C0(view);
            if (C02 != null) {
                return C02;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    public boolean A(MenuItem menuItem) {
        if (this.f3975w < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p : this.f3955c.o()) {
            if (abstractComponentCallbacksC0708p != null && abstractComponentCallbacksC0708p.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public b0 A0() {
        b0 b0Var = this.f3936D;
        if (b0Var != null) {
            return b0Var;
        }
        AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p = this.f3978z;
        return abstractComponentCallbacksC0708p != null ? abstractComponentCallbacksC0708p.mFragmentManager.A0() : this.f3937E;
    }

    public void B() {
        this.f3943K = false;
        this.f3944L = false;
        this.f3950R.q(false);
        S(1);
    }

    public c.C0071c B0() {
        return this.f3951S;
    }

    public boolean C(Menu menu, MenuInflater menuInflater) {
        if (this.f3975w < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z6 = false;
        for (AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p : this.f3955c.o()) {
            if (abstractComponentCallbacksC0708p != null && M0(abstractComponentCallbacksC0708p) && abstractComponentCallbacksC0708p.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(abstractComponentCallbacksC0708p);
                z6 = true;
            }
        }
        if (this.f3957e != null) {
            for (int i6 = 0; i6 < this.f3957e.size(); i6++) {
                AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p2 = (AbstractComponentCallbacksC0708p) this.f3957e.get(i6);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC0708p2)) {
                    abstractComponentCallbacksC0708p2.onDestroyOptionsMenu();
                }
            }
        }
        this.f3957e = arrayList;
        return z6;
    }

    public void D() {
        this.f3945M = true;
        a0(true);
        X();
        s();
        S(-1);
        Object obj = this.f3976x;
        if (obj instanceof n0.d) {
            ((n0.d) obj).removeOnTrimMemoryListener(this.f3971s);
        }
        Object obj2 = this.f3976x;
        if (obj2 instanceof n0.c) {
            ((n0.c) obj2).removeOnConfigurationChangedListener(this.f3970r);
        }
        Object obj3 = this.f3976x;
        if (obj3 instanceof androidx.core.app.r) {
            ((androidx.core.app.r) obj3).removeOnMultiWindowModeChangedListener(this.f3972t);
        }
        Object obj4 = this.f3976x;
        if (obj4 instanceof androidx.core.app.s) {
            ((androidx.core.app.s) obj4).removeOnPictureInPictureModeChangedListener(this.f3973u);
        }
        Object obj5 = this.f3976x;
        if ((obj5 instanceof InterfaceC2428n) && this.f3978z == null) {
            ((InterfaceC2428n) obj5).removeMenuProvider(this.f3974v);
        }
        this.f3976x = null;
        this.f3977y = null;
        this.f3978z = null;
        if (this.f3959g != null) {
            this.f3962j.h();
            this.f3959g = null;
        }
        g.c cVar = this.f3938F;
        if (cVar != null) {
            cVar.c();
            this.f3939G.c();
            this.f3940H.c();
        }
    }

    public androidx.lifecycle.P D0(AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p) {
        return this.f3950R.n(abstractComponentCallbacksC0708p);
    }

    public void E() {
        S(1);
    }

    public void E0() {
        a0(true);
        if (!f3932V || this.f3960h == null) {
            if (this.f3962j.g()) {
                if (I0(3)) {
                    Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                }
                W0();
                return;
            } else {
                if (I0(3)) {
                    Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                }
                this.f3959g.k();
                return;
            }
        }
        if (!this.f3967o.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(n0(this.f3960h));
            Iterator it = this.f3967o.iterator();
            while (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                Iterator it2 = linkedHashSet.iterator();
                if (it2.hasNext()) {
                    throw null;
                }
            }
        }
        Iterator it3 = this.f3960h.f4040c.iterator();
        while (it3.hasNext()) {
            AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p = ((Q.a) it3.next()).f4058b;
            if (abstractComponentCallbacksC0708p != null) {
                abstractComponentCallbacksC0708p.mTransitioning = false;
            }
        }
        Iterator it4 = u(new ArrayList(Collections.singletonList(this.f3960h)), 0, 1).iterator();
        while (it4.hasNext()) {
            ((a0) it4.next()).f();
        }
        this.f3960h = null;
        s1();
        if (I0(3)) {
            Log.d("FragmentManager", "Op is being set to null");
            Log.d("FragmentManager", "OnBackPressedCallback enabled=" + this.f3962j.g() + " for  FragmentManager " + this);
        }
    }

    public void F(boolean z6) {
        if (z6 && (this.f3976x instanceof n0.d)) {
            q1(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p : this.f3955c.o()) {
            if (abstractComponentCallbacksC0708p != null) {
                abstractComponentCallbacksC0708p.performLowMemory();
                if (z6) {
                    abstractComponentCallbacksC0708p.mChildFragmentManager.F(true);
                }
            }
        }
    }

    public void F0(AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p) {
        if (I0(2)) {
            Log.v("FragmentManager", "hide: " + abstractComponentCallbacksC0708p);
        }
        if (abstractComponentCallbacksC0708p.mHidden) {
            return;
        }
        abstractComponentCallbacksC0708p.mHidden = true;
        abstractComponentCallbacksC0708p.mHiddenChanged = true ^ abstractComponentCallbacksC0708p.mHiddenChanged;
        n1(abstractComponentCallbacksC0708p);
    }

    public void G(boolean z6, boolean z7) {
        if (z7 && (this.f3976x instanceof androidx.core.app.r)) {
            q1(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p : this.f3955c.o()) {
            if (abstractComponentCallbacksC0708p != null) {
                abstractComponentCallbacksC0708p.performMultiWindowModeChanged(z6);
                if (z7) {
                    abstractComponentCallbacksC0708p.mChildFragmentManager.G(z6, true);
                }
            }
        }
    }

    public void G0(AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p) {
        if (abstractComponentCallbacksC0708p.mAdded && J0(abstractComponentCallbacksC0708p)) {
            this.f3942J = true;
        }
    }

    public void H(AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p) {
        Iterator it = this.f3969q.iterator();
        while (it.hasNext()) {
            ((M) it.next()).a(this, abstractComponentCallbacksC0708p);
        }
    }

    public boolean H0() {
        return this.f3945M;
    }

    public void I() {
        for (AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p : this.f3955c.l()) {
            if (abstractComponentCallbacksC0708p != null) {
                abstractComponentCallbacksC0708p.onHiddenChanged(abstractComponentCallbacksC0708p.isHidden());
                abstractComponentCallbacksC0708p.mChildFragmentManager.I();
            }
        }
    }

    public boolean J(MenuItem menuItem) {
        if (this.f3975w < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p : this.f3955c.o()) {
            if (abstractComponentCallbacksC0708p != null && abstractComponentCallbacksC0708p.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final boolean J0(AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p) {
        return (abstractComponentCallbacksC0708p.mHasMenu && abstractComponentCallbacksC0708p.mMenuVisible) || abstractComponentCallbacksC0708p.mChildFragmentManager.p();
    }

    public void K(Menu menu) {
        if (this.f3975w < 1) {
            return;
        }
        for (AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p : this.f3955c.o()) {
            if (abstractComponentCallbacksC0708p != null) {
                abstractComponentCallbacksC0708p.performOptionsMenuClosed(menu);
            }
        }
    }

    public final boolean K0() {
        AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p = this.f3978z;
        if (abstractComponentCallbacksC0708p == null) {
            return true;
        }
        return abstractComponentCallbacksC0708p.isAdded() && this.f3978z.getParentFragmentManager().K0();
    }

    public final void L(AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p) {
        if (abstractComponentCallbacksC0708p == null || !abstractComponentCallbacksC0708p.equals(f0(abstractComponentCallbacksC0708p.mWho))) {
            return;
        }
        abstractComponentCallbacksC0708p.performPrimaryNavigationFragmentChanged();
    }

    public boolean L0(AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p) {
        if (abstractComponentCallbacksC0708p == null) {
            return false;
        }
        return abstractComponentCallbacksC0708p.isHidden();
    }

    public void M() {
        S(5);
    }

    public boolean M0(AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p) {
        if (abstractComponentCallbacksC0708p == null) {
            return true;
        }
        return abstractComponentCallbacksC0708p.isMenuVisible();
    }

    public void N(boolean z6, boolean z7) {
        if (z7 && (this.f3976x instanceof androidx.core.app.s)) {
            q1(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p : this.f3955c.o()) {
            if (abstractComponentCallbacksC0708p != null) {
                abstractComponentCallbacksC0708p.performPictureInPictureModeChanged(z6);
                if (z7) {
                    abstractComponentCallbacksC0708p.mChildFragmentManager.N(z6, true);
                }
            }
        }
    }

    public boolean N0(AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p) {
        if (abstractComponentCallbacksC0708p == null) {
            return true;
        }
        I i6 = abstractComponentCallbacksC0708p.mFragmentManager;
        return abstractComponentCallbacksC0708p.equals(i6.z0()) && N0(i6.f3978z);
    }

    public boolean O(Menu menu) {
        boolean z6 = false;
        if (this.f3975w < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p : this.f3955c.o()) {
            if (abstractComponentCallbacksC0708p != null && M0(abstractComponentCallbacksC0708p) && abstractComponentCallbacksC0708p.performPrepareOptionsMenu(menu)) {
                z6 = true;
            }
        }
        return z6;
    }

    public boolean O0(int i6) {
        return this.f3975w >= i6;
    }

    public void P() {
        s1();
        L(this.f3933A);
    }

    public boolean P0() {
        return this.f3943K || this.f3944L;
    }

    public void Q() {
        this.f3943K = false;
        this.f3944L = false;
        this.f3950R.q(false);
        S(7);
    }

    public void Q0(AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p, Intent intent, int i6, Bundle bundle) {
        if (this.f3938F == null) {
            this.f3976x.l(abstractComponentCallbacksC0708p, intent, i6, bundle);
            return;
        }
        this.f3941I.addLast(new l(abstractComponentCallbacksC0708p.mWho, i6));
        if (bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        this.f3938F.a(intent);
    }

    public void R() {
        this.f3943K = false;
        this.f3944L = false;
        this.f3950R.q(false);
        S(5);
    }

    public void R0(int i6, boolean z6) {
        A a6;
        if (this.f3976x == null && i6 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z6 || i6 != this.f3975w) {
            this.f3975w = i6;
            this.f3955c.t();
            p1();
            if (this.f3942J && (a6 = this.f3976x) != null && this.f3975w == 7) {
                a6.m();
                this.f3942J = false;
            }
        }
    }

    public final void S(int i6) {
        try {
            this.f3954b = true;
            this.f3955c.d(i6);
            R0(i6, false);
            Iterator it = t().iterator();
            while (it.hasNext()) {
                ((a0) it.next()).q();
            }
            this.f3954b = false;
            a0(true);
        } catch (Throwable th) {
            this.f3954b = false;
            throw th;
        }
    }

    public void S0() {
        if (this.f3976x == null) {
            return;
        }
        this.f3943K = false;
        this.f3944L = false;
        this.f3950R.q(false);
        for (AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p : this.f3955c.o()) {
            if (abstractComponentCallbacksC0708p != null) {
                abstractComponentCallbacksC0708p.noteStateNotSaved();
            }
        }
    }

    public void T() {
        this.f3944L = true;
        this.f3950R.q(true);
        S(4);
    }

    public void T0(C0715x c0715x) {
        View view;
        for (O o6 : this.f3955c.k()) {
            AbstractComponentCallbacksC0708p k6 = o6.k();
            if (k6.mContainerId == c0715x.getId() && (view = k6.mView) != null && view.getParent() == null) {
                k6.mContainer = c0715x;
                o6.b();
            }
        }
    }

    public void U() {
        S(2);
    }

    public void U0(O o6) {
        AbstractComponentCallbacksC0708p k6 = o6.k();
        if (k6.mDeferStart) {
            if (this.f3954b) {
                this.f3946N = true;
            } else {
                k6.mDeferStart = false;
                o6.m();
            }
        }
    }

    public final void V() {
        if (this.f3946N) {
            this.f3946N = false;
            p1();
        }
    }

    public void V0(int i6, int i7, boolean z6) {
        if (i6 >= 0) {
            Y(new n(null, i6, i7), z6);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i6);
    }

    public void W(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String str2 = str + "    ";
        this.f3955c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList arrayList = this.f3957e;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i6 = 0; i6 < size; i6++) {
                AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p = (AbstractComponentCallbacksC0708p) this.f3957e.get(i6);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i6);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0708p.toString());
            }
        }
        int size2 = this.f3956d.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i7 = 0; i7 < size2; i7++) {
                C0693a c0693a = (C0693a) this.f3956d.get(i7);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i7);
                printWriter.print(": ");
                printWriter.println(c0693a.toString());
                c0693a.p(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f3963k.get());
        synchronized (this.f3953a) {
            try {
                int size3 = this.f3953a.size();
                if (size3 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i8 = 0; i8 < size3; i8++) {
                        m mVar = (m) this.f3953a.get(i8);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i8);
                        printWriter.print(": ");
                        printWriter.println(mVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f3976x);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f3977y);
        if (this.f3978z != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f3978z);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f3975w);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f3943K);
        printWriter.print(" mStopped=");
        printWriter.print(this.f3944L);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f3945M);
        if (this.f3942J) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f3942J);
        }
    }

    public boolean W0() {
        return Y0(null, -1, 0);
    }

    public final void X() {
        Iterator it = t().iterator();
        while (it.hasNext()) {
            ((a0) it.next()).q();
        }
    }

    public boolean X0(int i6, int i7) {
        if (i6 >= 0) {
            return Y0(null, i6, i7);
        }
        throw new IllegalArgumentException("Bad id: " + i6);
    }

    public void Y(m mVar, boolean z6) {
        if (!z6) {
            if (this.f3976x == null) {
                if (!this.f3945M) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            q();
        }
        synchronized (this.f3953a) {
            try {
                if (this.f3976x == null) {
                    if (!z6) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f3953a.add(mVar);
                    j1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean Y0(String str, int i6, int i7) {
        a0(false);
        Z(true);
        AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p = this.f3933A;
        if (abstractComponentCallbacksC0708p != null && i6 < 0 && str == null && abstractComponentCallbacksC0708p.getChildFragmentManager().W0()) {
            return true;
        }
        boolean Z02 = Z0(this.f3947O, this.f3948P, str, i6, i7);
        if (Z02) {
            this.f3954b = true;
            try {
                e1(this.f3947O, this.f3948P);
            } finally {
                r();
            }
        }
        s1();
        V();
        this.f3955c.b();
        return Z02;
    }

    public final void Z(boolean z6) {
        if (this.f3954b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f3976x == null) {
            if (!this.f3945M) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f3976x.h().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z6) {
            q();
        }
        if (this.f3947O == null) {
            this.f3947O = new ArrayList();
            this.f3948P = new ArrayList();
        }
    }

    public boolean Z0(ArrayList arrayList, ArrayList arrayList2, String str, int i6, int i7) {
        int g02 = g0(str, i6, (i7 & 1) != 0);
        if (g02 < 0) {
            return false;
        }
        for (int size = this.f3956d.size() - 1; size >= g02; size--) {
            arrayList.add((C0693a) this.f3956d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public boolean a0(boolean z6) {
        Z(z6);
        boolean z7 = false;
        while (o0(this.f3947O, this.f3948P)) {
            z7 = true;
            this.f3954b = true;
            try {
                e1(this.f3947O, this.f3948P);
            } finally {
                r();
            }
        }
        s1();
        V();
        this.f3955c.b();
        return z7;
    }

    public boolean a1(ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3 = this.f3956d;
        C0693a c0693a = (C0693a) arrayList3.get(arrayList3.size() - 1);
        this.f3960h = c0693a;
        Iterator it = c0693a.f4040c.iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p = ((Q.a) it.next()).f4058b;
            if (abstractComponentCallbacksC0708p != null) {
                abstractComponentCallbacksC0708p.mTransitioning = true;
            }
        }
        return Z0(arrayList, arrayList2, null, -1, 0);
    }

    public void b0(m mVar, boolean z6) {
        if (z6 && (this.f3976x == null || this.f3945M)) {
            return;
        }
        Z(z6);
        if (mVar.a(this.f3947O, this.f3948P)) {
            this.f3954b = true;
            try {
                e1(this.f3947O, this.f3948P);
            } finally {
                r();
            }
        }
        s1();
        V();
        this.f3955c.b();
    }

    public void b1() {
        Y(new o(), false);
    }

    public void c1(k kVar, boolean z6) {
        this.f3968p.o(kVar, z6);
    }

    public final void d0(ArrayList arrayList, ArrayList arrayList2, int i6, int i7) {
        boolean z6 = ((C0693a) arrayList.get(i6)).f4055r;
        ArrayList arrayList3 = this.f3949Q;
        if (arrayList3 == null) {
            this.f3949Q = new ArrayList();
        } else {
            arrayList3.clear();
        }
        this.f3949Q.addAll(this.f3955c.o());
        AbstractComponentCallbacksC0708p z02 = z0();
        boolean z7 = false;
        for (int i8 = i6; i8 < i7; i8++) {
            C0693a c0693a = (C0693a) arrayList.get(i8);
            z02 = !((Boolean) arrayList2.get(i8)).booleanValue() ? c0693a.t(this.f3949Q, z02) : c0693a.w(this.f3949Q, z02);
            z7 = z7 || c0693a.f4046i;
        }
        this.f3949Q.clear();
        if (!z6 && this.f3975w >= 1) {
            for (int i9 = i6; i9 < i7; i9++) {
                Iterator it = ((C0693a) arrayList.get(i9)).f4040c.iterator();
                while (it.hasNext()) {
                    AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p = ((Q.a) it.next()).f4058b;
                    if (abstractComponentCallbacksC0708p != null && abstractComponentCallbacksC0708p.mFragmentManager != null) {
                        this.f3955c.r(v(abstractComponentCallbacksC0708p));
                    }
                }
            }
        }
        c0(arrayList, arrayList2, i6, i7);
        boolean booleanValue = ((Boolean) arrayList2.get(i7 - 1)).booleanValue();
        if (z7 && !this.f3967o.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(n0((C0693a) it2.next()));
            }
            if (this.f3960h == null) {
                Iterator it3 = this.f3967o.iterator();
                while (it3.hasNext()) {
                    android.support.v4.media.session.b.a(it3.next());
                    Iterator it4 = linkedHashSet.iterator();
                    if (it4.hasNext()) {
                        throw null;
                    }
                }
                Iterator it5 = this.f3967o.iterator();
                while (it5.hasNext()) {
                    android.support.v4.media.session.b.a(it5.next());
                    Iterator it6 = linkedHashSet.iterator();
                    if (it6.hasNext()) {
                        throw null;
                    }
                }
            }
        }
        for (int i10 = i6; i10 < i7; i10++) {
            C0693a c0693a2 = (C0693a) arrayList.get(i10);
            if (booleanValue) {
                for (int size = c0693a2.f4040c.size() - 1; size >= 0; size--) {
                    AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p2 = ((Q.a) c0693a2.f4040c.get(size)).f4058b;
                    if (abstractComponentCallbacksC0708p2 != null) {
                        v(abstractComponentCallbacksC0708p2).m();
                    }
                }
            } else {
                Iterator it7 = c0693a2.f4040c.iterator();
                while (it7.hasNext()) {
                    AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p3 = ((Q.a) it7.next()).f4058b;
                    if (abstractComponentCallbacksC0708p3 != null) {
                        v(abstractComponentCallbacksC0708p3).m();
                    }
                }
            }
        }
        R0(this.f3975w, true);
        for (a0 a0Var : u(arrayList, i6, i7)) {
            a0Var.B(booleanValue);
            a0Var.x();
            a0Var.n();
        }
        while (i6 < i7) {
            C0693a c0693a3 = (C0693a) arrayList.get(i6);
            if (((Boolean) arrayList2.get(i6)).booleanValue() && c0693a3.f4106v >= 0) {
                c0693a3.f4106v = -1;
            }
            c0693a3.v();
            i6++;
        }
        if (z7) {
            f1();
        }
    }

    public void d1(AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p) {
        if (I0(2)) {
            Log.v("FragmentManager", "remove: " + abstractComponentCallbacksC0708p + " nesting=" + abstractComponentCallbacksC0708p.mBackStackNesting);
        }
        boolean isInBackStack = abstractComponentCallbacksC0708p.isInBackStack();
        if (abstractComponentCallbacksC0708p.mDetached && isInBackStack) {
            return;
        }
        this.f3955c.u(abstractComponentCallbacksC0708p);
        if (J0(abstractComponentCallbacksC0708p)) {
            this.f3942J = true;
        }
        abstractComponentCallbacksC0708p.mRemoving = true;
        n1(abstractComponentCallbacksC0708p);
    }

    public boolean e0() {
        boolean a02 = a0(true);
        m0();
        return a02;
    }

    public final void e1(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i6 = 0;
        int i7 = 0;
        while (i6 < size) {
            if (!((C0693a) arrayList.get(i6)).f4055r) {
                if (i7 != i6) {
                    d0(arrayList, arrayList2, i7, i6);
                }
                i7 = i6 + 1;
                if (((Boolean) arrayList2.get(i6)).booleanValue()) {
                    while (i7 < size && ((Boolean) arrayList2.get(i7)).booleanValue() && !((C0693a) arrayList.get(i7)).f4055r) {
                        i7++;
                    }
                }
                d0(arrayList, arrayList2, i6, i7);
                i6 = i7 - 1;
            }
            i6++;
        }
        if (i7 != size) {
            d0(arrayList, arrayList2, i7, size);
        }
    }

    public AbstractComponentCallbacksC0708p f0(String str) {
        return this.f3955c.f(str);
    }

    public final void f1() {
        if (this.f3967o.size() <= 0) {
            return;
        }
        android.support.v4.media.session.b.a(this.f3967o.get(0));
        throw null;
    }

    public final int g0(String str, int i6, boolean z6) {
        if (this.f3956d.isEmpty()) {
            return -1;
        }
        if (str == null && i6 < 0) {
            if (z6) {
                return 0;
            }
            return this.f3956d.size() - 1;
        }
        int size = this.f3956d.size() - 1;
        while (size >= 0) {
            C0693a c0693a = (C0693a) this.f3956d.get(size);
            if ((str != null && str.equals(c0693a.u())) || (i6 >= 0 && i6 == c0693a.f4106v)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z6) {
            if (size == this.f3956d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            C0693a c0693a2 = (C0693a) this.f3956d.get(size - 1);
            if ((str == null || !str.equals(c0693a2.u())) && (i6 < 0 || i6 != c0693a2.f4106v)) {
                break;
            }
            size--;
        }
        return size;
    }

    public void g1(Parcelable parcelable) {
        O o6;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable == null) {
            return;
        }
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f3976x.f().getClassLoader());
                this.f3965m.put(str.substring(7), bundle2);
            }
        }
        HashMap hashMap = new HashMap();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f3976x.f().getClassLoader());
                hashMap.put(str2.substring(9), bundle);
            }
        }
        this.f3955c.x(hashMap);
        K k6 = (K) bundle3.getParcelable("state");
        if (k6 == null) {
            return;
        }
        this.f3955c.v();
        Iterator it = k6.f3996a.iterator();
        while (it.hasNext()) {
            Bundle B6 = this.f3955c.B((String) it.next(), null);
            if (B6 != null) {
                AbstractComponentCallbacksC0708p j6 = this.f3950R.j(((N) B6.getParcelable("state")).f4013b);
                if (j6 != null) {
                    if (I0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + j6);
                    }
                    o6 = new O(this.f3968p, this.f3955c, j6, B6);
                } else {
                    o6 = new O(this.f3968p, this.f3955c, this.f3976x.f().getClassLoader(), t0(), B6);
                }
                AbstractComponentCallbacksC0708p k7 = o6.k();
                k7.mSavedFragmentState = B6;
                k7.mFragmentManager = this;
                if (I0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + k7.mWho + "): " + k7);
                }
                o6.o(this.f3976x.f().getClassLoader());
                this.f3955c.r(o6);
                o6.s(this.f3975w);
            }
        }
        for (AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p : this.f3950R.m()) {
            if (!this.f3955c.c(abstractComponentCallbacksC0708p.mWho)) {
                if (I0(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + abstractComponentCallbacksC0708p + " that was not found in the set of active Fragments " + k6.f3996a);
                }
                this.f3950R.p(abstractComponentCallbacksC0708p);
                abstractComponentCallbacksC0708p.mFragmentManager = this;
                O o7 = new O(this.f3968p, this.f3955c, abstractComponentCallbacksC0708p);
                o7.s(1);
                o7.m();
                abstractComponentCallbacksC0708p.mRemoving = true;
                o7.m();
            }
        }
        this.f3955c.w(k6.f3997b);
        if (k6.f3998c != null) {
            this.f3956d = new ArrayList(k6.f3998c.length);
            int i6 = 0;
            while (true) {
                C0694b[] c0694bArr = k6.f3998c;
                if (i6 >= c0694bArr.length) {
                    break;
                }
                C0693a c6 = c0694bArr[i6].c(this);
                if (I0(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i6 + " (index " + c6.f4106v + "): " + c6);
                    PrintWriter printWriter = new PrintWriter(new X("FragmentManager"));
                    c6.q("  ", printWriter, false);
                    printWriter.close();
                }
                this.f3956d.add(c6);
                i6++;
            }
        } else {
            this.f3956d = new ArrayList();
        }
        this.f3963k.set(k6.f3999d);
        String str3 = k6.f4000e;
        if (str3 != null) {
            AbstractComponentCallbacksC0708p f02 = f0(str3);
            this.f3933A = f02;
            L(f02);
        }
        ArrayList arrayList = k6.f4001f;
        if (arrayList != null) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                this.f3964l.put((String) arrayList.get(i7), (C0695c) k6.f4002g.get(i7));
            }
        }
        this.f3941I = new ArrayDeque(k6.f4003h);
    }

    public void h(C0693a c0693a) {
        this.f3956d.add(c0693a);
    }

    public AbstractComponentCallbacksC0708p h0(int i6) {
        return this.f3955c.g(i6);
    }

    public O i(AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p) {
        String str = abstractComponentCallbacksC0708p.mPreviousWho;
        if (str != null) {
            Q0.c.f(abstractComponentCallbacksC0708p, str);
        }
        if (I0(2)) {
            Log.v("FragmentManager", "add: " + abstractComponentCallbacksC0708p);
        }
        O v6 = v(abstractComponentCallbacksC0708p);
        abstractComponentCallbacksC0708p.mFragmentManager = this;
        this.f3955c.r(v6);
        if (!abstractComponentCallbacksC0708p.mDetached) {
            this.f3955c.a(abstractComponentCallbacksC0708p);
            abstractComponentCallbacksC0708p.mRemoving = false;
            if (abstractComponentCallbacksC0708p.mView == null) {
                abstractComponentCallbacksC0708p.mHiddenChanged = false;
            }
            if (J0(abstractComponentCallbacksC0708p)) {
                this.f3942J = true;
            }
        }
        return v6;
    }

    public AbstractComponentCallbacksC0708p i0(String str) {
        return this.f3955c.h(str);
    }

    public Bundle i1() {
        C0694b[] c0694bArr;
        Bundle bundle = new Bundle();
        m0();
        X();
        a0(true);
        this.f3943K = true;
        this.f3950R.q(true);
        ArrayList y6 = this.f3955c.y();
        HashMap m6 = this.f3955c.m();
        if (!m6.isEmpty()) {
            ArrayList z6 = this.f3955c.z();
            int size = this.f3956d.size();
            if (size > 0) {
                c0694bArr = new C0694b[size];
                for (int i6 = 0; i6 < size; i6++) {
                    c0694bArr[i6] = new C0694b((C0693a) this.f3956d.get(i6));
                    if (I0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i6 + ": " + this.f3956d.get(i6));
                    }
                }
            } else {
                c0694bArr = null;
            }
            K k6 = new K();
            k6.f3996a = y6;
            k6.f3997b = z6;
            k6.f3998c = c0694bArr;
            k6.f3999d = this.f3963k.get();
            AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p = this.f3933A;
            if (abstractComponentCallbacksC0708p != null) {
                k6.f4000e = abstractComponentCallbacksC0708p.mWho;
            }
            k6.f4001f.addAll(this.f3964l.keySet());
            k6.f4002g.addAll(this.f3964l.values());
            k6.f4003h = new ArrayList(this.f3941I);
            bundle.putParcelable("state", k6);
            for (String str : this.f3965m.keySet()) {
                bundle.putBundle("result_" + str, (Bundle) this.f3965m.get(str));
            }
            for (String str2 : m6.keySet()) {
                bundle.putBundle("fragment_" + str2, (Bundle) m6.get(str2));
            }
        } else if (I0(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    public void j(M m6) {
        this.f3969q.add(m6);
    }

    public AbstractComponentCallbacksC0708p j0(String str) {
        return this.f3955c.i(str);
    }

    public void j1() {
        synchronized (this.f3953a) {
            try {
                if (this.f3953a.size() == 1) {
                    this.f3976x.h().removeCallbacks(this.f3952T);
                    this.f3976x.h().post(this.f3952T);
                    s1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int k() {
        return this.f3963k.getAndIncrement();
    }

    public void k1(AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p, boolean z6) {
        ViewGroup s02 = s0(abstractComponentCallbacksC0708p);
        if (s02 == null || !(s02 instanceof C0715x)) {
            return;
        }
        ((C0715x) s02).setDrawDisappearingViewsLast(!z6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void l(A a6, AbstractC0714w abstractC0714w, AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p) {
        String str;
        if (this.f3976x != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f3976x = a6;
        this.f3977y = abstractC0714w;
        this.f3978z = abstractComponentCallbacksC0708p;
        if (abstractComponentCallbacksC0708p != null) {
            j(new g(abstractComponentCallbacksC0708p));
        } else if (a6 instanceof M) {
            j((M) a6);
        }
        if (this.f3978z != null) {
            s1();
        }
        if (a6 instanceof e.y) {
            e.y yVar = (e.y) a6;
            e.w onBackPressedDispatcher = yVar.getOnBackPressedDispatcher();
            this.f3959g = onBackPressedDispatcher;
            InterfaceC1061m interfaceC1061m = yVar;
            if (abstractComponentCallbacksC0708p != null) {
                interfaceC1061m = abstractComponentCallbacksC0708p;
            }
            onBackPressedDispatcher.h(interfaceC1061m, this.f3962j);
        }
        if (abstractComponentCallbacksC0708p != null) {
            this.f3950R = abstractComponentCallbacksC0708p.mFragmentManager.q0(abstractComponentCallbacksC0708p);
        } else if (a6 instanceof androidx.lifecycle.Q) {
            this.f3950R = L.l(((androidx.lifecycle.Q) a6).getViewModelStore());
        } else {
            this.f3950R = new L(false);
        }
        this.f3950R.q(P0());
        this.f3955c.A(this.f3950R);
        Object obj = this.f3976x;
        if ((obj instanceof y2.f) && abstractComponentCallbacksC0708p == null) {
            y2.d savedStateRegistry = ((y2.f) obj).getSavedStateRegistry();
            savedStateRegistry.h("android:support:fragments", new d.c() { // from class: P0.H
                @Override // y2.d.c
                public final Bundle a() {
                    Bundle i12;
                    i12 = I.this.i1();
                    return i12;
                }
            });
            Bundle b6 = savedStateRegistry.b("android:support:fragments");
            if (b6 != null) {
                g1(b6);
            }
        }
        Object obj2 = this.f3976x;
        if (obj2 instanceof g.f) {
            g.e activityResultRegistry = ((g.f) obj2).getActivityResultRegistry();
            if (abstractComponentCallbacksC0708p != null) {
                str = abstractComponentCallbacksC0708p.mWho + ":";
            } else {
                str = "";
            }
            String str2 = "FragmentManager:" + str;
            this.f3938F = activityResultRegistry.m(str2 + "StartActivityForResult", new C1396h(), new h());
            this.f3939G = activityResultRegistry.m(str2 + "StartIntentSenderForResult", new j(), new i());
            this.f3940H = activityResultRegistry.m(str2 + "RequestPermissions", new C1395g(), new a());
        }
        Object obj3 = this.f3976x;
        if (obj3 instanceof n0.c) {
            ((n0.c) obj3).addOnConfigurationChangedListener(this.f3970r);
        }
        Object obj4 = this.f3976x;
        if (obj4 instanceof n0.d) {
            ((n0.d) obj4).addOnTrimMemoryListener(this.f3971s);
        }
        Object obj5 = this.f3976x;
        if (obj5 instanceof androidx.core.app.r) {
            ((androidx.core.app.r) obj5).addOnMultiWindowModeChangedListener(this.f3972t);
        }
        Object obj6 = this.f3976x;
        if (obj6 instanceof androidx.core.app.s) {
            ((androidx.core.app.s) obj6).addOnPictureInPictureModeChangedListener(this.f3973u);
        }
        Object obj7 = this.f3976x;
        if ((obj7 instanceof InterfaceC2428n) && abstractComponentCallbacksC0708p == null) {
            ((InterfaceC2428n) obj7).addMenuProvider(this.f3974v);
        }
    }

    public void l1(AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p, AbstractC1057i.b bVar) {
        if (abstractComponentCallbacksC0708p.equals(f0(abstractComponentCallbacksC0708p.mWho)) && (abstractComponentCallbacksC0708p.mHost == null || abstractComponentCallbacksC0708p.mFragmentManager == this)) {
            abstractComponentCallbacksC0708p.mMaxState = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0708p + " is not an active fragment of FragmentManager " + this);
    }

    public void m(AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p) {
        if (I0(2)) {
            Log.v("FragmentManager", "attach: " + abstractComponentCallbacksC0708p);
        }
        if (abstractComponentCallbacksC0708p.mDetached) {
            abstractComponentCallbacksC0708p.mDetached = false;
            if (abstractComponentCallbacksC0708p.mAdded) {
                return;
            }
            this.f3955c.a(abstractComponentCallbacksC0708p);
            if (I0(2)) {
                Log.v("FragmentManager", "add from attach: " + abstractComponentCallbacksC0708p);
            }
            if (J0(abstractComponentCallbacksC0708p)) {
                this.f3942J = true;
            }
        }
    }

    public final void m0() {
        Iterator it = t().iterator();
        while (it.hasNext()) {
            ((a0) it.next()).r();
        }
    }

    public void m1(AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p) {
        if (abstractComponentCallbacksC0708p == null || (abstractComponentCallbacksC0708p.equals(f0(abstractComponentCallbacksC0708p.mWho)) && (abstractComponentCallbacksC0708p.mHost == null || abstractComponentCallbacksC0708p.mFragmentManager == this))) {
            AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p2 = this.f3933A;
            this.f3933A = abstractComponentCallbacksC0708p;
            L(abstractComponentCallbacksC0708p2);
            L(this.f3933A);
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0708p + " is not an active fragment of FragmentManager " + this);
    }

    public Q n() {
        return new C0693a(this);
    }

    public Set n0(C0693a c0693a) {
        HashSet hashSet = new HashSet();
        for (int i6 = 0; i6 < c0693a.f4040c.size(); i6++) {
            AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p = ((Q.a) c0693a.f4040c.get(i6)).f4058b;
            if (abstractComponentCallbacksC0708p != null && c0693a.f4046i) {
                hashSet.add(abstractComponentCallbacksC0708p);
            }
        }
        return hashSet;
    }

    public final void n1(AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p) {
        ViewGroup s02 = s0(abstractComponentCallbacksC0708p);
        if (s02 == null || abstractComponentCallbacksC0708p.getEnterAnim() + abstractComponentCallbacksC0708p.getExitAnim() + abstractComponentCallbacksC0708p.getPopEnterAnim() + abstractComponentCallbacksC0708p.getPopExitAnim() <= 0) {
            return;
        }
        int i6 = O0.b.f3883c;
        if (s02.getTag(i6) == null) {
            s02.setTag(i6, abstractComponentCallbacksC0708p);
        }
        ((AbstractComponentCallbacksC0708p) s02.getTag(i6)).setPopDirection(abstractComponentCallbacksC0708p.getPopDirection());
    }

    public void o() {
        C0693a c0693a = this.f3960h;
        if (c0693a != null) {
            c0693a.f4105u = false;
            c0693a.f();
            e0();
            Iterator it = this.f3967o.iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                throw null;
            }
        }
    }

    public final boolean o0(ArrayList arrayList, ArrayList arrayList2) {
        synchronized (this.f3953a) {
            if (this.f3953a.isEmpty()) {
                return false;
            }
            try {
                int size = this.f3953a.size();
                boolean z6 = false;
                for (int i6 = 0; i6 < size; i6++) {
                    z6 |= ((m) this.f3953a.get(i6)).a(arrayList, arrayList2);
                }
                return z6;
            } finally {
                this.f3953a.clear();
                this.f3976x.h().removeCallbacks(this.f3952T);
            }
        }
    }

    public void o1(AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p) {
        if (I0(2)) {
            Log.v("FragmentManager", "show: " + abstractComponentCallbacksC0708p);
        }
        if (abstractComponentCallbacksC0708p.mHidden) {
            abstractComponentCallbacksC0708p.mHidden = false;
            abstractComponentCallbacksC0708p.mHiddenChanged = !abstractComponentCallbacksC0708p.mHiddenChanged;
        }
    }

    public boolean p() {
        boolean z6 = false;
        for (AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p : this.f3955c.l()) {
            if (abstractComponentCallbacksC0708p != null) {
                z6 = J0(abstractComponentCallbacksC0708p);
            }
            if (z6) {
                return true;
            }
        }
        return false;
    }

    public int p0() {
        return this.f3956d.size() + (this.f3960h != null ? 1 : 0);
    }

    public final void p1() {
        Iterator it = this.f3955c.k().iterator();
        while (it.hasNext()) {
            U0((O) it.next());
        }
    }

    public final void q() {
        if (P0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    public final L q0(AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p) {
        return this.f3950R.k(abstractComponentCallbacksC0708p);
    }

    public final void q1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new X("FragmentManager"));
        A a6 = this.f3976x;
        if (a6 != null) {
            try {
                a6.i("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e6) {
                Log.e("FragmentManager", "Failed dumping state", e6);
                throw runtimeException;
            }
        }
        try {
            W("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e7) {
            Log.e("FragmentManager", "Failed dumping state", e7);
            throw runtimeException;
        }
    }

    public final void r() {
        this.f3954b = false;
        this.f3948P.clear();
        this.f3947O.clear();
    }

    public AbstractC0714w r0() {
        return this.f3977y;
    }

    public void r1(k kVar) {
        this.f3968p.p(kVar);
    }

    public final void s() {
        A a6 = this.f3976x;
        if (a6 instanceof androidx.lifecycle.Q ? this.f3955c.p().o() : a6.f() instanceof Activity ? !((Activity) this.f3976x.f()).isChangingConfigurations() : true) {
            Iterator it = this.f3964l.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((C0695c) it.next()).f4156a.iterator();
                while (it2.hasNext()) {
                    this.f3955c.p().h((String) it2.next(), false);
                }
            }
        }
    }

    public final ViewGroup s0(AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p) {
        ViewGroup viewGroup = abstractComponentCallbacksC0708p.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC0708p.mContainerId > 0 && this.f3977y.d()) {
            View c6 = this.f3977y.c(abstractComponentCallbacksC0708p.mContainerId);
            if (c6 instanceof ViewGroup) {
                return (ViewGroup) c6;
            }
        }
        return null;
    }

    public final void s1() {
        synchronized (this.f3953a) {
            try {
                if (!this.f3953a.isEmpty()) {
                    this.f3962j.j(true);
                    if (I0(3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                boolean z6 = p0() > 0 && N0(this.f3978z);
                if (I0(3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z6);
                }
                this.f3962j.j(z6);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Set t() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f3955c.k().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((O) it.next()).k().mContainer;
            if (viewGroup != null) {
                hashSet.add(a0.v(viewGroup, A0()));
            }
        }
        return hashSet;
    }

    public AbstractC0717z t0() {
        AbstractC0717z abstractC0717z = this.f3934B;
        if (abstractC0717z != null) {
            return abstractC0717z;
        }
        AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p = this.f3978z;
        return abstractComponentCallbacksC0708p != null ? abstractComponentCallbacksC0708p.mFragmentManager.t0() : this.f3935C;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p = this.f3978z;
        if (abstractComponentCallbacksC0708p != null) {
            sb.append(abstractComponentCallbacksC0708p.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f3978z)));
            sb.append("}");
        } else {
            A a6 = this.f3976x;
            if (a6 != null) {
                sb.append(a6.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f3976x)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public Set u(ArrayList arrayList, int i6, int i7) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i6 < i7) {
            Iterator it = ((C0693a) arrayList.get(i6)).f4040c.iterator();
            while (it.hasNext()) {
                AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p = ((Q.a) it.next()).f4058b;
                if (abstractComponentCallbacksC0708p != null && (viewGroup = abstractComponentCallbacksC0708p.mContainer) != null) {
                    hashSet.add(a0.u(viewGroup, this));
                }
            }
            i6++;
        }
        return hashSet;
    }

    public List u0() {
        return this.f3955c.o();
    }

    public O v(AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p) {
        O n6 = this.f3955c.n(abstractComponentCallbacksC0708p.mWho);
        if (n6 != null) {
            return n6;
        }
        O o6 = new O(this.f3968p, this.f3955c, abstractComponentCallbacksC0708p);
        o6.o(this.f3976x.f().getClassLoader());
        o6.s(this.f3975w);
        return o6;
    }

    public A v0() {
        return this.f3976x;
    }

    public void w(AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p) {
        if (I0(2)) {
            Log.v("FragmentManager", "detach: " + abstractComponentCallbacksC0708p);
        }
        if (abstractComponentCallbacksC0708p.mDetached) {
            return;
        }
        abstractComponentCallbacksC0708p.mDetached = true;
        if (abstractComponentCallbacksC0708p.mAdded) {
            if (I0(2)) {
                Log.v("FragmentManager", "remove from detach: " + abstractComponentCallbacksC0708p);
            }
            this.f3955c.u(abstractComponentCallbacksC0708p);
            if (J0(abstractComponentCallbacksC0708p)) {
                this.f3942J = true;
            }
            n1(abstractComponentCallbacksC0708p);
        }
    }

    public LayoutInflater.Factory2 w0() {
        return this.f3958f;
    }

    public void x() {
        this.f3943K = false;
        this.f3944L = false;
        this.f3950R.q(false);
        S(4);
    }

    public C x0() {
        return this.f3968p;
    }

    public void y() {
        this.f3943K = false;
        this.f3944L = false;
        this.f3950R.q(false);
        S(0);
    }

    public AbstractComponentCallbacksC0708p y0() {
        return this.f3978z;
    }

    public void z(Configuration configuration, boolean z6) {
        if (z6 && (this.f3976x instanceof n0.c)) {
            q1(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p : this.f3955c.o()) {
            if (abstractComponentCallbacksC0708p != null) {
                abstractComponentCallbacksC0708p.performConfigurationChanged(configuration);
                if (z6) {
                    abstractComponentCallbacksC0708p.mChildFragmentManager.z(configuration, true);
                }
            }
        }
    }

    public AbstractComponentCallbacksC0708p z0() {
        return this.f3933A;
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class l implements Parcelable {
        public static final Parcelable.Creator<l> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public String f3989a;

        /* renamed from: b, reason: collision with root package name */
        public int f3990b;

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public l createFromParcel(Parcel parcel) {
                return new l(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public l[] newArray(int i6) {
                return new l[i6];
            }
        }

        public l(String str, int i6) {
            this.f3989a = str;
            this.f3990b = i6;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i6) {
            parcel.writeString(this.f3989a);
            parcel.writeInt(this.f3990b);
        }

        public l(Parcel parcel) {
            this.f3989a = parcel.readString();
            this.f3990b = parcel.readInt();
        }
    }
}
