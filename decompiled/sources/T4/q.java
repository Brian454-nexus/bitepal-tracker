package T4;

import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class q extends Exception {

    /* renamed from: g, reason: collision with root package name */
    public static final StackTraceElement[] f5098g = new StackTraceElement[0];

    /* renamed from: a, reason: collision with root package name */
    public final List f5099a;

    /* renamed from: b, reason: collision with root package name */
    public R4.f f5100b;

    /* renamed from: c, reason: collision with root package name */
    public R4.a f5101c;

    /* renamed from: d, reason: collision with root package name */
    public Class f5102d;

    /* renamed from: e, reason: collision with root package name */
    public String f5103e;

    /* renamed from: f, reason: collision with root package name */
    public Exception f5104f;

    public q(String str) {
        this(str, Collections.EMPTY_LIST);
    }

    public static void b(List list, Appendable appendable) {
        try {
            c(list, appendable);
        } catch (IOException e6) {
            throw new RuntimeException(e6);
        }
    }

    public static void c(List list, Appendable appendable) {
        int size = list.size();
        int i6 = 0;
        while (i6 < size) {
            int i7 = i6 + 1;
            appendable.append("Cause (").append(String.valueOf(i7)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = (Throwable) list.get(i6);
            if (th instanceof q) {
                ((q) th).h(appendable);
            } else {
                d(th, appendable);
            }
            i6 = i7;
        }
    }

    public static void d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    public final void a(Throwable th, List list) {
        if (!(th instanceof q)) {
            list.add(th);
            return;
        }
        Iterator it = ((q) th).e().iterator();
        while (it.hasNext()) {
            a((Throwable) it.next(), list);
        }
    }

    public List e() {
        return this.f5099a;
    }

    public List f() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        return arrayList;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }

    public void g(String str) {
        List f6 = f();
        int size = f6.size();
        int i6 = 0;
        while (i6 < size) {
            StringBuilder sb = new StringBuilder();
            sb.append("Root cause (");
            int i7 = i6 + 1;
            sb.append(i7);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i(str, sb.toString(), (Throwable) f6.get(i6));
            i6 = i7;
        }
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f5103e);
        sb.append(this.f5102d != null ? ", " + this.f5102d : "");
        sb.append(this.f5101c != null ? ", " + this.f5101c : "");
        sb.append(this.f5100b != null ? ", " + this.f5100b : "");
        List<Throwable> f6 = f();
        if (f6.isEmpty()) {
            return sb.toString();
        }
        if (f6.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(f6.size());
            sb.append(" root causes:");
        }
        for (Throwable th : f6) {
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    public final void h(Appendable appendable) {
        d(this, appendable);
        b(e(), new a(appendable));
    }

    public void i(R4.f fVar, R4.a aVar) {
        j(fVar, aVar, null);
    }

    public void j(R4.f fVar, R4.a aVar, Class cls) {
        this.f5100b = fVar;
        this.f5101c = aVar;
        this.f5102d = cls;
    }

    public void k(Exception exc) {
        this.f5104f = exc;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public q(String str, Throwable th) {
        this(str, Collections.singletonList(th));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        h(printStream);
    }

    public q(String str, List list) {
        this.f5103e = str;
        setStackTrace(f5098g);
        this.f5099a = list;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        h(printWriter);
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a implements Appendable {

        /* renamed from: a, reason: collision with root package name */
        public final Appendable f5105a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f5106b = true;

        public a(Appendable appendable) {
            this.f5105a = appendable;
        }

        public final CharSequence a(CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c6) {
            if (this.f5106b) {
                this.f5106b = false;
                this.f5105a.append("  ");
            }
            this.f5106b = c6 == '\n';
            this.f5105a.append(c6);
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence) {
            CharSequence a6 = a(charSequence);
            return append(a6, 0, a6.length());
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence, int i6, int i7) {
            CharSequence a6 = a(charSequence);
            boolean z6 = false;
            if (this.f5106b) {
                this.f5106b = false;
                this.f5105a.append("  ");
            }
            if (a6.length() > 0 && a6.charAt(i7 - 1) == '\n') {
                z6 = true;
            }
            this.f5106b = z6;
            this.f5105a.append(a6, i6, i7);
            return this;
        }
    }
}
