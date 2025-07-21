package I;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: I.w0, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC0460w0 {

    /* renamed from: a, reason: collision with root package name */
    public Set f2571a = new HashSet();

    public void a(List list) {
        this.f2571a.addAll(list);
    }

    public abstract AbstractC0460w0 b();

    public List c() {
        return Collections.unmodifiableList(new ArrayList(this.f2571a));
    }
}
