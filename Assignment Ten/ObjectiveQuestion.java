public class ObjectiveQuestion extends Question{

    public String answerKey(){
        return this.getQuestion() + " (" + this.getPoints() + " pts): " + this.getCorrectAnswer() + "\n".repeat(this.getSpace());
    }

    public String toString(){

        return this.getQuestion() + " (" + this.getPoints() + " pts):" + "\n".repeat(this.getSpace());
    }
}