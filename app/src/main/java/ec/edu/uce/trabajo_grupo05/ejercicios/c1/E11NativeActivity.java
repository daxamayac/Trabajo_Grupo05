package ec.edu.uce.trabajo_grupo05.ejercicios.c1;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import ec.edu.uce.trabajo_grupo05.R;

@SuppressLint("NewApi")
public class E11NativeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainc1e11);
    }
    
    public void onAddClick(View v) {
        E11NativeFragment fragment = new E11NativeFragment();
        
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        //Must be called first!
//        ft.setCustomAnimations(R.animator.fragment_enter, R.animator.fragment_exit, R.animator.fragment_pop_enter, R.animator.fragment_pop_exit);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        ft.replace(R.id.container_fragment, fragment);
        ft.addToBackStack(null);
        ft.commit();
    }
}