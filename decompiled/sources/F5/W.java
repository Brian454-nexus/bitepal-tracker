package F5;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class W extends SQLiteOpenHelper {

    /* renamed from: c, reason: collision with root package name */
    public static final String f1661c = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";

    /* renamed from: d, reason: collision with root package name */
    public static int f1662d = 7;

    /* renamed from: e, reason: collision with root package name */
    public static final a f1663e;

    /* renamed from: f, reason: collision with root package name */
    public static final a f1664f;

    /* renamed from: g, reason: collision with root package name */
    public static final a f1665g;

    /* renamed from: h, reason: collision with root package name */
    public static final a f1666h;

    /* renamed from: i, reason: collision with root package name */
    public static final a f1667i;

    /* renamed from: j, reason: collision with root package name */
    public static final a f1668j;

    /* renamed from: k, reason: collision with root package name */
    public static final a f1669k;

    /* renamed from: l, reason: collision with root package name */
    public static final List f1670l;

    /* renamed from: a, reason: collision with root package name */
    public final int f1671a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1672b;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface a {
        void a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        a aVar = new a() { // from class: F5.O
            @Override // F5.W.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                W.a(sQLiteDatabase);
            }
        };
        f1663e = aVar;
        a aVar2 = new a() { // from class: F5.P
            @Override // F5.W.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                W.R(sQLiteDatabase);
            }
        };
        f1664f = aVar2;
        a aVar3 = new a() { // from class: F5.Q
            @Override // F5.W.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
            }
        };
        f1665g = aVar3;
        a aVar4 = new a() { // from class: F5.S
            @Override // F5.W.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                W.T(sQLiteDatabase);
            }
        };
        f1666h = aVar4;
        a aVar5 = new a() { // from class: F5.T
            @Override // F5.W.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                W.I(sQLiteDatabase);
            }
        };
        f1667i = aVar5;
        a aVar6 = new a() { // from class: F5.U
            @Override // F5.W.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN product_id INTEGER");
            }
        };
        f1668j = aVar6;
        a aVar7 = new a() { // from class: F5.V
            @Override // F5.W.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                W.c(sQLiteDatabase);
            }
        };
        f1669k = aVar7;
        f1670l = Arrays.asList(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    public W(Context context, String str, int i6) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i6);
        this.f1672b = false;
        this.f1671a = i6;
    }

    public static /* synthetic */ void I(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
        sQLiteDatabase.execSQL(f1661c);
    }

    public static /* synthetic */ void R(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    public static /* synthetic */ void T(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }

    public static /* synthetic */ void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    public static /* synthetic */ void c(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN pseudonymous_id TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN experiment_ids_clear_blob BLOB");
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN experiment_ids_encrypted_blob BLOB");
    }

    public final void Y(SQLiteDatabase sQLiteDatabase) {
        if (this.f1672b) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    public final void a0(SQLiteDatabase sQLiteDatabase, int i6) {
        Y(sQLiteDatabase);
        f0(sQLiteDatabase, 0, i6);
    }

    public final void f0(SQLiteDatabase sQLiteDatabase, int i6, int i7) {
        List list = f1670l;
        if (i7 <= list.size()) {
            while (i6 < i7) {
                ((a) f1670l.get(i6)).a(sQLiteDatabase);
                i6++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i6 + " to " + i7 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f1672b = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        a0(sQLiteDatabase, this.f1671a);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i6, int i7) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        a0(sQLiteDatabase, i7);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        Y(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i6, int i7) {
        Y(sQLiteDatabase);
        f0(sQLiteDatabase, i6, i7);
    }
}
