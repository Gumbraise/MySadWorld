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
import com.google.appinventor.components.runtime.Notifier;
import com.google.appinventor.components.runtime.TinyDB;
import com.google.appinventor.components.runtime.WebViewer;
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
import kawa.standard.require;

/* compiled from: Accueil.yail */
public class Accueil extends Form implements Runnable {
    public static Accueil Accueil;
    static final SimpleSymbol Lit0 = ((SimpleSymbol) new SimpleSymbol("Accueil").readResolve());
    static final SimpleSymbol Lit1 = ((SimpleSymbol) new SimpleSymbol("getMessage").readResolve());
    static final SimpleSymbol Lit10;
    static final PairWithPosition Lit100 = PairWithPosition.make(Lit117, PairWithPosition.make(Lit117, LList.Empty, "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Accueil.yail", 565347), "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Accueil.yail", 565342);
    static final SimpleSymbol Lit101 = ((SimpleSymbol) new SimpleSymbol("Notifier1$AfterChoosing").readResolve());
    static final SimpleSymbol Lit102 = ((SimpleSymbol) new SimpleSymbol("AfterChoosing").readResolve());
    static final SimpleSymbol Lit103 = ((SimpleSymbol) new SimpleSymbol("get-simple-name").readResolve());
    static final SimpleSymbol Lit104 = ((SimpleSymbol) new SimpleSymbol("android-log-form").readResolve());
    static final SimpleSymbol Lit105 = ((SimpleSymbol) new SimpleSymbol("add-to-form-environment").readResolve());
    static final SimpleSymbol Lit106 = ((SimpleSymbol) new SimpleSymbol("lookup-in-form-environment").readResolve());
    static final SimpleSymbol Lit107 = ((SimpleSymbol) new SimpleSymbol("is-bound-in-form-environment").readResolve());
    static final SimpleSymbol Lit108 = ((SimpleSymbol) new SimpleSymbol("add-to-global-var-environment").readResolve());
    static final SimpleSymbol Lit109 = ((SimpleSymbol) new SimpleSymbol("add-to-events").readResolve());
    static final PairWithPosition Lit11 = PairWithPosition.make(Lit10, PairWithPosition.make(Lit117, LList.Empty, "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Accueil.yail", 33010), "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Accueil.yail", 33004);
    static final SimpleSymbol Lit110 = ((SimpleSymbol) new SimpleSymbol("add-to-components").readResolve());
    static final SimpleSymbol Lit111 = ((SimpleSymbol) new SimpleSymbol("add-to-global-vars").readResolve());
    static final SimpleSymbol Lit112 = ((SimpleSymbol) new SimpleSymbol("add-to-form-do-after-creation").readResolve());
    static final SimpleSymbol Lit113 = ((SimpleSymbol) new SimpleSymbol("send-error").readResolve());
    static final SimpleSymbol Lit114 = ((SimpleSymbol) new SimpleSymbol("dispatchEvent").readResolve());
    static final SimpleSymbol Lit115 = ((SimpleSymbol) new SimpleSymbol("dispatchGenericEvent").readResolve());
    static final SimpleSymbol Lit116 = ((SimpleSymbol) new SimpleSymbol("lookup-handler").readResolve());
    static final SimpleSymbol Lit117 = ((SimpleSymbol) new SimpleSymbol("any").readResolve());
    static final PairWithPosition Lit12 = PairWithPosition.make(Lit10, PairWithPosition.make(Lit10, LList.Empty, "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Accueil.yail", 33025), "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Accueil.yail", 33019);
    static final SimpleSymbol Lit13 = ((SimpleSymbol) new SimpleSymbol("AccentColor").readResolve());
    static final IntNum Lit14 = IntNum.make(16777215);
    static final SimpleSymbol Lit15 = ((SimpleSymbol) new SimpleSymbol("number").readResolve());
    static final SimpleSymbol Lit16 = ((SimpleSymbol) new SimpleSymbol("ActionBar").readResolve());
    static final SimpleSymbol Lit17;
    static final SimpleSymbol Lit18 = ((SimpleSymbol) new SimpleSymbol("AppName").readResolve());
    static final SimpleSymbol Lit19 = ((SimpleSymbol) new SimpleSymbol("BackgroundColor").readResolve());
    static final SimpleSymbol Lit2 = ((SimpleSymbol) new SimpleSymbol("*the-null-value*").readResolve());
    static final IntNum Lit20;
    static final SimpleSymbol Lit21 = ((SimpleSymbol) new SimpleSymbol("CloseScreenAnimation").readResolve());
    static final SimpleSymbol Lit22 = ((SimpleSymbol) new SimpleSymbol("OpenScreenAnimation").readResolve());
    static final SimpleSymbol Lit23 = ((SimpleSymbol) new SimpleSymbol("PrimaryColor").readResolve());
    static final IntNum Lit24 = IntNum.make(16777215);
    static final SimpleSymbol Lit25 = ((SimpleSymbol) new SimpleSymbol("PrimaryColorDark").readResolve());
    static final IntNum Lit26 = IntNum.make(16777215);
    static final SimpleSymbol Lit27 = ((SimpleSymbol) new SimpleSymbol("ScreenOrientation").readResolve());
    static final SimpleSymbol Lit28 = ((SimpleSymbol) new SimpleSymbol("ShowListsAsJson").readResolve());
    static final SimpleSymbol Lit29 = ((SimpleSymbol) new SimpleSymbol("Sizing").readResolve());
    static final SimpleSymbol Lit3 = ((SimpleSymbol) new SimpleSymbol("p$list").readResolve());
    static final SimpleSymbol Lit30 = ((SimpleSymbol) new SimpleSymbol("Theme").readResolve());
    static final SimpleSymbol Lit31 = ((SimpleSymbol) new SimpleSymbol("Title").readResolve());
    static final SimpleSymbol Lit32 = ((SimpleSymbol) new SimpleSymbol("TitleVisible").readResolve());
    static final SimpleSymbol Lit33 = ((SimpleSymbol) new SimpleSymbol("Notifier1").readResolve());
    static final SimpleSymbol Lit34 = ((SimpleSymbol) new SimpleSymbol("ShowChooseDialog").readResolve());
    static final PairWithPosition Lit35;
    static final SimpleSymbol Lit36 = ((SimpleSymbol) new SimpleSymbol("Accueil$BackPressed").readResolve());
    static final SimpleSymbol Lit37 = ((SimpleSymbol) new SimpleSymbol("BackPressed").readResolve());
    static final PairWithPosition Lit38 = PairWithPosition.make(Lit10, PairWithPosition.make(Lit117, LList.Empty, "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Accueil.yail", 123034), "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Accueil.yail", 123028);
    static final PairWithPosition Lit39 = PairWithPosition.make(Lit117, PairWithPosition.make(Lit117, LList.Empty, "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Accueil.yail", 123054), "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Accueil.yail", 123049);
    static final SimpleSymbol Lit4 = ((SimpleSymbol) new SimpleSymbol("WebViewer1").readResolve());
    static final SimpleSymbol Lit40 = ((SimpleSymbol) new SimpleSymbol("ShowAlert").readResolve());
    static final PairWithPosition Lit41 = PairWithPosition.make(Lit10, LList.Empty, "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Accueil.yail", 123234);
    static final PairWithPosition Lit42 = PairWithPosition.make(Lit10, LList.Empty, "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Accueil.yail", 123316);
    static final SimpleSymbol Lit43 = ((SimpleSymbol) new SimpleSymbol("Accueil$Initialize").readResolve());
    static final SimpleSymbol Lit44 = ((SimpleSymbol) new SimpleSymbol("Initialize").readResolve());
    static final FString Lit45 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit46 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement1").readResolve());
    static final SimpleSymbol Lit47 = ((SimpleSymbol) new SimpleSymbol("AlignHorizontal").readResolve());
    static final IntNum Lit48 = IntNum.make(3);
    static final SimpleSymbol Lit49 = ((SimpleSymbol) new SimpleSymbol("AlignVertical").readResolve());
    static final SimpleSymbol Lit5 = ((SimpleSymbol) new SimpleSymbol("HomeUrl").readResolve());
    static final IntNum Lit50 = IntNum.make(2);
    static final IntNum Lit51;
    static final SimpleSymbol Lit52 = ((SimpleSymbol) new SimpleSymbol("Height").readResolve());
    static final IntNum Lit53 = IntNum.make(50);
    static final SimpleSymbol Lit54 = ((SimpleSymbol) new SimpleSymbol("Width").readResolve());
    static final IntNum Lit55 = IntNum.make(-2);
    static final FString Lit56 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit57 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit58 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement2").readResolve());
    static final IntNum Lit59 = IntNum.make(16777215);
    static final SimpleSymbol Lit6 = ((SimpleSymbol) new SimpleSymbol(TinyDB.DEFAULT_NAMESPACE).readResolve());
    static final FString Lit60 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit61 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit62 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement5").readResolve());
    static final IntNum Lit63 = IntNum.make(16777215);
    static final IntNum Lit64 = IntNum.make(10);
    static final FString Lit65 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit66 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit67 = ((SimpleSymbol) new SimpleSymbol("Button1").readResolve());
    static final IntNum Lit68 = IntNum.make(30);
    static final SimpleSymbol Lit69 = ((SimpleSymbol) new SimpleSymbol("Image").readResolve());
    static final SimpleSymbol Lit7 = ((SimpleSymbol) new SimpleSymbol("GetValue").readResolve());
    static final SimpleSymbol Lit70 = ((SimpleSymbol) new SimpleSymbol("Shape").readResolve());
    static final IntNum Lit71 = IntNum.make(1);
    static final FString Lit72 = new FString("com.google.appinventor.components.runtime.Button");
    static final PairWithPosition Lit73 = PairWithPosition.make(Lit10, PairWithPosition.make(Lit117, LList.Empty, "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Accueil.yail", 327913), "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Accueil.yail", 327907);
    static final PairWithPosition Lit74 = PairWithPosition.make(Lit10, PairWithPosition.make(Lit10, LList.Empty, "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Accueil.yail", 327928), "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Accueil.yail", 327922);
    static final SimpleSymbol Lit75 = ((SimpleSymbol) new SimpleSymbol("Button1$Click").readResolve());
    static final SimpleSymbol Lit76 = ((SimpleSymbol) new SimpleSymbol("Click").readResolve());
    static final FString Lit77 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit78 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement4").readResolve());
    static final IntNum Lit79 = IntNum.make(16777215);
    static final PairWithPosition Lit8 = PairWithPosition.make(Lit10, PairWithPosition.make(Lit117, LList.Empty, "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Accueil.yail", 33010), "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Accueil.yail", 33004);
    static final FString Lit80 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit81 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit82 = ((SimpleSymbol) new SimpleSymbol("Button2").readResolve());
    static final IntNum Lit83 = IntNum.make(100);
    static final FString Lit84 = new FString("com.google.appinventor.components.runtime.Button");
    static final PairWithPosition Lit85 = PairWithPosition.make(Lit10, PairWithPosition.make(Lit117, LList.Empty, "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Accueil.yail", 434406), "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Accueil.yail", 434400);
    static final PairWithPosition Lit86;
    static final SimpleSymbol Lit87 = ((SimpleSymbol) new SimpleSymbol("Button2$Click").readResolve());
    static final FString Lit88 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit89 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement3").readResolve());
    static final PairWithPosition Lit9 = PairWithPosition.make(Lit10, PairWithPosition.make(Lit10, LList.Empty, "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Accueil.yail", 33025), "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Accueil.yail", 33019);
    static final IntNum Lit90 = IntNum.make(16777215);
    static final FString Lit91 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit92 = new FString("com.google.appinventor.components.runtime.WebViewer");
    static final SimpleSymbol Lit93 = ((SimpleSymbol) new SimpleSymbol("PromptforPermission").readResolve());
    static final FString Lit94 = new FString("com.google.appinventor.components.runtime.WebViewer");
    static final FString Lit95 = new FString("com.google.appinventor.components.runtime.TinyDB");
    static final FString Lit96 = new FString("com.google.appinventor.components.runtime.TinyDB");
    static final FString Lit97 = new FString("com.google.appinventor.components.runtime.Notifier");
    static final FString Lit98 = new FString("com.google.appinventor.components.runtime.Notifier");
    static final SimpleSymbol Lit99 = ((SimpleSymbol) new SimpleSymbol("$choice").readResolve());
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
    static final ModuleMethod lambda$Fn3 = null;
    static final ModuleMethod lambda$Fn4 = null;
    static final ModuleMethod lambda$Fn5 = null;
    static final ModuleMethod lambda$Fn6 = null;
    static final ModuleMethod lambda$Fn7 = null;
    static final ModuleMethod lambda$Fn8 = null;
    static final ModuleMethod lambda$Fn9 = null;
    public Boolean $Stdebug$Mnform$St;
    public final ModuleMethod $define;
    public final ModuleMethod Accueil$BackPressed;
    public final ModuleMethod Accueil$Initialize;
    public Button Button1;
    public final ModuleMethod Button1$Click;
    public Button Button2;
    public final ModuleMethod Button2$Click;
    public HorizontalArrangement HorizontalArrangement1;
    public HorizontalArrangement HorizontalArrangement2;
    public HorizontalArrangement HorizontalArrangement3;
    public HorizontalArrangement HorizontalArrangement4;
    public HorizontalArrangement HorizontalArrangement5;
    public Notifier Notifier1;
    public final ModuleMethod Notifier1$AfterChoosing;
    public TinyDB TinyDB1;
    public WebViewer WebViewer1;
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

    /* compiled from: Accueil.yail */
    public class frame extends ModuleBody {
        Accueil $main = this;

        public Object apply0(ModuleMethod moduleMethod) {
            switch (moduleMethod.selector) {
                case 18:
                    return Accueil.lambda2();
                case 19:
                    this.$main.$define();
                    return Values.empty;
                case 20:
                    return Accueil.lambda3();
                case 21:
                    return Accueil.lambda5();
                case 22:
                    return Accueil.lambda4();
                case 23:
                    return Accueil.lambda6();
                case 24:
                    return this.$main.Accueil$BackPressed();
                case 25:
                    return this.$main.Accueil$Initialize();
                case 26:
                    return Accueil.lambda7();
                case 27:
                    return Accueil.lambda8();
                case 28:
                    return Accueil.lambda9();
                case 29:
                    return Accueil.lambda10();
                case 30:
                    return Accueil.lambda11();
                case 31:
                    return Accueil.lambda12();
                case 32:
                    return Accueil.lambda13();
                case 33:
                    return Accueil.lambda14();
                case 34:
                    return this.$main.Button1$Click();
                case 35:
                    return Accueil.lambda15();
                case 36:
                    return Accueil.lambda16();
                case 37:
                    return Accueil.lambda17();
                case 38:
                    return Accueil.lambda18();
                case 39:
                    return this.$main.Button2$Click();
                case 40:
                    return Accueil.lambda19();
                case 41:
                    return Accueil.lambda20();
                case 42:
                    return Accueil.lambda21();
                case 43:
                    return Accueil.lambda22();
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
                    if (!(obj instanceof Accueil)) {
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
                    if (!(obj instanceof Accueil)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f236pc = 1;
                    return 0;
                case 44:
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
                    if (!(obj instanceof Accueil)) {
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
                    if (!(obj instanceof Accueil)) {
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
                case 44:
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
                    Accueil accueil = this.$main;
                    try {
                        Component component = (Component) obj;
                        try {
                            String str = (String) obj2;
                            try {
                                if (obj3 == Boolean.FALSE) {
                                    z = false;
                                }
                                try {
                                    accueil.dispatchGenericEvent(component, str, z, (Object[]) obj4);
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
    }

    static {
        SimpleSymbol simpleSymbol = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT).readResolve();
        Lit10 = simpleSymbol;
        Lit86 = PairWithPosition.make(simpleSymbol, PairWithPosition.make(Lit10, LList.Empty, "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Accueil.yail", 434421), "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Accueil.yail", 434415);
        int[] iArr = new int[2];
        iArr[0] = -14671580;
        Lit51 = IntNum.make(iArr);
        SimpleSymbol simpleSymbol2 = Lit10;
        SimpleSymbol simpleSymbol3 = Lit10;
        SimpleSymbol simpleSymbol4 = Lit10;
        SimpleSymbol simpleSymbol5 = Lit10;
        SimpleSymbol simpleSymbol6 = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_BOOLEAN).readResolve();
        Lit17 = simpleSymbol6;
        Lit35 = PairWithPosition.make(simpleSymbol2, PairWithPosition.make(simpleSymbol3, PairWithPosition.make(simpleSymbol4, PairWithPosition.make(simpleSymbol5, PairWithPosition.make(simpleSymbol6, LList.Empty, "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Accueil.yail", 114878), "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Accueil.yail", 114873), "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Accueil.yail", 114868), "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Accueil.yail", 114863), "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Accueil.yail", 114857);
        int[] iArr2 = new int[2];
        iArr2[0] = -16777216;
        Lit20 = IntNum.make(iArr2);
    }

    public Accueil() {
        ModuleInfo.register(this);
        frame frame2 = new frame();
        this.get$Mnsimple$Mnname = new ModuleMethod(frame2, 1, Lit103, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.onCreate = new ModuleMethod(frame2, 2, "onCreate", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.android$Mnlog$Mnform = new ModuleMethod(frame2, 3, Lit104, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(frame2, 4, Lit105, 8194);
        this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame2, 5, Lit106, 8193);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame2, 7, Lit107, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(frame2, 8, Lit108, 8194);
        this.add$Mnto$Mnevents = new ModuleMethod(frame2, 9, Lit109, 8194);
        this.add$Mnto$Mncomponents = new ModuleMethod(frame2, 10, Lit110, 16388);
        this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(frame2, 11, Lit111, 8194);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(frame2, 12, Lit112, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.send$Mnerror = new ModuleMethod(frame2, 13, Lit113, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.process$Mnexception = new ModuleMethod(frame2, 14, "process-exception", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.dispatchEvent = new ModuleMethod(frame2, 15, Lit114, 16388);
        this.dispatchGenericEvent = new ModuleMethod(frame2, 16, Lit115, 16388);
        this.lookup$Mnhandler = new ModuleMethod(frame2, 17, Lit116, 8194);
        ModuleMethod moduleMethod = new ModuleMethod(frame2, 18, null, 0);
        moduleMethod.setProperty("source-location", "/tmp/runtime6981015161475740401.scm:622");
        lambda$Fn1 = moduleMethod;
        this.$define = new ModuleMethod(frame2, 19, "$define", 0);
        lambda$Fn2 = new ModuleMethod(frame2, 20, null, 0);
        lambda$Fn4 = new ModuleMethod(frame2, 21, null, 0);
        lambda$Fn3 = new ModuleMethod(frame2, 22, null, 0);
        lambda$Fn5 = new ModuleMethod(frame2, 23, null, 0);
        this.Accueil$BackPressed = new ModuleMethod(frame2, 24, Lit36, 0);
        this.Accueil$Initialize = new ModuleMethod(frame2, 25, Lit43, 0);
        lambda$Fn6 = new ModuleMethod(frame2, 26, null, 0);
        lambda$Fn7 = new ModuleMethod(frame2, 27, null, 0);
        lambda$Fn8 = new ModuleMethod(frame2, 28, null, 0);
        lambda$Fn9 = new ModuleMethod(frame2, 29, null, 0);
        lambda$Fn10 = new ModuleMethod(frame2, 30, null, 0);
        lambda$Fn11 = new ModuleMethod(frame2, 31, null, 0);
        lambda$Fn12 = new ModuleMethod(frame2, 32, null, 0);
        lambda$Fn13 = new ModuleMethod(frame2, 33, null, 0);
        this.Button1$Click = new ModuleMethod(frame2, 34, Lit75, 0);
        lambda$Fn14 = new ModuleMethod(frame2, 35, null, 0);
        lambda$Fn15 = new ModuleMethod(frame2, 36, null, 0);
        lambda$Fn16 = new ModuleMethod(frame2, 37, null, 0);
        lambda$Fn17 = new ModuleMethod(frame2, 38, null, 0);
        this.Button2$Click = new ModuleMethod(frame2, 39, Lit87, 0);
        lambda$Fn18 = new ModuleMethod(frame2, 40, null, 0);
        lambda$Fn19 = new ModuleMethod(frame2, 41, null, 0);
        lambda$Fn20 = new ModuleMethod(frame2, 42, null, 0);
        lambda$Fn21 = new ModuleMethod(frame2, 43, null, 0);
        this.Notifier1$AfterChoosing = new ModuleMethod(frame2, 44, Lit101, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
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
        Object find = require.find("com.google.youngandroid.runtime");
        try {
            ((Runnable) find).run();
            this.$Stdebug$Mnform$St = Boolean.FALSE;
            this.form$Mnenvironment = Environment.make(misc.symbol$To$String(Lit0));
            FString stringAppend = strings.stringAppend(misc.symbol$To$String(Lit0), "-global-vars");
            if (stringAppend == null) {
                obj = null;
            } else {
                obj = stringAppend.toString();
            }
            this.global$Mnvar$Mnenvironment = Environment.make(obj);
            Accueil = null;
            this.form$Mnname$Mnsymbol = Lit0;
            this.events$Mnto$Mnregister = LList.Empty;
            this.components$Mnto$Mncreate = LList.Empty;
            this.global$Mnvars$Mnto$Mncreate = LList.Empty;
            this.form$Mndo$Mnafter$Mncreation = LList.Empty;
            Object find2 = require.find("com.google.youngandroid.runtime");
            try {
                ((Runnable) find2).run();
                if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0608runtime.addGlobalVarToCurrentFormEnvironment(Lit3, lambda$Fn2), $result);
                } else {
                    addToGlobalVars(Lit3, lambda$Fn3);
                }
                if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit13, Lit14, Lit15);
                    C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit16, Boolean.TRUE, Lit17);
                    C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit18, "MySadWorld", Lit10);
                    C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit19, Lit20, Lit15);
                    C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit21, "fade", Lit10);
                    C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit22, "fade", Lit10);
                    C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit23, Lit24, Lit15);
                    C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit25, Lit26, Lit15);
                    C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit27, "portrait", Lit10);
                    C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit28, Boolean.TRUE, Lit17);
                    C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit29, "Fixed", Lit10);
                    C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit30, "AppTheme", Lit10);
                    C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit31, "Accueil", Lit10);
                    Values.writeValues(C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit32, Boolean.FALSE, Lit17), $result);
                } else {
                    addToFormDoAfterCreation(new Promise(lambda$Fn5));
                }
                if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    C0608runtime.addToCurrentFormEnvironment(Lit36, this.Accueil$BackPressed);
                } else {
                    addToFormEnvironment(Lit36, this.Accueil$BackPressed);
                }
                if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0608runtime.$Stthis$Mnform$St, "Accueil", "BackPressed");
                } else {
                    addToEvents(Lit0, Lit37);
                }
                if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    C0608runtime.addToCurrentFormEnvironment(Lit43, this.Accueil$Initialize);
                } else {
                    addToFormEnvironment(Lit43, this.Accueil$Initialize);
                }
                if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0608runtime.$Stthis$Mnform$St, "Accueil", "Initialize");
                } else {
                    addToEvents(Lit0, Lit44);
                }
                this.HorizontalArrangement1 = null;
                if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0608runtime.addComponentWithinRepl(Lit0, Lit45, Lit46, lambda$Fn6), $result);
                } else {
                    addToComponents(Lit0, Lit56, Lit46, lambda$Fn7);
                }
                this.HorizontalArrangement2 = null;
                if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0608runtime.addComponentWithinRepl(Lit46, Lit57, Lit58, lambda$Fn8), $result);
                } else {
                    addToComponents(Lit46, Lit60, Lit58, lambda$Fn9);
                }
                this.HorizontalArrangement5 = null;
                if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0608runtime.addComponentWithinRepl(Lit58, Lit61, Lit62, lambda$Fn10), $result);
                } else {
                    addToComponents(Lit58, Lit65, Lit62, lambda$Fn11);
                }
                this.Button1 = null;
                if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0608runtime.addComponentWithinRepl(Lit58, Lit66, Lit67, lambda$Fn12), $result);
                } else {
                    addToComponents(Lit58, Lit72, Lit67, lambda$Fn13);
                }
                if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    C0608runtime.addToCurrentFormEnvironment(Lit75, this.Button1$Click);
                } else {
                    addToFormEnvironment(Lit75, this.Button1$Click);
                }
                if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0608runtime.$Stthis$Mnform$St, "Button1", "Click");
                } else {
                    addToEvents(Lit67, Lit76);
                }
                this.HorizontalArrangement4 = null;
                if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0608runtime.addComponentWithinRepl(Lit46, Lit77, Lit78, lambda$Fn14), $result);
                } else {
                    addToComponents(Lit46, Lit80, Lit78, lambda$Fn15);
                }
                this.Button2 = null;
                if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0608runtime.addComponentWithinRepl(Lit78, Lit81, Lit82, lambda$Fn16), $result);
                } else {
                    addToComponents(Lit78, Lit84, Lit82, lambda$Fn17);
                }
                if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    C0608runtime.addToCurrentFormEnvironment(Lit87, this.Button2$Click);
                } else {
                    addToFormEnvironment(Lit87, this.Button2$Click);
                }
                if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0608runtime.$Stthis$Mnform$St, "Button2", "Click");
                } else {
                    addToEvents(Lit82, Lit76);
                }
                this.HorizontalArrangement3 = null;
                if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0608runtime.addComponentWithinRepl(Lit46, Lit88, Lit89, lambda$Fn18), $result);
                } else {
                    addToComponents(Lit46, Lit91, Lit89, lambda$Fn19);
                }
                this.WebViewer1 = null;
                if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0608runtime.addComponentWithinRepl(Lit0, Lit92, Lit4, lambda$Fn20), $result);
                } else {
                    addToComponents(Lit0, Lit94, Lit4, lambda$Fn21);
                }
                this.TinyDB1 = null;
                if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0608runtime.addComponentWithinRepl(Lit0, Lit95, Lit6, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit96, Lit6, Boolean.FALSE);
                }
                this.Notifier1 = null;
                if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C0608runtime.addComponentWithinRepl(Lit0, Lit97, Lit33, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit98, Lit33, Boolean.FALSE);
                }
                if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    C0608runtime.addToCurrentFormEnvironment(Lit101, this.Notifier1$AfterChoosing);
                } else {
                    addToFormEnvironment(Lit101, this.Notifier1$AfterChoosing);
                }
                if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0608runtime.$Stthis$Mnform$St, "Notifier1", "AfterChoosing");
                } else {
                    addToEvents(Lit33, Lit102);
                }
                C0608runtime.initRuntime();
            } catch (ClassCastException e) {
                throw new WrongType(e, "java.lang.Runnable.run()", 1, find2);
            }
        } catch (ClassCastException e2) {
            throw new WrongType(e2, "java.lang.Runnable.run()", 1, find);
        }
    }

    static Object lambda3() {
        return C0608runtime.setAndCoerceProperty$Ex(Lit4, Lit5, C0608runtime.callYailPrimitive(strings.string$Mnappend, LList.list2("http://msw.kellis.fr/fil.php?id=", C0608runtime.callComponentMethod(Lit6, Lit7, LList.list2("user_id", "NULL"), Lit8)), Lit9, "join"), Lit10);
    }

    static Procedure lambda4() {
        return lambda$Fn4;
    }

    static Object lambda5() {
        return C0608runtime.setAndCoerceProperty$Ex(Lit4, Lit5, C0608runtime.callYailPrimitive(strings.string$Mnappend, LList.list2("http://msw.kellis.fr/fil.php?id=", C0608runtime.callComponentMethod(Lit6, Lit7, LList.list2("user_id", "NULL"), Lit11)), Lit12, "join"), Lit10);
    }

    static Object lambda6() {
        C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit13, Lit14, Lit15);
        C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit16, Boolean.TRUE, Lit17);
        C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit18, "MySadWorld", Lit10);
        C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit19, Lit20, Lit15);
        C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit21, "fade", Lit10);
        C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit22, "fade", Lit10);
        C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit23, Lit24, Lit15);
        C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit25, Lit26, Lit15);
        C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit27, "portrait", Lit10);
        C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit28, Boolean.TRUE, Lit17);
        C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit29, "Fixed", Lit10);
        C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit30, "AppTheme", Lit10);
        C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit31, "Accueil", Lit10);
        return C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit32, Boolean.FALSE, Lit17);
    }

    public Object Accueil$BackPressed() {
        C0608runtime.setThisForm();
        SimpleSymbol simpleSymbol = Lit33;
        SimpleSymbol simpleSymbol2 = Lit34;
        Pair list1 = LList.list1("Voulez-vous vraiment quitter l'application ?");
        LList.chain4(list1, "Quitter l'application", "Oui", "Non", Boolean.TRUE);
        return C0608runtime.callComponentMethod(simpleSymbol, simpleSymbol2, list1, Lit35);
    }

    public Object Accueil$Initialize() {
        C0608runtime.setThisForm();
        if (C0608runtime.callYailPrimitive(C0608runtime.yail$Mnnot$Mnequal$Qu, LList.list2(C0608runtime.callComponentMethod(Lit6, Lit7, LList.list2("user_id", "NULL"), Lit38), "NULL"), Lit39, "=") != Boolean.FALSE) {
            return Scheme.applyToArgs.apply1(C0608runtime.lookupGlobalVarInCurrentFormEnvironment(Lit3, C0608runtime.$Stthe$Mnnull$Mnvalue$St));
        }
        C0608runtime.callComponentMethod(Lit33, Lit40, LList.list1("Vous avez été déconnecté de votre compte."), Lit41);
        return C0608runtime.callYailPrimitive(C0608runtime.open$Mnanother$Mnscreen, LList.list1("Connexion"), Lit42, "open another screen");
    }

    static Object lambda7() {
        C0608runtime.setAndCoerceProperty$Ex(Lit46, Lit47, Lit48, Lit15);
        C0608runtime.setAndCoerceProperty$Ex(Lit46, Lit49, Lit50, Lit15);
        C0608runtime.setAndCoerceProperty$Ex(Lit46, Lit19, Lit51, Lit15);
        C0608runtime.setAndCoerceProperty$Ex(Lit46, Lit52, Lit53, Lit15);
        return C0608runtime.setAndCoerceProperty$Ex(Lit46, Lit54, Lit55, Lit15);
    }

    static Object lambda8() {
        C0608runtime.setAndCoerceProperty$Ex(Lit46, Lit47, Lit48, Lit15);
        C0608runtime.setAndCoerceProperty$Ex(Lit46, Lit49, Lit50, Lit15);
        C0608runtime.setAndCoerceProperty$Ex(Lit46, Lit19, Lit51, Lit15);
        C0608runtime.setAndCoerceProperty$Ex(Lit46, Lit52, Lit53, Lit15);
        return C0608runtime.setAndCoerceProperty$Ex(Lit46, Lit54, Lit55, Lit15);
    }

    static Object lambda10() {
        C0608runtime.setAndCoerceProperty$Ex(Lit58, Lit49, Lit50, Lit15);
        C0608runtime.setAndCoerceProperty$Ex(Lit58, Lit19, Lit59, Lit15);
        return C0608runtime.setAndCoerceProperty$Ex(Lit58, Lit54, Lit55, Lit15);
    }

    static Object lambda9() {
        C0608runtime.setAndCoerceProperty$Ex(Lit58, Lit49, Lit50, Lit15);
        C0608runtime.setAndCoerceProperty$Ex(Lit58, Lit19, Lit59, Lit15);
        return C0608runtime.setAndCoerceProperty$Ex(Lit58, Lit54, Lit55, Lit15);
    }

    static Object lambda11() {
        C0608runtime.setAndCoerceProperty$Ex(Lit62, Lit19, Lit63, Lit15);
        return C0608runtime.setAndCoerceProperty$Ex(Lit62, Lit54, Lit64, Lit15);
    }

    static Object lambda12() {
        C0608runtime.setAndCoerceProperty$Ex(Lit62, Lit19, Lit63, Lit15);
        return C0608runtime.setAndCoerceProperty$Ex(Lit62, Lit54, Lit64, Lit15);
    }

    static Object lambda13() {
        C0608runtime.setAndCoerceProperty$Ex(Lit67, Lit52, Lit68, Lit15);
        C0608runtime.setAndCoerceProperty$Ex(Lit67, Lit69, "user-circle.png", Lit10);
        C0608runtime.setAndCoerceProperty$Ex(Lit67, Lit70, Lit71, Lit15);
        return C0608runtime.setAndCoerceProperty$Ex(Lit67, Lit54, Lit68, Lit15);
    }

    static Object lambda14() {
        C0608runtime.setAndCoerceProperty$Ex(Lit67, Lit52, Lit68, Lit15);
        C0608runtime.setAndCoerceProperty$Ex(Lit67, Lit69, "user-circle.png", Lit10);
        C0608runtime.setAndCoerceProperty$Ex(Lit67, Lit70, Lit71, Lit15);
        return C0608runtime.setAndCoerceProperty$Ex(Lit67, Lit54, Lit68, Lit15);
    }

    public Object Button1$Click() {
        C0608runtime.setThisForm();
        return C0608runtime.setAndCoerceProperty$Ex(Lit4, Lit5, C0608runtime.callYailPrimitive(strings.string$Mnappend, LList.list2("http://msw.kellis.fr/profil.php?id=", C0608runtime.callComponentMethod(Lit6, Lit7, LList.list2("user_id", "NULL"), Lit73)), Lit74, "join"), Lit10);
    }

    static Object lambda15() {
        C0608runtime.setAndCoerceProperty$Ex(Lit78, Lit47, Lit48, Lit15);
        C0608runtime.setAndCoerceProperty$Ex(Lit78, Lit49, Lit50, Lit15);
        C0608runtime.setAndCoerceProperty$Ex(Lit78, Lit19, Lit79, Lit15);
        return C0608runtime.setAndCoerceProperty$Ex(Lit78, Lit54, Lit55, Lit15);
    }

    static Object lambda16() {
        C0608runtime.setAndCoerceProperty$Ex(Lit78, Lit47, Lit48, Lit15);
        C0608runtime.setAndCoerceProperty$Ex(Lit78, Lit49, Lit50, Lit15);
        C0608runtime.setAndCoerceProperty$Ex(Lit78, Lit19, Lit79, Lit15);
        return C0608runtime.setAndCoerceProperty$Ex(Lit78, Lit54, Lit55, Lit15);
    }

    static Object lambda17() {
        C0608runtime.setAndCoerceProperty$Ex(Lit82, Lit52, Lit83, Lit15);
        C0608runtime.setAndCoerceProperty$Ex(Lit82, Lit69, "MSW_w.png", Lit10);
        return C0608runtime.setAndCoerceProperty$Ex(Lit82, Lit54, Lit83, Lit15);
    }

    static Object lambda18() {
        C0608runtime.setAndCoerceProperty$Ex(Lit82, Lit52, Lit83, Lit15);
        C0608runtime.setAndCoerceProperty$Ex(Lit82, Lit69, "MSW_w.png", Lit10);
        return C0608runtime.setAndCoerceProperty$Ex(Lit82, Lit54, Lit83, Lit15);
    }

    public Object Button2$Click() {
        C0608runtime.setThisForm();
        return C0608runtime.setAndCoerceProperty$Ex(Lit4, Lit5, C0608runtime.callYailPrimitive(strings.string$Mnappend, LList.list2("http://msw.kellis.fr/fil.php?id=", C0608runtime.callComponentMethod(Lit6, Lit7, LList.list2("user_id", "NULL"), Lit85)), Lit86, "join"), Lit10);
    }

    static Object lambda19() {
        C0608runtime.setAndCoerceProperty$Ex(Lit89, Lit47, Lit50, Lit15);
        C0608runtime.setAndCoerceProperty$Ex(Lit89, Lit49, Lit50, Lit15);
        C0608runtime.setAndCoerceProperty$Ex(Lit89, Lit19, Lit90, Lit15);
        return C0608runtime.setAndCoerceProperty$Ex(Lit89, Lit54, Lit55, Lit15);
    }

    static Object lambda20() {
        C0608runtime.setAndCoerceProperty$Ex(Lit89, Lit47, Lit50, Lit15);
        C0608runtime.setAndCoerceProperty$Ex(Lit89, Lit49, Lit50, Lit15);
        C0608runtime.setAndCoerceProperty$Ex(Lit89, Lit19, Lit90, Lit15);
        return C0608runtime.setAndCoerceProperty$Ex(Lit89, Lit54, Lit55, Lit15);
    }

    static Object lambda21() {
        return C0608runtime.setAndCoerceProperty$Ex(Lit4, Lit93, Boolean.FALSE, Lit17);
    }

    static Object lambda22() {
        return C0608runtime.setAndCoerceProperty$Ex(Lit4, Lit93, Boolean.FALSE, Lit17);
    }

    public Object Notifier1$AfterChoosing(Object $choice) {
        Object $choice2 = C0608runtime.sanitizeComponentData($choice);
        C0608runtime.setThisForm();
        ModuleMethod moduleMethod = C0608runtime.yail$Mnequal$Qu;
        if ($choice2 instanceof Package) {
            $choice2 = C0608runtime.signalRuntimeError(strings.stringAppend("The variable ", C0608runtime.getDisplayRepresentation(Lit99), " is not bound in the current context"), "Unbound Variable");
        }
        return C0608runtime.callYailPrimitive(moduleMethod, LList.list2($choice2, "Oui"), Lit100, "=") != Boolean.FALSE ? C0608runtime.callYailPrimitive(C0608runtime.close$Mnapplication, LList.Empty, LList.Empty, "close application") : Values.empty;
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
        Accueil = this;
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
