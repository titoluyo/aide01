package com.mycompany.myapp;

import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.OnClickListener;
import android.widget.*;

public class MainActivity extends Activity implements OnClickListener
{
	Button btnSend;
	EditText txtCorreo;
	TextView txtMessage;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        btnSend = (Button)findViewById(R.id.btnSend);
        btnSend.setOnClickListener(this);
        txtCorreo = (EditText)findViewById(R.id.txtCorreo);
        txtMessage = (TextView)findViewById(R.id.txtMessage);
    }

	@Override
	public void onClick(View v) {
		txtMessage.setText(txtCorreo.getText());
		
	}
}
