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

/* compiled from: Inscription.yail */
public class Inscription extends Form implements Runnable {
    public static Inscription Inscription;
    static final SimpleSymbol Lit0 = ((SimpleSymbol) new SimpleSymbol("Inscription").readResolve());
    static final SimpleSymbol Lit1 = ((SimpleSymbol) new SimpleSymbol("getMessage").readResolve());
    static final SimpleSymbol Lit10;
    static final SimpleSymbol Lit100 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement8").readResolve());
    static final FString Lit101 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit102 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit103 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement5").readResolve());
    static final IntNum Lit104 = IntNum.make(50);
    static final FString Lit105 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit106 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit107 = ((SimpleSymbol) new SimpleSymbol("Label1").readResolve());
    static final IntNum Lit108 = IntNum.make(14);
    static final SimpleSymbol Lit109 = ((SimpleSymbol) new SimpleSymbol("TextColor").readResolve());
    static final SimpleSymbol Lit11 = ((SimpleSymbol) new SimpleSymbol("AppName").readResolve());
    static final IntNum Lit110;
    static final FString Lit111 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit112 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit113 = ((SimpleSymbol) new SimpleSymbol("Button1").readResolve());
    static final IntNum Lit114 = IntNum.make(16777215);
    static final IntNum Lit115;
    static final FString Lit116 = new FString("com.google.appinventor.components.runtime.Button");
    static final PairWithPosition Lit117 = PairWithPosition.make(Lit12, LList.Empty, "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Inscription.yail", 1040464);
    static final SimpleSymbol Lit118 = ((SimpleSymbol) new SimpleSymbol("Button1$Click").readResolve());
    static final FString Lit119 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit12;
    static final SimpleSymbol Lit120 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement7").readResolve());
    static final FString Lit121 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit122 = new FString("com.google.appinventor.components.runtime.Notifier");
    static final SimpleSymbol Lit123 = ((SimpleSymbol) new SimpleSymbol("Notifier1").readResolve());
    static final FString Lit124 = new FString("com.google.appinventor.components.runtime.Notifier");
    static final SimpleSymbol Lit125 = ((SimpleSymbol) new SimpleSymbol("$choice").readResolve());
    static final PairWithPosition Lit126 = PairWithPosition.make(Lit166, PairWithPosition.make(Lit166, LList.Empty, "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Inscription.yail", 1106023), "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Inscription.yail", 1106018);
    static final PairWithPosition Lit127 = PairWithPosition.make(Lit12, LList.Empty, "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Inscription.yail", 1106211);
    static final SimpleSymbol Lit128 = ((SimpleSymbol) new SimpleSymbol("Notifier1$AfterChoosing").readResolve());
    static final SimpleSymbol Lit129 = ((SimpleSymbol) new SimpleSymbol("AfterChoosing").readResolve());
    static final SimpleSymbol Lit13 = ((SimpleSymbol) new SimpleSymbol("BackgroundColor").readResolve());
    static final FString Lit130 = new FString("com.google.appinventor.components.runtime.TinyDB");
    static final SimpleSymbol Lit131 = ((SimpleSymbol) new SimpleSymbol(TinyDB.DEFAULT_NAMESPACE).readResolve());
    static final FString Lit132 = new FString("com.google.appinventor.components.runtime.TinyDB");
    static final FString Lit133 = new FString("com.google.appinventor.components.runtime.Web");
    static final FString Lit134 = new FString("com.google.appinventor.components.runtime.Web");
    static final SimpleSymbol Lit135 = ((SimpleSymbol) new SimpleSymbol("$responseCode").readResolve());
    static final PairWithPosition Lit136 = PairWithPosition.make(Lit166, PairWithPosition.make(Lit166, LList.Empty, "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Inscription.yail", 1155177), "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Inscription.yail", 1155172);
    static final SimpleSymbol Lit137 = ((SimpleSymbol) new SimpleSymbol("$responseContent").readResolve());
    static final PairWithPosition Lit138 = PairWithPosition.make(Lit12, PairWithPosition.make(Lit12, LList.Empty, "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Inscription.yail", 1155316), "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Inscription.yail", 1155310);
    static final PairWithPosition Lit139 = PairWithPosition.make(Lit167, PairWithPosition.make(Lit8, LList.Empty, "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Inscription.yail", 1155479), "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Inscription.yail", 1155473);
    static final IntNum Lit14;
    static final PairWithPosition Lit140 = PairWithPosition.make(Lit166, PairWithPosition.make(Lit166, LList.Empty, "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Inscription.yail", 1155520), "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Inscription.yail", 1155515);
    static final SimpleSymbol Lit141 = ((SimpleSymbol) new SimpleSymbol("StoreValue").readResolve());
    static final PairWithPosition Lit142;
    static final PairWithPosition Lit143 = PairWithPosition.make(Lit12, PairWithPosition.make(Lit166, LList.Empty, "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Inscription.yail", 1155741), "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Inscription.yail", 1155735);
    static final PairWithPosition Lit144 = PairWithPosition.make(Lit12, PairWithPosition.make(Lit166, LList.Empty, "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Inscription.yail", 1155831), "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Inscription.yail", 1155825);
    static final PairWithPosition Lit145 = PairWithPosition.make(Lit12, LList.Empty, "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Inscription.yail", 1155908);
    static final SimpleSymbol Lit146 = ((SimpleSymbol) new SimpleSymbol("ShowAlert").readResolve());
    static final PairWithPosition Lit147 = PairWithPosition.make(Lit12, LList.Empty, "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Inscription.yail", 1156048);
    static final SimpleSymbol Lit148 = ((SimpleSymbol) new SimpleSymbol("ShowChooseDialog").readResolve());
    static final PairWithPosition Lit149;
    static final SimpleSymbol Lit15 = ((SimpleSymbol) new SimpleSymbol("CloseScreenAnimation").readResolve());
    static final SimpleSymbol Lit150 = ((SimpleSymbol) new SimpleSymbol("Web1$GotText").readResolve());
    static final SimpleSymbol Lit151 = ((SimpleSymbol) new SimpleSymbol("GotText").readResolve());
    static final SimpleSymbol Lit152 = ((SimpleSymbol) new SimpleSymbol("get-simple-name").readResolve());
    static final SimpleSymbol Lit153 = ((SimpleSymbol) new SimpleSymbol("android-log-form").readResolve());
    static final SimpleSymbol Lit154 = ((SimpleSymbol) new SimpleSymbol("add-to-form-environment").readResolve());
    static final SimpleSymbol Lit155 = ((SimpleSymbol) new SimpleSymbol("lookup-in-form-environment").readResolve());
    static final SimpleSymbol Lit156 = ((SimpleSymbol) new SimpleSymbol("is-bound-in-form-environment").readResolve());
    static final SimpleSymbol Lit157 = ((SimpleSymbol) new SimpleSymbol("add-to-global-var-environment").readResolve());
    static final SimpleSymbol Lit158 = ((SimpleSymbol) new SimpleSymbol("add-to-events").readResolve());
    static final SimpleSymbol Lit159 = ((SimpleSymbol) new SimpleSymbol("add-to-components").readResolve());
    static final SimpleSymbol Lit16 = ((SimpleSymbol) new SimpleSymbol("OpenScreenAnimation").readResolve());
    static final SimpleSymbol Lit160 = ((SimpleSymbol) new SimpleSymbol("add-to-global-vars").readResolve());
    static final SimpleSymbol Lit161 = ((SimpleSymbol) new SimpleSymbol("add-to-form-do-after-creation").readResolve());
    static final SimpleSymbol Lit162 = ((SimpleSymbol) new SimpleSymbol("send-error").readResolve());
    static final SimpleSymbol Lit163 = ((SimpleSymbol) new SimpleSymbol("dispatchEvent").readResolve());
    static final SimpleSymbol Lit164 = ((SimpleSymbol) new SimpleSymbol("dispatchGenericEvent").readResolve());
    static final SimpleSymbol Lit165 = ((SimpleSymbol) new SimpleSymbol("lookup-handler").readResolve());
    static final SimpleSymbol Lit166 = ((SimpleSymbol) new SimpleSymbol("any").readResolve());
    static final SimpleSymbol Lit167 = ((SimpleSymbol) new SimpleSymbol("list").readResolve());
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
    static final SimpleSymbol Lit29 = ((SimpleSymbol) new SimpleSymbol("AlignHorizontal").readResolve());
    static final SimpleSymbol Lit3 = ((SimpleSymbol) new SimpleSymbol("g$response").readResolve());
    static final IntNum Lit30 = IntNum.make(3);
    static final SimpleSymbol Lit31 = ((SimpleSymbol) new SimpleSymbol("AlignVertical").readResolve());
    static final IntNum Lit32 = IntNum.make(2);
    static final SimpleSymbol Lit33 = ((SimpleSymbol) new SimpleSymbol("Height").readResolve());
    static final IntNum Lit34 = IntNum.make(-2);
    static final SimpleSymbol Lit35 = ((SimpleSymbol) new SimpleSymbol("Width").readResolve());
    static final FString Lit36 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit37 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final SimpleSymbol Lit38 = ((SimpleSymbol) new SimpleSymbol("VerticalArrangement1").readResolve());
    static final FString Lit39 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final SimpleSymbol Lit4 = ((SimpleSymbol) new SimpleSymbol("g$theURL").readResolve());
    static final FString Lit40 = new FString("com.google.appinventor.components.runtime.Image");
    static final SimpleSymbol Lit41 = ((SimpleSymbol) new SimpleSymbol("Image1").readResolve());
    static final IntNum Lit42 = IntNum.make((int) HttpRequestContext.HTTP_OK);
    static final SimpleSymbol Lit43 = ((SimpleSymbol) new SimpleSymbol("Picture").readResolve());
    static final SimpleSymbol Lit44 = ((SimpleSymbol) new SimpleSymbol("ScalePictureToFit").readResolve());
    static final FString Lit45 = new FString("com.google.appinventor.components.runtime.Image");
    static final FString Lit46 = new FString("com.google.appinventor.components.runtime.TextBox");
    static final SimpleSymbol Lit47 = ((SimpleSymbol) new SimpleSymbol("TextBox2").readResolve());
    static final IntNum Lit48;
    static final SimpleSymbol Lit49 = ((SimpleSymbol) new SimpleSymbol("FontSize").readResolve());
    static final SimpleSymbol Lit5 = ((SimpleSymbol) new SimpleSymbol("g$tempURL").readResolve());
    static final IntNum Lit50 = IntNum.make(15);
    static final SimpleSymbol Lit51 = ((SimpleSymbol) new SimpleSymbol("FontTypeface").readResolve());
    static final IntNum Lit52 = IntNum.make(1);
    static final IntNum Lit53 = IntNum.make(40);
    static final SimpleSymbol Lit54 = ((SimpleSymbol) new SimpleSymbol("Hint").readResolve());
    static final SimpleSymbol Lit55 = ((SimpleSymbol) new SimpleSymbol("TextAlignment").readResolve());
    static final IntNum Lit56 = IntNum.make(250);
    static final FString Lit57 = new FString("com.google.appinventor.components.runtime.TextBox");
    static final FString Lit58 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit59 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement2").readResolve());
    static final SimpleSymbol Lit6 = ((SimpleSymbol) new SimpleSymbol("AccentColor").readResolve());
    static final IntNum Lit60 = IntNum.make(10);
    static final FString Lit61 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit62 = new FString("com.google.appinventor.components.runtime.TextBox");
    static final SimpleSymbol Lit63 = ((SimpleSymbol) new SimpleSymbol("TextBox1").readResolve());
    static final IntNum Lit64;
    static final SimpleSymbol Lit65 = ((SimpleSymbol) new SimpleSymbol("NumbersOnly").readResolve());
    static final FString Lit66 = new FString("com.google.appinventor.components.runtime.TextBox");
    static final FString Lit67 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit68 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement3").readResolve());
    static final FString Lit69 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final IntNum Lit7 = IntNum.make(16777215);
    static final FString Lit70 = new FString("com.google.appinventor.components.runtime.PasswordTextBox");
    static final SimpleSymbol Lit71 = ((SimpleSymbol) new SimpleSymbol("PasswordTextBox1").readResolve());
    static final IntNum Lit72;
    static final FString Lit73 = new FString("com.google.appinventor.components.runtime.PasswordTextBox");
    static final FString Lit74 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit75 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement4").readResolve());
    static final FString Lit76 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit77 = new FString("com.google.appinventor.components.runtime.PasswordTextBox");
    static final SimpleSymbol Lit78 = ((SimpleSymbol) new SimpleSymbol("PasswordTextBox2").readResolve());
    static final IntNum Lit79;
    static final SimpleSymbol Lit8;
    static final FString Lit80 = new FString("com.google.appinventor.components.runtime.PasswordTextBox");
    static final FString Lit81 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit82 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement6").readResolve());
    static final IntNum Lit83 = IntNum.make(20);
    static final FString Lit84 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit85 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit86 = ((SimpleSymbol) new SimpleSymbol("Button2").readResolve());
    static final SimpleSymbol Lit87 = ((SimpleSymbol) new SimpleSymbol("FontBold").readResolve());
    static final SimpleSymbol Lit88 = ((SimpleSymbol) new SimpleSymbol("Image").readResolve());
    static final SimpleSymbol Lit89 = ((SimpleSymbol) new SimpleSymbol("Text").readResolve());
    static final SimpleSymbol Lit9 = ((SimpleSymbol) new SimpleSymbol("ActionBar").readResolve());
    static final FString Lit90 = new FString("com.google.appinventor.components.runtime.Button");
    static final PairWithPosition Lit91 = PairWithPosition.make(Lit12, PairWithPosition.make(Lit12, PairWithPosition.make(Lit12, PairWithPosition.make(Lit12, PairWithPosition.make(Lit12, PairWithPosition.make(Lit12, PairWithPosition.make(Lit12, PairWithPosition.make(Lit12, LList.Empty, "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Inscription.yail", 819558), "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Inscription.yail", 819553), "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Inscription.yail", 819548), "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Inscription.yail", 819543), "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Inscription.yail", 819538), "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Inscription.yail", 819533), "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Inscription.yail", 819528), "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Inscription.yail", 819522);
    static final PairWithPosition Lit92 = PairWithPosition.make(Lit12, PairWithPosition.make(Lit12, PairWithPosition.make(Lit12, LList.Empty, "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Inscription.yail", 819695), "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Inscription.yail", 819690), "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Inscription.yail", 819684);
    static final SimpleSymbol Lit93 = ((SimpleSymbol) new SimpleSymbol("Web1").readResolve());
    static final SimpleSymbol Lit94 = ((SimpleSymbol) new SimpleSymbol("Url").readResolve());
    static final SimpleSymbol Lit95 = ((SimpleSymbol) new SimpleSymbol("Get").readResolve());
    static final SimpleSymbol Lit96 = ((SimpleSymbol) new SimpleSymbol("Enabled").readResolve());
    static final SimpleSymbol Lit97 = ((SimpleSymbol) new SimpleSymbol("Button2$Click").readResolve());
    static final SimpleSymbol Lit98 = ((SimpleSymbol) new SimpleSymbol("Click").readResolve());
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
    static final ModuleMethod lambda$Fn27 = null;
    static final ModuleMethod lambda$Fn28 = null;
    static final ModuleMethod lambda$Fn29 = null;
    static final ModuleMethod lambda$Fn3 = null;
    static final ModuleMethod lambda$Fn30 = null;
    static final ModuleMethod lambda$Fn31 = null;
    static final ModuleMethod lambda$Fn32 = null;
    static final ModuleMethod lambda$Fn33 = null;
    static final ModuleMethod lambda$Fn34 = null;
    static final ModuleMethod lambda$Fn35 = null;
    static final ModuleMethod lambda$Fn36 = null;
    static final ModuleMethod lambda$Fn37 = null;
    static final ModuleMethod lambda$Fn38 = null;
    static final ModuleMethod lambda$Fn39 = null;
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
    public HorizontalArrangement HorizontalArrangement7;
    public HorizontalArrangement HorizontalArrangement8;
    public Image Image1;
    public Label Label1;
    public Notifier Notifier1;
    public final ModuleMethod Notifier1$AfterChoosing;
    public PasswordTextBox PasswordTextBox1;
    public PasswordTextBox PasswordTextBox2;
    public TextBox TextBox1;
    public TextBox TextBox2;
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
        Lit12 = simpleSymbol;
        SimpleSymbol simpleSymbol2 = Lit12;
        SimpleSymbol simpleSymbol3 = Lit12;
        SimpleSymbol simpleSymbol4 = Lit12;
        SimpleSymbol simpleSymbol5 = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_BOOLEAN).readResolve();
        Lit10 = simpleSymbol5;
        Lit149 = PairWithPosition.make(simpleSymbol, PairWithPosition.make(simpleSymbol2, PairWithPosition.make(simpleSymbol3, PairWithPosition.make(simpleSymbol4, PairWithPosition.make(simpleSymbol5, LList.Empty, "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Inscription.yail", 1156423), "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Inscription.yail", 1156418), "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Inscription.yail", 1156413), "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Inscription.yail", 1156408), "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Inscription.yail", 1156402);
        SimpleSymbol simpleSymbol6 = Lit167;
        SimpleSymbol simpleSymbol7 = (SimpleSymbol) new SimpleSymbol("number").readResolve();
        Lit8 = simpleSymbol7;
        Lit142 = PairWithPosition.make(simpleSymbol6, PairWithPosition.make(simpleSymbol7, LList.Empty, "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Inscription.yail", 1155705), "/tmp/1587598373187_0.9840647404511759-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Inscription.yail", 1155699);
        int[] iArr = new int[2];
        iArr[0] = -16739081;
        Lit115 = IntNum.make(iArr);
        int[] iArr2 = new int[2];
        iArr2[0] = -1;
        Lit110 = IntNum.make(iArr2);
        int[] iArr3 = new int[2];
        iArr3[0] = -14671580;
        Lit79 = IntNum.make(iArr3);
        int[] iArr4 = new int[2];
        iArr4[0] = -14671580;
        Lit72 = IntNum.make(iArr4);
        int[] iArr5 = new int[2];
        iArr5[0] = -14671580;
        Lit64 = IntNum.make(iArr5);
        int[] iArr6 = new int[2];
        iArr6[0] = -14671580;
        Lit48 = IntNum.make(iArr6);
        int[] iArr7 = new int[2];
        iArr7[0] = -16777216;
        Lit14 = IntNum.make(iArr7);
    }

    public Inscription() {
        ModuleInfo.register(this);
        frame frame2 = new frame();
        frame2.$main = this;
        this.get$Mnsimple$Mnname = new ModuleMethod(frame2, 1, Lit152, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.onCreate = new ModuleMethod(frame2, 2, "onCreate", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.android$Mnlog$Mnform = new ModuleMethod(frame2, 3, Lit153, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(frame2, 4, Lit154, 8194);
        this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame2, 5, Lit155, 8193);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame2, 7, Lit156, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(frame2, 8, Lit157, 8194);
        this.add$Mnto$Mnevents = new ModuleMethod(frame2, 9, Lit158, 8194);
        this.add$Mnto$Mncomponents = new ModuleMethod(frame2, 10, Lit159, 16388);
        this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(frame2, 11, Lit160, 8194);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(frame2, 12, Lit161, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.send$Mnerror = new ModuleMethod(frame2, 13, Lit162, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.process$Mnexception = new ModuleMethod(frame2, 14, "process-exception", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.dispatchEvent = new ModuleMethod(frame2, 15, Lit163, 16388);
        this.dispatchGenericEvent = new ModuleMethod(frame2, 16, Lit164, 16388);
        this.lookup$Mnhandler = new ModuleMethod(frame2, 17, Lit165, 8194);
        ModuleMethod moduleMethod = new ModuleMethod(frame2, 18, (Object) null, 0);
        moduleMethod.setProperty("source-location", "/tmp/runtime5061084233371746619.scm:622");
        lambda$Fn1 = moduleMethod;
        this.$define = new ModuleMethod(frame2, 19, "$define", 0);
        lambda$Fn2 = new ModuleMethod(frame2, 20, (Object) null, 0);
        lambda$Fn3 = new ModuleMethod(frame2, 21, (Object) null, 0);
        lambda$Fn4 = new ModuleMethod(frame2, 22, (Object) null, 0);
        lambda$Fn5 = new ModuleMethod(frame2, 23, (Object) null, 0);
        lambda$Fn6 = new ModuleMethod(frame2, 24, (Object) null, 0);
        lambda$Fn7 = new ModuleMethod(frame2, 25, (Object) null, 0);
        lambda$Fn8 = new ModuleMethod(frame2, 26, (Object) null, 0);
        lambda$Fn9 = new ModuleMethod(frame2, 27, (Object) null, 0);
        lambda$Fn10 = new ModuleMethod(frame2, 28, (Object) null, 0);
        lambda$Fn11 = new ModuleMethod(frame2, 29, (Object) null, 0);
        lambda$Fn12 = new ModuleMethod(frame2, 30, (Object) null, 0);
        lambda$Fn13 = new ModuleMethod(frame2, 31, (Object) null, 0);
        lambda$Fn14 = new ModuleMethod(frame2, 32, (Object) null, 0);
        lambda$Fn15 = new ModuleMethod(frame2, 33, (Object) null, 0);
        lambda$Fn16 = new ModuleMethod(frame2, 34, (Object) null, 0);
        lambda$Fn17 = new ModuleMethod(frame2, 35, (Object) null, 0);
        lambda$Fn18 = new ModuleMethod(frame2, 36, (Object) null, 0);
        lambda$Fn19 = new ModuleMethod(frame2, 37, (Object) null, 0);
        lambda$Fn20 = new ModuleMethod(frame2, 38, (Object) null, 0);
        lambda$Fn21 = new ModuleMethod(frame2, 39, (Object) null, 0);
        lambda$Fn22 = new ModuleMethod(frame2, 40, (Object) null, 0);
        lambda$Fn23 = new ModuleMethod(frame2, 41, (Object) null, 0);
        lambda$Fn24 = new ModuleMethod(frame2, 42, (Object) null, 0);
        lambda$Fn25 = new ModuleMethod(frame2, 43, (Object) null, 0);
        lambda$Fn26 = new ModuleMethod(frame2, 44, (Object) null, 0);
        lambda$Fn27 = new ModuleMethod(frame2, 45, (Object) null, 0);
        lambda$Fn28 = new ModuleMethod(frame2, 46, (Object) null, 0);
        lambda$Fn29 = new ModuleMethod(frame2, 47, (Object) null, 0);
        this.Button2$Click = new ModuleMethod(frame2, 48, Lit97, 0);
        lambda$Fn30 = new ModuleMethod(frame2, 49, (Object) null, 0);
        lambda$Fn31 = new ModuleMethod(frame2, 50, (Object) null, 0);
        lambda$Fn32 = new ModuleMethod(frame2, 51, (Object) null, 0);
        lambda$Fn33 = new ModuleMethod(frame2, 52, (Object) null, 0);
        lambda$Fn34 = new ModuleMethod(frame2, 53, (Object) null, 0);
        lambda$Fn35 = new ModuleMethod(frame2, 54, (Object) null, 0);
        lambda$Fn36 = new ModuleMethod(frame2, 55, (Object) null, 0);
        lambda$Fn37 = new ModuleMethod(frame2, 56, (Object) null, 0);
        this.Button1$Click = new ModuleMethod(frame2, 57, Lit118, 0);
        lambda$Fn38 = new ModuleMethod(frame2, 58, (Object) null, 0);
        lambda$Fn39 = new ModuleMethod(frame2, 59, (Object) null, 0);
        this.Notifier1$AfterChoosing = new ModuleMethod(frame2, 60, Lit128, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.Web1$GotText = new ModuleMethod(frame2, 61, Lit150, 16388);
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
        Inscription = null;
        this.form$Mnname$Mnsymbol = Lit0;
        this.events$Mnto$Mnregister = LList.Empty;
        this.components$Mnto$Mncreate = LList.Empty;
        this.global$Mnvars$Mnto$Mncreate = LList.Empty;
        this.form$Mndo$Mnafter$Mncreation = LList.Empty;
        runtime.$instance.run();
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit3, runtime.callYailPrimitive(runtime.make$Mnyail$Mnlist, LList.Empty, LList.Empty, "make a list")), $result);
        } else {
            addToGlobalVars(Lit3, lambda$Fn2);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit4, ""), $result);
        } else {
            addToGlobalVars(Lit4, lambda$Fn3);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit5, ""), $result);
        } else {
            addToGlobalVars(Lit5, lambda$Fn4);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.setAndCoerceProperty$Ex(Lit0, Lit6, Lit7, Lit8);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit9, Boolean.TRUE, Lit10);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit11, "MySadWorld", Lit12);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit13, Lit14, Lit8);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit15, "slidehorizontal", Lit12);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit16, "slidehorizontal", Lit12);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit17, Lit18, Lit8);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit19, Lit20, Lit8);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit21, "portrait", Lit12);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit22, Boolean.TRUE, Lit10);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit23, "Responsive", Lit12);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit24, "AppTheme", Lit12);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit25, "Inscription", Lit12);
            Values.writeValues(runtime.setAndCoerceProperty$Ex(Lit0, Lit26, Boolean.FALSE, Lit10), $result);
        } else {
            addToFormDoAfterCreation(new Promise(lambda$Fn5));
        }
        this.HorizontalArrangement1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit27, Lit28, lambda$Fn6), $result);
        } else {
            addToComponents(Lit0, Lit36, Lit28, lambda$Fn7);
        }
        this.VerticalArrangement1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit28, Lit37, Lit38, lambda$Fn8), $result);
        } else {
            addToComponents(Lit28, Lit39, Lit38, lambda$Fn9);
        }
        this.Image1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit38, Lit40, Lit41, lambda$Fn10), $result);
        } else {
            addToComponents(Lit38, Lit45, Lit41, lambda$Fn11);
        }
        this.TextBox2 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit38, Lit46, Lit47, lambda$Fn12), $result);
        } else {
            addToComponents(Lit38, Lit57, Lit47, lambda$Fn13);
        }
        this.HorizontalArrangement2 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit38, Lit58, Lit59, lambda$Fn14), $result);
        } else {
            addToComponents(Lit38, Lit61, Lit59, lambda$Fn15);
        }
        this.TextBox1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit38, Lit62, Lit63, lambda$Fn16), $result);
        } else {
            addToComponents(Lit38, Lit66, Lit63, lambda$Fn17);
        }
        this.HorizontalArrangement3 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit38, Lit67, Lit68, lambda$Fn18), $result);
        } else {
            addToComponents(Lit38, Lit69, Lit68, lambda$Fn19);
        }
        this.PasswordTextBox1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit38, Lit70, Lit71, lambda$Fn20), $result);
        } else {
            addToComponents(Lit38, Lit73, Lit71, lambda$Fn21);
        }
        this.HorizontalArrangement4 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit38, Lit74, Lit75, lambda$Fn22), $result);
        } else {
            addToComponents(Lit38, Lit76, Lit75, lambda$Fn23);
        }
        this.PasswordTextBox2 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit38, Lit77, Lit78, lambda$Fn24), $result);
        } else {
            addToComponents(Lit38, Lit80, Lit78, lambda$Fn25);
        }
        this.HorizontalArrangement6 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit38, Lit81, Lit82, lambda$Fn26), $result);
        } else {
            addToComponents(Lit38, Lit84, Lit82, lambda$Fn27);
        }
        this.Button2 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit38, Lit85, Lit86, lambda$Fn28), $result);
        } else {
            addToComponents(Lit38, Lit90, Lit86, lambda$Fn29);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit97, this.Button2$Click);
        } else {
            addToFormEnvironment(Lit97, this.Button2$Click);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Button2", "Click");
        } else {
            addToEvents(Lit86, Lit98);
        }
        this.HorizontalArrangement8 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit38, Lit99, Lit100, lambda$Fn30), $result);
        } else {
            addToComponents(Lit38, Lit101, Lit100, lambda$Fn31);
        }
        this.HorizontalArrangement5 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit102, Lit103, lambda$Fn32), $result);
        } else {
            addToComponents(Lit0, Lit105, Lit103, lambda$Fn33);
        }
        this.Label1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit103, Lit106, Lit107, lambda$Fn34), $result);
        } else {
            addToComponents(Lit103, Lit111, Lit107, lambda$Fn35);
        }
        this.Button1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit103, Lit112, Lit113, lambda$Fn36), $result);
        } else {
            addToComponents(Lit103, Lit116, Lit113, lambda$Fn37);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit118, this.Button1$Click);
        } else {
            addToFormEnvironment(Lit118, this.Button1$Click);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Button1", "Click");
        } else {
            addToEvents(Lit113, Lit98);
        }
        this.HorizontalArrangement7 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit119, Lit120, lambda$Fn38), $result);
        } else {
            addToComponents(Lit0, Lit121, Lit120, lambda$Fn39);
        }
        this.Notifier1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit122, Lit123, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit124, Lit123, Boolean.FALSE);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit128, this.Notifier1$AfterChoosing);
        } else {
            addToFormEnvironment(Lit128, this.Notifier1$AfterChoosing);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Notifier1", "AfterChoosing");
        } else {
            addToEvents(Lit123, Lit129);
        }
        this.TinyDB1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit130, Lit131, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit132, Lit131, Boolean.FALSE);
        }
        this.Web1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit133, Lit93, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit134, Lit93, Boolean.FALSE);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit150, this.Web1$GotText);
        } else {
            addToFormEnvironment(Lit150, this.Web1$GotText);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Web1", "GotText");
        } else {
            addToEvents(Lit93, Lit151);
        }
        runtime.initRuntime();
    }

    static Object lambda3() {
        return runtime.callYailPrimitive(runtime.make$Mnyail$Mnlist, LList.Empty, LList.Empty, "make a list");
    }

    static String lambda4() {
        return "";
    }

    static String lambda5() {
        return "";
    }

    static Object lambda6() {
        runtime.setAndCoerceProperty$Ex(Lit0, Lit6, Lit7, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit9, Boolean.TRUE, Lit10);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit11, "MySadWorld", Lit12);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit13, Lit14, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit15, "slidehorizontal", Lit12);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit16, "slidehorizontal", Lit12);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit17, Lit18, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit19, Lit20, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit21, "portrait", Lit12);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit22, Boolean.TRUE, Lit10);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit23, "Responsive", Lit12);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit24, "AppTheme", Lit12);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit25, "Inscription", Lit12);
        return runtime.setAndCoerceProperty$Ex(Lit0, Lit26, Boolean.FALSE, Lit10);
    }

    static Object lambda7() {
        runtime.setAndCoerceProperty$Ex(Lit28, Lit29, Lit30, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit28, Lit31, Lit32, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit28, Lit33, Lit34, Lit8);
        return runtime.setAndCoerceProperty$Ex(Lit28, Lit35, Lit34, Lit8);
    }

    static Object lambda8() {
        runtime.setAndCoerceProperty$Ex(Lit28, Lit29, Lit30, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit28, Lit31, Lit32, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit28, Lit33, Lit34, Lit8);
        return runtime.setAndCoerceProperty$Ex(Lit28, Lit35, Lit34, Lit8);
    }

    static Object lambda10() {
        runtime.setAndCoerceProperty$Ex(Lit38, Lit29, Lit30, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit38, Lit31, Lit32, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit38, Lit33, Lit34, Lit8);
        return runtime.setAndCoerceProperty$Ex(Lit38, Lit35, Lit34, Lit8);
    }

    static Object lambda9() {
        runtime.setAndCoerceProperty$Ex(Lit38, Lit29, Lit30, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit38, Lit31, Lit32, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit38, Lit33, Lit34, Lit8);
        return runtime.setAndCoerceProperty$Ex(Lit38, Lit35, Lit34, Lit8);
    }

    static Object lambda11() {
        runtime.setAndCoerceProperty$Ex(Lit41, Lit33, Lit42, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit41, Lit43, "MSW_w.png", Lit12);
        runtime.setAndCoerceProperty$Ex(Lit41, Lit44, Boolean.TRUE, Lit10);
        return runtime.setAndCoerceProperty$Ex(Lit41, Lit35, Lit42, Lit8);
    }

    static Object lambda12() {
        runtime.setAndCoerceProperty$Ex(Lit41, Lit33, Lit42, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit41, Lit43, "MSW_w.png", Lit12);
        runtime.setAndCoerceProperty$Ex(Lit41, Lit44, Boolean.TRUE, Lit10);
        return runtime.setAndCoerceProperty$Ex(Lit41, Lit35, Lit42, Lit8);
    }

    static Object lambda13() {
        runtime.setAndCoerceProperty$Ex(Lit47, Lit13, Lit48, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit47, Lit49, Lit50, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit47, Lit51, Lit52, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit47, Lit33, Lit53, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit47, Lit54, "Nom d'utilisateur", Lit12);
        runtime.setAndCoerceProperty$Ex(Lit47, Lit55, Lit52, Lit8);
        return runtime.setAndCoerceProperty$Ex(Lit47, Lit35, Lit56, Lit8);
    }

    static Object lambda14() {
        runtime.setAndCoerceProperty$Ex(Lit47, Lit13, Lit48, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit47, Lit49, Lit50, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit47, Lit51, Lit52, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit47, Lit33, Lit53, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit47, Lit54, "Nom d'utilisateur", Lit12);
        runtime.setAndCoerceProperty$Ex(Lit47, Lit55, Lit52, Lit8);
        return runtime.setAndCoerceProperty$Ex(Lit47, Lit35, Lit56, Lit8);
    }

    static Object lambda15() {
        runtime.setAndCoerceProperty$Ex(Lit59, Lit33, Lit60, Lit8);
        return runtime.setAndCoerceProperty$Ex(Lit59, Lit35, Lit34, Lit8);
    }

    static Object lambda16() {
        runtime.setAndCoerceProperty$Ex(Lit59, Lit33, Lit60, Lit8);
        return runtime.setAndCoerceProperty$Ex(Lit59, Lit35, Lit34, Lit8);
    }

    static Object lambda17() {
        runtime.setAndCoerceProperty$Ex(Lit63, Lit13, Lit64, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit63, Lit49, Lit50, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit63, Lit51, Lit52, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit63, Lit33, Lit53, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit63, Lit54, "Téléphone", Lit12);
        runtime.setAndCoerceProperty$Ex(Lit63, Lit65, Boolean.TRUE, Lit10);
        runtime.setAndCoerceProperty$Ex(Lit63, Lit55, Lit52, Lit8);
        return runtime.setAndCoerceProperty$Ex(Lit63, Lit35, Lit56, Lit8);
    }

    static Object lambda18() {
        runtime.setAndCoerceProperty$Ex(Lit63, Lit13, Lit64, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit63, Lit49, Lit50, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit63, Lit51, Lit52, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit63, Lit33, Lit53, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit63, Lit54, "Téléphone", Lit12);
        runtime.setAndCoerceProperty$Ex(Lit63, Lit65, Boolean.TRUE, Lit10);
        runtime.setAndCoerceProperty$Ex(Lit63, Lit55, Lit52, Lit8);
        return runtime.setAndCoerceProperty$Ex(Lit63, Lit35, Lit56, Lit8);
    }

    static Object lambda19() {
        runtime.setAndCoerceProperty$Ex(Lit68, Lit33, Lit60, Lit8);
        return runtime.setAndCoerceProperty$Ex(Lit68, Lit35, Lit34, Lit8);
    }

    static Object lambda20() {
        runtime.setAndCoerceProperty$Ex(Lit68, Lit33, Lit60, Lit8);
        return runtime.setAndCoerceProperty$Ex(Lit68, Lit35, Lit34, Lit8);
    }

    static Object lambda21() {
        runtime.setAndCoerceProperty$Ex(Lit71, Lit13, Lit72, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit71, Lit49, Lit50, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit71, Lit51, Lit52, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit71, Lit33, Lit53, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit71, Lit54, "Mot de passe", Lit12);
        runtime.setAndCoerceProperty$Ex(Lit71, Lit55, Lit52, Lit8);
        return runtime.setAndCoerceProperty$Ex(Lit71, Lit35, Lit56, Lit8);
    }

    static Object lambda22() {
        runtime.setAndCoerceProperty$Ex(Lit71, Lit13, Lit72, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit71, Lit49, Lit50, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit71, Lit51, Lit52, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit71, Lit33, Lit53, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit71, Lit54, "Mot de passe", Lit12);
        runtime.setAndCoerceProperty$Ex(Lit71, Lit55, Lit52, Lit8);
        return runtime.setAndCoerceProperty$Ex(Lit71, Lit35, Lit56, Lit8);
    }

    static Object lambda23() {
        runtime.setAndCoerceProperty$Ex(Lit75, Lit33, Lit60, Lit8);
        return runtime.setAndCoerceProperty$Ex(Lit75, Lit35, Lit34, Lit8);
    }

    static Object lambda24() {
        runtime.setAndCoerceProperty$Ex(Lit75, Lit33, Lit60, Lit8);
        return runtime.setAndCoerceProperty$Ex(Lit75, Lit35, Lit34, Lit8);
    }

    static Object lambda25() {
        runtime.setAndCoerceProperty$Ex(Lit78, Lit13, Lit79, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit78, Lit49, Lit50, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit78, Lit51, Lit52, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit78, Lit33, Lit53, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit78, Lit54, "Répétez le mot de passe", Lit12);
        runtime.setAndCoerceProperty$Ex(Lit78, Lit55, Lit52, Lit8);
        return runtime.setAndCoerceProperty$Ex(Lit78, Lit35, Lit56, Lit8);
    }

    static Object lambda26() {
        runtime.setAndCoerceProperty$Ex(Lit78, Lit13, Lit79, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit78, Lit49, Lit50, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit78, Lit51, Lit52, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit78, Lit33, Lit53, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit78, Lit54, "Répétez le mot de passe", Lit12);
        runtime.setAndCoerceProperty$Ex(Lit78, Lit55, Lit52, Lit8);
        return runtime.setAndCoerceProperty$Ex(Lit78, Lit35, Lit56, Lit8);
    }

    static Object lambda27() {
        runtime.setAndCoerceProperty$Ex(Lit82, Lit33, Lit83, Lit8);
        return runtime.setAndCoerceProperty$Ex(Lit82, Lit35, Lit34, Lit8);
    }

    static Object lambda28() {
        runtime.setAndCoerceProperty$Ex(Lit82, Lit33, Lit83, Lit8);
        return runtime.setAndCoerceProperty$Ex(Lit82, Lit35, Lit34, Lit8);
    }

    static Object lambda29() {
        runtime.setAndCoerceProperty$Ex(Lit86, Lit87, Boolean.TRUE, Lit10);
        runtime.setAndCoerceProperty$Ex(Lit86, Lit51, Lit52, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit86, Lit33, Lit53, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit86, Lit88, "therare.png", Lit12);
        runtime.setAndCoerceProperty$Ex(Lit86, Lit89, "Inscription", Lit12);
        return runtime.setAndCoerceProperty$Ex(Lit86, Lit35, Lit56, Lit8);
    }

    static Object lambda30() {
        runtime.setAndCoerceProperty$Ex(Lit86, Lit87, Boolean.TRUE, Lit10);
        runtime.setAndCoerceProperty$Ex(Lit86, Lit51, Lit52, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit86, Lit33, Lit53, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit86, Lit88, "therare.png", Lit12);
        runtime.setAndCoerceProperty$Ex(Lit86, Lit89, "Inscription", Lit12);
        return runtime.setAndCoerceProperty$Ex(Lit86, Lit35, Lit56, Lit8);
    }

    public Object Button2$Click() {
        runtime.setThisForm();
        SimpleSymbol simpleSymbol = Lit5;
        ModuleMethod moduleMethod = strings.string$Mnappend;
        Pair list1 = LList.list1("http://msw.kellis.fr/android/actions/register.php?username=");
        LList.chain1(LList.chain1(LList.chain1(LList.chain4(list1, runtime.get$Mnproperty.apply2(Lit47, Lit89), "&password=", runtime.get$Mnproperty.apply2(Lit71, Lit89), "&password2="), runtime.get$Mnproperty.apply2(Lit78, Lit89)), "&phone="), runtime.get$Mnproperty.apply2(Lit63, Lit89));
        runtime.addGlobalVarToCurrentFormEnvironment(simpleSymbol, runtime.callYailPrimitive(moduleMethod, list1, Lit91, "join"));
        runtime.addGlobalVarToCurrentFormEnvironment(Lit4, runtime.callYailPrimitive(runtime.string$Mnreplace$Mnall, LList.list3(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit5, runtime.$Stthe$Mnnull$Mnvalue$St), " ", "%20"), Lit92, "replace all"));
        runtime.setAndCoerceProperty$Ex(Lit93, Lit94, runtime.lookupGlobalVarInCurrentFormEnvironment(Lit4, runtime.$Stthe$Mnnull$Mnvalue$St), Lit12);
        runtime.callComponentMethod(Lit93, Lit95, LList.Empty, LList.Empty);
        runtime.setAndCoerceProperty$Ex(Lit86, Lit96, Boolean.FALSE, Lit10);
        return runtime.setAndCoerceProperty$Ex(Lit86, Lit88, "therare_bw.png", Lit12);
    }

    static Object lambda31() {
        runtime.setAndCoerceProperty$Ex(Lit100, Lit33, Lit60, Lit8);
        return runtime.setAndCoerceProperty$Ex(Lit100, Lit35, Lit34, Lit8);
    }

    static Object lambda32() {
        runtime.setAndCoerceProperty$Ex(Lit100, Lit33, Lit60, Lit8);
        return runtime.setAndCoerceProperty$Ex(Lit100, Lit35, Lit34, Lit8);
    }

    static Object lambda33() {
        runtime.setAndCoerceProperty$Ex(Lit103, Lit29, Lit30, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit103, Lit31, Lit32, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit103, Lit33, Lit104, Lit8);
        return runtime.setAndCoerceProperty$Ex(Lit103, Lit35, Lit34, Lit8);
    }

    static Object lambda34() {
        runtime.setAndCoerceProperty$Ex(Lit103, Lit29, Lit30, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit103, Lit31, Lit32, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit103, Lit33, Lit104, Lit8);
        return runtime.setAndCoerceProperty$Ex(Lit103, Lit35, Lit34, Lit8);
    }

    static Object lambda35() {
        runtime.setAndCoerceProperty$Ex(Lit107, Lit49, Lit108, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit107, Lit51, Lit52, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit107, Lit89, "Vous avez déjà un compte ?", Lit12);
        runtime.setAndCoerceProperty$Ex(Lit107, Lit55, Lit52, Lit8);
        return runtime.setAndCoerceProperty$Ex(Lit107, Lit109, Lit110, Lit8);
    }

    static Object lambda36() {
        runtime.setAndCoerceProperty$Ex(Lit107, Lit49, Lit108, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit107, Lit51, Lit52, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit107, Lit89, "Vous avez déjà un compte ?", Lit12);
        runtime.setAndCoerceProperty$Ex(Lit107, Lit55, Lit52, Lit8);
        return runtime.setAndCoerceProperty$Ex(Lit107, Lit109, Lit110, Lit8);
    }

    static Object lambda37() {
        runtime.setAndCoerceProperty$Ex(Lit113, Lit13, Lit114, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit113, Lit87, Boolean.TRUE, Lit10);
        runtime.setAndCoerceProperty$Ex(Lit113, Lit51, Lit52, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit113, Lit89, "Connectez-vous", Lit12);
        return runtime.setAndCoerceProperty$Ex(Lit113, Lit109, Lit115, Lit8);
    }

    static Object lambda38() {
        runtime.setAndCoerceProperty$Ex(Lit113, Lit13, Lit114, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit113, Lit87, Boolean.TRUE, Lit10);
        runtime.setAndCoerceProperty$Ex(Lit113, Lit51, Lit52, Lit8);
        runtime.setAndCoerceProperty$Ex(Lit113, Lit89, "Connectez-vous", Lit12);
        return runtime.setAndCoerceProperty$Ex(Lit113, Lit109, Lit115, Lit8);
    }

    public Object Button1$Click() {
        runtime.setThisForm();
        return runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen, LList.list1("Connexion"), Lit117, "open another screen");
    }

    static Object lambda39() {
        runtime.setAndCoerceProperty$Ex(Lit120, Lit33, Lit83, Lit8);
        return runtime.setAndCoerceProperty$Ex(Lit120, Lit35, Lit34, Lit8);
    }

    static Object lambda40() {
        runtime.setAndCoerceProperty$Ex(Lit120, Lit33, Lit83, Lit8);
        return runtime.setAndCoerceProperty$Ex(Lit120, Lit35, Lit34, Lit8);
    }

    public Object Notifier1$AfterChoosing(Object $choice) {
        Object $choice2 = runtime.sanitizeComponentData($choice);
        runtime.setThisForm();
        ModuleMethod moduleMethod = runtime.yail$Mnequal$Qu;
        if ($choice2 instanceof Package) {
            $choice2 = runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit125), " is not bound in the current context"), "Unbound Variable");
        }
        return runtime.callYailPrimitive(moduleMethod, LList.list2($choice2, "Quitter"), Lit126, "=") != Boolean.FALSE ? runtime.callYailPrimitive(runtime.close$Mnapplication, LList.Empty, LList.Empty, "close application") : runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen, LList.list1("Accueil"), Lit127, "open another screen");
    }

    public Object Web1$GotText(Object $url, Object $responseCode, Object $responseType, Object $responseContent) {
        Object obj;
        runtime.sanitizeComponentData($url);
        Object $responseCode2 = runtime.sanitizeComponentData($responseCode);
        runtime.sanitizeComponentData($responseType);
        Object $responseContent2 = runtime.sanitizeComponentData($responseContent);
        runtime.setThisForm();
        ModuleMethod moduleMethod = runtime.yail$Mnequal$Qu;
        if ($responseCode2 instanceof Package) {
            $responseCode2 = runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit135), " is not bound in the current context"), "Unbound Variable");
        }
        if (runtime.callYailPrimitive(moduleMethod, LList.list2($responseCode2, "200"), Lit136, "=") != Boolean.FALSE) {
            SimpleSymbol simpleSymbol = Lit3;
            ModuleMethod moduleMethod2 = runtime.string$Mnsplit;
            if ($responseContent2 instanceof Package) {
                obj = runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit137), " is not bound in the current context"), "Unbound Variable");
            } else {
                obj = $responseContent2;
            }
            runtime.addGlobalVarToCurrentFormEnvironment(simpleSymbol, runtime.callYailPrimitive(moduleMethod2, LList.list2(obj, "/"), Lit138, "split"));
            if (runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2(runtime.callYailPrimitive(runtime.yail$Mnlist$Mnget$Mnitem, LList.list2(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit3, runtime.$Stthe$Mnnull$Mnvalue$St), Lit52), Lit139, "select list item"), "yes"), Lit140, "=") != Boolean.FALSE) {
                runtime.callComponentMethod(Lit131, Lit141, LList.list2("user_id", runtime.callYailPrimitive(runtime.yail$Mnlist$Mnget$Mnitem, LList.list2(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit3, runtime.$Stthe$Mnnull$Mnvalue$St), Lit32), Lit142, "select list item")), Lit143);
                runtime.callComponentMethod(Lit131, Lit141, LList.list2("etape", "0"), Lit144);
                return runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen, LList.list1("Etape1"), Lit145, "open another screen");
            }
            SimpleSymbol simpleSymbol2 = Lit123;
            SimpleSymbol simpleSymbol3 = Lit146;
            if ($responseContent2 instanceof Package) {
                $responseContent2 = runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit137), " is not bound in the current context"), "Unbound Variable");
            }
            runtime.callComponentMethod(simpleSymbol2, simpleSymbol3, LList.list1($responseContent2), Lit147);
            runtime.setAndCoerceProperty$Ex(Lit86, Lit96, Boolean.TRUE, Lit10);
            return runtime.setAndCoerceProperty$Ex(Lit86, Lit88, "therare.png", Lit12);
        }
        SimpleSymbol simpleSymbol4 = Lit123;
        SimpleSymbol simpleSymbol5 = Lit148;
        Pair list1 = LList.list1("Une grave erreur s'est produite lors du traitement de vos données. Réessayez dans quelques instants.");
        LList.chain4(list1, "Erreur", "Quitter", "", Boolean.FALSE);
        return runtime.callComponentMethod(simpleSymbol4, simpleSymbol5, list1, Lit149);
    }

    /* compiled from: Inscription.yail */
    public class frame extends ModuleBody {
        Inscription $main;

        public int match1(ModuleMethod moduleMethod, Object obj, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 1:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 2:
                    if (!(obj instanceof Inscription)) {
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
                    if (!(obj instanceof Inscription)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 60:
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
                    if (!(obj instanceof Inscription)) {
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
                    if (!(obj instanceof Inscription)) {
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
                case 61:
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
                case 60:
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
                    Inscription inscription = this.$main;
                    try {
                        Component component = (Component) obj;
                        try {
                            String str = (String) obj2;
                            try {
                                if (obj3 == Boolean.FALSE) {
                                    z = false;
                                }
                                try {
                                    inscription.dispatchGenericEvent(component, str, z, (Object[]) obj4);
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
                case 61:
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
                    return Inscription.lambda2();
                case 19:
                    this.$main.$define();
                    return Values.empty;
                case 20:
                    return Inscription.lambda3();
                case 21:
                    return Inscription.lambda4();
                case 22:
                    return Inscription.lambda5();
                case 23:
                    return Inscription.lambda6();
                case 24:
                    return Inscription.lambda7();
                case 25:
                    return Inscription.lambda8();
                case 26:
                    return Inscription.lambda9();
                case 27:
                    return Inscription.lambda10();
                case 28:
                    return Inscription.lambda11();
                case 29:
                    return Inscription.lambda12();
                case 30:
                    return Inscription.lambda13();
                case 31:
                    return Inscription.lambda14();
                case 32:
                    return Inscription.lambda15();
                case 33:
                    return Inscription.lambda16();
                case 34:
                    return Inscription.lambda17();
                case 35:
                    return Inscription.lambda18();
                case 36:
                    return Inscription.lambda19();
                case 37:
                    return Inscription.lambda20();
                case 38:
                    return Inscription.lambda21();
                case 39:
                    return Inscription.lambda22();
                case 40:
                    return Inscription.lambda23();
                case 41:
                    return Inscription.lambda24();
                case 42:
                    return Inscription.lambda25();
                case 43:
                    return Inscription.lambda26();
                case 44:
                    return Inscription.lambda27();
                case 45:
                    return Inscription.lambda28();
                case 46:
                    return Inscription.lambda29();
                case 47:
                    return Inscription.lambda30();
                case 48:
                    return this.$main.Button2$Click();
                case 49:
                    return Inscription.lambda31();
                case 50:
                    return Inscription.lambda32();
                case 51:
                    return Inscription.lambda33();
                case 52:
                    return Inscription.lambda34();
                case 53:
                    return Inscription.lambda35();
                case 54:
                    return Inscription.lambda36();
                case 55:
                    return Inscription.lambda37();
                case 56:
                    return Inscription.lambda38();
                case 57:
                    return this.$main.Button1$Click();
                case 58:
                    return Inscription.lambda39();
                case 59:
                    return Inscription.lambda40();
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
                case 50:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 51:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 52:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 53:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 54:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 55:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 56:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 57:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 58:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 59:
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
        Inscription = this;
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
