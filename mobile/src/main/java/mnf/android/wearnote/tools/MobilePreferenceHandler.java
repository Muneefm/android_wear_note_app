package mnf.android.wearnote.tools;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import mnf.android.wearnote.R;

/**
 * Created by muneef on 04/02/17.
 */

public class MobilePreferenceHandler {
    SharedPreferences pref;

    SharedPreferences.Editor editor;
    Context c;
    int PRIVATE_MODE = 0;

    private static final String PREF_NAME = "settings_pref";
    final String fontSizem= "font_size_m";
   // final String theme= "themem";
  //  final String fontColor="colorm";
    final String fontStylem="font_style_m";

    final String fabLearn="fab_learn";
    final String firstTimeOpen="first_time_open";

    final String firstTimeSignInRestore="first_time_sign_restore";
    final String userAdClickLeft="user_ad_click";
    final String isPremiumUser="is_user_premium";
    final String userNoteClicks="user_notes_click";



    @SuppressLint("CommitPrefEdits")
    public MobilePreferenceHandler(Context context) {
        this.c = context;
        pref = c.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
    }
    public void setFontSize(String var){
        Log.e("TAG","setFontSize Set"+var );
        editor.putString(fontSizem, var);
        editor.commit();
    }
    public String getFontSize(){
        return pref.getString(fontSizem, "2");
    }


    public void setFontStyle(String var){
        Log.e("TAG","setFontStyle Set"+var );
        editor.putString(fontStylem, var);
        editor.commit();
    }
    public String getFontStyle(){
        return pref.getString(fontStylem, "1");
    }


    public void setFabLearn(boolean var){
        Log.e("TAG","setFontStyle Set"+var );
        editor.putBoolean(fabLearn, var);
        editor.commit();
    }
    public boolean getFabLearn(){
        return pref.getBoolean(fabLearn, false);
    }


    public void setFirstTimeOpen(boolean var){
        Log.e("TAG","setFontStyle Set"+var );
        editor.putBoolean(firstTimeOpen, var);
        editor.commit();
    }
    public boolean getFirstTimeOpen(){
        return pref.getBoolean(firstTimeOpen, true);
    }



    public void setFirstTimeSignInRestore(boolean var){
        Log.e("TAG","setFirstTimeSignInRestore Set"+var );
        editor.putBoolean(firstTimeSignInRestore, var);
        editor.commit();
    }
    public boolean getFirstTimeSignInRestore(){
        return pref.getBoolean(firstTimeSignInRestore, false);
    }


    public void setUserPaidOrNot(boolean var){
        Log.e("TAG","setUserPaid Set"+var );
        editor.putBoolean(isPremiumUser, var);
        editor.commit();
    }
    public boolean getUserPaidOrNot(){
        return pref.getBoolean(isPremiumUser, false);
    }




    public void setUserAdsClickLeft(int var){
        Log.e("TAG","setUserPaid Set"+var );
        editor.putInt(userAdClickLeft, var);
        editor.commit();
    }
    public int getUserAdsClickLeft(){
        return pref.getInt(userAdClickLeft, 0);
    }



    public void setUserNoteClicks(int var){
        Log.e("TAG","setUserPaid Set"+var );
        editor.putInt(userNoteClicks, var);
        editor.commit();
    }
    public int getUserNoteClicks(){
        return pref.getInt(userNoteClicks, 0);
    }





 /*   public void setTheme(boolean var){
        Log.e("TAG","setTheme Set"+var );
        editor.putBoolean(theme, var);
        editor.commit();
    }
    public boolean getTheme(){
        return pref.getBoolean(theme, false);
    }*/

  /*  public void setFontColor(int var){
        Log.e("TAG","setFontColor Set"+var );
        editor.putInt(fontColor, var);
        editor.commit();
    }
    public int getFontColor(){
        return pref.getInt(fontColor, R.color.grey800);
    }
*/




}
