package o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.e;
import i.AbstractC1476i;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import kotlin.io.ConstantsKt;
import org.xmlpull.v1.XmlPullParserException;
import q.S;
import q.y;
import s0.InterfaceMenuC2040a;
import z0.AbstractC2430p;

/* renamed from: o.d, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C1834d extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class[] f17805e;

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f17806f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f17807a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f17808b;

    /* renamed from: c, reason: collision with root package name */
    public Context f17809c;

    /* renamed from: d, reason: collision with root package name */
    public Object f17810d;

    /* renamed from: o.d$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c, reason: collision with root package name */
        public static final Class[] f17811c = {MenuItem.class};

        /* renamed from: a, reason: collision with root package name */
        public Object f17812a;

        /* renamed from: b, reason: collision with root package name */
        public Method f17813b;

        public a(Object obj, String str) {
            this.f17812a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f17813b = cls.getMethod(str, f17811c);
            } catch (Exception e6) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e6);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f17813b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f17813b.invoke(this.f17812a, menuItem)).booleanValue();
                }
                this.f17813b.invoke(this.f17812a, menuItem);
                return true;
            } catch (Exception e6) {
                throw new RuntimeException(e6);
            }
        }
    }

    /* renamed from: o.d$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class b {

        /* renamed from: A, reason: collision with root package name */
        public CharSequence f17814A;

        /* renamed from: B, reason: collision with root package name */
        public CharSequence f17815B;

        /* renamed from: C, reason: collision with root package name */
        public ColorStateList f17816C = null;

        /* renamed from: D, reason: collision with root package name */
        public PorterDuff.Mode f17817D = null;

        /* renamed from: a, reason: collision with root package name */
        public Menu f17819a;

        /* renamed from: b, reason: collision with root package name */
        public int f17820b;

        /* renamed from: c, reason: collision with root package name */
        public int f17821c;

        /* renamed from: d, reason: collision with root package name */
        public int f17822d;

        /* renamed from: e, reason: collision with root package name */
        public int f17823e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f17824f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f17825g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f17826h;

        /* renamed from: i, reason: collision with root package name */
        public int f17827i;

        /* renamed from: j, reason: collision with root package name */
        public int f17828j;

        /* renamed from: k, reason: collision with root package name */
        public CharSequence f17829k;

        /* renamed from: l, reason: collision with root package name */
        public CharSequence f17830l;

        /* renamed from: m, reason: collision with root package name */
        public int f17831m;

        /* renamed from: n, reason: collision with root package name */
        public char f17832n;

        /* renamed from: o, reason: collision with root package name */
        public int f17833o;

        /* renamed from: p, reason: collision with root package name */
        public char f17834p;

        /* renamed from: q, reason: collision with root package name */
        public int f17835q;

        /* renamed from: r, reason: collision with root package name */
        public int f17836r;

        /* renamed from: s, reason: collision with root package name */
        public boolean f17837s;

        /* renamed from: t, reason: collision with root package name */
        public boolean f17838t;

        /* renamed from: u, reason: collision with root package name */
        public boolean f17839u;

        /* renamed from: v, reason: collision with root package name */
        public int f17840v;

        /* renamed from: w, reason: collision with root package name */
        public int f17841w;

        /* renamed from: x, reason: collision with root package name */
        public String f17842x;

        /* renamed from: y, reason: collision with root package name */
        public String f17843y;

        /* renamed from: z, reason: collision with root package name */
        public String f17844z;

        public b(Menu menu) {
            this.f17819a = menu;
            h();
        }

        public void a() {
            this.f17826h = true;
            i(this.f17819a.add(this.f17820b, this.f17827i, this.f17828j, this.f17829k));
        }

        public SubMenu b() {
            this.f17826h = true;
            SubMenu addSubMenu = this.f17819a.addSubMenu(this.f17820b, this.f17827i, this.f17828j, this.f17829k);
            i(addSubMenu.getItem());
            return addSubMenu;
        }

        public final char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        public boolean d() {
            return this.f17826h;
        }

        public final Object e(String str, Class[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, C1834d.this.f17809c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e6) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e6);
                return null;
            }
        }

        public void f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = C1834d.this.f17809c.obtainStyledAttributes(attributeSet, AbstractC1476i.f15502L0);
            this.f17820b = obtainStyledAttributes.getResourceId(AbstractC1476i.f15510N0, 0);
            this.f17821c = obtainStyledAttributes.getInt(AbstractC1476i.f15518P0, 0);
            this.f17822d = obtainStyledAttributes.getInt(AbstractC1476i.f15522Q0, 0);
            this.f17823e = obtainStyledAttributes.getInt(AbstractC1476i.f15526R0, 0);
            this.f17824f = obtainStyledAttributes.getBoolean(AbstractC1476i.f15514O0, true);
            this.f17825g = obtainStyledAttributes.getBoolean(AbstractC1476i.f15506M0, true);
            obtainStyledAttributes.recycle();
        }

        public void g(AttributeSet attributeSet) {
            S q6 = S.q(C1834d.this.f17809c, attributeSet, AbstractC1476i.f15530S0);
            this.f17827i = q6.l(AbstractC1476i.f15542V0, 0);
            this.f17828j = (q6.i(AbstractC1476i.f15554Y0, this.f17821c) & (-65536)) | (q6.i(AbstractC1476i.f15558Z0, this.f17822d) & 65535);
            this.f17829k = q6.n(AbstractC1476i.f15563a1);
            this.f17830l = q6.n(AbstractC1476i.f15568b1);
            this.f17831m = q6.l(AbstractC1476i.f15534T0, 0);
            this.f17832n = c(q6.m(AbstractC1476i.f15573c1));
            this.f17833o = q6.i(AbstractC1476i.f15608j1, ConstantsKt.DEFAULT_BLOCK_SIZE);
            this.f17834p = c(q6.m(AbstractC1476i.f15578d1));
            this.f17835q = q6.i(AbstractC1476i.f15625n1, ConstantsKt.DEFAULT_BLOCK_SIZE);
            int i6 = AbstractC1476i.f15583e1;
            if (q6.o(i6)) {
                this.f17836r = q6.a(i6, false) ? 1 : 0;
            } else {
                this.f17836r = this.f17823e;
            }
            this.f17837s = q6.a(AbstractC1476i.f15546W0, false);
            this.f17838t = q6.a(AbstractC1476i.f15550X0, this.f17824f);
            this.f17839u = q6.a(AbstractC1476i.f15538U0, this.f17825g);
            this.f17840v = q6.i(AbstractC1476i.f15629o1, -1);
            this.f17844z = q6.m(AbstractC1476i.f15588f1);
            this.f17841w = q6.l(AbstractC1476i.f15593g1, 0);
            this.f17842x = q6.m(AbstractC1476i.f15603i1);
            String m6 = q6.m(AbstractC1476i.f15598h1);
            this.f17843y = m6;
            boolean z6 = m6 != null;
            if (z6 && this.f17841w == 0 && this.f17842x == null) {
                android.support.v4.media.session.b.a(e(m6, C1834d.f17806f, C1834d.this.f17808b));
            } else if (z6) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
            }
            this.f17814A = q6.n(AbstractC1476i.f15613k1);
            this.f17815B = q6.n(AbstractC1476i.f15633p1);
            int i7 = AbstractC1476i.f15621m1;
            if (q6.o(i7)) {
                this.f17817D = y.d(q6.i(i7, -1), this.f17817D);
            } else {
                this.f17817D = null;
            }
            int i8 = AbstractC1476i.f15617l1;
            if (q6.o(i8)) {
                this.f17816C = q6.c(i8);
            } else {
                this.f17816C = null;
            }
            q6.s();
            this.f17826h = false;
        }

        public void h() {
            this.f17820b = 0;
            this.f17821c = 0;
            this.f17822d = 0;
            this.f17823e = 0;
            this.f17824f = true;
            this.f17825g = true;
        }

        public final void i(MenuItem menuItem) {
            boolean z6 = false;
            menuItem.setChecked(this.f17837s).setVisible(this.f17838t).setEnabled(this.f17839u).setCheckable(this.f17836r >= 1).setTitleCondensed(this.f17830l).setIcon(this.f17831m);
            int i6 = this.f17840v;
            if (i6 >= 0) {
                menuItem.setShowAsAction(i6);
            }
            if (this.f17844z != null) {
                if (C1834d.this.f17809c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(C1834d.this.b(), this.f17844z));
            }
            boolean z7 = menuItem instanceof e;
            if (z7) {
            }
            if (this.f17836r >= 2 && z7) {
                ((e) menuItem).s(true);
            }
            String str = this.f17842x;
            if (str != null) {
                menuItem.setActionView((View) e(str, C1834d.f17805e, C1834d.this.f17807a));
                z6 = true;
            }
            int i7 = this.f17841w;
            if (i7 > 0) {
                if (z6) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i7);
                }
            }
            AbstractC2430p.b(menuItem, this.f17814A);
            AbstractC2430p.f(menuItem, this.f17815B);
            AbstractC2430p.a(menuItem, this.f17832n, this.f17833o);
            AbstractC2430p.e(menuItem, this.f17834p, this.f17835q);
            PorterDuff.Mode mode = this.f17817D;
            if (mode != null) {
                AbstractC2430p.d(menuItem, mode);
            }
            ColorStateList colorStateList = this.f17816C;
            if (colorStateList != null) {
                AbstractC2430p.c(menuItem, colorStateList);
            }
        }
    }

    static {
        Class[] clsArr = {Context.class};
        f17805e = clsArr;
        f17806f = clsArr;
    }

    public C1834d(Context context) {
        super(context);
        this.f17809c = context;
        Object[] objArr = {context};
        this.f17807a = objArr;
        this.f17808b = objArr;
    }

    public final Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public Object b() {
        if (this.f17810d == null) {
            this.f17810d = a(this.f17809c);
        }
        return this.f17810d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        if (r15 == 2) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        if (r15 == 3) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (r7 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        if (r15.equals(r8) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        r7 = false;
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ab, code lost:
    
        r15 = r13.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (r15.equals("group") == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        r0.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        if (r15.equals("item") == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:
    
        if (r0.d() != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        r0.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007c, code lost:
    
        if (r15.equals("menu") == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007e, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0080, code lost:
    
        if (r7 == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0083, code lost:
    
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008b, code lost:
    
        if (r15.equals("group") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008d, code lost:
    
        r0.f(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0095, code lost:
    
        if (r15.equals("item") == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0097, code lost:
    
        r0.g(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009f, code lost:
    
        if (r15.equals("menu") == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a1, code lost:
    
        c(r13, r14, r0.b());
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a9, code lost:
    
        r8 = r15;
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00b7, code lost:
    
        throw new java.lang.RuntimeException("Unexpected end of document");
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b8, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003b, code lost:
    
        r6 = false;
        r7 = false;
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0040, code lost:
    
        if (r6 != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0042, code lost:
    
        if (r15 == 1) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(org.xmlpull.v1.XmlPullParser r13, android.util.AttributeSet r14, android.view.Menu r15) {
        /*
            r12 = this;
            o.d$b r0 = new o.d$b
            r0.<init>(r15)
            int r15 = r13.getEventType()
        L9:
            r1 = 2
            java.lang.String r2 = "menu"
            r3 = 1
            if (r15 != r1) goto L35
            java.lang.String r15 = r13.getName()
            boolean r4 = r15.equals(r2)
            if (r4 == 0) goto L1e
            int r15 = r13.next()
            goto L3b
        L1e:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "Expecting menu, got "
            r14.append(r0)
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L35:
            int r15 = r13.next()
            if (r15 != r3) goto L9
        L3b:
            r4 = 0
            r5 = 0
            r6 = r4
            r7 = r6
            r8 = r5
        L40:
            if (r6 != 0) goto Lb8
            if (r15 == r3) goto Lb0
            java.lang.String r9 = "item"
            java.lang.String r10 = "group"
            if (r15 == r1) goto L80
            r11 = 3
            if (r15 == r11) goto L4f
            goto Lab
        L4f:
            java.lang.String r15 = r13.getName()
            if (r7 == 0) goto L5e
            boolean r11 = r15.equals(r8)
            if (r11 == 0) goto L5e
            r7 = r4
            r8 = r5
            goto Lab
        L5e:
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L68
            r0.h()
            goto Lab
        L68:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto L78
            boolean r15 = r0.d()
            if (r15 != 0) goto Lab
            r0.a()
            goto Lab
        L78:
            boolean r15 = r15.equals(r2)
            if (r15 == 0) goto Lab
            r6 = r3
            goto Lab
        L80:
            if (r7 == 0) goto L83
            goto Lab
        L83:
            java.lang.String r15 = r13.getName()
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L91
            r0.f(r14)
            goto Lab
        L91:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto L9b
            r0.g(r14)
            goto Lab
        L9b:
            boolean r9 = r15.equals(r2)
            if (r9 == 0) goto La9
            android.view.SubMenu r15 = r0.b()
            r12.c(r13, r14, r15)
            goto Lab
        La9:
            r8 = r15
            r7 = r3
        Lab:
            int r15 = r13.next()
            goto L40
        Lb0:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.String r14 = "Unexpected end of document"
            r13.<init>(r14)
            throw r13
        Lb8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1834d.c(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.Menu):void");
    }

    @Override // android.view.MenuInflater
    public void inflate(int i6, Menu menu) {
        if (!(menu instanceof InterfaceMenuC2040a)) {
            super.inflate(i6, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f17809c.getResources().getLayout(i6);
                    c(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                } catch (IOException e6) {
                    throw new InflateException("Error inflating menu XML", e6);
                }
            } catch (XmlPullParserException e7) {
                throw new InflateException("Error inflating menu XML", e7);
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }
}
