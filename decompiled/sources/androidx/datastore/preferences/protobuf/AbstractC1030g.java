package androidx.datastore.preferences.protobuf;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* renamed from: androidx.datastore.preferences.protobuf.g, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC1030g implements Iterable, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC1030g f8721b = new i(AbstractC1047y.f8970d);

    /* renamed from: c, reason: collision with root package name */
    public static final f f8722c;

    /* renamed from: d, reason: collision with root package name */
    public static final Comparator f8723d;

    /* renamed from: a, reason: collision with root package name */
    public int f8724a = 0;

    /* renamed from: androidx.datastore.preferences.protobuf.g$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public int f8725a = 0;

        /* renamed from: b, reason: collision with root package name */
        public final int f8726b;

        public a() {
            this.f8726b = AbstractC1030g.this.size();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f8725a < this.f8726b;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1030g.InterfaceC0128g
        public byte nextByte() {
            int i6 = this.f8725a;
            if (i6 >= this.f8726b) {
                throw new NoSuchElementException();
            }
            this.f8725a = i6 + 1;
            return AbstractC1030g.this.n(i6);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class b implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC1030g abstractC1030g, AbstractC1030g abstractC1030g2) {
            InterfaceC0128g it = abstractC1030g.iterator();
            InterfaceC0128g it2 = abstractC1030g2.iterator();
            while (it.hasNext() && it2.hasNext()) {
                int compareTo = Integer.valueOf(AbstractC1030g.v(it.nextByte())).compareTo(Integer.valueOf(AbstractC1030g.v(it2.nextByte())));
                if (compareTo != 0) {
                    return compareTo;
                }
            }
            return Integer.valueOf(abstractC1030g.size()).compareTo(Integer.valueOf(abstractC1030g2.size()));
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$c */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class c implements InterfaceC0128g {
        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$d */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class d implements f {
        public d() {
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1030g.f
        public byte[] a(byte[] bArr, int i6, int i7) {
            return Arrays.copyOfRange(bArr, i6, i7 + i6);
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$e */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class e extends i {

        /* renamed from: f, reason: collision with root package name */
        public final int f8728f;

        /* renamed from: g, reason: collision with root package name */
        public final int f8729g;

        public e(byte[] bArr, int i6, int i7) {
            super(bArr);
            AbstractC1030g.h(i6, i6 + i7, bArr.length);
            this.f8728f = i6;
            this.f8729g = i7;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1030g.i
        public int F() {
            return this.f8728f;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1030g.i, androidx.datastore.preferences.protobuf.AbstractC1030g
        public byte b(int i6) {
            AbstractC1030g.c(i6, size());
            return this.f8730e[this.f8728f + i6];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1030g.i, androidx.datastore.preferences.protobuf.AbstractC1030g
        public void m(byte[] bArr, int i6, int i7, int i8) {
            System.arraycopy(this.f8730e, F() + i6, bArr, i7, i8);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1030g.i, androidx.datastore.preferences.protobuf.AbstractC1030g
        public byte n(int i6) {
            return this.f8730e[this.f8728f + i6];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1030g.i, androidx.datastore.preferences.protobuf.AbstractC1030g
        public int size() {
            return this.f8729g;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$f */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface f {
        byte[] a(byte[] bArr, int i6, int i7);
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$g, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface InterfaceC0128g extends Iterator {
        byte nextByte();
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$h */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class h extends AbstractC1030g {
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$i */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class i extends h {

        /* renamed from: e, reason: collision with root package name */
        public final byte[] f8730e;

        public i(byte[] bArr) {
            bArr.getClass();
            this.f8730e = bArr;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1030g
        public final void D(AbstractC1029f abstractC1029f) {
            abstractC1029f.a(this.f8730e, F(), size());
        }

        public final boolean E(AbstractC1030g abstractC1030g, int i6, int i7) {
            if (i7 > abstractC1030g.size()) {
                throw new IllegalArgumentException("Length too large: " + i7 + size());
            }
            int i8 = i6 + i7;
            if (i8 > abstractC1030g.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i6 + ", " + i7 + ", " + abstractC1030g.size());
            }
            if (!(abstractC1030g instanceof i)) {
                return abstractC1030g.t(i6, i8).equals(t(0, i7));
            }
            i iVar = (i) abstractC1030g;
            byte[] bArr = this.f8730e;
            byte[] bArr2 = iVar.f8730e;
            int F6 = F() + i7;
            int F7 = F();
            int F8 = iVar.F() + i6;
            while (F7 < F6) {
                if (bArr[F7] != bArr2[F8]) {
                    return false;
                }
                F7++;
                F8++;
            }
            return true;
        }

        public int F() {
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1030g
        public byte b(int i6) {
            return this.f8730e[i6];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1030g
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbstractC1030g) || size() != ((AbstractC1030g) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof i)) {
                return obj.equals(this);
            }
            i iVar = (i) obj;
            int s6 = s();
            int s7 = iVar.s();
            if (s6 == 0 || s7 == 0 || s6 == s7) {
                return E(iVar, 0, size());
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1030g
        public void m(byte[] bArr, int i6, int i7, int i8) {
            System.arraycopy(this.f8730e, i6, bArr, i7, i8);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1030g
        public byte n(int i6) {
            return this.f8730e[i6];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1030g
        public final boolean o() {
            int F6 = F();
            return q0.n(this.f8730e, F6, size() + F6);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1030g
        public final int r(int i6, int i7, int i8) {
            return AbstractC1047y.h(i6, this.f8730e, F() + i7, i8);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1030g
        public int size() {
            return this.f8730e.length;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1030g
        public final AbstractC1030g t(int i6, int i7) {
            int h6 = AbstractC1030g.h(i6, i7, size());
            return h6 == 0 ? AbstractC1030g.f8721b : new e(this.f8730e, F() + i6, h6);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1030g
        public final String y(Charset charset) {
            return new String(this.f8730e, F(), size(), charset);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$j */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class j implements f {
        public j() {
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1030g.f
        public byte[] a(byte[] bArr, int i6, int i7) {
            byte[] bArr2 = new byte[i7];
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            return bArr2;
        }

        public /* synthetic */ j(a aVar) {
            this();
        }
    }

    static {
        a aVar = null;
        f8722c = AbstractC1027d.c() ? new j(aVar) : new d(aVar);
        f8723d = new b();
    }

    public static AbstractC1030g B(byte[] bArr) {
        return new i(bArr);
    }

    public static AbstractC1030g C(byte[] bArr, int i6, int i7) {
        return new e(bArr, i6, i7);
    }

    public static void c(int i6, int i7) {
        if (((i7 - (i6 + 1)) | i6) < 0) {
            if (i6 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i6);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i6 + ", " + i7);
        }
    }

    public static int h(int i6, int i7, int i8) {
        int i9 = i7 - i6;
        if ((i6 | i7 | i9 | (i8 - i7)) >= 0) {
            return i9;
        }
        if (i6 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i6 + " < 0");
        }
        if (i7 < i6) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i6 + ", " + i7);
        }
        throw new IndexOutOfBoundsException("End index: " + i7 + " >= " + i8);
    }

    public static AbstractC1030g i(byte[] bArr) {
        return k(bArr, 0, bArr.length);
    }

    public static AbstractC1030g k(byte[] bArr, int i6, int i7) {
        h(i6, i6 + i7, bArr.length);
        return new i(f8722c.a(bArr, i6, i7));
    }

    public static AbstractC1030g l(String str) {
        return new i(str.getBytes(AbstractC1047y.f8968b));
    }

    public static int v(byte b6) {
        return b6 & 255;
    }

    public final String A() {
        if (size() <= 50) {
            return j0.a(this);
        }
        return j0.a(t(0, 47)) + "...";
    }

    public abstract void D(AbstractC1029f abstractC1029f);

    public abstract byte b(int i6);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i6 = this.f8724a;
        if (i6 == 0) {
            int size = size();
            i6 = r(size, 0, size);
            if (i6 == 0) {
                i6 = 1;
            }
            this.f8724a = i6;
        }
        return i6;
    }

    public abstract void m(byte[] bArr, int i6, int i7, int i8);

    public abstract byte n(int i6);

    public abstract boolean o();

    @Override // java.lang.Iterable
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public InterfaceC0128g iterator() {
        return new a();
    }

    public abstract int r(int i6, int i7, int i8);

    public final int s() {
        return this.f8724a;
    }

    public abstract int size();

    public abstract AbstractC1030g t(int i6, int i7);

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), A());
    }

    public final byte[] u() {
        int size = size();
        if (size == 0) {
            return AbstractC1047y.f8970d;
        }
        byte[] bArr = new byte[size];
        m(bArr, 0, 0, size);
        return bArr;
    }

    public final String w(Charset charset) {
        return size() == 0 ? "" : y(charset);
    }

    public abstract String y(Charset charset);

    public final String z() {
        return w(AbstractC1047y.f8968b);
    }
}
