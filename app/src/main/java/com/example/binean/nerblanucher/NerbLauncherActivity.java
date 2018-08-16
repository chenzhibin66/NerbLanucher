package com.example.binean.nerblanucher;

import android.support.v4.app.Fragment;
import android.os.Bundle;

public class NerbLauncherActivity extends SingFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return NerbLauncherFragment.newInstance();
    }


}
