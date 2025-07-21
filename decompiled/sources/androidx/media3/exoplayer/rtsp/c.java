package androidx.media3.exoplayer.rtsp;

import Z0.z;
import android.net.Uri;
import android.util.Base64;
import androidx.media3.exoplayer.rtsp.h;
import c1.AbstractC1117K;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f9312a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9313b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9314c;

    /* renamed from: d, reason: collision with root package name */
    public final String f9315d;

    public c(int i6, String str, String str2, String str3) {
        this.f9312a = i6;
        this.f9313b = str;
        this.f9314c = str2;
        this.f9315d = str3;
    }

    public String a(h.a aVar, Uri uri, int i6) {
        int i7 = this.f9312a;
        if (i7 == 1) {
            return b(aVar);
        }
        if (i7 == 2) {
            return c(aVar, uri, i6);
        }
        throw z.d(null, new UnsupportedOperationException());
    }

    public final String b(h.a aVar) {
        return AbstractC1117K.H("Basic %s", Base64.encodeToString(h.d(aVar.f9412a + ":" + aVar.f9413b), 0));
    }

    public final String c(h.a aVar, Uri uri, int i6) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            String t6 = h.t(i6);
            String h12 = AbstractC1117K.h1(messageDigest.digest(h.d(aVar.f9412a + ":" + this.f9313b + ":" + aVar.f9413b)));
            StringBuilder sb = new StringBuilder();
            sb.append(t6);
            sb.append(":");
            sb.append(uri);
            String h13 = AbstractC1117K.h1(messageDigest.digest(h.d(h12 + ":" + this.f9314c + ":" + AbstractC1117K.h1(messageDigest.digest(h.d(sb.toString()))))));
            return this.f9315d.isEmpty() ? AbstractC1117K.H("Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\"", aVar.f9412a, this.f9313b, this.f9314c, uri, h13) : AbstractC1117K.H("Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\", opaque=\"%s\"", aVar.f9412a, this.f9313b, this.f9314c, uri, h13, this.f9315d);
        } catch (NoSuchAlgorithmException e6) {
            throw z.d(null, e6);
        }
    }
}
