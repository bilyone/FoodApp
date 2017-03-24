package com.wordpress.sreeharilive.foodapp.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.wordpress.sreeharilive.foodapp.R;
import com.wordpress.sreeharilive.foodapp.util.Constants;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchMenu(View view) {
        Intent intent = new Intent(this,ItemsListActivity.class);
        switch (view.getId()){
            case R.id.vegImageView:
                intent.putExtra(Constants.CATEGORY_INTENT_KEY, Constants.VEG);
                break;
            case R.id.nonVegImageView:
                intent.putExtra(Constants.CATEGORY_INTENT_KEY,Constants.NON_VEG);
                break;
            case R.id.chineseImageView:
                intent.putExtra(Constants.CATEGORY_INTENT_KEY,Constants.CHINESE);
                break;
            case R.id.dessertsImageView:
                intent.putExtra(Constants.CATEGORY_INTENT_KEY,Constants.DESSERT);
                break;
        }
        startActivity(intent);

    }
}
