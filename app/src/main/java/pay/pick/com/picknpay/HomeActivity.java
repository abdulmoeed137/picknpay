package pay.pick.com.picknpay;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import pay.pick.com.picknpay.Adapter.HomePagerAdapter;

/**
 * Created by lenovo on 12/30/2017.
 */

public class HomeActivity extends FragmentActivity {
    DrawerLayout mDrawerLayout;
    Toolbar toolbar;
    private ViewPager homePager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        initialize();
        setUpComponent();
    }

    private void setUpComponent() {

        homePager.setAdapter(new HomePagerAdapter(getSupportFragmentManager()));
        tabLayout.setupWithViewPager(homePager);
        LayoutInflater inflater = LayoutInflater.from(this);

        View view1 = inflater.inflate(R.layout.tab_text_layout, null);
        TextView text = (TextView) view1.findViewById(R.id.tab_text);
        ImageView imageView = (ImageView) view1.findViewById(R.id.tab_img);
        text.setText("Merchants");
        imageView.setImageDrawable(getResources().getDrawable(R.drawable.fixshix));
        tabLayout.getTabAt(0).setCustomView(view1);


        View view2 = inflater.inflate(R.layout.tab_text_layout, null);
        TextView text2 = (TextView) view2.findViewById(R.id.tab_text);
        ImageView imageView2 = (ImageView) view2.findViewById(R.id.tab_img);
        text2.setText("Fixwallet");
        imageView2.setImageDrawable(getResources().getDrawable(R.drawable.fixwallet));
        tabLayout.getTabAt(1).setCustomView(view2);


        View view3 = inflater.inflate(R.layout.tab_text_layout, null);
        TextView text3 = (TextView) view3.findViewById(R.id.tab_text);
        ImageView imageView3 = (ImageView) view3.findViewById(R.id.tab_img);
        text3.setText("Notifications");
        imageView3.setImageDrawable(getResources().getDrawable(R.drawable.notification));

        tabLayout.getTabAt(2).setCustomView(view3);


        View view4 = inflater.inflate(R.layout.tab_text_layout, null);
        TextView text4 = (TextView) view4.findViewById(R.id.tab_text);
        ImageView imageView4 = (ImageView) view4.findViewById(R.id.tab_img);
        text4.setText("Settings");
        imageView4.setImageDrawable(getResources().getDrawable(R.drawable.setting));


        tabLayout.getTabAt(3).setCustomView(view4);


        toolbar.findViewById(R.id.drawerIcon).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mDrawerLayout.isDrawerOpen(GravityCompat.START))
                    mDrawerLayout.closeDrawer(Gravity.LEFT);
                else
                    mDrawerLayout.openDrawer(Gravity.LEFT);
            }
        });
    }

    private void initialize() {
        mDrawerLayout = (DrawerLayout) findViewById(R.id.homeDrawer);
        toolbar = (Toolbar) findViewById(R.id.toolbar);

        homePager = (ViewPager) findViewById(R.id.container);
        tabLayout = (TabLayout) findViewById(R.id.footer);
    }

}
