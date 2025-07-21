package v2;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import x2.AbstractC2268b;
import x2.AbstractC2269c;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class y implements A2.h, g {

    /* renamed from: a, reason: collision with root package name */
    public final Context f19547a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19548b;

    /* renamed from: c, reason: collision with root package name */
    public final File f19549c;

    /* renamed from: d, reason: collision with root package name */
    public final Callable f19550d;

    /* renamed from: e, reason: collision with root package name */
    public final int f19551e;

    /* renamed from: f, reason: collision with root package name */
    public final A2.h f19552f;

    /* renamed from: g, reason: collision with root package name */
    public f f19553g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f19554h;

    public y(Context context, String str, File file, Callable callable, int i6, A2.h delegate) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f19547a = context;
        this.f19548b = str;
        this.f19549c = file;
        this.f19550d = callable;
        this.f19551e = i6;
        this.f19552f = delegate;
    }

    public final void D(f databaseConfiguration) {
        Intrinsics.checkNotNullParameter(databaseConfiguration, "databaseConfiguration");
        this.f19553g = databaseConfiguration;
    }

    public final void I(boolean z6) {
        String databaseName = getDatabaseName();
        if (databaseName == null) {
            throw new IllegalStateException("Required value was null.");
        }
        File databaseFile = this.f19547a.getDatabasePath(databaseName);
        f fVar = this.f19553g;
        f fVar2 = null;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("databaseConfiguration");
            fVar = null;
        }
        boolean z7 = fVar.f19426s;
        File filesDir = this.f19547a.getFilesDir();
        Intrinsics.checkNotNullExpressionValue(filesDir, "context.filesDir");
        C2.a aVar = new C2.a(databaseName, filesDir, z7);
        try {
            C2.a.c(aVar, false, 1, null);
            if (!databaseFile.exists()) {
                try {
                    Intrinsics.checkNotNullExpressionValue(databaseFile, "databaseFile");
                    a(databaseFile, z6);
                    aVar.d();
                    return;
                } catch (IOException e6) {
                    throw new RuntimeException("Unable to copy database file.", e6);
                }
            }
            try {
                Intrinsics.checkNotNullExpressionValue(databaseFile, "databaseFile");
                int c6 = AbstractC2268b.c(databaseFile);
                if (c6 == this.f19551e) {
                    aVar.d();
                    return;
                }
                f fVar3 = this.f19553g;
                if (fVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("databaseConfiguration");
                } else {
                    fVar2 = fVar3;
                }
                if (fVar2.a(c6, this.f19551e)) {
                    aVar.d();
                    return;
                }
                if (this.f19547a.deleteDatabase(databaseName)) {
                    try {
                        a(databaseFile, z6);
                    } catch (IOException e7) {
                        Log.w("ROOM", "Unable to copy database file.", e7);
                    }
                } else {
                    Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                }
                aVar.d();
                return;
            } catch (IOException e8) {
                Log.w("ROOM", "Unable to read database version.", e8);
                aVar.d();
                return;
            }
        } catch (Throwable th) {
            aVar.d();
            throw th;
        }
        aVar.d();
        throw th;
    }

    @Override // A2.h
    public A2.g J() {
        if (!this.f19554h) {
            I(true);
            this.f19554h = true;
        }
        return getDelegate().J();
    }

    public final void a(File file, boolean z6) {
        ReadableByteChannel newChannel;
        if (this.f19548b != null) {
            newChannel = Channels.newChannel(this.f19547a.getAssets().open(this.f19548b));
            Intrinsics.checkNotNullExpressionValue(newChannel, "newChannel(context.assets.open(copyFromAssetPath))");
        } else if (this.f19549c != null) {
            newChannel = new FileInputStream(this.f19549c).getChannel();
            Intrinsics.checkNotNullExpressionValue(newChannel, "FileInputStream(copyFromFile).channel");
        } else {
            Callable callable = this.f19550d;
            if (callable == null) {
                throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
            try {
                newChannel = Channels.newChannel((InputStream) callable.call());
                Intrinsics.checkNotNullExpressionValue(newChannel, "newChannel(inputStream)");
            } catch (Exception e6) {
                throw new IOException("inputStreamCallable exception on call", e6);
            }
        }
        File intermediateFile = File.createTempFile("room-copy-helper", ".tmp", this.f19547a.getCacheDir());
        intermediateFile.deleteOnExit();
        FileChannel output = new FileOutputStream(intermediateFile).getChannel();
        Intrinsics.checkNotNullExpressionValue(output, "output");
        AbstractC2269c.a(newChannel, output);
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        }
        Intrinsics.checkNotNullExpressionValue(intermediateFile, "intermediateFile");
        c(intermediateFile, z6);
        if (intermediateFile.renameTo(file)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + intermediateFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
    }

    public final void c(File file, boolean z6) {
        f fVar = this.f19553g;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("databaseConfiguration");
            fVar = null;
        }
        fVar.getClass();
    }

    @Override // A2.h, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        getDelegate().close();
        this.f19554h = false;
    }

    @Override // A2.h
    public String getDatabaseName() {
        return getDelegate().getDatabaseName();
    }

    @Override // v2.g
    public A2.h getDelegate() {
        return this.f19552f;
    }

    @Override // A2.h
    public void setWriteAheadLoggingEnabled(boolean z6) {
        getDelegate().setWriteAheadLoggingEnabled(z6);
    }
}
