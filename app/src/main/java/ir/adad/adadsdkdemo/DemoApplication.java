package ir.adad.adadsdkdemo;

import android.app.Application;

import ir.adad.ad.AdadAdListener;
import ir.adad.core.Adad;
import ir.adad.fullscreen.AdadFullscreenBannerAd;
import ir.adad.notification.AdadNotificationAd;
import ir.adad.video.AdadVideoAd;
import ir.adad.video.AdadVideoAdListener;

public class DemoApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Adad.initialize("YOUR_APP_TOKEN_GOES_HERE"); // It's better to initialize Adad class here

        Adad.setTestMode(true); // For testing

        // It's better to prepare video, fullscreen and notification ad in this class.

        AdadVideoAd.prepareClosableVideoAd(this, "YOUR_CLOSABLE_VIDEO_AD_CONTAINER_TOKEN_GOES_HERE", new AdadVideoAdListener() {
            @Override
            public void onVideoAdStart() {

            }

            @Override
            public void onVideoAdComplete() {

            }

            @Override
            public void onVideoAdDestroy() {

            }

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



        AdadVideoAd.prepareGeneralVideoAd(this, "YOUR_GENERAL_VIDEO_AD_CONTAINER_TOKEN_GOES_HERE", new AdadVideoAdListener() {
            @Override
            public void onVideoAdStart() {

            }

            @Override
            public void onVideoAdComplete() {

            }

            @Override
            public void onVideoAdDestroy() {

            }

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


        AdadVideoAd.prepareRewardVideoAd(this, "YOUR_REWARD_VIDEO_AD_CONTAINER_TOKEN_GOES_HERE", new AdadVideoAdListener() {
            @Override
            public void onVideoAdStart() {

            }

            @Override
            public void onVideoAdComplete() {

            }

            @Override
            public void onVideoAdDestroy() {

            }

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

        AdadFullscreenBannerAd.prepare(this, "YOUR_FULLSCREEN_AD_CONTAINER_TOKEN_GOES_HERE", new AdadAdListener() {
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

        AdadNotificationAd.prepare(this, "YOUR_NOTIFICATION_AD_CONTAINER_TOKEN_GOES_HERE");

    }
}
