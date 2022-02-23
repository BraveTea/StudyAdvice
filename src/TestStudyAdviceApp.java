import java.util.Random;

public class TestStudyAdviceApp {

    public static void main(String[] args){
        System.out.println("config");

        Random random = new Random();

        Student s1 = new Student("Sander");
        for (int i = 0; i < 8; i++){
            s1.setMark(i, random.nextInt(1, 11));
        }

        System.out.println(s1);

        System.out.println(StudyAdvisor.receivesPositiveStudyAdvice(s1));
        System.out.println("------------------");
    }
}


/*
Exercise A: For implemented code see src/StudyAdvisor.java

Exercise B: Because it has nothing to do with a specific StudyAdvisor, so
it doesn't need an instance of that class. Especially because it is just
an algorithm and not something the real study advisor decides.

Exercise C: When we want to keep track of what study advices specific Study Advisors gives

 */