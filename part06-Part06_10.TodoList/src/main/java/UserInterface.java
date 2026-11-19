import java.util.Scanner;

public class UserInterface{
    private Scanner scanner;
    private TodoList todolist;

    public UserInterface(TodoList todolist, Scanner scanner){
        this.todolist = todolist;
        this.scanner = scanner;
    }

    public void start(){
        while(true){
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if(command.equals("stop")){
                return;
            }else if(command.equals("add")){
                addCommand();
            }else if(command.equals("list")){
                todolist.print();
            }else if(command.equals("remove")){
                removeCommand();
            }
        }
    }

    public void addCommand(){
        System.out.print("To add: ");
        String newTask = scanner.nextLine();
        todolist.add(newTask);
    }

    public void removeCommand(){
        System.out.print("Which one is removed? ");
        int number = scanner.nextInt();
        todolist.remove(number);
    }
}
