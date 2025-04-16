package recap.spring_easy_exercises.exercise05;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component - poate sa lipseasca pt ca este redundanta
@Service
public class EmailServiceExample {
    private static MailSender sender;

    public EmailServiceExample(final MailSender sender) {
        this.sender = sender;
    }
}

class MailSender {

}
