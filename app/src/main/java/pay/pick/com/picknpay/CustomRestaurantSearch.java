package pay.pick.com.picknpay;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import pay.pick.com.picknpay.Adapter.RestaurantGridAdapter;

/**
 * Created by lenovo on 1/1/2018.
 */

public class CustomRestaurantSearch extends BaseActivity {
    GridView gridView;
    Context c;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_restaurant_search);

        initialize();
        setUpComponent();
    }

    private void setUpComponent() {


        gridView.setAdapter(new RestaurantGridAdapter(c));
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(new Intent(c,RestaurantDetailActivity.class));
            }
        });
    }

    private void initialize() {
        this.c = CustomRestaurantSearch
                .this;
        gridView = (GridView)findViewById(R.id.gridView);
    }
}
