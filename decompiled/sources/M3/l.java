package M3;

import G9.j;
import M3.a;
import M3.p;
import M3.v;
import android.content.Context;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class l implements j.c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3415a;

    /* renamed from: b, reason: collision with root package name */
    public final a f3416b;

    /* renamed from: c, reason: collision with root package name */
    public final p f3417c;

    /* renamed from: d, reason: collision with root package name */
    public final v f3418d;

    public l(Context context, a aVar, p pVar, v vVar) {
        this.f3415a = context;
        this.f3416b = aVar;
        this.f3417c = pVar;
        this.f3418d = vVar;
    }

    public void onMethodCall(G9.i iVar, final j.d dVar) {
        String str = iVar.a;
        str.getClass();
        char c6 = 65535;
        switch (str.hashCode()) {
            case -1544053025:
                if (str.equals("checkServiceStatus")) {
                    c6 = 0;
                    break;
                }
                break;
            case -1017315255:
                if (str.equals("shouldShowRequestPermissionRationale")) {
                    c6 = 1;
                    break;
                }
                break;
            case -576207927:
                if (str.equals("checkPermissionStatus")) {
                    c6 = 2;
                    break;
                }
                break;
            case 347240634:
                if (str.equals("openAppSettings")) {
                    c6 = 3;
                    break;
                }
                break;
            case 1669188213:
                if (str.equals("requestPermissions")) {
                    c6 = 4;
                    break;
                }
                break;
        }
        switch (c6) {
            case 0:
                int parseInt = Integer.parseInt(iVar.b.toString());
                v vVar = this.f3418d;
                Context context = this.f3415a;
                Objects.requireNonNull(dVar);
                vVar.a(parseInt, context, new v.a() { // from class: M3.c
                    @Override // M3.v.a
                    public final void a(int i6) {
                        dVar.a(Integer.valueOf(i6));
                    }
                }, new b() { // from class: M3.d
                    @Override // M3.b
                    public final void a(String str2, String str3) {
                        dVar.b(str2, str3, (Object) null);
                    }
                });
                return;
            case 1:
                int parseInt2 = Integer.parseInt(iVar.b.toString());
                p pVar = this.f3417c;
                Objects.requireNonNull(dVar);
                pVar.i(parseInt2, new p.c() { // from class: M3.h
                    @Override // M3.p.c
                    public final void a(boolean z6) {
                        dVar.a(Boolean.valueOf(z6));
                    }
                }, new b() { // from class: M3.i
                    @Override // M3.b
                    public final void a(String str2, String str3) {
                        dVar.b(str2, str3, (Object) null);
                    }
                });
                return;
            case 2:
                int parseInt3 = Integer.parseInt(iVar.b.toString());
                p pVar2 = this.f3417c;
                Objects.requireNonNull(dVar);
                pVar2.c(parseInt3, new p.a() { // from class: M3.e
                    @Override // M3.p.a
                    public final void a(int i6) {
                        dVar.a(Integer.valueOf(i6));
                    }
                });
                return;
            case 3:
                a aVar = this.f3416b;
                Context context2 = this.f3415a;
                Objects.requireNonNull(dVar);
                aVar.a(context2, new a.InterfaceC0060a() { // from class: M3.j
                    @Override // M3.a.InterfaceC0060a
                    public final void a(boolean z6) {
                        dVar.a(Boolean.valueOf(z6));
                    }
                }, new b() { // from class: M3.k
                    @Override // M3.b
                    public final void a(String str2, String str3) {
                        dVar.b(str2, str3, (Object) null);
                    }
                });
                return;
            case 4:
                List list = (List) iVar.b();
                p pVar3 = this.f3417c;
                Objects.requireNonNull(dVar);
                pVar3.g(list, new p.b() { // from class: M3.f
                    @Override // M3.p.b
                    public final void a(Map map) {
                        dVar.a(map);
                    }
                }, new b() { // from class: M3.g
                    @Override // M3.b
                    public final void a(String str2, String str3) {
                        dVar.b(str2, str3, (Object) null);
                    }
                });
                return;
            default:
                dVar.c();
                return;
        }
    }
}
