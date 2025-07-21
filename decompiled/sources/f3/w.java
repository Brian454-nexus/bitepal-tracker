package f3;

import android.database.Cursor;
import f3.u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import v2.AbstractC2162A;
import x2.AbstractC2267a;
import x2.AbstractC2268b;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class w implements v {

    /* renamed from: a, reason: collision with root package name */
    public final v2.u f14139a;

    /* renamed from: b, reason: collision with root package name */
    public final v2.i f14140b;

    /* renamed from: c, reason: collision with root package name */
    public final v2.h f14141c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC2162A f14142d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC2162A f14143e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC2162A f14144f;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC2162A f14145g;

    /* renamed from: h, reason: collision with root package name */
    public final AbstractC2162A f14146h;

    /* renamed from: i, reason: collision with root package name */
    public final AbstractC2162A f14147i;

    /* renamed from: j, reason: collision with root package name */
    public final AbstractC2162A f14148j;

    /* renamed from: k, reason: collision with root package name */
    public final AbstractC2162A f14149k;

    /* renamed from: l, reason: collision with root package name */
    public final AbstractC2162A f14150l;

    /* renamed from: m, reason: collision with root package name */
    public final AbstractC2162A f14151m;

    /* renamed from: n, reason: collision with root package name */
    public final AbstractC2162A f14152n;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a extends AbstractC2162A {
        public a(v2.u uVar) {
            super(uVar);
        }

        @Override // v2.AbstractC2162A
        public String e() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class b extends AbstractC2162A {
        public b(v2.u uVar) {
            super(uVar);
        }

        @Override // v2.AbstractC2162A
        public String e() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class c extends AbstractC2162A {
        public c(v2.u uVar) {
            super(uVar);
        }

        @Override // v2.AbstractC2162A
        public String e() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class d extends AbstractC2162A {
        public d(v2.u uVar) {
            super(uVar);
        }

        @Override // v2.AbstractC2162A
        public String e() {
            return "UPDATE workspec SET generation=generation+1 WHERE id=?";
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class e extends v2.i {
        public e(v2.u uVar) {
            super(uVar);
        }

        @Override // v2.AbstractC2162A
        public String e() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // v2.i
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(A2.k kVar, u uVar) {
            String str = uVar.f14117a;
            if (str == null) {
                kVar.Q(1);
            } else {
                kVar.b(1, str);
            }
            C1290B c1290b = C1290B.f14075a;
            kVar.A(2, C1290B.j(uVar.f14118b));
            String str2 = uVar.f14119c;
            if (str2 == null) {
                kVar.Q(3);
            } else {
                kVar.b(3, str2);
            }
            String str3 = uVar.f14120d;
            if (str3 == null) {
                kVar.Q(4);
            } else {
                kVar.b(4, str3);
            }
            byte[] k6 = androidx.work.b.k(uVar.f14121e);
            if (k6 == null) {
                kVar.Q(5);
            } else {
                kVar.H(5, k6);
            }
            byte[] k7 = androidx.work.b.k(uVar.f14122f);
            if (k7 == null) {
                kVar.Q(6);
            } else {
                kVar.H(6, k7);
            }
            kVar.A(7, uVar.f14123g);
            kVar.A(8, uVar.f14124h);
            kVar.A(9, uVar.f14125i);
            kVar.A(10, uVar.f14127k);
            kVar.A(11, C1290B.a(uVar.f14128l));
            kVar.A(12, uVar.f14129m);
            kVar.A(13, uVar.f14130n);
            kVar.A(14, uVar.f14131o);
            kVar.A(15, uVar.f14132p);
            kVar.A(16, uVar.f14133q ? 1L : 0L);
            kVar.A(17, C1290B.h(uVar.f14134r));
            kVar.A(18, uVar.g());
            kVar.A(19, uVar.f());
            W2.b bVar = uVar.f14126j;
            if (bVar == null) {
                kVar.Q(20);
                kVar.Q(21);
                kVar.Q(22);
                kVar.Q(23);
                kVar.Q(24);
                kVar.Q(25);
                kVar.Q(26);
                kVar.Q(27);
                return;
            }
            kVar.A(20, C1290B.g(bVar.d()));
            kVar.A(21, bVar.g() ? 1L : 0L);
            kVar.A(22, bVar.h() ? 1L : 0L);
            kVar.A(23, bVar.f() ? 1L : 0L);
            kVar.A(24, bVar.i() ? 1L : 0L);
            kVar.A(25, bVar.b());
            kVar.A(26, bVar.a());
            byte[] i6 = C1290B.i(bVar.c());
            if (i6 == null) {
                kVar.Q(27);
            } else {
                kVar.H(27, i6);
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class f extends v2.h {
        public f(v2.u uVar) {
            super(uVar);
        }

        @Override // v2.AbstractC2162A
        public String e() {
            return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`required_network_type` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
        }

        @Override // v2.h
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(A2.k kVar, u uVar) {
            String str = uVar.f14117a;
            if (str == null) {
                kVar.Q(1);
            } else {
                kVar.b(1, str);
            }
            C1290B c1290b = C1290B.f14075a;
            kVar.A(2, C1290B.j(uVar.f14118b));
            String str2 = uVar.f14119c;
            if (str2 == null) {
                kVar.Q(3);
            } else {
                kVar.b(3, str2);
            }
            String str3 = uVar.f14120d;
            if (str3 == null) {
                kVar.Q(4);
            } else {
                kVar.b(4, str3);
            }
            byte[] k6 = androidx.work.b.k(uVar.f14121e);
            if (k6 == null) {
                kVar.Q(5);
            } else {
                kVar.H(5, k6);
            }
            byte[] k7 = androidx.work.b.k(uVar.f14122f);
            if (k7 == null) {
                kVar.Q(6);
            } else {
                kVar.H(6, k7);
            }
            kVar.A(7, uVar.f14123g);
            kVar.A(8, uVar.f14124h);
            kVar.A(9, uVar.f14125i);
            kVar.A(10, uVar.f14127k);
            kVar.A(11, C1290B.a(uVar.f14128l));
            kVar.A(12, uVar.f14129m);
            kVar.A(13, uVar.f14130n);
            kVar.A(14, uVar.f14131o);
            kVar.A(15, uVar.f14132p);
            kVar.A(16, uVar.f14133q ? 1L : 0L);
            kVar.A(17, C1290B.h(uVar.f14134r));
            kVar.A(18, uVar.g());
            kVar.A(19, uVar.f());
            W2.b bVar = uVar.f14126j;
            if (bVar != null) {
                kVar.A(20, C1290B.g(bVar.d()));
                kVar.A(21, bVar.g() ? 1L : 0L);
                kVar.A(22, bVar.h() ? 1L : 0L);
                kVar.A(23, bVar.f() ? 1L : 0L);
                kVar.A(24, bVar.i() ? 1L : 0L);
                kVar.A(25, bVar.b());
                kVar.A(26, bVar.a());
                byte[] i6 = C1290B.i(bVar.c());
                if (i6 == null) {
                    kVar.Q(27);
                } else {
                    kVar.H(27, i6);
                }
            } else {
                kVar.Q(20);
                kVar.Q(21);
                kVar.Q(22);
                kVar.Q(23);
                kVar.Q(24);
                kVar.Q(25);
                kVar.Q(26);
                kVar.Q(27);
            }
            String str4 = uVar.f14117a;
            if (str4 == null) {
                kVar.Q(28);
            } else {
                kVar.b(28, str4);
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class g extends AbstractC2162A {
        public g(v2.u uVar) {
            super(uVar);
        }

        @Override // v2.AbstractC2162A
        public String e() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class h extends AbstractC2162A {
        public h(v2.u uVar) {
            super(uVar);
        }

        @Override // v2.AbstractC2162A
        public String e() {
            return "UPDATE workspec SET state=? WHERE id=?";
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class i extends AbstractC2162A {
        public i(v2.u uVar) {
            super(uVar);
        }

        @Override // v2.AbstractC2162A
        public String e() {
            return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class j extends AbstractC2162A {
        public j(v2.u uVar) {
            super(uVar);
        }

        @Override // v2.AbstractC2162A
        public String e() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class k extends AbstractC2162A {
        public k(v2.u uVar) {
            super(uVar);
        }

        @Override // v2.AbstractC2162A
        public String e() {
            return "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class l extends AbstractC2162A {
        public l(v2.u uVar) {
            super(uVar);
        }

        @Override // v2.AbstractC2162A
        public String e() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class m extends AbstractC2162A {
        public m(v2.u uVar) {
            super(uVar);
        }

        @Override // v2.AbstractC2162A
        public String e() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    public w(v2.u uVar) {
        this.f14139a = uVar;
        this.f14140b = new e(uVar);
        this.f14141c = new f(uVar);
        this.f14142d = new g(uVar);
        this.f14143e = new h(uVar);
        this.f14144f = new i(uVar);
        this.f14145g = new j(uVar);
        this.f14146h = new k(uVar);
        this.f14147i = new l(uVar);
        this.f14148j = new m(uVar);
        this.f14149k = new a(uVar);
        this.f14150l = new b(uVar);
        this.f14151m = new c(uVar);
        this.f14152n = new d(uVar);
    }

    public static List w() {
        return Collections.EMPTY_LIST;
    }

    @Override // f3.v
    public void a(String str) {
        this.f14139a.d();
        A2.k b6 = this.f14142d.b();
        if (str == null) {
            b6.Q(1);
        } else {
            b6.b(1, str);
        }
        this.f14139a.e();
        try {
            b6.p();
            this.f14139a.B();
        } finally {
            this.f14139a.i();
            this.f14142d.h(b6);
        }
    }

    @Override // f3.v
    public void b(String str) {
        this.f14139a.d();
        A2.k b6 = this.f14144f.b();
        if (str == null) {
            b6.Q(1);
        } else {
            b6.b(1, str);
        }
        this.f14139a.e();
        try {
            b6.p();
            this.f14139a.B();
        } finally {
            this.f14139a.i();
            this.f14144f.h(b6);
        }
    }

    @Override // f3.v
    public int c(String str, long j6) {
        this.f14139a.d();
        A2.k b6 = this.f14149k.b();
        b6.A(1, j6);
        if (str == null) {
            b6.Q(2);
        } else {
            b6.b(2, str);
        }
        this.f14139a.e();
        try {
            int p6 = b6.p();
            this.f14139a.B();
            return p6;
        } finally {
            this.f14139a.i();
            this.f14149k.h(b6);
        }
    }

    @Override // f3.v
    public List d(String str) {
        v2.x D6 = v2.x.D("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            D6.Q(1);
        } else {
            D6.b(1, str);
        }
        this.f14139a.d();
        Cursor b6 = AbstractC2268b.b(this.f14139a, D6, false, null);
        try {
            ArrayList arrayList = new ArrayList(b6.getCount());
            while (b6.moveToNext()) {
                arrayList.add(new u.b(b6.isNull(0) ? null : b6.getString(0), C1290B.f(b6.getInt(1))));
            }
            return arrayList;
        } finally {
            b6.close();
            D6.R();
        }
    }

    @Override // f3.v
    public List e(long j6) {
        v2.x xVar;
        v2.x D6 = v2.x.D("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC", 1);
        D6.A(1, j6);
        this.f14139a.d();
        Cursor b6 = AbstractC2268b.b(this.f14139a, D6, false, null);
        try {
            int d6 = AbstractC2267a.d(b6, "id");
            int d7 = AbstractC2267a.d(b6, "state");
            int d8 = AbstractC2267a.d(b6, "worker_class_name");
            int d9 = AbstractC2267a.d(b6, "input_merger_class_name");
            int d10 = AbstractC2267a.d(b6, "input");
            int d11 = AbstractC2267a.d(b6, "output");
            int d12 = AbstractC2267a.d(b6, "initial_delay");
            int d13 = AbstractC2267a.d(b6, "interval_duration");
            int d14 = AbstractC2267a.d(b6, "flex_duration");
            int d15 = AbstractC2267a.d(b6, "run_attempt_count");
            int d16 = AbstractC2267a.d(b6, "backoff_policy");
            int d17 = AbstractC2267a.d(b6, "backoff_delay_duration");
            int d18 = AbstractC2267a.d(b6, "last_enqueue_time");
            int d19 = AbstractC2267a.d(b6, "minimum_retention_duration");
            xVar = D6;
            try {
                int d20 = AbstractC2267a.d(b6, "schedule_requested_at");
                int d21 = AbstractC2267a.d(b6, "run_in_foreground");
                int d22 = AbstractC2267a.d(b6, "out_of_quota_policy");
                int d23 = AbstractC2267a.d(b6, "period_count");
                int d24 = AbstractC2267a.d(b6, "generation");
                int d25 = AbstractC2267a.d(b6, "required_network_type");
                int d26 = AbstractC2267a.d(b6, "requires_charging");
                int d27 = AbstractC2267a.d(b6, "requires_device_idle");
                int d28 = AbstractC2267a.d(b6, "requires_battery_not_low");
                int d29 = AbstractC2267a.d(b6, "requires_storage_not_low");
                int d30 = AbstractC2267a.d(b6, "trigger_content_update_delay");
                int d31 = AbstractC2267a.d(b6, "trigger_max_content_delay");
                int d32 = AbstractC2267a.d(b6, "content_uri_triggers");
                int i6 = d19;
                ArrayList arrayList = new ArrayList(b6.getCount());
                while (b6.moveToNext()) {
                    String string = b6.isNull(d6) ? null : b6.getString(d6);
                    W2.u f6 = C1290B.f(b6.getInt(d7));
                    String string2 = b6.isNull(d8) ? null : b6.getString(d8);
                    String string3 = b6.isNull(d9) ? null : b6.getString(d9);
                    androidx.work.b g6 = androidx.work.b.g(b6.isNull(d10) ? null : b6.getBlob(d10));
                    androidx.work.b g7 = androidx.work.b.g(b6.isNull(d11) ? null : b6.getBlob(d11));
                    long j7 = b6.getLong(d12);
                    long j8 = b6.getLong(d13);
                    long j9 = b6.getLong(d14);
                    int i7 = b6.getInt(d15);
                    W2.a c6 = C1290B.c(b6.getInt(d16));
                    long j10 = b6.getLong(d17);
                    long j11 = b6.getLong(d18);
                    int i8 = i6;
                    long j12 = b6.getLong(i8);
                    int i9 = d6;
                    int i10 = d20;
                    long j13 = b6.getLong(i10);
                    d20 = i10;
                    int i11 = d21;
                    boolean z6 = b6.getInt(i11) != 0;
                    d21 = i11;
                    int i12 = d22;
                    W2.o e6 = C1290B.e(b6.getInt(i12));
                    d22 = i12;
                    int i13 = d23;
                    int i14 = b6.getInt(i13);
                    d23 = i13;
                    int i15 = d24;
                    int i16 = b6.getInt(i15);
                    d24 = i15;
                    int i17 = d25;
                    W2.l d33 = C1290B.d(b6.getInt(i17));
                    d25 = i17;
                    int i18 = d26;
                    boolean z7 = b6.getInt(i18) != 0;
                    d26 = i18;
                    int i19 = d27;
                    boolean z8 = b6.getInt(i19) != 0;
                    d27 = i19;
                    int i20 = d28;
                    boolean z9 = b6.getInt(i20) != 0;
                    d28 = i20;
                    int i21 = d29;
                    boolean z10 = b6.getInt(i21) != 0;
                    d29 = i21;
                    int i22 = d30;
                    long j14 = b6.getLong(i22);
                    d30 = i22;
                    int i23 = d31;
                    long j15 = b6.getLong(i23);
                    d31 = i23;
                    int i24 = d32;
                    d32 = i24;
                    arrayList.add(new u(string, f6, string2, string3, g6, g7, j7, j8, j9, new W2.b(d33, z7, z8, z9, z10, j14, j15, C1290B.b(b6.isNull(i24) ? null : b6.getBlob(i24))), i7, c6, j10, j11, j12, j13, z6, e6, i14, i16));
                    d6 = i9;
                    i6 = i8;
                }
                b6.close();
                xVar.R();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b6.close();
                xVar.R();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            xVar = D6;
        }
    }

    @Override // f3.v
    public List f(int i6) {
        v2.x xVar;
        v2.x D6 = v2.x.D("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        D6.A(1, i6);
        this.f14139a.d();
        Cursor b6 = AbstractC2268b.b(this.f14139a, D6, false, null);
        try {
            int d6 = AbstractC2267a.d(b6, "id");
            int d7 = AbstractC2267a.d(b6, "state");
            int d8 = AbstractC2267a.d(b6, "worker_class_name");
            int d9 = AbstractC2267a.d(b6, "input_merger_class_name");
            int d10 = AbstractC2267a.d(b6, "input");
            int d11 = AbstractC2267a.d(b6, "output");
            int d12 = AbstractC2267a.d(b6, "initial_delay");
            int d13 = AbstractC2267a.d(b6, "interval_duration");
            int d14 = AbstractC2267a.d(b6, "flex_duration");
            int d15 = AbstractC2267a.d(b6, "run_attempt_count");
            int d16 = AbstractC2267a.d(b6, "backoff_policy");
            int d17 = AbstractC2267a.d(b6, "backoff_delay_duration");
            int d18 = AbstractC2267a.d(b6, "last_enqueue_time");
            int d19 = AbstractC2267a.d(b6, "minimum_retention_duration");
            xVar = D6;
            try {
                int d20 = AbstractC2267a.d(b6, "schedule_requested_at");
                int d21 = AbstractC2267a.d(b6, "run_in_foreground");
                int d22 = AbstractC2267a.d(b6, "out_of_quota_policy");
                int d23 = AbstractC2267a.d(b6, "period_count");
                int d24 = AbstractC2267a.d(b6, "generation");
                int d25 = AbstractC2267a.d(b6, "required_network_type");
                int d26 = AbstractC2267a.d(b6, "requires_charging");
                int d27 = AbstractC2267a.d(b6, "requires_device_idle");
                int d28 = AbstractC2267a.d(b6, "requires_battery_not_low");
                int d29 = AbstractC2267a.d(b6, "requires_storage_not_low");
                int d30 = AbstractC2267a.d(b6, "trigger_content_update_delay");
                int d31 = AbstractC2267a.d(b6, "trigger_max_content_delay");
                int d32 = AbstractC2267a.d(b6, "content_uri_triggers");
                int i7 = d19;
                ArrayList arrayList = new ArrayList(b6.getCount());
                while (b6.moveToNext()) {
                    String string = b6.isNull(d6) ? null : b6.getString(d6);
                    W2.u f6 = C1290B.f(b6.getInt(d7));
                    String string2 = b6.isNull(d8) ? null : b6.getString(d8);
                    String string3 = b6.isNull(d9) ? null : b6.getString(d9);
                    androidx.work.b g6 = androidx.work.b.g(b6.isNull(d10) ? null : b6.getBlob(d10));
                    androidx.work.b g7 = androidx.work.b.g(b6.isNull(d11) ? null : b6.getBlob(d11));
                    long j6 = b6.getLong(d12);
                    long j7 = b6.getLong(d13);
                    long j8 = b6.getLong(d14);
                    int i8 = b6.getInt(d15);
                    W2.a c6 = C1290B.c(b6.getInt(d16));
                    long j9 = b6.getLong(d17);
                    long j10 = b6.getLong(d18);
                    int i9 = i7;
                    long j11 = b6.getLong(i9);
                    int i10 = d6;
                    int i11 = d20;
                    long j12 = b6.getLong(i11);
                    d20 = i11;
                    int i12 = d21;
                    boolean z6 = b6.getInt(i12) != 0;
                    d21 = i12;
                    int i13 = d22;
                    W2.o e6 = C1290B.e(b6.getInt(i13));
                    d22 = i13;
                    int i14 = d23;
                    int i15 = b6.getInt(i14);
                    d23 = i14;
                    int i16 = d24;
                    int i17 = b6.getInt(i16);
                    d24 = i16;
                    int i18 = d25;
                    W2.l d33 = C1290B.d(b6.getInt(i18));
                    d25 = i18;
                    int i19 = d26;
                    boolean z7 = b6.getInt(i19) != 0;
                    d26 = i19;
                    int i20 = d27;
                    boolean z8 = b6.getInt(i20) != 0;
                    d27 = i20;
                    int i21 = d28;
                    boolean z9 = b6.getInt(i21) != 0;
                    d28 = i21;
                    int i22 = d29;
                    boolean z10 = b6.getInt(i22) != 0;
                    d29 = i22;
                    int i23 = d30;
                    long j13 = b6.getLong(i23);
                    d30 = i23;
                    int i24 = d31;
                    long j14 = b6.getLong(i24);
                    d31 = i24;
                    int i25 = d32;
                    d32 = i25;
                    arrayList.add(new u(string, f6, string2, string3, g6, g7, j6, j7, j8, new W2.b(d33, z7, z8, z9, z10, j13, j14, C1290B.b(b6.isNull(i25) ? null : b6.getBlob(i25))), i8, c6, j9, j10, j11, j12, z6, e6, i15, i17));
                    d6 = i10;
                    i7 = i9;
                }
                b6.close();
                xVar.R();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b6.close();
                xVar.R();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            xVar = D6;
        }
    }

    @Override // f3.v
    public List g() {
        v2.x xVar;
        int d6;
        int d7;
        int d8;
        int d9;
        int d10;
        int d11;
        int d12;
        int d13;
        int d14;
        int d15;
        int d16;
        int d17;
        int d18;
        int d19;
        v2.x D6 = v2.x.D("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f14139a.d();
        Cursor b6 = AbstractC2268b.b(this.f14139a, D6, false, null);
        try {
            d6 = AbstractC2267a.d(b6, "id");
            d7 = AbstractC2267a.d(b6, "state");
            d8 = AbstractC2267a.d(b6, "worker_class_name");
            d9 = AbstractC2267a.d(b6, "input_merger_class_name");
            d10 = AbstractC2267a.d(b6, "input");
            d11 = AbstractC2267a.d(b6, "output");
            d12 = AbstractC2267a.d(b6, "initial_delay");
            d13 = AbstractC2267a.d(b6, "interval_duration");
            d14 = AbstractC2267a.d(b6, "flex_duration");
            d15 = AbstractC2267a.d(b6, "run_attempt_count");
            d16 = AbstractC2267a.d(b6, "backoff_policy");
            d17 = AbstractC2267a.d(b6, "backoff_delay_duration");
            d18 = AbstractC2267a.d(b6, "last_enqueue_time");
            d19 = AbstractC2267a.d(b6, "minimum_retention_duration");
            xVar = D6;
        } catch (Throwable th) {
            th = th;
            xVar = D6;
        }
        try {
            int d20 = AbstractC2267a.d(b6, "schedule_requested_at");
            int d21 = AbstractC2267a.d(b6, "run_in_foreground");
            int d22 = AbstractC2267a.d(b6, "out_of_quota_policy");
            int d23 = AbstractC2267a.d(b6, "period_count");
            int d24 = AbstractC2267a.d(b6, "generation");
            int d25 = AbstractC2267a.d(b6, "required_network_type");
            int d26 = AbstractC2267a.d(b6, "requires_charging");
            int d27 = AbstractC2267a.d(b6, "requires_device_idle");
            int d28 = AbstractC2267a.d(b6, "requires_battery_not_low");
            int d29 = AbstractC2267a.d(b6, "requires_storage_not_low");
            int d30 = AbstractC2267a.d(b6, "trigger_content_update_delay");
            int d31 = AbstractC2267a.d(b6, "trigger_max_content_delay");
            int d32 = AbstractC2267a.d(b6, "content_uri_triggers");
            int i6 = d19;
            ArrayList arrayList = new ArrayList(b6.getCount());
            while (b6.moveToNext()) {
                String string = b6.isNull(d6) ? null : b6.getString(d6);
                W2.u f6 = C1290B.f(b6.getInt(d7));
                String string2 = b6.isNull(d8) ? null : b6.getString(d8);
                String string3 = b6.isNull(d9) ? null : b6.getString(d9);
                androidx.work.b g6 = androidx.work.b.g(b6.isNull(d10) ? null : b6.getBlob(d10));
                androidx.work.b g7 = androidx.work.b.g(b6.isNull(d11) ? null : b6.getBlob(d11));
                long j6 = b6.getLong(d12);
                long j7 = b6.getLong(d13);
                long j8 = b6.getLong(d14);
                int i7 = b6.getInt(d15);
                W2.a c6 = C1290B.c(b6.getInt(d16));
                long j9 = b6.getLong(d17);
                long j10 = b6.getLong(d18);
                int i8 = i6;
                long j11 = b6.getLong(i8);
                int i9 = d6;
                int i10 = d20;
                long j12 = b6.getLong(i10);
                d20 = i10;
                int i11 = d21;
                boolean z6 = b6.getInt(i11) != 0;
                d21 = i11;
                int i12 = d22;
                W2.o e6 = C1290B.e(b6.getInt(i12));
                d22 = i12;
                int i13 = d23;
                int i14 = b6.getInt(i13);
                d23 = i13;
                int i15 = d24;
                int i16 = b6.getInt(i15);
                d24 = i15;
                int i17 = d25;
                W2.l d33 = C1290B.d(b6.getInt(i17));
                d25 = i17;
                int i18 = d26;
                boolean z7 = b6.getInt(i18) != 0;
                d26 = i18;
                int i19 = d27;
                boolean z8 = b6.getInt(i19) != 0;
                d27 = i19;
                int i20 = d28;
                boolean z9 = b6.getInt(i20) != 0;
                d28 = i20;
                int i21 = d29;
                boolean z10 = b6.getInt(i21) != 0;
                d29 = i21;
                int i22 = d30;
                long j13 = b6.getLong(i22);
                d30 = i22;
                int i23 = d31;
                long j14 = b6.getLong(i23);
                d31 = i23;
                int i24 = d32;
                d32 = i24;
                arrayList.add(new u(string, f6, string2, string3, g6, g7, j6, j7, j8, new W2.b(d33, z7, z8, z9, z10, j13, j14, C1290B.b(b6.isNull(i24) ? null : b6.getBlob(i24))), i7, c6, j9, j10, j11, j12, z6, e6, i14, i16));
                d6 = i9;
                i6 = i8;
            }
            b6.close();
            xVar.R();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            b6.close();
            xVar.R();
            throw th;
        }
    }

    @Override // f3.v
    public void h(String str, androidx.work.b bVar) {
        this.f14139a.d();
        A2.k b6 = this.f14145g.b();
        byte[] k6 = androidx.work.b.k(bVar);
        if (k6 == null) {
            b6.Q(1);
        } else {
            b6.H(1, k6);
        }
        if (str == null) {
            b6.Q(2);
        } else {
            b6.b(2, str);
        }
        this.f14139a.e();
        try {
            b6.p();
            this.f14139a.B();
        } finally {
            this.f14139a.i();
            this.f14145g.h(b6);
        }
    }

    @Override // f3.v
    public List i() {
        v2.x xVar;
        int d6;
        int d7;
        int d8;
        int d9;
        int d10;
        int d11;
        int d12;
        int d13;
        int d14;
        int d15;
        int d16;
        int d17;
        int d18;
        int d19;
        v2.x D6 = v2.x.D("SELECT * FROM workspec WHERE state=1", 0);
        this.f14139a.d();
        Cursor b6 = AbstractC2268b.b(this.f14139a, D6, false, null);
        try {
            d6 = AbstractC2267a.d(b6, "id");
            d7 = AbstractC2267a.d(b6, "state");
            d8 = AbstractC2267a.d(b6, "worker_class_name");
            d9 = AbstractC2267a.d(b6, "input_merger_class_name");
            d10 = AbstractC2267a.d(b6, "input");
            d11 = AbstractC2267a.d(b6, "output");
            d12 = AbstractC2267a.d(b6, "initial_delay");
            d13 = AbstractC2267a.d(b6, "interval_duration");
            d14 = AbstractC2267a.d(b6, "flex_duration");
            d15 = AbstractC2267a.d(b6, "run_attempt_count");
            d16 = AbstractC2267a.d(b6, "backoff_policy");
            d17 = AbstractC2267a.d(b6, "backoff_delay_duration");
            d18 = AbstractC2267a.d(b6, "last_enqueue_time");
            d19 = AbstractC2267a.d(b6, "minimum_retention_duration");
            xVar = D6;
        } catch (Throwable th) {
            th = th;
            xVar = D6;
        }
        try {
            int d20 = AbstractC2267a.d(b6, "schedule_requested_at");
            int d21 = AbstractC2267a.d(b6, "run_in_foreground");
            int d22 = AbstractC2267a.d(b6, "out_of_quota_policy");
            int d23 = AbstractC2267a.d(b6, "period_count");
            int d24 = AbstractC2267a.d(b6, "generation");
            int d25 = AbstractC2267a.d(b6, "required_network_type");
            int d26 = AbstractC2267a.d(b6, "requires_charging");
            int d27 = AbstractC2267a.d(b6, "requires_device_idle");
            int d28 = AbstractC2267a.d(b6, "requires_battery_not_low");
            int d29 = AbstractC2267a.d(b6, "requires_storage_not_low");
            int d30 = AbstractC2267a.d(b6, "trigger_content_update_delay");
            int d31 = AbstractC2267a.d(b6, "trigger_max_content_delay");
            int d32 = AbstractC2267a.d(b6, "content_uri_triggers");
            int i6 = d19;
            ArrayList arrayList = new ArrayList(b6.getCount());
            while (b6.moveToNext()) {
                String string = b6.isNull(d6) ? null : b6.getString(d6);
                W2.u f6 = C1290B.f(b6.getInt(d7));
                String string2 = b6.isNull(d8) ? null : b6.getString(d8);
                String string3 = b6.isNull(d9) ? null : b6.getString(d9);
                androidx.work.b g6 = androidx.work.b.g(b6.isNull(d10) ? null : b6.getBlob(d10));
                androidx.work.b g7 = androidx.work.b.g(b6.isNull(d11) ? null : b6.getBlob(d11));
                long j6 = b6.getLong(d12);
                long j7 = b6.getLong(d13);
                long j8 = b6.getLong(d14);
                int i7 = b6.getInt(d15);
                W2.a c6 = C1290B.c(b6.getInt(d16));
                long j9 = b6.getLong(d17);
                long j10 = b6.getLong(d18);
                int i8 = i6;
                long j11 = b6.getLong(i8);
                int i9 = d6;
                int i10 = d20;
                long j12 = b6.getLong(i10);
                d20 = i10;
                int i11 = d21;
                boolean z6 = b6.getInt(i11) != 0;
                d21 = i11;
                int i12 = d22;
                W2.o e6 = C1290B.e(b6.getInt(i12));
                d22 = i12;
                int i13 = d23;
                int i14 = b6.getInt(i13);
                d23 = i13;
                int i15 = d24;
                int i16 = b6.getInt(i15);
                d24 = i15;
                int i17 = d25;
                W2.l d33 = C1290B.d(b6.getInt(i17));
                d25 = i17;
                int i18 = d26;
                boolean z7 = b6.getInt(i18) != 0;
                d26 = i18;
                int i19 = d27;
                boolean z8 = b6.getInt(i19) != 0;
                d27 = i19;
                int i20 = d28;
                boolean z9 = b6.getInt(i20) != 0;
                d28 = i20;
                int i21 = d29;
                boolean z10 = b6.getInt(i21) != 0;
                d29 = i21;
                int i22 = d30;
                long j13 = b6.getLong(i22);
                d30 = i22;
                int i23 = d31;
                long j14 = b6.getLong(i23);
                d31 = i23;
                int i24 = d32;
                d32 = i24;
                arrayList.add(new u(string, f6, string2, string3, g6, g7, j6, j7, j8, new W2.b(d33, z7, z8, z9, z10, j13, j14, C1290B.b(b6.isNull(i24) ? null : b6.getBlob(i24))), i7, c6, j9, j10, j11, j12, z6, e6, i14, i16));
                d6 = i9;
                i6 = i8;
            }
            b6.close();
            xVar.R();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            b6.close();
            xVar.R();
            throw th;
        }
    }

    @Override // f3.v
    public boolean j() {
        boolean z6 = false;
        v2.x D6 = v2.x.D("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.f14139a.d();
        Cursor b6 = AbstractC2268b.b(this.f14139a, D6, false, null);
        try {
            if (b6.moveToFirst()) {
                if (b6.getInt(0) != 0) {
                    z6 = true;
                }
            }
            return z6;
        } finally {
            b6.close();
            D6.R();
        }
    }

    @Override // f3.v
    public List k(String str) {
        v2.x D6 = v2.x.D("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            D6.Q(1);
        } else {
            D6.b(1, str);
        }
        this.f14139a.d();
        Cursor b6 = AbstractC2268b.b(this.f14139a, D6, false, null);
        try {
            ArrayList arrayList = new ArrayList(b6.getCount());
            while (b6.moveToNext()) {
                arrayList.add(b6.isNull(0) ? null : b6.getString(0));
            }
            return arrayList;
        } finally {
            b6.close();
            D6.R();
        }
    }

    @Override // f3.v
    public void l(u uVar) {
        this.f14139a.d();
        this.f14139a.e();
        try {
            this.f14141c.j(uVar);
            this.f14139a.B();
        } finally {
            this.f14139a.i();
        }
    }

    @Override // f3.v
    public W2.u m(String str) {
        v2.x D6 = v2.x.D("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            D6.Q(1);
        } else {
            D6.b(1, str);
        }
        this.f14139a.d();
        W2.u uVar = null;
        Cursor b6 = AbstractC2268b.b(this.f14139a, D6, false, null);
        try {
            if (b6.moveToFirst()) {
                Integer valueOf = b6.isNull(0) ? null : Integer.valueOf(b6.getInt(0));
                if (valueOf != null) {
                    C1290B c1290b = C1290B.f14075a;
                    uVar = C1290B.f(valueOf.intValue());
                }
            }
            return uVar;
        } finally {
            b6.close();
            D6.R();
        }
    }

    @Override // f3.v
    public u n(String str) {
        v2.x xVar;
        u uVar;
        v2.x D6 = v2.x.D("SELECT * FROM workspec WHERE id=?", 1);
        if (str == null) {
            D6.Q(1);
        } else {
            D6.b(1, str);
        }
        this.f14139a.d();
        Cursor b6 = AbstractC2268b.b(this.f14139a, D6, false, null);
        try {
            int d6 = AbstractC2267a.d(b6, "id");
            int d7 = AbstractC2267a.d(b6, "state");
            int d8 = AbstractC2267a.d(b6, "worker_class_name");
            int d9 = AbstractC2267a.d(b6, "input_merger_class_name");
            int d10 = AbstractC2267a.d(b6, "input");
            int d11 = AbstractC2267a.d(b6, "output");
            int d12 = AbstractC2267a.d(b6, "initial_delay");
            int d13 = AbstractC2267a.d(b6, "interval_duration");
            int d14 = AbstractC2267a.d(b6, "flex_duration");
            int d15 = AbstractC2267a.d(b6, "run_attempt_count");
            int d16 = AbstractC2267a.d(b6, "backoff_policy");
            int d17 = AbstractC2267a.d(b6, "backoff_delay_duration");
            int d18 = AbstractC2267a.d(b6, "last_enqueue_time");
            int d19 = AbstractC2267a.d(b6, "minimum_retention_duration");
            xVar = D6;
            try {
                int d20 = AbstractC2267a.d(b6, "schedule_requested_at");
                int d21 = AbstractC2267a.d(b6, "run_in_foreground");
                int d22 = AbstractC2267a.d(b6, "out_of_quota_policy");
                int d23 = AbstractC2267a.d(b6, "period_count");
                int d24 = AbstractC2267a.d(b6, "generation");
                int d25 = AbstractC2267a.d(b6, "required_network_type");
                int d26 = AbstractC2267a.d(b6, "requires_charging");
                int d27 = AbstractC2267a.d(b6, "requires_device_idle");
                int d28 = AbstractC2267a.d(b6, "requires_battery_not_low");
                int d29 = AbstractC2267a.d(b6, "requires_storage_not_low");
                int d30 = AbstractC2267a.d(b6, "trigger_content_update_delay");
                int d31 = AbstractC2267a.d(b6, "trigger_max_content_delay");
                int d32 = AbstractC2267a.d(b6, "content_uri_triggers");
                if (b6.moveToFirst()) {
                    uVar = new u(b6.isNull(d6) ? null : b6.getString(d6), C1290B.f(b6.getInt(d7)), b6.isNull(d8) ? null : b6.getString(d8), b6.isNull(d9) ? null : b6.getString(d9), androidx.work.b.g(b6.isNull(d10) ? null : b6.getBlob(d10)), androidx.work.b.g(b6.isNull(d11) ? null : b6.getBlob(d11)), b6.getLong(d12), b6.getLong(d13), b6.getLong(d14), new W2.b(C1290B.d(b6.getInt(d25)), b6.getInt(d26) != 0, b6.getInt(d27) != 0, b6.getInt(d28) != 0, b6.getInt(d29) != 0, b6.getLong(d30), b6.getLong(d31), C1290B.b(b6.isNull(d32) ? null : b6.getBlob(d32))), b6.getInt(d15), C1290B.c(b6.getInt(d16)), b6.getLong(d17), b6.getLong(d18), b6.getLong(d19), b6.getLong(d20), b6.getInt(d21) != 0, C1290B.e(b6.getInt(d22)), b6.getInt(d23), b6.getInt(d24));
                } else {
                    uVar = null;
                }
                b6.close();
                xVar.R();
                return uVar;
            } catch (Throwable th) {
                th = th;
                b6.close();
                xVar.R();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            xVar = D6;
        }
    }

    @Override // f3.v
    public int o(String str) {
        this.f14139a.d();
        A2.k b6 = this.f14148j.b();
        if (str == null) {
            b6.Q(1);
        } else {
            b6.b(1, str);
        }
        this.f14139a.e();
        try {
            int p6 = b6.p();
            this.f14139a.B();
            return p6;
        } finally {
            this.f14139a.i();
            this.f14148j.h(b6);
        }
    }

    @Override // f3.v
    public int p(W2.u uVar, String str) {
        this.f14139a.d();
        A2.k b6 = this.f14143e.b();
        b6.A(1, C1290B.j(uVar));
        if (str == null) {
            b6.Q(2);
        } else {
            b6.b(2, str);
        }
        this.f14139a.e();
        try {
            int p6 = b6.p();
            this.f14139a.B();
            return p6;
        } finally {
            this.f14139a.i();
            this.f14143e.h(b6);
        }
    }

    @Override // f3.v
    public void q(String str, long j6) {
        this.f14139a.d();
        A2.k b6 = this.f14146h.b();
        b6.A(1, j6);
        if (str == null) {
            b6.Q(2);
        } else {
            b6.b(2, str);
        }
        this.f14139a.e();
        try {
            b6.p();
            this.f14139a.B();
        } finally {
            this.f14139a.i();
            this.f14146h.h(b6);
        }
    }

    @Override // f3.v
    public List r(String str) {
        v2.x D6 = v2.x.D("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            D6.Q(1);
        } else {
            D6.b(1, str);
        }
        this.f14139a.d();
        Cursor b6 = AbstractC2268b.b(this.f14139a, D6, false, null);
        try {
            ArrayList arrayList = new ArrayList(b6.getCount());
            while (b6.moveToNext()) {
                arrayList.add(androidx.work.b.g(b6.isNull(0) ? null : b6.getBlob(0)));
            }
            return arrayList;
        } finally {
            b6.close();
            D6.R();
        }
    }

    @Override // f3.v
    public int s(String str) {
        this.f14139a.d();
        A2.k b6 = this.f14147i.b();
        if (str == null) {
            b6.Q(1);
        } else {
            b6.b(1, str);
        }
        this.f14139a.e();
        try {
            int p6 = b6.p();
            this.f14139a.B();
            return p6;
        } finally {
            this.f14139a.i();
            this.f14147i.h(b6);
        }
    }

    @Override // f3.v
    public List t(int i6) {
        v2.x xVar;
        v2.x D6 = v2.x.D("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?", 1);
        D6.A(1, i6);
        this.f14139a.d();
        Cursor b6 = AbstractC2268b.b(this.f14139a, D6, false, null);
        try {
            int d6 = AbstractC2267a.d(b6, "id");
            int d7 = AbstractC2267a.d(b6, "state");
            int d8 = AbstractC2267a.d(b6, "worker_class_name");
            int d9 = AbstractC2267a.d(b6, "input_merger_class_name");
            int d10 = AbstractC2267a.d(b6, "input");
            int d11 = AbstractC2267a.d(b6, "output");
            int d12 = AbstractC2267a.d(b6, "initial_delay");
            int d13 = AbstractC2267a.d(b6, "interval_duration");
            int d14 = AbstractC2267a.d(b6, "flex_duration");
            int d15 = AbstractC2267a.d(b6, "run_attempt_count");
            int d16 = AbstractC2267a.d(b6, "backoff_policy");
            int d17 = AbstractC2267a.d(b6, "backoff_delay_duration");
            int d18 = AbstractC2267a.d(b6, "last_enqueue_time");
            int d19 = AbstractC2267a.d(b6, "minimum_retention_duration");
            xVar = D6;
            try {
                int d20 = AbstractC2267a.d(b6, "schedule_requested_at");
                int d21 = AbstractC2267a.d(b6, "run_in_foreground");
                int d22 = AbstractC2267a.d(b6, "out_of_quota_policy");
                int d23 = AbstractC2267a.d(b6, "period_count");
                int d24 = AbstractC2267a.d(b6, "generation");
                int d25 = AbstractC2267a.d(b6, "required_network_type");
                int d26 = AbstractC2267a.d(b6, "requires_charging");
                int d27 = AbstractC2267a.d(b6, "requires_device_idle");
                int d28 = AbstractC2267a.d(b6, "requires_battery_not_low");
                int d29 = AbstractC2267a.d(b6, "requires_storage_not_low");
                int d30 = AbstractC2267a.d(b6, "trigger_content_update_delay");
                int d31 = AbstractC2267a.d(b6, "trigger_max_content_delay");
                int d32 = AbstractC2267a.d(b6, "content_uri_triggers");
                int i7 = d19;
                ArrayList arrayList = new ArrayList(b6.getCount());
                while (b6.moveToNext()) {
                    String string = b6.isNull(d6) ? null : b6.getString(d6);
                    W2.u f6 = C1290B.f(b6.getInt(d7));
                    String string2 = b6.isNull(d8) ? null : b6.getString(d8);
                    String string3 = b6.isNull(d9) ? null : b6.getString(d9);
                    androidx.work.b g6 = androidx.work.b.g(b6.isNull(d10) ? null : b6.getBlob(d10));
                    androidx.work.b g7 = androidx.work.b.g(b6.isNull(d11) ? null : b6.getBlob(d11));
                    long j6 = b6.getLong(d12);
                    long j7 = b6.getLong(d13);
                    long j8 = b6.getLong(d14);
                    int i8 = b6.getInt(d15);
                    W2.a c6 = C1290B.c(b6.getInt(d16));
                    long j9 = b6.getLong(d17);
                    long j10 = b6.getLong(d18);
                    int i9 = i7;
                    long j11 = b6.getLong(i9);
                    int i10 = d6;
                    int i11 = d20;
                    long j12 = b6.getLong(i11);
                    d20 = i11;
                    int i12 = d21;
                    boolean z6 = b6.getInt(i12) != 0;
                    d21 = i12;
                    int i13 = d22;
                    W2.o e6 = C1290B.e(b6.getInt(i13));
                    d22 = i13;
                    int i14 = d23;
                    int i15 = b6.getInt(i14);
                    d23 = i14;
                    int i16 = d24;
                    int i17 = b6.getInt(i16);
                    d24 = i16;
                    int i18 = d25;
                    W2.l d33 = C1290B.d(b6.getInt(i18));
                    d25 = i18;
                    int i19 = d26;
                    boolean z7 = b6.getInt(i19) != 0;
                    d26 = i19;
                    int i20 = d27;
                    boolean z8 = b6.getInt(i20) != 0;
                    d27 = i20;
                    int i21 = d28;
                    boolean z9 = b6.getInt(i21) != 0;
                    d28 = i21;
                    int i22 = d29;
                    boolean z10 = b6.getInt(i22) != 0;
                    d29 = i22;
                    int i23 = d30;
                    long j13 = b6.getLong(i23);
                    d30 = i23;
                    int i24 = d31;
                    long j14 = b6.getLong(i24);
                    d31 = i24;
                    int i25 = d32;
                    d32 = i25;
                    arrayList.add(new u(string, f6, string2, string3, g6, g7, j6, j7, j8, new W2.b(d33, z7, z8, z9, z10, j13, j14, C1290B.b(b6.isNull(i25) ? null : b6.getBlob(i25))), i8, c6, j9, j10, j11, j12, z6, e6, i15, i17));
                    d6 = i10;
                    i7 = i9;
                }
                b6.close();
                xVar.R();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b6.close();
                xVar.R();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            xVar = D6;
        }
    }

    @Override // f3.v
    public int u() {
        this.f14139a.d();
        A2.k b6 = this.f14150l.b();
        this.f14139a.e();
        try {
            int p6 = b6.p();
            this.f14139a.B();
            return p6;
        } finally {
            this.f14139a.i();
            this.f14150l.h(b6);
        }
    }

    @Override // f3.v
    public void v(u uVar) {
        this.f14139a.d();
        this.f14139a.e();
        try {
            this.f14140b.j(uVar);
            this.f14139a.B();
        } finally {
            this.f14139a.i();
        }
    }
}
