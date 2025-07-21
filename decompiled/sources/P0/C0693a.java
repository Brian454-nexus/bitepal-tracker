package P0;

import P0.I;
import P0.Q;
import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: P0.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0693a extends Q implements I.m {

    /* renamed from: t, reason: collision with root package name */
    public final I f4104t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f4105u;

    /* renamed from: v, reason: collision with root package name */
    public int f4106v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f4107w;

    public C0693a(I i6) {
        super(i6.t0(), i6.v0() != null ? i6.v0().f().getClassLoader() : null);
        this.f4106v = -1;
        this.f4107w = false;
        this.f4104t = i6;
    }

    @Override // P0.I.m
    public boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (I.I0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f4046i) {
            return true;
        }
        this.f4104t.h(this);
        return true;
    }

    @Override // P0.Q
    public int f() {
        return o(false);
    }

    @Override // P0.Q
    public int g() {
        return o(true);
    }

    @Override // P0.Q
    public void h() {
        j();
        this.f4104t.b0(this, false);
    }

    @Override // P0.Q
    public void i() {
        j();
        this.f4104t.b0(this, true);
    }

    @Override // P0.Q
    public void k(int i6, AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p, String str, int i7) {
        super.k(i6, abstractComponentCallbacksC0708p, str, i7);
        abstractComponentCallbacksC0708p.mFragmentManager = this.f4104t;
    }

    @Override // P0.Q
    public Q l(AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p) {
        I i6 = abstractComponentCallbacksC0708p.mFragmentManager;
        if (i6 == null || i6 == this.f4104t) {
            return super.l(abstractComponentCallbacksC0708p);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + abstractComponentCallbacksC0708p.toString() + " is already attached to a FragmentManager.");
    }

    public void n(int i6) {
        if (this.f4046i) {
            if (I.I0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i6);
            }
            int size = this.f4040c.size();
            for (int i7 = 0; i7 < size; i7++) {
                Q.a aVar = (Q.a) this.f4040c.get(i7);
                AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p = aVar.f4058b;
                if (abstractComponentCallbacksC0708p != null) {
                    abstractComponentCallbacksC0708p.mBackStackNesting += i6;
                    if (I.I0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f4058b + " to " + aVar.f4058b.mBackStackNesting);
                    }
                }
            }
        }
    }

    public int o(boolean z6) {
        if (this.f4105u) {
            throw new IllegalStateException("commit already called");
        }
        if (I.I0(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new X("FragmentManager"));
            p("  ", printWriter);
            printWriter.close();
        }
        this.f4105u = true;
        if (this.f4046i) {
            this.f4106v = this.f4104t.k();
        } else {
            this.f4106v = -1;
        }
        this.f4104t.Y(this, z6);
        return this.f4106v;
    }

    public void p(String str, PrintWriter printWriter) {
        q(str, printWriter, true);
    }

    public void q(String str, PrintWriter printWriter, boolean z6) {
        String str2;
        if (z6) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f4048k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f4106v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f4105u);
            if (this.f4045h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f4045h));
            }
            if (this.f4041d != 0 || this.f4042e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f4041d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f4042e));
            }
            if (this.f4043f != 0 || this.f4044g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f4043f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f4044g));
            }
            if (this.f4049l != 0 || this.f4050m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f4049l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f4050m);
            }
            if (this.f4051n != 0 || this.f4052o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f4051n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f4052o);
            }
        }
        if (this.f4040c.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f4040c.size();
        for (int i6 = 0; i6 < size; i6++) {
            Q.a aVar = (Q.a) this.f4040c.get(i6);
            switch (aVar.f4057a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f4057a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i6);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f4058b);
            if (z6) {
                if (aVar.f4060d != 0 || aVar.f4061e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f4060d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f4061e));
                }
                if (aVar.f4062f != 0 || aVar.f4063g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f4062f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f4063g));
                }
            }
        }
    }

    public void r() {
        int size = this.f4040c.size();
        for (int i6 = 0; i6 < size; i6++) {
            Q.a aVar = (Q.a) this.f4040c.get(i6);
            AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p = aVar.f4058b;
            if (abstractComponentCallbacksC0708p != null) {
                abstractComponentCallbacksC0708p.mBeingSaved = this.f4107w;
                abstractComponentCallbacksC0708p.setPopDirection(false);
                abstractComponentCallbacksC0708p.setNextTransition(this.f4045h);
                abstractComponentCallbacksC0708p.setSharedElementNames(this.f4053p, this.f4054q);
            }
            switch (aVar.f4057a) {
                case 1:
                    abstractComponentCallbacksC0708p.setAnimations(aVar.f4060d, aVar.f4061e, aVar.f4062f, aVar.f4063g);
                    this.f4104t.k1(abstractComponentCallbacksC0708p, false);
                    this.f4104t.i(abstractComponentCallbacksC0708p);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f4057a);
                case 3:
                    abstractComponentCallbacksC0708p.setAnimations(aVar.f4060d, aVar.f4061e, aVar.f4062f, aVar.f4063g);
                    this.f4104t.d1(abstractComponentCallbacksC0708p);
                    break;
                case 4:
                    abstractComponentCallbacksC0708p.setAnimations(aVar.f4060d, aVar.f4061e, aVar.f4062f, aVar.f4063g);
                    this.f4104t.F0(abstractComponentCallbacksC0708p);
                    break;
                case 5:
                    abstractComponentCallbacksC0708p.setAnimations(aVar.f4060d, aVar.f4061e, aVar.f4062f, aVar.f4063g);
                    this.f4104t.k1(abstractComponentCallbacksC0708p, false);
                    this.f4104t.o1(abstractComponentCallbacksC0708p);
                    break;
                case 6:
                    abstractComponentCallbacksC0708p.setAnimations(aVar.f4060d, aVar.f4061e, aVar.f4062f, aVar.f4063g);
                    this.f4104t.w(abstractComponentCallbacksC0708p);
                    break;
                case 7:
                    abstractComponentCallbacksC0708p.setAnimations(aVar.f4060d, aVar.f4061e, aVar.f4062f, aVar.f4063g);
                    this.f4104t.k1(abstractComponentCallbacksC0708p, false);
                    this.f4104t.m(abstractComponentCallbacksC0708p);
                    break;
                case 8:
                    this.f4104t.m1(abstractComponentCallbacksC0708p);
                    break;
                case 9:
                    this.f4104t.m1(null);
                    break;
                case 10:
                    this.f4104t.l1(abstractComponentCallbacksC0708p, aVar.f4065i);
                    break;
            }
        }
    }

    public void s() {
        for (int size = this.f4040c.size() - 1; size >= 0; size--) {
            Q.a aVar = (Q.a) this.f4040c.get(size);
            AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p = aVar.f4058b;
            if (abstractComponentCallbacksC0708p != null) {
                abstractComponentCallbacksC0708p.mBeingSaved = this.f4107w;
                abstractComponentCallbacksC0708p.setPopDirection(true);
                abstractComponentCallbacksC0708p.setNextTransition(I.h1(this.f4045h));
                abstractComponentCallbacksC0708p.setSharedElementNames(this.f4054q, this.f4053p);
            }
            switch (aVar.f4057a) {
                case 1:
                    abstractComponentCallbacksC0708p.setAnimations(aVar.f4060d, aVar.f4061e, aVar.f4062f, aVar.f4063g);
                    this.f4104t.k1(abstractComponentCallbacksC0708p, true);
                    this.f4104t.d1(abstractComponentCallbacksC0708p);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f4057a);
                case 3:
                    abstractComponentCallbacksC0708p.setAnimations(aVar.f4060d, aVar.f4061e, aVar.f4062f, aVar.f4063g);
                    this.f4104t.i(abstractComponentCallbacksC0708p);
                    break;
                case 4:
                    abstractComponentCallbacksC0708p.setAnimations(aVar.f4060d, aVar.f4061e, aVar.f4062f, aVar.f4063g);
                    this.f4104t.o1(abstractComponentCallbacksC0708p);
                    break;
                case 5:
                    abstractComponentCallbacksC0708p.setAnimations(aVar.f4060d, aVar.f4061e, aVar.f4062f, aVar.f4063g);
                    this.f4104t.k1(abstractComponentCallbacksC0708p, true);
                    this.f4104t.F0(abstractComponentCallbacksC0708p);
                    break;
                case 6:
                    abstractComponentCallbacksC0708p.setAnimations(aVar.f4060d, aVar.f4061e, aVar.f4062f, aVar.f4063g);
                    this.f4104t.m(abstractComponentCallbacksC0708p);
                    break;
                case 7:
                    abstractComponentCallbacksC0708p.setAnimations(aVar.f4060d, aVar.f4061e, aVar.f4062f, aVar.f4063g);
                    this.f4104t.k1(abstractComponentCallbacksC0708p, true);
                    this.f4104t.w(abstractComponentCallbacksC0708p);
                    break;
                case 8:
                    this.f4104t.m1(null);
                    break;
                case 9:
                    this.f4104t.m1(abstractComponentCallbacksC0708p);
                    break;
                case 10:
                    this.f4104t.l1(abstractComponentCallbacksC0708p, aVar.f4064h);
                    break;
            }
        }
    }

    public AbstractComponentCallbacksC0708p t(ArrayList arrayList, AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p) {
        AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p2 = abstractComponentCallbacksC0708p;
        int i6 = 0;
        while (i6 < this.f4040c.size()) {
            Q.a aVar = (Q.a) this.f4040c.get(i6);
            int i7 = aVar.f4057a;
            if (i7 != 1) {
                if (i7 == 2) {
                    AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p3 = aVar.f4058b;
                    int i8 = abstractComponentCallbacksC0708p3.mContainerId;
                    boolean z6 = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p4 = (AbstractComponentCallbacksC0708p) arrayList.get(size);
                        if (abstractComponentCallbacksC0708p4.mContainerId == i8) {
                            if (abstractComponentCallbacksC0708p4 == abstractComponentCallbacksC0708p3) {
                                z6 = true;
                            } else {
                                if (abstractComponentCallbacksC0708p4 == abstractComponentCallbacksC0708p2) {
                                    this.f4040c.add(i6, new Q.a(9, abstractComponentCallbacksC0708p4, true));
                                    i6++;
                                    abstractComponentCallbacksC0708p2 = null;
                                }
                                Q.a aVar2 = new Q.a(3, abstractComponentCallbacksC0708p4, true);
                                aVar2.f4060d = aVar.f4060d;
                                aVar2.f4062f = aVar.f4062f;
                                aVar2.f4061e = aVar.f4061e;
                                aVar2.f4063g = aVar.f4063g;
                                this.f4040c.add(i6, aVar2);
                                arrayList.remove(abstractComponentCallbacksC0708p4);
                                i6++;
                            }
                        }
                    }
                    if (z6) {
                        this.f4040c.remove(i6);
                        i6--;
                    } else {
                        aVar.f4057a = 1;
                        aVar.f4059c = true;
                        arrayList.add(abstractComponentCallbacksC0708p3);
                    }
                } else if (i7 == 3 || i7 == 6) {
                    arrayList.remove(aVar.f4058b);
                    AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p5 = aVar.f4058b;
                    if (abstractComponentCallbacksC0708p5 == abstractComponentCallbacksC0708p2) {
                        this.f4040c.add(i6, new Q.a(9, abstractComponentCallbacksC0708p5));
                        i6++;
                        abstractComponentCallbacksC0708p2 = null;
                    }
                } else if (i7 != 7) {
                    if (i7 == 8) {
                        this.f4040c.add(i6, new Q.a(9, abstractComponentCallbacksC0708p2, true));
                        aVar.f4059c = true;
                        i6++;
                        abstractComponentCallbacksC0708p2 = aVar.f4058b;
                    }
                }
                i6++;
            }
            arrayList.add(aVar.f4058b);
            i6++;
        }
        return abstractComponentCallbacksC0708p2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f4106v >= 0) {
            sb.append(" #");
            sb.append(this.f4106v);
        }
        if (this.f4048k != null) {
            sb.append(" ");
            sb.append(this.f4048k);
        }
        sb.append("}");
        return sb.toString();
    }

    public String u() {
        return this.f4048k;
    }

    public void v() {
        if (this.f4056s != null) {
            for (int i6 = 0; i6 < this.f4056s.size(); i6++) {
                ((Runnable) this.f4056s.get(i6)).run();
            }
            this.f4056s = null;
        }
    }

    public AbstractComponentCallbacksC0708p w(ArrayList arrayList, AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p) {
        for (int size = this.f4040c.size() - 1; size >= 0; size--) {
            Q.a aVar = (Q.a) this.f4040c.get(size);
            int i6 = aVar.f4057a;
            if (i6 != 1) {
                if (i6 != 3) {
                    switch (i6) {
                        case 8:
                            abstractComponentCallbacksC0708p = null;
                            break;
                        case 9:
                            abstractComponentCallbacksC0708p = aVar.f4058b;
                            break;
                        case 10:
                            aVar.f4065i = aVar.f4064h;
                            break;
                    }
                }
                arrayList.add(aVar.f4058b);
            }
            arrayList.remove(aVar.f4058b);
        }
        return abstractComponentCallbacksC0708p;
    }
}
