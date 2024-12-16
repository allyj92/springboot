package poly.send;

public class SendMain {

    public static void main(String[] args) {
        Send[] senders = {new EmailSender(), new SmsSender(), new FaceBookSender()};
        for (Send sender : senders){
            sender.sendMessage("환영합니다!");
        }

    }
}
