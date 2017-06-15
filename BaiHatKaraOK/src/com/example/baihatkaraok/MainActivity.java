package com.example.baihatkaraok;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
		 super.onCreate(savedInstanceState);
		 setContentView(R.layout.activity_main);
		 //dữ liệu cho mảng arr
		 final String arr[]=getResources().getStringArray(R.array.myarray);
		 //Lấy đối tượng Listview dựa vào id
		 ListView lv=(ListView) findViewById(R.id.list);
		 // Gán Data source vào ArrayAdapter
		 ArrayAdapter<String>adapter=new ArrayAdapter<String>
		 (this, android.R.layout.simple_list_item_1, arr);
		 // Đưa Data source vào ListView
		 lv.setAdapter(adapter);
		final TextView txt=(TextView) findViewById(R.id.textView1);
		 // Thiết lập sự kiện cho Listview, khi chọn phần tử nào thì hiển thị lên TextView
		 lv.setOnItemClickListener(
		 new AdapterView.OnItemClickListener() {
		 public void onItemClick(AdapterView<?> arg0,View arg1,int arg2,long arg3) {
		 //đối số arg2 là vị trí phần tử trong Data Source (arr)
		 txt.setText("position :"+arg2+" ; value ="+arr[arg2]);
		 }
		 });

		 }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
