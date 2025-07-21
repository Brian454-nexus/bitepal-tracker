package androidx.datastore.preferences.protobuf;

import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class k0 extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final List f8796a;

    public k0(O o6) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f8796a = null;
    }

    public C1048z a() {
        return new C1048z(getMessage());
    }
}
