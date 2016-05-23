package cn.itcast_firstactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ThirdActivity extends Activity {
	private Button bt1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.third_layout);

		bt1 = (Button) findViewById(R.id.btn1);

		bt1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent data = new Intent();
				data.putExtra("data", "我是Android工程师 ");
				setResult(3, data);

				finish();
			}
		});

	}

}
