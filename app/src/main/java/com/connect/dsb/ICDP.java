package com.connect.dsb;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ICDP extends AppCompatActivity {

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.icdp);
    }
    private void changeFragment(Fragment fm){
//      final FrameLayout fl = (FrameLayout) findViewById(R.id.content);
//        fl.removeAllViews();

        //Backstack clear in fragment(back back issue solve
        getSupportFragmentManager().popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
        android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.setCustomAnimations(R.anim.up_to_down, R.anim.slide_in_left);
        ft.replace(R.id.content, fm);
        ft.setTransition(FragmentTransaction.TRANSIT_NONE);
        ft.addToBackStack(null);
        ft.commit();
    }
    public void event1(View view) {
        changeFragment(new Event1());
    }
}
