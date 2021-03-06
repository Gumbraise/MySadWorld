package appinventor.ai_gumbraise.MySadWorld;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
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

/* compiled from: Screen1.yail */
public class Screen1 extends Form implements Runnable {
    static final SimpleSymbol Lit0 = ((SimpleSymbol) new SimpleSymbol("Screen1").readResolve());
    static final SimpleSymbol Lit1 = ((SimpleSymbol) new SimpleSymbol("getMessage").readResolve());
    static final SimpleSymbol Lit10 = ((SimpleSymbol) new SimpleSymbol("Url").readResolve());
    static final PairWithPosition Lit100 = PairWithPosition.make(Lit147, PairWithPosition.make(Lit27, LList.Empty, "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 492315), "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 492309);
    static final PairWithPosition Lit101 = PairWithPosition.make(Lit146, PairWithPosition.make(Lit146, LList.Empty, "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 492354), "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 492349);
    static final IntNum Lit102 = IntNum.make(4);
    static final PairWithPosition Lit103 = PairWithPosition.make(Lit147, PairWithPosition.make(Lit27, LList.Empty, "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 492525), "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 492519);
    static final PairWithPosition Lit104 = PairWithPosition.make(Lit146, PairWithPosition.make(Lit146, LList.Empty, "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 492564), "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 492559);
    static final SimpleSymbol Lit105 = ((SimpleSymbol) new SimpleSymbol("Notifier1").readResolve());
    static final SimpleSymbol Lit106 = ((SimpleSymbol) new SimpleSymbol("ShowChooseDialog").readResolve());
    static final IntNum Lit107 = IntNum.make(5);
    static final PairWithPosition Lit108 = PairWithPosition.make(Lit147, PairWithPosition.make(Lit27, LList.Empty, "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 492806), "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 492800);
    static final PairWithPosition Lit109 = PairWithPosition.make(Lit13, PairWithPosition.make(Lit13, PairWithPosition.make(Lit13, LList.Empty, "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 492855), "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 492850), "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 492844);
    static final SimpleSymbol Lit11 = ((SimpleSymbol) new SimpleSymbol("g$user_id").readResolve());
    static final PairWithPosition Lit110 = PairWithPosition.make(Lit13, PairWithPosition.make(Lit13, PairWithPosition.make(Lit13, PairWithPosition.make(Lit13, PairWithPosition.make(Lit29, LList.Empty, "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 492959), "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 492954), "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 492949), "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 492944), "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 492938);
    static final IntNum Lit111 = IntNum.make(6);
    static final PairWithPosition Lit112 = PairWithPosition.make(Lit147, PairWithPosition.make(Lit27, LList.Empty, "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 493093), "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 493087);
    static final PairWithPosition Lit113 = PairWithPosition.make(Lit13, LList.Empty, "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 493194);
    static final PairWithPosition Lit114 = PairWithPosition.make(Lit13, LList.Empty, "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 493308);
    static final PairWithPosition Lit115 = PairWithPosition.make(Lit13, LList.Empty, "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 493425);
    static final PairWithPosition Lit116 = PairWithPosition.make(Lit13, PairWithPosition.make(Lit13, PairWithPosition.make(Lit13, PairWithPosition.make(Lit13, PairWithPosition.make(Lit29, LList.Empty, "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 493653), "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 493648), "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 493643), "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 493638), "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 493632);
    static final PairWithPosition Lit117;
    static final SimpleSymbol Lit118 = ((SimpleSymbol) new SimpleSymbol("Web1$GotText").readResolve());
    static final SimpleSymbol Lit119 = ((SimpleSymbol) new SimpleSymbol("GotText").readResolve());
    static final PairWithPosition Lit12 = PairWithPosition.make(Lit13, PairWithPosition.make(Lit13, LList.Empty, "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 37060), "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 37054);
    static final FString Lit120 = new FString("com.google.appinventor.components.runtime.TinyDB");
    static final FString Lit121 = new FString("com.google.appinventor.components.runtime.TinyDB");
    static final FString Lit122 = new FString("com.google.appinventor.components.runtime.Notifier");
    static final FString Lit123 = new FString("com.google.appinventor.components.runtime.Notifier");
    static final SimpleSymbol Lit124 = ((SimpleSymbol) new SimpleSymbol("$choice").readResolve());
    static final PairWithPosition Lit125 = PairWithPosition.make(Lit146, PairWithPosition.make(Lit146, LList.Empty, "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 540770), "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 540765);
    static final PairWithPosition Lit126 = PairWithPosition.make(Lit146, PairWithPosition.make(Lit146, LList.Empty, "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 540988), "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 540983);
    static final PairWithPosition Lit127 = PairWithPosition.make(Lit146, PairWithPosition.make(Lit146, LList.Empty, "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 541158), "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 541153);
    static final PairWithPosition Lit128;
    static final PairWithPosition Lit129;
    static final SimpleSymbol Lit13;
    static final SimpleSymbol Lit130 = ((SimpleSymbol) new SimpleSymbol("Notifier1$AfterChoosing").readResolve());
    static final SimpleSymbol Lit131 = ((SimpleSymbol) new SimpleSymbol("AfterChoosing").readResolve());
    static final SimpleSymbol Lit132 = ((SimpleSymbol) new SimpleSymbol("get-simple-name").readResolve());
    static final SimpleSymbol Lit133 = ((SimpleSymbol) new SimpleSymbol("android-log-form").readResolve());
    static final SimpleSymbol Lit134 = ((SimpleSymbol) new SimpleSymbol("add-to-form-environment").readResolve());
    static final SimpleSymbol Lit135 = ((SimpleSymbol) new SimpleSymbol("lookup-in-form-environment").readResolve());
    static final SimpleSymbol Lit136 = ((SimpleSymbol) new SimpleSymbol("is-bound-in-form-environment").readResolve());
    static final SimpleSymbol Lit137 = ((SimpleSymbol) new SimpleSymbol("add-to-global-var-environment").readResolve());
    static final SimpleSymbol Lit138 = ((SimpleSymbol) new SimpleSymbol("add-to-events").readResolve());
    static final SimpleSymbol Lit139 = ((SimpleSymbol) new SimpleSymbol("add-to-components").readResolve());
    static final SimpleSymbol Lit14 = ((SimpleSymbol) new SimpleSymbol("Get").readResolve());
    static final SimpleSymbol Lit140 = ((SimpleSymbol) new SimpleSymbol("add-to-global-vars").readResolve());
    static final SimpleSymbol Lit141 = ((SimpleSymbol) new SimpleSymbol("add-to-form-do-after-creation").readResolve());
    static final SimpleSymbol Lit142 = ((SimpleSymbol) new SimpleSymbol("send-error").readResolve());
    static final SimpleSymbol Lit143 = ((SimpleSymbol) new SimpleSymbol("dispatchEvent").readResolve());
    static final SimpleSymbol Lit144 = ((SimpleSymbol) new SimpleSymbol("dispatchGenericEvent").readResolve());
    static final SimpleSymbol Lit145 = ((SimpleSymbol) new SimpleSymbol("lookup-handler").readResolve());
    static final SimpleSymbol Lit146 = ((SimpleSymbol) new SimpleSymbol("any").readResolve());
    static final SimpleSymbol Lit147 = ((SimpleSymbol) new SimpleSymbol("list").readResolve());
    static final PairWithPosition Lit15 = PairWithPosition.make(Lit13, PairWithPosition.make(Lit13, LList.Empty, "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 37060), "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 37054);
    static final PairWithPosition Lit16 = PairWithPosition.make(Lit13, PairWithPosition.make(Lit146, LList.Empty, "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 41064), "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 41058);
    static final PairWithPosition Lit17 = PairWithPosition.make(Lit13, PairWithPosition.make(Lit146, LList.Empty, "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 41064), "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 41058);
    static final SimpleSymbol Lit18 = ((SimpleSymbol) new SimpleSymbol("g$response").readResolve());
    static final SimpleSymbol Lit19 = ((SimpleSymbol) new SimpleSymbol("p$db").readResolve());
    static final SimpleSymbol Lit2 = ((SimpleSymbol) new SimpleSymbol("*the-null-value*").readResolve());
    static final SimpleSymbol Lit20 = ((SimpleSymbol) new SimpleSymbol("StoreValue").readResolve());
    static final SimpleSymbol Lit21 = ((SimpleSymbol) new SimpleSymbol("$tag").readResolve());
    static final SimpleSymbol Lit22 = ((SimpleSymbol) new SimpleSymbol("$value").readResolve());
    static final PairWithPosition Lit23 = PairWithPosition.make(Lit13, PairWithPosition.make(Lit146, LList.Empty, "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 49295), "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 49289);
    static final PairWithPosition Lit24 = PairWithPosition.make(Lit13, PairWithPosition.make(Lit146, LList.Empty, "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 49295), "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 49289);
    static final SimpleSymbol Lit25 = ((SimpleSymbol) new SimpleSymbol("AccentColor").readResolve());
    static final IntNum Lit26;
    static final SimpleSymbol Lit27;
    static final SimpleSymbol Lit28 = ((SimpleSymbol) new SimpleSymbol("ActionBar").readResolve());
    static final SimpleSymbol Lit29;
    static final SimpleSymbol Lit3 = ((SimpleSymbol) new SimpleSymbol("g$etape").readResolve());
    static final SimpleSymbol Lit30 = ((SimpleSymbol) new SimpleSymbol("AppName").readResolve());
    static final SimpleSymbol Lit31 = ((SimpleSymbol) new SimpleSymbol("BackgroundColor").readResolve());
    static final IntNum Lit32;
    static final SimpleSymbol Lit33 = ((SimpleSymbol) new SimpleSymbol("BackgroundImage").readResolve());
    static final SimpleSymbol Lit34 = ((SimpleSymbol) new SimpleSymbol("CloseScreenAnimation").readResolve());
    static final SimpleSymbol Lit35 = ((SimpleSymbol) new SimpleSymbol("Icon").readResolve());
    static final SimpleSymbol Lit36 = ((SimpleSymbol) new SimpleSymbol("OpenScreenAnimation").readResolve());
    static final SimpleSymbol Lit37 = ((SimpleSymbol) new SimpleSymbol("PrimaryColor").readResolve());
    static final IntNum Lit38;
    static final SimpleSymbol Lit39 = ((SimpleSymbol) new SimpleSymbol("PrimaryColorDark").readResolve());
    static final SimpleSymbol Lit4 = ((SimpleSymbol) new SimpleSymbol(TinyDB.DEFAULT_NAMESPACE).readResolve());
    static final IntNum Lit40;
    static final SimpleSymbol Lit41 = ((SimpleSymbol) new SimpleSymbol("ScreenOrientation").readResolve());
    static final SimpleSymbol Lit42 = ((SimpleSymbol) new SimpleSymbol("ShowListsAsJson").readResolve());
    static final SimpleSymbol Lit43 = ((SimpleSymbol) new SimpleSymbol("Sizing").readResolve());
    static final SimpleSymbol Lit44 = ((SimpleSymbol) new SimpleSymbol("Theme").readResolve());
    static final SimpleSymbol Lit45 = ((SimpleSymbol) new SimpleSymbol("Title").readResolve());
    static final SimpleSymbol Lit46 = ((SimpleSymbol) new SimpleSymbol("TitleVisible").readResolve());
    static final SimpleSymbol Lit47 = ((SimpleSymbol) new SimpleSymbol("VersionName").readResolve());
    static final SimpleSymbol Lit48 = ((SimpleSymbol) new SimpleSymbol("Screen1$Initialize").readResolve());
    static final SimpleSymbol Lit49 = ((SimpleSymbol) new SimpleSymbol("Initialize").readResolve());
    static final SimpleSymbol Lit5 = ((SimpleSymbol) new SimpleSymbol("GetValue").readResolve());
    static final FString Lit50 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit51 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement1").readResolve());
    static final IntNum Lit52 = IntNum.make(16777215);
    static final SimpleSymbol Lit53 = ((SimpleSymbol) new SimpleSymbol("Height").readResolve());
    static final IntNum Lit54 = IntNum.make(-2);
    static final SimpleSymbol Lit55 = ((SimpleSymbol) new SimpleSymbol("Width").readResolve());
    static final FString Lit56 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit57 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final SimpleSymbol Lit58 = ((SimpleSymbol) new SimpleSymbol("VerticalArrangement1").readResolve());
    static final SimpleSymbol Lit59 = ((SimpleSymbol) new SimpleSymbol("AlignHorizontal").readResolve());
    static final PairWithPosition Lit6 = PairWithPosition.make(Lit13, PairWithPosition.make(Lit146, LList.Empty, "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 32865), "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 32859);
    static final IntNum Lit60 = IntNum.make(3);
    static final SimpleSymbol Lit61 = ((SimpleSymbol) new SimpleSymbol("AlignVertical").readResolve());
    static final IntNum Lit62 = IntNum.make(2);
    static final IntNum Lit63 = IntNum.make(16777215);
    static final FString Lit64 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final FString Lit65 = new FString("com.google.appinventor.components.runtime.Image");
    static final SimpleSymbol Lit66 = ((SimpleSymbol) new SimpleSymbol("Image1").readResolve());
    static final IntNum Lit67 = IntNum.make((int) HttpRequestContext.HTTP_OK);
    static final SimpleSymbol Lit68 = ((SimpleSymbol) new SimpleSymbol("Picture").readResolve());
    static final SimpleSymbol Lit69 = ((SimpleSymbol) new SimpleSymbol("ScalePictureToFit").readResolve());
    static final PairWithPosition Lit7 = PairWithPosition.make(Lit13, PairWithPosition.make(Lit146, LList.Empty, "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 32865), "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 32859);
    static final FString Lit70 = new FString("com.google.appinventor.components.runtime.Image");
    static final FString Lit71 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit72 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement2").readResolve());
    static final IntNum Lit73 = IntNum.make(16777215);
    static final IntNum Lit74 = IntNum.make(20);
    static final FString Lit75 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit76 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit77 = ((SimpleSymbol) new SimpleSymbol("Label1").readResolve());
    static final SimpleSymbol Lit78 = ((SimpleSymbol) new SimpleSymbol("FontSize").readResolve());
    static final IntNum Lit79 = IntNum.make(14);
    static final SimpleSymbol Lit8 = ((SimpleSymbol) new SimpleSymbol("p$web").readResolve());
    static final SimpleSymbol Lit80 = ((SimpleSymbol) new SimpleSymbol("Text").readResolve());
    static final SimpleSymbol Lit81 = ((SimpleSymbol) new SimpleSymbol("TextAlignment").readResolve());
    static final IntNum Lit82 = IntNum.make(1);
    static final SimpleSymbol Lit83 = ((SimpleSymbol) new SimpleSymbol("TextColor").readResolve());
    static final IntNum Lit84;
    static final FString Lit85 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit86 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit87 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement3").readResolve());
    static final IntNum Lit88 = IntNum.make(16777215);
    static final IntNum Lit89 = IntNum.make(50);
    static final SimpleSymbol Lit9 = ((SimpleSymbol) new SimpleSymbol("Web1").readResolve());
    static final FString Lit90 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit91 = new FString("com.google.appinventor.components.runtime.Web");
    static final FString Lit92 = new FString("com.google.appinventor.components.runtime.Web");
    static final SimpleSymbol Lit93 = ((SimpleSymbol) new SimpleSymbol("$responseContent").readResolve());
    static final PairWithPosition Lit94 = PairWithPosition.make(Lit13, PairWithPosition.make(Lit13, LList.Empty, "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 491645), "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 491639);
    static final SimpleSymbol Lit95 = ((SimpleSymbol) new SimpleSymbol("$responseCode").readResolve());
    static final PairWithPosition Lit96 = PairWithPosition.make(Lit146, PairWithPosition.make(Lit146, LList.Empty, "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 491760), "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 491755);
    static final PairWithPosition Lit97 = PairWithPosition.make(Lit147, PairWithPosition.make(Lit27, LList.Empty, "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 491927), "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 491921);
    static final PairWithPosition Lit98 = PairWithPosition.make(Lit146, PairWithPosition.make(Lit146, LList.Empty, "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 491968), "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 491963);
    static final PairWithPosition Lit99 = PairWithPosition.make(Lit146, PairWithPosition.make(Lit146, LList.Empty, "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 492148), "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 492143);
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
    static final ModuleMethod lambda$Fn20 = null;
    static final ModuleMethod lambda$Fn21 = null;
    static final ModuleMethod lambda$Fn22 = null;
    static final ModuleMethod lambda$Fn23 = null;
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

    static {
        SimpleSymbol simpleSymbol = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT).readResolve();
        Lit13 = simpleSymbol;
        Lit129 = PairWithPosition.make(simpleSymbol, LList.Empty, "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 541392);
        SimpleSymbol simpleSymbol2 = Lit147;
        SimpleSymbol simpleSymbol3 = (SimpleSymbol) new SimpleSymbol("number").readResolve();
        Lit27 = simpleSymbol3;
        Lit128 = PairWithPosition.make(simpleSymbol2, PairWithPosition.make(simpleSymbol3, LList.Empty, "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 541291), "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 541285);
        SimpleSymbol simpleSymbol4 = Lit13;
        SimpleSymbol simpleSymbol5 = Lit13;
        SimpleSymbol simpleSymbol6 = Lit13;
        SimpleSymbol simpleSymbol7 = Lit13;
        SimpleSymbol simpleSymbol8 = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_BOOLEAN).readResolve();
        Lit29 = simpleSymbol8;
        Lit117 = PairWithPosition.make(simpleSymbol4, PairWithPosition.make(simpleSymbol5, PairWithPosition.make(simpleSymbol6, PairWithPosition.make(simpleSymbol7, PairWithPosition.make(simpleSymbol8, LList.Empty, "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 493859), "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 493854), "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 493849), "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 493844), "/tmp/1587666908834_0.2914019953505874-0/youngandroidproject/../src/appinventor/ai_gumbraise/MySadWorld/Screen1.yail", 493838);
        int[] iArr = new int[2];
        iArr[0] = -1;
        Lit84 = IntNum.make(iArr);
        int[] iArr2 = new int[2];
        iArr2[0] = -16777216;
        Lit40 = IntNum.make(iArr2);
        int[] iArr3 = new int[2];
        iArr3[0] = -16777216;
        Lit38 = IntNum.make(iArr3);
        int[] iArr4 = new int[2];
        iArr4[0] = -16777216;
        Lit32 = IntNum.make(iArr4);
        int[] iArr5 = new int[2];
        iArr5[0] = -6019137;
        Lit26 = IntNum.make(iArr5);
    }

    public Screen1() {
        ModuleInfo.register(this);
        frame frame2 = new frame();
        frame2.$main = this;
        this.get$Mnsimple$Mnname = new ModuleMethod(frame2, 1, Lit132, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.onCreate = new ModuleMethod(frame2, 2, "onCreate", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.android$Mnlog$Mnform = new ModuleMethod(frame2, 3, Lit133, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(frame2, 4, Lit134, 8194);
        this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame2, 5, Lit135, 8193);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame2, 7, Lit136, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(frame2, 8, Lit137, 8194);
        this.add$Mnto$Mnevents = new ModuleMethod(frame2, 9, Lit138, 8194);
        this.add$Mnto$Mncomponents = new ModuleMethod(frame2, 10, Lit139, 16388);
        this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(frame2, 11, Lit140, 8194);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(frame2, 12, Lit141, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.send$Mnerror = new ModuleMethod(frame2, 13, Lit142, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.process$Mnexception = new ModuleMethod(frame2, 14, "process-exception", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.dispatchEvent = new ModuleMethod(frame2, 15, Lit143, 16388);
        this.dispatchGenericEvent = new ModuleMethod(frame2, 16, Lit144, 16388);
        this.lookup$Mnhandler = new ModuleMethod(frame2, 17, Lit145, 8194);
        ModuleMethod moduleMethod = new ModuleMethod(frame2, 18, (Object) null, 0);
        moduleMethod.setProperty("source-location", "/tmp/runtime8949535697318280206.scm:622");
        lambda$Fn1 = moduleMethod;
        this.$define = new ModuleMethod(frame2, 19, "$define", 0);
        lambda$Fn2 = new ModuleMethod(frame2, 20, (Object) null, 0);
        lambda$Fn3 = new ModuleMethod(frame2, 21, (Object) null, 0);
        lambda$Fn5 = new ModuleMethod(frame2, 22, (Object) null, 0);
        lambda$Fn4 = new ModuleMethod(frame2, 23, (Object) null, 0);
        lambda$Fn6 = new ModuleMethod(frame2, 24, (Object) null, 0);
        lambda$Fn7 = new ModuleMethod(frame2, 25, (Object) null, 0);
        lambda$Fn8 = new ModuleMethod(frame2, 26, (Object) null, 8194);
        lambda$Fn10 = new ModuleMethod(frame2, 27, (Object) null, 8194);
        lambda$Fn9 = new ModuleMethod(frame2, 28, (Object) null, 0);
        lambda$Fn11 = new ModuleMethod(frame2, 29, (Object) null, 0);
        this.Screen1$Initialize = new ModuleMethod(frame2, 30, Lit48, 0);
        lambda$Fn12 = new ModuleMethod(frame2, 31, (Object) null, 0);
        lambda$Fn13 = new ModuleMethod(frame2, 32, (Object) null, 0);
        lambda$Fn14 = new ModuleMethod(frame2, 33, (Object) null, 0);
        lambda$Fn15 = new ModuleMethod(frame2, 34, (Object) null, 0);
        lambda$Fn16 = new ModuleMethod(frame2, 35, (Object) null, 0);
        lambda$Fn17 = new ModuleMethod(frame2, 36, (Object) null, 0);
        lambda$Fn18 = new ModuleMethod(frame2, 37, (Object) null, 0);
        lambda$Fn19 = new ModuleMethod(frame2, 38, (Object) null, 0);
        lambda$Fn20 = new ModuleMethod(frame2, 39, (Object) null, 0);
        lambda$Fn21 = new ModuleMethod(frame2, 40, (Object) null, 0);
        lambda$Fn22 = new ModuleMethod(frame2, 41, (Object) null, 0);
        lambda$Fn23 = new ModuleMethod(frame2, 42, (Object) null, 0);
        this.Web1$GotText = new ModuleMethod(frame2, 43, Lit118, 16388);
        this.Notifier1$AfterChoosing = new ModuleMethod(frame2, 44, Lit130, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
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
        Screen1 = null;
        this.form$Mnname$Mnsymbol = Lit0;
        this.events$Mnto$Mnregister = LList.Empty;
        this.components$Mnto$Mncreate = LList.Empty;
        this.global$Mnvars$Mnto$Mncreate = LList.Empty;
        this.form$Mndo$Mnafter$Mncreation = LList.Empty;
        runtime.$instance.run();
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit3, runtime.callComponentMethod(Lit4, Lit5, LList.list2("etape", "0"), Lit6)), $result);
        } else {
            addToGlobalVars(Lit3, lambda$Fn2);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit8, lambda$Fn3), $result);
        } else {
            addToGlobalVars(Lit8, lambda$Fn4);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit11, runtime.callComponentMethod(Lit4, Lit5, LList.list2("user_id", "NULL"), Lit16)), $result);
        } else {
            addToGlobalVars(Lit11, lambda$Fn6);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit18, runtime.callYailPrimitive(runtime.make$Mnyail$Mnlist, LList.Empty, LList.Empty, "make a list")), $result);
        } else {
            addToGlobalVars(Lit18, lambda$Fn7);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit19, lambda$Fn8), $result);
        } else {
            addToGlobalVars(Lit19, lambda$Fn9);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.setAndCoerceProperty$Ex(Lit0, Lit25, Lit26, Lit27);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit28, Boolean.TRUE, Lit29);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit30, "MySadWorld", Lit13);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit31, Lit32, Lit27);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit33, "MSW_f.png", Lit13);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit34, "fade", Lit13);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit35, "MSW.png", Lit13);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit36, "fade", Lit13);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit37, Lit38, Lit27);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit39, Lit40, Lit27);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit41, "portrait", Lit13);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit42, Boolean.TRUE, Lit29);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit43, "Responsive", Lit13);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit44, "AppTheme", Lit13);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit45, "Init", Lit13);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit46, Boolean.FALSE, Lit29);
            Values.writeValues(runtime.setAndCoerceProperty$Ex(Lit0, Lit47, "1.4", Lit13), $result);
        } else {
            addToFormDoAfterCreation(new Promise(lambda$Fn11));
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit48, this.Screen1$Initialize);
        } else {
            addToFormEnvironment(Lit48, this.Screen1$Initialize);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Screen1", "Initialize");
        } else {
            addToEvents(Lit0, Lit49);
        }
        this.HorizontalArrangement1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit50, Lit51, lambda$Fn12), $result);
        } else {
            addToComponents(Lit0, Lit56, Lit51, lambda$Fn13);
        }
        this.VerticalArrangement1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit51, Lit57, Lit58, lambda$Fn14), $result);
        } else {
            addToComponents(Lit51, Lit64, Lit58, lambda$Fn15);
        }
        this.Image1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit58, Lit65, Lit66, lambda$Fn16), $result);
        } else {
            addToComponents(Lit58, Lit70, Lit66, lambda$Fn17);
        }
        this.HorizontalArrangement2 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit71, Lit72, lambda$Fn18), $result);
        } else {
            addToComponents(Lit0, Lit75, Lit72, lambda$Fn19);
        }
        this.Label1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit72, Lit76, Lit77, lambda$Fn20), $result);
        } else {
            addToComponents(Lit72, Lit85, Lit77, lambda$Fn21);
        }
        this.HorizontalArrangement3 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit86, Lit87, lambda$Fn22), $result);
        } else {
            addToComponents(Lit0, Lit90, Lit87, lambda$Fn23);
        }
        this.Web1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit91, Lit9, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit92, Lit9, Boolean.FALSE);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit118, this.Web1$GotText);
        } else {
            addToFormEnvironment(Lit118, this.Web1$GotText);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Web1", "GotText");
        } else {
            addToEvents(Lit9, Lit119);
        }
        this.TinyDB1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit120, Lit4, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit121, Lit4, Boolean.FALSE);
        }
        this.Notifier1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit122, Lit105, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit123, Lit105, Boolean.FALSE);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit130, this.Notifier1$AfterChoosing);
        } else {
            addToFormEnvironment(Lit130, this.Notifier1$AfterChoosing);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Notifier1", "AfterChoosing");
        } else {
            addToEvents(Lit105, Lit131);
        }
        runtime.initRuntime();
    }

    /* compiled from: Screen1.yail */
    public class frame extends ModuleBody {
        Screen1 $main;

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
                    return Screen1.lambda6();
                case 23:
                    return Screen1.lambda5();
                case 24:
                    return Screen1.lambda7();
                case 25:
                    return Screen1.lambda8();
                case 28:
                    return Screen1.lambda10();
                case 29:
                    return Screen1.lambda12();
                case 30:
                    return this.$main.Screen1$Initialize();
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
                case 39:
                    return Screen1.lambda21();
                case 40:
                    return Screen1.lambda22();
                case 41:
                    return Screen1.lambda23();
                case 42:
                    return Screen1.lambda24();
                default:
                    return super.apply0(moduleMethod);
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
                case 26:
                    return Screen1.lambda9(obj, obj2);
                case 27:
                    return Screen1.lambda11(obj, obj2);
                default:
                    return super.apply2(moduleMethod, obj, obj2);
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
                    if (!(obj instanceof Screen1)) {
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
                    if (!(obj instanceof Screen1)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 44:
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
                case 26:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 27:
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
                    callContext.pc = 4;
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
                    callContext.pc = 4;
                    return 0;
                case 43:
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
                case 43:
                    return this.$main.Web1$GotText(obj, obj2, obj3, obj4);
                default:
                    return super.apply4(moduleMethod, obj, obj2, obj3, obj4);
            }
        }
    }

    static Object lambda3() {
        return runtime.callComponentMethod(Lit4, Lit5, LList.list2("etape", "0"), Lit7);
    }

    static Object lambda4() {
        runtime.setAndCoerceProperty$Ex(Lit9, Lit10, runtime.callYailPrimitive(strings.string$Mnappend, LList.list2("http://msw.kellis.fr/android/actions/maintenance.php?id=", runtime.lookupGlobalVarInCurrentFormEnvironment(Lit11, runtime.$Stthe$Mnnull$Mnvalue$St)), Lit12, "join"), Lit13);
        return runtime.callComponentMethod(Lit9, Lit14, LList.Empty, LList.Empty);
    }

    static Procedure lambda5() {
        return lambda$Fn5;
    }

    static Object lambda6() {
        runtime.setAndCoerceProperty$Ex(Lit9, Lit10, runtime.callYailPrimitive(strings.string$Mnappend, LList.list2("http://msw.kellis.fr/android/actions/maintenance.php?id=", runtime.lookupGlobalVarInCurrentFormEnvironment(Lit11, runtime.$Stthe$Mnnull$Mnvalue$St)), Lit15, "join"), Lit13);
        return runtime.callComponentMethod(Lit9, Lit14, LList.Empty, LList.Empty);
    }

    static Object lambda7() {
        return runtime.callComponentMethod(Lit4, Lit5, LList.list2("user_id", "NULL"), Lit17);
    }

    static Object lambda8() {
        return runtime.callYailPrimitive(runtime.make$Mnyail$Mnlist, LList.Empty, LList.Empty, "make a list");
    }

    static Procedure lambda10() {
        return lambda$Fn10;
    }

    static Object lambda11(Object $tag, Object $value) {
        SimpleSymbol simpleSymbol = Lit4;
        SimpleSymbol simpleSymbol2 = Lit20;
        if ($tag instanceof Package) {
            $tag = runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit21), " is not bound in the current context"), "Unbound Variable");
        }
        if ($value instanceof Package) {
            $value = runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit22), " is not bound in the current context"), "Unbound Variable");
        }
        return runtime.callComponentMethod(simpleSymbol, simpleSymbol2, LList.list2($tag, $value), Lit24);
    }

    static Object lambda9(Object $tag, Object $value) {
        SimpleSymbol simpleSymbol = Lit4;
        SimpleSymbol simpleSymbol2 = Lit20;
        if ($tag instanceof Package) {
            $tag = runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit21), " is not bound in the current context"), "Unbound Variable");
        }
        if ($value instanceof Package) {
            $value = runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit22), " is not bound in the current context"), "Unbound Variable");
        }
        return runtime.callComponentMethod(simpleSymbol, simpleSymbol2, LList.list2($tag, $value), Lit23);
    }

    static Object lambda12() {
        runtime.setAndCoerceProperty$Ex(Lit0, Lit25, Lit26, Lit27);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit28, Boolean.TRUE, Lit29);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit30, "MySadWorld", Lit13);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit31, Lit32, Lit27);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit33, "MSW_f.png", Lit13);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit34, "fade", Lit13);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit35, "MSW.png", Lit13);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit36, "fade", Lit13);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit37, Lit38, Lit27);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit39, Lit40, Lit27);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit41, "portrait", Lit13);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit42, Boolean.TRUE, Lit29);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit43, "Responsive", Lit13);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit44, "AppTheme", Lit13);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit45, "Init", Lit13);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit46, Boolean.FALSE, Lit29);
        return runtime.setAndCoerceProperty$Ex(Lit0, Lit47, "1.4", Lit13);
    }

    public Object Screen1$Initialize() {
        runtime.setThisForm();
        return Scheme.applyToArgs.apply1(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit8, runtime.$Stthe$Mnnull$Mnvalue$St));
    }

    static Object lambda13() {
        runtime.setAndCoerceProperty$Ex(Lit51, Lit31, Lit52, Lit27);
        runtime.setAndCoerceProperty$Ex(Lit51, Lit53, Lit54, Lit27);
        return runtime.setAndCoerceProperty$Ex(Lit51, Lit55, Lit54, Lit27);
    }

    static Object lambda14() {
        runtime.setAndCoerceProperty$Ex(Lit51, Lit31, Lit52, Lit27);
        runtime.setAndCoerceProperty$Ex(Lit51, Lit53, Lit54, Lit27);
        return runtime.setAndCoerceProperty$Ex(Lit51, Lit55, Lit54, Lit27);
    }

    static Object lambda15() {
        runtime.setAndCoerceProperty$Ex(Lit58, Lit59, Lit60, Lit27);
        runtime.setAndCoerceProperty$Ex(Lit58, Lit61, Lit62, Lit27);
        runtime.setAndCoerceProperty$Ex(Lit58, Lit31, Lit63, Lit27);
        runtime.setAndCoerceProperty$Ex(Lit58, Lit53, Lit54, Lit27);
        return runtime.setAndCoerceProperty$Ex(Lit58, Lit55, Lit54, Lit27);
    }

    static Object lambda16() {
        runtime.setAndCoerceProperty$Ex(Lit58, Lit59, Lit60, Lit27);
        runtime.setAndCoerceProperty$Ex(Lit58, Lit61, Lit62, Lit27);
        runtime.setAndCoerceProperty$Ex(Lit58, Lit31, Lit63, Lit27);
        runtime.setAndCoerceProperty$Ex(Lit58, Lit53, Lit54, Lit27);
        return runtime.setAndCoerceProperty$Ex(Lit58, Lit55, Lit54, Lit27);
    }

    static Object lambda17() {
        runtime.setAndCoerceProperty$Ex(Lit66, Lit53, Lit67, Lit27);
        runtime.setAndCoerceProperty$Ex(Lit66, Lit68, "MSW_w.png", Lit13);
        runtime.setAndCoerceProperty$Ex(Lit66, Lit69, Boolean.TRUE, Lit29);
        return runtime.setAndCoerceProperty$Ex(Lit66, Lit55, Lit67, Lit27);
    }

    static Object lambda18() {
        runtime.setAndCoerceProperty$Ex(Lit66, Lit53, Lit67, Lit27);
        runtime.setAndCoerceProperty$Ex(Lit66, Lit68, "MSW_w.png", Lit13);
        runtime.setAndCoerceProperty$Ex(Lit66, Lit69, Boolean.TRUE, Lit29);
        return runtime.setAndCoerceProperty$Ex(Lit66, Lit55, Lit67, Lit27);
    }

    static Object lambda19() {
        runtime.setAndCoerceProperty$Ex(Lit72, Lit59, Lit60, Lit27);
        runtime.setAndCoerceProperty$Ex(Lit72, Lit61, Lit62, Lit27);
        runtime.setAndCoerceProperty$Ex(Lit72, Lit31, Lit73, Lit27);
        runtime.setAndCoerceProperty$Ex(Lit72, Lit53, Lit74, Lit27);
        return runtime.setAndCoerceProperty$Ex(Lit72, Lit55, Lit54, Lit27);
    }

    static Object lambda20() {
        runtime.setAndCoerceProperty$Ex(Lit72, Lit59, Lit60, Lit27);
        runtime.setAndCoerceProperty$Ex(Lit72, Lit61, Lit62, Lit27);
        runtime.setAndCoerceProperty$Ex(Lit72, Lit31, Lit73, Lit27);
        runtime.setAndCoerceProperty$Ex(Lit72, Lit53, Lit74, Lit27);
        return runtime.setAndCoerceProperty$Ex(Lit72, Lit55, Lit54, Lit27);
    }

    static Object lambda21() {
        runtime.setAndCoerceProperty$Ex(Lit77, Lit78, Lit79, Lit27);
        runtime.setAndCoerceProperty$Ex(Lit77, Lit80, "...", Lit13);
        runtime.setAndCoerceProperty$Ex(Lit77, Lit81, Lit82, Lit27);
        return runtime.setAndCoerceProperty$Ex(Lit77, Lit83, Lit84, Lit27);
    }

    static Object lambda22() {
        runtime.setAndCoerceProperty$Ex(Lit77, Lit78, Lit79, Lit27);
        runtime.setAndCoerceProperty$Ex(Lit77, Lit80, "...", Lit13);
        runtime.setAndCoerceProperty$Ex(Lit77, Lit81, Lit82, Lit27);
        return runtime.setAndCoerceProperty$Ex(Lit77, Lit83, Lit84, Lit27);
    }

    static Object lambda23() {
        runtime.setAndCoerceProperty$Ex(Lit87, Lit31, Lit88, Lit27);
        runtime.setAndCoerceProperty$Ex(Lit87, Lit53, Lit89, Lit27);
        return runtime.setAndCoerceProperty$Ex(Lit87, Lit55, Lit54, Lit27);
    }

    static Object lambda24() {
        runtime.setAndCoerceProperty$Ex(Lit87, Lit31, Lit88, Lit27);
        runtime.setAndCoerceProperty$Ex(Lit87, Lit53, Lit89, Lit27);
        return runtime.setAndCoerceProperty$Ex(Lit87, Lit55, Lit54, Lit27);
    }

    public Object Web1$GotText(Object $url, Object $responseCode, Object $responseType, Object $responseContent) {
        runtime.sanitizeComponentData($url);
        Object $responseCode2 = runtime.sanitizeComponentData($responseCode);
        runtime.sanitizeComponentData($responseType);
        Object $responseContent2 = runtime.sanitizeComponentData($responseContent);
        runtime.setThisForm();
        SimpleSymbol simpleSymbol = Lit18;
        ModuleMethod moduleMethod = runtime.string$Mnsplit;
        if ($responseContent2 instanceof Package) {
            $responseContent2 = runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit93), " is not bound in the current context"), "Unbound Variable");
        }
        runtime.addGlobalVarToCurrentFormEnvironment(simpleSymbol, runtime.callYailPrimitive(moduleMethod, LList.list2($responseContent2, "/"), Lit94, "split"));
        ModuleMethod moduleMethod2 = runtime.yail$Mnequal$Qu;
        if ($responseCode2 instanceof Package) {
            $responseCode2 = runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit95), " is not bound in the current context"), "Unbound Variable");
        }
        if (runtime.callYailPrimitive(moduleMethod2, LList.list2($responseCode2, "200"), Lit96, "=") == Boolean.FALSE) {
            SimpleSymbol simpleSymbol2 = Lit105;
            SimpleSymbol simpleSymbol3 = Lit106;
            Pair list1 = LList.list1("Vous n'êtes pas connecté à Internet");
            LList.chain4(list1, "Erreur", "Réessayer", "", Boolean.FALSE);
            return runtime.callComponentMethod(simpleSymbol2, simpleSymbol3, list1, Lit117);
        } else if (runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2(runtime.callYailPrimitive(runtime.yail$Mnlist$Mnget$Mnitem, LList.list2(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit18, runtime.$Stthe$Mnnull$Mnvalue$St), Lit82), Lit97, "select list item"), "yes"), Lit98, "=") != Boolean.FALSE) {
            runtime.setAndCoerceProperty$Ex(Lit77, Lit80, "Initialisation...", Lit13);
            if (runtime.callYailPrimitive(runtime.yail$Mnnot$Mnequal$Qu, LList.list2(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit11, runtime.$Stthe$Mnnull$Mnvalue$St), "NULL"), Lit99, "=") == Boolean.FALSE) {
                return runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen, LList.list1("Connexion"), Lit115, "open another screen");
            }
            if (runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2(runtime.callYailPrimitive(runtime.yail$Mnlist$Mnget$Mnitem, LList.list2(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit18, runtime.$Stthe$Mnnull$Mnvalue$St), Lit60), Lit100, "select list item"), "1"), Lit101, "=") == Boolean.FALSE) {
                return runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen, LList.list1("Etape1"), Lit114, "open another screen");
            }
            if (runtime.callYailPrimitive(runtime.yail$Mnnot$Mnequal$Qu, LList.list2(runtime.callYailPrimitive(runtime.yail$Mnlist$Mnget$Mnitem, LList.list2(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit18, runtime.$Stthe$Mnnull$Mnvalue$St), Lit102), Lit103, "select list item"), "1"), Lit104, "=") != Boolean.FALSE) {
                SimpleSymbol simpleSymbol4 = Lit105;
                SimpleSymbol simpleSymbol5 = Lit106;
                Pair list12 = LList.list1(runtime.callYailPrimitive(runtime.string$Mnreplace$Mnall, LList.list3(runtime.callYailPrimitive(runtime.yail$Mnlist$Mnget$Mnitem, LList.list2(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit18, runtime.$Stthe$Mnnull$Mnvalue$St), Lit107), Lit108, "select list item"), "-", "/"), Lit109, "replace all"));
                LList.chain4(list12, "Attention !", "Accéder à l'application", "", Boolean.FALSE);
                return runtime.callComponentMethod(simpleSymbol4, simpleSymbol5, list12, Lit110);
            }
            Scheme.applyToArgs.apply3(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit19, runtime.$Stthe$Mnnull$Mnvalue$St), "name", runtime.callYailPrimitive(runtime.yail$Mnlist$Mnget$Mnitem, LList.list2(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit18, runtime.$Stthe$Mnnull$Mnvalue$St), Lit111), Lit112, "select list item"));
            return runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen, LList.list1("Accueil"), Lit113, "open another screen");
        } else {
            SimpleSymbol simpleSymbol6 = Lit105;
            SimpleSymbol simpleSymbol7 = Lit106;
            Pair list13 = LList.list1("MySadWorld est en rénovation. Revenez un peu plus tard");
            LList.chain4(list13, "Maintenance", "OK", "", Boolean.FALSE);
            return runtime.callComponentMethod(simpleSymbol6, simpleSymbol7, list13, Lit116);
        }
    }

    public Object Notifier1$AfterChoosing(Object $choice) {
        Object obj;
        Object obj2;
        Object $choice2 = runtime.sanitizeComponentData($choice);
        runtime.setThisForm();
        ModuleMethod moduleMethod = runtime.yail$Mnequal$Qu;
        if ($choice2 instanceof Package) {
            obj = runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit124), " is not bound in the current context"), "Unbound Variable");
        } else {
            obj = $choice2;
        }
        if (runtime.callYailPrimitive(moduleMethod, LList.list2(obj, "OK"), Lit125, "=") != Boolean.FALSE) {
            return runtime.callYailPrimitive(runtime.close$Mnapplication, LList.Empty, LList.Empty, "close application");
        }
        ModuleMethod moduleMethod2 = runtime.yail$Mnequal$Qu;
        if ($choice2 instanceof Package) {
            obj2 = runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit124), " is not bound in the current context"), "Unbound Variable");
        } else {
            obj2 = $choice2;
        }
        if (runtime.callYailPrimitive(moduleMethod2, LList.list2(obj2, "Réessayer"), Lit126, "=") != Boolean.FALSE) {
            return Scheme.applyToArgs.apply1(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit8, runtime.$Stthe$Mnnull$Mnvalue$St));
        }
        ModuleMethod moduleMethod3 = runtime.yail$Mnequal$Qu;
        if ($choice2 instanceof Package) {
            $choice2 = runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit124), " is not bound in the current context"), "Unbound Variable");
        }
        if (runtime.callYailPrimitive(moduleMethod3, LList.list2($choice2, "Accéder à l'application"), Lit127, "=") == Boolean.FALSE) {
            return Values.empty;
        }
        Scheme.applyToArgs.apply3(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit19, runtime.$Stthe$Mnnull$Mnvalue$St), "name", runtime.callYailPrimitive(runtime.yail$Mnlist$Mnget$Mnitem, LList.list2(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit18, runtime.$Stthe$Mnnull$Mnvalue$St), Lit111), Lit128, "select list item"));
        return runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen, LList.list1("Accueil"), Lit129, "open another screen");
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
        Screen1 = this;
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
