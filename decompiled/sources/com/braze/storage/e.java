package com.braze.storage;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.coroutine.BrazeCoroutineScope;
import ga.L;
import ga.u0;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class e implements SharedPreferences {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12903a;

    /* renamed from: b, reason: collision with root package name */
    public SharedPreferences f12904b;

    /* renamed from: c, reason: collision with root package name */
    public final u0 f12905c;

    public e(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter("persistent.com.appboy.storage.sdk_enabled_cache", com.amazon.a.a.h.a.f10906a);
        this.f12903a = context;
        this.f12905c = ga.i.d(BrazeCoroutineScope.INSTANCE, (CoroutineContext) null, (L) null, new c(this, null), 3, (Object) null);
    }

    public final void a() {
        if (!this.f12905c.isCompleted()) {
            ga.i.f((CoroutineContext) null, new d(this, null), 1, (Object) null);
        }
        this.f12904b = this.f12903a.getSharedPreferences("persistent.com.appboy.storage.sdk_enabled_cache", 0);
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        a();
        SharedPreferences sharedPreferences = this.f12904b;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("prefs");
            sharedPreferences = null;
        }
        return sharedPreferences.contains(str);
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        a();
        SharedPreferences sharedPreferences = this.f12904b;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("prefs");
            sharedPreferences = null;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        Intrinsics.checkNotNullExpressionValue(edit, "edit(...)");
        return edit;
    }

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        a();
        SharedPreferences sharedPreferences = this.f12904b;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("prefs");
            sharedPreferences = null;
        }
        Map<String, ?> all = sharedPreferences.getAll();
        Intrinsics.checkNotNullExpressionValue(all, "getAll(...)");
        return all;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z6) {
        a();
        SharedPreferences sharedPreferences = this.f12904b;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("prefs");
            sharedPreferences = null;
        }
        return sharedPreferences.getBoolean(str, z6);
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f6) {
        a();
        SharedPreferences sharedPreferences = this.f12904b;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("prefs");
            sharedPreferences = null;
        }
        return sharedPreferences.getFloat(str, f6);
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i6) {
        a();
        SharedPreferences sharedPreferences = this.f12904b;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("prefs");
            sharedPreferences = null;
        }
        return sharedPreferences.getInt(str, i6);
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j6) {
        a();
        SharedPreferences sharedPreferences = this.f12904b;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("prefs");
            sharedPreferences = null;
        }
        return sharedPreferences.getLong(str, j6);
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        a();
        SharedPreferences sharedPreferences = this.f12904b;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("prefs");
            sharedPreferences = null;
        }
        return sharedPreferences.getString(str, str2);
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        a();
        SharedPreferences sharedPreferences = this.f12904b;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("prefs");
            sharedPreferences = null;
        }
        return sharedPreferences.getStringSet(str, set);
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        a();
        SharedPreferences sharedPreferences = this.f12904b;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("prefs");
            sharedPreferences = null;
        }
        sharedPreferences.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        a();
        SharedPreferences sharedPreferences = this.f12904b;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("prefs");
            sharedPreferences = null;
        }
        sharedPreferences.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }
}
