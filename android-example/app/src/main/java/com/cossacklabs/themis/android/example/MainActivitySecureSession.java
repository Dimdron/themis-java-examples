package com.cossacklabs.themis.android.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.cossacklabs.themis.NullArgumentException;
import com.cossacklabs.themis.SecureMessageWrapException;
import com.cossacklabs.themis.SecureSessionException;

import java.io.IOException;


public class MainActivitySecureSession extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Check secure session
        try {
            // tests with Themis Interactive simulator
            // setup Themis IS first:
            // https://themis.cossacklabs.com/interactive-simulator/setup/
            SecSessionExampleClient.SSessionCIClientTest();
        } catch (NullArgumentException e) {
            e.printStackTrace();
        } catch (SecureMessageWrapException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SecureSessionException e) {
            e.printStackTrace();
        }
    }
}