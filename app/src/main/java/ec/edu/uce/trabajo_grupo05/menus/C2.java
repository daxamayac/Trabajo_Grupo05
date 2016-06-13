package ec.edu.uce.trabajo_grupo05.menus;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import ec.edu.uce.trabajo_grupo05.MainActivity;
import ec.edu.uce.trabajo_grupo05.R;
import ec.edu.uce.trabajo_grupo05.ejercicios.c2.E15DisallowActivity;
import ec.edu.uce.trabajo_grupo05.ejercicios.c2.E16DragTouchActivity;
import ec.edu.uce.trabajo_grupo05.ejercicios.c2.E17SupportActivity;
import ec.edu.uce.trabajo_grupo05.ejercicios.c2.E17ToolbarActivity;
import ec.edu.uce.trabajo_grupo05.ejercicios.c2.E18FragmentPagerActivity;
import ec.edu.uce.trabajo_grupo05.ejercicios.c2.E18PagerActivity;
import ec.edu.uce.trabajo_grupo05.ejercicios.c2.E19ActionTabsActivity;
import ec.edu.uce.trabajo_grupo05.ejercicios.c2.E5ActionActivity;
import ec.edu.uce.trabajo_grupo05.ejercicios.c2.E6CustomItemActivity;
import ec.edu.uce.trabajo_grupo05.ejercicios.c2.E6DialogActivity;
import ec.edu.uce.trabajo_grupo05.ejercicios.c2.E7OptionsActivity;
import ec.edu.uce.trabajo_grupo05.ejercicios.c2.E8CustomBack;
import ec.edu.uce.trabajo_grupo05.ejercicios.c2.E9CustomBack;

public class C2 extends AppCompatActivity {
    String[] ejer = {"Ejercicio 1","Ejercicio 2","Ejercicio 3","Ejercicio 4","2.5 Creating Contextual Actions","2.6 Displaying a User Dialog Box",
            "2.7 Customizing Menus and Actions","2.8 Customizing  BACK Behavior","2.9 Emulating the HOME Button","2.10 Monitoring TextView Changes","2.11 Customizing Keyboard Actions","2.12 Dismissing the Soft Keyboard","2.13 Handling Complex Touch Events",
            "2.14 Forwarding Touch Events","Ejercicio 15","Ejercicio 16","Ejercicio 17-1","Ejercicio 17-2","Ejercicio 18-1","Ejercicio 18-2","Ejercicio 19",};
    ListView list;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        list = (ListView) findViewById(R.id.listCap2);


        ArrayAdapter listCapAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,ejer);
        list.setAdapter(listCapAdapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent=null;
                switch (position){
                    case 0:

                        break;
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:

                        break;


                    case 4:
                        intent= new Intent(getApplicationContext(),E5ActionActivity.class);
                        startActivity(intent);
                        break;
                    case 5:
                        intent= new Intent(getApplicationContext(),E6CustomItemActivity.class);
                        startActivity(intent);
                        break;
                    case 6:
                        intent= new Intent(getApplicationContext(),E7OptionsActivity.class);
                        startActivity(intent);
                        break;
                    case 7:
                        intent= new Intent(getApplicationContext(),E8CustomBack.class);
                        startActivity(intent);
                        break;
                    case 8:
                        intent= new Intent(getApplicationContext(),E9CustomBack.class);
                        startActivity(intent);
                        break;
                    case 14:
                        intent= new Intent(getApplicationContext(),E15DisallowActivity.class);
                        startActivity(intent);
                        break;
                    case 15:
                        intent= new Intent(getApplicationContext(),E16DragTouchActivity.class);
                        startActivity(intent);
                        break;
                    case 16:
                        intent= new Intent(getApplicationContext(),E17SupportActivity.class);
                        startActivity(intent);
                        break;
                    case 17:
                        intent= new Intent(getApplicationContext(),E17ToolbarActivity.class);
                        startActivity(intent);
                        break;
                    case 18:
                        intent= new Intent(getApplicationContext(),E18PagerActivity.class);
                        startActivity(intent);
                        break;
                    case 19:
                        intent= new Intent(getApplicationContext(),E18FragmentPagerActivity.class);
                        startActivity(intent);
                        break;
                    case 20:
                        intent= new Intent(getApplicationContext(),E19ActionTabsActivity.class);
                        startActivity(intent);
                        break;
                    default:
                        Toast.makeText(getApplicationContext(),"En construcción",Toast.LENGTH_LONG).show();
                        break;


                }


                Toast.makeText(getApplicationContext(),parent.getItemAtPosition(position).toString(),Toast.LENGTH_LONG).show();

            }
        });

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

}
