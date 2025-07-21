package B1;

import A1.l;
import android.os.SystemClock;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.ConcurrentModificationException;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f270a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f271b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static boolean f272c = false;

    /* renamed from: d, reason: collision with root package name */
    public static long f273d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static String f274e = "time.android.com";

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface b {
        void a(IOException iOException);

        void b();
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c implements l.b {

        /* renamed from: a, reason: collision with root package name */
        public final b f275a;

        public c(b bVar) {
            this.f275a = bVar;
        }

        @Override // A1.l.b
        public void j(l.e eVar, long j6, long j7) {
            if (this.f275a != null) {
                if (a.k()) {
                    this.f275a.b();
                } else {
                    this.f275a.a(new IOException(new ConcurrentModificationException()));
                }
            }
        }

        @Override // A1.l.b
        public l.c q(l.e eVar, long j6, long j7, IOException iOException, int i6) {
            b bVar = this.f275a;
            if (bVar != null) {
                bVar.a(iOException);
            }
            return l.f139f;
        }

        @Override // A1.l.b
        public void u(l.e eVar, long j6, long j7, boolean z6) {
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class d implements l.e {
        public d() {
        }

        @Override // A1.l.e
        public void a() {
            synchronized (a.f270a) {
                synchronized (a.f271b) {
                    if (a.f272c) {
                        return;
                    }
                    long e6 = a.e();
                    synchronized (a.f271b) {
                        long unused = a.f273d = e6;
                        boolean unused2 = a.f272c = true;
                    }
                }
            }
        }

        @Override // A1.l.e
        public void c() {
        }
    }

    public static /* synthetic */ long e() {
        return l();
    }

    public static void g(byte b6, byte b7, int i6, long j6) {
        if (b6 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b7 != 4 && b7 != 5) {
            throw new IOException("SNTP: Untrusted mode: " + ((int) b7));
        }
        if (i6 != 0 && i6 <= 15) {
            if (j6 == 0) {
                throw new IOException("SNTP: Zero transmitTime");
            }
        } else {
            throw new IOException("SNTP: Untrusted stratum: " + i6);
        }
    }

    public static long h() {
        long j6;
        synchronized (f271b) {
            try {
                j6 = f272c ? f273d : -9223372036854775807L;
            } catch (Throwable th) {
                throw th;
            }
        }
        return j6;
    }

    public static String i() {
        String str;
        synchronized (f271b) {
            str = f274e;
        }
        return str;
    }

    public static void j(l lVar, b bVar) {
        if (k()) {
            if (bVar != null) {
                bVar.b();
            }
        } else {
            if (lVar == null) {
                lVar = new l("SntpClient");
            }
            lVar.n(new d(), new c(bVar), 1);
        }
    }

    public static boolean k() {
        boolean z6;
        synchronized (f271b) {
            z6 = f272c;
        }
        return z6;
    }

    public static long l() {
        InetAddress byName = InetAddress.getByName(i());
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(10000);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = 27;
            long currentTimeMillis = System.currentTimeMillis();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            o(bArr, 40, currentTimeMillis);
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            long j6 = currentTimeMillis + (elapsedRealtime2 - elapsedRealtime);
            byte b6 = bArr[0];
            int i6 = bArr[1] & 255;
            long n6 = n(bArr, 24);
            long n7 = n(bArr, 32);
            long n8 = n(bArr, 40);
            g((byte) ((b6 >> 6) & 3), (byte) (b6 & 7), i6, n8);
            long j7 = (j6 + (((n7 - n6) + (n8 - j6)) / 2)) - elapsedRealtime2;
            datagramSocket.close();
            return j7;
        } catch (Throwable th) {
            try {
                datagramSocket.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static long m(byte[] bArr, int i6) {
        int i7 = bArr[i6];
        int i8 = bArr[i6 + 1];
        int i9 = bArr[i6 + 2];
        int i10 = bArr[i6 + 3];
        if ((i7 & 128) == 128) {
            i7 = (i7 & 127) + 128;
        }
        if ((i8 & 128) == 128) {
            i8 = (i8 & 127) + 128;
        }
        if ((i9 & 128) == 128) {
            i9 = (i9 & 127) + 128;
        }
        if ((i10 & 128) == 128) {
            i10 = (i10 & 127) + 128;
        }
        return (i7 << 24) + (i8 << 16) + (i9 << 8) + i10;
    }

    public static long n(byte[] bArr, int i6) {
        long m6 = m(bArr, i6);
        long m7 = m(bArr, i6 + 4);
        if (m6 == 0 && m7 == 0) {
            return 0L;
        }
        return ((m6 - 2208988800L) * 1000) + ((m7 * 1000) / 4294967296L);
    }

    public static void o(byte[] bArr, int i6, long j6) {
        if (j6 == 0) {
            Arrays.fill(bArr, i6, i6 + 8, (byte) 0);
            return;
        }
        long j7 = j6 / 1000;
        long j8 = j6 - (j7 * 1000);
        bArr[i6] = (byte) (r2 >> 24);
        bArr[i6 + 1] = (byte) (r2 >> 16);
        bArr[i6 + 2] = (byte) (r2 >> 8);
        bArr[i6 + 3] = (byte) (j7 + 2208988800L);
        long j9 = (j8 * 4294967296L) / 1000;
        bArr[i6 + 4] = (byte) (j9 >> 24);
        bArr[i6 + 5] = (byte) (j9 >> 16);
        bArr[i6 + 6] = (byte) (j9 >> 8);
        bArr[i6 + 7] = (byte) (Math.random() * 255.0d);
    }
}
