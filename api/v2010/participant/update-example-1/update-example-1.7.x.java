// Install the Java helper library from twilio.com/docs/java/install

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.conference.Participant;

public class Example {
    // Find your Account Sid and Token at twilio.com/console
    // DANGER! This is insecure. See http://twil.io/secure
    public static final String ACCOUNT_SID = "ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
    public static final String AUTH_TOKEN = "your_auth_token";

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Participant participant = Participant.updater(
                "CFbbe4632a3c49700934481addd5ce1659",
                "CA386025c9bf5d6052a1d1ea42b4d16662")
            .setMuted(true).update();

        System.out.println(participant.getCallSid());
    }
}