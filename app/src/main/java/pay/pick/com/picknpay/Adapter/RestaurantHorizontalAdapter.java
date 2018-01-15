package pay.pick.com.picknpay.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import pay.pick.com.picknpay.Holder.RestaurantHorizontalHolder;
import pay.pick.com.picknpay.R;

/**
 * Created by lenovo on 1/1/2018.
 */

public class RestaurantHorizontalAdapter extends RecyclerView.Adapter<RestaurantHorizontalHolder> {
    @Override
    public RestaurantHorizontalHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.restaurant_horizontal_item, parent, false);
        RestaurantHorizontalHolder holder = new RestaurantHorizontalHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(RestaurantHorizontalHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
