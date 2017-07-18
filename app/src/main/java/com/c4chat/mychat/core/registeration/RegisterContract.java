package com.c4chat.mychat.core.registeration;

/**
 * Created by hendalzahrani on 7/18/17.
 */
import android.app.Activity;

import com.google.firebase.auth.FirebaseUser;


public interface RegisterContract {
    interface View {
        void onRegistrationSuccess(FirebaseUser firebaseUser);

        void onRegistrationFailure(String message);
    }

    interface Presenter {
        void register(Activity activity, String email, String password);
    }

    interface Interactor {
        void performFirebaseRegistration(Activity activity, String email, String password);
    }

    interface OnRegistrationListener {
        void onSuccess(FirebaseUser firebaseUser);

        void onFailure(String message);
    }
}