package projecttriforce.taskedittest02;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.ListFragment;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;

public class MyListFragment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);

        // リストフラグメントの作成
        String[] strColors = {"red", "blue", "green", "yellow", "orange"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, strColors);
        ListFragment colorFragment = new ListFragment();
        colorFragment.setListAdapter(adapter);

        // フラグメントの動的な追加
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction tx = manager.beginTransaction();
        tx.add(R.id.fragment_color, colorFragment, "fragment_color");
        tx.commit();
    }
}