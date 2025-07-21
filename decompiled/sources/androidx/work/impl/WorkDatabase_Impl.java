package androidx.work.impl;

import A2.g;
import A2.h;
import X2.C;
import X2.D;
import f3.C1289A;
import f3.C1293c;
import f3.InterfaceC1292b;
import f3.e;
import f3.f;
import f3.j;
import f3.k;
import f3.o;
import f3.p;
import f3.r;
import f3.s;
import f3.v;
import f3.z;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import v2.u;
import v2.w;
import x2.AbstractC2268b;
import x2.C2270d;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: q, reason: collision with root package name */
    public volatile v f10269q;

    /* renamed from: r, reason: collision with root package name */
    public volatile InterfaceC1292b f10270r;

    /* renamed from: s, reason: collision with root package name */
    public volatile z f10271s;

    /* renamed from: t, reason: collision with root package name */
    public volatile j f10272t;

    /* renamed from: u, reason: collision with root package name */
    public volatile o f10273u;

    /* renamed from: v, reason: collision with root package name */
    public volatile r f10274v;

    /* renamed from: w, reason: collision with root package name */
    public volatile e f10275w;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a extends w.b {
        public a(int i6) {
            super(i6);
        }

        @Override // v2.w.b
        public void a(g gVar) {
            gVar.n("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.n("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            gVar.n("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            gVar.n("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
            gVar.n("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            gVar.n("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
            gVar.n("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.n("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            gVar.n("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.n("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.n("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            gVar.n("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.n("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            gVar.n("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            gVar.n("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
        }

        @Override // v2.w.b
        public void b(g gVar) {
            gVar.n("DROP TABLE IF EXISTS `Dependency`");
            gVar.n("DROP TABLE IF EXISTS `WorkSpec`");
            gVar.n("DROP TABLE IF EXISTS `WorkTag`");
            gVar.n("DROP TABLE IF EXISTS `SystemIdInfo`");
            gVar.n("DROP TABLE IF EXISTS `WorkName`");
            gVar.n("DROP TABLE IF EXISTS `WorkProgress`");
            gVar.n("DROP TABLE IF EXISTS `Preference`");
            if (WorkDatabase_Impl.this.f19492h != null) {
                int size = WorkDatabase_Impl.this.f19492h.size();
                for (int i6 = 0; i6 < size; i6++) {
                    ((u.b) WorkDatabase_Impl.this.f19492h.get(i6)).b(gVar);
                }
            }
        }

        @Override // v2.w.b
        public void c(g gVar) {
            if (WorkDatabase_Impl.this.f19492h != null) {
                int size = WorkDatabase_Impl.this.f19492h.size();
                for (int i6 = 0; i6 < size; i6++) {
                    ((u.b) WorkDatabase_Impl.this.f19492h.get(i6)).a(gVar);
                }
            }
        }

        @Override // v2.w.b
        public void d(g gVar) {
            WorkDatabase_Impl.this.f19485a = gVar;
            gVar.n("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.u(gVar);
            if (WorkDatabase_Impl.this.f19492h != null) {
                int size = WorkDatabase_Impl.this.f19492h.size();
                for (int i6 = 0; i6 < size; i6++) {
                    ((u.b) WorkDatabase_Impl.this.f19492h.get(i6)).c(gVar);
                }
            }
        }

        @Override // v2.w.b
        public void e(g gVar) {
        }

        @Override // v2.w.b
        public void f(g gVar) {
            AbstractC2268b.a(gVar);
        }

        @Override // v2.w.b
        public w.c g(g gVar) {
            HashMap hashMap = new HashMap(2);
            hashMap.put("work_spec_id", new C2270d.a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap.put("prerequisite_id", new C2270d.a("prerequisite_id", "TEXT", true, 2, null, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new C2270d.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            hashSet.add(new C2270d.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new C2270d.e("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            hashSet2.add(new C2270d.e("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), Arrays.asList("ASC")));
            C2270d c2270d = new C2270d("Dependency", hashMap, hashSet, hashSet2);
            C2270d a6 = C2270d.a(gVar, "Dependency");
            if (!c2270d.equals(a6)) {
                return new w.c(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + c2270d + "\n Found:\n" + a6);
            }
            HashMap hashMap2 = new HashMap(27);
            hashMap2.put("id", new C2270d.a("id", "TEXT", true, 1, null, 1));
            hashMap2.put("state", new C2270d.a("state", "INTEGER", true, 0, null, 1));
            hashMap2.put("worker_class_name", new C2270d.a("worker_class_name", "TEXT", true, 0, null, 1));
            hashMap2.put("input_merger_class_name", new C2270d.a("input_merger_class_name", "TEXT", false, 0, null, 1));
            hashMap2.put("input", new C2270d.a("input", "BLOB", true, 0, null, 1));
            hashMap2.put("output", new C2270d.a("output", "BLOB", true, 0, null, 1));
            hashMap2.put("initial_delay", new C2270d.a("initial_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("interval_duration", new C2270d.a("interval_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("flex_duration", new C2270d.a("flex_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("run_attempt_count", new C2270d.a("run_attempt_count", "INTEGER", true, 0, null, 1));
            hashMap2.put("backoff_policy", new C2270d.a("backoff_policy", "INTEGER", true, 0, null, 1));
            hashMap2.put("backoff_delay_duration", new C2270d.a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("last_enqueue_time", new C2270d.a("last_enqueue_time", "INTEGER", true, 0, null, 1));
            hashMap2.put("minimum_retention_duration", new C2270d.a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("schedule_requested_at", new C2270d.a("schedule_requested_at", "INTEGER", true, 0, null, 1));
            hashMap2.put("run_in_foreground", new C2270d.a("run_in_foreground", "INTEGER", true, 0, null, 1));
            hashMap2.put("out_of_quota_policy", new C2270d.a("out_of_quota_policy", "INTEGER", true, 0, null, 1));
            hashMap2.put("period_count", new C2270d.a("period_count", "INTEGER", true, 0, "0", 1));
            hashMap2.put("generation", new C2270d.a("generation", "INTEGER", true, 0, "0", 1));
            hashMap2.put("required_network_type", new C2270d.a("required_network_type", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_charging", new C2270d.a("requires_charging", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_device_idle", new C2270d.a("requires_device_idle", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_battery_not_low", new C2270d.a("requires_battery_not_low", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_storage_not_low", new C2270d.a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
            hashMap2.put("trigger_content_update_delay", new C2270d.a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("trigger_max_content_delay", new C2270d.a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("content_uri_triggers", new C2270d.a("content_uri_triggers", "BLOB", true, 0, null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new C2270d.e("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), Arrays.asList("ASC")));
            hashSet4.add(new C2270d.e("index_WorkSpec_last_enqueue_time", false, Arrays.asList("last_enqueue_time"), Arrays.asList("ASC")));
            C2270d c2270d2 = new C2270d("WorkSpec", hashMap2, hashSet3, hashSet4);
            C2270d a7 = C2270d.a(gVar, "WorkSpec");
            if (!c2270d2.equals(a7)) {
                return new w.c(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + c2270d2 + "\n Found:\n" + a7);
            }
            HashMap hashMap3 = new HashMap(2);
            hashMap3.put("tag", new C2270d.a("tag", "TEXT", true, 1, null, 1));
            hashMap3.put("work_spec_id", new C2270d.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new C2270d.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new C2270d.e("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            C2270d c2270d3 = new C2270d("WorkTag", hashMap3, hashSet5, hashSet6);
            C2270d a8 = C2270d.a(gVar, "WorkTag");
            if (!c2270d3.equals(a8)) {
                return new w.c(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + c2270d3 + "\n Found:\n" + a8);
            }
            HashMap hashMap4 = new HashMap(3);
            hashMap4.put("work_spec_id", new C2270d.a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap4.put("generation", new C2270d.a("generation", "INTEGER", true, 2, "0", 1));
            hashMap4.put("system_id", new C2270d.a("system_id", "INTEGER", true, 0, null, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new C2270d.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            C2270d c2270d4 = new C2270d("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
            C2270d a9 = C2270d.a(gVar, "SystemIdInfo");
            if (!c2270d4.equals(a9)) {
                return new w.c(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + c2270d4 + "\n Found:\n" + a9);
            }
            HashMap hashMap5 = new HashMap(2);
            hashMap5.put(com.amazon.a.a.h.a.f10906a, new C2270d.a(com.amazon.a.a.h.a.f10906a, "TEXT", true, 1, null, 1));
            hashMap5.put("work_spec_id", new C2270d.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new C2270d.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new C2270d.e("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            C2270d c2270d5 = new C2270d("WorkName", hashMap5, hashSet8, hashSet9);
            C2270d a10 = C2270d.a(gVar, "WorkName");
            if (!c2270d5.equals(a10)) {
                return new w.c(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + c2270d5 + "\n Found:\n" + a10);
            }
            HashMap hashMap6 = new HashMap(2);
            hashMap6.put("work_spec_id", new C2270d.a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap6.put("progress", new C2270d.a("progress", "BLOB", true, 0, null, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new C2270d.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            C2270d c2270d6 = new C2270d("WorkProgress", hashMap6, hashSet10, new HashSet(0));
            C2270d a11 = C2270d.a(gVar, "WorkProgress");
            if (!c2270d6.equals(a11)) {
                return new w.c(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + c2270d6 + "\n Found:\n" + a11);
            }
            HashMap hashMap7 = new HashMap(2);
            hashMap7.put("key", new C2270d.a("key", "TEXT", true, 1, null, 1));
            hashMap7.put("long_value", new C2270d.a("long_value", "INTEGER", false, 0, null, 1));
            C2270d c2270d7 = new C2270d("Preference", hashMap7, new HashSet(0), new HashSet(0));
            C2270d a12 = C2270d.a(gVar, "Preference");
            if (c2270d7.equals(a12)) {
                return new w.c(true, null);
            }
            return new w.c(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + c2270d7 + "\n Found:\n" + a12);
        }
    }

    @Override // androidx.work.impl.WorkDatabase
    public InterfaceC1292b E() {
        InterfaceC1292b interfaceC1292b;
        if (this.f10270r != null) {
            return this.f10270r;
        }
        synchronized (this) {
            try {
                if (this.f10270r == null) {
                    this.f10270r = new C1293c(this);
                }
                interfaceC1292b = this.f10270r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC1292b;
    }

    @Override // androidx.work.impl.WorkDatabase
    public e F() {
        e eVar;
        if (this.f10275w != null) {
            return this.f10275w;
        }
        synchronized (this) {
            try {
                if (this.f10275w == null) {
                    this.f10275w = new f(this);
                }
                eVar = this.f10275w;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public j G() {
        j jVar;
        if (this.f10272t != null) {
            return this.f10272t;
        }
        synchronized (this) {
            try {
                if (this.f10272t == null) {
                    this.f10272t = new k(this);
                }
                jVar = this.f10272t;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public o H() {
        o oVar;
        if (this.f10273u != null) {
            return this.f10273u;
        }
        synchronized (this) {
            try {
                if (this.f10273u == null) {
                    this.f10273u = new p(this);
                }
                oVar = this.f10273u;
            } catch (Throwable th) {
                throw th;
            }
        }
        return oVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public r I() {
        r rVar;
        if (this.f10274v != null) {
            return this.f10274v;
        }
        synchronized (this) {
            try {
                if (this.f10274v == null) {
                    this.f10274v = new s(this);
                }
                rVar = this.f10274v;
            } catch (Throwable th) {
                throw th;
            }
        }
        return rVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public v J() {
        v vVar;
        if (this.f10269q != null) {
            return this.f10269q;
        }
        synchronized (this) {
            try {
                if (this.f10269q == null) {
                    this.f10269q = new f3.w(this);
                }
                vVar = this.f10269q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return vVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public z K() {
        z zVar;
        if (this.f10271s != null) {
            return this.f10271s;
        }
        synchronized (this) {
            try {
                if (this.f10271s == null) {
                    this.f10271s = new C1289A(this);
                }
                zVar = this.f10271s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zVar;
    }

    @Override // v2.u
    public v2.o g() {
        return new v2.o(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // v2.u
    public h h(v2.f fVar) {
        return fVar.f19410c.a(h.b.a(fVar.f19408a).d(fVar.f19409b).c(new w(fVar, new a(16), "5181942b9ebc31ce68dacb56c16fd79f", "ae2044fb577e65ee8bb576ca48a2f06e")).b());
    }

    @Override // v2.u
    public List j(Map map) {
        return Arrays.asList(new C(), new D());
    }

    @Override // v2.u
    public Set o() {
        return new HashSet();
    }

    @Override // v2.u
    public Map p() {
        HashMap hashMap = new HashMap();
        hashMap.put(v.class, f3.w.w());
        hashMap.put(InterfaceC1292b.class, C1293c.e());
        hashMap.put(z.class, C1289A.e());
        hashMap.put(j.class, k.h());
        hashMap.put(o.class, p.c());
        hashMap.put(r.class, s.c());
        hashMap.put(e.class, f.c());
        hashMap.put(f3.g.class, f3.h.a());
        return hashMap;
    }
}
