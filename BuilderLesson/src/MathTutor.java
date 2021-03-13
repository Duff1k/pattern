public class MathTutor extends TutorBuilder{
    @Override
    void buildName() {
        tutor.setName("Alex");
    }

    @Override
    void buildPrice() {
        tutor.setPrice(2000);
    }

    @Override
    void buildLesson() {
        tutor.setLesson(Lesson.MATH);
    }
}
