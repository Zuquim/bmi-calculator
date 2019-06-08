package br.pucminas.bmicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void CalculateBMI(View view){
        TextView txtBMI = findViewById(R.id.txtBMI);
        TextView txtBMIdes = findViewById(R.id.txtBMIdes);
        EditText edtWeight = findViewById(R.id.edtWeight);
        EditText edtHeight = findViewById(R.id.edtHeight);
        double weight = Double.valueOf(edtWeight.getText().toString());
        double height = Double.parseDouble(edtHeight.getText().toString())/100;
        double bmi = Math.round(weight/(height*height));
        txtBMI.setText(String.valueOf(bmi));
        List<String> rate = Arrays. asList("Super thin", "Moderate thin", "Cool thin", "Healthy", "Overweight", "Overweight I", "Overwieght II", "Overweight III");
        String des;
        if(bmi<16){des=rate.get(0);}
        else if(bmi<17){des=rate.get(1);}
        else if(bmi<18.5){des=rate.get(2);}
        else if(bmi<25){des=rate.get(3);}
        else if(bmi<30){des=rate.get(4);}
        else if(bmi<35){des=rate.get(5);}
        else if(bmi<40){des=rate.get(6);}
        else{des=rate.get(7);}
        txtBMIdes.setText("Classification:\n"+des);
    }
}
