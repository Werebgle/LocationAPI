package locationapi.androidhive.info.locationapi;

/**
 * Created by John on 10/24/2015.
 */
public class SunriseSunset {
    private String mSunrise;
    private String mSunset;
    private String mDayLength;

    public String getSunrise() {
        return mSunrise;
    }

    public void setSunrise(String sunrise) {
        mSunrise = sunrise;
    }

    public String getSunset() {
        return mSunset;
    }

    public void setSunset(String sunset) {
        mSunset = sunset;
    }

    public String getDayLength() {
        return mDayLength;
    }

    public void setDayLength(String dayLength) {
        mDayLength = dayLength;
    }

}
