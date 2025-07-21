package N0;

import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.system.Os;
import android.util.Log;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.io.ConstantsKt;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class b {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {
        public static void a(FileDescriptor fileDescriptor) {
            Os.close(fileDescriptor);
        }

        public static FileDescriptor b(FileDescriptor fileDescriptor) {
            return Os.dup(fileDescriptor);
        }

        public static long c(FileDescriptor fileDescriptor, long j6, int i6) {
            return Os.lseek(fileDescriptor, j6, i6);
        }
    }

    /* renamed from: N0.b$b, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class C0062b {
        public static void a(MediaMetadataRetriever mediaMetadataRetriever, MediaDataSource mediaDataSource) {
            mediaMetadataRetriever.setDataSource(mediaDataSource);
        }
    }

    public static void a(FileDescriptor fileDescriptor) {
        try {
            a.a(fileDescriptor);
        } catch (Exception unused) {
            Log.e("ExifInterfaceUtils", "Error closing fd.");
        }
    }

    public static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e6) {
                throw e6;
            } catch (Exception unused) {
            }
        }
    }

    public static long[] c(Object obj) {
        if (!(obj instanceof int[])) {
            if (obj instanceof long[]) {
                return (long[]) obj;
            }
            return null;
        }
        int[] iArr = (int[]) obj;
        long[] jArr = new long[iArr.length];
        for (int i6 = 0; i6 < iArr.length; i6++) {
            jArr[i6] = iArr[i6];
        }
        return jArr;
    }

    public static int d(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[ConstantsKt.DEFAULT_BUFFER_SIZE];
        int i6 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return i6;
            }
            i6 += read;
            outputStream.write(bArr, 0, read);
        }
    }

    public static void e(InputStream inputStream, OutputStream outputStream, int i6) {
        byte[] bArr = new byte[ConstantsKt.DEFAULT_BUFFER_SIZE];
        while (i6 > 0) {
            int min = Math.min(i6, ConstantsKt.DEFAULT_BUFFER_SIZE);
            int read = inputStream.read(bArr, 0, min);
            if (read != min) {
                throw new IOException("Failed to copy the given amount of bytes from the inputstream to the output stream.");
            }
            i6 -= read;
            outputStream.write(bArr, 0, read);
        }
    }

    public static boolean f(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i6 = 0; i6 < bArr2.length; i6++) {
            if (bArr[i6] != bArr2[i6]) {
                return false;
            }
        }
        return true;
    }
}
