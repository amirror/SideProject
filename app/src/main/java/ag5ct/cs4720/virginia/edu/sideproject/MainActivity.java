package ag5ct.cs4720.virginia.edu.sideproject;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] foods = {"One", "Two", "Three"};
        /* Trouble taking strings into items. An Adapter will convert java to list items*/

        ListAdapter myAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, foods); //Convert an array
        //Simple list item- basic list item

        ListView myList = (ListView) findViewById(R.id.myList);
        myList.setAdapter(myAdapter); //Convert the string to list items

        myList.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String food = String.valueOf(parent.getItemAtPosition(position));
                        Toast.makeText(MainActivity.this, food, Toast.LENGTH_SHORT).show();
                    }
                }
        );

    }

}
