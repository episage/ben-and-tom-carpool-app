package tomben.carpool;

import android.location.Location;

import com.google.android.gms.location.LocationListener;
import com.mapbox.mapboxsdk.annotations.Marker;
import com.mapbox.mapboxsdk.annotations.MarkerOptions;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.views.MapView;

/**
 * Created by epi on 04/02/2016.
 */
public class MapMarker implements LocationListener {

    private MapView mapView;
    private Marker marker;

    public String Title;

    public MapMarker(MapView mapView)
    {
        if(mapView == null)
        {
            throw new IllegalArgumentException("mapView cannot be null");
        }

        this.mapView = mapView;
    }

    @Override
    public void onLocationChanged(Location location) {
        if(this.marker!=null)
        {
            this.mapView.removeMarker(this.marker);
        }
        this.marker = null;

        LatLng ll = new LatLng(location.getLatitude(), location.getLongitude());
        this.marker = mapView.addMarker(
                new MarkerOptions()
                .position(ll)
                .title(this.Title)
        );
    }
}
