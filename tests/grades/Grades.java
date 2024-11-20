package grades;

public class Grades {

    public int determineLetterGrade(int points){
        if(points<0 || points>100){
            throw new IllegalArgumentException();
        }
        else if(points >= 90){
             return 'A';
        }
        else if (points < 90 && points >= 80) {
            return 'B';
        }
        else if (points < 80 && points >= 70){
            return 'C';
        }
        else if (points < 70 && points >= 60){
            return 'D';
        }
        else if (points < 60 && points >= 50){
            return 'E';
        }

        else{
            return 'F';
        }


    }


}
