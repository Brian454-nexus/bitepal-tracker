package C2;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final C0017a f657e = new C0017a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final Map f658f = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f659a;

    /* renamed from: b, reason: collision with root package name */
    public final File f660b;

    /* renamed from: c, reason: collision with root package name */
    public final Lock f661c;

    /* renamed from: d, reason: collision with root package name */
    public FileChannel f662d;

    /* renamed from: C2.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class C0017a {
        public /* synthetic */ C0017a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Lock b(String str) {
            Lock lock;
            synchronized (a.f658f) {
                try {
                    Map map = a.f658f;
                    Object obj = map.get(str);
                    if (obj == null) {
                        obj = new ReentrantLock();
                        map.put(str, obj);
                    }
                    lock = (Lock) obj;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return lock;
        }

        public C0017a() {
        }
    }

    public a(String name, File lockDir, boolean z6) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(lockDir, "lockDir");
        this.f659a = z6;
        File file = new File(lockDir, name + ".lck");
        this.f660b = file;
        C0017a c0017a = f657e;
        String absolutePath = file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "lockFile.absolutePath");
        this.f661c = c0017a.b(absolutePath);
    }

    public static /* synthetic */ void c(a aVar, boolean z6, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            z6 = aVar.f659a;
        }
        aVar.b(z6);
    }

    public final void b(boolean z6) {
        this.f661c.lock();
        if (z6) {
            try {
                File parentFile = this.f660b.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(this.f660b).getChannel();
                channel.lock();
                this.f662d = channel;
            } catch (IOException e6) {
                this.f662d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e6);
            }
        }
    }

    public final void d() {
        try {
            FileChannel fileChannel = this.f662d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f661c.unlock();
    }
}
