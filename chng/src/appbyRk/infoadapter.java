package appbyRk;

import java.io.InputStream;

import android.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class infoadapter extends BaseAdapter{
	  private final Context context;
	    private final String[] Ids;
	
	
	 public infoadapter(Context c,String[] id){
	    	context=c; 
	    	Ids=id;
	    }

	    

		public void getView1(int position, View convertView, ViewGroup parent) {

	        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	        	convertView=inflater.inflate(R.layout.second, null);
	            TextView textView = (TextView) convertView.findViewById(R.id.textView2);

	     
	        textView.setText("");
	        // get input stream
	        InputStream ims = null;
		}  
	@Override
	public int getCount() {
	
		return 0;
	}

	@Override
	public Object getItem(int arg0) {
		
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		
		return 0;
	}

	@Override
	public View getView(int arg0, View arg1, ViewGroup arg2) {
		
		return null;
	}

}
