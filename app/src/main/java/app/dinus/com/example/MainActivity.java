package app.dinus.com.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import app.dinus.com.loadingdrawable.GearLoadingRenderer;
import app.dinus.com.loadingdrawable.LevelLoadingRenderer;
import app.dinus.com.loadingdrawable.LoadingDrawable;
import app.dinus.com.loadingdrawable.LoadingRenderer;
import app.dinus.com.loadingdrawable.MaterialLoadingRenderer;
import app.dinus.com.loadingdrawable.WhorlLoadingRenderer;


public class MainActivity extends AppCompatActivity {
    private LoadingDrawable mGearDrawable;
    private LoadingDrawable mWhorlDrawable;
    private LoadingDrawable mLevelDrawable;
    private LoadingDrawable mMaterialDrawable;

    private ImageView mIvGear;
    private ImageView mIvWhorl;
    private ImageView mIvLevel;
    private ImageView mIvMaterial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mIvGear = (ImageView) findViewById(R.id.gear_view);
        mIvWhorl = (ImageView) findViewById(R.id.whorl_view);
        mIvLevel = (ImageView) findViewById(R.id.level_view);
        mIvMaterial = (ImageView) findViewById(R.id.material_view);

        mGearDrawable = new LoadingDrawable(new GearLoadingRenderer(this));
        mWhorlDrawable = new LoadingDrawable(new WhorlLoadingRenderer(this));
        mLevelDrawable = new LoadingDrawable(new LevelLoadingRenderer(this));
        mMaterialDrawable = new LoadingDrawable(new MaterialLoadingRenderer(this));

        mIvGear.setImageDrawable(mGearDrawable);
        mIvWhorl.setImageDrawable(mWhorlDrawable);
        mIvLevel.setImageDrawable(mLevelDrawable);
        mIvMaterial.setImageDrawable(mMaterialDrawable);
    }

    @Override
    protected void onStart() {
        super.onStart();
        mGearDrawable.start();
        mWhorlDrawable.start();
        mLevelDrawable.start();
        mMaterialDrawable.start();
    }

    @Override
    protected void onStop() {
        mGearDrawable.stop();
        mWhorlDrawable.stop();
        mLevelDrawable.stop();
        mMaterialDrawable.stop();
        super.onStop();
    }
}
