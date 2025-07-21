package g5;

import P0.AbstractComponentCallbacksC0708p;
import P0.I;
import android.content.Context;
import androidx.lifecycle.AbstractC1057i;
import g5.o;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Map f14936a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final o.b f14937b;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AbstractC1057i f14938a;

        public a(AbstractC1057i abstractC1057i) {
            this.f14938a = abstractC1057i;
        }

        @Override // g5.l
        public void a() {
        }

        @Override // g5.l
        public void f() {
            m.this.f14936a.remove(this.f14938a);
        }

        @Override // g5.l
        public void j() {
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class b implements p {

        /* renamed from: a, reason: collision with root package name */
        public final I f14940a;

        public b(I i6) {
            this.f14940a = i6;
        }

        @Override // g5.p
        public Set a() {
            HashSet hashSet = new HashSet();
            b(this.f14940a, hashSet);
            return hashSet;
        }

        public final void b(I i6, Set set) {
            List u02 = i6.u0();
            int size = u02.size();
            for (int i7 = 0; i7 < size; i7++) {
                AbstractComponentCallbacksC0708p abstractComponentCallbacksC0708p = (AbstractComponentCallbacksC0708p) u02.get(i7);
                b(abstractComponentCallbacksC0708p.getChildFragmentManager(), set);
                com.bumptech.glide.l a6 = m.this.a(abstractComponentCallbacksC0708p.getLifecycle());
                if (a6 != null) {
                    set.add(a6);
                }
            }
        }
    }

    public m(o.b bVar) {
        this.f14937b = bVar;
    }

    public com.bumptech.glide.l a(AbstractC1057i abstractC1057i) {
        n5.l.b();
        return (com.bumptech.glide.l) this.f14936a.get(abstractC1057i);
    }

    public com.bumptech.glide.l b(Context context, com.bumptech.glide.b bVar, AbstractC1057i abstractC1057i, I i6, boolean z6) {
        n5.l.b();
        com.bumptech.glide.l a6 = a(abstractC1057i);
        if (a6 != null) {
            return a6;
        }
        k kVar = new k(abstractC1057i);
        com.bumptech.glide.l a7 = this.f14937b.a(bVar, kVar, new b(i6), context);
        this.f14936a.put(abstractC1057i, a7);
        kVar.a(new a(abstractC1057i));
        if (z6) {
            a7.a();
        }
        return a7;
    }
}
