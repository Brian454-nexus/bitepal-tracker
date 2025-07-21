package f3;

import java.util.Collections;
import java.util.List;
import v2.AbstractC2162A;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class s implements r {

    /* renamed from: a, reason: collision with root package name */
    public final v2.u f14107a;

    /* renamed from: b, reason: collision with root package name */
    public final v2.i f14108b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC2162A f14109c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC2162A f14110d;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a extends v2.i {
        public a(v2.u uVar) {
            super(uVar);
        }

        @Override // v2.AbstractC2162A
        public String e() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        @Override // v2.i
        public /* bridge */ /* synthetic */ void i(A2.k kVar, Object obj) {
            android.support.v4.media.session.b.a(obj);
            k(kVar, null);
        }

        public void k(A2.k kVar, q qVar) {
            throw null;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class b extends AbstractC2162A {
        public b(v2.u uVar) {
            super(uVar);
        }

        @Override // v2.AbstractC2162A
        public String e() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class c extends AbstractC2162A {
        public c(v2.u uVar) {
            super(uVar);
        }

        @Override // v2.AbstractC2162A
        public String e() {
            return "DELETE FROM WorkProgress";
        }
    }

    public s(v2.u uVar) {
        this.f14107a = uVar;
        this.f14108b = new a(uVar);
        this.f14109c = new b(uVar);
        this.f14110d = new c(uVar);
    }

    public static List c() {
        return Collections.EMPTY_LIST;
    }

    @Override // f3.r
    public void a(String str) {
        this.f14107a.d();
        A2.k b6 = this.f14109c.b();
        if (str == null) {
            b6.Q(1);
        } else {
            b6.b(1, str);
        }
        this.f14107a.e();
        try {
            b6.p();
            this.f14107a.B();
        } finally {
            this.f14107a.i();
            this.f14109c.h(b6);
        }
    }

    @Override // f3.r
    public void b() {
        this.f14107a.d();
        A2.k b6 = this.f14110d.b();
        this.f14107a.e();
        try {
            b6.p();
            this.f14107a.B();
        } finally {
            this.f14107a.i();
            this.f14110d.h(b6);
        }
    }
}
