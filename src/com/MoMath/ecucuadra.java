package com.MoMath;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ecucuadra extends Activity {
	private Button calcular;
	private Button borrar;
	private EditText a;
	private EditText b;
	private EditText c;
	private TextView raiz;
	private TextView x1;
	private TextView x2;
	private TextView tex1;
	private TextView tex2;
	private TextView texver;
	private TextView vertice;
	private TextView texformadeecu;
	private TextView formadeecu;
	private TextView texformageneral;
	private TextView formageneral;
	private TextView texformafact;
	private TextView formafact;
	private TextView texformacano;
	private TextView formacano;
	
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
		setContentView(R.layout.cuadratica);
		
		calcular = (Button) findViewById(R.id.calcular);
		borrar = (Button) findViewById(R.id.borrar);
		a = (EditText) findViewById(R.id.a);
		b = (EditText) findViewById(R.id.b);
		c = (EditText) findViewById(R.id.c);
		raiz = (TextView) findViewById(R.id.raiz);
		x1 = (TextView) findViewById(R.id.x1);
		x2 = (TextView) findViewById(R.id.x2);
		tex1 = (TextView) findViewById(R.id.tex1);
		tex2 = (TextView) findViewById(R.id.tex2);
		texver = (TextView) findViewById(R.id.texver);
		vertice = (TextView) findViewById(R.id.vertice);
		texformadeecu = (TextView) findViewById(R.id.texformadeecu);
		formadeecu = (TextView) findViewById(R.id.formadeecu);
		texformageneral = (TextView) findViewById(R.id.texformageneral);
		formageneral = (TextView) findViewById(R.id.formageneral);
		texformafact = (TextView) findViewById(R.id.texformafact);
		formafact = (TextView) findViewById(R.id.formafact);
		texformacano = (TextView) findViewById(R.id.texformacano);
		formacano = (TextView) findViewById(R.id.formacano);
		
		calcular.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				Toast.makeText(getApplicationContext(), "Calcular", Toast.LENGTH_SHORT).show();
				boolean band = false;
		
					if (a.length()== 0 && b.length() == 0 && c.length()==0)
					{
						vertice.setText("Ingrese valores de a, b y c");
						tex1.setVisibility(View.GONE);
						tex2.setVisibility(View.GONE);
						raiz.setVisibility(View.GONE);
						x1.setText("");
						x2.setText("");
						texver.setVisibility(View.GONE);
						texformadeecu.setVisibility(View.GONE);
						texformageneral.setVisibility(View.GONE);
						texformafact.setVisibility(View.GONE);
						texformacano.setVisibility(View.GONE);
						formadeecu.setText("");
						formageneral.setText("");
						formafact.setText("");
						formacano.setText("");
					}
					if (a.length()==0 && b.length()!=0 && c.length()!=0)
					{
						vertice.setText("Ingrese el valor de a");
						tex1.setVisibility(View.GONE);
						tex2.setVisibility(View.GONE);
						raiz.setVisibility(View.GONE);
						x1.setText("");
						x2.setText("");
						texver.setVisibility(View.GONE);
						texformadeecu.setVisibility(View.GONE);
						texformageneral.setVisibility(View.GONE);
						texformafact.setVisibility(View.GONE);
						texformacano.setVisibility(View.GONE);
						formadeecu.setText("");
						formageneral.setText("");
						formafact.setText("");
						formacano.setText("");
					}
					if (a.length()!=0 && b.length()==0 && c.length()!=0)
					{
						band = true;
						vertice.setText("Ingrese el valor de b");
						tex1.setVisibility(View.GONE);
						tex2.setVisibility(View.GONE);
						raiz.setVisibility(View.GONE);
						texver.setVisibility(View.GONE);
						x1.setText("");
						x2.setText("");
						texver.setVisibility(View.GONE);
						texformadeecu.setVisibility(View.GONE);
						texformageneral.setVisibility(View.GONE);
						texformafact.setVisibility(View.GONE);
						texformacano.setVisibility(View.GONE);
						formadeecu.setText("");
						formageneral.setText("");
						formafact.setText("");
						formacano.setText("");
					}
					if (a.length()!=0 && b.length()!=0 && c.length()==0)
					{
						band = true;
						vertice.setText("Ingrese el valor de c");
						tex1.setVisibility(View.GONE);
						tex2.setVisibility(View.GONE);
						raiz.setVisibility(View.GONE);
						x1.setText("");
						x2.setText("");
						texver.setVisibility(View.GONE);
						texformadeecu.setVisibility(View.GONE);
						texformageneral.setVisibility(View.GONE);
						texformafact.setVisibility(View.GONE);
						texformacano.setVisibility(View.GONE);
						formadeecu.setText("");
						formageneral.setText("");
						formafact.setText("");
						formacano.setText("");
					}
					if (a.length()!=0 && b.length()==0 && c.length()==0)
					{
						band = true;
						vertice.setText("Ingrese los valores de b y c");
						tex1.setVisibility(View.GONE);
						tex2.setVisibility(View.GONE);
						raiz.setVisibility(View.GONE);
						x1.setText("");
						x2.setText("");
						texver.setVisibility(View.GONE);
						texformadeecu.setVisibility(View.GONE);
						texformageneral.setVisibility(View.GONE);
						texformafact.setVisibility(View.GONE);
						texformacano.setVisibility(View.GONE);
						formadeecu.setText("");
						formageneral.setText("");
						formafact.setText("");
						formacano.setText("");
					}
					if (a.length()==0 && b.length()!=0 && c.length()==0)
					{
						vertice.setText("Ingrese los valores de a y c");
						tex1.setVisibility(View.GONE);
						tex2.setVisibility(View.GONE);
						raiz.setVisibility(View.GONE);
						x1.setText("");
						x2.setText("");
						texver.setVisibility(View.GONE);
						texformadeecu.setVisibility(View.GONE);
						texformageneral.setVisibility(View.GONE);
						texformafact.setVisibility(View.GONE);
						texformacano.setVisibility(View.GONE);
						formadeecu.setText("");
						formageneral.setText("");
						formafact.setText("");
						formacano.setText("");
					}
					if (a.length()==0 && b.length()==0 && c.length()!=0)
					{
						vertice.setText("Ingrese los valores de a y b");
						tex1.setVisibility(View.GONE);
						tex2.setVisibility(View.GONE);
						raiz.setVisibility(View.GONE);
						x1.setText("");
						x2.setText("");
						texver.setVisibility(View.GONE);
						texformadeecu.setVisibility(View.GONE);
						texformageneral.setVisibility(View.GONE);
						texformafact.setVisibility(View.GONE);
						texformacano.setVisibility(View.GONE);
						formadeecu.setText("");
						formageneral.setText("");
						formafact.setText("");
						formacano.setText("");
					}
					if (a.length()>0 && b.length()>=0 && c.length()>=0 && band== false)
					{
						if (isNumeric(a.getText().toString()) && isNumeric( b.getText().toString()) && isNumeric(c.getText().toString()))
						{
							if (Double.parseDouble(a.getText().toString())==0)
							{
								vertice.setText("No es cuadratica");
								tex1.setVisibility(View.GONE);
								tex2.setVisibility(View.GONE);
								raiz.setVisibility(View.GONE);
								x1.setText("");
								x2.setText("");
								texver.setVisibility(View.GONE);
								texformadeecu.setVisibility(View.GONE);
								texformageneral.setVisibility(View.GONE);
								texformafact.setVisibility(View.GONE);
								texformacano.setVisibility(View.GONE);
								formadeecu.setText("");
								formageneral.setText("");
								formafact.setText("");
								formacano.setText("");
							}
							else
							{
							double a1 = Double.parseDouble(a.getText().toString());
							double b1 = Double.parseDouble(b.getText().toString());
							double c1 = Double.parseDouble(c.getText().toString());
							if (b1*b1-4*a1*c1>=0){
								double d = Math.sqrt(b1*b1-4*a1*c1);
								double f = (-b1+d)/(2*a1);
								double g = (-b1-d)/(2*a1);
								double verticex = -b1/(2*a1);
								double verticey = (c1-((b1*b1)/(4*a1)));
								verticey = redondear(verticey,2);
								verticex = redondear(verticex,2);
								f = redondear(f,2);
								g = redondear(g,2);
								if ((b1*b1-4*a1*c1)>0){
									texformadeecu.setVisibility(1);
									formadeecu.setText("Las raíces son reales y distintas");
								}
								if ((b1*b1-4*a1*c1)==0)
								{
									texformadeecu.setVisibility(1);
									formadeecu.setText("Las raíces son reales y dobles");
								}
								raiz.setVisibility(1);
								tex1.setVisibility(1);
								x1.setText(""+f);
								tex2.setVisibility(1);
								x2.setText(""+g);
								
								if (b1>0 && c1>0)
								{
									texformageneral.setVisibility(1);
									formageneral.setText("      y = "+ a1 + "x^2" + "+" + b1 + "x" + " + " + c1);
								}
								else if (b1<0 && c1 >0)
								{
									texformageneral.setVisibility(1);
									formageneral.setText("      y = "+ a1 + "x^2" + b1 + "x" + " + " + c1);
								}
								else if(b1>0 && c1<0)
								{
									texformageneral.setVisibility(1);
									formageneral.setText("      y = "+ a1 + "x^2" + " + " + b1 + "x" + c1);
								}
								else if(b1<0 && c1<0)
								{
									texformageneral.setVisibility(1);
									formageneral.setText("      y = " + a1 +"x^2" + b1 + "x" + c1);
								}
								if (f>0 && g>0)
								{
									texformafact.setVisibility(1);
									formafact.setText("      y = " +a1 + "(x - " + f +")" + "." + "(x - " + g +")" );
								}
								if (f<0 && g<0)
								{
									texformafact.setVisibility(1);
									formafact.setText("      y = " + a1 + "(x + " + (-f) + ")" + "." + "(x + " + (-g) + ")");
								}
								if (f>0 && g<0)
								{
									texformafact.setVisibility(1);
									formafact.setText("      y = " + a1 + "(x - " + f + ")" + "." + "(x + " + (-g) + ")");
								}
								if (f<0 && g>0)
								{
									texformafact.setVisibility(1);
									formafact.setText("      y = " + a1 + "(x + " + (-f) + ")" + "." + "(x - " + g + ")");
								}
								if (verticex >0 && verticey >0)
								{
									texformacano.setVisibility(1);
									formacano.setText("      y = " + a1 + "(x - "+ verticex +")" + "^2" + " + " + verticey);
								}
								if (verticex < 0 && verticey <0)
								{
									texformacano.setVisibility(1);
									formacano.setText("      y = " + a1 + "(x + " + (-verticex) + ")" + "^2" + " - " + (-verticey));
								}
								if (verticex > 0 && verticey < 0)
								{
									texformacano.setVisibility(1);
									formacano.setText("      y = " + a1 + "(x - " + verticex + ")" + "^2" + " - " + (-verticey));
								}
								if (verticex < 0 && verticey >0)
								{
									texformacano.setVisibility(1);
									formacano.setText("      y = " + a1 + "(x + " + (-verticex) + ")" + "^2" + " - " + verticey);
								}
								if (verticex < 0 && verticey == 0)
								{
									texformacano.setVisibility(1);
									formacano.setText("      y = " + a1 + "(x + " + (-verticex) + ")" + "^2" + " + " + verticey);
								}
								texver.setVisibility(1);
								vertice.setText("("+verticex + " ; " +verticey +")");
							}
							else if(b1*b1-4*a1*c1 < 0)
							{
								double d = Math.sqrt(-(b1*b1 - 4 * a1 * c1));
								double f = -b1/(2*a1);
								double g = d/(2*a1);
								double verticex = -b1/(2*a1);
								double verticey = (c1 - ((b1*b1)/(4*a1)));
								verticey = redondear(verticey,2);
								verticex = redondear(verticex,2);
								f = redondear(f,2);
								g = redondear(g,2);
								if ((b1*b1 - 4*a1*c1)<0){
									texformadeecu.setVisibility(1);
									formadeecu.setText("La ecuación tiene raíces complejas conjugadas");
								}
								if (b1 >0 && c1 > 0)
								{
									texformageneral.setVisibility(1);
									formageneral.setText("      y = "+ a1 + "x^2" + "+" + b1 + "x" + " + " + c1);
								}
								else if (b1<0 && c1>0)
								{
									texformageneral.setVisibility(1);
									formageneral.setText("      y = "+ a1 + "x^2" + b1 + "x" + " + " + c1);
								}
								else if (b1 > 0 && c1<0)
								{
									texformageneral.setVisibility(1);
									formageneral.setText("      y = "+ a1 + "x^2" + " + " + b1 + "x" + c1);
								}
								else if (b1<0 && c1<0)
								{
									texformageneral.setVisibility(1);
									formageneral.setText("      y = "+ a1 + "x^2" + " + " + b1 + "x" + c1);
								}
								if (f >0 && g >0)
								{
									raiz.setVisibility(1);
									tex1.setVisibility(1);
									x1.setText(f + " + " + g + "." + "i");
									tex2.setVisibility(1);
									x2.setText(f + " - " + g + "." + "i");
									texformafact.setVisibility(1);
									formafact.setText("      y = " + a1 + "(x - " + "(" + x1.getText().toString() + ")" + ")" + "." + "(x - " + "(" + x2.getText().toString() + ")" + ")");
								}
								if (f<0 && g <0)
								{
									g = -g;
									raiz.setVisibility(1);
									tex1.setVisibility(1);
									x1.setText(f + " + " + g + "." + "i");
									tex2.setVisibility(1);
									x2.setText(f + " - " + g + "." + "i");
									texformafact.setVisibility(1);
									formafact.setText("      y = " + a1 + "(x + " + "(" + x1.getText().toString() + ")" + ")" + "." + "(x + " + "(" + x2.getText().toString() + ")" + ")");
								}
								
								if (f>0 && g <0)
								{
									g= -g;
									raiz.setVisibility(1);
									tex1.setVisibility(1);
									x1.setText(f + " + " + g + "." + "i");
									tex2.setVisibility(1);
									x2.setText(f + " - " + g + "." + "i");
									texformafact.setVisibility(1);
									formafact.setText("      y = " + a1 + "(x - " + "(" + x1 + ")" + ")" + "." + "(x - " + "(" + x2 + ")" + ")");
								}
								if (f<0 && g>0)
								{
									raiz.setVisibility(1);
									tex1.setVisibility(1);
									x1.setText(f + " + " + g + "." + "i");
									tex2.setVisibility(1);
									x2.setText(f + " - " + g + "." + "i");
									texformafact.setVisibility(1);
									formafact.setText("      y = " + a1 + "(x - " + "(" + x1.getText().toString() + ")" + ")" + "." + "(x - " + "(" + x2.getText().toString() + ")" + ")");
								}
								if (verticex >0 && verticey > 0)
								{
									texformacano.setVisibility(1);
									formacano.setText("      y = " + a1 + "(x - " + verticex + ")" + "^2" + "+" + verticey);
								}
								if(verticex < 0 && verticey < 0)
								{
									texformacano.setVisibility(1);
									formacano.setText("       y = " + a1 + "(x + " + -verticex + ")" + "^2" + " - " + -verticey);  
								}
								if(verticex > 0 && verticey < 0)
								{
									texformacano.setVisibility(1);
									formacano.setText("       y = " + a1 + "(x - " + verticex + ")" + "^2" + " - " + -verticey);
								}
								if(verticex < 0 && verticey > 0)
								{
									texformacano.setVisibility(1);
									formacano.setText("       y = " + a1 + "(x + " + (-verticex) + ")" + "^2" + " + " + verticey);  
								} 
								if(verticex < 0 && verticey == 0)
								{
									texformacano.setVisibility(1);
									formacano.setText("       y = " + a1 + "(x + " + (-verticex) + ")" + "^2" + " + " + verticey); 
								}
								texver.setVisibility(1);
								vertice.setText("( " + verticex + ";" + verticey + ")" ); 
							}
						}
						}
						else
						{
							vertice.setText("Ingrese solo valores numéricos");
							tex1.setVisibility(View.GONE);
							tex2.setVisibility(View.GONE);
							raiz.setVisibility(View.GONE);
							x1.setText("");
							x2.setText("");
							texver.setVisibility(View.GONE);
							texformadeecu.setVisibility(View.GONE);
							texformageneral.setVisibility(View.GONE);
							texformafact.setVisibility(View.GONE);
							texformacano.setVisibility(View.GONE);
							formadeecu.setText("");
							formageneral.setText("");
							formafact.setText("");
							formacano.setText("");
					}
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
				tex1.setVisibility(View.GONE);
				tex2.setVisibility(View.GONE);
				raiz.setVisibility(View.GONE);
				texver.setVisibility(View.GONE);
				x1.setText("");
				x2.setText("");
				texformadeecu.setVisibility(View.GONE);
				texformageneral.setVisibility(View.GONE);
				texformafact.setVisibility(View.GONE);
				texformacano.setVisibility(View.GONE);
				vertice.setText("");
				formadeecu.setText("");
				formageneral.setText("");
				formafact.setText("");
				formacano.setText("");	
			}
	});
  }
}

