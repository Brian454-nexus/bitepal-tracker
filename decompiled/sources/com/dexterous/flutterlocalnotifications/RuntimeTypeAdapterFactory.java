package com.dexterous.flutterlocalnotifications;

import androidx.annotation.Keep;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.h;
import com.google.gson.internal.m;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.reflect.TypeToken;
import com.google.gson.t;
import java.util.LinkedHashMap;
import java.util.Map;

@Keep
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class RuntimeTypeAdapterFactory<T> implements t {
    private final Class<?> baseType;
    private final Map<String, Class<?>> labelToSubtype = new LinkedHashMap();
    private final Map<Class<?>, String> subtypeToLabel = new LinkedHashMap();
    private final String typeFieldName;

    private RuntimeTypeAdapterFactory(Class<?> cls, String str) {
        if (str == null || cls == null) {
            throw null;
        }
        this.baseType = cls;
        this.typeFieldName = str;
    }

    public static <T> RuntimeTypeAdapterFactory<T> of(Class<T> cls, String str) {
        return new RuntimeTypeAdapterFactory<>(cls, str);
    }

    public <R> TypeAdapter create(Gson gson, TypeToken<R> typeToken) {
        if (typeToken.getRawType() != this.baseType) {
            return null;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry<String, Class<?>> entry : this.labelToSubtype.entrySet()) {
            TypeAdapter n6 = gson.n(this, TypeToken.get(entry.getValue()));
            linkedHashMap.put(entry.getKey(), n6);
            linkedHashMap2.put(entry.getValue(), n6);
        }
        return new TypeAdapter(this) { // from class: com.dexterous.flutterlocalnotifications.RuntimeTypeAdapterFactory.1

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ RuntimeTypeAdapterFactory f13308c;

            {
                this.f13308c = this;
            }

            public Object c(a8.a aVar) {
                h a6 = m.a(aVar);
                h z6 = a6.h().z(this.f13308c.typeFieldName);
                if (z6 == null) {
                    throw new l("cannot deserialize " + this.f13308c.baseType + " because it does not define a field named " + this.f13308c.typeFieldName);
                }
                String l6 = z6.l();
                TypeAdapter typeAdapter = (TypeAdapter) linkedHashMap.get(l6);
                if (typeAdapter != null) {
                    return typeAdapter.a(a6);
                }
                throw new l("cannot deserialize " + this.f13308c.baseType + " subtype named " + l6 + "; did you forget to register a subtype?");
            }

            public void e(a8.c cVar, Object obj) {
                Class<?> cls = obj.getClass();
                String str = (String) this.f13308c.subtypeToLabel.get(cls);
                TypeAdapter typeAdapter = (TypeAdapter) linkedHashMap2.get(cls);
                if (typeAdapter == null) {
                    throw new l("cannot serialize " + cls.getName() + "; did you forget to register a subtype?");
                }
                k h6 = typeAdapter.d(obj).h();
                if (h6.w(this.f13308c.typeFieldName)) {
                    throw new l("cannot serialize " + cls.getName() + " because it already defines a field named " + this.f13308c.typeFieldName);
                }
                k kVar = new k();
                kVar.r(this.f13308c.typeFieldName, new com.google.gson.m(str));
                for (Map.Entry entry2 : h6.s()) {
                    kVar.r((String) entry2.getKey(), (h) entry2.getValue());
                }
                m.b(kVar, cVar);
            }
        }.b();
    }

    public RuntimeTypeAdapterFactory<T> registerSubtype(Class<? extends T> cls, String str) {
        if (cls != null && str != null) {
            if (!this.subtypeToLabel.containsKey(cls) && !this.labelToSubtype.containsKey(str)) {
                this.labelToSubtype.put(str, cls);
                this.subtypeToLabel.put(cls, str);
                return this;
            }
            throw new IllegalArgumentException("types and labels must be unique");
        }
        throw null;
    }

    public static <T> RuntimeTypeAdapterFactory<T> of(Class<T> cls) {
        return new RuntimeTypeAdapterFactory<>(cls, "type");
    }

    public RuntimeTypeAdapterFactory<T> registerSubtype(Class<? extends T> cls) {
        return registerSubtype(cls, cls.getSimpleName());
    }
}
