package r5;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import r5.c;
import s5.i;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final Set f18715a;

    /* renamed from: b, reason: collision with root package name */
    public final c.b f18716b;

    /* renamed from: c, reason: collision with root package name */
    public final c.a f18717c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f18718d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f18719e;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f18720a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f18721b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f18722c;

        public a(Context context, String str, String str2, c.InterfaceC0243c interfaceC0243c) {
            this.f18720a = context;
            this.f18721b = str;
            this.f18722c = str2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:?, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:?, code lost:
        
            throw null;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r5 = this;
                r0 = 0
                r5.d r1 = r5.d.this     // Catch: r5.b -> Ld java.lang.UnsatisfiedLinkError -> Le
                android.content.Context r2 = r5.f18720a     // Catch: r5.b -> Ld java.lang.UnsatisfiedLinkError -> Le
                java.lang.String r3 = r5.f18721b     // Catch: r5.b -> Ld java.lang.UnsatisfiedLinkError -> Le
                java.lang.String r4 = r5.f18722c     // Catch: r5.b -> Ld java.lang.UnsatisfiedLinkError -> Le
                r5.d.a(r1, r2, r3, r4)     // Catch: r5.b -> Ld java.lang.UnsatisfiedLinkError -> Le
                throw r0
            Ld:
                throw r0
            Le:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: r5.d.a.run():void");
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class b implements FilenameFilter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f18724a;

        public b(String str) {
            this.f18724a = str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.startsWith(this.f18724a);
        }
    }

    public d() {
        this(new e(), new r5.a());
    }

    public void b(Context context, String str, String str2) {
        File c6 = c(context);
        File d6 = d(context, str, str2);
        File[] listFiles = c6.listFiles(new b(this.f18716b.a(str)));
        if (listFiles == null) {
            return;
        }
        for (File file : listFiles) {
            if (this.f18718d || !file.getAbsolutePath().equals(d6.getAbsolutePath())) {
                file.delete();
            }
        }
    }

    public File c(Context context) {
        return context.getDir("lib", 0);
    }

    public File d(Context context, String str, String str2) {
        String a6 = this.f18716b.a(str);
        if (f.a(str2)) {
            return new File(c(context), a6);
        }
        return new File(c(context), a6 + "." + str2);
    }

    public void e(Context context, String str) {
        f(context, str, null, null);
    }

    public void f(Context context, String str, String str2, c.InterfaceC0243c interfaceC0243c) {
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        }
        if (f.a(str)) {
            throw new IllegalArgumentException("Given library is either null or empty");
        }
        i("Beginning load of %s...", str);
        if (interfaceC0243c == null) {
            g(context, str, str2);
        } else {
            new Thread(new a(context, str, str2, interfaceC0243c)).start();
        }
    }

    public final void g(Context context, String str, String str2) {
        d dVar;
        Context context2;
        i iVar;
        if (this.f18715a.contains(str) && !this.f18718d) {
            i("%s already loaded previously!", str);
            return;
        }
        try {
            this.f18716b.b(str);
            this.f18715a.add(str);
            i("%s (%s) was loaded normally!", str, str2);
        } catch (UnsatisfiedLinkError e6) {
            i("Loading the library normally failed: %s", Log.getStackTraceString(e6));
            i("%s (%s) was not loaded normally, re-linking...", str, str2);
            File d6 = d(context, str, str2);
            if (!d6.exists() || this.f18718d) {
                if (this.f18718d) {
                    i("Forcing a re-link of %s (%s)...", str, str2);
                }
                b(context, str, str2);
                dVar = this;
                context2 = context;
                this.f18717c.a(context2, this.f18716b.d(), this.f18716b.a(str), d6, dVar);
            } else {
                dVar = this;
                context2 = context;
            }
            try {
                if (dVar.f18719e) {
                    try {
                        iVar = new i(d6);
                        try {
                            List D6 = iVar.D();
                            iVar.close();
                            Iterator it = D6.iterator();
                            while (it.hasNext()) {
                                e(context2, dVar.f18716b.c((String) it.next()));
                            }
                        } catch (Throwable th) {
                            th = th;
                            Throwable th2 = th;
                            if (iVar == null) {
                                throw th2;
                            }
                            iVar.close();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        iVar = null;
                    }
                }
            } catch (IOException unused) {
            }
            dVar.f18716b.e(d6.getAbsolutePath());
            dVar.f18715a.add(str);
            i("%s (%s) was re-linked!", str, str2);
        }
    }

    public void h(String str) {
    }

    public void i(String str, Object... objArr) {
        h(String.format(Locale.US, str, objArr));
    }

    public d(c.b bVar, c.a aVar) {
        this.f18715a = new HashSet();
        if (bVar == null) {
            throw new IllegalArgumentException("Cannot pass null library loader");
        }
        if (aVar != null) {
            this.f18716b = bVar;
            this.f18717c = aVar;
            return;
        }
        throw new IllegalArgumentException("Cannot pass null library installer");
    }
}
