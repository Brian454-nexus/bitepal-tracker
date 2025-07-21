package kotlin.io;

import com.amazon.device.iap.internal.c.b;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.NoSuchElementException;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.collections.ByteIterator;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000Z\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0017\u0010\u0000\u001a\u00020\u0005*\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0017\u0010\u0007\u001a\u00020\b*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\nH\u0087\b\u001a\u0017\u0010\u000b\u001a\u00020\f*\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\nH\u0087\b\u001a\u0017\u0010\r\u001a\u00020\u000e*\u00020\u000f2\b\b\u0002\u0010\t\u001a\u00020\nH\u0087\b\u001a\u001c\u0010\u0010\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\r\u0010\u0013\u001a\u00020\u000e*\u00020\u0014H\u0087\b\u001a\u001d\u0010\u0013\u001a\u00020\u000e*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004H\u0087\b\u001a\r\u0010\u0017\u001a\u00020\u0018*\u00020\u0001H\u0086\u0002\u001a\f\u0010\u0019\u001a\u00020\u0014*\u00020\u0002H\u0007\u001a\u0016\u0010\u0019\u001a\u00020\u0014*\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u0004H\u0007\u001a\u0017\u0010\u001b\u001a\u00020\u001c*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\nH\u0087\b\u001a\u0017\u0010\u001d\u001a\u00020\u001e*\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\nH\u0087\b¨\u0006\u001f"}, d2 = {"buffered", "Ljava/io/BufferedInputStream;", "Ljava/io/InputStream;", "bufferSize", "", "Ljava/io/BufferedOutputStream;", "Ljava/io/OutputStream;", "bufferedReader", "Ljava/io/BufferedReader;", "charset", "Ljava/nio/charset/Charset;", "bufferedWriter", "Ljava/io/BufferedWriter;", "byteInputStream", "Ljava/io/ByteArrayInputStream;", "", "copyTo", "", "out", "inputStream", "", b.as, "length", "iterator", "Lkotlin/collections/ByteIterator;", "readBytes", "estimatedSize", "reader", "Ljava/io/InputStreamReader;", "writer", "Ljava/io/OutputStreamWriter;", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@JvmName(name = "ByteStreamsKt")
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class ByteStreamsKt {
    @InlineOnly
    private static final BufferedInputStream buffered(InputStream inputStream, int i6) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        return inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, i6);
    }

    public static /* synthetic */ BufferedInputStream buffered$default(InputStream inputStream, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i6 = ConstantsKt.DEFAULT_BUFFER_SIZE;
        }
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        return inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, i6);
    }

    @InlineOnly
    private static final BufferedReader bufferedReader(InputStream inputStream, Charset charset) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new BufferedReader(new InputStreamReader(inputStream, charset), ConstantsKt.DEFAULT_BUFFER_SIZE);
    }

    public static /* synthetic */ BufferedReader bufferedReader$default(InputStream inputStream, Charset charset, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new BufferedReader(new InputStreamReader(inputStream, charset), ConstantsKt.DEFAULT_BUFFER_SIZE);
    }

    @InlineOnly
    private static final BufferedWriter bufferedWriter(OutputStream outputStream, Charset charset) {
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new BufferedWriter(new OutputStreamWriter(outputStream, charset), ConstantsKt.DEFAULT_BUFFER_SIZE);
    }

    public static /* synthetic */ BufferedWriter bufferedWriter$default(OutputStream outputStream, Charset charset, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new BufferedWriter(new OutputStreamWriter(outputStream, charset), ConstantsKt.DEFAULT_BUFFER_SIZE);
    }

    @InlineOnly
    private static final ByteArrayInputStream byteInputStream(String str, Charset charset) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return new ByteArrayInputStream(bytes);
    }

    public static /* synthetic */ ByteArrayInputStream byteInputStream$default(String str, Charset charset, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return new ByteArrayInputStream(bytes);
    }

    public static final long copyTo(@NotNull InputStream inputStream, @NotNull OutputStream out, int i6) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        byte[] bArr = new byte[i6];
        int read = inputStream.read(bArr);
        long j6 = 0;
        while (read >= 0) {
            out.write(bArr, 0, read);
            j6 += read;
            read = inputStream.read(bArr);
        }
        return j6;
    }

    public static /* synthetic */ long copyTo$default(InputStream inputStream, OutputStream outputStream, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i6 = ConstantsKt.DEFAULT_BUFFER_SIZE;
        }
        return copyTo(inputStream, outputStream, i6);
    }

    @InlineOnly
    private static final ByteArrayInputStream inputStream(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return new ByteArrayInputStream(bArr);
    }

    @NotNull
    public static final ByteIterator iterator(@NotNull final BufferedInputStream bufferedInputStream) {
        Intrinsics.checkNotNullParameter(bufferedInputStream, "<this>");
        return new ByteIterator() { // from class: kotlin.io.ByteStreamsKt$iterator$1
            private boolean finished;
            private int nextByte = -1;
            private boolean nextPrepared;

            private final void prepareNext() {
                if (this.nextPrepared || this.finished) {
                    return;
                }
                int read = bufferedInputStream.read();
                this.nextByte = read;
                this.nextPrepared = true;
                this.finished = read == -1;
            }

            public final boolean getFinished() {
                return this.finished;
            }

            public final int getNextByte() {
                return this.nextByte;
            }

            public final boolean getNextPrepared() {
                return this.nextPrepared;
            }

            public boolean hasNext() {
                prepareNext();
                return !this.finished;
            }

            public byte nextByte() {
                prepareNext();
                if (this.finished) {
                    throw new NoSuchElementException("Input stream is over.");
                }
                byte b6 = (byte) this.nextByte;
                this.nextPrepared = false;
                return b6;
            }

            public final void setFinished(boolean z6) {
                this.finished = z6;
            }

            public final void setNextByte(int i6) {
                this.nextByte = i6;
            }

            public final void setNextPrepared(boolean z6) {
                this.nextPrepared = z6;
            }
        };
    }

    @Deprecated(message = "Use readBytes() overload without estimatedSize parameter", replaceWith = @ReplaceWith(expression = "readBytes()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", warningSince = "1.3")
    @NotNull
    public static final byte[] readBytes(@NotNull InputStream inputStream, int i6) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(i6, inputStream.available()));
        copyTo$default(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public static /* synthetic */ byte[] readBytes$default(InputStream inputStream, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i6 = ConstantsKt.DEFAULT_BUFFER_SIZE;
        }
        return readBytes(inputStream, i6);
    }

    @InlineOnly
    private static final InputStreamReader reader(InputStream inputStream, Charset charset) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new InputStreamReader(inputStream, charset);
    }

    public static /* synthetic */ InputStreamReader reader$default(InputStream inputStream, Charset charset, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new InputStreamReader(inputStream, charset);
    }

    @InlineOnly
    private static final OutputStreamWriter writer(OutputStream outputStream, Charset charset) {
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new OutputStreamWriter(outputStream, charset);
    }

    public static /* synthetic */ OutputStreamWriter writer$default(OutputStream outputStream, Charset charset, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new OutputStreamWriter(outputStream, charset);
    }

    @InlineOnly
    private static final BufferedOutputStream buffered(OutputStream outputStream, int i6) {
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        return outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, i6);
    }

    @InlineOnly
    private static final ByteArrayInputStream inputStream(byte[] bArr, int i6, int i7) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return new ByteArrayInputStream(bArr, i6, i7);
    }

    public static /* synthetic */ BufferedOutputStream buffered$default(OutputStream outputStream, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i6 = ConstantsKt.DEFAULT_BUFFER_SIZE;
        }
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        return outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, i6);
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final byte[] readBytes(@NotNull InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(ConstantsKt.DEFAULT_BUFFER_SIZE, inputStream.available()));
        copyTo$default(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        return byteArray;
    }
}
