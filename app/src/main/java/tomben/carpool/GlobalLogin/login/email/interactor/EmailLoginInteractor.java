package tomben.carpool.GlobalLogin.login.email.interactor;


import com.example.benjaminlize.loginapp.GlobalLogin.login.email.presenter.OnEmailLoginFinishedListener;

/**
 * Created by Vinay Nikhil Pabba on 21-01-2016.
 */
public interface EmailLoginInteractor {

    void authenticateWithEmail(String email, String password, OnEmailLoginFinishedListener listener);

}
