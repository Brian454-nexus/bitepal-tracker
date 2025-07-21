package v2;

import A2.h;
import android.content.Context;
import android.content.Intent;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import v2.u;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final Context f19408a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19409b;

    /* renamed from: c, reason: collision with root package name */
    public final h.c f19410c;

    /* renamed from: d, reason: collision with root package name */
    public final u.e f19411d;

    /* renamed from: e, reason: collision with root package name */
    public final List f19412e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f19413f;

    /* renamed from: g, reason: collision with root package name */
    public final u.d f19414g;

    /* renamed from: h, reason: collision with root package name */
    public final Executor f19415h;

    /* renamed from: i, reason: collision with root package name */
    public final Executor f19416i;

    /* renamed from: j, reason: collision with root package name */
    public final Intent f19417j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f19418k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f19419l;

    /* renamed from: m, reason: collision with root package name */
    public final Set f19420m;

    /* renamed from: n, reason: collision with root package name */
    public final String f19421n;

    /* renamed from: o, reason: collision with root package name */
    public final File f19422o;

    /* renamed from: p, reason: collision with root package name */
    public final Callable f19423p;

    /* renamed from: q, reason: collision with root package name */
    public final List f19424q;

    /* renamed from: r, reason: collision with root package name */
    public final List f19425r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f19426s;

    public f(Context context, String str, h.c sqliteOpenHelperFactory, u.e migrationContainer, List list, boolean z6, u.d journalMode, Executor queryExecutor, Executor transactionExecutor, Intent intent, boolean z7, boolean z8, Set set, String str2, File file, Callable callable, u.f fVar, List typeConverters, List autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(migrationContainer, "migrationContainer");
        Intrinsics.checkNotNullParameter(journalMode, "journalMode");
        Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
        Intrinsics.checkNotNullParameter(transactionExecutor, "transactionExecutor");
        Intrinsics.checkNotNullParameter(typeConverters, "typeConverters");
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        this.f19408a = context;
        this.f19409b = str;
        this.f19410c = sqliteOpenHelperFactory;
        this.f19411d = migrationContainer;
        this.f19412e = list;
        this.f19413f = z6;
        this.f19414g = journalMode;
        this.f19415h = queryExecutor;
        this.f19416i = transactionExecutor;
        this.f19417j = intent;
        this.f19418k = z7;
        this.f19419l = z8;
        this.f19420m = set;
        this.f19421n = str2;
        this.f19422o = file;
        this.f19423p = callable;
        this.f19424q = typeConverters;
        this.f19425r = autoMigrationSpecs;
        this.f19426s = intent != null;
    }

    public boolean a(int i6, int i7) {
        Set set;
        return (i6 <= i7 || !this.f19419l) && this.f19418k && ((set = this.f19420m) == null || !set.contains(Integer.valueOf(i6)));
    }
}
