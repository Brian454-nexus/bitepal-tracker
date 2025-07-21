package I;

import I.N;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface O {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a implements O {

        /* renamed from: a, reason: collision with root package name */
        public final N f2326a = new N.a().h();

        @Override // I.O
        public N a() {
            return this.f2326a;
        }

        @Override // I.O
        public int getId() {
            return 0;
        }
    }

    N a();

    int getId();
}
