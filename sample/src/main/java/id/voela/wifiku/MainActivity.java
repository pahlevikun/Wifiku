package id.voela.wifiku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("TESTRESULT","BSSID "+WifiKu.getWifiBSSID(this));
        Log.d("TESTRESULT","SSID "+WifiKu.getWifiSSID(this));
        Log.d("TESTRESULT","RSSI PLAIN "+WifiKu.getWifiRSSIPlain(this));
        Log.d("TESTRESULT","RSSI STRENGTH "+WifiKu.getWifiRSSIStrength(this,4));
        Log.d("TESTRESULT","IPADDRESS PLAIN "+WifiKu.getWifiIPAdressPlain(this));
        Log.d("TESTRESULT","IPADDRESS FORMATTED "+WifiKu.getWifiIPAdressFormatted(this));
        Log.d("TESTRESULT","MAC ADDRESS "+WifiKu.getWifiMacAddress(this));
        Log.d("TESTRESULT","IS NETWORK CONNECTED "+WifiKu.isNetworkConnected(this));
        Log.d("TESTRESULT","IS INTERNET AVAILABLE "+WifiKu.isInternetAvailable("https://voela.id"));
        try {
            Log.d("TESTRESULT","IS PING SUCCESS "+WifiKu.isPingSuccess("https://voela.id"));
        }catch (Exception e){

        }
    }
}
