package androidx.work;

import W2.g;
import W2.q;
import W2.x;
import android.net.Network;
import i3.InterfaceC1511b;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class WorkerParameters {

    /* renamed from: a, reason: collision with root package name */
    public UUID f10216a;

    /* renamed from: b, reason: collision with root package name */
    public b f10217b;

    /* renamed from: c, reason: collision with root package name */
    public Set f10218c;

    /* renamed from: d, reason: collision with root package name */
    public a f10219d;

    /* renamed from: e, reason: collision with root package name */
    public int f10220e;

    /* renamed from: f, reason: collision with root package name */
    public Executor f10221f;

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC1511b f10222g;

    /* renamed from: h, reason: collision with root package name */
    public x f10223h;

    /* renamed from: i, reason: collision with root package name */
    public q f10224i;

    /* renamed from: j, reason: collision with root package name */
    public g f10225j;

    /* renamed from: k, reason: collision with root package name */
    public int f10226k;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public List f10227a;

        /* renamed from: b, reason: collision with root package name */
        public List f10228b;

        /* renamed from: c, reason: collision with root package name */
        public Network f10229c;

        public a() {
            List list = Collections.EMPTY_LIST;
            this.f10227a = list;
            this.f10228b = list;
        }
    }

    public WorkerParameters(UUID uuid, b bVar, Collection collection, a aVar, int i6, int i7, Executor executor, InterfaceC1511b interfaceC1511b, x xVar, q qVar, g gVar) {
        this.f10216a = uuid;
        this.f10217b = bVar;
        this.f10218c = new HashSet(collection);
        this.f10219d = aVar;
        this.f10220e = i6;
        this.f10226k = i7;
        this.f10221f = executor;
        this.f10222g = interfaceC1511b;
        this.f10223h = xVar;
        this.f10224i = qVar;
        this.f10225j = gVar;
    }

    public Executor a() {
        return this.f10221f;
    }

    public g b() {
        return this.f10225j;
    }

    public UUID c() {
        return this.f10216a;
    }

    public b d() {
        return this.f10217b;
    }

    public InterfaceC1511b e() {
        return this.f10222g;
    }

    public x f() {
        return this.f10223h;
    }
}
