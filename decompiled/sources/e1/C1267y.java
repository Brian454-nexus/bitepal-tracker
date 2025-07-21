package e1;

import android.net.Uri;
import c1.AbstractC1119a;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* renamed from: e1.y, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1267y extends AbstractC1244b {

    /* renamed from: e, reason: collision with root package name */
    public final int f13906e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f13907f;

    /* renamed from: g, reason: collision with root package name */
    public final DatagramPacket f13908g;

    /* renamed from: h, reason: collision with root package name */
    public Uri f13909h;

    /* renamed from: i, reason: collision with root package name */
    public DatagramSocket f13910i;

    /* renamed from: j, reason: collision with root package name */
    public MulticastSocket f13911j;

    /* renamed from: k, reason: collision with root package name */
    public InetAddress f13912k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f13913l;

    /* renamed from: m, reason: collision with root package name */
    public int f13914m;

    /* renamed from: e1.y$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a extends C1249g {
        public a(Throwable th, int i6) {
            super(th, i6);
        }
    }

    public C1267y() {
        this(2000);
    }

    @Override // e1.InterfaceC1248f
    public void close() {
        this.f13909h = null;
        MulticastSocket multicastSocket = this.f13911j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup((InetAddress) AbstractC1119a.e(this.f13912k));
            } catch (IOException unused) {
            }
            this.f13911j = null;
        }
        DatagramSocket datagramSocket = this.f13910i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f13910i = null;
        }
        this.f13912k = null;
        this.f13914m = 0;
        if (this.f13913l) {
            this.f13913l = false;
            u();
        }
    }

    public int d() {
        DatagramSocket datagramSocket = this.f13910i;
        if (datagramSocket == null) {
            return -1;
        }
        return datagramSocket.getLocalPort();
    }

    @Override // e1.InterfaceC1248f
    public Uri getUri() {
        return this.f13909h;
    }

    @Override // e1.InterfaceC1248f
    public long r(C1252j c1252j) {
        Uri uri = c1252j.f13820a;
        this.f13909h = uri;
        String str = (String) AbstractC1119a.e(uri.getHost());
        int port = this.f13909h.getPort();
        v(c1252j);
        try {
            this.f13912k = InetAddress.getByName(str);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f13912k, port);
            if (this.f13912k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f13911j = multicastSocket;
                multicastSocket.joinGroup(this.f13912k);
                this.f13910i = this.f13911j;
            } else {
                this.f13910i = new DatagramSocket(inetSocketAddress);
            }
            this.f13910i.setSoTimeout(this.f13906e);
            this.f13913l = true;
            w(c1252j);
            return -1L;
        } catch (IOException e6) {
            throw new a(e6, 2001);
        } catch (SecurityException e7) {
            throw new a(e7, 2006);
        }
    }

    @Override // Z0.InterfaceC0837i
    public int read(byte[] bArr, int i6, int i7) {
        if (i7 == 0) {
            return 0;
        }
        if (this.f13914m == 0) {
            try {
                ((DatagramSocket) AbstractC1119a.e(this.f13910i)).receive(this.f13908g);
                int length = this.f13908g.getLength();
                this.f13914m = length;
                t(length);
            } catch (SocketTimeoutException e6) {
                throw new a(e6, 2002);
            } catch (IOException e7) {
                throw new a(e7, 2001);
            }
        }
        int length2 = this.f13908g.getLength();
        int i8 = this.f13914m;
        int min = Math.min(i8, i7);
        System.arraycopy(this.f13907f, length2 - i8, bArr, i6, min);
        this.f13914m -= min;
        return min;
    }

    public C1267y(int i6) {
        this(i6, 8000);
    }

    public C1267y(int i6, int i7) {
        super(true);
        this.f13906e = i7;
        byte[] bArr = new byte[i6];
        this.f13907f = bArr;
        this.f13908g = new DatagramPacket(bArr, 0, i6);
    }
}
