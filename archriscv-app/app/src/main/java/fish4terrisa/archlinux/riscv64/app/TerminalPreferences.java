package fish4terrisa.archlinux.riscv64.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;

import fish4terrisa.archlinux.riscv64.BuildConfig;
import fish4terrisa.archlinux.riscv64.terminal.EmulatorDebug;
import fish4terrisa.archlinux.riscv64.terminal.TerminalSession;

@SuppressWarnings("WeakerAccess")
final class TerminalPreferences {

    private static final String CURRENT_SESSION_KEY = "current_session";
    private static final String SHOW_EXTRA_KEYS_KEY = "show_extra_keys";
    private static final String BACK_IS_ESCAPE = "back_is_escape";
    private static final String IGNORE_BELL = "ignore_bell";

    private boolean mShowExtraKeys;
    private boolean mBackIsEscape;
    private boolean mIgnoreBellCharacter;


    TerminalPreferences(Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        mShowExtraKeys = prefs.getBoolean(SHOW_EXTRA_KEYS_KEY, true);
        mBackIsEscape = prefs.getBoolean(BACK_IS_ESCAPE, false);
        mIgnoreBellCharacter = prefs.getBoolean(IGNORE_BELL, false);
    }

    public static void storeCurrentSession(Context context, TerminalSession session) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putString(TerminalPreferences.CURRENT_SESSION_KEY, session.mHandle).apply();
    }

    public static TerminalSession getCurrentSession(TerminalActivity context) {
        String sessionHandle = PreferenceManager.getDefaultSharedPreferences(context).getString(TerminalPreferences.CURRENT_SESSION_KEY, "");

        for (int i = 0, len = context.mTermService.getSessions().size(); i < len; i++) {
            TerminalSession session = context.mTermService.getSessions().get(i);
            if (session.mHandle.equals(sessionHandle)) return session;
        }

        return null;
    }

    public boolean isShowExtraKeys() {
        return mShowExtraKeys;
    }

    public boolean toggleShowExtraKeys(Context context) {
        mShowExtraKeys = !mShowExtraKeys;
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean(SHOW_EXTRA_KEYS_KEY, mShowExtraKeys).apply();
        return mShowExtraKeys;
    }

    public boolean isBackEscape() {
        return mBackIsEscape;
    }

    public void setBackIsEscape(Context context, boolean newValue) {
        mBackIsEscape = newValue;
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean(BACK_IS_ESCAPE, newValue).apply();
    }

    public boolean isBellIgnored() {
        return mIgnoreBellCharacter;
    }

    public void setIgnoreBellCharacter(Context context, boolean newValue) {
        mIgnoreBellCharacter = newValue;
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean(IGNORE_BELL, newValue).apply();
    }
}
