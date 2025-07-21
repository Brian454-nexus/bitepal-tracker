package z2;

import F6.l;
import F6.m;
import F6.n;
import L6.f;
import M6.a;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import j0.C1639b;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: z2.a, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class SharedPreferencesC2455a implements SharedPreferences {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f21660a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f21661b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final String f21662c;

    /* renamed from: d, reason: collision with root package name */
    public final String f21663d;

    /* renamed from: e, reason: collision with root package name */
    public final F6.a f21664e;

    /* renamed from: f, reason: collision with root package name */
    public final F6.e f21665f;

    /* renamed from: z2.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static /* synthetic */ class C0280a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21666a;

        static {
            int[] iArr = new int[c.values().length];
            f21666a = iArr;
            try {
                iArr[c.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21666a[c.INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21666a[c.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21666a[c.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21666a[c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21666a[c.STRING_SET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: z2.a$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b implements SharedPreferences.Editor {

        /* renamed from: a, reason: collision with root package name */
        public final SharedPreferencesC2455a f21667a;

        /* renamed from: b, reason: collision with root package name */
        public final SharedPreferences.Editor f21668b;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicBoolean f21670d = new AtomicBoolean(false);

        /* renamed from: c, reason: collision with root package name */
        public final List f21669c = new CopyOnWriteArrayList();

        public b(SharedPreferencesC2455a sharedPreferencesC2455a, SharedPreferences.Editor editor) {
            this.f21667a = sharedPreferencesC2455a;
            this.f21668b = editor;
        }

        public final void a() {
            if (this.f21670d.getAndSet(false)) {
                for (String str : this.f21667a.getAll().keySet()) {
                    if (!this.f21669c.contains(str) && !this.f21667a.g(str)) {
                        this.f21668b.remove(this.f21667a.d(str));
                    }
                }
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            a();
            this.f21668b.apply();
            b();
            this.f21669c.clear();
        }

        public final void b() {
            Iterator it = this.f21667a.f21661b.iterator();
            while (it.hasNext()) {
                SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = (SharedPreferences.OnSharedPreferenceChangeListener) it.next();
                Iterator it2 = this.f21669c.iterator();
                while (it2.hasNext()) {
                    onSharedPreferenceChangeListener.onSharedPreferenceChanged(this.f21667a, (String) it2.next());
                }
            }
        }

        public final void c(String str, byte[] bArr) {
            if (this.f21667a.g(str)) {
                throw new SecurityException(str + " is a reserved key for the encryption keyset.");
            }
            this.f21669c.add(str);
            if (str == null) {
                str = "__NULL__";
            }
            try {
                Pair e6 = this.f21667a.e(str, bArr);
                this.f21668b.putString((String) e6.first, (String) e6.second);
            } catch (GeneralSecurityException e7) {
                throw new SecurityException("Could not encrypt data: " + e7.getMessage(), e7);
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor clear() {
            this.f21670d.set(true);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            a();
            try {
                return this.f21668b.commit();
            } finally {
                b();
                this.f21669c.clear();
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putBoolean(String str, boolean z6) {
            ByteBuffer allocate = ByteBuffer.allocate(5);
            allocate.putInt(c.BOOLEAN.c());
            allocate.put(z6 ? (byte) 1 : (byte) 0);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putFloat(String str, float f6) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(c.FLOAT.c());
            allocate.putFloat(f6);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putInt(String str, int i6) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(c.INT.c());
            allocate.putInt(i6);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putLong(String str, long j6) {
            ByteBuffer allocate = ByteBuffer.allocate(12);
            allocate.putInt(c.LONG.c());
            allocate.putLong(j6);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putString(String str, String str2) {
            if (str2 == null) {
                str2 = "__NULL__";
            }
            byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
            int length = bytes.length;
            ByteBuffer allocate = ByteBuffer.allocate(length + 8);
            allocate.putInt(c.STRING.c());
            allocate.putInt(length);
            allocate.put(bytes);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String str, Set set) {
            if (set == null) {
                set = new C1639b();
                set.add("__NULL__");
            }
            ArrayList<byte[]> arrayList = new ArrayList(set.size());
            int size = set.size() * 4;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                byte[] bytes = ((String) it.next()).getBytes(StandardCharsets.UTF_8);
                arrayList.add(bytes);
                size += bytes.length;
            }
            ByteBuffer allocate = ByteBuffer.allocate(size + 4);
            allocate.putInt(c.STRING_SET.c());
            for (byte[] bArr : arrayList) {
                allocate.putInt(bArr.length);
                allocate.put(bArr);
            }
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor remove(String str) {
            if (!this.f21667a.g(str)) {
                this.f21668b.remove(this.f21667a.d(str));
                this.f21669c.add(str);
                return this;
            }
            throw new SecurityException(str + " is a reserved key for the encryption keyset.");
        }
    }

    /* renamed from: z2.a$c */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public enum c {
        STRING(0),
        STRING_SET(1),
        INT(2),
        LONG(3),
        FLOAT(4),
        BOOLEAN(5);


        /* renamed from: a, reason: collision with root package name */
        public final int f21678a;

        c(int i6) {
            this.f21678a = i6;
        }

        public static c b(int i6) {
            if (i6 == 0) {
                return STRING;
            }
            if (i6 == 1) {
                return STRING_SET;
            }
            if (i6 == 2) {
                return INT;
            }
            if (i6 == 3) {
                return LONG;
            }
            if (i6 == 4) {
                return FLOAT;
            }
            if (i6 != 5) {
                return null;
            }
            return BOOLEAN;
        }

        public int c() {
            return this.f21678a;
        }
    }

    /* renamed from: z2.a$d */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public enum d {
        AES256_SIV("AES256_SIV");


        /* renamed from: a, reason: collision with root package name */
        public final String f21681a;

        d(String str) {
            this.f21681a = str;
        }

        public l b() {
            return m.a(this.f21681a);
        }
    }

    /* renamed from: z2.a$e */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public enum e {
        AES256_GCM("AES256_GCM");


        /* renamed from: a, reason: collision with root package name */
        public final String f21684a;

        e(String str) {
            this.f21684a = str;
        }

        public l b() {
            return m.a(this.f21684a);
        }
    }

    public SharedPreferencesC2455a(String str, String str2, SharedPreferences sharedPreferences, F6.a aVar, F6.e eVar) {
        this.f21662c = str;
        this.f21660a = sharedPreferences;
        this.f21663d = str2;
        this.f21664e = aVar;
        this.f21665f = eVar;
    }

    public static SharedPreferences a(Context context, String str, C2457c c2457c, d dVar, e eVar) {
        return b(str, c2457c.a(), context, dVar, eVar);
    }

    public static SharedPreferences b(String str, String str2, Context context, d dVar, e eVar) {
        f.a();
        G6.a.b();
        Context applicationContext = context.getApplicationContext();
        n d6 = new a.b().l(dVar.b()).n(applicationContext, "__androidx_security_crypto_encrypted_prefs_key_keyset__", str).m("android-keystore://" + str2).f().d();
        n d7 = new a.b().l(eVar.b()).n(applicationContext, "__androidx_security_crypto_encrypted_prefs_value_keyset__", str).m("android-keystore://" + str2).f().d();
        return new SharedPreferencesC2455a(str, str2, applicationContext.getSharedPreferences(str, 0), (F6.a) d7.k(F6.a.class), (F6.e) d6.k(F6.e.class));
    }

    public String c(String str) {
        try {
            String str2 = new String(this.f21665f.b(S6.e.a(str, 0), this.f21662c.getBytes()), StandardCharsets.UTF_8);
            if (str2.equals("__NULL__")) {
                return null;
            }
            return str2;
        } catch (GeneralSecurityException e6) {
            throw new SecurityException("Could not decrypt key. " + e6.getMessage(), e6);
        }
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        if (!g(str)) {
            return this.f21660a.contains(d(str));
        }
        throw new SecurityException(str + " is a reserved key for the encryption keyset.");
    }

    public String d(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            return S6.e.d(this.f21665f.a(str.getBytes(StandardCharsets.UTF_8), this.f21662c.getBytes()));
        } catch (GeneralSecurityException e6) {
            throw new SecurityException("Could not encrypt key. " + e6.getMessage(), e6);
        }
    }

    public Pair e(String str, byte[] bArr) {
        String d6 = d(str);
        return new Pair(d6, S6.e.d(this.f21664e.a(bArr, d6.getBytes(StandardCharsets.UTF_8))));
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        return new b(this, this.f21660a.edit());
    }

    public final Object f(String str) {
        if (g(str)) {
            throw new SecurityException(str + " is a reserved key for the encryption keyset.");
        }
        if (str == null) {
            str = "__NULL__";
        }
        try {
            String d6 = d(str);
            String string = this.f21660a.getString(d6, null);
            if (string == null) {
                return null;
            }
            byte[] a6 = S6.e.a(string, 0);
            F6.a aVar = this.f21664e;
            Charset charset = StandardCharsets.UTF_8;
            ByteBuffer wrap = ByteBuffer.wrap(aVar.b(a6, d6.getBytes(charset)));
            wrap.position(0);
            int i6 = wrap.getInt();
            c b6 = c.b(i6);
            if (b6 == null) {
                throw new SecurityException("Unknown type ID for encrypted pref value: " + i6);
            }
            switch (C0280a.f21666a[b6.ordinal()]) {
                case 1:
                    int i7 = wrap.getInt();
                    ByteBuffer slice = wrap.slice();
                    wrap.limit(i7);
                    String charBuffer = charset.decode(slice).toString();
                    if (charBuffer.equals("__NULL__")) {
                        return null;
                    }
                    return charBuffer;
                case 2:
                    return Integer.valueOf(wrap.getInt());
                case 3:
                    return Long.valueOf(wrap.getLong());
                case 4:
                    return Float.valueOf(wrap.getFloat());
                case 5:
                    return Boolean.valueOf(wrap.get() != 0);
                case 6:
                    C1639b c1639b = new C1639b();
                    while (wrap.hasRemaining()) {
                        int i8 = wrap.getInt();
                        ByteBuffer slice2 = wrap.slice();
                        slice2.limit(i8);
                        wrap.position(wrap.position() + i8);
                        c1639b.add(StandardCharsets.UTF_8.decode(slice2).toString());
                    }
                    if (c1639b.size() == 1 && "__NULL__".equals(c1639b.o(0))) {
                        return null;
                    }
                    return c1639b;
                default:
                    throw new SecurityException("Unhandled type for encrypted pref value: " + b6);
            }
        } catch (GeneralSecurityException e6) {
            throw new SecurityException("Could not decrypt value. " + e6.getMessage(), e6);
        }
    }

    public boolean g(String str) {
        return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str);
    }

    @Override // android.content.SharedPreferences
    public Map getAll() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : this.f21660a.getAll().entrySet()) {
            if (!g(entry.getKey())) {
                String c6 = c(entry.getKey());
                hashMap.put(c6, f(c6));
            }
        }
        return hashMap;
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z6) {
        Object f6 = f(str);
        return f6 instanceof Boolean ? ((Boolean) f6).booleanValue() : z6;
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f6) {
        Object f7 = f(str);
        return f7 instanceof Float ? ((Float) f7).floatValue() : f6;
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i6) {
        Object f6 = f(str);
        return f6 instanceof Integer ? ((Integer) f6).intValue() : i6;
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j6) {
        Object f6 = f(str);
        return f6 instanceof Long ? ((Long) f6).longValue() : j6;
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
        Object f6 = f(str);
        return f6 instanceof String ? (String) f6 : str2;
    }

    @Override // android.content.SharedPreferences
    public Set getStringSet(String str, Set set) {
        Object f6 = f(str);
        Set c1639b = f6 instanceof Set ? (Set) f6 : new C1639b();
        return c1639b.size() > 0 ? c1639b : set;
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f21661b.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f21661b.remove(onSharedPreferenceChangeListener);
    }
}
