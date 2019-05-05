// Install the Java helper library from twilio.com/docs/libraries/java
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class SMSSender {
    // Find your Account Sid and Auth Token at twilio.com/console
    public static final String ACCOUNT_SID =
            "ACe6f87eaec12a953f7c77c30f611b1286";
    public static final String AUTH_TOKEN =
            "9b631f3b70e1a417c567807859425b90";

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message
                .creator(new PhoneNumber("+919711435139"), // to
                        new PhoneNumber("+12029198557"), // from
                        "Heed: Your appointment has been confirmed!")
                .create();

        System.out.println(message.getSid());
    }
}
