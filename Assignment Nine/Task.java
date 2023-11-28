public class Task{
    private String name;
    private int priority;
    private int estMinsToComplete;

    public Task(){
        name = "";
        priority = 0;
        estMinsToComplete = 0;
    }
    public Task(String name, int priority, int estimatedMins){
        this.name = name;
        this.priority = priority;
        this.estMinsToComplete = estimatedMins;
    }

    public String getName(){
        return name;
    }

    public int getPriority(){
        return priority;
    }

    public int getEstMinsToComplete(){
        return estMinsToComplete;
    }

    public void setName(String nameInput){
        name = nameInput;
    }

    public void setEstMinsToComplete(int mins){
        estMinsToComplete = mins;
    }

    public void increasePriority(int amount){
        if(amount > 0){
            priority += amount;
        }
    }

    public void decreasePriority(int amount){
        if(amount > priority){
            priority = 0;
        }
        else{
            priority -= amount;
        }
    }

    public String toString(){
        return "Name: " + name + "\nPriority: " + Integer.toString(priority) + "\nEstimated minutes to completion: " + Integer.toString(estMinsToComplete);
    }
}