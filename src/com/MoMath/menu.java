package com.MoMath;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class menu extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}
		
		public void lanzar (View view) {
				Intent j = new Intent(this,deter2x2.class);
				startActivity(j);
				Toast.makeText(getApplicationContext(), "Determinantes de Orden 2x2", Toast.LENGTH_SHORT).show();
			}	
		
		public void lanzar1 (View view) {
			Intent j = new Intent(this,deter3x3.class);
			startActivity(j);
			Toast.makeText(getApplicationContext(), "Determinantes de Orden 3x3", Toast.LENGTH_SHORT).show();
			}	
		
		public void lanzar2 (View view) {
			Intent j = new Intent(this,deter4x4.class);
			startActivity(j);
			Toast.makeText(getApplicationContext(), "Determinantes de Orden 4x4", Toast.LENGTH_SHORT).show();
			}
		public void lanzar6 (View view) {
			Intent j = new Intent(this,deter5x5.class);
			startActivity(j);
			Toast.makeText(getApplicationContext(), "Determinantes de Orden 5x5", Toast.LENGTH_SHORT).show();
			}
		public void lanzar3 (View view) {
			Intent j = new Intent(this,sistemas2incog.class);
			startActivity(j);
			Toast.makeText(getApplicationContext(), "S.E.L. con 2 Incógnitas", Toast.LENGTH_SHORT).show();
			}	
		public void lanzar4 (View view) {
			Intent j = new Intent(this,sistemas3incog.class);
			startActivity(j);
			Toast.makeText(getApplicationContext(), "S.E.L. con 3 Incógnitas", Toast.LENGTH_SHORT).show();
			}	
		public void lanzar5 (View view) {
			Intent j = new Intent(this,ecucuadra.class);
			startActivity(j);
			Toast.makeText(getApplicationContext(), "Ecuación de segundo grado con una incógnita", Toast.LENGTH_SHORT).show();
			}	
		public void lanzar7 (View view) {
			Intent j = new Intent(this,Sistemas4incog.class);
			startActivity(j);
			Toast.makeText(getApplicationContext(), "S.E.L. con 4 Incógnitas", Toast.LENGTH_SHORT).show();
			}	
		public void lanzar8 (View view){
			Intent j = new Intent(Intent.ACTION_MAIN);
			finish();
			Toast.makeText(getApplicationContext(), "Ah salido correctamente de Mo-Math", Toast.LENGTH_SHORT).show();
		}
			
		}
