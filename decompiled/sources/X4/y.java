package X4;

import X4.n;
import android.net.Uri;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class y implements n {

    /* renamed from: b, reason: collision with root package name */
    public static final Set f6320b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* renamed from: a, reason: collision with root package name */
    public final n f6321a;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a implements o {
        @Override // X4.o
        public n d(r rVar) {
            return new y(rVar.d(h.class, InputStream.class));
        }
    }

    public y(n nVar) {
        this.f6321a = nVar;
    }

    @Override // X4.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a a(Uri uri, int i6, int i7, R4.h hVar) {
        return this.f6321a.a(new h(uri.toString()), i6, i7, hVar);
    }

    @Override // X4.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri) {
        return f6320b.contains(uri.getScheme());
    }
}
