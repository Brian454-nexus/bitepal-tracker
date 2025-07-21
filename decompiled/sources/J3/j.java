package J3;

import J3.i;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    public final k f2895a;

    /* renamed from: b, reason: collision with root package name */
    public final ReentrantReadWriteLock f2896b;

    /* renamed from: c, reason: collision with root package name */
    public e f2897c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2898d;

    /* renamed from: e, reason: collision with root package name */
    public final Set f2899e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2900f;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a implements i.a {

        /* renamed from: a, reason: collision with root package name */
        public String f2901a;

        /* renamed from: b, reason: collision with root package name */
        public String f2902b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ j f2903c;

        public a(e eVar, j jVar) {
            this.f2903c = jVar;
            this.f2901a = eVar.b();
            this.f2902b = eVar.a();
        }

        @Override // J3.i.a
        public i.a a(String str) {
            this.f2901a = str;
            return this;
        }

        @Override // J3.i.a
        public i.a b(String str) {
            this.f2902b = str;
            return this;
        }

        @Override // J3.i.a
        public void commit() {
            i.d(this.f2903c, new e(this.f2901a, this.f2902b), null, 2, null);
        }
    }

    public j(k identityStorage) {
        Intrinsics.checkNotNullParameter(identityStorage, "identityStorage");
        this.f2895a = identityStorage;
        this.f2896b = new ReentrantReadWriteLock(true);
        this.f2897c = new e(null, null, 3, null);
        this.f2898d = new Object();
        this.f2899e = new LinkedHashSet();
        b(identityStorage.a(), m.f2904a);
    }

    @Override // J3.i
    public i.a a() {
        return new a(c(), this);
    }

    @Override // J3.i
    public void b(e identity, m updateType) {
        Set<h> set;
        Intrinsics.checkNotNullParameter(identity, "identity");
        Intrinsics.checkNotNullParameter(updateType, "updateType");
        e c6 = c();
        ReentrantReadWriteLock reentrantReadWriteLock = this.f2896b;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i6 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i7 = 0; i7 < readHoldCount; i7++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            this.f2897c = identity;
            if (updateType == m.f2904a) {
                this.f2900f = true;
            }
            Unit unit = Unit.INSTANCE;
            while (i6 < readHoldCount) {
                readLock.lock();
                i6++;
            }
            writeLock.unlock();
            if (Intrinsics.areEqual(identity, c6)) {
                return;
            }
            synchronized (this.f2898d) {
                set = CollectionsKt.toSet(this.f2899e);
            }
            if (updateType != m.f2904a) {
                if (!Intrinsics.areEqual(identity.b(), c6.b())) {
                    this.f2895a.c(identity.b());
                }
                if (!Intrinsics.areEqual(identity.a(), c6.a())) {
                    this.f2895a.b(identity.a());
                }
            }
            for (h hVar : set) {
                if (!Intrinsics.areEqual(identity.b(), c6.b())) {
                    hVar.b(identity.b());
                }
                if (!Intrinsics.areEqual(identity.a(), c6.a())) {
                    hVar.a(identity.a());
                }
                hVar.c(identity, updateType);
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

    @Override // J3.i
    public e c() {
        ReentrantReadWriteLock.ReadLock readLock = this.f2896b.readLock();
        readLock.lock();
        try {
            return this.f2897c;
        } finally {
            readLock.unlock();
        }
    }

    @Override // J3.i
    public void e(h listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.f2898d) {
            this.f2899e.add(listener);
        }
    }

    @Override // J3.i
    public boolean isInitialized() {
        return this.f2900f;
    }
}
