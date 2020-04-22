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
import com.google.appinventor.components.runtime.Notifier;
import com.google.appinventor.components.runtime.TinyDB;
import com.google.appinventor.components.runtime.Web;
import com.google.appinventor.components.runtime.WebViewer;
import com.google.appinventor.components.runtime.errors.PermissionException;
import com.google.appinventor.components.runtime.errors.YailRuntimeError;
import com.google.appinventor.components.runtime.util.RetValManager;
import com.google.appinventor.components.runtime.util.RuntimeErrorAlert;
import com.google.youngandroid.runtime;
import com.puravidaapps.TaifunNotification;
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
import kawa.lib.lists;
import kawa.lib.misc;
import kawa.lib.strings;
import kawa.standard.Scheme;
import kawa.standard.require;

/* compiled from: Accueil.yail */
public class Accueil extends Form implements Runnable {
    public static Accueil Accueil;
    static final SimpleSymbol Lit0 = ((SimpleSymbol) new SimpleSymbol("Accueil").readResolve());
    static final SimpleSymbol Lit1 = ((SimpleSymbol) new SimpleSymbol("getMessage").readResolve());
    static final PairWithPosition Lit10 = PairWithPosition.make(Lit11, PairWithPosition.make(Lit11, LList.Empty, "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Accueil.yail", 37121), "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Accueil.yail", 37115);
    static final FString Lit100 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit101 = ((SimpleSymbol) new SimpleSymbol("Reload").readResolve());
    static final SimpleSymbol Lit102 = ((SimpleSymbol) new SimpleSymbol("Button3$Click").readResolve());
    static final FString Lit103 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit104 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement6").readResolve());
    static final FString Lit105 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit106 = new FString("com.google.appinventor.components.runtime.WebViewer");
    static final SimpleSymbol Lit107 = ((SimpleSymbol) new SimpleSymbol("PromptforPermission").readResolve());
    static final FString Lit108 = new FString("com.google.appinventor.components.runtime.WebViewer");
    static final SimpleSymbol Lit109 = ((SimpleSymbol) new SimpleSymbol("$url").readResolve());
    static final SimpleSymbol Lit11;
    static final PairWithPosition Lit110 = PairWithPosition.make(Lit147, PairWithPosition.make(Lit147, LList.Empty, "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Accueil.yail", 618636), "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Accueil.yail", 618631);
    static final SimpleSymbol Lit111 = ((SimpleSymbol) new SimpleSymbol("ClearAll").readResolve());
    static final PairWithPosition Lit112 = PairWithPosition.make(Lit11, LList.Empty, "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Accueil.yail", 618797);
    static final SimpleSymbol Lit113 = ((SimpleSymbol) new SimpleSymbol("WebViewer1$PageLoaded").readResolve());
    static final SimpleSymbol Lit114 = ((SimpleSymbol) new SimpleSymbol("PageLoaded").readResolve());
    static final FString Lit115 = new FString("com.google.appinventor.components.runtime.TinyDB");
    static final FString Lit116 = new FString("com.google.appinventor.components.runtime.TinyDB");
    static final FString Lit117 = new FString("com.google.appinventor.components.runtime.Notifier");
    static final FString Lit118 = new FString("com.google.appinventor.components.runtime.Notifier");
    static final SimpleSymbol Lit119 = ((SimpleSymbol) new SimpleSymbol("$choice").readResolve());
    static final PairWithPosition Lit12 = PairWithPosition.make(Lit11, PairWithPosition.make(Lit147, LList.Empty, "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Accueil.yail", 37106), "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Accueil.yail", 37100);
    static final PairWithPosition Lit120 = PairWithPosition.make(Lit147, PairWithPosition.make(Lit147, LList.Empty, "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Accueil.yail", 667747), "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Accueil.yail", 667742);
    static final SimpleSymbol Lit121 = ((SimpleSymbol) new SimpleSymbol("Notifier1$AfterChoosing").readResolve());
    static final SimpleSymbol Lit122 = ((SimpleSymbol) new SimpleSymbol("AfterChoosing").readResolve());
    static final FString Lit123 = new FString("com.google.appinventor.components.runtime.Web");
    static final FString Lit124 = new FString("com.google.appinventor.components.runtime.Web");
    static final SimpleSymbol Lit125 = ((SimpleSymbol) new SimpleSymbol("$responseContent").readResolve());
    static final PairWithPosition Lit126 = PairWithPosition.make(Lit147, PairWithPosition.make(Lit147, LList.Empty, "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Accueil.yail", 696428), "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Accueil.yail", 696423);
    static final PairWithPosition Lit127;
    static final SimpleSymbol Lit128 = ((SimpleSymbol) new SimpleSymbol("Web1$GotText").readResolve());
    static final SimpleSymbol Lit129 = ((SimpleSymbol) new SimpleSymbol("GotText").readResolve());
    static final PairWithPosition Lit13 = PairWithPosition.make(Lit11, PairWithPosition.make(Lit11, LList.Empty, "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Accueil.yail", 37121), "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Accueil.yail", 37115);
    static final FString Lit130 = new FString("com.puravidaapps.TaifunNotification");
    static final SimpleSymbol Lit131 = ((SimpleSymbol) new SimpleSymbol("TaifunNotification1").readResolve());
    static final FString Lit132 = new FString("com.puravidaapps.TaifunNotification");
    static final SimpleSymbol Lit133 = ((SimpleSymbol) new SimpleSymbol("get-simple-name").readResolve());
    static final SimpleSymbol Lit134 = ((SimpleSymbol) new SimpleSymbol("android-log-form").readResolve());
    static final SimpleSymbol Lit135 = ((SimpleSymbol) new SimpleSymbol("add-to-form-environment").readResolve());
    static final SimpleSymbol Lit136 = ((SimpleSymbol) new SimpleSymbol("lookup-in-form-environment").readResolve());
    static final SimpleSymbol Lit137 = ((SimpleSymbol) new SimpleSymbol("is-bound-in-form-environment").readResolve());
    static final SimpleSymbol Lit138 = ((SimpleSymbol) new SimpleSymbol("add-to-global-var-environment").readResolve());
    static final SimpleSymbol Lit139 = ((SimpleSymbol) new SimpleSymbol("add-to-events").readResolve());
    static final SimpleSymbol Lit14 = ((SimpleSymbol) new SimpleSymbol("AccentColor").readResolve());
    static final SimpleSymbol Lit140 = ((SimpleSymbol) new SimpleSymbol("add-to-components").readResolve());
    static final SimpleSymbol Lit141 = ((SimpleSymbol) new SimpleSymbol("add-to-global-vars").readResolve());
    static final SimpleSymbol Lit142 = ((SimpleSymbol) new SimpleSymbol("add-to-form-do-after-creation").readResolve());
    static final SimpleSymbol Lit143 = ((SimpleSymbol) new SimpleSymbol("send-error").readResolve());
    static final SimpleSymbol Lit144 = ((SimpleSymbol) new SimpleSymbol("dispatchEvent").readResolve());
    static final SimpleSymbol Lit145 = ((SimpleSymbol) new SimpleSymbol("dispatchGenericEvent").readResolve());
    static final SimpleSymbol Lit146 = ((SimpleSymbol) new SimpleSymbol("lookup-handler").readResolve());
    static final SimpleSymbol Lit147 = ((SimpleSymbol) new SimpleSymbol("any").readResolve());
    static final IntNum Lit15 = IntNum.make(16777215);
    static final SimpleSymbol Lit16 = ((SimpleSymbol) new SimpleSymbol("number").readResolve());
    static final SimpleSymbol Lit17 = ((SimpleSymbol) new SimpleSymbol("ActionBar").readResolve());
    static final SimpleSymbol Lit18;
    static final SimpleSymbol Lit19 = ((SimpleSymbol) new SimpleSymbol("AppName").readResolve());
    static final SimpleSymbol Lit2 = ((SimpleSymbol) new SimpleSymbol("*the-null-value*").readResolve());
    static final SimpleSymbol Lit20 = ((SimpleSymbol) new SimpleSymbol("BackgroundColor").readResolve());
    static final IntNum Lit21;
    static final SimpleSymbol Lit22 = ((SimpleSymbol) new SimpleSymbol("CloseScreenAnimation").readResolve());
    static final SimpleSymbol Lit23 = ((SimpleSymbol) new SimpleSymbol("OpenScreenAnimation").readResolve());
    static final SimpleSymbol Lit24 = ((SimpleSymbol) new SimpleSymbol("PrimaryColor").readResolve());
    static final IntNum Lit25 = IntNum.make(16777215);
    static final SimpleSymbol Lit26 = ((SimpleSymbol) new SimpleSymbol("PrimaryColorDark").readResolve());
    static final IntNum Lit27 = IntNum.make(16777215);
    static final SimpleSymbol Lit28 = ((SimpleSymbol) new SimpleSymbol("ScreenOrientation").readResolve());
    static final SimpleSymbol Lit29 = ((SimpleSymbol) new SimpleSymbol("ShowListsAsJson").readResolve());
    static final SimpleSymbol Lit3 = ((SimpleSymbol) new SimpleSymbol("g$lastURL").readResolve());
    static final SimpleSymbol Lit30 = ((SimpleSymbol) new SimpleSymbol("Sizing").readResolve());
    static final SimpleSymbol Lit31 = ((SimpleSymbol) new SimpleSymbol("Theme").readResolve());
    static final SimpleSymbol Lit32 = ((SimpleSymbol) new SimpleSymbol("Title").readResolve());
    static final SimpleSymbol Lit33 = ((SimpleSymbol) new SimpleSymbol("TitleVisible").readResolve());
    static final SimpleSymbol Lit34 = ((SimpleSymbol) new SimpleSymbol("CanGoBack").readResolve());
    static final SimpleSymbol Lit35 = ((SimpleSymbol) new SimpleSymbol("GoBack").readResolve());
    static final SimpleSymbol Lit36 = ((SimpleSymbol) new SimpleSymbol("Notifier1").readResolve());
    static final SimpleSymbol Lit37 = ((SimpleSymbol) new SimpleSymbol("ShowChooseDialog").readResolve());
    static final PairWithPosition Lit38;
    static final SimpleSymbol Lit39 = ((SimpleSymbol) new SimpleSymbol("Accueil$BackPressed").readResolve());
    static final SimpleSymbol Lit4 = ((SimpleSymbol) new SimpleSymbol("p$list").readResolve());
    static final SimpleSymbol Lit40 = ((SimpleSymbol) new SimpleSymbol("BackPressed").readResolve());
    static final PairWithPosition Lit41 = PairWithPosition.make(Lit11, PairWithPosition.make(Lit147, LList.Empty, "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Accueil.yail", 127130), "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Accueil.yail", 127124);
    static final PairWithPosition Lit42 = PairWithPosition.make(Lit147, PairWithPosition.make(Lit147, LList.Empty, "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Accueil.yail", 127150), "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Accueil.yail", 127145);
    static final SimpleSymbol Lit43 = ((SimpleSymbol) new SimpleSymbol("Web1").readResolve());
    static final SimpleSymbol Lit44 = ((SimpleSymbol) new SimpleSymbol("Url").readResolve());
    static final PairWithPosition Lit45 = PairWithPosition.make(Lit11, PairWithPosition.make(Lit147, LList.Empty, "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Accueil.yail", 127404), "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Accueil.yail", 127398);
    static final PairWithPosition Lit46 = PairWithPosition.make(Lit11, PairWithPosition.make(Lit11, LList.Empty, "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Accueil.yail", 127419), "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Accueil.yail", 127413);
    static final SimpleSymbol Lit47 = ((SimpleSymbol) new SimpleSymbol("Get").readResolve());
    static final SimpleSymbol Lit48 = ((SimpleSymbol) new SimpleSymbol("ShowAlert").readResolve());
    static final PairWithPosition Lit49 = PairWithPosition.make(Lit11, LList.Empty, "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Accueil.yail", 127641);
    static final SimpleSymbol Lit5 = ((SimpleSymbol) new SimpleSymbol("WebViewer1").readResolve());
    static final PairWithPosition Lit50 = PairWithPosition.make(Lit11, LList.Empty, "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Accueil.yail", 127723);
    static final SimpleSymbol Lit51 = ((SimpleSymbol) new SimpleSymbol("Accueil$Initialize").readResolve());
    static final SimpleSymbol Lit52 = ((SimpleSymbol) new SimpleSymbol("Initialize").readResolve());
    static final FString Lit53 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit54 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement1").readResolve());
    static final SimpleSymbol Lit55 = ((SimpleSymbol) new SimpleSymbol("AlignHorizontal").readResolve());
    static final IntNum Lit56 = IntNum.make(3);
    static final SimpleSymbol Lit57 = ((SimpleSymbol) new SimpleSymbol("AlignVertical").readResolve());
    static final IntNum Lit58 = IntNum.make(2);
    static final IntNum Lit59;
    static final SimpleSymbol Lit6 = ((SimpleSymbol) new SimpleSymbol("HomeUrl").readResolve());
    static final SimpleSymbol Lit60 = ((SimpleSymbol) new SimpleSymbol("Height").readResolve());
    static final IntNum Lit61 = IntNum.make(50);
    static final SimpleSymbol Lit62 = ((SimpleSymbol) new SimpleSymbol("Width").readResolve());
    static final IntNum Lit63 = IntNum.make(-2);
    static final FString Lit64 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit65 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit66 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement2").readResolve());
    static final IntNum Lit67 = IntNum.make(16777215);
    static final FString Lit68 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit69 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit7 = ((SimpleSymbol) new SimpleSymbol(TinyDB.DEFAULT_NAMESPACE).readResolve());
    static final SimpleSymbol Lit70 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement5").readResolve());
    static final IntNum Lit71 = IntNum.make(16777215);
    static final IntNum Lit72 = IntNum.make(10);
    static final FString Lit73 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit74 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit75 = ((SimpleSymbol) new SimpleSymbol("Button1").readResolve());
    static final IntNum Lit76 = IntNum.make(30);
    static final SimpleSymbol Lit77 = ((SimpleSymbol) new SimpleSymbol("Image").readResolve());
    static final SimpleSymbol Lit78 = ((SimpleSymbol) new SimpleSymbol("Shape").readResolve());
    static final IntNum Lit79 = IntNum.make(1);
    static final SimpleSymbol Lit8 = ((SimpleSymbol) new SimpleSymbol("GetValue").readResolve());
    static final FString Lit80 = new FString("com.google.appinventor.components.runtime.Button");
    static final PairWithPosition Lit81 = PairWithPosition.make(Lit11, PairWithPosition.make(Lit147, LList.Empty, "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Accueil.yail", 332009), "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Accueil.yail", 332003);
    static final PairWithPosition Lit82 = PairWithPosition.make(Lit11, PairWithPosition.make(Lit11, LList.Empty, "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Accueil.yail", 332024), "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Accueil.yail", 332018);
    static final SimpleSymbol Lit83 = ((SimpleSymbol) new SimpleSymbol("Button1$Click").readResolve());
    static final SimpleSymbol Lit84 = ((SimpleSymbol) new SimpleSymbol("Click").readResolve());
    static final FString Lit85 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit86 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement4").readResolve());
    static final IntNum Lit87 = IntNum.make(16777215);
    static final FString Lit88 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit89 = new FString("com.google.appinventor.components.runtime.Button");
    static final PairWithPosition Lit9 = PairWithPosition.make(Lit11, PairWithPosition.make(Lit147, LList.Empty, "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Accueil.yail", 37106), "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Accueil.yail", 37100);
    static final SimpleSymbol Lit90 = ((SimpleSymbol) new SimpleSymbol("Button2").readResolve());
    static final IntNum Lit91 = IntNum.make(100);
    static final FString Lit92 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit93 = ((SimpleSymbol) new SimpleSymbol("Button2$Click").readResolve());
    static final FString Lit94 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit95 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement3").readResolve());
    static final IntNum Lit96 = IntNum.make(16777215);
    static final FString Lit97 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit98 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit99 = ((SimpleSymbol) new SimpleSymbol("Button3").readResolve());
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
    public final ModuleMethod Accueil$BackPressed;
    public final ModuleMethod Accueil$Initialize;
    public Button Button1;
    public final ModuleMethod Button1$Click;
    public Button Button2;
    public final ModuleMethod Button2$Click;
    public Button Button3;
    public final ModuleMethod Button3$Click;
    public HorizontalArrangement HorizontalArrangement1;
    public HorizontalArrangement HorizontalArrangement2;
    public HorizontalArrangement HorizontalArrangement3;
    public HorizontalArrangement HorizontalArrangement4;
    public HorizontalArrangement HorizontalArrangement5;
    public HorizontalArrangement HorizontalArrangement6;
    public Notifier Notifier1;
    public final ModuleMethod Notifier1$AfterChoosing;
    public TaifunNotification TaifunNotification1;
    public TinyDB TinyDB1;
    public Web Web1;
    public final ModuleMethod Web1$GotText;
    public WebViewer WebViewer1;
    public final ModuleMethod WebViewer1$PageLoaded;
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
        Lit11 = simpleSymbol;
        Lit127 = PairWithPosition.make(simpleSymbol, LList.Empty, "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Accueil.yail", 696522);
        int[] iArr = new int[2];
        iArr[0] = -14671580;
        Lit59 = IntNum.make(iArr);
        SimpleSymbol simpleSymbol2 = Lit11;
        SimpleSymbol simpleSymbol3 = Lit11;
        SimpleSymbol simpleSymbol4 = Lit11;
        SimpleSymbol simpleSymbol5 = Lit11;
        SimpleSymbol simpleSymbol6 = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_BOOLEAN).readResolve();
        Lit18 = simpleSymbol6;
        Lit38 = PairWithPosition.make(simpleSymbol2, PairWithPosition.make(simpleSymbol3, PairWithPosition.make(simpleSymbol4, PairWithPosition.make(simpleSymbol5, PairWithPosition.make(simpleSymbol6, LList.Empty, "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Accueil.yail", 119138), "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Accueil.yail", 119133), "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Accueil.yail", 119128), "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Accueil.yail", 119123), "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Accueil.yail", 119117);
        int[] iArr2 = new int[2];
        iArr2[0] = -16777216;
        Lit21 = IntNum.make(iArr2);
    }

    public Accueil() {
        ModuleInfo.register(this);
        frame frame2 = new frame();
        frame2.$main = this;
        this.get$Mnsimple$Mnname = new ModuleMethod(frame2, 1, Lit133, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.onCreate = new ModuleMethod(frame2, 2, "onCreate", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.android$Mnlog$Mnform = new ModuleMethod(frame2, 3, Lit134, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(frame2, 4, Lit135, 8194);
        this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame2, 5, Lit136, 8193);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame2, 7, Lit137, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(frame2, 8, Lit138, 8194);
        this.add$Mnto$Mnevents = new ModuleMethod(frame2, 9, Lit139, 8194);
        this.add$Mnto$Mncomponents = new ModuleMethod(frame2, 10, Lit140, 16388);
        this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(frame2, 11, Lit141, 8194);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(frame2, 12, Lit142, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.send$Mnerror = new ModuleMethod(frame2, 13, Lit143, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.process$Mnexception = new ModuleMethod(frame2, 14, "process-exception", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.dispatchEvent = new ModuleMethod(frame2, 15, Lit144, 16388);
        this.dispatchGenericEvent = new ModuleMethod(frame2, 16, Lit145, 16388);
        this.lookup$Mnhandler = new ModuleMethod(frame2, 17, Lit146, 8194);
        ModuleMethod moduleMethod = new ModuleMethod(frame2, 18, (Object) null, 0);
        moduleMethod.setProperty("source-location", "/tmp/runtime5061084233371746619.scm:622");
        lambda$Fn1 = moduleMethod;
        this.$define = new ModuleMethod(frame2, 19, "$define", 0);
        lambda$Fn2 = new ModuleMethod(frame2, 20, (Object) null, 0);
        lambda$Fn3 = new ModuleMethod(frame2, 21, (Object) null, 0);
        lambda$Fn5 = new ModuleMethod(frame2, 22, (Object) null, 0);
        lambda$Fn4 = new ModuleMethod(frame2, 23, (Object) null, 0);
        lambda$Fn6 = new ModuleMethod(frame2, 24, (Object) null, 0);
        this.Accueil$BackPressed = new ModuleMethod(frame2, 25, Lit39, 0);
        this.Accueil$Initialize = new ModuleMethod(frame2, 26, Lit51, 0);
        lambda$Fn7 = new ModuleMethod(frame2, 27, (Object) null, 0);
        lambda$Fn8 = new ModuleMethod(frame2, 28, (Object) null, 0);
        lambda$Fn9 = new ModuleMethod(frame2, 29, (Object) null, 0);
        lambda$Fn10 = new ModuleMethod(frame2, 30, (Object) null, 0);
        lambda$Fn11 = new ModuleMethod(frame2, 31, (Object) null, 0);
        lambda$Fn12 = new ModuleMethod(frame2, 32, (Object) null, 0);
        lambda$Fn13 = new ModuleMethod(frame2, 33, (Object) null, 0);
        lambda$Fn14 = new ModuleMethod(frame2, 34, (Object) null, 0);
        this.Button1$Click = new ModuleMethod(frame2, 35, Lit83, 0);
        lambda$Fn15 = new ModuleMethod(frame2, 36, (Object) null, 0);
        lambda$Fn16 = new ModuleMethod(frame2, 37, (Object) null, 0);
        lambda$Fn17 = new ModuleMethod(frame2, 38, (Object) null, 0);
        lambda$Fn18 = new ModuleMethod(frame2, 39, (Object) null, 0);
        this.Button2$Click = new ModuleMethod(frame2, 40, Lit93, 0);
        lambda$Fn19 = new ModuleMethod(frame2, 41, (Object) null, 0);
        lambda$Fn20 = new ModuleMethod(frame2, 42, (Object) null, 0);
        lambda$Fn21 = new ModuleMethod(frame2, 43, (Object) null, 0);
        lambda$Fn22 = new ModuleMethod(frame2, 44, (Object) null, 0);
        this.Button3$Click = new ModuleMethod(frame2, 45, Lit102, 0);
        lambda$Fn23 = new ModuleMethod(frame2, 46, (Object) null, 0);
        lambda$Fn24 = new ModuleMethod(frame2, 47, (Object) null, 0);
        lambda$Fn25 = new ModuleMethod(frame2, 48, (Object) null, 0);
        lambda$Fn26 = new ModuleMethod(frame2, 49, (Object) null, 0);
        this.WebViewer1$PageLoaded = new ModuleMethod(frame2, 50, Lit113, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.Notifier1$AfterChoosing = new ModuleMethod(frame2, 51, Lit121, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.Web1$GotText = new ModuleMethod(frame2, 52, Lit128, 16388);
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
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit3, ""), $result);
                } else {
                    addToGlobalVars(Lit3, lambda$Fn2);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit4, lambda$Fn3), $result);
                } else {
                    addToGlobalVars(Lit4, lambda$Fn4);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit14, Lit15, Lit16);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit17, Boolean.TRUE, Lit18);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit19, "MySadWorld", Lit11);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit20, Lit21, Lit16);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit22, "fade", Lit11);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit23, "fade", Lit11);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit24, Lit25, Lit16);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit26, Lit27, Lit16);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit28, "portrait", Lit11);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit29, Boolean.TRUE, Lit18);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit30, "Responsive", Lit11);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit31, "AppTheme", Lit11);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit32, "Accueil", Lit11);
                    Values.writeValues(runtime.setAndCoerceProperty$Ex(Lit0, Lit33, Boolean.FALSE, Lit18), $result);
                } else {
                    addToFormDoAfterCreation(new Promise(lambda$Fn6));
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit39, this.Accueil$BackPressed);
                } else {
                    addToFormEnvironment(Lit39, this.Accueil$BackPressed);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Accueil", "BackPressed");
                } else {
                    addToEvents(Lit0, Lit40);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit51, this.Accueil$Initialize);
                } else {
                    addToFormEnvironment(Lit51, this.Accueil$Initialize);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Accueil", "Initialize");
                } else {
                    addToEvents(Lit0, Lit52);
                }
                this.HorizontalArrangement1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit53, Lit54, lambda$Fn7), $result);
                } else {
                    addToComponents(Lit0, Lit64, Lit54, lambda$Fn8);
                }
                this.HorizontalArrangement2 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit54, Lit65, Lit66, lambda$Fn9), $result);
                } else {
                    addToComponents(Lit54, Lit68, Lit66, lambda$Fn10);
                }
                this.HorizontalArrangement5 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit66, Lit69, Lit70, lambda$Fn11), $result);
                } else {
                    addToComponents(Lit66, Lit73, Lit70, lambda$Fn12);
                }
                this.Button1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit66, Lit74, Lit75, lambda$Fn13), $result);
                } else {
                    addToComponents(Lit66, Lit80, Lit75, lambda$Fn14);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit83, this.Button1$Click);
                } else {
                    addToFormEnvironment(Lit83, this.Button1$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Button1", "Click");
                } else {
                    addToEvents(Lit75, Lit84);
                }
                this.HorizontalArrangement4 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit54, Lit85, Lit86, lambda$Fn15), $result);
                } else {
                    addToComponents(Lit54, Lit88, Lit86, lambda$Fn16);
                }
                this.Button2 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit86, Lit89, Lit90, lambda$Fn17), $result);
                } else {
                    addToComponents(Lit86, Lit92, Lit90, lambda$Fn18);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit93, this.Button2$Click);
                } else {
                    addToFormEnvironment(Lit93, this.Button2$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Button2", "Click");
                } else {
                    addToEvents(Lit90, Lit84);
                }
                this.HorizontalArrangement3 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit54, Lit94, Lit95, lambda$Fn19), $result);
                } else {
                    addToComponents(Lit54, Lit97, Lit95, lambda$Fn20);
                }
                this.Button3 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit95, Lit98, Lit99, lambda$Fn21), $result);
                } else {
                    addToComponents(Lit95, Lit100, Lit99, lambda$Fn22);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit102, this.Button3$Click);
                } else {
                    addToFormEnvironment(Lit102, this.Button3$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Button3", "Click");
                } else {
                    addToEvents(Lit99, Lit84);
                }
                this.HorizontalArrangement6 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit95, Lit103, Lit104, lambda$Fn23), $result);
                } else {
                    addToComponents(Lit95, Lit105, Lit104, lambda$Fn24);
                }
                this.WebViewer1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit106, Lit5, lambda$Fn25), $result);
                } else {
                    addToComponents(Lit0, Lit108, Lit5, lambda$Fn26);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit113, this.WebViewer1$PageLoaded);
                } else {
                    addToFormEnvironment(Lit113, this.WebViewer1$PageLoaded);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "WebViewer1", "PageLoaded");
                } else {
                    addToEvents(Lit5, Lit114);
                }
                this.TinyDB1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit115, Lit7, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit116, Lit7, Boolean.FALSE);
                }
                this.Notifier1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit117, Lit36, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit118, Lit36, Boolean.FALSE);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit121, this.Notifier1$AfterChoosing);
                } else {
                    addToFormEnvironment(Lit121, this.Notifier1$AfterChoosing);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Notifier1", "AfterChoosing");
                } else {
                    addToEvents(Lit36, Lit122);
                }
                this.Web1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit123, Lit43, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit124, Lit43, Boolean.FALSE);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit128, this.Web1$GotText);
                } else {
                    addToFormEnvironment(Lit128, this.Web1$GotText);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Web1", "GotText");
                } else {
                    addToEvents(Lit43, Lit129);
                }
                this.TaifunNotification1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit130, Lit131, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit132, Lit131, Boolean.FALSE);
                }
                runtime.initRuntime();
            } catch (ClassCastException e) {
                throw new WrongType(e, "java.lang.Runnable.run()", 1, find2);
            }
        } catch (ClassCastException e2) {
            throw new WrongType(e2, "java.lang.Runnable.run()", 1, find);
        }
    }

    /* compiled from: Accueil.yail */
    public class frame extends ModuleBody {
        Accueil $main;

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
                    return Accueil.lambda4();
                case 22:
                    return Accueil.lambda6();
                case 23:
                    return Accueil.lambda5();
                case 24:
                    return Accueil.lambda7();
                case 25:
                    return this.$main.Accueil$BackPressed();
                case 26:
                    return this.$main.Accueil$Initialize();
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
                    return Accueil.lambda15();
                case 35:
                    return this.$main.Button1$Click();
                case 36:
                    return Accueil.lambda16();
                case 37:
                    return Accueil.lambda17();
                case 38:
                    return Accueil.lambda18();
                case 39:
                    return Accueil.lambda19();
                case 40:
                    return this.$main.Button2$Click();
                case 41:
                    return Accueil.lambda20();
                case 42:
                    return Accueil.lambda21();
                case 43:
                    return Accueil.lambda22();
                case 44:
                    return Accueil.lambda23();
                case 45:
                    return this.$main.Button3$Click();
                case 46:
                    return Accueil.lambda24();
                case 47:
                    return Accueil.lambda25();
                case 48:
                    return Accueil.lambda26();
                case 49:
                    return Accueil.lambda27();
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
                case 48:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 49:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
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
                    callContext.pc = 1;
                    return 0;
                case 2:
                    if (!(obj instanceof Accueil)) {
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
                    if (!(obj instanceof Accueil)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 50:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 51:
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
                    callContext.pc = 4;
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
                    callContext.pc = 4;
                    return 0;
                case 52:
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
                case 50:
                    return this.$main.WebViewer1$PageLoaded(obj);
                case 51:
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
                case 52:
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

    static String lambda3() {
        return "";
    }

    static Object lambda4() {
        return runtime.setAndCoerceProperty$Ex(Lit5, Lit6, runtime.callYailPrimitive(strings.string$Mnappend, LList.list2("http://msw.kellis.fr/fil.php?id=", runtime.callComponentMethod(Lit7, Lit8, LList.list2("user_id", "NULL"), Lit9)), Lit10, "join"), Lit11);
    }

    static Procedure lambda5() {
        return lambda$Fn5;
    }

    static Object lambda6() {
        return runtime.setAndCoerceProperty$Ex(Lit5, Lit6, runtime.callYailPrimitive(strings.string$Mnappend, LList.list2("http://msw.kellis.fr/fil.php?id=", runtime.callComponentMethod(Lit7, Lit8, LList.list2("user_id", "NULL"), Lit12)), Lit13, "join"), Lit11);
    }

    static Object lambda7() {
        runtime.setAndCoerceProperty$Ex(Lit0, Lit14, Lit15, Lit16);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit17, Boolean.TRUE, Lit18);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit19, "MySadWorld", Lit11);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit20, Lit21, Lit16);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit22, "fade", Lit11);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit23, "fade", Lit11);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit24, Lit25, Lit16);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit26, Lit27, Lit16);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit28, "portrait", Lit11);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit29, Boolean.TRUE, Lit18);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit30, "Responsive", Lit11);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit31, "AppTheme", Lit11);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit32, "Accueil", Lit11);
        return runtime.setAndCoerceProperty$Ex(Lit0, Lit33, Boolean.FALSE, Lit18);
    }

    public Object Accueil$BackPressed() {
        runtime.setThisForm();
        if (runtime.callComponentMethod(Lit5, Lit34, LList.Empty, LList.Empty) != Boolean.FALSE) {
            return runtime.callComponentMethod(Lit5, Lit35, LList.Empty, LList.Empty);
        }
        SimpleSymbol simpleSymbol = Lit36;
        SimpleSymbol simpleSymbol2 = Lit37;
        Pair list1 = LList.list1("Voulez-vous vraiment quitter l'application ?");
        LList.chain4(list1, "Quitter l'application", "Oui", "Non", Boolean.FALSE);
        return runtime.callComponentMethod(simpleSymbol, simpleSymbol2, list1, Lit38);
    }

    public Object Accueil$Initialize() {
        runtime.setThisForm();
        if (runtime.callYailPrimitive(runtime.yail$Mnnot$Mnequal$Qu, LList.list2(runtime.callComponentMethod(Lit7, Lit8, LList.list2("user_id", "NULL"), Lit41), "NULL"), Lit42, "=") != Boolean.FALSE) {
            runtime.setAndCoerceProperty$Ex(Lit43, Lit44, runtime.callYailPrimitive(strings.string$Mnappend, LList.list2("http://msw.kellis.fr/android/actions/isHappy.php?id=", runtime.callComponentMethod(Lit7, Lit8, LList.list2("user_id", "NULL"), Lit45)), Lit46, "join"), Lit11);
            return runtime.callComponentMethod(Lit43, Lit47, LList.Empty, LList.Empty);
        }
        runtime.callComponentMethod(Lit36, Lit48, LList.list1("Vous avez été déconnecté de votre compte."), Lit49);
        return runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen, LList.list1("Connexion"), Lit50, "open another screen");
    }

    static Object lambda8() {
        runtime.setAndCoerceProperty$Ex(Lit54, Lit55, Lit56, Lit16);
        runtime.setAndCoerceProperty$Ex(Lit54, Lit57, Lit58, Lit16);
        runtime.setAndCoerceProperty$Ex(Lit54, Lit20, Lit59, Lit16);
        runtime.setAndCoerceProperty$Ex(Lit54, Lit60, Lit61, Lit16);
        return runtime.setAndCoerceProperty$Ex(Lit54, Lit62, Lit63, Lit16);
    }

    static Object lambda9() {
        runtime.setAndCoerceProperty$Ex(Lit54, Lit55, Lit56, Lit16);
        runtime.setAndCoerceProperty$Ex(Lit54, Lit57, Lit58, Lit16);
        runtime.setAndCoerceProperty$Ex(Lit54, Lit20, Lit59, Lit16);
        runtime.setAndCoerceProperty$Ex(Lit54, Lit60, Lit61, Lit16);
        return runtime.setAndCoerceProperty$Ex(Lit54, Lit62, Lit63, Lit16);
    }

    static Object lambda10() {
        runtime.setAndCoerceProperty$Ex(Lit66, Lit57, Lit58, Lit16);
        runtime.setAndCoerceProperty$Ex(Lit66, Lit20, Lit67, Lit16);
        return runtime.setAndCoerceProperty$Ex(Lit66, Lit62, Lit63, Lit16);
    }

    static Object lambda11() {
        runtime.setAndCoerceProperty$Ex(Lit66, Lit57, Lit58, Lit16);
        runtime.setAndCoerceProperty$Ex(Lit66, Lit20, Lit67, Lit16);
        return runtime.setAndCoerceProperty$Ex(Lit66, Lit62, Lit63, Lit16);
    }

    static Object lambda12() {
        runtime.setAndCoerceProperty$Ex(Lit70, Lit20, Lit71, Lit16);
        return runtime.setAndCoerceProperty$Ex(Lit70, Lit62, Lit72, Lit16);
    }

    static Object lambda13() {
        runtime.setAndCoerceProperty$Ex(Lit70, Lit20, Lit71, Lit16);
        return runtime.setAndCoerceProperty$Ex(Lit70, Lit62, Lit72, Lit16);
    }

    static Object lambda14() {
        runtime.setAndCoerceProperty$Ex(Lit75, Lit60, Lit76, Lit16);
        runtime.setAndCoerceProperty$Ex(Lit75, Lit77, "user-circle.png", Lit11);
        runtime.setAndCoerceProperty$Ex(Lit75, Lit78, Lit79, Lit16);
        return runtime.setAndCoerceProperty$Ex(Lit75, Lit62, Lit76, Lit16);
    }

    static Object lambda15() {
        runtime.setAndCoerceProperty$Ex(Lit75, Lit60, Lit76, Lit16);
        runtime.setAndCoerceProperty$Ex(Lit75, Lit77, "user-circle.png", Lit11);
        runtime.setAndCoerceProperty$Ex(Lit75, Lit78, Lit79, Lit16);
        return runtime.setAndCoerceProperty$Ex(Lit75, Lit62, Lit76, Lit16);
    }

    public Object Button1$Click() {
        runtime.setThisForm();
        return runtime.setAndCoerceProperty$Ex(Lit5, Lit6, runtime.callYailPrimitive(strings.string$Mnappend, LList.list2("http://msw.kellis.fr/profil.php?id=", runtime.callComponentMethod(Lit7, Lit8, LList.list2("user_id", "NULL"), Lit81)), Lit82, "join"), Lit11);
    }

    static Object lambda16() {
        runtime.setAndCoerceProperty$Ex(Lit86, Lit55, Lit56, Lit16);
        runtime.setAndCoerceProperty$Ex(Lit86, Lit57, Lit58, Lit16);
        runtime.setAndCoerceProperty$Ex(Lit86, Lit20, Lit87, Lit16);
        return runtime.setAndCoerceProperty$Ex(Lit86, Lit62, Lit63, Lit16);
    }

    static Object lambda17() {
        runtime.setAndCoerceProperty$Ex(Lit86, Lit55, Lit56, Lit16);
        runtime.setAndCoerceProperty$Ex(Lit86, Lit57, Lit58, Lit16);
        runtime.setAndCoerceProperty$Ex(Lit86, Lit20, Lit87, Lit16);
        return runtime.setAndCoerceProperty$Ex(Lit86, Lit62, Lit63, Lit16);
    }

    static Object lambda18() {
        runtime.setAndCoerceProperty$Ex(Lit90, Lit60, Lit91, Lit16);
        runtime.setAndCoerceProperty$Ex(Lit90, Lit77, "MSW_w.png", Lit11);
        return runtime.setAndCoerceProperty$Ex(Lit90, Lit62, Lit91, Lit16);
    }

    static Object lambda19() {
        runtime.setAndCoerceProperty$Ex(Lit90, Lit60, Lit91, Lit16);
        runtime.setAndCoerceProperty$Ex(Lit90, Lit77, "MSW_w.png", Lit11);
        return runtime.setAndCoerceProperty$Ex(Lit90, Lit62, Lit91, Lit16);
    }

    public Object Button2$Click() {
        runtime.setThisForm();
        return Scheme.applyToArgs.apply1(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit4, runtime.$Stthe$Mnnull$Mnvalue$St));
    }

    static Object lambda20() {
        runtime.setAndCoerceProperty$Ex(Lit95, Lit55, Lit58, Lit16);
        runtime.setAndCoerceProperty$Ex(Lit95, Lit57, Lit58, Lit16);
        runtime.setAndCoerceProperty$Ex(Lit95, Lit20, Lit96, Lit16);
        return runtime.setAndCoerceProperty$Ex(Lit95, Lit62, Lit63, Lit16);
    }

    static Object lambda21() {
        runtime.setAndCoerceProperty$Ex(Lit95, Lit55, Lit58, Lit16);
        runtime.setAndCoerceProperty$Ex(Lit95, Lit57, Lit58, Lit16);
        runtime.setAndCoerceProperty$Ex(Lit95, Lit20, Lit96, Lit16);
        return runtime.setAndCoerceProperty$Ex(Lit95, Lit62, Lit63, Lit16);
    }

    static Object lambda22() {
        runtime.setAndCoerceProperty$Ex(Lit99, Lit60, Lit76, Lit16);
        runtime.setAndCoerceProperty$Ex(Lit99, Lit77, "redo.png", Lit11);
        return runtime.setAndCoerceProperty$Ex(Lit99, Lit62, Lit76, Lit16);
    }

    static Object lambda23() {
        runtime.setAndCoerceProperty$Ex(Lit99, Lit60, Lit76, Lit16);
        runtime.setAndCoerceProperty$Ex(Lit99, Lit77, "redo.png", Lit11);
        return runtime.setAndCoerceProperty$Ex(Lit99, Lit62, Lit76, Lit16);
    }

    public Object Button3$Click() {
        runtime.setThisForm();
        return runtime.callComponentMethod(Lit5, Lit101, LList.Empty, LList.Empty);
    }

    static Object lambda24() {
        runtime.setAndCoerceProperty$Ex(Lit104, Lit60, Lit63, Lit16);
        return runtime.setAndCoerceProperty$Ex(Lit104, Lit62, Lit72, Lit16);
    }

    static Object lambda25() {
        runtime.setAndCoerceProperty$Ex(Lit104, Lit60, Lit63, Lit16);
        return runtime.setAndCoerceProperty$Ex(Lit104, Lit62, Lit72, Lit16);
    }

    static Object lambda26() {
        return runtime.setAndCoerceProperty$Ex(Lit5, Lit107, Boolean.FALSE, Lit18);
    }

    static Object lambda27() {
        return runtime.setAndCoerceProperty$Ex(Lit5, Lit107, Boolean.FALSE, Lit18);
    }

    public Object WebViewer1$PageLoaded(Object $url) {
        Object $url2 = runtime.sanitizeComponentData($url);
        runtime.setThisForm();
        ModuleMethod moduleMethod = runtime.yail$Mnequal$Qu;
        if ($url2 instanceof Package) {
            $url2 = runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit109), " is not bound in the current context"), "Unbound Variable");
        }
        if (runtime.callYailPrimitive(moduleMethod, LList.list2($url2, "http://msw.kellis.fr/android/actions/logout.php"), Lit110, "=") == Boolean.FALSE) {
            return Values.empty;
        }
        runtime.callComponentMethod(Lit7, Lit111, LList.Empty, LList.Empty);
        return runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen, LList.list1("Connexion"), Lit112, "open another screen");
    }

    public Object Notifier1$AfterChoosing(Object $choice) {
        Object $choice2 = runtime.sanitizeComponentData($choice);
        runtime.setThisForm();
        ModuleMethod moduleMethod = runtime.yail$Mnequal$Qu;
        if ($choice2 instanceof Package) {
            $choice2 = runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit119), " is not bound in the current context"), "Unbound Variable");
        }
        return runtime.callYailPrimitive(moduleMethod, LList.list2($choice2, "Oui"), Lit120, "=") != Boolean.FALSE ? runtime.callYailPrimitive(runtime.close$Mnapplication, LList.Empty, LList.Empty, "close application") : Values.empty;
    }

    public Object Web1$GotText(Object $url, Object $responseCode, Object $responseType, Object $responseContent) {
        runtime.sanitizeComponentData($url);
        runtime.sanitizeComponentData($responseCode);
        runtime.sanitizeComponentData($responseType);
        Object $responseContent2 = runtime.sanitizeComponentData($responseContent);
        runtime.setThisForm();
        ModuleMethod moduleMethod = runtime.yail$Mnequal$Qu;
        if ($responseContent2 instanceof Package) {
            $responseContent2 = runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit125), " is not bound in the current context"), "Unbound Variable");
        }
        return runtime.callYailPrimitive(moduleMethod, LList.list2($responseContent2, "yes"), Lit126, "=") != Boolean.FALSE ? runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen, LList.list1("Happiness"), Lit127, "open another screen") : Scheme.applyToArgs.apply1(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit4, runtime.$Stthe$Mnnull$Mnvalue$St));
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
        Accueil = this;
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
