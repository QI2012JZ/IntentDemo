package cn.itcast_firstactivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	private Button bt1;
	private Button bt2;
	private Context mContext;
	private TextView tv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		bt1 = (Button) findViewById(R.id.btn1_first);
		bt2 = (Button) findViewById(R.id.btn2_second);
		tv = (TextView) findViewById(R.id.textView_2);

		mContext = this;

		// 通过第一种方式
		bt1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(mContext, SecondActivity.class);

				startActivity(intent);
			}
		});

		// 通过第二种方式
		bt2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this,
						ThirdActivity.class);
				startActivityForResult(intent, 1);

			}
		});
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);

		if (requestCode == 1 && resultCode == 3) {
			String content = data.getStringExtra("data");
			tv.setText(content);

		}
	}

}
