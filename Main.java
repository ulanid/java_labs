import java.util.Date;
import java.util.List;

class Main {
    public static void main(String[] args) {

        PracticeSession session1 = new PracticeSession(new Date(), "Java Basics", 8);
        PracticeSession session2 = new PracticeSession(new Date(), "Advanced Java Concepts", 10);
        PracticeSession session3 = new PracticeSession(new Date(), "Java Multithreading", 12);

        List<PracticeSession> practiceSessions = List.of(session1, session2, session3);

        EducationalCourse educationalCourse = new EducationalCourse("Java", "Available", practiceSessions);

        educationalCourse.getAverageAmountOfStudents();
        educationalCourse.printSessionWithMaxAmountOfStudents();

        String searchWord = "Java";
        System.out.println("List of topics containing the word '" + searchWord + "':");
        for (PracticeSession session : practiceSessions) {
            if (session.getTopic().toLowerCase().contains(searchWord.toLowerCase())) {
                System.out.println("- Topic: " + session.getTopic());
            }
        }
    }
}
