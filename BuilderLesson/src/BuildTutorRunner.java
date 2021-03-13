public class BuildTutorRunner {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new PhysicsTutor());
        Tutor tutor = director.buildTutor();

        System.out.println(tutor);
    }
}
