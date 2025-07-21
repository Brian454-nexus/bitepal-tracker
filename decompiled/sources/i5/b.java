package i5;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final List f16076a = new ArrayList();

    public synchronized void a(ImageHeaderParser imageHeaderParser) {
        this.f16076a.add(imageHeaderParser);
    }

    public synchronized List b() {
        return this.f16076a;
    }
}
