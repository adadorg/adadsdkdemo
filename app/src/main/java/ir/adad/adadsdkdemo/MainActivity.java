package ir.adad.adadsdkdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import ir.adad.ad.AdadAdListener;
import ir.adad.banner.AdadBannerAd;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(RelativeLayout
                .LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);

        layoutParams.addRule(RelativeLayout.CENTER_IN_PARENT, RelativeLayout.TRUE);

        AdadBannerAd adadBannerAd = new AdadBannerAd(this, null, 0);
        adadBannerAd.setAdContainerToken("YOUR_BANNER_AD_CONTAINER_TOKEN_GOES_HERE");
        adadBannerAd.setLayoutParams(layoutParams);

        adadBannerAd.setAdListener(new AdadAdListener() {
            @Override
            public void onLoaded() {

            }

            @Override
            public void onShowed() {

            }

            @Override
            public void onActionOccurred(int i) {

            }

            @Override
            public void onError(int i, String s) {

            }

            @Override
            public void onClosed() {

            }
        });


        // The rootView
        final ViewGroup rootView = (ViewGroup) ((ViewGroup) this
                .findViewById(android.R.id.content)).getChildAt(0);


        rootView.addView(adadBannerAd);
    }
}
