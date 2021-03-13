public class PhysicsTutor extends TutorBuilder{
    @Override
    void buildName() {
        tutor.setName("Bruce");
    }

    @Override
    void buildPrice() {
        tutor.setPrice(2500);
    }

    @Override
    void buildLesson() {
        tutor.setLesson(Lesson.PHYSICS);
    }
}
