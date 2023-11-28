public class testTask{
    public static void main(String[] args){
        Task t = new Task("Brian", 2, 3);
        System.out.println(t + "\n");

        t.setName("Nick");
        t.increasePriority(1);
        System.out.println(t + "\n");

        t.decreasePriority(2);
        System.out.println(t);
    }
}