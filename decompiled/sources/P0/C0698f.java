package P0;

import P0.AbstractC0713v;
import P0.C0698f;
import P0.a0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import e.C1208b;
import j0.C1638a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import z0.AbstractC2393D;
import z0.AbstractC2397H;
import z0.ViewTreeObserverOnPreDrawListenerC2439y;

/* renamed from: P0.f, reason: case insensitive filesystem */
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class C0698f extends a0 {

    /* renamed from: P0.f$a */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class a extends a0.b {

        /* renamed from: d, reason: collision with root package name */
        public final b f4163d;

        /* renamed from: P0.f$a$a, reason: collision with other inner class name */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class AnimationAnimationListenerC0067a implements Animation.AnimationListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a0.d f4164a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ViewGroup f4165b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ View f4166c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ a f4167d;

            public AnimationAnimationListenerC0067a(a0.d dVar, ViewGroup viewGroup, View view, a aVar) {
                this.f4164a = dVar;
                this.f4165b = viewGroup;
                this.f4166c = view;
                this.f4167d = aVar;
            }

            public static final void b(ViewGroup container, View view, a this$0) {
                Intrinsics.checkNotNullParameter(container, "$container");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                container.endViewTransition(view);
                this$0.h().a().f(this$0);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                final ViewGroup viewGroup = this.f4165b;
                final View view = this.f4166c;
                final a aVar = this.f4167d;
                viewGroup.post(new Runnable() { // from class: P0.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0698f.a.AnimationAnimationListenerC0067a.b(viewGroup, view, aVar);
                    }
                });
                if (I.I0(2)) {
                    Log.v("FragmentManager", "Animation from operation " + this.f4164a + " has ended.");
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                if (I.I0(2)) {
                    Log.v("FragmentManager", "Animation from operation " + this.f4164a + " has reached onAnimationStart.");
                }
            }
        }

        public a(b animationInfo) {
            Intrinsics.checkNotNullParameter(animationInfo, "animationInfo");
            this.f4163d = animationInfo;
        }

        @Override // P0.a0.b
        public void c(ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            a0.d a6 = this.f4163d.a();
            View view = a6.i().mView;
            view.clearAnimation();
            container.endViewTransition(view);
            this.f4163d.a().f(this);
            if (I.I0(2)) {
                Log.v("FragmentManager", "Animation from operation " + a6 + " has been cancelled.");
            }
        }

        @Override // P0.a0.b
        public void d(ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            if (this.f4163d.b()) {
                this.f4163d.a().f(this);
                return;
            }
            Context context = container.getContext();
            a0.d a6 = this.f4163d.a();
            View view = a6.i().mView;
            b bVar = this.f4163d;
            Intrinsics.checkNotNullExpressionValue(context, "context");
            AbstractC0713v.a c6 = bVar.c(context);
            if (c6 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Animation animation = c6.f4278a;
            if (animation == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (a6.h() != a0.d.b.REMOVED) {
                view.startAnimation(animation);
                this.f4163d.a().f(this);
                return;
            }
            container.startViewTransition(view);
            AbstractC0713v.b bVar2 = new AbstractC0713v.b(animation, container, view);
            bVar2.setAnimationListener(new AnimationAnimationListenerC0067a(a6, container, view, this));
            view.startAnimation(bVar2);
            if (I.I0(2)) {
                Log.v("FragmentManager", "Animation from operation " + a6 + " has started.");
            }
        }

        public final b h() {
            return this.f4163d;
        }
    }

    /* renamed from: P0.f$b */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class b extends C0068f {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f4168b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f4169c;

        /* renamed from: d, reason: collision with root package name */
        public AbstractC0713v.a f4170d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a0.d operation, boolean z6) {
            super(operation);
            Intrinsics.checkNotNullParameter(operation, "operation");
            this.f4168b = z6;
        }

        public final AbstractC0713v.a c(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (this.f4169c) {
                return this.f4170d;
            }
            AbstractC0713v.a b6 = AbstractC0713v.b(context, a().i(), a().h() == a0.d.b.VISIBLE, this.f4168b);
            this.f4170d = b6;
            this.f4169c = true;
            return b6;
        }
    }

    /* renamed from: P0.f$c */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class c extends a0.b {

        /* renamed from: d, reason: collision with root package name */
        public final b f4171d;

        /* renamed from: e, reason: collision with root package name */
        public AnimatorSet f4172e;

        /* renamed from: P0.f$c$a */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class a extends AnimatorListenerAdapter {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ViewGroup f4173a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ View f4174b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ boolean f4175c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ a0.d f4176d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ c f4177e;

            public a(ViewGroup viewGroup, View view, boolean z6, a0.d dVar, c cVar) {
                this.f4173a = viewGroup;
                this.f4174b = view;
                this.f4175c = z6;
                this.f4176d = dVar;
                this.f4177e = cVar;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator anim) {
                Intrinsics.checkNotNullParameter(anim, "anim");
                this.f4173a.endViewTransition(this.f4174b);
                if (this.f4175c) {
                    a0.d.b h6 = this.f4176d.h();
                    View viewToAnimate = this.f4174b;
                    Intrinsics.checkNotNullExpressionValue(viewToAnimate, "viewToAnimate");
                    h6.b(viewToAnimate, this.f4173a);
                }
                this.f4177e.h().a().f(this.f4177e);
                if (I.I0(2)) {
                    Log.v("FragmentManager", "Animator from operation " + this.f4176d + " has ended.");
                }
            }
        }

        public c(b animatorInfo) {
            Intrinsics.checkNotNullParameter(animatorInfo, "animatorInfo");
            this.f4171d = animatorInfo;
        }

        @Override // P0.a0.b
        public boolean b() {
            return true;
        }

        @Override // P0.a0.b
        public void c(ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            AnimatorSet animatorSet = this.f4172e;
            if (animatorSet == null) {
                this.f4171d.a().f(this);
                return;
            }
            a0.d a6 = this.f4171d.a();
            if (a6.n()) {
                e.f4179a.a(animatorSet);
            } else {
                animatorSet.end();
            }
            if (I.I0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Animator from operation ");
                sb.append(a6);
                sb.append(" has been canceled");
                sb.append(a6.n() ? " with seeking." : ".");
                sb.append(' ');
                Log.v("FragmentManager", sb.toString());
            }
        }

        @Override // P0.a0.b
        public void d(ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            a0.d a6 = this.f4171d.a();
            AnimatorSet animatorSet = this.f4172e;
            if (animatorSet == null) {
                this.f4171d.a().f(this);
                return;
            }
            animatorSet.start();
            if (I.I0(2)) {
                Log.v("FragmentManager", "Animator from operation " + a6 + " has started.");
            }
        }

        @Override // P0.a0.b
        public void e(C1208b backEvent, ViewGroup container) {
            Intrinsics.checkNotNullParameter(backEvent, "backEvent");
            Intrinsics.checkNotNullParameter(container, "container");
            a0.d a6 = this.f4171d.a();
            AnimatorSet animatorSet = this.f4172e;
            if (animatorSet == null) {
                this.f4171d.a().f(this);
                return;
            }
            if (Build.VERSION.SDK_INT < 34 || !a6.i().mTransitioning) {
                return;
            }
            if (I.I0(2)) {
                Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation " + a6);
            }
            long a7 = d.f4178a.a(animatorSet);
            long a8 = backEvent.a() * ((float) a7);
            if (a8 == 0) {
                a8 = 1;
            }
            if (a8 == a7) {
                a8 = a7 - 1;
            }
            if (I.I0(2)) {
                Log.v("FragmentManager", "Setting currentPlayTime to " + a8 + " for Animator " + animatorSet + " on operation " + a6);
            }
            e.f4179a.b(animatorSet, a8);
        }

        @Override // P0.a0.b
        public void f(ViewGroup container) {
            c cVar;
            Intrinsics.checkNotNullParameter(container, "container");
            if (this.f4171d.b()) {
                return;
            }
            Context context = container.getContext();
            b bVar = this.f4171d;
            Intrinsics.checkNotNullExpressionValue(context, "context");
            AbstractC0713v.a c6 = bVar.c(context);
            this.f4172e = c6 != null ? c6.f4279b : null;
            a0.d a6 = this.f4171d.a();
            AbstractComponentCallbacksC0708p i6 = a6.i();
            boolean z6 = a6.h() == a0.d.b.GONE;
            View view = i6.mView;
            container.startViewTransition(view);
            AnimatorSet animatorSet = this.f4172e;
            if (animatorSet != null) {
                cVar = this;
                animatorSet.addListener(new a(container, view, z6, a6, cVar));
            } else {
                cVar = this;
            }
            AnimatorSet animatorSet2 = cVar.f4172e;
            if (animatorSet2 != null) {
                animatorSet2.setTarget(view);
            }
        }

        public final b h() {
            return this.f4171d;
        }
    }

    /* renamed from: P0.f$d */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public static final d f4178a = new d();

        public final long a(@NotNull AnimatorSet animatorSet) {
            Intrinsics.checkNotNullParameter(animatorSet, "animatorSet");
            return animatorSet.getTotalDuration();
        }
    }

    /* renamed from: P0.f$e */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public static final e f4179a = new e();

        public final void a(@NotNull AnimatorSet animatorSet) {
            Intrinsics.checkNotNullParameter(animatorSet, "animatorSet");
            animatorSet.reverse();
        }

        public final void b(@NotNull AnimatorSet animatorSet, long j6) {
            Intrinsics.checkNotNullParameter(animatorSet, "animatorSet");
            animatorSet.setCurrentPlayTime(j6);
        }
    }

    /* renamed from: P0.f$f, reason: collision with other inner class name */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static class C0068f {

        /* renamed from: a, reason: collision with root package name */
        public final a0.d f4180a;

        public C0068f(a0.d operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            this.f4180a = operation;
        }

        public final a0.d a() {
            return this.f4180a;
        }

        public final boolean b() {
            View view = this.f4180a.i().mView;
            a0.d.b a6 = view != null ? a0.d.b.f4133a.a(view) : null;
            a0.d.b h6 = this.f4180a.h();
            if (a6 == h6) {
                return true;
            }
            a0.d.b bVar = a0.d.b.VISIBLE;
            return (a6 == bVar || h6 == bVar) ? false : true;
        }
    }

    /* renamed from: P0.f$g */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class g extends a0.b {

        /* renamed from: d, reason: collision with root package name */
        public final List f4181d;

        /* renamed from: e, reason: collision with root package name */
        public final a0.d f4182e;

        /* renamed from: f, reason: collision with root package name */
        public final a0.d f4183f;

        /* renamed from: g, reason: collision with root package name */
        public final U f4184g;

        /* renamed from: h, reason: collision with root package name */
        public final Object f4185h;

        /* renamed from: i, reason: collision with root package name */
        public final ArrayList f4186i;

        /* renamed from: j, reason: collision with root package name */
        public final ArrayList f4187j;

        /* renamed from: k, reason: collision with root package name */
        public final C1638a f4188k;

        /* renamed from: l, reason: collision with root package name */
        public final ArrayList f4189l;

        /* renamed from: m, reason: collision with root package name */
        public final ArrayList f4190m;

        /* renamed from: n, reason: collision with root package name */
        public final C1638a f4191n;

        /* renamed from: o, reason: collision with root package name */
        public final C1638a f4192o;

        /* renamed from: p, reason: collision with root package name */
        public final boolean f4193p;

        /* renamed from: q, reason: collision with root package name */
        public final v0.e f4194q;

        /* renamed from: r, reason: collision with root package name */
        public Object f4195r;

        /* renamed from: P0.f$g$a */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class a extends Lambda implements Function0 {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ViewGroup f4197b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Object f4198c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ViewGroup viewGroup, Object obj) {
                super(0);
                this.f4197b = viewGroup;
                this.f4198c = obj;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m1invoke();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m1invoke() {
                g.this.v().e(this.f4197b, this.f4198c);
            }
        }

        /* renamed from: P0.f$g$b */
        /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
        public static final class b extends Lambda implements Function0 {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ViewGroup f4200b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Object f4201c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Ref.ObjectRef f4202d;

            /* renamed from: P0.f$g$b$a */
            /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
            public static final class a extends Lambda implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ g f4203a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ViewGroup f4204b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(g gVar, ViewGroup viewGroup) {
                    super(0);
                    this.f4203a = gVar;
                    this.f4204b = viewGroup;
                }

                public static final void b(g this$0, ViewGroup container) {
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    Intrinsics.checkNotNullParameter(container, "$container");
                    Iterator it = this$0.w().iterator();
                    while (it.hasNext()) {
                        a0.d a6 = ((h) it.next()).a();
                        View view = a6.i().getView();
                        if (view != null) {
                            a6.h().b(view, container);
                        }
                    }
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m3invoke();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m3invoke() {
                    if (I.I0(2)) {
                        Log.v("FragmentManager", "Animating to start");
                    }
                    U v6 = this.f4203a.v();
                    Object s6 = this.f4203a.s();
                    Intrinsics.checkNotNull(s6);
                    final g gVar = this.f4203a;
                    final ViewGroup viewGroup = this.f4204b;
                    v6.d(s6, new Runnable() { // from class: P0.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            C0698f.g.b.a.b(C0698f.g.this, viewGroup);
                        }
                    });
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(ViewGroup viewGroup, Object obj, Ref.ObjectRef objectRef) {
                super(0);
                this.f4200b = viewGroup;
                this.f4201c = obj;
                this.f4202d = objectRef;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m2invoke();
                return Unit.INSTANCE;
            }

            /* JADX WARN: Type inference failed for: r1v6, types: [P0.f$g$b$a, T] */
            /* renamed from: invoke, reason: collision with other method in class */
            public final void m2invoke() {
                g gVar = g.this;
                gVar.C(gVar.v().j(this.f4200b, this.f4201c));
                boolean z6 = g.this.s() != null;
                Object obj = this.f4201c;
                ViewGroup viewGroup = this.f4200b;
                if (z6) {
                    this.f4202d.element = new a(g.this, viewGroup);
                    if (I.I0(2)) {
                        Log.v("FragmentManager", "Started executing operations from " + g.this.t() + " to " + g.this.u());
                        return;
                    }
                    return;
                }
                throw new IllegalStateException(("Unable to start transition " + obj + " for container " + viewGroup + com.amazon.a.a.o.c.a.b.f11260a).toString());
            }
        }

        public g(List transitionInfos, a0.d dVar, a0.d dVar2, U transitionImpl, Object obj, ArrayList sharedElementFirstOutViews, ArrayList sharedElementLastInViews, C1638a sharedElementNameMapping, ArrayList enteringNames, ArrayList exitingNames, C1638a firstOutViews, C1638a lastInViews, boolean z6) {
            Intrinsics.checkNotNullParameter(transitionInfos, "transitionInfos");
            Intrinsics.checkNotNullParameter(transitionImpl, "transitionImpl");
            Intrinsics.checkNotNullParameter(sharedElementFirstOutViews, "sharedElementFirstOutViews");
            Intrinsics.checkNotNullParameter(sharedElementLastInViews, "sharedElementLastInViews");
            Intrinsics.checkNotNullParameter(sharedElementNameMapping, "sharedElementNameMapping");
            Intrinsics.checkNotNullParameter(enteringNames, "enteringNames");
            Intrinsics.checkNotNullParameter(exitingNames, "exitingNames");
            Intrinsics.checkNotNullParameter(firstOutViews, "firstOutViews");
            Intrinsics.checkNotNullParameter(lastInViews, "lastInViews");
            this.f4181d = transitionInfos;
            this.f4182e = dVar;
            this.f4183f = dVar2;
            this.f4184g = transitionImpl;
            this.f4185h = obj;
            this.f4186i = sharedElementFirstOutViews;
            this.f4187j = sharedElementLastInViews;
            this.f4188k = sharedElementNameMapping;
            this.f4189l = enteringNames;
            this.f4190m = exitingNames;
            this.f4191n = firstOutViews;
            this.f4192o = lastInViews;
            this.f4193p = z6;
            this.f4194q = new v0.e();
        }

        public static final void A(a0.d operation, g this$0) {
            Intrinsics.checkNotNullParameter(operation, "$operation");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (I.I0(2)) {
                Log.v("FragmentManager", "Transition for operation " + operation + " has completed");
            }
            operation.f(this$0);
        }

        public static final void p(a0.d dVar, a0.d dVar2, g this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            S.a(dVar.i(), dVar2.i(), this$0.f4193p, this$0.f4192o, false);
        }

        public static final void q(U impl, View view, Rect lastInEpicenterRect) {
            Intrinsics.checkNotNullParameter(impl, "$impl");
            Intrinsics.checkNotNullParameter(lastInEpicenterRect, "$lastInEpicenterRect");
            impl.k(view, lastInEpicenterRect);
        }

        public static final void r(ArrayList transitioningViews) {
            Intrinsics.checkNotNullParameter(transitioningViews, "$transitioningViews");
            S.d(transitioningViews, 4);
        }

        public static final void y(a0.d operation, g this$0) {
            Intrinsics.checkNotNullParameter(operation, "$operation");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (I.I0(2)) {
                Log.v("FragmentManager", "Transition for operation " + operation + " has completed");
            }
            operation.f(this$0);
        }

        public static final void z(Ref.ObjectRef seekCancelLambda) {
            Intrinsics.checkNotNullParameter(seekCancelLambda, "$seekCancelLambda");
            Function0 function0 = (Function0) seekCancelLambda.element;
            if (function0 != null) {
                function0.invoke();
            }
        }

        public final void B(ArrayList arrayList, ViewGroup viewGroup, Function0 function0) {
            S.d(arrayList, 4);
            ArrayList q6 = this.f4184g.q(this.f4187j);
            if (I.I0(2)) {
                Log.v("FragmentManager", ">>>>> Beginning transition <<<<<");
                Log.v("FragmentManager", ">>>>> SharedElementFirstOutViews <<<<<");
                Iterator it = this.f4186i.iterator();
                while (it.hasNext()) {
                    Object sharedElementFirstOutViews = it.next();
                    Intrinsics.checkNotNullExpressionValue(sharedElementFirstOutViews, "sharedElementFirstOutViews");
                    View view = (View) sharedElementFirstOutViews;
                    Log.v("FragmentManager", "View: " + view + " Name: " + AbstractC2393D.u(view));
                }
                Log.v("FragmentManager", ">>>>> SharedElementLastInViews <<<<<");
                Iterator it2 = this.f4187j.iterator();
                while (it2.hasNext()) {
                    Object sharedElementLastInViews = it2.next();
                    Intrinsics.checkNotNullExpressionValue(sharedElementLastInViews, "sharedElementLastInViews");
                    View view2 = (View) sharedElementLastInViews;
                    Log.v("FragmentManager", "View: " + view2 + " Name: " + AbstractC2393D.u(view2));
                }
            }
            function0.invoke();
            this.f4184g.y(viewGroup, this.f4186i, this.f4187j, q6, this.f4188k);
            S.d(arrayList, 0);
            this.f4184g.A(this.f4185h, this.f4186i, this.f4187j);
        }

        public final void C(Object obj) {
            this.f4195r = obj;
        }

        @Override // P0.a0.b
        public boolean b() {
            if (!this.f4184g.m()) {
                return false;
            }
            List<h> list = this.f4181d;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (h hVar : list) {
                    if (Build.VERSION.SDK_INT < 34 || hVar.f() == null || !this.f4184g.n(hVar.f())) {
                        return false;
                    }
                }
            }
            Object obj = this.f4185h;
            return obj == null || this.f4184g.n(obj);
        }

        @Override // P0.a0.b
        public void c(ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            this.f4194q.a();
        }

        @Override // P0.a0.b
        public void d(ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            if (!container.isLaidOut()) {
                for (h hVar : this.f4181d) {
                    a0.d a6 = hVar.a();
                    if (I.I0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Container " + container + " has not been laid out. Completing operation " + a6);
                    }
                    hVar.a().f(this);
                }
                return;
            }
            Object obj = this.f4195r;
            if (obj != null) {
                U u6 = this.f4184g;
                Intrinsics.checkNotNull(obj);
                u6.c(obj);
                if (I.I0(2)) {
                    Log.v("FragmentManager", "Ending execution of operations from " + this.f4182e + " to " + this.f4183f);
                    return;
                }
                return;
            }
            Pair o6 = o(container, this.f4183f, this.f4182e);
            ArrayList arrayList = (ArrayList) o6.component1();
            Object component2 = o6.component2();
            List list = this.f4181d;
            ArrayList<a0.d> arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(((h) it.next()).a());
            }
            for (final a0.d dVar : arrayList2) {
                this.f4184g.w(dVar.i(), component2, this.f4194q, new Runnable() { // from class: P0.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0698f.g.y(a0.d.this, this);
                    }
                });
            }
            B(arrayList, container, new a(container, component2));
            if (I.I0(2)) {
                Log.v("FragmentManager", "Completed executing operations from " + this.f4182e + " to " + this.f4183f);
            }
        }

        @Override // P0.a0.b
        public void e(C1208b backEvent, ViewGroup container) {
            Intrinsics.checkNotNullParameter(backEvent, "backEvent");
            Intrinsics.checkNotNullParameter(container, "container");
            Object obj = this.f4195r;
            if (obj != null) {
                this.f4184g.t(obj, backEvent.a());
            }
        }

        @Override // P0.a0.b
        public void f(ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            if (!container.isLaidOut()) {
                Iterator it = this.f4181d.iterator();
                while (it.hasNext()) {
                    a0.d a6 = ((h) it.next()).a();
                    if (I.I0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Container " + container + " has not been laid out. Skipping onStart for operation " + a6);
                    }
                }
                return;
            }
            if (x() && this.f4185h != null && !b()) {
                Log.i("FragmentManager", "Ignoring shared elements transition " + this.f4185h + " between " + this.f4182e + " and " + this.f4183f + " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.");
            }
            if (b() && x()) {
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                Pair o6 = o(container, this.f4183f, this.f4182e);
                ArrayList arrayList = (ArrayList) o6.component1();
                Object component2 = o6.component2();
                List list = this.f4181d;
                ArrayList<a0.d> arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((h) it2.next()).a());
                }
                for (final a0.d dVar : arrayList2) {
                    this.f4184g.x(dVar.i(), component2, this.f4194q, new Runnable() { // from class: P0.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            C0698f.g.z(Ref.ObjectRef.this);
                        }
                    }, new Runnable() { // from class: P0.h
                        @Override // java.lang.Runnable
                        public final void run() {
                            C0698f.g.A(a0.d.this, this);
                        }
                    });
                }
                B(arrayList, container, new b(container, component2, objectRef));
            }
        }

        public final void n(ArrayList arrayList, View view) {
            if (!(view instanceof ViewGroup)) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(view);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (AbstractC2397H.a(viewGroup)) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(view);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View child = viewGroup.getChildAt(i6);
                if (child.getVisibility() == 0) {
                    Intrinsics.checkNotNullExpressionValue(child, "child");
                    n(arrayList, child);
                }
            }
        }

        public final Pair o(ViewGroup viewGroup, a0.d dVar, final a0.d dVar2) {
            final a0.d dVar3 = dVar;
            View view = new View(viewGroup.getContext());
            final Rect rect = new Rect();
            Iterator it = this.f4181d.iterator();
            boolean z6 = false;
            View view2 = null;
            while (it.hasNext()) {
                if (((h) it.next()).g() && dVar2 != null && dVar3 != null && !this.f4188k.isEmpty() && this.f4185h != null) {
                    S.a(dVar3.i(), dVar2.i(), this.f4193p, this.f4191n, true);
                    ViewTreeObserverOnPreDrawListenerC2439y.a(viewGroup, new Runnable() { // from class: P0.j
                        @Override // java.lang.Runnable
                        public final void run() {
                            C0698f.g.p(a0.d.this, dVar2, this);
                        }
                    });
                    this.f4186i.addAll(this.f4191n.values());
                    if (!this.f4190m.isEmpty()) {
                        Object obj = this.f4190m.get(0);
                        Intrinsics.checkNotNullExpressionValue(obj, "exitingNames[0]");
                        view2 = (View) this.f4191n.get((String) obj);
                        this.f4184g.v(this.f4185h, view2);
                    }
                    this.f4187j.addAll(this.f4192o.values());
                    if (!this.f4189l.isEmpty()) {
                        Object obj2 = this.f4189l.get(0);
                        Intrinsics.checkNotNullExpressionValue(obj2, "enteringNames[0]");
                        final View view3 = (View) this.f4192o.get((String) obj2);
                        if (view3 != null) {
                            final U u6 = this.f4184g;
                            ViewTreeObserverOnPreDrawListenerC2439y.a(viewGroup, new Runnable() { // from class: P0.k
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C0698f.g.q(U.this, view3, rect);
                                }
                            });
                            z6 = true;
                        }
                    }
                    this.f4184g.z(this.f4185h, view, this.f4186i);
                    U u7 = this.f4184g;
                    Object obj3 = this.f4185h;
                    u7.s(obj3, null, null, null, null, obj3, this.f4187j);
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it2 = this.f4181d.iterator();
            Object obj4 = null;
            Object obj5 = null;
            while (it2.hasNext()) {
                h hVar = (h) it2.next();
                a0.d a6 = hVar.a();
                boolean z7 = z6;
                Object h6 = this.f4184g.h(hVar.f());
                if (h6 != null) {
                    final ArrayList arrayList2 = new ArrayList();
                    Iterator it3 = it2;
                    View view4 = a6.i().mView;
                    Intrinsics.checkNotNullExpressionValue(view4, "operation.fragment.mView");
                    n(arrayList2, view4);
                    if (this.f4185h != null && (a6 == dVar2 || a6 == dVar3)) {
                        if (a6 == dVar2) {
                            arrayList2.removeAll(CollectionsKt.toSet(this.f4186i));
                        } else {
                            arrayList2.removeAll(CollectionsKt.toSet(this.f4187j));
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        this.f4184g.a(h6, view);
                    } else {
                        this.f4184g.b(h6, arrayList2);
                        this.f4184g.s(h6, h6, arrayList2, null, null, null, null);
                        if (a6.h() == a0.d.b.GONE) {
                            a6.r(false);
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            arrayList3.remove(a6.i().mView);
                            this.f4184g.r(h6, a6.i().mView, arrayList3);
                            ViewTreeObserverOnPreDrawListenerC2439y.a(viewGroup, new Runnable() { // from class: P0.l
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C0698f.g.r(arrayList2);
                                }
                            });
                        }
                    }
                    if (a6.h() == a0.d.b.VISIBLE) {
                        arrayList.addAll(arrayList2);
                        if (z7) {
                            this.f4184g.u(h6, rect);
                        }
                        if (I.I0(2)) {
                            Log.v("FragmentManager", "Entering Transition: " + h6);
                            Log.v("FragmentManager", ">>>>> EnteringViews <<<<<");
                            Iterator it4 = arrayList2.iterator();
                            while (it4.hasNext()) {
                                Object transitioningViews = it4.next();
                                Intrinsics.checkNotNullExpressionValue(transitioningViews, "transitioningViews");
                                Log.v("FragmentManager", "View: " + ((View) transitioningViews));
                            }
                        }
                    } else {
                        this.f4184g.v(h6, view2);
                        if (I.I0(2)) {
                            Log.v("FragmentManager", "Exiting Transition: " + h6);
                            Log.v("FragmentManager", ">>>>> ExitingViews <<<<<");
                            Iterator it5 = arrayList2.iterator();
                            while (it5.hasNext()) {
                                Object transitioningViews2 = it5.next();
                                Intrinsics.checkNotNullExpressionValue(transitioningViews2, "transitioningViews");
                                Log.v("FragmentManager", "View: " + ((View) transitioningViews2));
                            }
                        }
                    }
                    if (hVar.h()) {
                        obj4 = this.f4184g.p(obj4, h6, null);
                    } else {
                        obj5 = this.f4184g.p(obj5, h6, null);
                    }
                    dVar3 = dVar;
                    z6 = z7;
                    it2 = it3;
                } else {
                    dVar3 = dVar;
                    z6 = z7;
                }
            }
            Object o6 = this.f4184g.o(obj4, obj5, this.f4185h);
            if (I.I0(2)) {
                Log.v("FragmentManager", "Final merged transition: " + o6);
            }
            return new Pair(arrayList, o6);
        }

        public final Object s() {
            return this.f4195r;
        }

        public final a0.d t() {
            return this.f4182e;
        }

        public final a0.d u() {
            return this.f4183f;
        }

        public final U v() {
            return this.f4184g;
        }

        public final List w() {
            return this.f4181d;
        }

        public final boolean x() {
            List list = this.f4181d;
            if ((list instanceof Collection) && list.isEmpty()) {
                return true;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!((h) it.next()).a().i().mTransitioning) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: P0.f$h */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class h extends C0068f {

        /* renamed from: b, reason: collision with root package name */
        public final Object f4205b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f4206c;

        /* renamed from: d, reason: collision with root package name */
        public final Object f4207d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(a0.d operation, boolean z6, boolean z7) {
            super(operation);
            Object returnTransition;
            Intrinsics.checkNotNullParameter(operation, "operation");
            a0.d.b h6 = operation.h();
            a0.d.b bVar = a0.d.b.VISIBLE;
            if (h6 == bVar) {
                AbstractComponentCallbacksC0708p i6 = operation.i();
                returnTransition = z6 ? i6.getReenterTransition() : i6.getEnterTransition();
            } else {
                AbstractComponentCallbacksC0708p i7 = operation.i();
                returnTransition = z6 ? i7.getReturnTransition() : i7.getExitTransition();
            }
            this.f4205b = returnTransition;
            this.f4206c = operation.h() == bVar ? z6 ? operation.i().getAllowReturnTransitionOverlap() : operation.i().getAllowEnterTransitionOverlap() : true;
            this.f4207d = z7 ? z6 ? operation.i().getSharedElementReturnTransition() : operation.i().getSharedElementEnterTransition() : null;
        }

        public final U c() {
            U d6 = d(this.f4205b);
            U d7 = d(this.f4207d);
            if (d6 == null || d7 == null || d6 == d7) {
                return d6 == null ? d7 : d6;
            }
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + a().i() + " returned Transition " + this.f4205b + " which uses a different Transition  type than its shared element transition " + this.f4207d).toString());
        }

        public final U d(Object obj) {
            if (obj == null) {
                return null;
            }
            U u6 = S.f4067b;
            if (u6 != null && u6.g(obj)) {
                return u6;
            }
            U u7 = S.f4068c;
            if (u7 != null && u7.g(obj)) {
                return u7;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + a().i() + " is not a valid framework Transition or AndroidX Transition");
        }

        public final Object e() {
            return this.f4207d;
        }

        public final Object f() {
            return this.f4205b;
        }

        public final boolean g() {
            return this.f4207d != null;
        }

        public final boolean h() {
            return this.f4206c;
        }
    }

    /* renamed from: P0.f$i */
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class i extends Lambda implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Collection f4208a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Collection collection) {
            super(1);
            this.f4208a = collection;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Map.Entry entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            return Boolean.valueOf(CollectionsKt.contains(this.f4208a, AbstractC2393D.u((View) entry.getValue())));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0698f(ViewGroup container) {
        super(container);
        Intrinsics.checkNotNullParameter(container, "container");
    }

    public static final void E(C0698f this$0, a0.d operation) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(operation, "$operation");
        this$0.c(operation);
    }

    public final void D(List list) {
        ArrayList<b> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList2, ((b) it.next()).a().g());
        }
        boolean isEmpty = arrayList2.isEmpty();
        Iterator it2 = list.iterator();
        boolean z6 = false;
        while (it2.hasNext()) {
            b bVar = (b) it2.next();
            Context context = t().getContext();
            a0.d a6 = bVar.a();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            AbstractC0713v.a c6 = bVar.c(context);
            if (c6 != null) {
                if (c6.f4279b == null) {
                    arrayList.add(bVar);
                } else {
                    AbstractComponentCallbacksC0708p i6 = a6.i();
                    if (a6.g().isEmpty()) {
                        if (a6.h() == a0.d.b.GONE) {
                            a6.r(false);
                        }
                        a6.b(new c(bVar));
                        z6 = true;
                    } else if (I.I0(2)) {
                        Log.v("FragmentManager", "Ignoring Animator set on " + i6 + " as this Fragment was involved in a Transition.");
                    }
                }
            }
        }
        for (b bVar2 : arrayList) {
            a0.d a7 = bVar2.a();
            AbstractComponentCallbacksC0708p i7 = a7.i();
            if (isEmpty) {
                if (!z6) {
                    a7.b(new a(bVar2));
                } else if (I.I0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + i7 + " as Animations cannot run alongside Animators.");
                }
            } else if (I.I0(2)) {
                Log.v("FragmentManager", "Ignoring Animation set on " + i7 + " as Animations cannot run alongside Transitions.");
            }
        }
    }

    public final void F(List list, boolean z6, a0.d dVar, a0.d dVar2) {
        Object obj;
        ArrayList arrayList;
        Iterator it;
        Pair pair;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (!((h) obj2).b()) {
                arrayList2.add(obj2);
            }
        }
        ArrayList<h> arrayList3 = new ArrayList();
        for (Object obj3 : arrayList2) {
            if (((h) obj3).c() != null) {
                arrayList3.add(obj3);
            }
        }
        U u6 = null;
        for (h hVar : arrayList3) {
            U c6 = hVar.c();
            if (u6 != null && c6 != u6) {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + hVar.a().i() + " returned Transition " + hVar.f() + " which uses a different Transition type than other Fragments.").toString());
            }
            u6 = c6;
        }
        if (u6 == null) {
            return;
        }
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        C1638a c1638a = new C1638a();
        ArrayList<String> arrayList6 = new ArrayList<>();
        ArrayList<String> arrayList7 = new ArrayList<>();
        C1638a c1638a2 = new C1638a();
        C1638a c1638a3 = new C1638a();
        ArrayList<String> arrayList8 = arrayList6;
        Iterator it2 = arrayList3.iterator();
        ArrayList<String> arrayList9 = arrayList7;
        loop3: while (true) {
            obj = null;
            while (it2.hasNext()) {
                h hVar2 = (h) it2.next();
                if (hVar2.g() && dVar != null && dVar2 != null) {
                    obj = u6.B(u6.h(hVar2.e()));
                    arrayList9 = dVar2.i().getSharedElementSourceNames();
                    Intrinsics.checkNotNullExpressionValue(arrayList9, "lastIn.fragment.sharedElementSourceNames");
                    ArrayList<String> sharedElementSourceNames = dVar.i().getSharedElementSourceNames();
                    Intrinsics.checkNotNullExpressionValue(sharedElementSourceNames, "firstOut.fragment.sharedElementSourceNames");
                    ArrayList<String> sharedElementTargetNames = dVar.i().getSharedElementTargetNames();
                    Intrinsics.checkNotNullExpressionValue(sharedElementTargetNames, "firstOut.fragment.sharedElementTargetNames");
                    int size = sharedElementTargetNames.size();
                    arrayList = arrayList3;
                    int i6 = 0;
                    while (i6 < size) {
                        Iterator it3 = it2;
                        int indexOf = arrayList9.indexOf(sharedElementTargetNames.get(i6));
                        int i7 = size;
                        if (indexOf != -1) {
                            arrayList9.set(indexOf, sharedElementSourceNames.get(i6));
                        }
                        i6++;
                        it2 = it3;
                        size = i7;
                    }
                    it = it2;
                    arrayList8 = dVar2.i().getSharedElementTargetNames();
                    Intrinsics.checkNotNullExpressionValue(arrayList8, "lastIn.fragment.sharedElementTargetNames");
                    if (z6) {
                        dVar.i().getEnterTransitionCallback();
                        dVar2.i().getExitTransitionCallback();
                        pair = TuplesKt.to((Object) null, (Object) null);
                    } else {
                        dVar.i().getExitTransitionCallback();
                        dVar2.i().getEnterTransitionCallback();
                        pair = TuplesKt.to((Object) null, (Object) null);
                    }
                    android.support.v4.media.session.b.a(pair.component1());
                    android.support.v4.media.session.b.a(pair.component2());
                    int i8 = 0;
                    for (int size2 = arrayList9.size(); i8 < size2; size2 = size2) {
                        String str = arrayList9.get(i8);
                        Intrinsics.checkNotNullExpressionValue(str, "exitingNames[i]");
                        String str2 = arrayList8.get(i8);
                        Intrinsics.checkNotNullExpressionValue(str2, "enteringNames[i]");
                        c1638a.put(str, str2);
                        i8++;
                    }
                    if (I.I0(2)) {
                        Log.v("FragmentManager", ">>> entering view names <<<");
                        for (Iterator<String> it4 = arrayList8.iterator(); it4.hasNext(); it4 = it4) {
                            Log.v("FragmentManager", "Name: " + it4.next());
                        }
                        Log.v("FragmentManager", ">>> exiting view names <<<");
                        for (Iterator<String> it5 = arrayList9.iterator(); it5.hasNext(); it5 = it5) {
                            Log.v("FragmentManager", "Name: " + it5.next());
                        }
                    }
                    View view = dVar.i().mView;
                    Intrinsics.checkNotNullExpressionValue(view, "firstOut.fragment.mView");
                    G(c1638a2, view);
                    c1638a2.n(arrayList9);
                    c1638a.n(c1638a2.keySet());
                    View view2 = dVar2.i().mView;
                    Intrinsics.checkNotNullExpressionValue(view2, "lastIn.fragment.mView");
                    G(c1638a3, view2);
                    c1638a3.n(arrayList8);
                    c1638a3.n(c1638a.values());
                    S.c(c1638a, c1638a3);
                    Collection keySet = c1638a.keySet();
                    Intrinsics.checkNotNullExpressionValue(keySet, "sharedElementNameMapping.keys");
                    H(c1638a2, keySet);
                    Collection values = c1638a.values();
                    Intrinsics.checkNotNullExpressionValue(values, "sharedElementNameMapping.values");
                    H(c1638a3, values);
                    if (c1638a.isEmpty()) {
                        break;
                    }
                } else {
                    arrayList = arrayList3;
                    it = it2;
                }
                arrayList3 = arrayList;
                it2 = it;
            }
            Log.i("FragmentManager", "Ignoring shared elements transition " + obj + " between " + dVar + " and " + dVar2 + " as there are no matching elements in both the entering and exiting fragment. In order to run a SharedElementTransition, both fragments involved must have the element.");
            arrayList4.clear();
            arrayList5.clear();
            arrayList3 = arrayList;
            it2 = it;
        }
        ArrayList arrayList10 = arrayList3;
        if (obj == null) {
            if (arrayList10.isEmpty()) {
                return;
            }
            Iterator it6 = arrayList10.iterator();
            while (it6.hasNext()) {
                if (((h) it6.next()).f() == null) {
                }
            }
            return;
        }
        g gVar = new g(arrayList10, dVar, dVar2, u6, obj, arrayList4, arrayList5, c1638a, arrayList8, arrayList9, c1638a2, c1638a3, z6);
        Iterator it7 = arrayList10.iterator();
        while (it7.hasNext()) {
            ((h) it7.next()).a().b(gVar);
        }
    }

    public final void G(Map map, View view) {
        String u6 = AbstractC2393D.u(view);
        if (u6 != null) {
            map.put(u6, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View child = viewGroup.getChildAt(i6);
                if (child.getVisibility() == 0) {
                    Intrinsics.checkNotNullExpressionValue(child, "child");
                    G(map, child);
                }
            }
        }
    }

    public final void H(C1638a c1638a, Collection collection) {
        Set entries = c1638a.entrySet();
        Intrinsics.checkNotNullExpressionValue(entries, "entries");
        CollectionsKt.retainAll(entries, new i(collection));
    }

    public final void I(List list) {
        AbstractComponentCallbacksC0708p i6 = ((a0.d) CollectionsKt.last(list)).i();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a0.d dVar = (a0.d) it.next();
            dVar.i().mAnimationInfo.f4255c = i6.mAnimationInfo.f4255c;
            dVar.i().mAnimationInfo.f4256d = i6.mAnimationInfo.f4256d;
            dVar.i().mAnimationInfo.f4257e = i6.mAnimationInfo.f4257e;
            dVar.i().mAnimationInfo.f4258f = i6.mAnimationInfo.f4258f;
        }
    }

    @Override // P0.a0
    public void d(List operations, boolean z6) {
        Object obj;
        Object obj2;
        Intrinsics.checkNotNullParameter(operations, "operations");
        Iterator it = operations.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            a0.d dVar = (a0.d) obj2;
            a0.d.b.a aVar = a0.d.b.f4133a;
            View view = dVar.i().mView;
            Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
            a0.d.b a6 = aVar.a(view);
            a0.d.b bVar = a0.d.b.VISIBLE;
            if (a6 == bVar && dVar.h() != bVar) {
                break;
            }
        }
        a0.d dVar2 = (a0.d) obj2;
        ListIterator listIterator = operations.listIterator(operations.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            Object previous = listIterator.previous();
            a0.d dVar3 = (a0.d) previous;
            a0.d.b.a aVar2 = a0.d.b.f4133a;
            View view2 = dVar3.i().mView;
            Intrinsics.checkNotNullExpressionValue(view2, "operation.fragment.mView");
            a0.d.b a7 = aVar2.a(view2);
            a0.d.b bVar2 = a0.d.b.VISIBLE;
            if (a7 != bVar2 && dVar3.h() == bVar2) {
                obj = previous;
                break;
            }
        }
        a0.d dVar4 = (a0.d) obj;
        if (I.I0(2)) {
            Log.v("FragmentManager", "Executing operations from " + dVar2 + " to " + dVar4);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        I(operations);
        Iterator it2 = operations.iterator();
        while (it2.hasNext()) {
            final a0.d dVar5 = (a0.d) it2.next();
            arrayList.add(new b(dVar5, z6));
            boolean z7 = false;
            if (z6) {
                if (dVar5 != dVar2) {
                    arrayList2.add(new h(dVar5, z6, z7));
                    dVar5.a(new Runnable() { // from class: P0.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            C0698f.E(C0698f.this, dVar5);
                        }
                    });
                }
                z7 = true;
                arrayList2.add(new h(dVar5, z6, z7));
                dVar5.a(new Runnable() { // from class: P0.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0698f.E(C0698f.this, dVar5);
                    }
                });
            } else {
                if (dVar5 != dVar4) {
                    arrayList2.add(new h(dVar5, z6, z7));
                    dVar5.a(new Runnable() { // from class: P0.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            C0698f.E(C0698f.this, dVar5);
                        }
                    });
                }
                z7 = true;
                arrayList2.add(new h(dVar5, z6, z7));
                dVar5.a(new Runnable() { // from class: P0.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0698f.E(C0698f.this, dVar5);
                    }
                });
            }
        }
        F(arrayList2, z6, dVar2, dVar4);
        D(arrayList);
    }
}
