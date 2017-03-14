package unicauca.movil.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText num1, num2;
    Button sum, rest, div, mul;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        //Recuperar Views
        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);

        sum = (Button) findViewById(R.id.btnSumar);
        rest = (Button) findViewById(R.id.btnRestar);
        div = (Button) findViewById(R.id.btnDiv);
        mul = (Button) findViewById(R.id.btnMul);

        result = (TextView) findViewById(R.id.resultado);

        // Eventos
        sum.setOnClickListener(this);
        div.setOnClickListener(this);
        mul.setOnClickListener(this);
        rest.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        String nS1 = num1.getText().toString();
        String nS2 =  num2.getText().toString();

        int ni1 = Integer.parseInt(nS1);
        int ni2 = Integer.parseInt(nS2);
        int rta = 0;

        switch(view.getId()){
            case R.id.btnSumar:
                rta = ni1 + ni2;
                break;
            case R.id.btnRestar:
                rta = ni1 - ni2;
                break;
            case R.id.btnMul:
                rta = ni1 * ni2;
                break;
            case R.id.btnDiv:
                rta = ni1 / ni2;
                break;
        }

        result.setText(""+rta);

    }
}
