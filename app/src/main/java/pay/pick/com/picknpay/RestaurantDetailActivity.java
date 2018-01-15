package pay.pick.com.picknpay;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import pay.pick.com.picknpay.Adapter.ReviewAdapter;

/**
 * Created by lenovo on 1/3/2018.
 */

public class RestaurantDetailActivity extends BaseActivity {

    ListView review_list;
    TextView btn_order;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_details);
        initialize();
        setUpComponents();

    }

    private void setUpComponents() {
        btn_order.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(RestaurantDetailActivity.this, MenuActivity.class));
                    }
                }
        );


        review_list.setAdapter(new ReviewAdapter(RestaurantDetailActivity.this));

    }

    private void initialize() {
        review_list = (ListView) this.findViewById(R.id.review_listt);
        btn_order = (TextView)this.findViewById(R.id.btn_order
        );
    }
}
