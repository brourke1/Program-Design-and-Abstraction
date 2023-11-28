public class HoneyDoList{
    private Task[] tasks;
    private int numTasks;
    private int INITIAL_CAPACITY = 3;

    public HoneyDoList(){
        tasks = new Task[INITIAL_CAPACITY];
        numTasks = 0;
    }

    public int find(String name){
        String currName;
        for(int i = 0; i < numTasks; i++){
            currName = tasks[i].getName();
            if(currName.equalsIgnoreCase(name)){
                return i;
            }
        }

        return -1;
    }

    public void addTask(Task t){
        if(numTasks >= INITIAL_CAPACITY){
            Task[] biggerArray = new Task[numTasks *2];

            for(int i = 0; i < numTasks; i++){
                biggerArray[i] = tasks[i];
            }
            tasks = biggerArray;
        }

        tasks[numTasks] = t;
        numTasks++;
    }

    public Task getTask(int index){
        return tasks[index];
    }

    public int totalTime(){
        int total = 0;
        for(int i = 0; i < numTasks; i++){
            total += tasks[i].getEstMinsToComplete();
        }
        return total;
    }
    
    public int shortestTime(){
        if(numTasks == 0){
            return -1;
        }

        if(numTasks == 1){
            return tasks[0].getEstMinsToComplete();
        }
        
        int min = 0;

        for(int i = 1; i < numTasks; i++){
            if(tasks[i].getEstMinsToComplete() < tasks[min].getEstMinsToComplete()){
                min = i;
            }
        }

        return min;
    }

    public Task completeTask(int index){
        if(index < 0 || index > numTasks){
            return null;
        }
        Task output = tasks[index];

        if(index < numTasks){
            for(int i = index; i < numTasks; i++){
                tasks[i] = tasks[i+1];
            }
        }

        else{
            tasks[index] = null;
        }
        numTasks--;
        return output;

    }

    public String toString(){
        String output = "";
        for(int i = 0; i < numTasks; i++){
            output += tasks[i].toString() + "\n";
        }
        return output;
    }
}