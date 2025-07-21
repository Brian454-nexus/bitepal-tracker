package m1;

import android.net.Uri;
import c1.AbstractC1119a;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: m1.e, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1798e {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f17244a;

    /* renamed from: m1.e$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a extends LinkedHashMap {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f17245a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i6, float f6, boolean z6, int i7) {
            super(i6, f6, z6);
            this.f17245a = i7;
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry entry) {
            return size() > this.f17245a;
        }
    }

    public C1798e(int i6) {
        this.f17244a = new a(i6 + 1, 1.0f, false, i6);
    }

    public byte[] a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return (byte[]) this.f17244a.get(uri);
    }

    public byte[] b(Uri uri, byte[] bArr) {
        return (byte[]) this.f17244a.put((Uri) AbstractC1119a.e(uri), (byte[]) AbstractC1119a.e(bArr));
    }

    public byte[] c(Uri uri) {
        return (byte[]) this.f17244a.remove(AbstractC1119a.e(uri));
    }
}
