import java.util.ArrayList;

public class TodoList{
    private ArrayList<String> todolist;

    public TodoList(){
        todolist = new ArrayList<String>();
    }

    public void add(String task){
        todolist.add(task);
    }

    public String getTask(int index){
        return todolist.get(index);
    }

    public void print(){
        for(int i=0; i<todolist.size(); i++){
            System.out.println(i+1 + ": " + getTask(i));
        }
    }

    public void remove(int number){
        if(number >= 1 && number <= todolist.size()){
            todolist.remove(number -1);
        }
    }
}