package P0;

import android.util.Log;
import androidx.lifecycle.N;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class L extends androidx.lifecycle.M {

    /* renamed from: k, reason: collision with root package name */
    public static final N.b f4004k = new a();

    /* renamed from: g, reason: collision with root package name */
    public final boolean f4008g;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f4005d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f4006e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f4007f = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public boolean f4009h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f4010i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4011j = false;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements N.b {
        @Override // androidx.lifecycle.N.b
        public androidx.lifecycle.M a(Class cls) {
            return new L(true);
        }
    }

    public L(boolean z6) {
        this.f4008g = z6;
    }

    public static L l(androidx.lifecycle.P p6) {
        return (L) new androidx.lifecycle.N(p6, f4004k).a(L.class);
    }

    @Override // androidx.lifecycle.M
    public void d() {
        if (I.I0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f4009h = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && L.class == obj.getClass()) {
            L l6 = (L) obj;
            if (this.f4005d.equals(l6.f4005d) && this.f4006e.equals(l6.f4006e) && this.f4007f.equals(l6.f4007f)) {
                return true;
            }
        }
        return false;
    }

    public void f(AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p) {
        if (this.f4011j) {
            if (I.I0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f4005d.containsKey(abstractComponentCallbacksC0708p.mWho)) {
                return;
            }
            this.f4005d.put(abstractComponentCallbacksC0708p.mWho, abstractComponentCallbacksC0708p);
            if (I.I0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + abstractComponentCallbacksC0708p);
            }
        }
    }

    public void g(AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p, boolean z6) {
        if (I.I0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + abstractComponentCallbacksC0708p);
        }
        i(abstractComponentCallbacksC0708p.mWho, z6);
    }

    public void h(String str, boolean z6) {
        if (I.I0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        i(str, z6);
    }

    public int hashCode() {
        return (((this.f4005d.hashCode() * 31) + this.f4006e.hashCode()) * 31) + this.f4007f.hashCode();
    }

    public final void i(String str, boolean z6) {
        L l6 = (L) this.f4006e.get(str);
        if (l6 != null) {
            if (z6) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(l6.f4006e.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    l6.h((String) it.next(), true);
                }
            }
            l6.d();
            this.f4006e.remove(str);
        }
        androidx.lifecycle.P p6 = (androidx.lifecycle.P) this.f4007f.get(str);
        if (p6 != null) {
            p6.a();
            this.f4007f.remove(str);
        }
    }

    public AbstractComponentCallbacksC0708p j(String str) {
        return (AbstractComponentCallbacksC0708p) this.f4005d.get(str);
    }

    public L k(AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p) {
        L l6 = (L) this.f4006e.get(abstractComponentCallbacksC0708p.mWho);
        if (l6 != null) {
            return l6;
        }
        L l7 = new L(this.f4008g);
        this.f4006e.put(abstractComponentCallbacksC0708p.mWho, l7);
        return l7;
    }

    public Collection m() {
        return new ArrayList(this.f4005d.values());
    }

    public androidx.lifecycle.P n(AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p) {
        androidx.lifecycle.P p6 = (androidx.lifecycle.P) this.f4007f.get(abstractComponentCallbacksC0708p.mWho);
        if (p6 != null) {
            return p6;
        }
        androidx.lifecycle.P p7 = new androidx.lifecycle.P();
        this.f4007f.put(abstractComponentCallbacksC0708p.mWho, p7);
        return p7;
    }

    public boolean o() {
        return this.f4009h;
    }

    public void p(AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p) {
        if (this.f4011j) {
            if (I.I0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f4005d.remove(abstractComponentCallbacksC0708p.mWho) == null || !I.I0(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + abstractComponentCallbacksC0708p);
        }
    }

    public void q(boolean z6) {
        this.f4011j = z6;
    }

    public boolean r(AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p) {
        if (this.f4005d.containsKey(abstractComponentCallbacksC0708p.mWho)) {
            return this.f4008g ? this.f4009h : !this.f4010i;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f4005d.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f4006e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f4007f.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
