package K3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import kotlin.ExceptionsKt;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import y3.InterfaceC2355a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2355a f3002a;

    /* renamed from: b, reason: collision with root package name */
    public Properties f3003b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3004c;

    /* renamed from: d, reason: collision with root package name */
    public final File f3005d;

    public c(File directory, String fileNameWithoutExtension, InterfaceC2355a interfaceC2355a) {
        Intrinsics.checkNotNullParameter(directory, "directory");
        Intrinsics.checkNotNullParameter(fileNameWithoutExtension, "fileNameWithoutExtension");
        this.f3002a = interfaceC2355a;
        this.f3003b = new Properties();
        String str = fileNameWithoutExtension + ".properties";
        this.f3004c = str;
        this.f3005d = new File(directory, str);
    }

    @Override // K3.b
    public void a(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f3003b.remove(key);
        g();
    }

    public final void b() {
        this.f3005d.getParentFile().mkdirs();
        this.f3005d.createNewFile();
    }

    public final String c(String key, String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f3003b.getProperty(key, str);
    }

    public final void d() {
        if (this.f3005d.exists()) {
            try {
                FileInputStream fileInputStream = new FileInputStream(this.f3005d);
                try {
                    this.f3003b.load(fileInputStream);
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(fileInputStream, null);
                    return;
                } finally {
                }
            } catch (Throwable th) {
                this.f3005d.delete();
                InterfaceC2355a interfaceC2355a = this.f3002a;
                if (interfaceC2355a != null) {
                    interfaceC2355a.a("Failed to load property file with path " + this.f3005d.getAbsolutePath() + ", error stacktrace: " + ExceptionsKt.stackTraceToString(th));
                }
            }
        }
        b();
    }

    public final boolean e(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f3003b.setProperty(key, value);
        g();
        return true;
    }

    public final boolean f(List keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Iterator it = keys.iterator();
        while (it.hasNext()) {
            this.f3003b.remove((String) it.next());
        }
        g();
        return true;
    }

    public final void g() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(this.f3005d);
            try {
                this.f3003b.store(fileOutputStream, (String) null);
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(fileOutputStream, null);
            } finally {
            }
        } catch (Throwable th) {
            InterfaceC2355a interfaceC2355a = this.f3002a;
            if (interfaceC2355a != null) {
                interfaceC2355a.a("Failed to save property file with path " + this.f3005d.getAbsolutePath() + ", error stacktrace: " + ExceptionsKt.stackTraceToString(th));
            }
        }
    }

    @Override // K3.b
    public long getLong(String key, long j6) {
        Intrinsics.checkNotNullParameter(key, "key");
        String property = this.f3003b.getProperty(key, "");
        Intrinsics.checkNotNullExpressionValue(property, "getProperty(...)");
        Long longOrNull = StringsKt.toLongOrNull(property);
        return longOrNull != null ? longOrNull.longValue() : j6;
    }

    @Override // K3.b
    public boolean putLong(String key, long j6) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f3003b.setProperty(key, String.valueOf(j6));
        g();
        return true;
    }
}
