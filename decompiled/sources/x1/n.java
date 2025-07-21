package x1;

import java.util.NoSuchElementException;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public interface n {

    /* renamed from: a, reason: collision with root package name */
    public static final n f20482a = new a();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements n {
        @Override // x1.n
        public long a() {
            throw new NoSuchElementException();
        }

        @Override // x1.n
        public long b() {
            throw new NoSuchElementException();
        }

        @Override // x1.n
        public boolean next() {
            return false;
        }
    }

    long a();

    long b();

    boolean next();
}
