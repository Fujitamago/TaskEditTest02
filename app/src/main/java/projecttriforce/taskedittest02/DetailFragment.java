package projecttriforce.taskedittest02;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class DetailFragment extends Fragment {
    public DetailFragment() {
    }

    private MainActivity parent;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_detail, container, false);
        return view;
    }

    // Viewが生成し終わった時に呼ばれるメソッド
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        // Buttonのクリックした時の処理を書きます
        view.findViewById(R.id.btnShowDialog).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                parent.move();
           }
        });
    }

    @Override
    public void onAttach(Activity activity) {
        parent = (MainActivity) activity;
        super.onAttach(activity);
    }
}