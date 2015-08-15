package appbyRk;

import com.example.chng.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class more extends Activity {

	TextView tw;
	ImageButton ib;
	Button bt;
	protected void onCreate(Bundle savedInstanceState)
	{
		
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.more);
	    tw=(TextView)findViewById(R.id.textView1);
	    bt= (Button)findViewById(R.id.btn);
	    
	     
		bt.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent appIntent = new Intent(Intent.ACTION_SEND);
				appIntent.setType("text/plain");
				appIntent.putExtra(android.content.Intent.EXTRA_TEXT, "https://play.google.com/store/apps/details?id=whistle.receiver");
			    
				 
				finish();
				}
			
			
		});
		
	}
}