package s5;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class i implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final int f18939a = 1179403647;

    /* renamed from: b, reason: collision with root package name */
    public final FileChannel f18940b;

    public i(File file) {
        if (file == null || !file.exists()) {
            throw new IllegalArgumentException("File is null or does not exist");
        }
        this.f18940b = new FileInputStream(file).getChannel();
    }

    public List D() {
        long j6;
        long j7;
        this.f18940b.position(0L);
        ArrayList arrayList = new ArrayList();
        d c6 = c();
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(c6.f18923a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j8 = c6.f18928f;
        int i6 = 0;
        if (j8 == 65535) {
            j8 = c6.c(0).f18936a;
        }
        long j9 = 0;
        while (true) {
            j6 = 1;
            if (j9 >= j8) {
                j7 = 0;
                break;
            }
            e b6 = c6.b(j9);
            if (b6.f18932a == 2) {
                j7 = b6.f18933b;
                break;
            }
            j9++;
        }
        if (j7 == 0) {
            return Collections.unmodifiableList(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        long j10 = 0;
        while (true) {
            c a6 = c6.a(j7, i6);
            long j11 = j6;
            long j12 = a6.f18921a;
            if (j12 == j11) {
                arrayList2.add(Long.valueOf(a6.f18922b));
            } else if (j12 == 5) {
                j10 = a6.f18922b;
            }
            i6++;
            if (a6.f18921a == 0) {
                break;
            }
            j6 = j11;
            j8 = j8;
        }
        if (j10 == 0) {
            throw new IllegalStateException("String table offset not found!");
        }
        long a7 = a(c6, j8, j10);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList.add(Y(allocate, ((Long) it.next()).longValue() + a7));
        }
        return arrayList;
    }

    public void I(ByteBuffer byteBuffer, long j6, int i6) {
        byteBuffer.position(0);
        byteBuffer.limit(i6);
        long j7 = 0;
        while (j7 < i6) {
            int read = this.f18940b.read(byteBuffer, j6 + j7);
            if (read == -1) {
                throw new EOFException();
            }
            j7 += read;
        }
        byteBuffer.position(0);
    }

    public short P(ByteBuffer byteBuffer, long j6) {
        I(byteBuffer, j6, 1);
        return (short) (byteBuffer.get() & 255);
    }

    public int R(ByteBuffer byteBuffer, long j6) {
        I(byteBuffer, j6, 2);
        return byteBuffer.getShort() & 65535;
    }

    public long T(ByteBuffer byteBuffer, long j6) {
        I(byteBuffer, j6, 8);
        return byteBuffer.getLong();
    }

    public String Y(ByteBuffer byteBuffer, long j6) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            long j7 = 1 + j6;
            short P5 = P(byteBuffer, j6);
            if (P5 == 0) {
                return sb.toString();
            }
            sb.append((char) P5);
            j6 = j7;
        }
    }

    public final long a(d dVar, long j6, long j7) {
        for (long j8 = 0; j8 < j6; j8++) {
            e b6 = dVar.b(j8);
            if (b6.f18932a == 1) {
                long j9 = b6.f18934c;
                if (j9 <= j7 && j7 <= b6.f18935d + j9) {
                    return (j7 - j9) + b6.f18933b;
                }
            }
        }
        throw new IllegalStateException("Could not map vma to file offset!");
    }

    public long a0(ByteBuffer byteBuffer, long j6) {
        I(byteBuffer, j6, 4);
        return byteBuffer.getInt() & 4294967295L;
    }

    public d c() {
        this.f18940b.position(0L);
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        if (a0(allocate, 0L) != 1179403647) {
            throw new IllegalArgumentException("Invalid ELF Magic!");
        }
        short P5 = P(allocate, 4L);
        boolean z6 = P(allocate, 5L) == 2;
        if (P5 == 1) {
            return new g(z6, this);
        }
        if (P5 == 2) {
            return new h(z6, this);
        }
        throw new IllegalStateException("Invalid class type!");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f18940b.close();
    }
}
