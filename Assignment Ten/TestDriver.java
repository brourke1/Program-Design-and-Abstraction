public class TestDriver{
    public static void main(String[] args){
        /*
        MultipleChoiceQuestion q1 = new MultipleChoiceQuestion();
        q1.setPossibleAnswers(new String[]{"Washington", "Lincoln", "Adams"});
        q1.setCorrectAnswer("Lincoln");
        System.out.println(q1.getAnswerKey());
        System.out.println(q1);
        */

        Test t = new Test();
        System.out.println(t.getTest());
        System.out.println(t.getAnswerKey());
        
    }
}