package L;

import android.util.Size;
import java.util.Comparator;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class e implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3024a;

    public e() {
        this(false);
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(Size size, Size size2) {
        int signum = Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
        return this.f3024a ? signum * (-1) : signum;
    }

    public e(boolean z6) {
        this.f3024a = z6;
    }
}
