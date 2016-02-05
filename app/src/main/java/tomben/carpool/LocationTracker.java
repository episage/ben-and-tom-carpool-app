package tomben.carpool;

import android.location.Location;

import com.firebase.client.Firebase;
import com.google.android.gms.location.LocationListener;

import tomben.carpool.models.UserLocation;

/**
 * Created by epi on 04/02/2016.
 */
public class LocationTracker implements LocationListener {

    Firebase myFirebaseRef;
    private Integer userId;


    public LocationTracker(Integer userId)
    {
        this.userId = userId;


    }

    @Override
    public void onLocationChanged(Location location) {
        UserLocation ul = new UserLocation();
        ul.UserId=this.userId;
        ul.Lat = location.getLatitude();
        ul.Lon = location.getLongitude();

        myFirebaseRef.child("user-location").child(userId.toString()).setValue(ul);
    }
}
