package com.amazon.device.simplesignin.a.a.c;

import android.util.Log;
import com.amazon.d.a.j;
import com.amazon.device.simplesignin.a.a.c;
import com.amazon.device.simplesignin.a.a.d;
import com.amazon.device.simplesignin.model.RequestStatus;
import com.amazon.device.simplesignin.model.request.SSIEventRequest;
import com.amazon.device.simplesignin.model.response.RecordMetricsEventResponse;
import java.util.Map;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class b extends c {

    /* renamed from: b, reason: collision with root package name */
    private static final String f11755b = "SSI_PublishMetric";

    /* renamed from: c, reason: collision with root package name */
    private static final String f11756c = "1.0";

    /* renamed from: d, reason: collision with root package name */
    private static final String f11757d = "b";

    public b(a aVar, SSIEventRequest sSIEventRequest) {
        super(aVar, f11755b, "1.0");
        super.a(com.amazon.device.simplesignin.a.a.a.f11731t, sSIEventRequest.getEvent().toString());
        super.a(com.amazon.device.simplesignin.a.a.a.f11732u, sSIEventRequest.getEpochTimestamp());
        if (sSIEventRequest.getFailureReason() != null) {
            super.a(com.amazon.device.simplesignin.a.a.a.f11733v, sSIEventRequest.getFailureReason().toString());
        } else {
            super.a(com.amazon.device.simplesignin.a.a.a.f11733v, "NA");
        }
    }

    @Override // com.amazon.device.simplesignin.a.a.c
    public void a(RequestStatus requestStatus) {
        b(requestStatus);
    }

    @Override // com.amazon.a.a.n.a.h
    public boolean b(j jVar) {
        Map b6 = jVar.b();
        if (!b6.containsKey(com.amazon.device.simplesignin.a.a.a.f11730s)) {
            a(RequestStatus.FAILURE);
            return false;
        }
        b(RequestStatus.SUCCESSFUL);
        return Boolean.parseBoolean(b6.get(com.amazon.device.simplesignin.a.a.a.f11730s).toString());
    }

    private void b(RequestStatus requestStatus) {
        d dVar = (d) j();
        Log.i(f11757d, "Response for request id: " + dVar.e() + " is: " + requestStatus.toString());
        RecordMetricsEventResponse recordMetricsEventResponse = new RecordMetricsEventResponse();
        recordMetricsEventResponse.setRequestId(dVar.e());
        recordMetricsEventResponse.setRequestStatus(requestStatus);
        super.a(recordMetricsEventResponse);
    }
}
