package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.app.m;
import androidx.core.graphics.drawable.IconCompat;
import j0.C1639b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class p implements j {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8546a;

    /* renamed from: b, reason: collision with root package name */
    public final Notification.Builder f8547b;

    /* renamed from: c, reason: collision with root package name */
    public final m.e f8548c;

    /* renamed from: d, reason: collision with root package name */
    public RemoteViews f8549d;

    /* renamed from: e, reason: collision with root package name */
    public RemoteViews f8550e;

    /* renamed from: f, reason: collision with root package name */
    public final List f8551f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f8552g = new Bundle();

    /* renamed from: h, reason: collision with root package name */
    public int f8553h;

    /* renamed from: i, reason: collision with root package name */
    public RemoteViews f8554i;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {
        public static Notification.Builder a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        public static Notification.Action.Builder b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        public static Notification.Action.Builder c(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        public static Notification.Action d(Notification.Action.Builder builder) {
            return builder.build();
        }

        public static Notification.Builder e(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        public static Notification.Builder f(Notification.Builder builder, boolean z6) {
            return builder.setGroupSummary(z6);
        }

        public static Notification.Builder g(Notification.Builder builder, boolean z6) {
            return builder.setLocalOnly(z6);
        }

        public static Notification.Builder h(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b {
        public static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        public static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        public static Notification.Builder c(Notification.Builder builder, int i6) {
            return builder.setColor(i6);
        }

        public static Notification.Builder d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        public static Notification.Builder e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        public static Notification.Builder f(Notification.Builder builder, int i6) {
            return builder.setVisibility(i6);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class c {
        public static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        public static Notification.Builder b(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }

        public static Notification.Builder c(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class d {
        public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z6) {
            return builder.setAllowGeneratedReplies(z6);
        }

        public static Notification.Builder b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        public static Notification.Builder c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        public static Notification.Builder d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        public static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class e {
        public static Notification.Builder a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        public static Notification.Builder b(Notification.Builder builder, int i6) {
            return builder.setBadgeIconType(i6);
        }

        public static Notification.Builder c(Notification.Builder builder, boolean z6) {
            return builder.setColorized(z6);
        }

        public static Notification.Builder d(Notification.Builder builder, int i6) {
            return builder.setGroupAlertBehavior(i6);
        }

        public static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        public static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        public static Notification.Builder g(Notification.Builder builder, long j6) {
            return builder.setTimeoutAfter(j6);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class f {
        public static Notification.Builder a(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }

        public static Notification.Action.Builder b(Notification.Action.Builder builder, int i6) {
            return builder.setSemanticAction(i6);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class g {
        public static Notification.Builder a(Notification.Builder builder, boolean z6) {
            return builder.setAllowSystemGeneratedContextualActions(z6);
        }

        public static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        public static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z6) {
            return builder.setContextual(z6);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class h {
        public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z6) {
            return builder.setAuthenticationRequired(z6);
        }

        public static Notification.Builder b(Notification.Builder builder, int i6) {
            return builder.setForegroundServiceBehavior(i6);
        }
    }

    public p(m.e eVar) {
        int i6;
        this.f8548c = eVar;
        Context context = eVar.f8498a;
        this.f8546a = context;
        Notification.Builder a6 = e.a(context, eVar.f8487L);
        this.f8547b = a6;
        Notification notification = eVar.f8494S;
        a6.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eVar.f8506i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(eVar.f8502e).setContentText(eVar.f8503f).setContentInfo(eVar.f8508k).setContentIntent(eVar.f8504g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(eVar.f8505h, (notification.flags & 128) != 0).setNumber(eVar.f8509l).setProgress(eVar.f8518u, eVar.f8519v, eVar.f8520w);
        IconCompat iconCompat = eVar.f8507j;
        c.b(a6, iconCompat == null ? null : iconCompat.v(context));
        a6.setSubText(eVar.f8515r).setUsesChronometer(eVar.f8512o).setPriority(eVar.f8510m);
        m.j jVar = eVar.f8514q;
        if (jVar instanceof m.f) {
            Iterator it = ((m.f) jVar).b().iterator();
            while (it.hasNext()) {
                b((m.a) it.next());
            }
        } else {
            Iterator it2 = eVar.f8499b.iterator();
            while (it2.hasNext()) {
                b((m.a) it2.next());
            }
        }
        Bundle bundle = eVar.f8480E;
        if (bundle != null) {
            this.f8552g.putAll(bundle);
        }
        int i7 = Build.VERSION.SDK_INT;
        this.f8549d = eVar.f8484I;
        this.f8550e = eVar.f8485J;
        this.f8547b.setShowWhen(eVar.f8511n);
        a.g(this.f8547b, eVar.f8476A);
        a.e(this.f8547b, eVar.f8521x);
        a.h(this.f8547b, eVar.f8523z);
        a.f(this.f8547b, eVar.f8522y);
        this.f8553h = eVar.f8491P;
        b.b(this.f8547b, eVar.f8479D);
        b.c(this.f8547b, eVar.f8481F);
        b.f(this.f8547b, eVar.f8482G);
        b.d(this.f8547b, eVar.f8483H);
        b.e(this.f8547b, notification.sound, notification.audioAttributes);
        List e6 = i7 < 28 ? e(g(eVar.f8500c), eVar.f8497V) : eVar.f8497V;
        if (e6 != null && !e6.isEmpty()) {
            Iterator it3 = e6.iterator();
            while (it3.hasNext()) {
                b.a(this.f8547b, (String) it3.next());
            }
        }
        this.f8554i = eVar.f8486K;
        if (eVar.f8501d.size() > 0) {
            Bundle bundle2 = eVar.d().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i8 = 0; i8 < eVar.f8501d.size(); i8++) {
                bundle4.putBundle(Integer.toString(i8), q.a((m.a) eVar.f8501d.get(i8)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            eVar.d().putBundle("android.car.EXTENSIONS", bundle2);
            this.f8552g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i9 = Build.VERSION.SDK_INT;
        Object obj = eVar.f8496U;
        if (obj != null) {
            c.c(this.f8547b, obj);
        }
        this.f8547b.setExtras(eVar.f8480E);
        d.e(this.f8547b, eVar.f8517t);
        RemoteViews remoteViews = eVar.f8484I;
        if (remoteViews != null) {
            d.c(this.f8547b, remoteViews);
        }
        RemoteViews remoteViews2 = eVar.f8485J;
        if (remoteViews2 != null) {
            d.b(this.f8547b, remoteViews2);
        }
        RemoteViews remoteViews3 = eVar.f8486K;
        if (remoteViews3 != null) {
            d.d(this.f8547b, remoteViews3);
        }
        e.b(this.f8547b, eVar.f8488M);
        e.e(this.f8547b, eVar.f8516s);
        e.f(this.f8547b, eVar.f8489N);
        e.g(this.f8547b, eVar.f8490O);
        e.d(this.f8547b, eVar.f8491P);
        if (eVar.f8478C) {
            e.c(this.f8547b, eVar.f8477B);
        }
        if (!TextUtils.isEmpty(eVar.f8487L)) {
            this.f8547b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        if (i9 >= 28) {
            Iterator it4 = eVar.f8500c.iterator();
            while (it4.hasNext()) {
                f.a(this.f8547b, ((t) it4.next()).j());
            }
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            g.a(this.f8547b, eVar.f8493R);
            g.b(this.f8547b, m.d.a(null));
        }
        if (i10 >= 31 && (i6 = eVar.f8492Q) != 0) {
            h.b(this.f8547b, i6);
        }
        if (eVar.f8495T) {
            if (this.f8548c.f8522y) {
                this.f8553h = 2;
            } else {
                this.f8553h = 1;
            }
            this.f8547b.setVibrate(null);
            this.f8547b.setSound(null);
            int i11 = notification.defaults & (-4);
            notification.defaults = i11;
            this.f8547b.setDefaults(i11);
            if (TextUtils.isEmpty(this.f8548c.f8521x)) {
                a.e(this.f8547b, "silent");
            }
            e.d(this.f8547b, this.f8553h);
        }
    }

    public static List e(List list, List list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        C1639b c1639b = new C1639b(list.size() + list2.size());
        c1639b.addAll(list);
        c1639b.addAll(list2);
        return new ArrayList(c1639b);
    }

    public static List g(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((t) it.next()).i());
        }
        return arrayList;
    }

    @Override // androidx.core.app.j
    public Notification.Builder a() {
        return this.f8547b;
    }

    public final void b(m.a aVar) {
        IconCompat d6 = aVar.d();
        Notification.Action.Builder a6 = c.a(d6 != null ? d6.u() : null, aVar.h(), aVar.a());
        if (aVar.e() != null) {
            for (RemoteInput remoteInput : v.b(aVar.e())) {
                a.c(a6, remoteInput);
            }
        }
        Bundle bundle = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        int i6 = Build.VERSION.SDK_INT;
        d.a(a6, aVar.b());
        bundle.putInt("android.support.action.semanticAction", aVar.f());
        if (i6 >= 28) {
            f.b(a6, aVar.f());
        }
        if (i6 >= 29) {
            g.c(a6, aVar.j());
        }
        if (i6 >= 31) {
            h.a(a6, aVar.i());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.g());
        a.b(a6, bundle);
        a.a(this.f8547b, a.d(a6));
    }

    public Notification c() {
        Bundle a6;
        RemoteViews makeHeadsUpContentView;
        RemoteViews makeBigContentView;
        m.j jVar = this.f8548c.f8514q;
        if (jVar != null) {
            jVar.apply(this);
        }
        RemoteViews makeContentView = jVar != null ? jVar.makeContentView(this) : null;
        Notification d6 = d();
        if (makeContentView != null) {
            d6.contentView = makeContentView;
        } else {
            RemoteViews remoteViews = this.f8548c.f8484I;
            if (remoteViews != null) {
                d6.contentView = remoteViews;
            }
        }
        if (jVar != null && (makeBigContentView = jVar.makeBigContentView(this)) != null) {
            d6.bigContentView = makeBigContentView;
        }
        if (jVar != null && (makeHeadsUpContentView = this.f8548c.f8514q.makeHeadsUpContentView(this)) != null) {
            d6.headsUpContentView = makeHeadsUpContentView;
        }
        if (jVar != null && (a6 = m.a(d6)) != null) {
            jVar.addCompatExtras(a6);
        }
        return d6;
    }

    public Notification d() {
        return this.f8547b.build();
    }

    public Context f() {
        return this.f8546a;
    }
}
