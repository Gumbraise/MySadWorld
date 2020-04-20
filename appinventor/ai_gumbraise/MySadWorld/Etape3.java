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
import com.google.appinventor.components.runtime.Image;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.Slider;
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

/* compiled from: Etape3.yail */
public class Etape3 extends Form implements Runnable {
    public static Etape3 Etape3;
    static final SimpleSymbol Lit0 = ((SimpleSymbol) new SimpleSymbol("Etape3").readResolve());
    static final SimpleSymbol Lit1 = ((SimpleSymbol) new SimpleSymbol("getMessage").readResolve());
    static final SimpleSymbol Lit10;
    static final IntNum Lit100 = IntNum.make(40);
    static final SimpleSymbol Lit101 = ((SimpleSymbol) new SimpleSymbol("Image").readResolve());
    static final FString Lit102 = new FString("com.google.appinventor.components.runtime.Button");
    static final PairWithPosition Lit103 = PairWithPosition.make(Lit10, PairWithPosition.make(Lit141, LList.Empty, "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Etape3.yail", 622700), "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Etape3.yail", 622694);
    static final PairWithPosition Lit104;
    static final SimpleSymbol Lit105 = ((SimpleSymbol) new SimpleSymbol("Button1$Click").readResolve());
    static final SimpleSymbol Lit106 = ((SimpleSymbol) new SimpleSymbol("Click").readResolve());
    static final FString Lit107 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit108 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement4").readResolve());
    static final FString Lit109 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit11 = ((SimpleSymbol) new SimpleSymbol("BackgroundColor").readResolve());
    static final FString Lit110 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit111 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement5").readResolve());
    static final IntNum Lit112;
    static final FString Lit113 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit114 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit115 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement6").readResolve());
    static final IntNum Lit116;
    static final FString Lit117 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit118 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit119 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement8").readResolve());
    static final IntNum Lit12;
    static final IntNum Lit120;
    static final FString Lit121 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit122 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit123 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement7").readResolve());
    static final FString Lit124 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit125 = new FString("com.google.appinventor.components.runtime.TinyDB");
    static final FString Lit126 = new FString("com.google.appinventor.components.runtime.TinyDB");
    static final SimpleSymbol Lit127 = ((SimpleSymbol) new SimpleSymbol("get-simple-name").readResolve());
    static final SimpleSymbol Lit128 = ((SimpleSymbol) new SimpleSymbol("android-log-form").readResolve());
    static final SimpleSymbol Lit129 = ((SimpleSymbol) new SimpleSymbol("add-to-form-environment").readResolve());
    static final SimpleSymbol Lit13 = ((SimpleSymbol) new SimpleSymbol("CloseScreenAnimation").readResolve());
    static final SimpleSymbol Lit130 = ((SimpleSymbol) new SimpleSymbol("lookup-in-form-environment").readResolve());
    static final SimpleSymbol Lit131 = ((SimpleSymbol) new SimpleSymbol("is-bound-in-form-environment").readResolve());
    static final SimpleSymbol Lit132 = ((SimpleSymbol) new SimpleSymbol("add-to-global-var-environment").readResolve());
    static final SimpleSymbol Lit133 = ((SimpleSymbol) new SimpleSymbol("add-to-events").readResolve());
    static final SimpleSymbol Lit134 = ((SimpleSymbol) new SimpleSymbol("add-to-components").readResolve());
    static final SimpleSymbol Lit135 = ((SimpleSymbol) new SimpleSymbol("add-to-global-vars").readResolve());
    static final SimpleSymbol Lit136 = ((SimpleSymbol) new SimpleSymbol("add-to-form-do-after-creation").readResolve());
    static final SimpleSymbol Lit137 = ((SimpleSymbol) new SimpleSymbol("send-error").readResolve());
    static final SimpleSymbol Lit138 = ((SimpleSymbol) new SimpleSymbol("dispatchEvent").readResolve());
    static final SimpleSymbol Lit139 = ((SimpleSymbol) new SimpleSymbol("dispatchGenericEvent").readResolve());
    static final SimpleSymbol Lit14 = ((SimpleSymbol) new SimpleSymbol("OpenScreenAnimation").readResolve());
    static final SimpleSymbol Lit140 = ((SimpleSymbol) new SimpleSymbol("lookup-handler").readResolve());
    static final SimpleSymbol Lit141 = ((SimpleSymbol) new SimpleSymbol("any").readResolve());
    static final SimpleSymbol Lit15 = ((SimpleSymbol) new SimpleSymbol("PrimaryColor").readResolve());
    static final IntNum Lit16 = IntNum.make(16777215);
    static final SimpleSymbol Lit17 = ((SimpleSymbol) new SimpleSymbol("PrimaryColorDark").readResolve());
    static final IntNum Lit18 = IntNum.make(16777215);
    static final SimpleSymbol Lit19 = ((SimpleSymbol) new SimpleSymbol("ScreenOrientation").readResolve());
    static final SimpleSymbol Lit2 = ((SimpleSymbol) new SimpleSymbol("*the-null-value*").readResolve());
    static final SimpleSymbol Lit20 = ((SimpleSymbol) new SimpleSymbol("ShowListsAsJson").readResolve());
    static final SimpleSymbol Lit21 = ((SimpleSymbol) new SimpleSymbol("Sizing").readResolve());
    static final SimpleSymbol Lit22 = ((SimpleSymbol) new SimpleSymbol("Theme").readResolve());
    static final SimpleSymbol Lit23 = ((SimpleSymbol) new SimpleSymbol("Title").readResolve());
    static final SimpleSymbol Lit24 = ((SimpleSymbol) new SimpleSymbol("TitleVisible").readResolve());
    static final SimpleSymbol Lit25 = ((SimpleSymbol) new SimpleSymbol(TinyDB.DEFAULT_NAMESPACE).readResolve());
    static final SimpleSymbol Lit26 = ((SimpleSymbol) new SimpleSymbol("GetValue").readResolve());
    static final PairWithPosition Lit27 = PairWithPosition.make(Lit10, PairWithPosition.make(Lit141, LList.Empty, "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Etape3.yail", 114796), "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Etape3.yail", 114790);
    static final SimpleSymbol Lit28 = ((SimpleSymbol) new SimpleSymbol("StoreValue").readResolve());
    static final PairWithPosition Lit29 = PairWithPosition.make(Lit10, PairWithPosition.make(Lit141, LList.Empty, "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Etape3.yail", 114900), "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Etape3.yail", 114894);
    static final SimpleSymbol Lit3 = ((SimpleSymbol) new SimpleSymbol("g$happy").readResolve());
    static final PairWithPosition Lit30 = PairWithPosition.make(Lit10, PairWithPosition.make(Lit141, LList.Empty, "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Etape3.yail", 115006), "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Etape3.yail", 115000);
    static final SimpleSymbol Lit31 = ((SimpleSymbol) new SimpleSymbol("Image1").readResolve());
    static final SimpleSymbol Lit32 = ((SimpleSymbol) new SimpleSymbol("Picture").readResolve());
    static final PairWithPosition Lit33 = PairWithPosition.make(Lit10, PairWithPosition.make(Lit141, LList.Empty, "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Etape3.yail", 115153), "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Etape3.yail", 115147);
    static final SimpleSymbol Lit34 = ((SimpleSymbol) new SimpleSymbol("Etape3$Initialize").readResolve());
    static final SimpleSymbol Lit35 = ((SimpleSymbol) new SimpleSymbol("Initialize").readResolve());
    static final FString Lit36 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit37 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement1").readResolve());
    static final SimpleSymbol Lit38 = ((SimpleSymbol) new SimpleSymbol("Height").readResolve());
    static final IntNum Lit39 = IntNum.make(-2);
    static final SimpleSymbol Lit4 = ((SimpleSymbol) new SimpleSymbol("AccentColor").readResolve());
    static final SimpleSymbol Lit40 = ((SimpleSymbol) new SimpleSymbol("Width").readResolve());
    static final FString Lit41 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit42 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final SimpleSymbol Lit43 = ((SimpleSymbol) new SimpleSymbol("VerticalArrangement1").readResolve());
    static final SimpleSymbol Lit44 = ((SimpleSymbol) new SimpleSymbol("AlignHorizontal").readResolve());
    static final IntNum Lit45 = IntNum.make(3);
    static final SimpleSymbol Lit46 = ((SimpleSymbol) new SimpleSymbol("AlignVertical").readResolve());
    static final IntNum Lit47 = IntNum.make(2);
    static final FString Lit48 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final FString Lit49 = new FString("com.google.appinventor.components.runtime.Image");
    static final IntNum Lit5 = IntNum.make(16777215);
    static final IntNum Lit50 = IntNum.make(100);
    static final SimpleSymbol Lit51 = ((SimpleSymbol) new SimpleSymbol("ScalePictureToFit").readResolve());
    static final FString Lit52 = new FString("com.google.appinventor.components.runtime.Image");
    static final FString Lit53 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit54 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement9").readResolve());
    static final IntNum Lit55 = IntNum.make(50);
    static final FString Lit56 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit57 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit58 = ((SimpleSymbol) new SimpleSymbol("Label1").readResolve());
    static final SimpleSymbol Lit59 = ((SimpleSymbol) new SimpleSymbol("FontBold").readResolve());
    static final SimpleSymbol Lit6 = ((SimpleSymbol) new SimpleSymbol("number").readResolve());
    static final SimpleSymbol Lit60 = ((SimpleSymbol) new SimpleSymbol("FontSize").readResolve());
    static final IntNum Lit61 = IntNum.make(15);
    static final SimpleSymbol Lit62 = ((SimpleSymbol) new SimpleSymbol("FontTypeface").readResolve());
    static final IntNum Lit63 = IntNum.make(1);
    static final SimpleSymbol Lit64 = ((SimpleSymbol) new SimpleSymbol("HTMLFormat").readResolve());
    static final SimpleSymbol Lit65 = ((SimpleSymbol) new SimpleSymbol("Text").readResolve());
    static final SimpleSymbol Lit66 = ((SimpleSymbol) new SimpleSymbol("TextAlignment").readResolve());
    static final SimpleSymbol Lit67 = ((SimpleSymbol) new SimpleSymbol("TextColor").readResolve());
    static final IntNum Lit68;
    static final FString Lit69 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit7 = ((SimpleSymbol) new SimpleSymbol("ActionBar").readResolve());
    static final FString Lit70 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit71 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement2").readResolve());
    static final IntNum Lit72 = IntNum.make(20);
    static final FString Lit73 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit74 = new FString("com.google.appinventor.components.runtime.Slider");
    static final SimpleSymbol Lit75 = ((SimpleSymbol) new SimpleSymbol("Slider1").readResolve());
    static final SimpleSymbol Lit76 = ((SimpleSymbol) new SimpleSymbol("ColorLeft").readResolve());
    static final IntNum Lit77;
    static final SimpleSymbol Lit78 = ((SimpleSymbol) new SimpleSymbol("ColorRight").readResolve());
    static final IntNum Lit79;
    static final SimpleSymbol Lit8 = ((SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_BOOLEAN).readResolve());
    static final SimpleSymbol Lit80 = ((SimpleSymbol) new SimpleSymbol("MaxValue").readResolve());
    static final IntNum Lit81 = IntNum.make(10);
    static final SimpleSymbol Lit82 = ((SimpleSymbol) new SimpleSymbol("MinValue").readResolve());
    static final IntNum Lit83 = IntNum.make(0);
    static final SimpleSymbol Lit84 = ((SimpleSymbol) new SimpleSymbol("ThumbPosition").readResolve());
    static final IntNum Lit85 = IntNum.make(5);
    static final IntNum Lit86 = IntNum.make(250);
    static final FString Lit87 = new FString("com.google.appinventor.components.runtime.Slider");
    static final SimpleSymbol Lit88 = ((SimpleSymbol) new SimpleSymbol("$thumbPosition").readResolve());
    static final SimpleSymbol Lit89 = ((SimpleSymbol) new SimpleSymbol("Label2").readResolve());
    static final SimpleSymbol Lit9 = ((SimpleSymbol) new SimpleSymbol("AppName").readResolve());
    static final PairWithPosition Lit90 = PairWithPosition.make(Lit10, PairWithPosition.make(Lit10, LList.Empty, "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Etape3.yail", 487606), "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Etape3.yail", 487600);
    static final SimpleSymbol Lit91 = ((SimpleSymbol) new SimpleSymbol("Slider1$PositionChanged").readResolve());
    static final SimpleSymbol Lit92 = ((SimpleSymbol) new SimpleSymbol("PositionChanged").readResolve());
    static final FString Lit93 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit94 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit95 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit96 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement3").readResolve());
    static final FString Lit97 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit98 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit99 = ((SimpleSymbol) new SimpleSymbol("Button1").readResolve());
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
    static final ModuleMethod lambda$Fn27 = null;
    static final ModuleMethod lambda$Fn28 = null;
    static final ModuleMethod lambda$Fn29 = null;
    static final ModuleMethod lambda$Fn3 = null;
    static final ModuleMethod lambda$Fn30 = null;
    static final ModuleMethod lambda$Fn31 = null;
    static final ModuleMethod lambda$Fn32 = null;
    static final ModuleMethod lambda$Fn33 = null;
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
    public final ModuleMethod Etape3$Initialize;
    public HorizontalArrangement HorizontalArrangement1;
    public HorizontalArrangement HorizontalArrangement2;
    public HorizontalArrangement HorizontalArrangement3;
    public HorizontalArrangement HorizontalArrangement4;
    public HorizontalArrangement HorizontalArrangement5;
    public HorizontalArrangement HorizontalArrangement6;
    public HorizontalArrangement HorizontalArrangement7;
    public HorizontalArrangement HorizontalArrangement8;
    public HorizontalArrangement HorizontalArrangement9;
    public Image Image1;
    public Label Label1;
    public Label Label2;
    public Slider Slider1;
    public final ModuleMethod Slider1$PositionChanged;
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

    /* compiled from: Etape3.yail */
    public class frame extends ModuleBody {
        Etape3 $main = this;

        public int match1(ModuleMethod moduleMethod, Object obj, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 1:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f236pc = 1;
                    return 0;
                case 2:
                    if (!(obj instanceof Etape3)) {
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
                    if (!(obj instanceof Etape3)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f236pc = 1;
                    return 0;
                case 37:
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
                    if (!(obj instanceof Etape3)) {
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
                    if (!(obj instanceof Etape3)) {
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
                case 37:
                    return this.$main.Slider1$PositionChanged(obj);
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
                    Etape3 etape3 = this.$main;
                    try {
                        Component component = (Component) obj;
                        try {
                            String str = (String) obj2;
                            try {
                                if (obj3 == Boolean.FALSE) {
                                    z = false;
                                }
                                try {
                                    etape3.dispatchGenericEvent(component, str, z, (Object[]) obj4);
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
                    return Etape3.lambda2();
                case 19:
                    this.$main.$define();
                    return Values.empty;
                case 20:
                    return Etape3.lambda3();
                case 21:
                    return Etape3.lambda4();
                case 22:
                    return this.$main.Etape3$Initialize();
                case 23:
                    return Etape3.lambda5();
                case 24:
                    return Etape3.lambda6();
                case 25:
                    return Etape3.lambda7();
                case 26:
                    return Etape3.lambda8();
                case 27:
                    return Etape3.lambda9();
                case 28:
                    return Etape3.lambda10();
                case 29:
                    return Etape3.lambda11();
                case 30:
                    return Etape3.lambda12();
                case 31:
                    return Etape3.lambda13();
                case 32:
                    return Etape3.lambda14();
                case 33:
                    return Etape3.lambda15();
                case 34:
                    return Etape3.lambda16();
                case 35:
                    return Etape3.lambda17();
                case 36:
                    return Etape3.lambda18();
                case 38:
                    return Etape3.lambda19();
                case 39:
                    return Etape3.lambda20();
                case 40:
                    return Etape3.lambda21();
                case 41:
                    return Etape3.lambda22();
                case 42:
                    return Etape3.lambda23();
                case 43:
                    return Etape3.lambda24();
                case 44:
                    return this.$main.Button1$Click();
                case 45:
                    return Etape3.lambda25();
                case 46:
                    return Etape3.lambda26();
                case 47:
                    return Etape3.lambda27();
                case 48:
                    return Etape3.lambda28();
                case 49:
                    return Etape3.lambda29();
                case 50:
                    return Etape3.lambda30();
                case 51:
                    return Etape3.lambda31();
                case 52:
                    return Etape3.lambda32();
                case 53:
                    return Etape3.lambda33();
                case 54:
                    return Etape3.lambda34();
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
                case 48:
                    callContext.proc = moduleMethod;
                    callContext.f236pc = 0;
                    return 0;
                case 49:
                    callContext.proc = moduleMethod;
                    callContext.f236pc = 0;
                    return 0;
                case 50:
                    callContext.proc = moduleMethod;
                    callContext.f236pc = 0;
                    return 0;
                case 51:
                    callContext.proc = moduleMethod;
                    callContext.f236pc = 0;
                    return 0;
                case 52:
                    callContext.proc = moduleMethod;
                    callContext.f236pc = 0;
                    return 0;
                case 53:
                    callContext.proc = moduleMethod;
                    callContext.f236pc = 0;
                    return 0;
                case 54:
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
        Lit120 = IntNum.make(iArr);
        int[] iArr2 = new int[2];
        iArr2[0] = -6019137;
        Lit116 = IntNum.make(iArr2);
        int[] iArr3 = new int[2];
        iArr3[0] = -6019137;
        Lit112 = IntNum.make(iArr3);
        SimpleSymbol simpleSymbol = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT).readResolve();
        Lit10 = simpleSymbol;
        Lit104 = PairWithPosition.make(simpleSymbol, LList.Empty, "/tmp/1587332366508_0.12046123580516566-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Etape3.yail", 622777);
        int[] iArr4 = new int[2];
        iArr4[0] = -1154152;
        Lit79 = IntNum.make(iArr4);
        int[] iArr5 = new int[2];
        iArr5[0] = -6019137;
        Lit77 = IntNum.make(iArr5);
        int[] iArr6 = new int[2];
        iArr6[0] = -1;
        Lit68 = IntNum.make(iArr6);
        int[] iArr7 = new int[2];
        iArr7[0] = -16777216;
        Lit12 = IntNum.make(iArr7);
    }

    public Etape3() {
        ModuleInfo.register(this);
        frame frame2 = new frame();
        this.get$Mnsimple$Mnname = new ModuleMethod(frame2, 1, Lit127, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.onCreate = new ModuleMethod(frame2, 2, "onCreate", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.android$Mnlog$Mnform = new ModuleMethod(frame2, 3, Lit128, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(frame2, 4, Lit129, 8194);
        this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame2, 5, Lit130, 8193);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame2, 7, Lit131, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(frame2, 8, Lit132, 8194);
        this.add$Mnto$Mnevents = new ModuleMethod(frame2, 9, Lit133, 8194);
        this.add$Mnto$Mncomponents = new ModuleMethod(frame2, 10, Lit134, 16388);
        this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(frame2, 11, Lit135, 8194);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(frame2, 12, Lit136, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.send$Mnerror = new ModuleMethod(frame2, 13, Lit137, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.process$Mnexception = new ModuleMethod(frame2, 14, "process-exception", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.dispatchEvent = new ModuleMethod(frame2, 15, Lit138, 16388);
        this.dispatchGenericEvent = new ModuleMethod(frame2, 16, Lit139, 16388);
        this.lookup$Mnhandler = new ModuleMethod(frame2, 17, Lit140, 8194);
        ModuleMethod moduleMethod = new ModuleMethod(frame2, 18, null, 0);
        moduleMethod.setProperty("source-location", "/tmp/runtime6981015161475740401.scm:622");
        lambda$Fn1 = moduleMethod;
        this.$define = new ModuleMethod(frame2, 19, "$define", 0);
        lambda$Fn2 = new ModuleMethod(frame2, 20, null, 0);
        lambda$Fn3 = new ModuleMethod(frame2, 21, null, 0);
        this.Etape3$Initialize = new ModuleMethod(frame2, 22, Lit34, 0);
        lambda$Fn4 = new ModuleMethod(frame2, 23, null, 0);
        lambda$Fn5 = new ModuleMethod(frame2, 24, null, 0);
        lambda$Fn6 = new ModuleMethod(frame2, 25, null, 0);
        lambda$Fn7 = new ModuleMethod(frame2, 26, null, 0);
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
        this.Slider1$PositionChanged = new ModuleMethod(frame2, 37, Lit91, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        lambda$Fn18 = new ModuleMethod(frame2, 38, null, 0);
        lambda$Fn19 = new ModuleMethod(frame2, 39, null, 0);
        lambda$Fn20 = new ModuleMethod(frame2, 40, null, 0);
        lambda$Fn21 = new ModuleMethod(frame2, 41, null, 0);
        lambda$Fn22 = new ModuleMethod(frame2, 42, null, 0);
        lambda$Fn23 = new ModuleMethod(frame2, 43, null, 0);
        this.Button1$Click = new ModuleMethod(frame2, 44, Lit105, 0);
        lambda$Fn24 = new ModuleMethod(frame2, 45, null, 0);
        lambda$Fn25 = new ModuleMethod(frame2, 46, null, 0);
        lambda$Fn26 = new ModuleMethod(frame2, 47, null, 0);
        lambda$Fn27 = new ModuleMethod(frame2, 48, null, 0);
        lambda$Fn28 = new ModuleMethod(frame2, 49, null, 0);
        lambda$Fn29 = new ModuleMethod(frame2, 50, null, 0);
        lambda$Fn30 = new ModuleMethod(frame2, 51, null, 0);
        lambda$Fn31 = new ModuleMethod(frame2, 52, null, 0);
        lambda$Fn32 = new ModuleMethod(frame2, 53, null, 0);
        lambda$Fn33 = new ModuleMethod(frame2, 54, null, 0);
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
        Etape3 = null;
        this.form$Mnname$Mnsymbol = Lit0;
        this.events$Mnto$Mnregister = LList.Empty;
        this.components$Mnto$Mncreate = LList.Empty;
        this.global$Mnvars$Mnto$Mncreate = LList.Empty;
        this.form$Mndo$Mnafter$Mncreation = LList.Empty;
        C0608runtime.$instance.run();
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0608runtime.addGlobalVarToCurrentFormEnvironment(Lit3, ""), $result);
        } else {
            addToGlobalVars(Lit3, lambda$Fn2);
        }
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit4, Lit5, Lit6);
            C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit7, Boolean.TRUE, Lit8);
            C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit9, "MySadWorld", Lit10);
            C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit11, Lit12, Lit6);
            C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit13, "slidehorizontal", Lit10);
            C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit14, "slidehorizontal", Lit10);
            C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit15, Lit16, Lit6);
            C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit17, Lit18, Lit6);
            C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit19, "portrait", Lit10);
            C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit20, Boolean.TRUE, Lit8);
            C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit21, "Fixed", Lit10);
            C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit22, "AppTheme", Lit10);
            C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit23, "Etape3", Lit10);
            Values.writeValues(C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit24, Boolean.FALSE, Lit8), $result);
        } else {
            addToFormDoAfterCreation(new Promise(lambda$Fn3));
        }
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            C0608runtime.addToCurrentFormEnvironment(Lit34, this.Etape3$Initialize);
        } else {
            addToFormEnvironment(Lit34, this.Etape3$Initialize);
        }
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0608runtime.$Stthis$Mnform$St, "Etape3", "Initialize");
        } else {
            addToEvents(Lit0, Lit35);
        }
        this.HorizontalArrangement1 = null;
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0608runtime.addComponentWithinRepl(Lit0, Lit36, Lit37, lambda$Fn4), $result);
        } else {
            addToComponents(Lit0, Lit41, Lit37, lambda$Fn5);
        }
        this.VerticalArrangement1 = null;
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0608runtime.addComponentWithinRepl(Lit37, Lit42, Lit43, lambda$Fn6), $result);
        } else {
            addToComponents(Lit37, Lit48, Lit43, lambda$Fn7);
        }
        this.Image1 = null;
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0608runtime.addComponentWithinRepl(Lit43, Lit49, Lit31, lambda$Fn8), $result);
        } else {
            addToComponents(Lit43, Lit52, Lit31, lambda$Fn9);
        }
        this.HorizontalArrangement9 = null;
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0608runtime.addComponentWithinRepl(Lit43, Lit53, Lit54, lambda$Fn10), $result);
        } else {
            addToComponents(Lit43, Lit56, Lit54, lambda$Fn11);
        }
        this.Label1 = null;
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0608runtime.addComponentWithinRepl(Lit43, Lit57, Lit58, lambda$Fn12), $result);
        } else {
            addToComponents(Lit43, Lit69, Lit58, lambda$Fn13);
        }
        this.HorizontalArrangement2 = null;
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0608runtime.addComponentWithinRepl(Lit43, Lit70, Lit71, lambda$Fn14), $result);
        } else {
            addToComponents(Lit43, Lit73, Lit71, lambda$Fn15);
        }
        this.Slider1 = null;
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0608runtime.addComponentWithinRepl(Lit43, Lit74, Lit75, lambda$Fn16), $result);
        } else {
            addToComponents(Lit43, Lit87, Lit75, lambda$Fn17);
        }
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            C0608runtime.addToCurrentFormEnvironment(Lit91, this.Slider1$PositionChanged);
        } else {
            addToFormEnvironment(Lit91, this.Slider1$PositionChanged);
        }
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0608runtime.$Stthis$Mnform$St, "Slider1", "PositionChanged");
        } else {
            addToEvents(Lit75, Lit92);
        }
        this.Label2 = null;
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0608runtime.addComponentWithinRepl(Lit43, Lit93, Lit89, lambda$Fn18), $result);
        } else {
            addToComponents(Lit43, Lit94, Lit89, lambda$Fn19);
        }
        this.HorizontalArrangement3 = null;
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0608runtime.addComponentWithinRepl(Lit43, Lit95, Lit96, lambda$Fn20), $result);
        } else {
            addToComponents(Lit43, Lit97, Lit96, lambda$Fn21);
        }
        this.Button1 = null;
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0608runtime.addComponentWithinRepl(Lit43, Lit98, Lit99, lambda$Fn22), $result);
        } else {
            addToComponents(Lit43, Lit102, Lit99, lambda$Fn23);
        }
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            C0608runtime.addToCurrentFormEnvironment(Lit105, this.Button1$Click);
        } else {
            addToFormEnvironment(Lit105, this.Button1$Click);
        }
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0608runtime.$Stthis$Mnform$St, "Button1", "Click");
        } else {
            addToEvents(Lit99, Lit106);
        }
        this.HorizontalArrangement4 = null;
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0608runtime.addComponentWithinRepl(Lit0, Lit107, Lit108, lambda$Fn24), $result);
        } else {
            addToComponents(Lit0, Lit109, Lit108, lambda$Fn25);
        }
        this.HorizontalArrangement5 = null;
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0608runtime.addComponentWithinRepl(Lit108, Lit110, Lit111, lambda$Fn26), $result);
        } else {
            addToComponents(Lit108, Lit113, Lit111, lambda$Fn27);
        }
        this.HorizontalArrangement6 = null;
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0608runtime.addComponentWithinRepl(Lit108, Lit114, Lit115, lambda$Fn28), $result);
        } else {
            addToComponents(Lit108, Lit117, Lit115, lambda$Fn29);
        }
        this.HorizontalArrangement8 = null;
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0608runtime.addComponentWithinRepl(Lit108, Lit118, Lit119, lambda$Fn30), $result);
        } else {
            addToComponents(Lit108, Lit121, Lit119, lambda$Fn31);
        }
        this.HorizontalArrangement7 = null;
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0608runtime.addComponentWithinRepl(Lit108, Lit122, Lit123, lambda$Fn32), $result);
        } else {
            addToComponents(Lit108, Lit124, Lit123, lambda$Fn33);
        }
        this.TinyDB1 = null;
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0608runtime.addComponentWithinRepl(Lit0, Lit125, Lit25, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit126, Lit25, Boolean.FALSE);
        }
        C0608runtime.initRuntime();
    }

    static String lambda3() {
        return "";
    }

    static Object lambda4() {
        C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit4, Lit5, Lit6);
        C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit7, Boolean.TRUE, Lit8);
        C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit9, "MySadWorld", Lit10);
        C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit11, Lit12, Lit6);
        C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit13, "slidehorizontal", Lit10);
        C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit14, "slidehorizontal", Lit10);
        C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit15, Lit16, Lit6);
        C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit17, Lit18, Lit6);
        C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit19, "portrait", Lit10);
        C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit20, Boolean.TRUE, Lit8);
        C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit21, "Fixed", Lit10);
        C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit22, "AppTheme", Lit10);
        C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit23, "Etape3", Lit10);
        return C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit24, Boolean.FALSE, Lit8);
    }

    public Object Etape3$Initialize() {
        C0608runtime.setThisForm();
        if (C0608runtime.callComponentMethod(Lit25, Lit26, LList.list2("picture", "user-circle.png"), Lit27) == Boolean.FALSE) {
            return Values.empty;
        }
        C0608runtime.callComponentMethod(Lit25, Lit28, LList.list2("happiness", "5"), Lit29);
        C0608runtime.callComponentMethod(Lit25, Lit28, LList.list2("picture", "user-circle.png"), Lit30);
        return C0608runtime.setAndCoerceProperty$Ex(Lit31, Lit32, C0608runtime.callComponentMethod(Lit25, Lit26, LList.list2("picture", "user-circle.png"), Lit33), Lit10);
    }

    static Object lambda5() {
        C0608runtime.setAndCoerceProperty$Ex(Lit37, Lit38, Lit39, Lit6);
        return C0608runtime.setAndCoerceProperty$Ex(Lit37, Lit40, Lit39, Lit6);
    }

    static Object lambda6() {
        C0608runtime.setAndCoerceProperty$Ex(Lit37, Lit38, Lit39, Lit6);
        return C0608runtime.setAndCoerceProperty$Ex(Lit37, Lit40, Lit39, Lit6);
    }

    static Object lambda7() {
        C0608runtime.setAndCoerceProperty$Ex(Lit43, Lit44, Lit45, Lit6);
        C0608runtime.setAndCoerceProperty$Ex(Lit43, Lit46, Lit47, Lit6);
        C0608runtime.setAndCoerceProperty$Ex(Lit43, Lit38, Lit39, Lit6);
        return C0608runtime.setAndCoerceProperty$Ex(Lit43, Lit40, Lit39, Lit6);
    }

    static Object lambda8() {
        C0608runtime.setAndCoerceProperty$Ex(Lit43, Lit44, Lit45, Lit6);
        C0608runtime.setAndCoerceProperty$Ex(Lit43, Lit46, Lit47, Lit6);
        C0608runtime.setAndCoerceProperty$Ex(Lit43, Lit38, Lit39, Lit6);
        return C0608runtime.setAndCoerceProperty$Ex(Lit43, Lit40, Lit39, Lit6);
    }

    static Object lambda10() {
        C0608runtime.setAndCoerceProperty$Ex(Lit31, Lit38, Lit50, Lit6);
        C0608runtime.setAndCoerceProperty$Ex(Lit31, Lit32, "user-circle.png", Lit10);
        C0608runtime.setAndCoerceProperty$Ex(Lit31, Lit51, Boolean.TRUE, Lit8);
        return C0608runtime.setAndCoerceProperty$Ex(Lit31, Lit40, Lit50, Lit6);
    }

    static Object lambda9() {
        C0608runtime.setAndCoerceProperty$Ex(Lit31, Lit38, Lit50, Lit6);
        C0608runtime.setAndCoerceProperty$Ex(Lit31, Lit32, "user-circle.png", Lit10);
        C0608runtime.setAndCoerceProperty$Ex(Lit31, Lit51, Boolean.TRUE, Lit8);
        return C0608runtime.setAndCoerceProperty$Ex(Lit31, Lit40, Lit50, Lit6);
    }

    static Object lambda11() {
        C0608runtime.setAndCoerceProperty$Ex(Lit54, Lit38, Lit55, Lit6);
        return C0608runtime.setAndCoerceProperty$Ex(Lit54, Lit40, Lit39, Lit6);
    }

    static Object lambda12() {
        C0608runtime.setAndCoerceProperty$Ex(Lit54, Lit38, Lit55, Lit6);
        return C0608runtime.setAndCoerceProperty$Ex(Lit54, Lit40, Lit39, Lit6);
    }

    static Object lambda13() {
        C0608runtime.setAndCoerceProperty$Ex(Lit58, Lit59, Boolean.TRUE, Lit8);
        C0608runtime.setAndCoerceProperty$Ex(Lit58, Lit60, Lit61, Lit6);
        C0608runtime.setAndCoerceProperty$Ex(Lit58, Lit62, Lit63, Lit6);
        C0608runtime.setAndCoerceProperty$Ex(Lit58, Lit64, Boolean.TRUE, Lit8);
        C0608runtime.setAndCoerceProperty$Ex(Lit58, Lit65, "Vous êtes 😍 waw ! <br> Dernière question: comment vous allez en ce moment ?", Lit10);
        C0608runtime.setAndCoerceProperty$Ex(Lit58, Lit66, Lit63, Lit6);
        return C0608runtime.setAndCoerceProperty$Ex(Lit58, Lit67, Lit68, Lit6);
    }

    static Object lambda14() {
        C0608runtime.setAndCoerceProperty$Ex(Lit58, Lit59, Boolean.TRUE, Lit8);
        C0608runtime.setAndCoerceProperty$Ex(Lit58, Lit60, Lit61, Lit6);
        C0608runtime.setAndCoerceProperty$Ex(Lit58, Lit62, Lit63, Lit6);
        C0608runtime.setAndCoerceProperty$Ex(Lit58, Lit64, Boolean.TRUE, Lit8);
        C0608runtime.setAndCoerceProperty$Ex(Lit58, Lit65, "Vous êtes 😍 waw ! <br> Dernière question: comment vous allez en ce moment ?", Lit10);
        C0608runtime.setAndCoerceProperty$Ex(Lit58, Lit66, Lit63, Lit6);
        return C0608runtime.setAndCoerceProperty$Ex(Lit58, Lit67, Lit68, Lit6);
    }

    static Object lambda15() {
        C0608runtime.setAndCoerceProperty$Ex(Lit71, Lit38, Lit72, Lit6);
        return C0608runtime.setAndCoerceProperty$Ex(Lit71, Lit40, Lit39, Lit6);
    }

    static Object lambda16() {
        C0608runtime.setAndCoerceProperty$Ex(Lit71, Lit38, Lit72, Lit6);
        return C0608runtime.setAndCoerceProperty$Ex(Lit71, Lit40, Lit39, Lit6);
    }

    static Object lambda17() {
        C0608runtime.setAndCoerceProperty$Ex(Lit75, Lit76, Lit77, Lit6);
        C0608runtime.setAndCoerceProperty$Ex(Lit75, Lit78, Lit79, Lit6);
        C0608runtime.setAndCoerceProperty$Ex(Lit75, Lit80, Lit81, Lit6);
        C0608runtime.setAndCoerceProperty$Ex(Lit75, Lit82, Lit83, Lit6);
        C0608runtime.setAndCoerceProperty$Ex(Lit75, Lit84, Lit85, Lit6);
        return C0608runtime.setAndCoerceProperty$Ex(Lit75, Lit40, Lit86, Lit6);
    }

    static Object lambda18() {
        C0608runtime.setAndCoerceProperty$Ex(Lit75, Lit76, Lit77, Lit6);
        C0608runtime.setAndCoerceProperty$Ex(Lit75, Lit78, Lit79, Lit6);
        C0608runtime.setAndCoerceProperty$Ex(Lit75, Lit80, Lit81, Lit6);
        C0608runtime.setAndCoerceProperty$Ex(Lit75, Lit82, Lit83, Lit6);
        C0608runtime.setAndCoerceProperty$Ex(Lit75, Lit84, Lit85, Lit6);
        return C0608runtime.setAndCoerceProperty$Ex(Lit75, Lit40, Lit86, Lit6);
    }

    public Object Slider1$PositionChanged(Object $thumbPosition) {
        Object $thumbPosition2 = C0608runtime.sanitizeComponentData($thumbPosition);
        C0608runtime.setThisForm();
        SimpleSymbol simpleSymbol = Lit3;
        if ($thumbPosition2 instanceof Package) {
            $thumbPosition2 = C0608runtime.signalRuntimeError(strings.stringAppend("The variable ", C0608runtime.getDisplayRepresentation(Lit88), " is not bound in the current context"), "Unbound Variable");
        }
        C0608runtime.addGlobalVarToCurrentFormEnvironment(simpleSymbol, $thumbPosition2);
        return C0608runtime.setAndCoerceProperty$Ex(Lit89, Lit65, C0608runtime.callYailPrimitive(strings.string$Mnappend, LList.list2(C0608runtime.lookupGlobalVarInCurrentFormEnvironment(Lit3, C0608runtime.$Stthe$Mnnull$Mnvalue$St), "/10"), Lit90, "join"), Lit10);
    }

    static Object lambda19() {
        return C0608runtime.setAndCoerceProperty$Ex(Lit89, Lit59, Boolean.TRUE, Lit8);
    }

    static Object lambda20() {
        return C0608runtime.setAndCoerceProperty$Ex(Lit89, Lit59, Boolean.TRUE, Lit8);
    }

    static Object lambda21() {
        C0608runtime.setAndCoerceProperty$Ex(Lit96, Lit38, Lit72, Lit6);
        return C0608runtime.setAndCoerceProperty$Ex(Lit96, Lit40, Lit39, Lit6);
    }

    static Object lambda22() {
        C0608runtime.setAndCoerceProperty$Ex(Lit96, Lit38, Lit72, Lit6);
        return C0608runtime.setAndCoerceProperty$Ex(Lit96, Lit40, Lit39, Lit6);
    }

    static Object lambda23() {
        C0608runtime.setAndCoerceProperty$Ex(Lit99, Lit59, Boolean.TRUE, Lit8);
        C0608runtime.setAndCoerceProperty$Ex(Lit99, Lit38, Lit100, Lit6);
        C0608runtime.setAndCoerceProperty$Ex(Lit99, Lit101, "therare_b.png", Lit10);
        C0608runtime.setAndCoerceProperty$Ex(Lit99, Lit65, "Valider", Lit10);
        return C0608runtime.setAndCoerceProperty$Ex(Lit99, Lit40, Lit86, Lit6);
    }

    static Object lambda24() {
        C0608runtime.setAndCoerceProperty$Ex(Lit99, Lit59, Boolean.TRUE, Lit8);
        C0608runtime.setAndCoerceProperty$Ex(Lit99, Lit38, Lit100, Lit6);
        C0608runtime.setAndCoerceProperty$Ex(Lit99, Lit101, "therare_b.png", Lit10);
        C0608runtime.setAndCoerceProperty$Ex(Lit99, Lit65, "Valider", Lit10);
        return C0608runtime.setAndCoerceProperty$Ex(Lit99, Lit40, Lit86, Lit6);
    }

    public Object Button1$Click() {
        C0608runtime.setThisForm();
        C0608runtime.callComponentMethod(Lit25, Lit28, LList.list2("happiness", C0608runtime.lookupGlobalVarInCurrentFormEnvironment(Lit3, C0608runtime.$Stthe$Mnnull$Mnvalue$St)), Lit103);
        return C0608runtime.callYailPrimitive(C0608runtime.open$Mnanother$Mnscreen, LList.list1("Etape4"), Lit104, "open another screen");
    }

    static Object lambda25() {
        C0608runtime.setAndCoerceProperty$Ex(Lit108, Lit38, Lit72, Lit6);
        return C0608runtime.setAndCoerceProperty$Ex(Lit108, Lit40, Lit39, Lit6);
    }

    static Object lambda26() {
        C0608runtime.setAndCoerceProperty$Ex(Lit108, Lit38, Lit72, Lit6);
        return C0608runtime.setAndCoerceProperty$Ex(Lit108, Lit40, Lit39, Lit6);
    }

    static Object lambda27() {
        C0608runtime.setAndCoerceProperty$Ex(Lit111, Lit11, Lit112, Lit6);
        C0608runtime.setAndCoerceProperty$Ex(Lit111, Lit38, Lit72, Lit6);
        return C0608runtime.setAndCoerceProperty$Ex(Lit111, Lit40, Lit39, Lit6);
    }

    static Object lambda28() {
        C0608runtime.setAndCoerceProperty$Ex(Lit111, Lit11, Lit112, Lit6);
        C0608runtime.setAndCoerceProperty$Ex(Lit111, Lit38, Lit72, Lit6);
        return C0608runtime.setAndCoerceProperty$Ex(Lit111, Lit40, Lit39, Lit6);
    }

    static Object lambda29() {
        C0608runtime.setAndCoerceProperty$Ex(Lit115, Lit11, Lit116, Lit6);
        C0608runtime.setAndCoerceProperty$Ex(Lit115, Lit38, Lit72, Lit6);
        return C0608runtime.setAndCoerceProperty$Ex(Lit115, Lit40, Lit39, Lit6);
    }

    static Object lambda30() {
        C0608runtime.setAndCoerceProperty$Ex(Lit115, Lit11, Lit116, Lit6);
        C0608runtime.setAndCoerceProperty$Ex(Lit115, Lit38, Lit72, Lit6);
        return C0608runtime.setAndCoerceProperty$Ex(Lit115, Lit40, Lit39, Lit6);
    }

    static Object lambda31() {
        C0608runtime.setAndCoerceProperty$Ex(Lit119, Lit11, Lit120, Lit6);
        C0608runtime.setAndCoerceProperty$Ex(Lit119, Lit38, Lit72, Lit6);
        return C0608runtime.setAndCoerceProperty$Ex(Lit119, Lit40, Lit39, Lit6);
    }

    static Object lambda32() {
        C0608runtime.setAndCoerceProperty$Ex(Lit119, Lit11, Lit120, Lit6);
        C0608runtime.setAndCoerceProperty$Ex(Lit119, Lit38, Lit72, Lit6);
        return C0608runtime.setAndCoerceProperty$Ex(Lit119, Lit40, Lit39, Lit6);
    }

    static Object lambda33() {
        C0608runtime.setAndCoerceProperty$Ex(Lit123, Lit38, Lit72, Lit6);
        return C0608runtime.setAndCoerceProperty$Ex(Lit123, Lit40, Lit39, Lit6);
    }

    static Object lambda34() {
        C0608runtime.setAndCoerceProperty$Ex(Lit123, Lit38, Lit72, Lit6);
        return C0608runtime.setAndCoerceProperty$Ex(Lit123, Lit40, Lit39, Lit6);
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
        Etape3 = this;
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