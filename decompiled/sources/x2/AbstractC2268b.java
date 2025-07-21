package x2;

import A2.g;
import A2.j;
import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import v2.u;

/* renamed from: x2.b, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC2268b {
    public static final void a(g db) {
        Intrinsics.checkNotNullParameter(db, "db");
        List createListBuilder = CollectionsKt.createListBuilder();
        Cursor K5 = db.K("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (K5.moveToNext()) {
            try {
                createListBuilder.add(K5.getString(0));
            } finally {
            }
        }
        Unit unit = Unit.INSTANCE;
        CloseableKt.closeFinally(K5, null);
        for (String triggerName : CollectionsKt.build(createListBuilder)) {
            Intrinsics.checkNotNullExpressionValue(triggerName, "triggerName");
            if (StringsKt.startsWith$default(triggerName, "room_fts_content_sync_", false, 2, (Object) null)) {
                db.n("DROP TRIGGER IF EXISTS " + triggerName);
            }
        }
    }

    public static final Cursor b(u db, j sqLiteQuery, boolean z6, CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(db, "db");
        Intrinsics.checkNotNullParameter(sqLiteQuery, "sqLiteQuery");
        Cursor x6 = db.x(sqLiteQuery, cancellationSignal);
        if (!z6 || !(x6 instanceof AbstractWindowedCursor)) {
            return x6;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) x6;
        int count = abstractWindowedCursor.getCount();
        return (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count ? AbstractC2267a.a(x6) : x6;
    }

    public static final int c(File databaseFile) {
        Intrinsics.checkNotNullParameter(databaseFile, "databaseFile");
        FileChannel channel = new FileInputStream(databaseFile).getChannel();
        try {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(allocate) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            allocate.rewind();
            int i6 = allocate.getInt();
            CloseableKt.closeFinally(channel, null);
            return i6;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(channel, th);
                throw th2;
            }
        }
    }
}
