package com.example.android.common;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.example.android.slidingtabsbasic.R;
import com.max.library.view.TabLayout;

/**
 * Created by max on 16/6/24.
 */
public class MainActivity extends Activity {

    String[]  tabs ={"最新","最热","最快","总需人次"};
    TabLayout tabLayout ;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.main);

        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        for(int i=0;i<tabs.length;i++){
            String s = tabs[i];
            if (i == 3) {
                tabLayout.addTab(tabLayout.newTab().setText(s).setIcon(R.drawable.tab_select_arrow_down,TabLayout.BOTTOM),3f);
            }else{
                tabLayout.addTab(tabLayout.newTab().setText(s),1.5f);
            }
        }
    }
}
