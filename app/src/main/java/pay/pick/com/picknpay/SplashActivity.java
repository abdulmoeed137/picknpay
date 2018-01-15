package pay.pick.com.picknpay;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by lenovo on 12/29/2017.
 */

public class SplashActivity extends AppCompatActivity {

    FloatingActionButton next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        initialize();
        setUpComponents();

    }

    private void setUpComponents() {


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SplashActivity.this,MainActivity.class));
            }
        });

    }

    private void initialize() {

        next = (FloatingActionButton)this.findViewById(R.id.next);
    }
}
