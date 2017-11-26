package projecttriforce.taskedittest02;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by takan on 2017/11/26.
 */

public class MainFragment extends Fragment {
    public MainFragment() {
    }
    private static final String TAG  = "MainFragment";

    @Override
    public void onAttach(Activity activity){
        Log.d(TAG, "call onAttach().");
        super.onAttach(activity);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        return view;
    }
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        // ListViewに表示するデータ
        final ArrayList<String> items = new ArrayList<>();
        items.add("データ1");
        items.add("データ2");
        items.add("データ3");

        // ListViewをセット
        final ArrayAdapter adapter = new ArrayAdapter(this.getContext(), android.R.layout.simple_list_item_1, items);
        ListView listView = (ListView) view.findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        // セルを選択されたら詳細画面フラグメント呼び出す
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                // 詳細画面へ値を渡す
                DetailFragment detailFragment = new DetailFragment();
                Bundle bundle = new Bundle();
                bundle.putInt("selected",position);
                detailFragment.setArguments(bundle);
                // 詳細画面を呼び出す
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.main_fragment, detailFragment);
                // 戻るボタンで戻ってこれるように
                transaction.addToBackStack(null);
                transaction.commit();

            }
        });
    }
}