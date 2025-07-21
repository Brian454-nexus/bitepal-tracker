package P0;

import android.util.Log;
import java.io.Writer;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class X extends Writer {

    /* renamed from: a, reason: collision with root package name */
    public final String f4098a;

    /* renamed from: b, reason: collision with root package name */
    public StringBuilder f4099b = new StringBuilder(128);

    public X(String str) {
        this.f4098a = str;
    }

    public final void a() {
        if (this.f4099b.length() > 0) {
            Log.d(this.f4098a, this.f4099b.toString());
            StringBuilder sb = this.f4099b;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i6, int i7) {
        for (int i8 = 0; i8 < i7; i8++) {
            char c6 = cArr[i6 + i8];
            if (c6 == '\n') {
                a();
            } else {
                this.f4099b.append(c6);
            }
        }
    }
}
