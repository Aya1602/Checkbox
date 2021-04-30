package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCheckboxClicked(View view) {
        // Получаем флажок
        CheckBox checkBox = (CheckBox) view;
        TextView selection = (TextView) findViewById(R.id.selection);
        // Получаем, отмечен ли данный флажок
        if(checkBox.isChecked()) {
            selection.setText("Включено");
            checkBox.setText("Выключить");
        }
        else {
            selection.setText("Выключено");
            checkBox.setText("Включить");
        }
    }
}
