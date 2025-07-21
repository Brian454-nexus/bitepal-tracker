package r1;

import A1.n;
import android.net.Uri;
import java.io.InputStream;
import java.util.List;

/* renamed from: r1.b, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C2022b implements n.a {

    /* renamed from: a, reason: collision with root package name */
    public final n.a f18696a;

    /* renamed from: b, reason: collision with root package name */
    public final List f18697b;

    public C2022b(n.a aVar, List list) {
        this.f18696a = aVar;
        this.f18697b = list;
    }

    @Override // A1.n.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC2021a a(Uri uri, InputStream inputStream) {
        InterfaceC2021a interfaceC2021a = (InterfaceC2021a) this.f18696a.a(uri, inputStream);
        List list = this.f18697b;
        return (list == null || list.isEmpty()) ? interfaceC2021a : (InterfaceC2021a) interfaceC2021a.a(this.f18697b);
    }
}
