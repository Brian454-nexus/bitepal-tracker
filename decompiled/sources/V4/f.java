package V4;

import V4.d;
import android.content.Context;
import java.io.File;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class f extends d {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements d.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f5319a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f5320b;

        public a(Context context, String str) {
            this.f5319a = context;
            this.f5320b = str;
        }

        @Override // V4.d.a
        public File a() {
            File cacheDir = this.f5319a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f5320b != null ? new File(cacheDir, this.f5320b) : cacheDir;
        }
    }

    public f(Context context) {
        this(context, "image_manager_disk_cache", 262144000L);
    }

    public f(Context context, String str, long j6) {
        super(new a(context, str), j6);
    }
}
