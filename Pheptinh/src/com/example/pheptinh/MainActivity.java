package com.example.pheptinh;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
//import android.app.Activity;


public class MainActivity extends ActionBarActivity implements OnClickListener {
	
	private EditText nhapA;
    private EditText nhapB;
    private Button btKetQua;
    private Spinner spinner;
    private EditText ketQua;
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//------ findViewById dùng để gọi các id của các control bên layout
        //-------nhằm thực hiện một sự kiện hoặc một xử lý nào đó
		nhapA = (EditText) findViewById(R.id.soA);
        nhapB = (EditText) findViewById(R.id.soB);
        ketQua = (EditText) findViewById(R.id.ketQua);
        btKetQua = (Button) findViewById(R.id.button1);
        spinner = (Spinner) findViewById(R.id.spinner1);
         
        //---Bắt sự kiện khi người dùng click vào nút Kết Quả
        btKetQua.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onClick(View arg0) {
		try {
            //-----Lấy ra giá trị đang chọn của Spinner
            String spin = spinner.getSelectedItem().toString();
            //-----Chuyển kiểu chuỗi thành kiểu double để tính toán
            //-----Bởi vì EditText nhập vào giá trị kiểu chuỗi nên không thể nào tính toán được
            double double_soA = Double.parseDouble(nhapA.getText().toString());
            double double_soB = Double.parseDouble(nhapB.getText().toString());
            //------Các hàm kiểm tra
            if (spin.equals("+")) {
                double tong = double_soA + double_soB;
                ketQua.setText(String.valueOf(tong));
            } else {
                if (spin.equals("-")) {
                    double hieu = double_soA - double_soB;
                    ketQua.setText(String.valueOf(hieu));
                } else {
                    if (spin.equals("*")) {
                        double tich = double_soA * double_soB;
                        ketQua.setText(String.valueOf(tich));
 
                    } else {
                        if (spin.equals("/")) {
                            double thuong = double_soA / double_soB;
                            ketQua.setText(String.valueOf(thuong));
                        }
                    }
                }
            }
        } catch (Exception e) {
             
        }
		
	}
}
