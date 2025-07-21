package n0;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: n0.b, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC1810b extends ContentProvider {

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f17453e = {"_display_name", "_size"};

    /* renamed from: f, reason: collision with root package name */
    public static final File f17454f = new File("/");

    /* renamed from: g, reason: collision with root package name */
    public static final HashMap f17455g = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Object f17456a;

    /* renamed from: b, reason: collision with root package name */
    public String f17457b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC0220b f17458c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17459d;

    /* renamed from: n0.b$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {
        public static File[] a(Context context) {
            return context.getExternalMediaDirs();
        }
    }

    /* renamed from: n0.b$b, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface InterfaceC0220b {
        File a(Uri uri);

        Uri b(File file);
    }

    /* renamed from: n0.b$c */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class c implements InterfaceC0220b {

        /* renamed from: a, reason: collision with root package name */
        public final String f17460a;

        /* renamed from: b, reason: collision with root package name */
        public final HashMap f17461b = new HashMap();

        public c(String str) {
            this.f17460a = str;
        }

        @Override // n0.AbstractC1810b.InterfaceC0220b
        public File a(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int indexOf = encodedPath.indexOf(47, 1);
            String decode = Uri.decode(encodedPath.substring(1, indexOf));
            String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
            File file = (File) this.f17461b.get(decode);
            if (file == null) {
                throw new IllegalArgumentException("Unable to find configured root for " + uri);
            }
            File file2 = new File(file, decode2);
            try {
                File canonicalFile = file2.getCanonicalFile();
                if (d(canonicalFile.getPath(), file.getPath())) {
                    return canonicalFile;
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
            }
        }

        @Override // n0.AbstractC1810b.InterfaceC0220b
        public Uri b(File file) {
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry entry = null;
                for (Map.Entry entry2 : this.f17461b.entrySet()) {
                    String path = ((File) entry2.getValue()).getPath();
                    if (d(canonicalPath, path) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry == null) {
                    throw new IllegalArgumentException("Failed to find configured root that contains " + canonicalPath);
                }
                String path2 = ((File) entry.getValue()).getPath();
                return new Uri.Builder().scheme("content").authority(this.f17460a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(path2.endsWith("/") ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1), "/")).build();
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
            }
        }

        public void c(String str, File file) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Name must not be empty");
            }
            try {
                this.f17461b.put(str, file.getCanonicalFile());
            } catch (IOException e6) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e6);
            }
        }

        public final boolean d(String str, String str2) {
            String k6 = AbstractC1810b.k(str);
            String k7 = AbstractC1810b.k(str2);
            if (k6.equals(k7)) {
                return true;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(k7);
            sb.append('/');
            return k6.startsWith(sb.toString());
        }
    }

    public AbstractC1810b() {
        this(0);
    }

    public static File b(File file, String... strArr) {
        for (String str : strArr) {
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    public static Object[] c(Object[] objArr, int i6) {
        Object[] objArr2 = new Object[i6];
        System.arraycopy(objArr, 0, objArr2, 0, i6);
        return objArr2;
    }

    public static String[] d(String[] strArr, int i6) {
        String[] strArr2 = new String[i6];
        System.arraycopy(strArr, 0, strArr2, 0, i6);
        return strArr2;
    }

    public static XmlResourceParser e(Context context, String str, ProviderInfo providerInfo, int i6) {
        if (providerInfo == null) {
            throw new IllegalArgumentException("Couldn't find meta-data for provider with authority " + str);
        }
        if (providerInfo.metaData == null && i6 != 0) {
            Bundle bundle = new Bundle(1);
            providerInfo.metaData = bundle;
            bundle.putInt("android.support.FILE_PROVIDER_PATHS", i6);
        }
        XmlResourceParser loadXmlMetaData = providerInfo.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
        if (loadXmlMetaData != null) {
            return loadXmlMetaData;
        }
        throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
    }

    public static InterfaceC0220b g(Context context, String str, int i6) {
        InterfaceC0220b interfaceC0220b;
        HashMap hashMap = f17455g;
        synchronized (hashMap) {
            try {
                interfaceC0220b = (InterfaceC0220b) hashMap.get(str);
                if (interfaceC0220b == null) {
                    try {
                        try {
                            interfaceC0220b = j(context, str, i6);
                            hashMap.put(str, interfaceC0220b);
                        } catch (IOException e6) {
                            throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e6);
                        }
                    } catch (XmlPullParserException e7) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e7);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC0220b;
    }

    public static Uri h(Context context, String str, File file) {
        return g(context, str, 0).b(file);
    }

    public static int i(String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new IllegalArgumentException("Invalid mode: " + str);
    }

    public static InterfaceC0220b j(Context context, String str, int i6) {
        c cVar = new c(str);
        XmlResourceParser e6 = e(context, str, context.getPackageManager().resolveContentProvider(str, 128), i6);
        while (true) {
            int next = e6.next();
            if (next == 1) {
                return cVar;
            }
            if (next == 2) {
                String name = e6.getName();
                File file = null;
                String attributeValue = e6.getAttributeValue(null, com.amazon.a.a.h.a.f10906a);
                String attributeValue2 = e6.getAttributeValue(null, "path");
                if ("root-path".equals(name)) {
                    file = f17454f;
                } else if ("files-path".equals(name)) {
                    file = context.getFilesDir();
                } else if ("cache-path".equals(name)) {
                    file = context.getCacheDir();
                } else if ("external-path".equals(name)) {
                    file = Environment.getExternalStorageDirectory();
                } else if ("external-files-path".equals(name)) {
                    File[] externalFilesDirs = AbstractC1809a.getExternalFilesDirs(context, null);
                    if (externalFilesDirs.length > 0) {
                        file = externalFilesDirs[0];
                    }
                } else if ("external-cache-path".equals(name)) {
                    File[] externalCacheDirs = AbstractC1809a.getExternalCacheDirs(context);
                    if (externalCacheDirs.length > 0) {
                        file = externalCacheDirs[0];
                    }
                } else if ("external-media-path".equals(name)) {
                    File[] a6 = a.a(context);
                    if (a6.length > 0) {
                        file = a6[0];
                    }
                }
                if (file != null) {
                    cVar.c(attributeValue, b(file, attributeValue2));
                }
            }
        }
    }

    public static String k(String str) {
        return (str.length() <= 0 || str.charAt(str.length() + (-1)) != '/') ? str : str.substring(0, str.length() - 1);
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        String str = providerInfo.authority.split(";")[0];
        synchronized (this.f17456a) {
            this.f17457b = str;
        }
        HashMap hashMap = f17455g;
        synchronized (hashMap) {
            hashMap.remove(str);
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return f().a(uri).delete() ? 1 : 0;
    }

    public final InterfaceC0220b f() {
        InterfaceC0220b interfaceC0220b;
        synchronized (this.f17456a) {
            try {
                y0.b.d(this.f17457b, "mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");
                if (this.f17458c == null) {
                    this.f17458c = g(getContext(), this.f17457b, this.f17459d);
                }
                interfaceC0220b = this.f17458c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC0220b;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        File a6 = f().a(uri);
        int lastIndexOf = a6.getName().lastIndexOf(46);
        if (lastIndexOf < 0) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(a6.getName().substring(lastIndexOf + 1));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public String getTypeAnonymous(Uri uri) {
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) {
        return ParcelFileDescriptor.open(f().a(uri), i(str));
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i6;
        File a6 = f().a(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        if (strArr == null) {
            strArr = f17453e;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i7 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i7] = "_display_name";
                i6 = i7 + 1;
                objArr[i7] = queryParameter == null ? a6.getName() : queryParameter;
            } else if ("_size".equals(str3)) {
                strArr3[i7] = "_size";
                i6 = i7 + 1;
                objArr[i7] = Long.valueOf(a6.length());
            }
            i7 = i6;
        }
        String[] d6 = d(strArr3, i7);
        Object[] c6 = c(objArr, i7);
        MatrixCursor matrixCursor = new MatrixCursor(d6, 1);
        matrixCursor.addRow(c6);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    public AbstractC1810b(int i6) {
        this.f17456a = new Object();
        this.f17459d = i6;
    }
}
