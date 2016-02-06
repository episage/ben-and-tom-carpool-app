package tomben.carpool.GlobalLogin.login.facebook.interactor;

import com.example.benjaminlize.loginapp.GlobalLogin.login.facebook.presenter.OnFacebookLoginFinishedListener;

/**
 * Created by Vinay Nikhil Pabba on 27-01-2016.
 */
public interface FacebookLoginInteractor {

    void requestData(OnFacebookLoginFinishedListener listener);

}
