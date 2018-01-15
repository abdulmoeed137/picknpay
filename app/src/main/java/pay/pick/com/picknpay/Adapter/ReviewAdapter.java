package pay.pick.com.picknpay.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import pay.pick.com.picknpay.R;
import pay.pick.com.picknpay.UserProfileActivity;


/**
 * Created by lenovo on 7/15/2017.
 */

public class ReviewAdapter extends BaseAdapter {
    LayoutInflater inflater;
    Context context;
public ReviewAdapter(Context c)
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


            convertView  = inflater.inflate(R.layout.review_item,null,false);


        }

        convertView.findViewById(
                R.id.name
        )
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        context
                                .startActivity(new Intent(context, UserProfileActivity
                                .class));
                    }
                });
        return convertView;
    }
}
