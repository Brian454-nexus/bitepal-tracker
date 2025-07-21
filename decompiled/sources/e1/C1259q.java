package e1;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* renamed from: e1.q, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C1259q extends C1249g {

    /* renamed from: b, reason: collision with root package name */
    public final C1252j f13885b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13886c;

    public C1259q(C1252j c1252j, int i6, int i7) {
        super(b(i6, i7));
        this.f13885b = c1252j;
        this.f13886c = i7;
    }

    public static int b(int i6, int i7) {
        if (i6 == 2000 && i7 == 1) {
            return 2001;
        }
        return i6;
    }

    public static C1259q c(IOException iOException, C1252j c1252j, int i6) {
        String message = iOException.getMessage();
        int i7 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !y6.c.e(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i7 == 2007 ? new C1258p(iOException, c1252j) : new C1259q(iOException, c1252j, i7, i6);
    }

    public C1259q(String str, C1252j c1252j, int i6, int i7) {
        super(str, b(i6, i7));
        this.f13885b = c1252j;
        this.f13886c = i7;
    }

    public C1259q(IOException iOException, C1252j c1252j, int i6, int i7) {
        super(iOException, b(i6, i7));
        this.f13885b = c1252j;
        this.f13886c = i7;
    }

    public C1259q(String str, IOException iOException, C1252j c1252j, int i6, int i7) {
        super(str, iOException, b(i6, i7));
        this.f13885b = c1252j;
        this.f13886c = i7;
    }
}
