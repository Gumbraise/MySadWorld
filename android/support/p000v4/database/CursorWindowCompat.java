package android.support.p000v4.database;

import android.database.CursorWindow;
import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/* renamed from: android.support.v4.database.CursorWindowCompat */
public final class CursorWindowCompat {
    private CursorWindowCompat() {
    }

    @NonNull
    public static CursorWindow create(@Nullable String name, long windowSizeBytes) {
        if (VERSION.SDK_INT >= 28) {
            return new CursorWindow(name, windowSizeBytes);
        }
        if (VERSION.SDK_INT >= 15) {
            return new CursorWindow(name);
        }
        return new CursorWindow(false);
    }
}
