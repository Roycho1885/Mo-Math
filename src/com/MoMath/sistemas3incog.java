package com.MoMath;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class sistemas3incog extends Activity {
	
	private Button calcular;
	private Button borrar;
	private EditText d;
	private EditText f;
	private EditText g;
	private EditText h;
	private EditText i;
	private EditText j;
	private EditText k;
	private EditText l;
	private EditText m;
	private EditText n;
	private EditText o;
	private EditText p;
	private TextView textView16;
	private TextView textView11;
	private TextView textView12;
	private TextView textView18;

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
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sistemas3);
		
		calcular = (Button) findViewById(R.id.calcular);
		borrar = (Button) findViewById(R.id.borrar);
		d = (EditText) findViewById(R.id.editText4);
		f = (EditText) findViewById(R.id.editText5);
		g = (EditText) findViewById(R.id.editText6);
		h = (EditText) findViewById(R.id.editText7);
		i = (EditText) findViewById(R.id.editText8);
		j = (EditText) findViewById(R.id.editText9);
		k = (EditText) findViewById(R.id.editText10);
		l = (EditText) findViewById(R.id.editText11);
		m = (EditText) findViewById(R.id.editText12);
		n = (EditText) findViewById(R.id.editText13);
		o = (EditText) findViewById(R.id.editText14);
		p = (EditText) findViewById(R.id.editText15);
		textView16 = (TextView) findViewById(R.id.textView16);
		textView11 = (TextView) findViewById(R.id.textView11);
		textView12 = (TextView) findViewById(R.id.textView12);
		textView18 = (TextView) findViewById(R.id.textView18);
		
		calcular.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				Toast.makeText(getApplicationContext(), "Calcular", Toast.LENGTH_SHORT).show();
				
				if (d.length() > 0 && f.length() > 0 && g.length()> 0 && h.length() > 0 && i.length() > 0 && j.length() > 0 && k.length() > 0 && l.length() > 0 && m.length() > 0 && n.length() > 0 && o.length() > 0 && p.length() > 0) {
					String cadena1 = d.getText().toString();
					String cadena2 = f.getText().toString(); 
					String cadena3 = g.getText().toString();
					String cadena4 = h.getText().toString();
					String cadena5 = i.getText().toString();
					String cadena6 = j.getText().toString();
					String cadena7 = k.getText().toString();
					String cadena8 = l.getText().toString(); 
					String cadena9 = m.getText().toString();
					String cadena10 = n.getText().toString();
					String cadena11 = o.getText().toString();
					String cadena12 = p.getText().toString();
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
					char cad;
					
					for(int a = 0; a < d.length(); a++)
					{
						char cadenaaux = ',';
						cad = cadena1.charAt(a); 
						if(cad == cadenaaux)
						{
							textView18.setText("Ingrese punto para separar la parte entera de la parte decimal");
							a = d.length();
							activo1 = false;
						}
						else
						{
					    	activo1 = true;
						}
					}
					
					for(int a = 0; a < f.length(); a++)
					{
						char cadenaaux = ',';
						cad = cadena2.charAt(a); 
						if(cad == cadenaaux)
						{
							textView18.setText("Ingrese punto para separar la parte entera de la parte decimal");
							a = f.length();
							activo2 = false;
						}
						else
						{
					    	activo2 = true;
						}
					}
					
					for(int a = 0; a < g.length(); a++)
					{
						char cadenaaux = ',';
						cad = cadena3.charAt(a); 
						if(cad == cadenaaux)
						{
							textView18.setText("Ingrese punto para separar la parte entera de la parte decimal");
							a = g.length();
							activo3 = false;
						}
						else
						{
					    	activo3 = true;
						}
					}
					
					for(int a = 0; a < h.length(); a++)
					{
						char cadenaaux = ',';
						cad = cadena4.charAt(a); 
						if(cad == cadenaaux)
						{
							textView18.setText("Ingrese punto para separar la parte entera de la parte decimal");
							a = h.length();
							activo4 = false;
						}
						else
						{
					    	activo4 = true;
						}
					}
					
					for(int a = 0; a < i.length(); a++)
					{
						char cadenaaux = ',';
						cad = cadena5.charAt(a); 
						if(cad == cadenaaux)
						{
							textView18.setText("Ingrese punto para separar la parte entera de la parte decimal");
							a = i.length();
							activo5 = false;
						}
						else
						{
					    	activo5 = true;
						}
					}
					
					for(int a = 0; a < j.length(); a++)
					{
						char cadenaaux = ',';
						cad = cadena6.charAt(a); 
						if(cad == cadenaaux)
						{
							textView18.setText("Ingrese punto para separar la parte entera de la parte decimal");
							a = j.length();
							activo6 = false;
						}
						else
						{
					    	activo6 = true;
						}
					}
					
					for(int a = 0; a < k.length(); a++)
					{
						char cadenaaux = ',';
						cad = cadena7.charAt(a); 
						if(cad == cadenaaux)
						{
							textView18.setText("Ingrese punto para separar la parte entera de la parte decimal");
							a = k.length();
							activo7 = false;
						}
						else
						{
					    	activo7 = true;
						}
					}
					
					for(int a = 0; a < l.length(); a++)
					{
						char cadenaaux = ',';
						cad = cadena8.charAt(a); 
						if(cad == cadenaaux)
						{
							textView18.setText("Ingrese punto para separar la parte entera de la parte decimal");
							a = l.length();
							activo8 = false;
						}
						else
						{
					    	activo8 = true;
						}
					}
					
					for(int a = 0; a < m.length(); a++)
					{
						char cadenaaux = ',';
						cad = cadena9.charAt(a); 
						if(cad == cadenaaux)
						{
							textView18.setText("Ingrese punto para separar la parte entera de la parte decimal");
							a = m.length();
							activo9 = false;
						}
						else
						{
					    	activo9 = true;
						}
					}
					
					for(int a = 0; a < n.length(); a++)
					{
						char cadenaaux = ',';
						cad = cadena10.charAt(a); 
						if(cad == cadenaaux)
						{
							textView18.setText("Ingrese punto para separar la parte entera de la parte decimal");
							a = n.length();
							activo10 = false;
						}
						else
						{
					    	activo10 = true;
						}
					}
					
					for(int a = 0; a < o.length(); a++)
					{
						char cadenaaux = ',';
						cad = cadena11.charAt(a); 
						if(cad == cadenaaux)
						{
							textView18.setText("Ingrese punto para separar la parte entera de la parte decimal");
							a = o.length();
							activo11 = false;
						}
						else
						{
					    	activo11 = true;
						}
					}
					
					for(int a = 0; a < p.length(); a++)
					{
						char cadenaaux = ',';
						cad = cadena12.charAt(a); 
						if(cad == cadenaaux)
						{
							textView18.setText("Ingrese punto para separar la parte entera de la parte decimal");
							a = p.length();
							activo12 = false;
						}
						else
						{
					    	activo12 = true;
						}
					}
					
					if(activo1 == true && activo2 == true && activo3 == true && activo4 == true && activo5==true && activo6 == true && activo7 == true && activo8 == true && activo9 == true && activo10 == true && activo11 == true && activo12 == true){
						
						if(isNumeric(d.getText().toString()) && isNumeric( f.getText().toString()) && isNumeric(g.getText().toString()) && isNumeric(h.getText().toString()) && isNumeric(i.getText().toString()) && isNumeric(j.getText().toString()) && isNumeric(k.getText().toString()) && isNumeric(l.getText().toString()) && isNumeric(m.getText().toString()) && isNumeric(n.getText().toString()) && isNumeric(o.getText().toString()) && isNumeric(p.getText().toString())){
							
							double a4 = Double.parseDouble(cadena1);
							double a5 = Double.parseDouble(cadena2);
							double a6 = Double.parseDouble(cadena3);
							double a7 = Double.parseDouble(cadena4);
							double a8 = Double.parseDouble(cadena5);
							double a9 = Double.parseDouble(cadena6);
							double a10 = Double.parseDouble(cadena7);
							double a11 = Double.parseDouble(cadena8);
							double a12 = Double.parseDouble(cadena9);
							double a13 = Double.parseDouble(cadena10);
							double a14 = Double.parseDouble(cadena11);
							double a15 = Double.parseDouble(cadena12);
							
							double deter = ((a4 * a8 * a12) + (a5 * a9 * a10) + (a7 * a11 * a6) - ((a10 * a8 * a6) + (a11 * a9 * a4) + (a7 * a5 * a12)));
							deter = redondear(deter,4);
							double resultadox = (((a13 * a8 * a12) + (a14 * a9 * a10) + (a15 * a7 * a11)) - ((a10 * a8 * a15) + (a11 * a9 * a13) + (a7 * a14 * a12)));
							resultadox = redondear(resultadox,4);
							double resultadoy = (((a4 * a14 * a12) + (a5 * a15 * a10) + (a6 * a13 * a11)) - ((a10 * a14 * a6) + (a11 * a15 * a4) + (a12 * a13 * a5)));
							resultadoy = redondear(resultadoy,4);
							double resultadoz = (((a4 * a8 * a15) + (a5 * a9 * a13) + (a6 * a7 * a14)) - ((a13 * a8 * a6) + (a14 * a9 * a4) + (a15 * a7 * a5)));
							resultadoz = redondear(resultadoz,4);
							double x = resultadox / deter;
							double y = resultadoy / deter;
							double z = resultadoz / deter;
							if (deter != 0) {
								textView18.setText("Sistema Compatible Determinado");
								textView16.setText(""+redondear (x,2));
								textView11.setText(""+redondear(y,2));
								textView12.setText(""+ redondear(z,2));
							}
							if (deter == 0 && resultadox != 0 && resultadoy != 0 && resultadoz != 0) {
								textView18.setText("Sistema Incompatible");
								textView16.setText("");
								textView11.setText("");
								textView12.setText("");
							}
							if (deter == 0 && resultadox == 0 && resultadoy != 0 && resultadoz != 0) {
								textView18.setText("Sistema Incompatible");
								textView16.setText("");
								textView11.setText("");
								textView12.setText("");
							}
							if (deter == 0 && resultadox != 0 && resultadoy == 0 && resultadoz != 0) {
								textView18.setText("Sistema Incompatible");
								textView16.setText("");
								textView11.setText("");
								textView12.setText("");
							}	
							if (deter == 0 && resultadox == 0 && resultadoy == 0 && resultadoz != 0) {
								textView18.setText("Sistema Incompatible");
								textView16.setText("");
								textView11.setText("");
								textView12.setText("");
							}
							if (deter == 0 && resultadox != 0 && resultadoy == 0 && resultadoz == 0) {
								textView18.setText("Sistema Incompatible");
								textView16.setText("");
								textView11.setText("");
								textView12.setText("");
							}
							if (deter == 0 && resultadox != 0 && resultadoy != 0 && resultadoz == 0) {
								textView18.setText("Sistema Incompatible");
								textView16.setText("");
								textView11.setText("");
								textView12.setText("");
							}
							if (deter == 0 && resultadox == 0 && resultadoy != 0 && resultadoz == 0) {
								textView18.setText("Sistema Incompatible");
								textView16.setText("");
								textView11.setText("");
								textView12.setText("");
							}	
							if (deter == 0 && resultadox == 0 && resultadoy == 0 && resultadoz == 0) {
								textView18.setText("Sistema Compatible Indeterminado");
								textView16.setText("");
								textView11.setText("");
								textView12.setText("");
							}
							
							} else {
								textView18.setText("Ingrese solo valores numericos");
							}
						} else {
							textView18.setText("Utilice punto para separar la parte entera de la parte decimal");
						}

					} else if (d.length() == 0 && f.length() == 0 && g.length() == 0 && h.length() == 0 && i.length() == 0 && j.length() == 0 && k.length() == 0 && l.length() == 0 && m.length() == 0 && n.length() == 0 && o.length() == 0 && p.length() == 0) {
						textView18.setText("Ingrese los valores");
					}
					
					if (d.length() == 0) {
						textView18.setText("Ingrese valores faltantes");
					} else if (f.length() == 0) {
						textView18.setText("Ingrese valores faltantes");
					} else if (g.length() == 0) {
						textView18.setText("Ingrese valores faltantes");
					} else if (h.length() == 0) {
						textView18.setText("Ingrese valores faltantes");
					} else if (h.length() == 0) {
						textView18.setText("Ingrese valores faltantes");
					} else if (i.length() == 0) {
						textView18.setText("Ingrese valores faltantes");
					} else if (j.length() == 0) {
						textView18.setText("Ingrese valores faltantes");
					} else if (k.length() == 0) {
						textView18.setText("Ingrese valores faltantes");
					} else if (l.length() == 0) {
						textView18.setText("Ingrese valores faltantes");
					} else if (m.length() == 0) {
						textView18.setText("Ingrese valores faltantes");
					} else if (n.length() == 0) {
						textView18.setText("Ingrese valores faltantes");
					} else if (o.length() == 0) {
						textView18.setText("Ingrese valores faltantes");
					} else if (p.length() == 0) {
						textView18.setText("Ingrese valores faltantes");
					}
			}
		});
			
	
		
		borrar.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				Toast.makeText(getApplicationContext(), "Borrar", Toast.LENGTH_SHORT).show();
				d.setText("");
				f.setText("");
				g.setText("");
				h.setText("");
				i.setText("");
				j.setText("");
				k.setText("");
				l.setText("");
				m.setText("");
				n.setText("");
				o.setText("");
				p.setText("");
				textView18.setText("");
				textView11.setText("");
				textView12.setText("");
				textView16.setText("");
				
			}
			
		});
	}
}
