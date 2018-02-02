package edu.misao.misao_calculator_onclick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1,num2;
    TextView tvCalRes;
    Button btnAdd,btnSub,btnMul,btnDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        num1 = findViewById(R.id.etCal1);
        num2 = findViewById(R.id.etCal2);
        tvCalRes = findViewById(R.id.tvCalRes);
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);
    }

    public void add(View view)
    {
        int a1 = Integer.parseInt( num1.getText().toString());
        int b1 = Integer.parseInt( num2.getText().toString() );

        int result;

        result = a1 + b1;

       tvCalRes.setText( String.valueOf( result ) );
    }


    public void sub(View view)
    {
        int a1 = Integer.parseInt( num1.getText().toString());
        int b1 = Integer.parseInt( num2.getText().toString() );

        int result;

        result = a1 - b1;

        tvCalRes.setText( String.valueOf( result ) );

    }

    public void mul(View view)
    {
        int a1 = Integer.parseInt( num1.getText().toString());
        int b1 = Integer.parseInt( num2.getText().toString() );

        int result;

        result = a1 * b1;

        tvCalRes.setText( String.valueOf( result ) );
    }

    public void div(View view)
    {
        int a1 = Integer.parseInt( num1.getText().toString());
        int b1 = Integer.parseInt( num2.getText().toString() );

        int result;

        result = a1 / b1;

        tvCalRes.setText( String.valueOf( result ) );
    }

}
