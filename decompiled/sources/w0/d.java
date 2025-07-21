package w0;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import p0.AbstractC1890d;
import w0.j;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final j0.j f19688a = new j0.j(2);

    /* renamed from: b, reason: collision with root package name */
    public static final Comparator f19689b = new Comparator() { // from class: w0.c
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return d.a((byte[]) obj, (byte[]) obj2);
        }
    };

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface a {
        static a a(Context context, Uri uri) {
            return new b(context, uri);
        }

        Cursor b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal);

        void close();
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public final ContentProviderClient f19690a;

        public b(Context context, Uri uri) {
            this.f19690a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override // w0.d.a
        public Cursor b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.f19690a;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException e6) {
                Log.w("FontsProvider", "Unable to query the content provider", e6);
                return null;
            }
        }

        @Override // w0.d.a
        public void close() {
            ContentProviderClient contentProviderClient = this.f19690a;
            if (contentProviderClient != null) {
                contentProviderClient.close();
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public String f19691a;

        /* renamed from: b, reason: collision with root package name */
        public String f19692b;

        /* renamed from: c, reason: collision with root package name */
        public List f19693c;

        public c(String str, String str2, List list) {
            this.f19691a = str;
            this.f19692b = str2;
            this.f19693c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Objects.equals(this.f19691a, cVar.f19691a) && Objects.equals(this.f19692b, cVar.f19692b) && Objects.equals(this.f19693c, cVar.f19693c);
        }

        public int hashCode() {
            return Objects.hash(this.f19691a, this.f19692b, this.f19693c);
        }
    }

    public static /* synthetic */ int a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i6 = 0; i6 < bArr.length; i6++) {
            byte b6 = bArr[i6];
            byte b7 = bArr2[i6];
            if (b6 != b7) {
                return b6 - b7;
            }
        }
        return 0;
    }

    public static List b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    public static boolean c(List list, List list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i6 = 0; i6 < list.size(); i6++) {
            if (!Arrays.equals((byte[]) list.get(i6), (byte[]) list2.get(i6))) {
                return false;
            }
        }
        return true;
    }

    public static List d(e eVar, Resources resources) {
        return eVar.b() != null ? eVar.b() : AbstractC1890d.c(resources, eVar.c());
    }

    public static j.a e(Context context, List list, CancellationSignal cancellationSignal) {
        G2.a.c("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i6 = 0; i6 < list.size(); i6++) {
                e eVar = (e) list.get(i6);
                ProviderInfo f6 = f(context.getPackageManager(), eVar, context.getResources());
                if (f6 == null) {
                    return j.a.b(1, null);
                }
                arrayList.add(g(context, eVar, f6.authority, cancellationSignal));
            }
            return j.a.a(0, arrayList);
        } finally {
            G2.a.f();
        }
    }

    public static ProviderInfo f(PackageManager packageManager, e eVar, Resources resources) {
        G2.a.c("FontProvider.getProvider");
        try {
            List d6 = d(eVar, resources);
            c cVar = new c(eVar.e(), eVar.f(), d6);
            ProviderInfo providerInfo = (ProviderInfo) f19688a.get(cVar);
            if (providerInfo != null) {
                return providerInfo;
            }
            String e6 = eVar.e();
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(e6, 0);
            if (resolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + e6);
            }
            if (!resolveContentProvider.packageName.equals(eVar.f())) {
                throw new PackageManager.NameNotFoundException("Found content provider " + e6 + ", but package was not " + eVar.f());
            }
            List b6 = b(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(b6, f19689b);
            for (int i6 = 0; i6 < d6.size(); i6++) {
                ArrayList arrayList = new ArrayList((Collection) d6.get(i6));
                Collections.sort(arrayList, f19689b);
                if (c(b6, arrayList)) {
                    f19688a.put(cVar, resolveContentProvider);
                    return resolveContentProvider;
                }
            }
            G2.a.f();
            return null;
        } finally {
            G2.a.f();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v2, types: [w0.d$a] */
    public static j.b[] g(Context context, e eVar, String str, CancellationSignal cancellationSignal) {
        ?? r16;
        a aVar;
        a aVar2;
        Uri withAppendedId;
        boolean z6;
        G2.a.c("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            a a6 = a.a(context, build);
            Cursor cursor = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                G2.a.c("ContentQueryWrapper.query");
                try {
                    try {
                        cursor = a6.b(build, strArr, "query = ?", new String[]{eVar.g()}, null, cancellationSignal);
                        if (cursor == null || cursor.getCount() <= 0) {
                            aVar = a6;
                        } else {
                            int columnIndex = cursor.getColumnIndex("result_code");
                            ArrayList arrayList2 = new ArrayList();
                            int columnIndex2 = cursor.getColumnIndex("_id");
                            int columnIndex3 = cursor.getColumnIndex("file_id");
                            int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                            int columnIndex5 = cursor.getColumnIndex("font_weight");
                            int columnIndex6 = cursor.getColumnIndex("font_italic");
                            while (cursor.moveToNext()) {
                                int i6 = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                                int i7 = columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0;
                                if (columnIndex3 == -1) {
                                    aVar2 = a6;
                                    withAppendedId = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                                } else {
                                    aVar2 = a6;
                                    withAppendedId = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                                }
                                int i8 = columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400;
                                if (columnIndex6 != -1) {
                                    z6 = true;
                                    if (cursor.getInt(columnIndex6) == 1) {
                                        arrayList2.add(j.b.a(withAppendedId, i7, i8, z6, i6));
                                        a6 = aVar2;
                                    }
                                }
                                z6 = false;
                                arrayList2.add(j.b.a(withAppendedId, i7, i8, z6, i6));
                                a6 = aVar2;
                            }
                            aVar = a6;
                            arrayList = arrayList2;
                        }
                        if (cursor != null) {
                            cursor.close();
                        }
                        aVar.close();
                        return (j.b[]) arrayList.toArray(new j.b[0]);
                    } finally {
                    }
                } catch (Throwable th) {
                    th = th;
                    r16 = context;
                    if (cursor != null) {
                        cursor.close();
                    }
                    r16.close();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                r16 = a6;
            }
        } finally {
            G2.a.f();
        }
    }
}
