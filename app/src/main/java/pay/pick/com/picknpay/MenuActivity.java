package pay.pick.com.picknpay;

import android.os.Bundle;
import android.widget.ListView;

import pay.pick.com.picknpay.Adapter.MenuAdapter;
import pay.pick.com.picknpay.Adapter.ReviewAdapter;

/**
 * Created by lenovo on 1/3/2018.
 */

public class MenuActivity extends BaseActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        initialize();
        setUpComponents();

    }

    private void setUpComponents() {



listView.setAdapter(new MenuAdapter(MenuActivity.this));

    }

    private void initialize() {
        listView = (ListView) this.findViewById(R.id.listView);

    }
}
