package com.example.niklas.myapplication2;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends ActionBarActivity {

    EditText temp;
    RadioButton toC;
    RadioButton toF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        temp = (EditText)findViewById(R.id.temperatureEditText);
        toC = (RadioButton)findViewById(R.id.toCelsiusRadioButton);
        toF = (RadioButton)findViewById(R.id.toFarenheitRadioButton);
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

    public void convert(View v){
        double value = new Double(temp.getText().toString());
        if (toC.isChecked())
            value = UnitConverter.farenheit2Celsius(value);
        else
            value = UnitConverter.celsius2Farenheit(value);
        temp.setText(new Double(value).toString());

    }
}
