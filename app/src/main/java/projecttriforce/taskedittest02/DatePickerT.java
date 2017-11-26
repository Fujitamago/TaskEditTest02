package projecttriforce.taskedittest02;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

public class DatePickerT extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker);

        final DatePicker datePicker = (DatePicker) findViewById(R.id.datePicker);

        datePicker.init(2015, 12, 14, new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                // 日付を選択した時に実行される
                TextView txt = (TextView) findViewById(R.id.Datetemp);
                txt.setText(year + "/" + (monthOfYear+1) + "/" + dayOfMonth);
                //Toast.makeText(view.getContext(), year + "/" + monthOfYear + "/" + dayOfMonth, Toast.LENGTH_LONG).show();
            }
        });
    }
    public void DateOK(View view){
        TextView txt = (TextView)findViewById(R.id.Datetemp);
        Intent intent = new Intent(this, projecttriforce.taskedittest02.SubActivity.class);
        String str = txt.getText().toString();
        intent.putExtra("DateOK",str);
        startActivity(intent);
    }
}
