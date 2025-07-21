package androidx.media3.exoplayer.rtsp;

import A1.l;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.media3.exoplayer.rtsp.g;
import c1.AbstractC1119a;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import z6.w;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class g implements Closeable {

    /* renamed from: g, reason: collision with root package name */
    public static final Charset f9385g = y6.e.c;

    /* renamed from: a, reason: collision with root package name */
    public final d f9386a;

    /* renamed from: b, reason: collision with root package name */
    public final A1.l f9387b = new A1.l("ExoPlayer:RtspMessageChannel:ReceiverLoader");

    /* renamed from: c, reason: collision with root package name */
    public final Map f9388c = Collections.synchronizedMap(new HashMap());

    /* renamed from: d, reason: collision with root package name */
    public C0141g f9389d;

    /* renamed from: e, reason: collision with root package name */
    public Socket f9390e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f9391f;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface b {
        void f(byte[] bArr);
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class c implements l.b {
        public c() {
        }

        @Override // A1.l.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void u(f fVar, long j6, long j7, boolean z6) {
        }

        @Override // A1.l.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void j(f fVar, long j6, long j7) {
        }

        @Override // A1.l.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public l.c q(f fVar, long j6, long j7, IOException iOException, int i6) {
            if (!g.this.f9391f) {
                g.this.f9386a.a(iOException);
            }
            return A1.l.f139f;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface d {
        default void a(Exception exc) {
        }

        default void b(List list, Exception exc) {
        }

        void c(List list);
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final List f9393a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public int f9394b = 1;

        /* renamed from: c, reason: collision with root package name */
        public long f9395c;

        public static byte[] d(byte b6, DataInputStream dataInputStream) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = {b6, dataInputStream.readByte()};
            byteArrayOutputStream.write(bArr);
            while (true) {
                if (bArr[0] == 13 && bArr[1] == 10) {
                    return byteArrayOutputStream.toByteArray();
                }
                bArr[0] = bArr[1];
                byte readByte = dataInputStream.readByte();
                bArr[1] = readByte;
                byteArrayOutputStream.write(readByte);
            }
        }

        public final w a(byte[] bArr) {
            AbstractC1119a.g(this.f9394b == 3);
            if (bArr.length <= 0 || bArr[bArr.length - 1] != 10) {
                throw new IllegalArgumentException("Message body is empty or does not end with a LF.");
            }
            this.f9393a.add((bArr.length <= 1 || bArr[bArr.length + (-2)] != 13) ? new String(bArr, 0, bArr.length - 1, g.f9385g) : new String(bArr, 0, bArr.length - 2, g.f9385g));
            w s6 = w.s(this.f9393a);
            e();
            return s6;
        }

        public final w b(byte[] bArr) {
            AbstractC1119a.a(bArr.length >= 2 && bArr[bArr.length - 2] == 13 && bArr[bArr.length - 1] == 10);
            String str = new String(bArr, 0, bArr.length - 2, g.f9385g);
            this.f9393a.add(str);
            int i6 = this.f9394b;
            if (i6 == 1) {
                if (!h.f(str)) {
                    return null;
                }
                this.f9394b = 2;
                return null;
            }
            if (i6 != 2) {
                throw new IllegalStateException();
            }
            long g6 = h.g(str);
            if (g6 != -1) {
                this.f9395c = g6;
            }
            if (!str.isEmpty()) {
                return null;
            }
            if (this.f9395c > 0) {
                this.f9394b = 3;
                return null;
            }
            w s6 = w.s(this.f9393a);
            e();
            return s6;
        }

        public w c(byte b6, DataInputStream dataInputStream) {
            w b7 = b(d(b6, dataInputStream));
            while (b7 == null) {
                if (this.f9394b == 3) {
                    long j6 = this.f9395c;
                    if (j6 <= 0) {
                        throw new IllegalStateException("Expects a greater than zero Content-Length.");
                    }
                    int d6 = C6.g.d(j6);
                    AbstractC1119a.g(d6 != -1);
                    byte[] bArr = new byte[d6];
                    dataInputStream.readFully(bArr, 0, d6);
                    b7 = a(bArr);
                } else {
                    b7 = b(d(dataInputStream.readByte(), dataInputStream));
                }
            }
            return b7;
        }

        public final void e() {
            this.f9393a.clear();
            this.f9394b = 1;
            this.f9395c = 0L;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class f implements l.e {

        /* renamed from: a, reason: collision with root package name */
        public final DataInputStream f9396a;

        /* renamed from: b, reason: collision with root package name */
        public final e f9397b = new e();

        /* renamed from: c, reason: collision with root package name */
        public volatile boolean f9398c;

        public f(InputStream inputStream) {
            this.f9396a = new DataInputStream(inputStream);
        }

        @Override // A1.l.e
        public void a() {
            while (!this.f9398c) {
                byte readByte = this.f9396a.readByte();
                if (readByte == 36) {
                    b();
                } else {
                    d(readByte);
                }
            }
        }

        public final void b() {
            int readUnsignedByte = this.f9396a.readUnsignedByte();
            int readUnsignedShort = this.f9396a.readUnsignedShort();
            byte[] bArr = new byte[readUnsignedShort];
            this.f9396a.readFully(bArr, 0, readUnsignedShort);
            b bVar = (b) g.this.f9388c.get(Integer.valueOf(readUnsignedByte));
            if (bVar == null || g.this.f9391f) {
                return;
            }
            bVar.f(bArr);
        }

        @Override // A1.l.e
        public void c() {
            this.f9398c = true;
        }

        public final void d(byte b6) {
            if (g.this.f9391f) {
                return;
            }
            g.this.f9386a.c(this.f9397b.c(b6, this.f9396a));
        }
    }

    /* renamed from: androidx.media3.exoplayer.rtsp.g$g, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public final class C0141g implements Closeable {

        /* renamed from: a, reason: collision with root package name */
        public final OutputStream f9400a;

        /* renamed from: b, reason: collision with root package name */
        public final HandlerThread f9401b;

        /* renamed from: c, reason: collision with root package name */
        public final Handler f9402c;

        public C0141g(OutputStream outputStream) {
            this.f9400a = outputStream;
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:RtspMessageChannel:Sender");
            this.f9401b = handlerThread;
            handlerThread.start();
            this.f9402c = new Handler(handlerThread.getLooper());
        }

        public static /* synthetic */ void a(C0141g c0141g, byte[] bArr, List list) {
            c0141g.getClass();
            try {
                c0141g.f9400a.write(bArr);
            } catch (Exception e6) {
                if (g.this.f9391f) {
                    return;
                }
                g.this.f9386a.b(list, e6);
            }
        }

        public void c(final List list) {
            final byte[] b6 = h.b(list);
            this.f9402c.post(new Runnable() { // from class: s1.p
                @Override // java.lang.Runnable
                public final void run() {
                    g.C0141g.a(g.C0141g.this, b6, list);
                }
            });
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Handler handler = this.f9402c;
            final HandlerThread handlerThread = this.f9401b;
            Objects.requireNonNull(handlerThread);
            handler.post(new Runnable() { // from class: s1.o
                @Override // java.lang.Runnable
                public final void run() {
                    handlerThread.quit();
                }
            });
            try {
                this.f9401b.join();
            } catch (InterruptedException unused) {
                this.f9401b.interrupt();
            }
        }
    }

    public g(d dVar) {
        this.f9386a = dVar;
    }

    public void I(Socket socket) {
        this.f9390e = socket;
        this.f9389d = new C0141g(socket.getOutputStream());
        this.f9387b.n(new f(socket.getInputStream()), new c(), 0);
    }

    public void P(int i6, b bVar) {
        this.f9388c.put(Integer.valueOf(i6), bVar);
    }

    public void R(List list) {
        AbstractC1119a.i(this.f9389d);
        this.f9389d.c(list);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f9391f) {
            return;
        }
        try {
            C0141g c0141g = this.f9389d;
            if (c0141g != null) {
                c0141g.close();
            }
            this.f9387b.l();
            Socket socket = this.f9390e;
            if (socket != null) {
                socket.close();
            }
            this.f9391f = true;
        } catch (Throwable th) {
            this.f9391f = true;
            throw th;
        }
    }
}
