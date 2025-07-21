package com.braze.requests.framework.queue;

import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class b implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt.compareValues(Long.valueOf(((com.braze.requests.framework.h) obj).f12806b), Long.valueOf(((com.braze.requests.framework.h) obj2).f12806b));
    }
}
