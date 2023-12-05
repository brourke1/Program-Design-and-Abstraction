public class MultipleChoiceQuestion extends Question{

    public String getAnswerKey(){
        int correctAnswer = Integer.parseInt(this.getCorrectAnswer());
        String answers = "";
        int unicode = 97;
        for(int i = 0; i < this.getPossibleAnswers().length; i++){
            if(i == correctAnswer){
                answers += "**";
                answers += new String(Character.toChars(unicode)) + ") " + this.getPossibleAnswers()[i];
                answers += "**\n";
            }
            answers += new String(Character.toChars(unicode)) + ") " + this.getPossibleAnswers()[i] + "\n";
            unicode++;
        }
        return this.getQuestion() +" (" + this.getPoints() + " pts):" + "\n" +  answers + "\n".repeat(this.getSpace());
    }

    public String toString(){
        String answers = "";
        int unicode = 97;
        for(int i = 0; i < this.getPossibleAnswers().length; i++){
            answers += new String(Character.toChars(unicode)) + ") " + this.getPossibleAnswers()[i] + "\n";
            unicode++;
        }
        return this.getQuestion() +" (" + this.getPoints() + " pts):" + "\n" +  answers + "\n".repeat(this.getSpace());
    }
}