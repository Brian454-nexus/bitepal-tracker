package e1;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import c1.AbstractC1117K;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* renamed from: e1.d, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1246d extends AbstractC1244b {

    /* renamed from: e, reason: collision with root package name */
    public final ContentResolver f13803e;

    /* renamed from: f, reason: collision with root package name */
    public Uri f13804f;

    /* renamed from: g, reason: collision with root package name */
    public AssetFileDescriptor f13805g;

    /* renamed from: h, reason: collision with root package name */
    public FileInputStream f13806h;

    /* renamed from: i, reason: collision with root package name */
    public long f13807i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f13808j;

    /* renamed from: e1.d$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a extends C1249g {
        public a(IOException iOException, int i6) {
            super(iOException, i6);
        }
    }

    public C1246d(Context context) {
        super(false);
        this.f13803e = context.getContentResolver();
    }

    @Override // e1.InterfaceC1248f
    public void close() {
        this.f13804f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f13806h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f13806h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f13805g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e6) {
                        throw new a(e6, 2000);
                    }
                } finally {
                    this.f13805g = null;
                    if (this.f13808j) {
                        this.f13808j = false;
                        u();
                    }
                }
            } catch (IOException e7) {
                throw new a(e7, 2000);
            }
        } catch (Throwable th) {
            this.f13806h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f13805g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f13805g = null;
                    if (this.f13808j) {
                        this.f13808j = false;
                        u();
                    }
                    throw th;
                } catch (IOException e8) {
                    throw new a(e8, 2000);
                }
            } finally {
                this.f13805g = null;
                if (this.f13808j) {
                    this.f13808j = false;
                    u();
                }
            }
        }
    }

    @Override // e1.InterfaceC1248f
    public Uri getUri() {
        return this.f13804f;
    }

    @Override // e1.InterfaceC1248f
    public long r(C1252j c1252j) {
        AssetFileDescriptor openAssetFileDescriptor;
        try {
            Uri normalizeScheme = c1252j.f13820a.normalizeScheme();
            this.f13804f = normalizeScheme;
            v(c1252j);
            if ("content".equals(normalizeScheme.getScheme())) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                openAssetFileDescriptor = this.f13803e.openTypedAssetFileDescriptor(normalizeScheme, "*/*", bundle);
            } else {
                openAssetFileDescriptor = this.f13803e.openAssetFileDescriptor(normalizeScheme, "r");
            }
            this.f13805g = openAssetFileDescriptor;
            if (openAssetFileDescriptor == null) {
                throw new a(new IOException("Could not open file descriptor for: " + normalizeScheme), 2000);
            }
            long length = openAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
            this.f13806h = fileInputStream;
            if (length != -1 && c1252j.f13826g > length) {
                throw new a(null, 2008);
            }
            long startOffset = openAssetFileDescriptor.getStartOffset();
            long skip = fileInputStream.skip(c1252j.f13826g + startOffset) - startOffset;
            if (skip != c1252j.f13826g) {
                throw new a(null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.f13807i = -1L;
                } else {
                    long position = size - channel.position();
                    this.f13807i = position;
                    if (position < 0) {
                        throw new a(null, 2008);
                    }
                }
            } else {
                long j6 = length - skip;
                this.f13807i = j6;
                if (j6 < 0) {
                    throw new a(null, 2008);
                }
            }
            long j7 = c1252j.f13827h;
            if (j7 != -1) {
                long j8 = this.f13807i;
                if (j8 != -1) {
                    j7 = Math.min(j8, j7);
                }
                this.f13807i = j7;
            }
            this.f13808j = true;
            w(c1252j);
            long j9 = c1252j.f13827h;
            return j9 != -1 ? j9 : this.f13807i;
        } catch (a e6) {
            throw e6;
        } catch (IOException e7) {
            throw new a(e7, e7 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // Z0.InterfaceC0837i
    public int read(byte[] bArr, int i6, int i7) {
        if (i7 == 0) {
            return 0;
        }
        long j6 = this.f13807i;
        if (j6 == 0) {
            return -1;
        }
        if (j6 != -1) {
            try {
                i7 = (int) Math.min(j6, i7);
            } catch (IOException e6) {
                throw new a(e6, 2000);
            }
        }
        int read = ((FileInputStream) AbstractC1117K.i(this.f13806h)).read(bArr, i6, i7);
        if (read == -1) {
            return -1;
        }
        long j7 = this.f13807i;
        if (j7 != -1) {
            this.f13807i = j7 - read;
        }
        t(read);
        return read;
    }
}
