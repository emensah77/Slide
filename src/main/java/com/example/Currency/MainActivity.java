package com.example.Currency;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.slide.R;


public class MainActivity extends AppCompatActivity {

    /*Button beginButton;
    ImageView ebenImage;*/
    public void Begin(View view) {

        Double amount1;
        EditText currency =   findViewById(R.id.currencyEditText);
        Double amount = Double.parseDouble(currency.getText().toString());
        amount1 = amount * 5.71;
        Toast.makeText(this,   amount + " " + "dollars is " + " " + amount1 + " Ghana Cedis" , Toast.LENGTH_LONG).show();
    }   @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);



        }
        /*View.OnClickListener next = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button beginButton = findViewById(R.id.beginButton);
                ImageView ebenImage = findViewById(R.id.ebenImage);
                ebenImage.setImageResource(R.drawable.eben4);

            }
        };*/

}
