package com.MoMath;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class deter3x3 extends Activity {
	
	private Button calcular;
	private Button borrar;
	private EditText a;
	private EditText b;
	private EditText c;
	private EditText d;
	private EditText e;
	private EditText f;
	private EditText g;
	private EditText h;
	private EditText j;
	private TextView salida;
	
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
		setContentView(R.layout.determinantes3x3);
		
		calcular = (Button) findViewById(R.id.calcular);
		borrar = (Button) findViewById(R.id.borrar);
		a = (EditText) findViewById(R.id.a);
		c = (EditText) findViewById(R.id.c);
		b = (EditText) findViewById(R.id.b);
		d = (EditText) findViewById(R.id.d);
		e = (EditText) findViewById(R.id.e);
		f = (EditText) findViewById(R.id.f);
		g = (EditText) findViewById(R.id.g);
		h = (EditText) findViewById(R.id.h);
		j = (EditText) findViewById(R.id.j);
		salida = (TextView) findViewById(R.id.salida);
		
		calcular.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				Toast.makeText(getApplicationContext(), "Calcular", Toast.LENGTH_SHORT).show();
				
				if(a.length() > 0 && b.length() > 0 && c.length() > 0 && d.length() > 0 && e.length()>0 && f.length()>0 && g.length()>0 && h.length()>0 && j.length()>0){
					String cadena1 = a.getText().toString();
					String cadena2 = b.getText().toString();
					String cadena3 = c.getText().toString();
					String cadena4 = d.getText().toString();
					String cadena5 = e.getText().toString();
					String cadena6 = f.getText().toString();
					String cadena7 = g.getText().toString();
					String cadena8 = h.getText().toString();
					String cadena9 = j.getText().toString();
					boolean activo1 = true;
					boolean activo2 = true;
					boolean activo3 = true;
					boolean activo4 = true;
					boolean activo5 = true;
					boolean activo6 = true;
					boolean activo7 = true;
					boolean activo8 = true;
					boolean activo9 = true;
					char cad;
					
					for(int i = 0; i < a.length(); i++)
					{
						char cadenaaux = ',';
						cad = cadena1.charAt(i); 
						if(cad == cadenaaux)
						{
							salida.setText("ingrese punto para separar la parte entera de la parte decimal");
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
							salida.setText("ingrese punto para separar la parte entera de la parte decimal");
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
							salida.setText("ingrese punto para separar la parte entera de la parte decimal");
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
							salida.setText("ingrese punto para separar la parte entera de la parte decimal");
							i = d.length();
							activo4 = false;
						}
						else
						{
					    	activo4 = true;
						}
					}
					
					for(int i = 0; i < e.length(); i++)
					{
						char cadenaaux = ',';
						cad = cadena5.charAt(i); 
						if(cad == cadenaaux)
						{
							salida.setText("ingrese punto para separar la parte entera de la parte decimal");
							i = e.length();
							activo5 = false;
						}
						else
						{
					    	activo5 = true;
						}
					}
					
					for(int i = 0; i < f.length(); i++)
					{
						char cadenaaux = ',';
						cad = cadena6.charAt(i); 
						if(cad == cadenaaux)
						{
							salida.setText("ingrese punto para separar la parte entera de la parte decimal");
							i = f.length();
							activo6 = false;
						}
						else
						{
					    	activo6 = true;
						}
					}
					
					for(int i = 0; i < g.length(); i++)
					{
						char cadenaaux = ',';
						cad = cadena7.charAt(i); 
						if(cad == cadenaaux)
						{
							salida.setText("ingrese punto para separar la parte entera de la parte decimal");
							i = g.length();
							activo7 = false;
						}
						else
						{
					    	activo7 = true;
						}
					}
					
					for(int i = 0; i < h.length(); i++)
					{
						char cadenaaux = ',';
						cad = cadena8.charAt(i); 
						if(cad == cadenaaux)
						{
							salida.setText("ingrese punto para separar la parte entera de la parte decimal");
							i = h.length();
							activo8 = false;
						}
						else
						{
					    	activo8 = true;
						}
					}
					
					for(int i = 0; i < j.length(); i++)
					{
						char cadenaaux = ',';
						cad = cadena9.charAt(i); 
						if(cad == cadenaaux)
						{
							salida.setText("ingrese punto para separar la parte entera de la parte decimal");
							i = j.length();
							activo9 = false;
						}
						else
						{
					    	activo9 = true;
						}
					}
					
					if(activo1 == true && activo2 == true && activo3 == true && activo4 == true && activo5 == true && activo6 == true && activo7 == true && activo8 == true && activo9 == true){
						
						if(isNumeric(a.getText().toString()) && isNumeric( b.getText().toString()) && isNumeric(c.getText().toString()) && isNumeric(d.getText().toString()) && isNumeric(e.getText().toString())&&isNumeric(f.getText().toString())&&isNumeric(g.getText().toString()) && isNumeric(h.getText().toString()) && isNumeric(j.getText().toString())){
							double a1 = Double.parseDouble(cadena1);
							double a2 = Double.parseDouble(cadena2);
							double a3 = Double.parseDouble(cadena3);
							double a4 = Double.parseDouble(cadena4);
							double a5 = Double.parseDouble(cadena5);
							double a6 = Double.parseDouble(cadena6);
							double a7 = Double.parseDouble(cadena7);
							double a8 = Double.parseDouble(cadena8);
							double a9 = Double.parseDouble(cadena9);
							
							double determinante = (a1*a5*a9 + a3*a4*a8 + a2*a6*a7)-(a3*a5*a7 + a2*a4*a9 + a1*a6*a8);
							salida.setText("El determinante es: "+redondear(determinante,4));
						}
						else
						{
							salida.setText("Ingrese solo valores numéricos");
						}
					}
					else
					{
						salida.setText("Utilice punto para separar la parte entera de la parte decimal");
					}
				}
				else if(a.length() == 0 && b.length() == 0 && c.length() == 0 && d.length() == 0 && e.length()==0 && f.length()==0 && g.length()==0 && h.length()==0 && j.length()==0){
					salida.setText("Ingrese los valores");
				}
				if(b.length() == 0)
				{
					salida.setText(" Ingrese valores faltantes");
				}
				else if(c.length() == 0)
				{
					salida.setText(" Ingrese valores faltantes");
				}
				else if(d.length() == 0)
				{
					salida.setText(" Ingrese valores faltantes");
				}
				else if (e.length()==0)
				{
					salida.setText("Ingrese valores faltantes");
				}
				else if (f.length()==0)
				{
					salida.setText("Ingrese valores faltantes");
				}
				else if (g.length()==0)
				{
					salida.setText("Ingrese valores faltantes");
				}
				else if (h.length()==0)
				{
					salida.setText("Ingrese valores faltantes");
				}
				else if (j.length()==0)
				{
					salida.setText("Ingrese valores faltantes");
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
				e.setText("");
				f.setText("");
				g.setText("");
				h.setText("");
				j.setText("");
				salida.setText("");
			}
		});
	}
}
