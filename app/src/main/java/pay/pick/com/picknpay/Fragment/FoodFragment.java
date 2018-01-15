package pay.pick.com.picknpay.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import pay.pick.com.picknpay.Adapter.RestaurantGridAdapter;
import pay.pick.com.picknpay.R;

/**
 * Created by lenovo on 12/31/2017.
 */

public class FoodFragment extends Fragment {
    View rootView;
    GridView gridView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_restaurant_list, container, false);
        initialize();
        setUpComponent();
        return rootView;
    }

    private void setUpComponent() {

        gridView.setAdapter(new RestaurantGridAdapter(getActivity()));
    }

    private void initialize() {

        gridView = (GridView)rootView.findViewById(R.id.gridView);
    }

}
