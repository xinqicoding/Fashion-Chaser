package aws;

import android.content.Context;

import com.amazonaws.auth.CognitoCachingCredentialsProvider;


public class Kinesis_util {

    Context context = null;
    CognitoCachingCredentialsProvider credentialsProvider = null;

    public Kinesis_util(Context context) {
        this.context = context;
        Cognito_credential new_credential = new Cognito_credential(context);
        credentialsProvider = new_credential.getCognitoCredential();
    }
}
