package tomben.carpool.GlobalLogin.start.interactor;

import com.example.benjaminlize.loginapp.GlobalLogin.start.presenter.OnTokenLoginFinishedListener;

/**
 * Created by Vinay Nikhil Pabba on 30-01-2016.
 */
public interface StartPageInteractor {

    void loginWithToken(String provider, String accessToken, OnTokenLoginFinishedListener listener);

}
