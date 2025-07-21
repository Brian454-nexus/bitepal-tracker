package com.dexterous.flutterlocalnotifications.models;

import androidx.annotation.Keep;
import com.google.gson.f;
import com.google.gson.g;
import com.google.gson.h;
import java.lang.reflect.Type;

@Keep
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public enum ScheduleMode {
    alarmClock,
    exact,
    exactAllowWhileIdle,
    inexact,
    inexactAllowWhileIdle;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class Deserializer implements g {
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ScheduleMode a(h hVar, Type type, f fVar) {
            try {
                return ScheduleMode.valueOf(hVar.l());
            } catch (Exception unused) {
                return hVar.a() ? ScheduleMode.exactAllowWhileIdle : ScheduleMode.exact;
            }
        }
    }

    public boolean useAlarmClock() {
        return this == alarmClock;
    }

    public boolean useAllowWhileIdle() {
        return this == exactAllowWhileIdle || this == inexactAllowWhileIdle;
    }

    public boolean useExactAlarm() {
        return this == exact || this == exactAllowWhileIdle;
    }
}
