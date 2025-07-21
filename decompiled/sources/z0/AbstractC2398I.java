package z0;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.sequences.Sequence;

/* renamed from: z0.I, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public abstract class AbstractC2398I {

    /* renamed from: z0.I$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a implements Sequence {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f21401a;

        public a(ViewGroup viewGroup) {
            this.f21401a = viewGroup;
        }

        public Iterator iterator() {
            return AbstractC2398I.b(this.f21401a);
        }
    }

    /* renamed from: z0.I$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b implements Iterator, KMutableIterator {

        /* renamed from: a, reason: collision with root package name */
        public int f21402a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f21403b;

        public b(ViewGroup viewGroup) {
            this.f21403b = viewGroup;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public View next() {
            ViewGroup viewGroup = this.f21403b;
            int i6 = this.f21402a;
            this.f21402a = i6 + 1;
            View childAt = viewGroup.getChildAt(i6);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f21402a < this.f21403b.getChildCount();
        }

        @Override // java.util.Iterator
        public void remove() {
            ViewGroup viewGroup = this.f21403b;
            int i6 = this.f21402a - 1;
            this.f21402a = i6;
            viewGroup.removeViewAt(i6);
        }
    }

    public static final Sequence a(ViewGroup viewGroup) {
        return new a(viewGroup);
    }

    public static final Iterator b(ViewGroup viewGroup) {
        return new b(viewGroup);
    }
}
