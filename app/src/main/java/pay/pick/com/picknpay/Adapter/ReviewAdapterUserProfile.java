package pay.pick.com.picknpay.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import pay.pick.com.picknpay.R;


/**
 * Created by lenovo on 7/15/2017.
 */

public class ReviewAdapterUserProfile extends BaseAdapter {
    LayoutInflater inflater;
    Context context;
public ReviewAdapterUserProfile(Context c)
    {
        inflater = LayoutInflater.from(c);
        this.context = c;


    }
    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public Object getItem(int position) {
        return 0;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null)
        {


            convertView  = inflater.inflate(R.layout.review_item_user_profile,null,false);


        }

        return convertView;
    }
}
