package com.appsflyer.internal.connector.purcahse;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000e\u0010\rJ'\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\u000b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/appsflyer/internal/connector/purcahse/AFPurchaseConnectorA1l;", "Landroid/database/sqlite/SQLiteOpenHelper;", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "", "", "getQuantity", "()Ljava/util/Set;", "Landroid/database/sqlite/SQLiteDatabase;", "", "onCreate", "(Landroid/database/sqlite/SQLiteDatabase;)V", "onOpen", "", "p1", "p2", "onUpgrade", "(Landroid/database/sqlite/SQLiteDatabase;II)V", "toJsonMap", "(Ljava/util/Set;)V", "AFPurchaseConnectorA1w"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class AFPurchaseConnectorA1l extends SQLiteOpenHelper {
    private static final int InAppPurchaseEvent = 1;

    @NotNull
    public static final String getPackageName = "purchases";

    @NotNull
    private static final String getQuantity = "afpurchases.db";

    @NotNull
    public static final String toJsonMap = "token";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFPurchaseConnectorA1l(@NotNull Context context) {
        super(context, getQuantity, (SQLiteDatabase.CursorFactory) null, 1);
        Intrinsics.checkNotNullParameter(context, "");
    }

    @NotNull
    public final Set<String> getQuantity() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Cursor query = getReadableDatabase().query(getPackageName, new String[]{"token"}, null, null, null, null, null);
        while (query.moveToNext()) {
            try {
                String string = query.getString(query.getColumnIndexOrThrow("token"));
                Intrinsics.checkNotNullExpressionValue(string, "");
                linkedHashSet.add(string);
            } finally {
            }
        }
        Unit unit = Unit.INSTANCE;
        CloseableKt.closeFinally(query, null);
        return linkedHashSet;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(@NotNull SQLiteDatabase p02) {
        Intrinsics.checkNotNullParameter(p02, "");
        p02.execSQL("CREATE TABLE purchases (token TEXT PRIMARY KEY)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(@Nullable SQLiteDatabase p02) {
        super.onOpen(p02);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(@NotNull SQLiteDatabase p02, int p12, int p22) {
        Intrinsics.checkNotNullParameter(p02, "");
    }

    public final void toJsonMap(@NotNull Set<String> p02) {
        Intrinsics.checkNotNullParameter(p02, "");
        SQLiteDatabase writableDatabase = getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            ContentValues contentValues = new ContentValues();
            Iterator<String> it = p02.iterator();
            while (it.hasNext()) {
                contentValues.put("token", it.next());
                writableDatabase.insertWithOnConflict(getPackageName, null, contentValues, 4);
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
    }
}
