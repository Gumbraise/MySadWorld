package appinventor.ai_gumbraise.MySadWorld;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.AppInventorCompatActivity;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.Notifier;
import com.google.appinventor.components.runtime.Slider;
import com.google.appinventor.components.runtime.TinyDB;
import com.google.appinventor.components.runtime.VerticalArrangement;
import com.google.appinventor.components.runtime.Web;
import com.google.appinventor.components.runtime.errors.PermissionException;
import com.google.appinventor.components.runtime.errors.YailRuntimeError;
import com.google.appinventor.components.runtime.util.RetValManager;
import com.google.appinventor.components.runtime.util.RuntimeErrorAlert;
import com.google.youngandroid.runtime;
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
import gnu.mapping.SimpleSymbol;
import gnu.mapping.Symbol;
import gnu.mapping.Values;
import gnu.mapping.WrongType;
import gnu.math.IntNum;
import kawa.lang.Promise;
import kawa.lib.lists;
import kawa.lib.misc;
import kawa.lib.strings;
import kawa.standard.Scheme;

/* compiled from: Happiness.yail */
public class Happiness extends Form implements Runnable {
    public static Happiness Happiness;
    static final SimpleSymbol Lit0 = ((SimpleSymbol) new SimpleSymbol("Happiness").readResolve());
    static final SimpleSymbol Lit1 = ((SimpleSymbol) new SimpleSymbol("getMessage").readResolve());
    static final SimpleSymbol Lit10;
    static final FString Lit100 = new FString("com.google.appinventor.components.runtime.TinyDB");
    static final FString Lit101 = new FString("com.google.appinventor.components.runtime.Web");
    static final FString Lit102 = new FString("com.google.appinventor.components.runtime.Web");
    static final SimpleSymbol Lit103 = ((SimpleSymbol) new SimpleSymbol("$responseCode").readResolve());
    static final PairWithPosition Lit104 = PairWithPosition.make(Lit132, PairWithPosition.make(Lit132, LList.Empty, "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Happiness.yail", 602217), "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Happiness.yail", 602212);
    static final SimpleSymbol Lit105 = ((SimpleSymbol) new SimpleSymbol("$responseContent").readResolve());
    static final PairWithPosition Lit106 = PairWithPosition.make(Lit132, PairWithPosition.make(Lit132, LList.Empty, "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Happiness.yail", 602339), "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Happiness.yail", 602334);
    static final PairWithPosition Lit107 = PairWithPosition.make(Lit10, LList.Empty, "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Happiness.yail", 602431);
    static final SimpleSymbol Lit108 = ((SimpleSymbol) new SimpleSymbol("Notifier1").readResolve());
    static final SimpleSymbol Lit109 = ((SimpleSymbol) new SimpleSymbol("ShowChooseDialog").readResolve());
    static final SimpleSymbol Lit11 = ((SimpleSymbol) new SimpleSymbol("BackgroundColor").readResolve());
    static final PairWithPosition Lit110 = PairWithPosition.make(Lit10, PairWithPosition.make(Lit10, PairWithPosition.make(Lit10, PairWithPosition.make(Lit10, PairWithPosition.make(Lit8, LList.Empty, "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Happiness.yail", 602621), "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Happiness.yail", 602616), "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Happiness.yail", 602611), "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Happiness.yail", 602606), "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Happiness.yail", 602600);
    static final PairWithPosition Lit111;
    static final SimpleSymbol Lit112 = ((SimpleSymbol) new SimpleSymbol("Web1$GotText").readResolve());
    static final SimpleSymbol Lit113 = ((SimpleSymbol) new SimpleSymbol("GotText").readResolve());
    static final FString Lit114 = new FString("com.google.appinventor.components.runtime.Notifier");
    static final FString Lit115 = new FString("com.google.appinventor.components.runtime.Notifier");
    static final SimpleSymbol Lit116 = ((SimpleSymbol) new SimpleSymbol("Notifier1$AfterChoosing").readResolve());
    static final SimpleSymbol Lit117 = ((SimpleSymbol) new SimpleSymbol("AfterChoosing").readResolve());
    static final SimpleSymbol Lit118 = ((SimpleSymbol) new SimpleSymbol("get-simple-name").readResolve());
    static final SimpleSymbol Lit119 = ((SimpleSymbol) new SimpleSymbol("android-log-form").readResolve());
    static final IntNum Lit12;
    static final SimpleSymbol Lit120 = ((SimpleSymbol) new SimpleSymbol("add-to-form-environment").readResolve());
    static final SimpleSymbol Lit121 = ((SimpleSymbol) new SimpleSymbol("lookup-in-form-environment").readResolve());
    static final SimpleSymbol Lit122 = ((SimpleSymbol) new SimpleSymbol("is-bound-in-form-environment").readResolve());
    static final SimpleSymbol Lit123 = ((SimpleSymbol) new SimpleSymbol("add-to-global-var-environment").readResolve());
    static final SimpleSymbol Lit124 = ((SimpleSymbol) new SimpleSymbol("add-to-events").readResolve());
    static final SimpleSymbol Lit125 = ((SimpleSymbol) new SimpleSymbol("add-to-components").readResolve());
    static final SimpleSymbol Lit126 = ((SimpleSymbol) new SimpleSymbol("add-to-global-vars").readResolve());
    static final SimpleSymbol Lit127 = ((SimpleSymbol) new SimpleSymbol("add-to-form-do-after-creation").readResolve());
    static final SimpleSymbol Lit128 = ((SimpleSymbol) new SimpleSymbol("send-error").readResolve());
    static final SimpleSymbol Lit129 = ((SimpleSymbol) new SimpleSymbol("dispatchEvent").readResolve());
    static final SimpleSymbol Lit13 = ((SimpleSymbol) new SimpleSymbol("CloseScreenAnimation").readResolve());
    static final SimpleSymbol Lit130 = ((SimpleSymbol) new SimpleSymbol("dispatchGenericEvent").readResolve());
    static final SimpleSymbol Lit131 = ((SimpleSymbol) new SimpleSymbol("lookup-handler").readResolve());
    static final SimpleSymbol Lit132 = ((SimpleSymbol) new SimpleSymbol("any").readResolve());
    static final SimpleSymbol Lit14 = ((SimpleSymbol) new SimpleSymbol("PrimaryColor").readResolve());
    static final IntNum Lit15;
    static final SimpleSymbol Lit16 = ((SimpleSymbol) new SimpleSymbol("PrimaryColorDark").readResolve());
    static final IntNum Lit17;
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
    static final PairWithPosition Lit28 = PairWithPosition.make(Lit10, PairWithPosition.make(Lit132, LList.Empty, "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Happiness.yail", 110788), "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Happiness.yail", 110782);
    static final PairWithPosition Lit29 = PairWithPosition.make(Lit10, PairWithPosition.make(Lit10, PairWithPosition.make(Lit10, LList.Empty, "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Happiness.yail", 110858), "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Happiness.yail", 110853), "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Happiness.yail", 110847);
    static final SimpleSymbol Lit3 = ((SimpleSymbol) new SimpleSymbol("g$variable").readResolve());
    static final SimpleSymbol Lit30 = ((SimpleSymbol) new SimpleSymbol("Happiness$Initialize").readResolve());
    static final SimpleSymbol Lit31 = ((SimpleSymbol) new SimpleSymbol("Initialize").readResolve());
    static final FString Lit32 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit33 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement1").readResolve());
    static final SimpleSymbol Lit34 = ((SimpleSymbol) new SimpleSymbol("Height").readResolve());
    static final IntNum Lit35 = IntNum.make(-2);
    static final SimpleSymbol Lit36 = ((SimpleSymbol) new SimpleSymbol("Width").readResolve());
    static final FString Lit37 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit38 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final SimpleSymbol Lit39 = ((SimpleSymbol) new SimpleSymbol("VerticalArrangement1").readResolve());
    static final SimpleSymbol Lit4 = ((SimpleSymbol) new SimpleSymbol("AccentColor").readResolve());
    static final SimpleSymbol Lit40 = ((SimpleSymbol) new SimpleSymbol("AlignHorizontal").readResolve());
    static final IntNum Lit41 = IntNum.make(3);
    static final SimpleSymbol Lit42 = ((SimpleSymbol) new SimpleSymbol("AlignVertical").readResolve());
    static final IntNum Lit43 = IntNum.make(2);
    static final FString Lit44 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final FString Lit45 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit46 = ((SimpleSymbol) new SimpleSymbol("FontBold").readResolve());
    static final SimpleSymbol Lit47 = ((SimpleSymbol) new SimpleSymbol("FontSize").readResolve());
    static final IntNum Lit48 = IntNum.make(15);
    static final SimpleSymbol Lit49 = ((SimpleSymbol) new SimpleSymbol("FontTypeface").readResolve());
    static final IntNum Lit5;
    static final IntNum Lit50 = IntNum.make(1);
    static final SimpleSymbol Lit51 = ((SimpleSymbol) new SimpleSymbol("TextAlignment").readResolve());
    static final SimpleSymbol Lit52 = ((SimpleSymbol) new SimpleSymbol("TextColor").readResolve());
    static final IntNum Lit53;
    static final FString Lit54 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit55 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit56 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement2").readResolve());
    static final IntNum Lit57 = IntNum.make(20);
    static final FString Lit58 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit59 = new FString("com.google.appinventor.components.runtime.Slider");
    static final SimpleSymbol Lit6 = ((SimpleSymbol) new SimpleSymbol("number").readResolve());
    static final SimpleSymbol Lit60 = ((SimpleSymbol) new SimpleSymbol("Slider1").readResolve());
    static final SimpleSymbol Lit61 = ((SimpleSymbol) new SimpleSymbol("ColorLeft").readResolve());
    static final IntNum Lit62;
    static final SimpleSymbol Lit63 = ((SimpleSymbol) new SimpleSymbol("ColorRight").readResolve());
    static final IntNum Lit64;
    static final SimpleSymbol Lit65 = ((SimpleSymbol) new SimpleSymbol("MaxValue").readResolve());
    static final IntNum Lit66 = IntNum.make(10);
    static final SimpleSymbol Lit67 = ((SimpleSymbol) new SimpleSymbol("MinValue").readResolve());
    static final IntNum Lit68 = IntNum.make(0);
    static final SimpleSymbol Lit69 = ((SimpleSymbol) new SimpleSymbol("ThumbPosition").readResolve());
    static final SimpleSymbol Lit7 = ((SimpleSymbol) new SimpleSymbol("ActionBar").readResolve());
    static final IntNum Lit70 = IntNum.make(5);
    static final IntNum Lit71 = IntNum.make((int) HttpRequestContext.HTTP_OK);
    static final FString Lit72 = new FString("com.google.appinventor.components.runtime.Slider");
    static final SimpleSymbol Lit73 = ((SimpleSymbol) new SimpleSymbol("$thumbPosition").readResolve());
    static final SimpleSymbol Lit74 = ((SimpleSymbol) new SimpleSymbol("Label2").readResolve());
    static final PairWithPosition Lit75 = PairWithPosition.make(Lit10, PairWithPosition.make(Lit10, LList.Empty, "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Happiness.yail", 377020), "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Happiness.yail", 377014);
    static final SimpleSymbol Lit76 = ((SimpleSymbol) new SimpleSymbol("Button1").readResolve());
    static final SimpleSymbol Lit77 = ((SimpleSymbol) new SimpleSymbol("Enabled").readResolve());
    static final SimpleSymbol Lit78 = ((SimpleSymbol) new SimpleSymbol("Image").readResolve());
    static final SimpleSymbol Lit79 = ((SimpleSymbol) new SimpleSymbol("Slider1$PositionChanged").readResolve());
    static final SimpleSymbol Lit8;
    static final SimpleSymbol Lit80 = ((SimpleSymbol) new SimpleSymbol("PositionChanged").readResolve());
    static final FString Lit81 = new FString("com.google.appinventor.components.runtime.Label");
    static final IntNum Lit82;
    static final FString Lit83 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit84 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit85 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement3").readResolve());
    static final FString Lit86 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit87 = new FString("com.google.appinventor.components.runtime.Button");
    static final IntNum Lit88 = IntNum.make(14);
    static final IntNum Lit89 = IntNum.make(40);
    static final SimpleSymbol Lit9 = ((SimpleSymbol) new SimpleSymbol("AppName").readResolve());
    static final IntNum Lit90 = IntNum.make(250);
    static final FString Lit91 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit92 = ((SimpleSymbol) new SimpleSymbol("Web1").readResolve());
    static final SimpleSymbol Lit93 = ((SimpleSymbol) new SimpleSymbol("Url").readResolve());
    static final PairWithPosition Lit94 = PairWithPosition.make(Lit10, PairWithPosition.make(Lit132, LList.Empty, "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Happiness.yail", 553202), "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Happiness.yail", 553196);
    static final PairWithPosition Lit95 = PairWithPosition.make(Lit10, PairWithPosition.make(Lit10, PairWithPosition.make(Lit10, PairWithPosition.make(Lit10, LList.Empty, "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Happiness.yail", 553262), "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Happiness.yail", 553257), "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Happiness.yail", 553252), "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Happiness.yail", 553246);
    static final SimpleSymbol Lit96 = ((SimpleSymbol) new SimpleSymbol("Get").readResolve());
    static final SimpleSymbol Lit97 = ((SimpleSymbol) new SimpleSymbol("Button1$Click").readResolve());
    static final SimpleSymbol Lit98 = ((SimpleSymbol) new SimpleSymbol("Click").readResolve());
    static final FString Lit99 = new FString("com.google.appinventor.components.runtime.TinyDB");
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
    public Button Button1;
    public final ModuleMethod Button1$Click;
    public final ModuleMethod Happiness$Initialize;
    public HorizontalArrangement HorizontalArrangement1;
    public HorizontalArrangement HorizontalArrangement2;
    public HorizontalArrangement HorizontalArrangement3;
    public Label Label1;
    public Label Label2;
    public Notifier Notifier1;
    public final ModuleMethod Notifier1$AfterChoosing;
    public Slider Slider1;
    public final ModuleMethod Slider1$PositionChanged;
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

    static {
        SimpleSymbol simpleSymbol = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT).readResolve();
        Lit10 = simpleSymbol;
        SimpleSymbol simpleSymbol2 = Lit10;
        SimpleSymbol simpleSymbol3 = Lit10;
        SimpleSymbol simpleSymbol4 = Lit10;
        SimpleSymbol simpleSymbol5 = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_BOOLEAN).readResolve();
        Lit8 = simpleSymbol5;
        Lit111 = PairWithPosition.make(simpleSymbol, PairWithPosition.make(simpleSymbol2, PairWithPosition.make(simpleSymbol3, PairWithPosition.make(simpleSymbol4, PairWithPosition.make(simpleSymbol5, LList.Empty, "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Happiness.yail", 602793), "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Happiness.yail", 602788), "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Happiness.yail", 602783), "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Happiness.yail", 602778), "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Happiness.yail", 602772);
        int[] iArr = new int[2];
        iArr[0] = -1;
        Lit82 = IntNum.make(iArr);
        int[] iArr2 = new int[2];
        iArr2[0] = -1154152;
        Lit64 = IntNum.make(iArr2);
        int[] iArr3 = new int[2];
        iArr3[0] = -6019137;
        Lit62 = IntNum.make(iArr3);
        int[] iArr4 = new int[2];
        iArr4[0] = -1;
        Lit53 = IntNum.make(iArr4);
        int[] iArr5 = new int[2];
        iArr5[0] = -16777216;
        Lit17 = IntNum.make(iArr5);
        int[] iArr6 = new int[2];
        iArr6[0] = -16777216;
        Lit15 = IntNum.make(iArr6);
        int[] iArr7 = new int[2];
        iArr7[0] = -16777216;
        Lit12 = IntNum.make(iArr7);
        int[] iArr8 = new int[2];
        iArr8[0] = -6019137;
        Lit5 = IntNum.make(iArr8);
    }

    public Happiness() {
        ModuleInfo.register(this);
        frame frame2 = new frame();
        frame2.$main = this;
        this.get$Mnsimple$Mnname = new ModuleMethod(frame2, 1, Lit118, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.onCreate = new ModuleMethod(frame2, 2, "onCreate", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.android$Mnlog$Mnform = new ModuleMethod(frame2, 3, Lit119, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(frame2, 4, Lit120, 8194);
        this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame2, 5, Lit121, 8193);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame2, 7, Lit122, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(frame2, 8, Lit123, 8194);
        this.add$Mnto$Mnevents = new ModuleMethod(frame2, 9, Lit124, 8194);
        this.add$Mnto$Mncomponents = new ModuleMethod(frame2, 10, Lit125, 16388);
        this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(frame2, 11, Lit126, 8194);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(frame2, 12, Lit127, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.send$Mnerror = new ModuleMethod(frame2, 13, Lit128, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.process$Mnexception = new ModuleMethod(frame2, 14, "process-exception", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.dispatchEvent = new ModuleMethod(frame2, 15, Lit129, 16388);
        this.dispatchGenericEvent = new ModuleMethod(frame2, 16, Lit130, 16388);
        this.lookup$Mnhandler = new ModuleMethod(frame2, 17, Lit131, 8194);
        ModuleMethod moduleMethod = new ModuleMethod(frame2, 18, (Object) null, 0);
        moduleMethod.setProperty("source-location", "/tmp/runtime8949535697318280206.scm:622");
        lambda$Fn1 = moduleMethod;
        this.$define = new ModuleMethod(frame2, 19, "$define", 0);
        lambda$Fn2 = new ModuleMethod(frame2, 20, (Object) null, 0);
        lambda$Fn3 = new ModuleMethod(frame2, 21, (Object) null, 0);
        this.Happiness$Initialize = new ModuleMethod(frame2, 22, Lit30, 0);
        lambda$Fn4 = new ModuleMethod(frame2, 23, (Object) null, 0);
        lambda$Fn5 = new ModuleMethod(frame2, 24, (Object) null, 0);
        lambda$Fn6 = new ModuleMethod(frame2, 25, (Object) null, 0);
        lambda$Fn7 = new ModuleMethod(frame2, 26, (Object) null, 0);
        lambda$Fn8 = new ModuleMethod(frame2, 27, (Object) null, 0);
        lambda$Fn9 = new ModuleMethod(frame2, 28, (Object) null, 0);
        lambda$Fn10 = new ModuleMethod(frame2, 29, (Object) null, 0);
        lambda$Fn11 = new ModuleMethod(frame2, 30, (Object) null, 0);
        lambda$Fn12 = new ModuleMethod(frame2, 31, (Object) null, 0);
        lambda$Fn13 = new ModuleMethod(frame2, 32, (Object) null, 0);
        this.Slider1$PositionChanged = new ModuleMethod(frame2, 33, Lit79, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        lambda$Fn14 = new ModuleMethod(frame2, 34, (Object) null, 0);
        lambda$Fn15 = new ModuleMethod(frame2, 35, (Object) null, 0);
        lambda$Fn16 = new ModuleMethod(frame2, 36, (Object) null, 0);
        lambda$Fn17 = new ModuleMethod(frame2, 37, (Object) null, 0);
        lambda$Fn18 = new ModuleMethod(frame2, 38, (Object) null, 0);
        lambda$Fn19 = new ModuleMethod(frame2, 39, (Object) null, 0);
        this.Button1$Click = new ModuleMethod(frame2, 40, Lit97, 0);
        this.Web1$GotText = new ModuleMethod(frame2, 41, Lit112, 16388);
        this.Notifier1$AfterChoosing = new ModuleMethod(frame2, 42, Lit116, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
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
        runtime.$instance.run();
        this.$Stdebug$Mnform$St = Boolean.FALSE;
        this.form$Mnenvironment = Environment.make(misc.symbol$To$String(Lit0));
        FString stringAppend = strings.stringAppend(misc.symbol$To$String(Lit0), "-global-vars");
        if (stringAppend == null) {
            obj = null;
        } else {
            obj = stringAppend.toString();
        }
        this.global$Mnvar$Mnenvironment = Environment.make(obj);
        Happiness = null;
        this.form$Mnname$Mnsymbol = Lit0;
        this.events$Mnto$Mnregister = LList.Empty;
        this.components$Mnto$Mncreate = LList.Empty;
        this.global$Mnvars$Mnto$Mncreate = LList.Empty;
        this.form$Mndo$Mnafter$Mncreation = LList.Empty;
        runtime.$instance.run();
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit3, ""), $result);
        } else {
            addToGlobalVars(Lit3, lambda$Fn2);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.setAndCoerceProperty$Ex(Lit0, Lit4, Lit5, Lit6);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit7, Boolean.TRUE, Lit8);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit9, "MySadWorld", Lit10);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit11, Lit12, Lit6);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit13, "fade", Lit10);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit14, Lit15, Lit6);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit16, Lit17, Lit6);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit18, "portrait", Lit10);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit19, Boolean.TRUE, Lit8);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit20, "Responsive", Lit10);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit21, "AppTheme", Lit10);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit22, "Happiness", Lit10);
            Values.writeValues(runtime.setAndCoerceProperty$Ex(Lit0, Lit23, Boolean.FALSE, Lit8), $result);
        } else {
            addToFormDoAfterCreation(new Promise(lambda$Fn3));
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit30, this.Happiness$Initialize);
        } else {
            addToFormEnvironment(Lit30, this.Happiness$Initialize);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Happiness", "Initialize");
        } else {
            addToEvents(Lit0, Lit31);
        }
        this.HorizontalArrangement1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit32, Lit33, lambda$Fn4), $result);
        } else {
            addToComponents(Lit0, Lit37, Lit33, lambda$Fn5);
        }
        this.VerticalArrangement1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit33, Lit38, Lit39, lambda$Fn6), $result);
        } else {
            addToComponents(Lit33, Lit44, Lit39, lambda$Fn7);
        }
        this.Label1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit39, Lit45, Lit24, lambda$Fn8), $result);
        } else {
            addToComponents(Lit39, Lit54, Lit24, lambda$Fn9);
        }
        this.HorizontalArrangement2 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit39, Lit55, Lit56, lambda$Fn10), $result);
        } else {
            addToComponents(Lit39, Lit58, Lit56, lambda$Fn11);
        }
        this.Slider1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit39, Lit59, Lit60, lambda$Fn12), $result);
        } else {
            addToComponents(Lit39, Lit72, Lit60, lambda$Fn13);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit79, this.Slider1$PositionChanged);
        } else {
            addToFormEnvironment(Lit79, this.Slider1$PositionChanged);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Slider1", "PositionChanged");
        } else {
            addToEvents(Lit60, Lit80);
        }
        this.Label2 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit39, Lit81, Lit74, lambda$Fn14), $result);
        } else {
            addToComponents(Lit39, Lit83, Lit74, lambda$Fn15);
        }
        this.HorizontalArrangement3 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit39, Lit84, Lit85, lambda$Fn16), $result);
        } else {
            addToComponents(Lit39, Lit86, Lit85, lambda$Fn17);
        }
        this.Button1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit39, Lit87, Lit76, lambda$Fn18), $result);
        } else {
            addToComponents(Lit39, Lit91, Lit76, lambda$Fn19);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit97, this.Button1$Click);
        } else {
            addToFormEnvironment(Lit97, this.Button1$Click);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Button1", "Click");
        } else {
            addToEvents(Lit76, Lit98);
        }
        this.TinyDB1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit99, Lit26, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit100, Lit26, Boolean.FALSE);
        }
        this.Web1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit101, Lit92, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit102, Lit92, Boolean.FALSE);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit112, this.Web1$GotText);
        } else {
            addToFormEnvironment(Lit112, this.Web1$GotText);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Web1", "GotText");
        } else {
            addToEvents(Lit92, Lit113);
        }
        this.Notifier1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit114, Lit108, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit115, Lit108, Boolean.FALSE);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit116, this.Notifier1$AfterChoosing);
        } else {
            addToFormEnvironment(Lit116, this.Notifier1$AfterChoosing);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Notifier1", "AfterChoosing");
        } else {
            addToEvents(Lit108, Lit117);
        }
        runtime.initRuntime();
    }

    static String lambda3() {
        return "";
    }

    static Object lambda4() {
        runtime.setAndCoerceProperty$Ex(Lit0, Lit4, Lit5, Lit6);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit7, Boolean.TRUE, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit9, "MySadWorld", Lit10);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit11, Lit12, Lit6);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit13, "fade", Lit10);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit14, Lit15, Lit6);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit16, Lit17, Lit6);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit18, "portrait", Lit10);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit19, Boolean.TRUE, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit20, "Responsive", Lit10);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit21, "AppTheme", Lit10);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit22, "Happiness", Lit10);
        return runtime.setAndCoerceProperty$Ex(Lit0, Lit23, Boolean.FALSE, Lit8);
    }

    public Object Happiness$Initialize() {
        runtime.setThisForm();
        return runtime.setAndCoerceProperty$Ex(Lit24, Lit25, runtime.callYailPrimitive(strings.string$Mnappend, LList.list3("Bonjour ", runtime.callComponentMethod(Lit26, Lit27, LList.list2("name", "NULL"), Lit28), ". Comment allez-vous aujourd'hui ? 😊"), Lit29, "join"), Lit10);
    }

    static Object lambda5() {
        runtime.setAndCoerceProperty$Ex(Lit33, Lit34, Lit35, Lit6);
        return runtime.setAndCoerceProperty$Ex(Lit33, Lit36, Lit35, Lit6);
    }

    static Object lambda6() {
        runtime.setAndCoerceProperty$Ex(Lit33, Lit34, Lit35, Lit6);
        return runtime.setAndCoerceProperty$Ex(Lit33, Lit36, Lit35, Lit6);
    }

    static Object lambda7() {
        runtime.setAndCoerceProperty$Ex(Lit39, Lit40, Lit41, Lit6);
        runtime.setAndCoerceProperty$Ex(Lit39, Lit42, Lit43, Lit6);
        runtime.setAndCoerceProperty$Ex(Lit39, Lit34, Lit35, Lit6);
        return runtime.setAndCoerceProperty$Ex(Lit39, Lit36, Lit35, Lit6);
    }

    static Object lambda8() {
        runtime.setAndCoerceProperty$Ex(Lit39, Lit40, Lit41, Lit6);
        runtime.setAndCoerceProperty$Ex(Lit39, Lit42, Lit43, Lit6);
        runtime.setAndCoerceProperty$Ex(Lit39, Lit34, Lit35, Lit6);
        return runtime.setAndCoerceProperty$Ex(Lit39, Lit36, Lit35, Lit6);
    }

    static Object lambda10() {
        runtime.setAndCoerceProperty$Ex(Lit24, Lit46, Boolean.TRUE, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit24, Lit47, Lit48, Lit6);
        runtime.setAndCoerceProperty$Ex(Lit24, Lit49, Lit50, Lit6);
        runtime.setAndCoerceProperty$Ex(Lit24, Lit25, "...", Lit10);
        runtime.setAndCoerceProperty$Ex(Lit24, Lit51, Lit50, Lit6);
        return runtime.setAndCoerceProperty$Ex(Lit24, Lit52, Lit53, Lit6);
    }

    static Object lambda9() {
        runtime.setAndCoerceProperty$Ex(Lit24, Lit46, Boolean.TRUE, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit24, Lit47, Lit48, Lit6);
        runtime.setAndCoerceProperty$Ex(Lit24, Lit49, Lit50, Lit6);
        runtime.setAndCoerceProperty$Ex(Lit24, Lit25, "...", Lit10);
        runtime.setAndCoerceProperty$Ex(Lit24, Lit51, Lit50, Lit6);
        return runtime.setAndCoerceProperty$Ex(Lit24, Lit52, Lit53, Lit6);
    }

    static Object lambda11() {
        return runtime.setAndCoerceProperty$Ex(Lit56, Lit34, Lit57, Lit6);
    }

    static Object lambda12() {
        return runtime.setAndCoerceProperty$Ex(Lit56, Lit34, Lit57, Lit6);
    }

    static Object lambda13() {
        runtime.setAndCoerceProperty$Ex(Lit60, Lit61, Lit62, Lit6);
        runtime.setAndCoerceProperty$Ex(Lit60, Lit63, Lit64, Lit6);
        runtime.setAndCoerceProperty$Ex(Lit60, Lit65, Lit66, Lit6);
        runtime.setAndCoerceProperty$Ex(Lit60, Lit67, Lit68, Lit6);
        runtime.setAndCoerceProperty$Ex(Lit60, Lit69, Lit70, Lit6);
        return runtime.setAndCoerceProperty$Ex(Lit60, Lit36, Lit71, Lit6);
    }

    static Object lambda14() {
        runtime.setAndCoerceProperty$Ex(Lit60, Lit61, Lit62, Lit6);
        runtime.setAndCoerceProperty$Ex(Lit60, Lit63, Lit64, Lit6);
        runtime.setAndCoerceProperty$Ex(Lit60, Lit65, Lit66, Lit6);
        runtime.setAndCoerceProperty$Ex(Lit60, Lit67, Lit68, Lit6);
        runtime.setAndCoerceProperty$Ex(Lit60, Lit69, Lit70, Lit6);
        return runtime.setAndCoerceProperty$Ex(Lit60, Lit36, Lit71, Lit6);
    }

    public Object Slider1$PositionChanged(Object $thumbPosition) {
        Object $thumbPosition2 = runtime.sanitizeComponentData($thumbPosition);
        runtime.setThisForm();
        SimpleSymbol simpleSymbol = Lit3;
        if ($thumbPosition2 instanceof Package) {
            $thumbPosition2 = runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit73), " is not bound in the current context"), "Unbound Variable");
        }
        runtime.addGlobalVarToCurrentFormEnvironment(simpleSymbol, $thumbPosition2);
        runtime.setAndCoerceProperty$Ex(Lit74, Lit25, runtime.callYailPrimitive(strings.string$Mnappend, LList.list2(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit3, runtime.$Stthe$Mnnull$Mnvalue$St), "/10"), Lit75, "join"), Lit10);
        runtime.setAndCoerceProperty$Ex(Lit76, Lit77, Boolean.TRUE, Lit8);
        return runtime.setAndCoerceProperty$Ex(Lit76, Lit78, "therare_b.png", Lit10);
    }

    static Object lambda15() {
        runtime.setAndCoerceProperty$Ex(Lit74, Lit46, Boolean.TRUE, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit74, Lit49, Lit50, Lit6);
        runtime.setAndCoerceProperty$Ex(Lit74, Lit51, Lit50, Lit6);
        return runtime.setAndCoerceProperty$Ex(Lit74, Lit52, Lit82, Lit6);
    }

    static Object lambda16() {
        runtime.setAndCoerceProperty$Ex(Lit74, Lit46, Boolean.TRUE, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit74, Lit49, Lit50, Lit6);
        runtime.setAndCoerceProperty$Ex(Lit74, Lit51, Lit50, Lit6);
        return runtime.setAndCoerceProperty$Ex(Lit74, Lit52, Lit82, Lit6);
    }

    static Object lambda17() {
        return runtime.setAndCoerceProperty$Ex(Lit85, Lit34, Lit57, Lit6);
    }

    static Object lambda18() {
        return runtime.setAndCoerceProperty$Ex(Lit85, Lit34, Lit57, Lit6);
    }

    static Object lambda19() {
        runtime.setAndCoerceProperty$Ex(Lit76, Lit77, Boolean.FALSE, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit76, Lit46, Boolean.TRUE, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit76, Lit47, Lit88, Lit6);
        runtime.setAndCoerceProperty$Ex(Lit76, Lit49, Lit50, Lit6);
        runtime.setAndCoerceProperty$Ex(Lit76, Lit34, Lit89, Lit6);
        runtime.setAndCoerceProperty$Ex(Lit76, Lit78, "therare_bw.png", Lit10);
        runtime.setAndCoerceProperty$Ex(Lit76, Lit25, "Valider", Lit10);
        return runtime.setAndCoerceProperty$Ex(Lit76, Lit36, Lit90, Lit6);
    }

    static Object lambda20() {
        runtime.setAndCoerceProperty$Ex(Lit76, Lit77, Boolean.FALSE, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit76, Lit46, Boolean.TRUE, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit76, Lit47, Lit88, Lit6);
        runtime.setAndCoerceProperty$Ex(Lit76, Lit49, Lit50, Lit6);
        runtime.setAndCoerceProperty$Ex(Lit76, Lit34, Lit89, Lit6);
        runtime.setAndCoerceProperty$Ex(Lit76, Lit78, "therare_bw.png", Lit10);
        runtime.setAndCoerceProperty$Ex(Lit76, Lit25, "Valider", Lit10);
        return runtime.setAndCoerceProperty$Ex(Lit76, Lit36, Lit90, Lit6);
    }

    public Object Button1$Click() {
        runtime.setThisForm();
        runtime.setAndCoerceProperty$Ex(Lit92, Lit93, runtime.callYailPrimitive(strings.string$Mnappend, LList.list4("http://msw.kellis.fr/android/actions/happiness.php?id=", runtime.callComponentMethod(Lit26, Lit27, LList.list2("user_id", "NULL"), Lit94), "&happiness=", runtime.lookupGlobalVarInCurrentFormEnvironment(Lit3, runtime.$Stthe$Mnnull$Mnvalue$St)), Lit95, "join"), Lit10);
        return runtime.callComponentMethod(Lit92, Lit96, LList.Empty, LList.Empty);
    }

    public Object Web1$GotText(Object $url, Object $responseCode, Object $responseType, Object $responseContent) {
        runtime.sanitizeComponentData($url);
        Object $responseCode2 = runtime.sanitizeComponentData($responseCode);
        runtime.sanitizeComponentData($responseType);
        Object $responseContent2 = runtime.sanitizeComponentData($responseContent);
        runtime.setThisForm();
        ModuleMethod moduleMethod = runtime.yail$Mnequal$Qu;
        if ($responseCode2 instanceof Package) {
            $responseCode2 = runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit103), " is not bound in the current context"), "Unbound Variable");
        }
        if (runtime.callYailPrimitive(moduleMethod, LList.list2($responseCode2, "200"), Lit104, "=") != Boolean.FALSE) {
            ModuleMethod moduleMethod2 = runtime.yail$Mnequal$Qu;
            if ($responseContent2 instanceof Package) {
                $responseContent2 = runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit105), " is not bound in the current context"), "Unbound Variable");
            }
            if (runtime.callYailPrimitive(moduleMethod2, LList.list2($responseContent2, "yes"), Lit106, "=") != Boolean.FALSE) {
                return runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen, LList.list1("Accueil"), Lit107, "open another screen");
            }
            SimpleSymbol simpleSymbol = Lit108;
            SimpleSymbol simpleSymbol2 = Lit109;
            Pair list1 = LList.list1("Erreur");
            LList.chain4(list1, "Une erreur est survenue", "Quitter", "", Boolean.FALSE);
            return runtime.callComponentMethod(simpleSymbol, simpleSymbol2, list1, Lit110);
        }
        SimpleSymbol simpleSymbol3 = Lit108;
        SimpleSymbol simpleSymbol4 = Lit109;
        Pair list12 = LList.list1("Erreur");
        LList.chain4(list12, "Une erreur est survenue", "Quitter", "", Boolean.FALSE);
        return runtime.callComponentMethod(simpleSymbol3, simpleSymbol4, list12, Lit111);
    }

    public Object Notifier1$AfterChoosing(Object $choice) {
        runtime.sanitizeComponentData($choice);
        runtime.setThisForm();
        return runtime.callYailPrimitive(runtime.close$Mnapplication, LList.Empty, LList.Empty, "close application");
    }

    /* compiled from: Happiness.yail */
    public class frame extends ModuleBody {
        Happiness $main;

        public int match1(ModuleMethod moduleMethod, Object obj, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 1:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 2:
                    if (!(obj instanceof Happiness)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 3:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 5:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 7:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 12:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 13:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 14:
                    if (!(obj instanceof Happiness)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 33:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 42:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
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
                    callContext.pc = 2;
                    return 0;
                case 5:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 8:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 9:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 11:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 17:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
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
                    callContext.pc = 4;
                    return 0;
                case 15:
                    if (!(obj instanceof Happiness)) {
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
                    callContext.pc = 4;
                    return 0;
                case 16:
                    if (!(obj instanceof Happiness)) {
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
                    callContext.pc = 4;
                    return 0;
                case 41:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.value3 = obj3;
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.pc = 4;
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
                case 33:
                    return this.$main.Slider1$PositionChanged(obj);
                case 42:
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
                    Happiness happiness = this.$main;
                    try {
                        Component component = (Component) obj;
                        try {
                            String str = (String) obj2;
                            try {
                                if (obj3 == Boolean.FALSE) {
                                    z = false;
                                }
                                try {
                                    happiness.dispatchGenericEvent(component, str, z, (Object[]) obj4);
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
                case 41:
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

        public Object apply0(ModuleMethod moduleMethod) {
            switch (moduleMethod.selector) {
                case 18:
                    return Happiness.lambda2();
                case 19:
                    this.$main.$define();
                    return Values.empty;
                case 20:
                    return Happiness.lambda3();
                case 21:
                    return Happiness.lambda4();
                case 22:
                    return this.$main.Happiness$Initialize();
                case 23:
                    return Happiness.lambda5();
                case 24:
                    return Happiness.lambda6();
                case 25:
                    return Happiness.lambda7();
                case 26:
                    return Happiness.lambda8();
                case 27:
                    return Happiness.lambda9();
                case 28:
                    return Happiness.lambda10();
                case 29:
                    return Happiness.lambda11();
                case 30:
                    return Happiness.lambda12();
                case 31:
                    return Happiness.lambda13();
                case 32:
                    return Happiness.lambda14();
                case 34:
                    return Happiness.lambda15();
                case 35:
                    return Happiness.lambda16();
                case 36:
                    return Happiness.lambda17();
                case 37:
                    return Happiness.lambda18();
                case 38:
                    return Happiness.lambda19();
                case 39:
                    return Happiness.lambda20();
                case 40:
                    return this.$main.Button1$Click();
                default:
                    return super.apply0(moduleMethod);
            }
        }

        public int match0(ModuleMethod moduleMethod, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 18:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 19:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 20:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 21:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 22:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 23:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 24:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 25:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 26:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 27:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 28:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 29:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 30:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 31:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 32:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 34:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 35:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 36:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 37:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 38:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 39:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 40:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                default:
                    return super.match0(moduleMethod, callContext);
            }
        }
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
        this.events$Mnto$Mnregister = lists.cons(lists.cons(component$Mnname, event$Mnname), this.events$Mnto$Mnregister);
    }

    public void addToComponents(Object container$Mnname, Object component$Mntype, Object component$Mnname, Object init$Mnthunk) {
        this.components$Mnto$Mncreate = lists.cons(LList.list4(container$Mnname, component$Mntype, component$Mnname, init$Mnthunk), this.components$Mnto$Mncreate);
    }

    public void addToGlobalVars(Object var, Object val$Mnthunk) {
        this.global$Mnvars$Mnto$Mncreate = lists.cons(LList.list2(var, val$Mnthunk), this.global$Mnvars$Mnto$Mncreate);
    }

    public void addToFormDoAfterCreation(Object thunk) {
        this.form$Mndo$Mnafter$Mncreation = lists.cons(thunk, this.form$Mndo$Mnafter$Mncreation);
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
                apply.apply2(handler, lists.cons(componentObject, lists.cons(bool, LList.makeList(args, 0))));
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
        Happiness = this;
        addToFormEnvironment(Lit0, this);
        Object obj5 = this.events$Mnto$Mnregister;
        while (obj5 != LList.Empty) {
            try {
                Pair arg0 = (Pair) obj5;
                Object event$Mninfo = arg0.getCar();
                Object apply1 = lists.car.apply1(event$Mninfo);
                String obj6 = apply1 == null ? null : apply1.toString();
                Object apply12 = lists.cdr.apply1(event$Mninfo);
                EventDispatcher.registerEventForDelegation(this, obj6, apply12 == null ? null : apply12.toString());
                obj5 = arg0.getCdr();
            } catch (ClassCastException e) {
                throw new WrongType(e, "arg0", -2, obj5);
            }
        }
        try {
            LList components = lists.reverse(this.components$Mnto$Mncreate);
            addToGlobalVars(Lit2, lambda$Fn1);
            reverse = lists.reverse(this.form$Mndo$Mnafter$Mncreation);
            while (reverse != LList.Empty) {
                Pair arg02 = (Pair) reverse;
                misc.force(arg02.getCar());
                reverse = arg02.getCdr();
            }
            obj = components;
            while (obj != LList.Empty) {
                Pair arg03 = (Pair) obj;
                Object component$Mninfo = arg03.getCar();
                component$Mnname = lists.caddr.apply1(component$Mninfo);
                lists.cadddr.apply1(component$Mninfo);
                Object component$Mnobject = Invoke.make.apply2(lists.cadr.apply1(component$Mninfo), lookupInFormEnvironment((Symbol) lists.car.apply1(component$Mninfo)));
                SlotSet.set$Mnfield$Ex.apply3(this, component$Mnname, component$Mnobject);
                addToFormEnvironment((Symbol) component$Mnname, component$Mnobject);
                obj = arg03.getCdr();
            }
            reverse2 = lists.reverse(this.global$Mnvars$Mnto$Mncreate);
            while (reverse2 != LList.Empty) {
                Pair arg04 = (Pair) reverse2;
                Object var$Mnval = arg04.getCar();
                var = lists.car.apply1(var$Mnval);
                addToGlobalVarEnvironment((Symbol) var, Scheme.applyToArgs.apply1(lists.cadr.apply1(var$Mnval)));
                reverse2 = arg04.getCdr();
            }
            LList component$Mndescriptors = components;
            obj2 = component$Mndescriptors;
            while (obj2 != LList.Empty) {
                Pair arg05 = (Pair) obj2;
                Object component$Mninfo2 = arg05.getCar();
                lists.caddr.apply1(component$Mninfo2);
                Object init$Mnthunk = lists.cadddr.apply1(component$Mninfo2);
                if (init$Mnthunk != Boolean.FALSE) {
                    Scheme.applyToArgs.apply1(init$Mnthunk);
                }
                obj2 = arg05.getCdr();
            }
            obj3 = component$Mndescriptors;
            while (obj3 != LList.Empty) {
                Pair arg06 = (Pair) obj3;
                Object component$Mninfo3 = arg06.getCar();
                Object component$Mnname2 = lists.caddr.apply1(component$Mninfo3);
                lists.cadddr.apply1(component$Mninfo3);
                callInitialize(SlotGet.field.apply2(this, component$Mnname2));
                obj3 = arg06.getCdr();
            }
        } catch (ClassCastException e2) {
            throw new WrongType(e2, "arg0", -2, obj3);
        } catch (ClassCastException e3) {
            throw new WrongType(e3, "arg0", -2, obj2);
        } catch (ClassCastException e4) {
            throw new WrongType(e4, "add-to-global-var-environment", 0, var);
        } catch (ClassCastException e5) {
            throw new WrongType(e5, "arg0", -2, reverse2);
        } catch (ClassCastException e6) {
            throw new WrongType(e6, "add-to-form-environment", 0, component$Mnname);
        } catch (ClassCastException e7) {
            throw new WrongType(e7, "lookup-in-form-environment", 0, obj4);
        } catch (ClassCastException e8) {
            throw new WrongType(e8, "arg0", -2, obj);
        } catch (ClassCastException e9) {
            throw new WrongType(e9, "arg0", -2, reverse);
        } catch (YailRuntimeError exception2) {
            processException(exception2);
        }
    }

    public static SimpleSymbol lambda1symbolAppend$V(Object[] argsArray) {
        LList symbols = LList.makeList(argsArray, 0);
        Apply apply = Scheme.apply;
        ModuleMethod moduleMethod = strings.string$Mnappend;
        Object obj = LList.Empty;
        LList lList = symbols;
        while (lList != LList.Empty) {
            try {
                Pair arg0 = (Pair) lList;
                Object arg02 = arg0.getCdr();
                Object car = arg0.getCar();
                try {
                    obj = Pair.make(misc.symbol$To$String((Symbol) car), obj);
                    lList = arg02;
                } catch (ClassCastException e) {
                    throw new WrongType(e, "symbol->string", 1, car);
                }
            } catch (ClassCastException e2) {
                throw new WrongType(e2, "arg0", -2, lList);
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
