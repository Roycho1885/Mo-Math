package com.MoMath;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class deter5x5 extends Activity{
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
	private EditText k;
	private EditText l;
	private EditText m;
	private EditText n;
	private EditText o;
	private EditText p;
	private EditText q;
	private EditText r;
	private EditText s;
	private EditText t;
	private EditText u;
	private EditText v;
	private EditText w;
	private EditText x;
	private EditText y;
	private EditText z;
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
		setContentView(R.layout.determinantes5x5);
		
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
		k = (EditText) findViewById(R.id.k);
		l = (EditText) findViewById(R.id.l);
		m = (EditText) findViewById(R.id.m);
		n = (EditText) findViewById(R.id.n);
		o = (EditText) findViewById(R.id.o);
		p = (EditText) findViewById(R.id.p);
		q = (EditText) findViewById(R.id.q);
		r = (EditText) findViewById(R.id.r);
		s = (EditText) findViewById(R.id.s);
		t = (EditText) findViewById(R.id.t);
		u = (EditText) findViewById(R.id.u);
		v = (EditText) findViewById(R.id.v);
		w = (EditText) findViewById(R.id.w);
		x = (EditText) findViewById(R.id.x);
		y = (EditText) findViewById(R.id.y);
		z = (EditText) findViewById(R.id.z);
		textView1 = (TextView) findViewById(R.id.textView1);
		
		calcular.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				Toast.makeText(getApplicationContext(), "Calcular", Toast.LENGTH_SHORT).show();
				
				if(a.length() > 0 && b.length() > 0 && c.length() > 0 && d.length() > 0 && e.length() > 0 && f.length() > 0 && g.length() > 0 && h.length() > 0 && j.length() > 0 && k.length() > 0 && l.length() > 0 && m.length() > 0 && n.length() > 0 && o.length() > 0 && p.length() > 0 && q.length() > 0 && r.length() > 0 && s.length() > 0 && t.length() > 0 && u.length() > 0 && v.length() > 0 && w.length() > 0 && x.length() > 0 && y.length() > 0 && z.length() > 0){
					String cadena1 = a.getText().toString();
					String cadena2 = b.getText().toString();
					String cadena3 = c.getText().toString();
					String cadena4 = d.getText().toString();
					String cadena5 = e.getText().toString();
					String cadena6 = f.getText().toString();
					String cadena7 = g.getText().toString();
					String cadena8 = h.getText().toString();
					String cadena9 = j.getText().toString();
					String cadena10 = k.getText().toString();
					String cadena11 = l.getText().toString();
					String cadena12 = m.getText().toString();
					String cadena13 = n.getText().toString();
					String cadena14 = o.getText().toString();
					String cadena15 = p.getText().toString();
					String cadena16 = q.getText().toString();
					String cadena17 = r.getText().toString();
					String cadena18 = s.getText().toString();
					String cadena19 = t.getText().toString();
					String cadena20 = u.getText().toString();
					String cadena21 = v.getText().toString();
					String cadena22 = w.getText().toString();
					String cadena23 = x.getText().toString();
					String cadena24 = y.getText().toString();
					String cadena25 = z.getText().toString();
					
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
					boolean activo21 = true;
					boolean activo22 = true;
					boolean activo23 = true;
					boolean activo24 = true;
					boolean activo25 = true;
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
					for(int i = 0; i < e.length(); i++)
					{
						char cadenaaux = ',';
						cad = cadena5.charAt(i); 
						if(cad == cadenaaux)
						{
							textView1.setText("ingrese punto para separar la parte entera de la parte decimal");
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
							textView1.setText("ingrese punto para separar la parte entera de la parte decimal");
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
							textView1.setText("ingrese punto para separar la parte entera de la parte decimal");
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
							textView1.setText("ingrese punto para separar la parte entera de la parte decimal");
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
							textView1.setText("ingrese punto para separar la parte entera de la parte decimal");
							i = j.length();
							activo9 = false;
						}
						else
						{
					    	activo9 = true;
						}
					}
					for(int i = 0; i < k.length(); i++)
					{
						char cadenaaux = ',';
						cad = cadena10.charAt(i); 
						if(cad == cadenaaux)
						{
							textView1.setText("ingrese punto para separar la parte entera de la parte decimal");
							i = k.length();
							activo10 = false;
						}
						else
						{
					    	activo10 = true;
						}
					}
					for(int i = 0; i < l.length(); i++)
					{
						char cadenaaux = ',';
						cad = cadena11.charAt(i); 
						if(cad == cadenaaux)
						{
							textView1.setText("ingrese punto para separar la parte entera de la parte decimal");
							i = l.length();
							activo11 = false;
						}
						else
						{
					    	activo11 = true;
						}
					}
					for(int i = 0; i < m.length(); i++)
					{
						char cadenaaux = ',';
						cad = cadena12.charAt(i); 
						if(cad == cadenaaux)
						{
							textView1.setText("ingrese punto para separar la parte entera de la parte decimal");
							i = m.length();
							activo12 = false;
						}
						else
						{
					    	activo12 = true;
						}
					}
					for(int i = 0; i < n.length(); i++)
					{
						char cadenaaux = ',';
						cad = cadena13.charAt(i); 
						if(cad == cadenaaux)
						{
							textView1.setText("ingrese punto para separar la parte entera de la parte decimal");
							i = n.length();
							activo13 = false;
						}
						else
						{
					    	activo13 = true;
						}
					}
					for(int i = 0; i < o.length(); i++)
					{
						char cadenaaux = ',';
						cad = cadena14.charAt(i); 
						if(cad == cadenaaux)
						{
							textView1.setText("ingrese punto para separar la parte entera de la parte decimal");
							i = o.length();
							activo14 = false;
						}
						else
						{
					    	activo14 = true;
						}
					}
					for(int i = 0; i < p.length(); i++)
					{
						char cadenaaux = ',';
						cad = cadena15.charAt(i); 
						if(cad == cadenaaux)
						{
							textView1.setText("ingrese punto para separar la parte entera de la parte decimal");
							i = p.length();
							activo15 = false;
						}
						else
						{
					    	activo15 = true;
						}
					}
					for(int i = 0; i < q.length(); i++)
					{
						char cadenaaux = ',';
						cad = cadena16.charAt(i); 
						if(cad == cadenaaux)
						{
							textView1.setText("ingrese punto para separar la parte entera de la parte decimal");
							i = q.length();
							activo16 = false;
						}
						else
						{
					    	activo16 = true;
						}
					}
					for(int i = 0; i < r.length(); i++)
					{
						char cadenaaux = ',';
						cad = cadena17.charAt(i); 
						if(cad == cadenaaux)
						{
							textView1.setText("ingrese punto para separar la parte entera de la parte decimal");
							i = r.length();
							activo17 = false;
						}
						else
						{
					    	activo17 = true;
						}
					}
					for(int i = 0; i < s.length(); i++)
					{
						char cadenaaux = ',';
						cad = cadena18.charAt(i); 
						if(cad == cadenaaux)
						{
							textView1.setText("ingrese punto para separar la parte entera de la parte decimal");
							i = s.length();
							activo18 = false;
						}
						else
						{
					    	activo18 = true;
						}
					}
					for(int i = 0; i < t.length(); i++)
					{
						char cadenaaux = ',';
						cad = cadena19.charAt(i); 
						if(cad == cadenaaux)
						{
							textView1.setText("ingrese punto para separar la parte entera de la parte decimal");
							i = t.length();
							activo19 = false;
						}
						else
						{
					    	activo19 = true;
						}
					}
					for(int i = 0; i < u.length(); i++)
					{
						char cadenaaux = ',';
						cad = cadena20.charAt(i); 
						if(cad == cadenaaux)
						{
							textView1.setText("ingrese punto para separar la parte entera de la parte decimal");
							i = u.length();
							activo20 = false;
						}
						else
						{
					    	activo20 = true;
						}
					}
					for(int i = 0; i < v.length(); i++)
					{
						char cadenaaux = ',';
						cad = cadena21.charAt(i); 
						if(cad == cadenaaux)
						{
							textView1.setText("ingrese punto para separar la parte entera de la parte decimal");
							i = v.length();
							activo21 = false;
						}
						else
						{
					    	activo21 = true;
						}
					}
					for(int i = 0; i < w.length(); i++)
					{
						char cadenaaux = ',';
						cad = cadena22.charAt(i); 
						if(cad == cadenaaux)
						{
							textView1.setText("ingrese punto para separar la parte entera de la parte decimal");
							i = w.length();
							activo22 = false;
						}
						else
						{
					    	activo22 = true;
						}
					}
					for(int i = 0; i < x.length(); i++)
					{
						char cadenaaux = ',';
						cad = cadena23.charAt(i); 
						if(cad == cadenaaux)
						{
							textView1.setText("ingrese punto para separar la parte entera de la parte decimal");
							i = x.length();
							activo23 = false;
						}
						else
						{
					    	activo23 = true;
						}
					}
					for(int i = 0; i < y.length(); i++)
					{
						char cadenaaux = ',';
						cad = cadena24.charAt(i); 
						if(cad == cadenaaux)
						{
							textView1.setText("ingrese punto para separar la parte entera de la parte decimal");
							i = y.length();
							activo24 = false;
						}
						else
						{
					    	activo24 = true;
						}
					}
					for(int i = 0; i < z.length(); i++)
					{
						char cadenaaux = ',';
						cad = cadena25.charAt(i); 
						if(cad == cadenaaux)
						{
							textView1.setText("ingrese punto para separar la parte entera de la parte decimal");
							i = z.length();
							activo25 = false;
						}
						else
						{
					    	activo25 = true;
						}
					}
					if(activo1 == true && activo2 == true && activo3 == true && activo4 == true && activo5 == true && activo6 == true && activo7 == true && activo8 == true && activo9 == true && activo10 == true && activo11 == true && activo12 == true && activo13 == true && activo14 == true && activo15 == true && activo16 == true && activo17 == true && activo18 == true && activo19 == true && activo20 == true && activo21 == true && activo22 == true && activo23 == true && activo24 == true && activo25 == true){
						
						if(isNumeric(a.getText().toString()) && isNumeric( b.getText().toString()) && isNumeric(c.getText().toString()) && isNumeric(d.getText().toString()) && isNumeric( e.getText().toString()) && isNumeric( f.getText().toString()) && isNumeric( g.getText().toString()) && isNumeric( h.getText().toString()) && isNumeric( j.getText().toString()) && isNumeric( k.getText().toString()) && isNumeric( l.getText().toString()) && isNumeric( m.getText().toString()) && isNumeric( n.getText().toString()) && isNumeric( o.getText().toString()) && isNumeric( p.getText().toString()) && isNumeric( q.getText().toString()) && isNumeric( r.getText().toString()) && isNumeric( s.getText().toString()) && isNumeric( t.getText().toString()) && isNumeric( u.getText().toString()) && isNumeric( v.getText().toString()) && isNumeric( w.getText().toString()) && isNumeric( x.getText().toString()) && isNumeric( y.getText().toString()) && isNumeric( z.getText().toString())){
							
							double a0 = Double.parseDouble(cadena1);
							double b0 = Double.parseDouble(cadena2);
							double c0 = Double.parseDouble(cadena3);
							double d0 = Double.parseDouble(cadena4);
							double f0 = Double.parseDouble(cadena5);
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
							double a4 = Double.parseDouble(cadena21);
							double b4 = Double.parseDouble(cadena22);
							double c4 = Double.parseDouble(cadena23);
							double d4 = Double.parseDouble(cadena24);
							double f4 = Double.parseDouble(cadena25);
							
							/* RESOLUCION DEL EJERCICIO*/
							
							double determinantea = b1*((c2*d3*f4 + f2*c3*d4 + d2*f3*c4) - (f2*d3*c4 + d2*c3*f4 + c2*f3*d4));
							double determinantea1 = -b2*((c1*d3*f4 + f1*c3*d4 + d1*f3*c4) - (f1*d3*c4 + d1*c3*f4 + d4*f3*c1));
							double determinantea2 = b3*((c1*d2*f4 + f1*c2*d4 + d1*f2*c4) - (f1*d2*c4 + d1*c2*f4 + d4*f2*c1));
							double determinantea3 = -b4*((c1*d2*f3 + f1*c2*d3 + d1*f2*c3) - (f1*d2*c3 + d1*c2*f3 + c1*f2*d3));
							double aa = a0*(determinantea + determinantea1 + determinantea2 + determinantea3);
							
							double determinanteb = b0*((c2*d3*f4 + f2*c3*d4 + d2*f3*c4) - (f2*d3*c4 + d2*c3*f4 + c2*f3*d4));
							double determinanteb1 = -b2*((c0*d3*f4 + f0*c3*d4 + d0*f3*c4) - (f0*d3*c4 + d0*c3*f4 + c0*f3*d4));
							double determinanteb2 = b3*((c0*d2*f4 + f0*c2*d4 + d0*f2*c4) - (f0*d2*c4 + d0*c2*f4 + c0*f2*d4));
							double determinanteb3 = -b4*((c0*d2*f3 + f0*c2*d3 + d0*f2*c3) - (f0*d2*c3 + d0*c2*f3 + c0*f2*d3));
							double aa1 = -a1*(determinanteb + determinanteb1 + determinanteb2 + determinanteb3);
							
							double determinantec = b0*((c1*d3*f4 + f1*c3*d4 + d1*f3*c4) - (f1*d3*c4 + d1*c3*f4 + d4*f3*c1));
							double determinantec1 = -b1*((c0*d3*f4 + c3*d4*f0 + d0*f3*c4) - (f0*d3*c4 + d0*c3*f4 + d4*f3*c0));
							double determinantec2 = b3*((c0*d1*f4 + c1*d4*f0 + d0*f1*c4) - (f0*d1*c4 + d0*c1*f4 + d4*f1*c0));
							double determinantec3 = -b4*((c0*d1*f3 + c1*d3*f0 + d0*f1*c3) - (f0*d1*c3 + d0*c1*f3 + d3*f1*c0));
							double aa2 = a2*(determinantec + determinantec1 + determinantec2 + determinantec3);
							
							double determinanted = b0*((c1*d2*f4 + c2*d4*f1 + d1*f2*c4) - (f1*d2*c4 + d1*c2*f4 + d4*f2*c1));
							double determinanted1 = -b1*((c0*d2*f4 + c2*d4*f0 + d0*f2*c4) - (f0*d2*c4 + d0*c2*f4 + d4*f2*c0));
							double determinanted2 = b2*((c0*d1*f4 + c1*d4*f0 + d0*f1*c4) - (f0*d1*c4 + d0*c1*f4 + d4*f1*c0));
							double determinanted3 = -b4*((c0*d1*f2 + c1*d2*f0 + d0*f1*c2) - (f0*d1*c2 + d0*c1*f2 + d2*f1*c0));
							double aa3 = -a3*(determinanted + determinanted1 + determinanted2 + determinanted3);
							
							double determinantef = b0*((c1*d2*f3 + c2*d3*f1 + d1*f2*c3) - (f1*d2*c3 + d1*c2*f3 + d3*f2*c1));
							double determinantef1 = -b1*((c0*d2*f3 + c2*d3*f0 + d0*f2*c3) - (f0*d2*c3 + d0*c2*f3 + d3*f2*c0));
							double determinantef2 = b2*((c0*d1*f3 + c1*d3*f0 + d0*f1*c3) - (f0*d1*c3 + d0*c1*f3 + d3*f1*c0));
							double determinantef3 = -b3*((c0*d1*f2 + c1*d2*f0 + d0*f1*c2) - (f0*d1*c2 + d0*c1*f2 + d2*f1*c0));
							double aa4 = a4*(determinantef + determinantef1 + determinantef2 + determinantef3);
							
							double determinante_gral = aa + aa1 + aa2 + aa3 + aa4;
							
						
							
							textView1.setText("El determinante es: "+redondear(determinante_gral,4));
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
				
				else if(a.length() == 0 && b.length()== 0 && c.length() == 0 && d.length() == 0 && e.length() == 0 && f.length() == 0 && g.length()== 0 && h.length() == 0 && j.length() == 0 && k.length() == 0 && l.length()== 0 && m.length()== 0 && n.length()== 0 && o.length()== 0 && p.length()== 0 && q.length()== 0 && r.length() == 0 && s.length() == 0 && t.length()== 0 && u.length()== 0 && v.length()== 0 && w.length()== 0 && x.length()== 0 && y.length() == 0 && z.length()== 0){
					
					textView1.setText("Ingrese los valores");
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
				else if(e.length() == 0)
				{
					textView1.setText(" Ingrese valores faltantes");
				}
				else if(f.length() == 0)
				{
					textView1.setText(" Ingrese valores faltantes");
				}
				else if(g.length() == 0)
				{
					textView1.setText(" Ingrese valores faltantes");
				}
				else if(h.length() == 0)
				{
					textView1.setText(" Ingrese valores faltantes");
				}
				else if(j.length() == 0)
				{
					textView1.setText(" Ingrese valores faltantes");
				}
				else if(k.length() == 0)
				{
					textView1.setText(" Ingrese valores faltantes");
				}
				else if(l.length() == 0)
				{
					textView1.setText(" Ingrese valores faltantes");
				}
				else if(m.length() == 0)
				{
					textView1.setText(" Ingrese valores faltantes");
				}
				else if(n.length() == 0)
				{
					textView1.setText(" Ingrese valores faltantes");
				}
				else if(o.length() == 0)
				{
					textView1.setText(" Ingrese valores faltantes");
				}
				else if(p.length() == 0)
				{
					textView1.setText(" Ingrese valores faltantes");
				}
				else if(q.length() == 0)
				{
					textView1.setText(" Ingrese valores faltantes");
				}
				else if(r.length() == 0)
				{
					textView1.setText(" Ingrese valores faltantes");
				}
				else if(s.length() == 0)
				{
					textView1.setText(" Ingrese valores faltantes");
				}
				else if(t.length() == 0)
				{
					textView1.setText(" Ingrese valores faltantes");
				}
				else if(u.length() == 0)
				{
					textView1.setText(" Ingrese valores faltantes");
				}
				else if(v.length() == 0)
				{
					textView1.setText(" Ingrese valores faltantes");
				}
				else if(w.length() == 0)
				{
					textView1.setText(" Ingrese valores faltantes");
				}
				else if(x.length() == 0)
				{
					textView1.setText(" Ingrese valores faltantes");
				}
				else if(y.length() == 0)
				{
					textView1.setText(" Ingrese valores faltantes");
				}
				else if(z.length() == 0)
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
				e.setText("");
				f.setText("");
				g.setText("");
				h.setText("");
				j.setText("");
				k.setText("");
				l.setText("");
				m.setText("");
				n.setText("");
				o.setText("");
				p.setText("");
				q.setText("");
				r.setText("");
				s.setText("");
				t.setText("");
				u.setText("");
				v.setText("");
				w.setText("");
				x.setText("");
				y.setText("");
				z.setText("");
				
				textView1.setText("");
				
			}
			
		});
	}
}

