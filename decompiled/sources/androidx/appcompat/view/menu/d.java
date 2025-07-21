package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import n0.AbstractC1809a;
import s0.InterfaceMenuC2040a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class d implements InterfaceMenuC2040a {

    /* renamed from: A, reason: collision with root package name */
    public static final int[] f7951A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    public final Context f7952a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f7953b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7954c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7955d;

    /* renamed from: e, reason: collision with root package name */
    public a f7956e;

    /* renamed from: m, reason: collision with root package name */
    public ContextMenu.ContextMenuInfo f7964m;

    /* renamed from: n, reason: collision with root package name */
    public CharSequence f7965n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f7966o;

    /* renamed from: p, reason: collision with root package name */
    public View f7967p;

    /* renamed from: x, reason: collision with root package name */
    public e f7975x;

    /* renamed from: z, reason: collision with root package name */
    public boolean f7977z;

    /* renamed from: l, reason: collision with root package name */
    public int f7963l = 0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f7968q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f7969r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f7970s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f7971t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f7972u = false;

    /* renamed from: v, reason: collision with root package name */
    public ArrayList f7973v = new ArrayList();

    /* renamed from: w, reason: collision with root package name */
    public CopyOnWriteArrayList f7974w = new CopyOnWriteArrayList();

    /* renamed from: y, reason: collision with root package name */
    public boolean f7976y = false;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f7957f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f7958g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public boolean f7959h = true;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f7960i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f7961j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public boolean f7962k = true;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface a {
        boolean a(d dVar, MenuItem menuItem);

        void b(d dVar);
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface b {
        boolean a(e eVar);
    }

    public d(Context context) {
        this.f7952a = context;
        this.f7953b = context.getResources();
        T(true);
    }

    public static int m(ArrayList arrayList, int i6) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((e) arrayList.get(size)).d() <= i6) {
                return size + 1;
            }
        }
        return 0;
    }

    public static int x(int i6) {
        int i7 = ((-65536) & i6) >> 16;
        if (i7 >= 0) {
            int[] iArr = f7951A;
            if (i7 < iArr.length) {
                return (i6 & 65535) | (iArr[i7] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    public ArrayList A() {
        if (!this.f7959h) {
            return this.f7958g;
        }
        this.f7958g.clear();
        int size = this.f7957f.size();
        for (int i6 = 0; i6 < size; i6++) {
            e eVar = (e) this.f7957f.get(i6);
            if (eVar.isVisible()) {
                this.f7958g.add(eVar);
            }
        }
        this.f7959h = false;
        this.f7962k = true;
        return this.f7958g;
    }

    public boolean B() {
        return this.f7976y;
    }

    public boolean C() {
        return this.f7954c;
    }

    public boolean D() {
        return this.f7955d;
    }

    public void E(e eVar) {
        this.f7962k = true;
        G(true);
    }

    public void F(e eVar) {
        this.f7959h = true;
        G(true);
    }

    public void G(boolean z6) {
        if (this.f7968q) {
            this.f7969r = true;
            if (z6) {
                this.f7970s = true;
                return;
            }
            return;
        }
        if (z6) {
            this.f7959h = true;
            this.f7962k = true;
        }
        h(z6);
    }

    public boolean H(MenuItem menuItem, int i6) {
        return I(menuItem, null, i6);
    }

    public boolean I(MenuItem menuItem, g gVar, int i6) {
        e eVar = (e) menuItem;
        if (eVar == null || !eVar.isEnabled()) {
            return false;
        }
        boolean j6 = eVar.j();
        eVar.g();
        if (eVar.i()) {
            boolean expandActionView = eVar.expandActionView() | j6;
            if (expandActionView) {
                d(true);
            }
            return expandActionView;
        }
        if (!eVar.hasSubMenu()) {
            if ((i6 & 1) == 0) {
                d(true);
            }
            return j6;
        }
        if ((i6 & 4) == 0) {
            d(false);
        }
        if (!eVar.hasSubMenu()) {
            eVar.w(new j(s(), this, eVar));
        }
        boolean i7 = i((j) eVar.getSubMenu(), gVar) | j6;
        if (!i7) {
            d(true);
        }
        return i7;
    }

    public final void J(int i6, boolean z6) {
        if (i6 < 0 || i6 >= this.f7957f.size()) {
            return;
        }
        this.f7957f.remove(i6);
        if (z6) {
            G(true);
        }
    }

    public void K(g gVar) {
        Iterator it = this.f7974w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            g gVar2 = (g) weakReference.get();
            if (gVar2 == null || gVar2 == gVar) {
                this.f7974w.remove(weakReference);
            }
        }
    }

    public void L(a aVar) {
        this.f7956e = aVar;
    }

    public void M(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f7957f.size();
        V();
        for (int i6 = 0; i6 < size; i6++) {
            e eVar = (e) this.f7957f.get(i6);
            if (eVar.getGroupId() == groupId && eVar.l() && eVar.isCheckable()) {
                eVar.r(eVar == menuItem);
            }
        }
        U();
    }

    public d N(int i6) {
        P(0, null, i6, null, null);
        return this;
    }

    public d O(Drawable drawable) {
        P(0, null, 0, drawable, null);
        return this;
    }

    public final void P(int i6, CharSequence charSequence, int i7, Drawable drawable, View view) {
        Resources y6 = y();
        if (view != null) {
            this.f7967p = view;
            this.f7965n = null;
            this.f7966o = null;
        } else {
            if (i6 > 0) {
                this.f7965n = y6.getText(i6);
            } else if (charSequence != null) {
                this.f7965n = charSequence;
            }
            if (i7 > 0) {
                this.f7966o = AbstractC1809a.getDrawable(s(), i7);
            } else if (drawable != null) {
                this.f7966o = drawable;
            }
            this.f7967p = null;
        }
        G(false);
    }

    public d Q(int i6) {
        P(i6, null, 0, null, null);
        return this;
    }

    public d R(CharSequence charSequence) {
        P(0, charSequence, 0, null, null);
        return this;
    }

    public d S(View view) {
        P(0, null, 0, null, view);
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (z0.AbstractC2396G.j(android.view.ViewConfiguration.get(r2.f7952a), r2.f7952a) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T(boolean r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L1c
            android.content.res.Resources r3 = r2.f7953b
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.keyboard
            r0 = 1
            if (r3 == r0) goto L1c
            android.content.Context r3 = r2.f7952a
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            android.content.Context r1 = r2.f7952a
            boolean r3 = z0.AbstractC2396G.j(r3, r1)
            if (r3 == 0) goto L1c
            goto L1d
        L1c:
            r0 = 0
        L1d:
            r2.f7955d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.d.T(boolean):void");
    }

    public void U() {
        this.f7968q = false;
        if (this.f7969r) {
            this.f7969r = false;
            G(this.f7970s);
        }
    }

    public void V() {
        if (this.f7968q) {
            return;
        }
        this.f7968q = true;
        this.f7969r = false;
        this.f7970s = false;
    }

    public MenuItem a(int i6, int i7, int i8, CharSequence charSequence) {
        int x6 = x(i8);
        e f6 = f(i6, i7, i8, x6, charSequence, this.f7963l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f7964m;
        if (contextMenuInfo != null) {
            f6.u(contextMenuInfo);
        }
        ArrayList arrayList = this.f7957f;
        arrayList.add(m(arrayList, x6), f6);
        G(true);
        return f6;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i6, int i7, int i8, ComponentName componentName, Intent[] intentArr, Intent intent, int i9, MenuItem[] menuItemArr) {
        int i10;
        PackageManager packageManager = this.f7952a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i9 & 1) == 0) {
            removeGroup(i6);
        }
        for (int i11 = 0; i11 < size; i11++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i11);
            int i12 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i12 < 0 ? intent : intentArr[i12]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i6, i7, i8, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i10 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i10] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(g gVar, Context context) {
        this.f7974w.add(new WeakReference(gVar));
        gVar.i(context, this);
        this.f7962k = true;
    }

    public void c() {
        a aVar = this.f7956e;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    @Override // android.view.Menu
    public void clear() {
        e eVar = this.f7975x;
        if (eVar != null) {
            e(eVar);
        }
        this.f7957f.clear();
        G(true);
    }

    public void clearHeader() {
        this.f7966o = null;
        this.f7965n = null;
        this.f7967p = null;
        G(false);
    }

    @Override // android.view.Menu
    public void close() {
        d(true);
    }

    public final void d(boolean z6) {
        if (this.f7972u) {
            return;
        }
        this.f7972u = true;
        Iterator it = this.f7974w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            g gVar = (g) weakReference.get();
            if (gVar == null) {
                this.f7974w.remove(weakReference);
            } else {
                gVar.b(this, z6);
            }
        }
        this.f7972u = false;
    }

    public boolean e(e eVar) {
        boolean z6 = false;
        if (!this.f7974w.isEmpty() && this.f7975x == eVar) {
            V();
            Iterator it = this.f7974w.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                g gVar = (g) weakReference.get();
                if (gVar == null) {
                    this.f7974w.remove(weakReference);
                } else {
                    z6 = gVar.e(this, eVar);
                    if (z6) {
                        break;
                    }
                }
            }
            U();
            if (z6) {
                this.f7975x = null;
            }
        }
        return z6;
    }

    public final e f(int i6, int i7, int i8, int i9, CharSequence charSequence, int i10) {
        return new e(this, i6, i7, i8, i9, charSequence, i10);
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i6) {
        MenuItem findItem;
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            e eVar = (e) this.f7957f.get(i7);
            if (eVar.getItemId() == i6) {
                return eVar;
            }
            if (eVar.hasSubMenu() && (findItem = eVar.getSubMenu().findItem(i6)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public boolean g(d dVar, MenuItem menuItem) {
        a aVar = this.f7956e;
        return aVar != null && aVar.a(dVar, menuItem);
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i6) {
        return (MenuItem) this.f7957f.get(i6);
    }

    public final void h(boolean z6) {
        if (this.f7974w.isEmpty()) {
            return;
        }
        V();
        Iterator it = this.f7974w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            g gVar = (g) weakReference.get();
            if (gVar == null) {
                this.f7974w.remove(weakReference);
            } else {
                gVar.c(z6);
            }
        }
        U();
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f7977z) {
            return true;
        }
        int size = size();
        for (int i6 = 0; i6 < size; i6++) {
            if (((e) this.f7957f.get(i6)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final boolean i(j jVar, g gVar) {
        if (this.f7974w.isEmpty()) {
            return false;
        }
        boolean k6 = gVar != null ? gVar.k(jVar) : false;
        Iterator it = this.f7974w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            g gVar2 = (g) weakReference.get();
            if (gVar2 == null) {
                this.f7974w.remove(weakReference);
            } else if (!k6) {
                k6 = gVar2.k(jVar);
            }
        }
        return k6;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i6, KeyEvent keyEvent) {
        return o(i6, keyEvent) != null;
    }

    public boolean j(e eVar) {
        boolean z6 = false;
        if (this.f7974w.isEmpty()) {
            return false;
        }
        V();
        Iterator it = this.f7974w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            g gVar = (g) weakReference.get();
            if (gVar == null) {
                this.f7974w.remove(weakReference);
            } else {
                z6 = gVar.g(this, eVar);
                if (z6) {
                    break;
                }
            }
        }
        U();
        if (z6) {
            this.f7975x = eVar;
        }
        return z6;
    }

    public int k(int i6) {
        return l(i6, 0);
    }

    public int l(int i6, int i7) {
        int size = size();
        if (i7 < 0) {
            i7 = 0;
        }
        while (i7 < size) {
            if (((e) this.f7957f.get(i7)).getGroupId() == i6) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    public int n(int i6) {
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            if (((e) this.f7957f.get(i7)).getItemId() == i6) {
                return i7;
            }
        }
        return -1;
    }

    public e o(int i6, KeyEvent keyEvent) {
        ArrayList arrayList = this.f7973v;
        arrayList.clear();
        p(arrayList, i6, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (e) arrayList.get(0);
        }
        boolean C6 = C();
        for (int i7 = 0; i7 < size; i7++) {
            e eVar = (e) arrayList.get(i7);
            char alphabeticShortcut = C6 ? eVar.getAlphabeticShortcut() : eVar.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (C6 && alphabeticShortcut == '\b' && i6 == 67))) {
                return eVar;
            }
        }
        return null;
    }

    public void p(List list, int i6, KeyEvent keyEvent) {
        boolean C6 = C();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i6 == 67) {
            int size = this.f7957f.size();
            for (int i7 = 0; i7 < size; i7++) {
                e eVar = (e) this.f7957f.get(i7);
                if (eVar.hasSubMenu()) {
                    ((d) eVar.getSubMenu()).p(list, i6, keyEvent);
                }
                char alphabeticShortcut = C6 ? eVar.getAlphabeticShortcut() : eVar.getNumericShortcut();
                if ((modifiers & 69647) == ((C6 ? eVar.getAlphabeticModifiers() : eVar.getNumericModifiers()) & 69647) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (C6 && alphabeticShortcut == '\b' && i6 == 67)) && eVar.isEnabled()) {
                        list.add(eVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i6, int i7) {
        return H(findItem(i6), i7);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i6, KeyEvent keyEvent, int i7) {
        e o6 = o(i6, keyEvent);
        boolean H6 = o6 != null ? H(o6, i7) : false;
        if ((i7 & 2) != 0) {
            d(true);
        }
        return H6;
    }

    public void q() {
        ArrayList A6 = A();
        if (this.f7962k) {
            Iterator it = this.f7974w.iterator();
            boolean z6 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                g gVar = (g) weakReference.get();
                if (gVar == null) {
                    this.f7974w.remove(weakReference);
                } else {
                    z6 |= gVar.d();
                }
            }
            if (z6) {
                this.f7960i.clear();
                this.f7961j.clear();
                int size = A6.size();
                for (int i6 = 0; i6 < size; i6++) {
                    e eVar = (e) A6.get(i6);
                    if (eVar.k()) {
                        this.f7960i.add(eVar);
                    } else {
                        this.f7961j.add(eVar);
                    }
                }
            } else {
                this.f7960i.clear();
                this.f7961j.clear();
                this.f7961j.addAll(A());
            }
            this.f7962k = false;
        }
    }

    public ArrayList r() {
        q();
        return this.f7960i;
    }

    @Override // android.view.Menu
    public void removeGroup(int i6) {
        int k6 = k(i6);
        if (k6 >= 0) {
            int size = this.f7957f.size() - k6;
            int i7 = 0;
            while (true) {
                int i8 = i7 + 1;
                if (i7 >= size || ((e) this.f7957f.get(k6)).getGroupId() != i6) {
                    break;
                }
                J(k6, false);
                i7 = i8;
            }
            G(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i6) {
        J(n(i6), true);
    }

    public Context s() {
        return this.f7952a;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i6, boolean z6, boolean z7) {
        int size = this.f7957f.size();
        for (int i7 = 0; i7 < size; i7++) {
            e eVar = (e) this.f7957f.get(i7);
            if (eVar.getGroupId() == i6) {
                eVar.s(z7);
                eVar.setCheckable(z6);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z6) {
        this.f7976y = z6;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i6, boolean z6) {
        int size = this.f7957f.size();
        for (int i7 = 0; i7 < size; i7++) {
            e eVar = (e) this.f7957f.get(i7);
            if (eVar.getGroupId() == i6) {
                eVar.setEnabled(z6);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i6, boolean z6) {
        int size = this.f7957f.size();
        boolean z7 = false;
        for (int i7 = 0; i7 < size; i7++) {
            e eVar = (e) this.f7957f.get(i7);
            if (eVar.getGroupId() == i6 && eVar.x(z6)) {
                z7 = true;
            }
        }
        if (z7) {
            G(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z6) {
        this.f7954c = z6;
        G(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f7957f.size();
    }

    public e t() {
        return this.f7975x;
    }

    public CharSequence u() {
        return this.f7965n;
    }

    public ArrayList v() {
        q();
        return this.f7961j;
    }

    public boolean w() {
        return this.f7971t;
    }

    public Resources y() {
        return this.f7953b;
    }

    public d z() {
        return this;
    }

    @Override // android.view.Menu
    public MenuItem add(int i6) {
        return a(0, 0, 0, this.f7953b.getString(i6));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i6) {
        return addSubMenu(0, 0, 0, this.f7953b.getString(i6));
    }

    @Override // android.view.Menu
    public MenuItem add(int i6, int i7, int i8, CharSequence charSequence) {
        return a(i6, i7, i8, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i6, int i7, int i8, CharSequence charSequence) {
        e eVar = (e) a(i6, i7, i8, charSequence);
        j jVar = new j(this.f7952a, this, eVar);
        eVar.w(jVar);
        return jVar;
    }

    @Override // android.view.Menu
    public MenuItem add(int i6, int i7, int i8, int i9) {
        return a(i6, i7, i8, this.f7953b.getString(i9));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i6, int i7, int i8, int i9) {
        return addSubMenu(i6, i7, i8, this.f7953b.getString(i9));
    }
}
