package e1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import c1.AbstractC1117K;
import c1.AbstractC1119a;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.List;

/* renamed from: e1.v, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1264v extends AbstractC1244b {

    /* renamed from: e, reason: collision with root package name */
    public final Context f13896e;

    /* renamed from: f, reason: collision with root package name */
    public C1252j f13897f;

    /* renamed from: g, reason: collision with root package name */
    public AssetFileDescriptor f13898g;

    /* renamed from: h, reason: collision with root package name */
    public InputStream f13899h;

    /* renamed from: i, reason: collision with root package name */
    public long f13900i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f13901j;

    /* renamed from: e1.v$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a extends C1249g {
        public a(String str) {
            super(str, null, 2000);
        }

        public a(String str, Throwable th, int i6) {
            super(str, th, i6);
        }
    }

    public C1264v(Context context) {
        super(false);
        this.f13896e = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i6) {
        return Uri.parse("rawresource:///" + i6);
    }

    public static AssetFileDescriptor x(Context context, C1252j c1252j) {
        Resources resourcesForApplication;
        int identifier;
        Uri normalizeScheme = c1252j.f13820a.normalizeScheme();
        if (TextUtils.equals("rawresource", normalizeScheme.getScheme())) {
            resourcesForApplication = context.getResources();
            List<String> pathSegments = normalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new a("rawresource:// URI must have exactly one path element, found " + pathSegments.size());
            }
            identifier = y(pathSegments.get(0));
        } else {
            if (!TextUtils.equals("android.resource", normalizeScheme.getScheme())) {
                throw new a("Unsupported URI scheme (" + normalizeScheme.getScheme() + "). Only android.resource is supported.", null, 1004);
            }
            String str = (String) AbstractC1119a.e(normalizeScheme.getPath());
            if (str.startsWith("/")) {
                str = str.substring(1);
            }
            String packageName = TextUtils.isEmpty(normalizeScheme.getHost()) ? context.getPackageName() : normalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e6) {
                    throw new a("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e6, 2005);
                }
            }
            if (str.matches("\\d+")) {
                identifier = y(str);
            } else {
                identifier = resourcesForApplication.getIdentifier(packageName + ":" + str, "raw", null);
                if (identifier == 0) {
                    throw new a("Resource not found.", null, 2005);
                }
            }
        }
        try {
            AssetFileDescriptor openRawResourceFd = resourcesForApplication.openRawResourceFd(identifier);
            if (openRawResourceFd != null) {
                return openRawResourceFd;
            }
            throw new a("Resource is compressed: " + normalizeScheme, null, 2000);
        } catch (Resources.NotFoundException e7) {
            throw new a(null, e7, 2005);
        }
    }

    public static int y(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new a("Resource identifier must be an integer.", null, 1004);
        }
    }

    @Override // e1.InterfaceC1248f
    public void close() {
        this.f13897f = null;
        try {
            try {
                InputStream inputStream = this.f13899h;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f13899h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f13898g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e6) {
                        throw new a(null, e6, 2000);
                    }
                } finally {
                    this.f13898g = null;
                    if (this.f13901j) {
                        this.f13901j = false;
                        u();
                    }
                }
            } catch (IOException e7) {
                throw new a(null, e7, 2000);
            }
        } catch (Throwable th) {
            this.f13899h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f13898g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f13898g = null;
                    if (this.f13901j) {
                        this.f13901j = false;
                        u();
                    }
                    throw th;
                } catch (IOException e8) {
                    throw new a(null, e8, 2000);
                }
            } finally {
                this.f13898g = null;
                if (this.f13901j) {
                    this.f13901j = false;
                    u();
                }
            }
        }
    }

    @Override // e1.InterfaceC1248f
    public Uri getUri() {
        C1252j c1252j = this.f13897f;
        if (c1252j != null) {
            return c1252j.f13820a;
        }
        return null;
    }

    @Override // e1.InterfaceC1248f
    public long r(C1252j c1252j) {
        this.f13897f = c1252j;
        v(c1252j);
        AssetFileDescriptor x6 = x(this.f13896e, c1252j);
        this.f13898g = x6;
        long length = x6.getLength();
        FileInputStream fileInputStream = new FileInputStream(this.f13898g.getFileDescriptor());
        this.f13899h = fileInputStream;
        if (length != -1) {
            try {
                if (c1252j.f13826g > length) {
                    throw new a(null, null, 2008);
                }
            } catch (a e6) {
                throw e6;
            } catch (IOException e7) {
                throw new a(null, e7, 2000);
            }
        }
        long startOffset = this.f13898g.getStartOffset();
        long skip = fileInputStream.skip(c1252j.f13826g + startOffset) - startOffset;
        if (skip != c1252j.f13826g) {
            throw new a(null, null, 2008);
        }
        if (length == -1) {
            FileChannel channel = fileInputStream.getChannel();
            if (channel.size() == 0) {
                this.f13900i = -1L;
            } else {
                long size = channel.size() - channel.position();
                this.f13900i = size;
                if (size < 0) {
                    throw new a(null, null, 2008);
                }
            }
        } else {
            long j6 = length - skip;
            this.f13900i = j6;
            if (j6 < 0) {
                throw new C1249g(2008);
            }
        }
        long j7 = c1252j.f13827h;
        if (j7 != -1) {
            long j8 = this.f13900i;
            if (j8 != -1) {
                j7 = Math.min(j8, j7);
            }
            this.f13900i = j7;
        }
        this.f13901j = true;
        w(c1252j);
        long j9 = c1252j.f13827h;
        return j9 != -1 ? j9 : this.f13900i;
    }

    @Override // Z0.InterfaceC0837i
    public int read(byte[] bArr, int i6, int i7) {
        if (i7 == 0) {
            return 0;
        }
        long j6 = this.f13900i;
        if (j6 == 0) {
            return -1;
        }
        if (j6 != -1) {
            try {
                i7 = (int) Math.min(j6, i7);
            } catch (IOException e6) {
                throw new a(null, e6, 2000);
            }
        }
        int read = ((InputStream) AbstractC1117K.i(this.f13899h)).read(bArr, i6, i7);
        if (read == -1) {
            if (this.f13900i == -1) {
                return -1;
            }
            throw new a("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j7 = this.f13900i;
        if (j7 != -1) {
            this.f13900i = j7 - read;
        }
        t(read);
        return read;
    }
}
