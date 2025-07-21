package c1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: c1.h, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C1126h implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f10586a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final Map f10587b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public Set f10588c = Collections.EMPTY_SET;

    /* renamed from: d, reason: collision with root package name */
    public List f10589d = Collections.EMPTY_LIST;

    public void a(Object obj) {
        synchronized (this.f10586a) {
            try {
                ArrayList arrayList = new ArrayList(this.f10589d);
                arrayList.add(obj);
                this.f10589d = Collections.unmodifiableList(arrayList);
                Integer num = (Integer) this.f10587b.get(obj);
                if (num == null) {
                    HashSet hashSet = new HashSet(this.f10588c);
                    hashSet.add(obj);
                    this.f10588c = Collections.unmodifiableSet(hashSet);
                }
                this.f10587b.put(obj, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int b(Object obj) {
        int intValue;
        synchronized (this.f10586a) {
            try {
                intValue = this.f10587b.containsKey(obj) ? ((Integer) this.f10587b.get(obj)).intValue() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return intValue;
    }

    public void c(Object obj) {
        synchronized (this.f10586a) {
            try {
                Integer num = (Integer) this.f10587b.get(obj);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.f10589d);
                arrayList.remove(obj);
                this.f10589d = Collections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.f10587b.remove(obj);
                    HashSet hashSet = new HashSet(this.f10588c);
                    hashSet.remove(obj);
                    this.f10588c = Collections.unmodifiableSet(hashSet);
                } else {
                    this.f10587b.put(obj, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        Iterator it;
        synchronized (this.f10586a) {
            it = this.f10589d.iterator();
        }
        return it;
    }

    public Set j() {
        Set set;
        synchronized (this.f10586a) {
            set = this.f10588c;
        }
        return set;
    }
}
