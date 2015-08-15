package appbyRk;

import com.example.chng.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class third extends Activity {
	
	TextView asd3;
	Button more;
	int a;
	
	@Override
	  public void onCreate(Bundle savedInstanceState) {
		    super.onCreate(savedInstanceState);
		    setContentView(R.layout.third);
		    asd3=(TextView)findViewById(R.id.textView3);
		    Intent it1 = getIntent();
	        int a= it1.getIntExtra("more",0);
	    	
	
	  }

}
 