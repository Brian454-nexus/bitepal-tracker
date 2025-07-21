package kotlin.io.encoding;

import com.amazon.device.iap.internal.c.b;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@ExperimentalEncodingApi
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0013\u001a\u00020\u0014H\u0016J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0002J(\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\tH\u0002J\u0010\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\tH\u0002J\b\u0010\u001d\u001a\u00020\tH\u0016J \u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0016J\b\u0010 \u001a\u00020\tH\u0002J\b\u0010!\u001a\u00020\u0014H\u0002J\b\u0010\"\u001a\u00020\u0014H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lkotlin/io/encoding/DecodeInputStream;", "Ljava/io/InputStream;", "input", "base64", "Lkotlin/io/encoding/Base64;", "(Ljava/io/InputStream;Lkotlin/io/encoding/Base64;)V", "byteBuffer", "", "byteBufferEndIndex", "", "byteBufferLength", "getByteBufferLength", "()I", "byteBufferStartIndex", "isClosed", "", "isEOF", "singleByteBuffer", "symbolBuffer", "close", "", "copyByteBufferInto", "dst", "dstOffset", "length", "decodeSymbolBufferInto", "dstEndIndex", "symbolBufferLength", "handlePaddingSymbol", "read", "destination", b.as, "readNextSymbol", "resetByteBufferIfEmpty", "shiftByteBufferToStartIfNeeded", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
final class DecodeInputStream extends InputStream {

    @NotNull
    private final Base64 base64;

    @NotNull
    private final byte[] byteBuffer;
    private int byteBufferEndIndex;
    private int byteBufferStartIndex;

    @NotNull
    private final InputStream input;
    private boolean isClosed;
    private boolean isEOF;

    @NotNull
    private final byte[] singleByteBuffer;

    @NotNull
    private final byte[] symbolBuffer;

    public DecodeInputStream(@NotNull InputStream input, @NotNull Base64 base64) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(base64, "base64");
        this.input = input;
        this.base64 = base64;
        this.singleByteBuffer = new byte[1];
        this.symbolBuffer = new byte[1024];
        this.byteBuffer = new byte[1024];
    }

    private final void copyByteBufferInto(byte[] dst, int dstOffset, int length) {
        byte[] bArr = this.byteBuffer;
        int i6 = this.byteBufferStartIndex;
        ArraysKt.copyInto(bArr, dst, dstOffset, i6, i6 + length);
        this.byteBufferStartIndex += length;
        resetByteBufferIfEmpty();
    }

    private final int decodeSymbolBufferInto(byte[] dst, int dstOffset, int dstEndIndex, int symbolBufferLength) {
        int i6 = this.byteBufferEndIndex;
        this.byteBufferEndIndex = i6 + this.base64.decodeIntoByteArray(this.symbolBuffer, this.byteBuffer, i6, 0, symbolBufferLength);
        int min = Math.min(getByteBufferLength(), dstEndIndex - dstOffset);
        copyByteBufferInto(dst, dstOffset, min);
        shiftByteBufferToStartIfNeeded();
        return min;
    }

    private final int getByteBufferLength() {
        return this.byteBufferEndIndex - this.byteBufferStartIndex;
    }

    private final int handlePaddingSymbol(int symbolBufferLength) {
        this.symbolBuffer[symbolBufferLength] = Base64.padSymbol;
        if ((symbolBufferLength & 3) != 2) {
            return symbolBufferLength + 1;
        }
        int readNextSymbol = readNextSymbol();
        if (readNextSymbol >= 0) {
            this.symbolBuffer[symbolBufferLength + 1] = (byte) readNextSymbol;
        }
        return symbolBufferLength + 2;
    }

    private final int readNextSymbol() {
        int read;
        if (!this.base64.getIsMimeScheme()) {
            return this.input.read();
        }
        do {
            read = this.input.read();
            if (read == -1) {
                break;
            }
        } while (!Base64Kt.isInMimeAlphabet(read));
        return read;
    }

    private final void resetByteBufferIfEmpty() {
        if (this.byteBufferStartIndex == this.byteBufferEndIndex) {
            this.byteBufferStartIndex = 0;
            this.byteBufferEndIndex = 0;
        }
    }

    private final void shiftByteBufferToStartIfNeeded() {
        byte[] bArr = this.byteBuffer;
        int length = bArr.length;
        int i6 = this.byteBufferEndIndex;
        if ((this.symbolBuffer.length / 4) * 3 > length - i6) {
            ArraysKt.copyInto(bArr, bArr, 0, this.byteBufferStartIndex, i6);
            this.byteBufferEndIndex -= this.byteBufferStartIndex;
            this.byteBufferStartIndex = 0;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.isClosed) {
            return;
        }
        this.isClosed = true;
        this.input.close();
    }

    @Override // java.io.InputStream
    public int read() {
        int i6 = this.byteBufferStartIndex;
        if (i6 < this.byteBufferEndIndex) {
            int i7 = this.byteBuffer[i6] & 255;
            this.byteBufferStartIndex = i6 + 1;
            resetByteBufferIfEmpty();
            return i7;
        }
        int read = read(this.singleByteBuffer, 0, 1);
        if (read == -1) {
            return -1;
        }
        if (read == 1) {
            return this.singleByteBuffer[0] & 255;
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // java.io.InputStream
    public int read(@NotNull byte[] destination, int offset, int length) {
        int i6;
        boolean z6;
        boolean z7;
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (offset >= 0 && length >= 0 && (i6 = offset + length) <= destination.length) {
            if (!this.isClosed) {
                if (this.isEOF) {
                    return -1;
                }
                if (length == 0) {
                    return 0;
                }
                if (getByteBufferLength() >= length) {
                    copyByteBufferInto(destination, offset, length);
                    return length;
                }
                int byteBufferLength = (((length - getByteBufferLength()) + 2) / 3) * 4;
                int i7 = offset;
                while (true) {
                    z6 = this.isEOF;
                    if (z6 || byteBufferLength <= 0) {
                        break;
                    }
                    int min = Math.min(this.symbolBuffer.length, byteBufferLength);
                    int i8 = 0;
                    while (true) {
                        z7 = this.isEOF;
                        if (z7 || i8 >= min) {
                            break;
                        }
                        int readNextSymbol = readNextSymbol();
                        if (readNextSymbol == -1) {
                            this.isEOF = true;
                        } else if (readNextSymbol != 61) {
                            this.symbolBuffer[i8] = (byte) readNextSymbol;
                            i8++;
                        } else {
                            i8 = handlePaddingSymbol(i8);
                            this.isEOF = true;
                        }
                    }
                    if (!z7 && i8 != min) {
                        throw new IllegalStateException("Check failed.");
                    }
                    byteBufferLength -= i8;
                    i7 += decodeSymbolBufferInto(destination, i7, i6, i8);
                }
                if (i7 == offset && z6) {
                    return -1;
                }
                return i7 - offset;
            }
            throw new IOException("The input stream is closed.");
        }
        throw new IndexOutOfBoundsException("offset: " + offset + ", length: " + length + ", buffer size: " + destination.length);
    }
}
