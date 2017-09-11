package franzwagnerternus.a5lugares;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void callLugar1(View view) {
        Intent intent = new Intent(this, Lugar1.class);

        startActivity(intent);
    }

    public void callLugar2(View view) {
        Intent intent = new Intent(this, Lugar2.class);

        startActivity(intent);
    }

    public void callLugar3(View view) {
        Intent intent = new Intent(this, Lugar3.class);

        startActivity(intent);
    }

    public void callLugar4(View view) {
        Intent intent = new Intent(this, Lugar4.class);

        startActivity(intent);
    }

    public void callLugar5(View view) {
        Intent intent = new Intent(this, Lugar5.class);

        startActivity(intent);
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            exitByBackKey();

            //moveTaskToBack(false);
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    protected void exitByBackKey() {

        AlertDialog alertbox = new AlertDialog.Builder(this)
                .setMessage("Deseja realmente sair?")
                .setPositiveButton("Sim", new DialogInterface.OnClickListener() {

                    // do something when the button is clicked
                    public void onClick(DialogInterface arg0, int arg1) {

                        finish();
                        //close();
                    }
                })
                .setNegativeButton("Não", new DialogInterface.OnClickListener() {

                    // do something when the button is clicked
                    public void onClick(DialogInterface arg0, int arg1) {
                    }
                })
                .show();
    }
}
