package appbyRk;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class main extends Activity implements OnClickListener
 {
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.start);
	    Button start=(Button)findViewById(R.id.strt);
	    start.setOnClickListener(this);
	    Button extra=(Button)findViewById(R.id.extra);
	    extra.setOnClickListener(this);
	    Button share=(Button)findViewById(R.id.share);
	    share.setOnClickListener(this);
	    
	    

		 ImageView myAnimation = (ImageView)findViewById(R.id.img1);
		    final AnimationDrawable myAnimationDrawable
		    = (AnimationDrawable)myAnimation.getDrawable();
		    
		    
		    myAnimation.post(
		    		new Runnable(){

		    		  @Override
		    		  public void run() {
		    		   myAnimationDrawable.start();
		     		  }
		    		});
	}

	@Override
	public void onClick(View v) {
		if(v.getId()==R.id.strt){
			Intent it= new Intent(main.this,MainActivity.class);
			startActivity(it);
		}
		if(v.getId()==R.id.extra){
			 setContentView(R.layout.more);
            
		}
		if(v.getId()==R.id.share){
			 Intent sharingIntent = new Intent(Intent.ACTION_SEND);
			    sharingIntent.setType("text/plain");
			    sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, "https://play.google.com/store/apps/details?id="+ getPackageName());
			    sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "App by Kosamia Ronak");
			    startActivity(Intent.createChooser(sharingIntent, "share using"));

		}
	}
	
	
}
