import java.util.Date;

public class PracticeSession {
    private Date date;
    private String topic;
    private int numberOfStudents;

    public PracticeSession(Date date, String topic, int numberOfStudents) {
        this.date = date;
        this.topic = topic;
        this.numberOfStudents = numberOfStudents;
    }

    public Date getDate() {
        return this.date;
    }

    public String getTopic() {
        return this.topic;
    }

    public int getNumberOfStudents() {
        return this.numberOfStudents;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }
}
