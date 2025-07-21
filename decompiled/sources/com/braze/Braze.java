package com.braze;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.appsflyer.AppsFlyerProperties;
import com.braze.Braze;
import com.braze.configuration.BrazeConfig;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.configuration.RuntimeAppConfigurationProvider;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.BrazePushEventType;
import com.braze.events.BannersUpdatedEvent;
import com.braze.events.BrazePushEvent;
import com.braze.events.BrazeSdkAuthenticationErrorEvent;
import com.braze.events.BrazeUserChangeEvent;
import com.braze.events.ContentCardsUpdatedEvent;
import com.braze.events.FeatureFlagsUpdatedEvent;
import com.braze.events.FeedUpdatedEvent;
import com.braze.events.IEventSubscriber;
import com.braze.events.IFireOnceEventSubscriber;
import com.braze.events.IValueCallback;
import com.braze.events.InAppMessageEvent;
import com.braze.events.SdkDataWipeEvent;
import com.braze.events.e;
import com.braze.images.DefaultBrazeImageLoader;
import com.braze.images.IBrazeImageLoader;
import com.braze.managers.t0;
import com.braze.managers.u0;
import com.braze.managers.z;
import com.braze.models.Banner;
import com.braze.models.FeatureFlag;
import com.braze.models.cards.Card;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.models.push.BrazeNotificationPayload;
import com.braze.storage.a0;
import com.braze.storage.r;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.PermissionUtils;
import com.braze.support.StringUtils;
import com.braze.support.ValidationUtils;
import ga.J;
import ga.L;
import java.io.File;
import java.io.FilenameFilter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000Ì\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 \u0098\u00022\u00020\u0001:\u0002\u0098\u0002B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010 \u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b \u0010\u001fJ#\u0010$\u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010\u00182\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%J?\u0010,\u001a\u00020\u000b2\b\u0010&\u001a\u0004\u0018\u00010\u00182\b\u0010'\u001a\u0004\u0018\u00010\u00182\b\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010+\u001a\u00020*2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b,\u0010-J\u0019\u00100\u001a\u00020\u000b2\b\u0010/\u001a\u0004\u0018\u00010.H\u0016¢\u0006\u0004\b0\u00101J-\u00105\u001a\u00020\u000b2\b\u00102\u001a\u0004\u0018\u00010\u00182\b\u00103\u001a\u0004\u0018\u00010\u00182\b\u00104\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b5\u00106J#\u00108\u001a\u00020\u000b2\b\u00102\u001a\u0004\u0018\u00010\u00182\b\u00107\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u000bH\u0016¢\u0006\u0004\b:\u0010\u0013J\u000f\u0010;\u001a\u00020\u000bH\u0016¢\u0006\u0004\b;\u0010\u0013J\u000f\u0010<\u001a\u00020\u000bH\u0016¢\u0006\u0004\b<\u0010\u0013J\u000f\u0010=\u001a\u00020\u000bH\u0016¢\u0006\u0004\b=\u0010\u0013J\u000f\u0010>\u001a\u00020\u000bH\u0016¢\u0006\u0004\b>\u0010\u0013J\u000f\u0010?\u001a\u00020\u000bH\u0016¢\u0006\u0004\b?\u0010\u0013J\u0015\u0010B\u001a\b\u0012\u0004\u0012\u00020A0@H\u0016¢\u0006\u0004\bB\u0010CJ\u0019\u0010E\u001a\u0004\u0018\u00010A2\u0006\u0010D\u001a\u00020\u0018H\u0016¢\u0006\u0004\bE\u0010FJ\u0017\u0010G\u001a\u00020\u000b2\u0006\u0010D\u001a\u00020\u0018H\u0016¢\u0006\u0004\bG\u0010HJ\u001d\u0010J\u001a\u00020\u000b2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00180@H\u0016¢\u0006\u0004\bJ\u0010KJ-\u0010J\u001a\u00020\u000b2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00180@2\u000e\u0010N\u001a\n\u0012\u0004\u0012\u00020M\u0018\u00010LH\u0016¢\u0006\u0004\bJ\u0010OJ\u0019\u0010Q\u001a\u0004\u0018\u00010P2\u0006\u0010D\u001a\u00020\u0018H\u0016¢\u0006\u0004\bQ\u0010RJ\u0017\u0010T\u001a\u00020\t2\u0006\u0010S\u001a\u00020\u0018H\u0016¢\u0006\u0004\bT\u0010\u001bJ!\u0010V\u001a\u00020\u000b2\u0006\u0010S\u001a\u00020\u00182\b\u0010U\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\bV\u00109J\u000f\u0010W\u001a\u00020\u000bH\u0016¢\u0006\u0004\bW\u0010\u0013J\u001d\u0010[\u001a\u00020\u000b2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020Y0XH\u0016¢\u0006\u0004\b[\u0010\\J\u001d\u0010^\u001a\u00020\u000b2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020]0XH\u0016¢\u0006\u0004\b^\u0010\\J\u001d\u0010`\u001a\u00020\u000b2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020_0XH\u0016¢\u0006\u0004\b`\u0010\\J\u001d\u0010a\u001a\u00020\u000b2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020M0XH\u0016¢\u0006\u0004\ba\u0010\\J\u001d\u0010c\u001a\u00020\u000b2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020b0XH\u0016¢\u0006\u0004\bc\u0010\\J\u001d\u0010e\u001a\u00020\u000b2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020d0XH\u0016¢\u0006\u0004\be\u0010\\J\u001d\u0010g\u001a\u00020\u000b2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020f0XH\u0016¢\u0006\u0004\bg\u0010\\J1\u0010k\u001a\u00020\u000b\"\u0004\b\u0000\u0010h2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00028\u00000X2\f\u0010j\u001a\b\u0012\u0004\u0012\u00028\u00000iH\u0016¢\u0006\u0004\bk\u0010lJ3\u0010m\u001a\u00020\u000b\"\u0004\b\u0000\u0010h2\u000e\u0010Z\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010X2\f\u0010j\u001a\b\u0012\u0004\u0012\u00028\u00000iH\u0016¢\u0006\u0004\bm\u0010lJ\u0019\u0010o\u001a\u00020\u000b2\b\u0010n\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\bo\u0010HJ#\u0010o\u001a\u00020\u000b2\b\u0010n\u001a\u0004\u0018\u00010\u00182\b\u0010p\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\bo\u00109J\u001d\u0010r\u001a\u00020\u000b2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020q0LH\u0016¢\u0006\u0004\br\u0010sJ\u0017\u0010u\u001a\n\u0012\u0004\u0012\u00020t\u0018\u00010@H\u0016¢\u0006\u0004\bu\u0010CJ\u001b\u0010w\u001a\u0004\u0018\u00010t2\b\u0010v\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\bw\u0010xJ\u001b\u0010w\u001a\u0004\u0018\u00010t2\b\u0010z\u001a\u0004\u0018\u00010yH\u0016¢\u0006\u0004\bw\u0010{J\u001b\u0010~\u001a\u0004\u0018\u00010}2\b\u0010|\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b~\u0010\u007fJ\u0011\u0010\u0080\u0001\u001a\u00020\u000bH\u0016¢\u0006\u0005\b\u0080\u0001\u0010\u0013J$\u0010\u0083\u0001\u001a\u00020\u000b2\u0007\u0010\u0081\u0001\u001a\u00020\u00182\u0007\u0010\u0082\u0001\u001a\u00020\tH\u0016¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\u001a\u0010\u0086\u0001\u001a\u00020\u000b2\u0007\u0010\u0085\u0001\u001a\u00020\u0018H\u0016¢\u0006\u0005\b\u0086\u0001\u0010HJ\u001a\u0010\u0089\u0001\u001a\u00020\u000b2\u0007\u0010\u0087\u0001\u001a\u00020\tH\u0000¢\u0006\u0005\b\u0088\u0001\u0010\rJ$\u0010\u008c\u0001\u001a\u00020\u000b2\u0007\u0010\u008a\u0001\u001a\u00020\u00182\b\u0010n\u001a\u0004\u0018\u00010\u0018H\u0000¢\u0006\u0005\b\u008b\u0001\u00109J\u0011\u0010\u008e\u0001\u001a\u00020\u000bH\u0000¢\u0006\u0005\b\u008d\u0001\u0010\u0013J\u0011\u0010\u0090\u0001\u001a\u00020\u000bH\u0000¢\u0006\u0005\b\u008f\u0001\u0010\u0013J\u0019\u0010\u0092\u0001\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020.H\u0000¢\u0006\u0005\b\u0091\u0001\u00101J\u0011\u0010\u0094\u0001\u001a\u00020\u000bH\u0000¢\u0006\u0005\b\u0093\u0001\u0010\u0013J\u0011\u0010\u0096\u0001\u001a\u00020\u000bH\u0000¢\u0006\u0005\b\u0095\u0001\u0010\u0013J\u001b\u0010\u009a\u0001\u001a\u00020\u000b2\u0007\u0010\u0097\u0001\u001a\u00020YH\u0000¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J\u001b\u0010\u009c\u0001\u001a\u00020\u000b2\u0007\u0010\u0097\u0001\u001a\u00020YH\u0000¢\u0006\u0006\b\u009b\u0001\u0010\u0099\u0001J&\u0010£\u0001\u001a\u00020\u000b2\b\u0010\u009e\u0001\u001a\u00030\u009d\u00012\b\u0010 \u0001\u001a\u00030\u009f\u0001H\u0000¢\u0006\u0006\b¡\u0001\u0010¢\u0001J$\u0010¨\u0001\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\u00182\b\u0010¥\u0001\u001a\u00030¤\u0001H\u0000¢\u0006\u0006\b¦\u0001\u0010§\u0001J\u001c\u0010«\u0001\u001a\u00020\u000b2\b\u0010¥\u0001\u001a\u00030¤\u0001H\u0000¢\u0006\u0006\b©\u0001\u0010ª\u0001J\u0011\u0010\u00ad\u0001\u001a\u00020\u000bH\u0000¢\u0006\u0005\b¬\u0001\u0010\u0013J\u001a\u0010°\u0001\u001a\u00020\u000b2\u0007\u0010®\u0001\u001a\u00020\u0018H\u0000¢\u0006\u0005\b¯\u0001\u0010HJ\u001a\u0010³\u0001\u001a\u00020\t2\u0007\u0010±\u0001\u001a\u00020\u0018H\u0000¢\u0006\u0005\b²\u0001\u0010\u001bJu\u0010À\u0001\u001a\u00028\u0000\"\u0004\b\u0000\u0010h2\u0007\u0010´\u0001\u001a\u00028\u00002\u000e\u0010¶\u0001\u001a\t\u0012\u0004\u0012\u00020\u00180µ\u00012\t\b\u0002\u0010·\u0001\u001a\u00020\t2\t\b\u0002\u0010¸\u0001\u001a\u00020\t2,\u0010½\u0001\u001a'\b\u0001\u0012\u0005\u0012\u00030º\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u00028\u00000»\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010¹\u0001¢\u0006\u0003\b¼\u0001H\u0001¢\u0006\u0006\b¾\u0001\u0010¿\u0001JH\u0010Ã\u0001\u001a\u00020\u000b2\u000e\u0010¶\u0001\u001a\t\u0012\u0004\u0012\u00020\u00180µ\u00012\t\b\u0002\u0010·\u0001\u001a\u00020\t2\t\b\u0002\u0010¸\u0001\u001a\u00020\t2\u000e\u0010½\u0001\u001a\t\u0012\u0004\u0012\u00020\u000b0µ\u0001H\u0001¢\u0006\u0006\bÁ\u0001\u0010Â\u0001J\u001b\u0010Ç\u0001\u001a\u00030Ä\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0006\bÅ\u0001\u0010Æ\u0001R*\u0010É\u0001\u001a\u00030È\u00018\u0016@\u0016X\u0096.¢\u0006\u0018\n\u0006\bÉ\u0001\u0010Ê\u0001\u001a\u0006\bË\u0001\u0010Ì\u0001\"\u0006\bÍ\u0001\u0010Î\u0001R\u0019\u0010Ï\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÏ\u0001\u0010Ð\u0001R\u001a\u0010Ò\u0001\u001a\u00030Ñ\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÒ\u0001\u0010Ó\u0001R\u0019\u0010Ô\u0001\u001a\u00020q8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÔ\u0001\u0010Õ\u0001R2\u0010Ö\u0001\u001a\u0004\u0018\u00010\t8\u0000@\u0000X\u0081\u000e¢\u0006\u001f\n\u0006\bÖ\u0001\u0010×\u0001\u0012\u0005\bÜ\u0001\u0010\u0013\u001a\u0006\bØ\u0001\u0010Ù\u0001\"\u0006\bÚ\u0001\u0010Û\u0001R\u0019\u0010Ý\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÝ\u0001\u0010Þ\u0001R1\u0010à\u0001\u001a\u00030ß\u00018\u0000@\u0000X\u0081.¢\u0006\u001f\n\u0006\bà\u0001\u0010á\u0001\u0012\u0005\bæ\u0001\u0010\u0013\u001a\u0006\bâ\u0001\u0010ã\u0001\"\u0006\bä\u0001\u0010å\u0001R1\u0010è\u0001\u001a\u00030ç\u00018\u0000@\u0000X\u0081\u000e¢\u0006\u001f\n\u0006\bè\u0001\u0010é\u0001\u0012\u0005\bî\u0001\u0010\u0013\u001a\u0006\bê\u0001\u0010ë\u0001\"\u0006\bì\u0001\u0010í\u0001R1\u0010ð\u0001\u001a\u00030ï\u00018\u0000@\u0000X\u0081.¢\u0006\u001f\n\u0006\bð\u0001\u0010ñ\u0001\u0012\u0005\bö\u0001\u0010\u0013\u001a\u0006\bò\u0001\u0010ó\u0001\"\u0006\bô\u0001\u0010õ\u0001R1\u0010÷\u0001\u001a\u00030Ä\u00018\u0000@\u0000X\u0081.¢\u0006\u001f\n\u0006\b÷\u0001\u0010ø\u0001\u0012\u0005\bý\u0001\u0010\u0013\u001a\u0006\bù\u0001\u0010ú\u0001\"\u0006\bû\u0001\u0010ü\u0001R1\u0010ÿ\u0001\u001a\u00030þ\u00018\u0000@\u0000X\u0081.¢\u0006\u001f\n\u0006\bÿ\u0001\u0010\u0080\u0002\u0012\u0005\b\u0085\u0002\u0010\u0013\u001a\u0006\b\u0081\u0002\u0010\u0082\u0002\"\u0006\b\u0083\u0002\u0010\u0084\u0002R1\u0010\u0087\u0002\u001a\u00030\u0086\u00028\u0000@\u0000X\u0081.¢\u0006\u001f\n\u0006\b\u0087\u0002\u0010\u0088\u0002\u0012\u0005\b\u008d\u0002\u0010\u0013\u001a\u0006\b\u0089\u0002\u0010\u008a\u0002\"\u0006\b\u008b\u0002\u0010\u008c\u0002R\u0019\u0010\u0090\u0002\u001a\u0004\u0018\u00010]8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008e\u0002\u0010\u008f\u0002R\u0017\u0010\u0093\u0002\u001a\u00020\u00188VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0091\u0002\u0010\u0092\u0002R-\u0010\u0097\u0002\u001a\u0004\u0018\u00010\u00182\t\u0010\u0094\u0002\u001a\u0004\u0018\u00010\u00188V@VX\u0096\u000e¢\u0006\u000f\u001a\u0006\b\u0095\u0002\u0010\u0092\u0002\"\u0005\b\u0096\u0002\u0010H¨\u0006\u0099\u0002"}, d2 = {"Lcom/braze/Braze;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/braze/managers/d0;", "getDeviceDataProvider", "()Lcom/braze/managers/d0;", "", "isOffline", "", "setSyncPolicyOfflineStatus", "(Z)V", "", "throwable", "publishError", "(Ljava/lang/Throwable;)V", "verifyProperSdkSetup", "()V", "Lcom/braze/managers/u0;", "dependencyProvider", "setUserSpecificMemberVariablesAndStartDispatch", "(Lcom/braze/managers/u0;)V", "", "key", "isEphemeralEventKey", "(Ljava/lang/String;)Z", "Landroid/app/Activity;", "activity", "openSession", "(Landroid/app/Activity;)V", "closeSession", "eventName", "Lcom/braze/models/outgoing/BrazeProperties;", "properties", "logCustomEvent", "(Ljava/lang/String;Lcom/braze/models/outgoing/BrazeProperties;)V", "productId", AppsFlyerProperties.CURRENCY_CODE, "Ljava/math/BigDecimal;", com.amazon.a.a.o.b.f11220x, "", "quantity", "logPurchase", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;ILcom/braze/models/outgoing/BrazeProperties;)V", "Landroid/content/Intent;", "intent", "logPushNotificationOpened", "(Landroid/content/Intent;)V", "campaignId", "actionId", "actionType", "logPushNotificationActionClicked", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "pageId", "logPushStoryPageClicked", "(Ljava/lang/String;Ljava/lang/String;)V", "logFeedDisplayed", "requestFeedRefreshFromCache", "requestFeedRefresh", "requestContentCardsRefresh", "requestContentCardsRefreshFromCache", "refreshFeatureFlags", "", "Lcom/braze/models/FeatureFlag;", "getAllFeatureFlags", "()Ljava/util/List;", "id", "getFeatureFlag", "(Ljava/lang/String;)Lcom/braze/models/FeatureFlag;", "logFeatureFlagImpression", "(Ljava/lang/String;)V", "ids", "requestBannersRefresh", "(Ljava/util/List;)V", "Lcom/braze/events/IValueCallback;", "Lcom/braze/events/BannersUpdatedEvent;", "completionCallback", "(Ljava/util/List;Lcom/braze/events/IValueCallback;)V", "Lcom/braze/models/Banner;", "getBanner", "(Ljava/lang/String;)Lcom/braze/models/Banner;", "placementId", "logBannerImpression", "buttonId", "logBannerClick", "requestImmediateDataFlush", "Lcom/braze/events/IEventSubscriber;", "Lcom/braze/events/InAppMessageEvent;", "subscriber", "subscribeToNewInAppMessages", "(Lcom/braze/events/IEventSubscriber;)V", "Lcom/braze/events/ContentCardsUpdatedEvent;", "subscribeToContentCardsUpdates", "Lcom/braze/events/FeatureFlagsUpdatedEvent;", "subscribeToFeatureFlagsUpdates", "subscribeToBannersUpdates", "Lcom/braze/events/FeedUpdatedEvent;", "subscribeToFeedUpdates", "Lcom/braze/events/BrazeSdkAuthenticationErrorEvent;", "subscribeToSdkAuthenticationFailures", "Lcom/braze/events/BrazePushEvent;", "subscribeToPushNotificationEvents", "T", "Ljava/lang/Class;", "eventClass", "addSingleSynchronousSubscription", "(Lcom/braze/events/IEventSubscriber;Ljava/lang/Class;)V", "removeSingleSubscription", "userId", "changeUser", "sdkAuthSignature", "Lcom/braze/BrazeUser;", "getCurrentUser", "(Lcom/braze/events/IValueCallback;)V", "Lcom/braze/models/cards/Card;", "getCachedContentCards", "contentCardString", "deserializeContentCard", "(Ljava/lang/String;)Lcom/braze/models/cards/Card;", "Lorg/json/JSONObject;", "contentCardJson", "(Lorg/json/JSONObject;)Lcom/braze/models/cards/Card;", "inAppMessageString", "Lcom/braze/models/inappmessage/IInAppMessage;", "deserializeInAppMessageString", "(Ljava/lang/String;)Lcom/braze/models/inappmessage/IInAppMessage;", "requestLocationInitialization", "googleAdvertisingId", "isLimitAdTrackingEnabled", "setGoogleAdvertisingId", "(Ljava/lang/String;Z)V", "signature", "setSdkAuthenticationSignature", "ignoreRateLimit", "requestGeofenceRefresh$android_sdk_base_release", "requestGeofenceRefresh", "serializedCardJson", "addSerializedCardJsonToStorage$android_sdk_base_release", "addSerializedCardJsonToStorage", "requestGeofencesInitialization$android_sdk_base_release", "requestGeofencesInitialization", "requestSingleLocationUpdate$android_sdk_base_release", "requestSingleLocationUpdate", "handleInAppMessageTestPush$android_sdk_base_release", "handleInAppMessageTestPush", "handleInternalBannerRefresh$android_sdk_base_release", "handleInternalBannerRefresh", "applyPendingRuntimeConfiguration$android_sdk_base_release", "applyPendingRuntimeConfiguration", "event", "retryInAppMessage$android_sdk_base_release", "(Lcom/braze/events/InAppMessageEvent;)V", "retryInAppMessage", "reenqueueInAppMessage$android_sdk_base_release", "reenqueueInAppMessage", "Lcom/braze/enums/BrazePushEventType;", "pushActionType", "Lcom/braze/models/push/BrazeNotificationPayload;", "payload", "publishBrazePushAction$android_sdk_base_release", "(Lcom/braze/enums/BrazePushEventType;Lcom/braze/models/push/BrazeNotificationPayload;)V", "publishBrazePushAction", "", "timeInMs", "logPushDelivery$android_sdk_base_release", "(Ljava/lang/String;J)V", "logPushDelivery", "schedulePushDelivery$android_sdk_base_release", "(J)V", "schedulePushDelivery", "performPushDeliveryFlush$android_sdk_base_release", "performPushDeliveryFlush", "campaign", "logPushMaxCampaign$android_sdk_base_release", "logPushMaxCampaign", "pushId", "validateAndStorePushId$android_sdk_base_release", "validateAndStorePushId", "defaultValueOnException", "Lkotlin/Function0;", "errorLog", "earlyReturnIfDisabled", "earlyReturnIfUdmUninitialized", "Lkotlin/Function2;", "Lga/J;", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "block", "runForResult$android_sdk_base_release", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;ZZLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "runForResult", "run$android_sdk_base_release", "(Lkotlin/jvm/functions/Function0;ZZLkotlin/jvm/functions/Function0;)V", "run", "Lcom/braze/configuration/BrazeConfigurationProvider;", "getConfigurationProviderSafe$android_sdk_base_release", "(Landroid/content/Context;)Lcom/braze/configuration/BrazeConfigurationProvider;", "getConfigurationProviderSafe", "Lcom/braze/images/IBrazeImageLoader;", "imageLoader", "Lcom/braze/images/IBrazeImageLoader;", "getImageLoader", "()Lcom/braze/images/IBrazeImageLoader;", "setImageLoader", "(Lcom/braze/images/IBrazeImageLoader;)V", "applicationContext", "Landroid/content/Context;", "Lcom/braze/configuration/e;", "offlineUserStorageProvider", "Lcom/braze/configuration/e;", "brazeUser", "Lcom/braze/BrazeUser;", "isApiKeyPresent", "Ljava/lang/Boolean;", "isApiKeyPresent$android_sdk_base_release", "()Ljava/lang/Boolean;", "setApiKeyPresent$android_sdk_base_release", "(Ljava/lang/Boolean;)V", "isApiKeyPresent$android_sdk_base_release$annotations", "isInstanceStopped", "Z", "Lcom/braze/managers/e0;", "deviceIdProvider", "Lcom/braze/managers/e0;", "getDeviceIdProvider$android_sdk_base_release", "()Lcom/braze/managers/e0;", "setDeviceIdProvider$android_sdk_base_release", "(Lcom/braze/managers/e0;)V", "getDeviceIdProvider$android_sdk_base_release$annotations", "Lcom/braze/events/e;", "externalIEventMessenger", "Lcom/braze/events/e;", "getExternalIEventMessenger$android_sdk_base_release", "()Lcom/braze/events/e;", "setExternalIEventMessenger$android_sdk_base_release", "(Lcom/braze/events/e;)V", "getExternalIEventMessenger$android_sdk_base_release$annotations", "Lcom/braze/managers/g0;", "registrationDataProvider", "Lcom/braze/managers/g0;", "getRegistrationDataProvider$android_sdk_base_release", "()Lcom/braze/managers/g0;", "setRegistrationDataProvider$android_sdk_base_release", "(Lcom/braze/managers/g0;)V", "getRegistrationDataProvider$android_sdk_base_release$annotations", "configurationProvider", "Lcom/braze/configuration/BrazeConfigurationProvider;", "getConfigurationProvider$android_sdk_base_release", "()Lcom/braze/configuration/BrazeConfigurationProvider;", "setConfigurationProvider$android_sdk_base_release", "(Lcom/braze/configuration/BrazeConfigurationProvider;)V", "getConfigurationProvider$android_sdk_base_release$annotations", "Lcom/braze/managers/i0;", "pushDeliveryManager", "Lcom/braze/managers/i0;", "getPushDeliveryManager$android_sdk_base_release", "()Lcom/braze/managers/i0;", "setPushDeliveryManager$android_sdk_base_release", "(Lcom/braze/managers/i0;)V", "getPushDeliveryManager$android_sdk_base_release$annotations", "Lcom/braze/managers/h0;", "udm", "Lcom/braze/managers/h0;", "getUdm$android_sdk_base_release", "()Lcom/braze/managers/h0;", "setUdm$android_sdk_base_release", "(Lcom/braze/managers/h0;)V", "getUdm$android_sdk_base_release$annotations", "getCachedContentCardsUpdatedEvent", "()Lcom/braze/events/ContentCardsUpdatedEvent;", "cachedContentCardsUpdatedEvent", "getDeviceId", "()Ljava/lang/String;", "deviceId", com.amazon.a.a.o.b.f11195Y, "getRegisteredPushToken", "setRegisteredPushToken", "registeredPushToken", "Companion", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class Braze {
    private static boolean areOutboundNetworkRequestsOffline;
    private static IBrazeNotificationFactory customBrazeNotificationFactory;
    private static com.braze.managers.d0 deviceDataProvider;
    private static IBrazeEndpointProvider endpointProvider;
    private static volatile Braze instance;
    private static a0 sdkEnablementProvider;
    private static boolean shouldMockNetworkRequestsAndDropEvents;
    private static e staticExternalIEventMessenger;
    private Context applicationContext;
    private BrazeUser brazeUser;
    public BrazeConfigurationProvider configurationProvider;
    public com.braze.managers.e0 deviceIdProvider;
    private e externalIEventMessenger;
    public IBrazeImageLoader imageLoader;
    private Boolean isApiKeyPresent;
    private boolean isInstanceStopped;
    private com.braze.configuration.e offlineUserStorageProvider;
    public com.braze.managers.i0 pushDeliveryManager;
    public com.braze.managers.g0 registrationDataProvider;
    public com.braze.managers.h0 udm;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ReentrantLock brazeClassLock = new ReentrantLock();
    private static final Set<String> KNOWN_APP_CRAWLER_DEVICE_MODELS = SetsKt.setOf("calypso appcrawler");
    private static final Set<String> NECESSARY_BRAZE_SDK_PERMISSIONS = SetsKt.setOf(new String[]{"android.permission.ACCESS_NETWORK_STATE", "android.permission.INTERNET"});
    private static final ReentrantLock endpointProviderLock = new ReentrantLock();
    private static boolean shouldRequestFrameworkListenToNetworkUpdates = true;
    private static final List<BrazeConfig> pendingConfigurations = new ArrayList();
    private static final BrazeConfig clearConfigSentinel = new BrazeConfig.Builder().build();

    @Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\n\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\tH\u0007¢\u0006\u0004\b\u001d\u0010\u000bJ\u0017\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b \u0010\u001fJ\u0017\u0010!\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b!\u0010\u001fJ\u0019\u0010%\u001a\u00020\u00162\b\u0010\"\u001a\u0004\u0018\u00010\u0011H\u0001¢\u0006\u0004\b#\u0010$J\u001f\u0010,\u001a\u00020\u00162\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0001¢\u0006\u0004\b*\u0010+J\u0017\u00100\u001a\u00020\u00162\u0006\u0010-\u001a\u00020\tH\u0001¢\u0006\u0004\b.\u0010/R*\u00101\u001a\u0004\u0018\u00010\u00068\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b1\u00102\u0012\u0004\b7\u0010\u0003\u001a\u0004\b3\u00104\"\u0004\b5\u00106R*\u00109\u001a\u0004\u0018\u0001088\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b9\u0010:\u0012\u0004\b?\u0010\u0003\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R*\u0010A\u001a\u0004\u0018\u00010@8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bA\u0010B\u0012\u0004\bG\u0010\u0003\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR*\u0010L\u001a\u00020\t2\u0006\u0010H\u001a\u00020\t8F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\bK\u0010\u0003\u001a\u0004\bI\u0010\u000b\"\u0004\bJ\u0010/R\u001a\u0010M\u001a\u00020\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\bN\u0010\u0003\u001a\u0004\bM\u0010\u000bR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00110R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00110R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010TR\u0018\u0010V\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010X\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010QR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010YR\u0016\u0010Z\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010\\\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010[R\u001a\u0010_\u001a\b\u0012\u0004\u0012\u00020^0]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010a\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010b¨\u0006c"}, d2 = {"Lcom/braze/Braze$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/braze/storage/a0;", "getSdkEnablementProvider", "(Landroid/content/Context;)Lcom/braze/storage/a0;", "", "shouldAllowSingletonInitialization", "()Z", "Lcom/braze/Braze;", "getInstance", "(Landroid/content/Context;)Lcom/braze/Braze;", "Lcom/braze/configuration/BrazeConfigurationProvider;", "configurationProvider", "", "getConfiguredApiKey", "(Lcom/braze/configuration/BrazeConfigurationProvider;)Ljava/lang/String;", "Lcom/braze/IBrazeEndpointProvider;", "endpointProvider", "", "setEndpointProvider", "(Lcom/braze/IBrazeEndpointProvider;)V", "Landroid/net/Uri;", "brazeEndpoint", "getApiEndpoint", "(Landroid/net/Uri;)Landroid/net/Uri;", "enableMockNetworkRequestsAndDropEventsMode", "disableSdk", "(Landroid/content/Context;)V", "enableSdk", "wipeData", "configuredCustomEndpoint", "setConfiguredCustomEndpoint$android_sdk_base_release", "(Ljava/lang/String;)V", "setConfiguredCustomEndpoint", "Landroid/content/Intent;", "intent", "Lcom/braze/managers/c0;", "brazeManager", "requestTriggersIfInAppMessageTestPush$android_sdk_base_release", "(Landroid/content/Intent;Lcom/braze/managers/c0;)V", "requestTriggersIfInAppMessageTestPush", "clearStorage", "stopInstance$android_sdk_base_release", "(Z)V", "stopInstance", "sdkEnablementProvider", "Lcom/braze/storage/a0;", "getSdkEnablementProvider$android_sdk_base_release", "()Lcom/braze/storage/a0;", "setSdkEnablementProvider$android_sdk_base_release", "(Lcom/braze/storage/a0;)V", "getSdkEnablementProvider$android_sdk_base_release$annotations", "Lcom/braze/IBrazeNotificationFactory;", "customBrazeNotificationFactory", "Lcom/braze/IBrazeNotificationFactory;", "getCustomBrazeNotificationFactory", "()Lcom/braze/IBrazeNotificationFactory;", "setCustomBrazeNotificationFactory", "(Lcom/braze/IBrazeNotificationFactory;)V", "getCustomBrazeNotificationFactory$annotations", "Lcom/braze/events/e;", "staticExternalIEventMessenger", "Lcom/braze/events/e;", "getStaticExternalIEventMessenger$android_sdk_base_release", "()Lcom/braze/events/e;", "setStaticExternalIEventMessenger$android_sdk_base_release", "(Lcom/braze/events/e;)V", "getStaticExternalIEventMessenger$android_sdk_base_release$annotations", "isOffline", "getOutboundNetworkRequestsOffline", "setOutboundNetworkRequestsOffline", "getOutboundNetworkRequestsOffline$annotations", "outboundNetworkRequestsOffline", "isDisabled", "isDisabled$annotations", "Ljava/util/concurrent/locks/ReentrantLock;", "brazeClassLock", "Ljava/util/concurrent/locks/ReentrantLock;", "", "KNOWN_APP_CRAWLER_DEVICE_MODELS", "Ljava/util/Set;", "NECESSARY_BRAZE_SDK_PERMISSIONS", "instance", "Lcom/braze/Braze;", "endpointProviderLock", "Lcom/braze/IBrazeEndpointProvider;", "shouldMockNetworkRequestsAndDropEvents", "Z", "areOutboundNetworkRequestsOffline", "", "Lcom/braze/configuration/BrazeConfig;", "pendingConfigurations", "Ljava/util/List;", "clearConfigSentinel", "Lcom/braze/configuration/BrazeConfig;", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String _get_isDisabled_$lambda$2() {
            return "SDK enablement provider was null. Returning SDK as enabled.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String _get_isDisabled_$lambda$3() {
            return "API key not present. Actions will not be performed on the SDK.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String _get_isDisabled_$lambda$4() {
            return "SDK is disabled. Actions will not be performed on the SDK.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String _set_outboundNetworkRequestsOffline_$lambda$0(boolean z6) {
            return "Braze SDK outbound network requests are now ".concat(z6 ? "disabled" : "enabled");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String disableSdk$lambda$23() {
            return "Stopping the SDK instance.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String disableSdk$lambda$24() {
            return "Disabling all network requests";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String enableMockNetworkRequestsAndDropEventsMode$lambda$21$lambda$19() {
            return "Braze network requests already being mocked. Note that events dispatched in this mode are dropped.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String enableMockNetworkRequestsAndDropEventsMode$lambda$21$lambda$20() {
            return "Braze network requests will be mocked. Events dispatchedin this mode will be dropped.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String enableMockNetworkRequestsAndDropEventsMode$lambda$22() {
            return "Attempt to enable mocking Braze network requests had no effect since getInstance() has already been called.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String enableSdk$lambda$25() {
            return "Setting SDK to enabled.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String enableSdk$lambda$26() {
            return "Enabling all network requests";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getApiEndpoint$lambda$12$lambda$11$lambda$10() {
            return "Caught exception trying to get a Braze API endpoint from the BrazeEndpointProvider. Using the original URI";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getConfiguredApiKey$lambda$7() {
            return "Caught exception while retrieving API key.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getInstance$lambda$6$lambda$5() {
            return "Created external messenger " + Braze.INSTANCE.getStaticExternalIEventMessenger$android_sdk_base_release();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final a0 getSdkEnablementProvider(Context context) {
            a0 sdkEnablementProvider$android_sdk_base_release = getSdkEnablementProvider$android_sdk_base_release();
            if (sdkEnablementProvider$android_sdk_base_release != null) {
                return sdkEnablementProvider$android_sdk_base_release;
            }
            a0 a0Var = new a0(context);
            setSdkEnablementProvider$android_sdk_base_release(a0Var);
            return a0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String requestTriggersIfInAppMessageTestPush$lambda$37() {
            return "Push contained key for fetching test triggers, fetching triggers.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Uri setConfiguredCustomEndpoint$lambda$33$lambda$32(String str, Uri brazeEndpoint) {
            String authority;
            Intrinsics.checkNotNullParameter(brazeEndpoint, "brazeEndpoint");
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            boolean z6 = scheme == null || StringsKt.isBlank(scheme) || (authority = parse.getAuthority()) == null || StringsKt.isBlank(authority);
            Uri.Builder builder = new Uri.Builder();
            if (z6) {
                builder.scheme(brazeEndpoint.getScheme());
            } else if (parse.getScheme() != null) {
                builder.scheme(parse.getScheme());
            } else {
                builder.scheme(brazeEndpoint.getScheme());
            }
            if (z6) {
                builder.encodedAuthority(str);
            } else if (parse.getEncodedAuthority() != null) {
                builder.encodedAuthority(parse.getEncodedAuthority());
            } else {
                builder.encodedAuthority(brazeEndpoint.getEncodedAuthority());
            }
            if (z6) {
                builder.path(brazeEndpoint.getPath());
            } else if (parse.getPath() != null) {
                builder.path(parse.getPath() + brazeEndpoint.getPath());
            } else {
                builder.path(brazeEndpoint.getPath());
            }
            return builder.build();
        }

        private final boolean shouldAllowSingletonInitialization() {
            Braze braze = Braze.instance;
            if (braze == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: N3.F2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String shouldAllowSingletonInitialization$lambda$34;
                        shouldAllowSingletonInitialization$lambda$34 = Braze.Companion.shouldAllowSingletonInitialization$lambda$34();
                        return shouldAllowSingletonInitialization$lambda$34;
                    }
                }, 6, (Object) null);
                return true;
            }
            if (braze.isInstanceStopped) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: N3.N2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String shouldAllowSingletonInitialization$lambda$35;
                        shouldAllowSingletonInitialization$lambda$35 = Braze.Companion.shouldAllowSingletonInitialization$lambda$35();
                        return shouldAllowSingletonInitialization$lambda$35;
                    }
                }, 7, (Object) null);
                return true;
            }
            if (!Intrinsics.areEqual(Boolean.FALSE, braze.getIsApiKeyPresent())) {
                return false;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: N3.O2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String shouldAllowSingletonInitialization$lambda$36;
                    shouldAllowSingletonInitialization$lambda$36 = Braze.Companion.shouldAllowSingletonInitialization$lambda$36();
                    return shouldAllowSingletonInitialization$lambda$36;
                }
            }, 7, (Object) null);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String shouldAllowSingletonInitialization$lambda$34() {
            return "The instance is null. Allowing instance initialization";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String shouldAllowSingletonInitialization$lambda$35() {
            return "The instance was stopped. Allowing instance initialization";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String shouldAllowSingletonInitialization$lambda$36() {
            return "No API key was found previously. Allowing instance initialization";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String stopInstance$lambda$38() {
            return "Shutting down all queued work on the Braze SDK";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String stopInstance$lambda$41$lambda$39() {
            return "Sending sdk data wipe event to external subscribers";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String stopInstance$lambda$41$lambda$40() {
            return "Shutting down the singleton work queue";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String stopInstance$lambda$42() {
            return "Failed to shutdown queued work on the Braze SDK.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String wipeData$lambda$27() {
            return "Failed to delete data from the internal storage cache.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean wipeData$lambda$28(File file, String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            if (!StringsKt.startsWith$default(name, "com.appboy", false, 2, (Object) null) || Intrinsics.areEqual(name, "com.appboy.override.configuration.cache")) {
                return StringsKt.startsWith$default(name, "com.braze", false, 2, (Object) null) && !Intrinsics.areEqual(name, "com.braze.override.configuration.cache");
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String wipeData$lambda$30$lambda$29(File file) {
            return "Deleting shared prefs file at: " + file.getAbsolutePath();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String wipeData$lambda$31() {
            return "Failed to delete shared preference data for the Braze SDK.";
        }

        @JvmStatic
        public final void disableSdk(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            getSdkEnablementProvider(context).b(true);
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.Priority priority = BrazeLogger.Priority.f12984W;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: N3.z2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String disableSdk$lambda$23;
                    disableSdk$lambda$23 = Braze.Companion.disableSdk$lambda$23();
                    return disableSdk$lambda$23;
                }
            }, 6, (Object) null);
            stopInstance$android_sdk_base_release(false);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: N3.A2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String disableSdk$lambda$24;
                    disableSdk$lambda$24 = Braze.Companion.disableSdk$lambda$24();
                    return disableSdk$lambda$24;
                }
            }, 6, (Object) null);
            setOutboundNetworkRequestsOffline(true);
        }

        @JvmStatic
        public final boolean enableMockNetworkRequestsAndDropEventsMode() {
            if (Braze.instance == null) {
                ReentrantLock reentrantLock = Braze.brazeClassLock;
                reentrantLock.lock();
                try {
                    if (Braze.instance == null) {
                        if (Braze.shouldMockNetworkRequestsAndDropEvents) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) Braze.INSTANCE, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: N3.Q2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    String enableMockNetworkRequestsAndDropEventsMode$lambda$21$lambda$19;
                                    enableMockNetworkRequestsAndDropEventsMode$lambda$21$lambda$19 = Braze.Companion.enableMockNetworkRequestsAndDropEventsMode$lambda$21$lambda$19();
                                    return enableMockNetworkRequestsAndDropEventsMode$lambda$21$lambda$19;
                                }
                            }, 6, (Object) null);
                        } else {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) Braze.INSTANCE, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: N3.R2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    String enableMockNetworkRequestsAndDropEventsMode$lambda$21$lambda$20;
                                    enableMockNetworkRequestsAndDropEventsMode$lambda$21$lambda$20 = Braze.Companion.enableMockNetworkRequestsAndDropEventsMode$lambda$21$lambda$20();
                                    return enableMockNetworkRequestsAndDropEventsMode$lambda$21$lambda$20;
                                }
                            }, 6, (Object) null);
                            Braze.shouldMockNetworkRequestsAndDropEvents = true;
                        }
                        reentrantLock.unlock();
                        return true;
                    }
                    Unit unit = Unit.INSTANCE;
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: N3.S2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String enableMockNetworkRequestsAndDropEventsMode$lambda$22;
                    enableMockNetworkRequestsAndDropEventsMode$lambda$22 = Braze.Companion.enableMockNetworkRequestsAndDropEventsMode$lambda$22();
                    return enableMockNetworkRequestsAndDropEventsMode$lambda$22;
                }
            }, 6, (Object) null);
            return false;
        }

        @JvmStatic
        public final void enableSdk(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.Priority priority = BrazeLogger.Priority.f12984W;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: N3.x2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String enableSdk$lambda$25;
                    enableSdk$lambda$25 = Braze.Companion.enableSdk$lambda$25();
                    return enableSdk$lambda$25;
                }
            }, 6, (Object) null);
            getSdkEnablementProvider(context).b(false);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: N3.y2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String enableSdk$lambda$26;
                    enableSdk$lambda$26 = Braze.Companion.enableSdk$lambda$26();
                    return enableSdk$lambda$26;
                }
            }, 6, (Object) null);
            setOutboundNetworkRequestsOffline(false);
        }

        @JvmStatic
        public final Uri getApiEndpoint(Uri brazeEndpoint) {
            Intrinsics.checkNotNullParameter(brazeEndpoint, "brazeEndpoint");
            ReentrantLock reentrantLock = Braze.endpointProviderLock;
            reentrantLock.lock();
            try {
                IBrazeEndpointProvider iBrazeEndpointProvider = Braze.endpointProvider;
                if (iBrazeEndpointProvider != null) {
                    try {
                        Uri apiEndpoint = iBrazeEndpointProvider.getApiEndpoint(brazeEndpoint);
                        if (apiEndpoint != null) {
                            reentrantLock.unlock();
                            return apiEndpoint;
                        }
                    } catch (Exception e6) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) Braze.INSTANCE, BrazeLogger.Priority.f12984W, (Throwable) e6, false, new Function0() { // from class: N3.L2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                String apiEndpoint$lambda$12$lambda$11$lambda$10;
                                apiEndpoint$lambda$12$lambda$11$lambda$10 = Braze.Companion.getApiEndpoint$lambda$12$lambda$11$lambda$10();
                                return apiEndpoint$lambda$12$lambda$11$lambda$10;
                            }
                        }, 4, (Object) null);
                    }
                }
                reentrantLock.unlock();
                return brazeEndpoint;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }

        @JvmStatic
        public final String getConfiguredApiKey(BrazeConfigurationProvider configurationProvider) {
            Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
            try {
                return configurationProvider.getBrazeApiKey().f12604a;
            } catch (Exception e6) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: N3.P2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String configuredApiKey$lambda$7;
                        configuredApiKey$lambda$7 = Braze.Companion.getConfiguredApiKey$lambda$7();
                        return configuredApiKey$lambda$7;
                    }
                }, 4, (Object) null);
                return null;
            }
        }

        public final IBrazeNotificationFactory getCustomBrazeNotificationFactory() {
            return Braze.customBrazeNotificationFactory;
        }

        @JvmStatic
        public final Braze getInstance(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (shouldAllowSingletonInitialization()) {
                ReentrantLock reentrantLock = Braze.brazeClassLock;
                reentrantLock.lock();
                try {
                    Companion companion = Braze.INSTANCE;
                    if (companion.shouldAllowSingletonInitialization()) {
                        if (companion.getStaticExternalIEventMessenger$android_sdk_base_release() == null) {
                            companion.setStaticExternalIEventMessenger$android_sdk_base_release(new com.braze.events.d(new a0(context), false));
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) companion, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: N3.u2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    String instance$lambda$6$lambda$5;
                                    instance$lambda$6$lambda$5 = Braze.Companion.getInstance$lambda$6$lambda$5();
                                    return instance$lambda$6$lambda$5;
                                }
                            }, 6, (Object) null);
                        }
                        Braze braze = new Braze(context);
                        braze.isInstanceStopped = false;
                        Braze.instance = braze;
                        reentrantLock.unlock();
                        return braze;
                    }
                    Unit unit = Unit.INSTANCE;
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            Braze braze2 = Braze.instance;
            Intrinsics.checkNotNull(braze2, "null cannot be cast to non-null type com.braze.Braze");
            return braze2;
        }

        public final boolean getOutboundNetworkRequestsOffline() {
            return Braze.areOutboundNetworkRequestsOffline;
        }

        public final a0 getSdkEnablementProvider$android_sdk_base_release() {
            return Braze.sdkEnablementProvider;
        }

        public final e getStaticExternalIEventMessenger$android_sdk_base_release() {
            return Braze.staticExternalIEventMessenger;
        }

        public final boolean isDisabled() {
            a0 sdkEnablementProvider$android_sdk_base_release = getSdkEnablementProvider$android_sdk_base_release();
            if (sdkEnablementProvider$android_sdk_base_release == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: N3.I2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String _get_isDisabled_$lambda$2;
                        _get_isDisabled_$lambda$2 = Braze.Companion._get_isDisabled_$lambda$2();
                        return _get_isDisabled_$lambda$2;
                    }
                }, 7, (Object) null);
                return false;
            }
            Braze braze = Braze.instance;
            if (braze != null && Intrinsics.areEqual(Boolean.FALSE, braze.getIsApiKeyPresent())) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: N3.J2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String _get_isDisabled_$lambda$3;
                        _get_isDisabled_$lambda$3 = Braze.Companion._get_isDisabled_$lambda$3();
                        return _get_isDisabled_$lambda$3;
                    }
                }, 6, (Object) null);
                return true;
            }
            boolean z6 = sdkEnablementProvider$android_sdk_base_release.f12895a.getBoolean("appboy_sdk_disabled", false);
            if (z6) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: N3.K2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String _get_isDisabled_$lambda$4;
                        _get_isDisabled_$lambda$4 = Braze.Companion._get_isDisabled_$lambda$4();
                        return _get_isDisabled_$lambda$4;
                    }
                }, 6, (Object) null);
            }
            return z6;
        }

        public final void requestTriggersIfInAppMessageTestPush$android_sdk_base_release(Intent intent, com.braze.managers.c0 brazeManager) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
            String stringExtra = intent.getStringExtra("ab_push_fetch_test_triggers_key");
            if (stringExtra == null || !Intrinsics.areEqual(stringExtra, com.amazon.a.a.o.b.af)) {
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: N3.M2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String requestTriggersIfInAppMessageTestPush$lambda$37;
                    requestTriggersIfInAppMessageTestPush$lambda$37 = Braze.Companion.requestTriggersIfInAppMessageTestPush$lambda$37();
                    return requestTriggersIfInAppMessageTestPush$lambda$37;
                }
            }, 6, (Object) null);
            com.braze.models.outgoing.j jVar = new com.braze.models.outgoing.j();
            jVar.f12635c = Boolean.TRUE;
            ((com.braze.managers.m) brazeManager).a(jVar);
        }

        public final void setConfiguredCustomEndpoint$android_sdk_base_release(final String configuredCustomEndpoint) {
            ReentrantLock reentrantLock = Braze.endpointProviderLock;
            reentrantLock.lock();
            try {
                Braze.INSTANCE.setEndpointProvider(new IBrazeEndpointProvider() { // from class: N3.B2
                    @Override // com.braze.IBrazeEndpointProvider
                    public final Uri getApiEndpoint(Uri uri) {
                        Uri configuredCustomEndpoint$lambda$33$lambda$32;
                        configuredCustomEndpoint$lambda$33$lambda$32 = Braze.Companion.setConfiguredCustomEndpoint$lambda$33$lambda$32(configuredCustomEndpoint, uri);
                        return configuredCustomEndpoint$lambda$33$lambda$32;
                    }
                });
                Unit unit = Unit.INSTANCE;
            } finally {
                reentrantLock.unlock();
            }
        }

        @JvmStatic
        public final void setEndpointProvider(IBrazeEndpointProvider endpointProvider) {
            ReentrantLock reentrantLock = Braze.endpointProviderLock;
            reentrantLock.lock();
            try {
                Braze.endpointProvider = endpointProvider;
                Unit unit = Unit.INSTANCE;
            } finally {
                reentrantLock.unlock();
            }
        }

        public final void setOutboundNetworkRequestsOffline(final boolean z6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: N3.H2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String _set_outboundNetworkRequestsOffline_$lambda$0;
                    _set_outboundNetworkRequestsOffline_$lambda$0 = Braze.Companion._set_outboundNetworkRequestsOffline_$lambda$0(z6);
                    return _set_outboundNetworkRequestsOffline_$lambda$0;
                }
            }, 6, (Object) null);
            ReentrantLock reentrantLock = Braze.brazeClassLock;
            reentrantLock.lock();
            try {
                Braze.areOutboundNetworkRequestsOffline = z6;
                Braze braze = Braze.instance;
                if (braze != null) {
                    braze.setSyncPolicyOfflineStatus(z6);
                    Unit unit = Unit.INSTANCE;
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }

        public final void setSdkEnablementProvider$android_sdk_base_release(a0 a0Var) {
            Braze.sdkEnablementProvider = a0Var;
        }

        public final void setStaticExternalIEventMessenger$android_sdk_base_release(e eVar) {
            Braze.staticExternalIEventMessenger = eVar;
        }

        public final void stopInstance$android_sdk_base_release(boolean clearStorage) {
            try {
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: N3.C2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String stopInstance$lambda$38;
                        stopInstance$lambda$38 = Braze.Companion.stopInstance$lambda$38();
                        return stopInstance$lambda$38;
                    }
                }, 6, (Object) null);
                ReentrantLock reentrantLock = Braze.brazeClassLock;
                reentrantLock.lock();
                try {
                    BrazeCoroutineScope.cancelChildren();
                    Braze braze = Braze.instance;
                    if (braze != null) {
                        Companion companion = Braze.INSTANCE;
                        BrazeLogger.brazelog$default(brazeLogger, (Object) companion, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: N3.D2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                String stopInstance$lambda$41$lambda$39;
                                stopInstance$lambda$41$lambda$39 = Braze.Companion.stopInstance$lambda$41$lambda$39();
                                return stopInstance$lambda$41$lambda$39;
                            }
                        }, 6, (Object) null);
                        ((com.braze.events.d) braze.getExternalIEventMessenger()).b(new SdkDataWipeEvent(), SdkDataWipeEvent.class);
                        BrazeLogger.brazelog$default(brazeLogger, (Object) companion, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: N3.E2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                String stopInstance$lambda$41$lambda$40;
                                stopInstance$lambda$41$lambda$40 = Braze.Companion.stopInstance$lambda$41$lambda$40();
                                return stopInstance$lambda$41$lambda$40;
                            }
                        }, 7, (Object) null);
                        com.braze.coroutine.f.f12131a.a();
                        if (braze.udm != null) {
                            if (clearStorage) {
                                ((u0) braze.getUdm$android_sdk_base_release()).f12532C.a();
                                ((u0) braze.getUdm$android_sdk_base_release()).f12561z.a();
                                ((u0) braze.getUdm$android_sdk_base_release()).f12530A.a();
                            }
                            com.braze.dispatch.f fVar = ((u0) braze.getUdm$android_sdk_base_release()).f12551p;
                            synchronized (fVar) {
                                fVar.f12160l = true;
                                fVar.b();
                                fVar.f();
                            }
                            z zVar = ((u0) braze.getUdm$android_sdk_base_release()).f12553r;
                            zVar.f12571b = true;
                            zVar.f12570a.f12963c = true;
                            ((u0) braze.getUdm$android_sdk_base_release()).f12559x.unregisterGeofences();
                        }
                        braze.isInstanceStopped = true;
                    }
                    Unit unit = Unit.INSTANCE;
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (Exception e6) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) e6, false, new Function0() { // from class: N3.G2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String stopInstance$lambda$42;
                        stopInstance$lambda$42 = Braze.Companion.stopInstance$lambda$42();
                        return stopInstance$lambda$42;
                    }
                }, 4, (Object) null);
            }
        }

        @JvmStatic
        public final void wipeData(Context context) {
            File[] listFiles;
            List<File> asList;
            Intrinsics.checkNotNullParameter(context, "context");
            stopInstance$android_sdk_base_release(true);
            try {
                com.braze.triggers.managers.b.f13073e.a(context);
                DefaultBrazeImageLoader.Companion.a(context);
            } catch (Exception e6) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) e6, false, new Function0() { // from class: N3.T2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String wipeData$lambda$27;
                        wipeData$lambda$27 = Braze.Companion.wipeData$lambda$27();
                        return wipeData$lambda$27;
                    }
                }, 4, (Object) null);
            }
            try {
                File file = new File(context.getApplicationInfo().dataDir, "shared_prefs");
                if (!file.exists() || !file.isDirectory() || (listFiles = file.listFiles(new FilenameFilter() { // from class: N3.U2
                    @Override // java.io.FilenameFilter
                    public final boolean accept(File file2, String str) {
                        boolean wipeData$lambda$28;
                        wipeData$lambda$28 = Braze.Companion.wipeData$lambda$28(file2, str);
                        return wipeData$lambda$28;
                    }
                })) == null || (asList = ArraysKt.asList(listFiles)) == null) {
                    return;
                }
                for (final File file2 : asList) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) Braze.INSTANCE, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: N3.v2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String wipeData$lambda$30$lambda$29;
                            wipeData$lambda$30$lambda$29 = Braze.Companion.wipeData$lambda$30$lambda$29(file2);
                            return wipeData$lambda$30$lambda$29;
                        }
                    }, 6, (Object) null);
                    Intrinsics.checkNotNull(file2);
                    BrazeFileUtils.deleteSharedPreferencesFile(context, file2);
                }
            } catch (Exception e7) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) e7, false, new Function0() { // from class: N3.w2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String wipeData$lambda$31;
                        wipeData$lambda$31 = Braze.Companion.wipeData$lambda$31();
                        return wipeData$lambda$31;
                    }
                }, 4, (Object) null);
            }
        }

        private Companion() {
        }
    }

    public Braze(final Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        final long nanoTime = System.nanoTime();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: N3.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String _init_$lambda$0;
                _init_$lambda$0 = Braze._init_$lambda$0();
                return _init_$lambda$0;
            }
        }, 7, (Object) null);
        this.applicationContext = context.getApplicationContext();
        final String str = Build.MODEL;
        if (str != null) {
            Set<String> set = KNOWN_APP_CRAWLER_DEVICE_MODELS;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (set.contains(lowerCase)) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: N3.J0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Braze.s(str);
                    }
                }, 6, (Object) null);
                INSTANCE.enableMockNetworkRequestsAndDropEventsMode();
            }
        }
        setImageLoader(new DefaultBrazeImageLoader(this.applicationContext));
        e eVar = staticExternalIEventMessenger;
        this.externalIEventMessenger = eVar == null ? new com.braze.events.d(new a0(this.applicationContext), false) : eVar;
        run$android_sdk_base_release(new Function0() { // from class: N3.U0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String _init_$lambda$3;
                _init_$lambda$3 = Braze._init_$lambda$3();
                return _init_$lambda$3;
            }
        }, false, false, new Function0() { // from class: N3.f1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit _init_$lambda$27;
                _init_$lambda$27 = Braze._init_$lambda$27(Braze.this, context);
                return _init_$lambda$27;
            }
        });
        final long nanoTime2 = System.nanoTime();
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: N3.q1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String _init_$lambda$28;
                _init_$lambda$28 = Braze._init_$lambda$28(nanoTime2, nanoTime);
                return _init_$lambda$28;
            }
        }, 7, (Object) null);
    }

    public static String A() {
        return "**                                                                                   **";
    }

    public static String A0() {
        return "**                                        See                                        **";
    }

    public static String C() {
        return "ADM manifest requirements not met. Braze will not register for ADM.";
    }

    public static String E() {
        return "Firebase Cloud Messaging found. Setting up Firebase Cloud Messaging.";
    }

    public static String F() {
        return "Failed to setup pre SDK tasks";
    }

    public static String I1() {
        return "**                                                                                   **";
    }

    public static String K0() {
        return "**                Replace \"rest\" with \"sdk\" in your configuration                    **";
    }

    public static String M1() {
        return "**  https://www.braze.com/docs/user_guide/administrative/access_braze/sdk_endpoints  **";
    }

    public static String P1() {
        return "Finished UserDependencyManager creation.";
    }

    public static String U1() {
        return "**                                   !! WARNING !!                                   **";
    }

    public static String W1() {
        return "Automatic ADM registration not enabled in configuration. Braze will not register for ADM.";
    }

    public static String X0() {
        return "Automatic Firebase Cloud Messaging registration not enabled in configuration. Braze will not register for Firebase Cloud Messaging.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_cachedContentCardsUpdatedEvent_$lambda$37() {
        return "Failed to retrieve the cached ContentCardsUpdatedEvent.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_deviceId_$lambda$29() {
        return "Failed to retrieve the device id.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$0() {
        return "Braze SDK Initializing";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$27(Braze braze, Context context) {
        Braze braze2;
        com.braze.configuration.e eVar;
        Braze braze3;
        braze.applyPendingRuntimeConfiguration$android_sdk_base_release();
        braze.setConfigurationProvider$android_sdk_base_release(new BrazeConfigurationProvider(braze.applicationContext));
        Companion companion = INSTANCE;
        String configuredApiKey = companion.getConfiguredApiKey(braze.getConfigurationProvider$android_sdk_base_release());
        braze.isApiKeyPresent = Boolean.valueOf(!(configuredApiKey == null || StringsKt.isBlank(configuredApiKey)));
        BrazeLogger.setInitialLogLevelFromConfiguration(braze.getConfigurationProvider$android_sdk_base_release().getLoggerInitialLogLevel());
        BrazeLogger.checkForSystemLogLevelProperty$default(false, 1, null);
        if (companion.getSdkEnablementProvider(context).f12895a.getBoolean("appboy_sdk_disabled", false)) {
            companion.setOutboundNetworkRequestsOffline(true);
        }
        String str = braze.getConfigurationProvider$android_sdk_base_release().getBrazeApiKey().f12604a;
        braze.setPushDeliveryManager$android_sdk_base_release(new com.braze.managers.i0(braze.applicationContext, str));
        braze.setDeviceIdProvider$android_sdk_base_release(new com.braze.managers.u(braze.applicationContext, str));
        braze.offlineUserStorageProvider = new com.braze.configuration.e(braze.applicationContext);
        braze.setRegistrationDataProvider$android_sdk_base_release(new com.braze.managers.l0(braze.applicationContext, braze.getConfigurationProvider$android_sdk_base_release()));
        String customEndpoint = braze.getConfigurationProvider$android_sdk_base_release().getCustomEndpoint();
        if (customEndpoint != null && !StringsKt.isBlank(customEndpoint)) {
            if (ValidationUtils.isInvalidCustomEndpoint$android_sdk_base_release(braze.getConfigurationProvider$android_sdk_base_release().getCustomEndpoint())) {
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                BrazeLogger.Priority priority = BrazeLogger.Priority.f12984W;
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, new Function0() { // from class: N3.A1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Braze.m0();
                    }
                }, 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, new Function0() { // from class: N3.N1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Braze.I1();
                    }
                }, 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, new Function0() { // from class: N3.Q1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Braze.U1();
                    }
                }, 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, new Function0() { // from class: N3.R1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Braze.y1();
                    }
                }, 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, new Function0() { // from class: N3.S1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Braze.y();
                    }
                }, 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, new Function0() { // from class: N3.T1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Braze.g0();
                    }
                }, 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, new Function0() { // from class: N3.U1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Braze.K0();
                    }
                }, 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, new Function0() { // from class: N3.V1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Braze.A0();
                    }
                }, 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, new Function0() { // from class: N3.W1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Braze.M1();
                    }
                }, 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, new Function0() { // from class: N3.Y1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Braze.A();
                    }
                }, 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, new Function0() { // from class: N3.C1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Braze.c0();
                    }
                }, 6, (Object) null);
            }
            companion.setConfiguredCustomEndpoint$android_sdk_base_release(braze.getConfigurationProvider$android_sdk_base_release().getCustomEndpoint());
        }
        try {
            if (braze.getConfigurationProvider$android_sdk_base_release().isFirebaseCloudMessagingRegistrationEnabled()) {
                com.braze.managers.b0 b0Var = new com.braze.managers.b0(context, braze.getRegistrationDataProvider$android_sdk_base_release());
                if (b0Var.a()) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: N3.D1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Braze.E();
                        }
                    }, 6, (Object) null);
                    String firebaseCloudMessagingSenderIdKey = braze.getConfigurationProvider$android_sdk_base_release().getFirebaseCloudMessagingSenderIdKey();
                    if (firebaseCloudMessagingSenderIdKey != null) {
                        b0Var.a(firebaseCloudMessagingSenderIdKey);
                    }
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: N3.E1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Braze.r2();
                        }
                    }, 6, (Object) null);
                }
                braze3 = braze;
            } else {
                braze3 = braze;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze3, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: N3.F1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Braze.X0();
                    }
                }, 6, (Object) null);
            }
            if (braze3.getConfigurationProvider$android_sdk_base_release().isAdmMessagingRegistrationEnabled()) {
                com.braze.managers.a aVar = com.braze.managers.b.f12396c;
                Context context2 = braze3.applicationContext;
                Intrinsics.checkNotNullParameter(context2, "context");
                if (aVar.a() && aVar.a(context2)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze3, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: N3.G1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Braze.t0();
                        }
                    }, 6, (Object) null);
                    new com.braze.managers.b(braze3.applicationContext, braze3.getRegistrationDataProvider$android_sdk_base_release()).a();
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze3, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: N3.H1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Braze.C();
                        }
                    }, 6, (Object) null);
                }
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: N3.I1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Braze.W1();
                    }
                }, 6, (Object) null);
            }
            braze.verifyProperSdkSetup();
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: N3.J1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Braze.F();
                }
            }, 4, (Object) null);
        }
        BrazeLogger brazeLogger2 = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority2 = BrazeLogger.Priority.f12983V;
        BrazeLogger.brazelog$default(brazeLogger2, (Object) braze, priority2, (Throwable) null, false, new Function0() { // from class: N3.K1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Braze.r1();
            }
        }, 6, (Object) null);
        try {
            Context context3 = braze.applicationContext;
            com.braze.configuration.e eVar2 = braze.offlineUserStorageProvider;
            if (eVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("offlineUserStorageProvider");
                eVar = null;
            } else {
                eVar = eVar2;
            }
            braze.setUserSpecificMemberVariablesAndStartDispatch(new u0(context3, eVar, braze.getConfigurationProvider$android_sdk_base_release(), braze.externalIEventMessenger, braze.getDeviceIdProvider$android_sdk_base_release(), braze.getRegistrationDataProvider$android_sdk_base_release(), braze.getPushDeliveryManager$android_sdk_base_release(), shouldMockNetworkRequestsAndDropEvents, areOutboundNetworkRequestsOffline, braze.getDeviceDataProvider(), shouldRequestFrameworkListenToNetworkUpdates));
            BrazeLogger.brazelog$default(brazeLogger2, (Object) braze, priority2, (Throwable) null, false, new Function0() { // from class: N3.L1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Braze.P1();
                }
            }, 6, (Object) null);
            braze2 = braze;
        } catch (Exception e7) {
            braze2 = braze;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze2, BrazeLogger.Priority.f12981E, (Throwable) e7, false, new Function0() { // from class: N3.O1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Braze.b2();
                }
            }, 4, (Object) null);
            braze2.publishError(e7);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze2, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: N3.P1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Braze.z();
            }
        }, 6, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$28(long j6, long j7) {
        StringBuilder sb = new StringBuilder("Braze SDK loaded in ");
        long j8 = j6 - j7;
        sb.append(TimeUnit.MILLISECONDS.convert(j8, TimeUnit.NANOSECONDS));
        sb.append(" ms / ");
        sb.append(j8);
        sb.append(" nanos");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$3() {
        return "Failed to perform initial Braze singleton setup.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_registeredPushToken_$lambda$32(String str) {
        return j.a("Failed to set the push token ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _set_registeredPushToken_$lambda$36(Braze braze, final String str) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.f12982I;
        BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, new Function0() { // from class: N3.p1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String _set_registeredPushToken_$lambda$36$lambda$33;
                _set_registeredPushToken_$lambda$36$lambda$33 = Braze._set_registeredPushToken_$lambda$36$lambda$33(str);
                return _set_registeredPushToken_$lambda$36$lambda$33;
            }
        }, 6, (Object) null);
        if (str == null || StringsKt.isBlank(str)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) braze, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: N3.s1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String _set_registeredPushToken_$lambda$36$lambda$34;
                    _set_registeredPushToken_$lambda$36$lambda$34 = Braze._set_registeredPushToken_$lambda$36$lambda$34();
                    return _set_registeredPushToken_$lambda$36$lambda$34;
                }
            }, 6, (Object) null);
            return Unit.INSTANCE;
        }
        if (Intrinsics.areEqual(((com.braze.managers.l0) braze.getRegistrationDataProvider$android_sdk_base_release()).b(), str)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, new Function0() { // from class: N3.r1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String _set_registeredPushToken_$lambda$36$lambda$35;
                    _set_registeredPushToken_$lambda$36$lambda$35 = Braze._set_registeredPushToken_$lambda$36$lambda$35(str);
                    return _set_registeredPushToken_$lambda$36$lambda$35;
                }
            }, 6, (Object) null);
            return Unit.INSTANCE;
        }
        ((com.braze.managers.l0) braze.getRegistrationDataProvider$android_sdk_base_release()).a(str);
        r rVar = ((u0) braze.getUdm$android_sdk_base_release()).f12546k;
        if (rVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("deviceCache");
            rVar = null;
        }
        rVar.e();
        braze.requestImmediateDataFlush();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_registeredPushToken_$lambda$36$lambda$33(String str) {
        return j.a("Push token registered: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_registeredPushToken_$lambda$36$lambda$34() {
        return "Push token must not be null or blank. Not registering for push with Braze.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_registeredPushToken_$lambda$36$lambda$35(String str) {
        return a.a("Push token ", str, " is the same as the previous token. Not calling sendFullDeviceObjectOnNextExport or requesting data flush");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addSerializedCardJsonToStorage$lambda$178(String str, String str2) {
        return "Failed to update ContentCard storage provider with single card update. User id: " + str + " Serialized json: " + str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addSerializedCardJsonToStorage$lambda$180(final String str, Braze braze, final String str2) {
        if (StringsKt.isBlank(str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: N3.E0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String addSerializedCardJsonToStorage$lambda$180$lambda$179;
                    addSerializedCardJsonToStorage$lambda$180$lambda$179 = Braze.addSerializedCardJsonToStorage$lambda$180$lambda$179(str2, str);
                    return addSerializedCardJsonToStorage$lambda$180$lambda$179;
                }
            }, 6, (Object) null);
            return Unit.INSTANCE;
        }
        ((u0) braze.getUdm$android_sdk_base_release()).f12532C.a(new com.braze.models.response.c(str), str2);
        ((com.braze.events.d) braze.externalIEventMessenger).b(((u0) braze.getUdm$android_sdk_base_release()).f12532C.a(true), ContentCardsUpdatedEvent.class);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addSerializedCardJsonToStorage$lambda$180$lambda$179(String str, String str2) {
        return "Cannot add null or blank card json to storage. Returning. User id: " + str + " Serialized json: " + str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addSingleSynchronousSubscription$lambda$125(Class cls) {
        return "Failed to add synchronous subscriber for class: " + cls;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String applyPendingRuntimeConfiguration$lambda$195$lambda$192() {
        return "Applying any pending runtime configuration values";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String applyPendingRuntimeConfiguration$lambda$195$lambda$193() {
        return "Clearing config values";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String applyPendingRuntimeConfiguration$lambda$195$lambda$194(BrazeConfig brazeConfig) {
        return "Setting pending config object: " + brazeConfig;
    }

    public static String b2() {
        return "Failed to startup user dependency manager.";
    }

    public static String c0() {
        return "***************************************************************************************";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String changeUser$lambda$130(String str) {
        return j.a("Failed to set external id to: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit changeUser$lambda$138(final String str, Braze braze, final String str2) {
        Braze braze2;
        com.braze.configuration.e eVar;
        if (str == null || str.length() == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: N3.N
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String changeUser$lambda$138$lambda$131;
                    changeUser$lambda$138$lambda$131 = Braze.changeUser$lambda$138$lambda$131();
                    return changeUser$lambda$138$lambda$131;
                }
            }, 6, (Object) null);
            return Unit.INSTANCE;
        }
        if (StringUtils.getByteSize(str) > 997) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: N3.G
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String changeUser$lambda$138$lambda$132;
                    changeUser$lambda$138$lambda$132 = Braze.changeUser$lambda$138$lambda$132(str);
                    return changeUser$lambda$138$lambda$132;
                }
            }, 6, (Object) null);
            return Unit.INSTANCE;
        }
        BrazeUser brazeUser = braze.brazeUser;
        if (brazeUser == null) {
            Intrinsics.throwUninitializedPropertyAccessException("brazeUser");
            brazeUser = null;
        }
        final String userId = brazeUser.getUserId();
        if (Intrinsics.areEqual(userId, str)) {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) braze, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: N3.I
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String changeUser$lambda$138$lambda$133;
                    changeUser$lambda$138$lambda$133 = Braze.changeUser$lambda$138$lambda$133(str);
                    return changeUser$lambda$138$lambda$133;
                }
            }, 6, (Object) null);
            if (str2 != null && !StringsKt.isBlank(str2)) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: N3.J
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String changeUser$lambda$138$lambda$134;
                        changeUser$lambda$138$lambda$134 = Braze.changeUser$lambda$138$lambda$134(str2);
                        return changeUser$lambda$138$lambda$134;
                    }
                }, 7, (Object) null);
                ((u0) braze.getUdm$android_sdk_base_release()).f12555t.b(str2);
            }
        } else {
            com.braze.events.d dVar = ((u0) braze.getUdm$android_sdk_base_release()).f12547l;
            ReentrantLock reentrantLock = dVar.f12255g;
            reentrantLock.lock();
            try {
                reentrantLock.unlock();
                ((u0) braze.getUdm$android_sdk_base_release()).f12554s.a();
                if (Intrinsics.areEqual(userId, "")) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: N3.K
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String changeUser$lambda$138$lambda$135;
                            changeUser$lambda$138$lambda$135 = Braze.changeUser$lambda$138$lambda$135(str);
                            return changeUser$lambda$138$lambda$135;
                        }
                    }, 6, (Object) null);
                    com.braze.configuration.e eVar2 = braze.offlineUserStorageProvider;
                    if (eVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("offlineUserStorageProvider");
                        eVar2 = null;
                    }
                    eVar2.b(str);
                    BrazeUser brazeUser2 = braze.brazeUser;
                    if (brazeUser2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("brazeUser");
                        brazeUser2 = null;
                    }
                    brazeUser2.setUserId(str);
                    braze2 = braze;
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: N3.L
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String changeUser$lambda$138$lambda$136;
                            changeUser$lambda$138$lambda$136 = Braze.changeUser$lambda$138$lambda$136(userId, str);
                            return changeUser$lambda$138$lambda$136;
                        }
                    }, 6, (Object) null);
                    braze2 = braze;
                    ((com.braze.events.d) braze2.externalIEventMessenger).b(new FeedUpdatedEvent(new ArrayList(), str, false, DateTimeUtils.nowInSeconds()), FeedUpdatedEvent.class);
                }
                ((u0) braze2.getUdm$android_sdk_base_release()).f12558w.f();
                ((u0) braze2.getUdm$android_sdk_base_release()).f12549n.a();
                com.braze.configuration.e eVar3 = braze2.offlineUserStorageProvider;
                if (eVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("offlineUserStorageProvider");
                    eVar3 = null;
                }
                eVar3.b(str);
                com.braze.managers.h0 udm$android_sdk_base_release = braze2.getUdm$android_sdk_base_release();
                Context context = braze2.applicationContext;
                com.braze.configuration.e eVar4 = braze2.offlineUserStorageProvider;
                if (eVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("offlineUserStorageProvider");
                    eVar = null;
                } else {
                    eVar = eVar4;
                }
                braze2.setUserSpecificMemberVariablesAndStartDispatch(new u0(context, eVar, braze2.getConfigurationProvider$android_sdk_base_release(), braze2.externalIEventMessenger, braze2.getDeviceIdProvider$android_sdk_base_release(), braze2.getRegistrationDataProvider$android_sdk_base_release(), braze2.getPushDeliveryManager$android_sdk_base_release(), shouldMockNetworkRequestsAndDropEvents, areOutboundNetworkRequestsOffline, braze2.getDeviceDataProvider(), shouldRequestFrameworkListenToNetworkUpdates));
                if (str2 != null && !StringsKt.isBlank(str2)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: N3.M
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String changeUser$lambda$138$lambda$137;
                            changeUser$lambda$138$lambda$137 = Braze.changeUser$lambda$138$lambda$137(str2);
                            return changeUser$lambda$138$lambda$137;
                        }
                    }, 7, (Object) null);
                    ((u0) braze.getUdm$android_sdk_base_release()).f12555t.b(str2);
                }
                ((u0) braze.getUdm$android_sdk_base_release()).a().j();
                ((u0) braze.getUdm$android_sdk_base_release()).f12558w.o();
                u0 u0Var = (u0) udm$android_sdk_base_release;
                u0Var.getClass();
                ga.i.d(BrazeCoroutineScope.INSTANCE, (CoroutineContext) null, (L) null, new t0(u0Var, null), 3, (Object) null);
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String changeUser$lambda$138$lambda$131() {
        return "userId passed to changeUser was null or empty. The current user will remain the active user.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String changeUser$lambda$138$lambda$132(String str) {
        return j.a("Rejected user id with byte length longer than 997. Not changing user. Input user id: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String changeUser$lambda$138$lambda$133(String str) {
        return a.a("Received request to change current user ", str, " to the same user id. Not changing user.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String changeUser$lambda$138$lambda$134(String str) {
        return j.a("Set sdk auth signature on changeUser call: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String changeUser$lambda$138$lambda$135(String str) {
        return j.a("Changing anonymous user to ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String changeUser$lambda$138$lambda$136(String str, String str2) {
        return "Changing current user " + str + " to new user " + str2 + com.amazon.a.a.o.c.a.b.f11260a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String changeUser$lambda$138$lambda$137(String str) {
        return j.a("Set sdk auth signature on changeUser call: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String closeSession$lambda$41() {
        return "Failed to close session.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit closeSession$lambda$43(Activity activity, Braze braze) {
        if (activity == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: N3.n1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String closeSession$lambda$43$lambda$42;
                    closeSession$lambda$43$lambda$42 = Braze.closeSession$lambda$43$lambda$42();
                    return closeSession$lambda$43$lambda$42;
                }
            }, 6, (Object) null);
            return Unit.INSTANCE;
        }
        ((u0) braze.getUdm$android_sdk_base_release()).f12558w.a(activity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String closeSession$lambda$43$lambda$42() {
        return "Cannot close session with null activity.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String deserializeContentCard$lambda$146() {
        return "Cannot deserialize null content card json string. Returning null.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String deserializeContentCard$lambda$147(String str) {
        return j.a("Failed to deserialize content card json string. Payload: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String deserializeContentCard$lambda$148(JSONObject jSONObject) {
        return "Failed to deserialize content card json. Payload: " + jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String deserializeInAppMessageString$lambda$157(String str) {
        return j.a("Failed to deserialize in-app message json. Payload: ", str);
    }

    public static String g0() {
        return "**                             instead of an SDK endpoint                            **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getAllFeatureFlags$lambda$87() {
        return "Failed to get all feature flags";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getBanner$lambda$101(String str) {
        return j.a("Failed to get Banner ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getCachedContentCards$lambda$144() {
        return "The ContentCardsUpdatedEvent was null. Returning null for the list of cached cards.";
    }

    private final ContentCardsUpdatedEvent getCachedContentCardsUpdatedEvent() {
        return (ContentCardsUpdatedEvent) runForResult$android_sdk_base_release$default(this, null, new Function0() { // from class: N3.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String _get_cachedContentCardsUpdatedEvent_$lambda$37;
                _get_cachedContentCardsUpdatedEvent_$lambda$37 = Braze._get_cachedContentCardsUpdatedEvent_$lambda$37();
                return _get_cachedContentCardsUpdatedEvent_$lambda$37;
            }
        }, false, false, new d(this, null), 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getConfigurationProviderSafe$lambda$221() {
        return "ConfigurationProvider has not been initialized. Constructing a new one.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getCurrentUser$lambda$139() {
        return "Failed to retrieve the current user.";
    }

    private final com.braze.managers.d0 getDeviceDataProvider() {
        com.braze.managers.d0 d0Var = deviceDataProvider;
        if (d0Var == null) {
            d0Var = new com.braze.managers.t(this.applicationContext, getConfigurationProvider$android_sdk_base_release());
        }
        deviceDataProvider = d0Var;
        return d0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getFeatureFlag$lambda$88(String str) {
        return j.a("Failed to get feature flag ", str);
    }

    @JvmStatic
    public static final Braze getInstance(Context context) {
        return INSTANCE.getInstance(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleInAppMessageTestPush$lambda$188() {
        return "Error handling test in-app message push";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleInAppMessageTestPush$lambda$189(Intent intent, Braze braze) {
        INSTANCE.requestTriggersIfInAppMessageTestPush$android_sdk_base_release(intent, ((u0) braze.getUdm$android_sdk_base_release()).f12558w);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleInternalBannerRefresh$lambda$190() {
        return "Error handling banner push refresh";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleInternalBannerRefresh$lambda$191(Braze braze) {
        ((u0) braze.getUdm$android_sdk_base_release()).f12530A.a(true);
        return Unit.INSTANCE;
    }

    private final boolean isEphemeralEventKey(final String key) {
        if (!getConfigurationProvider$android_sdk_base_release().isEphemeralEventsEnabled()) {
            return false;
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.f12983V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: N3.u0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String isEphemeralEventKey$lambda$217;
                isEphemeralEventKey$lambda$217 = Braze.isEphemeralEventKey$lambda$217();
                return isEphemeralEventKey$lambda$217;
            }
        }, 6, (Object) null);
        final Set<String> ephemeralEventKeys = getConfigurationProvider$android_sdk_base_release().getEphemeralEventKeys();
        final boolean contains = ephemeralEventKeys.contains(key);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: N3.v0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String isEphemeralEventKey$lambda$218;
                isEphemeralEventKey$lambda$218 = Braze.isEphemeralEventKey$lambda$218(key, ephemeralEventKeys, contains);
                return isEphemeralEventKey$lambda$218;
            }
        }, 6, (Object) null);
        return contains;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isEphemeralEventKey$lambda$217() {
        return "Ephemeral events enabled";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isEphemeralEventKey$lambda$218(String str, Set set, boolean z6) {
        return "Checking event key [" + str + "] against ephemeral event list " + set + " and got match?: " + z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logBannerClick$lambda$103(String str) {
        return b.a("Failed to log a Banner impression for ", str, com.amazon.a.a.o.c.a.b.f11260a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logBannerClick$lambda$104(Braze braze, String str, String str2) {
        ((u0) braze.getUdm$android_sdk_base_release()).f12530A.a(str, str2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logBannerImpression$lambda$102(String str) {
        return b.a("Failed to log a Banner impression for ", str, com.amazon.a.a.o.c.a.b.f11260a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logCustomEvent$lambda$44(String str) {
        return j.a("Failed to log custom event: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v7, types: [T, java.lang.String] */
    public static final Unit logCustomEvent$lambda$50(Braze braze, final String str, BrazeProperties brazeProperties, final BrazeProperties brazeProperties2) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.f12983V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, new Function0() { // from class: N3.s
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String logCustomEvent$lambda$50$lambda$45;
                logCustomEvent$lambda$50$lambda$45 = Braze.logCustomEvent$lambda$50$lambda$45(str, brazeProperties2);
                return logCustomEvent$lambda$50$lambda$45;
            }
        }, 6, (Object) null);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = str;
        if (!ValidationUtils.isValidLogCustomEventInput(str, ((u0) braze.getUdm$android_sdk_base_release()).f12548m)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) braze, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: N3.t
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String logCustomEvent$lambda$50$lambda$46;
                    logCustomEvent$lambda$50$lambda$46 = Braze.logCustomEvent$lambda$50$lambda$46(Ref.ObjectRef.this);
                    return logCustomEvent$lambda$50$lambda$46;
                }
            }, 6, (Object) null);
            return Unit.INSTANCE;
        }
        if (brazeProperties != null && brazeProperties.isInvalid()) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) braze, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: N3.u
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String logCustomEvent$lambda$50$lambda$47;
                    logCustomEvent$lambda$50$lambda$47 = Braze.logCustomEvent$lambda$50$lambda$47(Ref.ObjectRef.this);
                    return logCustomEvent$lambda$50$lambda$47;
                }
            }, 6, (Object) null);
            return Unit.INSTANCE;
        }
        ?? ensureBrazeFieldLength = ValidationUtils.ensureBrazeFieldLength((String) objectRef.element);
        objectRef.element = ensureBrazeFieldLength;
        com.braze.models.i a6 = com.braze.models.outgoing.event.b.f12605g.a((String) ensureBrazeFieldLength, brazeProperties);
        if (a6 == null) {
            return Unit.INSTANCE;
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, new Function0() { // from class: N3.v
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String logCustomEvent$lambda$50$lambda$48;
                logCustomEvent$lambda$50$lambda$48 = Braze.logCustomEvent$lambda$50$lambda$48(str, brazeProperties2);
                return logCustomEvent$lambda$50$lambda$48;
            }
        }, 6, (Object) null);
        if (braze.isEphemeralEventKey((String) objectRef.element) ? ((u0) braze.getUdm$android_sdk_base_release()).f12548m.F() : ((u0) braze.getUdm$android_sdk_base_release()).f12558w.a(a6)) {
            ((u0) braze.getUdm$android_sdk_base_release()).f12535F.a((com.braze.triggers.events.i) new com.braze.triggers.events.a((String) objectRef.element, brazeProperties, a6));
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, new Function0() { // from class: N3.x
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String logCustomEvent$lambda$50$lambda$49;
                    logCustomEvent$lambda$50$lambda$49 = Braze.logCustomEvent$lambda$50$lambda$49(Ref.ObjectRef.this);
                    return logCustomEvent$lambda$50$lambda$49;
                }
            }, 6, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logCustomEvent$lambda$50$lambda$45(String str, BrazeProperties brazeProperties) {
        return "Called logCustomEvent for custom event " + str + " and properties " + brazeProperties;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final String logCustomEvent$lambda$50$lambda$46(Ref.ObjectRef objectRef) {
        return c.a(new StringBuilder("Logged custom event with name "), (String) objectRef.element, " was invalid. Not logging custom event to Braze.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final String logCustomEvent$lambda$50$lambda$47(Ref.ObjectRef objectRef) {
        return c.a(new StringBuilder("Custom event with name "), (String) objectRef.element, " logged with invalid properties. Not logging custom event to Braze.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logCustomEvent$lambda$50$lambda$48(String str, BrazeProperties brazeProperties) {
        return "Logging custom event " + str + " and properties " + brazeProperties;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final String logCustomEvent$lambda$50$lambda$49(Ref.ObjectRef objectRef) {
        return c.a(new StringBuilder("Not passing event with name "), (String) objectRef.element, " to trigger manager");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logFeatureFlagImpression$lambda$89() {
        return "Failed to log a Feature Flag impression.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logFeatureFlagImpression$lambda$90(Braze braze, String str) {
        ((u0) braze.getUdm$android_sdk_base_release()).f12561z.c(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logFeedDisplayed$lambda$72() {
        return "Failed to log that the feed was displayed.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logFeedDisplayed$lambda$74(Braze braze) {
        com.braze.models.i a6 = com.braze.models.outgoing.event.b.f12605g.a();
        if (a6 != null) {
            ((u0) braze.getUdm$android_sdk_base_release()).f12558w.a(a6);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPurchase$lambda$51(String str) {
        return j.a("Failed to log purchase event of: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logPurchase$lambda$54(String str, String str2, BigDecimal bigDecimal, int i6, Braze braze, BrazeProperties brazeProperties) {
        if (!ValidationUtils.isValidLogPurchaseInput(str, str2, bigDecimal, i6, ((u0) braze.getUdm$android_sdk_base_release()).f12548m)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: N3.Y
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String logPurchase$lambda$54$lambda$52;
                    logPurchase$lambda$54$lambda$52 = Braze.logPurchase$lambda$54$lambda$52();
                    return logPurchase$lambda$54$lambda$52;
                }
            }, 6, (Object) null);
            return Unit.INSTANCE;
        }
        if (brazeProperties != null && brazeProperties.isInvalid()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: N3.Z
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String logPurchase$lambda$54$lambda$53;
                    logPurchase$lambda$54$lambda$53 = Braze.logPurchase$lambda$54$lambda$53();
                    return logPurchase$lambda$54$lambda$53;
                }
            }, 6, (Object) null);
            return Unit.INSTANCE;
        }
        String ensureBrazeFieldLength = ValidationUtils.ensureBrazeFieldLength(str);
        com.braze.models.outgoing.event.a aVar = com.braze.models.outgoing.event.b.f12605g;
        Intrinsics.checkNotNull(str2);
        Intrinsics.checkNotNull(bigDecimal);
        com.braze.models.i a6 = aVar.a(ensureBrazeFieldLength, str2, bigDecimal, i6, brazeProperties);
        if (a6 == null) {
            return Unit.INSTANCE;
        }
        if (((u0) braze.getUdm$android_sdk_base_release()).f12558w.a(a6)) {
            ((u0) braze.getUdm$android_sdk_base_release()).f12535F.a((com.braze.triggers.events.i) new com.braze.triggers.events.f(ensureBrazeFieldLength, brazeProperties, a6));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPurchase$lambda$54$lambda$52() {
        return "Log purchase input was invalid. Not logging in-app purchase to Braze.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPurchase$lambda$54$lambda$53() {
        return "Purchase logged with invalid properties. Not logging custom event to Braze.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushDelivery$lambda$200(String str) {
        return j.a("Error logging Push Delivery ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logPushDelivery$lambda$201(Braze braze, String str, long j6) {
        ((u0) braze.getUdm$android_sdk_base_release()).f12558w.a(str);
        braze.schedulePushDelivery$android_sdk_base_release(j6);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushMaxCampaign$lambda$206() {
        return "Failed to log push max campaign";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logPushMaxCampaign$lambda$207(Braze braze, String str) {
        ((u0) braze.getUdm$android_sdk_base_release()).f12558w.c(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushNotificationActionClicked$lambda$63() {
        return "Failed to log push notification action clicked.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logPushNotificationActionClicked$lambda$67(String campaignId, Braze braze, String actionId, String actionType) {
        if (campaignId == null || StringsKt.isBlank(campaignId)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: N3.r0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String logPushNotificationActionClicked$lambda$67$lambda$64;
                    logPushNotificationActionClicked$lambda$67$lambda$64 = Braze.logPushNotificationActionClicked$lambda$67$lambda$64();
                    return logPushNotificationActionClicked$lambda$67$lambda$64;
                }
            }, 6, (Object) null);
            return Unit.INSTANCE;
        }
        if (actionId == null || StringsKt.isBlank(actionId)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: N3.q0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String logPushNotificationActionClicked$lambda$67$lambda$65;
                    logPushNotificationActionClicked$lambda$67$lambda$65 = Braze.logPushNotificationActionClicked$lambda$67$lambda$65();
                    return logPushNotificationActionClicked$lambda$67$lambda$65;
                }
            }, 6, (Object) null);
            return Unit.INSTANCE;
        }
        if (actionType == null || StringsKt.isBlank(actionType)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: N3.o0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String logPushNotificationActionClicked$lambda$67$lambda$66;
                    logPushNotificationActionClicked$lambda$67$lambda$66 = Braze.logPushNotificationActionClicked$lambda$67$lambda$66();
                    return logPushNotificationActionClicked$lambda$67$lambda$66;
                }
            }, 6, (Object) null);
            return Unit.INSTANCE;
        }
        com.braze.managers.m mVar = ((u0) braze.getUdm$android_sdk_base_release()).f12558w;
        int i6 = com.braze.models.outgoing.event.push.a.f12613j;
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cid", campaignId);
        jSONObject.put("a", actionId);
        com.braze.enums.d dVar = com.braze.enums.e.f12181b;
        mVar.a(new com.braze.models.outgoing.event.push.a(jSONObject, actionType));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushNotificationActionClicked$lambda$67$lambda$64() {
        return "No campaign Id associated with this notification (this is expected for test sends). Not logging push notification action clicked.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushNotificationActionClicked$lambda$67$lambda$65() {
        return "Action ID cannot be null or blank.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushNotificationActionClicked$lambda$67$lambda$66() {
        return "Action Type cannot be null or blank.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushNotificationOpened$lambda$58(Intent intent) {
        return "Error logging push notification with intent: " + intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logPushNotificationOpened$lambda$62(Intent intent, Braze braze) {
        if (intent == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: N3.g0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String logPushNotificationOpened$lambda$62$lambda$59;
                    logPushNotificationOpened$lambda$62$lambda$59 = Braze.logPushNotificationOpened$lambda$62$lambda$59();
                    return logPushNotificationOpened$lambda$62$lambda$59;
                }
            }, 6, (Object) null);
            return Unit.INSTANCE;
        }
        final String campaignId = intent.getStringExtra("cid");
        if (campaignId == null || StringsKt.isBlank(campaignId)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: N3.i0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String logPushNotificationOpened$lambda$62$lambda$61;
                    logPushNotificationOpened$lambda$62$lambda$61 = Braze.logPushNotificationOpened$lambda$62$lambda$61();
                    return logPushNotificationOpened$lambda$62$lambda$61;
                }
            }, 6, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: N3.h0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String logPushNotificationOpened$lambda$62$lambda$60;
                    logPushNotificationOpened$lambda$62$lambda$60 = Braze.logPushNotificationOpened$lambda$62$lambda$60(campaignId);
                    return logPushNotificationOpened$lambda$62$lambda$60;
                }
            }, 6, (Object) null);
            com.braze.managers.m mVar = ((u0) braze.getUdm$android_sdk_base_release()).f12558w;
            int i6 = com.braze.models.outgoing.event.push.b.f12615j;
            Intrinsics.checkNotNullParameter(campaignId, "campaignId");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cid", campaignId);
            com.braze.enums.d dVar = com.braze.enums.e.f12181b;
            mVar.a(new com.braze.models.outgoing.event.push.b(jSONObject));
        }
        INSTANCE.requestTriggersIfInAppMessageTestPush$android_sdk_base_release(intent, ((u0) braze.getUdm$android_sdk_base_release()).f12558w);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushNotificationOpened$lambda$62$lambda$59() {
        return "Cannot logPushNotificationOpened with null intent. Not logging push click.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushNotificationOpened$lambda$62$lambda$60(String str) {
        return j.a("Logging push click. Campaign Id: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushNotificationOpened$lambda$62$lambda$61() {
        return "No campaign Id associated with this notification (this is expected for test sends). Not logging push click.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushStoryPageClicked$lambda$68(String str, String str2) {
        return "Failed to log push story page clicked for pageId: " + str + " campaignId: " + str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logPushStoryPageClicked$lambda$71(String str, String str2, Braze braze) {
        if (!ValidationUtils.isValidPushStoryClickInput(str, str2)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: N3.j0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String logPushStoryPageClicked$lambda$71$lambda$69;
                    logPushStoryPageClicked$lambda$71$lambda$69 = Braze.logPushStoryPageClicked$lambda$71$lambda$69();
                    return logPushStoryPageClicked$lambda$71$lambda$69;
                }
            }, 6, (Object) null);
            return Unit.INSTANCE;
        }
        com.braze.models.outgoing.event.a aVar = com.braze.models.outgoing.event.b.f12605g;
        Intrinsics.checkNotNull(str);
        Intrinsics.checkNotNull(str2);
        com.braze.models.i o6 = aVar.o(str, str2);
        if (o6 != null) {
            ((u0) braze.getUdm$android_sdk_base_release()).f12558w.a(o6);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushStoryPageClicked$lambda$71$lambda$69() {
        return "Push story page click input was invalid. Not logging in-app purchase to Braze.";
    }

    public static String m0() {
        return "***************************************************************************************";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String openSession$lambda$38() {
        return "Failed to open session.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit openSession$lambda$40(Activity activity, Braze braze) {
        if (activity == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: N3.v1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String openSession$lambda$40$lambda$39;
                    openSession$lambda$40$lambda$39 = Braze.openSession$lambda$40$lambda$39();
                    return openSession$lambda$40$lambda$39;
                }
            }, 6, (Object) null);
            return Unit.INSTANCE;
        }
        ((u0) braze.getUdm$android_sdk_base_release()).f12558w.c(activity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String openSession$lambda$40$lambda$39() {
        return "Cannot open session with null activity.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String performPushDeliveryFlush$lambda$204() {
        return "Failed to flush push delivery events";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit performPushDeliveryFlush$lambda$205(Braze braze) {
        ((u0) braze.getUdm$android_sdk_base_release()).f12558w.a(0L);
        return Unit.INSTANCE;
    }

    private final void publishError(final Throwable throwable) {
        if (this.udm == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, throwable, false, new Function0() { // from class: N3.y1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String publishError$lambda$212;
                    publishError$lambda$212 = Braze.publishError$lambda$212();
                    return publishError$lambda$212;
                }
            }, 4, (Object) null);
            return;
        }
        try {
            ((u0) getUdm$android_sdk_base_release()).f12547l.b(throwable, Throwable.class);
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: N3.z1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String publishError$lambda$213;
                    publishError$lambda$213 = Braze.publishError$lambda$213(throwable);
                    return publishError$lambda$213;
                }
            }, 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String publishError$lambda$212() {
        return "User dependency manager is uninitialized. Not publishing error.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String publishError$lambda$213(Throwable th) {
        return "Failed to log throwable: " + th;
    }

    public static String r1() {
        return "Starting up a new user dependency manager";
    }

    public static String r2() {
        return "Firebase Cloud Messaging requirements not met. Braze will not register for Firebase Cloud Messaging.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String reenqueueInAppMessage$lambda$198(InAppMessageEvent inAppMessageEvent) {
        return "Error reenqueueing In-App Message from event " + inAppMessageEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reenqueueInAppMessage$lambda$199(Braze braze, InAppMessageEvent inAppMessageEvent) {
        ((u0) braze.getUdm$android_sdk_base_release()).f12535F.b(inAppMessageEvent.getTriggerAction());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String refreshFeatureFlags$lambda$84() {
        return "Failed to refresh feature flags.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshFeatureFlags$lambda$86(Braze braze) {
        if (((u0) braze.getUdm$android_sdk_base_release()).f12548m.G()) {
            ((u0) braze.getUdm$android_sdk_base_release()).f12561z.f();
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: N3.a0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String refreshFeatureFlags$lambda$86$lambda$85;
                    refreshFeatureFlags$lambda$86$lambda$85 = Braze.refreshFeatureFlags$lambda$86$lambda$85();
                    return refreshFeatureFlags$lambda$86$lambda$85;
                }
            }, 6, (Object) null);
            ((u0) braze.getUdm$android_sdk_base_release()).f12547l.b(new com.braze.events.internal.j(), com.braze.events.internal.j.class);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String refreshFeatureFlags$lambda$86$lambda$85() {
        return "Feature flags not enabled. Not refreshing feature flags.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeSingleSubscription$lambda$128$lambda$126(Class cls, IEventSubscriber iEventSubscriber, boolean z6) {
        return "Did remove the background " + cls + ' ' + iEventSubscriber + "? " + z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeSingleSubscription$lambda$128$lambda$127(Class cls, IEventSubscriber iEventSubscriber, boolean z6) {
        return "Did remove the synchronous " + cls + ' ' + iEventSubscriber + "? " + z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeSingleSubscription$lambda$129(Class cls) {
        return "Failed to remove " + cls.getName() + " subscriber.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r3v4, types: [N3.O, T] */
    /* JADX WARN: Type inference failed for: r3v5, types: [N3.P, T] */
    public static final Unit requestBannersRefresh$lambda$100(List list, final Braze braze, final IValueCallback iValueCallback) {
        com.braze.managers.h.f12409k.a(list);
        if (((u0) braze.getUdm$android_sdk_base_release()).f12548m.d()) {
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            if (iValueCallback != null) {
                objectRef.element = new IFireOnceEventSubscriber() { // from class: N3.O
                    @Override // com.braze.events.IEventSubscriber
                    public final void trigger(Object obj) {
                        Braze.requestBannersRefresh$lambda$100$lambda$98$lambda$94(IValueCallback.this, objectRef, objectRef2, braze, (BannersUpdatedEvent) obj);
                    }
                };
                objectRef2.element = new IFireOnceEventSubscriber() { // from class: N3.P
                    @Override // com.braze.events.IEventSubscriber
                    public final void trigger(Object obj) {
                        Braze.requestBannersRefresh$lambda$100$lambda$98$lambda$95(IValueCallback.this, objectRef, objectRef2, braze, (com.braze.events.internal.b) obj);
                    }
                };
                IFireOnceEventSubscriber iFireOnceEventSubscriber = (IFireOnceEventSubscriber) objectRef.element;
                if (iFireOnceEventSubscriber != null) {
                    ((com.braze.events.d) braze.externalIEventMessenger).d(BannersUpdatedEvent.class, iFireOnceEventSubscriber);
                }
                IFireOnceEventSubscriber iFireOnceEventSubscriber2 = (IFireOnceEventSubscriber) objectRef2.element;
                if (iFireOnceEventSubscriber2 != null) {
                    ((com.braze.events.d) braze.externalIEventMessenger).d(com.braze.events.internal.b.class, iFireOnceEventSubscriber2);
                }
            }
            if (!((u0) braze.getUdm$android_sdk_base_release()).f12530A.a(list, false)) {
                ((u0) braze.getUdm$android_sdk_base_release()).f12547l.b(new com.braze.events.internal.b(), com.braze.events.internal.b.class);
                requestBannersRefresh$lambda$100$unsubscribeLocalListeners(objectRef, objectRef2, braze);
                if (iValueCallback != null) {
                    iValueCallback.onError();
                }
            }
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f12982I, (Throwable) null, false, new Function0() { // from class: N3.Q
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String requestBannersRefresh$lambda$100$lambda$99;
                    requestBannersRefresh$lambda$100$lambda$99 = Braze.requestBannersRefresh$lambda$100$lambda$99();
                    return requestBannersRefresh$lambda$100$lambda$99;
                }
            }, 6, (Object) null);
            ((u0) braze.getUdm$android_sdk_base_release()).f12547l.b(new com.braze.events.internal.b(), com.braze.events.internal.b.class);
            if (iValueCallback != null) {
                iValueCallback.onError();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestBannersRefresh$lambda$100$lambda$98$lambda$94(IValueCallback iValueCallback, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Braze braze, BannersUpdatedEvent message) {
        Intrinsics.checkNotNullParameter(message, "message");
        requestBannersRefresh$lambda$100$unsubscribeLocalListeners(objectRef, objectRef2, braze);
        iValueCallback.onSuccess(message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestBannersRefresh$lambda$100$lambda$98$lambda$95(IValueCallback iValueCallback, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Braze braze, com.braze.events.internal.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<unused var>");
        requestBannersRefresh$lambda$100$unsubscribeLocalListeners(objectRef, objectRef2, braze);
        iValueCallback.onError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestBannersRefresh$lambda$100$lambda$99() {
        return "Banners not enabled. Not refreshing banners. Make sure you have at least one campaign and relaunch the app.";
    }

    private static final void requestBannersRefresh$lambda$100$unsubscribeLocalListeners(Ref.ObjectRef<IFireOnceEventSubscriber<BannersUpdatedEvent>> objectRef, Ref.ObjectRef<IFireOnceEventSubscriber<com.braze.events.internal.b>> objectRef2, Braze braze) {
        IFireOnceEventSubscriber<BannersUpdatedEvent> iFireOnceEventSubscriber = objectRef.element;
        if (iFireOnceEventSubscriber != null) {
            ((com.braze.events.d) braze.externalIEventMessenger).a(BannersUpdatedEvent.class, (IEventSubscriber) iFireOnceEventSubscriber);
        }
        IFireOnceEventSubscriber<com.braze.events.internal.b> iFireOnceEventSubscriber2 = objectRef2.element;
        if (iFireOnceEventSubscriber2 != null) {
            ((com.braze.events.d) braze.externalIEventMessenger).a(com.braze.events.internal.b.class, (IEventSubscriber) iFireOnceEventSubscriber2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestBannersRefresh$lambda$91() {
        return "Failed to refresh banners.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestContentCardsRefresh$lambda$79() {
        return "Failed to request Content Cards refresh from Braze servers.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestContentCardsRefresh$lambda$81(Braze braze) {
        if (((u0) braze.getUdm$android_sdk_base_release()).f12548m.D()) {
            ((u0) braze.getUdm$android_sdk_base_release()).f12558w.a(((u0) braze.getUdm$android_sdk_base_release()).f12532C.f12939c, ((u0) braze.getUdm$android_sdk_base_release()).f12532C.f12940d, 0);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: N3.r2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String requestContentCardsRefresh$lambda$81$lambda$80;
                    requestContentCardsRefresh$lambda$81$lambda$80 = Braze.requestContentCardsRefresh$lambda$81$lambda$80();
                    return requestContentCardsRefresh$lambda$81$lambda$80;
                }
            }, 7, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestContentCardsRefresh$lambda$81$lambda$80() {
        return "Content Cards is not enabled, skipping API call to refresh";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestContentCardsRefreshFromCache$lambda$82() {
        return "Failed to request Content Cards refresh from the cache.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestContentCardsRefreshFromCache$lambda$83(Braze braze) {
        ((com.braze.events.d) braze.externalIEventMessenger).b(((u0) braze.getUdm$android_sdk_base_release()).f12532C.a(true), ContentCardsUpdatedEvent.class);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestFeedRefresh$lambda$77() {
        return "Failed to request refresh of feed.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestFeedRefresh$lambda$78(Braze braze) {
        com.braze.managers.m mVar = ((u0) braze.getUdm$android_sdk_base_release()).f12558w;
        com.braze.models.outgoing.j jVar = new com.braze.models.outgoing.j();
        jVar.f12634b = Boolean.TRUE;
        mVar.a(jVar);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestFeedRefreshFromCache$lambda$75() {
        return "Failed to retrieve and publish feed from offline cache.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestFeedRefreshFromCache$lambda$76(Braze braze) {
        e eVar = braze.externalIEventMessenger;
        com.braze.storage.x xVar = ((u0) braze.getUdm$android_sdk_base_release()).f12531B;
        com.braze.events.d dVar = (com.braze.events.d) eVar;
        dVar.b(xVar.a(new JSONArray(xVar.f12970b.getString("cards", "[]")), xVar.f12970b.getString("uid", ""), true, xVar.f12970b.getLong("cards_timestamp", -1L)), FeedUpdatedEvent.class);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestGeofenceRefresh$lambda$176(boolean z6) {
        return "Failed to request geofence refresh with rate limit ignore: " + z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestGeofenceRefresh$lambda$177(Braze braze, boolean z6) {
        ((u0) braze.getUdm$android_sdk_base_release()).f12559x.requestGeofenceRefresh(z6);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestGeofencesInitialization$lambda$184() {
        return "Failed to initialize geofences with the geofence manager.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestGeofencesInitialization$lambda$185(Braze braze) {
        ((u0) braze.getUdm$android_sdk_base_release()).f12559x.initializeGeofences();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestImmediateDataFlush$lambda$105() {
        return "Failed to request data flush.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestImmediateDataFlush$lambda$107(Braze braze) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: N3.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String requestImmediateDataFlush$lambda$107$lambda$106;
                requestImmediateDataFlush$lambda$107$lambda$106 = Braze.requestImmediateDataFlush$lambda$107$lambda$106();
                return requestImmediateDataFlush$lambda$107$lambda$106;
            }
        }, 6, (Object) null);
        com.braze.managers.m mVar = ((u0) braze.getUdm$android_sdk_base_release()).f12558w;
        mVar.getClass();
        mVar.a(new com.braze.models.outgoing.j());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestImmediateDataFlush$lambda$107$lambda$106() {
        return "requestImmediateDataFlush() called";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestLocationInitialization$lambda$162() {
        return "Location permissions were granted. Requesting geofence and location initialization.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestSingleLocationUpdate$lambda$186() {
        return "Failed to request single location update";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestSingleLocationUpdate$lambda$187(Braze braze) {
        ((u0) braze.getUdm$android_sdk_base_release()).f12560y.g();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String retryInAppMessage$lambda$196(InAppMessageEvent inAppMessageEvent) {
        return "Error retrying In-App Message from event " + inAppMessageEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit retryInAppMessage$lambda$197(Braze braze, InAppMessageEvent inAppMessageEvent) {
        ((u0) braze.getUdm$android_sdk_base_release()).f12535F.a(inAppMessageEvent.getTriggerEvent(), inAppMessageEvent.getTriggerAction());
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void run$android_sdk_base_release$default(Braze braze, Function0 function0, boolean z6, boolean z7, Function0 function02, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            z6 = true;
        }
        if ((i6 & 4) != 0) {
            z7 = true;
        }
        braze.run$android_sdk_base_release(function0, z6, z7, function02);
    }

    public static /* synthetic */ Object runForResult$android_sdk_base_release$default(Braze braze, Object obj, Function0 function0, boolean z6, boolean z7, Function2 function2, int i6, Object obj2) {
        if ((i6 & 4) != 0) {
            z6 = true;
        }
        if ((i6 & 8) != 0) {
            z7 = true;
        }
        return braze.runForResult$android_sdk_base_release(obj, function0, z6, z7, function2);
    }

    public static String s(String str) {
        return j.a("Device build model matches a known crawler. Enabling mock network request mode. Device it: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String schedulePushDelivery$lambda$202() {
        return "Error scheduling push delivery";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit schedulePushDelivery$lambda$203(Braze braze, long j6) {
        ((u0) braze.getUdm$android_sdk_base_release()).f12558w.a(j6);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setGoogleAdvertisingId$lambda$163(String str, boolean z6) {
        return "Failed to set Google Advertising ID data on device. Google Advertising ID: " + str + " and limit-ad-tracking: " + z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setGoogleAdvertisingId$lambda$166(final String str, Braze braze, final boolean z6) {
        if (StringsKt.isBlank(str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: N3.E
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String googleAdvertisingId$lambda$166$lambda$164;
                    googleAdvertisingId$lambda$166$lambda$164 = Braze.setGoogleAdvertisingId$lambda$166$lambda$164();
                    return googleAdvertisingId$lambda$166$lambda$164;
                }
            }, 6, (Object) null);
            return Unit.INSTANCE;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f12980D, (Throwable) null, false, new Function0() { // from class: N3.F
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String googleAdvertisingId$lambda$166$lambda$165;
                googleAdvertisingId$lambda$166$lambda$165 = Braze.setGoogleAdvertisingId$lambda$166$lambda$165(str, z6);
                return googleAdvertisingId$lambda$166$lambda$165;
            }
        }, 6, (Object) null);
        ((com.braze.managers.t) braze.getDeviceDataProvider()).b(str);
        ((com.braze.managers.t) braze.getDeviceDataProvider()).a(z6);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setGoogleAdvertisingId$lambda$166$lambda$164() {
        return "Google Advertising ID cannot be null or blank";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setGoogleAdvertisingId$lambda$166$lambda$165(String str, boolean z6) {
        return "Setting Google Advertising ID: " + str + " and limit-ad-tracking: " + z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSdkAuthenticationSignature$lambda$167(String str) {
        return j.a("Failed to set SDK authentication signature on device.\n", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setSdkAuthenticationSignature$lambda$170(Braze braze, final String str) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) braze, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: N3.d0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String sdkAuthenticationSignature$lambda$170$lambda$168;
                sdkAuthenticationSignature$lambda$170$lambda$168 = Braze.setSdkAuthenticationSignature$lambda$170$lambda$168(str);
                return sdkAuthenticationSignature$lambda$170$lambda$168;
            }
        }, 6, (Object) null);
        if (StringsKt.isBlank(str)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) braze, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: N3.f0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String sdkAuthenticationSignature$lambda$170$lambda$169;
                    sdkAuthenticationSignature$lambda$170$lambda$169 = Braze.setSdkAuthenticationSignature$lambda$170$lambda$169();
                    return sdkAuthenticationSignature$lambda$170$lambda$169;
                }
            }, 6, (Object) null);
            return Unit.INSTANCE;
        }
        ((u0) braze.getUdm$android_sdk_base_release()).f12555t.b(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSdkAuthenticationSignature$lambda$170$lambda$168(String str) {
        return j.a("Got new sdk auth signature ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSdkAuthenticationSignature$lambda$170$lambda$169() {
        return "SDK authentication signature cannot be null or blank";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSyncPolicyOfflineStatus(final boolean isOffline) {
        run$android_sdk_base_release$default(this, new Function0() { // from class: N3.k0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String syncPolicyOfflineStatus$lambda$209;
                syncPolicyOfflineStatus$lambda$209 = Braze.setSyncPolicyOfflineStatus$lambda$209(isOffline);
                return syncPolicyOfflineStatus$lambda$209;
            }
        }, false, false, new Function0() { // from class: N3.l0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit syncPolicyOfflineStatus$lambda$211;
                syncPolicyOfflineStatus$lambda$211 = Braze.setSyncPolicyOfflineStatus$lambda$211(Braze.this, isOffline);
                return syncPolicyOfflineStatus$lambda$211;
            }
        }, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSyncPolicyOfflineStatus$lambda$209(boolean z6) {
        return "Failed to set sync policy offline to " + z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setSyncPolicyOfflineStatus$lambda$211(Braze braze, final boolean z6) {
        ((u0) braze.getUdm$android_sdk_base_release()).f12558w.getClass();
        com.braze.dispatch.f fVar = ((u0) braze.getUdm$android_sdk_base_release()).f12551p;
        synchronized (fVar) {
            try {
                fVar.f12160l = z6;
                fVar.b();
                if (z6) {
                    fVar.f();
                } else {
                    fVar.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (braze.imageLoader != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: N3.D0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String syncPolicyOfflineStatus$lambda$211$lambda$210;
                    syncPolicyOfflineStatus$lambda$211$lambda$210 = Braze.setSyncPolicyOfflineStatus$lambda$211$lambda$210(z6);
                    return syncPolicyOfflineStatus$lambda$211$lambda$210;
                }
            }, 7, (Object) null);
            braze.getImageLoader().setOffline(z6);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSyncPolicyOfflineStatus$lambda$211$lambda$210(boolean z6) {
        return "Setting the image loader deny network downloads to " + z6;
    }

    private final void setUserSpecificMemberVariablesAndStartDispatch(u0 dependencyProvider) {
        setUdm$android_sdk_base_release(dependencyProvider);
        com.braze.coroutine.f fVar = com.braze.coroutine.f.f12131a;
        com.braze.coroutine.f.f12132b = ((u0) getUdm$android_sdk_base_release()).f12547l;
        com.braze.storage.h0 a6 = ((u0) getUdm$android_sdk_base_release()).a();
        com.braze.managers.m mVar = ((u0) getUdm$android_sdk_base_release()).f12558w;
        com.braze.configuration.e eVar = this.offlineUserStorageProvider;
        BrazeUser brazeUser = null;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("offlineUserStorageProvider");
            eVar = null;
        }
        this.brazeUser = new BrazeUser(a6, mVar, eVar.a(), ((u0) getUdm$android_sdk_base_release()).f12560y, ((u0) getUdm$android_sdk_base_release()).f12548m);
        ((u0) getUdm$android_sdk_base_release()).f12550o.a(((u0) getUdm$android_sdk_base_release()).f12547l);
        ((u0) getUdm$android_sdk_base_release()).f12547l.a();
        ((u0) getUdm$android_sdk_base_release()).f12553r.a(((u0) getUdm$android_sdk_base_release()).f12547l);
        ((u0) getUdm$android_sdk_base_release()).f12534E.g();
        e eVar2 = this.externalIEventMessenger;
        BrazeUser brazeUser2 = this.brazeUser;
        if (brazeUser2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("brazeUser");
            brazeUser2 = null;
        }
        ((com.braze.events.d) eVar2).b(new BrazeUserChangeEvent(brazeUser2.getUserId()), BrazeUserChangeEvent.class);
        com.braze.events.d dVar = ((u0) getUdm$android_sdk_base_release()).f12547l;
        BrazeUser brazeUser3 = this.brazeUser;
        if (brazeUser3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("brazeUser");
        } else {
            brazeUser = brazeUser3;
        }
        dVar.b(new BrazeUserChangeEvent(brazeUser.getUserId()), BrazeUserChangeEvent.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToBannersUpdates$lambda$115() {
        return "Failed to send cached banners upon subscribeToBannersUpdates.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribeToBannersUpdates$lambda$117(Braze braze) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: N3.V
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String subscribeToBannersUpdates$lambda$117$lambda$116;
                subscribeToBannersUpdates$lambda$117$lambda$116 = Braze.subscribeToBannersUpdates$lambda$117$lambda$116();
                return subscribeToBannersUpdates$lambda$117$lambda$116;
            }
        }, 7, (Object) null);
        if (((u0) braze.getUdm$android_sdk_base_release()).f12548m.d()) {
            com.braze.managers.h hVar = ((u0) braze.getUdm$android_sdk_base_release()).f12530A;
            if (hVar.f12421f.get()) {
                List list = hVar.f12420e;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Banner) it.next()).deepcopy$android_sdk_base_release());
                }
                ((com.braze.events.d) hVar.f12417b).b(new BannersUpdatedEvent(arrayList), BannersUpdatedEvent.class);
            }
        } else {
            ((u0) braze.getUdm$android_sdk_base_release()).f12547l.b(new BannersUpdatedEvent(CollectionsKt.emptyList()), BannersUpdatedEvent.class);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToBannersUpdates$lambda$117$lambda$116() {
        return "Sending cached update upon banners subscription";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToBannersUpdates$lambda$118() {
        return "Failed to add subscriber for Banner updates.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToContentCardsUpdates$lambda$110() {
        return "Failed to add subscriber for Content Cards updates.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToFeatureFlagsUpdates$lambda$111() {
        return "Failed to send cached feature flags upon subscribeToFeatureFlagsUpdates.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribeToFeatureFlagsUpdates$lambda$113(Braze braze) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: N3.C
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String subscribeToFeatureFlagsUpdates$lambda$113$lambda$112;
                subscribeToFeatureFlagsUpdates$lambda$113$lambda$112 = Braze.subscribeToFeatureFlagsUpdates$lambda$113$lambda$112();
                return subscribeToFeatureFlagsUpdates$lambda$113$lambda$112;
            }
        }, 7, (Object) null);
        if (((u0) braze.getUdm$android_sdk_base_release()).f12548m.G()) {
            com.braze.managers.a0 a0Var = ((u0) braze.getUdm$android_sdk_base_release()).f12561z;
            if (a0Var.f12391f.get()) {
                List list = a0Var.f12390e;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((FeatureFlag) it.next()).deepcopy$android_sdk_base_release());
                }
                ((com.braze.events.d) a0Var.f12387b).b(new FeatureFlagsUpdatedEvent(arrayList), FeatureFlagsUpdatedEvent.class);
            }
        } else {
            ((u0) braze.getUdm$android_sdk_base_release()).f12547l.b(new com.braze.events.internal.j(), com.braze.events.internal.j.class);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToFeatureFlagsUpdates$lambda$113$lambda$112() {
        return "Sending cached update upon feature flag subscription";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToFeatureFlagsUpdates$lambda$114() {
        return "Failed to add subscriber for Feature Flags updates.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToFeedUpdates$lambda$120() {
        return "Failed to add subscriber for feed updates.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToNewInAppMessages$lambda$108() {
        return "Failed to add subscriber to new in-app messages.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToPushNotificationEvents$lambda$124() {
        return "Failed to add subscriber for push notification updates.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToSdkAuthenticationFailures$lambda$123() {
        return "Failed to add subscriber for SDK authentication failures.";
    }

    public static String t0() {
        return "Amazon Device Messaging found. Setting up Amazon Device Messaging";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String validateAndStorePushId$lambda$208() {
        return "Failed to validate and store push identifier";
    }

    private final void verifyProperSdkSetup() {
        boolean z6 = true;
        for (final String str : NECESSARY_BRAZE_SDK_PERMISSIONS) {
            if (!PermissionUtils.hasPermission(this.applicationContext, str)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: N3.n
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String verifyProperSdkSetup$lambda$214;
                        verifyProperSdkSetup$lambda$214 = Braze.verifyProperSdkSetup$lambda$214(str);
                        return verifyProperSdkSetup$lambda$214;
                    }
                }, 6, (Object) null);
                z6 = false;
            }
        }
        if (StringsKt.isBlank(getConfigurationProvider$android_sdk_base_release().getBrazeApiKey().f12604a)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: N3.o
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String verifyProperSdkSetup$lambda$215;
                    verifyProperSdkSetup$lambda$215 = Braze.verifyProperSdkSetup$lambda$215();
                    return verifyProperSdkSetup$lambda$215;
                }
            }, 6, (Object) null);
            z6 = false;
        }
        if (z6) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: N3.p
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String verifyProperSdkSetup$lambda$216;
                verifyProperSdkSetup$lambda$216 = Braze.verifyProperSdkSetup$lambda$216();
                return verifyProperSdkSetup$lambda$216;
            }
        }, 6, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String verifyProperSdkSetup$lambda$214(String str) {
        return a.a("The Braze SDK requires the permission ", str, ". Check your AndroidManifest.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String verifyProperSdkSetup$lambda$215() {
        return "The Braze SDK requires a non-empty API key. Check your braze.xml or BrazeConfig.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String verifyProperSdkSetup$lambda$216() {
        return "The Braze SDK is not integrated correctly. Please visit https://www.braze.com/docs/developer_guide/platform_integration_guides/android/initial_sdk_setup/android_sdk_integration/";
    }

    public static String y() {
        return "**                       You are using a Braze REST API endpoint                     **";
    }

    public static String y1() {
        return "**                                                                                   **";
    }

    public static String z() {
        return "Finished singleton setup.";
    }

    public final /* synthetic */ void addSerializedCardJsonToStorage$android_sdk_base_release(final String serializedCardJson, final String userId) {
        Intrinsics.checkNotNullParameter(serializedCardJson, "serializedCardJson");
        run$android_sdk_base_release$default(this, new Function0() { // from class: N3.m0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String addSerializedCardJsonToStorage$lambda$178;
                addSerializedCardJsonToStorage$lambda$178 = Braze.addSerializedCardJsonToStorage$lambda$178(userId, serializedCardJson);
                return addSerializedCardJsonToStorage$lambda$178;
            }
        }, false, false, new Function0() { // from class: N3.n0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit addSerializedCardJsonToStorage$lambda$180;
                addSerializedCardJsonToStorage$lambda$180 = Braze.addSerializedCardJsonToStorage$lambda$180(serializedCardJson, this, userId);
                return addSerializedCardJsonToStorage$lambda$180;
            }
        }, 6, null);
    }

    public <T> void addSingleSynchronousSubscription(IEventSubscriber<T> subscriber, final Class<T> eventClass) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        Intrinsics.checkNotNullParameter(eventClass, "eventClass");
        try {
            ((com.braze.events.d) this.externalIEventMessenger).c((Class) eventClass, (IEventSubscriber) subscriber);
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) e6, false, new Function0() { // from class: N3.P0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String addSingleSynchronousSubscription$lambda$125;
                    addSingleSynchronousSubscription$lambda$125 = Braze.addSingleSynchronousSubscription$lambda$125(eventClass);
                    return addSingleSynchronousSubscription$lambda$125;
                }
            }, 4, (Object) null);
            publishError(e6);
        }
    }

    public final /* synthetic */ void applyPendingRuntimeConfiguration$android_sdk_base_release() {
        ReentrantLock reentrantLock = brazeClassLock;
        reentrantLock.lock();
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: N3.G0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String applyPendingRuntimeConfiguration$lambda$195$lambda$192;
                    applyPendingRuntimeConfiguration$lambda$195$lambda$192 = Braze.applyPendingRuntimeConfiguration$lambda$195$lambda$192();
                    return applyPendingRuntimeConfiguration$lambda$195$lambda$192;
                }
            }, 7, (Object) null);
            Braze braze = this;
            RuntimeAppConfigurationProvider runtimeAppConfigurationProvider = new RuntimeAppConfigurationProvider(braze.applicationContext);
            for (final BrazeConfig brazeConfig : pendingConfigurations) {
                if (Intrinsics.areEqual(brazeConfig, clearConfigSentinel)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: N3.H0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String applyPendingRuntimeConfiguration$lambda$195$lambda$193;
                            applyPendingRuntimeConfiguration$lambda$195$lambda$193 = Braze.applyPendingRuntimeConfiguration$lambda$195$lambda$193();
                            return applyPendingRuntimeConfiguration$lambda$195$lambda$193;
                        }
                    }, 6, (Object) null);
                    runtimeAppConfigurationProvider.clearAllConfigurationValues();
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: N3.I0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String applyPendingRuntimeConfiguration$lambda$195$lambda$194;
                            applyPendingRuntimeConfiguration$lambda$195$lambda$194 = Braze.applyPendingRuntimeConfiguration$lambda$195$lambda$194(BrazeConfig.this);
                            return applyPendingRuntimeConfiguration$lambda$195$lambda$194;
                        }
                    }, 6, (Object) null);
                    runtimeAppConfigurationProvider.setConfiguration(brazeConfig);
                }
                braze = this;
            }
            pendingConfigurations.clear();
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public void changeUser(String userId) {
        changeUser(userId, null);
    }

    public void closeSession(final Activity activity) {
        run$android_sdk_base_release$default(this, new Function0() { // from class: N3.p0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String closeSession$lambda$41;
                closeSession$lambda$41 = Braze.closeSession$lambda$41();
                return closeSession$lambda$41;
            }
        }, false, false, new Function0() { // from class: N3.A0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit closeSession$lambda$43;
                closeSession$lambda$43 = Braze.closeSession$lambda$43(activity, this);
                return closeSession$lambda$43;
            }
        }, 6, null);
    }

    public Card deserializeContentCard(final String contentCardString) {
        if (contentCardString == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) null, false, new Function0() { // from class: N3.h1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String deserializeContentCard$lambda$146;
                    deserializeContentCard$lambda$146 = Braze.deserializeContentCard$lambda$146();
                    return deserializeContentCard$lambda$146;
                }
            }, 6, (Object) null);
            return null;
        }
        try {
            return deserializeContentCard(new JSONObject(contentCardString));
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12981E, (Throwable) e6, false, new Function0() { // from class: N3.i1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String deserializeContentCard$lambda$147;
                    deserializeContentCard$lambda$147 = Braze.deserializeContentCard$lambda$147(contentCardString);
                    return deserializeContentCard$lambda$147;
                }
            }, 4, (Object) null);
            publishError(e6);
            return null;
        }
    }

    public IInAppMessage deserializeInAppMessageString(final String inAppMessageString) {
        return (IInAppMessage) runForResult$android_sdk_base_release$default(this, null, new Function0() { // from class: N3.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String deserializeInAppMessageString$lambda$157;
                deserializeInAppMessageString$lambda$157 = Braze.deserializeInAppMessageString$lambda$157(inAppMessageString);
                return deserializeInAppMessageString$lambda$157;
            }
        }, false, false, new g(inAppMessageString, this, null), 12, null);
    }

    public List<FeatureFlag> getAllFeatureFlags() {
        return (List) runForResult$android_sdk_base_release$default(this, CollectionsKt.emptyList(), new Function0() { // from class: N3.c1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String allFeatureFlags$lambda$87;
                allFeatureFlags$lambda$87 = Braze.getAllFeatureFlags$lambda$87();
                return allFeatureFlags$lambda$87;
            }
        }, false, false, new i(this, null), 12, null);
    }

    public Banner getBanner(final String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return (Banner) runForResult$android_sdk_base_release$default(this, null, new Function0() { // from class: N3.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String banner$lambda$101;
                banner$lambda$101 = Braze.getBanner$lambda$101(id);
                return banner$lambda$101;
            }
        }, false, false, new k(this, id, null), 12, null);
    }

    public List<Card> getCachedContentCards() {
        ContentCardsUpdatedEvent cachedContentCardsUpdatedEvent = getCachedContentCardsUpdatedEvent();
        if (cachedContentCardsUpdatedEvent != null) {
            return cachedContentCardsUpdatedEvent.getAllCards();
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12983V, (Throwable) null, false, new Function0() { // from class: N3.j2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String cachedContentCards$lambda$144;
                cachedContentCards$lambda$144 = Braze.getCachedContentCards$lambda$144();
                return cachedContentCards$lambda$144;
            }
        }, 6, (Object) null);
        return null;
    }

    public final BrazeConfigurationProvider getConfigurationProvider$android_sdk_base_release() {
        BrazeConfigurationProvider brazeConfigurationProvider = this.configurationProvider;
        if (brazeConfigurationProvider != null) {
            return brazeConfigurationProvider;
        }
        Intrinsics.throwUninitializedPropertyAccessException("configurationProvider");
        return null;
    }

    public final BrazeConfigurationProvider getConfigurationProviderSafe$android_sdk_base_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.configurationProvider != null) {
            return getConfigurationProvider$android_sdk_base_release();
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: N3.M1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String configurationProviderSafe$lambda$221;
                configurationProviderSafe$lambda$221 = Braze.getConfigurationProviderSafe$lambda$221();
                return configurationProviderSafe$lambda$221;
            }
        }, 7, (Object) null);
        return new BrazeConfigurationProvider(context);
    }

    public void getCurrentUser(IValueCallback<BrazeUser> completionCallback) {
        Intrinsics.checkNotNullParameter(completionCallback, "completionCallback");
        try {
            ga.i.d(com.braze.coroutine.f.f12131a, (CoroutineContext) null, (L) null, new m(completionCallback, this, null), 3, (Object) null);
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) e6, false, new Function0() { // from class: N3.c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String currentUser$lambda$139;
                    currentUser$lambda$139 = Braze.getCurrentUser$lambda$139();
                    return currentUser$lambda$139;
                }
            }, 4, (Object) null);
            completionCallback.onError();
            publishError(e6);
        }
    }

    public String getDeviceId() {
        return (String) runForResult$android_sdk_base_release("", new Function0() { // from class: N3.g1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String _get_deviceId_$lambda$29;
                _get_deviceId_$lambda$29 = Braze._get_deviceId_$lambda$29();
                return _get_deviceId_$lambda$29;
            }
        }, false, false, new h(this, null));
    }

    public final com.braze.managers.e0 getDeviceIdProvider$android_sdk_base_release() {
        com.braze.managers.e0 e0Var = this.deviceIdProvider;
        if (e0Var != null) {
            return e0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("deviceIdProvider");
        return null;
    }

    /* renamed from: getExternalIEventMessenger$android_sdk_base_release, reason: from getter */
    public final e getExternalIEventMessenger() {
        return this.externalIEventMessenger;
    }

    public FeatureFlag getFeatureFlag(final String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return (FeatureFlag) runForResult$android_sdk_base_release$default(this, null, new Function0() { // from class: N3.Z1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String featureFlag$lambda$88;
                featureFlag$lambda$88 = Braze.getFeatureFlag$lambda$88(id);
                return featureFlag$lambda$88;
            }
        }, false, false, new p(this, id, null), 12, null);
    }

    public IBrazeImageLoader getImageLoader() {
        IBrazeImageLoader iBrazeImageLoader = this.imageLoader;
        if (iBrazeImageLoader != null) {
            return iBrazeImageLoader;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imageLoader");
        return null;
    }

    public final com.braze.managers.i0 getPushDeliveryManager$android_sdk_base_release() {
        com.braze.managers.i0 i0Var = this.pushDeliveryManager;
        if (i0Var != null) {
            return i0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pushDeliveryManager");
        return null;
    }

    public final com.braze.managers.g0 getRegistrationDataProvider$android_sdk_base_release() {
        com.braze.managers.g0 g0Var = this.registrationDataProvider;
        if (g0Var != null) {
            return g0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("registrationDataProvider");
        return null;
    }

    public final com.braze.managers.h0 getUdm$android_sdk_base_release() {
        com.braze.managers.h0 h0Var = this.udm;
        if (h0Var != null) {
            return h0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("udm");
        return null;
    }

    public final /* synthetic */ void handleInAppMessageTestPush$android_sdk_base_release(final Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        run$android_sdk_base_release$default(this, new Function0() { // from class: N3.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String handleInAppMessageTestPush$lambda$188;
                handleInAppMessageTestPush$lambda$188 = Braze.handleInAppMessageTestPush$lambda$188();
                return handleInAppMessageTestPush$lambda$188;
            }
        }, false, false, new Function0() { // from class: N3.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit handleInAppMessageTestPush$lambda$189;
                handleInAppMessageTestPush$lambda$189 = Braze.handleInAppMessageTestPush$lambda$189(intent, this);
                return handleInAppMessageTestPush$lambda$189;
            }
        }, 6, null);
    }

    public final /* synthetic */ void handleInternalBannerRefresh$android_sdk_base_release() {
        run$android_sdk_base_release$default(this, new Function0() { // from class: N3.y0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String handleInternalBannerRefresh$lambda$190;
                handleInternalBannerRefresh$lambda$190 = Braze.handleInternalBannerRefresh$lambda$190();
                return handleInternalBannerRefresh$lambda$190;
            }
        }, false, false, new Function0() { // from class: N3.z0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit handleInternalBannerRefresh$lambda$191;
                handleInternalBannerRefresh$lambda$191 = Braze.handleInternalBannerRefresh$lambda$191(Braze.this);
                return handleInternalBannerRefresh$lambda$191;
            }
        }, 6, null);
    }

    /* renamed from: isApiKeyPresent$android_sdk_base_release, reason: from getter */
    public final Boolean getIsApiKeyPresent() {
        return this.isApiKeyPresent;
    }

    public void logBannerClick(final String placementId, final String buttonId) {
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        run$android_sdk_base_release$default(this, new Function0() { // from class: N3.w0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String logBannerClick$lambda$103;
                logBannerClick$lambda$103 = Braze.logBannerClick$lambda$103(placementId);
                return logBannerClick$lambda$103;
            }
        }, false, false, new Function0() { // from class: N3.x0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit logBannerClick$lambda$104;
                logBannerClick$lambda$104 = Braze.logBannerClick$lambda$104(Braze.this, placementId, buttonId);
                return logBannerClick$lambda$104;
            }
        }, 6, null);
    }

    public boolean logBannerImpression(final String placementId) {
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        return ((Boolean) runForResult$android_sdk_base_release$default(this, Boolean.FALSE, new Function0() { // from class: N3.F0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String logBannerImpression$lambda$102;
                logBannerImpression$lambda$102 = Braze.logBannerImpression$lambda$102(placementId);
                return logBannerImpression$lambda$102;
            }
        }, false, false, new q(this, placementId, null), 12, null)).booleanValue();
    }

    public void logCustomEvent(final String eventName, final BrazeProperties properties) {
        final BrazeProperties clone = properties != null ? properties.clone() : null;
        run$android_sdk_base_release$default(this, new Function0() { // from class: N3.a1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String logCustomEvent$lambda$44;
                logCustomEvent$lambda$44 = Braze.logCustomEvent$lambda$44(eventName);
                return logCustomEvent$lambda$44;
            }
        }, false, false, new Function0() { // from class: N3.b1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit logCustomEvent$lambda$50;
                logCustomEvent$lambda$50 = Braze.logCustomEvent$lambda$50(Braze.this, eventName, clone, properties);
                return logCustomEvent$lambda$50;
            }
        }, 6, null);
    }

    public void logFeatureFlagImpression(final String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        run$android_sdk_base_release$default(this, new Function0() { // from class: N3.w1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String logFeatureFlagImpression$lambda$89;
                logFeatureFlagImpression$lambda$89 = Braze.logFeatureFlagImpression$lambda$89();
                return logFeatureFlagImpression$lambda$89;
            }
        }, false, false, new Function0() { // from class: N3.x1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit logFeatureFlagImpression$lambda$90;
                logFeatureFlagImpression$lambda$90 = Braze.logFeatureFlagImpression$lambda$90(Braze.this, id);
                return logFeatureFlagImpression$lambda$90;
            }
        }, 6, null);
    }

    public void logFeedDisplayed() {
        run$android_sdk_base_release$default(this, new Function0() { // from class: N3.T
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String logFeedDisplayed$lambda$72;
                logFeedDisplayed$lambda$72 = Braze.logFeedDisplayed$lambda$72();
                return logFeedDisplayed$lambda$72;
            }
        }, false, false, new Function0() { // from class: N3.e0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit logFeedDisplayed$lambda$74;
                logFeedDisplayed$lambda$74 = Braze.logFeedDisplayed$lambda$74(Braze.this);
                return logFeedDisplayed$lambda$74;
            }
        }, 6, null);
    }

    public void logPurchase(final String productId, final String currencyCode, final BigDecimal price, final int quantity, BrazeProperties properties) {
        final BrazeProperties clone = properties != null ? properties.clone() : null;
        run$android_sdk_base_release$default(this, new Function0() { // from class: N3.m2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String logPurchase$lambda$51;
                logPurchase$lambda$51 = Braze.logPurchase$lambda$51(productId);
                return logPurchase$lambda$51;
            }
        }, false, false, new Function0() { // from class: N3.n2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit logPurchase$lambda$54;
                logPurchase$lambda$54 = Braze.logPurchase$lambda$54(productId, currencyCode, price, quantity, this, clone);
                return logPurchase$lambda$54;
            }
        }, 6, null);
    }

    public final /* synthetic */ void logPushDelivery$android_sdk_base_release(final String campaignId, final long timeInMs) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        run$android_sdk_base_release$default(this, new Function0() { // from class: N3.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String logPushDelivery$lambda$200;
                logPushDelivery$lambda$200 = Braze.logPushDelivery$lambda$200(campaignId);
                return logPushDelivery$lambda$200;
            }
        }, false, false, new Function0() { // from class: N3.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit logPushDelivery$lambda$201;
                logPushDelivery$lambda$201 = Braze.logPushDelivery$lambda$201(Braze.this, campaignId, timeInMs);
                return logPushDelivery$lambda$201;
            }
        }, 6, null);
    }

    public final /* synthetic */ void logPushMaxCampaign$android_sdk_base_release(final String campaign) {
        Intrinsics.checkNotNullParameter(campaign, "campaign");
        run$android_sdk_base_release$default(this, new Function0() { // from class: N3.W
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String logPushMaxCampaign$lambda$206;
                logPushMaxCampaign$lambda$206 = Braze.logPushMaxCampaign$lambda$206();
                return logPushMaxCampaign$lambda$206;
            }
        }, false, false, new Function0() { // from class: N3.X
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit logPushMaxCampaign$lambda$207;
                logPushMaxCampaign$lambda$207 = Braze.logPushMaxCampaign$lambda$207(Braze.this, campaign);
                return logPushMaxCampaign$lambda$207;
            }
        }, 6, null);
    }

    public void logPushNotificationActionClicked(final String campaignId, final String actionId, final String actionType) {
        run$android_sdk_base_release$default(this, new Function0() { // from class: N3.S
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String logPushNotificationActionClicked$lambda$63;
                logPushNotificationActionClicked$lambda$63 = Braze.logPushNotificationActionClicked$lambda$63();
                return logPushNotificationActionClicked$lambda$63;
            }
        }, false, false, new Function0() { // from class: N3.U
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit logPushNotificationActionClicked$lambda$67;
                logPushNotificationActionClicked$lambda$67 = Braze.logPushNotificationActionClicked$lambda$67(campaignId, this, actionId, actionType);
                return logPushNotificationActionClicked$lambda$67;
            }
        }, 6, null);
    }

    public void logPushNotificationOpened(final Intent intent) {
        run$android_sdk_base_release$default(this, new Function0() { // from class: N3.A
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String logPushNotificationOpened$lambda$58;
                logPushNotificationOpened$lambda$58 = Braze.logPushNotificationOpened$lambda$58(intent);
                return logPushNotificationOpened$lambda$58;
            }
        }, false, false, new Function0() { // from class: N3.B
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit logPushNotificationOpened$lambda$62;
                logPushNotificationOpened$lambda$62 = Braze.logPushNotificationOpened$lambda$62(intent, this);
                return logPushNotificationOpened$lambda$62;
            }
        }, 6, null);
    }

    public void logPushStoryPageClicked(final String campaignId, final String pageId) {
        run$android_sdk_base_release$default(this, new Function0() { // from class: N3.y
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String logPushStoryPageClicked$lambda$68;
                logPushStoryPageClicked$lambda$68 = Braze.logPushStoryPageClicked$lambda$68(pageId, campaignId);
                return logPushStoryPageClicked$lambda$68;
            }
        }, false, false, new Function0() { // from class: N3.z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit logPushStoryPageClicked$lambda$71;
                logPushStoryPageClicked$lambda$71 = Braze.logPushStoryPageClicked$lambda$71(campaignId, pageId, this);
                return logPushStoryPageClicked$lambda$71;
            }
        }, 6, null);
    }

    public void openSession(final Activity activity) {
        run$android_sdk_base_release$default(this, new Function0() { // from class: N3.K0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String openSession$lambda$38;
                openSession$lambda$38 = Braze.openSession$lambda$38();
                return openSession$lambda$38;
            }
        }, false, false, new Function0() { // from class: N3.L0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit openSession$lambda$40;
                openSession$lambda$40 = Braze.openSession$lambda$40(activity, this);
                return openSession$lambda$40;
            }
        }, 6, null);
    }

    public final /* synthetic */ void performPushDeliveryFlush$android_sdk_base_release() {
        run$android_sdk_base_release$default(this, new Function0() { // from class: N3.Y0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String performPushDeliveryFlush$lambda$204;
                performPushDeliveryFlush$lambda$204 = Braze.performPushDeliveryFlush$lambda$204();
                return performPushDeliveryFlush$lambda$204;
            }
        }, false, false, new Function0() { // from class: N3.Z0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit performPushDeliveryFlush$lambda$205;
                performPushDeliveryFlush$lambda$205 = Braze.performPushDeliveryFlush$lambda$205(Braze.this);
                return performPushDeliveryFlush$lambda$205;
            }
        }, 6, null);
    }

    public final /* synthetic */ void publishBrazePushAction$android_sdk_base_release(BrazePushEventType pushActionType, BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(pushActionType, "pushActionType");
        Intrinsics.checkNotNullParameter(payload, "payload");
        ((com.braze.events.d) this.externalIEventMessenger).b(new BrazePushEvent(pushActionType, payload), BrazePushEvent.class);
    }

    public final void reenqueueInAppMessage$android_sdk_base_release(final InAppMessageEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        run$android_sdk_base_release$default(this, new Function0() { // from class: N3.d2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String reenqueueInAppMessage$lambda$198;
                reenqueueInAppMessage$lambda$198 = Braze.reenqueueInAppMessage$lambda$198(InAppMessageEvent.this);
                return reenqueueInAppMessage$lambda$198;
            }
        }, false, false, new Function0() { // from class: N3.e2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit reenqueueInAppMessage$lambda$199;
                reenqueueInAppMessage$lambda$199 = Braze.reenqueueInAppMessage$lambda$199(Braze.this, event);
                return reenqueueInAppMessage$lambda$199;
            }
        }, 6, null);
    }

    public void refreshFeatureFlags() {
        run$android_sdk_base_release$default(this, new Function0() { // from class: N3.k2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String refreshFeatureFlags$lambda$84;
                refreshFeatureFlags$lambda$84 = Braze.refreshFeatureFlags$lambda$84();
                return refreshFeatureFlags$lambda$84;
            }
        }, false, false, new Function0() { // from class: N3.l2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit refreshFeatureFlags$lambda$86;
                refreshFeatureFlags$lambda$86 = Braze.refreshFeatureFlags$lambda$86(Braze.this);
                return refreshFeatureFlags$lambda$86;
            }
        }, 6, null);
    }

    public <T> void removeSingleSubscription(final IEventSubscriber<T> subscriber, final Class<T> eventClass) {
        Intrinsics.checkNotNullParameter(eventClass, "eventClass");
        if (subscriber != null) {
            try {
                final boolean a6 = ((com.braze.events.d) this.externalIEventMessenger).a((Class) eventClass, (IEventSubscriber) subscriber);
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                BrazeLogger.Priority priority = BrazeLogger.Priority.f12983V;
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: N3.M0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String removeSingleSubscription$lambda$128$lambda$126;
                        removeSingleSubscription$lambda$128$lambda$126 = Braze.removeSingleSubscription$lambda$128$lambda$126(eventClass, subscriber, a6);
                        return removeSingleSubscription$lambda$128$lambda$126;
                    }
                }, 6, (Object) null);
                final boolean b6 = ((com.braze.events.d) this.externalIEventMessenger).b((Class) eventClass, (IEventSubscriber) subscriber);
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: N3.N0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String removeSingleSubscription$lambda$128$lambda$127;
                        removeSingleSubscription$lambda$128$lambda$127 = Braze.removeSingleSubscription$lambda$128$lambda$127(eventClass, subscriber, b6);
                        return removeSingleSubscription$lambda$128$lambda$127;
                    }
                }, 6, (Object) null);
            } catch (Exception e6) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) e6, false, new Function0() { // from class: N3.O0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String removeSingleSubscription$lambda$129;
                        removeSingleSubscription$lambda$129 = Braze.removeSingleSubscription$lambda$129(eventClass);
                        return removeSingleSubscription$lambda$129;
                    }
                }, 4, (Object) null);
                publishError(e6);
            }
        }
    }

    public void requestBannersRefresh(List<String> ids) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        requestBannersRefresh(ids, null);
    }

    public void requestContentCardsRefresh() {
        run$android_sdk_base_release$default(this, new Function0() { // from class: N3.T0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String requestContentCardsRefresh$lambda$79;
                requestContentCardsRefresh$lambda$79 = Braze.requestContentCardsRefresh$lambda$79();
                return requestContentCardsRefresh$lambda$79;
            }
        }, false, false, new Function0() { // from class: N3.V0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit requestContentCardsRefresh$lambda$81;
                requestContentCardsRefresh$lambda$81 = Braze.requestContentCardsRefresh$lambda$81(Braze.this);
                return requestContentCardsRefresh$lambda$81;
            }
        }, 6, null);
    }

    public void requestContentCardsRefreshFromCache() {
        run$android_sdk_base_release$default(this, new Function0() { // from class: N3.W0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String requestContentCardsRefreshFromCache$lambda$82;
                requestContentCardsRefreshFromCache$lambda$82 = Braze.requestContentCardsRefreshFromCache$lambda$82();
                return requestContentCardsRefreshFromCache$lambda$82;
            }
        }, false, false, new Function0() { // from class: N3.X0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit requestContentCardsRefreshFromCache$lambda$83;
                requestContentCardsRefreshFromCache$lambda$83 = Braze.requestContentCardsRefreshFromCache$lambda$83(Braze.this);
                return requestContentCardsRefreshFromCache$lambda$83;
            }
        }, 6, null);
    }

    public void requestFeedRefresh() {
        run$android_sdk_base_release$default(this, new Function0() { // from class: N3.Q0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String requestFeedRefresh$lambda$77;
                requestFeedRefresh$lambda$77 = Braze.requestFeedRefresh$lambda$77();
                return requestFeedRefresh$lambda$77;
            }
        }, false, false, new Function0() { // from class: N3.R0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit requestFeedRefresh$lambda$78;
                requestFeedRefresh$lambda$78 = Braze.requestFeedRefresh$lambda$78(Braze.this);
                return requestFeedRefresh$lambda$78;
            }
        }, 6, null);
    }

    public void requestFeedRefreshFromCache() {
        run$android_sdk_base_release$default(this, new Function0() { // from class: N3.t2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String requestFeedRefreshFromCache$lambda$75;
                requestFeedRefreshFromCache$lambda$75 = Braze.requestFeedRefreshFromCache$lambda$75();
                return requestFeedRefreshFromCache$lambda$75;
            }
        }, false, false, new Function0() { // from class: N3.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit requestFeedRefreshFromCache$lambda$76;
                requestFeedRefreshFromCache$lambda$76 = Braze.requestFeedRefreshFromCache$lambda$76(Braze.this);
                return requestFeedRefreshFromCache$lambda$76;
            }
        }, 6, null);
    }

    public final /* synthetic */ void requestGeofenceRefresh$android_sdk_base_release(final boolean ignoreRateLimit) {
        run$android_sdk_base_release$default(this, new Function0() { // from class: N3.s0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String requestGeofenceRefresh$lambda$176;
                requestGeofenceRefresh$lambda$176 = Braze.requestGeofenceRefresh$lambda$176(ignoreRateLimit);
                return requestGeofenceRefresh$lambda$176;
            }
        }, false, false, new Function0() { // from class: N3.t0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit requestGeofenceRefresh$lambda$177;
                requestGeofenceRefresh$lambda$177 = Braze.requestGeofenceRefresh$lambda$177(Braze.this, ignoreRateLimit);
                return requestGeofenceRefresh$lambda$177;
            }
        }, 6, null);
    }

    public final /* synthetic */ void requestGeofencesInitialization$android_sdk_base_release() {
        run$android_sdk_base_release$default(this, new Function0() { // from class: N3.q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String requestGeofencesInitialization$lambda$184;
                requestGeofencesInitialization$lambda$184 = Braze.requestGeofencesInitialization$lambda$184();
                return requestGeofencesInitialization$lambda$184;
            }
        }, false, false, new Function0() { // from class: N3.r
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit requestGeofencesInitialization$lambda$185;
                requestGeofencesInitialization$lambda$185 = Braze.requestGeofencesInitialization$lambda$185(Braze.this);
                return requestGeofencesInitialization$lambda$185;
            }
        }, 6, null);
    }

    public void requestImmediateDataFlush() {
        run$android_sdk_base_release$default(this, new Function0() { // from class: N3.g2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String requestImmediateDataFlush$lambda$105;
                requestImmediateDataFlush$lambda$105 = Braze.requestImmediateDataFlush$lambda$105();
                return requestImmediateDataFlush$lambda$105;
            }
        }, false, false, new Function0() { // from class: N3.h2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit requestImmediateDataFlush$lambda$107;
                requestImmediateDataFlush$lambda$107 = Braze.requestImmediateDataFlush$lambda$107(Braze.this);
                return requestImmediateDataFlush$lambda$107;
            }
        }, 6, null);
    }

    public void requestLocationInitialization() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: N3.o1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String requestLocationInitialization$lambda$162;
                requestLocationInitialization$lambda$162 = Braze.requestLocationInitialization$lambda$162();
                return requestLocationInitialization$lambda$162;
            }
        }, 7, (Object) null);
        requestGeofencesInitialization$android_sdk_base_release();
        requestSingleLocationUpdate$android_sdk_base_release();
    }

    public final /* synthetic */ void requestSingleLocationUpdate$android_sdk_base_release() {
        run$android_sdk_base_release$default(this, new Function0() { // from class: N3.b0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String requestSingleLocationUpdate$lambda$186;
                requestSingleLocationUpdate$lambda$186 = Braze.requestSingleLocationUpdate$lambda$186();
                return requestSingleLocationUpdate$lambda$186;
            }
        }, false, false, new Function0() { // from class: N3.c0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit requestSingleLocationUpdate$lambda$187;
                requestSingleLocationUpdate$lambda$187 = Braze.requestSingleLocationUpdate$lambda$187(Braze.this);
                return requestSingleLocationUpdate$lambda$187;
            }
        }, 6, null);
    }

    public final /* synthetic */ void retryInAppMessage$android_sdk_base_release(final InAppMessageEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        run$android_sdk_base_release$default(this, new Function0() { // from class: N3.s2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String retryInAppMessage$lambda$196;
                retryInAppMessage$lambda$196 = Braze.retryInAppMessage$lambda$196(InAppMessageEvent.this);
                return retryInAppMessage$lambda$196;
            }
        }, false, false, new Function0() { // from class: N3.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit retryInAppMessage$lambda$197;
                retryInAppMessage$lambda$197 = Braze.retryInAppMessage$lambda$197(Braze.this, event);
                return retryInAppMessage$lambda$197;
            }
        }, 6, null);
    }

    public final /* synthetic */ void run$android_sdk_base_release(Function0 errorLog, boolean earlyReturnIfDisabled, boolean earlyReturnIfUdmUninitialized, Function0 block) {
        Intrinsics.checkNotNullParameter(errorLog, "errorLog");
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            ga.i.d(com.braze.coroutine.f.f12131a, (CoroutineContext) null, (L) null, new u(earlyReturnIfDisabled, earlyReturnIfUdmUninitialized, this, block, errorLog, null), 3, (Object) null);
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) e6, false, errorLog, 4, (Object) null);
            publishError(e6);
        }
    }

    public final <T> T runForResult$android_sdk_base_release(T defaultValueOnException, Function0<String> errorLog, boolean earlyReturnIfDisabled, boolean earlyReturnIfUdmUninitialized, Function2<? super J, ? super Continuation<? super T>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(errorLog, "errorLog");
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            return (T) ga.i.f((CoroutineContext) null, new x(earlyReturnIfDisabled, defaultValueOnException, earlyReturnIfUdmUninitialized, this, block, errorLog, null), 1, (Object) null);
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) e6, false, (Function0) errorLog, 4, (Object) null);
            publishError(e6);
            return defaultValueOnException;
        }
    }

    public final /* synthetic */ void schedulePushDelivery$android_sdk_base_release(final long timeInMs) {
        run$android_sdk_base_release$default(this, new Function0() { // from class: N3.B0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String schedulePushDelivery$lambda$202;
                schedulePushDelivery$lambda$202 = Braze.schedulePushDelivery$lambda$202();
                return schedulePushDelivery$lambda$202;
            }
        }, false, false, new Function0() { // from class: N3.C0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit schedulePushDelivery$lambda$203;
                schedulePushDelivery$lambda$203 = Braze.schedulePushDelivery$lambda$203(Braze.this, timeInMs);
                return schedulePushDelivery$lambda$203;
            }
        }, 6, null);
    }

    public final void setConfigurationProvider$android_sdk_base_release(BrazeConfigurationProvider brazeConfigurationProvider) {
        Intrinsics.checkNotNullParameter(brazeConfigurationProvider, "<set-?>");
        this.configurationProvider = brazeConfigurationProvider;
    }

    public final void setDeviceIdProvider$android_sdk_base_release(com.braze.managers.e0 e0Var) {
        Intrinsics.checkNotNullParameter(e0Var, "<set-?>");
        this.deviceIdProvider = e0Var;
    }

    public void setGoogleAdvertisingId(final String googleAdvertisingId, final boolean isLimitAdTrackingEnabled) {
        Intrinsics.checkNotNullParameter(googleAdvertisingId, "googleAdvertisingId");
        run$android_sdk_base_release$default(this, new Function0() { // from class: N3.j1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String googleAdvertisingId$lambda$163;
                googleAdvertisingId$lambda$163 = Braze.setGoogleAdvertisingId$lambda$163(googleAdvertisingId, isLimitAdTrackingEnabled);
                return googleAdvertisingId$lambda$163;
            }
        }, false, false, new Function0() { // from class: N3.k1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit googleAdvertisingId$lambda$166;
                googleAdvertisingId$lambda$166 = Braze.setGoogleAdvertisingId$lambda$166(googleAdvertisingId, this, isLimitAdTrackingEnabled);
                return googleAdvertisingId$lambda$166;
            }
        }, 6, null);
    }

    public void setImageLoader(IBrazeImageLoader iBrazeImageLoader) {
        Intrinsics.checkNotNullParameter(iBrazeImageLoader, "<set-?>");
        this.imageLoader = iBrazeImageLoader;
    }

    public final void setPushDeliveryManager$android_sdk_base_release(com.braze.managers.i0 i0Var) {
        Intrinsics.checkNotNullParameter(i0Var, "<set-?>");
        this.pushDeliveryManager = i0Var;
    }

    public void setRegisteredPushToken(final String str) {
        run$android_sdk_base_release$default(this, new Function0() { // from class: N3.X1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String _set_registeredPushToken_$lambda$32;
                _set_registeredPushToken_$lambda$32 = Braze._set_registeredPushToken_$lambda$32(str);
                return _set_registeredPushToken_$lambda$32;
            }
        }, false, false, new Function0() { // from class: N3.i2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit _set_registeredPushToken_$lambda$36;
                _set_registeredPushToken_$lambda$36 = Braze._set_registeredPushToken_$lambda$36(Braze.this, str);
                return _set_registeredPushToken_$lambda$36;
            }
        }, 6, null);
    }

    public final void setRegistrationDataProvider$android_sdk_base_release(com.braze.managers.g0 g0Var) {
        Intrinsics.checkNotNullParameter(g0Var, "<set-?>");
        this.registrationDataProvider = g0Var;
    }

    public void setSdkAuthenticationSignature(final String signature) {
        Intrinsics.checkNotNullParameter(signature, "signature");
        run$android_sdk_base_release$default(this, new Function0() { // from class: N3.t1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String sdkAuthenticationSignature$lambda$167;
                sdkAuthenticationSignature$lambda$167 = Braze.setSdkAuthenticationSignature$lambda$167(signature);
                return sdkAuthenticationSignature$lambda$167;
            }
        }, false, false, new Function0() { // from class: N3.u1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit sdkAuthenticationSignature$lambda$170;
                sdkAuthenticationSignature$lambda$170 = Braze.setSdkAuthenticationSignature$lambda$170(Braze.this, signature);
                return sdkAuthenticationSignature$lambda$170;
            }
        }, 6, null);
    }

    public final void setUdm$android_sdk_base_release(com.braze.managers.h0 h0Var) {
        Intrinsics.checkNotNullParameter(h0Var, "<set-?>");
        this.udm = h0Var;
    }

    public void subscribeToBannersUpdates(IEventSubscriber<BannersUpdatedEvent> subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        try {
            ((com.braze.events.d) this.externalIEventMessenger).d(BannersUpdatedEvent.class, subscriber);
            run$android_sdk_base_release$default(this, new Function0() { // from class: N3.a2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String subscribeToBannersUpdates$lambda$115;
                    subscribeToBannersUpdates$lambda$115 = Braze.subscribeToBannersUpdates$lambda$115();
                    return subscribeToBannersUpdates$lambda$115;
                }
            }, false, false, new Function0() { // from class: N3.b2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit subscribeToBannersUpdates$lambda$117;
                    subscribeToBannersUpdates$lambda$117 = Braze.subscribeToBannersUpdates$lambda$117(Braze.this);
                    return subscribeToBannersUpdates$lambda$117;
                }
            }, 6, null);
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) e6, false, new Function0() { // from class: N3.c2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String subscribeToBannersUpdates$lambda$118;
                    subscribeToBannersUpdates$lambda$118 = Braze.subscribeToBannersUpdates$lambda$118();
                    return subscribeToBannersUpdates$lambda$118;
                }
            }, 4, (Object) null);
            publishError(e6);
        }
    }

    public void subscribeToContentCardsUpdates(IEventSubscriber<ContentCardsUpdatedEvent> subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        try {
            ((com.braze.events.d) this.externalIEventMessenger).d(ContentCardsUpdatedEvent.class, subscriber);
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) e6, false, new Function0() { // from class: N3.H
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String subscribeToContentCardsUpdates$lambda$110;
                    subscribeToContentCardsUpdates$lambda$110 = Braze.subscribeToContentCardsUpdates$lambda$110();
                    return subscribeToContentCardsUpdates$lambda$110;
                }
            }, 4, (Object) null);
            publishError(e6);
        }
    }

    public void subscribeToFeatureFlagsUpdates(IEventSubscriber<FeatureFlagsUpdatedEvent> subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        try {
            ((com.braze.events.d) this.externalIEventMessenger).d(FeatureFlagsUpdatedEvent.class, subscriber);
            run$android_sdk_base_release$default(this, new Function0() { // from class: N3.o2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String subscribeToFeatureFlagsUpdates$lambda$111;
                    subscribeToFeatureFlagsUpdates$lambda$111 = Braze.subscribeToFeatureFlagsUpdates$lambda$111();
                    return subscribeToFeatureFlagsUpdates$lambda$111;
                }
            }, false, false, new Function0() { // from class: N3.p2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit subscribeToFeatureFlagsUpdates$lambda$113;
                    subscribeToFeatureFlagsUpdates$lambda$113 = Braze.subscribeToFeatureFlagsUpdates$lambda$113(Braze.this);
                    return subscribeToFeatureFlagsUpdates$lambda$113;
                }
            }, 6, null);
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) e6, false, new Function0() { // from class: N3.q2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String subscribeToFeatureFlagsUpdates$lambda$114;
                    subscribeToFeatureFlagsUpdates$lambda$114 = Braze.subscribeToFeatureFlagsUpdates$lambda$114();
                    return subscribeToFeatureFlagsUpdates$lambda$114;
                }
            }, 4, (Object) null);
            publishError(e6);
        }
    }

    public void subscribeToFeedUpdates(IEventSubscriber<FeedUpdatedEvent> subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        try {
            ((com.braze.events.d) this.externalIEventMessenger).d(FeedUpdatedEvent.class, subscriber);
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) e6, false, new Function0() { // from class: N3.S0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String subscribeToFeedUpdates$lambda$120;
                    subscribeToFeedUpdates$lambda$120 = Braze.subscribeToFeedUpdates$lambda$120();
                    return subscribeToFeedUpdates$lambda$120;
                }
            }, 4, (Object) null);
            publishError(e6);
        }
    }

    public void subscribeToNewInAppMessages(IEventSubscriber<InAppMessageEvent> subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        try {
            ((com.braze.events.d) this.externalIEventMessenger).d(InAppMessageEvent.class, subscriber);
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) e6, false, new Function0() { // from class: N3.B1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String subscribeToNewInAppMessages$lambda$108;
                    subscribeToNewInAppMessages$lambda$108 = Braze.subscribeToNewInAppMessages$lambda$108();
                    return subscribeToNewInAppMessages$lambda$108;
                }
            }, 4, (Object) null);
            publishError(e6);
        }
    }

    public void subscribeToPushNotificationEvents(IEventSubscriber<BrazePushEvent> subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        try {
            ((com.braze.events.d) this.externalIEventMessenger).d(BrazePushEvent.class, subscriber);
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) e6, false, new Function0() { // from class: N3.f2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String subscribeToPushNotificationEvents$lambda$124;
                    subscribeToPushNotificationEvents$lambda$124 = Braze.subscribeToPushNotificationEvents$lambda$124();
                    return subscribeToPushNotificationEvents$lambda$124;
                }
            }, 4, (Object) null);
            publishError(e6);
        }
    }

    public void subscribeToSdkAuthenticationFailures(IEventSubscriber<BrazeSdkAuthenticationErrorEvent> subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        try {
            ((com.braze.events.d) this.externalIEventMessenger).d(BrazeSdkAuthenticationErrorEvent.class, subscriber);
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f12984W, (Throwable) e6, false, new Function0() { // from class: N3.w
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String subscribeToSdkAuthenticationFailures$lambda$123;
                    subscribeToSdkAuthenticationFailures$lambda$123 = Braze.subscribeToSdkAuthenticationFailures$lambda$123();
                    return subscribeToSdkAuthenticationFailures$lambda$123;
                }
            }, 4, (Object) null);
            publishError(e6);
        }
    }

    public final /* synthetic */ boolean validateAndStorePushId$android_sdk_base_release(String pushId) {
        Intrinsics.checkNotNullParameter(pushId, "pushId");
        return ((Boolean) runForResult$android_sdk_base_release$default(this, Boolean.TRUE, new Function0() { // from class: N3.D
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String validateAndStorePushId$lambda$208;
                validateAndStorePushId$lambda$208 = Braze.validateAndStorePushId$lambda$208();
                return validateAndStorePushId$lambda$208;
            }
        }, false, false, new y(this, pushId, null), 12, null)).booleanValue();
    }

    public void changeUser(final String userId, final String sdkAuthSignature) {
        run$android_sdk_base_release$default(this, new Function0() { // from class: N3.d1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String changeUser$lambda$130;
                changeUser$lambda$130 = Braze.changeUser$lambda$130(userId);
                return changeUser$lambda$130;
            }
        }, false, false, new Function0() { // from class: N3.e1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit changeUser$lambda$138;
                changeUser$lambda$138 = Braze.changeUser$lambda$138(userId, this, sdkAuthSignature);
                return changeUser$lambda$138;
            }
        }, 6, null);
    }

    public void requestBannersRefresh(final List<String> ids, final IValueCallback<BannersUpdatedEvent> completionCallback) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        run$android_sdk_base_release$default(this, new Function0() { // from class: N3.l1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String requestBannersRefresh$lambda$91;
                requestBannersRefresh$lambda$91 = Braze.requestBannersRefresh$lambda$91();
                return requestBannersRefresh$lambda$91;
            }
        }, false, false, new Function0() { // from class: N3.m1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit requestBannersRefresh$lambda$100;
                requestBannersRefresh$lambda$100 = Braze.requestBannersRefresh$lambda$100(ids, this, completionCallback);
                return requestBannersRefresh$lambda$100;
            }
        }, 6, null);
    }

    public Card deserializeContentCard(final JSONObject contentCardJson) {
        return (Card) runForResult$android_sdk_base_release$default(this, null, new Function0() { // from class: N3.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String deserializeContentCard$lambda$148;
                deserializeContentCard$lambda$148 = Braze.deserializeContentCard$lambda$148(contentCardJson);
                return deserializeContentCard$lambda$148;
            }
        }, false, false, new f(this, contentCardJson, null), 12, null);
    }
}
