package n1;

import java.util.Collections;
import java.util.List;
import r1.InterfaceC2021a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class h implements InterfaceC2021a {

    /* renamed from: a, reason: collision with root package name */
    public final String f17558a;

    /* renamed from: b, reason: collision with root package name */
    public final List f17559b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f17560c;

    public h(String str, List list, boolean z6) {
        this.f17558a = str;
        this.f17559b = Collections.unmodifiableList(list);
        this.f17560c = z6;
    }
}
