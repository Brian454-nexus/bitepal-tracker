package com.dexterous.flutterlocalnotifications.models;

import android.graphics.Color;
import androidx.annotation.Keep;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Keep
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class NotificationAction implements Serializable {
    private static final String ALLOW_GENERATED_REPLIES = "allowGeneratedReplies";
    private static final String CANCEL_NOTIFICATION = "cancelNotification";
    private static final String CONTEXTUAL = "contextual";
    private static final String ICON = "icon";
    private static final String ICON_SOURCE = "iconBitmapSource";
    private static final String ID = "id";
    private static final String INPUTS = "inputs";
    private static final String SHOWS_USER_INTERFACE = "showsUserInterface";
    private static final String TITLE = "title";
    private static final String TITLE_COLOR_ALPHA = "titleColorAlpha";
    private static final String TITLE_COLOR_BLUE = "titleColorBlue";
    private static final String TITLE_COLOR_GREEN = "titleColorGreen";
    private static final String TITLE_COLOR_RED = "titleColorRed";
    public final List<a> actionInputs = new ArrayList();
    public final Boolean allowGeneratedReplies;
    public final Boolean cancelNotification;
    public final Boolean contextual;
    public final String icon;
    public final IconSource iconSource;
    public final String id;
    public final Boolean showsUserInterface;
    public final String title;
    public final Integer titleColor;

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class a implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        public final List f13313a;

        /* renamed from: b, reason: collision with root package name */
        public final Boolean f13314b;

        /* renamed from: c, reason: collision with root package name */
        public final String f13315c;

        /* renamed from: d, reason: collision with root package name */
        public final List f13316d;

        public a(List list, Boolean bool, String str, List list2) {
            this.f13313a = list;
            this.f13314b = bool;
            this.f13315c = str;
            this.f13316d = list2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                a aVar = (a) obj;
                List list = this.f13313a;
                if (list == null ? aVar.f13313a != null : !list.equals(aVar.f13313a)) {
                    return false;
                }
                Boolean bool = this.f13314b;
                if (bool == null ? aVar.f13314b != null : !bool.equals(aVar.f13314b)) {
                    return false;
                }
                String str = this.f13315c;
                if (str == null ? aVar.f13315c != null : !str.equals(aVar.f13315c)) {
                    return false;
                }
                List list2 = this.f13316d;
                if (list2 != null) {
                    return list2.equals(aVar.f13316d);
                }
                if (aVar.f13316d == null) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            List list = this.f13313a;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            Boolean bool = this.f13314b;
            int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
            String str = this.f13315c;
            int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
            List list2 = this.f13316d;
            return hashCode3 + (list2 != null ? list2.hashCode() : 0);
        }
    }

    public NotificationAction(Map<String, Object> map) {
        List<Map> list;
        this.id = (String) map.get(ID);
        this.cancelNotification = (Boolean) map.get(CANCEL_NOTIFICATION);
        this.title = (String) map.get("title");
        Integer num = (Integer) map.get(TITLE_COLOR_ALPHA);
        Integer num2 = (Integer) map.get(TITLE_COLOR_RED);
        Integer num3 = (Integer) map.get(TITLE_COLOR_GREEN);
        Integer num4 = (Integer) map.get(TITLE_COLOR_BLUE);
        if (num == null || num2 == null || num3 == null || num4 == null) {
            this.titleColor = null;
        } else {
            this.titleColor = Integer.valueOf(Color.argb(num.intValue(), num2.intValue(), num3.intValue(), num4.intValue()));
        }
        this.icon = (String) map.get(ICON);
        this.contextual = (Boolean) map.get(CONTEXTUAL);
        this.showsUserInterface = (Boolean) map.get(SHOWS_USER_INTERFACE);
        this.allowGeneratedReplies = (Boolean) map.get(ALLOW_GENERATED_REPLIES);
        Integer num5 = (Integer) map.get(ICON_SOURCE);
        if (num5 != null) {
            this.iconSource = IconSource.values()[num5.intValue()];
        } else {
            this.iconSource = null;
        }
        if (map.get(INPUTS) == null || (list = (List) map.get(INPUTS)) == null) {
            return;
        }
        for (Map map2 : list) {
            this.actionInputs.add(new a(castList(String.class, (Collection) map2.get("choices")), (Boolean) map2.get("allowFreeFormInput"), (String) map2.get("label"), castList(String.class, (Collection) map2.get("allowedMimeTypes"))));
        }
    }

    public static <T> List<T> castList(Class<? extends T> cls, Collection<?> collection) {
        if (collection == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            try {
                arrayList.add(cls.cast(it.next()));
            } catch (ClassCastException unused) {
            }
        }
        return arrayList;
    }
}
