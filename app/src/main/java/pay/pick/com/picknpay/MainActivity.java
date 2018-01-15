package pay.pick.com.picknpay;

import android.content.Context;
import com.transitionseverywhere.TransitionManager;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    Context c;
    EditText email ;
    LinearLayout layout_name, layout_phone,btn_signin, btn_signup,t_container;
    View signin_view, signup_view;
    Animation slide_in_from_left, slide_out_from_right, fide_in, fade_out;
    TextView forget,guest;
    FloatingActionButton next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_reg);
        initialize();
        setUpComponents();





    }

    private void setUpComponents() {


        btn_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransitionManager.beginDelayedTransition(t_container);
                layout_name.setVisibility(View.VISIBLE);
                layout_phone.setVisibility(View.VISIBLE);

                signup_view.setVisibility(View.VISIBLE);
                signin_view.setVisibility(View.GONE);

                guest.setVisibility(View.VISIBLE);
                forget.setVisibility(View.GONE);

            }
        });
        btn_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransitionManager.beginDelayedTransition(t_container);
                layout_name.setVisibility(View.GONE);
                layout_phone.setVisibility(View.GONE);

                signup_view.setVisibility(View.GONE);
                signin_view.setVisibility(View.VISIBLE);

                guest.setVisibility(View.GONE);
                forget.setVisibility(View.VISIBLE);
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(c,HomeActivity.class));
            }
        });
    }

    private void initialize() {
        c = MainActivity.this;
        email = (EditText)this.findViewById(R.id.email);
        layout_name = (LinearLayout)this.findViewById(R.id.name_layout);
        layout_phone = (LinearLayout)this.findViewById(R.id.phone_layout);

        signin_view = (View)this.findViewById(R.id.signin_view);
        signup_view = (View)this.findViewById(R.id.signup_view);

        btn_signin = (LinearLayout)this.findViewById(R.id.btn_signin);
        btn_signup = (LinearLayout)this.findViewById(R.id.btn_signup);

        slide_in_from_left =  AnimationUtils.loadAnimation(
                c, R.anim.enter_from_left);
        slide_out_from_right =  AnimationUtils.loadAnimation(
                c, R.anim.xslide_out_to_right);
        fide_in =  AnimationUtils.loadAnimation(
                c, R.anim.fade_in);
        fade_out =  AnimationUtils.loadAnimation(
                c, R.anim.fade_out);

        t_container = (LinearLayout)this.findViewById(R.id.t_container);

        forget = (TextView)this.findViewById(R.id.forget);
        guest = (TextView)this.findViewById(R.id.guest);

        next = (FloatingActionButton)this.findViewById(R.id.next);
    }
}
