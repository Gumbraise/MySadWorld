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

/* compiled from: Connexion.yail */
public class Connexion extends Form implements Runnable {
    public static Connexion Connexion;
    static final SimpleSymbol Lit0 = ((SimpleSymbol) new SimpleSymbol("Connexion").readResolve());
    static final SimpleSymbol Lit1 = ((SimpleSymbol) new SimpleSymbol("getMessage").readResolve());
    static final SimpleSymbol Lit10 = ((SimpleSymbol) new SimpleSymbol("g$tempURL").readResolve());
    static final FString Lit100 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit101 = ((SimpleSymbol) new SimpleSymbol("Label1").readResolve());
    static final IntNum Lit102;
    static final FString Lit103 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit104 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit105 = ((SimpleSymbol) new SimpleSymbol("Button2").readResolve());
    static final IntNum Lit106 = IntNum.make(16777215);
    static final IntNum Lit107;
    static final FString Lit108 = new FString("com.google.appinventor.components.runtime.Button");
    static final PairWithPosition Lit109 = PairWithPosition.make(Lit19, LList.Empty, "/tmp/1587589086324_0.21485239854188265-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 798802);
    static final SimpleSymbol Lit11 = ((SimpleSymbol) new SimpleSymbol("g$theURL").readResolve());
    static final SimpleSymbol Lit110 = ((SimpleSymbol) new SimpleSymbol("Button2$Click").readResolve());
    static final FString Lit111 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit112 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement6").readResolve());
    static final FString Lit113 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit114 = new FString("com.google.appinventor.components.runtime.Notifier");
    static final SimpleSymbol Lit115 = ((SimpleSymbol) new SimpleSymbol("Notifier1").readResolve());
    static final FString Lit116 = new FString("com.google.appinventor.components.runtime.Notifier");
    static final SimpleSymbol Lit117 = ((SimpleSymbol) new SimpleSymbol("$choice").readResolve());
    static final PairWithPosition Lit118 = PairWithPosition.make(Lit168, PairWithPosition.make(Lit168, LList.Empty, "/tmp/1587589086324_0.21485239854188265-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 864359), "/tmp/1587589086324_0.21485239854188265-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 864354);
    static final PairWithPosition Lit119 = PairWithPosition.make(Lit168, PairWithPosition.make(Lit168, LList.Empty, "/tmp/1587589086324_0.21485239854188265-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 864596), "/tmp/1587589086324_0.21485239854188265-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 864591);
    static final SimpleSymbol Lit12 = ((SimpleSymbol) new SimpleSymbol("g$response").readResolve());
    static final PairWithPosition Lit120 = PairWithPosition.make(Lit19, LList.Empty, "/tmp/1587589086324_0.21485239854188265-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 864688);
    static final PairWithPosition Lit121 = PairWithPosition.make(Lit19, LList.Empty, "/tmp/1587589086324_0.21485239854188265-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 864801);
    static final SimpleSymbol Lit122 = ((SimpleSymbol) new SimpleSymbol("Notifier1$AfterChoosing").readResolve());
    static final SimpleSymbol Lit123 = ((SimpleSymbol) new SimpleSymbol("AfterChoosing").readResolve());
    static final FString Lit124 = new FString("com.google.appinventor.components.runtime.Web");
    static final FString Lit125 = new FString("com.google.appinventor.components.runtime.Web");
    static final SimpleSymbol Lit126 = ((SimpleSymbol) new SimpleSymbol("$responseCode").readResolve());
    static final PairWithPosition Lit127 = PairWithPosition.make(Lit168, PairWithPosition.make(Lit168, LList.Empty, "/tmp/1587589086324_0.21485239854188265-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 893033), "/tmp/1587589086324_0.21485239854188265-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 893028);
    static final SimpleSymbol Lit128 = ((SimpleSymbol) new SimpleSymbol("$responseContent").readResolve());
    static final PairWithPosition Lit129 = PairWithPosition.make(Lit19, PairWithPosition.make(Lit19, LList.Empty, "/tmp/1587589086324_0.21485239854188265-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 893172), "/tmp/1587589086324_0.21485239854188265-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 893166);
    static final SimpleSymbol Lit13 = ((SimpleSymbol) new SimpleSymbol("AccentColor").readResolve());
    static final PairWithPosition Lit130 = PairWithPosition.make(Lit169, PairWithPosition.make(Lit15, LList.Empty, "/tmp/1587589086324_0.21485239854188265-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 893335), "/tmp/1587589086324_0.21485239854188265-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 893329);
    static final PairWithPosition Lit131 = PairWithPosition.make(Lit168, PairWithPosition.make(Lit168, LList.Empty, "/tmp/1587589086324_0.21485239854188265-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 893376), "/tmp/1587589086324_0.21485239854188265-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 893371);
    static final PairWithPosition Lit132 = PairWithPosition.make(Lit169, PairWithPosition.make(Lit15, LList.Empty, "/tmp/1587589086324_0.21485239854188265-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 893543), "/tmp/1587589086324_0.21485239854188265-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 893537);
    static final PairWithPosition Lit133 = PairWithPosition.make(Lit168, PairWithPosition.make(Lit168, LList.Empty, "/tmp/1587589086324_0.21485239854188265-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 893582), "/tmp/1587589086324_0.21485239854188265-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 893577);
    static final PairWithPosition Lit134 = PairWithPosition.make(Lit169, PairWithPosition.make(Lit15, LList.Empty, "/tmp/1587589086324_0.21485239854188265-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 893718), "/tmp/1587589086324_0.21485239854188265-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 893712);
    static final IntNum Lit135 = IntNum.make(6);
    static final PairWithPosition Lit136 = PairWithPosition.make(Lit169, PairWithPosition.make(Lit15, LList.Empty, "/tmp/1587589086324_0.21485239854188265-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 893860), "/tmp/1587589086324_0.21485239854188265-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 893854);
    static final IntNum Lit137 = IntNum.make(4);
    static final PairWithPosition Lit138 = PairWithPosition.make(Lit169, PairWithPosition.make(Lit15, LList.Empty, "/tmp/1587589086324_0.21485239854188265-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 894040), "/tmp/1587589086324_0.21485239854188265-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 894034);
    static final PairWithPosition Lit139 = PairWithPosition.make(Lit168, PairWithPosition.make(Lit168, LList.Empty, "/tmp/1587589086324_0.21485239854188265-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 894079), "/tmp/1587589086324_0.21485239854188265-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 894074);
    static final IntNum Lit14 = IntNum.make(16777215);
    static final SimpleSymbol Lit140 = ((SimpleSymbol) new SimpleSymbol("ShowChooseDialog").readResolve());
    static final IntNum Lit141 = IntNum.make(5);
    static final PairWithPosition Lit142;
    static final PairWithPosition Lit143 = PairWithPosition.make(Lit19, PairWithPosition.make(Lit19, PairWithPosition.make(Lit19, LList.Empty, "/tmp/1587589086324_0.21485239854188265-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 894370), "/tmp/1587589086324_0.21485239854188265-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 894365), "/tmp/1587589086324_0.21485239854188265-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 894359);
    static final PairWithPosition Lit144 = PairWithPosition.make(Lit19, PairWithPosition.make(Lit19, PairWithPosition.make(Lit19, PairWithPosition.make(Lit19, PairWithPosition.make(Lit17, LList.Empty, "/tmp/1587589086324_0.21485239854188265-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 894474), "/tmp/1587589086324_0.21485239854188265-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 894469), "/tmp/1587589086324_0.21485239854188265-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 894464), "/tmp/1587589086324_0.21485239854188265-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 894459), "/tmp/1587589086324_0.21485239854188265-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 894453);
    static final PairWithPosition Lit145 = PairWithPosition.make(Lit19, LList.Empty, "/tmp/1587589086324_0.21485239854188265-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 894567);
    static final PairWithPosition Lit146 = PairWithPosition.make(Lit19, LList.Empty, "/tmp/1587589086324_0.21485239854188265-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 894681);
    static final SimpleSymbol Lit147 = ((SimpleSymbol) new SimpleSymbol("ShowAlert").readResolve());
    static final PairWithPosition Lit148 = PairWithPosition.make(Lit19, LList.Empty, "/tmp/1587589086324_0.21485239854188265-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 894823);
    static final PairWithPosition Lit149;
    static final SimpleSymbol Lit15;
    static final SimpleSymbol Lit150 = ((SimpleSymbol) new SimpleSymbol("Web1$GotText").readResolve());
    static final SimpleSymbol Lit151 = ((SimpleSymbol) new SimpleSymbol("GotText").readResolve());
    static final FString Lit152 = new FString("com.google.appinventor.components.runtime.TinyDB");
    static final FString Lit153 = new FString("com.google.appinventor.components.runtime.TinyDB");
    static final SimpleSymbol Lit154 = ((SimpleSymbol) new SimpleSymbol("get-simple-name").readResolve());
    static final SimpleSymbol Lit155 = ((SimpleSymbol) new SimpleSymbol("android-log-form").readResolve());
    static final SimpleSymbol Lit156 = ((SimpleSymbol) new SimpleSymbol("add-to-form-environment").readResolve());
    static final SimpleSymbol Lit157 = ((SimpleSymbol) new SimpleSymbol("lookup-in-form-environment").readResolve());
    static final SimpleSymbol Lit158 = ((SimpleSymbol) new SimpleSymbol("is-bound-in-form-environment").readResolve());
    static final SimpleSymbol Lit159 = ((SimpleSymbol) new SimpleSymbol("add-to-global-var-environment").readResolve());
    static final SimpleSymbol Lit16 = ((SimpleSymbol) new SimpleSymbol("ActionBar").readResolve());
    static final SimpleSymbol Lit160 = ((SimpleSymbol) new SimpleSymbol("add-to-events").readResolve());
    static final SimpleSymbol Lit161 = ((SimpleSymbol) new SimpleSymbol("add-to-components").readResolve());
    static final SimpleSymbol Lit162 = ((SimpleSymbol) new SimpleSymbol("add-to-global-vars").readResolve());
    static final SimpleSymbol Lit163 = ((SimpleSymbol) new SimpleSymbol("add-to-form-do-after-creation").readResolve());
    static final SimpleSymbol Lit164 = ((SimpleSymbol) new SimpleSymbol("send-error").readResolve());
    static final SimpleSymbol Lit165 = ((SimpleSymbol) new SimpleSymbol("dispatchEvent").readResolve());
    static final SimpleSymbol Lit166 = ((SimpleSymbol) new SimpleSymbol("dispatchGenericEvent").readResolve());
    static final SimpleSymbol Lit167 = ((SimpleSymbol) new SimpleSymbol("lookup-handler").readResolve());
    static final SimpleSymbol Lit168 = ((SimpleSymbol) new SimpleSymbol("any").readResolve());
    static final SimpleSymbol Lit169 = ((SimpleSymbol) new SimpleSymbol("list").readResolve());
    static final SimpleSymbol Lit17;
    static final SimpleSymbol Lit18 = ((SimpleSymbol) new SimpleSymbol("AppName").readResolve());
    static final SimpleSymbol Lit19;
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
    static final SimpleSymbol Lit3 = ((SimpleSymbol) new SimpleSymbol("p$db").readResolve());
    static final SimpleSymbol Lit30 = ((SimpleSymbol) new SimpleSymbol("Sizing").readResolve());
    static final SimpleSymbol Lit31 = ((SimpleSymbol) new SimpleSymbol("Theme").readResolve());
    static final SimpleSymbol Lit32 = ((SimpleSymbol) new SimpleSymbol("Title").readResolve());
    static final SimpleSymbol Lit33 = ((SimpleSymbol) new SimpleSymbol("TitleVisible").readResolve());
    static final FString Lit34 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit35 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement1").readResolve());
    static final SimpleSymbol Lit36 = ((SimpleSymbol) new SimpleSymbol("Height").readResolve());
    static final IntNum Lit37 = IntNum.make(-2);
    static final SimpleSymbol Lit38 = ((SimpleSymbol) new SimpleSymbol("Width").readResolve());
    static final FString Lit39 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit4 = ((SimpleSymbol) new SimpleSymbol(TinyDB.DEFAULT_NAMESPACE).readResolve());
    static final FString Lit40 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final SimpleSymbol Lit41 = ((SimpleSymbol) new SimpleSymbol("VerticalArrangement1").readResolve());
    static final SimpleSymbol Lit42 = ((SimpleSymbol) new SimpleSymbol("AlignHorizontal").readResolve());
    static final IntNum Lit43 = IntNum.make(3);
    static final SimpleSymbol Lit44 = ((SimpleSymbol) new SimpleSymbol("AlignVertical").readResolve());
    static final IntNum Lit45 = IntNum.make(2);
    static final FString Lit46 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final FString Lit47 = new FString("com.google.appinventor.components.runtime.Image");
    static final SimpleSymbol Lit48 = ((SimpleSymbol) new SimpleSymbol("Image1").readResolve());
    static final IntNum Lit49 = IntNum.make((int) HttpRequestContext.HTTP_OK);
    static final SimpleSymbol Lit5 = ((SimpleSymbol) new SimpleSymbol("StoreValue").readResolve());
    static final SimpleSymbol Lit50 = ((SimpleSymbol) new SimpleSymbol("Picture").readResolve());
    static final SimpleSymbol Lit51 = ((SimpleSymbol) new SimpleSymbol("ScalePictureToFit").readResolve());
    static final FString Lit52 = new FString("com.google.appinventor.components.runtime.Image");
    static final FString Lit53 = new FString("com.google.appinventor.components.runtime.TextBox");
    static final SimpleSymbol Lit54 = ((SimpleSymbol) new SimpleSymbol("TextBox1").readResolve());
    static final IntNum Lit55;
    static final SimpleSymbol Lit56 = ((SimpleSymbol) new SimpleSymbol("FontSize").readResolve());
    static final IntNum Lit57 = IntNum.make(15);
    static final SimpleSymbol Lit58 = ((SimpleSymbol) new SimpleSymbol("FontTypeface").readResolve());
    static final IntNum Lit59 = IntNum.make(1);
    static final SimpleSymbol Lit6 = ((SimpleSymbol) new SimpleSymbol("$tag").readResolve());
    static final IntNum Lit60 = IntNum.make(40);
    static final SimpleSymbol Lit61 = ((SimpleSymbol) new SimpleSymbol("Hint").readResolve());
    static final SimpleSymbol Lit62 = ((SimpleSymbol) new SimpleSymbol("TextAlignment").readResolve());
    static final SimpleSymbol Lit63 = ((SimpleSymbol) new SimpleSymbol("TextColor").readResolve());
    static final IntNum Lit64;
    static final IntNum Lit65 = IntNum.make(250);
    static final FString Lit66 = new FString("com.google.appinventor.components.runtime.TextBox");
    static final FString Lit67 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit68 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement2").readResolve());
    static final IntNum Lit69 = IntNum.make(10);
    static final SimpleSymbol Lit7 = ((SimpleSymbol) new SimpleSymbol("$value").readResolve());
    static final FString Lit70 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit71 = new FString("com.google.appinventor.components.runtime.PasswordTextBox");
    static final SimpleSymbol Lit72 = ((SimpleSymbol) new SimpleSymbol("PasswordTextBox1").readResolve());
    static final IntNum Lit73;
    static final IntNum Lit74;
    static final FString Lit75 = new FString("com.google.appinventor.components.runtime.PasswordTextBox");
    static final FString Lit76 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit77 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement3").readResolve());
    static final IntNum Lit78 = IntNum.make(20);
    static final FString Lit79 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final PairWithPosition Lit8 = PairWithPosition.make(Lit19, PairWithPosition.make(Lit168, LList.Empty, "/tmp/1587589086324_0.21485239854188265-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 32911), "/tmp/1587589086324_0.21485239854188265-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 32905);
    static final FString Lit80 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit81 = ((SimpleSymbol) new SimpleSymbol("Button1").readResolve());
    static final SimpleSymbol Lit82 = ((SimpleSymbol) new SimpleSymbol("FontBold").readResolve());
    static final SimpleSymbol Lit83 = ((SimpleSymbol) new SimpleSymbol("Image").readResolve());
    static final SimpleSymbol Lit84 = ((SimpleSymbol) new SimpleSymbol("Text").readResolve());
    static final FString Lit85 = new FString("com.google.appinventor.components.runtime.Button");
    static final PairWithPosition Lit86 = PairWithPosition.make(Lit19, PairWithPosition.make(Lit19, PairWithPosition.make(Lit19, PairWithPosition.make(Lit19, LList.Empty, "/tmp/1587589086324_0.21485239854188265-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 594161), "/tmp/1587589086324_0.21485239854188265-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 594156), "/tmp/1587589086324_0.21485239854188265-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 594151), "/tmp/1587589086324_0.21485239854188265-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 594145);
    static final PairWithPosition Lit87 = PairWithPosition.make(Lit19, PairWithPosition.make(Lit19, PairWithPosition.make(Lit19, LList.Empty, "/tmp/1587589086324_0.21485239854188265-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 594298), "/tmp/1587589086324_0.21485239854188265-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 594293), "/tmp/1587589086324_0.21485239854188265-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 594287);
    static final SimpleSymbol Lit88 = ((SimpleSymbol) new SimpleSymbol("Web1").readResolve());
    static final SimpleSymbol Lit89 = ((SimpleSymbol) new SimpleSymbol("Url").readResolve());
    static final PairWithPosition Lit9 = PairWithPosition.make(Lit19, PairWithPosition.make(Lit168, LList.Empty, "/tmp/1587589086324_0.21485239854188265-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 32911), "/tmp/1587589086324_0.21485239854188265-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 32905);
    static final SimpleSymbol Lit90 = ((SimpleSymbol) new SimpleSymbol("Get").readResolve());
    static final SimpleSymbol Lit91 = ((SimpleSymbol) new SimpleSymbol("Button1$Click").readResolve());
    static final SimpleSymbol Lit92 = ((SimpleSymbol) new SimpleSymbol("Click").readResolve());
    static final FString Lit93 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit94 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement4").readResolve());
    static final FString Lit95 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit96 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit97 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement5").readResolve());
    static final IntNum Lit98 = IntNum.make(50);
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

    static {
        SimpleSymbol simpleSymbol = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT).readResolve();
        Lit19 = simpleSymbol;
        SimpleSymbol simpleSymbol2 = Lit19;
        SimpleSymbol simpleSymbol3 = Lit19;
        SimpleSymbol simpleSymbol4 = Lit19;
        SimpleSymbol simpleSymbol5 = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_BOOLEAN).readResolve();
        Lit17 = simpleSymbol5;
        Lit149 = PairWithPosition.make(simpleSymbol, PairWithPosition.make(simpleSymbol2, PairWithPosition.make(simpleSymbol3, PairWithPosition.make(simpleSymbol4, PairWithPosition.make(simpleSymbol5, LList.Empty, "/tmp/1587589086324_0.21485239854188265-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 895080), "/tmp/1587589086324_0.21485239854188265-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 895075), "/tmp/1587589086324_0.21485239854188265-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 895070), "/tmp/1587589086324_0.21485239854188265-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 895065), "/tmp/1587589086324_0.21485239854188265-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 895059);
        SimpleSymbol simpleSymbol6 = Lit169;
        SimpleSymbol simpleSymbol7 = (SimpleSymbol) new SimpleSymbol("number").readResolve();
        Lit15 = simpleSymbol7;
        Lit142 = PairWithPosition.make(simpleSymbol6, PairWithPosition.make(simpleSymbol7, LList.Empty, "/tmp/1587589086324_0.21485239854188265-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 894321), "/tmp/1587589086324_0.21485239854188265-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Connexion.yail", 894315);
        int[] iArr = new int[2];
        iArr[0] = -16739081;
        Lit107 = IntNum.make(iArr);
        int[] iArr2 = new int[2];
        iArr2[0] = -1;
        Lit102 = IntNum.make(iArr2);
        int[] iArr3 = new int[2];
        iArr3[0] = -2105637;
        Lit74 = IntNum.make(iArr3);
        int[] iArr4 = new int[2];
        iArr4[0] = -14671580;
        Lit73 = IntNum.make(iArr4);
        int[] iArr5 = new int[2];
        iArr5[0] = -2105637;
        Lit64 = IntNum.make(iArr5);
        int[] iArr6 = new int[2];
        iArr6[0] = -14671580;
        Lit55 = IntNum.make(iArr6);
        int[] iArr7 = new int[2];
        iArr7[0] = -16777216;
        Lit21 = IntNum.make(iArr7);
    }

    public Connexion() {
        ModuleInfo.register(this);
        frame frame2 = new frame();
        frame2.$main = this;
        this.get$Mnsimple$Mnname = new ModuleMethod(frame2, 1, Lit154, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.onCreate = new ModuleMethod(frame2, 2, "onCreate", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.android$Mnlog$Mnform = new ModuleMethod(frame2, 3, Lit155, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(frame2, 4, Lit156, 8194);
        this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame2, 5, Lit157, 8193);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame2, 7, Lit158, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(frame2, 8, Lit159, 8194);
        this.add$Mnto$Mnevents = new ModuleMethod(frame2, 9, Lit160, 8194);
        this.add$Mnto$Mncomponents = new ModuleMethod(frame2, 10, Lit161, 16388);
        this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(frame2, 11, Lit162, 8194);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(frame2, 12, Lit163, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.send$Mnerror = new ModuleMethod(frame2, 13, Lit164, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.process$Mnexception = new ModuleMethod(frame2, 14, "process-exception", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.dispatchEvent = new ModuleMethod(frame2, 15, Lit165, 16388);
        this.dispatchGenericEvent = new ModuleMethod(frame2, 16, Lit166, 16388);
        this.lookup$Mnhandler = new ModuleMethod(frame2, 17, Lit167, 8194);
        ModuleMethod moduleMethod = new ModuleMethod(frame2, 18, (Object) null, 0);
        moduleMethod.setProperty("source-location", "/tmp/runtime4614685546883446523.scm:622");
        lambda$Fn1 = moduleMethod;
        this.$define = new ModuleMethod(frame2, 19, "$define", 0);
        lambda$Fn2 = new ModuleMethod(frame2, 20, (Object) null, 8194);
        lambda$Fn4 = new ModuleMethod(frame2, 21, (Object) null, 8194);
        lambda$Fn3 = new ModuleMethod(frame2, 22, (Object) null, 0);
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
        this.Button1$Click = new ModuleMethod(frame2, 43, Lit91, 0);
        lambda$Fn25 = new ModuleMethod(frame2, 44, (Object) null, 0);
        lambda$Fn26 = new ModuleMethod(frame2, 45, (Object) null, 0);
        lambda$Fn27 = new ModuleMethod(frame2, 46, (Object) null, 0);
        lambda$Fn28 = new ModuleMethod(frame2, 47, (Object) null, 0);
        lambda$Fn29 = new ModuleMethod(frame2, 48, (Object) null, 0);
        lambda$Fn30 = new ModuleMethod(frame2, 49, (Object) null, 0);
        lambda$Fn31 = new ModuleMethod(frame2, 50, (Object) null, 0);
        lambda$Fn32 = new ModuleMethod(frame2, 51, (Object) null, 0);
        this.Button2$Click = new ModuleMethod(frame2, 52, Lit110, 0);
        lambda$Fn33 = new ModuleMethod(frame2, 53, (Object) null, 0);
        lambda$Fn34 = new ModuleMethod(frame2, 54, (Object) null, 0);
        this.Notifier1$AfterChoosing = new ModuleMethod(frame2, 55, Lit122, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.Web1$GotText = new ModuleMethod(frame2, 56, Lit150, 16388);
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
        Connexion = null;
        this.form$Mnname$Mnsymbol = Lit0;
        this.events$Mnto$Mnregister = LList.Empty;
        this.components$Mnto$Mncreate = LList.Empty;
        this.global$Mnvars$Mnto$Mncreate = LList.Empty;
        this.form$Mndo$Mnafter$Mncreation = LList.Empty;
        runtime.$instance.run();
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit3, lambda$Fn2), $result);
        } else {
            addToGlobalVars(Lit3, lambda$Fn3);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit10, ""), $result);
        } else {
            addToGlobalVars(Lit10, lambda$Fn5);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit11, ""), $result);
        } else {
            addToGlobalVars(Lit11, lambda$Fn6);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit12, runtime.callYailPrimitive(runtime.make$Mnyail$Mnlist, LList.Empty, LList.Empty, "make a list")), $result);
        } else {
            addToGlobalVars(Lit12, lambda$Fn7);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.setAndCoerceProperty$Ex(Lit0, Lit13, Lit14, Lit15);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit16, Boolean.TRUE, Lit17);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit18, "MySadWorld", Lit19);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit20, Lit21, Lit15);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit22, "slidehorizontal", Lit19);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit23, "fade", Lit19);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit24, Lit25, Lit15);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit26, Lit27, Lit15);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit28, "portrait", Lit19);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit29, Boolean.TRUE, Lit17);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit30, "Fixed", Lit19);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit31, "AppTheme", Lit19);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit32, "Connexion", Lit19);
            Values.writeValues(runtime.setAndCoerceProperty$Ex(Lit0, Lit33, Boolean.FALSE, Lit17), $result);
        } else {
            addToFormDoAfterCreation(new Promise(lambda$Fn8));
        }
        this.HorizontalArrangement1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit34, Lit35, lambda$Fn9), $result);
        } else {
            addToComponents(Lit0, Lit39, Lit35, lambda$Fn10);
        }
        this.VerticalArrangement1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit35, Lit40, Lit41, lambda$Fn11), $result);
        } else {
            addToComponents(Lit35, Lit46, Lit41, lambda$Fn12);
        }
        this.Image1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit41, Lit47, Lit48, lambda$Fn13), $result);
        } else {
            addToComponents(Lit41, Lit52, Lit48, lambda$Fn14);
        }
        this.TextBox1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit41, Lit53, Lit54, lambda$Fn15), $result);
        } else {
            addToComponents(Lit41, Lit66, Lit54, lambda$Fn16);
        }
        this.HorizontalArrangement2 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit41, Lit67, Lit68, lambda$Fn17), $result);
        } else {
            addToComponents(Lit41, Lit70, Lit68, lambda$Fn18);
        }
        this.PasswordTextBox1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit41, Lit71, Lit72, lambda$Fn19), $result);
        } else {
            addToComponents(Lit41, Lit75, Lit72, lambda$Fn20);
        }
        this.HorizontalArrangement3 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit41, Lit76, Lit77, lambda$Fn21), $result);
        } else {
            addToComponents(Lit41, Lit79, Lit77, lambda$Fn22);
        }
        this.Button1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit41, Lit80, Lit81, lambda$Fn23), $result);
        } else {
            addToComponents(Lit41, Lit85, Lit81, lambda$Fn24);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit91, this.Button1$Click);
        } else {
            addToFormEnvironment(Lit91, this.Button1$Click);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Button1", "Click");
        } else {
            addToEvents(Lit81, Lit92);
        }
        this.HorizontalArrangement4 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit41, Lit93, Lit94, lambda$Fn25), $result);
        } else {
            addToComponents(Lit41, Lit95, Lit94, lambda$Fn26);
        }
        this.HorizontalArrangement5 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit96, Lit97, lambda$Fn27), $result);
        } else {
            addToComponents(Lit0, Lit99, Lit97, lambda$Fn28);
        }
        this.Label1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit97, Lit100, Lit101, lambda$Fn29), $result);
        } else {
            addToComponents(Lit97, Lit103, Lit101, lambda$Fn30);
        }
        this.Button2 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit97, Lit104, Lit105, lambda$Fn31), $result);
        } else {
            addToComponents(Lit97, Lit108, Lit105, lambda$Fn32);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit110, this.Button2$Click);
        } else {
            addToFormEnvironment(Lit110, this.Button2$Click);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Button2", "Click");
        } else {
            addToEvents(Lit105, Lit92);
        }
        this.HorizontalArrangement6 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit111, Lit112, lambda$Fn33), $result);
        } else {
            addToComponents(Lit0, Lit113, Lit112, lambda$Fn34);
        }
        this.Notifier1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit114, Lit115, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit116, Lit115, Boolean.FALSE);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit122, this.Notifier1$AfterChoosing);
        } else {
            addToFormEnvironment(Lit122, this.Notifier1$AfterChoosing);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Notifier1", "AfterChoosing");
        } else {
            addToEvents(Lit115, Lit123);
        }
        this.Web1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit124, Lit88, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit125, Lit88, Boolean.FALSE);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit150, this.Web1$GotText);
        } else {
            addToFormEnvironment(Lit150, this.Web1$GotText);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Web1", "GotText");
        } else {
            addToEvents(Lit88, Lit151);
        }
        this.TinyDB1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit152, Lit4, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit153, Lit4, Boolean.FALSE);
        }
        runtime.initRuntime();
    }

    static Object lambda3(Object $tag, Object $value) {
        SimpleSymbol simpleSymbol = Lit4;
        SimpleSymbol simpleSymbol2 = Lit5;
        if ($tag instanceof Package) {
            $tag = runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit6), " is not bound in the current context"), "Unbound Variable");
        }
        if ($value instanceof Package) {
            $value = runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit7), " is not bound in the current context"), "Unbound Variable");
        }
        return runtime.callComponentMethod(simpleSymbol, simpleSymbol2, LList.list2($tag, $value), Lit8);
    }

    static Procedure lambda4() {
        return lambda$Fn4;
    }

    static Object lambda5(Object $tag, Object $value) {
        SimpleSymbol simpleSymbol = Lit4;
        SimpleSymbol simpleSymbol2 = Lit5;
        if ($tag instanceof Package) {
            $tag = runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit6), " is not bound in the current context"), "Unbound Variable");
        }
        if ($value instanceof Package) {
            $value = runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit7), " is not bound in the current context"), "Unbound Variable");
        }
        return runtime.callComponentMethod(simpleSymbol, simpleSymbol2, LList.list2($tag, $value), Lit9);
    }

    static String lambda6() {
        return "";
    }

    static String lambda7() {
        return "";
    }

    static Object lambda8() {
        return runtime.callYailPrimitive(runtime.make$Mnyail$Mnlist, LList.Empty, LList.Empty, "make a list");
    }

    static Object lambda9() {
        runtime.setAndCoerceProperty$Ex(Lit0, Lit13, Lit14, Lit15);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit16, Boolean.TRUE, Lit17);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit18, "MySadWorld", Lit19);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit20, Lit21, Lit15);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit22, "slidehorizontal", Lit19);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit23, "fade", Lit19);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit24, Lit25, Lit15);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit26, Lit27, Lit15);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit28, "portrait", Lit19);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit29, Boolean.TRUE, Lit17);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit30, "Fixed", Lit19);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit31, "AppTheme", Lit19);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit32, "Connexion", Lit19);
        return runtime.setAndCoerceProperty$Ex(Lit0, Lit33, Boolean.FALSE, Lit17);
    }

    static Object lambda10() {
        runtime.setAndCoerceProperty$Ex(Lit35, Lit36, Lit37, Lit15);
        return runtime.setAndCoerceProperty$Ex(Lit35, Lit38, Lit37, Lit15);
    }

    static Object lambda11() {
        runtime.setAndCoerceProperty$Ex(Lit35, Lit36, Lit37, Lit15);
        return runtime.setAndCoerceProperty$Ex(Lit35, Lit38, Lit37, Lit15);
    }

    static Object lambda12() {
        runtime.setAndCoerceProperty$Ex(Lit41, Lit42, Lit43, Lit15);
        runtime.setAndCoerceProperty$Ex(Lit41, Lit44, Lit45, Lit15);
        runtime.setAndCoerceProperty$Ex(Lit41, Lit36, Lit37, Lit15);
        return runtime.setAndCoerceProperty$Ex(Lit41, Lit38, Lit37, Lit15);
    }

    static Object lambda13() {
        runtime.setAndCoerceProperty$Ex(Lit41, Lit42, Lit43, Lit15);
        runtime.setAndCoerceProperty$Ex(Lit41, Lit44, Lit45, Lit15);
        runtime.setAndCoerceProperty$Ex(Lit41, Lit36, Lit37, Lit15);
        return runtime.setAndCoerceProperty$Ex(Lit41, Lit38, Lit37, Lit15);
    }

    static Object lambda14() {
        runtime.setAndCoerceProperty$Ex(Lit48, Lit36, Lit49, Lit15);
        runtime.setAndCoerceProperty$Ex(Lit48, Lit50, "MSW_w.png", Lit19);
        runtime.setAndCoerceProperty$Ex(Lit48, Lit51, Boolean.TRUE, Lit17);
        return runtime.setAndCoerceProperty$Ex(Lit48, Lit38, Lit49, Lit15);
    }

    static Object lambda15() {
        runtime.setAndCoerceProperty$Ex(Lit48, Lit36, Lit49, Lit15);
        runtime.setAndCoerceProperty$Ex(Lit48, Lit50, "MSW_w.png", Lit19);
        runtime.setAndCoerceProperty$Ex(Lit48, Lit51, Boolean.TRUE, Lit17);
        return runtime.setAndCoerceProperty$Ex(Lit48, Lit38, Lit49, Lit15);
    }

    static Object lambda16() {
        runtime.setAndCoerceProperty$Ex(Lit54, Lit20, Lit55, Lit15);
        runtime.setAndCoerceProperty$Ex(Lit54, Lit56, Lit57, Lit15);
        runtime.setAndCoerceProperty$Ex(Lit54, Lit58, Lit59, Lit15);
        runtime.setAndCoerceProperty$Ex(Lit54, Lit36, Lit60, Lit15);
        runtime.setAndCoerceProperty$Ex(Lit54, Lit61, "Nom d'utilisateur", Lit19);
        runtime.setAndCoerceProperty$Ex(Lit54, Lit62, Lit59, Lit15);
        runtime.setAndCoerceProperty$Ex(Lit54, Lit63, Lit64, Lit15);
        return runtime.setAndCoerceProperty$Ex(Lit54, Lit38, Lit65, Lit15);
    }

    static Object lambda17() {
        runtime.setAndCoerceProperty$Ex(Lit54, Lit20, Lit55, Lit15);
        runtime.setAndCoerceProperty$Ex(Lit54, Lit56, Lit57, Lit15);
        runtime.setAndCoerceProperty$Ex(Lit54, Lit58, Lit59, Lit15);
        runtime.setAndCoerceProperty$Ex(Lit54, Lit36, Lit60, Lit15);
        runtime.setAndCoerceProperty$Ex(Lit54, Lit61, "Nom d'utilisateur", Lit19);
        runtime.setAndCoerceProperty$Ex(Lit54, Lit62, Lit59, Lit15);
        runtime.setAndCoerceProperty$Ex(Lit54, Lit63, Lit64, Lit15);
        return runtime.setAndCoerceProperty$Ex(Lit54, Lit38, Lit65, Lit15);
    }

    static Object lambda18() {
        runtime.setAndCoerceProperty$Ex(Lit68, Lit36, Lit69, Lit15);
        return runtime.setAndCoerceProperty$Ex(Lit68, Lit38, Lit37, Lit15);
    }

    static Object lambda19() {
        runtime.setAndCoerceProperty$Ex(Lit68, Lit36, Lit69, Lit15);
        return runtime.setAndCoerceProperty$Ex(Lit68, Lit38, Lit37, Lit15);
    }

    static Object lambda20() {
        runtime.setAndCoerceProperty$Ex(Lit72, Lit20, Lit73, Lit15);
        runtime.setAndCoerceProperty$Ex(Lit72, Lit56, Lit57, Lit15);
        runtime.setAndCoerceProperty$Ex(Lit72, Lit58, Lit59, Lit15);
        runtime.setAndCoerceProperty$Ex(Lit72, Lit36, Lit60, Lit15);
        runtime.setAndCoerceProperty$Ex(Lit72, Lit61, "Mot de passe", Lit19);
        runtime.setAndCoerceProperty$Ex(Lit72, Lit62, Lit59, Lit15);
        runtime.setAndCoerceProperty$Ex(Lit72, Lit63, Lit74, Lit15);
        return runtime.setAndCoerceProperty$Ex(Lit72, Lit38, Lit65, Lit15);
    }

    static Object lambda21() {
        runtime.setAndCoerceProperty$Ex(Lit72, Lit20, Lit73, Lit15);
        runtime.setAndCoerceProperty$Ex(Lit72, Lit56, Lit57, Lit15);
        runtime.setAndCoerceProperty$Ex(Lit72, Lit58, Lit59, Lit15);
        runtime.setAndCoerceProperty$Ex(Lit72, Lit36, Lit60, Lit15);
        runtime.setAndCoerceProperty$Ex(Lit72, Lit61, "Mot de passe", Lit19);
        runtime.setAndCoerceProperty$Ex(Lit72, Lit62, Lit59, Lit15);
        runtime.setAndCoerceProperty$Ex(Lit72, Lit63, Lit74, Lit15);
        return runtime.setAndCoerceProperty$Ex(Lit72, Lit38, Lit65, Lit15);
    }

    static Object lambda22() {
        runtime.setAndCoerceProperty$Ex(Lit77, Lit36, Lit78, Lit15);
        return runtime.setAndCoerceProperty$Ex(Lit77, Lit38, Lit37, Lit15);
    }

    static Object lambda23() {
        runtime.setAndCoerceProperty$Ex(Lit77, Lit36, Lit78, Lit15);
        return runtime.setAndCoerceProperty$Ex(Lit77, Lit38, Lit37, Lit15);
    }

    static Object lambda24() {
        runtime.setAndCoerceProperty$Ex(Lit81, Lit82, Boolean.TRUE, Lit17);
        runtime.setAndCoerceProperty$Ex(Lit81, Lit56, Lit57, Lit15);
        runtime.setAndCoerceProperty$Ex(Lit81, Lit58, Lit59, Lit15);
        runtime.setAndCoerceProperty$Ex(Lit81, Lit36, Lit60, Lit15);
        runtime.setAndCoerceProperty$Ex(Lit81, Lit83, "therare.png", Lit19);
        runtime.setAndCoerceProperty$Ex(Lit81, Lit84, "Connexion", Lit19);
        return runtime.setAndCoerceProperty$Ex(Lit81, Lit38, Lit65, Lit15);
    }

    static Object lambda25() {
        runtime.setAndCoerceProperty$Ex(Lit81, Lit82, Boolean.TRUE, Lit17);
        runtime.setAndCoerceProperty$Ex(Lit81, Lit56, Lit57, Lit15);
        runtime.setAndCoerceProperty$Ex(Lit81, Lit58, Lit59, Lit15);
        runtime.setAndCoerceProperty$Ex(Lit81, Lit36, Lit60, Lit15);
        runtime.setAndCoerceProperty$Ex(Lit81, Lit83, "therare.png", Lit19);
        runtime.setAndCoerceProperty$Ex(Lit81, Lit84, "Connexion", Lit19);
        return runtime.setAndCoerceProperty$Ex(Lit81, Lit38, Lit65, Lit15);
    }

    public Object Button1$Click() {
        runtime.setThisForm();
        runtime.addGlobalVarToCurrentFormEnvironment(Lit10, runtime.callYailPrimitive(strings.string$Mnappend, LList.list4("http://msw.kellis.fr/android/actions/login.php?username=", runtime.get$Mnproperty.apply2(Lit54, Lit84), "&password=", runtime.get$Mnproperty.apply2(Lit72, Lit84)), Lit86, "join"));
        runtime.addGlobalVarToCurrentFormEnvironment(Lit11, runtime.callYailPrimitive(runtime.string$Mnreplace$Mnall, LList.list3(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit10, runtime.$Stthe$Mnnull$Mnvalue$St), " ", "%20"), Lit87, "replace all"));
        runtime.setAndCoerceProperty$Ex(Lit88, Lit89, runtime.lookupGlobalVarInCurrentFormEnvironment(Lit11, runtime.$Stthe$Mnnull$Mnvalue$St), Lit19);
        return runtime.callComponentMethod(Lit88, Lit90, LList.Empty, LList.Empty);
    }

    static Object lambda26() {
        runtime.setAndCoerceProperty$Ex(Lit94, Lit36, Lit69, Lit15);
        return runtime.setAndCoerceProperty$Ex(Lit94, Lit38, Lit37, Lit15);
    }

    static Object lambda27() {
        runtime.setAndCoerceProperty$Ex(Lit94, Lit36, Lit69, Lit15);
        return runtime.setAndCoerceProperty$Ex(Lit94, Lit38, Lit37, Lit15);
    }

    static Object lambda28() {
        runtime.setAndCoerceProperty$Ex(Lit97, Lit42, Lit43, Lit15);
        runtime.setAndCoerceProperty$Ex(Lit97, Lit44, Lit45, Lit15);
        runtime.setAndCoerceProperty$Ex(Lit97, Lit36, Lit98, Lit15);
        return runtime.setAndCoerceProperty$Ex(Lit97, Lit38, Lit37, Lit15);
    }

    static Object lambda29() {
        runtime.setAndCoerceProperty$Ex(Lit97, Lit42, Lit43, Lit15);
        runtime.setAndCoerceProperty$Ex(Lit97, Lit44, Lit45, Lit15);
        runtime.setAndCoerceProperty$Ex(Lit97, Lit36, Lit98, Lit15);
        return runtime.setAndCoerceProperty$Ex(Lit97, Lit38, Lit37, Lit15);
    }

    static Object lambda30() {
        runtime.setAndCoerceProperty$Ex(Lit101, Lit58, Lit59, Lit15);
        runtime.setAndCoerceProperty$Ex(Lit101, Lit84, "Vous n'avez pas de compte ?", Lit19);
        return runtime.setAndCoerceProperty$Ex(Lit101, Lit63, Lit102, Lit15);
    }

    static Object lambda31() {
        runtime.setAndCoerceProperty$Ex(Lit101, Lit58, Lit59, Lit15);
        runtime.setAndCoerceProperty$Ex(Lit101, Lit84, "Vous n'avez pas de compte ?", Lit19);
        return runtime.setAndCoerceProperty$Ex(Lit101, Lit63, Lit102, Lit15);
    }

    static Object lambda32() {
        runtime.setAndCoerceProperty$Ex(Lit105, Lit20, Lit106, Lit15);
        runtime.setAndCoerceProperty$Ex(Lit105, Lit82, Boolean.TRUE, Lit17);
        runtime.setAndCoerceProperty$Ex(Lit105, Lit58, Lit59, Lit15);
        runtime.setAndCoerceProperty$Ex(Lit105, Lit84, "Inscrivez-vous", Lit19);
        return runtime.setAndCoerceProperty$Ex(Lit105, Lit63, Lit107, Lit15);
    }

    static Object lambda33() {
        runtime.setAndCoerceProperty$Ex(Lit105, Lit20, Lit106, Lit15);
        runtime.setAndCoerceProperty$Ex(Lit105, Lit82, Boolean.TRUE, Lit17);
        runtime.setAndCoerceProperty$Ex(Lit105, Lit58, Lit59, Lit15);
        runtime.setAndCoerceProperty$Ex(Lit105, Lit84, "Inscrivez-vous", Lit19);
        return runtime.setAndCoerceProperty$Ex(Lit105, Lit63, Lit107, Lit15);
    }

    public Object Button2$Click() {
        runtime.setThisForm();
        return runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen, LList.list1("Inscription"), Lit109, "open another screen");
    }

    static Object lambda34() {
        runtime.setAndCoerceProperty$Ex(Lit112, Lit36, Lit78, Lit15);
        return runtime.setAndCoerceProperty$Ex(Lit112, Lit38, Lit37, Lit15);
    }

    static Object lambda35() {
        runtime.setAndCoerceProperty$Ex(Lit112, Lit36, Lit78, Lit15);
        return runtime.setAndCoerceProperty$Ex(Lit112, Lit38, Lit37, Lit15);
    }

    public Object Notifier1$AfterChoosing(Object $choice) {
        Object obj;
        Object $choice2 = runtime.sanitizeComponentData($choice);
        runtime.setThisForm();
        ModuleMethod moduleMethod = runtime.yail$Mnequal$Qu;
        if ($choice2 instanceof Package) {
            obj = runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit117), " is not bound in the current context"), "Unbound Variable");
        } else {
            obj = $choice2;
        }
        if (runtime.callYailPrimitive(moduleMethod, LList.list2(obj, "Quitter"), Lit118, "=") != Boolean.FALSE) {
            return runtime.callYailPrimitive(runtime.close$Mnapplication, LList.Empty, LList.Empty, "close application");
        }
        ModuleMethod moduleMethod2 = runtime.yail$Mnequal$Qu;
        if ($choice2 instanceof Package) {
            $choice2 = runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit117), " is not bound in the current context"), "Unbound Variable");
        }
        return runtime.callYailPrimitive(moduleMethod2, LList.list2($choice2, "Accéder à l'application"), Lit119, "=") != Boolean.FALSE ? runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen, LList.list1("Accueil"), Lit120, "open another screen") : runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen, LList.list1("Accueil"), Lit121, "open another screen");
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
            $responseCode2 = runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit126), " is not bound in the current context"), "Unbound Variable");
        }
        if (runtime.callYailPrimitive(moduleMethod, LList.list2($responseCode2, "200"), Lit127, "=") != Boolean.FALSE) {
            SimpleSymbol simpleSymbol = Lit12;
            ModuleMethod moduleMethod2 = runtime.string$Mnsplit;
            if ($responseContent2 instanceof Package) {
                obj = runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit128), " is not bound in the current context"), "Unbound Variable");
            } else {
                obj = $responseContent2;
            }
            runtime.addGlobalVarToCurrentFormEnvironment(simpleSymbol, runtime.callYailPrimitive(moduleMethod2, LList.list2(obj, "/"), Lit129, "split"));
            if (runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2(runtime.callYailPrimitive(runtime.yail$Mnlist$Mnget$Mnitem, LList.list2(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit12, runtime.$Stthe$Mnnull$Mnvalue$St), Lit59), Lit130, "select list item"), "yes"), Lit131, "=") == Boolean.FALSE) {
                SimpleSymbol simpleSymbol2 = Lit115;
                SimpleSymbol simpleSymbol3 = Lit147;
                if ($responseContent2 instanceof Package) {
                    $responseContent2 = runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit128), " is not bound in the current context"), "Unbound Variable");
                }
                return runtime.callComponentMethod(simpleSymbol2, simpleSymbol3, LList.list1($responseContent2), Lit148);
            } else if (runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2(runtime.callYailPrimitive(runtime.yail$Mnlist$Mnget$Mnitem, LList.list2(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit12, runtime.$Stthe$Mnnull$Mnvalue$St), Lit43), Lit132, "select list item"), "1"), Lit133, "=") == Boolean.FALSE) {
                return runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen, LList.list1("Etape1"), Lit146, "open another screen");
            } else {
                Scheme.applyToArgs.apply3(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit3, runtime.$Stthe$Mnnull$Mnvalue$St), "user_id", runtime.callYailPrimitive(runtime.yail$Mnlist$Mnget$Mnitem, LList.list2(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit12, runtime.$Stthe$Mnnull$Mnvalue$St), Lit45), Lit134, "select list item"));
                Scheme.applyToArgs.apply3(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit3, runtime.$Stthe$Mnnull$Mnvalue$St), "name", runtime.callYailPrimitive(runtime.yail$Mnlist$Mnget$Mnitem, LList.list2(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit12, runtime.$Stthe$Mnnull$Mnvalue$St), Lit135), Lit136, "select list item"));
                if (runtime.callYailPrimitive(runtime.yail$Mnnot$Mnequal$Qu, LList.list2(runtime.callYailPrimitive(runtime.yail$Mnlist$Mnget$Mnitem, LList.list2(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit12, runtime.$Stthe$Mnnull$Mnvalue$St), Lit137), Lit138, "select list item"), "1"), Lit139, "=") == Boolean.FALSE) {
                    return runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen, LList.list1("Accueil"), Lit145, "open another screen");
                }
                SimpleSymbol simpleSymbol4 = Lit115;
                SimpleSymbol simpleSymbol5 = Lit140;
                Pair list1 = LList.list1(runtime.callYailPrimitive(runtime.string$Mnreplace$Mnall, LList.list3(runtime.callYailPrimitive(runtime.yail$Mnlist$Mnget$Mnitem, LList.list2(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit12, runtime.$Stthe$Mnnull$Mnvalue$St), Lit141), Lit142, "select list item"), "-", "/"), Lit143, "replace all"));
                LList.chain4(list1, "Attention !", "Accéder à l'application", "", Boolean.FALSE);
                return runtime.callComponentMethod(simpleSymbol4, simpleSymbol5, list1, Lit144);
            }
        } else {
            SimpleSymbol simpleSymbol6 = Lit115;
            SimpleSymbol simpleSymbol7 = Lit140;
            Pair list12 = LList.list1("Une grave erreur s'est produite lors du traitement de vos données. Réessayez dans quelques instants.");
            LList.chain4(list12, "Erreur", "Quitter", "", Boolean.FALSE);
            return runtime.callComponentMethod(simpleSymbol6, simpleSymbol7, list12, Lit149);
        }
    }

    /* compiled from: Connexion.yail */
    public class frame extends ModuleBody {
        Connexion $main;

        public int match1(ModuleMethod moduleMethod, Object obj, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 1:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 2:
                    if (!(obj instanceof Connexion)) {
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
                    if (!(obj instanceof Connexion)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 55:
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
                case 20:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 21:
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
                    callContext.pc = 4;
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
                    callContext.pc = 4;
                    return 0;
                case 56:
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
                case 55:
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
                case 56:
                    return this.$main.Web1$GotText(obj, obj2, obj3, obj4);
                default:
                    return super.apply4(moduleMethod, obj, obj2, obj3, obj4);
            }
        }

        public Object apply0(ModuleMethod moduleMethod) {
            switch (moduleMethod.selector) {
                case 18:
                    return Connexion.lambda2();
                case 19:
                    this.$main.$define();
                    return Values.empty;
                case 22:
                    return Connexion.lambda4();
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
                    return Connexion.lambda23();
                case 41:
                    return Connexion.lambda24();
                case 42:
                    return Connexion.lambda25();
                case 43:
                    return this.$main.Button1$Click();
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
                    return Connexion.lambda31();
                case 50:
                    return Connexion.lambda32();
                case 51:
                    return Connexion.lambda33();
                case 52:
                    return this.$main.Button2$Click();
                case 53:
                    return Connexion.lambda34();
                case 54:
                    return Connexion.lambda35();
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
                default:
                    return super.match0(moduleMethod, callContext);
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
                case 20:
                    return Connexion.lambda3(obj, obj2);
                case 21:
                    return Connexion.lambda5(obj, obj2);
                default:
                    return super.apply2(moduleMethod, obj, obj2);
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
        Connexion = this;
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
