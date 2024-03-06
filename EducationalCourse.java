import java.util.List;

class EducationalCourse {
    private String name;
    private String availability;
    private List<PracticeSession> practiceSessions;

    public EducationalCourse(String name, String availability, List<PracticeSession> practiceSessions) {
        this.name = name;
        this.availability = availability;
        this.practiceSessions = practiceSessions;
    }

    public String getName() {
        return name;
    }

    public String getAvailability() {
        return availability;
    }

    public List<PracticeSession> getPracticeSessions() {
        return practiceSessions;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public void setPracticeSessions(List<PracticeSession> practiceSessions) {
        this.practiceSessions = practiceSessions;
    }

    public void getAverageAmountOfStudents() {
        int totalStudents = 0;
        for (PracticeSession session : practiceSessions) {
            totalStudents += session.getNumberOfStudents();
        }
        double averageStudents = (double) totalStudents / practiceSessions.size();
        System.out.println("Average number of students: " + averageStudents);
    }

    public void printSessionWithMaxAmountOfStudents() {
        int maxStudents = Integer.MIN_VALUE;
        PracticeSession maxSession = null;
        for (PracticeSession session : practiceSessions) {
            if (session.getNumberOfStudents() > maxStudents) {
                maxStudents = session.getNumberOfStudents();
                maxSession = session;
            }
        }
        if (maxSession != null) {
            System.out.println("Session with max number of students: " + maxSession.getNumberOfStudents());
        } else {
            System.out.println("No sessions found.");
        }
    }
}
