public class HoneyDoListTest{
    public static void main(String[] args){
        HoneyDoList hdl = new HoneyDoList();
        System.out.println(hdl);

        hdl.addTask(new Task("Laundry", 1, 20));
        hdl.addTask(new Task("Homework", 2, 120));
        hdl.addTask(new Task("Dinner", 3, 30));
        hdl.addTask(new Task("Clean Kitchen", 4, 10));
        //System.out.println(hdl);
        System.out.println(hdl.shortestTime());
        
        //hdl.getTask(0).decreasePriority(1);
        //System.out.println(hdl);

    }
}