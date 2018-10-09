package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.android.androidjoketeller.JokeTellerActivity;




/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment implements OnFetched{


    private Button b1;
    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View root = inflater.inflate(R.layout.fragment_main, container, false);
        b1 = (Button) root.findViewById(R.id.b1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new EndPointAsyncTask(MainActivityFragment.this).execute();
            }
        });
        return root;
    }

    @Override
    public void onJokeFetched(String joke) {
        Intent intent = new Intent(getContext() , JokeTellerActivity.class);
        intent.putExtra(JokeTellerActivity.EXTRA , joke);
        startActivity(intent);
    }
}
