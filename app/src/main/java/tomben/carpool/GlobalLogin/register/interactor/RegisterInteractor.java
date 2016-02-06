package tomben.carpool.GlobalLogin.register.interactor;

import com.example.benjaminlize.loginapp.GlobalLogin.register.presenter.OnRegisterFinishedListener;

/**
 * Created by Vinay Nikhil Pabba on 27-01-2016.
 */
public interface RegisterInteractor {

    void registerUser(String email, String password, OnRegisterFinishedListener listener);

}
