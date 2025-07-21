package com.amazon.a.a.i;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import com.amazon.a.a.i.c;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class h extends b {

    /* renamed from: b, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f10973b = new com.amazon.a.a.o.c("SimplePrompt");

    /* renamed from: e, reason: collision with root package name */
    private static final String f10974e = "OK";

    /* renamed from: c, reason: collision with root package name */
    protected final c f10975c;

    /* renamed from: d, reason: collision with root package name */
    protected final a f10976d;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public enum a {
        LEGACY,
        EXTENDED
    }

    public h(c cVar) {
        this(cVar, a.LEGACY);
    }

    private void a(AlertDialog.Builder builder) {
        String[] b6 = this.f10975c.b();
        if (b6.length >= 1 && b6.length <= 2) {
            boolean[] a6 = a(this.f10975c.c());
            int i6 = -1;
            int i7 = 0;
            for (int i8 = 0; i8 < a6.length; i8++) {
                if (a6[i8]) {
                    i7++;
                    i6 = i8;
                }
            }
            if (i7 == 1) {
                f10973b.a("single button dialog");
                a(builder, b6[i6], i6);
                return;
            } else {
                f10973b.a("two button dialog");
                builder.setNegativeButton(b6[0], new DialogInterface.OnClickListener() { // from class: com.amazon.a.a.i.h.2
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i9) {
                        if (h.this.k()) {
                            h.this.a(0);
                        }
                    }
                });
                builder.setPositiveButton(b6[1], new DialogInterface.OnClickListener() { // from class: com.amazon.a.a.i.h.3
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i9) {
                        if (h.this.k()) {
                            h.this.a(1);
                        }
                    }
                });
                return;
            }
        }
        f10973b.b("Unexpected button count: " + b6.length);
    }

    private final Dialog e(Activity activity) {
        f10973b.a("Legacy mode dialog, legacy title = " + this.f10975c.e() + ", extended title = " + this.f10975c.f());
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle(this.f10975c.f()).setMessage(this.f10975c.d()).setCancelable(false).setNeutralButton(f10974e, new DialogInterface.OnClickListener() { // from class: com.amazon.a.a.i.h.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i6) {
                if (h.this.k()) {
                    h.this.i();
                }
            }
        });
        return builder.create();
    }

    private final Dialog f(Activity activity) {
        com.amazon.a.a.o.c cVar = f10973b;
        cVar.a("doCreate() called to create extended dialog");
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle(this.f10975c.f()).setMessage(this.f10975c.d()).setCancelable(false);
        a(builder);
        cVar.a("doCreate() returning");
        return builder.create();
    }

    @Override // com.amazon.a.a.i.b
    public boolean b(Activity activity) {
        return this.f10975c.h();
    }

    @Override // com.amazon.a.a.i.b
    public final Dialog d(Activity activity) {
        return this.f10976d == a.LEGACY ? e(activity) : f(activity);
    }

    public abstract void i();

    public h(c cVar, a aVar) {
        com.amazon.a.a.o.a.a.a((Object) cVar, "content");
        this.f10975c = cVar;
        this.f10976d = aVar;
        f10973b.a("created SimplePrompt with mode " + aVar);
    }

    private void a(AlertDialog.Builder builder, String str, final int i6) {
        builder.setNeutralButton(str, new DialogInterface.OnClickListener() { // from class: com.amazon.a.a.i.h.4
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i7) {
                if (h.this.k()) {
                    h.this.a(i6);
                }
            }
        });
    }

    private boolean[] a(c.a[] aVarArr) {
        if (aVarArr == null) {
            return null;
        }
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i6 = 0; i6 < aVarArr.length; i6++) {
            boolean a6 = a(aVarArr[i6]);
            zArr[i6] = a6;
            if (!a6) {
                f10973b.a("filterActions() filtering item " + i6);
            }
        }
        return zArr;
    }

    @Override // com.amazon.a.a.i.b
    public void a(d dVar) {
        i();
    }

    public void a(int i6) {
        f10973b.b("extended doAction from base class called, this should never happen.");
        i();
    }

    public boolean a(c.a aVar) {
        return aVar == c.a.DEFAULT;
    }
}
