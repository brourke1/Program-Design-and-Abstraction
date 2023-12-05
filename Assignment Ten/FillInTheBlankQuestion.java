public class FillInTheBlankQuestion extends Question{

    public String answerKey(){
        return "__" + this.getCorrectAnswer() + "__ " + this.getQuestion() + " (" + this.getPoints() + " pts)" + "\n".repeat(this.getSpace());
    }

    public String toString(){

        return "_________" + this.getQuestion() + " (" + this.getPoints() + " pts) " + "\n".repeat(this.getSpace());
    }
}