package pay.pick.com.picknpay;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.transitionseverywhere.TransitionManager;

import pay.pick.com.picknpay.Adapter.ReviewAdapter;

/**
 * Created by lenovo on 1/3/2018.
 */

public class PaymentActivity extends BaseActivity {

   LinearLayout btn_show_card_details;
    LinearLayout card_details;
    LinearLayout t_container;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        initialize();
        setUpComponents();

    }

    private void setUpComponents() {
        btn_show_card_details.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TransitionManager.beginDelayedTransition(t_container);

                        if (card_details.getVisibility() == View.VISIBLE)
                        {
                            card_details.setVisibility(View.GONE);
                        }
                        else
                        {
                            card_details.setVisibility(View.VISIBLE);
                        }
                    }
                }
        );




    }

    private void initialize() {
       btn_show_card_details = (LinearLayout) this.findViewById(R.id.btn_card);
        t_container = (LinearLayout)this.findViewById(R.id.t_container);
        card_details = (LinearLayout) this.findViewById(R.id.card_details);
    }
}
