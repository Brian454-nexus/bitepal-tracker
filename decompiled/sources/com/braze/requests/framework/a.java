package com.braze.requests.framework;

import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt.compareValues(Long.valueOf(((h) obj).f12806b), Long.valueOf(((h) obj2).f12806b));
    }
}
