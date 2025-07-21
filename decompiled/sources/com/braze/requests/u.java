package com.braze.requests;

import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.storage.e0;
import ga.L;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class u implements p {

    /* renamed from: a, reason: collision with root package name */
    public final com.braze.communication.e f12856a;

    /* renamed from: b, reason: collision with root package name */
    public final com.braze.events.e f12857b;

    /* renamed from: c, reason: collision with root package name */
    public final com.braze.events.e f12858c;

    /* renamed from: d, reason: collision with root package name */
    public final com.braze.storage.x f12859d;

    /* renamed from: e, reason: collision with root package name */
    public final e0 f12860e;

    /* renamed from: f, reason: collision with root package name */
    public final com.braze.storage.p f12861f;

    /* renamed from: g, reason: collision with root package name */
    public final com.braze.managers.m f12862g;

    /* renamed from: h, reason: collision with root package name */
    public final com.braze.requests.util.a f12863h;

    public u(com.braze.communication.e httpConnector, com.braze.events.e internalEventPublisher, com.braze.events.e externalEventPublisher, com.braze.storage.x feedStorageProvider, e0 serverConfigStorageProvider, com.braze.storage.p contentCardsStorageProvider, com.braze.managers.m brazeManager, com.braze.requests.util.a endpointMetadataProvider) {
        Intrinsics.checkNotNullParameter(httpConnector, "httpConnector");
        Intrinsics.checkNotNullParameter(internalEventPublisher, "internalEventPublisher");
        Intrinsics.checkNotNullParameter(externalEventPublisher, "externalEventPublisher");
        Intrinsics.checkNotNullParameter(feedStorageProvider, "feedStorageProvider");
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(contentCardsStorageProvider, "contentCardsStorageProvider");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        Intrinsics.checkNotNullParameter(endpointMetadataProvider, "endpointMetadataProvider");
        this.f12856a = httpConnector;
        this.f12857b = internalEventPublisher;
        this.f12858c = externalEventPublisher;
        this.f12859d = feedStorageProvider;
        this.f12860e = serverConfigStorageProvider;
        this.f12861f = contentCardsStorageProvider;
        this.f12862g = brazeManager;
        this.f12863h = endpointMetadataProvider;
    }

    @Override // com.braze.requests.p
    public final void a(com.braze.requests.framework.h requestInfo, com.braze.requests.framework.c requestDispatchCallback, boolean z6) {
        Intrinsics.checkNotNullParameter(requestInfo, "requestInfo");
        Intrinsics.checkNotNullParameter(requestDispatchCallback, "requestDispatchCallback");
        if (z6) {
            new d(requestInfo, this.f12856a, this.f12857b, this.f12858c, this.f12859d, this.f12862g, this.f12860e, this.f12861f, this.f12863h, requestDispatchCallback).c();
        } else {
            ga.i.d(BrazeCoroutineScope.INSTANCE, (CoroutineContext) null, (L) null, new t(this, requestInfo, requestDispatchCallback, null), 3, (Object) null);
        }
    }
}
