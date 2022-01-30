package com.MoMath;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class deter4x4 extends Activity {
	
	private Button calcular;
	private Button borrar;
	private EditText a1;
	private EditText a2;
	private EditText a3;
	private EditText a4;
	private EditText a5;
	private EditText a6;
	private EditText a7;
	private EditText a8;
	private EditText a9;
	private EditText a10;
	private EditText a11;
	private EditText a12;
	private EditText a13;
	private EditText a14;
	private EditText a15;
	private EditText a16;
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
		setContentView(R.layout.determinantes4x4);
		
		calcular = (Button) findViewById(R.id.calcular);
		borrar = (Button) findViewById(R.id.borrar);
		a1 = (EditText) findViewById(R.id.a);
		a2 = (EditText) findViewById(R.id.b);
		a3 = (EditText) findViewById(R.id.c);
		a4 = (EditText) findViewById(R.id.d);
		a5 = (EditText) findViewById(R.id.e);
		a6 = (EditText) findViewById(R.id.f);
		a7 = (EditText) findViewById(R.id.g);
		a8 = (EditText) findViewById(R.id.h);
		a9 = (EditText) findViewById(R.id.j);
		a10= (EditText) findViewById(R.id.k);
		a11= (EditText) findViewById(R.id.l);
		a12= (EditText) findViewById(R.id.m);
		a13= (EditText) findViewById(R.id.n);
		a14= (EditText) findViewById(R.id.o);
		a15= (EditText) findViewById(R.id.p);
		a16= (EditText) findViewById(R.id.q);
		salida = (TextView) findViewById(R.id.salida);
		
		calcular.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				Toast.makeText(getApplicationContext(), "Calcular", Toast.LENGTH_SHORT).show();
				
				if(a1.length() > 0 && a2.length() > 0 && a3.length() > 0 && a4.length() > 0 && a5.length()>0 && a6.length()>0 && a7.length()>0 && a8.length()>0 && a9.length()>0 && a10.length()>0 && a11.length()>0 && a12.length()>0 && a13.length()>0 && a14.length()>0 && a15.length()>0 && a16.length()>0){
					String cadena1 = a1.getText().toString();
					String cadena2 = a2.getText().toString();
					String cadena3 = a3.getText().toString();
					String cadena4 = a4.getText().toString();
					String cadena5 = a5.getText().toString();
					String cadena6 = a6.getText().toString();
					String cadena7 = a7.getText().toString();
					String cadena8 = a8.getText().toString();
					String cadena9 = a9.getText().toString();
					String cadena10 = a10.getText().toString();
					String cadena11 = a11.getText().toString();
					String cadena12 = a12.getText().toString();
					String cadena13 = a13.getText().toString();
					String cadena14 = a14.getText().toString();
					String cadena15 = a15.getText().toString();
					String cadena16 = a16.getText().toString();
					
					boolean activo1 = true;
					boolean activo2 = true;
					boolean activo3 = true;
					boolean activo4 = true;
					boolean activo5 = true;
					boolean activo6 = true;
					boolean activo7 = true;
					boolean activo8 = true;
					boolean activo9 = true;
					boolean activo10 = true;
					boolean activo11 = true;
					boolean activo12 = true;
					boolean activo13 = true;
					boolean activo14 = true;
					boolean activo15 = true;
					boolean activo16 = true;
					char cad;
					
					for(int i = 0; i < a1.length(); i++)
					{
						char cadenaaux = ',';
						cad = cadena1.charAt(i); 
						if(cad == cadenaaux)
						{
							salida.setText("ingrese punto para separar la parte entera de la parte decimal");
							i = a1.length();
							activo1 = false;
						}
						else
						{
					    	activo1 = true;
						}
					}
					
					for(int i = 0; i < a2.length(); i++)
					{
						char cadenaaux = ',';
						cad = cadena2.charAt(i); 
						if(cad == cadenaaux)
						{
							salida.setText("ingrese punto para separar la parte entera de la parte decimal");
							i = a2.length();
							activo2 = false;
						}
						else
						{
					    	activo2 = true;
						}
					}
					
					for(int i = 0; i < a3.length(); i++)
					{
						char cadenaaux = ',';
						cad = cadena3.charAt(i); 
						if(cad == cadenaaux)
						{
							salida.setText("ingrese punto para separar la parte entera de la parte decimal");
							i = a3.length();
							activo3 = false;
						}
						else
						{
					    	activo3 = true;
						}
					}
					
					for(int i = 0; i < a4.length(); i++)
					{
						char cadenaaux = ',';
						cad = cadena4.charAt(i); 
						if(cad == cadenaaux)
						{
							salida.setText("ingrese punto para separar la parte entera de la parte decimal");
							i = a4.length();
							activo4 = false;
						}
						else
						{
					    	activo4 = true;
						}
					}
					
					for(int i = 0; i < a5.length(); i++)
					{
						char cadenaaux = ',';
						cad = cadena5.charAt(i); 
						if(cad == cadenaaux)
						{
							salida.setText("ingrese punto para separar la parte entera de la parte decimal");
							i = a5.length();
							activo5 = false;
						}
						else
						{
					    	activo5 = true;
						}
					}
					
					for(int i = 0; i < a6.length(); i++)
					{
						char cadenaaux = ',';
						cad = cadena6.charAt(i); 
						if(cad == cadenaaux)
						{
							salida.setText("ingrese punto para separar la parte entera de la parte decimal");
							i = a6.length();
							activo6 = false;
						}
						else
						{
					    	activo6 = true;
						}
					}
					
					for(int i = 0; i < a7.length(); i++)
					{
						char cadenaaux = ',';
						cad = cadena7.charAt(i); 
						if(cad == cadenaaux)
						{
							salida.setText("ingrese punto para separar la parte entera de la parte decimal");
							i = a7.length();
							activo7 = false;
						}
						else
						{
					    	activo7 = true;
						}
					}
					
					for(int i = 0; i < a8.length(); i++)
					{
						char cadenaaux = ',';
						cad = cadena8.charAt(i); 
						if(cad == cadenaaux)
						{
							salida.setText("ingrese punto para separar la parte entera de la parte decimal");
							i = a8.length();
							activo8 = false;
						}
						else
						{
					    	activo8 = true;
						}
					}
					
					for(int i = 0; i < a9.length(); i++)
					{
						char cadenaaux = ',';
						cad = cadena9.charAt(i); 
						if(cad == cadenaaux)
						{
							salida.setText("ingrese punto para separar la parte entera de la parte decimal");
							i = a9.length();
							activo9 = false;
						}
						else
						{
					    	activo9 = true;
						}
					}
					
					for(int i = 0; i < a10.length(); i++)
					{
						char cadenaaux = ',';
						cad = cadena10.charAt(i); 
						if(cad == cadenaaux)
						{
							salida.setText("ingrese punto para separar la parte entera de la parte decimal");
							i = a10.length();
							activo10 = false;
						}
						else
						{
					    	activo10 = true;
						}
					}
					
					for(int i = 0; i < a11.length(); i++)
					{
						char cadenaaux = ',';
						cad = cadena11.charAt(i); 
						if(cad == cadenaaux)
						{
							salida.setText("ingrese punto para separar la parte entera de la parte decimal");
							i = a11.length();
							activo11 = false;
						}
						else
						{
					    	activo11 = true;
						}
					}
					
					for(int i = 0; i < a12.length(); i++)
					{
						char cadenaaux = ',';
						cad = cadena12.charAt(i); 
						if(cad == cadenaaux)
						{
							salida.setText("ingrese punto para separar la parte entera de la parte decimal");
							i = a12.length();
							activo12 = false;
						}
						else
						{
					    	activo12 = true;
						}
					}
					
					for(int i = 0; i < a13.length(); i++)
					{
						char cadenaaux = ',';
						cad = cadena13.charAt(i); 
						if(cad == cadenaaux)
						{
							salida.setText("ingrese punto para separar la parte entera de la parte decimal");
							i = a13.length();
							activo13 = false;
						}
						else
						{
					    	activo13 = true;
						}
					}
					
					for(int i = 0; i < a14.length(); i++)
					{
						char cadenaaux = ',';
						cad = cadena14.charAt(i); 
						if(cad == cadenaaux)
						{
							salida.setText("ingrese punto para separar la parte entera de la parte decimal");
							i = a14.length();
							activo14 = false;
						}
						else
						{
					    	activo14 = true;
						}
					}
					
					for(int i = 0; i < a15.length(); i++)
					{
						char cadenaaux = ',';
						cad = cadena15.charAt(i); 
						if(cad == cadenaaux)
						{
							salida.setText("ingrese punto para separar la parte entera de la parte decimal");
							i = a15.length();
							activo15 = false;
						}
						else
						{
					    	activo15 = true;
						}
					}
					
					for(int i = 0; i < a16.length(); i++)
					{
						char cadenaaux = ',';
						cad = cadena16.charAt(i); 
						if(cad == cadenaaux)
						{
							salida.setText("ingrese punto para separar la parte entera de la parte decimal");
							i = a16.length();
							activo16 = false;
						}
						else
						{
					    	activo16 = true;
						}
					}
					
					if(activo1 == true && activo2 == true && activo3 == true && activo4 == true && activo5 == true && activo6 == true && activo7 == true && activo8 == true && activo9 == true && activo10 == true && activo11 == true && activo12 == true && activo13 == true && activo14 == true && activo15 == true && activo16 == true){
						
						if(isNumeric(a1.getText().toString()) && isNumeric( a2.getText().toString()) && isNumeric(a3.getText().toString()) && isNumeric(a4.getText().toString()) && isNumeric(a5.getText().toString())&&isNumeric(a6.getText().toString())&&isNumeric(a7.getText().toString()) && isNumeric(a8.getText().toString()) && isNumeric(a9.getText().toString()) && isNumeric(a10.getText().toString()) && isNumeric(a11.getText().toString()) && isNumeric(a12.getText().toString()) && isNumeric(a13.getText().toString()) && isNumeric(a14.getText().toString()) && isNumeric(a15.getText().toString()) && isNumeric(a16.getText().toString())){
							
							double a1 = Double.parseDouble(cadena1);
							double a2 = Double.parseDouble(cadena2);
							double a3 = Double.parseDouble(cadena3);
							double a4 = Double.parseDouble(cadena4);
							double a5 = Double.parseDouble(cadena5);
							double a6 = Double.parseDouble(cadena6);
							double a7 = Double.parseDouble(cadena7);
							double a8 = Double.parseDouble(cadena8);
							double a9 = Double.parseDouble(cadena9);
							double a10 = Double.parseDouble(cadena10);
							double a11 = Double.parseDouble(cadena11);
							double a12 = Double.parseDouble(cadena12);
							double a13 = Double.parseDouble(cadena13);
							double a14 = Double.parseDouble(cadena14);
							double a15 = Double.parseDouble(cadena15);
							double a16 = Double.parseDouble(cadena16);
							double c1 = (a6*a11*a16 + a10*a15*a8 + a7*a12*a14) - (a8*a11*a14 + a7*a10*a16 + a15*a12*a6);
							double c2 = (a2*a11*a16 + a10*a15*a4 + a3*a12*a14) - (a4*a11*a14 + a3*a10*a16 + a15*a12*a2);
							double c3 = (a2*a7*a16 + a6*a4*a15 + a14*a8*a3) - (a4*a7*a14 + a3*a6*a16 + a2*a8*a15);
							double c4 = (a2*a7*a12 + a6*a4*a11 + a10*a8*a3) - (a4*a7*a10 + a3*a6*a12 + a2*a8*a11);
							double determinante = (a1*c1 - a5*c2 + a9*c3 - a13*c4);
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
			else if(a1.length() == 0 && a2.length() == 0 && a3.length() == 0 && a4.length() == 0 && a5.length()==0 && a6.length()==0 && a7.length()==0 && a8.length()==0 && a9.length()==0 && a10.length() == 0 && a11.length() == 0 && a12.length() == 0 && a13.length()==0 && a14.length()==0 && a15.length()==0 && a16.length()==0){
					salida.setText("Ingrese los valores");
				}
				if(a2.length() == 0)
				{
					salida.setText(" Ingrese valores faltantes");
				}
				else if(a3.length() == 0)
				{
					salida.setText(" Ingrese valores faltantes");
				}
				else if(a4.length() == 0)
				{
					salida.setText(" Ingrese valores faltantes");
				}
				else if (a5.length()==0)
				{
					salida.setText("Ingrese valores faltantes");
				}
				else if (a6.length()==0)
				{
					salida.setText("Ingrese valores faltantes");
				}
				else if (a7.length()==0)
				{
					salida.setText("Ingrese valores faltantes");
				}
				else if (a8.length()==0)
				{
					salida.setText("Ingrese valores faltantes");
				}
				else if (a9.length()==0)
				{
					salida.setText("Ingrese valores faltantes");
				}
				else if (a10.length()==0)
				{
					salida.setText("Ingrese valores faltantes");
				}
				else if (a11.length()==0)
				{
					salida.setText("Ingrese valores faltantes");
				}
				else if (a12.length()==0)
				{
					salida.setText("Ingrese valores faltantes");
				}
				else if (a13.length()==0)
				{
					salida.setText("Ingrese valores faltantes");
				}
				else if (a14.length()==0)
				{
					salida.setText("Ingrese valores faltantes");
				}
				else if (a15.length()==0)
				{
					salida.setText("Ingrese valores faltantes");
				}
				else if (a16.length()==0)
				{
					salida.setText("Ingrese valores faltantes");
				}
			}
	});
		
		borrar.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				Toast.makeText(getApplicationContext(), "Borrar", Toast.LENGTH_SHORT).show();
				a1.setText("");
				a2.setText("");
				a3.setText("");
				a4.setText("");
				a5.setText("");
				a6.setText("");
				a7.setText("");
				a8.setText("");
				a9.setText("");
				a10.setText("");
				a11.setText("");
				a12.setText("");
				a13.setText("");
				a14.setText("");
				a15.setText("");
				a16.setText("");
				salida.setText("");
			}
		});

	}
}

