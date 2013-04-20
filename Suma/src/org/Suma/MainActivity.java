package org.Suma;

import android.os.Bundle;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.*;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button suma = (Button) findViewById(R.id.suma);
		suma.setOnClickListener((android.view.View.OnClickListener) OkListener);
	}
	
	private OnClickListener OkListener = new OnClickListener(){
		public void onClick(View view){
			calcularsuma();
		}

		@Override
		public void onClick(DialogInterface dialog, int which) {
			// TODO Auto-generated method stub
			
		}
	};
	
	
	public void calcularsuma(){
		EditText numero1=(EditText)findViewById(R.id.operando1);
		EditText numero2=(EditText)findViewById(R.id.operando2);
		int num1=Integer.parseInt(numero1.getText().toString());
		int num2=Integer.parseInt(numero2.getText().toString());
		int suma=num1+num2;
		Toast.makeText(this, "El resultado de la suma es: "+suma,Toast.LENGTH_LONG).show();		
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
