package com.MoMath;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class sistemas2incog extends Activity {
	
	private Button calcular;
	private Button borrar;
	private EditText a;
	private EditText b;
	private EditText c;
	private EditText d;
	private EditText f;
	private EditText g;
	private TextView textView1;
	private TextView textView4;
	private TextView textView6;
	
	private boolean isNumeric( String s ){
	    try{
	        double y = Double.parseDouble( s );
	        return true;
	    }
	    catch( NumberFormatException err ){
	        return false;
	    }
	}
	
	public static double redondear(double numero,int numeroDecimales) {
		long mult=(long)Math.pow(10,numeroDecimales);
		double resultado=(Math.round(numero*mult))/(double)mult;
		return resultado;
		}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sistemas2);
		

		calcular = (Button) findViewById(R.id.calcular);
		borrar = (Button) findViewById(R.id.borrar);
		a = (EditText) findViewById(R.id.editText1);
		b = (EditText) findViewById(R.id.editText2);
		c = (EditText) findViewById(R.id.editText3);
		d = (EditText) findViewById(R.id.editText4);
		f = (EditText) findViewById(R.id.editText5);
		g = (EditText) findViewById(R.id.editText6);
		textView1 = (TextView) findViewById(R.id.textView1);
		textView4 = (TextView) findViewById(R.id.textView4);
		textView6 = (TextView) findViewById(R.id.textView6);
		
		calcular.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				Toast.makeText(getApplicationContext(), "Calcular", Toast.LENGTH_SHORT).show();
				
				if (a.length() > 0 && b.length() > 0 && c.length()> 0 && d.length() > 0 && f.length() > 0 && g.length() > 0) {
					String cadena1 = a.getText().toString();
					String cadena2 = b.getText().toString(); 
					String cadena3 = c.getText().toString();
					String cadena4 = d.getText().toString();
					String cadena5 = f.getText().toString();
					String cadena6 = g.getText().toString();
					boolean activo1 = true;
					boolean activo2 = true;
					boolean activo3 = true;
					boolean activo4 = true;
					boolean activo5 = true;
					boolean activo6 = true;
					char cad;
					
					for(int i = 0; i < a.length(); i++)
					{
						char cadenaaux = ',';
						cad = cadena1.charAt(i); 
						if(cad == cadenaaux)
						{
							textView1.setText("ingrese punto para separar la parte entera de la parte decimal");
							i = a.length();
							activo1 = false;
						}
						else
						{
					    	activo1 = true;
						}
					}
					for(int i = 0; i < b.length(); i++)
					{
						char cadenaaux = ',';
						cad = cadena2.charAt(i); 
						if(cad == cadenaaux)
						{
							textView1.setText("ingrese punto para separar la parte entera de la parte decimal");
							i = b.length();
							activo2 = false;
						}
						else
						{
							activo2 = true;
						}
					}
					for(int i = 0; i < c.length(); i++)
					{
						char cadenaaux = ',';
						cad = cadena3.charAt(i); 
						if(cad == cadenaaux)
						{
							textView1.setText("ingrese punto para separar la parte entera de la parte decimal");
							i = c.length();
							activo3 = false;
						}
						else
						{
							activo3 = true;
						}
					}
					for(int i = 0; i < d.length(); i++)
					{
						char cadenaaux = ',';
						cad = cadena4.charAt(i); 
						if(cad == cadenaaux)
						{
							textView1.setText("ingrese punto para separar la parte entera de la parte decimal");
							i = d.length();
							activo4 = false;
						}
						else
						{
							activo4 = true;
						}
					}
					
					for(int i = 0; i < f.length(); i++)
					{
						char cadenaaux = ',';
						cad = cadena5.charAt(i); 
						if(cad == cadenaaux)
						{
							textView1.setText("ingrese punto para separar la parte entera de la parte decimal");
							i = f.length();
							activo5 = false;
						}
						else
						{
							activo5 = true;
						}
					}
					
					for(int i = 0; i < g.length(); i++)
					{
						char cadenaaux = ',';
						cad = cadena6.charAt(i); 
						if(cad == cadenaaux)
						{
							textView1.setText("ingrese punto para separar la parte entera de la parte decimal");
							i = g.length();
							activo6 = false;
						}
						else
						{
							activo6 = true;
						}
					}
					
					if(activo1 == true && activo2 == true && activo3 == true && activo4 == true && activo5==true && activo6 == true){
						
						if(isNumeric(a.getText().toString()) && isNumeric( b.getText().toString()) && isNumeric(c.getText().toString()) && isNumeric(d.getText().toString()) && isNumeric(f.getText().toString()) && isNumeric(g.getText().toString())){
							
							double a1 = Double.parseDouble(cadena1);
							double a2 = Double.parseDouble(cadena2);
							double a3 = Double.parseDouble(cadena3);
							double a4 = Double.parseDouble(cadena4);
							double a5 = Double.parseDouble(cadena5);
							double a6 = Double.parseDouble(cadena6);
							
							double deter = (a1 * a5) - (a2 * a4);
							deter = redondear(deter,4);
							double resultadox = (a3 * a5) - (a2 * a6);
							resultadox = redondear(resultadox,4);
							double resultadoy = (a1 * a6) - (a3 * a4);
							resultadoy = redondear(resultadoy,4);
							double x = resultadox / deter;
							double y = resultadoy / deter;
						
							
							if (deter != 0) {
								textView1.setText("Sistema Compatible Determinado");
								textView4.setText(""+redondear (x,2));
								textView6.setText(""+redondear(y,2));
							}
							
							if (deter == 0 && resultadox != 0 && resultadoy != 0) {
								textView1.setText("Sistema incompatible");
								textView4.setText("");
								textView6.setText("");
							}	
							if (deter == 0 && resultadox == 0 && resultadoy != 0) {
								textView1.setText("Sistema incompatible");
								textView4.setText("");
								textView6.setText("");
							}
							if (deter == 0 && resultadox != 0 && resultadoy == 0) {
								textView1.setText("Sistema incompatible");
								textView4.setText("");
								textView6.setText("");
							}
							if (deter == 0 && resultadox == 0 && resultadoy == 0) {
								textView1.setText("Sistema compatible indeterminado");
								textView4.setText("");
								textView6.setText("");
							}

						} else {
							textView1.setText("Ingrese solo valores numericos");
						}
					} else {
						textView1.setText("Utilice punto para separar la parte entera de la parte decimal");
					}

				} else if (a.length() == 0 && b.length() == 0 && c.length() == 0 && d.length() == 0 && f.length() == 0 && g.length() == 0) {
					textView1.setText("Ingrese los valores");
				}

				if (a.length() == 0) {
					textView1.setText("Ingrese valores faltantes");
				} else if (b.length() == 0) {
					textView1.setText("Ingrese valores faltantes");
				} else if (c.length() == 0) {
					textView1.setText("Ingrese valores faltantes");
				} else if (d.length() == 0) {
					textView1.setText("Ingrese valores faltantes");
				} else if (f.length() == 0) {
					textView1.setText("Ingrese valores faltantes");
				} else if (g.length() == 0) {
					textView1.setText("Ingrese valores faltantes");
				}
			}
		});
		
		borrar.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				Toast.makeText(getApplicationContext(), "Borrar", Toast.LENGTH_SHORT).show();
				a.setText("");
				b.setText("");
				c.setText("");
				d.setText("");
				f.setText("");
				g.setText("");
				textView1.setText("");
				textView4.setText("");
				textView6.setText("");
				
			}
			
		});
	}			
}

