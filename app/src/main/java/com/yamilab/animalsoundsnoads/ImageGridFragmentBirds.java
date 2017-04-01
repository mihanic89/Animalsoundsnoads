package com.yamilab.animalsoundsnoads;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import static com.yamilab.animalsoundsnoads.R.id.recyclerView;

/**
 * Created by Misha on 28.03.2017.
 */
public class ImageGridFragmentBirds extends Fragment {


    private static final String TAG = "RecyclerViewFragment";
    private static final String KEY_LAYOUT_MANAGER = "layoutManager";
    private static final int SPAN_COUNT = 2;
    private static final int DATASET_COUNT = 40;

    private enum LayoutManagerType {
        GRID_LAYOUT_MANAGER,
        LINEAR_LAYOUT_MANAGER
    }
    protected LayoutManagerType mCurrentLayoutManagerType;

    protected RecyclerView mRecyclerView;
    protected CustomAdapter mAdapter;
    protected RecyclerView.LayoutManager mLayoutManager;
    protected ArrayList<Animal> mDataset;
    private StaggeredGridLayoutManager gaggeredGridLayoutManager;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Initialize dataset, this data would usually come from a local content provider or
        // remote server.
        initDataset();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        // BEGIN_INCLUDE(initializeRecyclerView)
        mRecyclerView = (RecyclerView) rootView.findViewById(recyclerView);

        // LinearLayoutManager is used here, this will layout the elements in a similar fashion
        // to the way ListView would layout elements. The RecyclerView.LayoutManager defines how
        // elements are laid out.

        gaggeredGridLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(gaggeredGridLayoutManager);


        mAdapter = new CustomAdapter(mDataset);
        // Set CustomAdapter as the adapter for RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // END_INCLUDE(initializeRecyclerView)



        return rootView;
    }


    /**
     * Generates Strings for RecyclerView's adapter. This data would usually come
     * from a local content provider or remote server.
     */
    private void initDataset() {
        mDataset = new ArrayList<>();
        Animal data = new Animal();

        mDataset.add(new Animal(getString(R.string.goose),R.mipmap.b0hd,R.raw.b0));
        mDataset.add(new Animal(getString(R.string.duck),R.mipmap.b1hd,R.raw.b1));
        mDataset.add(new Animal(getString(R.string.crow),R.mipmap.b2hd,R.raw.b2));
        mDataset.add(new Animal(getString(R.string.seagull),R.mipmap.b3hd,R.raw.b3));
        mDataset.add(new Animal(getString(R.string.dove),R.mipmap.b4hd,R.raw.b4));
        mDataset.add(new Animal(getString(R.string.nightingale),R.mipmap.b5hd,R.raw.b5));
        mDataset.add(new Animal(getString(R.string.eagle),R.mipmap.b6hd,R.raw.b6));
        mDataset.add(new Animal(getString(R.string.hawk),R.mipmap.b7hd,R.raw.b7));
        mDataset.add(new Animal(getString(R.string.woodpecker),R.mipmap.b8hd,R.raw.b8));
        mDataset.add(new Animal(getString(R.string.parrot),R.mipmap.b9hd,R.raw.b9));
        mDataset.add(new Animal(getString(R.string.owl),R.mipmap.b10hd,R.raw.b10));
        mDataset.add(new Animal(getString(R.string.cuckoo),R.mipmap.b11hd,R.raw.b11));
        mDataset.add(new Animal(getString(R.string.pelican),R.mipmap.b12hd,R.raw.b12));
        mDataset.add(new Animal(getString(R.string.ostrich),R.mipmap.b13hd,R.raw.b13));
        mDataset.add(new Animal(getString(R.string.flamingo),R.mipmap.b14hd,R.raw.b14));
        mDataset.add(new Animal(getString(R.string.peacock),R.mipmap.b15hd,R.raw.b15));

    }
}
