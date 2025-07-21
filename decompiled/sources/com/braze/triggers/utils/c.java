package com.braze.triggers.utils;

import com.braze.j;
import com.braze.managers.m;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.support.BrazeLogger;
import com.braze.support.n;
import com.braze.triggers.actions.f;
import com.braze.triggers.actions.h;
import com.braze.triggers.conditions.e;
import com.braze.triggers.conditions.i;
import com.braze.triggers.conditions.k;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f13111a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static final String f13112b = BrazeLogger.getBrazeLogTag((Class<?>) c.class);

    public static final String a(String str) {
        return com.braze.a.a("Received templated message Json with unknown type: ", str, ". Not parsing.");
    }

    public static final String b(String str) {
        return com.braze.a.a("Received triggered condition Json with unknown type: ", str, ". Not parsing.");
    }

    public static final String c(String str) {
        return j.a("Received unknown trigger type: ", str);
    }

    public static InAppMessageBase a(final JSONObject jSONObject, m brazeManager) {
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        try {
            if (jSONObject == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f13112b, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: u4.d
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.triggers.utils.c.a();
                    }
                }, 14, (Object) null);
                return null;
            }
            final String string = jSONObject.getString("type");
            if (Intrinsics.areEqual(string, "inapp")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                if (jSONObject2 == null) {
                    return null;
                }
                return n.a(jSONObject2, brazeManager);
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f13112b, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: u4.e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.triggers.utils.c.a(string);
                }
            }, 12, (Object) null);
            return null;
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f13112b, BrazeLogger.Priority.f12984W, (Throwable) e6, false, new Function0() { // from class: u4.f
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.triggers.utils.c.a(jSONObject);
                }
            }, 8, (Object) null);
            return null;
        }
    }

    public static final String b(JSONArray jSONArray) {
        return "Failed to deserialize triggered actions Json array: " + jSONArray;
    }

    public static final String c() {
        return "Triggered actions Json array was null. Not de-serializing triggered actions.";
    }

    public final h b(final JSONObject actionJson, m brazeManager) {
        Intrinsics.checkNotNullParameter(actionJson, "actionJson");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        try {
            final String string = actionJson.getString("type");
            if (Intrinsics.areEqual(string, "inapp")) {
                return new com.braze.triggers.actions.c(actionJson, brazeManager);
            }
            if (Intrinsics.areEqual(string, "templated_iam")) {
                return new f(actionJson, brazeManager);
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: u4.g
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.triggers.utils.c.c(string);
                }
            }, 6, (Object) null);
            return null;
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f13112b, BrazeLogger.Priority.f12984W, (Throwable) e6, false, new Function0() { // from class: u4.h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.triggers.utils.c.b(actionJson);
                }
            }, 8, (Object) null);
            return null;
        }
    }

    public static final String a() {
        return "Templated message Json was null. Not de-serializing templated message.";
    }

    public static final String a(JSONObject jSONObject) {
        return "Encountered exception processing templated message: " + jSONObject;
    }

    public static final String b(JSONObject jSONObject) {
        return "Failed to deserialize triggered action Json: " + jSONObject;
    }

    public static final String b() {
        return "Received null or blank trigger condition Json. Not parsing.";
    }

    public final ArrayList a(final JSONArray jSONArray, m brazeManager) {
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        try {
            if (jSONArray == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f13112b, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: u4.b
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.triggers.utils.c.c();
                    }
                }, 14, (Object) null);
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i6 = 0; i6 < length; i6++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i6);
                Intrinsics.checkNotNull(jSONObject);
                h b6 = b(jSONObject, brazeManager);
                if (b6 != null) {
                    arrayList.add(b6);
                }
            }
            return arrayList;
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f13112b, BrazeLogger.Priority.f12984W, (Throwable) e6, false, new Function0() { // from class: u4.c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.triggers.utils.c.b(jSONArray);
                }
            }, 8, (Object) null);
            return null;
        }
    }

    public static ArrayList a(JSONArray triggerConditionsJson) {
        Intrinsics.checkNotNullParameter(triggerConditionsJson, "triggerConditionsJson");
        ArrayList arrayList = new ArrayList();
        int length = triggerConditionsJson.length();
        for (int i6 = 0; i6 < length; i6++) {
            JSONObject optJSONObject = triggerConditionsJson.optJSONObject(i6);
            if (optJSONObject == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f13112b, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: u4.i
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.triggers.utils.c.b();
                    }
                }, 12, (Object) null);
            } else {
                final String string = optJSONObject.getString("type");
                if (string != null) {
                    switch (string.hashCode()) {
                        case -1679221933:
                            if (string.equals("purchase_property")) {
                                arrayList.add(new i(optJSONObject));
                                break;
                            }
                            break;
                        case 3417674:
                            if (string.equals("open")) {
                                arrayList.add(new com.braze.triggers.conditions.f());
                                break;
                            }
                            break;
                        case 3556498:
                            if (string.equals("test")) {
                                arrayList.add(new k());
                                break;
                            }
                            break;
                        case 447503464:
                            if (string.equals("custom_event_property")) {
                                arrayList.add(new com.braze.triggers.conditions.b(optJSONObject));
                                break;
                            }
                            break;
                        case 717572172:
                            if (string.equals("custom_event")) {
                                arrayList.add(new com.braze.triggers.conditions.a(optJSONObject));
                                break;
                            }
                            break;
                        case 1512893214:
                            if (string.equals("iam_click")) {
                                arrayList.add(new e(optJSONObject));
                                break;
                            }
                            break;
                        case 1743324417:
                            if (string.equals("purchase")) {
                                arrayList.add(new com.braze.triggers.conditions.h(optJSONObject));
                                break;
                            }
                            break;
                        case 1926863907:
                            if (string.equals("push_click")) {
                                arrayList.add(new com.braze.triggers.conditions.j(optJSONObject));
                                break;
                            }
                            break;
                    }
                }
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f13112b, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: u4.j
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.triggers.utils.c.b(string);
                    }
                }, 12, (Object) null);
            }
        }
        return arrayList;
    }
}
