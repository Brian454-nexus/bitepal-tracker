package n3;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n3.InterfaceC1826f;

/* renamed from: n3.g, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1827g implements InterfaceC1826f {

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f17753a = new ReentrantReadWriteLock(true);

    /* renamed from: b, reason: collision with root package name */
    public C1825e f17754b = new C1825e(null, null, null, 7, null);

    /* renamed from: c, reason: collision with root package name */
    public final Object f17755c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final Set f17756d = new LinkedHashSet();

    /* renamed from: n3.g$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a implements InterfaceC1826f.a {

        /* renamed from: a, reason: collision with root package name */
        public String f17757a;

        /* renamed from: b, reason: collision with root package name */
        public String f17758b;

        /* renamed from: c, reason: collision with root package name */
        public Map f17759c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ C1825e f17760d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ C1827g f17761e;

        public a(C1825e c1825e, C1827g c1827g) {
            this.f17760d = c1825e;
            this.f17761e = c1827g;
            this.f17757a = c1825e.b();
            this.f17758b = c1825e.a();
            this.f17759c = c1825e.c();
        }

        @Override // n3.InterfaceC1826f.a
        public InterfaceC1826f.a a(String str) {
            this.f17757a = str;
            return this;
        }

        @Override // n3.InterfaceC1826f.a
        public InterfaceC1826f.a b(String str) {
            this.f17758b = str;
            return this;
        }

        @Override // n3.InterfaceC1826f.a
        public InterfaceC1826f.a c(Map actions) {
            Intrinsics.checkNotNullParameter(actions, "actions");
            Map mutableMap = MapsKt.toMutableMap(this.f17759c);
            for (Map.Entry entry : actions.entrySet()) {
                String str = (String) entry.getKey();
                Map map = (Map) entry.getValue();
                int hashCode = str.hashCode();
                if (hashCode != 1186238) {
                    if (hashCode != 146417720) {
                        if (hashCode == 1142092165 && str.equals("$unset")) {
                            Iterator it = map.entrySet().iterator();
                            while (it.hasNext()) {
                                mutableMap.remove(((Map.Entry) it.next()).getKey());
                            }
                        }
                    } else if (str.equals("$clearAll")) {
                        mutableMap.clear();
                    }
                } else if (str.equals("$set")) {
                    mutableMap.putAll(map);
                }
            }
            this.f17759c = mutableMap;
            return this;
        }

        @Override // n3.InterfaceC1826f.a
        public void commit() {
            this.f17761e.b(new C1825e(this.f17757a, this.f17758b, this.f17759c));
        }
    }

    @Override // n3.InterfaceC1826f
    public InterfaceC1826f.a a() {
        return new a(c(), this);
    }

    /* JADX WARN: Finally extract failed */
    @Override // n3.InterfaceC1826f
    public void b(C1825e identity) {
        Set set;
        Intrinsics.checkNotNullParameter(identity, "identity");
        C1825e c6 = c();
        ReentrantReadWriteLock reentrantReadWriteLock = this.f17753a;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i6 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i7 = 0; i7 < readHoldCount; i7++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            this.f17754b = identity;
            Unit unit = Unit.INSTANCE;
            while (i6 < readHoldCount) {
                readLock.lock();
                i6++;
            }
            writeLock.unlock();
            if (Intrinsics.areEqual(identity, c6)) {
                return;
            }
            synchronized (this.f17755c) {
                set = CollectionsKt.toSet(this.f17756d);
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((Function1) it.next()).invoke(identity);
            }
        } catch (Throwable th) {
            while (i6 < readHoldCount) {
                readLock.lock();
                i6++;
            }
            writeLock.unlock();
            throw th;
        }
    }

    public C1825e c() {
        ReentrantReadWriteLock.ReadLock readLock = this.f17753a.readLock();
        readLock.lock();
        try {
            return this.f17754b;
        } finally {
            readLock.unlock();
        }
    }
}
