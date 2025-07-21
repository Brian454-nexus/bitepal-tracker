package A2;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.Closeable;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface g extends Closeable {
    void B();

    void C(String str, Object[] objArr);

    void E();

    int F(String str, int i6, ContentValues contentValues, String str2, Object[] objArr);

    Cursor K(String str);

    void M();

    String U();

    boolean W();

    boolean d0();

    Cursor g0(j jVar);

    void h();

    boolean isOpen();

    List m();

    void n(String str);

    k q(String str);

    Cursor u(j jVar, CancellationSignal cancellationSignal);
}
