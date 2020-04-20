package appinventor.ai_gumbraise.MySadWorld;

import android.os.Bundle;
import android.support.p000v4.app.FragmentTransaction;
import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.AppInventorCompatActivity;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.ImagePicker;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.TinyDB;
import com.google.appinventor.components.runtime.VerticalArrangement;
import com.google.appinventor.components.runtime.errors.PermissionException;
import com.google.appinventor.components.runtime.errors.YailRuntimeError;
import com.google.appinventor.components.runtime.util.RetValManager;
import com.google.appinventor.components.runtime.util.RuntimeErrorAlert;
import com.google.youngandroid.C0608runtime;
import gnu.expr.Language;
import gnu.expr.ModuleBody;
import gnu.expr.ModuleInfo;
import gnu.expr.ModuleMethod;
import gnu.kawa.functions.Apply;
import gnu.kawa.functions.Format;
import gnu.kawa.functions.GetNamedPart;
import gnu.kawa.functions.IsEqual;
import gnu.kawa.reflect.Invoke;
import gnu.kawa.reflect.SlotGet;
import gnu.kawa.reflect.SlotSet;
import gnu.lists.Consumer;
import gnu.lists.FString;
import gnu.lists.LList;
import gnu.lists.Pair;
import gnu.lists.PairWithPosition;
import gnu.lists.VoidConsumer;
import gnu.mapping.CallContext;
import gnu.mapping.Environment;
import gnu.mapping.SimpleSymbol;
import gnu.mapping.Symbol;
import gnu.mapping.Values;
import gnu.mapping.WrongType;
import gnu.math.IntNum;
import kawa.lang.Promise;
import kawa.lib.C0620lists;
import kawa.lib.misc;
import kawa.lib.strings;
import kawa.standard.Scheme;

/* compiled from: Etape2.yail */
public class Etape2 extends Form implements Runnable {
    public static Etape2 Etape2;
    static final SimpleSymbol Lit0 = ((SimpleSymbol) new SimpleSymbol("Etape2").readResolve());
    static final SimpleSymbol Lit1 = ((SimpleSymbol) new SimpleSymbol("getMessage").readResolve());
    static final SimpleSymbol Lit10 = ((SimpleSymbol) new SimpleSymbol("BackgroundColor").readResolve());
    static final FString Lit100 = new FString("com.google.appinventor.components.runtime.TinyDB");
    static final FString Lit101 = new FString("com.google.appinventor.components.runtime.TinyDB");
    static final SimpleSymbol Lit102 = ((SimpleSymbol) new SimpleSymbol("get-simple-name").readResolve());
    static final SimpleSymbol Lit103 = ((SimpleSymbol) new SimpleSymbol("android-log-form").readResolve());
    static final SimpleSymbol Lit104 = ((SimpleSymbol) new SimpleSymbol("add-to-form-environment").readResolve());
    static final SimpleSymbol Lit105 = ((SimpleSymbol) new SimpleSymbol("lookup-in-form-environment").readResolve());
    static final SimpleSymbol Lit106 = ((SimpleSymbol) new SimpleSymbol("is-bound-in-form-environment").readResolve());
    static final SimpleSymbol Lit107 = ((SimpleSymbol) new SimpleSymbol("add-to-global-var-environment").readResolve());
    static final SimpleSymbol Lit108 = ((SimpleSymbol) new SimpleSymbol("add-to-events").readResolve());
    static final SimpleSymbol Lit109 = ((SimpleSymbol) new SimpleSymbol("add-to-components").readResolve());
    static final IntNum Lit11;
    static final SimpleSymbol Lit110 = ((SimpleSymbol) new SimpleSymbol("add-to-global-vars").readResolve());
    static final SimpleSymbol Lit111 = ((SimpleSymbol) new SimpleSymbol("add-to-form-do-after-creation").readResolve());
    static final SimpleSymbol Lit112 = ((SimpleSymbol) new SimpleSymbol("send-error").readResolve());
    static final SimpleSymbol Lit113 = ((SimpleSymbol) new SimpleSymbol("dispatchEvent").readResolve());
    static final SimpleSymbol Lit114 = ((SimpleSymbol) new SimpleSymbol("dispatchGenericEvent").readResolve());
    static final SimpleSymbol Lit115 = ((SimpleSymbol) new SimpleSymbol("lookup-handler").readResolve());
    static final SimpleSymbol Lit116 = ((SimpleSymbol) new SimpleSymbol("any").readResolve());
    static final SimpleSymbol Lit12 = ((SimpleSymbol) new SimpleSymbol("CloseScreenAnimation").readResolve());
    static final SimpleSymbol Lit13 = ((SimpleSymbol) new SimpleSymbol("OpenScreenAnimation").readResolve());
    static final SimpleSymbol Lit14 = ((SimpleSymbol) new SimpleSymbol("PrimaryColor").readResolve());
    static final IntNum Lit15 = IntNum.make(16777215);
    static final SimpleSymbol Lit16 = ((SimpleSymbol) new SimpleSymbol("PrimaryColorDark").readResolve());
    static final IntNum Lit17 = IntNum.make(16777215);
    static final SimpleSymbol Lit18 = ((SimpleSymbol) new SimpleSymbol("ScreenOrientation").readResolve());
    static final SimpleSymbol Lit19 = ((SimpleSymbol) new SimpleSymbol("ShowListsAsJson").readResolve());
    static final SimpleSymbol Lit2 = ((SimpleSymbol) new SimpleSymbol("*the-null-value*").readResolve());
    static final SimpleSymbol Lit20 = ((SimpleSymbol) new SimpleSymbol("Sizing").readResolve());
    static final SimpleSymbol Lit21 = ((SimpleSymbol) new SimpleSymbol("Theme").readResolve());
    static final SimpleSymbol Lit22 = ((SimpleSymbol) new SimpleSymbol("Title").readResolve());
    static final SimpleSymbol Lit23 = ((SimpleSymbol) new SimpleSymbol("TitleVisible").readResolve());
    static final SimpleSymbol Lit24 = ((SimpleSymbol) new SimpleSymbol("Label1").readResolve());
    static final SimpleSymbol Lit25 = ((SimpleSymbol) new SimpleSymbol("Text").readResolve());
    static final SimpleSymbol Lit26 = ((SimpleSymbol) new SimpleSymbol(TinyDB.DEFAULT_NAMESPACE).readResolve());
    static final SimpleSymbol Lit27 = ((SimpleSymbol) new SimpleSymbol("GetValue").readResolve());
    static final PairWithPosition Lit28 = PairWithPosition.make(Lit9, PairWithPosition.make(Lit116, LList.Empty, "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Etape2.yail", 110777), "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Etape2.yail", 110771);
    static final PairWithPosition Lit29 = PairWithPosition.make(Lit9, PairWithPosition.make(Lit9, LList.Empty, "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Etape2.yail", 110899), "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Etape2.yail", 110893);
    static final SimpleSymbol Lit3 = ((SimpleSymbol) new SimpleSymbol("AccentColor").readResolve());
    static final SimpleSymbol Lit30 = ((SimpleSymbol) new SimpleSymbol("Etape2$Initialize").readResolve());
    static final SimpleSymbol Lit31 = ((SimpleSymbol) new SimpleSymbol("Initialize").readResolve());
    static final FString Lit32 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit33 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement1").readResolve());
    static final SimpleSymbol Lit34 = ((SimpleSymbol) new SimpleSymbol("Height").readResolve());
    static final IntNum Lit35 = IntNum.make(-2);
    static final SimpleSymbol Lit36 = ((SimpleSymbol) new SimpleSymbol("Width").readResolve());
    static final FString Lit37 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit38 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final SimpleSymbol Lit39 = ((SimpleSymbol) new SimpleSymbol("VerticalArrangement1").readResolve());
    static final IntNum Lit4 = IntNum.make(16777215);
    static final SimpleSymbol Lit40 = ((SimpleSymbol) new SimpleSymbol("AlignHorizontal").readResolve());
    static final IntNum Lit41 = IntNum.make(3);
    static final SimpleSymbol Lit42 = ((SimpleSymbol) new SimpleSymbol("AlignVertical").readResolve());
    static final IntNum Lit43 = IntNum.make(2);
    static final FString Lit44 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final FString Lit45 = new FString("com.google.appinventor.components.runtime.ImagePicker");
    static final SimpleSymbol Lit46 = ((SimpleSymbol) new SimpleSymbol("ImagePicker1").readResolve());
    static final IntNum Lit47 = IntNum.make(100);
    static final SimpleSymbol Lit48 = ((SimpleSymbol) new SimpleSymbol("Image").readResolve());
    static final FString Lit49 = new FString("com.google.appinventor.components.runtime.ImagePicker");
    static final SimpleSymbol Lit5 = ((SimpleSymbol) new SimpleSymbol("number").readResolve());
    static final SimpleSymbol Lit50 = ((SimpleSymbol) new SimpleSymbol("Selection").readResolve());
    static final SimpleSymbol Lit51 = ((SimpleSymbol) new SimpleSymbol("StoreValue").readResolve());
    static final PairWithPosition Lit52 = PairWithPosition.make(Lit9, PairWithPosition.make(Lit116, LList.Empty, "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Etape2.yail", 254173), "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Etape2.yail", 254167);
    static final PairWithPosition Lit53 = PairWithPosition.make(Lit9, LList.Empty, "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Etape2.yail", 254250);
    static final SimpleSymbol Lit54 = ((SimpleSymbol) new SimpleSymbol("ImagePicker1$AfterPicking").readResolve());
    static final SimpleSymbol Lit55 = ((SimpleSymbol) new SimpleSymbol("AfterPicking").readResolve());
    static final FString Lit56 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit57 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement2").readResolve());
    static final IntNum Lit58 = IntNum.make(50);
    static final FString Lit59 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit6 = ((SimpleSymbol) new SimpleSymbol("ActionBar").readResolve());
    static final FString Lit60 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit61 = ((SimpleSymbol) new SimpleSymbol("FontBold").readResolve());
    static final SimpleSymbol Lit62 = ((SimpleSymbol) new SimpleSymbol("FontSize").readResolve());
    static final IntNum Lit63 = IntNum.make(15);
    static final SimpleSymbol Lit64 = ((SimpleSymbol) new SimpleSymbol("FontTypeface").readResolve());
    static final IntNum Lit65 = IntNum.make(1);
    static final SimpleSymbol Lit66 = ((SimpleSymbol) new SimpleSymbol("TextAlignment").readResolve());
    static final SimpleSymbol Lit67 = ((SimpleSymbol) new SimpleSymbol("TextColor").readResolve());
    static final IntNum Lit68;
    static final FString Lit69 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit7 = ((SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_BOOLEAN).readResolve());
    static final FString Lit70 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit71 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement3").readResolve());
    static final IntNum Lit72 = IntNum.make(20);
    static final FString Lit73 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit74 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit75 = ((SimpleSymbol) new SimpleSymbol("Button1").readResolve());
    static final IntNum Lit76 = IntNum.make(40);
    static final IntNum Lit77;
    static final IntNum Lit78 = IntNum.make(250);
    static final FString Lit79 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit8 = ((SimpleSymbol) new SimpleSymbol("AppName").readResolve());
    static final PairWithPosition Lit80;
    static final SimpleSymbol Lit81 = ((SimpleSymbol) new SimpleSymbol("Button1$Click").readResolve());
    static final SimpleSymbol Lit82 = ((SimpleSymbol) new SimpleSymbol("Click").readResolve());
    static final FString Lit83 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit84 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement4").readResolve());
    static final FString Lit85 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit86 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit87 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement5").readResolve());
    static final IntNum Lit88;
    static final FString Lit89 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit9;
    static final FString Lit90 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit91 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement7").readResolve());
    static final IntNum Lit92;
    static final FString Lit93 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit94 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit95 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement8").readResolve());
    static final FString Lit96 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit97 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit98 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement6").readResolve());
    static final FString Lit99 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final ModuleMethod lambda$Fn1 = null;
    static final ModuleMethod lambda$Fn10 = null;
    static final ModuleMethod lambda$Fn11 = null;
    static final ModuleMethod lambda$Fn12 = null;
    static final ModuleMethod lambda$Fn13 = null;
    static final ModuleMethod lambda$Fn14 = null;
    static final ModuleMethod lambda$Fn15 = null;
    static final ModuleMethod lambda$Fn16 = null;
    static final ModuleMethod lambda$Fn17 = null;
    static final ModuleMethod lambda$Fn18 = null;
    static final ModuleMethod lambda$Fn19 = null;
    static final ModuleMethod lambda$Fn2 = null;
    static final ModuleMethod lambda$Fn20 = null;
    static final ModuleMethod lambda$Fn21 = null;
    static final ModuleMethod lambda$Fn22 = null;
    static final ModuleMethod lambda$Fn23 = null;
    static final ModuleMethod lambda$Fn24 = null;
    static final ModuleMethod lambda$Fn25 = null;
    static final ModuleMethod lambda$Fn26 = null;
    static final ModuleMethod lambda$Fn3 = null;
    static final ModuleMethod lambda$Fn4 = null;
    static final ModuleMethod lambda$Fn5 = null;
    static final ModuleMethod lambda$Fn6 = null;
    static final ModuleMethod lambda$Fn7 = null;
    static final ModuleMethod lambda$Fn8 = null;
    static final ModuleMethod lambda$Fn9 = null;
    public Boolean $Stdebug$Mnform$St;
    public final ModuleMethod $define;
    public Button Button1;
    public final ModuleMethod Button1$Click;
    public final ModuleMethod Etape2$Initialize;
    public HorizontalArrangement HorizontalArrangement1;
    public HorizontalArrangement HorizontalArrangement2;
    public HorizontalArrangement HorizontalArrangement3;
    public HorizontalArrangement HorizontalArrangement4;
    public HorizontalArrangement HorizontalArrangement5;
    public HorizontalArrangement HorizontalArrangement6;
    public HorizontalArrangement HorizontalArrangement7;
    public HorizontalArrangement HorizontalArrangement8;
    public ImagePicker ImagePicker1;
    public final ModuleMethod ImagePicker1$AfterPicking;
    public Label Label1;
    public TinyDB TinyDB1;
    public VerticalArrangement VerticalArrangement1;
    public final ModuleMethod add$Mnto$Mncomponents;
    public final ModuleMethod add$Mnto$Mnevents;
    public final ModuleMethod add$Mnto$Mnform$Mndo$Mnafter$Mncreation;
    public final ModuleMethod add$Mnto$Mnform$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvar$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvars;
    public final ModuleMethod android$Mnlog$Mnform;
    public LList components$Mnto$Mncreate;
    public final ModuleMethod dispatchEvent;
    public final ModuleMethod dispatchGenericEvent;
    public LList events$Mnto$Mnregister;
    public LList form$Mndo$Mnafter$Mncreation;
    public Environment form$Mnenvironment;
    public Symbol form$Mnname$Mnsymbol;
    public final ModuleMethod get$Mnsimple$Mnname;
    public Environment global$Mnvar$Mnenvironment;
    public LList global$Mnvars$Mnto$Mncreate;
    public final ModuleMethod is$Mnbound$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod lookup$Mnhandler;
    public final ModuleMethod lookup$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod onCreate;
    public final ModuleMethod process$Mnexception;
    public final ModuleMethod send$Mnerror;

    /* compiled from: Etape2.yail */
    public class frame extends ModuleBody {
        Etape2 $main = this;

        public int match1(ModuleMethod moduleMethod, Object obj, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 1:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f236pc = 1;
                    return 0;
                case 2:
                    if (!(obj instanceof Etape2)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f236pc = 1;
                    return 0;
                case 3:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f236pc = 1;
                    return 0;
                case 5:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f236pc = 1;
                    return 0;
                case 7:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f236pc = 1;
                    return 0;
                case 12:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f236pc = 1;
                    return 0;
                case 13:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f236pc = 1;
                    return 0;
                case 14:
                    if (!(obj instanceof Etape2)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f236pc = 1;
                    return 0;
                default:
                    return super.match1(moduleMethod, obj, callContext);
            }
        }

        public int match2(ModuleMethod moduleMethod, Object obj, Object obj2, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 4:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.f236pc = 2;
                    return 0;
                case 5:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.f236pc = 2;
                    return 0;
                case 8:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.f236pc = 2;
                    return 0;
                case 9:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.f236pc = 2;
                    return 0;
                case 11:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.f236pc = 2;
                    return 0;
                case 17:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.f236pc = 2;
                    return 0;
                default:
                    return super.match2(moduleMethod, obj, obj2, callContext);
            }
        }

        public int match4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 10:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.value3 = obj3;
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.f236pc = 4;
                    return 0;
                case 15:
                    if (!(obj instanceof Etape2)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    if (!(obj2 instanceof Component)) {
                        return -786430;
                    }
                    callContext.value2 = obj2;
                    if (!(obj3 instanceof String)) {
                        return -786429;
                    }
                    callContext.value3 = obj3;
                    if (!(obj4 instanceof String)) {
                        return -786428;
                    }
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.f236pc = 4;
                    return 0;
                case 16:
                    if (!(obj instanceof Etape2)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    if (!(obj2 instanceof Component)) {
                        return -786430;
                    }
                    callContext.value2 = obj2;
                    if (!(obj3 instanceof String)) {
                        return -786429;
                    }
                    callContext.value3 = obj3;
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.f236pc = 4;
                    return 0;
                default:
                    return super.match4(moduleMethod, obj, obj2, obj3, obj4, callContext);
            }
        }

        public Object apply1(ModuleMethod moduleMethod, Object obj) {
            switch (moduleMethod.selector) {
                case 1:
                    return this.$main.getSimpleName(obj);
                case 2:
                    try {
                        this.$main.onCreate((Bundle) obj);
                        return Values.empty;
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "onCreate", 1, obj);
                    }
                case 3:
                    this.$main.androidLogForm(obj);
                    return Values.empty;
                case 5:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj);
                    } catch (ClassCastException e2) {
                        throw new WrongType(e2, "lookup-in-form-environment", 1, obj);
                    }
                case 7:
                    try {
                        return this.$main.isBoundInFormEnvironment((Symbol) obj) ? Boolean.TRUE : Boolean.FALSE;
                    } catch (ClassCastException e3) {
                        throw new WrongType(e3, "is-bound-in-form-environment", 1, obj);
                    }
                case 12:
                    this.$main.addToFormDoAfterCreation(obj);
                    return Values.empty;
                case 13:
                    this.$main.sendError(obj);
                    return Values.empty;
                case 14:
                    this.$main.processException(obj);
                    return Values.empty;
                default:
                    return super.apply1(moduleMethod, obj);
            }
        }

        public Object apply4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4) {
            boolean z = true;
            switch (moduleMethod.selector) {
                case 10:
                    this.$main.addToComponents(obj, obj2, obj3, obj4);
                    return Values.empty;
                case 15:
                    try {
                        try {
                            try {
                                try {
                                    return this.$main.dispatchEvent((Component) obj, (String) obj2, (String) obj3, (Object[]) obj4) ? Boolean.TRUE : Boolean.FALSE;
                                } catch (ClassCastException e) {
                                    throw new WrongType(e, "dispatchEvent", 4, obj4);
                                }
                            } catch (ClassCastException e2) {
                                throw new WrongType(e2, "dispatchEvent", 3, obj3);
                            }
                        } catch (ClassCastException e3) {
                            throw new WrongType(e3, "dispatchEvent", 2, obj2);
                        }
                    } catch (ClassCastException e4) {
                        throw new WrongType(e4, "dispatchEvent", 1, obj);
                    }
                case 16:
                    Etape2 etape2 = this.$main;
                    try {
                        Component component = (Component) obj;
                        try {
                            String str = (String) obj2;
                            try {
                                if (obj3 == Boolean.FALSE) {
                                    z = false;
                                }
                                try {
                                    etape2.dispatchGenericEvent(component, str, z, (Object[]) obj4);
                                    return Values.empty;
                                } catch (ClassCastException e5) {
                                    throw new WrongType(e5, "dispatchGenericEvent", 4, obj4);
                                }
                            } catch (ClassCastException e6) {
                                throw new WrongType(e6, "dispatchGenericEvent", 3, obj3);
                            }
                        } catch (ClassCastException e7) {
                            throw new WrongType(e7, "dispatchGenericEvent", 2, obj2);
                        }
                    } catch (ClassCastException e8) {
                        throw new WrongType(e8, "dispatchGenericEvent", 1, obj);
                    }
                default:
                    return super.apply4(moduleMethod, obj, obj2, obj3, obj4);
            }
        }

        public Object apply2(ModuleMethod moduleMethod, Object obj, Object obj2) {
            switch (moduleMethod.selector) {
                case 4:
                    try {
                        this.$main.addToFormEnvironment((Symbol) obj, obj2);
                        return Values.empty;
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "add-to-form-environment", 1, obj);
                    }
                case 5:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj, obj2);
                    } catch (ClassCastException e2) {
                        throw new WrongType(e2, "lookup-in-form-environment", 1, obj);
                    }
                case 8:
                    try {
                        this.$main.addToGlobalVarEnvironment((Symbol) obj, obj2);
                        return Values.empty;
                    } catch (ClassCastException e3) {
                        throw new WrongType(e3, "add-to-global-var-environment", 1, obj);
                    }
                case 9:
                    this.$main.addToEvents(obj, obj2);
                    return Values.empty;
                case 11:
                    this.$main.addToGlobalVars(obj, obj2);
                    return Values.empty;
                case 17:
                    return this.$main.lookupHandler(obj, obj2);
                default:
                    return super.apply2(moduleMethod, obj, obj2);
            }
        }

        public Object apply0(ModuleMethod moduleMethod) {
            switch (moduleMethod.selector) {
                case 18:
                    return Etape2.lambda2();
                case 19:
                    this.$main.$define();
                    return Values.empty;
                case 20:
                    return Etape2.lambda3();
                case 21:
                    return this.$main.Etape2$Initialize();
                case 22:
                    return Etape2.lambda4();
                case 23:
                    return Etape2.lambda5();
                case 24:
                    return Etape2.lambda6();
                case 25:
                    return Etape2.lambda7();
                case 26:
                    return Etape2.lambda8();
                case 27:
                    return Etape2.lambda9();
                case 28:
                    return this.$main.ImagePicker1$AfterPicking();
                case 29:
                    return Etape2.lambda10();
                case 30:
                    return Etape2.lambda11();
                case 31:
                    return Etape2.lambda12();
                case 32:
                    return Etape2.lambda13();
                case 33:
                    return Etape2.lambda14();
                case 34:
                    return Etape2.lambda15();
                case 35:
                    return Etape2.lambda16();
                case 36:
                    return Etape2.lambda17();
                case 37:
                    return this.$main.Button1$Click();
                case 38:
                    return Etape2.lambda18();
                case 39:
                    return Etape2.lambda19();
                case 40:
                    return Etape2.lambda20();
                case 41:
                    return Etape2.lambda21();
                case 42:
                    return Etape2.lambda22();
                case 43:
                    return Etape2.lambda23();
                case 44:
                    return Etape2.lambda24();
                case 45:
                    return Etape2.lambda25();
                case 46:
                    return Etape2.lambda26();
                case 47:
                    return Etape2.lambda27();
                default:
                    return super.apply0(moduleMethod);
            }
        }

        public int match0(ModuleMethod moduleMethod, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 18:
                    callContext.proc = moduleMethod;
                    callContext.f236pc = 0;
                    return 0;
                case 19:
                    callContext.proc = moduleMethod;
                    callContext.f236pc = 0;
                    return 0;
                case 20:
                    callContext.proc = moduleMethod;
                    callContext.f236pc = 0;
                    return 0;
                case 21:
                    callContext.proc = moduleMethod;
                    callContext.f236pc = 0;
                    return 0;
                case 22:
                    callContext.proc = moduleMethod;
                    callContext.f236pc = 0;
                    return 0;
                case 23:
                    callContext.proc = moduleMethod;
                    callContext.f236pc = 0;
                    return 0;
                case 24:
                    callContext.proc = moduleMethod;
                    callContext.f236pc = 0;
                    return 0;
                case 25:
                    callContext.proc = moduleMethod;
                    callContext.f236pc = 0;
                    return 0;
                case 26:
                    callContext.proc = moduleMethod;
                    callContext.f236pc = 0;
                    return 0;
                case 27:
                    callContext.proc = moduleMethod;
                    callContext.f236pc = 0;
                    return 0;
                case 28:
                    callContext.proc = moduleMethod;
                    callContext.f236pc = 0;
                    return 0;
                case 29:
                    callContext.proc = moduleMethod;
                    callContext.f236pc = 0;
                    return 0;
                case 30:
                    callContext.proc = moduleMethod;
                    callContext.f236pc = 0;
                    return 0;
                case 31:
                    callContext.proc = moduleMethod;
                    callContext.f236pc = 0;
                    return 0;
                case 32:
                    callContext.proc = moduleMethod;
                    callContext.f236pc = 0;
                    return 0;
                case 33:
                    callContext.proc = moduleMethod;
                    callContext.f236pc = 0;
                    return 0;
                case 34:
                    callContext.proc = moduleMethod;
                    callContext.f236pc = 0;
                    return 0;
                case 35:
                    callContext.proc = moduleMethod;
                    callContext.f236pc = 0;
                    return 0;
                case 36:
                    callContext.proc = moduleMethod;
                    callContext.f236pc = 0;
                    return 0;
                case 37:
                    callContext.proc = moduleMethod;
                    callContext.f236pc = 0;
                    return 0;
                case 38:
                    callContext.proc = moduleMethod;
                    callContext.f236pc = 0;
                    return 0;
                case 39:
                    callContext.proc = moduleMethod;
                    callContext.f236pc = 0;
                    return 0;
                case 40:
                    callContext.proc = moduleMethod;
                    callContext.f236pc = 0;
                    return 0;
                case 41:
                    callContext.proc = moduleMethod;
                    callContext.f236pc = 0;
                    return 0;
                case 42:
                    callContext.proc = moduleMethod;
                    callContext.f236pc = 0;
                    return 0;
                case 43:
                    callContext.proc = moduleMethod;
                    callContext.f236pc = 0;
                    return 0;
                case 44:
                    callContext.proc = moduleMethod;
                    callContext.f236pc = 0;
                    return 0;
                case 45:
                    callContext.proc = moduleMethod;
                    callContext.f236pc = 0;
                    return 0;
                case 46:
                    callContext.proc = moduleMethod;
                    callContext.f236pc = 0;
                    return 0;
                case 47:
                    callContext.proc = moduleMethod;
                    callContext.f236pc = 0;
                    return 0;
                default:
                    return super.match0(moduleMethod, callContext);
            }
        }
    }

    static {
        int[] iArr = new int[2];
        iArr[0] = -6019137;
        Lit92 = IntNum.make(iArr);
        int[] iArr2 = new int[2];
        iArr2[0] = -6019137;
        Lit88 = IntNum.make(iArr2);
        SimpleSymbol simpleSymbol = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT).readResolve();
        Lit9 = simpleSymbol;
        Lit80 = PairWithPosition.make(simpleSymbol, LList.Empty, "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Etape2.yail", 475213);
        int[] iArr3 = new int[2];
        iArr3[0] = -1;
        Lit77 = IntNum.make(iArr3);
        int[] iArr4 = new int[2];
        iArr4[0] = -1;
        Lit68 = IntNum.make(iArr4);
        int[] iArr5 = new int[2];
        iArr5[0] = -16777216;
        Lit11 = IntNum.make(iArr5);
    }

    public Etape2() {
        ModuleInfo.register(this);
        frame frame2 = new frame();
        this.get$Mnsimple$Mnname = new ModuleMethod(frame2, 1, Lit102, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.onCreate = new ModuleMethod(frame2, 2, "onCreate", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.android$Mnlog$Mnform = new ModuleMethod(frame2, 3, Lit103, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(frame2, 4, Lit104, 8194);
        this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame2, 5, Lit105, 8193);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame2, 7, Lit106, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(frame2, 8, Lit107, 8194);
        this.add$Mnto$Mnevents = new ModuleMethod(frame2, 9, Lit108, 8194);
        this.add$Mnto$Mncomponents = new ModuleMethod(frame2, 10, Lit109, 16388);
        this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(frame2, 11, Lit110, 8194);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(frame2, 12, Lit111, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.send$Mnerror = new ModuleMethod(frame2, 13, Lit112, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.process$Mnexception = new ModuleMethod(frame2, 14, "process-exception", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.dispatchEvent = new ModuleMethod(frame2, 15, Lit113, 16388);
        this.dispatchGenericEvent = new ModuleMethod(frame2, 16, Lit114, 16388);
        this.lookup$Mnhandler = new ModuleMethod(frame2, 17, Lit115, 8194);
        ModuleMethod moduleMethod = new ModuleMethod(frame2, 18, null, 0);
        moduleMethod.setProperty("source-location", "/tmp/runtime6981015161475740401.scm:622");
        lambda$Fn1 = moduleMethod;
        this.$define = new ModuleMethod(frame2, 19, "$define", 0);
        lambda$Fn2 = new ModuleMethod(frame2, 20, null, 0);
        this.Etape2$Initialize = new ModuleMethod(frame2, 21, Lit30, 0);
        lambda$Fn3 = new ModuleMethod(frame2, 22, null, 0);
        lambda$Fn4 = new ModuleMethod(frame2, 23, null, 0);
        lambda$Fn5 = new ModuleMethod(frame2, 24, null, 0);
        lambda$Fn6 = new ModuleMethod(frame2, 25, null, 0);
        lambda$Fn7 = new ModuleMethod(frame2, 26, null, 0);
        lambda$Fn8 = new ModuleMethod(frame2, 27, null, 0);
        this.ImagePicker1$AfterPicking = new ModuleMethod(frame2, 28, Lit54, 0);
        lambda$Fn9 = new ModuleMethod(frame2, 29, null, 0);
        lambda$Fn10 = new ModuleMethod(frame2, 30, null, 0);
        lambda$Fn11 = new ModuleMethod(frame2, 31, null, 0);
        lambda$Fn12 = new ModuleMethod(frame2, 32, null, 0);
        lambda$Fn13 = new ModuleMethod(frame2, 33, null, 0);
        lambda$Fn14 = new ModuleMethod(frame2, 34, null, 0);
        lambda$Fn15 = new ModuleMethod(frame2, 35, null, 0);
        lambda$Fn16 = new ModuleMethod(frame2, 36, null, 0);
        this.Button1$Click = new ModuleMethod(frame2, 37, Lit81, 0);
        lambda$Fn17 = new ModuleMethod(frame2, 38, null, 0);
        lambda$Fn18 = new ModuleMethod(frame2, 39, null, 0);
        lambda$Fn19 = new ModuleMethod(frame2, 40, null, 0);
        lambda$Fn20 = new ModuleMethod(frame2, 41, null, 0);
        lambda$Fn21 = new ModuleMethod(frame2, 42, null, 0);
        lambda$Fn22 = new ModuleMethod(frame2, 43, null, 0);
        lambda$Fn23 = new ModuleMethod(frame2, 44, null, 0);
        lambda$Fn24 = new ModuleMethod(frame2, 45, null, 0);
        lambda$Fn25 = new ModuleMethod(frame2, 46, null, 0);
        lambda$Fn26 = new ModuleMethod(frame2, 47, null, 0);
    }

    public Object lookupInFormEnvironment(Symbol symbol) {
        return lookupInFormEnvironment(symbol, Boolean.FALSE);
    }

    public void run() {
        CallContext instance = CallContext.getInstance();
        Consumer consumer = instance.consumer;
        instance.consumer = VoidConsumer.instance;
        try {
            run(instance);
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        ModuleBody.runCleanup(instance, th, consumer);
    }

    public final void run(CallContext $ctx) {
        String obj;
        Consumer $result = $ctx.consumer;
        C0608runtime.$instance.run();
        this.$Stdebug$Mnform$St = Boolean.FALSE;
        this.form$Mnenvironment = Environment.make(misc.symbol$To$String(Lit0));
        FString stringAppend = strings.stringAppend(misc.symbol$To$String(Lit0), "-global-vars");
        if (stringAppend == null) {
            obj = null;
        } else {
            obj = stringAppend.toString();
        }
        this.global$Mnvar$Mnenvironment = Environment.make(obj);
        Etape2 = null;
        this.form$Mnname$Mnsymbol = Lit0;
        this.events$Mnto$Mnregister = LList.Empty;
        this.components$Mnto$Mncreate = LList.Empty;
        this.global$Mnvars$Mnto$Mncreate = LList.Empty;
        this.form$Mndo$Mnafter$Mncreation = LList.Empty;
        C0608runtime.$instance.run();
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit3, Lit4, Lit5);
            C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit6, Boolean.TRUE, Lit7);
            C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit8, "MySadWorld", Lit9);
            C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit10, Lit11, Lit5);
            C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit12, "slidehorizontal", Lit9);
            C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit13, "slidehorizontal", Lit9);
            C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit14, Lit15, Lit5);
            C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit16, Lit17, Lit5);
            C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit18, "portrait", Lit9);
            C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit19, Boolean.TRUE, Lit7);
            C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit20, "Fixed", Lit9);
            C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit21, "AppTheme", Lit9);
            C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit22, "Etape2", Lit9);
            Values.writeValues(C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit23, Boolean.FALSE, Lit7), $result);
        } else {
            addToFormDoAfterCreation(new Promise(lambda$Fn2));
        }
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            C0608runtime.addToCurrentFormEnvironment(Lit30, this.Etape2$Initialize);
        } else {
            addToFormEnvironment(Lit30, this.Etape2$Initialize);
        }
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0608runtime.$Stthis$Mnform$St, "Etape2", "Initialize");
        } else {
            addToEvents(Lit0, Lit31);
        }
        this.HorizontalArrangement1 = null;
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0608runtime.addComponentWithinRepl(Lit0, Lit32, Lit33, lambda$Fn3), $result);
        } else {
            addToComponents(Lit0, Lit37, Lit33, lambda$Fn4);
        }
        this.VerticalArrangement1 = null;
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0608runtime.addComponentWithinRepl(Lit33, Lit38, Lit39, lambda$Fn5), $result);
        } else {
            addToComponents(Lit33, Lit44, Lit39, lambda$Fn6);
        }
        this.ImagePicker1 = null;
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0608runtime.addComponentWithinRepl(Lit39, Lit45, Lit46, lambda$Fn7), $result);
        } else {
            addToComponents(Lit39, Lit49, Lit46, lambda$Fn8);
        }
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            C0608runtime.addToCurrentFormEnvironment(Lit54, this.ImagePicker1$AfterPicking);
        } else {
            addToFormEnvironment(Lit54, this.ImagePicker1$AfterPicking);
        }
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0608runtime.$Stthis$Mnform$St, "ImagePicker1", "AfterPicking");
        } else {
            addToEvents(Lit46, Lit55);
        }
        this.HorizontalArrangement2 = null;
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0608runtime.addComponentWithinRepl(Lit39, Lit56, Lit57, lambda$Fn9), $result);
        } else {
            addToComponents(Lit39, Lit59, Lit57, lambda$Fn10);
        }
        this.Label1 = null;
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0608runtime.addComponentWithinRepl(Lit39, Lit60, Lit24, lambda$Fn11), $result);
        } else {
            addToComponents(Lit39, Lit69, Lit24, lambda$Fn12);
        }
        this.HorizontalArrangement3 = null;
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0608runtime.addComponentWithinRepl(Lit39, Lit70, Lit71, lambda$Fn13), $result);
        } else {
            addToComponents(Lit39, Lit73, Lit71, lambda$Fn14);
        }
        this.Button1 = null;
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0608runtime.addComponentWithinRepl(Lit39, Lit74, Lit75, lambda$Fn15), $result);
        } else {
            addToComponents(Lit39, Lit79, Lit75, lambda$Fn16);
        }
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            C0608runtime.addToCurrentFormEnvironment(Lit81, this.Button1$Click);
        } else {
            addToFormEnvironment(Lit81, this.Button1$Click);
        }
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0608runtime.$Stthis$Mnform$St, "Button1", "Click");
        } else {
            addToEvents(Lit75, Lit82);
        }
        this.HorizontalArrangement4 = null;
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0608runtime.addComponentWithinRepl(Lit0, Lit83, Lit84, lambda$Fn17), $result);
        } else {
            addToComponents(Lit0, Lit85, Lit84, lambda$Fn18);
        }
        this.HorizontalArrangement5 = null;
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0608runtime.addComponentWithinRepl(Lit84, Lit86, Lit87, lambda$Fn19), $result);
        } else {
            addToComponents(Lit84, Lit89, Lit87, lambda$Fn20);
        }
        this.HorizontalArrangement7 = null;
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0608runtime.addComponentWithinRepl(Lit84, Lit90, Lit91, lambda$Fn21), $result);
        } else {
            addToComponents(Lit84, Lit93, Lit91, lambda$Fn22);
        }
        this.HorizontalArrangement8 = null;
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0608runtime.addComponentWithinRepl(Lit84, Lit94, Lit95, lambda$Fn23), $result);
        } else {
            addToComponents(Lit84, Lit96, Lit95, lambda$Fn24);
        }
        this.HorizontalArrangement6 = null;
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0608runtime.addComponentWithinRepl(Lit84, Lit97, Lit98, lambda$Fn25), $result);
        } else {
            addToComponents(Lit84, Lit99, Lit98, lambda$Fn26);
        }
        this.TinyDB1 = null;
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0608runtime.addComponentWithinRepl(Lit0, Lit100, Lit26, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit101, Lit26, Boolean.FALSE);
        }
        C0608runtime.initRuntime();
    }

    static Object lambda3() {
        C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit3, Lit4, Lit5);
        C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit6, Boolean.TRUE, Lit7);
        C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit8, "MySadWorld", Lit9);
        C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit10, Lit11, Lit5);
        C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit12, "slidehorizontal", Lit9);
        C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit13, "slidehorizontal", Lit9);
        C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit14, Lit15, Lit5);
        C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit16, Lit17, Lit5);
        C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit18, "portrait", Lit9);
        C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit19, Boolean.TRUE, Lit7);
        C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit20, "Fixed", Lit9);
        C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit21, "AppTheme", Lit9);
        C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit22, "Etape2", Lit9);
        return C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit23, Boolean.FALSE, Lit7);
    }

    public Object Etape2$Initialize() {
        C0608runtime.setThisForm();
        return C0608runtime.setAndCoerceProperty$Ex(Lit24, Lit25, C0608runtime.callYailPrimitive(strings.string$Mnappend, LList.list2(C0608runtime.callComponentMethod(Lit26, Lit27, LList.list2("name", "NULL"), Lit28), " ! Quel joli prénom. Vous pouvez maintenant mettre une photo de profil en cliquant sur le logo rose"), Lit29, "join"), Lit9);
    }

    static Object lambda4() {
        C0608runtime.setAndCoerceProperty$Ex(Lit33, Lit34, Lit35, Lit5);
        return C0608runtime.setAndCoerceProperty$Ex(Lit33, Lit36, Lit35, Lit5);
    }

    static Object lambda5() {
        C0608runtime.setAndCoerceProperty$Ex(Lit33, Lit34, Lit35, Lit5);
        return C0608runtime.setAndCoerceProperty$Ex(Lit33, Lit36, Lit35, Lit5);
    }

    static Object lambda6() {
        C0608runtime.setAndCoerceProperty$Ex(Lit39, Lit40, Lit41, Lit5);
        C0608runtime.setAndCoerceProperty$Ex(Lit39, Lit42, Lit43, Lit5);
        C0608runtime.setAndCoerceProperty$Ex(Lit39, Lit34, Lit35, Lit5);
        return C0608runtime.setAndCoerceProperty$Ex(Lit39, Lit36, Lit35, Lit5);
    }

    static Object lambda7() {
        C0608runtime.setAndCoerceProperty$Ex(Lit39, Lit40, Lit41, Lit5);
        C0608runtime.setAndCoerceProperty$Ex(Lit39, Lit42, Lit43, Lit5);
        C0608runtime.setAndCoerceProperty$Ex(Lit39, Lit34, Lit35, Lit5);
        return C0608runtime.setAndCoerceProperty$Ex(Lit39, Lit36, Lit35, Lit5);
    }

    static Object lambda8() {
        C0608runtime.setAndCoerceProperty$Ex(Lit46, Lit34, Lit47, Lit5);
        C0608runtime.setAndCoerceProperty$Ex(Lit46, Lit48, "user-circle.png", Lit9);
        return C0608runtime.setAndCoerceProperty$Ex(Lit46, Lit36, Lit47, Lit5);
    }

    static Object lambda9() {
        C0608runtime.setAndCoerceProperty$Ex(Lit46, Lit34, Lit47, Lit5);
        C0608runtime.setAndCoerceProperty$Ex(Lit46, Lit48, "user-circle.png", Lit9);
        return C0608runtime.setAndCoerceProperty$Ex(Lit46, Lit36, Lit47, Lit5);
    }

    public Object ImagePicker1$AfterPicking() {
        C0608runtime.setThisForm();
        C0608runtime.setAndCoerceProperty$Ex(Lit46, Lit48, C0608runtime.get$Mnproperty.apply2(Lit46, Lit50), Lit9);
        C0608runtime.callComponentMethod(Lit26, Lit51, LList.list2("picture", C0608runtime.get$Mnproperty.apply2(Lit46, Lit50)), Lit52);
        return C0608runtime.callYailPrimitive(C0608runtime.open$Mnanother$Mnscreen, LList.list1("Etape3"), Lit53, "open another screen");
    }

    static Object lambda10() {
        C0608runtime.setAndCoerceProperty$Ex(Lit57, Lit34, Lit58, Lit5);
        return C0608runtime.setAndCoerceProperty$Ex(Lit57, Lit36, Lit35, Lit5);
    }

    static Object lambda11() {
        C0608runtime.setAndCoerceProperty$Ex(Lit57, Lit34, Lit58, Lit5);
        return C0608runtime.setAndCoerceProperty$Ex(Lit57, Lit36, Lit35, Lit5);
    }

    static Object lambda12() {
        C0608runtime.setAndCoerceProperty$Ex(Lit24, Lit61, Boolean.TRUE, Lit7);
        C0608runtime.setAndCoerceProperty$Ex(Lit24, Lit62, Lit63, Lit5);
        C0608runtime.setAndCoerceProperty$Ex(Lit24, Lit64, Lit65, Lit5);
        C0608runtime.setAndCoerceProperty$Ex(Lit24, Lit25, "Alex ! Quel joli prénom. Vous pouvez maintenant mettre une photo de profil en cliquant sur le logo rose", Lit9);
        C0608runtime.setAndCoerceProperty$Ex(Lit24, Lit66, Lit65, Lit5);
        return C0608runtime.setAndCoerceProperty$Ex(Lit24, Lit67, Lit68, Lit5);
    }

    static Object lambda13() {
        C0608runtime.setAndCoerceProperty$Ex(Lit24, Lit61, Boolean.TRUE, Lit7);
        C0608runtime.setAndCoerceProperty$Ex(Lit24, Lit62, Lit63, Lit5);
        C0608runtime.setAndCoerceProperty$Ex(Lit24, Lit64, Lit65, Lit5);
        C0608runtime.setAndCoerceProperty$Ex(Lit24, Lit25, "Alex ! Quel joli prénom. Vous pouvez maintenant mettre une photo de profil en cliquant sur le logo rose", Lit9);
        C0608runtime.setAndCoerceProperty$Ex(Lit24, Lit66, Lit65, Lit5);
        return C0608runtime.setAndCoerceProperty$Ex(Lit24, Lit67, Lit68, Lit5);
    }

    static Object lambda14() {
        C0608runtime.setAndCoerceProperty$Ex(Lit71, Lit34, Lit72, Lit5);
        return C0608runtime.setAndCoerceProperty$Ex(Lit71, Lit36, Lit35, Lit5);
    }

    static Object lambda15() {
        C0608runtime.setAndCoerceProperty$Ex(Lit71, Lit34, Lit72, Lit5);
        return C0608runtime.setAndCoerceProperty$Ex(Lit71, Lit36, Lit35, Lit5);
    }

    static Object lambda16() {
        C0608runtime.setAndCoerceProperty$Ex(Lit75, Lit61, Boolean.TRUE, Lit7);
        C0608runtime.setAndCoerceProperty$Ex(Lit75, Lit34, Lit76, Lit5);
        C0608runtime.setAndCoerceProperty$Ex(Lit75, Lit48, "therare_b.png", Lit9);
        C0608runtime.setAndCoerceProperty$Ex(Lit75, Lit25, "Passer cette étape", Lit9);
        C0608runtime.setAndCoerceProperty$Ex(Lit75, Lit67, Lit77, Lit5);
        return C0608runtime.setAndCoerceProperty$Ex(Lit75, Lit36, Lit78, Lit5);
    }

    static Object lambda17() {
        C0608runtime.setAndCoerceProperty$Ex(Lit75, Lit61, Boolean.TRUE, Lit7);
        C0608runtime.setAndCoerceProperty$Ex(Lit75, Lit34, Lit76, Lit5);
        C0608runtime.setAndCoerceProperty$Ex(Lit75, Lit48, "therare_b.png", Lit9);
        C0608runtime.setAndCoerceProperty$Ex(Lit75, Lit25, "Passer cette étape", Lit9);
        C0608runtime.setAndCoerceProperty$Ex(Lit75, Lit67, Lit77, Lit5);
        return C0608runtime.setAndCoerceProperty$Ex(Lit75, Lit36, Lit78, Lit5);
    }

    public Object Button1$Click() {
        C0608runtime.setThisForm();
        return C0608runtime.callYailPrimitive(C0608runtime.open$Mnanother$Mnscreen, LList.list1("Etape3"), Lit80, "open another screen");
    }

    static Object lambda18() {
        C0608runtime.setAndCoerceProperty$Ex(Lit84, Lit34, Lit72, Lit5);
        return C0608runtime.setAndCoerceProperty$Ex(Lit84, Lit36, Lit35, Lit5);
    }

    static Object lambda19() {
        C0608runtime.setAndCoerceProperty$Ex(Lit84, Lit34, Lit72, Lit5);
        return C0608runtime.setAndCoerceProperty$Ex(Lit84, Lit36, Lit35, Lit5);
    }

    static Object lambda20() {
        C0608runtime.setAndCoerceProperty$Ex(Lit87, Lit10, Lit88, Lit5);
        C0608runtime.setAndCoerceProperty$Ex(Lit87, Lit34, Lit72, Lit5);
        return C0608runtime.setAndCoerceProperty$Ex(Lit87, Lit36, Lit35, Lit5);
    }

    static Object lambda21() {
        C0608runtime.setAndCoerceProperty$Ex(Lit87, Lit10, Lit88, Lit5);
        C0608runtime.setAndCoerceProperty$Ex(Lit87, Lit34, Lit72, Lit5);
        return C0608runtime.setAndCoerceProperty$Ex(Lit87, Lit36, Lit35, Lit5);
    }

    static Object lambda22() {
        C0608runtime.setAndCoerceProperty$Ex(Lit91, Lit10, Lit92, Lit5);
        C0608runtime.setAndCoerceProperty$Ex(Lit91, Lit34, Lit72, Lit5);
        return C0608runtime.setAndCoerceProperty$Ex(Lit91, Lit36, Lit35, Lit5);
    }

    static Object lambda23() {
        C0608runtime.setAndCoerceProperty$Ex(Lit91, Lit10, Lit92, Lit5);
        C0608runtime.setAndCoerceProperty$Ex(Lit91, Lit34, Lit72, Lit5);
        return C0608runtime.setAndCoerceProperty$Ex(Lit91, Lit36, Lit35, Lit5);
    }

    static Object lambda24() {
        C0608runtime.setAndCoerceProperty$Ex(Lit95, Lit34, Lit72, Lit5);
        return C0608runtime.setAndCoerceProperty$Ex(Lit95, Lit36, Lit35, Lit5);
    }

    static Object lambda25() {
        C0608runtime.setAndCoerceProperty$Ex(Lit95, Lit34, Lit72, Lit5);
        return C0608runtime.setAndCoerceProperty$Ex(Lit95, Lit36, Lit35, Lit5);
    }

    static Object lambda26() {
        C0608runtime.setAndCoerceProperty$Ex(Lit98, Lit34, Lit72, Lit5);
        return C0608runtime.setAndCoerceProperty$Ex(Lit98, Lit36, Lit35, Lit5);
    }

    static Object lambda27() {
        C0608runtime.setAndCoerceProperty$Ex(Lit98, Lit34, Lit72, Lit5);
        return C0608runtime.setAndCoerceProperty$Ex(Lit98, Lit36, Lit35, Lit5);
    }

    public String getSimpleName(Object object) {
        return object.getClass().getSimpleName();
    }

    public void onCreate(Bundle icicle) {
        AppInventorCompatActivity.setClassicModeFromYail(false);
        super.onCreate(icicle);
    }

    public void androidLogForm(Object message) {
    }

    public void addToFormEnvironment(Symbol name, Object object) {
        androidLogForm(Format.formatToString(0, "Adding ~A to env ~A with value ~A", name, this.form$Mnenvironment, object));
        this.form$Mnenvironment.put(name, object);
    }

    public Object lookupInFormEnvironment(Symbol name, Object default$Mnvalue) {
        boolean x = ((this.form$Mnenvironment == null ? 1 : 0) + 1) & true;
        if (x) {
            if (!this.form$Mnenvironment.isBound(name)) {
                return default$Mnvalue;
            }
        } else if (!x) {
            return default$Mnvalue;
        }
        return this.form$Mnenvironment.get(name);
    }

    public boolean isBoundInFormEnvironment(Symbol name) {
        return this.form$Mnenvironment.isBound(name);
    }

    public void addToGlobalVarEnvironment(Symbol name, Object object) {
        androidLogForm(Format.formatToString(0, "Adding ~A to env ~A with value ~A", name, this.global$Mnvar$Mnenvironment, object));
        this.global$Mnvar$Mnenvironment.put(name, object);
    }

    public void addToEvents(Object component$Mnname, Object event$Mnname) {
        this.events$Mnto$Mnregister = C0620lists.cons(C0620lists.cons(component$Mnname, event$Mnname), this.events$Mnto$Mnregister);
    }

    public void addToComponents(Object container$Mnname, Object component$Mntype, Object component$Mnname, Object init$Mnthunk) {
        this.components$Mnto$Mncreate = C0620lists.cons(LList.list4(container$Mnname, component$Mntype, component$Mnname, init$Mnthunk), this.components$Mnto$Mncreate);
    }

    public void addToGlobalVars(Object var, Object val$Mnthunk) {
        this.global$Mnvars$Mnto$Mncreate = C0620lists.cons(LList.list2(var, val$Mnthunk), this.global$Mnvars$Mnto$Mncreate);
    }

    public void addToFormDoAfterCreation(Object thunk) {
        this.form$Mndo$Mnafter$Mncreation = C0620lists.cons(thunk, this.form$Mndo$Mnafter$Mncreation);
    }

    public void sendError(Object error) {
        RetValManager.sendError(error == null ? null : error.toString());
    }

    public void processException(Object ex) {
        Object apply1 = Scheme.applyToArgs.apply1(GetNamedPart.getNamedPart.apply2(ex, Lit1));
        RuntimeErrorAlert.alert(this, apply1 == null ? null : apply1.toString(), ex instanceof YailRuntimeError ? ((YailRuntimeError) ex).getErrorType() : "Runtime Error", "End Application");
    }

    public boolean dispatchEvent(Component componentObject, String registeredComponentName, String eventName, Object[] args) {
        boolean x;
        SimpleSymbol registeredObject = misc.string$To$Symbol(registeredComponentName);
        if (!isBoundInFormEnvironment(registeredObject)) {
            EventDispatcher.unregisterEventForDelegation(this, registeredComponentName, eventName);
            return false;
        } else if (lookupInFormEnvironment(registeredObject) != componentObject) {
            return false;
        } else {
            try {
                Scheme.apply.apply2(lookupHandler(registeredComponentName, eventName), LList.makeList(args, 0));
                return true;
            } catch (PermissionException exception) {
                exception.printStackTrace();
                if (this == componentObject) {
                    x = true;
                } else {
                    x = false;
                }
                if (!x ? x : IsEqual.apply(eventName, "PermissionNeeded")) {
                    processException(exception);
                } else {
                    PermissionDenied(componentObject, eventName, exception.getPermissionNeeded());
                }
                return false;
            } catch (Throwable exception2) {
                androidLogForm(exception2.getMessage());
                exception2.printStackTrace();
                processException(exception2);
                return false;
            }
        }
    }

    public void dispatchGenericEvent(Component componentObject, String eventName, boolean notAlreadyHandled, Object[] args) {
        Boolean bool;
        boolean x = true;
        Object handler = lookupInFormEnvironment(misc.string$To$Symbol(strings.stringAppend("any$", getSimpleName(componentObject), "$", eventName)));
        if (handler != Boolean.FALSE) {
            try {
                Apply apply = Scheme.apply;
                if (notAlreadyHandled) {
                    bool = Boolean.TRUE;
                } else {
                    bool = Boolean.FALSE;
                }
                apply.apply2(handler, C0620lists.cons(componentObject, C0620lists.cons(bool, LList.makeList(args, 0))));
            } catch (PermissionException exception) {
                exception.printStackTrace();
                if (this != componentObject) {
                    x = false;
                }
                if (!x ? x : IsEqual.apply(eventName, "PermissionNeeded")) {
                    processException(exception);
                } else {
                    PermissionDenied(componentObject, eventName, exception.getPermissionNeeded());
                }
            } catch (Throwable exception2) {
                androidLogForm(exception2.getMessage());
                exception2.printStackTrace();
                processException(exception2);
            }
        }
    }

    public Object lookupHandler(Object componentName, Object eventName) {
        String str = null;
        String obj = componentName == null ? null : componentName.toString();
        if (eventName != null) {
            str = eventName.toString();
        }
        return lookupInFormEnvironment(misc.string$To$Symbol(EventDispatcher.makeFullEventName(obj, str)));
    }

    public void $define() {
        Object reverse;
        Object obj;
        Object reverse2;
        Object obj2;
        Object obj3;
        Object var;
        Object component$Mnname;
        Object obj4;
        Language.setDefaults(Scheme.getInstance());
        try {
            run();
        } catch (Exception exception) {
            androidLogForm(exception.getMessage());
            processException(exception);
        }
        Etape2 = this;
        addToFormEnvironment(Lit0, this);
        Object obj5 = this.events$Mnto$Mnregister;
        while (obj5 != LList.Empty) {
            try {
                Pair arg0 = (Pair) obj5;
                Object event$Mninfo = arg0.getCar();
                Object apply1 = C0620lists.car.apply1(event$Mninfo);
                String obj6 = apply1 == null ? null : apply1.toString();
                Object apply12 = C0620lists.cdr.apply1(event$Mninfo);
                EventDispatcher.registerEventForDelegation(this, obj6, apply12 == null ? null : apply12.toString());
                obj5 = arg0.getCdr();
            } catch (ClassCastException e) {
                WrongType wrongType = new WrongType(e, "arg0", -2, obj5);
                throw wrongType;
            }
        }
        try {
            LList components = C0620lists.reverse(this.components$Mnto$Mncreate);
            addToGlobalVars(Lit2, lambda$Fn1);
            reverse = C0620lists.reverse(this.form$Mndo$Mnafter$Mncreation);
            while (reverse != LList.Empty) {
                Pair arg02 = (Pair) reverse;
                misc.force(arg02.getCar());
                reverse = arg02.getCdr();
            }
            obj = components;
            while (obj != LList.Empty) {
                Pair arg03 = (Pair) obj;
                Object component$Mninfo = arg03.getCar();
                component$Mnname = C0620lists.caddr.apply1(component$Mninfo);
                C0620lists.cadddr.apply1(component$Mninfo);
                Object component$Mnobject = Invoke.make.apply2(C0620lists.cadr.apply1(component$Mninfo), lookupInFormEnvironment((Symbol) C0620lists.car.apply1(component$Mninfo)));
                SlotSet.set$Mnfield$Ex.apply3(this, component$Mnname, component$Mnobject);
                addToFormEnvironment((Symbol) component$Mnname, component$Mnobject);
                obj = arg03.getCdr();
            }
            reverse2 = C0620lists.reverse(this.global$Mnvars$Mnto$Mncreate);
            while (reverse2 != LList.Empty) {
                Pair arg04 = (Pair) reverse2;
                Object var$Mnval = arg04.getCar();
                var = C0620lists.car.apply1(var$Mnval);
                addToGlobalVarEnvironment((Symbol) var, Scheme.applyToArgs.apply1(C0620lists.cadr.apply1(var$Mnval)));
                reverse2 = arg04.getCdr();
            }
            Object obj7 = components;
            obj2 = obj7;
            while (obj2 != LList.Empty) {
                Pair arg05 = (Pair) obj2;
                Object component$Mninfo2 = arg05.getCar();
                C0620lists.caddr.apply1(component$Mninfo2);
                Object init$Mnthunk = C0620lists.cadddr.apply1(component$Mninfo2);
                if (init$Mnthunk != Boolean.FALSE) {
                    Scheme.applyToArgs.apply1(init$Mnthunk);
                }
                obj2 = arg05.getCdr();
            }
            obj3 = obj7;
            while (obj3 != LList.Empty) {
                Pair arg06 = (Pair) obj3;
                Object component$Mninfo3 = arg06.getCar();
                Object component$Mnname2 = C0620lists.caddr.apply1(component$Mninfo3);
                C0620lists.cadddr.apply1(component$Mninfo3);
                callInitialize(SlotGet.field.apply2(this, component$Mnname2));
                obj3 = arg06.getCdr();
            }
        } catch (ClassCastException e2) {
            WrongType wrongType2 = new WrongType(e2, "arg0", -2, obj3);
            throw wrongType2;
        } catch (ClassCastException e3) {
            WrongType wrongType3 = new WrongType(e3, "arg0", -2, obj2);
            throw wrongType3;
        } catch (ClassCastException e4) {
            WrongType wrongType4 = new WrongType(e4, "add-to-global-var-environment", 0, var);
            throw wrongType4;
        } catch (ClassCastException e5) {
            WrongType wrongType5 = new WrongType(e5, "arg0", -2, reverse2);
            throw wrongType5;
        } catch (ClassCastException e6) {
            WrongType wrongType6 = new WrongType(e6, "add-to-form-environment", 0, component$Mnname);
            throw wrongType6;
        } catch (ClassCastException e7) {
            WrongType wrongType7 = new WrongType(e7, "lookup-in-form-environment", 0, obj4);
            throw wrongType7;
        } catch (ClassCastException e8) {
            WrongType wrongType8 = new WrongType(e8, "arg0", -2, obj);
            throw wrongType8;
        } catch (ClassCastException e9) {
            WrongType wrongType9 = new WrongType(e9, "arg0", -2, reverse);
            throw wrongType9;
        } catch (YailRuntimeError exception2) {
            processException(exception2);
        }
    }

    public static SimpleSymbol lambda1symbolAppend$V(Object[] argsArray) {
        LList symbols = LList.makeList(argsArray, 0);
        Apply apply = Scheme.apply;
        ModuleMethod moduleMethod = strings.string$Mnappend;
        Object obj = LList.Empty;
        Object obj2 = symbols;
        while (obj2 != LList.Empty) {
            try {
                Pair arg0 = (Pair) obj2;
                Object arg02 = arg0.getCdr();
                Object car = arg0.getCar();
                try {
                    obj = Pair.make(misc.symbol$To$String((Symbol) car), obj);
                    obj2 = arg02;
                } catch (ClassCastException e) {
                    throw new WrongType(e, "symbol->string", 1, car);
                }
            } catch (ClassCastException e2) {
                throw new WrongType(e2, "arg0", -2, obj2);
            }
        }
        Object apply2 = apply.apply2(moduleMethod, LList.reverseInPlace(obj));
        try {
            return misc.string$To$Symbol((CharSequence) apply2);
        } catch (ClassCastException e3) {
            throw new WrongType(e3, "string->symbol", 1, apply2);
        }
    }

    static Object lambda2() {
        return null;
    }
}