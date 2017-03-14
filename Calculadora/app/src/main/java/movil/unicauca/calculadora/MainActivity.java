package movil.unicauca.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText num1, num2;
    Button sum, rest, mul, div;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //vincula en activity con el layout
        //Recuperar Views
        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);

        sum = (Button) findViewById(R.id.btnsumar);
        rest = (Button) findViewById(R.id.btnrestar);
        mul = (Button) findViewById(R.id.btnmultiplicar);
        div = (Button) findViewById(R.id.btndividir);

        //Eventos
        sum.setOnClickListener(this);
        rest.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String nS1 = num1.getText().toString();
        String nS2 = num2.getText().toString();

        int ni1 = Integer.parseInt(nS1);
        int ni2 = Integer.parseInt(nS2);
        int rta=0;

        switch (v.getId()){
            case R.id.btnsumar:
                rta = ni1 + ni2;
                break;
            case R.id.btnrestar:
                rta = ni1 - ni2;
                break;
            case R.id.btnmultiplicar:
                rta = ni1*ni2;
                break;
            case R.id.btndividir:
                rta = ni1/ni2;
                break;
        }

        result.setText(""+rta);
    }
}
