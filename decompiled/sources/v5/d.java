package v5;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.appsflyer.AdRevenueScheme;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import v5.d;
import w5.n;
import w5.o;
import w5.p;
import w5.q;
import w5.r;
import w5.s;
import w5.t;
import w5.u;
import w5.v;
import w5.w;
import w5.x;
import x5.h;
import x5.i;
import y5.f;
import y5.g;
import y5.m;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class d implements m {

    /* renamed from: a, reason: collision with root package name */
    public final w7.a f19667a;

    /* renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f19668b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f19669c;

    /* renamed from: d, reason: collision with root package name */
    public final URL f19670d;

    /* renamed from: e, reason: collision with root package name */
    public final H5.a f19671e;

    /* renamed from: f, reason: collision with root package name */
    public final H5.a f19672f;

    /* renamed from: g, reason: collision with root package name */
    public final int f19673g;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final URL f19674a;

        /* renamed from: b, reason: collision with root package name */
        public final n f19675b;

        /* renamed from: c, reason: collision with root package name */
        public final String f19676c;

        public a(URL url, n nVar, String str) {
            this.f19674a = url;
            this.f19675b = nVar;
            this.f19676c = str;
        }

        public a a(URL url) {
            return new a(url, this.f19675b, this.f19676c);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f19677a;

        /* renamed from: b, reason: collision with root package name */
        public final URL f19678b;

        /* renamed from: c, reason: collision with root package name */
        public final long f19679c;

        public b(int i6, URL url, long j6) {
            this.f19677a = i6;
            this.f19678b = url;
            this.f19679c = j6;
        }
    }

    public d(Context context, H5.a aVar, H5.a aVar2, int i6) {
        this.f19667a = n.b();
        this.f19669c = context;
        this.f19668b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f19670d = n(v5.a.f19658c);
        this.f19671e = aVar2;
        this.f19672f = aVar;
        this.f19673g = i6;
    }

    public static /* synthetic */ a d(a aVar, b bVar) {
        URL url = bVar.f19678b;
        if (url == null) {
            return null;
        }
        B5.a.a("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.a(bVar.f19678b);
    }

    public static String f(Context context) {
        String simOperator = k(context).getSimOperator();
        return simOperator != null ? simOperator : "";
    }

    public static int g(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return w.b.UNKNOWN_MOBILE_SUBTYPE.b();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return w.b.COMBINED.b();
        }
        if (w.b.a(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    public static int h(NetworkInfo networkInfo) {
        return networkInfo == null ? w.c.NONE.b() : networkInfo.getType();
    }

    public static int i(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e6) {
            B5.a.c("CctTransportBackend", "Unable to find version code for package", e6);
            return -1;
        }
    }

    public static TelephonyManager k(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    public static long l() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    public static InputStream m(InputStream inputStream, String str) {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    public static URL n(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e6) {
            throw new IllegalArgumentException("Invalid url: " + str, e6);
        }
    }

    @Override // y5.m
    public i a(i iVar) {
        NetworkInfo activeNetworkInfo = this.f19668b.getActiveNetworkInfo();
        return iVar.p().a("sdk-version", Build.VERSION.SDK_INT).c("model", Build.MODEL).c("hardware", Build.HARDWARE).c("device", Build.DEVICE).c("product", Build.PRODUCT).c("os-uild", Build.ID).c("manufacturer", Build.MANUFACTURER).c("fingerprint", Build.FINGERPRINT).b("tz-offset", l()).a("net-type", h(activeNetworkInfo)).a("mobile-subtype", g(activeNetworkInfo)).c(AdRevenueScheme.COUNTRY, Locale.getDefault().getCountry()).c("locale", Locale.getDefault().getLanguage()).c("mcc_mnc", f(this.f19669c)).c("application_build", Integer.toString(i(this.f19669c))).d();
    }

    @Override // y5.m
    public g b(f fVar) {
        n j6 = j(fVar);
        URL url = this.f19670d;
        if (fVar.c() != null) {
            try {
                v5.a c6 = v5.a.c(fVar.c());
                r3 = c6.d() != null ? c6.d() : null;
                if (c6.e() != null) {
                    url = n(c6.e());
                }
            } catch (IllegalArgumentException unused) {
                return g.a();
            }
        }
        try {
            b bVar = (b) C5.b.a(5, new a(url, j6, r3), new C5.a() { // from class: v5.b
                @Override // C5.a
                public final Object apply(Object obj) {
                    d.b e6;
                    e6 = d.this.e((d.a) obj);
                    return e6;
                }
            }, new C5.c() { // from class: v5.c
                @Override // C5.c
                public final Object a(Object obj, Object obj2) {
                    return d.d((d.a) obj, (d.b) obj2);
                }
            });
            int i6 = bVar.f19677a;
            if (i6 == 200) {
                return g.e(bVar.f19679c);
            }
            if (i6 < 500 && i6 != 404) {
                return i6 == 400 ? g.d() : g.a();
            }
            return g.f();
        } catch (IOException e6) {
            B5.a.c("CctTransportBackend", "Could not make request to the backend", e6);
            return g.f();
        }
    }

    public final b e(a aVar) {
        B5.a.e("CctTransportBackend", "Making request to: %s", aVar.f19674a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f19674a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f19673g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.3.0"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f19676c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.f19667a.a(aVar.f19675b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    B5.a.e("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                    B5.a.a("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    B5.a.a("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream m6 = m(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                        try {
                            b bVar = new b(responseCode, null, v.b(new BufferedReader(new InputStreamReader(m6))).c());
                            if (m6 != null) {
                                m6.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bVar;
                        } finally {
                        }
                    } catch (Throwable th) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } finally {
                }
            } catch (Throwable th3) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (ConnectException e6) {
            e = e6;
            B5.a.c("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (UnknownHostException e7) {
            e = e7;
            B5.a.c("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (w7.c e8) {
            e = e8;
            B5.a.c("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        } catch (IOException e9) {
            e = e9;
            B5.a.c("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        }
    }

    public final n j(f fVar) {
        t.a l6;
        HashMap hashMap = new HashMap();
        for (i iVar : fVar.b()) {
            String n6 = iVar.n();
            if (hashMap.containsKey(n6)) {
                ((List) hashMap.get(n6)).add(iVar);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(iVar);
                hashMap.put(n6, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            i iVar2 = (i) ((List) entry.getValue()).get(0);
            u.a b6 = u.a().f(x.DEFAULT).g(this.f19672f.a()).h(this.f19671e.a()).b(o.a().c(o.b.ANDROID_FIREBASE).b(w5.a.a().m(Integer.valueOf(iVar2.i("sdk-version"))).j(iVar2.b("model")).f(iVar2.b("hardware")).d(iVar2.b("device")).l(iVar2.b("product")).k(iVar2.b("os-uild")).h(iVar2.b("manufacturer")).e(iVar2.b("fingerprint")).c(iVar2.b(AdRevenueScheme.COUNTRY)).g(iVar2.b("locale")).i(iVar2.b("mcc_mnc")).b(iVar2.b("application_build")).a()).a());
            try {
                b6.i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                b6.j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (i iVar3 : (List) entry.getValue()) {
                h e6 = iVar3.e();
                u5.c b7 = e6.b();
                if (b7.equals(u5.c.b("proto"))) {
                    l6 = t.l(e6.a());
                } else if (b7.equals(u5.c.b("json"))) {
                    l6 = t.k(new String(e6.a(), Charset.forName("UTF-8")));
                } else {
                    B5.a.f("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", b7);
                }
                l6.d(iVar3.f()).e(iVar3.o()).j(iVar3.j("tz-offset")).g(w.a().c(w.c.a(iVar3.i("net-type"))).b(w.b.a(iVar3.i("mobile-subtype"))).a());
                if (iVar3.d() != null) {
                    l6.c(iVar3.d());
                }
                if (iVar3.l() != null) {
                    l6.b(p.a().b(s.a().b(r.a().b(iVar3.l()).a()).a()).c(p.b.EVENT_OVERRIDE).a());
                }
                if (iVar3.g() != null || iVar3.h() != null) {
                    q.a a6 = q.a();
                    if (iVar3.g() != null) {
                        a6.b(iVar3.g());
                    }
                    if (iVar3.h() != null) {
                        a6.c(iVar3.h());
                    }
                    l6.f(a6.a());
                }
                arrayList3.add(l6.a());
            }
            b6.c(arrayList3);
            arrayList2.add(b6.a());
        }
        return n.a(arrayList2);
    }

    public d(Context context, H5.a aVar, H5.a aVar2) {
        this(context, aVar, aVar2, 130000);
    }
}
