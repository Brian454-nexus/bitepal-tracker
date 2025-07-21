package com.braze.models.response;

import com.braze.managers.o0;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.support.JsonUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class g extends a {

    /* renamed from: c, reason: collision with root package name */
    public final JSONObject f12655c;

    /* renamed from: d, reason: collision with root package name */
    public final d f12656d;

    /* renamed from: e, reason: collision with root package name */
    public final i f12657e;

    /* renamed from: f, reason: collision with root package name */
    public final c f12658f;

    /* renamed from: g, reason: collision with root package name */
    public final InAppMessageBase f12659g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f12660h;

    /* renamed from: i, reason: collision with root package name */
    public final m f12661i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f12662j;

    /* renamed from: k, reason: collision with root package name */
    public final JSONArray f12663k;

    /* renamed from: l, reason: collision with root package name */
    public final String f12664l;

    /* renamed from: m, reason: collision with root package name */
    public final JSONArray f12665m;

    /* renamed from: n, reason: collision with root package name */
    public final long f12666n;

    /* renamed from: o, reason: collision with root package name */
    public final JSONObject f12667o;

    /* renamed from: p, reason: collision with root package name */
    public final o0 f12668p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g(com.braze.requests.n r14, com.braze.communication.d r15, com.braze.managers.m r16) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.models.response.g.<init>(com.braze.requests.n, com.braze.communication.d, com.braze.managers.m):void");
    }

    public static final String a(g gVar) {
        return "Encountered Exception processing Content Cards response: " + gVar.f12655c;
    }

    public static final String b(g gVar) {
        return "Found " + gVar.f12660h.size() + " triggered actions in server response.";
    }

    public static final String a(JSONObject jSONObject) {
        return "Got server config: " + JsonUtils.getPrettyPrintedString(jSONObject);
    }

    public static final String b(JSONObject jSONObject) {
        return "Encountered Exception processing server config: " + jSONObject;
    }
}
