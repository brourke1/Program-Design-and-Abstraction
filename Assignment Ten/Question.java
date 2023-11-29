
public class Question{

    final private int MAX_DIFFICULTY;
    final private int MIN_DIFFICULTY;
    private int answerSpace;    //number of lines on paper
    private int points;
    private int difficulty;
    private String questionText;

    public Question(){
        MAX_DIFFICULTY = 10;
        MIN_DIFFICULTY = 1;
        answerSpace = 5;
        points = 15;
        difficulty = MAX_DIFFICULTY - MIN_DIFFICULTY;
        questionText = "How many?";
    }

    public String toString(){
        String space = "";
        for(int i = 0; i < answerSpace; i++){
            space += "\n";
        }
        return questionText + " " + Integer.toString(points)
        + "pts " + space;
    }
}