package pay.pick.com.picknpay.Fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;

import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.transitionseverywhere.TransitionManager;

import pay.pick.com.picknpay.Adapter.RestaurantHorizontalAdapter;
import pay.pick.com.picknpay.CustomRestaurantSearch;
import pay.pick.com.picknpay.R;

/**
 * Created by lenovo on 12/31/2017.
 */

public class AreaAndRestaurantFragment extends Fragment {
    View rootView;
    Context context;
    FloatingActionButton next;
    LinearLayout container_list, container_area,t_container,op1;
    RecyclerView restaurant_list,restaurant_list2,restaurant_list3;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_area_and_restaurant, container, false);
        initialize();
        setUpComponent();
        return rootView;
    }

    private void setUpComponent() {

        restaurant_list.setHasFixedSize(true);

        op1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(context, CustomRestaurantSearch.class));
                    }
                }
        );

        next.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TransitionManager.beginDelayedTransition(t_container);
            container_area.setVisibility(View.GONE);

            final LinearLayoutManager MyLayoutManager = new LinearLayoutManager(getActivity());
            MyLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
            final LinearLayoutManager MyLayoutManager2 = new LinearLayoutManager(getActivity());
            MyLayoutManager2.setOrientation(LinearLayoutManager.HORIZONTAL);
            final LinearLayoutManager MyLayoutManager3 = new LinearLayoutManager(getActivity());
            MyLayoutManager3.setOrientation(LinearLayoutManager.HORIZONTAL);
            TransitionManager.beginDelayedTransition(t_container);
            container_area.setVisibility(View.GONE);

            restaurant_list.setAdapter(
                    new RestaurantHorizontalAdapter()
            );
            restaurant_list2.setAdapter(
                    new RestaurantHorizontalAdapter()
            );
            restaurant_list3.setAdapter(
                    new RestaurantHorizontalAdapter()
            );
            restaurant_list.setLayoutManager(MyLayoutManager);
            restaurant_list2.setLayoutManager(MyLayoutManager2);
            restaurant_list3.setLayoutManager(MyLayoutManager3);
            container_list.setVisibility(View.VISIBLE);
        }
    });
    }

    private void initialize() {

    next = (FloatingActionButton)rootView.findViewById(R.id.next);
        container_area = (LinearLayout)rootView.findViewById(R.id.area_container);
        container_list = (LinearLayout)rootView.findViewById(R.id.restaurant_container);
        t_container = (LinearLayout)rootView.findViewById(R.id.t_container);
        restaurant_list = (RecyclerView)rootView.findViewById(R.id.recycler_view);
        restaurant_list2= (RecyclerView)rootView.findViewById(R.id.recycler_view2);
        restaurant_list3= (RecyclerView)rootView.findViewById(R.id.recycler_view3);
        op1 = (LinearLayout)rootView.findViewById(R.id.op1);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context=context;
    }
}
