package X0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final Object f6028f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public static a f6029g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f6030a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f6031b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f6032c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f6033d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final Handler f6034e;

    /* renamed from: X0.a$a, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class HandlerC0104a extends Handler {
        public HandlerC0104a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                super.handleMessage(message);
            } else {
                a.this.a();
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Intent f6036a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f6037b;

        public b(Intent intent, ArrayList arrayList) {
            this.f6036a = intent;
            this.f6037b = arrayList;
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final IntentFilter f6038a;

        /* renamed from: b, reason: collision with root package name */
        public final BroadcastReceiver f6039b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f6040c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f6041d;

        public c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f6038a = intentFilter;
            this.f6039b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.f6039b);
            sb.append(" filter=");
            sb.append(this.f6038a);
            if (this.f6041d) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    public a(Context context) {
        this.f6030a = context;
        this.f6034e = new HandlerC0104a(context.getMainLooper());
    }

    public static a b(Context context) {
        a aVar;
        synchronized (f6028f) {
            try {
                if (f6029g == null) {
                    f6029g = new a(context.getApplicationContext());
                }
                aVar = f6029g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    public void a() {
        int size;
        b[] bVarArr;
        while (true) {
            synchronized (this.f6031b) {
                try {
                    size = this.f6033d.size();
                    if (size <= 0) {
                        return;
                    }
                    bVarArr = new b[size];
                    this.f6033d.toArray(bVarArr);
                    this.f6033d.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            for (int i6 = 0; i6 < size; i6++) {
                b bVar = bVarArr[i6];
                int size2 = bVar.f6037b.size();
                for (int i7 = 0; i7 < size2; i7++) {
                    c cVar = (c) bVar.f6037b.get(i7);
                    if (!cVar.f6041d) {
                        cVar.f6039b.onReceive(this.f6030a, bVar.f6036a);
                    }
                }
            }
        }
    }

    public void c(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f6031b) {
            try {
                c cVar = new c(intentFilter, broadcastReceiver);
                ArrayList arrayList = (ArrayList) this.f6031b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                    this.f6031b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(cVar);
                for (int i6 = 0; i6 < intentFilter.countActions(); i6++) {
                    String action = intentFilter.getAction(i6);
                    ArrayList arrayList2 = (ArrayList) this.f6032c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                        this.f6032c.put(action, arrayList2);
                    }
                    arrayList2.add(cVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean d(Intent intent) {
        String str;
        synchronized (this.f6031b) {
            try {
                String action = intent.getAction();
                String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f6030a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z6 = (intent.getFlags() & 8) != 0;
                if (z6) {
                    Log.v("LocalBroadcastManager", "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList arrayList = (ArrayList) this.f6032c.get(intent.getAction());
                if (arrayList != null) {
                    if (z6) {
                        Log.v("LocalBroadcastManager", "Action list: " + arrayList);
                    }
                    ArrayList arrayList2 = null;
                    int i6 = 0;
                    while (i6 < arrayList.size()) {
                        c cVar = (c) arrayList.get(i6);
                        if (z6) {
                            Log.v("LocalBroadcastManager", "Matching against filter " + cVar.f6038a);
                        }
                        if (cVar.f6040c) {
                            if (z6) {
                                Log.v("LocalBroadcastManager", "  Filter's target already added");
                            }
                            str = action;
                        } else {
                            int match = cVar.f6038a.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                            if (match >= 0) {
                                if (z6) {
                                    StringBuilder sb = new StringBuilder();
                                    str = action;
                                    sb.append("  Filter matched!  match=0x");
                                    sb.append(Integer.toHexString(match));
                                    Log.v("LocalBroadcastManager", sb.toString());
                                } else {
                                    str = action;
                                }
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                }
                                arrayList2.add(cVar);
                                cVar.f6040c = true;
                            } else {
                                str = action;
                                if (z6) {
                                    Log.v("LocalBroadcastManager", "  Filter did not match: " + (match != -4 ? match != -3 ? match != -2 ? match != -1 ? "unknown reason" : "type" : "data" : "action" : "category"));
                                }
                            }
                        }
                        i6++;
                        action = str;
                    }
                    if (arrayList2 != null) {
                        for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                            ((c) arrayList2.get(i7)).f6040c = false;
                        }
                        this.f6033d.add(new b(intent, arrayList2));
                        if (!this.f6034e.hasMessages(1)) {
                            this.f6034e.sendEmptyMessage(1);
                        }
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f6031b) {
            try {
                ArrayList arrayList = (ArrayList) this.f6031b.remove(broadcastReceiver);
                if (arrayList == null) {
                    return;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    c cVar = (c) arrayList.get(size);
                    cVar.f6041d = true;
                    for (int i6 = 0; i6 < cVar.f6038a.countActions(); i6++) {
                        String action = cVar.f6038a.getAction(i6);
                        ArrayList arrayList2 = (ArrayList) this.f6032c.get(action);
                        if (arrayList2 != null) {
                            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                                c cVar2 = (c) arrayList2.get(size2);
                                if (cVar2.f6039b == broadcastReceiver) {
                                    cVar2.f6041d = true;
                                    arrayList2.remove(size2);
                                }
                            }
                            if (arrayList2.size() <= 0) {
                                this.f6032c.remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
