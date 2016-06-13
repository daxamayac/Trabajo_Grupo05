package ec.edu.uce.trabajo_grupo05.ejercicios.c1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class E11MainActivity extends Activity implements View.OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button b = new Button(this);
        b.setText("Click");
        b.setOnClickListener(this);
        setContentView(b);
    }
    
    @Override
    public void onClick(View v) {
        Intent i = new Intent(this, E11MainActivity.class);
        startActivity(i);
//        overridePendingTransition(R.anim.activity_open_enter, R.anim.activity_open_exit);
    }
    
    @Override
    public void onBackPressed() {
        super.onBackPressed();
//        overridePendingTransition(R.anim.activity_close_enter, R.anim.activity_close_exit);
    }
}
