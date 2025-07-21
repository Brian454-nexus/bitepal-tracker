package com.braze.triggers.conditions;

import com.braze.enums.BrazeDateFormat;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.JsonUtils;
import java.util.Date;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /home/brian-terer/Downloads/BitePal/main_apk/classes.dex */
public final class g implements c {

    /* renamed from: e, reason: collision with root package name */
    public static final String f13031e = BrazeLogger.getBrazeLogTag((Class<?>) g.class);

    /* renamed from: a, reason: collision with root package name */
    public final com.braze.triggers.enums.a f13032a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13033b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13034c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f13035d;

    public g(JSONObject jSONObject) {
        com.braze.triggers.enums.a aVar = (com.braze.triggers.enums.a) JsonUtils.optEnum(jSONObject, "property_type", com.braze.triggers.enums.a.class, com.braze.triggers.enums.a.UNKNOWN);
        String string = jSONObject.getString("property_key");
        int i6 = jSONObject.getInt("comparator");
        this.f13032a = aVar;
        this.f13033b = string;
        this.f13034c = i6;
        if (jSONObject.has("property_value")) {
            if (aVar.equals(com.braze.triggers.enums.a.STRING)) {
                this.f13035d = jSONObject.getString("property_value");
                return;
            }
            if (aVar.equals(com.braze.triggers.enums.a.BOOLEAN)) {
                this.f13035d = Boolean.valueOf(jSONObject.getBoolean("property_value"));
            } else if (aVar.equals(com.braze.triggers.enums.a.NUMBER)) {
                this.f13035d = Double.valueOf(jSONObject.getDouble("property_value"));
            } else if (aVar.equals(com.braze.triggers.enums.a.DATE)) {
                this.f13035d = Long.valueOf(jSONObject.getLong("property_value"));
            }
        }
    }

    @Override // com.braze.triggers.conditions.c
    public final boolean a(com.braze.triggers.events.b bVar) {
        Object opt;
        if (!(bVar instanceof com.braze.triggers.events.c)) {
            return false;
        }
        BrazeProperties brazeProperties = ((com.braze.triggers.events.j) ((com.braze.triggers.events.c) bVar)).f13072e;
        Date date = null;
        if (brazeProperties != null) {
            try {
                opt = brazeProperties.getKey().opt(this.f13033b);
            } catch (Exception e6) {
                BrazeLogger.e(f13031e, "Caught exception checking property filter condition.", e6);
                return false;
            }
        } else {
            opt = null;
        }
        if (opt == null) {
            int i6 = this.f13034c;
            return i6 == 12 || i6 == 17 || i6 == 2;
        }
        int i7 = this.f13034c;
        if (i7 == 11) {
            return true;
        }
        if (i7 == 12) {
            return false;
        }
        int ordinal = this.f13032a.ordinal();
        if (ordinal == 0) {
            return a(opt);
        }
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    return false;
                }
                if (!(opt instanceof Boolean)) {
                    if (this.f13034c == 2) {
                        return true;
                    }
                } else {
                    int i8 = this.f13034c;
                    if (i8 == 1) {
                        return opt.equals(this.f13035d);
                    }
                    if (i8 == 2) {
                        return !opt.equals(this.f13035d);
                    }
                }
                return false;
            }
            if (!(opt instanceof Integer) && !(opt instanceof Double)) {
                if (this.f13034c == 2) {
                }
            }
            double doubleValue = ((Number) opt).doubleValue();
            double doubleValue2 = ((Number) this.f13035d).doubleValue();
            int i9 = this.f13034c;
            if (i9 == 1) {
                return doubleValue == doubleValue2;
            }
            if (i9 == 2) {
                if (doubleValue != doubleValue2) {
                }
            }
            if (i9 == 3) {
                if (doubleValue > doubleValue2) {
                }
            }
            if (i9 == 5 && doubleValue < doubleValue2) {
            }
        }
        long j6 = ((com.braze.triggers.events.i) bVar).f13069a;
        if (opt instanceof String) {
            try {
                date = DateTimeUtils.parseDate((String) opt, BrazeDateFormat.LONG);
            } catch (Exception e7) {
                BrazeLogger.e(f13031e, "Caught exception trying to parse date in compareTimestamps", e7);
            }
        }
        if (date == null) {
            if (this.f13034c != 2) {
                return false;
            }
        } else {
            long timeFromEpochInSeconds = DateTimeUtils.getTimeFromEpochInSeconds(date);
            long longValue = ((Number) this.f13035d).longValue();
            int i10 = this.f13034c;
            if (i10 != 15) {
                if (i10 != 16) {
                    switch (i10) {
                        case 1:
                            if (timeFromEpochInSeconds != longValue) {
                                return false;
                            }
                            break;
                        case 2:
                            if (timeFromEpochInSeconds == longValue) {
                                return false;
                            }
                            break;
                        case 3:
                            if (timeFromEpochInSeconds <= longValue) {
                                return false;
                            }
                            break;
                        case 4:
                            if (timeFromEpochInSeconds < j6 - longValue) {
                                return false;
                            }
                            break;
                        case 5:
                            if (timeFromEpochInSeconds >= longValue) {
                                return false;
                            }
                            break;
                        case 6:
                            if (timeFromEpochInSeconds > j6 - longValue) {
                                return false;
                            }
                            break;
                        default:
                            return false;
                    }
                } else if (timeFromEpochInSeconds <= j6 + longValue) {
                    return false;
                }
            } else if (timeFromEpochInSeconds >= j6 + longValue) {
                return false;
            }
        }
        return true;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final Object getKey() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!this.f13032a.equals(com.braze.triggers.enums.a.UNKNOWN)) {
                jSONObject.put("property_type", this.f13032a.toString());
            }
            jSONObject.put("property_key", this.f13033b);
            jSONObject.put("comparator", this.f13034c);
            jSONObject.put("property_value", this.f13035d);
            return jSONObject;
        } catch (JSONException e6) {
            BrazeLogger.e(f13031e, "Caught exception creating property filter Json.", e6);
            return jSONObject;
        }
    }

    public final boolean a(Object obj) {
        if (!(obj instanceof String)) {
            int i6 = this.f13034c;
            return i6 == 2 || i6 == 17;
        }
        int i7 = this.f13034c;
        if (i7 == 1) {
            return obj.equals(this.f13035d);
        }
        if (i7 == 2) {
            return !obj.equals(this.f13035d);
        }
        if (i7 == 10) {
            return Pattern.compile((String) this.f13035d, 2).matcher((String) obj).find();
        }
        if (i7 != 17) {
            return false;
        }
        return !Pattern.compile((String) this.f13035d, 2).matcher((String) obj).find();
    }
}
