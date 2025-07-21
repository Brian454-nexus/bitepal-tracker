package x3;

import kotlin.jvm.internal.Intrinsics;
import y3.InterfaceC2355a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f20552a = new l();

    public final boolean a(String clazz, InterfaceC2355a interfaceC2355a) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return b(clazz, interfaceC2355a) != null;
    }

    public final Class b(String str, InterfaceC2355a interfaceC2355a) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e6) {
            if (interfaceC2355a == null) {
                return null;
            }
            interfaceC2355a.b("Class not available:" + str + ": " + e6);
            return null;
        } catch (UnsatisfiedLinkError e7) {
            if (interfaceC2355a == null) {
                return null;
            }
            interfaceC2355a.a("Failed to load (UnsatisfiedLinkError) " + str + ": " + e7);
            return null;
        } catch (Throwable th) {
            if (interfaceC2355a == null) {
                return null;
            }
            interfaceC2355a.a("Failed to initialize " + str + ": " + th);
            return null;
        }
    }
}
