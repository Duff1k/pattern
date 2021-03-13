public abstract class TutorBuilder {
    Tutor tutor;

    void createTutor(){
        tutor = new Tutor();
    }

    abstract void buildName();
    abstract void buildPrice();
    abstract void buildLesson();

    Tutor getTutor(){
        return tutor;
    }

}