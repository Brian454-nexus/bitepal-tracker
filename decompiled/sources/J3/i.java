package J3;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface i {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface a {
        a a(String str);

        a b(String str);

        void commit();
    }

    static /* synthetic */ void d(i iVar, e eVar, m mVar, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setIdentity");
        }
        if ((i6 & 2) != 0) {
            mVar = m.f2905b;
        }
        iVar.b(eVar, mVar);
    }

    a a();

    void b(e eVar, m mVar);

    e c();

    void e(h hVar);

    boolean isInitialized();
}
