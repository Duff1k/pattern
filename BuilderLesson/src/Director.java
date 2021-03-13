public class Director {
    TutorBuilder builder;

     public void setBuilder(TutorBuilder builder){
         this.builder = builder;
     }

     Tutor buildTutor(){
         builder.createTutor();
         builder.buildName();
         builder.buildPrice();
         builder.buildLesson();

         Tutor tutor = builder.getTutor();

         return tutor;
     }
}
