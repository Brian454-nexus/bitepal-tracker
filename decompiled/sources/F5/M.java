package F5;

import A5.a;
import A5.c;
import G5.b;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import x5.i;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class M implements InterfaceC0357d, G5.b, InterfaceC0356c {

    /* renamed from: f, reason: collision with root package name */
    public static final u5.c f1648f = u5.c.b("proto");

    /* renamed from: a, reason: collision with root package name */
    public final W f1649a;

    /* renamed from: b, reason: collision with root package name */
    public final H5.a f1650b;

    /* renamed from: c, reason: collision with root package name */
    public final H5.a f1651c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0358e f1652d;

    /* renamed from: e, reason: collision with root package name */
    public final fa.a f1653e;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface b {
        Object apply(Object obj);
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final String f1654a;

        /* renamed from: b, reason: collision with root package name */
        public final String f1655b;

        public c(String str, String str2) {
            this.f1654a = str;
            this.f1655b = str2;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface d {
        Object a();
    }

    public M(H5.a aVar, H5.a aVar2, AbstractC0358e abstractC0358e, W w6, fa.a aVar3) {
        this.f1649a = w6;
        this.f1650b = aVar;
        this.f1651c = aVar2;
        this.f1652d = abstractC0358e;
        this.f1653e = aVar3;
    }

    public static /* synthetic */ Integer A0(final M m6, long j6, SQLiteDatabase sQLiteDatabase) {
        m6.getClass();
        String[] strArr = {String.valueOf(j6)};
        b1(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new b() { // from class: F5.s
            @Override // F5.M.b
            public final Object apply(Object obj) {
                return M.f0(M.this, (Cursor) obj);
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    public static /* synthetic */ Object B0(M m6, List list, x5.p pVar, Cursor cursor) {
        m6.getClass();
        while (cursor.moveToNext()) {
            long j6 = cursor.getLong(0);
            boolean z6 = cursor.getInt(7) != 0;
            i.a o6 = x5.i.a().n(cursor.getString(1)).i(cursor.getLong(2)).o(cursor.getLong(3));
            if (z6) {
                o6.h(new x5.h(Z0(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                o6.h(new x5.h(Z0(cursor.getString(4)), m6.X0(j6)));
            }
            if (!cursor.isNull(6)) {
                o6.g(Integer.valueOf(cursor.getInt(6)));
            }
            if (!cursor.isNull(8)) {
                o6.l(Integer.valueOf(cursor.getInt(8)));
            }
            if (!cursor.isNull(9)) {
                o6.m(cursor.getString(9));
            }
            if (!cursor.isNull(10)) {
                o6.j(cursor.getBlob(10));
            }
            if (!cursor.isNull(11)) {
                o6.k(cursor.getBlob(11));
            }
            list.add(AbstractC0364k.a(j6, pVar, o6.d()));
        }
        return null;
    }

    public static /* synthetic */ Object C0(M m6, SQLiteDatabase sQLiteDatabase) {
        m6.getClass();
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + m6.f1650b.a()).execute();
        return null;
    }

    public static /* synthetic */ A5.a D0(final M m6, String str, final Map map, final a.C0006a c0006a, SQLiteDatabase sQLiteDatabase) {
        m6.getClass();
        return (A5.a) b1(sQLiteDatabase.rawQuery(str, new String[0]), new b() { // from class: F5.A
            @Override // F5.M.b
            public final Object apply(Object obj) {
                return M.s0(M.this, map, c0006a, (Cursor) obj);
            }
        });
    }

    public static /* synthetic */ Long E0(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    public static /* synthetic */ A5.f F0(final long j6, SQLiteDatabase sQLiteDatabase) {
        return (A5.f) b1(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new b() { // from class: F5.D
            @Override // F5.M.b
            public final Object apply(Object obj) {
                return M.P(j6, (Cursor) obj);
            }
        });
    }

    public static /* synthetic */ A5.f P(long j6, Cursor cursor) {
        cursor.moveToNext();
        return A5.f.c().c(cursor.getLong(0)).b(j6).a();
    }

    public static /* synthetic */ List R(M m6, x5.p pVar, SQLiteDatabase sQLiteDatabase) {
        List T02 = m6.T0(sQLiteDatabase, pVar, m6.f1652d.d());
        for (u5.f fVar : u5.f.values()) {
            if (fVar != pVar.d()) {
                int d6 = m6.f1652d.d() - T02.size();
                if (d6 <= 0) {
                    break;
                }
                T02.addAll(m6.T0(sQLiteDatabase, pVar.f(fVar), d6));
            }
        }
        return m6.S0(T02, m6.U0(sQLiteDatabase, T02));
    }

    public static /* synthetic */ List T(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(x5.p.a().b(cursor.getString(1)).d(I5.a.b(cursor.getInt(2))).c(V0(cursor.getString(3))).a());
        }
        return arrayList;
    }

    public static byte[] V0(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    public static /* synthetic */ Object Y(M m6, Cursor cursor) {
        m6.getClass();
        while (cursor.moveToNext()) {
            m6.I(cursor.getInt(0), c.b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    public static u5.c Z0(String str) {
        return str == null ? f1648f : u5.c.b(str);
    }

    public static /* synthetic */ SQLiteDatabase a0(Throwable th) {
        throw new G5.a("Timed out while trying to open db.", th);
    }

    public static String a1(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((AbstractC0364k) it.next()).c());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object b1(Cursor cursor, b bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static /* synthetic */ Object f0(M m6, Cursor cursor) {
        m6.getClass();
        while (cursor.moveToNext()) {
            m6.I(cursor.getInt(0), c.b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    public static /* synthetic */ Object k0(final M m6, String str, String str2, SQLiteDatabase sQLiteDatabase) {
        m6.getClass();
        sQLiteDatabase.compileStatement(str).execute();
        b1(sQLiteDatabase.rawQuery(str2, null), new b() { // from class: F5.v
            @Override // F5.M.b
            public final Object apply(Object obj) {
                return M.Y(M.this, (Cursor) obj);
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    public static /* synthetic */ Boolean o0(M m6, x5.p pVar, SQLiteDatabase sQLiteDatabase) {
        Long P02 = m6.P0(sQLiteDatabase, pVar);
        return P02 == null ? Boolean.FALSE : (Boolean) b1(m6.K0().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{P02.toString()}), new b() { // from class: F5.u
            @Override // F5.M.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    public static /* synthetic */ Object p0(long j6, x5.p pVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j6));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{pVar.b(), String.valueOf(I5.a.a(pVar.d()))}) < 1) {
            contentValues.put("backend_name", pVar.b());
            contentValues.put("priority", Integer.valueOf(I5.a.a(pVar.d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    public static /* synthetic */ byte[] q0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int i6 = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i6 += blob.length;
        }
        byte[] bArr = new byte[i6];
        int i7 = 0;
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            byte[] bArr2 = (byte[]) arrayList.get(i8);
            System.arraycopy(bArr2, 0, bArr, i7, bArr2.length);
            i7 += bArr2.length;
        }
        return bArr;
    }

    public static /* synthetic */ List r0(SQLiteDatabase sQLiteDatabase) {
        return (List) b1(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new b() { // from class: F5.K
            @Override // F5.M.b
            public final Object apply(Object obj) {
                return M.T((Cursor) obj);
            }
        });
    }

    public static /* synthetic */ A5.a s0(M m6, Map map, a.C0006a c0006a, Cursor cursor) {
        m6.getClass();
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            c.b G02 = m6.G0(cursor.getInt(1));
            long j6 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(A5.c.c().c(G02).b(j6).a());
        }
        m6.W0(c0006a, map);
        return c0006a.e(m6.O0()).d(m6.L0()).c((String) m6.f1653e.get()).b();
    }

    public static /* synthetic */ Long u0(M m6, x5.i iVar, x5.p pVar, SQLiteDatabase sQLiteDatabase) {
        if (m6.R0()) {
            m6.I(1L, c.b.CACHE_FULL, iVar.n());
            return -1L;
        }
        long I02 = m6.I0(sQLiteDatabase, pVar);
        int e6 = m6.f1652d.e();
        byte[] a6 = iVar.e().a();
        boolean z6 = a6.length <= e6;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(I02));
        contentValues.put("transport_name", iVar.n());
        contentValues.put("timestamp_ms", Long.valueOf(iVar.f()));
        contentValues.put("uptime_ms", Long.valueOf(iVar.o()));
        contentValues.put("payload_encoding", iVar.e().b().a());
        contentValues.put("code", iVar.d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z6));
        contentValues.put("payload", z6 ? a6 : new byte[0]);
        contentValues.put("product_id", iVar.l());
        contentValues.put("pseudonymous_id", iVar.m());
        contentValues.put("experiment_ids_clear_blob", iVar.g());
        contentValues.put("experiment_ids_encrypted_blob", iVar.h());
        long insert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z6) {
            int ceil = (int) Math.ceil(a6.length / e6);
            for (int i6 = 1; i6 <= ceil; i6++) {
                byte[] copyOfRange = Arrays.copyOfRange(a6, (i6 - 1) * e6, Math.min(i6 * e6, a6.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(insert));
                contentValues2.put("sequence_num", Integer.valueOf(i6));
                contentValues2.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry entry : iVar.k().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(insert));
            contentValues3.put(com.amazon.a.a.h.a.f10906a, (String) entry.getKey());
            contentValues3.put(com.amazon.a.a.o.b.f11195Y, (String) entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(insert);
    }

    public static /* synthetic */ Object v0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    public static /* synthetic */ Long w0(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    public static /* synthetic */ Object x0(Throwable th) {
        throw new G5.a("Timed out while trying to acquire the lock.", th);
    }

    public static /* synthetic */ Object y0(String str, c.b bVar, long j6, SQLiteDatabase sQLiteDatabase) {
        if (((Boolean) b1(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.getNumber())}), new b() { // from class: F5.y
            @Override // F5.M.b
            public final Object apply(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r0.getCount() > 0);
                return valueOf;
            }
        })).booleanValue()) {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j6 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.getNumber())});
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("log_source", str);
        contentValues.put("reason", Integer.valueOf(bVar.getNumber()));
        contentValues.put("events_dropped_count", Long.valueOf(j6));
        sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        return null;
    }

    public static /* synthetic */ Object z0(Map map, Cursor cursor) {
        while (true) {
            if (!cursor.moveToNext()) {
                return null;
            }
            long j6 = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j6));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j6), set);
            }
            set.add(new c(cursor.getString(1), cursor.getString(2)));
        }
    }

    @Override // F5.InterfaceC0356c
    public A5.a D() {
        final a.C0006a e6 = A5.a.e();
        final HashMap hashMap = new HashMap();
        final String str = "SELECT log_source, reason, events_dropped_count FROM log_event_dropped";
        return (A5.a) Q0(new b() { // from class: F5.t
            @Override // F5.M.b
            public final Object apply(Object obj) {
                return M.D0(M.this, str, hashMap, e6, (SQLiteDatabase) obj);
            }
        });
    }

    public final c.b G0(int i6) {
        c.b bVar = c.b.REASON_UNKNOWN;
        if (i6 == bVar.getNumber()) {
            return bVar;
        }
        c.b bVar2 = c.b.MESSAGE_TOO_OLD;
        if (i6 == bVar2.getNumber()) {
            return bVar2;
        }
        c.b bVar3 = c.b.CACHE_FULL;
        if (i6 == bVar3.getNumber()) {
            return bVar3;
        }
        c.b bVar4 = c.b.PAYLOAD_TOO_BIG;
        if (i6 == bVar4.getNumber()) {
            return bVar4;
        }
        c.b bVar5 = c.b.MAX_RETRIES_REACHED;
        if (i6 == bVar5.getNumber()) {
            return bVar5;
        }
        c.b bVar6 = c.b.INVALID_PAYLOD;
        if (i6 == bVar6.getNumber()) {
            return bVar6;
        }
        c.b bVar7 = c.b.SERVER_ERROR;
        if (i6 == bVar7.getNumber()) {
            return bVar7;
        }
        B5.a.a("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i6));
        return bVar;
    }

    public final void H0(final SQLiteDatabase sQLiteDatabase) {
        Y0(new d() { // from class: F5.l
            @Override // F5.M.d
            public final Object a() {
                return M.v0(sQLiteDatabase);
            }
        }, new b() { // from class: F5.w
            @Override // F5.M.b
            public final Object apply(Object obj) {
                return M.x0((Throwable) obj);
            }
        });
    }

    @Override // F5.InterfaceC0356c
    public void I(final long j6, final c.b bVar, final String str) {
        Q0(new b() { // from class: F5.r
            @Override // F5.M.b
            public final Object apply(Object obj) {
                return M.y0(str, bVar, j6, (SQLiteDatabase) obj);
            }
        });
    }

    public final long I0(SQLiteDatabase sQLiteDatabase, x5.p pVar) {
        Long P02 = P0(sQLiteDatabase, pVar);
        if (P02 != null) {
            return P02.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", pVar.b());
        contentValues.put("priority", Integer.valueOf(I5.a.a(pVar.d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (pVar.c() != null) {
            contentValues.put("extras", Base64.encodeToString(pVar.c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    public long J0() {
        return M0() * N0();
    }

    public SQLiteDatabase K0() {
        final W w6 = this.f1649a;
        Objects.requireNonNull(w6);
        return (SQLiteDatabase) Y0(new d() { // from class: F5.E
            @Override // F5.M.d
            public final Object a() {
                return W.this.getWritableDatabase();
            }
        }, new b() { // from class: F5.F
            @Override // F5.M.b
            public final Object apply(Object obj) {
                return M.a0((Throwable) obj);
            }
        });
    }

    public final A5.b L0() {
        return A5.b.b().b(A5.e.c().b(J0()).c(AbstractC0358e.f1689a.f()).a()).a();
    }

    public final long M0() {
        return K0().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    public final long N0() {
        return K0().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    public final A5.f O0() {
        final long a6 = this.f1650b.a();
        return (A5.f) Q0(new b() { // from class: F5.C
            @Override // F5.M.b
            public final Object apply(Object obj) {
                return M.F0(a6, (SQLiteDatabase) obj);
            }
        });
    }

    public final Long P0(SQLiteDatabase sQLiteDatabase, x5.p pVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(pVar.b(), String.valueOf(I5.a.a(pVar.d()))));
        if (pVar.c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(pVar.c(), 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) b1(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new b() { // from class: F5.n
            @Override // F5.M.b
            public final Object apply(Object obj) {
                return M.w0((Cursor) obj);
            }
        });
    }

    public Object Q0(b bVar) {
        SQLiteDatabase K02 = K0();
        K02.beginTransaction();
        try {
            Object apply = bVar.apply(K02);
            K02.setTransactionSuccessful();
            return apply;
        } finally {
            K02.endTransaction();
        }
    }

    public final boolean R0() {
        return M0() * N0() >= this.f1652d.f();
    }

    public final List S0(List list, Map map) {
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            AbstractC0364k abstractC0364k = (AbstractC0364k) listIterator.next();
            if (map.containsKey(Long.valueOf(abstractC0364k.c()))) {
                i.a p6 = abstractC0364k.b().p();
                for (c cVar : (Set) map.get(Long.valueOf(abstractC0364k.c()))) {
                    p6.c(cVar.f1654a, cVar.f1655b);
                }
                listIterator.set(AbstractC0364k.a(abstractC0364k.c(), abstractC0364k.d(), p6.d()));
            }
        }
        return list;
    }

    public final List T0(SQLiteDatabase sQLiteDatabase, final x5.p pVar, int i6) {
        final ArrayList arrayList = new ArrayList();
        Long P02 = P0(sQLiteDatabase, pVar);
        if (P02 == null) {
            return arrayList;
        }
        b1(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{P02.toString()}, null, null, null, String.valueOf(i6)), new b() { // from class: F5.x
            @Override // F5.M.b
            public final Object apply(Object obj) {
                return M.B0(M.this, arrayList, pVar, (Cursor) obj);
            }
        });
        return arrayList;
    }

    public final Map U0(SQLiteDatabase sQLiteDatabase, List list) {
        final HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i6 = 0; i6 < list.size(); i6++) {
            sb.append(((AbstractC0364k) list.get(i6)).c());
            if (i6 < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        b1(sQLiteDatabase.query("event_metadata", new String[]{"event_id", com.amazon.a.a.h.a.f10906a, com.amazon.a.a.o.b.f11195Y}, sb.toString(), null, null, null, null), new b() { // from class: F5.z
            @Override // F5.M.b
            public final Object apply(Object obj) {
                return M.z0(hashMap, (Cursor) obj);
            }
        });
        return hashMap;
    }

    public final void W0(a.C0006a c0006a, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            c0006a.a(A5.d.c().c((String) entry.getKey()).b((List) entry.getValue()).a());
        }
    }

    public final byte[] X0(long j6) {
        return (byte[]) b1(K0().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j6)}, null, null, "sequence_num"), new b() { // from class: F5.B
            @Override // F5.M.b
            public final Object apply(Object obj) {
                return M.q0((Cursor) obj);
            }
        });
    }

    public final Object Y0(d dVar, b bVar) {
        long a6 = this.f1651c.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e6) {
                if (this.f1651c.a() >= this.f1652d.b() + a6) {
                    return bVar.apply(e6);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // G5.b
    public Object a(b.a aVar) {
        SQLiteDatabase K02 = K0();
        H0(K02);
        try {
            Object a6 = aVar.a();
            K02.setTransactionSuccessful();
            return a6;
        } finally {
            K02.endTransaction();
        }
    }

    @Override // F5.InterfaceC0356c
    public void c() {
        Q0(new b() { // from class: F5.q
            @Override // F5.M.b
            public final Object apply(Object obj) {
                return M.C0(M.this, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // F5.InterfaceC0357d
    public boolean c0(final x5.p pVar) {
        return ((Boolean) Q0(new b() { // from class: F5.o
            @Override // F5.M.b
            public final Object apply(Object obj) {
                return M.o0(M.this, pVar, (SQLiteDatabase) obj);
            }
        })).booleanValue();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f1649a.close();
    }

    @Override // F5.InterfaceC0357d
    public void h0(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + a1(iterable);
            final String str2 = "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name";
            Q0(new b() { // from class: F5.L
                @Override // F5.M.b
                public final Object apply(Object obj) {
                    return M.k0(M.this, str, str2, (SQLiteDatabase) obj);
                }
            });
        }
    }

    @Override // F5.InterfaceC0357d
    public int i() {
        final long a6 = this.f1650b.a() - this.f1652d.c();
        return ((Integer) Q0(new b() { // from class: F5.J
            @Override // F5.M.b
            public final Object apply(Object obj) {
                return M.A0(M.this, a6, (SQLiteDatabase) obj);
            }
        })).intValue();
    }

    @Override // F5.InterfaceC0357d
    public AbstractC0364k i0(final x5.p pVar, final x5.i iVar) {
        B5.a.b("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", pVar.d(), iVar.n(), pVar.b());
        long longValue = ((Long) Q0(new b() { // from class: F5.I
            @Override // F5.M.b
            public final Object apply(Object obj) {
                return M.u0(M.this, iVar, pVar, (SQLiteDatabase) obj);
            }
        })).longValue();
        if (longValue < 1) {
            return null;
        }
        return AbstractC0364k.a(longValue, pVar, iVar);
    }

    @Override // F5.InterfaceC0357d
    public void l(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            K0().compileStatement("DELETE FROM events WHERE _id in " + a1(iterable)).execute();
        }
    }

    @Override // F5.InterfaceC0357d
    public long r(x5.p pVar) {
        return ((Long) b1(K0().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{pVar.b(), String.valueOf(I5.a.a(pVar.d()))}), new b() { // from class: F5.H
            @Override // F5.M.b
            public final Object apply(Object obj) {
                return M.E0((Cursor) obj);
            }
        })).longValue();
    }

    @Override // F5.InterfaceC0357d
    public void s(final x5.p pVar, final long j6) {
        Q0(new b() { // from class: F5.p
            @Override // F5.M.b
            public final Object apply(Object obj) {
                return M.p0(j6, pVar, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // F5.InterfaceC0357d
    public Iterable w() {
        return (Iterable) Q0(new b() { // from class: F5.G
            @Override // F5.M.b
            public final Object apply(Object obj) {
                return M.r0((SQLiteDatabase) obj);
            }
        });
    }

    @Override // F5.InterfaceC0357d
    public Iterable y(final x5.p pVar) {
        return (Iterable) Q0(new b() { // from class: F5.m
            @Override // F5.M.b
            public final Object apply(Object obj) {
                return M.R(M.this, pVar, (SQLiteDatabase) obj);
            }
        });
    }
}
