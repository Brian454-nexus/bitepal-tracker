package defpackage;

import R8.b;
import R8.c;
import R8.e;
import e9.p;
import e9.q;
import e9.r;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final a f13317a = new a(null);

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(p pVar) {
            R8.a aVar;
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            List<String> filterNotNull;
            List<String> filterNotNull2;
            List<String> filterNotNull3;
            ArrayList arrayList4 = null;
            if (pVar == null) {
                return null;
            }
            List c6 = pVar.c();
            List b6 = pVar.b();
            List a6 = pVar.a();
            q d6 = pVar.d();
            if (d6 == null && c6 == null && a6 == null && b6 == null) {
                return null;
            }
            if ((d6 != null ? d6.a() : null) != null) {
                e9.b a7 = d6.a();
                aVar = new R8.a(a7.c(), a7.d(), a7.a(), a7.b());
            } else {
                aVar = null;
            }
            List<r> c7 = d6 != null ? d6.c() : null;
            if (c7 != null) {
                ArrayList arrayList5 = new ArrayList();
                for (r rVar : c7) {
                    e eVar = rVar != null ? new e(rVar.a(), rVar.b()) : null;
                    if (eVar != null) {
                        arrayList5.add(eVar);
                    }
                }
                arrayList = arrayList5;
            } else {
                arrayList = null;
            }
            c cVar = new c(d6 != null ? d6.g() : null, d6 != null ? d6.b() : null, d6 != null ? d6.d() : null, d6 != null ? d6.f() : null, d6 != null ? d6.e() : null, d6 != null ? d6.h() : null, aVar, arrayList);
            if (c6 == null || (filterNotNull3 = CollectionsKt.filterNotNull(c6)) == null) {
                arrayList2 = null;
            } else {
                arrayList2 = new ArrayList();
                for (String str : filterNotNull3) {
                    if (str != null) {
                        arrayList2.add(str);
                    }
                }
            }
            if (b6 == null || (filterNotNull2 = CollectionsKt.filterNotNull(b6)) == null) {
                arrayList3 = null;
            } else {
                arrayList3 = new ArrayList();
                for (String str2 : filterNotNull2) {
                    if (str2 != null) {
                        arrayList3.add(str2);
                    }
                }
            }
            if (a6 != null && (filterNotNull = CollectionsKt.filterNotNull(a6)) != null) {
                arrayList4 = new ArrayList();
                for (String str3 : filterNotNull) {
                    if (str3 != null) {
                        arrayList4.add(str3);
                    }
                }
            }
            return new b(cVar, arrayList2, arrayList3, arrayList4);
        }

        public final R8.d b(e9.c anonymousUserAttributes) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(anonymousUserAttributes, "anonymousUserAttributes");
            e9.b a6 = anonymousUserAttributes.a();
            R8.a aVar = a6 != null ? new R8.a(a6.c(), a6.d(), a6.a(), a6.b()) : null;
            List<r> b6 = anonymousUserAttributes.b();
            if (b6 != null) {
                ArrayList arrayList2 = new ArrayList();
                for (r rVar : b6) {
                    e eVar = rVar != null ? new e(rVar.a(), rVar.b()) : null;
                    if (eVar != null) {
                        arrayList2.add(eVar);
                    }
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            return new R8.d(anonymousUserAttributes.c(), anonymousUserAttributes.e(), anonymousUserAttributes.d(), anonymousUserAttributes.f(), aVar, arrayList);
        }

        public a() {
        }
    }
}
