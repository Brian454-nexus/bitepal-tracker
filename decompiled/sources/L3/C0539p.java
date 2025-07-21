package L3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: L3.p, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0539p {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3296a;

    /* renamed from: L3.p$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Set f3297a = new HashSet();

        public a a(int i6) {
            this.f3297a.add(Integer.valueOf(i6));
            return this;
        }

        public C0539p b() {
            return new C0539p(this.f3297a, null);
        }
    }

    public /* synthetic */ C0539p(Set set, A0 a02) {
        this.f3296a = new ArrayList(Collections.unmodifiableList(new ArrayList(set)));
    }

    public static a a() {
        return new a();
    }

    public final ArrayList b() {
        return this.f3296a;
    }
}
