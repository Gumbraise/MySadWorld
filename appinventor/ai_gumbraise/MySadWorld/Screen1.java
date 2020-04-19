package appinventor.ai_gumbraise.MySadWorld;

import android.os.Bundle;
import android.support.p000v4.app.FragmentTransaction;
import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.AppInventorCompatActivity;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Image;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.Notifier;
import com.google.appinventor.components.runtime.TinyDB;
import com.google.appinventor.components.runtime.VerticalArrangement;
import com.google.appinventor.components.runtime.Web;
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
import gnu.kawa.servlet.HttpRequestContext;
import gnu.lists.Consumer;
import gnu.lists.FString;
import gnu.lists.LList;
import gnu.lists.Pair;
import gnu.lists.PairWithPosition;
import gnu.lists.VoidConsumer;
import gnu.mapping.CallContext;
import gnu.mapping.Environment;
import gnu.mapping.Procedure;
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

/* compiled from: Screen1.yail */
public class Screen1 extends Form implements Runnable {
    static final SimpleSymbol Lit0 = ((SimpleSymbol) new SimpleSymbol("Screen1").readResolve());
    static final SimpleSymbol Lit1 = ((SimpleSymbol) new SimpleSymbol("getMessage").readResolve());
    static final PairWithPosition Lit10 = PairWithPosition.make(Lit14, PairWithPosition.make(Lit124, LList.Empty, "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 36968), "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 36962);
    static final SimpleSymbol Lit100 = ((SimpleSymbol) new SimpleSymbol("GotText").readResolve());
    static final FString Lit101 = new FString("com.google.appinventor.components.runtime.TinyDB");
    static final FString Lit102 = new FString("com.google.appinventor.components.runtime.TinyDB");
    static final FString Lit103 = new FString("com.google.appinventor.components.runtime.Notifier");
    static final FString Lit104 = new FString("com.google.appinventor.components.runtime.Notifier");
    static final SimpleSymbol Lit105 = ((SimpleSymbol) new SimpleSymbol("$choice").readResolve());
    static final PairWithPosition Lit106 = PairWithPosition.make(Lit124, PairWithPosition.make(Lit124, LList.Empty, "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 524386), "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 524381);
    static final PairWithPosition Lit107 = PairWithPosition.make(Lit124, PairWithPosition.make(Lit124, LList.Empty, "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 524604), "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 524599);
    static final SimpleSymbol Lit108 = ((SimpleSymbol) new SimpleSymbol("Notifier1$AfterChoosing").readResolve());
    static final SimpleSymbol Lit109 = ((SimpleSymbol) new SimpleSymbol("AfterChoosing").readResolve());
    static final SimpleSymbol Lit11 = ((SimpleSymbol) new SimpleSymbol("p$web").readResolve());
    static final SimpleSymbol Lit110 = ((SimpleSymbol) new SimpleSymbol("get-simple-name").readResolve());
    static final SimpleSymbol Lit111 = ((SimpleSymbol) new SimpleSymbol("android-log-form").readResolve());
    static final SimpleSymbol Lit112 = ((SimpleSymbol) new SimpleSymbol("add-to-form-environment").readResolve());
    static final SimpleSymbol Lit113 = ((SimpleSymbol) new SimpleSymbol("lookup-in-form-environment").readResolve());
    static final SimpleSymbol Lit114 = ((SimpleSymbol) new SimpleSymbol("is-bound-in-form-environment").readResolve());
    static final SimpleSymbol Lit115 = ((SimpleSymbol) new SimpleSymbol("add-to-global-var-environment").readResolve());
    static final SimpleSymbol Lit116 = ((SimpleSymbol) new SimpleSymbol("add-to-events").readResolve());
    static final SimpleSymbol Lit117 = ((SimpleSymbol) new SimpleSymbol("add-to-components").readResolve());
    static final SimpleSymbol Lit118 = ((SimpleSymbol) new SimpleSymbol("add-to-global-vars").readResolve());
    static final SimpleSymbol Lit119 = ((SimpleSymbol) new SimpleSymbol("add-to-form-do-after-creation").readResolve());
    static final SimpleSymbol Lit12 = ((SimpleSymbol) new SimpleSymbol("Web1").readResolve());
    static final SimpleSymbol Lit120 = ((SimpleSymbol) new SimpleSymbol("send-error").readResolve());
    static final SimpleSymbol Lit121 = ((SimpleSymbol) new SimpleSymbol("dispatchEvent").readResolve());
    static final SimpleSymbol Lit122 = ((SimpleSymbol) new SimpleSymbol("dispatchGenericEvent").readResolve());
    static final SimpleSymbol Lit123 = ((SimpleSymbol) new SimpleSymbol("lookup-handler").readResolve());
    static final SimpleSymbol Lit124 = ((SimpleSymbol) new SimpleSymbol("any").readResolve());
    static final SimpleSymbol Lit13 = ((SimpleSymbol) new SimpleSymbol("Url").readResolve());
    static final SimpleSymbol Lit14;
    static final SimpleSymbol Lit15 = ((SimpleSymbol) new SimpleSymbol("Get").readResolve());
    static final SimpleSymbol Lit16 = ((SimpleSymbol) new SimpleSymbol("AccentColor").readResolve());
    static final IntNum Lit17 = IntNum.make(16777215);
    static final SimpleSymbol Lit18 = ((SimpleSymbol) new SimpleSymbol("number").readResolve());
    static final SimpleSymbol Lit19 = ((SimpleSymbol) new SimpleSymbol("ActionBar").readResolve());
    static final SimpleSymbol Lit2 = ((SimpleSymbol) new SimpleSymbol("*the-null-value*").readResolve());
    static final SimpleSymbol Lit20;
    static final SimpleSymbol Lit21 = ((SimpleSymbol) new SimpleSymbol("AppName").readResolve());
    static final SimpleSymbol Lit22 = ((SimpleSymbol) new SimpleSymbol("BackgroundImage").readResolve());
    static final SimpleSymbol Lit23 = ((SimpleSymbol) new SimpleSymbol("CloseScreenAnimation").readResolve());
    static final SimpleSymbol Lit24 = ((SimpleSymbol) new SimpleSymbol("Icon").readResolve());
    static final SimpleSymbol Lit25 = ((SimpleSymbol) new SimpleSymbol("OpenScreenAnimation").readResolve());
    static final SimpleSymbol Lit26 = ((SimpleSymbol) new SimpleSymbol("PrimaryColor").readResolve());
    static final IntNum Lit27 = IntNum.make(16777215);
    static final SimpleSymbol Lit28 = ((SimpleSymbol) new SimpleSymbol("PrimaryColorDark").readResolve());
    static final IntNum Lit29 = IntNum.make(16777215);
    static final SimpleSymbol Lit3 = ((SimpleSymbol) new SimpleSymbol("g$etape").readResolve());
    static final SimpleSymbol Lit30 = ((SimpleSymbol) new SimpleSymbol("ScreenOrientation").readResolve());
    static final SimpleSymbol Lit31 = ((SimpleSymbol) new SimpleSymbol("ShowListsAsJson").readResolve());
    static final SimpleSymbol Lit32 = ((SimpleSymbol) new SimpleSymbol("Sizing").readResolve());
    static final SimpleSymbol Lit33 = ((SimpleSymbol) new SimpleSymbol("Theme").readResolve());
    static final SimpleSymbol Lit34 = ((SimpleSymbol) new SimpleSymbol("Title").readResolve());
    static final SimpleSymbol Lit35 = ((SimpleSymbol) new SimpleSymbol("TitleVisible").readResolve());
    static final SimpleSymbol Lit36 = ((SimpleSymbol) new SimpleSymbol("Screen1$Initialize").readResolve());
    static final SimpleSymbol Lit37 = ((SimpleSymbol) new SimpleSymbol("Initialize").readResolve());
    static final FString Lit38 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit39 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement1").readResolve());
    static final SimpleSymbol Lit4 = ((SimpleSymbol) new SimpleSymbol(TinyDB.DEFAULT_NAMESPACE).readResolve());
    static final SimpleSymbol Lit40 = ((SimpleSymbol) new SimpleSymbol("BackgroundColor").readResolve());
    static final IntNum Lit41 = IntNum.make(16777215);
    static final SimpleSymbol Lit42 = ((SimpleSymbol) new SimpleSymbol("Height").readResolve());
    static final IntNum Lit43 = IntNum.make(-2);
    static final SimpleSymbol Lit44 = ((SimpleSymbol) new SimpleSymbol("Width").readResolve());
    static final FString Lit45 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit46 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final SimpleSymbol Lit47 = ((SimpleSymbol) new SimpleSymbol("VerticalArrangement1").readResolve());
    static final SimpleSymbol Lit48 = ((SimpleSymbol) new SimpleSymbol("AlignHorizontal").readResolve());
    static final IntNum Lit49 = IntNum.make(3);
    static final SimpleSymbol Lit5 = ((SimpleSymbol) new SimpleSymbol("GetValue").readResolve());
    static final SimpleSymbol Lit50 = ((SimpleSymbol) new SimpleSymbol("AlignVertical").readResolve());
    static final IntNum Lit51 = IntNum.make(2);
    static final IntNum Lit52 = IntNum.make(16777215);
    static final FString Lit53 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final FString Lit54 = new FString("com.google.appinventor.components.runtime.Image");
    static final SimpleSymbol Lit55 = ((SimpleSymbol) new SimpleSymbol("Image1").readResolve());
    static final IntNum Lit56 = IntNum.make((int) HttpRequestContext.HTTP_OK);
    static final SimpleSymbol Lit57 = ((SimpleSymbol) new SimpleSymbol("Picture").readResolve());
    static final SimpleSymbol Lit58 = ((SimpleSymbol) new SimpleSymbol("ScalePictureToFit").readResolve());
    static final FString Lit59 = new FString("com.google.appinventor.components.runtime.Image");
    static final PairWithPosition Lit6 = PairWithPosition.make(Lit14, PairWithPosition.make(Lit124, LList.Empty, "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 32865), "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 32859);
    static final FString Lit60 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit61 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement2").readResolve());
    static final IntNum Lit62 = IntNum.make(16777215);
    static final IntNum Lit63 = IntNum.make(20);
    static final FString Lit64 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit65 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit66 = ((SimpleSymbol) new SimpleSymbol("Label1").readResolve());
    static final SimpleSymbol Lit67 = ((SimpleSymbol) new SimpleSymbol("FontSize").readResolve());
    static final IntNum Lit68 = IntNum.make(14);
    static final SimpleSymbol Lit69 = ((SimpleSymbol) new SimpleSymbol("Text").readResolve());
    static final PairWithPosition Lit7 = PairWithPosition.make(Lit14, PairWithPosition.make(Lit124, LList.Empty, "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 32865), "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 32859);
    static final SimpleSymbol Lit70 = ((SimpleSymbol) new SimpleSymbol("TextAlignment").readResolve());
    static final IntNum Lit71 = IntNum.make(1);
    static final SimpleSymbol Lit72 = ((SimpleSymbol) new SimpleSymbol("TextColor").readResolve());
    static final IntNum Lit73;
    static final FString Lit74 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit75 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit76 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement3").readResolve());
    static final IntNum Lit77 = IntNum.make(16777215);
    static final IntNum Lit78 = IntNum.make(50);
    static final FString Lit79 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit8 = ((SimpleSymbol) new SimpleSymbol("g$user_id").readResolve());
    static final FString Lit80 = new FString("com.google.appinventor.components.runtime.Web");
    static final FString Lit81 = new FString("com.google.appinventor.components.runtime.Web");
    static final SimpleSymbol Lit82 = ((SimpleSymbol) new SimpleSymbol("$responseCode").readResolve());
    static final PairWithPosition Lit83 = PairWithPosition.make(Lit124, PairWithPosition.make(Lit124, LList.Empty, "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 475241), "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 475236);
    static final SimpleSymbol Lit84 = ((SimpleSymbol) new SimpleSymbol("$responseContent").readResolve());
    static final PairWithPosition Lit85 = PairWithPosition.make(Lit124, PairWithPosition.make(Lit124, LList.Empty, "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 475367), "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 475362);
    static final SimpleSymbol Lit86 = ((SimpleSymbol) new SimpleSymbol("ClearAll").readResolve());
    static final PairWithPosition Lit87 = PairWithPosition.make(Lit124, PairWithPosition.make(Lit124, LList.Empty, "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 475614), "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 475609);
    static final SimpleSymbol Lit88 = ((SimpleSymbol) new SimpleSymbol("StoreValue").readResolve());
    static final PairWithPosition Lit89 = PairWithPosition.make(Lit14, PairWithPosition.make(Lit124, LList.Empty, "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 475736), "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 475730);
    static final PairWithPosition Lit9 = PairWithPosition.make(Lit14, PairWithPosition.make(Lit124, LList.Empty, "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 36968), "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 36962);
    static final PairWithPosition Lit90 = PairWithPosition.make(Lit124, PairWithPosition.make(Lit124, LList.Empty, "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 475827), "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 475822);
    static final PairWithPosition Lit91 = PairWithPosition.make(Lit14, PairWithPosition.make(Lit124, LList.Empty, "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 475945), "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 475939);
    static final PairWithPosition Lit92 = PairWithPosition.make(Lit14, LList.Empty, "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 476022);
    static final PairWithPosition Lit93 = PairWithPosition.make(Lit14, LList.Empty, "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 476126);
    static final PairWithPosition Lit94 = PairWithPosition.make(Lit14, LList.Empty, "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 476241);
    static final SimpleSymbol Lit95 = ((SimpleSymbol) new SimpleSymbol("Notifier1").readResolve());
    static final SimpleSymbol Lit96 = ((SimpleSymbol) new SimpleSymbol("ShowChooseDialog").readResolve());
    static final PairWithPosition Lit97 = PairWithPosition.make(Lit14, PairWithPosition.make(Lit14, PairWithPosition.make(Lit14, PairWithPosition.make(Lit14, PairWithPosition.make(Lit20, LList.Empty, "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 476469), "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 476464), "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 476459), "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 476454), "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 476448);
    static final PairWithPosition Lit98;
    static final SimpleSymbol Lit99 = ((SimpleSymbol) new SimpleSymbol("Web1$GotText").readResolve());
    public static Screen1 Screen1;
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
    static final ModuleMethod lambda$Fn3 = null;
    static final ModuleMethod lambda$Fn4 = null;
    static final ModuleMethod lambda$Fn5 = null;
    static final ModuleMethod lambda$Fn6 = null;
    static final ModuleMethod lambda$Fn7 = null;
    static final ModuleMethod lambda$Fn8 = null;
    static final ModuleMethod lambda$Fn9 = null;
    public Boolean $Stdebug$Mnform$St;
    public final ModuleMethod $define;
    public HorizontalArrangement HorizontalArrangement1;
    public HorizontalArrangement HorizontalArrangement2;
    public HorizontalArrangement HorizontalArrangement3;
    public Image Image1;
    public Label Label1;
    public Notifier Notifier1;
    public final ModuleMethod Notifier1$AfterChoosing;
    public final ModuleMethod Screen1$Initialize;
    public TinyDB TinyDB1;
    public VerticalArrangement VerticalArrangement1;
    public Web Web1;
    public final ModuleMethod Web1$GotText;
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

    /* compiled from: Screen1.yail */
    public class frame extends ModuleBody {
        Screen1 $main = this;

        public Object apply0(ModuleMethod moduleMethod) {
            switch (moduleMethod.selector) {
                case 18:
                    return Screen1.lambda2();
                case 19:
                    this.$main.$define();
                    return Values.empty;
                case 20:
                    return Screen1.lambda3();
                case 21:
                    return Screen1.lambda4();
                case 22:
                    return Screen1.lambda5();
                case 23:
                    return Screen1.lambda7();
                case 24:
                    return Screen1.lambda6();
                case 25:
                    return Screen1.lambda8();
                case 26:
                    return this.$main.Screen1$Initialize();
                case 27:
                    return Screen1.lambda9();
                case 28:
                    return Screen1.lambda10();
                case 29:
                    return Screen1.lambda11();
                case 30:
                    return Screen1.lambda12();
                case 31:
                    return Screen1.lambda13();
                case 32:
                    return Screen1.lambda14();
                case 33:
                    return Screen1.lambda15();
                case 34:
                    return Screen1.lambda16();
                case 35:
                    return Screen1.lambda17();
                case 36:
                    return Screen1.lambda18();
                case 37:
                    return Screen1.lambda19();
                case 38:
                    return Screen1.lambda20();
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
                default:
                    return super.match0(moduleMethod, callContext);
            }
        }

        public int match1(ModuleMethod moduleMethod, Object obj, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 1:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f236pc = 1;
                    return 0;
                case 2:
                    if (!(obj instanceof Screen1)) {
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
                    if (!(obj instanceof Screen1)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f236pc = 1;
                    return 0;
                case 40:
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
                    if (!(obj instanceof Screen1)) {
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
                    if (!(obj instanceof Screen1)) {
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
                case 39:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
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
                case 40:
                    return this.$main.Notifier1$AfterChoosing(obj);
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
                    Screen1 screen1 = this.$main;
                    try {
                        Component component = (Component) obj;
                        try {
                            String str = (String) obj2;
                            try {
                                if (obj3 == Boolean.FALSE) {
                                    z = false;
                                }
                                try {
                                    screen1.dispatchGenericEvent(component, str, z, (Object[]) obj4);
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
                case 39:
                    return this.$main.Web1$GotText(obj, obj2, obj3, obj4);
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
    }

    static {
        SimpleSymbol simpleSymbol = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT).readResolve();
        Lit14 = simpleSymbol;
        SimpleSymbol simpleSymbol2 = Lit14;
        SimpleSymbol simpleSymbol3 = Lit14;
        SimpleSymbol simpleSymbol4 = Lit14;
        SimpleSymbol simpleSymbol5 = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_BOOLEAN).readResolve();
        Lit20 = simpleSymbol5;
        Lit98 = PairWithPosition.make(simpleSymbol, PairWithPosition.make(simpleSymbol2, PairWithPosition.make(simpleSymbol3, PairWithPosition.make(simpleSymbol4, PairWithPosition.make(simpleSymbol5, LList.Empty, "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 476675), "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 476670), "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 476665), "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 476660), "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 476654);
        int[] iArr = new int[2];
        iArr[0] = -1;
        Lit73 = IntNum.make(iArr);
    }

    public Screen1() {
        ModuleInfo.register(this);
        frame frame2 = new frame();
        this.get$Mnsimple$Mnname = new ModuleMethod(frame2, 1, Lit110, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.onCreate = new ModuleMethod(frame2, 2, "onCreate", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.android$Mnlog$Mnform = new ModuleMethod(frame2, 3, Lit111, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(frame2, 4, Lit112, 8194);
        this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame2, 5, Lit113, 8193);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame2, 7, Lit114, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(frame2, 8, Lit115, 8194);
        this.add$Mnto$Mnevents = new ModuleMethod(frame2, 9, Lit116, 8194);
        this.add$Mnto$Mncomponents = new ModuleMethod(frame2, 10, Lit117, 16388);
        this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(frame2, 11, Lit118, 8194);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(frame2, 12, Lit119, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.send$Mnerror = new ModuleMethod(frame2, 13, Lit120, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.process$Mnexception = new ModuleMethod(frame2, 14, "process-exception", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.dispatchEvent = new ModuleMethod(frame2, 15, Lit121, 16388);
        this.dispatchGenericEvent = new ModuleMethod(frame2, 16, Lit122, 16388);
        this.lookup$Mnhandler = new ModuleMethod(frame2, 17, Lit123, 8194);
        ModuleMethod moduleMethod = new ModuleMethod(frame2, 18, null, 0);
        moduleMethod.setProperty("source-location", "/tmp/runtime6981015161475740401.scm:622");
        lambda$Fn1 = moduleMethod;
        this.$define = new ModuleMethod(frame2, 19, "$define", 0);
        lambda$Fn2 = new ModuleMethod(frame2, 20, null, 0);
        lambda$Fn3 = new ModuleMethod(frame2, 21, null, 0);
        lambda$Fn4 = new ModuleMethod(frame2, 22, null, 0);
        lambda$Fn6 = new ModuleMethod(frame2, 23, null, 0);
        lambda$Fn5 = new ModuleMethod(frame2, 24, null, 0);
        lambda$Fn7 = new ModuleMethod(frame2, 25, null, 0);
        this.Screen1$Initialize = new ModuleMethod(frame2, 26, Lit36, 0);
        lambda$Fn8 = new ModuleMethod(frame2, 27, null, 0);
        lambda$Fn9 = new ModuleMethod(frame2, 28, null, 0);
        lambda$Fn10 = new ModuleMethod(frame2, 29, null, 0);
        lambda$Fn11 = new ModuleMethod(frame2, 30, null, 0);
        lambda$Fn12 = new ModuleMethod(frame2, 31, null, 0);
        lambda$Fn13 = new ModuleMethod(frame2, 32, null, 0);
        lambda$Fn14 = new ModuleMethod(frame2, 33, null, 0);
        lambda$Fn15 = new ModuleMethod(frame2, 34, null, 0);
        lambda$Fn16 = new ModuleMethod(frame2, 35, null, 0);
        lambda$Fn17 = new ModuleMethod(frame2, 36, null, 0);
        lambda$Fn18 = new ModuleMethod(frame2, 37, null, 0);
        lambda$Fn19 = new ModuleMethod(frame2, 38, null, 0);
        this.Web1$GotText = new ModuleMethod(frame2, 39, Lit99, 16388);
        this.Notifier1$AfterChoosing = new ModuleMethod(frame2, 40, Lit108, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
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
        Screen1 = null;
        this.form$Mnname$Mnsymbol = Lit0;
        this.events$Mnto$Mnregister = LList.Empty;
        this.components$Mnto$Mncreate = LList.Empty;
        this.global$Mnvars$Mnto$Mncreate = LList.Empty;
        this.form$Mndo$Mnafter$Mncreation = LList.Empty;
        C0608runtime.$instance.run();
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0608runtime.addGlobalVarToCurrentFormEnvironment(Lit3, C0608runtime.callComponentMethod(Lit4, Lit5, LList.list2("etape", "0"), Lit6)), $result);
        } else {
            addToGlobalVars(Lit3, lambda$Fn2);
        }
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0608runtime.addGlobalVarToCurrentFormEnvironment(Lit8, C0608runtime.callComponentMethod(Lit4, Lit5, LList.list2("user_id", "NULL"), Lit9)), $result);
        } else {
            addToGlobalVars(Lit8, lambda$Fn3);
        }
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0608runtime.addGlobalVarToCurrentFormEnvironment(Lit11, lambda$Fn4), $result);
        } else {
            addToGlobalVars(Lit11, lambda$Fn5);
        }
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit16, Lit17, Lit18);
            C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit19, Boolean.TRUE, Lit20);
            C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit21, "MySadWorld", Lit14);
            C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit22, "MSW_f.png", Lit14);
            C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit23, "fade", Lit14);
            C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit24, "MSW.png", Lit14);
            C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit25, "fade", Lit14);
            C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit26, Lit27, Lit18);
            C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit28, Lit29, Lit18);
            C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit30, "portrait", Lit14);
            C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit31, Boolean.TRUE, Lit20);
            C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit32, "Fixed", Lit14);
            C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit33, "AppTheme", Lit14);
            C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit34, "Init", Lit14);
            Values.writeValues(C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit35, Boolean.FALSE, Lit20), $result);
        } else {
            addToFormDoAfterCreation(new Promise(lambda$Fn7));
        }
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            C0608runtime.addToCurrentFormEnvironment(Lit36, this.Screen1$Initialize);
        } else {
            addToFormEnvironment(Lit36, this.Screen1$Initialize);
        }
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0608runtime.$Stthis$Mnform$St, "Screen1", "Initialize");
        } else {
            addToEvents(Lit0, Lit37);
        }
        this.HorizontalArrangement1 = null;
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0608runtime.addComponentWithinRepl(Lit0, Lit38, Lit39, lambda$Fn8), $result);
        } else {
            addToComponents(Lit0, Lit45, Lit39, lambda$Fn9);
        }
        this.VerticalArrangement1 = null;
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0608runtime.addComponentWithinRepl(Lit39, Lit46, Lit47, lambda$Fn10), $result);
        } else {
            addToComponents(Lit39, Lit53, Lit47, lambda$Fn11);
        }
        this.Image1 = null;
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0608runtime.addComponentWithinRepl(Lit47, Lit54, Lit55, lambda$Fn12), $result);
        } else {
            addToComponents(Lit47, Lit59, Lit55, lambda$Fn13);
        }
        this.HorizontalArrangement2 = null;
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0608runtime.addComponentWithinRepl(Lit0, Lit60, Lit61, lambda$Fn14), $result);
        } else {
            addToComponents(Lit0, Lit64, Lit61, lambda$Fn15);
        }
        this.Label1 = null;
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0608runtime.addComponentWithinRepl(Lit61, Lit65, Lit66, lambda$Fn16), $result);
        } else {
            addToComponents(Lit61, Lit74, Lit66, lambda$Fn17);
        }
        this.HorizontalArrangement3 = null;
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0608runtime.addComponentWithinRepl(Lit0, Lit75, Lit76, lambda$Fn18), $result);
        } else {
            addToComponents(Lit0, Lit79, Lit76, lambda$Fn19);
        }
        this.Web1 = null;
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0608runtime.addComponentWithinRepl(Lit0, Lit80, Lit12, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit81, Lit12, Boolean.FALSE);
        }
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            C0608runtime.addToCurrentFormEnvironment(Lit99, this.Web1$GotText);
        } else {
            addToFormEnvironment(Lit99, this.Web1$GotText);
        }
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0608runtime.$Stthis$Mnform$St, "Web1", "GotText");
        } else {
            addToEvents(Lit12, Lit100);
        }
        this.TinyDB1 = null;
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0608runtime.addComponentWithinRepl(Lit0, Lit101, Lit4, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit102, Lit4, Boolean.FALSE);
        }
        this.Notifier1 = null;
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0608runtime.addComponentWithinRepl(Lit0, Lit103, Lit95, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit104, Lit95, Boolean.FALSE);
        }
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            C0608runtime.addToCurrentFormEnvironment(Lit108, this.Notifier1$AfterChoosing);
        } else {
            addToFormEnvironment(Lit108, this.Notifier1$AfterChoosing);
        }
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0608runtime.$Stthis$Mnform$St, "Notifier1", "AfterChoosing");
        } else {
            addToEvents(Lit95, Lit109);
        }
        C0608runtime.initRuntime();
    }

    static Object lambda3() {
        return C0608runtime.callComponentMethod(Lit4, Lit5, LList.list2("etape", "0"), Lit7);
    }

    static Object lambda4() {
        return C0608runtime.callComponentMethod(Lit4, Lit5, LList.list2("user_id", "NULL"), Lit10);
    }

    static Object lambda5() {
        C0608runtime.setAndCoerceProperty$Ex(Lit12, Lit13, "http://msw.kellis.fr/maintenance.php", Lit14);
        return C0608runtime.callComponentMethod(Lit12, Lit15, LList.Empty, LList.Empty);
    }

    static Procedure lambda6() {
        return lambda$Fn6;
    }

    static Object lambda7() {
        C0608runtime.setAndCoerceProperty$Ex(Lit12, Lit13, "http://msw.kellis.fr/maintenance.php", Lit14);
        return C0608runtime.callComponentMethod(Lit12, Lit15, LList.Empty, LList.Empty);
    }

    static Object lambda8() {
        C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit16, Lit17, Lit18);
        C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit19, Boolean.TRUE, Lit20);
        C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit21, "MySadWorld", Lit14);
        C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit22, "MSW_f.png", Lit14);
        C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit23, "fade", Lit14);
        C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit24, "MSW.png", Lit14);
        C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit25, "fade", Lit14);
        C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit26, Lit27, Lit18);
        C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit28, Lit29, Lit18);
        C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit30, "portrait", Lit14);
        C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit31, Boolean.TRUE, Lit20);
        C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit32, "Fixed", Lit14);
        C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit33, "AppTheme", Lit14);
        C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit34, "Init", Lit14);
        return C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit35, Boolean.FALSE, Lit20);
    }

    public Object Screen1$Initialize() {
        C0608runtime.setThisForm();
        return Scheme.applyToArgs.apply1(C0608runtime.lookupGlobalVarInCurrentFormEnvironment(Lit11, C0608runtime.$Stthe$Mnnull$Mnvalue$St));
    }

    static Object lambda10() {
        C0608runtime.setAndCoerceProperty$Ex(Lit39, Lit40, Lit41, Lit18);
        C0608runtime.setAndCoerceProperty$Ex(Lit39, Lit42, Lit43, Lit18);
        return C0608runtime.setAndCoerceProperty$Ex(Lit39, Lit44, Lit43, Lit18);
    }

    static Object lambda9() {
        C0608runtime.setAndCoerceProperty$Ex(Lit39, Lit40, Lit41, Lit18);
        C0608runtime.setAndCoerceProperty$Ex(Lit39, Lit42, Lit43, Lit18);
        return C0608runtime.setAndCoerceProperty$Ex(Lit39, Lit44, Lit43, Lit18);
    }

    static Object lambda11() {
        C0608runtime.setAndCoerceProperty$Ex(Lit47, Lit48, Lit49, Lit18);
        C0608runtime.setAndCoerceProperty$Ex(Lit47, Lit50, Lit51, Lit18);
        C0608runtime.setAndCoerceProperty$Ex(Lit47, Lit40, Lit52, Lit18);
        C0608runtime.setAndCoerceProperty$Ex(Lit47, Lit42, Lit43, Lit18);
        return C0608runtime.setAndCoerceProperty$Ex(Lit47, Lit44, Lit43, Lit18);
    }

    static Object lambda12() {
        C0608runtime.setAndCoerceProperty$Ex(Lit47, Lit48, Lit49, Lit18);
        C0608runtime.setAndCoerceProperty$Ex(Lit47, Lit50, Lit51, Lit18);
        C0608runtime.setAndCoerceProperty$Ex(Lit47, Lit40, Lit52, Lit18);
        C0608runtime.setAndCoerceProperty$Ex(Lit47, Lit42, Lit43, Lit18);
        return C0608runtime.setAndCoerceProperty$Ex(Lit47, Lit44, Lit43, Lit18);
    }

    static Object lambda13() {
        C0608runtime.setAndCoerceProperty$Ex(Lit55, Lit42, Lit56, Lit18);
        C0608runtime.setAndCoerceProperty$Ex(Lit55, Lit57, "MSW_w.png", Lit14);
        C0608runtime.setAndCoerceProperty$Ex(Lit55, Lit58, Boolean.TRUE, Lit20);
        return C0608runtime.setAndCoerceProperty$Ex(Lit55, Lit44, Lit56, Lit18);
    }

    static Object lambda14() {
        C0608runtime.setAndCoerceProperty$Ex(Lit55, Lit42, Lit56, Lit18);
        C0608runtime.setAndCoerceProperty$Ex(Lit55, Lit57, "MSW_w.png", Lit14);
        C0608runtime.setAndCoerceProperty$Ex(Lit55, Lit58, Boolean.TRUE, Lit20);
        return C0608runtime.setAndCoerceProperty$Ex(Lit55, Lit44, Lit56, Lit18);
    }

    static Object lambda15() {
        C0608runtime.setAndCoerceProperty$Ex(Lit61, Lit48, Lit49, Lit18);
        C0608runtime.setAndCoerceProperty$Ex(Lit61, Lit50, Lit51, Lit18);
        C0608runtime.setAndCoerceProperty$Ex(Lit61, Lit40, Lit62, Lit18);
        C0608runtime.setAndCoerceProperty$Ex(Lit61, Lit42, Lit63, Lit18);
        return C0608runtime.setAndCoerceProperty$Ex(Lit61, Lit44, Lit43, Lit18);
    }

    static Object lambda16() {
        C0608runtime.setAndCoerceProperty$Ex(Lit61, Lit48, Lit49, Lit18);
        C0608runtime.setAndCoerceProperty$Ex(Lit61, Lit50, Lit51, Lit18);
        C0608runtime.setAndCoerceProperty$Ex(Lit61, Lit40, Lit62, Lit18);
        C0608runtime.setAndCoerceProperty$Ex(Lit61, Lit42, Lit63, Lit18);
        return C0608runtime.setAndCoerceProperty$Ex(Lit61, Lit44, Lit43, Lit18);
    }

    static Object lambda17() {
        C0608runtime.setAndCoerceProperty$Ex(Lit66, Lit67, Lit68, Lit18);
        C0608runtime.setAndCoerceProperty$Ex(Lit66, Lit69, "...", Lit14);
        C0608runtime.setAndCoerceProperty$Ex(Lit66, Lit70, Lit71, Lit18);
        return C0608runtime.setAndCoerceProperty$Ex(Lit66, Lit72, Lit73, Lit18);
    }

    static Object lambda18() {
        C0608runtime.setAndCoerceProperty$Ex(Lit66, Lit67, Lit68, Lit18);
        C0608runtime.setAndCoerceProperty$Ex(Lit66, Lit69, "...", Lit14);
        C0608runtime.setAndCoerceProperty$Ex(Lit66, Lit70, Lit71, Lit18);
        return C0608runtime.setAndCoerceProperty$Ex(Lit66, Lit72, Lit73, Lit18);
    }

    static Object lambda19() {
        C0608runtime.setAndCoerceProperty$Ex(Lit76, Lit40, Lit77, Lit18);
        C0608runtime.setAndCoerceProperty$Ex(Lit76, Lit42, Lit78, Lit18);
        return C0608runtime.setAndCoerceProperty$Ex(Lit76, Lit44, Lit43, Lit18);
    }

    static Object lambda20() {
        C0608runtime.setAndCoerceProperty$Ex(Lit76, Lit40, Lit77, Lit18);
        C0608runtime.setAndCoerceProperty$Ex(Lit76, Lit42, Lit78, Lit18);
        return C0608runtime.setAndCoerceProperty$Ex(Lit76, Lit44, Lit43, Lit18);
    }

    public Object Web1$GotText(Object $url, Object $responseCode, Object $responseType, Object $responseContent) {
        C0608runtime.sanitizeComponentData($url);
        Object $responseCode2 = C0608runtime.sanitizeComponentData($responseCode);
        C0608runtime.sanitizeComponentData($responseType);
        Object $responseContent2 = C0608runtime.sanitizeComponentData($responseContent);
        C0608runtime.setThisForm();
        ModuleMethod moduleMethod = C0608runtime.yail$Mnequal$Qu;
        if ($responseCode2 instanceof Package) {
            $responseCode2 = C0608runtime.signalRuntimeError(strings.stringAppend("The variable ", C0608runtime.getDisplayRepresentation(Lit82), " is not bound in the current context"), "Unbound Variable");
        }
        if (C0608runtime.callYailPrimitive(moduleMethod, LList.list2($responseCode2, "200"), Lit83, "=") != Boolean.FALSE) {
            ModuleMethod moduleMethod2 = C0608runtime.yail$Mnnot$Mnequal$Qu;
            if ($responseContent2 instanceof Package) {
                $responseContent2 = C0608runtime.signalRuntimeError(strings.stringAppend("The variable ", C0608runtime.getDisplayRepresentation(Lit84), " is not bound in the current context"), "Unbound Variable");
            }
            if (C0608runtime.callYailPrimitive(moduleMethod2, LList.list2($responseContent2, "yes"), Lit85, "=") != Boolean.FALSE) {
                C0608runtime.setAndCoerceProperty$Ex(Lit66, Lit69, "Initialisation...", Lit14);
                C0608runtime.callComponentMethod(Lit4, Lit86, LList.Empty, LList.Empty);
                if (C0608runtime.callYailPrimitive(C0608runtime.yail$Mnnot$Mnequal$Qu, LList.list2(C0608runtime.lookupGlobalVarInCurrentFormEnvironment(Lit8, C0608runtime.$Stthe$Mnnull$Mnvalue$St), "NULL"), Lit87, "=") == Boolean.FALSE) {
                    return C0608runtime.callYailPrimitive(C0608runtime.open$Mnanother$Mnscreen, LList.list1("Connexion"), Lit94, "open another screen");
                }
                C0608runtime.callComponentMethod(Lit4, Lit88, LList.list2("user_id", C0608runtime.lookupGlobalVarInCurrentFormEnvironment(Lit8, C0608runtime.$Stthe$Mnnull$Mnvalue$St)), Lit89);
                if (C0608runtime.callYailPrimitive(C0608runtime.yail$Mnequal$Qu, LList.list2(C0608runtime.lookupGlobalVarInCurrentFormEnvironment(Lit3, C0608runtime.$Stthe$Mnnull$Mnvalue$St), "0"), Lit90, "=") != Boolean.FALSE) {
                    C0608runtime.callComponentMethod(Lit4, Lit88, LList.list2("etape", C0608runtime.lookupGlobalVarInCurrentFormEnvironment(Lit3, C0608runtime.$Stthe$Mnnull$Mnvalue$St)), Lit91);
                    C0608runtime.callYailPrimitive(C0608runtime.open$Mnanother$Mnscreen, LList.list1("Etape1"), Lit92, "open another screen");
                }
                return C0608runtime.callYailPrimitive(C0608runtime.open$Mnanother$Mnscreen, LList.list1("Accueil"), Lit93, "open another screen");
            }
            SimpleSymbol simpleSymbol = Lit95;
            SimpleSymbol simpleSymbol2 = Lit96;
            Pair list1 = LList.list1("MySadWorld est en rénovation. Revenez un peu plus tard");
            LList.chain4(list1, "Maintenance", "OK", "", Boolean.FALSE);
            return C0608runtime.callComponentMethod(simpleSymbol, simpleSymbol2, list1, Lit97);
        }
        SimpleSymbol simpleSymbol3 = Lit95;
        SimpleSymbol simpleSymbol4 = Lit96;
        Pair list12 = LList.list1("Vous n'êtes pas connecté à Internet");
        LList.chain4(list12, "Erreur", "Réessayer", "", Boolean.FALSE);
        return C0608runtime.callComponentMethod(simpleSymbol3, simpleSymbol4, list12, Lit98);
    }

    public Object Notifier1$AfterChoosing(Object $choice) {
        Object obj;
        Object $choice2 = C0608runtime.sanitizeComponentData($choice);
        C0608runtime.setThisForm();
        ModuleMethod moduleMethod = C0608runtime.yail$Mnequal$Qu;
        if ($choice2 instanceof Package) {
            obj = C0608runtime.signalRuntimeError(strings.stringAppend("The variable ", C0608runtime.getDisplayRepresentation(Lit105), " is not bound in the current context"), "Unbound Variable");
        } else {
            obj = $choice2;
        }
        if (C0608runtime.callYailPrimitive(moduleMethod, LList.list2(obj, "OK"), Lit106, "=") != Boolean.FALSE) {
            return C0608runtime.callYailPrimitive(C0608runtime.close$Mnapplication, LList.Empty, LList.Empty, "close application");
        }
        ModuleMethod moduleMethod2 = C0608runtime.yail$Mnequal$Qu;
        if ($choice2 instanceof Package) {
            $choice2 = C0608runtime.signalRuntimeError(strings.stringAppend("The variable ", C0608runtime.getDisplayRepresentation(Lit105), " is not bound in the current context"), "Unbound Variable");
        }
        return C0608runtime.callYailPrimitive(moduleMethod2, LList.list2($choice2, "Réessayer"), Lit107, "=") != Boolean.FALSE ? Scheme.applyToArgs.apply1(C0608runtime.lookupGlobalVarInCurrentFormEnvironment(Lit11, C0608runtime.$Stthe$Mnnull$Mnvalue$St)) : Values.empty;
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
        Screen1 = this;
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
