package appbyRk;
import com.example.chng.R;
import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class MainActivity extends Activity implements View.OnClickListener {
		
		TextView asd,asd2;
		RelativeLayout image ; 
		ImageView img;
		Button next;
		Button previous;
		Button info,more,start,extra ,share;
		int a = 0;
		Intent it,it1;
		MediaPlayer mp;
		@Override
		protected void onCreate(Bundle savedInstanceState)
		{
			
		    super.onCreate(savedInstanceState);
		    setContentView(R.layout.activity_main);
		    image = (RelativeLayout) findViewById(R.id.rl1);
		    img = (ImageView)findViewById(R.id.imageView2);
		    
		    img.setOnClickListener(this);
		 
		    
		    
		    
		    asd=(TextView)findViewById(R.id.textView1);
		    asd.setBackgroundResource(R.drawable.gun_name_bg);
		    
		    asd.setTextSize(18);
		    

		    asd.setGravity(Gravity.CENTER_VERTICAL| Gravity.CENTER_HORIZONTAL);
		    asd2=(TextView)findViewById(R.id.textView2);
		    
               
		    
		    
		    if (a == 0)
	        {
	        	asd.setText("SPYDER MRX");
	        	asd.setBackgroundResource(R.drawable.gun_name_bg);
	            img.setImageResource(R.drawable.spidermrx);
	            a = 1;
	        }
		
		    previous = (Button) findViewById(R.id.previous);
		    previous.setOnClickListener(this);

		    
		   
			
		next = (Button) findViewById(R.id.next);
		next.setOnClickListener(this);
		
		info = (Button) findViewById(R.id.info);
		info.setOnClickListener(this);
//		  it= new Intent(MainActivity.this,sec.class);
		more= (Button) findViewById(R.id.more);
		more.setOnClickListener(this);
		}
		
		
		
		@Override
		public void onClick(View v) {
			if(v.getId()==R.id.info)
			{
				it= new Intent(MainActivity.this,sec.class);
			}
		
			if(v.getId()==R.id.more)
			{
				it1= new Intent(MainActivity.this,third.class);
			}
				switch (v.getId())
				{
			   
				
			    case R.id.next:
			    	
			    	if (a == 0)
			        {
			        	asd.setText("SPYDER MRX");
			        	asd.setBackgroundResource(R.drawable.gun_name_bg);
			            img.setImageResource(R.drawable.spidermrx);
			            a = 1;
			        }
			        
			    	else if (a == 1)
			        {
			        	asd.setText("TIPMANN AK47");
			        	asd.setBackgroundResource(R.drawable.gun_name_bg);
			            img.setImageResource(R.drawable.ak47);
			            
			            a = 2;
			        }
			        else if (a == 2)
			        {
			        	asd.setText("ARROW GUN");
			        	asd.setBackgroundResource(R.drawable.gun_name_bg);
			            img.setImageResource(R.drawable.arrow);
			         
			            a = 3;
			        }
			        else if (a == 3)
			        {
			        	asd.setText("ASSAULT RIFLE");
			        	asd.setBackgroundResource(R.drawable.gun_name_bg);
			        	img.setImageResource(R.drawable.assault);
			            a = 4;
			        }
			        else if (a == 4)
			        {
			        	asd.setText("AZODIN");
			        	asd.setBackgroundResource(R.drawable.gun_name_bg);
			        	img.setImageResource(R.drawable.azodin);
			        	 
			            a = 5;
			        }
			        else if (a == 5)
			        {
			        	asd.setText("BLACK CELL");
			        	asd.setBackgroundResource(R.drawable.gun_name_bg);
			        	img.setImageResource(R.drawable.black);
			            a = 6;
			        }
			        else if (a == 6)
			        {
			        	asd.setText("BT TM7");
			        	asd.setBackgroundResource(R.drawable.gun_name_bg);
			        	img.setImageResource(R.drawable.btm7);
			            a = 7;
			        }
			        else if (a == 7)
			        {
			        	asd.setText("FN303 GUN");
			        	asd.setBackgroundResource(R.drawable.gun_name_bg);
			        	img.setImageResource(R.drawable.fn303);
			            a = 8;
			        }
			        else if (a == 8)
			        {
			        	asd.setText("GAMO ROCKET");
			        	asd.setBackgroundResource(R.drawable.gun_name_bg);
			        	img.setImageResource(R.drawable.gamorocket);
			            a = 9;
			        }
			        else if (a == 9)
			        {
			        	asd.setText("GAMO VARMINT");
			        	asd.setBackgroundResource(R.drawable.gun_name_bg);
			        	img.setImageResource(R.drawable.gamovarmint);
			            a = 10;
			        }
			        else if (a == 10)
			        {
			        	asd.setText("GOG G1");
			        	asd.setBackgroundResource(R.drawable.gun_name_bg);
			        	img.setImageResource(R.drawable.gog1);
			            a = 11;
			        }
			        else if (a == 11)
			        {
			        	asd.setText("HK416 GUN ");
			        	asd.setBackgroundResource(R.drawable.gun_name_bg);
			        	img.setImageResource(R.drawable.hk416);
			            a = 12;
			        }
			        else if (a == 12)
			        {
			        	asd.setText("SPIDER MR1");
			        	asd.setBackgroundResource(R.drawable.gun_name_bg);
			        	img.setImageResource(R.drawable.kingman);
			            a = 13;
			        }
			        else if (a == 13)
			        {
			        	asd.setText("NAGAVE MACHINE GUN");
			        	asd.setBackgroundResource(R.drawable.gun_name_bg);
			            img.setImageResource(R.drawable.ngev);
			            a = 14;
			        }else if (a == 14)
			        {
			        	asd.setText("SNIPPER RIFLE ");
			        	asd.setBackgroundResource(R.drawable.gun_name_bg);
			        	img.setImageResource(R.drawable.sniper);
			            a = 15;
			        }
			        else if (a == 15)
			        {
			        	asd.setText("AEK99");
			        	asd.setBackgroundResource(R.drawable.gun_name_bg);
			        	img.setImageResource(R.drawable.aek99);
			            a = 16;
			        }
			        else if (a == 16)
			        {
			        	asd.setText("MOUNTED GUN");
			        	asd.setBackgroundResource(R.drawable.gun_name_bg);
			        	img.setImageResource(R.drawable.shoulder);
			            a = 17;
			        }
			        else if (a == 17)
			        {
			        	asd.setText("SPYDER XTRA");
			        	asd.setBackgroundResource(R.drawable.gun_name_bg);
			        	img.setImageResource(R.drawable.spyderxtra);
			            a = 18;
			        }
			        else if (a == 18)
			        {
			        	asd.setText("SR-762");
			        	asd.setBackgroundResource(R.drawable.gun_name_bg);
			        	img.setImageResource(R.drawable.rifle762);
			            a = 19;
			        }
			        else if (a == 19)
			        {
			        	asd.setText("T68 SPLITS FEED");
			        	asd.setBackgroundResource(R.drawable.gun_name_bg);
			        	img.setImageResource(R.drawable.t6);
			            a = 20;
			        }
			        else if (a == 20)
			        {
			        	asd.setText("TACTICAL 22");
			        	asd.setBackgroundResource(R.drawable.gun_name_bg);
			        	img.setImageResource(R.drawable.tac22);
			            a = 21;
			        }
			        else if (a == 21)
			        {
			        	asd.setText("TM FT12");
			        	asd.setBackgroundResource(R.drawable.gun_name_bg);
			        	img.setImageResource(R.drawable.ft12);
			           a = 1;
			        }
			        
			        break;  
			    case R.id.previous:
			    	a--;
			           
			    	if (a == 21)
			        {
			        	asd.setText("TM FT12");
			        	asd.setBackgroundResource(R.drawable.gun_name_bg);
			        	img.setImageResource(R.drawable.ft12);
			            a=20;
			        }
			    	else if (a == 20)
			        {
			        	asd.setText("TACTICAL 22");
			        	asd.setBackgroundResource(R.drawable.gun_name_bg);
			        	img.setImageResource(R.drawable.tac22);
			            a = 19;
			        }       
			    	else if (a == 19)
				        {
			    		asd.setText("T68 SPLITS FEED");
			    		asd.setBackgroundResource(R.drawable.gun_name_bg);
			    		img.setImageResource(R.drawable.t6);
			            a = 18;
				        }
			            else if (a == 18)
				        {
			            	asd.setText("SR-762");
			            	asd.setBackgroundResource(R.drawable.gun_name_bg);
			            	img.setImageResource(R.drawable.rifle762);
				            a = 17;
				        }
			            else if (a == 17)
				        {
			            	asd.setText("SPYDER XTRA");
			            	asd.setBackgroundResource(R.drawable.gun_name_bg);
			            	img.setImageResource(R.drawable.spyderxtra);
				            a = 16;
				            
				        }
			            
			            else if (a == 16)
				        {
			            	asd.setText("MOUNTED GUN");
			            	asd.setBackgroundResource(R.drawable.gun_name_bg);
			            	img.setImageResource(R.drawable.shoulder);
				            a = 15;
				            
				        }
			            else if (a == 15)
				        {
			            	asd.setText("AEK99");
			            	asd.setBackgroundResource(R.drawable.gun_name_bg);
			            	img.setImageResource(R.drawable.aek99);
				            a = 14;
				            
				        }
			            else if (a == 14)
				        {
			            	asd.setText("SNIPPER RIFLE");
			            	asd.setBackgroundResource(R.drawable.gun_name_bg);
			            	img.setImageResource(R.drawable.sniper);
				            a = 13;
				        }
			            
			            else if (a == 13)
				        {
			            	asd.setText("NAGAVE MACHINE GUN");
			            	asd.setBackgroundResource(R.drawable.gun_name_bg);
			            	img.setImageResource(R.drawable.ngev);
				            a = 12;
				        }
			    	
			            else if (a == 12)
			            {
			            	asd.setText("SPIDER MR1");
			            	asd.setBackgroundResource(R.drawable.gun_name_bg);
			            	img.setImageResource(R.drawable.kingman);
				            a = 11;
			            }
			            else if (a == 11)
			            {
			            	asd.setText("HK416 GUN ");
			            	asd.setBackgroundResource(R.drawable.gun_name_bg);
			            	img.setImageResource(R.drawable.hk416);
				            a = 10;
			            }
			            else if (a == 10)
			            {
			            	asd.setText("GOG G1");
			            	asd.setBackgroundResource(R.drawable.gun_name_bg);
			            	img.setImageResource(R.drawable.gog1);
				            a = 9;
			            }
			            else if (a == 9)
			            {
			            	asd.setText("GAMO VARMINT");
			            	asd.setBackgroundResource(R.drawable.gun_name_bg);
			            	img.setImageResource(R.drawable.gamovarmint);
				            a = 8;
			            }
			            else if (a == 8)
			            {
			            	asd.setText("GAMO ROCKET");
			            	asd.setBackgroundResource(R.drawable.gun_name_bg);
			            	img.setImageResource(R.drawable.gamorocket);
				            a = 7;
			            }
			            else if (a == 7 )
			            {
			            	asd.setText("FN303 GUN");
			            	asd.setBackgroundResource(R.drawable.gun_name_bg);
			            	img.setImageResource(R.drawable.fn303);
				            a = 6;
			            }
			            else if (a == 6 )
			            {
			            	asd.setText("BT TM7");
			            	asd.setBackgroundResource(R.drawable.gun_name_bg);
			            	img.setImageResource(R.drawable.btm7);
				            a = 5;
			            }
			            else if (a == 5)
			            {
			            	asd.setText("BLACK CELL");
			            	asd.setBackgroundResource(R.drawable.gun_name_bg);
			            	img.setImageResource(R.drawable.black);
				            a = 4;
			            }
			            else if(a == 4)
			            {
			            	asd.setText("AZODIN");
			            	asd.setBackgroundResource(R.drawable.gun_name_bg);
			            	img.setImageResource(R.drawable.azodin);
				            a = 3;
			            }
			            else if(a == 3)
			            {
			            	asd.setText("ASSAULT RIFLE");
			            	asd.setBackgroundResource(R.drawable.gun_name_bg);
			            	img.setImageResource(R.drawable.assault);
				            a = 2;
			            }
			            else if(a == 2 )
			            {
			            	asd.setText("ARROW GUN");
			            	asd.setBackgroundResource(R.drawable.gun_name_bg);
			            	img.setImageResource(R.drawable.arrow);
				            a = 1;
			            }
			            else if(a == 1)
			            {
			            	asd.setText("TIPMAN AK47");
			            	asd.setBackgroundResource(R.drawable.gun_name_bg);
			            	img.setImageResource(R.drawable.ak47);
				            a = 0;
			            }
			            else if(a == 0)
			            {
			            	asd.setText("SPYDER MRX");
			            	asd.setBackgroundResource(R.drawable.gun_name_bg);
			            	img.setImageResource(R.drawable.spidermrx);
				           a=20;
			            }
			            	
			            	next.performClick();
				         
			        break;
			    case R.id.info:
			    	
					it.putExtra("info", a);
			        startActivity(it);
			        
			        break;
			        
			    case R.id.more:
			    	
					it1.putExtra("more", a);
			        startActivity(it1);
			        
				}     
		
		
		

	
	
	img.setOnClickListener(new OnClickListener() {
		 public void onClick(View view) {
			 {
				 if (a == 1)
			        {
			        	
					 mp = MediaPlayer.create(getApplicationContext(), R.raw.s);		
					 
			        }
			        else if (a == 2)
			        {
			        	mp = MediaPlayer.create(getApplicationContext(), R.raw.k47);
			        }
			        else if (a == 3)
			        {
			        	mp = MediaPlayer.create(getApplicationContext(), R.raw.arro);
			        }
			        else if (a == 4)
			        {
			        	mp = MediaPlayer.create(getApplicationContext(), R.raw.rifle);
			        }
			        else if (a == 5)
			        {
			        	mp = MediaPlayer.create(getApplicationContext(), R.raw.g);
			        }
			        else if (a == 6)
			        {
			        	mp = MediaPlayer.create(getApplicationContext(), R.raw.machinegun);
			 
			        }
			        else if (a == 7)
			        {
			        	mp = MediaPlayer.create(getApplicationContext(), R.raw.j);
			        }
			        else if (a == 8)
			        {
			        	mp = MediaPlayer.create(getApplicationContext(), R.raw.r);
			        }
			        else if (a == 9)
			        {
			        	mp = MediaPlayer.create(getApplicationContext(), R.raw.h);
			        }
			        else if (a == 10)
			        {
			        	mp = MediaPlayer.create(getApplicationContext(), R.raw.rifle);
			 }
			        else if (a == 11)
			        {
			        	mp = MediaPlayer.create(getApplicationContext(), R.raw.r);
			 }
			        else if (a == 12)
			        {
			        	mp = MediaPlayer.create(getApplicationContext(), R.raw.m);
			 }
			        else if (a == 13)
			        {
			        	mp = MediaPlayer.create(getApplicationContext(), R.raw.cv);
			 }
			        else if (a == 14)
			        {
			        	mp = MediaPlayer.create(getApplicationContext(), R.raw.ng);
			 }
			        else if (a == 15)
			        {
			        	mp = MediaPlayer.create(getApplicationContext(), R.raw.f);
			 }
			        else if (a == 16)
			        {
			        	mp = MediaPlayer.create(getApplicationContext(), R.raw.n);
			 }
			        else if (a == 17)
			        {
			        	mp = MediaPlayer.create(getApplicationContext(), R.raw.h);
			 }
			        else if (a == 18)
			        {
			        	mp = MediaPlayer.create(getApplicationContext(), R.raw.machinegun);
			        }
			        else if (a == 19)
			        {
			        	mp = MediaPlayer.create(getApplicationContext(), R.raw.t);
			 }
			        else if (a == 20)
			        {
			        	mp = MediaPlayer.create(getApplicationContext(), R.raw.tm);
			 }
			        else if (a == 21)
			        {
			        	mp = MediaPlayer.create(getApplicationContext(), R.raw.cv);
			        }
			        else if (a == 22)
			        {
			        	mp = MediaPlayer.create(getApplicationContext(), R.raw.f);
			         }
				    
			  }
				
			     		 
			    		 
			 
             
             mp.setOnCompletionListener(new OnCompletionListener() {

                 @Override
                 public void onCompletion(MediaPlayer mp) {
           
                     mp.release();
                 }

             });   
             mp.start();
         }

     });
		
}}

	
		
	
	
	
	
	
