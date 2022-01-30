package com.MoMath;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class deter2x2 extends Activity{
	private Button calcular;
	private Button borrar;
	private EditText a;
	private EditText b;
	private EditText c;
	private EditText d;
	private TextView textView1;
	
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
		setContentView(R.layout.determinantes2x2);
		
		
		calcular = (Button) findViewById(R.id.calcular);
		borrar = (Button) findViewById(R.id.borrar);
		a = (EditText) findViewById(R.id.a);
		c = (EditText) findViewById(R.id.c);
		b = (EditText) findViewById(R.id.b);
		d = (EditText) findViewById(R.id.d);
		textView1 = (TextView) findViewById(R.id.textView1);
		
		calcular.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				Toast.makeText(getApplicationContext(), "Calcular", Toast.LENGTH_SHORT).show();
				
				if(a.length() > 0 && b.length() > 0 && c.length() > 0 && d.length() > 0){
					String cadena1 = a.getText().toString();
					String cadena2 = b.getText().toString();
					String cadena3 = c.getText().toString();
					String cadena4 = d.getText().toString();
					boolean activo1 = true;
					boolean activo2 = true;
					boolean activo3 = true;
					boolean activo4 = true;
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
							i = c.length();
							activo4 = false;
						}
						else
						{
							activo4 = true;
						}
					}
					
					if(activo1 == true && activo2 == true && activo3 == true && activo4 == true){
						
						if(isNumeric(a.getText().toString()) && isNumeric( b.getText().toString()) && isNumeric(c.getText().toString()) && isNumeric(d.getText().toString())){
							
							double a1 = Double.parseDouble(cadena1);
							double a2 = Double.parseDouble(cadena2);
							double a3 = Double.parseDouble(cadena3);
							double a4 = Double.parseDouble(cadena4);
							
							double determinante = a1*a4 - a3*a2;
							textView1.setText("El determinante es: "+redondear(determinante,4));
						}
						
						else
						{
							textView1.setText("Ingrese solo valores numéricos");
						}
					}
					else
					{
						textView1.setText("Utilice punto para separar la parte entera de la parte decimal");
					}
				}
				
				else if(a.length() == 0 && b.length() == 0 && c.length() == 0 && d.length() == 0){
					
					textView1.setText("Ingrese los valores");
				}
				if(a.length() == 0)
				{
					textView1.setText(" Ingrese valores faltantes");
				}
				if(b.length() == 0)
				{
					textView1.setText(" Ingrese valores faltantes");
				}
				else if(c.length() == 0)
				{
					textView1.setText(" Ingrese valores faltantes");
				}
				else if(d.length() == 0)
				{
					textView1.setText(" Ingrese valores faltantes");
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
				textView1.setText("");
				
			}
			
		});
	}
}
