package projecttriforce.taskedittest02;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by takan on 2017/11/24.
 */

public class Project extends RealmObject {

    @PrimaryKey
    private String address;  // addressカラム
    private String name;  // nameカラム

    // getter setter...
    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getAddress() { return address; }

    public void setAddress(String address) { this.address = address; }

}
