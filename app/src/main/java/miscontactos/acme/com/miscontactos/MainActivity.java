package miscontactos.acme.com.miscontactos;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import miscontactos.acme.com.miscontactos.util.TextChangedListener;


public class MainActivity extends Activity {

    private EditText txtNombre,txtTelefono,txtEmail, txtDireccion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarComponenteUI();
    }

    private void inicializarComponenteUI() {
        txtNombre = (EditText) findViewById(R.id.cmpNombre);
        txtTelefono = (EditText) findViewById(R.id.cmpTelefono);
        txtEmail = (EditText) findViewById(R.id.cmpCorreo);
        txtDireccion = (EditText) findViewById(R.id.cmpDireccion);

        txtNombre.addTextChangedListener(new TextChangedListener(){
            @Override
            public void onTextChanged(CharSequence seq, int start, int before, int count) {
                Button btnAgregar = (Button) findViewById(R.id.btnAgregar);
                btnAgregar.setEnabled(!seq.toString().trim().isEmpty());
            }
        });
    }
}
