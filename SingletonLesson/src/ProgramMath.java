public class ProgramMath {
    private static ProgramMath programMath;
    private static int num = 0;

    public static synchronized ProgramMath getProgramMath(){
        if(programMath == null){
            programMath = new ProgramMath();
        }
        return programMath;
    }

    private ProgramMath(){

    }

    public void plus(int number){
        num+=number;
    }

    public void minus(int number){
        num-=number;
    }

    public void multiplication(int number){
        num*=number;
    }

    public void division(int number){
        num/=number;
    }

    public void showNum(){
        System.out.println(num);
    }



}
