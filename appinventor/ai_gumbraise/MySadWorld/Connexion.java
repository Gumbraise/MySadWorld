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
import com.google.appinventor.components.runtime.Notifier;
import com.google.appinventor.components.runtime.PasswordTextBox;
import com.google.appinventor.components.runtime.TextBox;
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

/* compiled from: Connexion.yail */
public class Connexion extends Form implements Runnable {
    public static Connexion Connexion;
    static final SimpleSymbol Lit0 = ((SimpleSymbol) new SimpleSymbol("Connexion").readResolve());
    static final SimpleSymbol Lit1 = ((SimpleSymbol) new SimpleSymbol("getMessage").readResolve());
    static final SimpleSymbol Lit10;
    static final IntNum Lit100;
    static final FString Lit101 = new FString("com.google.appinventor.components.runtime.Button");
    static final PairWithPosition Lit102 = PairWithPosition.make(Lit12, LList.Empty, "/tmp/1587408489630_0.5804644978554321-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 794706);
    static final SimpleSymbol Lit103 = ((SimpleSymbol) new SimpleSymbol("Button2$Click").readResolve());
    static final FString Lit104 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit105 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement6").readResolve());
    static final FString Lit106 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit107 = new FString("com.google.appinventor.components.runtime.Notifier");
    static final SimpleSymbol Lit108 = ((SimpleSymbol) new SimpleSymbol("Notifier1").readResolve());
    static final FString Lit109 = new FString("com.google.appinventor.components.runtime.Notifier");
    static final SimpleSymbol Lit11 = ((SimpleSymbol) new SimpleSymbol("AppName").readResolve());
    static final SimpleSymbol Lit110 = ((SimpleSymbol) new SimpleSymbol("$choice").readResolve());
    static final PairWithPosition Lit111 = PairWithPosition.make(Lit161, PairWithPosition.make(Lit161, LList.Empty, "/tmp/1587408489630_0.5804644978554321-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 860263), "/tmp/1587408489630_0.5804644978554321-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 860258);
    static final PairWithPosition Lit112 = PairWithPosition.make(Lit12, LList.Empty, "/tmp/1587408489630_0.5804644978554321-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 860451);
    static final SimpleSymbol Lit113 = ((SimpleSymbol) new SimpleSymbol("Notifier1$AfterChoosing").readResolve());
    static final SimpleSymbol Lit114 = ((SimpleSymbol) new SimpleSymbol("AfterChoosing").readResolve());
    static final FString Lit115 = new FString("com.google.appinventor.components.runtime.Web");
    static final FString Lit116 = new FString("com.google.appinventor.components.runtime.Web");
    static final SimpleSymbol Lit117 = ((SimpleSymbol) new SimpleSymbol("$responseCode").readResolve());
    static final PairWithPosition Lit118 = PairWithPosition.make(Lit161, PairWithPosition.make(Lit161, LList.Empty, "/tmp/1587408489630_0.5804644978554321-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 888937), "/tmp/1587408489630_0.5804644978554321-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 888932);
    static final SimpleSymbol Lit119 = ((SimpleSymbol) new SimpleSymbol("$responseContent").readResolve());
    static final SimpleSymbol Lit12;
    static final PairWithPosition Lit120 = PairWithPosition.make(Lit12, PairWithPosition.make(Lit12, LList.Empty, "/tmp/1587408489630_0.5804644978554321-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 889076), "/tmp/1587408489630_0.5804644978554321-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 889070);
    static final PairWithPosition Lit121 = PairWithPosition.make(Lit160, PairWithPosition.make(Lit8, LList.Empty, "/tmp/1587408489630_0.5804644978554321-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 889239), "/tmp/1587408489630_0.5804644978554321-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 889233);
    static final PairWithPosition Lit122 = PairWithPosition.make(Lit161, PairWithPosition.make(Lit161, LList.Empty, "/tmp/1587408489630_0.5804644978554321-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 889280), "/tmp/1587408489630_0.5804644978554321-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 889275);
    static final PairWithPosition Lit123 = PairWithPosition.make(Lit160, PairWithPosition.make(Lit8, LList.Empty, "/tmp/1587408489630_0.5804644978554321-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 889447), "/tmp/1587408489630_0.5804644978554321-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 889441);
    static final PairWithPosition Lit124 = PairWithPosition.make(Lit161, PairWithPosition.make(Lit161, LList.Empty, "/tmp/1587408489630_0.5804644978554321-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 889486), "/tmp/1587408489630_0.5804644978554321-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 889481);
    static final IntNum Lit125 = IntNum.make(4);
    static final PairWithPosition Lit126 = PairWithPosition.make(Lit160, PairWithPosition.make(Lit8, LList.Empty, "/tmp/1587408489630_0.5804644978554321-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 889653), "/tmp/1587408489630_0.5804644978554321-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 889647);
    static final PairWithPosition Lit127 = PairWithPosition.make(Lit161, PairWithPosition.make(Lit161, LList.Empty, "/tmp/1587408489630_0.5804644978554321-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 889692), "/tmp/1587408489630_0.5804644978554321-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 889687);
    static final SimpleSymbol Lit128 = ((SimpleSymbol) new SimpleSymbol(TinyDB.DEFAULT_NAMESPACE).readResolve());
    static final SimpleSymbol Lit129 = ((SimpleSymbol) new SimpleSymbol("StoreValue").readResolve());
    static final SimpleSymbol Lit13 = ((SimpleSymbol) new SimpleSymbol("BackgroundColor").readResolve());
    static final PairWithPosition Lit130 = PairWithPosition.make(Lit160, PairWithPosition.make(Lit8, LList.Empty, "/tmp/1587408489630_0.5804644978554321-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 889877), "/tmp/1587408489630_0.5804644978554321-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 889871);
    static final PairWithPosition Lit131 = PairWithPosition.make(Lit12, PairWithPosition.make(Lit161, LList.Empty, "/tmp/1587408489630_0.5804644978554321-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 889913), "/tmp/1587408489630_0.5804644978554321-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 889907);
    static final PairWithPosition Lit132 = PairWithPosition.make(Lit12, LList.Empty, "/tmp/1587408489630_0.5804644978554321-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 889991);
    static final SimpleSymbol Lit133 = ((SimpleSymbol) new SimpleSymbol("ShowChooseDialog").readResolve());
    static final IntNum Lit134 = IntNum.make(5);
    static final PairWithPosition Lit135;
    static final PairWithPosition Lit136 = PairWithPosition.make(Lit12, PairWithPosition.make(Lit12, PairWithPosition.make(Lit12, LList.Empty, "/tmp/1587408489630_0.5804644978554321-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 890303), "/tmp/1587408489630_0.5804644978554321-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 890298), "/tmp/1587408489630_0.5804644978554321-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 890292);
    static final PairWithPosition Lit137 = PairWithPosition.make(Lit12, PairWithPosition.make(Lit12, PairWithPosition.make(Lit12, PairWithPosition.make(Lit12, PairWithPosition.make(Lit10, LList.Empty, "/tmp/1587408489630_0.5804644978554321-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 890407), "/tmp/1587408489630_0.5804644978554321-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 890402), "/tmp/1587408489630_0.5804644978554321-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 890397), "/tmp/1587408489630_0.5804644978554321-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 890392), "/tmp/1587408489630_0.5804644978554321-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 890386);
    static final PairWithPosition Lit138 = PairWithPosition.make(Lit12, LList.Empty, "/tmp/1587408489630_0.5804644978554321-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 890501);
    static final SimpleSymbol Lit139 = ((SimpleSymbol) new SimpleSymbol("ShowAlert").readResolve());
    static final IntNum Lit14;
    static final PairWithPosition Lit140 = PairWithPosition.make(Lit12, LList.Empty, "/tmp/1587408489630_0.5804644978554321-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 890643);
    static final PairWithPosition Lit141;
    static final SimpleSymbol Lit142 = ((SimpleSymbol) new SimpleSymbol("Web1$GotText").readResolve());
    static final SimpleSymbol Lit143 = ((SimpleSymbol) new SimpleSymbol("GotText").readResolve());
    static final FString Lit144 = new FString("com.google.appinventor.components.runtime.TinyDB");
    static final FString Lit145 = new FString("com.google.appinventor.components.runtime.TinyDB");
    static final SimpleSymbol Lit146 = ((SimpleSymbol) new SimpleSymbol("get-simple-name").readResolve());
    static final SimpleSymbol Lit147 = ((SimpleSymbol) new SimpleSymbol("android-log-form").readResolve());
    static final SimpleSymbol Lit148 = ((SimpleSymbol) new SimpleSymbol("add-to-form-environment").readResolve());
    static final SimpleSymbol Lit149 = ((SimpleSymbol) new SimpleSymbol("lookup-in-form-environment").readResolve());
    static final SimpleSymbol Lit15 = ((SimpleSymbol) new SimpleSymbol("CloseScreenAnimation").readResolve());
    static final SimpleSymbol Lit150 = ((SimpleSymbol) new SimpleSymbol("is-bound-in-form-environment").readResolve());
    static final SimpleSymbol Lit151 = ((SimpleSymbol) new SimpleSymbol("add-to-global-var-environment").readResolve());
    static final SimpleSymbol Lit152 = ((SimpleSymbol) new SimpleSymbol("add-to-events").readResolve());
    static final SimpleSymbol Lit153 = ((SimpleSymbol) new SimpleSymbol("add-to-components").readResolve());
    static final SimpleSymbol Lit154 = ((SimpleSymbol) new SimpleSymbol("add-to-global-vars").readResolve());
    static final SimpleSymbol Lit155 = ((SimpleSymbol) new SimpleSymbol("add-to-form-do-after-creation").readResolve());
    static final SimpleSymbol Lit156 = ((SimpleSymbol) new SimpleSymbol("send-error").readResolve());
    static final SimpleSymbol Lit157 = ((SimpleSymbol) new SimpleSymbol("dispatchEvent").readResolve());
    static final SimpleSymbol Lit158 = ((SimpleSymbol) new SimpleSymbol("dispatchGenericEvent").readResolve());
    static final SimpleSymbol Lit159 = ((SimpleSymbol) new SimpleSymbol("lookup-handler").readResolve());
    static final SimpleSymbol Lit16 = ((SimpleSymbol) new SimpleSymbol("OpenScreenAnimation").readResolve());
    static final SimpleSymbol Lit160 = ((SimpleSymbol) new SimpleSymbol("list").readResolve());
    static final SimpleSymbol Lit161 = ((SimpleSymbol) new SimpleSymbol("any").readResolve());
    static final SimpleSymbol Lit17 = ((SimpleSymbol) new SimpleSymbol("PrimaryColor").readResolve());
    static final IntNum Lit18 = IntNum.make(16777215);
    static final SimpleSymbol Lit19 = ((SimpleSymbol) new SimpleSymbol("PrimaryColorDark").readResolve());
    static final SimpleSymbol Lit2 = ((SimpleSymbol) new SimpleSymbol("*the-null-value*").readResolve());
    static final IntNum Lit20 = IntNum.make(16777215);
    static final SimpleSymbol Lit21 = ((SimpleSymbol) new SimpleSymbol("ScreenOrientation").readResolve());
    static final SimpleSymbol Lit22 = ((SimpleSymbol) new SimpleSymbol("ShowListsAsJson").readResolve());
    static final SimpleSymbol Lit23 = ((SimpleSymbol) new SimpleSymbol("Sizing").readResolve());
    static final SimpleSymbol Lit24 = ((SimpleSymbol) new SimpleSymbol("Theme").readResolve());
    static final SimpleSymbol Lit25 = ((SimpleSymbol) new SimpleSymbol("Title").readResolve());
    static final SimpleSymbol Lit26 = ((SimpleSymbol) new SimpleSymbol("TitleVisible").readResolve());
    static final FString Lit27 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit28 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement1").readResolve());
    static final SimpleSymbol Lit29 = ((SimpleSymbol) new SimpleSymbol("Height").readResolve());
    static final SimpleSymbol Lit3 = ((SimpleSymbol) new SimpleSymbol("g$tempURL").readResolve());
    static final IntNum Lit30 = IntNum.make(-2);
    static final SimpleSymbol Lit31 = ((SimpleSymbol) new SimpleSymbol("Width").readResolve());
    static final FString Lit32 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit33 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final SimpleSymbol Lit34 = ((SimpleSymbol) new SimpleSymbol("VerticalArrangement1").readResolve());
    static final SimpleSymbol Lit35 = ((SimpleSymbol) new SimpleSymbol("AlignHorizontal").readResolve());
    static final IntNum Lit36 = IntNum.make(3);
    static final SimpleSymbol Lit37 = ((SimpleSymbol) new SimpleSymbol("AlignVertical").readResolve());
    static final IntNum Lit38 = IntNum.make(2);
    static final FString Lit39 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final SimpleSymbol Lit4 = ((SimpleSymbol) new SimpleSymbol("g$theURL").readResolve());
    static final FString Lit40 = new FString("com.google.appinventor.components.runtime.Image");
    static final SimpleSymbol Lit41 = ((SimpleSymbol) new SimpleSymbol("Image1").readResolve());
    static final IntNum Lit42 = IntNum.make((int) HttpRequestContext.HTTP_OK);
    static final SimpleSymbol Lit43 = ((SimpleSymbol) new SimpleSymbol("Picture").readResolve());
    static final SimpleSymbol Lit44 = ((SimpleSymbol) new SimpleSymbol("ScalePictureToFit").readResolve());
    static final FString Lit45 = new FString("com.google.appinventor.components.runtime.Image");
    static final FString Lit46 = new FString("com.google.appinventor.components.runtime.TextBox");
    static final SimpleSymbol Lit47 = ((SimpleSymbol) new SimpleSymbol("TextBox1").readResolve());
    static final IntNum Lit48;
    static final SimpleSymbol Lit49 = ((SimpleSymbol) new SimpleSymbol("FontSize").readResolve());
    static final SimpleSymbol Lit5 = ((SimpleSymbol) new SimpleSymbol("g$response").readResolve());
    static final IntNum Lit50 = IntNum.make(15);
    static final SimpleSymbol Lit51 = ((SimpleSymbol) new SimpleSymbol("FontTypeface").readResolve());
    static final IntNum Lit52 = IntNum.make(1);
    static final IntNum Lit53 = IntNum.make(40);
    static final SimpleSymbol Lit54 = ((SimpleSymbol) new SimpleSymbol("Hint").readResolve());
    static final SimpleSymbol Lit55 = ((SimpleSymbol) new SimpleSymbol("TextAlignment").readResolve());
    static final SimpleSymbol Lit56 = ((SimpleSymbol) new SimpleSymbol("TextColor").readResolve());
    static final IntNum Lit57;
    static final IntNum Lit58 = IntNum.make(250);
    static final FString Lit59 = new FString("com.google.appinventor.components.runtime.TextBox");
    static final SimpleSymbol Lit6 = ((SimpleSymbol) new SimpleSymbol("AccentColor").readResolve());
    static final FString Lit60 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit61 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement2").readResolve());
    static final IntNum Lit62 = IntNum.make(10);
    static final FString Lit63 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit64 = new FString("com.google.appinventor.components.runtime.PasswordTextBox");
    static final SimpleSymbol Lit65 = ((SimpleSymbol) new SimpleSymbol("PasswordTextBox1").readResolve());
    static final IntNum Lit66;
    static final IntNum Lit67;
    static final FString Lit68 = new FString("com.google.appinventor.components.runtime.PasswordTextBox");
    static final FString Lit69 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final IntNum Lit7 = IntNum.make(16777215);
    static final SimpleSymbol Lit70 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement3").readResolve());
    static final IntNum Lit71 = IntNum.make(20);
    static final FString Lit72 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit73 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit74 = ((SimpleSymbol) new SimpleSymbol("Button1").readResolve());
    static final SimpleSymbol Lit75 = ((SimpleSymbol) new SimpleSymbol("FontBold").readResolve());
    static final SimpleSymbol Lit76 = ((SimpleSymbol) new SimpleSymbol("Image").readResolve());
    static final SimpleSymbol Lit77 = ((SimpleSymbol) new SimpleSymbol("Text").readResolve());
    static final FString Lit78 = new FString("com.google.appinventor.components.runtime.Button");
    static final PairWithPosition Lit79 = PairWithPosition.make(Lit12, PairWithPosition.make(Lit12, PairWithPosition.make(Lit12, PairWithPosition.make(Lit12, LList.Empty, "/tmp/1587408489630_0.5804644978554321-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 590065), "/tmp/1587408489630_0.5804644978554321-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 590060), "/tmp/1587408489630_0.5804644978554321-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 590055), "/tmp/1587408489630_0.5804644978554321-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 590049);
    static final SimpleSymbol Lit8;
    static final PairWithPosition Lit80 = PairWithPosition.make(Lit12, PairWithPosition.make(Lit12, PairWithPosition.make(Lit12, LList.Empty, "/tmp/1587408489630_0.5804644978554321-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 590202), "/tmp/1587408489630_0.5804644978554321-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 590197), "/tmp/1587408489630_0.5804644978554321-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 590191);
    static final SimpleSymbol Lit81 = ((SimpleSymbol) new SimpleSymbol("Web1").readResolve());
    static final SimpleSymbol Lit82 = ((SimpleSymbol) new SimpleSymbol("Url").readResolve());
    static final SimpleSymbol Lit83 = ((SimpleSymbol) new SimpleSymbol("Get").readResolve());
    static final SimpleSymbol Lit84 = ((SimpleSymbol) new SimpleSymbol("Button1$Click").readResolve());
    static final SimpleSymbol Lit85 = ((SimpleSymbol) new SimpleSymbol("Click").readResolve());
    static final FString Lit86 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit87 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement4").readResolve());
    static final FString Lit88 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit89 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit9 = ((SimpleSymbol) new SimpleSymbol("ActionBar").readResolve());
    static final SimpleSymbol Lit90 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement5").readResolve());
    static final IntNum Lit91 = IntNum.make(50);
    static final FString Lit92 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit93 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit94 = ((SimpleSymbol) new SimpleSymbol("Label1").readResolve());
    static final IntNum Lit95;
    static final FString Lit96 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit97 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit98 = ((SimpleSymbol) new SimpleSymbol("Button2").readResolve());
    static final IntNum Lit99 = IntNum.make(16777215);
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
    public Button Button2;
    public final ModuleMethod Button2$Click;
    public HorizontalArrangement HorizontalArrangement1;
    public HorizontalArrangement HorizontalArrangement2;
    public HorizontalArrangement HorizontalArrangement3;
    public HorizontalArrangement HorizontalArrangement4;
    public HorizontalArrangement HorizontalArrangement5;
    public HorizontalArrangement HorizontalArrangement6;
    public Image Image1;
    public Label Label1;
    public Notifier Notifier1;
    public final ModuleMethod Notifier1$AfterChoosing;
    public PasswordTextBox PasswordTextBox1;
    public TextBox TextBox1;
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

    /* compiled from: Connexion.yail */
    public class frame extends ModuleBody {
        Connexion $main = this;

        public int match1(ModuleMethod moduleMethod, Object obj, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 1:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f236pc = 1;
                    return 0;
                case 2:
                    if (!(obj instanceof Connexion)) {
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
                    if (!(obj instanceof Connexion)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.f236pc = 1;
                    return 0;
                case 52:
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
                    if (!(obj instanceof Connexion)) {
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
                    if (!(obj instanceof Connexion)) {
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
                case 53:
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
                case 52:
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
                    Connexion connexion = this.$main;
                    try {
                        Component component = (Component) obj;
                        try {
                            String str = (String) obj2;
                            try {
                                if (obj3 == Boolean.FALSE) {
                                    z = false;
                                }
                                try {
                                    connexion.dispatchGenericEvent(component, str, z, (Object[]) obj4);
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
                case 53:
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
                    return Connexion.lambda2();
                case 19:
                    this.$main.$define();
                    return Values.empty;
                case 20:
                    return Connexion.lambda3();
                case 21:
                    return Connexion.lambda4();
                case 22:
                    return Connexion.lambda5();
                case 23:
                    return Connexion.lambda6();
                case 24:
                    return Connexion.lambda7();
                case 25:
                    return Connexion.lambda8();
                case 26:
                    return Connexion.lambda9();
                case 27:
                    return Connexion.lambda10();
                case 28:
                    return Connexion.lambda11();
                case 29:
                    return Connexion.lambda12();
                case 30:
                    return Connexion.lambda13();
                case 31:
                    return Connexion.lambda14();
                case 32:
                    return Connexion.lambda15();
                case 33:
                    return Connexion.lambda16();
                case 34:
                    return Connexion.lambda17();
                case 35:
                    return Connexion.lambda18();
                case 36:
                    return Connexion.lambda19();
                case 37:
                    return Connexion.lambda20();
                case 38:
                    return Connexion.lambda21();
                case 39:
                    return Connexion.lambda22();
                case 40:
                    return this.$main.Button1$Click();
                case 41:
                    return Connexion.lambda23();
                case 42:
                    return Connexion.lambda24();
                case 43:
                    return Connexion.lambda25();
                case 44:
                    return Connexion.lambda26();
                case 45:
                    return Connexion.lambda27();
                case 46:
                    return Connexion.lambda28();
                case 47:
                    return Connexion.lambda29();
                case 48:
                    return Connexion.lambda30();
                case 49:
                    return this.$main.Button2$Click();
                case 50:
                    return Connexion.lambda31();
                case 51:
                    return Connexion.lambda32();
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
                default:
                    return super.match0(moduleMethod, callContext);
            }
        }
    }

    static {
        SimpleSymbol simpleSymbol = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT).readResolve();
        Lit12 = simpleSymbol;
        SimpleSymbol simpleSymbol2 = Lit12;
        SimpleSymbol simpleSymbol3 = Lit12;
        SimpleSymbol simpleSymbol4 = Lit12;
        SimpleSymbol simpleSymbol5 = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_BOOLEAN).readResolve();
        Lit10 = simpleSymbol5;
        Lit141 = PairWithPosition.make(simpleSymbol, PairWithPosition.make(simpleSymbol2, PairWithPosition.make(simpleSymbol3, PairWithPosition.make(simpleSymbol4, PairWithPosition.make(simpleSymbol5, LList.Empty, "/tmp/1587408489630_0.5804644978554321-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 890900), "/tmp/1587408489630_0.5804644978554321-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 890895), "/tmp/1587408489630_0.5804644978554321-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 890890), "/tmp/1587408489630_0.5804644978554321-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 890885), "/tmp/1587408489630_0.5804644978554321-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 890879);
        SimpleSymbol simpleSymbol6 = Lit160;
        SimpleSymbol simpleSymbol7 = (SimpleSymbol) new SimpleSymbol("number").readResolve();
        Lit8 = simpleSymbol7;
        Lit135 = PairWithPosition.make(simpleSymbol6, PairWithPosition.make(simpleSymbol7, LList.Empty, "/tmp/1587408489630_0.5804644978554321-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 890254), "/tmp/1587408489630_0.5804644978554321-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 890248);
        int[] iArr = new int[2];
        iArr[0] = -16739081;
        Lit100 = IntNum.make(iArr);
        int[] iArr2 = new int[2];
        iArr2[0] = -1;
        Lit95 = IntNum.make(iArr2);
        int[] iArr3 = new int[2];
        iArr3[0] = -2105637;
        Lit67 = IntNum.make(iArr3);
        int[] iArr4 = new int[2];
        iArr4[0] = -14671580;
        Lit66 = IntNum.make(iArr4);
        int[] iArr5 = new int[2];
        iArr5[0] = -2105637;
        Lit57 = IntNum.make(iArr5);
        int[] iArr6 = new int[2];
        iArr6[0] = -14671580;
        Lit48 = IntNum.make(iArr6);
        int[] iArr7 = new int[2];
        iArr7[0] = -16777216;
        Lit14 = IntNum.make(iArr7);
    }

    public Connexion() {
        ModuleInfo.register(this);
        frame frame2 = new frame();
        this.get$Mnsimple$Mnname = new ModuleMethod(frame2, 1, Lit146, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.onCreate = new ModuleMethod(frame2, 2, "onCreate", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.android$Mnlog$Mnform = new ModuleMethod(frame2, 3, Lit147, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(frame2, 4, Lit148, 8194);
        this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame2, 5, Lit149, 8193);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame2, 7, Lit150, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(frame2, 8, Lit151, 8194);
        this.add$Mnto$Mnevents = new ModuleMethod(frame2, 9, Lit152, 8194);
        this.add$Mnto$Mncomponents = new ModuleMethod(frame2, 10, Lit153, 16388);
        this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(frame2, 11, Lit154, 8194);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(frame2, 12, Lit155, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.send$Mnerror = new ModuleMethod(frame2, 13, Lit156, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.process$Mnexception = new ModuleMethod(frame2, 14, "process-exception", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.dispatchEvent = new ModuleMethod(frame2, 15, Lit157, 16388);
        this.dispatchGenericEvent = new ModuleMethod(frame2, 16, Lit158, 16388);
        this.lookup$Mnhandler = new ModuleMethod(frame2, 17, Lit159, 8194);
        ModuleMethod moduleMethod = new ModuleMethod(frame2, 18, null, 0);
        moduleMethod.setProperty("source-location", "/tmp/runtime8442570147866654509.scm:622");
        lambda$Fn1 = moduleMethod;
        this.$define = new ModuleMethod(frame2, 19, "$define", 0);
        lambda$Fn2 = new ModuleMethod(frame2, 20, null, 0);
        lambda$Fn3 = new ModuleMethod(frame2, 21, null, 0);
        lambda$Fn4 = new ModuleMethod(frame2, 22, null, 0);
        lambda$Fn5 = new ModuleMethod(frame2, 23, null, 0);
        lambda$Fn6 = new ModuleMethod(frame2, 24, null, 0);
        lambda$Fn7 = new ModuleMethod(frame2, 25, null, 0);
        lambda$Fn8 = new ModuleMethod(frame2, 26, null, 0);
        lambda$Fn9 = new ModuleMethod(frame2, 27, null, 0);
        lambda$Fn10 = new ModuleMethod(frame2, 28, null, 0);
        lambda$Fn11 = new ModuleMethod(frame2, 29, null, 0);
        lambda$Fn12 = new ModuleMethod(frame2, 30, null, 0);
        lambda$Fn13 = new ModuleMethod(frame2, 31, null, 0);
        lambda$Fn14 = new ModuleMethod(frame2, 32, null, 0);
        lambda$Fn15 = new ModuleMethod(frame2, 33, null, 0);
        lambda$Fn16 = new ModuleMethod(frame2, 34, null, 0);
        lambda$Fn17 = new ModuleMethod(frame2, 35, null, 0);
        lambda$Fn18 = new ModuleMethod(frame2, 36, null, 0);
        lambda$Fn19 = new ModuleMethod(frame2, 37, null, 0);
        lambda$Fn20 = new ModuleMethod(frame2, 38, null, 0);
        lambda$Fn21 = new ModuleMethod(frame2, 39, null, 0);
        this.Button1$Click = new ModuleMethod(frame2, 40, Lit84, 0);
        lambda$Fn22 = new ModuleMethod(frame2, 41, null, 0);
        lambda$Fn23 = new ModuleMethod(frame2, 42, null, 0);
        lambda$Fn24 = new ModuleMethod(frame2, 43, null, 0);
        lambda$Fn25 = new ModuleMethod(frame2, 44, null, 0);
        lambda$Fn26 = new ModuleMethod(frame2, 45, null, 0);
        lambda$Fn27 = new ModuleMethod(frame2, 46, null, 0);
        lambda$Fn28 = new ModuleMethod(frame2, 47, null, 0);
        lambda$Fn29 = new ModuleMethod(frame2, 48, null, 0);
        this.Button2$Click = new ModuleMethod(frame2, 49, Lit103, 0);
        lambda$Fn30 = new ModuleMethod(frame2, 50, null, 0);
        lambda$Fn31 = new ModuleMethod(frame2, 51, null, 0);
        this.Notifier1$AfterChoosing = new ModuleMethod(frame2, 52, Lit113, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.Web1$GotText = new ModuleMethod(frame2, 53, Lit142, 16388);
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
        Connexion = null;
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
            Values.writeValues(C0608runtime.addGlobalVarToCurrentFormEnvironment(Lit4, ""), $result);
        } else {
            addToGlobalVars(Lit4, lambda$Fn3);
        }
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0608runtime.addGlobalVarToCurrentFormEnvironment(Lit5, C0608runtime.callYailPrimitive(C0608runtime.make$Mnyail$Mnlist, LList.Empty, LList.Empty, "make a list")), $result);
        } else {
            addToGlobalVars(Lit5, lambda$Fn4);
        }
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit6, Lit7, Lit8);
            C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit9, Boolean.TRUE, Lit10);
            C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit11, "MySadWorld", Lit12);
            C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit13, Lit14, Lit8);
            C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit15, "slidehorizontal", Lit12);
            C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit16, "fade", Lit12);
            C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit17, Lit18, Lit8);
            C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit19, Lit20, Lit8);
            C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit21, "portrait", Lit12);
            C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit22, Boolean.TRUE, Lit10);
            C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit23, "Fixed", Lit12);
            C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit24, "AppTheme", Lit12);
            C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit25, "Connexion", Lit12);
            Values.writeValues(C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit26, Boolean.FALSE, Lit10), $result);
        } else {
            addToFormDoAfterCreation(new Promise(lambda$Fn5));
        }
        this.HorizontalArrangement1 = null;
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0608runtime.addComponentWithinRepl(Lit0, Lit27, Lit28, lambda$Fn6), $result);
        } else {
            addToComponents(Lit0, Lit32, Lit28, lambda$Fn7);
        }
        this.VerticalArrangement1 = null;
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0608runtime.addComponentWithinRepl(Lit28, Lit33, Lit34, lambda$Fn8), $result);
        } else {
            addToComponents(Lit28, Lit39, Lit34, lambda$Fn9);
        }
        this.Image1 = null;
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0608runtime.addComponentWithinRepl(Lit34, Lit40, Lit41, lambda$Fn10), $result);
        } else {
            addToComponents(Lit34, Lit45, Lit41, lambda$Fn11);
        }
        this.TextBox1 = null;
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0608runtime.addComponentWithinRepl(Lit34, Lit46, Lit47, lambda$Fn12), $result);
        } else {
            addToComponents(Lit34, Lit59, Lit47, lambda$Fn13);
        }
        this.HorizontalArrangement2 = null;
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0608runtime.addComponentWithinRepl(Lit34, Lit60, Lit61, lambda$Fn14), $result);
        } else {
            addToComponents(Lit34, Lit63, Lit61, lambda$Fn15);
        }
        this.PasswordTextBox1 = null;
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0608runtime.addComponentWithinRepl(Lit34, Lit64, Lit65, lambda$Fn16), $result);
        } else {
            addToComponents(Lit34, Lit68, Lit65, lambda$Fn17);
        }
        this.HorizontalArrangement3 = null;
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0608runtime.addComponentWithinRepl(Lit34, Lit69, Lit70, lambda$Fn18), $result);
        } else {
            addToComponents(Lit34, Lit72, Lit70, lambda$Fn19);
        }
        this.Button1 = null;
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0608runtime.addComponentWithinRepl(Lit34, Lit73, Lit74, lambda$Fn20), $result);
        } else {
            addToComponents(Lit34, Lit78, Lit74, lambda$Fn21);
        }
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            C0608runtime.addToCurrentFormEnvironment(Lit84, this.Button1$Click);
        } else {
            addToFormEnvironment(Lit84, this.Button1$Click);
        }
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0608runtime.$Stthis$Mnform$St, "Button1", "Click");
        } else {
            addToEvents(Lit74, Lit85);
        }
        this.HorizontalArrangement4 = null;
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0608runtime.addComponentWithinRepl(Lit34, Lit86, Lit87, lambda$Fn22), $result);
        } else {
            addToComponents(Lit34, Lit88, Lit87, lambda$Fn23);
        }
        this.HorizontalArrangement5 = null;
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0608runtime.addComponentWithinRepl(Lit0, Lit89, Lit90, lambda$Fn24), $result);
        } else {
            addToComponents(Lit0, Lit92, Lit90, lambda$Fn25);
        }
        this.Label1 = null;
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0608runtime.addComponentWithinRepl(Lit90, Lit93, Lit94, lambda$Fn26), $result);
        } else {
            addToComponents(Lit90, Lit96, Lit94, lambda$Fn27);
        }
        this.Button2 = null;
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0608runtime.addComponentWithinRepl(Lit90, Lit97, Lit98, lambda$Fn28), $result);
        } else {
            addToComponents(Lit90, Lit101, Lit98, lambda$Fn29);
        }
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            C0608runtime.addToCurrentFormEnvironment(Lit103, this.Button2$Click);
        } else {
            addToFormEnvironment(Lit103, this.Button2$Click);
        }
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0608runtime.$Stthis$Mnform$St, "Button2", "Click");
        } else {
            addToEvents(Lit98, Lit85);
        }
        this.HorizontalArrangement6 = null;
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0608runtime.addComponentWithinRepl(Lit0, Lit104, Lit105, lambda$Fn30), $result);
        } else {
            addToComponents(Lit0, Lit106, Lit105, lambda$Fn31);
        }
        this.Notifier1 = null;
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0608runtime.addComponentWithinRepl(Lit0, Lit107, Lit108, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit109, Lit108, Boolean.FALSE);
        }
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            C0608runtime.addToCurrentFormEnvironment(Lit113, this.Notifier1$AfterChoosing);
        } else {
            addToFormEnvironment(Lit113, this.Notifier1$AfterChoosing);
        }
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0608runtime.$Stthis$Mnform$St, "Notifier1", "AfterChoosing");
        } else {
            addToEvents(Lit108, Lit114);
        }
        this.Web1 = null;
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0608runtime.addComponentWithinRepl(Lit0, Lit115, Lit81, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit116, Lit81, Boolean.FALSE);
        }
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            C0608runtime.addToCurrentFormEnvironment(Lit142, this.Web1$GotText);
        } else {
            addToFormEnvironment(Lit142, this.Web1$GotText);
        }
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C0608runtime.$Stthis$Mnform$St, "Web1", "GotText");
        } else {
            addToEvents(Lit81, Lit143);
        }
        this.TinyDB1 = null;
        if (C0608runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C0608runtime.addComponentWithinRepl(Lit0, Lit144, Lit128, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit145, Lit128, Boolean.FALSE);
        }
        C0608runtime.initRuntime();
    }

    static String lambda3() {
        return "";
    }

    static String lambda4() {
        return "";
    }

    static Object lambda5() {
        return C0608runtime.callYailPrimitive(C0608runtime.make$Mnyail$Mnlist, LList.Empty, LList.Empty, "make a list");
    }

    static Object lambda6() {
        C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit6, Lit7, Lit8);
        C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit9, Boolean.TRUE, Lit10);
        C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit11, "MySadWorld", Lit12);
        C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit13, Lit14, Lit8);
        C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit15, "slidehorizontal", Lit12);
        C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit16, "fade", Lit12);
        C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit17, Lit18, Lit8);
        C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit19, Lit20, Lit8);
        C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit21, "portrait", Lit12);
        C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit22, Boolean.TRUE, Lit10);
        C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit23, "Fixed", Lit12);
        C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit24, "AppTheme", Lit12);
        C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit25, "Connexion", Lit12);
        return C0608runtime.setAndCoerceProperty$Ex(Lit0, Lit26, Boolean.FALSE, Lit10);
    }

    static Object lambda7() {
        C0608runtime.setAndCoerceProperty$Ex(Lit28, Lit29, Lit30, Lit8);
        return C0608runtime.setAndCoerceProperty$Ex(Lit28, Lit31, Lit30, Lit8);
    }

    static Object lambda8() {
        C0608runtime.setAndCoerceProperty$Ex(Lit28, Lit29, Lit30, Lit8);
        return C0608runtime.setAndCoerceProperty$Ex(Lit28, Lit31, Lit30, Lit8);
    }

    static Object lambda10() {
        C0608runtime.setAndCoerceProperty$Ex(Lit34, Lit35, Lit36, Lit8);
        C0608runtime.setAndCoerceProperty$Ex(Lit34, Lit37, Lit38, Lit8);
        C0608runtime.setAndCoerceProperty$Ex(Lit34, Lit29, Lit30, Lit8);
        return C0608runtime.setAndCoerceProperty$Ex(Lit34, Lit31, Lit30, Lit8);
    }

    static Object lambda9() {
        C0608runtime.setAndCoerceProperty$Ex(Lit34, Lit35, Lit36, Lit8);
        C0608runtime.setAndCoerceProperty$Ex(Lit34, Lit37, Lit38, Lit8);
        C0608runtime.setAndCoerceProperty$Ex(Lit34, Lit29, Lit30, Lit8);
        return C0608runtime.setAndCoerceProperty$Ex(Lit34, Lit31, Lit30, Lit8);
    }

    static Object lambda11() {
        C0608runtime.setAndCoerceProperty$Ex(Lit41, Lit29, Lit42, Lit8);
        C0608runtime.setAndCoerceProperty$Ex(Lit41, Lit43, "MSW_w.png", Lit12);
        C0608runtime.setAndCoerceProperty$Ex(Lit41, Lit44, Boolean.TRUE, Lit10);
        return C0608runtime.setAndCoerceProperty$Ex(Lit41, Lit31, Lit42, Lit8);
    }

    static Object lambda12() {
        C0608runtime.setAndCoerceProperty$Ex(Lit41, Lit29, Lit42, Lit8);
        C0608runtime.setAndCoerceProperty$Ex(Lit41, Lit43, "MSW_w.png", Lit12);
        C0608runtime.setAndCoerceProperty$Ex(Lit41, Lit44, Boolean.TRUE, Lit10);
        return C0608runtime.setAndCoerceProperty$Ex(Lit41, Lit31, Lit42, Lit8);
    }

    static Object lambda13() {
        C0608runtime.setAndCoerceProperty$Ex(Lit47, Lit13, Lit48, Lit8);
        C0608runtime.setAndCoerceProperty$Ex(Lit47, Lit49, Lit50, Lit8);
        C0608runtime.setAndCoerceProperty$Ex(Lit47, Lit51, Lit52, Lit8);
        C0608runtime.setAndCoerceProperty$Ex(Lit47, Lit29, Lit53, Lit8);
        C0608runtime.setAndCoerceProperty$Ex(Lit47, Lit54, "Nom d'utilisateur", Lit12);
        C0608runtime.setAndCoerceProperty$Ex(Lit47, Lit55, Lit52, Lit8);
        C0608runtime.setAndCoerceProperty$Ex(Lit47, Lit56, Lit57, Lit8);
        return C0608runtime.setAndCoerceProperty$Ex(Lit47, Lit31, Lit58, Lit8);
    }

    static Object lambda14() {
        C0608runtime.setAndCoerceProperty$Ex(Lit47, Lit13, Lit48, Lit8);
        C0608runtime.setAndCoerceProperty$Ex(Lit47, Lit49, Lit50, Lit8);
        C0608runtime.setAndCoerceProperty$Ex(Lit47, Lit51, Lit52, Lit8);
        C0608runtime.setAndCoerceProperty$Ex(Lit47, Lit29, Lit53, Lit8);
        C0608runtime.setAndCoerceProperty$Ex(Lit47, Lit54, "Nom d'utilisateur", Lit12);
        C0608runtime.setAndCoerceProperty$Ex(Lit47, Lit55, Lit52, Lit8);
        C0608runtime.setAndCoerceProperty$Ex(Lit47, Lit56, Lit57, Lit8);
        return C0608runtime.setAndCoerceProperty$Ex(Lit47, Lit31, Lit58, Lit8);
    }

    static Object lambda15() {
        C0608runtime.setAndCoerceProperty$Ex(Lit61, Lit29, Lit62, Lit8);
        return C0608runtime.setAndCoerceProperty$Ex(Lit61, Lit31, Lit30, Lit8);
    }

    static Object lambda16() {
        C0608runtime.setAndCoerceProperty$Ex(Lit61, Lit29, Lit62, Lit8);
        return C0608runtime.setAndCoerceProperty$Ex(Lit61, Lit31, Lit30, Lit8);
    }

    static Object lambda17() {
        C0608runtime.setAndCoerceProperty$Ex(Lit65, Lit13, Lit66, Lit8);
        C0608runtime.setAndCoerceProperty$Ex(Lit65, Lit49, Lit50, Lit8);
        C0608runtime.setAndCoerceProperty$Ex(Lit65, Lit51, Lit52, Lit8);
        C0608runtime.setAndCoerceProperty$Ex(Lit65, Lit29, Lit53, Lit8);
        C0608runtime.setAndCoerceProperty$Ex(Lit65, Lit54, "Mot de passe", Lit12);
        C0608runtime.setAndCoerceProperty$Ex(Lit65, Lit55, Lit52, Lit8);
        C0608runtime.setAndCoerceProperty$Ex(Lit65, Lit56, Lit67, Lit8);
        return C0608runtime.setAndCoerceProperty$Ex(Lit65, Lit31, Lit58, Lit8);
    }

    static Object lambda18() {
        C0608runtime.setAndCoerceProperty$Ex(Lit65, Lit13, Lit66, Lit8);
        C0608runtime.setAndCoerceProperty$Ex(Lit65, Lit49, Lit50, Lit8);
        C0608runtime.setAndCoerceProperty$Ex(Lit65, Lit51, Lit52, Lit8);
        C0608runtime.setAndCoerceProperty$Ex(Lit65, Lit29, Lit53, Lit8);
        C0608runtime.setAndCoerceProperty$Ex(Lit65, Lit54, "Mot de passe", Lit12);
        C0608runtime.setAndCoerceProperty$Ex(Lit65, Lit55, Lit52, Lit8);
        C0608runtime.setAndCoerceProperty$Ex(Lit65, Lit56, Lit67, Lit8);
        return C0608runtime.setAndCoerceProperty$Ex(Lit65, Lit31, Lit58, Lit8);
    }

    static Object lambda19() {
        C0608runtime.setAndCoerceProperty$Ex(Lit70, Lit29, Lit71, Lit8);
        return C0608runtime.setAndCoerceProperty$Ex(Lit70, Lit31, Lit30, Lit8);
    }

    static Object lambda20() {
        C0608runtime.setAndCoerceProperty$Ex(Lit70, Lit29, Lit71, Lit8);
        return C0608runtime.setAndCoerceProperty$Ex(Lit70, Lit31, Lit30, Lit8);
    }

    static Object lambda21() {
        C0608runtime.setAndCoerceProperty$Ex(Lit74, Lit75, Boolean.TRUE, Lit10);
        C0608runtime.setAndCoerceProperty$Ex(Lit74, Lit49, Lit50, Lit8);
        C0608runtime.setAndCoerceProperty$Ex(Lit74, Lit51, Lit52, Lit8);
        C0608runtime.setAndCoerceProperty$Ex(Lit74, Lit29, Lit53, Lit8);
        C0608runtime.setAndCoerceProperty$Ex(Lit74, Lit76, "therare.png", Lit12);
        C0608runtime.setAndCoerceProperty$Ex(Lit74, Lit77, "Connexion", Lit12);
        return C0608runtime.setAndCoerceProperty$Ex(Lit74, Lit31, Lit58, Lit8);
    }

    static Object lambda22() {
        C0608runtime.setAndCoerceProperty$Ex(Lit74, Lit75, Boolean.TRUE, Lit10);
        C0608runtime.setAndCoerceProperty$Ex(Lit74, Lit49, Lit50, Lit8);
        C0608runtime.setAndCoerceProperty$Ex(Lit74, Lit51, Lit52, Lit8);
        C0608runtime.setAndCoerceProperty$Ex(Lit74, Lit29, Lit53, Lit8);
        C0608runtime.setAndCoerceProperty$Ex(Lit74, Lit76, "therare.png", Lit12);
        C0608runtime.setAndCoerceProperty$Ex(Lit74, Lit77, "Connexion", Lit12);
        return C0608runtime.setAndCoerceProperty$Ex(Lit74, Lit31, Lit58, Lit8);
    }

    public Object Button1$Click() {
        C0608runtime.setThisForm();
        C0608runtime.addGlobalVarToCurrentFormEnvironment(Lit3, C0608runtime.callYailPrimitive(strings.string$Mnappend, LList.list4("http://msw.kellis.fr/android/actions/login.php?username=", C0608runtime.get$Mnproperty.apply2(Lit47, Lit77), "&password=", C0608runtime.get$Mnproperty.apply2(Lit65, Lit77)), Lit79, "join"));
        C0608runtime.addGlobalVarToCurrentFormEnvironment(Lit4, C0608runtime.callYailPrimitive(C0608runtime.string$Mnreplace$Mnall, LList.list3(C0608runtime.lookupGlobalVarInCurrentFormEnvironment(Lit3, C0608runtime.$Stthe$Mnnull$Mnvalue$St), " ", "%20"), Lit80, "replace all"));
        C0608runtime.setAndCoerceProperty$Ex(Lit81, Lit82, C0608runtime.lookupGlobalVarInCurrentFormEnvironment(Lit4, C0608runtime.$Stthe$Mnnull$Mnvalue$St), Lit12);
        return C0608runtime.callComponentMethod(Lit81, Lit83, LList.Empty, LList.Empty);
    }

    static Object lambda23() {
        C0608runtime.setAndCoerceProperty$Ex(Lit87, Lit29, Lit62, Lit8);
        return C0608runtime.setAndCoerceProperty$Ex(Lit87, Lit31, Lit30, Lit8);
    }

    static Object lambda24() {
        C0608runtime.setAndCoerceProperty$Ex(Lit87, Lit29, Lit62, Lit8);
        return C0608runtime.setAndCoerceProperty$Ex(Lit87, Lit31, Lit30, Lit8);
    }

    static Object lambda25() {
        C0608runtime.setAndCoerceProperty$Ex(Lit90, Lit35, Lit36, Lit8);
        C0608runtime.setAndCoerceProperty$Ex(Lit90, Lit37, Lit38, Lit8);
        C0608runtime.setAndCoerceProperty$Ex(Lit90, Lit29, Lit91, Lit8);
        return C0608runtime.setAndCoerceProperty$Ex(Lit90, Lit31, Lit30, Lit8);
    }

    static Object lambda26() {
        C0608runtime.setAndCoerceProperty$Ex(Lit90, Lit35, Lit36, Lit8);
        C0608runtime.setAndCoerceProperty$Ex(Lit90, Lit37, Lit38, Lit8);
        C0608runtime.setAndCoerceProperty$Ex(Lit90, Lit29, Lit91, Lit8);
        return C0608runtime.setAndCoerceProperty$Ex(Lit90, Lit31, Lit30, Lit8);
    }

    static Object lambda27() {
        C0608runtime.setAndCoerceProperty$Ex(Lit94, Lit51, Lit52, Lit8);
        C0608runtime.setAndCoerceProperty$Ex(Lit94, Lit77, "Vous n'avez pas de compte ?", Lit12);
        return C0608runtime.setAndCoerceProperty$Ex(Lit94, Lit56, Lit95, Lit8);
    }

    static Object lambda28() {
        C0608runtime.setAndCoerceProperty$Ex(Lit94, Lit51, Lit52, Lit8);
        C0608runtime.setAndCoerceProperty$Ex(Lit94, Lit77, "Vous n'avez pas de compte ?", Lit12);
        return C0608runtime.setAndCoerceProperty$Ex(Lit94, Lit56, Lit95, Lit8);
    }

    static Object lambda29() {
        C0608runtime.setAndCoerceProperty$Ex(Lit98, Lit13, Lit99, Lit8);
        C0608runtime.setAndCoerceProperty$Ex(Lit98, Lit75, Boolean.TRUE, Lit10);
        C0608runtime.setAndCoerceProperty$Ex(Lit98, Lit51, Lit52, Lit8);
        C0608runtime.setAndCoerceProperty$Ex(Lit98, Lit77, "Inscrivez-vous", Lit12);
        return C0608runtime.setAndCoerceProperty$Ex(Lit98, Lit56, Lit100, Lit8);
    }

    static Object lambda30() {
        C0608runtime.setAndCoerceProperty$Ex(Lit98, Lit13, Lit99, Lit8);
        C0608runtime.setAndCoerceProperty$Ex(Lit98, Lit75, Boolean.TRUE, Lit10);
        C0608runtime.setAndCoerceProperty$Ex(Lit98, Lit51, Lit52, Lit8);
        C0608runtime.setAndCoerceProperty$Ex(Lit98, Lit77, "Inscrivez-vous", Lit12);
        return C0608runtime.setAndCoerceProperty$Ex(Lit98, Lit56, Lit100, Lit8);
    }

    public Object Button2$Click() {
        C0608runtime.setThisForm();
        return C0608runtime.callYailPrimitive(C0608runtime.open$Mnanother$Mnscreen, LList.list1("Inscription"), Lit102, "open another screen");
    }

    static Object lambda31() {
        C0608runtime.setAndCoerceProperty$Ex(Lit105, Lit29, Lit71, Lit8);
        return C0608runtime.setAndCoerceProperty$Ex(Lit105, Lit31, Lit30, Lit8);
    }

    static Object lambda32() {
        C0608runtime.setAndCoerceProperty$Ex(Lit105, Lit29, Lit71, Lit8);
        return C0608runtime.setAndCoerceProperty$Ex(Lit105, Lit31, Lit30, Lit8);
    }

    public Object Notifier1$AfterChoosing(Object $choice) {
        Object $choice2 = C0608runtime.sanitizeComponentData($choice);
        C0608runtime.setThisForm();
        ModuleMethod moduleMethod = C0608runtime.yail$Mnequal$Qu;
        if ($choice2 instanceof Package) {
            $choice2 = C0608runtime.signalRuntimeError(strings.stringAppend("The variable ", C0608runtime.getDisplayRepresentation(Lit110), " is not bound in the current context"), "Unbound Variable");
        }
        return C0608runtime.callYailPrimitive(moduleMethod, LList.list2($choice2, "Quitter"), Lit111, "=") != Boolean.FALSE ? C0608runtime.callYailPrimitive(C0608runtime.close$Mnapplication, LList.Empty, LList.Empty, "close application") : C0608runtime.callYailPrimitive(C0608runtime.open$Mnanother$Mnscreen, LList.list1("Accueil"), Lit112, "open another screen");
    }

    public Object Web1$GotText(Object $url, Object $responseCode, Object $responseType, Object $responseContent) {
        Object obj;
        C0608runtime.sanitizeComponentData($url);
        Object $responseCode2 = C0608runtime.sanitizeComponentData($responseCode);
        C0608runtime.sanitizeComponentData($responseType);
        Object $responseContent2 = C0608runtime.sanitizeComponentData($responseContent);
        C0608runtime.setThisForm();
        ModuleMethod moduleMethod = C0608runtime.yail$Mnequal$Qu;
        if ($responseCode2 instanceof Package) {
            $responseCode2 = C0608runtime.signalRuntimeError(strings.stringAppend("The variable ", C0608runtime.getDisplayRepresentation(Lit117), " is not bound in the current context"), "Unbound Variable");
        }
        if (C0608runtime.callYailPrimitive(moduleMethod, LList.list2($responseCode2, "200"), Lit118, "=") != Boolean.FALSE) {
            SimpleSymbol simpleSymbol = Lit5;
            ModuleMethod moduleMethod2 = C0608runtime.string$Mnsplit;
            if ($responseContent2 instanceof Package) {
                obj = C0608runtime.signalRuntimeError(strings.stringAppend("The variable ", C0608runtime.getDisplayRepresentation(Lit119), " is not bound in the current context"), "Unbound Variable");
            } else {
                obj = $responseContent2;
            }
            C0608runtime.addGlobalVarToCurrentFormEnvironment(simpleSymbol, C0608runtime.callYailPrimitive(moduleMethod2, LList.list2(obj, "/"), Lit120, "split"));
            if (C0608runtime.callYailPrimitive(C0608runtime.yail$Mnequal$Qu, LList.list2(C0608runtime.callYailPrimitive(C0608runtime.yail$Mnlist$Mnget$Mnitem, LList.list2(C0608runtime.lookupGlobalVarInCurrentFormEnvironment(Lit5, C0608runtime.$Stthe$Mnnull$Mnvalue$St), Lit52), Lit121, "select list item"), "yes"), Lit122, "=") == Boolean.FALSE) {
                SimpleSymbol simpleSymbol2 = Lit108;
                SimpleSymbol simpleSymbol3 = Lit139;
                if ($responseContent2 instanceof Package) {
                    $responseContent2 = C0608runtime.signalRuntimeError(strings.stringAppend("The variable ", C0608runtime.getDisplayRepresentation(Lit119), " is not bound in the current context"), "Unbound Variable");
                }
                return C0608runtime.callComponentMethod(simpleSymbol2, simpleSymbol3, LList.list1($responseContent2), Lit140);
            } else if (C0608runtime.callYailPrimitive(C0608runtime.yail$Mnequal$Qu, LList.list2(C0608runtime.callYailPrimitive(C0608runtime.yail$Mnlist$Mnget$Mnitem, LList.list2(C0608runtime.lookupGlobalVarInCurrentFormEnvironment(Lit5, C0608runtime.$Stthe$Mnnull$Mnvalue$St), Lit36), Lit123, "select list item"), "1"), Lit124, "=") == Boolean.FALSE) {
                return C0608runtime.callYailPrimitive(C0608runtime.open$Mnanother$Mnscreen, LList.list1("Etape1"), Lit138, "open another screen");
            } else {
                if (C0608runtime.callYailPrimitive(C0608runtime.yail$Mnequal$Qu, LList.list2(C0608runtime.callYailPrimitive(C0608runtime.yail$Mnlist$Mnget$Mnitem, LList.list2(C0608runtime.lookupGlobalVarInCurrentFormEnvironment(Lit5, C0608runtime.$Stthe$Mnnull$Mnvalue$St), Lit125), Lit126, "select list item"), "1"), Lit127, "=") != Boolean.FALSE) {
                    C0608runtime.callComponentMethod(Lit128, Lit129, LList.list2("user_id", C0608runtime.callYailPrimitive(C0608runtime.yail$Mnlist$Mnget$Mnitem, LList.list2(C0608runtime.lookupGlobalVarInCurrentFormEnvironment(Lit5, C0608runtime.$Stthe$Mnnull$Mnvalue$St), Lit38), Lit130, "select list item")), Lit131);
                    return C0608runtime.callYailPrimitive(C0608runtime.open$Mnanother$Mnscreen, LList.list1("Accueil"), Lit132, "open another screen");
                }
                SimpleSymbol simpleSymbol4 = Lit108;
                SimpleSymbol simpleSymbol5 = Lit133;
                Pair list1 = LList.list1(C0608runtime.callYailPrimitive(C0608runtime.string$Mnreplace$Mnall, LList.list3(C0608runtime.callYailPrimitive(C0608runtime.yail$Mnlist$Mnget$Mnitem, LList.list2(C0608runtime.lookupGlobalVarInCurrentFormEnvironment(Lit5, C0608runtime.$Stthe$Mnnull$Mnvalue$St), Lit134), Lit135, "select list item"), "-", "/"), Lit136, "replace all"));
                LList.chain4(list1, "Attention !", "Accéder à l'application", "", Boolean.FALSE);
                return C0608runtime.callComponentMethod(simpleSymbol4, simpleSymbol5, list1, Lit137);
            }
        } else {
            SimpleSymbol simpleSymbol6 = Lit108;
            SimpleSymbol simpleSymbol7 = Lit133;
            Pair list12 = LList.list1("Une grave erreur s'est produite lors du traitement de vos données. Réessayez dans quelques instants.");
            LList.chain4(list12, "Erreur", "Quitter", "", Boolean.FALSE);
            return C0608runtime.callComponentMethod(simpleSymbol6, simpleSymbol7, list12, Lit141);
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
        Connexion = this;
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
