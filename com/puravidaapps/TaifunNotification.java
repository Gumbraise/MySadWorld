package com.puravidaapps;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.os.Handler;
import android.util.Log;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.ComponentContainer;
import com.google.appinventor.components.runtime.ReplForm;
import java.io.File;
import java.io.IOException;

public class TaifunNotification extends AndroidNonvisibleComponent implements Component {
    public static final int a = 3;
    private static final String e = "TaifunNotification";
    private ComponentContainer b;
    private Context c;
    private final Activity d;
    private boolean f = false;
    private boolean g = false;
    private boolean h = false;
    private String i = "";
    private boolean j = false;

    public TaifunNotification(ComponentContainer componentContainer) {
        super(componentContainer.$form());
        this.b = componentContainer;
        this.c = componentContainer.$context();
        this.d = componentContainer.$context();
        Log.d(e, "TaifunNotification Created");
        this.i = "";
        if (this.form instanceof ReplForm) {
            this.j = true;
        }
    }

    private Bitmap a(String str) {
        String str2;
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (str.startsWith("file:///")) {
            str2 = "SDCARD";
            str = str.substring(7);
        } else if (str.startsWith("//")) {
            str2 = "ASSET";
            str = str.substring(2);
        } else if (str.startsWith("/")) {
            str2 = "SDCARD";
            if (!str.startsWith(externalStorageDirectory.getPath())) {
                str = externalStorageDirectory + str;
            }
        } else {
            str2 = "ASSET";
        }
        if (str2 == "ASSET" && this.j) {
            str2 = "SDCARD";
            str = externalStorageDirectory.getPath() + "/AppInventor/assets/" + str;
        }
        if (str2 == "SDCARD") {
            Log.d(e, "from sdcard: " + str);
            if (new File(str).exists()) {
                Log.i(e, "file exists");
                return BitmapFactory.decodeFile(str);
            }
            Log.i(e, "file does not exist, returning null");
            return null;
        }
        Log.d(e, "from assets: " + str);
        try {
            return BitmapFactory.decodeStream(this.c.getAssets().open(str));
        } catch (IOException e2) {
            Log.e(e, e2.getMessage(), e2);
            e2.printStackTrace();
            return null;
        }
    }

    /* access modifiers changed from: private */
    public void a(String str, String str2, String str3) {
        Log.i(e, "sendNotification");
        Bitmap a2 = a(this.i);
        Notification.Builder builder = new Notification.Builder(this.c);
        builder.setSmallIcon(17301659).setAutoCancel(true).setContentTitle(str).setContentText(str2).setLargeIcon(a2);
        if (this.h) {
            Log.i(e, "ignoreNotification");
        } else {
            Intent intent = new Intent();
            String packageName = this.c.getPackageName();
            intent.setClassName(packageName, packageName + ".Screen1");
            intent.addFlags(805339136);
            intent.putExtra("APP_INVENTOR_START", str3);
            builder.setContentIntent(PendingIntent.getActivity(this.c, (int) System.currentTimeMillis(), intent, 0));
        }
        if (this.g && a2 != null) {
            Log.i(e, "displayBigPicture");
            Notification.BigPictureStyle bigPictureStyle = new Notification.BigPictureStyle();
            bigPictureStyle.setBigContentTitle(str);
            bigPictureStyle.setSummaryText(str2);
            bigPictureStyle.bigPicture(a2);
            builder.setStyle(bigPictureStyle);
        }
        Notification build = builder.build();
        NotificationManager notificationManager = (NotificationManager) this.c.getSystemService("notification");
        build.flags |= 16;
        if (!this.f) {
            build.defaults |= 1;
        }
        notificationManager.notify(0, build);
    }

    public void DisplayBigPicture(boolean z) {
        this.g = z;
    }

    public boolean DisplayBigPicture() {
        return this.g;
    }

    public String Icon() {
        return this.i;
    }

    public void Icon(String str) {
        this.i = str;
    }

    public void IgnoreNotification(boolean z) {
        this.h = z;
    }

    public boolean IgnoreNotification() {
        return this.h;
    }

    public void MoveTaskToBack() {
        Log.i(e, "MoveTaskToBack");
        Intent intent = new Intent();
        intent.setAction("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        this.c.startActivity(intent);
    }

    public void Send(long j2, final String str, final String str2, final String str3) {
        Log.i(e, "Send: seconds " + j2);
        new Handler().postDelayed(new Runnable() {
            public void run() {
                TaifunNotification.this.a(str, str2, str3);
            }
        }, 1000 * j2);
    }

    public void SuppressSound(boolean z) {
        this.f = z;
    }

    public boolean SuppressSound() {
        return this.f;
    }
}
