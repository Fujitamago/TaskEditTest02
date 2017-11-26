package projecttriforce.taskedittest02;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class DetailFragment extends Fragment{
    public DetailFragment() {
    }

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

        // クリックした時の処理を書きます
        view.findViewById(R.id.GetDate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SampleDialogFragment dlgFragment = new SampleDialogFragment();
                dlgFragment.show(getActivity().getSupportFragmentManager(),"sample_dialog_fragment");
            }
        });

        // クリックした時の処理を書きます
        view.findViewById(R.id.StarDate02).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SampleDialogFragment dlgFragment = new SampleDialogFragment();
                dlgFragment.show(getActivity().getSupportFragmentManager(),"sample_dialog_fragment");
            }
        });

        // クリックした時の処理を書きます
        view.findViewById(R.id.DeadDate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SampleDialogFragment dlgFragment = new SampleDialogFragment();
                dlgFragment.show(getActivity().getSupportFragmentManager(),"sample_dialog_fragment");
            }
        });

    }
}