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
import com.google.appinventor.components.runtime.ImagePicker;
import com.google.appinventor.components.runtime.Label;
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

/* compiled from: Etape2.yail */
public class Etape2 extends Form implements Runnable {
    public static Etape2 Etape2;
    static final SimpleSymbol Lit0 = ((SimpleSymbol) new SimpleSymbol("Etape2").readResolve());
    static final SimpleSymbol Lit1 = ((SimpleSymbol) new SimpleSymbol("getMessage").readResolve());
    static final SimpleSymbol Lit10 = ((SimpleSymbol) new SimpleSymbol("BackgroundColor").readResolve());
    static final SimpleSymbol Lit100 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement8").readResolve());
    static final FString Lit101 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit102 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit103 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement6").readResolve());
    static final FString Lit104 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit105 = new FString("com.google.appinventor.components.runtime.TinyDB");
    static final FString Lit106 = new FString("com.google.appinventor.components.runtime.TinyDB");
    static final FString Lit107 = new FString("com.google.appinventor.components.runtime.Web");
    static final FString Lit108 = new FString("com.google.appinventor.components.runtime.Web");
    static final SimpleSymbol Lit109 = ((SimpleSymbol) new SimpleSymbol("$responseContent").readResolve());
    static final IntNum Lit11;
    static final SimpleSymbol Lit110 = ((SimpleSymbol) new SimpleSymbol("Web1$GotText").readResolve());
    static final SimpleSymbol Lit111 = ((SimpleSymbol) new SimpleSymbol("GotText").readResolve());
    static final SimpleSymbol Lit112 = ((SimpleSymbol) new SimpleSymbol("get-simple-name").readResolve());
    static final SimpleSymbol Lit113 = ((SimpleSymbol) new SimpleSymbol("android-log-form").readResolve());
    static final SimpleSymbol Lit114 = ((SimpleSymbol) new SimpleSymbol("add-to-form-environment").readResolve());
    static final SimpleSymbol Lit115 = ((SimpleSymbol) new SimpleSymbol("lookup-in-form-environment").readResolve());
    static final SimpleSymbol Lit116 = ((SimpleSymbol) new SimpleSymbol("is-bound-in-form-environment").readResolve());
    static final SimpleSymbol Lit117 = ((SimpleSymbol) new SimpleSymbol("add-to-global-var-environment").readResolve());
    static final SimpleSymbol Lit118 = ((SimpleSymbol) new SimpleSymbol("add-to-events").readResolve());
    static final SimpleSymbol Lit119 = ((SimpleSymbol) new SimpleSymbol("add-to-components").readResolve());
    static final SimpleSymbol Lit12 = ((SimpleSymbol) new SimpleSymbol("CloseScreenAnimation").readResolve());
    static final SimpleSymbol Lit120 = ((SimpleSymbol) new SimpleSymbol("add-to-global-vars").readResolve());
    static final SimpleSymbol Lit121 = ((SimpleSymbol) new SimpleSymbol("add-to-form-do-after-creation").readResolve());
    static final SimpleSymbol Lit122 = ((SimpleSymbol) new SimpleSymbol("send-error").readResolve());
    static final SimpleSymbol Lit123 = ((SimpleSymbol) new SimpleSymbol("dispatchEvent").readResolve());
    static final SimpleSymbol Lit124 = ((SimpleSymbol) new SimpleSymbol("dispatchGenericEvent").readResolve());
    static final SimpleSymbol Lit125 = ((SimpleSymbol) new SimpleSymbol("lookup-handler").readResolve());
    static final SimpleSymbol Lit126 = ((SimpleSymbol) new SimpleSymbol("any").readResolve());
    static final SimpleSymbol Lit13 = ((SimpleSymbol) new SimpleSymbol("OpenScreenAnimation").readResolve());
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
    static final PairWithPosition Lit28 = PairWithPosition.make(Lit9, PairWithPosition.make(Lit126, LList.Empty, "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Etape2.yail", 110777), "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Etape2.yail", 110771);
    static final PairWithPosition Lit29 = PairWithPosition.make(Lit9, PairWithPosition.make(Lit9, LList.Empty, "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Etape2.yail", 110899), "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Etape2.yail", 110893);
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
    static final IntNum Lit4;
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
    static final PairWithPosition Lit52 = PairWithPosition.make(Lit9, PairWithPosition.make(Lit126, LList.Empty, "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Etape2.yail", 254173), "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Etape2.yail", 254167);
    static final PairWithPosition Lit53 = PairWithPosition.make(Lit9, PairWithPosition.make(Lit9, LList.Empty, "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Etape2.yail", 254298), "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Etape2.yail", 254292);
    static final SimpleSymbol Lit54 = ((SimpleSymbol) new SimpleSymbol("Web1").readResolve());
    static final SimpleSymbol Lit55 = ((SimpleSymbol) new SimpleSymbol("Url").readResolve());
    static final PairWithPosition Lit56 = PairWithPosition.make(Lit9, PairWithPosition.make(Lit9, LList.Empty, "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Etape2.yail", 254494), "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Etape2.yail", 254488);
    static final SimpleSymbol Lit57 = ((SimpleSymbol) new SimpleSymbol("PostFile").readResolve());
    static final PairWithPosition Lit58 = PairWithPosition.make(Lit9, LList.Empty, "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Etape2.yail", 254616);
    static final SimpleSymbol Lit59 = ((SimpleSymbol) new SimpleSymbol("ImagePicker1$AfterPicking").readResolve());
    static final SimpleSymbol Lit6 = ((SimpleSymbol) new SimpleSymbol("ActionBar").readResolve());
    static final SimpleSymbol Lit60 = ((SimpleSymbol) new SimpleSymbol("AfterPicking").readResolve());
    static final FString Lit61 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit62 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement2").readResolve());
    static final IntNum Lit63 = IntNum.make(50);
    static final FString Lit64 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit65 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit66 = ((SimpleSymbol) new SimpleSymbol("FontBold").readResolve());
    static final SimpleSymbol Lit67 = ((SimpleSymbol) new SimpleSymbol("FontSize").readResolve());
    static final IntNum Lit68 = IntNum.make(15);
    static final SimpleSymbol Lit69 = ((SimpleSymbol) new SimpleSymbol("FontTypeface").readResolve());
    static final SimpleSymbol Lit7 = ((SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_BOOLEAN).readResolve());
    static final IntNum Lit70 = IntNum.make(1);
    static final SimpleSymbol Lit71 = ((SimpleSymbol) new SimpleSymbol("TextAlignment").readResolve());
    static final SimpleSymbol Lit72 = ((SimpleSymbol) new SimpleSymbol("TextColor").readResolve());
    static final IntNum Lit73;
    static final FString Lit74 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit75 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit76 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement3").readResolve());
    static final IntNum Lit77 = IntNum.make(20);
    static final FString Lit78 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit79 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit8 = ((SimpleSymbol) new SimpleSymbol("AppName").readResolve());
    static final SimpleSymbol Lit80 = ((SimpleSymbol) new SimpleSymbol("Button1").readResolve());
    static final IntNum Lit81 = IntNum.make(40);
    static final IntNum Lit82;
    static final IntNum Lit83 = IntNum.make(250);
    static final FString Lit84 = new FString("com.google.appinventor.components.runtime.Button");
    static final PairWithPosition Lit85;
    static final SimpleSymbol Lit86 = ((SimpleSymbol) new SimpleSymbol("Button1$Click").readResolve());
    static final SimpleSymbol Lit87 = ((SimpleSymbol) new SimpleSymbol("Click").readResolve());
    static final FString Lit88 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit89 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement4").readResolve());
    static final SimpleSymbol Lit9;
    static final FString Lit90 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit91 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit92 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement5").readResolve());
    static final IntNum Lit93;
    static final FString Lit94 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit95 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit96 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement7").readResolve());
    static final IntNum Lit97;
    static final FString Lit98 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
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
        int[] iArr = new int[2];
        iArr[0] = -6019137;
        Lit97 = IntNum.make(iArr);
        int[] iArr2 = new int[2];
        iArr2[0] = -6019137;
        Lit93 = IntNum.make(iArr2);
        SimpleSymbol simpleSymbol = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT).readResolve();
        Lit9 = simpleSymbol;
        Lit85 = PairWithPosition.make(simpleSymbol, LList.Empty, "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Etape2.yail", 475213);
        int[] iArr3 = new int[2];
        iArr3[0] = -1;
        Lit82 = IntNum.make(iArr3);
        int[] iArr4 = new int[2];
        iArr4[0] = -1;
        Lit73 = IntNum.make(iArr4);
        int[] iArr5 = new int[2];
        iArr5[0] = -16777216;
        Lit17 = IntNum.make(iArr5);
        int[] iArr6 = new int[2];
        iArr6[0] = -16777216;
        Lit15 = IntNum.make(iArr6);
        int[] iArr7 = new int[2];
        iArr7[0] = -16777216;
        Lit11 = IntNum.make(iArr7);
        int[] iArr8 = new int[2];
        iArr8[0] = -6019137;
        Lit4 = IntNum.make(iArr8);
    }

    public Etape2() {
        ModuleInfo.register(this);
        frame frame2 = new frame();
        frame2.$main = this;
        this.get$Mnsimple$Mnname = new ModuleMethod(frame2, 1, Lit112, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.onCreate = new ModuleMethod(frame2, 2, "onCreate", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.android$Mnlog$Mnform = new ModuleMethod(frame2, 3, Lit113, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(frame2, 4, Lit114, 8194);
        this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame2, 5, Lit115, 8193);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame2, 7, Lit116, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(frame2, 8, Lit117, 8194);
        this.add$Mnto$Mnevents = new ModuleMethod(frame2, 9, Lit118, 8194);
        this.add$Mnto$Mncomponents = new ModuleMethod(frame2, 10, Lit119, 16388);
        this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(frame2, 11, Lit120, 8194);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(frame2, 12, Lit121, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.send$Mnerror = new ModuleMethod(frame2, 13, Lit122, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.process$Mnexception = new ModuleMethod(frame2, 14, "process-exception", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.dispatchEvent = new ModuleMethod(frame2, 15, Lit123, 16388);
        this.dispatchGenericEvent = new ModuleMethod(frame2, 16, Lit124, 16388);
        this.lookup$Mnhandler = new ModuleMethod(frame2, 17, Lit125, 8194);
        ModuleMethod moduleMethod = new ModuleMethod(frame2, 18, (Object) null, 0);
        moduleMethod.setProperty("source-location", "/tmp/runtime8949535697318280206.scm:622");
        lambda$Fn1 = moduleMethod;
        this.$define = new ModuleMethod(frame2, 19, "$define", 0);
        lambda$Fn2 = new ModuleMethod(frame2, 20, (Object) null, 0);
        this.Etape2$Initialize = new ModuleMethod(frame2, 21, Lit30, 0);
        lambda$Fn3 = new ModuleMethod(frame2, 22, (Object) null, 0);
        lambda$Fn4 = new ModuleMethod(frame2, 23, (Object) null, 0);
        lambda$Fn5 = new ModuleMethod(frame2, 24, (Object) null, 0);
        lambda$Fn6 = new ModuleMethod(frame2, 25, (Object) null, 0);
        lambda$Fn7 = new ModuleMethod(frame2, 26, (Object) null, 0);
        lambda$Fn8 = new ModuleMethod(frame2, 27, (Object) null, 0);
        this.ImagePicker1$AfterPicking = new ModuleMethod(frame2, 28, Lit59, 0);
        lambda$Fn9 = new ModuleMethod(frame2, 29, (Object) null, 0);
        lambda$Fn10 = new ModuleMethod(frame2, 30, (Object) null, 0);
        lambda$Fn11 = new ModuleMethod(frame2, 31, (Object) null, 0);
        lambda$Fn12 = new ModuleMethod(frame2, 32, (Object) null, 0);
        lambda$Fn13 = new ModuleMethod(frame2, 33, (Object) null, 0);
        lambda$Fn14 = new ModuleMethod(frame2, 34, (Object) null, 0);
        lambda$Fn15 = new ModuleMethod(frame2, 35, (Object) null, 0);
        lambda$Fn16 = new ModuleMethod(frame2, 36, (Object) null, 0);
        this.Button1$Click = new ModuleMethod(frame2, 37, Lit86, 0);
        lambda$Fn17 = new ModuleMethod(frame2, 38, (Object) null, 0);
        lambda$Fn18 = new ModuleMethod(frame2, 39, (Object) null, 0);
        lambda$Fn19 = new ModuleMethod(frame2, 40, (Object) null, 0);
        lambda$Fn20 = new ModuleMethod(frame2, 41, (Object) null, 0);
        lambda$Fn21 = new ModuleMethod(frame2, 42, (Object) null, 0);
        lambda$Fn22 = new ModuleMethod(frame2, 43, (Object) null, 0);
        lambda$Fn23 = new ModuleMethod(frame2, 44, (Object) null, 0);
        lambda$Fn24 = new ModuleMethod(frame2, 45, (Object) null, 0);
        lambda$Fn25 = new ModuleMethod(frame2, 46, (Object) null, 0);
        lambda$Fn26 = new ModuleMethod(frame2, 47, (Object) null, 0);
        this.Web1$GotText = new ModuleMethod(frame2, 48, Lit110, 16388);
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
        Etape2 = null;
        this.form$Mnname$Mnsymbol = Lit0;
        this.events$Mnto$Mnregister = LList.Empty;
        this.components$Mnto$Mncreate = LList.Empty;
        this.global$Mnvars$Mnto$Mncreate = LList.Empty;
        this.form$Mndo$Mnafter$Mncreation = LList.Empty;
        runtime.$instance.run();
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.setAndCoerceProperty$Ex(Lit0, Lit3, Lit4, Lit5);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit6, Boolean.TRUE, Lit7);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit8, "MySadWorld", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit10, Lit11, Lit5);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit12, "slidehorizontal", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit13, "slidehorizontal", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit14, Lit15, Lit5);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit16, Lit17, Lit5);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit18, "portrait", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit19, Boolean.TRUE, Lit7);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit20, "Responsive", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit21, "AppTheme", Lit9);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit22, "Etape2", Lit9);
            Values.writeValues(runtime.setAndCoerceProperty$Ex(Lit0, Lit23, Boolean.FALSE, Lit7), $result);
        } else {
            addToFormDoAfterCreation(new Promise(lambda$Fn2));
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit30, this.Etape2$Initialize);
        } else {
            addToFormEnvironment(Lit30, this.Etape2$Initialize);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Etape2", "Initialize");
        } else {
            addToEvents(Lit0, Lit31);
        }
        this.HorizontalArrangement1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit32, Lit33, lambda$Fn3), $result);
        } else {
            addToComponents(Lit0, Lit37, Lit33, lambda$Fn4);
        }
        this.VerticalArrangement1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit33, Lit38, Lit39, lambda$Fn5), $result);
        } else {
            addToComponents(Lit33, Lit44, Lit39, lambda$Fn6);
        }
        this.ImagePicker1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit39, Lit45, Lit46, lambda$Fn7), $result);
        } else {
            addToComponents(Lit39, Lit49, Lit46, lambda$Fn8);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit59, this.ImagePicker1$AfterPicking);
        } else {
            addToFormEnvironment(Lit59, this.ImagePicker1$AfterPicking);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "ImagePicker1", "AfterPicking");
        } else {
            addToEvents(Lit46, Lit60);
        }
        this.HorizontalArrangement2 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit39, Lit61, Lit62, lambda$Fn9), $result);
        } else {
            addToComponents(Lit39, Lit64, Lit62, lambda$Fn10);
        }
        this.Label1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit39, Lit65, Lit24, lambda$Fn11), $result);
        } else {
            addToComponents(Lit39, Lit74, Lit24, lambda$Fn12);
        }
        this.HorizontalArrangement3 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit39, Lit75, Lit76, lambda$Fn13), $result);
        } else {
            addToComponents(Lit39, Lit78, Lit76, lambda$Fn14);
        }
        this.Button1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit39, Lit79, Lit80, lambda$Fn15), $result);
        } else {
            addToComponents(Lit39, Lit84, Lit80, lambda$Fn16);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit86, this.Button1$Click);
        } else {
            addToFormEnvironment(Lit86, this.Button1$Click);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Button1", "Click");
        } else {
            addToEvents(Lit80, Lit87);
        }
        this.HorizontalArrangement4 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit88, Lit89, lambda$Fn17), $result);
        } else {
            addToComponents(Lit0, Lit90, Lit89, lambda$Fn18);
        }
        this.HorizontalArrangement5 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit89, Lit91, Lit92, lambda$Fn19), $result);
        } else {
            addToComponents(Lit89, Lit94, Lit92, lambda$Fn20);
        }
        this.HorizontalArrangement7 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit89, Lit95, Lit96, lambda$Fn21), $result);
        } else {
            addToComponents(Lit89, Lit98, Lit96, lambda$Fn22);
        }
        this.HorizontalArrangement8 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit89, Lit99, Lit100, lambda$Fn23), $result);
        } else {
            addToComponents(Lit89, Lit101, Lit100, lambda$Fn24);
        }
        this.HorizontalArrangement6 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit89, Lit102, Lit103, lambda$Fn25), $result);
        } else {
            addToComponents(Lit89, Lit104, Lit103, lambda$Fn26);
        }
        this.TinyDB1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit105, Lit26, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit106, Lit26, Boolean.FALSE);
        }
        this.Web1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit107, Lit54, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit108, Lit54, Boolean.FALSE);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit110, this.Web1$GotText);
        } else {
            addToFormEnvironment(Lit110, this.Web1$GotText);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Web1", "GotText");
        } else {
            addToEvents(Lit54, Lit111);
        }
        runtime.initRuntime();
    }

    static Object lambda3() {
        runtime.setAndCoerceProperty$Ex(Lit0, Lit3, Lit4, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit6, Boolean.TRUE, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit8, "MySadWorld", Lit9);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit10, Lit11, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit12, "slidehorizontal", Lit9);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit13, "slidehorizontal", Lit9);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit14, Lit15, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit16, Lit17, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit18, "portrait", Lit9);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit19, Boolean.TRUE, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit20, "Responsive", Lit9);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit21, "AppTheme", Lit9);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit22, "Etape2", Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit0, Lit23, Boolean.FALSE, Lit7);
    }

    public Object Etape2$Initialize() {
        runtime.setThisForm();
        return runtime.setAndCoerceProperty$Ex(Lit24, Lit25, runtime.callYailPrimitive(strings.string$Mnappend, LList.list2(runtime.callComponentMethod(Lit26, Lit27, LList.list2("name", "NULL"), Lit28), " ! Quel joli prénom. Vous pouvez maintenant mettre une photo de profil en cliquant sur le logo rose"), Lit29, "join"), Lit9);
    }

    static Object lambda4() {
        runtime.setAndCoerceProperty$Ex(Lit33, Lit34, Lit35, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit33, Lit36, Lit35, Lit5);
    }

    static Object lambda5() {
        runtime.setAndCoerceProperty$Ex(Lit33, Lit34, Lit35, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit33, Lit36, Lit35, Lit5);
    }

    static Object lambda6() {
        runtime.setAndCoerceProperty$Ex(Lit39, Lit40, Lit41, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit39, Lit42, Lit43, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit39, Lit34, Lit35, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit39, Lit36, Lit35, Lit5);
    }

    static Object lambda7() {
        runtime.setAndCoerceProperty$Ex(Lit39, Lit40, Lit41, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit39, Lit42, Lit43, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit39, Lit34, Lit35, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit39, Lit36, Lit35, Lit5);
    }

    static Object lambda8() {
        runtime.setAndCoerceProperty$Ex(Lit46, Lit34, Lit47, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit46, Lit48, "user-circle.png", Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit46, Lit36, Lit47, Lit5);
    }

    static Object lambda9() {
        runtime.setAndCoerceProperty$Ex(Lit46, Lit34, Lit47, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit46, Lit48, "user-circle.png", Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit46, Lit36, Lit47, Lit5);
    }

    public Object ImagePicker1$AfterPicking() {
        runtime.setThisForm();
        runtime.setAndCoerceProperty$Ex(Lit46, Lit48, runtime.get$Mnproperty.apply2(Lit46, Lit50), Lit9);
        runtime.callComponentMethod(Lit26, Lit51, LList.list2("picture", runtime.get$Mnproperty.apply2(Lit46, Lit50)), Lit52);
        runtime.callYailPrimitive(runtime.string$Mnsplit, LList.list2(runtime.get$Mnproperty.apply2(Lit46, Lit50), "/"), Lit53, "split");
        runtime.setAndCoerceProperty$Ex(Lit54, Lit55, runtime.callYailPrimitive(strings.string$Mnappend, LList.list2("http://msw.kellis.fr/android/actions/etapes.php?filename=", "conjoue.jpg"), Lit56, "join"), Lit9);
        return runtime.callComponentMethod(Lit54, Lit57, LList.list1(runtime.get$Mnproperty.apply2(Lit46, Lit50)), Lit58);
    }

    static Object lambda10() {
        runtime.setAndCoerceProperty$Ex(Lit62, Lit34, Lit63, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit62, Lit36, Lit35, Lit5);
    }

    static Object lambda11() {
        runtime.setAndCoerceProperty$Ex(Lit62, Lit34, Lit63, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit62, Lit36, Lit35, Lit5);
    }

    static Object lambda12() {
        runtime.setAndCoerceProperty$Ex(Lit24, Lit66, Boolean.TRUE, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit24, Lit67, Lit68, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit24, Lit69, Lit70, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit24, Lit25, "Alex ! Quel joli prénom. Vous pouvez maintenant mettre une photo de profil en cliquant sur le logo rose", Lit9);
        runtime.setAndCoerceProperty$Ex(Lit24, Lit71, Lit70, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit24, Lit72, Lit73, Lit5);
    }

    static Object lambda13() {
        runtime.setAndCoerceProperty$Ex(Lit24, Lit66, Boolean.TRUE, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit24, Lit67, Lit68, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit24, Lit69, Lit70, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit24, Lit25, "Alex ! Quel joli prénom. Vous pouvez maintenant mettre une photo de profil en cliquant sur le logo rose", Lit9);
        runtime.setAndCoerceProperty$Ex(Lit24, Lit71, Lit70, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit24, Lit72, Lit73, Lit5);
    }

    static Object lambda14() {
        runtime.setAndCoerceProperty$Ex(Lit76, Lit34, Lit77, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit76, Lit36, Lit35, Lit5);
    }

    static Object lambda15() {
        runtime.setAndCoerceProperty$Ex(Lit76, Lit34, Lit77, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit76, Lit36, Lit35, Lit5);
    }

    static Object lambda16() {
        runtime.setAndCoerceProperty$Ex(Lit80, Lit66, Boolean.TRUE, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit80, Lit34, Lit81, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit80, Lit48, "therare_b.png", Lit9);
        runtime.setAndCoerceProperty$Ex(Lit80, Lit25, "Passer cette étape", Lit9);
        runtime.setAndCoerceProperty$Ex(Lit80, Lit72, Lit82, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit80, Lit36, Lit83, Lit5);
    }

    static Object lambda17() {
        runtime.setAndCoerceProperty$Ex(Lit80, Lit66, Boolean.TRUE, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit80, Lit34, Lit81, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit80, Lit48, "therare_b.png", Lit9);
        runtime.setAndCoerceProperty$Ex(Lit80, Lit25, "Passer cette étape", Lit9);
        runtime.setAndCoerceProperty$Ex(Lit80, Lit72, Lit82, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit80, Lit36, Lit83, Lit5);
    }

    public Object Button1$Click() {
        runtime.setThisForm();
        return runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen, LList.list1("Etape3"), Lit85, "open another screen");
    }

    static Object lambda18() {
        runtime.setAndCoerceProperty$Ex(Lit89, Lit34, Lit77, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit89, Lit36, Lit35, Lit5);
    }

    static Object lambda19() {
        runtime.setAndCoerceProperty$Ex(Lit89, Lit34, Lit77, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit89, Lit36, Lit35, Lit5);
    }

    static Object lambda20() {
        runtime.setAndCoerceProperty$Ex(Lit92, Lit10, Lit93, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit92, Lit34, Lit77, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit92, Lit36, Lit35, Lit5);
    }

    static Object lambda21() {
        runtime.setAndCoerceProperty$Ex(Lit92, Lit10, Lit93, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit92, Lit34, Lit77, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit92, Lit36, Lit35, Lit5);
    }

    static Object lambda22() {
        runtime.setAndCoerceProperty$Ex(Lit96, Lit10, Lit97, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit96, Lit34, Lit77, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit96, Lit36, Lit35, Lit5);
    }

    static Object lambda23() {
        runtime.setAndCoerceProperty$Ex(Lit96, Lit10, Lit97, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit96, Lit34, Lit77, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit96, Lit36, Lit35, Lit5);
    }

    static Object lambda24() {
        runtime.setAndCoerceProperty$Ex(Lit100, Lit34, Lit77, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit100, Lit36, Lit35, Lit5);
    }

    static Object lambda25() {
        runtime.setAndCoerceProperty$Ex(Lit100, Lit34, Lit77, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit100, Lit36, Lit35, Lit5);
    }

    static Object lambda26() {
        runtime.setAndCoerceProperty$Ex(Lit103, Lit34, Lit77, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit103, Lit36, Lit35, Lit5);
    }

    static Object lambda27() {
        runtime.setAndCoerceProperty$Ex(Lit103, Lit34, Lit77, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit103, Lit36, Lit35, Lit5);
    }

    public Object Web1$GotText(Object $url, Object $responseCode, Object $responseType, Object $responseContent) {
        runtime.sanitizeComponentData($url);
        runtime.sanitizeComponentData($responseCode);
        runtime.sanitizeComponentData($responseType);
        Object $responseContent2 = runtime.sanitizeComponentData($responseContent);
        runtime.setThisForm();
        SimpleSymbol simpleSymbol = Lit24;
        SimpleSymbol simpleSymbol2 = Lit25;
        if ($responseContent2 instanceof Package) {
            $responseContent2 = runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit109), " is not bound in the current context"), "Unbound Variable");
        }
        return runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, $responseContent2, Lit9);
    }

    /* compiled from: Etape2.yail */
    public class frame extends ModuleBody {
        Etape2 $main;

        public int match1(ModuleMethod moduleMethod, Object obj, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 1:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 2:
                    if (!(obj instanceof Etape2)) {
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
                    if (!(obj instanceof Etape2)) {
                        return -786431;
                    }
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
                    callContext.pc = 4;
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
                    callContext.pc = 4;
                    return 0;
                case 48:
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
                case 48:
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
                case 33:
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
                case 41:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 42:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 43:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 44:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 45:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 46:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 47:
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
        Etape2 = this;
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
