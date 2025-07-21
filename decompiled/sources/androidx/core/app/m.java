package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.annotation.NonNull;
import androidx.core.app.t;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import m0.AbstractC1788b;
import m0.AbstractC1789c;
import m0.AbstractC1790d;
import m0.AbstractC1792f;
import n0.AbstractC1809a;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class m {

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Bundle f8448a;

        /* renamed from: b, reason: collision with root package name */
        public IconCompat f8449b;

        /* renamed from: c, reason: collision with root package name */
        public final v[] f8450c;

        /* renamed from: d, reason: collision with root package name */
        public final v[] f8451d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f8452e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f8453f;

        /* renamed from: g, reason: collision with root package name */
        public final int f8454g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f8455h;

        /* renamed from: i, reason: collision with root package name */
        public int f8456i;

        /* renamed from: j, reason: collision with root package name */
        public CharSequence f8457j;

        /* renamed from: k, reason: collision with root package name */
        public PendingIntent f8458k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f8459l;

        /* renamed from: androidx.core.app.m$a$a, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class C0125a {

            /* renamed from: a, reason: collision with root package name */
            public final IconCompat f8460a;

            /* renamed from: b, reason: collision with root package name */
            public final CharSequence f8461b;

            /* renamed from: c, reason: collision with root package name */
            public final PendingIntent f8462c;

            /* renamed from: d, reason: collision with root package name */
            public boolean f8463d;

            /* renamed from: e, reason: collision with root package name */
            public final Bundle f8464e;

            /* renamed from: f, reason: collision with root package name */
            public ArrayList f8465f;

            /* renamed from: g, reason: collision with root package name */
            public int f8466g;

            /* renamed from: h, reason: collision with root package name */
            public boolean f8467h;

            /* renamed from: i, reason: collision with root package name */
            public boolean f8468i;

            /* renamed from: j, reason: collision with root package name */
            public boolean f8469j;

            public C0125a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
                this(iconCompat, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            public C0125a a(Bundle bundle) {
                if (bundle != null) {
                    this.f8464e.putAll(bundle);
                }
                return this;
            }

            public C0125a b(v vVar) {
                if (this.f8465f == null) {
                    this.f8465f = new ArrayList();
                }
                if (vVar != null) {
                    this.f8465f.add(vVar);
                }
                return this;
            }

            public a c() {
                d();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = this.f8465f;
                if (arrayList3 != null) {
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        v vVar = (v) it.next();
                        if (vVar.k()) {
                            arrayList.add(vVar);
                        } else {
                            arrayList2.add(vVar);
                        }
                    }
                }
                return new a(this.f8460a, this.f8461b, this.f8462c, this.f8464e, arrayList2.isEmpty() ? null : (v[]) arrayList2.toArray(new v[arrayList2.size()]), arrayList.isEmpty() ? null : (v[]) arrayList.toArray(new v[arrayList.size()]), this.f8463d, this.f8466g, this.f8467h, this.f8468i, this.f8469j);
            }

            public final void d() {
                if (this.f8468i && this.f8462c == null) {
                    throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
                }
            }

            public C0125a e(boolean z6) {
                this.f8463d = z6;
                return this;
            }

            public C0125a f(boolean z6) {
                this.f8468i = z6;
                return this;
            }

            public C0125a g(boolean z6) {
                this.f8467h = z6;
                return this;
            }

            public C0125a(int i6, CharSequence charSequence, PendingIntent pendingIntent) {
                this(i6 != 0 ? IconCompat.k(null, "", i6) : null, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            public C0125a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, v[] vVarArr, boolean z6, int i6, boolean z7, boolean z8, boolean z9) {
                this.f8463d = true;
                this.f8467h = true;
                this.f8460a = iconCompat;
                this.f8461b = e.e(charSequence);
                this.f8462c = pendingIntent;
                this.f8464e = bundle;
                this.f8465f = vVarArr == null ? null : new ArrayList(Arrays.asList(vVarArr));
                this.f8463d = z6;
                this.f8466g = i6;
                this.f8467h = z7;
                this.f8468i = z8;
                this.f8469j = z9;
            }
        }

        public a(int i6, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i6 != 0 ? IconCompat.k(null, "", i6) : null, charSequence, pendingIntent);
        }

        public PendingIntent a() {
            return this.f8458k;
        }

        public boolean b() {
            return this.f8452e;
        }

        public Bundle c() {
            return this.f8448a;
        }

        public IconCompat d() {
            int i6;
            if (this.f8449b == null && (i6 = this.f8456i) != 0) {
                this.f8449b = IconCompat.k(null, "", i6);
            }
            return this.f8449b;
        }

        public v[] e() {
            return this.f8450c;
        }

        public int f() {
            return this.f8454g;
        }

        public boolean g() {
            return this.f8453f;
        }

        public CharSequence h() {
            return this.f8457j;
        }

        public boolean i() {
            return this.f8459l;
        }

        public boolean j() {
            return this.f8455h;
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false, false);
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, v[] vVarArr, v[] vVarArr2, boolean z6, int i6, boolean z7, boolean z8, boolean z9) {
            this.f8453f = true;
            this.f8449b = iconCompat;
            if (iconCompat != null && iconCompat.o() == 2) {
                this.f8456i = iconCompat.m();
            }
            this.f8457j = e.e(charSequence);
            this.f8458k = pendingIntent;
            this.f8448a = bundle == null ? new Bundle() : bundle;
            this.f8450c = vVarArr;
            this.f8451d = vVarArr2;
            this.f8452e = z6;
            this.f8454g = i6;
            this.f8453f = z7;
            this.f8455h = z8;
            this.f8459l = z9;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b extends j {

        /* renamed from: a, reason: collision with root package name */
        public IconCompat f8470a;

        /* renamed from: b, reason: collision with root package name */
        public IconCompat f8471b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f8472c;

        /* renamed from: d, reason: collision with root package name */
        public CharSequence f8473d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f8474e;

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static class a {
            public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* renamed from: androidx.core.app.m$b$b, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static class C0126b {
            public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            public static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            public static void c(Notification.BigPictureStyle bigPictureStyle, boolean z6) {
                bigPictureStyle.showBigPictureWhenCollapsed(z6);
            }
        }

        public static IconCompat b(Parcelable parcelable) {
            if (parcelable == null) {
                return null;
            }
            if (parcelable instanceof Icon) {
                return IconCompat.b((Icon) parcelable);
            }
            if (parcelable instanceof Bitmap) {
                return IconCompat.f((Bitmap) parcelable);
            }
            return null;
        }

        public static IconCompat e(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            Parcelable parcelable = bundle.getParcelable("android.picture");
            return parcelable != null ? b(parcelable) : b(bundle.getParcelable("android.pictureIcon"));
        }

        @Override // androidx.core.app.m.j
        public void apply(androidx.core.app.j jVar) {
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(jVar.a()).setBigContentTitle(this.mBigContentTitle);
            IconCompat iconCompat = this.f8470a;
            if (iconCompat != null) {
                if (Build.VERSION.SDK_INT >= 31) {
                    C0126b.a(bigContentTitle, this.f8470a.v(jVar instanceof p ? ((p) jVar).f() : null));
                } else if (iconCompat.o() == 1) {
                    bigContentTitle = bigContentTitle.bigPicture(this.f8470a.l());
                }
            }
            if (this.f8472c) {
                if (this.f8471b == null) {
                    bigContentTitle.bigLargeIcon((Bitmap) null);
                } else {
                    a.a(bigContentTitle, this.f8471b.v(jVar instanceof p ? ((p) jVar).f() : null));
                }
            }
            if (this.mSummaryTextSet) {
                bigContentTitle.setSummaryText(this.mSummaryText);
            }
            if (Build.VERSION.SDK_INT >= 31) {
                C0126b.c(bigContentTitle, this.f8474e);
                C0126b.b(bigContentTitle, this.f8473d);
            }
        }

        public b c(Bitmap bitmap) {
            this.f8471b = bitmap == null ? null : IconCompat.f(bitmap);
            this.f8472c = true;
            return this;
        }

        public b d(Bitmap bitmap) {
            this.f8470a = bitmap == null ? null : IconCompat.f(bitmap);
            return this;
        }

        public b f(CharSequence charSequence) {
            this.mBigContentTitle = e.e(charSequence);
            return this;
        }

        public b g(CharSequence charSequence) {
            this.mSummaryText = e.e(charSequence);
            this.mSummaryTextSet = true;
            return this;
        }

        @Override // androidx.core.app.m.j
        public String getClassName() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        @Override // androidx.core.app.m.j
        public void restoreFromCompatExtras(Bundle bundle) {
            super.restoreFromCompatExtras(bundle);
            if (bundle.containsKey("android.largeIcon.big")) {
                this.f8471b = b(bundle.getParcelable("android.largeIcon.big"));
                this.f8472c = true;
            }
            this.f8470a = e(bundle);
            this.f8474e = bundle.getBoolean("android.showBigPictureWhenCollapsed");
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class c extends j {

        /* renamed from: a, reason: collision with root package name */
        public CharSequence f8475a;

        @Override // androidx.core.app.m.j
        public void addCompatExtras(Bundle bundle) {
            super.addCompatExtras(bundle);
        }

        @Override // androidx.core.app.m.j
        public void apply(androidx.core.app.j jVar) {
            Notification.BigTextStyle bigText = new Notification.BigTextStyle(jVar.a()).setBigContentTitle(this.mBigContentTitle).bigText(this.f8475a);
            if (this.mSummaryTextSet) {
                bigText.setSummaryText(this.mSummaryText);
            }
        }

        public c b(CharSequence charSequence) {
            this.f8475a = e.e(charSequence);
            return this;
        }

        public c c(CharSequence charSequence) {
            this.mBigContentTitle = e.e(charSequence);
            return this;
        }

        public c d(CharSequence charSequence) {
            this.mSummaryText = e.e(charSequence);
            this.mSummaryTextSet = true;
            return this;
        }

        @Override // androidx.core.app.m.j
        public String getClassName() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        @Override // androidx.core.app.m.j
        public void restoreFromCompatExtras(Bundle bundle) {
            super.restoreFromCompatExtras(bundle);
            this.f8475a = bundle.getCharSequence("android.bigText");
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class d {
        public static Notification.BubbleMetadata a(d dVar) {
            return null;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class f extends j {

        /* renamed from: a, reason: collision with root package name */
        public int f8524a;

        /* renamed from: b, reason: collision with root package name */
        public t f8525b;

        /* renamed from: c, reason: collision with root package name */
        public PendingIntent f8526c;

        /* renamed from: d, reason: collision with root package name */
        public PendingIntent f8527d;

        /* renamed from: e, reason: collision with root package name */
        public PendingIntent f8528e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f8529f;

        /* renamed from: g, reason: collision with root package name */
        public Integer f8530g;

        /* renamed from: h, reason: collision with root package name */
        public Integer f8531h;

        /* renamed from: i, reason: collision with root package name */
        public IconCompat f8532i;

        /* renamed from: j, reason: collision with root package name */
        public CharSequence f8533j;

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static class a {
            public static Notification.Builder a(Notification.Builder builder, String str) {
                return builder.addPerson(str);
            }

            public static Notification.Builder b(Notification.Builder builder, String str) {
                return builder.setCategory(str);
            }
        }

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static class b {
            public static Parcelable a(Icon icon) {
                return icon;
            }

            public static void b(Notification.Builder builder, Icon icon) {
                builder.setLargeIcon(icon);
            }
        }

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static class c {
            public static Notification.Builder a(Notification.Builder builder, Person person) {
                return builder.addPerson(person);
            }

            public static Parcelable b(Person person) {
                return person;
            }
        }

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static class d {
            public static Notification.CallStyle a(@NonNull Person person, @NonNull PendingIntent pendingIntent, @NonNull PendingIntent pendingIntent2) {
                return Notification.CallStyle.forIncomingCall(person, pendingIntent, pendingIntent2);
            }

            public static Notification.CallStyle b(@NonNull Person person, @NonNull PendingIntent pendingIntent) {
                return Notification.CallStyle.forOngoingCall(person, pendingIntent);
            }

            public static Notification.CallStyle c(@NonNull Person person, @NonNull PendingIntent pendingIntent, @NonNull PendingIntent pendingIntent2) {
                return Notification.CallStyle.forScreeningCall(person, pendingIntent, pendingIntent2);
            }

            public static Notification.CallStyle d(Notification.CallStyle callStyle, int i6) {
                return callStyle.setAnswerButtonColorHint(i6);
            }

            public static Notification.CallStyle e(Notification.CallStyle callStyle, int i6) {
                return callStyle.setDeclineButtonColorHint(i6);
            }

            public static Notification.CallStyle f(Notification.CallStyle callStyle, boolean z6) {
                return callStyle.setIsVideo(z6);
            }

            public static Notification.CallStyle g(Notification.CallStyle callStyle, Icon icon) {
                return callStyle.setVerificationIcon(icon);
            }

            public static Notification.CallStyle h(Notification.CallStyle callStyle, CharSequence charSequence) {
                return callStyle.setVerificationText(charSequence);
            }
        }

        @Override // androidx.core.app.m.j
        public void addCompatExtras(Bundle bundle) {
            super.addCompatExtras(bundle);
            bundle.putInt("android.callType", this.f8524a);
            bundle.putBoolean("android.callIsVideo", this.f8529f);
            t tVar = this.f8525b;
            if (tVar != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable("android.callPerson", c.b(tVar.j()));
                } else {
                    bundle.putParcelable("android.callPersonCompat", tVar.k());
                }
            }
            IconCompat iconCompat = this.f8532i;
            if (iconCompat != null) {
                bundle.putParcelable("android.verificationIcon", b.a(iconCompat.v(this.mBuilder.f8498a)));
            }
            bundle.putCharSequence("android.verificationText", this.f8533j);
            bundle.putParcelable("android.answerIntent", this.f8526c);
            bundle.putParcelable("android.declineIntent", this.f8527d);
            bundle.putParcelable("android.hangUpIntent", this.f8528e);
            Integer num = this.f8530g;
            if (num != null) {
                bundle.putInt("android.answerColor", num.intValue());
            }
            Integer num2 = this.f8531h;
            if (num2 != null) {
                bundle.putInt("android.declineColor", num2.intValue());
            }
        }

        @Override // androidx.core.app.m.j
        public void apply(androidx.core.app.j jVar) {
            int i6 = Build.VERSION.SDK_INT;
            CharSequence charSequence = null;
            r2 = null;
            Notification.CallStyle a6 = null;
            charSequence = null;
            if (i6 < 31) {
                Notification.Builder a7 = jVar.a();
                t tVar = this.f8525b;
                a7.setContentTitle(tVar != null ? tVar.e() : null);
                Bundle bundle = this.mBuilder.f8480E;
                if (bundle != null && bundle.containsKey("android.text")) {
                    charSequence = this.mBuilder.f8480E.getCharSequence("android.text");
                }
                if (charSequence == null) {
                    charSequence = c();
                }
                a7.setContentText(charSequence);
                t tVar2 = this.f8525b;
                if (tVar2 != null) {
                    if (tVar2.c() != null) {
                        b.b(a7, this.f8525b.c().v(this.mBuilder.f8498a));
                    }
                    if (i6 >= 28) {
                        c.a(a7, this.f8525b.j());
                    } else {
                        a.a(a7, this.f8525b.f());
                    }
                }
                a.b(a7, "call");
                return;
            }
            int i7 = this.f8524a;
            if (i7 == 1) {
                a6 = d.a(this.f8525b.j(), this.f8527d, this.f8526c);
            } else if (i7 == 2) {
                a6 = d.b(this.f8525b.j(), this.f8528e);
            } else if (i7 == 3) {
                a6 = d.c(this.f8525b.j(), this.f8528e, this.f8526c);
            } else if (Log.isLoggable("NotifCompat", 3)) {
                Log.d("NotifCompat", "Unrecognized call type in CallStyle: " + String.valueOf(this.f8524a));
            }
            if (a6 != null) {
                a6.setBuilder(jVar.a());
                Integer num = this.f8530g;
                if (num != null) {
                    d.d(a6, num.intValue());
                }
                Integer num2 = this.f8531h;
                if (num2 != null) {
                    d.e(a6, num2.intValue());
                }
                d.h(a6, this.f8533j);
                IconCompat iconCompat = this.f8532i;
                if (iconCompat != null) {
                    d.g(a6, iconCompat.v(this.mBuilder.f8498a));
                }
                d.f(a6, this.f8529f);
            }
        }

        public ArrayList b() {
            a g6 = g();
            a f6 = f();
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(g6);
            ArrayList<a> arrayList2 = this.mBuilder.f8499b;
            int i6 = 2;
            if (arrayList2 != null) {
                for (a aVar : arrayList2) {
                    if (aVar.j()) {
                        arrayList.add(aVar);
                    } else if (!d(aVar) && i6 > 1) {
                        arrayList.add(aVar);
                        i6--;
                    }
                    if (f6 != null && i6 == 1) {
                        arrayList.add(f6);
                        i6--;
                    }
                }
            }
            if (f6 != null && i6 >= 1) {
                arrayList.add(f6);
            }
            return arrayList;
        }

        public final String c() {
            int i6 = this.f8524a;
            if (i6 == 1) {
                return this.mBuilder.f8498a.getResources().getString(AbstractC1792f.f17196e);
            }
            if (i6 == 2) {
                return this.mBuilder.f8498a.getResources().getString(AbstractC1792f.f17197f);
            }
            if (i6 != 3) {
                return null;
            }
            return this.mBuilder.f8498a.getResources().getString(AbstractC1792f.f17198g);
        }

        public final boolean d(a aVar) {
            return aVar != null && aVar.c().getBoolean("key_action_priority");
        }

        public final a e(int i6, int i7, Integer num, int i8, PendingIntent pendingIntent) {
            if (num == null) {
                num = Integer.valueOf(AbstractC1809a.getColor(this.mBuilder.f8498a, i8));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.mBuilder.f8498a.getResources().getString(i7));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
            a c6 = new a.C0125a(IconCompat.j(this.mBuilder.f8498a, i6), spannableStringBuilder, pendingIntent).c();
            c6.c().putBoolean("key_action_priority", true);
            return c6;
        }

        public final a f() {
            int i6 = AbstractC1790d.f17147b;
            int i7 = AbstractC1790d.f17146a;
            PendingIntent pendingIntent = this.f8526c;
            if (pendingIntent == null) {
                return null;
            }
            boolean z6 = this.f8529f;
            return e(z6 ? i6 : i7, z6 ? AbstractC1792f.f17193b : AbstractC1792f.f17192a, this.f8530g, AbstractC1788b.f17142a, pendingIntent);
        }

        public final a g() {
            int i6 = AbstractC1790d.f17148c;
            PendingIntent pendingIntent = this.f8527d;
            return pendingIntent == null ? e(i6, AbstractC1792f.f17195d, this.f8531h, AbstractC1788b.f17143b, this.f8528e) : e(i6, AbstractC1792f.f17194c, this.f8531h, AbstractC1788b.f17143b, pendingIntent);
        }

        @Override // androidx.core.app.m.j
        public String getClassName() {
            return "androidx.core.app.NotificationCompat$CallStyle";
        }

        @Override // androidx.core.app.m.j
        public void restoreFromCompatExtras(Bundle bundle) {
            super.restoreFromCompatExtras(bundle);
            this.f8524a = bundle.getInt("android.callType");
            this.f8529f = bundle.getBoolean("android.callIsVideo");
            if (Build.VERSION.SDK_INT >= 28 && bundle.containsKey("android.callPerson")) {
                this.f8525b = t.a(o.a(bundle.getParcelable("android.callPerson")));
            } else if (bundle.containsKey("android.callPersonCompat")) {
                this.f8525b = t.b(bundle.getBundle("android.callPersonCompat"));
            }
            if (bundle.containsKey("android.verificationIcon")) {
                this.f8532i = IconCompat.b((Icon) bundle.getParcelable("android.verificationIcon"));
            } else if (bundle.containsKey("android.verificationIconCompat")) {
                this.f8532i = IconCompat.a(bundle.getBundle("android.verificationIconCompat"));
            }
            this.f8533j = bundle.getCharSequence("android.verificationText");
            this.f8526c = (PendingIntent) bundle.getParcelable("android.answerIntent");
            this.f8527d = (PendingIntent) bundle.getParcelable("android.declineIntent");
            this.f8528e = (PendingIntent) bundle.getParcelable("android.hangUpIntent");
            this.f8530g = bundle.containsKey("android.answerColor") ? Integer.valueOf(bundle.getInt("android.answerColor")) : null;
            this.f8531h = bundle.containsKey("android.declineColor") ? Integer.valueOf(bundle.getInt("android.declineColor")) : null;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class g extends j {

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static class a {
            public static Notification.Style a() {
                return new Notification.DecoratedCustomViewStyle();
            }
        }

        @Override // androidx.core.app.m.j
        public void apply(androidx.core.app.j jVar) {
            jVar.a().setStyle(a.a());
        }

        @Override // androidx.core.app.m.j
        public String getClassName() {
            return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
        }

        @Override // androidx.core.app.m.j
        public RemoteViews makeBigContentView(androidx.core.app.j jVar) {
            return null;
        }

        @Override // androidx.core.app.m.j
        public RemoteViews makeContentView(androidx.core.app.j jVar) {
            return null;
        }

        @Override // androidx.core.app.m.j
        public RemoteViews makeHeadsUpContentView(androidx.core.app.j jVar) {
            return null;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class h extends j {

        /* renamed from: a, reason: collision with root package name */
        public ArrayList f8534a = new ArrayList();

        @Override // androidx.core.app.m.j
        public void apply(androidx.core.app.j jVar) {
            Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(jVar.a()).setBigContentTitle(this.mBigContentTitle);
            if (this.mSummaryTextSet) {
                bigContentTitle.setSummaryText(this.mSummaryText);
            }
            Iterator it = this.f8534a.iterator();
            while (it.hasNext()) {
                bigContentTitle.addLine((CharSequence) it.next());
            }
        }

        public h b(CharSequence charSequence) {
            if (charSequence != null) {
                this.f8534a.add(e.e(charSequence));
            }
            return this;
        }

        public h c(CharSequence charSequence) {
            this.mBigContentTitle = e.e(charSequence);
            return this;
        }

        public h d(CharSequence charSequence) {
            this.mSummaryText = e.e(charSequence);
            this.mSummaryTextSet = true;
            return this;
        }

        @Override // androidx.core.app.m.j
        public String getClassName() {
            return "androidx.core.app.NotificationCompat$InboxStyle";
        }

        @Override // androidx.core.app.m.j
        public void restoreFromCompatExtras(Bundle bundle) {
            super.restoreFromCompatExtras(bundle);
            this.f8534a.clear();
            if (bundle.containsKey("android.textLines")) {
                Collections.addAll(this.f8534a, bundle.getCharSequenceArray("android.textLines"));
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class j {
        CharSequence mBigContentTitle;
        protected e mBuilder;
        CharSequence mSummaryText;
        boolean mSummaryTextSet = false;

        public static j a(String str) {
            if (str == null) {
                return null;
            }
            if (str.equals(Notification.BigPictureStyle.class.getName())) {
                return new b();
            }
            if (str.equals(Notification.BigTextStyle.class.getName())) {
                return new c();
            }
            if (str.equals(Notification.InboxStyle.class.getName())) {
                return new h();
            }
            if (str.equals(Notification.MessagingStyle.class.getName())) {
                return new i();
            }
            if (str.equals(Notification.DecoratedCustomViewStyle.class.getName())) {
                return new g();
            }
            return null;
        }

        public static j constructCompatStyleByName(String str) {
            if (str == null) {
                return null;
            }
            char c6 = 65535;
            switch (str.hashCode()) {
                case -716705180:
                    if (str.equals("androidx.core.app.NotificationCompat$DecoratedCustomViewStyle")) {
                        c6 = 0;
                        break;
                    }
                    break;
                case -171946061:
                    if (str.equals("androidx.core.app.NotificationCompat$BigPictureStyle")) {
                        c6 = 1;
                        break;
                    }
                    break;
                case 714386739:
                    if (str.equals("androidx.core.app.NotificationCompat$CallStyle")) {
                        c6 = 2;
                        break;
                    }
                    break;
                case 912942987:
                    if (str.equals("androidx.core.app.NotificationCompat$InboxStyle")) {
                        c6 = 3;
                        break;
                    }
                    break;
                case 919595044:
                    if (str.equals("androidx.core.app.NotificationCompat$BigTextStyle")) {
                        c6 = 4;
                        break;
                    }
                    break;
                case 2090799565:
                    if (str.equals("androidx.core.app.NotificationCompat$MessagingStyle")) {
                        c6 = 5;
                        break;
                    }
                    break;
            }
            switch (c6) {
                case 0:
                    return new g();
                case 1:
                    return new b();
                case 2:
                    return new f();
                case 3:
                    return new h();
                case 4:
                    return new c();
                case 5:
                    return new i();
                default:
                    return null;
            }
        }

        public static j constructCompatStyleForBundle(@NonNull Bundle bundle) {
            j constructCompatStyleByName = constructCompatStyleByName(bundle.getString("androidx.core.app.extra.COMPAT_TEMPLATE"));
            return constructCompatStyleByName != null ? constructCompatStyleByName : (bundle.containsKey("android.selfDisplayName") || bundle.containsKey("android.messagingStyleUser")) ? new i() : (bundle.containsKey("android.picture") || bundle.containsKey("android.pictureIcon")) ? new b() : bundle.containsKey("android.bigText") ? new c() : bundle.containsKey("android.textLines") ? new h() : bundle.containsKey("android.callType") ? new f() : a(bundle.getString("android.template"));
        }

        public static j constructStyleForExtras(@NonNull Bundle bundle) {
            j constructCompatStyleForBundle = constructCompatStyleForBundle(bundle);
            if (constructCompatStyleForBundle == null) {
                return null;
            }
            try {
                constructCompatStyleForBundle.restoreFromCompatExtras(bundle);
                return constructCompatStyleForBundle;
            } catch (ClassCastException unused) {
                return null;
            }
        }

        public static j extractStyleFromNotification(@NonNull Notification notification) {
            Bundle a6 = m.a(notification);
            if (a6 == null) {
                return null;
            }
            return constructStyleForExtras(a6);
        }

        public void addCompatExtras(@NonNull Bundle bundle) {
            if (this.mSummaryTextSet) {
                bundle.putCharSequence("android.summaryText", this.mSummaryText);
            }
            CharSequence charSequence = this.mBigContentTitle;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String className = getClassName();
            if (className != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", className);
            }
        }

        public void apply(androidx.core.app.j jVar) {
        }

        public String getClassName() {
            return null;
        }

        public RemoteViews makeBigContentView(androidx.core.app.j jVar) {
            return null;
        }

        public RemoteViews makeContentView(androidx.core.app.j jVar) {
            return null;
        }

        public RemoteViews makeHeadsUpContentView(androidx.core.app.j jVar) {
            return null;
        }

        public void restoreFromCompatExtras(@NonNull Bundle bundle) {
            if (bundle.containsKey("android.summaryText")) {
                this.mSummaryText = bundle.getCharSequence("android.summaryText");
                this.mSummaryTextSet = true;
            }
            this.mBigContentTitle = bundle.getCharSequence("android.title.big");
        }

        public void setBuilder(e eVar) {
            if (this.mBuilder != eVar) {
                this.mBuilder = eVar;
                if (eVar != null) {
                    eVar.L(this);
                }
            }
        }
    }

    public static Bundle a(Notification notification) {
        return notification.extras;
    }

    public static Bitmap b(Context context, Bitmap bitmap) {
        if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
            return bitmap;
        }
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(AbstractC1789c.f17145b);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(AbstractC1789c.f17144a);
        if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
            return bitmap;
        }
        double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
        return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class i extends j {

        /* renamed from: a, reason: collision with root package name */
        public final List f8535a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final List f8536b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        public t f8537c;

        /* renamed from: d, reason: collision with root package name */
        public CharSequence f8538d;

        /* renamed from: e, reason: collision with root package name */
        public Boolean f8539e;

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static class a {
            public static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addMessage(message);
            }

            public static Notification.MessagingStyle b(CharSequence charSequence) {
                return new Notification.MessagingStyle(charSequence);
            }

            public static Notification.MessagingStyle c(Notification.MessagingStyle messagingStyle, CharSequence charSequence) {
                return messagingStyle.setConversationTitle(charSequence);
            }
        }

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static class b {
            public static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addHistoricMessage(message);
            }
        }

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static class c {
            public static Notification.MessagingStyle a(Person person) {
                return new Notification.MessagingStyle(person);
            }

            public static Notification.MessagingStyle b(Notification.MessagingStyle messagingStyle, boolean z6) {
                return messagingStyle.setGroupConversation(z6);
            }
        }

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class d {

            /* renamed from: a, reason: collision with root package name */
            public final CharSequence f8540a;

            /* renamed from: b, reason: collision with root package name */
            public final long f8541b;

            /* renamed from: c, reason: collision with root package name */
            public final t f8542c;

            /* renamed from: d, reason: collision with root package name */
            public Bundle f8543d = new Bundle();

            /* renamed from: e, reason: collision with root package name */
            public String f8544e;

            /* renamed from: f, reason: collision with root package name */
            public Uri f8545f;

            /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
            public static class a {
                public static Notification.MessagingStyle.Message a(CharSequence charSequence, long j6, CharSequence charSequence2) {
                    return new Notification.MessagingStyle.Message(charSequence, j6, charSequence2);
                }

                public static Notification.MessagingStyle.Message b(Notification.MessagingStyle.Message message, String str, Uri uri) {
                    return message.setData(str, uri);
                }
            }

            /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
            public static class b {
                public static Parcelable a(Person person) {
                    return person;
                }

                public static Notification.MessagingStyle.Message b(CharSequence charSequence, long j6, Person person) {
                    return new Notification.MessagingStyle.Message(charSequence, j6, person);
                }
            }

            public d(CharSequence charSequence, long j6, t tVar) {
                this.f8540a = charSequence;
                this.f8541b = j6;
                this.f8542c = tVar;
            }

            public static Bundle[] a(List list) {
                Bundle[] bundleArr = new Bundle[list.size()];
                int size = list.size();
                for (int i6 = 0; i6 < size; i6++) {
                    bundleArr[i6] = ((d) list.get(i6)).l();
                }
                return bundleArr;
            }

            public static d e(Bundle bundle) {
                try {
                    if (bundle.containsKey("text") && bundle.containsKey(com.amazon.a.a.h.a.f10907b)) {
                        d dVar = new d(bundle.getCharSequence("text"), bundle.getLong(com.amazon.a.a.h.a.f10907b), bundle.containsKey("person") ? t.b(bundle.getBundle("person")) : (!bundle.containsKey("sender_person") || Build.VERSION.SDK_INT < 28) ? bundle.containsKey("sender") ? new t.b().f(bundle.getCharSequence("sender")).a() : null : t.a(o.a(bundle.getParcelable("sender_person"))));
                        if (bundle.containsKey("type") && bundle.containsKey("uri")) {
                            dVar.j(bundle.getString("type"), (Uri) bundle.getParcelable("uri"));
                        }
                        if (bundle.containsKey("extras")) {
                            dVar.d().putAll(bundle.getBundle("extras"));
                        }
                        return dVar;
                    }
                } catch (ClassCastException unused) {
                }
                return null;
            }

            public static List f(Parcelable[] parcelableArr) {
                d e6;
                ArrayList arrayList = new ArrayList(parcelableArr.length);
                for (Parcelable parcelable : parcelableArr) {
                    if ((parcelable instanceof Bundle) && (e6 = e((Bundle) parcelable)) != null) {
                        arrayList.add(e6);
                    }
                }
                return arrayList;
            }

            public String b() {
                return this.f8544e;
            }

            public Uri c() {
                return this.f8545f;
            }

            public Bundle d() {
                return this.f8543d;
            }

            public t g() {
                return this.f8542c;
            }

            public CharSequence h() {
                return this.f8540a;
            }

            public long i() {
                return this.f8541b;
            }

            public d j(String str, Uri uri) {
                this.f8544e = str;
                this.f8545f = uri;
                return this;
            }

            public Notification.MessagingStyle.Message k() {
                Notification.MessagingStyle.Message a6;
                t g6 = g();
                if (Build.VERSION.SDK_INT >= 28) {
                    a6 = b.b(h(), i(), g6 != null ? g6.j() : null);
                } else {
                    a6 = a.a(h(), i(), g6 != null ? g6.e() : null);
                }
                if (b() != null) {
                    a.b(a6, b(), c());
                }
                return a6;
            }

            public final Bundle l() {
                Bundle bundle = new Bundle();
                CharSequence charSequence = this.f8540a;
                if (charSequence != null) {
                    bundle.putCharSequence("text", charSequence);
                }
                bundle.putLong(com.amazon.a.a.h.a.f10907b, this.f8541b);
                t tVar = this.f8542c;
                if (tVar != null) {
                    bundle.putCharSequence("sender", tVar.e());
                    if (Build.VERSION.SDK_INT >= 28) {
                        bundle.putParcelable("sender_person", b.a(this.f8542c.j()));
                    } else {
                        bundle.putBundle("person", this.f8542c.k());
                    }
                }
                String str = this.f8544e;
                if (str != null) {
                    bundle.putString("type", str);
                }
                Uri uri = this.f8545f;
                if (uri != null) {
                    bundle.putParcelable("uri", uri);
                }
                Bundle bundle2 = this.f8543d;
                if (bundle2 != null) {
                    bundle.putBundle("extras", bundle2);
                }
                return bundle;
            }
        }

        public i() {
        }

        public static i d(Notification notification) {
            j extractStyleFromNotification = j.extractStyleFromNotification(notification);
            if (extractStyleFromNotification instanceof i) {
                return (i) extractStyleFromNotification;
            }
            return null;
        }

        @Override // androidx.core.app.m.j
        public void addCompatExtras(Bundle bundle) {
            super.addCompatExtras(bundle);
            bundle.putCharSequence("android.selfDisplayName", this.f8537c.e());
            bundle.putBundle("android.messagingStyleUser", this.f8537c.k());
            bundle.putCharSequence("android.hiddenConversationTitle", this.f8538d);
            if (this.f8538d != null && this.f8539e.booleanValue()) {
                bundle.putCharSequence("android.conversationTitle", this.f8538d);
            }
            if (!this.f8535a.isEmpty()) {
                bundle.putParcelableArray("android.messages", d.a(this.f8535a));
            }
            if (!this.f8536b.isEmpty()) {
                bundle.putParcelableArray("android.messages.historic", d.a(this.f8536b));
            }
            Boolean bool = this.f8539e;
            if (bool != null) {
                bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
            }
        }

        @Override // androidx.core.app.m.j
        public void apply(androidx.core.app.j jVar) {
            j(h());
            Notification.MessagingStyle a6 = Build.VERSION.SDK_INT >= 28 ? c.a(this.f8537c.j()) : a.b(this.f8537c.e());
            Iterator it = this.f8535a.iterator();
            while (it.hasNext()) {
                a.a(a6, ((d) it.next()).k());
            }
            Iterator it2 = this.f8536b.iterator();
            while (it2.hasNext()) {
                b.a(a6, ((d) it2.next()).k());
            }
            if (this.f8539e.booleanValue() || Build.VERSION.SDK_INT >= 28) {
                a.c(a6, this.f8538d);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                c.b(a6, this.f8539e.booleanValue());
            }
            a6.setBuilder(jVar.a());
        }

        public i b(d dVar) {
            if (dVar != null) {
                this.f8535a.add(dVar);
                if (this.f8535a.size() > 25) {
                    this.f8535a.remove(0);
                }
            }
            return this;
        }

        public i c(CharSequence charSequence, long j6, t tVar) {
            b(new d(charSequence, j6, tVar));
            return this;
        }

        public CharSequence e() {
            return this.f8538d;
        }

        public List f() {
            return this.f8535a;
        }

        public t g() {
            return this.f8537c;
        }

        @Override // androidx.core.app.m.j
        public String getClassName() {
            return "androidx.core.app.NotificationCompat$MessagingStyle";
        }

        public boolean h() {
            e eVar = this.mBuilder;
            if (eVar != null && eVar.f8498a.getApplicationInfo().targetSdkVersion < 28 && this.f8539e == null) {
                return this.f8538d != null;
            }
            Boolean bool = this.f8539e;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }

        public i i(CharSequence charSequence) {
            this.f8538d = charSequence;
            return this;
        }

        public i j(boolean z6) {
            this.f8539e = Boolean.valueOf(z6);
            return this;
        }

        @Override // androidx.core.app.m.j
        public void restoreFromCompatExtras(Bundle bundle) {
            super.restoreFromCompatExtras(bundle);
            this.f8535a.clear();
            if (bundle.containsKey("android.messagingStyleUser")) {
                this.f8537c = t.b(bundle.getBundle("android.messagingStyleUser"));
            } else {
                this.f8537c = new t.b().f(bundle.getString("android.selfDisplayName")).a();
            }
            CharSequence charSequence = bundle.getCharSequence("android.conversationTitle");
            this.f8538d = charSequence;
            if (charSequence == null) {
                this.f8538d = bundle.getCharSequence("android.hiddenConversationTitle");
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("android.messages");
            if (parcelableArray != null) {
                this.f8535a.addAll(d.f(parcelableArray));
            }
            Parcelable[] parcelableArray2 = bundle.getParcelableArray("android.messages.historic");
            if (parcelableArray2 != null) {
                this.f8536b.addAll(d.f(parcelableArray2));
            }
            if (bundle.containsKey("android.isGroupConversation")) {
                this.f8539e = Boolean.valueOf(bundle.getBoolean("android.isGroupConversation"));
            }
        }

        public i(t tVar) {
            if (!TextUtils.isEmpty(tVar.e())) {
                this.f8537c = tVar;
                return;
            }
            throw new IllegalArgumentException("User's name must not be empty.");
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class e {

        /* renamed from: A, reason: collision with root package name */
        public boolean f8476A;

        /* renamed from: B, reason: collision with root package name */
        public boolean f8477B;

        /* renamed from: C, reason: collision with root package name */
        public boolean f8478C;

        /* renamed from: D, reason: collision with root package name */
        public String f8479D;

        /* renamed from: E, reason: collision with root package name */
        public Bundle f8480E;

        /* renamed from: F, reason: collision with root package name */
        public int f8481F;

        /* renamed from: G, reason: collision with root package name */
        public int f8482G;

        /* renamed from: H, reason: collision with root package name */
        public Notification f8483H;

        /* renamed from: I, reason: collision with root package name */
        public RemoteViews f8484I;

        /* renamed from: J, reason: collision with root package name */
        public RemoteViews f8485J;

        /* renamed from: K, reason: collision with root package name */
        public RemoteViews f8486K;

        /* renamed from: L, reason: collision with root package name */
        public String f8487L;

        /* renamed from: M, reason: collision with root package name */
        public int f8488M;

        /* renamed from: N, reason: collision with root package name */
        public String f8489N;

        /* renamed from: O, reason: collision with root package name */
        public long f8490O;

        /* renamed from: P, reason: collision with root package name */
        public int f8491P;

        /* renamed from: Q, reason: collision with root package name */
        public int f8492Q;

        /* renamed from: R, reason: collision with root package name */
        public boolean f8493R;

        /* renamed from: S, reason: collision with root package name */
        public Notification f8494S;

        /* renamed from: T, reason: collision with root package name */
        public boolean f8495T;

        /* renamed from: U, reason: collision with root package name */
        public Object f8496U;

        /* renamed from: V, reason: collision with root package name */
        public ArrayList f8497V;

        /* renamed from: a, reason: collision with root package name */
        public Context f8498a;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList f8499b;

        /* renamed from: c, reason: collision with root package name */
        public ArrayList f8500c;

        /* renamed from: d, reason: collision with root package name */
        public ArrayList f8501d;

        /* renamed from: e, reason: collision with root package name */
        public CharSequence f8502e;

        /* renamed from: f, reason: collision with root package name */
        public CharSequence f8503f;

        /* renamed from: g, reason: collision with root package name */
        public PendingIntent f8504g;

        /* renamed from: h, reason: collision with root package name */
        public PendingIntent f8505h;

        /* renamed from: i, reason: collision with root package name */
        public RemoteViews f8506i;

        /* renamed from: j, reason: collision with root package name */
        public IconCompat f8507j;

        /* renamed from: k, reason: collision with root package name */
        public CharSequence f8508k;

        /* renamed from: l, reason: collision with root package name */
        public int f8509l;

        /* renamed from: m, reason: collision with root package name */
        public int f8510m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f8511n;

        /* renamed from: o, reason: collision with root package name */
        public boolean f8512o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f8513p;

        /* renamed from: q, reason: collision with root package name */
        public j f8514q;

        /* renamed from: r, reason: collision with root package name */
        public CharSequence f8515r;

        /* renamed from: s, reason: collision with root package name */
        public CharSequence f8516s;

        /* renamed from: t, reason: collision with root package name */
        public CharSequence[] f8517t;

        /* renamed from: u, reason: collision with root package name */
        public int f8518u;

        /* renamed from: v, reason: collision with root package name */
        public int f8519v;

        /* renamed from: w, reason: collision with root package name */
        public boolean f8520w;

        /* renamed from: x, reason: collision with root package name */
        public String f8521x;

        /* renamed from: y, reason: collision with root package name */
        public boolean f8522y;

        /* renamed from: z, reason: collision with root package name */
        public String f8523z;

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static class a {
            public static AudioAttributes a(AudioAttributes.Builder builder) {
                return builder.build();
            }

            public static AudioAttributes.Builder b() {
                return new AudioAttributes.Builder();
            }

            public static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i6) {
                return builder.setContentType(i6);
            }

            public static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i6) {
                return builder.setUsage(i6);
            }
        }

        public e(Context context, String str) {
            this.f8499b = new ArrayList();
            this.f8500c = new ArrayList();
            this.f8501d = new ArrayList();
            this.f8511n = true;
            this.f8476A = false;
            this.f8481F = 0;
            this.f8482G = 0;
            this.f8488M = 0;
            this.f8491P = 0;
            this.f8492Q = 0;
            Notification notification = new Notification();
            this.f8494S = notification;
            this.f8498a = context;
            this.f8487L = str;
            notification.when = System.currentTimeMillis();
            this.f8494S.audioStreamType = -1;
            this.f8510m = 0;
            this.f8497V = new ArrayList();
            this.f8493R = true;
        }

        public static CharSequence e(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        public e A(int i6) {
            this.f8509l = i6;
            return this;
        }

        public e B(boolean z6) {
            s(2, z6);
            return this;
        }

        public e C(boolean z6) {
            s(8, z6);
            return this;
        }

        public e D(int i6) {
            this.f8510m = i6;
            return this;
        }

        public e E(int i6, int i7, boolean z6) {
            this.f8518u = i6;
            this.f8519v = i7;
            this.f8520w = z6;
            return this;
        }

        public e F(Notification notification) {
            this.f8483H = notification;
            return this;
        }

        public e G(String str) {
            this.f8489N = str;
            return this;
        }

        public e H(boolean z6) {
            this.f8511n = z6;
            return this;
        }

        public e I(boolean z6) {
            this.f8495T = z6;
            return this;
        }

        public e J(int i6) {
            this.f8494S.icon = i6;
            return this;
        }

        public e K(Uri uri) {
            Notification notification = this.f8494S;
            notification.sound = uri;
            notification.audioStreamType = -1;
            AudioAttributes.Builder d6 = a.d(a.c(a.b(), 4), 5);
            this.f8494S.audioAttributes = a.a(d6);
            return this;
        }

        public e L(j jVar) {
            if (this.f8514q != jVar) {
                this.f8514q = jVar;
                if (jVar != null) {
                    jVar.setBuilder(this);
                }
            }
            return this;
        }

        public e M(CharSequence charSequence) {
            this.f8515r = e(charSequence);
            return this;
        }

        public e N(CharSequence charSequence) {
            this.f8494S.tickerText = e(charSequence);
            return this;
        }

        public e O(long j6) {
            this.f8490O = j6;
            return this;
        }

        public e P(boolean z6) {
            this.f8512o = z6;
            return this;
        }

        public e Q(long[] jArr) {
            this.f8494S.vibrate = jArr;
            return this;
        }

        public e R(int i6) {
            this.f8482G = i6;
            return this;
        }

        public e S(long j6) {
            this.f8494S.when = j6;
            return this;
        }

        public e a(int i6, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f8499b.add(new a(i6, charSequence, pendingIntent));
            return this;
        }

        public e b(a aVar) {
            if (aVar != null) {
                this.f8499b.add(aVar);
            }
            return this;
        }

        public Notification c() {
            return new p(this).c();
        }

        public Bundle d() {
            if (this.f8480E == null) {
                this.f8480E = new Bundle();
            }
            return this.f8480E;
        }

        public e f(boolean z6) {
            s(16, z6);
            return this;
        }

        public e g(String str) {
            this.f8479D = str;
            return this;
        }

        public e h(String str) {
            this.f8487L = str;
            return this;
        }

        public e i(boolean z6) {
            this.f8513p = z6;
            d().putBoolean("android.chronometerCountDown", z6);
            return this;
        }

        public e j(int i6) {
            this.f8481F = i6;
            return this;
        }

        public e k(boolean z6) {
            this.f8477B = z6;
            this.f8478C = true;
            return this;
        }

        public e l(PendingIntent pendingIntent) {
            this.f8504g = pendingIntent;
            return this;
        }

        public e m(CharSequence charSequence) {
            this.f8503f = e(charSequence);
            return this;
        }

        public e n(CharSequence charSequence) {
            this.f8502e = e(charSequence);
            return this;
        }

        public e o(RemoteViews remoteViews) {
            this.f8485J = remoteViews;
            return this;
        }

        public e p(RemoteViews remoteViews) {
            this.f8484I = remoteViews;
            return this;
        }

        public e q(int i6) {
            Notification notification = this.f8494S;
            notification.defaults = i6;
            if ((i6 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public e r(PendingIntent pendingIntent) {
            this.f8494S.deleteIntent = pendingIntent;
            return this;
        }

        public final void s(int i6, boolean z6) {
            if (z6) {
                Notification notification = this.f8494S;
                notification.flags = i6 | notification.flags;
            } else {
                Notification notification2 = this.f8494S;
                notification2.flags = (~i6) & notification2.flags;
            }
        }

        public e t(PendingIntent pendingIntent, boolean z6) {
            this.f8505h = pendingIntent;
            s(128, z6);
            return this;
        }

        public e u(String str) {
            this.f8521x = str;
            return this;
        }

        public e v(int i6) {
            this.f8491P = i6;
            return this;
        }

        public e w(boolean z6) {
            this.f8522y = z6;
            return this;
        }

        public e x(Bitmap bitmap) {
            this.f8507j = bitmap == null ? null : IconCompat.f(m.b(this.f8498a, bitmap));
            return this;
        }

        public e y(int i6, int i7, int i8) {
            Notification notification = this.f8494S;
            notification.ledARGB = i6;
            notification.ledOnMS = i7;
            notification.ledOffMS = i8;
            notification.flags = ((i7 == 0 || i8 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        public e z(boolean z6) {
            this.f8476A = z6;
            return this;
        }

        public e(Context context) {
            this(context, null);
        }
    }
}
