package P0;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class P {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f4034a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f4035b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f4036c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public L f4037d;

    public void A(L l6) {
        this.f4037d = l6;
    }

    public Bundle B(String str, Bundle bundle) {
        return bundle != null ? (Bundle) this.f4036c.put(str, bundle) : (Bundle) this.f4036c.remove(str);
    }

    public void a(AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p) {
        if (this.f4034a.contains(abstractComponentCallbacksC0708p)) {
            throw new IllegalStateException("Fragment already added: " + abstractComponentCallbacksC0708p);
        }
        synchronized (this.f4034a) {
            this.f4034a.add(abstractComponentCallbacksC0708p);
        }
        abstractComponentCallbacksC0708p.mAdded = true;
    }

    public void b() {
        this.f4035b.values().removeAll(Collections.singleton(null));
    }

    public boolean c(String str) {
        return this.f4035b.get(str) != null;
    }

    public void d(int i6) {
        for (O o6 : this.f4035b.values()) {
            if (o6 != null) {
                o6.s(i6);
            }
        }
    }

    public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f4035b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (O o6 : this.f4035b.values()) {
                printWriter.print(str);
                if (o6 != null) {
                    AbstractComponentCallbacksC0708p k6 = o6.k();
                    printWriter.println(k6);
                    k6.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f4034a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i6 = 0; i6 < size; i6++) {
                AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p = (AbstractComponentCallbacksC0708p) this.f4034a.get(i6);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i6);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0708p.toString());
            }
        }
    }

    public AbstractComponentCallbacksC0708p f(String str) {
        O o6 = (O) this.f4035b.get(str);
        if (o6 != null) {
            return o6.k();
        }
        return null;
    }

    public AbstractComponentCallbacksC0708p g(int i6) {
        for (int size = this.f4034a.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p = (AbstractComponentCallbacksC0708p) this.f4034a.get(size);
            if (abstractComponentCallbacksC0708p != null && abstractComponentCallbacksC0708p.mFragmentId == i6) {
                return abstractComponentCallbacksC0708p;
            }
        }
        for (O o6 : this.f4035b.values()) {
            if (o6 != null) {
                AbstractComponentCallbacksC0708p k6 = o6.k();
                if (k6.mFragmentId == i6) {
                    return k6;
                }
            }
        }
        return null;
    }

    public AbstractComponentCallbacksC0708p h(String str) {
        if (str != null) {
            for (int size = this.f4034a.size() - 1; size >= 0; size--) {
                AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p = (AbstractComponentCallbacksC0708p) this.f4034a.get(size);
                if (abstractComponentCallbacksC0708p != null && str.equals(abstractComponentCallbacksC0708p.mTag)) {
                    return abstractComponentCallbacksC0708p;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (O o6 : this.f4035b.values()) {
            if (o6 != null) {
                AbstractComponentCallbacksC0708p k6 = o6.k();
                if (str.equals(k6.mTag)) {
                    return k6;
                }
            }
        }
        return null;
    }

    public AbstractComponentCallbacksC0708p i(String str) {
        AbstractComponentCallbacksC0708p findFragmentByWho;
        for (O o6 : this.f4035b.values()) {
            if (o6 != null && (findFragmentByWho = o6.k().findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    public int j(AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p) {
        View view;
        View view2;
        ViewGroup viewGroup = abstractComponentCallbacksC0708p.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.f4034a.indexOf(abstractComponentCallbacksC0708p);
        for (int i6 = indexOf - 1; i6 >= 0; i6--) {
            AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p2 = (AbstractComponentCallbacksC0708p) this.f4034a.get(i6);
            if (abstractComponentCallbacksC0708p2.mContainer == viewGroup && (view2 = abstractComponentCallbacksC0708p2.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.f4034a.size()) {
                return -1;
            }
            AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p3 = (AbstractComponentCallbacksC0708p) this.f4034a.get(indexOf);
            if (abstractComponentCallbacksC0708p3.mContainer == viewGroup && (view = abstractComponentCallbacksC0708p3.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    public List k() {
        ArrayList arrayList = new ArrayList();
        for (O o6 : this.f4035b.values()) {
            if (o6 != null) {
                arrayList.add(o6);
            }
        }
        return arrayList;
    }

    public List l() {
        ArrayList arrayList = new ArrayList();
        for (O o6 : this.f4035b.values()) {
            if (o6 != null) {
                arrayList.add(o6.k());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public HashMap m() {
        return this.f4036c;
    }

    public O n(String str) {
        return (O) this.f4035b.get(str);
    }

    public List o() {
        ArrayList arrayList;
        if (this.f4034a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.f4034a) {
            arrayList = new ArrayList(this.f4034a);
        }
        return arrayList;
    }

    public L p() {
        return this.f4037d;
    }

    public Bundle q(String str) {
        return (Bundle) this.f4036c.get(str);
    }

    public void r(O o6) {
        AbstractComponentCallbacksC0708p k6 = o6.k();
        if (c(k6.mWho)) {
            return;
        }
        this.f4035b.put(k6.mWho, o6);
        if (k6.mRetainInstanceChangedWhileDetached) {
            if (k6.mRetainInstance) {
                this.f4037d.f(k6);
            } else {
                this.f4037d.p(k6);
            }
            k6.mRetainInstanceChangedWhileDetached = false;
        }
        if (I.I0(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + k6);
        }
    }

    public void s(O o6) {
        AbstractComponentCallbacksC0708p k6 = o6.k();
        if (k6.mRetainInstance) {
            this.f4037d.p(k6);
        }
        if (this.f4035b.get(k6.mWho) == o6 && ((O) this.f4035b.put(k6.mWho, null)) != null && I.I0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + k6);
        }
    }

    public void t() {
        Iterator it = this.f4034a.iterator();
        while (it.hasNext()) {
            O o6 = (O) this.f4035b.get(((AbstractComponentCallbacksC0708p) it.next()).mWho);
            if (o6 != null) {
                o6.m();
            }
        }
        for (O o7 : this.f4035b.values()) {
            if (o7 != null) {
                o7.m();
                AbstractComponentCallbacksC0708p k6 = o7.k();
                if (k6.mRemoving && !k6.isInBackStack()) {
                    if (k6.mBeingSaved && !this.f4036c.containsKey(k6.mWho)) {
                        B(k6.mWho, o7.q());
                    }
                    s(o7);
                }
            }
        }
    }

    public void u(AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p) {
        synchronized (this.f4034a) {
            this.f4034a.remove(abstractComponentCallbacksC0708p);
        }
        abstractComponentCallbacksC0708p.mAdded = false;
    }

    public void v() {
        this.f4035b.clear();
    }

    public void w(List list) {
        this.f4034a.clear();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                AbstractComponentCallbacksC0708p f6 = f(str);
                if (f6 == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (I.I0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + f6);
                }
                a(f6);
            }
        }
    }

    public void x(HashMap hashMap) {
        this.f4036c.clear();
        this.f4036c.putAll(hashMap);
    }

    public ArrayList y() {
        ArrayList arrayList = new ArrayList(this.f4035b.size());
        for (O o6 : this.f4035b.values()) {
            if (o6 != null) {
                AbstractComponentCallbacksC0708p k6 = o6.k();
                B(k6.mWho, o6.q());
                arrayList.add(k6.mWho);
                if (I.I0(2)) {
                    Log.v("FragmentManager", "Saved state of " + k6 + ": " + k6.mSavedFragmentState);
                }
            }
        }
        return arrayList;
    }

    public ArrayList z() {
        synchronized (this.f4034a) {
            try {
                if (this.f4034a.isEmpty()) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(this.f4034a.size());
                Iterator it = this.f4034a.iterator();
                while (it.hasNext()) {
                    AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p = (AbstractComponentCallbacksC0708p) it.next();
                    arrayList.add(abstractComponentCallbacksC0708p.mWho);
                    if (I.I0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding fragment (" + abstractComponentCallbacksC0708p.mWho + "): " + abstractComponentCallbacksC0708p);
                    }
                }
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
