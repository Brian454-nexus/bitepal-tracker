package z0;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: z0.o, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C2429o {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f21461a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f21462b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final Map f21463c = new HashMap();

    public C2429o(Runnable runnable) {
        this.f21461a = runnable;
    }

    public void a(InterfaceC2431q interfaceC2431q) {
        this.f21462b.add(interfaceC2431q);
        this.f21461a.run();
    }

    public void b(Menu menu, MenuInflater menuInflater) {
        Iterator it = this.f21462b.iterator();
        while (it.hasNext()) {
            ((InterfaceC2431q) it.next()).c(menu, menuInflater);
        }
    }

    public void c(Menu menu) {
        Iterator it = this.f21462b.iterator();
        while (it.hasNext()) {
            ((InterfaceC2431q) it.next()).b(menu);
        }
    }

    public boolean d(MenuItem menuItem) {
        Iterator it = this.f21462b.iterator();
        while (it.hasNext()) {
            if (((InterfaceC2431q) it.next()).a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void e(Menu menu) {
        Iterator it = this.f21462b.iterator();
        while (it.hasNext()) {
            ((InterfaceC2431q) it.next()).d(menu);
        }
    }

    public void f(InterfaceC2431q interfaceC2431q) {
        this.f21462b.remove(interfaceC2431q);
        android.support.v4.media.session.b.a(this.f21463c.remove(interfaceC2431q));
        this.f21461a.run();
    }
}
