package P0;

import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1057i;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class Q {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0717z f4038a;

    /* renamed from: b, reason: collision with root package name */
    public final ClassLoader f4039b;

    /* renamed from: d, reason: collision with root package name */
    public int f4041d;

    /* renamed from: e, reason: collision with root package name */
    public int f4042e;

    /* renamed from: f, reason: collision with root package name */
    public int f4043f;

    /* renamed from: g, reason: collision with root package name */
    public int f4044g;

    /* renamed from: h, reason: collision with root package name */
    public int f4045h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f4046i;

    /* renamed from: k, reason: collision with root package name */
    public String f4048k;

    /* renamed from: l, reason: collision with root package name */
    public int f4049l;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f4050m;

    /* renamed from: n, reason: collision with root package name */
    public int f4051n;

    /* renamed from: o, reason: collision with root package name */
    public CharSequence f4052o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f4053p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f4054q;

    /* renamed from: s, reason: collision with root package name */
    public ArrayList f4056s;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f4040c = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public boolean f4047j = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f4055r = false;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f4057a;

        /* renamed from: b, reason: collision with root package name */
        public AbstractComponentCallbacksC0708p f4058b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f4059c;

        /* renamed from: d, reason: collision with root package name */
        public int f4060d;

        /* renamed from: e, reason: collision with root package name */
        public int f4061e;

        /* renamed from: f, reason: collision with root package name */
        public int f4062f;

        /* renamed from: g, reason: collision with root package name */
        public int f4063g;

        /* renamed from: h, reason: collision with root package name */
        public AbstractC1057i.b f4064h;

        /* renamed from: i, reason: collision with root package name */
        public AbstractC1057i.b f4065i;

        public a() {
        }

        public a(int i6, AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p) {
            this.f4057a = i6;
            this.f4058b = abstractComponentCallbacksC0708p;
            this.f4059c = false;
            AbstractC1057i.b bVar = AbstractC1057i.b.RESUMED;
            this.f4064h = bVar;
            this.f4065i = bVar;
        }

        public a(int i6, AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p, boolean z6) {
            this.f4057a = i6;
            this.f4058b = abstractComponentCallbacksC0708p;
            this.f4059c = z6;
            AbstractC1057i.b bVar = AbstractC1057i.b.RESUMED;
            this.f4064h = bVar;
            this.f4065i = bVar;
        }
    }

    public Q(AbstractC0717z abstractC0717z, ClassLoader classLoader) {
        this.f4038a = abstractC0717z;
        this.f4039b = classLoader;
    }

    public Q b(int i6, AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p, String str) {
        k(i6, abstractComponentCallbacksC0708p, str, 1);
        return this;
    }

    public Q c(AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p, String str) {
        k(0, abstractComponentCallbacksC0708p, str, 1);
        return this;
    }

    public Q d(ViewGroup viewGroup, AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p, String str) {
        abstractComponentCallbacksC0708p.mContainer = viewGroup;
        return b(viewGroup.getId(), abstractComponentCallbacksC0708p, str);
    }

    public void e(a aVar) {
        this.f4040c.add(aVar);
        aVar.f4060d = this.f4041d;
        aVar.f4061e = this.f4042e;
        aVar.f4062f = this.f4043f;
        aVar.f4063g = this.f4044g;
    }

    public abstract int f();

    public abstract int g();

    public abstract void h();

    public abstract void i();

    public Q j() {
        if (this.f4046i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f4047j = false;
        return this;
    }

    public void k(int i6, AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p, String str, int i7) {
        String str2 = abstractComponentCallbacksC0708p.mPreviousWho;
        if (str2 != null) {
            Q0.c.f(abstractComponentCallbacksC0708p, str2);
        }
        Class<?> cls = abstractComponentCallbacksC0708p.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = abstractComponentCallbacksC0708p.mTag;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + abstractComponentCallbacksC0708p + ": was " + abstractComponentCallbacksC0708p.mTag + " now " + str);
            }
            abstractComponentCallbacksC0708p.mTag = str;
        }
        if (i6 != 0) {
            if (i6 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + abstractComponentCallbacksC0708p + " with tag " + str + " to container view with no id");
            }
            int i8 = abstractComponentCallbacksC0708p.mFragmentId;
            if (i8 != 0 && i8 != i6) {
                throw new IllegalStateException("Can't change container ID of fragment " + abstractComponentCallbacksC0708p + ": was " + abstractComponentCallbacksC0708p.mFragmentId + " now " + i6);
            }
            abstractComponentCallbacksC0708p.mFragmentId = i6;
            abstractComponentCallbacksC0708p.mContainerId = i6;
        }
        e(new a(i7, abstractComponentCallbacksC0708p));
    }

    public Q l(AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p) {
        e(new a(3, abstractComponentCallbacksC0708p));
        return this;
    }

    public Q m(boolean z6) {
        this.f4055r = z6;
        return this;
    }
}
