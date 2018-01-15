package pay.pick.com.picknpay.Adapter;


;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.Log;

import pay.pick.com.picknpay.Fragment.AreaAndRestaurantFragment;
import pay.pick.com.picknpay.Fragment.FoodFragment;


/**
 * Created by lenovo on 7/5/2017.
 */

public class HomePagerAdapter extends FragmentStatePagerAdapter {

    public HomePagerAdapter(FragmentManager fm) {

        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Log.d("yoyoyoyo",position+"");
        if(position ==0)
        {

            return new AreaAndRestaurantFragment();
        }
        if(position ==1)
        {
            return new FoodFragment();
        }
        if(position ==2)
        {
            return new FoodFragment();
        }
        else if (position == 3){
            return new FoodFragment();}
        else
            return null;
    }

    @Override
    public int getCount() {
        return 4;
    }
}
