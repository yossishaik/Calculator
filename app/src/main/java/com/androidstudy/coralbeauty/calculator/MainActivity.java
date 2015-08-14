package com.androidstudy.coralbeauty.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private  Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private  Button btn8;
    private Button btn9;
    private Button btn10;
    private Button btn11;
    private  Button btn12;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button) findViewById(R.id.button);
        btn2=(Button) findViewById(R.id.button2);
        btn3=(Button) findViewById(R.id.button3);
        btn4=(Button) findViewById(R.id.button4);
        btn5=(Button) findViewById(R.id.button5);
        btn6=(Button) findViewById(R.id.button6);
        btn7=(Button) findViewById(R.id.button7);
        btn8=(Button) findViewById(R.id.button8);
        btn9=(Button) findViewById(R.id.button9);
        btn10=(Button) findViewById(R.id.button10);
        btn11=(Button) findViewById(R.id.button11);
        btn12=(Button) findViewById(R.id.button12);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void btn1Click(View v) {
        Log.w("You Cliked: ", btn1.getText().toString());
    }
    public void btn2Click(View v) {Log.w("You Cliked: ", btn2.getText().toString());}

    public void btn3Click(View v) {
        Log.w("You Cliked: ", btn3.getText().toString());
    }
    public void btn4Click(View v) {Log.w("You Cliked: ", btn4.getText().toString());}

    public void btn5Click(View v) {
        Log.w("You Cliked: ", btn5.getText().toString());
    }
    public void btn6Click(View v) {Log.w("You Cliked: ", btn6.getText().toString());}

    public void btn7Click(View v) {
        Log.w("You Cliked: ", btn7.getText().toString());
    }
    public void btn8Click(View v) {Log.w("You Cliked: ", btn8.getText().toString());}

    public void btn9Click(View v) {
        Log.w("You Cliked: ", btn9.getText().toString());
    }
    public void btn10Click(View v) {Log.w("You Cliked: ", btn10.getText().toString());}

    public void btn11Click(View v) {
        Log.w("You Cliked: ", btn11.getText().toString());
    }
    public void btn12Click(View v) {Log.w("You Cliked: ", btn12.getText().toString());}




}
