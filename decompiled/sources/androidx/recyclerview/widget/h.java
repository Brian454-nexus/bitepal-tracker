package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import t2.AbstractC2076b;
import u2.C2137c;
import z0.AbstractC2393D;
import z0.C2423i;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public class h extends RecyclerView.o implements RecyclerView.r {

    /* renamed from: A, reason: collision with root package name */
    public f f10028A;

    /* renamed from: C, reason: collision with root package name */
    public Rect f10030C;

    /* renamed from: D, reason: collision with root package name */
    public long f10031D;

    /* renamed from: d, reason: collision with root package name */
    public float f10035d;

    /* renamed from: e, reason: collision with root package name */
    public float f10036e;

    /* renamed from: f, reason: collision with root package name */
    public float f10037f;

    /* renamed from: g, reason: collision with root package name */
    public float f10038g;

    /* renamed from: h, reason: collision with root package name */
    public float f10039h;

    /* renamed from: i, reason: collision with root package name */
    public float f10040i;

    /* renamed from: j, reason: collision with root package name */
    public float f10041j;

    /* renamed from: k, reason: collision with root package name */
    public float f10042k;

    /* renamed from: m, reason: collision with root package name */
    public e f10044m;

    /* renamed from: o, reason: collision with root package name */
    public int f10046o;

    /* renamed from: q, reason: collision with root package name */
    public int f10048q;

    /* renamed from: r, reason: collision with root package name */
    public RecyclerView f10049r;

    /* renamed from: t, reason: collision with root package name */
    public VelocityTracker f10051t;

    /* renamed from: u, reason: collision with root package name */
    public List f10052u;

    /* renamed from: v, reason: collision with root package name */
    public List f10053v;

    /* renamed from: z, reason: collision with root package name */
    public C2423i f10057z;

    /* renamed from: a, reason: collision with root package name */
    public final List f10032a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final float[] f10033b = new float[2];

    /* renamed from: c, reason: collision with root package name */
    public RecyclerView.D f10034c = null;

    /* renamed from: l, reason: collision with root package name */
    public int f10043l = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f10045n = 0;

    /* renamed from: p, reason: collision with root package name */
    public List f10047p = new ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public final Runnable f10050s = new a();

    /* renamed from: w, reason: collision with root package name */
    public RecyclerView.k f10054w = null;

    /* renamed from: x, reason: collision with root package name */
    public View f10055x = null;

    /* renamed from: y, reason: collision with root package name */
    public int f10056y = -1;

    /* renamed from: B, reason: collision with root package name */
    public final RecyclerView.t f10029B = new b();

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVar = h.this;
            if (hVar.f10034c == null || !hVar.y()) {
                return;
            }
            h hVar2 = h.this;
            RecyclerView.D d6 = hVar2.f10034c;
            if (d6 != null) {
                hVar2.t(d6);
            }
            h hVar3 = h.this;
            hVar3.f10049r.removeCallbacks(hVar3.f10050s);
            AbstractC2393D.I(h.this.f10049r, this);
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class b implements RecyclerView.t {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
            h.this.f10057z.a(motionEvent);
            VelocityTracker velocityTracker = h.this.f10051t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (h.this.f10043l == -1) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            int findPointerIndex = motionEvent.findPointerIndex(h.this.f10043l);
            if (findPointerIndex >= 0) {
                h.this.i(actionMasked, motionEvent, findPointerIndex);
            }
            h hVar = h.this;
            RecyclerView.D d6 = hVar.f10034c;
            if (d6 == null) {
                return;
            }
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (findPointerIndex >= 0) {
                        hVar.E(motionEvent, hVar.f10046o, findPointerIndex);
                        h.this.t(d6);
                        h hVar2 = h.this;
                        hVar2.f10049r.removeCallbacks(hVar2.f10050s);
                        h.this.f10050s.run();
                        h.this.f10049r.invalidate();
                        return;
                    }
                    return;
                }
                if (actionMasked != 3) {
                    if (actionMasked != 6) {
                        return;
                    }
                    int actionIndex = motionEvent.getActionIndex();
                    int pointerId = motionEvent.getPointerId(actionIndex);
                    h hVar3 = h.this;
                    if (pointerId == hVar3.f10043l) {
                        hVar3.f10043l = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                        h hVar4 = h.this;
                        hVar4.E(motionEvent, hVar4.f10046o, actionIndex);
                        return;
                    }
                    return;
                }
                VelocityTracker velocityTracker2 = hVar.f10051t;
                if (velocityTracker2 != null) {
                    velocityTracker2.clear();
                }
            }
            h.this.z(null, 0);
            h.this.f10043l = -1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
            int findPointerIndex;
            g m6;
            h.this.f10057z.a(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                h.this.f10043l = motionEvent.getPointerId(0);
                h.this.f10035d = motionEvent.getX();
                h.this.f10036e = motionEvent.getY();
                h.this.u();
                h hVar = h.this;
                if (hVar.f10034c == null && (m6 = hVar.m(motionEvent)) != null) {
                    h hVar2 = h.this;
                    hVar2.f10035d -= m6.f10077j;
                    hVar2.f10036e -= m6.f10078k;
                    hVar2.l(m6.f10072e, true);
                    if (h.this.f10032a.remove(m6.f10072e.itemView)) {
                        h hVar3 = h.this;
                        hVar3.f10044m.clearView(hVar3.f10049r, m6.f10072e);
                    }
                    h.this.z(m6.f10072e, m6.f10073f);
                    h hVar4 = h.this;
                    hVar4.E(motionEvent, hVar4.f10046o, 0);
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                h hVar5 = h.this;
                hVar5.f10043l = -1;
                hVar5.z(null, 0);
            } else {
                int i6 = h.this.f10043l;
                if (i6 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i6)) >= 0) {
                    h.this.i(actionMasked, motionEvent, findPointerIndex);
                }
            }
            VelocityTracker velocityTracker = h.this.f10051t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return h.this.f10034c != null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void e(boolean z6) {
            if (z6) {
                h.this.z(null, 0);
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class c extends g {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f10060o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.D f10061p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(RecyclerView.D d6, int i6, int i7, float f6, float f7, float f8, float f9, int i8, RecyclerView.D d7) {
            super(d6, i6, i7, f6, f7, f8, f9);
            this.f10060o = i8;
            this.f10061p = d7;
        }

        @Override // androidx.recyclerview.widget.h.g, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.f10079l) {
                return;
            }
            if (this.f10060o <= 0) {
                h hVar = h.this;
                hVar.f10044m.clearView(hVar.f10049r, this.f10061p);
            } else {
                h.this.f10032a.add(this.f10061p.itemView);
                this.f10076i = true;
                int i6 = this.f10060o;
                if (i6 > 0) {
                    h.this.v(this, i6);
                }
            }
            h hVar2 = h.this;
            View view = hVar2.f10055x;
            View view2 = this.f10061p.itemView;
            if (view == view2) {
                hVar2.x(view2);
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f10063a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f10064b;

        public d(g gVar, int i6) {
            this.f10063a = gVar;
            this.f10064b = i6;
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = h.this.f10049r;
            if (recyclerView == null || !recyclerView.isAttachedToWindow()) {
                return;
            }
            g gVar = this.f10063a;
            if (gVar.f10079l || gVar.f10072e.getAbsoluteAdapterPosition() == -1) {
                return;
            }
            RecyclerView.m itemAnimator = h.this.f10049r.getItemAnimator();
            if ((itemAnimator == null || !itemAnimator.q(null)) && !h.this.r()) {
                h.this.f10044m.onSwiped(this.f10063a.f10072e, this.f10064b);
            } else {
                h.this.f10049r.post(this);
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static abstract class e {
        private static final Interpolator sDragScrollInterpolator = new a();
        private static final Interpolator sDragViewScrollCapInterpolator = new b();
        private int mCachedMaxScrollSpeed = -1;

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public class a implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f6) {
                return f6 * f6 * f6 * f6 * f6;
            }
        }

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public class b implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f6) {
                float f7 = f6 - 1.0f;
                return (f7 * f7 * f7 * f7 * f7) + 1.0f;
            }
        }

        public static int convertToRelativeDirection(int i6, int i7) {
            int i8;
            int i9 = i6 & 789516;
            if (i9 == 0) {
                return i6;
            }
            int i10 = i6 & (~i9);
            if (i7 == 0) {
                i8 = i9 << 2;
            } else {
                int i11 = i9 << 1;
                i10 |= (-789517) & i11;
                i8 = (i11 & 789516) << 2;
            }
            return i10 | i8;
        }

        public static int makeFlag(int i6, int i7) {
            return i7 << (i6 * 8);
        }

        public static int makeMovementFlags(int i6, int i7) {
            return makeFlag(2, i6) | makeFlag(1, i7) | makeFlag(0, i7 | i6);
        }

        public final int a(RecyclerView recyclerView) {
            if (this.mCachedMaxScrollSpeed == -1) {
                this.mCachedMaxScrollSpeed = recyclerView.getResources().getDimensionPixelSize(AbstractC2076b.f19049d);
            }
            return this.mCachedMaxScrollSpeed;
        }

        public boolean canDropOver(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.D d6, @NonNull RecyclerView.D d7) {
            return true;
        }

        public RecyclerView.D chooseDropTarget(@NonNull RecyclerView.D d6, @NonNull List<RecyclerView.D> list, int i6, int i7) {
            int bottom;
            int abs;
            int top;
            int abs2;
            int left;
            int abs3;
            int right;
            int abs4;
            int width = d6.itemView.getWidth() + i6;
            int height = i7 + d6.itemView.getHeight();
            int left2 = i6 - d6.itemView.getLeft();
            int top2 = i7 - d6.itemView.getTop();
            int size = list.size();
            RecyclerView.D d7 = null;
            int i8 = -1;
            for (int i9 = 0; i9 < size; i9++) {
                RecyclerView.D d8 = list.get(i9);
                if (left2 > 0 && (right = d8.itemView.getRight() - width) < 0 && d8.itemView.getRight() > d6.itemView.getRight() && (abs4 = Math.abs(right)) > i8) {
                    d7 = d8;
                    i8 = abs4;
                }
                if (left2 < 0 && (left = d8.itemView.getLeft() - i6) > 0 && d8.itemView.getLeft() < d6.itemView.getLeft() && (abs3 = Math.abs(left)) > i8) {
                    d7 = d8;
                    i8 = abs3;
                }
                if (top2 < 0 && (top = d8.itemView.getTop() - i7) > 0 && d8.itemView.getTop() < d6.itemView.getTop() && (abs2 = Math.abs(top)) > i8) {
                    d7 = d8;
                    i8 = abs2;
                }
                if (top2 > 0 && (bottom = d8.itemView.getBottom() - height) < 0 && d8.itemView.getBottom() > d6.itemView.getBottom() && (abs = Math.abs(bottom)) > i8) {
                    d7 = d8;
                    i8 = abs;
                }
            }
            return d7;
        }

        public void clearView(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.D d6) {
            C2137c.f19156a.a(d6.itemView);
        }

        public int convertToAbsoluteDirection(int i6, int i7) {
            int i8;
            int i9 = i6 & 3158064;
            if (i9 == 0) {
                return i6;
            }
            int i10 = i6 & (~i9);
            if (i7 == 0) {
                i8 = i9 >> 2;
            } else {
                int i11 = i9 >> 1;
                i10 |= (-3158065) & i11;
                i8 = (i11 & 3158064) >> 2;
            }
            return i10 | i8;
        }

        public final int getAbsoluteMovementFlags(RecyclerView recyclerView, RecyclerView.D d6) {
            return convertToAbsoluteDirection(getMovementFlags(recyclerView, d6), AbstractC2393D.p(recyclerView));
        }

        public long getAnimationDuration(@NonNull RecyclerView recyclerView, int i6, float f6, float f7) {
            RecyclerView.m itemAnimator = recyclerView.getItemAnimator();
            return itemAnimator == null ? i6 == 8 ? 200L : 250L : i6 == 8 ? itemAnimator.n() : itemAnimator.o();
        }

        public int getBoundingBoxMargin() {
            return 0;
        }

        public float getMoveThreshold(@NonNull RecyclerView.D d6) {
            return 0.5f;
        }

        public abstract int getMovementFlags(RecyclerView recyclerView, RecyclerView.D d6);

        public float getSwipeEscapeVelocity(float f6) {
            return f6;
        }

        public float getSwipeThreshold(@NonNull RecyclerView.D d6) {
            return 0.5f;
        }

        public float getSwipeVelocityThreshold(float f6) {
            return f6;
        }

        public boolean hasDragFlag(RecyclerView recyclerView, RecyclerView.D d6) {
            return (getAbsoluteMovementFlags(recyclerView, d6) & 16711680) != 0;
        }

        public int interpolateOutOfBoundsScroll(@NonNull RecyclerView recyclerView, int i6, int i7, int i8, long j6) {
            int signum = (int) (((int) (((int) Math.signum(i7)) * a(recyclerView) * sDragViewScrollCapInterpolator.getInterpolation(Math.min(1.0f, (Math.abs(i7) * 1.0f) / i6)))) * sDragScrollInterpolator.getInterpolation(j6 <= 2000 ? ((float) j6) / 2000.0f : 1.0f));
            return signum == 0 ? i7 > 0 ? 1 : -1 : signum;
        }

        public abstract boolean isItemViewSwipeEnabled();

        public abstract boolean isLongPressDragEnabled();

        public void onChildDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.D d6, float f6, float f7, int i6, boolean z6) {
            C2137c.f19156a.d(canvas, recyclerView, d6.itemView, f6, f7, i6, z6);
        }

        public void onChildDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, RecyclerView.D d6, float f6, float f7, int i6, boolean z6) {
            C2137c.f19156a.c(canvas, recyclerView, d6.itemView, f6, f7, i6, z6);
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.D d6, List<g> list, int i6, float f6, float f7) {
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                g gVar = list.get(i7);
                gVar.e();
                int save = canvas.save();
                onChildDraw(canvas, recyclerView, gVar.f10072e, gVar.f10077j, gVar.f10078k, gVar.f10073f, false);
                canvas.restoreToCount(save);
            }
            if (d6 != null) {
                int save2 = canvas.save();
                onChildDraw(canvas, recyclerView, d6, f6, f7, i6, true);
                canvas.restoreToCount(save2);
            }
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.D d6, List<g> list, int i6, float f6, float f7) {
            int size = list.size();
            boolean z6 = false;
            for (int i7 = 0; i7 < size; i7++) {
                g gVar = list.get(i7);
                int save = canvas.save();
                onChildDrawOver(canvas, recyclerView, gVar.f10072e, gVar.f10077j, gVar.f10078k, gVar.f10073f, false);
                canvas.restoreToCount(save);
            }
            if (d6 != null) {
                int save2 = canvas.save();
                onChildDrawOver(canvas, recyclerView, d6, f6, f7, i6, true);
                canvas.restoreToCount(save2);
            }
            for (int i8 = size - 1; i8 >= 0; i8--) {
                g gVar2 = list.get(i8);
                boolean z7 = gVar2.f10080m;
                if (z7 && !gVar2.f10076i) {
                    list.remove(i8);
                } else if (!z7) {
                    z6 = true;
                }
            }
            if (z6) {
                recyclerView.invalidate();
            }
        }

        public abstract boolean onMove(RecyclerView recyclerView, RecyclerView.D d6, RecyclerView.D d7);

        /* JADX WARN: Multi-variable type inference failed */
        public void onMoved(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.D d6, int i6, @NonNull RecyclerView.D d7, int i7, int i8, int i9) {
            RecyclerView.p layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof InterfaceC0149h) {
                ((InterfaceC0149h) layoutManager).a(d6.itemView, d7.itemView, i8, i9);
                return;
            }
            if (layoutManager.k()) {
                if (layoutManager.Q(d7.itemView) <= recyclerView.getPaddingLeft()) {
                    recyclerView.i1(i7);
                }
                if (layoutManager.T(d7.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.i1(i7);
                }
            }
            if (layoutManager.l()) {
                if (layoutManager.U(d7.itemView) <= recyclerView.getPaddingTop()) {
                    recyclerView.i1(i7);
                }
                if (layoutManager.O(d7.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.i1(i7);
                }
            }
        }

        public void onSelectedChanged(RecyclerView.D d6, int i6) {
            if (d6 != null) {
                C2137c.f19156a.b(d6.itemView);
            }
        }

        public abstract void onSwiped(RecyclerView.D d6, int i6);
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public class f extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a, reason: collision with root package name */
        public boolean f10066a = true;

        public f() {
        }

        public void a() {
            this.f10066a = false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            View n6;
            RecyclerView.D f02;
            if (!this.f10066a || (n6 = h.this.n(motionEvent)) == null || (f02 = h.this.f10049r.f0(n6)) == null) {
                return;
            }
            h hVar = h.this;
            if (hVar.f10044m.hasDragFlag(hVar.f10049r, f02)) {
                int pointerId = motionEvent.getPointerId(0);
                int i6 = h.this.f10043l;
                if (pointerId == i6) {
                    int findPointerIndex = motionEvent.findPointerIndex(i6);
                    float x6 = motionEvent.getX(findPointerIndex);
                    float y6 = motionEvent.getY(findPointerIndex);
                    h hVar2 = h.this;
                    hVar2.f10035d = x6;
                    hVar2.f10036e = y6;
                    hVar2.f10040i = 0.0f;
                    hVar2.f10039h = 0.0f;
                    if (hVar2.f10044m.isLongPressDragEnabled()) {
                        h.this.z(f02, 2);
                    }
                }
            }
        }
    }

    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class g implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        public final float f10068a;

        /* renamed from: b, reason: collision with root package name */
        public final float f10069b;

        /* renamed from: c, reason: collision with root package name */
        public final float f10070c;

        /* renamed from: d, reason: collision with root package name */
        public final float f10071d;

        /* renamed from: e, reason: collision with root package name */
        public final RecyclerView.D f10072e;

        /* renamed from: f, reason: collision with root package name */
        public final int f10073f;

        /* renamed from: g, reason: collision with root package name */
        public final ValueAnimator f10074g;

        /* renamed from: h, reason: collision with root package name */
        public final int f10075h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f10076i;

        /* renamed from: j, reason: collision with root package name */
        public float f10077j;

        /* renamed from: k, reason: collision with root package name */
        public float f10078k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f10079l = false;

        /* renamed from: m, reason: collision with root package name */
        public boolean f10080m = false;

        /* renamed from: n, reason: collision with root package name */
        public float f10081n;

        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public class a implements ValueAnimator.AnimatorUpdateListener {
            public a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                g.this.c(valueAnimator.getAnimatedFraction());
            }
        }

        public g(RecyclerView.D d6, int i6, int i7, float f6, float f7, float f8, float f9) {
            this.f10073f = i7;
            this.f10075h = i6;
            this.f10072e = d6;
            this.f10068a = f6;
            this.f10069b = f7;
            this.f10070c = f8;
            this.f10071d = f9;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f10074g = ofFloat;
            ofFloat.addUpdateListener(new a());
            ofFloat.setTarget(d6.itemView);
            ofFloat.addListener(this);
            c(0.0f);
        }

        public void a() {
            this.f10074g.cancel();
        }

        public void b(long j6) {
            this.f10074g.setDuration(j6);
        }

        public void c(float f6) {
            this.f10081n = f6;
        }

        public void d() {
            this.f10072e.setIsRecyclable(false);
            this.f10074g.start();
        }

        public void e() {
            float f6 = this.f10068a;
            float f7 = this.f10070c;
            if (f6 == f7) {
                this.f10077j = this.f10072e.itemView.getTranslationX();
            } else {
                this.f10077j = f6 + (this.f10081n * (f7 - f6));
            }
            float f8 = this.f10069b;
            float f9 = this.f10071d;
            if (f8 == f9) {
                this.f10078k = this.f10072e.itemView.getTranslationY();
            } else {
                this.f10078k = f8 + (this.f10081n * (f9 - f8));
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            c(1.0f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f10080m) {
                this.f10072e.setIsRecyclable(true);
            }
            this.f10080m = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$h, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public interface InterfaceC0149h {
        void a(View view, View view2, int i6, int i7);
    }

    public h(e eVar) {
        this.f10044m = eVar;
    }

    private void A() {
        this.f10048q = ViewConfiguration.get(this.f10049r.getContext()).getScaledTouchSlop();
        this.f10049r.g(this);
        this.f10049r.j(this.f10029B);
        this.f10049r.i(this);
        B();
    }

    private void k() {
        this.f10049r.W0(this);
        this.f10049r.Y0(this.f10029B);
        this.f10049r.X0(this);
        for (int size = this.f10047p.size() - 1; size >= 0; size--) {
            g gVar = (g) this.f10047p.get(0);
            gVar.a();
            this.f10044m.clearView(this.f10049r, gVar.f10072e);
        }
        this.f10047p.clear();
        this.f10055x = null;
        this.f10056y = -1;
        w();
        C();
    }

    public static boolean s(View view, float f6, float f7, float f8, float f9) {
        return f6 >= f8 && f6 <= f8 + ((float) view.getWidth()) && f7 >= f9 && f7 <= f9 + ((float) view.getHeight());
    }

    public final void B() {
        this.f10028A = new f();
        this.f10057z = new C2423i(this.f10049r.getContext(), this.f10028A);
    }

    public final void C() {
        f fVar = this.f10028A;
        if (fVar != null) {
            fVar.a();
            this.f10028A = null;
        }
        if (this.f10057z != null) {
            this.f10057z = null;
        }
    }

    public final int D(RecyclerView.D d6) {
        if (this.f10045n == 2) {
            return 0;
        }
        int movementFlags = this.f10044m.getMovementFlags(this.f10049r, d6);
        int convertToAbsoluteDirection = (this.f10044m.convertToAbsoluteDirection(movementFlags, AbstractC2393D.p(this.f10049r)) & 65280) >> 8;
        if (convertToAbsoluteDirection == 0) {
            return 0;
        }
        int i6 = (movementFlags & 65280) >> 8;
        if (Math.abs(this.f10039h) > Math.abs(this.f10040i)) {
            int h6 = h(d6, convertToAbsoluteDirection);
            if (h6 > 0) {
                return (i6 & h6) == 0 ? e.convertToRelativeDirection(h6, AbstractC2393D.p(this.f10049r)) : h6;
            }
            int j6 = j(d6, convertToAbsoluteDirection);
            if (j6 > 0) {
                return j6;
            }
        } else {
            int j7 = j(d6, convertToAbsoluteDirection);
            if (j7 > 0) {
                return j7;
            }
            int h7 = h(d6, convertToAbsoluteDirection);
            if (h7 > 0) {
                return (i6 & h7) == 0 ? e.convertToRelativeDirection(h7, AbstractC2393D.p(this.f10049r)) : h7;
            }
        }
        return 0;
    }

    public void E(MotionEvent motionEvent, int i6, int i7) {
        float x6 = motionEvent.getX(i7);
        float y6 = motionEvent.getY(i7);
        float f6 = x6 - this.f10035d;
        this.f10039h = f6;
        this.f10040i = y6 - this.f10036e;
        if ((i6 & 4) == 0) {
            this.f10039h = Math.max(0.0f, f6);
        }
        if ((i6 & 8) == 0) {
            this.f10039h = Math.min(0.0f, this.f10039h);
        }
        if ((i6 & 1) == 0) {
            this.f10040i = Math.max(0.0f, this.f10040i);
        }
        if ((i6 & 2) == 0) {
            this.f10040i = Math.min(0.0f, this.f10040i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public void b(View view) {
        x(view);
        RecyclerView.D f02 = this.f10049r.f0(view);
        if (f02 == null) {
            return;
        }
        RecyclerView.D d6 = this.f10034c;
        if (d6 != null && f02 == d6) {
            z(null, 0);
            return;
        }
        l(f02, false);
        if (this.f10032a.remove(f02.itemView)) {
            this.f10044m.clearView(this.f10049r, f02);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public void d(View view) {
    }

    public final void f() {
    }

    public void g(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f10049r;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            k();
        }
        this.f10049r = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.f10037f = resources.getDimension(AbstractC2076b.f19051f);
            this.f10038g = resources.getDimension(AbstractC2076b.f19050e);
            A();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.A a6) {
        rect.setEmpty();
    }

    public final int h(RecyclerView.D d6, int i6) {
        if ((i6 & 12) == 0) {
            return 0;
        }
        int i7 = this.f10039h > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.f10051t;
        if (velocityTracker != null && this.f10043l > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.f10044m.getSwipeVelocityThreshold(this.f10038g));
            float xVelocity = this.f10051t.getXVelocity(this.f10043l);
            float yVelocity = this.f10051t.getYVelocity(this.f10043l);
            int i8 = xVelocity > 0.0f ? 8 : 4;
            float abs = Math.abs(xVelocity);
            if ((i8 & i6) != 0 && i7 == i8 && abs >= this.f10044m.getSwipeEscapeVelocity(this.f10037f) && abs > Math.abs(yVelocity)) {
                return i8;
            }
        }
        float width = this.f10049r.getWidth() * this.f10044m.getSwipeThreshold(d6);
        if ((i6 & i7) == 0 || Math.abs(this.f10039h) <= width) {
            return 0;
        }
        return i7;
    }

    public void i(int i6, MotionEvent motionEvent, int i7) {
        RecyclerView.D p6;
        int absoluteMovementFlags;
        if (this.f10034c != null || i6 != 2 || this.f10045n == 2 || !this.f10044m.isItemViewSwipeEnabled() || this.f10049r.getScrollState() == 1 || (p6 = p(motionEvent)) == null || (absoluteMovementFlags = (this.f10044m.getAbsoluteMovementFlags(this.f10049r, p6) & 65280) >> 8) == 0) {
            return;
        }
        float x6 = motionEvent.getX(i7);
        float y6 = motionEvent.getY(i7);
        float f6 = x6 - this.f10035d;
        float f7 = y6 - this.f10036e;
        float abs = Math.abs(f6);
        float abs2 = Math.abs(f7);
        int i8 = this.f10048q;
        if (abs >= i8 || abs2 >= i8) {
            if (abs > abs2) {
                if (f6 < 0.0f && (absoluteMovementFlags & 4) == 0) {
                    return;
                }
                if (f6 > 0.0f && (absoluteMovementFlags & 8) == 0) {
                    return;
                }
            } else {
                if (f7 < 0.0f && (absoluteMovementFlags & 1) == 0) {
                    return;
                }
                if (f7 > 0.0f && (absoluteMovementFlags & 2) == 0) {
                    return;
                }
            }
            this.f10040i = 0.0f;
            this.f10039h = 0.0f;
            this.f10043l = motionEvent.getPointerId(0);
            z(p6, 1);
        }
    }

    public final int j(RecyclerView.D d6, int i6) {
        if ((i6 & 3) == 0) {
            return 0;
        }
        int i7 = this.f10040i > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.f10051t;
        if (velocityTracker != null && this.f10043l > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.f10044m.getSwipeVelocityThreshold(this.f10038g));
            float xVelocity = this.f10051t.getXVelocity(this.f10043l);
            float yVelocity = this.f10051t.getYVelocity(this.f10043l);
            int i8 = yVelocity > 0.0f ? 2 : 1;
            float abs = Math.abs(yVelocity);
            if ((i8 & i6) != 0 && i8 == i7 && abs >= this.f10044m.getSwipeEscapeVelocity(this.f10037f) && abs > Math.abs(xVelocity)) {
                return i8;
            }
        }
        float height = this.f10049r.getHeight() * this.f10044m.getSwipeThreshold(d6);
        if ((i6 & i7) == 0 || Math.abs(this.f10040i) <= height) {
            return 0;
        }
        return i7;
    }

    public void l(RecyclerView.D d6, boolean z6) {
        for (int size = this.f10047p.size() - 1; size >= 0; size--) {
            g gVar = (g) this.f10047p.get(size);
            if (gVar.f10072e == d6) {
                gVar.f10079l |= z6;
                if (!gVar.f10080m) {
                    gVar.a();
                }
                this.f10047p.remove(size);
                return;
            }
        }
    }

    public g m(MotionEvent motionEvent) {
        if (this.f10047p.isEmpty()) {
            return null;
        }
        View n6 = n(motionEvent);
        for (int size = this.f10047p.size() - 1; size >= 0; size--) {
            g gVar = (g) this.f10047p.get(size);
            if (gVar.f10072e.itemView == n6) {
                return gVar;
            }
        }
        return null;
    }

    public View n(MotionEvent motionEvent) {
        float x6 = motionEvent.getX();
        float y6 = motionEvent.getY();
        RecyclerView.D d6 = this.f10034c;
        if (d6 != null) {
            View view = d6.itemView;
            if (s(view, x6, y6, this.f10041j + this.f10039h, this.f10042k + this.f10040i)) {
                return view;
            }
        }
        for (int size = this.f10047p.size() - 1; size >= 0; size--) {
            g gVar = (g) this.f10047p.get(size);
            View view2 = gVar.f10072e.itemView;
            if (s(view2, x6, y6, gVar.f10077j, gVar.f10078k)) {
                return view2;
            }
        }
        return this.f10049r.R(x6, y6);
    }

    public final List o(RecyclerView.D d6) {
        RecyclerView.D d7 = d6;
        List list = this.f10052u;
        if (list == null) {
            this.f10052u = new ArrayList();
            this.f10053v = new ArrayList();
        } else {
            list.clear();
            this.f10053v.clear();
        }
        int boundingBoxMargin = this.f10044m.getBoundingBoxMargin();
        int round = Math.round(this.f10041j + this.f10039h) - boundingBoxMargin;
        int round2 = Math.round(this.f10042k + this.f10040i) - boundingBoxMargin;
        int i6 = boundingBoxMargin * 2;
        int width = d7.itemView.getWidth() + round + i6;
        int height = d7.itemView.getHeight() + round2 + i6;
        int i7 = (round + width) / 2;
        int i8 = (round2 + height) / 2;
        RecyclerView.p layoutManager = this.f10049r.getLayoutManager();
        int J6 = layoutManager.J();
        int i9 = 0;
        while (i9 < J6) {
            View I6 = layoutManager.I(i9);
            if (I6 != d7.itemView && I6.getBottom() >= round2 && I6.getTop() <= height && I6.getRight() >= round && I6.getLeft() <= width) {
                RecyclerView.D f02 = this.f10049r.f0(I6);
                if (this.f10044m.canDropOver(this.f10049r, this.f10034c, f02)) {
                    int abs = Math.abs(i7 - ((I6.getLeft() + I6.getRight()) / 2));
                    int abs2 = Math.abs(i8 - ((I6.getTop() + I6.getBottom()) / 2));
                    int i10 = (abs * abs) + (abs2 * abs2);
                    int size = this.f10052u.size();
                    int i11 = 0;
                    for (int i12 = 0; i12 < size && i10 > ((Integer) this.f10053v.get(i12)).intValue(); i12++) {
                        i11++;
                    }
                    this.f10052u.add(i11, f02);
                    this.f10053v.add(i11, Integer.valueOf(i10));
                }
            }
            i9++;
            d7 = d6;
        }
        return this.f10052u;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.A a6) {
        float f6;
        float f7;
        this.f10056y = -1;
        if (this.f10034c != null) {
            q(this.f10033b);
            float[] fArr = this.f10033b;
            float f8 = fArr[0];
            f7 = fArr[1];
            f6 = f8;
        } else {
            f6 = 0.0f;
            f7 = 0.0f;
        }
        this.f10044m.onDraw(canvas, recyclerView, this.f10034c, this.f10047p, this.f10045n, f6, f7);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.A a6) {
        float f6;
        float f7;
        if (this.f10034c != null) {
            q(this.f10033b);
            float[] fArr = this.f10033b;
            float f8 = fArr[0];
            f7 = fArr[1];
            f6 = f8;
        } else {
            f6 = 0.0f;
            f7 = 0.0f;
        }
        this.f10044m.onDrawOver(canvas, recyclerView, this.f10034c, this.f10047p, this.f10045n, f6, f7);
    }

    public final RecyclerView.D p(MotionEvent motionEvent) {
        View n6;
        RecyclerView.p layoutManager = this.f10049r.getLayoutManager();
        int i6 = this.f10043l;
        if (i6 == -1) {
            return null;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i6);
        float x6 = motionEvent.getX(findPointerIndex) - this.f10035d;
        float y6 = motionEvent.getY(findPointerIndex) - this.f10036e;
        float abs = Math.abs(x6);
        float abs2 = Math.abs(y6);
        int i7 = this.f10048q;
        if (abs < i7 && abs2 < i7) {
            return null;
        }
        if (abs > abs2 && layoutManager.k()) {
            return null;
        }
        if ((abs2 <= abs || !layoutManager.l()) && (n6 = n(motionEvent)) != null) {
            return this.f10049r.f0(n6);
        }
        return null;
    }

    public final void q(float[] fArr) {
        if ((this.f10046o & 12) != 0) {
            fArr[0] = (this.f10041j + this.f10039h) - this.f10034c.itemView.getLeft();
        } else {
            fArr[0] = this.f10034c.itemView.getTranslationX();
        }
        if ((this.f10046o & 3) != 0) {
            fArr[1] = (this.f10042k + this.f10040i) - this.f10034c.itemView.getTop();
        } else {
            fArr[1] = this.f10034c.itemView.getTranslationY();
        }
    }

    public boolean r() {
        int size = this.f10047p.size();
        for (int i6 = 0; i6 < size; i6++) {
            if (!((g) this.f10047p.get(i6)).f10080m) {
                return true;
            }
        }
        return false;
    }

    public void t(RecyclerView.D d6) {
        if (!this.f10049r.isLayoutRequested() && this.f10045n == 2) {
            float moveThreshold = this.f10044m.getMoveThreshold(d6);
            int i6 = (int) (this.f10041j + this.f10039h);
            int i7 = (int) (this.f10042k + this.f10040i);
            if (Math.abs(i7 - d6.itemView.getTop()) >= d6.itemView.getHeight() * moveThreshold || Math.abs(i6 - d6.itemView.getLeft()) >= d6.itemView.getWidth() * moveThreshold) {
                List<RecyclerView.D> o6 = o(d6);
                if (o6.size() == 0) {
                    return;
                }
                RecyclerView.D chooseDropTarget = this.f10044m.chooseDropTarget(d6, o6, i6, i7);
                if (chooseDropTarget == null) {
                    this.f10052u.clear();
                    this.f10053v.clear();
                    return;
                }
                int absoluteAdapterPosition = chooseDropTarget.getAbsoluteAdapterPosition();
                int absoluteAdapterPosition2 = d6.getAbsoluteAdapterPosition();
                if (this.f10044m.onMove(this.f10049r, d6, chooseDropTarget)) {
                    this.f10044m.onMoved(this.f10049r, d6, absoluteAdapterPosition2, chooseDropTarget, absoluteAdapterPosition, i6, i7);
                }
            }
        }
    }

    public void u() {
        VelocityTracker velocityTracker = this.f10051t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f10051t = VelocityTracker.obtain();
    }

    public void v(g gVar, int i6) {
        this.f10049r.post(new d(gVar, i6));
    }

    public final void w() {
        VelocityTracker velocityTracker = this.f10051t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f10051t = null;
        }
    }

    public void x(View view) {
        if (view == this.f10055x) {
            this.f10055x = null;
            if (this.f10054w != null) {
                this.f10049r.setChildDrawingOrderCallback(null);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x009d, code lost:
    
        if (r6 < 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c1, code lost:
    
        if (r6 > 0) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean y() {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.h.y():boolean");
    }

    public void z(RecyclerView.D d6, int i6) {
        boolean z6;
        float f6;
        float signum;
        if (d6 == this.f10034c && i6 == this.f10045n) {
            return;
        }
        this.f10031D = Long.MIN_VALUE;
        int i7 = this.f10045n;
        l(d6, true);
        this.f10045n = i6;
        if (i6 == 2) {
            if (d6 == null) {
                throw new IllegalArgumentException("Must pass a ViewHolder when dragging");
            }
            this.f10055x = d6.itemView;
            f();
        }
        int i8 = (1 << ((i6 * 8) + 8)) - 1;
        RecyclerView.D d7 = this.f10034c;
        boolean z7 = false;
        if (d7 != null) {
            if (d7.itemView.getParent() != null) {
                int D6 = i7 == 2 ? 0 : D(d7);
                w();
                int i9 = 4;
                if (D6 == 1 || D6 == 2) {
                    f6 = 0.0f;
                    signum = Math.signum(this.f10040i) * this.f10049r.getHeight();
                } else if (D6 == 4 || D6 == 8 || D6 == 16 || D6 == 32) {
                    signum = 0.0f;
                    f6 = Math.signum(this.f10039h) * this.f10049r.getWidth();
                } else {
                    f6 = 0.0f;
                    signum = 0.0f;
                }
                if (i7 == 2) {
                    i9 = 8;
                } else if (D6 > 0) {
                    i9 = 2;
                }
                q(this.f10033b);
                float[] fArr = this.f10033b;
                float f7 = fArr[0];
                float f8 = fArr[1];
                z6 = false;
                c cVar = new c(d7, i9, i7, f7, f8, f6, signum, D6, d7);
                cVar.b(this.f10044m.getAnimationDuration(this.f10049r, i9, f6 - f7, signum - f8));
                this.f10047p.add(cVar);
                cVar.d();
                z7 = true;
            } else {
                z6 = false;
                x(d7.itemView);
                this.f10044m.clearView(this.f10049r, d7);
                z7 = false;
            }
            this.f10034c = null;
        } else {
            z6 = false;
        }
        if (d6 != null) {
            this.f10046o = (this.f10044m.getAbsoluteMovementFlags(this.f10049r, d6) & i8) >> (this.f10045n * 8);
            this.f10041j = d6.itemView.getLeft();
            this.f10042k = d6.itemView.getTop();
            this.f10034c = d6;
            if (i6 == 2) {
                d6.itemView.performHapticFeedback(z6 ? 1 : 0);
            }
        }
        ViewParent parent = this.f10049r.getParent();
        if (parent != null) {
            if (this.f10034c != null) {
                z6 = true;
            }
            parent.requestDisallowInterceptTouchEvent(z6);
        }
        if (!z7) {
            this.f10049r.getLayoutManager().s1();
        }
        this.f10044m.onSelectedChanged(this.f10034c, this.f10045n);
        this.f10049r.invalidate();
    }
}
