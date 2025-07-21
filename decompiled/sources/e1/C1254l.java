package e1;

import android.net.Uri;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import c1.AbstractC1133o;
import e1.C1254l;
import e1.InterfaceC1248f;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import kotlin.io.ConstantsKt;
import z6.a0;

/* renamed from: e1.l, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class C1254l extends AbstractC1244b implements InterfaceC1248f {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f13855e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f13856f;

    /* renamed from: g, reason: collision with root package name */
    public final int f13857g;

    /* renamed from: h, reason: collision with root package name */
    public final int f13858h;

    /* renamed from: i, reason: collision with root package name */
    public final String f13859i;

    /* renamed from: j, reason: collision with root package name */
    public final C1262t f13860j;

    /* renamed from: k, reason: collision with root package name */
    public final C1262t f13861k;

    /* renamed from: l, reason: collision with root package name */
    public final y6.p f13862l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f13863m;

    /* renamed from: n, reason: collision with root package name */
    public C1252j f13864n;

    /* renamed from: o, reason: collision with root package name */
    public HttpURLConnection f13865o;

    /* renamed from: p, reason: collision with root package name */
    public InputStream f13866p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f13867q;

    /* renamed from: r, reason: collision with root package name */
    public int f13868r;

    /* renamed from: s, reason: collision with root package name */
    public long f13869s;

    /* renamed from: t, reason: collision with root package name */
    public long f13870t;

    /* renamed from: e1.l$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b implements InterfaceC1248f.a {

        /* renamed from: b, reason: collision with root package name */
        public InterfaceC1266x f13872b;

        /* renamed from: c, reason: collision with root package name */
        public y6.p f13873c;

        /* renamed from: d, reason: collision with root package name */
        public String f13874d;

        /* renamed from: g, reason: collision with root package name */
        public boolean f13877g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f13878h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f13879i;

        /* renamed from: a, reason: collision with root package name */
        public final C1262t f13871a = new C1262t();

        /* renamed from: e, reason: collision with root package name */
        public int f13875e = 8000;

        /* renamed from: f, reason: collision with root package name */
        public int f13876f = 8000;

        @Override // e1.InterfaceC1248f.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1254l a() {
            C1254l c1254l = new C1254l(this.f13874d, this.f13875e, this.f13876f, this.f13877g, this.f13878h, this.f13871a, this.f13873c, this.f13879i);
            InterfaceC1266x interfaceC1266x = this.f13872b;
            if (interfaceC1266x != null) {
                c1254l.l(interfaceC1266x);
            }
            return c1254l;
        }

        public b c(boolean z6) {
            this.f13877g = z6;
            return this;
        }

        public b d(Map map) {
            this.f13871a.a(map);
            return this;
        }

        public b e(String str) {
            this.f13874d = str;
            return this;
        }
    }

    /* renamed from: e1.l$c */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class c extends z6.r {

        /* renamed from: a, reason: collision with root package name */
        public final Map f13880a;

        public c(Map map) {
            this.f13880a = map;
        }

        public static /* synthetic */ boolean f(Map.Entry entry) {
            return entry.getKey() != null;
        }

        public static /* synthetic */ boolean g(String str) {
            return str != null;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map a() {
            return this.f13880a;
        }

        public boolean containsKey(Object obj) {
            return obj != null && super.containsKey(obj);
        }

        public boolean containsValue(Object obj) {
            return super.c(obj);
        }

        public Set entrySet() {
            return a0.b(super.entrySet(), new y6.p() { // from class: e1.m
                public final boolean apply(Object obj) {
                    return C1254l.c.f((Map.Entry) obj);
                }
            });
        }

        public boolean equals(Object obj) {
            return obj != null && super.d(obj);
        }

        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public List get(Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) super.get(obj);
        }

        public int hashCode() {
            return super.e();
        }

        public boolean isEmpty() {
            return super.isEmpty() || (super.size() == 1 && super.containsKey((Object) null));
        }

        public Set keySet() {
            return a0.b(super.keySet(), new y6.p() { // from class: e1.n
                public final boolean apply(Object obj) {
                    return C1254l.c.g((String) obj);
                }
            });
        }

        public int size() {
            return super.size() - (super.containsKey((Object) null) ? 1 : 0);
        }
    }

    public static void C(HttpURLConnection httpURLConnection, long j6) {
        if (httpURLConnection != null && AbstractC1117K.f10560a <= 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j6 == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j6 <= 2048) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if (!"com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) && !"com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    return;
                }
                Method declaredMethod = ((Class) AbstractC1119a.e(inputStream.getClass().getSuperclass())).getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, new Object[0]);
            } catch (Exception unused) {
            }
        }
    }

    public static boolean z(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    public final HttpURLConnection A(C1252j c1252j) {
        HttpURLConnection B6;
        URL url = new URL(c1252j.f13820a.toString());
        int i6 = c1252j.f13822c;
        byte[] bArr = c1252j.f13823d;
        long j6 = c1252j.f13826g;
        long j7 = c1252j.f13827h;
        int i7 = 1;
        boolean d6 = c1252j.d(1);
        if (!this.f13855e && !this.f13856f && !this.f13863m) {
            return B(url, i6, bArr, j6, j7, d6, true, c1252j.f13824e);
        }
        int i8 = 0;
        while (true) {
            int i9 = i8 + 1;
            if (i8 > 20) {
                throw new C1259q(new NoRouteToHostException("Too many redirects: " + i9), c1252j, 2001, 1);
            }
            B6 = B(url, i6, bArr, j6, j7, d6, false, c1252j.f13824e);
            int responseCode = B6.getResponseCode();
            String headerField = B6.getHeaderField("Location");
            if ((i6 == i7 || i6 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                B6.disconnect();
                url = y(url, headerField, c1252j);
            } else {
                if (i6 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    break;
                }
                B6.disconnect();
                if (!this.f13863m || responseCode != 302) {
                    bArr = null;
                    i6 = 1;
                }
                url = y(url, headerField, c1252j);
            }
            i8 = i9;
            i7 = 1;
        }
        return B6;
    }

    public final HttpURLConnection B(URL url, int i6, byte[] bArr, long j6, long j7, boolean z6, boolean z7, Map map) {
        HttpURLConnection D6 = D(url);
        D6.setConnectTimeout(this.f13857g);
        D6.setReadTimeout(this.f13858h);
        HashMap hashMap = new HashMap();
        C1262t c1262t = this.f13860j;
        if (c1262t != null) {
            hashMap.putAll(c1262t.b());
        }
        hashMap.putAll(this.f13861k.b());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            D6.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String a6 = AbstractC1263u.a(j6, j7);
        if (a6 != null) {
            D6.setRequestProperty("Range", a6);
        }
        String str = this.f13859i;
        if (str != null) {
            D6.setRequestProperty("User-Agent", str);
        }
        D6.setRequestProperty("Accept-Encoding", z6 ? "gzip" : "identity");
        D6.setInstanceFollowRedirects(z7);
        D6.setDoOutput(bArr != null);
        D6.setRequestMethod(C1252j.c(i6));
        if (bArr == null) {
            D6.connect();
            return D6;
        }
        D6.setFixedLengthStreamingMode(bArr.length);
        D6.connect();
        OutputStream outputStream = D6.getOutputStream();
        outputStream.write(bArr);
        outputStream.close();
        return D6;
    }

    public HttpURLConnection D(URL url) {
        return (HttpURLConnection) url.openConnection();
    }

    public final int E(byte[] bArr, int i6, int i7) {
        if (i7 == 0) {
            return 0;
        }
        long j6 = this.f13869s;
        if (j6 != -1) {
            long j7 = j6 - this.f13870t;
            if (j7 == 0) {
                return -1;
            }
            i7 = (int) Math.min(i7, j7);
        }
        int read = ((InputStream) AbstractC1117K.i(this.f13866p)).read(bArr, i6, i7);
        if (read == -1) {
            return -1;
        }
        this.f13870t += read;
        t(read);
        return read;
    }

    public final void F(long j6, C1252j c1252j) {
        if (j6 == 0) {
            return;
        }
        byte[] bArr = new byte[ConstantsKt.DEFAULT_BLOCK_SIZE];
        while (j6 > 0) {
            int read = ((InputStream) AbstractC1117K.i(this.f13866p)).read(bArr, 0, (int) Math.min(j6, ConstantsKt.DEFAULT_BLOCK_SIZE));
            if (Thread.currentThread().isInterrupted()) {
                throw new C1259q(new InterruptedIOException(), c1252j, 2000, 1);
            }
            if (read == -1) {
                throw new C1259q(c1252j, 2008, 1);
            }
            j6 -= read;
            t(read);
        }
    }

    @Override // e1.InterfaceC1248f
    public void close() {
        try {
            InputStream inputStream = this.f13866p;
            if (inputStream != null) {
                long j6 = this.f13869s;
                long j7 = -1;
                if (j6 != -1) {
                    j7 = j6 - this.f13870t;
                }
                C(this.f13865o, j7);
                try {
                    inputStream.close();
                } catch (IOException e6) {
                    throw new C1259q(e6, (C1252j) AbstractC1117K.i(this.f13864n), 2000, 3);
                }
            }
        } finally {
            this.f13866p = null;
            x();
            if (this.f13867q) {
                this.f13867q = false;
                u();
            }
        }
    }

    @Override // e1.InterfaceC1248f
    public Uri getUri() {
        HttpURLConnection httpURLConnection = this.f13865o;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // e1.InterfaceC1248f
    public Map n() {
        HttpURLConnection httpURLConnection = this.f13865o;
        return httpURLConnection == null ? z6.y.j() : new c(httpURLConnection.getHeaderFields());
    }

    @Override // e1.InterfaceC1248f
    public long r(C1252j c1252j) {
        byte[] bArr;
        this.f13864n = c1252j;
        long j6 = 0;
        this.f13870t = 0L;
        this.f13869s = 0L;
        v(c1252j);
        try {
            HttpURLConnection A6 = A(c1252j);
            this.f13865o = A6;
            this.f13868r = A6.getResponseCode();
            String responseMessage = A6.getResponseMessage();
            int i6 = this.f13868r;
            if (i6 < 200 || i6 > 299) {
                Map<String, List<String>> headerFields = A6.getHeaderFields();
                if (this.f13868r == 416) {
                    if (c1252j.f13826g == AbstractC1263u.c(A6.getHeaderField("Content-Range"))) {
                        this.f13867q = true;
                        w(c1252j);
                        long j7 = c1252j.f13827h;
                        if (j7 != -1) {
                            return j7;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = A6.getErrorStream();
                try {
                    bArr = errorStream != null ? A6.a.b(errorStream) : AbstractC1117K.f10565f;
                } catch (IOException unused) {
                    bArr = AbstractC1117K.f10565f;
                }
                byte[] bArr2 = bArr;
                x();
                throw new C1261s(this.f13868r, responseMessage, this.f13868r == 416 ? new C1249g(2008) : null, headerFields, c1252j, bArr2);
            }
            String contentType = A6.getContentType();
            y6.p pVar = this.f13862l;
            if (pVar != null && !pVar.apply(contentType)) {
                x();
                throw new C1260r(contentType, c1252j);
            }
            if (this.f13868r == 200) {
                long j8 = c1252j.f13826g;
                if (j8 != 0) {
                    j6 = j8;
                }
            }
            boolean z6 = z(A6);
            if (z6) {
                this.f13869s = c1252j.f13827h;
            } else {
                long j9 = c1252j.f13827h;
                if (j9 != -1) {
                    this.f13869s = j9;
                } else {
                    long b6 = AbstractC1263u.b(A6.getHeaderField("Content-Length"), A6.getHeaderField("Content-Range"));
                    this.f13869s = b6 != -1 ? b6 - j6 : -1L;
                }
            }
            try {
                this.f13866p = A6.getInputStream();
                if (z6) {
                    this.f13866p = new GZIPInputStream(this.f13866p);
                }
                this.f13867q = true;
                w(c1252j);
                try {
                    F(j6, c1252j);
                    return this.f13869s;
                } catch (IOException e6) {
                    x();
                    if (e6 instanceof C1259q) {
                        throw ((C1259q) e6);
                    }
                    throw new C1259q(e6, c1252j, 2000, 1);
                }
            } catch (IOException e7) {
                x();
                throw new C1259q(e7, c1252j, 2000, 1);
            }
        } catch (IOException e8) {
            x();
            throw C1259q.c(e8, c1252j, 1);
        }
    }

    @Override // Z0.InterfaceC0837i
    public int read(byte[] bArr, int i6, int i7) {
        try {
            return E(bArr, i6, i7);
        } catch (IOException e6) {
            throw C1259q.c(e6, (C1252j) AbstractC1117K.i(this.f13864n), 2);
        }
    }

    public final void x() {
        HttpURLConnection httpURLConnection = this.f13865o;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e6) {
                AbstractC1133o.d("DefaultHttpDataSource", "Unexpected error while disconnecting", e6);
            }
            this.f13865o = null;
        }
    }

    public final URL y(URL url, String str, C1252j c1252j) {
        if (str == null) {
            throw new C1259q("Null location redirect", c1252j, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new C1259q("Unsupported protocol redirect: " + protocol, c1252j, 2001, 1);
            }
            if (this.f13855e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            if (this.f13856f) {
                try {
                    return new URL(url2.toString().replaceFirst(protocol, url.getProtocol()));
                } catch (MalformedURLException e6) {
                    throw new C1259q(e6, c1252j, 2001, 1);
                }
            }
            throw new C1259q("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", c1252j, 2001, 1);
        } catch (MalformedURLException e7) {
            throw new C1259q(e7, c1252j, 2001, 1);
        }
    }

    public C1254l(String str, int i6, int i7, boolean z6, boolean z7, C1262t c1262t, y6.p pVar, boolean z8) {
        super(true);
        this.f13859i = str;
        this.f13857g = i6;
        this.f13858h = i7;
        this.f13855e = z6;
        this.f13856f = z7;
        if (z6 && z7) {
            throw new IllegalArgumentException("crossProtocolRedirectsForceOriginal should not be set if allowCrossProtocolRedirects is true");
        }
        this.f13860j = c1262t;
        this.f13862l = pVar;
        this.f13861k = new C1262t();
        this.f13863m = z8;
    }
}
