package x2;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.util.Log;
import kotlin.collections.ArraysKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: x2.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC2267a {
    public static final Cursor a(Cursor c6) {
        Intrinsics.checkNotNullParameter(c6, "c");
        try {
            MatrixCursor matrixCursor = new MatrixCursor(c6.getColumnNames(), c6.getCount());
            while (c6.moveToNext()) {
                Object[] objArr = new Object[c6.getColumnCount()];
                int columnCount = c6.getColumnCount();
                for (int i6 = 0; i6 < columnCount; i6++) {
                    int type = c6.getType(i6);
                    if (type == 0) {
                        objArr[i6] = null;
                    } else if (type == 1) {
                        objArr[i6] = Long.valueOf(c6.getLong(i6));
                    } else if (type == 2) {
                        objArr[i6] = Double.valueOf(c6.getDouble(i6));
                    } else if (type == 3) {
                        objArr[i6] = c6.getString(i6);
                    } else {
                        if (type != 4) {
                            throw new IllegalStateException();
                        }
                        objArr[i6] = c6.getBlob(i6);
                    }
                }
                matrixCursor.addRow(objArr);
            }
            CloseableKt.closeFinally(c6, null);
            return matrixCursor;
        } finally {
        }
    }

    public static final int b(Cursor cursor, String str) {
        return -1;
    }

    public static final int c(Cursor c6, String name) {
        Intrinsics.checkNotNullParameter(c6, "c");
        Intrinsics.checkNotNullParameter(name, "name");
        int columnIndex = c6.getColumnIndex(name);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = c6.getColumnIndex('`' + name + '`');
        return columnIndex2 >= 0 ? columnIndex2 : b(c6, name);
    }

    public static final int d(Cursor c6, String name) {
        String str;
        Intrinsics.checkNotNullParameter(c6, "c");
        Intrinsics.checkNotNullParameter(name, "name");
        int c7 = c(c6, name);
        if (c7 >= 0) {
            return c7;
        }
        try {
            String[] columnNames = c6.getColumnNames();
            Intrinsics.checkNotNullExpressionValue(columnNames, "c.columnNames");
            str = ArraysKt.joinToString$default(columnNames, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null);
        } catch (Exception e6) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e6);
            str = "unknown";
        }
        throw new IllegalArgumentException("column '" + name + "' does not exist. Available columns: " + str);
    }
}
