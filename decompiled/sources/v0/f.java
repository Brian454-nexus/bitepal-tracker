package v0;

import android.content.res.Configuration;
import android.os.LocaleList;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class f {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {
        public static LocaleList a(Configuration configuration) {
            return configuration.getLocales();
        }

        public static void b(Configuration configuration, j jVar) {
            configuration.setLocales((LocaleList) jVar.i());
        }
    }

    public static j a(Configuration configuration) {
        return j.j(a.a(configuration));
    }

    public static void b(Configuration configuration, j jVar) {
        a.b(configuration, jVar);
    }
}
