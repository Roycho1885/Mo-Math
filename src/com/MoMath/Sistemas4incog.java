package com.MoMath;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Sistemas4incog extends Activity {
	private Button calcular;
	private Button borrar;
	private EditText a;
	private EditText b;
	private EditText c;
	private EditText d;
	private EditText f;
	private EditText a1;
	private EditText b1;
	private EditText c1;
	private EditText d1;
	private EditText f1;
	private EditText a2;
	private EditText b2;
	private EditText c2;
	private EditText d2;
	private EditText f2;
	private EditText a3;
	private EditText b3;
	private EditText c3;
	private EditText d3;
	private EditText f3;
	private TextView TextView16;
	private TextView TextView11;
	private TextView TextView12;
	private TextView TextView5;
	private TextView TextView18;

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
	setContentView(R.layout.sistemas4);
	
	calcular = (Button) findViewById(R.id.calcular);
	borrar = (Button) findViewById(R.id.borrar);
	a = (EditText) findViewById(R.id.a);
	b = (EditText) findViewById(R.id.b);
	c = (EditText) findViewById(R.id.c);
	d = (EditText) findViewById(R.id.d);
	f = (EditText) findViewById(R.id.f);
	a1 = (EditText) findViewById(R.id.a1);
	b1 = (EditText) findViewById(R.id.b1);
	c1 = (EditText) findViewById(R.id.c1);
	d1 = (EditText) findViewById(R.id.d1);
	f1 = (EditText) findViewById(R.id.f1);
	a2 = (EditText) findViewById(R.id.a2);
	b2 = (EditText) findViewById(R.id.b2);
	c2 = (EditText) findViewById(R.id.c2);
	d2 = (EditText) findViewById(R.id.d2);
	f2 = (EditText) findViewById(R.id.f2);
	a3 = (EditText) findViewById(R.id.a3);
	b3 = (EditText) findViewById(R.id.b3);
	c3 = (EditText) findViewById(R.id.c3);
	d3 = (EditText) findViewById(R.id.d3);
	f3 = (EditText) findViewById(R.id.f3);
	TextView16 = (TextView) findViewById(R.id.textView16);
	TextView11 = (TextView) findViewById(R.id.textView11);
	TextView12 = (TextView) findViewById(R.id.textView12);
	TextView5 = (TextView) findViewById(R.id.textView5);
	TextView18 = (TextView) findViewById(R.id.textView18);
	
	calcular.setOnClickListener(new OnClickListener(){
		
		@Override
		public void onClick(View arg0) {
			Toast.makeText(getApplicationContext(), "Calcular", Toast.LENGTH_SHORT).show();
			
			if(a.length() > 0 && b.length() > 0 && c.length() > 0 && d.length() > 0 && f.length() > 0 && a1.length() > 0 && b1.length() > 0 && c1.length() > 0 && d1.length() > 0 && f1.length() > 0 && a2.length() > 0 && b2.length() > 0 && c2.length() > 0 && d2.length() > 0 && f2.length() > 0 && a3.length() > 0 && b3.length() > 0 && c3.length() > 0 && d3.length() > 0 && f3.length() > 0 ){
				String cadena1 = a.getText().toString();
				String cadena2 = b.getText().toString();
				String cadena3 = c.getText().toString();
				String cadena4 = d.getText().toString();
				String cadena5 = f.getText().toString();
				String cadena6 = a1.getText().toString();
				String cadena7 = b1.getText().toString();
				String cadena8 = c1.getText().toString();
				String cadena9 = d1.getText().toString();
				String cadena10 = f1.getText().toString();
				String cadena11 = a2.getText().toString();
				String cadena12 = b2.getText().toString();
				String cadena13 = c2.getText().toString();
				String cadena14 = d2.getText().toString();
				String cadena15 = f2.getText().toString();
				String cadena16 = a3.getText().toString();
				String cadena17 = b3.getText().toString();
				String cadena18 = c3.getText().toString();
				String cadena19 = d3.getText().toString();
				String cadena20 = f3.getText().toString();
				
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
				boolean activo17 = true;
				boolean activo18 = true;
				boolean activo19 = true;
				boolean activo20 = true;
				char cad;
				
				for(int i = 0; i < a.length(); i++)
				{
					char cadenaaux = ',';
					cad = cadena1.charAt(i); 
					if(cad == cadenaaux)
					{
						TextView18.setText("ingrese punto para separar la parte entera de la parte decimal");
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
						TextView18.setText("ingrese punto para separar la parte entera de la parte decimal");
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
						TextView18.setText("ingrese punto para separar la parte entera de la parte decimal");
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
						TextView18.setText("ingrese punto para separar la parte entera de la parte decimal");
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
						TextView18.setText("ingrese punto para separar la parte entera de la parte decimal");
						i = f.length();
						activo5 = false;
					}
					else
					{
				    	activo5 = true;
					}
				}
				for(int i = 0; i < a1.length(); i++)
				{
					char cadenaaux = ',';
					cad = cadena6.charAt(i); 
					if(cad == cadenaaux)
					{
						TextView18.setText("ingrese punto para separar la parte entera de la parte decimal");
						i = a1.length();
						activo6 = false;
					}
					else
					{
				    	activo6 = true;
					}
				}
				for(int i = 0; i < b1.length(); i++)
				{
					char cadenaaux = ',';
					cad = cadena7.charAt(i); 
					if(cad == cadenaaux)
					{
						TextView18.setText("ingrese punto para separar la parte entera de la parte decimal");
						i = b1.length();
						activo7 = false;
					}
					else
					{
				    	activo7 = true;
					}
				}
				for(int i = 0; i < c1.length(); i++)
				{
					char cadenaaux = ',';
					cad = cadena8.charAt(i); 
					if(cad == cadenaaux)
					{
						TextView18.setText("ingrese punto para separar la parte entera de la parte decimal");
						i = c1.length();
						activo8 = false;
					}
					else
					{
				    	activo8 = true;
					}
				}
				for(int i = 0; i < d1.length(); i++)
				{
					char cadenaaux = ',';
					cad = cadena9.charAt(i); 
					if(cad == cadenaaux)
					{
						TextView18.setText("ingrese punto para separar la parte entera de la parte decimal");
						i = d1.length();
						activo9 = false;
					}
					else
					{
				    	activo9 = true;
					}
				}
				for(int i = 0; i < f1.length(); i++)
				{
					char cadenaaux = ',';
					cad = cadena10.charAt(i); 
					if(cad == cadenaaux)
					{
						TextView18.setText("ingrese punto para separar la parte entera de la parte decimal");
						i = f1.length();
						activo10 = false;
					}
					else
					{
				    	activo10 = true;
					}
				}
				for(int i = 0; i < a2.length(); i++)
				{
					char cadenaaux = ',';
					cad = cadena11.charAt(i); 
					if(cad == cadenaaux)
					{
						TextView18.setText("ingrese punto para separar la parte entera de la parte decimal");
						i = a2.length();
						activo11 = false;
					}
					else
					{
				    	activo11 = true;
					}
				}
				for(int i = 0; i < b2.length(); i++)
				{
					char cadenaaux = ',';
					cad = cadena12.charAt(i); 
					if(cad == cadenaaux)
					{
						TextView18.setText("ingrese punto para separar la parte entera de la parte decimal");
						i = b2.length();
						activo12 = false;
					}
					else
					{
				    	activo12 = true;
					}
				}
				for(int i = 0; i < c2.length(); i++)
				{
					char cadenaaux = ',';
					cad = cadena13.charAt(i); 
					if(cad == cadenaaux)
					{
						TextView18.setText("ingrese punto para separar la parte entera de la parte decimal");
						i = c2.length();
						activo13 = false;
					}
					else
					{
				    	activo13 = true;
					}
				}
				for(int i = 0; i < d2.length(); i++)
				{
					char cadenaaux = ',';
					cad = cadena14.charAt(i); 
					if(cad == cadenaaux)
					{
						TextView18.setText("ingrese punto para separar la parte entera de la parte decimal");
						i = d2.length();
						activo14 = false;
					}
					else
					{
				    	activo14 = true;
					}
				}
				for(int i = 0; i < f2.length(); i++)
				{
					char cadenaaux = ',';
					cad = cadena15.charAt(i); 
					if(cad == cadenaaux)
					{
						TextView18.setText("ingrese punto para separar la parte entera de la parte decimal");
						i = f2.length();
						activo15 = false;
					}
					else
					{
				    	activo15 = true;
					}
				}
				for(int i = 0; i < a3.length(); i++)
				{
					char cadenaaux = ',';
					cad = cadena16.charAt(i); 
					if(cad == cadenaaux)
					{
						TextView18.setText("ingrese punto para separar la parte entera de la parte decimal");
						i = a3.length();
						activo16 = false;
					}
					else
					{
				    	activo16 = true;
					}
				}
				for(int i = 0; i < b3.length(); i++)
				{
					char cadenaaux = ',';
					cad = cadena17.charAt(i); 
					if(cad == cadenaaux)
					{
						TextView18.setText("ingrese punto para separar la parte entera de la parte decimal");
						i = b3.length();
						activo17 = false;
					}
					else
					{
				    	activo17 = true;
					}
				}
				for(int i = 0; i < c3.length(); i++)
				{
					char cadenaaux = ',';
					cad = cadena18.charAt(i); 
					if(cad == cadenaaux)
					{
						TextView18.setText("ingrese punto para separar la parte entera de la parte decimal");
						i = c3.length();
						activo18 = false;
					}
					else
					{
				    	activo18 = true;
					}
				}
				for(int i = 0; i < d3.length(); i++)
				{
					char cadenaaux = ',';
					cad = cadena19.charAt(i); 
					if(cad == cadenaaux)
					{
						TextView18.setText("ingrese punto para separar la parte entera de la parte decimal");
						i = d3.length();
						activo19 = false;
					}
					else
					{
				    	activo19 = true;
					}
				}
				for(int i = 0; i < f3.length(); i++)
				{
					char cadenaaux = ',';
					cad = cadena20.charAt(i); 
					if(cad == cadenaaux)
					{
						TextView18.setText("ingrese punto para separar la parte entera de la parte decimal");
						i = f3.length();
						activo20 = false;
					}
					else
					{
				    	activo20 = true;
					}
				}
				
				if(activo1 == true && activo2 == true && activo3 == true && activo4 == true && activo5 == true && activo6 == true && activo7 == true && activo8 == true && activo9 == true && activo10 == true && activo11 == true && activo12 == true && activo13 == true && activo14 == true && activo15 == true && activo16 == true && activo17 == true && activo18 == true && activo19 == true && activo20 == true){
					
					if(isNumeric(a.getText().toString()) && isNumeric( b.getText().toString()) && isNumeric(c.getText().toString()) && isNumeric(d.getText().toString()) && isNumeric( f.getText().toString()) && isNumeric( a1.getText().toString()) && isNumeric( b1.getText().toString()) && isNumeric( c1.getText().toString()) && isNumeric( d1.getText().toString()) && isNumeric( f1.getText().toString()) && isNumeric( a2.getText().toString()) && isNumeric( b2.getText().toString()) && isNumeric( c2.getText().toString()) && isNumeric( d2.getText().toString()) && isNumeric( f2.getText().toString()) && isNumeric( a3.getText().toString()) && isNumeric( b3.getText().toString()) && isNumeric( c3.getText().toString()) && isNumeric( d3.getText().toString()) && isNumeric( f3.getText().toString())){
						
						double a = Double.parseDouble(cadena1);
						double b = Double.parseDouble(cadena2);
						double c = Double.parseDouble(cadena3);
						double d = Double.parseDouble(cadena4);
						double f = Double.parseDouble(cadena5);
						double a1 = Double.parseDouble(cadena6);
						double b1 = Double.parseDouble(cadena7);
						double c1 = Double.parseDouble(cadena8);
						double d1 = Double.parseDouble(cadena9);
						double f1 = Double.parseDouble(cadena10);
						double a2 = Double.parseDouble(cadena11);
						double b2 = Double.parseDouble(cadena12);
						double c2 = Double.parseDouble(cadena13);
						double d2 = Double.parseDouble(cadena14);
						double f2 = Double.parseDouble(cadena15);
						double a3 = Double.parseDouble(cadena16);
						double b3 = Double.parseDouble(cadena17);
						double c3 = Double.parseDouble(cadena18);
						double d3 = Double.parseDouble(cadena19);
						double f3 = Double.parseDouble(cadena20);
						
						double determinantea = a*((b1*c2*d3 + d1*b2*c3 + c1*d2*b3) - (d1*c2*b3 + c1*b2*d3 + b1*d2*c3));
						double determinantea1 = -a1*((b*c2*d3 + d*b2*c3 + c*d2*b3) - (d*c2*b3 + c*b2*d3 + b*d2*c3));
						double determinantea2 = a2*((b*c1*d3 + b1*c3*d + c*d1*b3) - (d*c1*b3 + c*b1*d3 + b*d1*c3));
						double determinantea3 = -a3*((b*c1*d2 + b1*c2*d + c*d1*b2) - (d*c1*b2 + c*b1*d2 + b*d1*c2));
						double determinantegeneral = determinantea + determinantea1 + determinantea2 + determinantea3;
						
						//calculo de a
						double determinantex1 = f*((b1*c2*d3 + d1*b2*c3 + c1*d2*b3) - (d1*c2*b3 + c1*b2*d3 + b1*d2*c3));
						double determinantex2 = -f1*((b*c2*d3 + d*b2*c3 + c*d2*b3) - (d*c2*b3 + c*b2*d3 + b*d2*c3));
						double determinantex3 = f2*((b*c1*d3 + d*b1*c3 + c*d1*b3) - (d*c1*b3 + c*b1*d3 + b*d1*c3));
						double determinantex4 = -f3*((b*c1*d2 + b1*c2*d + c*d1*b2) - (d*c1*b2 + c*b1*d2 + c2*d1*b));
						double determinantex = determinantex1 + determinantex2 + determinantex3 + determinantex4;
						double x = determinantex/determinantegeneral;
						
						//calculo de b
						double determinantey1 = a*((f1*c2*d3 + d1*f2*c3 + c1*d2*f3) - (d1*c2*f3 + c1*f2*d3 + f1*d2*c3));
						double determinantey2 = -a1*((f*c2*d3 + d*f2*c3 + c*d2*f3) - (d*c2*f3 + c*f2*d3 + f*d2*c3));
						double determinantey3 = a2*((f*c1*d3 + f1*c3*d + c*d1*f3) - (d*c1*f3 + c*f1*d3 + c3*d1*f));
						double determinantey4 = -a3*((f*c1*d2 + f1*c2*d + c*d1*f2) - (d*c1*f2 + c*f1*d2 + c2*d1*f));
						double determinantey = determinantey1 + determinantey2 + determinantey3 + determinantey4;
						double y = determinantey/determinantegeneral;
						
						//calculo de c
						double determinantez1 = a*((b1*f2*d3 + b2*f3*d1 + f1*d2*b3) - (d1*f2*b3 + f1*b2*d3 + f3*d2*b1));
						double determinantez2 = -a1*((b*f2*d3 + f*d2*b3 + b2*f3*d) - (d*f2*b3 + f*b2*d3 + b*d2*f3));
						double determinantez3 = a2*((b*f1*d3 + b1*f3*d + f*d1*b3) - (d*f1*b3 + f*b1*d3 + f3*d1*b));
						double determinantez4 = -a3*((b*f1*d2 + b1*f2*d + f*d1*b2) - (d*f1*b2 + f*b1*d2 + f2*d1*b));
						double determinantez = determinantez1 + determinantez2 + determinantez3 + determinantez4;
						double z = determinantez/determinantegeneral;
						
						//calculo de d
						double determinanteh1 = a*((b1*c2*f3 + f1*b2*c3 + c1*f2*b3) - (f1*c2*b3 + c1*b2*f3 + b1*f2*c3));
						double determinanteh2 = -a1*((b*c2*f3 + f*b2*c3 + c*f2*b3) - (f*c2*b3 + c*b2*f3 + c3*f2*b));
						double determinanteh3 = a2*((b*c1*f3 + b1*c3*f + c*f1*b3) - (f*c1*b3 + c*b1*f3 + b*f1*c3));
						double determinanteh4 = -a3*((b*c1*f2 + b1*c2*f + c*f1*b2) - (f*c1*b2 + c*b1*f2 + c2*f1*b));
						double determinanteh = determinanteh1 + determinanteh2 + determinanteh3 + determinanteh4;
						double h = determinanteh/determinantegeneral;
						
						if (determinantegeneral != 0) {
							TextView18.setText("Sistema Compatible Determinado");
							TextView16.setText(""+redondear(x,4));
							TextView11.setText(""+redondear(y,4));
							TextView12.setText(""+redondear(z,4));
							TextView5.setText(""+redondear(h,4));
						}
						if (determinantegeneral == 0 && determinantex == 0 && determinantey == 0 && determinantez == 0 && determinanteh == 0) {
							TextView18.setText("Sistema Compatible Indeterminado");
							TextView16.setText("");
							TextView11.setText("");
							TextView12.setText("");
							TextView5.setText("");
						}
						if (determinantegeneral == 0 && determinantex != 0 && determinantey != 0 && determinantez != 0 && determinanteh != 0) {
							TextView18.setText("Sistema Incompatible");
							TextView16.setText("");
							TextView11.setText("");
							TextView12.setText("");
							TextView5.setText("");
						}
						if (determinantegeneral == 0 && determinantex == 0 && determinantey != 0 && determinantez != 0 && determinanteh != 0) {
							TextView18.setText("Sistema Incompatible");
							TextView16.setText("");
							TextView11.setText("");
							TextView12.setText("");
							TextView5.setText("");
						}	
						if (determinantegeneral == 0 && determinantex != 0 && determinantey == 0 && determinantez != 0 && determinanteh != 0) {
							TextView18.setText("Sistema Incompatible");
							TextView16.setText("");
							TextView11.setText("");
							TextView12.setText("");
							TextView5.setText("");
						}
						if (determinantegeneral == 0 && determinantex != 0 && determinantey != 0 && determinantez == 0 && determinanteh != 0) {
							TextView18.setText("Sistema Incompatible");
							TextView16.setText("");
							TextView11.setText("");
							TextView12.setText("");
							TextView5.setText("");
						}
						if (determinantegeneral == 0 && determinantex != 0 && determinantey != 0 && determinantez != 0 && determinanteh == 0) {
							TextView18.setText("Sistema Incompatible");
							TextView16.setText("");
							TextView11.setText("");
							TextView12.setText("");
							TextView5.setText("");
						}
						if (determinantegeneral == 0 && determinantex == 0 && determinantey == 0 && determinantez != 0 && determinanteh == 0) {
							TextView18.setText("Sistema Incompatible");
							TextView16.setText("");
							TextView11.setText("");
							TextView12.setText("");
							TextView5.setText("");
						}	
						if (determinantegeneral == 0 && determinantex == 0 && determinantey != 0 && determinantez == 0 && determinanteh == 0) {
							TextView18.setText("Sistema Incompatible");
							TextView16.setText("");
							TextView11.setText("");
							TextView12.setText("");
							TextView5.setText("");
						}
						if (determinantegeneral == 0 && determinantex != 0 && determinantey == 0 && determinantez == 0 && determinanteh == 0) {
							TextView18.setText("Sistema Incompatible");
							TextView16.setText("");
							TextView11.setText("");
							TextView12.setText("");
							TextView5.setText("");
						}
						if (determinantegeneral == 0 && determinantex == 0 && determinantey == 0 && determinantez == 0 && determinanteh != 0) {
							TextView18.setText("Sistema Incompatible");
							TextView16.setText("");
							TextView11.setText("");
							TextView12.setText("");
							TextView5.setText("");
						}
						if(a == a1 && a1 == a2 && a2 == a3 && b == b1 && b1 == b2 && b2 == b3 && c == c1 && c1 == c2 && c2 == c3 && d == d1 && d1 == d2 && d2 == d3 && f != f1){
							TextView18.setText("Sistema Incompatible");
							TextView16.setText("");
							TextView11.setText("");
							TextView12.setText("");
							TextView5.setText("");
						}
						if(a == a1 && a1 == a2 && a2 == a3 && b == b1 && b1 == b2 && b2 == b3 && c == c1 && c1 == c2 && c2 == c3 && d == d1 && d1 == d2 && d2 == d3 && f != f3){
							TextView18.setText("Sistema Incompatible");
							TextView16.setText("");
							TextView11.setText("");
							TextView12.setText("");
							TextView5.setText("");
						}
						
						if(a == a1 && a1 == a2 && a2 == a3 && b == b1 && b1 == b2 && b2 == b3 && c == c1 && c1 == c2 && c2 == c3 && d == d1 && d1 == d2 && d2 == d3 && f1 != f2){
							TextView18.setText("Sistema Incompatible");
							TextView16.setText("");
							TextView11.setText("");
							TextView12.setText("");
							TextView5.setText("");
						}
						
						if(a == a1 && a1 == a2 && a2 == a3 && b == b1 && b1 == b2 && b2 == b3 && c == c1 && c1 == c2 && c2 == c3 && d == d1 && d1 == d2 && d2 == d3 && f1 != f3){
							TextView18.setText("Sistema Incompatible");
							TextView16.setText("");
							TextView11.setText("");
							TextView12.setText("");
							TextView5.setText("");
						}
						
						if(a == a1 && a1 == a2 && a2 == a3 && b == b1 && b1 == b2 && b2 == b3 && c == c1 && c1 == c2 && c2 == c3 && d == d1 && d1 == d2 && d2 == d3 && f2 != f3){
							TextView18.setText("Sistema Incompatible");
							TextView16.setText("");
							TextView11.setText("");
							TextView12.setText("");
							TextView5.setText("");
						}
					}
					
					else
					{
						TextView18.setText("Ingrese solo valores numéricos");
					}
				}
				else
				{
					TextView18.setText("Utilice punto para separar la parte entera de la parte decimal");
				}
			}
			
			else if(a.length() == 0 && b.length()== 0 && c.length() == 0 && d.length() == 0 && f.length() == 0 && a1.length() == 0 && b1.length()== 0 && c1.length() == 0 && d1.length() == 0 && f1.length() == 0 && a2.length()== 0 && b2.length()== 0 && c2.length()== 0 && d2.length()== 0 && f2.length()== 0 && a3.length()== 0 && b3.length() == 0 && c3.length() == 0 && d3.length()== 0 && f3.length()== 0){
				
				TextView18.setText("Ingrese los valores de los coeficientes a, b, c y d");
			}
			if (a.length() == 0)
			{
				TextView18.setText("Ingrese valores faltantes");
			}
			if(b.length() == 0)
			{
				TextView18.setText(" Ingrese valores faltantes");
			}
			else if(c.length() == 0)
			{
				TextView18.setText(" Ingrese valores faltantes");
			}
			else if(d.length() == 0)
			{
				TextView18.setText(" Ingrese valores faltantes");
			}	
			else if(f.length() == 0)
			{
				TextView18.setText(" Ingrese valores faltantes");
			}
			else if(a1.length() == 0)
			{
				TextView18.setText(" Ingrese valores faltantes");
			}
			else if(b1.length() == 0)
			{
				TextView18.setText(" Ingrese valores faltantes");
			}
			else if(c1.length() == 0)
			{
				TextView18.setText(" Ingrese valores faltantes");
			}
			else if(d1.length() == 0)
			{
				TextView18.setText(" Ingrese valores faltantes");
			}
			else if(f1.length() == 0)
			{
				TextView18.setText(" Ingrese valores faltantes");
			}
			else if(a2.length() == 0)
			{
				TextView18.setText(" Ingrese valores faltantes");
			}
			else if(b2.length() == 0)
			{
				TextView18.setText(" Ingrese valores faltantes");
			}
			else if(c2.length() == 0)
			{
				TextView18.setText(" Ingrese valores faltantes");
			}
			else if(d2.length() == 0)
			{
				TextView18.setText(" Ingrese valores faltantes");
			}
			else if(f2.length() == 0)
			{
				TextView18.setText(" Ingrese valores faltantes");
			}
			else if(a3.length() == 0)
			{
				TextView18.setText(" Ingrese valores faltantes");
			}
			else if(b3.length() == 0)
			{
				TextView18.setText(" Ingrese valores faltantes");
			}
			else if(c3.length() == 0)
			{
				TextView18.setText(" Ingrese valores faltantes");
			}
			else if(d3.length() == 0)
			{
				TextView18.setText(" Ingrese valores faltantes");
			}
			else if(f3.length() == 0)
			{
				TextView18.setText(" Ingrese valores faltantes");
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
			a1.setText("");
			b1.setText("");
			c1.setText("");
			d1.setText("");
			f1.setText("");
			a2.setText("");
			b2.setText("");
			c2.setText("");
			d2.setText("");
			f2.setText("");
			a3.setText("");
			b3.setText("");
			c3.setText("");
			d3.setText("");
			f3.setText("");	
			TextView11.setText("");
			TextView16.setText("");
			TextView12.setText("");
			TextView5.setText("");
			TextView18.setText("");
		}
	});
}					
}
