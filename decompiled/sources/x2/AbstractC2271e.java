package x2;

import A2.g;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import x2.C2270d;

/* renamed from: x2.e, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC2271e {
    public static final Map a(g gVar, String str) {
        Cursor K5 = gVar.K("PRAGMA table_info(`" + str + "`)");
        try {
            if (K5.getColumnCount() <= 0) {
                Map emptyMap = MapsKt.emptyMap();
                CloseableKt.closeFinally(K5, null);
                return emptyMap;
            }
            int columnIndex = K5.getColumnIndex(com.amazon.a.a.h.a.f10906a);
            int columnIndex2 = K5.getColumnIndex("type");
            int columnIndex3 = K5.getColumnIndex("notnull");
            int columnIndex4 = K5.getColumnIndex("pk");
            int columnIndex5 = K5.getColumnIndex("dflt_value");
            Map createMapBuilder = MapsKt.createMapBuilder();
            while (K5.moveToNext()) {
                String name = K5.getString(columnIndex);
                String type = K5.getString(columnIndex2);
                boolean z6 = K5.getInt(columnIndex3) != 0;
                int i6 = K5.getInt(columnIndex4);
                String string = K5.getString(columnIndex5);
                Intrinsics.checkNotNullExpressionValue(name, "name");
                Intrinsics.checkNotNullExpressionValue(type, "type");
                createMapBuilder.put(name, new C2270d.a(name, type, z6, i6, string, 2));
            }
            Map build = MapsKt.build(createMapBuilder);
            CloseableKt.closeFinally(K5, null);
            return build;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(K5, th);
                throw th2;
            }
        }
    }

    public static final List b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        List createListBuilder = CollectionsKt.createListBuilder();
        while (cursor.moveToNext()) {
            int i6 = cursor.getInt(columnIndex);
            int i7 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            Intrinsics.checkNotNullExpressionValue(string2, "cursor.getString(toColumnIndex)");
            createListBuilder.add(new C2270d.C0272d(i6, i7, string, string2));
        }
        return CollectionsKt.sorted(CollectionsKt.build(createListBuilder));
    }

    public static final Set c(g gVar, String str) {
        Cursor K5 = gVar.K("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = K5.getColumnIndex("id");
            int columnIndex2 = K5.getColumnIndex("seq");
            int columnIndex3 = K5.getColumnIndex("table");
            int columnIndex4 = K5.getColumnIndex("on_delete");
            int columnIndex5 = K5.getColumnIndex("on_update");
            List b6 = b(K5);
            K5.moveToPosition(-1);
            Set createSetBuilder = SetsKt.createSetBuilder();
            while (K5.moveToNext()) {
                if (K5.getInt(columnIndex2) == 0) {
                    int i6 = K5.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList<C2270d.C0272d> arrayList3 = new ArrayList();
                    for (Object obj : b6) {
                        if (((C2270d.C0272d) obj).c() == i6) {
                            arrayList3.add(obj);
                        }
                    }
                    for (C2270d.C0272d c0272d : arrayList3) {
                        arrayList.add(c0272d.b());
                        arrayList2.add(c0272d.d());
                    }
                    String string = K5.getString(columnIndex3);
                    Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(tableColumnIndex)");
                    String string2 = K5.getString(columnIndex4);
                    Intrinsics.checkNotNullExpressionValue(string2, "cursor.getString(onDeleteColumnIndex)");
                    String string3 = K5.getString(columnIndex5);
                    Intrinsics.checkNotNullExpressionValue(string3, "cursor.getString(onUpdateColumnIndex)");
                    createSetBuilder.add(new C2270d.c(string, string2, string3, arrayList, arrayList2));
                }
            }
            Set build = SetsKt.build(createSetBuilder);
            CloseableKt.closeFinally(K5, null);
            return build;
        } finally {
        }
    }

    public static final C2270d.e d(g gVar, String str, boolean z6) {
        Cursor K5 = gVar.K("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = K5.getColumnIndex("seqno");
            int columnIndex2 = K5.getColumnIndex("cid");
            int columnIndex3 = K5.getColumnIndex(com.amazon.a.a.h.a.f10906a);
            int columnIndex4 = K5.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (K5.moveToNext()) {
                    if (K5.getInt(columnIndex2) >= 0) {
                        int i6 = K5.getInt(columnIndex);
                        String columnName = K5.getString(columnIndex3);
                        String str2 = K5.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        Integer valueOf = Integer.valueOf(i6);
                        Intrinsics.checkNotNullExpressionValue(columnName, "columnName");
                        treeMap.put(valueOf, columnName);
                        treeMap2.put(Integer.valueOf(i6), str2);
                    }
                }
                Collection values = treeMap.values();
                Intrinsics.checkNotNullExpressionValue(values, "columnsMap.values");
                List list = CollectionsKt.toList(values);
                Collection values2 = treeMap2.values();
                Intrinsics.checkNotNullExpressionValue(values2, "ordersMap.values");
                C2270d.e eVar = new C2270d.e(str, z6, list, CollectionsKt.toList(values2));
                CloseableKt.closeFinally(K5, null);
                return eVar;
            }
            CloseableKt.closeFinally(K5, null);
            return null;
        } finally {
        }
    }

    public static final Set e(g gVar, String str) {
        Cursor K5 = gVar.K("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = K5.getColumnIndex(com.amazon.a.a.h.a.f10906a);
            int columnIndex2 = K5.getColumnIndex("origin");
            int columnIndex3 = K5.getColumnIndex("unique");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                Set createSetBuilder = SetsKt.createSetBuilder();
                while (K5.moveToNext()) {
                    if (Intrinsics.areEqual("c", K5.getString(columnIndex2))) {
                        String name = K5.getString(columnIndex);
                        boolean z6 = true;
                        if (K5.getInt(columnIndex3) != 1) {
                            z6 = false;
                        }
                        Intrinsics.checkNotNullExpressionValue(name, "name");
                        C2270d.e d6 = d(gVar, name, z6);
                        if (d6 == null) {
                            CloseableKt.closeFinally(K5, null);
                            return null;
                        }
                        createSetBuilder.add(d6);
                    }
                }
                Set build = SetsKt.build(createSetBuilder);
                CloseableKt.closeFinally(K5, null);
                return build;
            }
            CloseableKt.closeFinally(K5, null);
            return null;
        } finally {
        }
    }

    public static final C2270d f(g database, String tableName) {
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        return new C2270d(tableName, a(database, tableName), c(database, tableName), e(database, tableName));
    }
}
