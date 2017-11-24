package projecttriforce.taskedittest02;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.facebook.stetho.Stetho;
import com.uphyca.stetho_realm.RealmInspectorModulesProvider;

import io.realm.Realm;
import io.realm.RealmChangeListener;
import io.realm.RealmConfiguration;

public class MainActivity extends AppCompatActivity {
    private Realm realm;
    private RealmChangeListener realmListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        Stetho.initialize(
                Stetho.newInitializerBuilder(this)
                        .enableDumpapp(Stetho.defaultDumperPluginsProvider(this))
                        .enableWebKitInspector(RealmInspectorModulesProvider.builder(this).build())
                        .build());

        Realm.init(this);
        RealmConfiguration config = new RealmConfiguration.Builder().build();
        Realm.setDefaultConfiguration(config);

        // このスレッドのためのRealmインスタンスを取得
        realm = Realm.getDefaultInstance();
        /*

        try {
            // ... Realmを使用した処理 ...
            realm.beginTransaction();
            realm.executeTransaction(new Realm.Transaction() {
                @Override
                public void execute(Realm realm) {
                    Project projects = realm.createObject(Project.class);
                    projects.setName("Fido");
                }
            });
            realm.commitTransaction();
        } finally {
            realm.close();
        }
        */
        setContentView(R.layout.activity_main);
    }
            //着手日をタップした時
    public void DateTapped(View view) {
        Intent intent = new Intent(this, projecttriforce.taskedittest02.DatePickerT.class);
        //完全修飾名でないとできないかも
        startActivity(intent);
        //アクティビティを起動
    }

    public void Get(View view){
        Intent intent = getIntent();
        String str = intent.getStringExtra("DateOK");
        TextView txt = (TextView)findViewById(R.id.StarDate02);
        TextView txt1 = (TextView)findViewById(R.id.DeadDate);
        txt.setText(str);
        txt1.setText(str);
    }
}
