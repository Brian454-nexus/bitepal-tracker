package androidx.core.app;

import android.app.RemoteInput;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final String f8571a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f8572b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence[] f8573c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f8574d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8575e;

    /* renamed from: f, reason: collision with root package name */
    public final Bundle f8576f;

    /* renamed from: g, reason: collision with root package name */
    public final Set f8577g;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a {
        public static RemoteInput a(v vVar) {
            RemoteInput.Builder addExtras = new RemoteInput.Builder(vVar.i()).setLabel(vVar.h()).setChoices(vVar.e()).setAllowFreeFormInput(vVar.c()).addExtras(vVar.g());
            Set d6 = vVar.d();
            if (d6 != null) {
                Iterator it = d6.iterator();
                while (it.hasNext()) {
                    b.a(addExtras, (String) it.next(), true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                c.a(addExtras, vVar.f());
            }
            return addExtras.build();
        }

        public static Bundle b(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class b {
        public static RemoteInput.Builder a(RemoteInput.Builder builder, String str, boolean z6) {
            return builder.setAllowDataType(str, z6);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class c {
        public static RemoteInput.Builder a(RemoteInput.Builder builder, int i6) {
            return builder.setEditChoicesBeforeSending(i6);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final String f8578a;

        /* renamed from: d, reason: collision with root package name */
        public CharSequence f8581d;

        /* renamed from: e, reason: collision with root package name */
        public CharSequence[] f8582e;

        /* renamed from: b, reason: collision with root package name */
        public final Set f8579b = new HashSet();

        /* renamed from: c, reason: collision with root package name */
        public final Bundle f8580c = new Bundle();

        /* renamed from: f, reason: collision with root package name */
        public boolean f8583f = true;

        /* renamed from: g, reason: collision with root package name */
        public int f8584g = 0;

        public d(String str) {
            if (str == null) {
                throw new IllegalArgumentException("Result key can't be null");
            }
            this.f8578a = str;
        }

        public v a() {
            return new v(this.f8578a, this.f8581d, this.f8582e, this.f8583f, this.f8584g, this.f8580c, this.f8579b);
        }

        public d b(String str, boolean z6) {
            if (z6) {
                this.f8579b.add(str);
                return this;
            }
            this.f8579b.remove(str);
            return this;
        }

        public d c(boolean z6) {
            this.f8583f = z6;
            return this;
        }

        public d d(CharSequence[] charSequenceArr) {
            this.f8582e = charSequenceArr;
            return this;
        }

        public d e(CharSequence charSequence) {
            this.f8581d = charSequence;
            return this;
        }
    }

    public v(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z6, int i6, Bundle bundle, Set set) {
        this.f8571a = str;
        this.f8572b = charSequence;
        this.f8573c = charSequenceArr;
        this.f8574d = z6;
        this.f8575e = i6;
        this.f8576f = bundle;
        this.f8577g = set;
        if (f() == 2 && !c()) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    public static RemoteInput a(v vVar) {
        return a.a(vVar);
    }

    public static RemoteInput[] b(v[] vVarArr) {
        if (vVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[vVarArr.length];
        for (int i6 = 0; i6 < vVarArr.length; i6++) {
            remoteInputArr[i6] = a(vVarArr[i6]);
        }
        return remoteInputArr;
    }

    public static Bundle j(Intent intent) {
        return a.b(intent);
    }

    public boolean c() {
        return this.f8574d;
    }

    public Set d() {
        return this.f8577g;
    }

    public CharSequence[] e() {
        return this.f8573c;
    }

    public int f() {
        return this.f8575e;
    }

    public Bundle g() {
        return this.f8576f;
    }

    public CharSequence h() {
        return this.f8572b;
    }

    public String i() {
        return this.f8571a;
    }

    public boolean k() {
        if (c()) {
            return false;
        }
        return ((e() != null && e().length != 0) || d() == null || d().isEmpty()) ? false : true;
    }
}
