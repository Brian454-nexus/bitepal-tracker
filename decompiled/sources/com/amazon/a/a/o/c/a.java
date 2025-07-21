package com.amazon.a.a.o.c;

import com.amazon.a.a.o.c;
import com.amazon.a.a.o.c.a.f;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final c f11258a = new c("Serializer");

    /* renamed from: b, reason: collision with root package name */
    private static final Class[] f11259b = {com.amazon.a.a.b.c.class, String.class, HashMap.class, LinkedHashMap.class};

    public static String a(Serializable serializable) {
        ObjectOutputStream objectOutputStream;
        ObjectOutputStream objectOutputStream2 = null;
        if (serializable == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                try {
                    objectOutputStream.writeObject(serializable);
                    String a6 = com.amazon.c.a.a.c.a(byteArrayOutputStream.toByteArray());
                    com.amazon.a.a.o.a.a(objectOutputStream);
                    return a6;
                } catch (IOException e6) {
                    e = e6;
                    if (c.f11254b) {
                        f11258a.b("Could not serialize object: " + serializable, e);
                    }
                    com.amazon.a.a.o.a.a(objectOutputStream);
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                objectOutputStream2 = objectOutputStream;
                com.amazon.a.a.o.a.a(objectOutputStream2);
                throw th;
            }
        } catch (IOException e7) {
            e = e7;
            objectOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            com.amazon.a.a.o.a.a(objectOutputStream2);
            throw th;
        }
    }

    public static <T> T a(String str) {
        f fVar;
        f fVar2 = null;
        if (str != null && str.length() != 0) {
            try {
                try {
                    fVar = new f(new ByteArrayInputStream(com.amazon.c.a.a.c.c(str.getBytes())));
                    try {
                        try {
                            fVar.a(f11259b);
                            T t6 = (T) fVar.readObject();
                            com.amazon.a.a.o.a.a(fVar);
                            return t6;
                        } catch (Exception e6) {
                            e = e6;
                            if (c.f11254b) {
                                f11258a.b("Could not read object from string: " + str, e);
                            }
                            com.amazon.a.a.o.a.a(fVar);
                            return null;
                        }
                    } catch (Throwable th) {
                        th = th;
                        fVar2 = fVar;
                        com.amazon.a.a.o.a.a(fVar2);
                        throw th;
                    }
                } catch (Exception e7) {
                    e = e7;
                    fVar = null;
                } catch (Throwable th2) {
                    th = th2;
                    com.amazon.a.a.o.a.a(fVar2);
                    throw th;
                }
            } catch (IOException e8) {
                if (c.f11254b) {
                    f11258a.b("Could not decode string", e8);
                }
            }
        }
        return null;
    }
}
