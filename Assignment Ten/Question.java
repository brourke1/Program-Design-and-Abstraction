
public class Question{

    final private int MAX_DIFFICULTY;
    final private int MIN_DIFFICULTY;
    private int answerSpace;    //number of lines on paper
    private int points;
    private int difficulty;
    private String questionText;
    private String correctAnswer;
    private String[] possibleAnswers;

    public Question(){
        MAX_DIFFICULTY = 10;
        MIN_DIFFICULTY = 1;
        answerSpace = 5;
        points = 15;
        difficulty = MAX_DIFFICULTY - MIN_DIFFICULTY;
        questionText = "Who was the 16th US President";
    }

    public void setQuestion(String question){
        questionText = question;
    }

    public void setPoints(int points){
        this.points = points;
    }
    
    public void setCorrectAnswer(String ca){
        correctAnswer = ca;
    }

    public void setPossibleAnswers(String[] s){
        possibleAnswers = s;
    }

    public String[] getPossibleAnswers(){
        return possibleAnswers;
    }

    public String getCorrectAnswer(){
        return this.correctAnswer;
    }

    public int getSpace(){
        return answerSpace;
    }

    public int getPoints(){
        return this.points;
    }

    public String getQuestion(){

        return this.questionText;
    }


}