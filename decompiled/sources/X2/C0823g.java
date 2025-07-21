package X2;

import kotlin.jvm.internal.Intrinsics;
import w2.AbstractC2242b;

/* renamed from: X2.g, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0823g extends AbstractC2242b {

    /* renamed from: c, reason: collision with root package name */
    public static final C0823g f6167c = new C0823g();

    public C0823g() {
        super(12, 13);
    }

    @Override // w2.AbstractC2242b
    public void a(A2.g db) {
        Intrinsics.checkNotNullParameter(db, "db");
        db.n("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        db.n("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
    }
}
