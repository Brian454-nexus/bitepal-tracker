package com.bumptech.glide.load.data;

import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class j implements d {

    /* renamed from: g, reason: collision with root package name */
    public static final b f13272g = new a();

    /* renamed from: a, reason: collision with root package name */
    public final X4.h f13273a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13274b;

    /* renamed from: c, reason: collision with root package name */
    public final b f13275c;

    /* renamed from: d, reason: collision with root package name */
    public HttpURLConnection f13276d;

    /* renamed from: e, reason: collision with root package name */
    public InputStream f13277e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f13278f;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a implements b {
        @Override // com.bumptech.glide.load.data.j.b
        public HttpURLConnection a(URL url) {
            return (HttpURLConnection) url.openConnection();
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface b {
        HttpURLConnection a(URL url);
    }

    public j(X4.h hVar, int i6) {
        this(hVar, i6, f13272g);
    }

    public static int f(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e6) {
            if (!Log.isLoggable("HttpUrlFetcher", 3)) {
                return -1;
            }
            Log.d("HttpUrlFetcher", "Failed to get a response code", e6);
            return -1;
        }
    }

    public static boolean h(int i6) {
        return i6 / 100 == 2;
    }

    public static boolean i(int i6) {
        return i6 / 100 == 3;
    }

    @Override // com.bumptech.glide.load.data.d
    public Class a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        InputStream inputStream = this.f13277e;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f13276d;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f13276d = null;
    }

    public final HttpURLConnection c(URL url, Map map) {
        try {
            HttpURLConnection a6 = this.f13275c.a(url);
            for (Map.Entry entry : map.entrySet()) {
                a6.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            a6.setConnectTimeout(this.f13274b);
            a6.setReadTimeout(this.f13274b);
            a6.setUseCaches(false);
            a6.setDoInput(true);
            a6.setInstanceFollowRedirects(false);
            return a6;
        } catch (IOException e6) {
            throw new R4.e("URL.openConnection threw", 0, e6);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
        this.f13278f = true;
    }

    @Override // com.bumptech.glide.load.data.d
    public R4.a d() {
        return R4.a.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.d
    public void e(com.bumptech.glide.g gVar, d.a aVar) {
        long b6 = n5.g.b();
        try {
            try {
                aVar.f(j(this.f13273a.h(), 0, null, this.f13273a.e()));
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + n5.g.a(b6));
                }
            } catch (IOException e6) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e6);
                }
                aVar.c(e6);
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + n5.g.a(b6));
                }
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + n5.g.a(b6));
            }
            throw th;
        }
    }

    public final InputStream g(HttpURLConnection httpURLConnection) {
        try {
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.f13277e = n5.c.c(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection.getContentEncoding());
                }
                this.f13277e = httpURLConnection.getInputStream();
            }
            return this.f13277e;
        } catch (IOException e6) {
            throw new R4.e("Failed to obtain InputStream", f(httpURLConnection), e6);
        }
    }

    public final InputStream j(URL url, int i6, URL url2, Map map) {
        if (i6 >= 5) {
            throw new R4.e("Too many (> 5) redirects!", -1);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new R4.e("In re-direct loop", -1);
                }
            } catch (URISyntaxException unused) {
            }
        }
        HttpURLConnection c6 = c(url, map);
        this.f13276d = c6;
        try {
            c6.connect();
            this.f13277e = this.f13276d.getInputStream();
            if (this.f13278f) {
                return null;
            }
            int f6 = f(this.f13276d);
            if (h(f6)) {
                return g(this.f13276d);
            }
            if (!i(f6)) {
                if (f6 == -1) {
                    throw new R4.e(f6);
                }
                try {
                    throw new R4.e(this.f13276d.getResponseMessage(), f6);
                } catch (IOException e6) {
                    throw new R4.e("Failed to get a response message", f6, e6);
                }
            }
            String headerField = this.f13276d.getHeaderField("Location");
            if (TextUtils.isEmpty(headerField)) {
                throw new R4.e("Received empty or null redirect url", f6);
            }
            try {
                URL url3 = new URL(url, headerField);
                b();
                return j(url3, i6 + 1, url, map);
            } catch (MalformedURLException e7) {
                throw new R4.e("Bad redirect url: " + headerField, f6, e7);
            }
        } catch (IOException e8) {
            throw new R4.e("Failed to connect or obtain data", f(this.f13276d), e8);
        }
    }

    public j(X4.h hVar, int i6, b bVar) {
        this.f13273a = hVar;
        this.f13274b = i6;
        this.f13275c = bVar;
    }
}
