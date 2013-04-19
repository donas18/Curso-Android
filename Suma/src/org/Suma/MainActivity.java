package org.Suma;

import android.os.Bundle;
import android.app.Activity;
import android.view.*;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	private double v_a, v_b;
	private EditText op_a, op_b;
	private TextView resultado;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		this.op_a=(EditText) findViewById(R.id.operando1);
		this.op_b=(EditText) findViewById(R.id.operando2);
		this.resultado=(TextView) findViewById(R.id.result);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void suma(View view){
		if(this.op_a.getText().toString().length()>0 && this.op_b.getText().toString().length() > 0){
			this.v_a = Double.parseDouble(this.op_a.getText().toString());
			this.v_b = Double.parseDouble(this.op_b.getText().toString());
			this.resultado.setText(Double.toString(this.v_a + this.v_b));
		}
	}

}
