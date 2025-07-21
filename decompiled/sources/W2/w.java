package W2;

import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class w {

    /* renamed from: d, reason: collision with root package name */
    public static final b f5604d = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final UUID f5605a;

    /* renamed from: b, reason: collision with root package name */
    public final f3.u f5606b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f5607c;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        public final Class f5608a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f5609b;

        /* renamed from: c, reason: collision with root package name */
        public UUID f5610c;

        /* renamed from: d, reason: collision with root package name */
        public f3.u f5611d;

        /* renamed from: e, reason: collision with root package name */
        public final Set f5612e;

        public a(Class workerClass) {
            Intrinsics.checkNotNullParameter(workerClass, "workerClass");
            this.f5608a = workerClass;
            UUID randomUUID = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(randomUUID, "randomUUID()");
            this.f5610c = randomUUID;
            String uuid = this.f5610c.toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "id.toString()");
            String name = workerClass.getName();
            Intrinsics.checkNotNullExpressionValue(name, "workerClass.name");
            this.f5611d = new f3.u(uuid, name);
            String name2 = workerClass.getName();
            Intrinsics.checkNotNullExpressionValue(name2, "workerClass.name");
            this.f5612e = SetsKt.mutableSetOf(new String[]{name2});
        }

        public final a a(String tag) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            this.f5612e.add(tag);
            return g();
        }

        public final w b() {
            w c6 = c();
            W2.b bVar = this.f5611d.f14126j;
            boolean z6 = bVar.e() || bVar.f() || bVar.g() || bVar.h();
            f3.u uVar = this.f5611d;
            if (uVar.f14133q) {
                if (z6) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
                }
                if (uVar.f14123g > 0) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed");
                }
            }
            UUID randomUUID = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(randomUUID, "randomUUID()");
            j(randomUUID);
            return c6;
        }

        public abstract w c();

        public final boolean d() {
            return this.f5609b;
        }

        public final UUID e() {
            return this.f5610c;
        }

        public final Set f() {
            return this.f5612e;
        }

        public abstract a g();

        public final f3.u h() {
            return this.f5611d;
        }

        public final a i(W2.b constraints) {
            Intrinsics.checkNotNullParameter(constraints, "constraints");
            this.f5611d.f14126j = constraints;
            return g();
        }

        public final a j(UUID id) {
            Intrinsics.checkNotNullParameter(id, "id");
            this.f5610c = id;
            String uuid = id.toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "id.toString()");
            this.f5611d = new f3.u(uuid, this.f5611d);
            return g();
        }

        public a k(long j6, TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            this.f5611d.f14123g = timeUnit.toMillis(j6);
            if (LongCompanionObject.MAX_VALUE - System.currentTimeMillis() > this.f5611d.f14123g) {
                return g();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    public w(UUID id, f3.u workSpec, Set tags) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.f5605a = id;
        this.f5606b = workSpec;
        this.f5607c = tags;
    }

    public UUID a() {
        return this.f5605a;
    }

    public final String b() {
        String uuid = a().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "id.toString()");
        return uuid;
    }

    public final Set c() {
        return this.f5607c;
    }

    public final f3.u d() {
        return this.f5606b;
    }
}
