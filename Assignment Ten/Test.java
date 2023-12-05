public class Test{
    private Question[] questions = new Question[3];
    private int totalPoints;

    public Test(){

        questions[0] = new ObjectiveQuestion();
        questions[0].setQuestion("Who was the first president of the US?");
        questions[0].setPoints(5);
        questions[0].setCorrectAnswer("George Washington");

        questions[1] = new FillInTheBlankQuestion();
        questions[1].setQuestion(" was the sixteenth president of the US?");
        questions[1].setPoints(5);
        questions[1].setCorrectAnswer("Lincoln");

        questions[2] = new MultipleChoiceQuestion();
        questions[2].setQuestion("Which President wrote the Declaration of Independence?");
        questions[2].setPoints(5);
        questions[2].setCorrectAnswer("Thomas Jefferson");
        questions[2].setPossibleAnswers(new String[]{"Thomas Jefferson", "George Washington"});


    }


    public String getTest(){
        String output = "";
        for(int i = 0; i < questions.length; i++){
            output += questions[i].toString() + "\n";
        }

        return output;
    }
    public String getAnswerKey(){
        String output = "";
        for(int i = 0; i < questions.length; i++){
            output += questions[i].toString() + questions[i].getCorrectAnswer() + "\n\n";
        }
        return output;
    }


    
}