package j3;

import W2.k;
import com.amazon.a.a.o.b.f;
import f3.i;
import f3.j;
import f3.o;
import f3.u;
import f3.x;
import f3.z;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: j3.d, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC1650d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f16203a;

    static {
        String i6 = k.i("DiagnosticsWrkr");
        Intrinsics.checkNotNullExpressionValue(i6, "tagWithPrefix(\"DiagnosticsWrkr\")");
        f16203a = i6;
    }

    public static final String c(u uVar, String str, Integer num, String str2) {
        return '\n' + uVar.f14117a + "\t " + uVar.f14119c + "\t " + num + "\t " + uVar.f14118b.name() + "\t " + str + "\t " + str2 + '\t';
    }

    public static final String d(o oVar, z zVar, j jVar, List list) {
        StringBuilder sb = new StringBuilder();
        sb.append("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            u uVar = (u) it.next();
            i e6 = jVar.e(x.a(uVar));
            sb.append(c(uVar, CollectionsKt.joinToString$default(oVar.b(uVar.f14117a), f.f11248a, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null), e6 != null ? Integer.valueOf(e6.f14092c) : null, CollectionsKt.joinToString$default(zVar.b(uVar.f14117a), f.f11248a, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null)));
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
